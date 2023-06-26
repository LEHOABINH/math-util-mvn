/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.binh.mathutil.core.test;

import org.binh.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author Admin
 */
public class MathUtilityAdvanceTest {

    // tạo mảng 2 chiều chứa data và sẽ dùng cho việc assertE()
    // Gồm n đưa vào và expected trả về
    // int               long  -> Object (wapper class)
    //                                    Integer Long
    public static Object[][] initTestData() {
        Object testData[][]
                = {{0, 1},
                {1, 1},
                {2, 2},
                {4, 24},
                {5, 1200}};
        return testData;

    }
    
    //nhồi data này vào essertE()
    @ParameterizedTest
    @MethodSource("initTestData")
                                                         //cot 0   //cot 1
    public void testFactorialGivenRightArgumentReturnWell(int n , long expected){
        //assertEquals(69,69);
        assertEquals(expected, MathUtility.getFactorial(n));
    }

    //TDD: Test Driven Development là kỹ thuật lập trình mà 
    // gắn với việc viết các test case để kiểm thử ngay những hàm dev mình vừa viết
    // Viết code chính và viết code test (JUnit, Unit Test) xen kẽ
    // với nhau . 2 màu Xanh Đỏ LIÊN TỤC DIỄN RA
    
    //DDT: sự mở rộng thêm cho quá trình viết code test (JUnit)
    //     Data Driven Testing
    //     kĩ thuật tách bộ test data ra 1 chỗ riêng , tách vào mảng
    //     cái data từ mảng này vào trong hàm so sánh assertEquals()
    //     Giúp code dễ đọc hơn, dễ kiểm tra xem còn thiếu test case nào hay kh
}
