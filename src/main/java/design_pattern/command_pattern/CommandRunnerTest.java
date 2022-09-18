package design_pattern.command_pattern;

import design_pattern.command_pattern.commands.*;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommandRunnerTest extends TestCase {

    private CommandRunner commandRunner;

    public void testExecuteCommand() {

        Command command =  new Command();
        command.setType(CommandType.MINUS);
        command.setArgs(Arrays.asList(1f,2f));

        commandRunner.executeCommand(command);

        Command sumCommand =  new Command();
        sumCommand.setType(CommandType.SUM);
        sumCommand.setArgs(Arrays.asList(1f,2f));

        commandRunner.executeCommand(sumCommand);

        Command sumInvalidCommand =  new Command();
        sumInvalidCommand.setType(CommandType.SUM);
        sumInvalidCommand.setArgs(Arrays.asList(1f));

        commandRunner.executeCommand(sumInvalidCommand);

    }


    @Override
    protected void setUp()  {
        List<CommandExecuter> commands = new ArrayList<>();
        commands.add(new MinusCommandExecuter());
        commands.add(new SumCommandExecuter());
       this.commandRunner = new CommandRunner(commands);
    }
}