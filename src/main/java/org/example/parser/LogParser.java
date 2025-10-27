package org.example.parser;

import org.example.model.AbstractLogEntry;

import java.util.List;
import java.util.Optional;

public interface LogParser
{
    List<AbstractLogEntry> parse();
    boolean isValidFormat(String string);
    Optional<AbstractLogEntry> parseLogLine(String line);
}
