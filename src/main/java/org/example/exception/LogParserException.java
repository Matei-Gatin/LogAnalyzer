package org.example.exception;

public class LogParserException extends Exception
{
    public LogParserException(String message)
    {
        super(message);
    }

    public LogParserException(String message, Throwable clause)
    {
        super(message, clause);
    }
}
