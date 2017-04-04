/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sam
 */
public class JavaPracticeTest {
    
    @Test
    public void MakeChocolate() {
        assertEquals(9, JavaPractice.makeChocolate(4, 1, 9));
        assertEquals(-1, JavaPractice.makeChocolate(4, 1, 10));
        assertEquals(2, JavaPractice.makeChocolate(4, 1, 7));
    }
    @Test
    public void SumDigits() {
        assertEquals(6, JavaPractice.sumDigits("aa1bc2d3"));
        assertEquals(8, JavaPractice.sumDigits("aa11b33"));
        assertEquals(0, JavaPractice.sumDigits("Chocolate"));
    }
    
    @Test
    public void canBalance() {
        int test1[] = {1,1,1,2,1};
        int test2[] = {2,1,1,2,1};
        int test3[] = {10,10};
        
       assertEquals(true, JavaPractice.canBalance(test1));
       assertEquals(false, JavaPractice.canBalance(test2));
       assertEquals(true, JavaPractice.canBalance(test3));
    }
    @Test
    public void noX() {
        assertEquals("ab", JavaPractice.noX("xaxb"));
        assertEquals("abc", JavaPractice.noX("abc"));
        assertEquals("", JavaPractice.noX("xx"));
    }

    @Test
    public void withoutString(){
        assertEquals("He there", JavaPractice.withoutString("Hello there", "llo"));
        assertEquals("Hllo thr", JavaPractice.withoutString("Hello there", "e"));
        assertEquals("Hello there", JavaPractice.withoutString("Hello there", "x"));
    }
    
    @Test
    public void squareUp(){
        int a[] = {0,0,1,0,2,1,1,3,2,1};
        int b[] = {0,1,2,1};
        int c[] = {0,0,0,1,0,0,2,1,0,3,2,1,4};
        Assert.assertArrayEquals(a, JavaPractice.squareUp(3));
        Assert.assertArrayEquals(b, JavaPractice.squareUp(2));
        Assert.assertArrayEquals(c, JavaPractice.squareUp(4));
        
    }
}
