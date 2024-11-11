package com.myapp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class SolutionTest {
    @Test
    public void testRestoreIpAddresses1() {
        Solution solution = new Solution();
        List<String> result1 = solution.restoreIpAddresses("25525511135");
        List<String> expected1 = Arrays.asList("", "255.255.111.35");
        Collections.sort(result1);
        Collections.sort(expected1);
        assertIterableEquals(expected1, result1);
    }

    @Test
    public void testRestoreIpAddresses2() {
        Solution solution = new Solution();
        List<String> result2 = solution.restoreIpAddresses("0000");
        List<String> expected2 = Collections.singletonList("0.0.0.0");
        assertIterableEquals(expected2, result2);
    }

    @Test
    public void testRestoreIpAddresses3() {
        Solution solution = new Solution();
        List<String> result3 = solution.restoreIpAddresses("101023");
        List<String> expected3 = Arrays.asList("1.0.10.23", "1.0.102.3", "10.1.0.23", "10.10.2.3", "101.0.2.3");
        Collections.sort(result3);
        Collections.sort(expected3);
        assertIterableEquals(expected3, result3);
    }
}


