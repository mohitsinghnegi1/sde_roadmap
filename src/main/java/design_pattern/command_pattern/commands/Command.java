package design_pattern.command_pattern.commands;

import lombok.Data;

import java.util.List;

@Data
public class Command {
    List<Object> args;
    CommandType type;
}
