package com.example.Assignment.Node.CreateCsv;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CreateCsvFile {
    public static void main(String[] args) {
        // Define the CSV file path
        String directoryPath = "C:/ProgramData/MySQL/MySQL Server 8.0/Uploads";
        // Define the CSV file name
        String fileName = "nodes.csv";

        // Define the CSV headers
        String[] headers = {
                "node_id",
                "node_name",
                "description",
                "memo",
                "node_type",
                "parent_node_group_name",
                "parent_node_group_id",
                "parent_noder"
        };

        // Define the data for each row
        String[][] data = {
                {"T300_001", "Node1", "Sample text", "Sample text", "Transponder", "Subgroup NE_1", "Sample text", "Sample text"},
                {"T300_002", "Node2", "Sample text", "Sample text", "Transponder", "Subgroup NE_1", "Sample text", "Sample text"},
                {"T300_003", "Node3", "Sample text", "Sample text", "Transponder", "Subgroup NE_1", "Sample text", "Sample text"},
                {"T300_004", "Node4", "Sample text", "Sample text", "Transponder", "Subgroup NE_1", "Sample text", "Sample text"},
                {"T300_005", "Node5", "Sample text", "Sample text", "Transponder", "Subgroup NE_1", "Sample text", "Sample text"},
                {"T300_006", "Node6", "Sample text", "Sample text", "Transponder", "Subgroup NE_2", "Sample text", "Sample text"},
                {"T300_007", "Node7", "Sample text", "Sample text", "Roadm", "Subgroup NE_2", "Sample text", "Sample text"},
                {"T300_008", "Node8", "Sample text", "Sample text", "Roadm", "Subgroup NE_2", "Sample text", "Sample text"},
                {"T300_009", "Node9", "Sample text", "Sample text", "Roadm", "Subgroup NE_2", "Sample text", "Sample text"},
                {"T300_010", "Node10", "Sample text", "Sample text", "Roadm", "Group 1", "Sample text", "Sample text"},
                {"T300_011", "Node11", "Sample text", "Sample text", "Roadm", "Group 1", "Sample text", "Sample text"},
                {"T300_012", "Node12", "Sample text", "Sample text", "Roadm", "Group 1", "Sample text", "Sample text"},
                {"T300_013", "Node13", "Sample text", "Sample text", "Roadm", "Group 1", "Sample text", "Sample text"},

                // Add more rows as needed
        };

        // Create and write to the CSV file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            // Write the headers to the CSV file
            for (int i = 0; i < headers.length; i++) {
                writer.write(headers[i]);
                if (i < headers.length - 1) {
                    writer.write(","); // Add a comma after each header except the last one
                }
            }
            writer.newLine(); // Add a new line after the headers

            // Write the data rows to the CSV file
            for (String[] row : data) {
                for (int i = 0; i < row.length; i++) {
                    writer.write(row[i]);
                    if (i < row.length - 1) {
                        writer.write(","); // Add a comma after each value except the last one
                    }
                }
                writer.newLine(); // Add a new line after each row
            }

            System.out.println(fileName + " created successfully with data.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
