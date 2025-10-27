package org.example.export;

import org.example.model.AnalysisResult;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

public interface ResultExporter
{
    void export(List<AnalysisResult> results, Path outputPath) throws IOException;
}
