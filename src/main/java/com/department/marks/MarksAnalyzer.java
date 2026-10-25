package com.department.marks;

import org.apache.commons.math3.stat.StatUtils;

public class MarksAnalyzer {

    private final double[] marks;

    public MarksAnalyzer(double[] marks) {

        if (marks == null || marks.length == 0) {
            throw new IllegalArgumentException(
                    "Marks cannot be empty or null.");
        }

        this.marks = marks.clone();

        for (double mark : this.marks) {
            if (Double.isNaN(mark)
                    || Double.isInfinite(mark)
                    || mark < 0
                    || mark > 100) {

                throw new IllegalArgumentException(
                        "Marks must be between 0 and 100.");
            }
        }
    }

    public int getStudentCount() {
        return marks.length;
    }

    public double getAverage() {
        return StatUtils.mean(marks);
    }

    public double getHighestMark() {
        return StatUtils.max(marks);
    }

    public double getPassPercentage() {

        int passCount = 0;

        for (double mark : marks) {
            if (mark >= 40) {
                passCount++;
            }
        }

        return (passCount * 100.0) / marks.length;
    }
}