package design_pattern.command_pattern.commands;

public class SumCommandExecuter extends CommandExecuter{

    @Override
    public boolean isApplicable(Command command) {
        return command.type==CommandType.SUM;
    }

    @Override
    protected void executeCommand(Command command) {
        float sum =  (float)command.args.get(0)+(float)command.args.get(1);
        System.out.println("Sum is "+sum);
    }

    @Override
    protected boolean isValid(Command command) {
        System.out.println("Command"+command);
        return command.args!=null && command.args.size()==2;
    }
}
