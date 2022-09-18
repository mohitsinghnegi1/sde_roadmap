package design_pattern.command_pattern;

import design_pattern.command_pattern.commands.Command;
import design_pattern.command_pattern.commands.CommandExecuter;
import lombok.AllArgsConstructor;
import lombok.NonNull;

import java.util.List;

@AllArgsConstructor
public class CommandRunner {

    @NonNull
    List<CommandExecuter> commandList;

    public void executeCommand(Command inputCommand){

        commandList.forEach(command->{
            if(command.isApplicable(inputCommand)){
                command.execute(inputCommand);
            }
        });
    }
}
