package design_pattern.command_pattern.commands;

public class MinusCommandExecuter extends CommandExecuter{

    @Override
    public boolean isApplicable(Command command) {
       return command.type==CommandType.MINUS;
    }

    @Override
    protected void executeCommand(Command command) {
        float minus =  (float)command.args.get(1)-(float)command.args.get(0);
        System.out.println("Minus is "+minus);
    }

    @Override
    protected boolean isValid(Command command) {
        System.out.println("Command"+command);
        return command.args!=null && command.args.size()==2;
    }
}
