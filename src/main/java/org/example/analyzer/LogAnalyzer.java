package org.example.analyzer;

import org.example.model.AbstractLogEntry;
import org.example.model.AnalysisResult;

import java.util.List;

public interface LogAnalyzer {
    AnalysisResult analyze(List<AbstractLogEntry> entries);
    String getAnalyzerName();
}
