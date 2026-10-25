package com.department.marks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MarksAnalyzerTest {

    @Test
    void testStudentCount() {
        MarksAnalyzer analyzer = new MarksAnalyzer(
                new double[]{80, 65, 35, 90, 50});

        assertEquals(5, analyzer.getStudentCount());
    }

    @Test
    void testAverageMarks() {
        MarksAnalyzer analyzer = new MarksAnalyzer(
                new double[]{80, 65, 35, 90, 50});

        assertEquals(64.0, analyzer.getAverage(), 0.001);
    }

    @Test
    void testHighestMark() {
        MarksAnalyzer analyzer = new MarksAnalyzer(
                new double[]{80, 65, 35, 90, 50});

        assertEquals(90.0, analyzer.getHighestMark(), 0.001);
    }

    @Test
    void testPassPercentage() {
        MarksAnalyzer analyzer = new MarksAnalyzer(
                new double[]{80, 65, 35, 90, 50});

        assertEquals(80.0, analyzer.getPassPercentage(), 0.001);
    }

    @Test
    void testAllStudentsPass() {
        MarksAnalyzer analyzer = new MarksAnalyzer(
                new double[]{60, 70, 80});

        assertEquals(100.0, analyzer.getPassPercentage(), 0.001);
    }

    @Test
    void testAllStudentsFail() {
        MarksAnalyzer analyzer = new MarksAnalyzer(
                new double[]{10, 20, 30});

        assertEquals(0.0, analyzer.getPassPercentage(), 0.001);
    }

    @Test
    void testEmptyMarksAreRejected() {
        assertThrows(IllegalArgumentException.class,
                () -> new MarksAnalyzer(new double[]{}));
    }

    @Test
    void testNullMarksAreRejected() {
        assertThrows(IllegalArgumentException.class,
                () -> new MarksAnalyzer(null));
    }

    @Test
    void testMarksAbove100AreRejected() {
        assertThrows(IllegalArgumentException.class,
                () -> new MarksAnalyzer(new double[]{50, 110}));
    }

    @Test
    void testNegativeMarksAreRejected() {
        assertThrows(IllegalArgumentException.class,
                () -> new MarksAnalyzer(new double[]{50, -10}));
    }
}