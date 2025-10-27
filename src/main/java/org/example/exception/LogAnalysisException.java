package org.example.exception;

public class LogAnalysisException extends Exception
{
    public LogAnalysisException(String message)
    {
        super(message);
    }

    public LogAnalysisException(String message, Throwable cause)
    {
        super(message, cause);
    }
}
