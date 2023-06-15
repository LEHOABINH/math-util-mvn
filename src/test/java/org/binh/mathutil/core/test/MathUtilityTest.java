/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.binh.mathutil.core.test;

import org.binh.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Admin
 */
public class MathUtilityTest {
    
    @Test
    public void testFactorialGivenRightArgumentReturnWell(){
        //assertEquals(69,69);
        assertEquals(1, MathUtility.getFactorial(0));
        assertEquals(1, MathUtility.getFactorial(1));
        assertEquals(2, MathUtility.getFactorial(2));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(120, MathUtility.getFactorial(5));
        assertEquals(720, MathUtility.getFactorial(6));
    }
    
    //DDT Là 1 phần mở rộng của các UNIT TEST FRAMEWORK
    //DATA DRIVEN TESTING
    //Ko nhầm với TDD: TEST DRIVEN DEVELOPMENT 
    //                  Viết code và ciết test case song hành với nhau
    
    // Nhưng code TEST bốc mùi (BAD SMELLS) Trùng Code Nhiều
    // Nên Người Ta Chế Ra Cách Viết Code Test Đẹp Hơn, Gọn Hơn, Dễ Bảo
    // Trì Hơn
}
