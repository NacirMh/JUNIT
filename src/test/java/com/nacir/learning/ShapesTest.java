package com.nacir.learning;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
class ShapesTest {
	
    Shapes shapes;
    
    ShapesTest(){
    	System.out.println("instance");
    }
    
    @BeforeEach
    void init() {
    	System.out.println("before each");
    	shapes = new Shapes();
    }
    
    @AfterEach
    void destroy() {
    	System.out.println("after each");
    }
    
    @Test
	void testcomputeSquarePerimter() {
	     assertEquals(16,shapes.computeSquarePerimeter(4));
	}
    
    
	@Test
	void testcomputeSquareArea() {
	     assertEquals(9,shapes.computeSquareArea(3, 3));
	}

}
