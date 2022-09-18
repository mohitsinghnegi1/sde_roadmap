package design_pattern.command_pattern.commands;

import lombok.Setter;

@Setter
public abstract class CommandExecuter {
        abstract public boolean isApplicable(Command command);
        public void execute(Command command){
                if(isValid(command)){
                        this.executeCommand(command);
                }else {

                        System.out.println("Invalid Command");
                }
        }

        protected abstract void executeCommand(Command command);

        abstract protected boolean isValid(Command command);
}
