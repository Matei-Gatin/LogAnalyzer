package org.example.analyzer;

import org.example.model.AbstractLogEntry;
import org.example.model.AnalysisResult;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TotalRequestAnalyzer implements LogAnalyzer {

    @Override
    public AnalysisResult analyze(List<AbstractLogEntry> entries)
    {
        int count = entries.size();
        String summary = "Total Requests: " + count;

        Map<String, Object> totalCount = new HashMap<>(Map.of("Total", count));

        return new AnalysisResult(getAnalyzerName(), totalCount, summary);
    }

    @Override
    public String getAnalyzerName() {
        return "Total Request Analyzer";
    }
}
