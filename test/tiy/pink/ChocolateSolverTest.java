package tiy.pink;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by DTG2 on 08/24/16.
 */
public class ChocolateSolverTest {

    ChocolateSolver solver = new ChocolateSolver();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testEnoughSmallsNoBigs() throws Exception {
        int numSmalls = solver.makeChocolate(12, 0, 10);
        assertEquals(10, numSmalls);
    }

    @Test
    public void testEnoughBigsNoSmalls() throws Exception {
        int numSmalls = solver.makeChocolate(0, 2, 10);
        assertEquals(0, numSmalls);
    }

    @Test
    public void TestNotEnoughBigsOrSmalls() throws Exception {
        int numSmalls = solver.makeChocolate(3, 1, 10);
        assertEquals(-1, numSmalls);
    }

    @Test
    public void TestMostlyBigsFewSmallsBigGoal() throws Exception {
        int numSmalls = solver.makeChocolate(2, 19, 97);
        assertEquals(2, numSmalls);
    }

    @Test
    public void TestMoreSmallsThanBigsBigGoal() throws Exception {
        int numSmalls = solver.makeChocolate(3, 2, 13);
        assertEquals(3, numSmalls);
    }

    @Test
    public void TestBothEvenBigGoal() throws Exception {
        int numSmalls = solver.makeChocolate(40, 40, 80);
        assertEquals(0, numSmalls);
    }

    @Test
    public void TestMostlyBigsFewSmallsSmallGoal() throws Exception {
        int numSmalls = solver.makeChocolate(2, 3, 17);
        assertEquals(2, numSmalls);
    }

    @Test
    public void TestMostlySmallsFewBigsSmallGoal() throws Exception {
        int numSmalls = solver.makeChocolate(4, 2, 14);
        assertEquals(4, numSmalls);
    }

    @Test
    public void TestAllBigsBigGoal() throws Exception {
        int numSmalls = solver.makeChocolate(0, 25, 125);
        assertEquals(0, numSmalls);
    }

    @Test
    public void TestAllBigsSmallGoal() throws Exception {
        int numSmalls = solver.makeChocolate(0, 3, 15);
        assertEquals(0, numSmalls);
    }
    @Test
    public void TestAllSmallsSmallGoal() throws Exception {
        int numSmalls = solver.makeChocolate(4, 0, 4);
        assertEquals(4, numSmalls);
    }

    @Test
    public void testManyMoreBigsAndSmallsThanNecessary() throws Exception {
        int numSmalls = solver.makeChocolate(1524, 900, 50);
        assertEquals(0, numSmalls);
    }

    @Test
    public void testNotEnoughBigsToMakeGoal() throws Exception {
        int numSmalls = solver.makeChocolate(55, 2, 76);
        assertEquals(-1, numSmalls);
    }

    @Test
    public void testNotEnoughSmallsToMakeGoal() throws Exception {
        int numSmalls = solver.makeChocolate(3, 4, 44);
        assertEquals(-1, numSmalls);
    }

    @Test
    public void testSuperHighGoal() throws Exception {
        int numSmalls = solver.makeChocolate(3358, 2930, 1572);
        assertEquals(2, numSmalls);
    }

    @Test
    public void testMidRangeGoalSuperHighBigs() throws Exception {
        int numSmalls = solver.makeChocolate(20, 2930, 98);
        assertEquals(3, numSmalls);
    }

    @Test
    public void testMidRangeGoalSuperHighSmalls() throws Exception {
        int numSmalls = solver.makeChocolate(3358, 30, 99);
        assertEquals(4, numSmalls);
    }
}