package com.ivoronline.springboot_junit_assert.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MyControllerTest {

  @Autowired MyController myController;

  //================================================================
  // HELLO
  //================================================================
  @Test
  void hello() {

    //PERFORM ACTION
    String result = myController.hello();

    //TEST RESULT
    assertEquals("Hello from Controller", result);

  }

  //================================================================
  // ASSERTS PASS
  //================================================================
  @Test
  void assertsPass() {
    System.out.println("Inside testPass()");
    assertEquals   (5, 5);
    assertNotEquals(5, 4);
    assertTrue     (true);
    assertFalse    (false);
    assertNull     (null);
    assertNotNull  (1);
  }

  //================================================================
  // ASSERTS FAIL
  //================================================================
  @Test
	public void assertsFail() {
		System.out.println("Inside testFail()");
		Integer i = 1;
		assertEquals   (5, 4);		//java.lang.AssertionError: expected:<5> but was:<4>
		assertNotEquals(5, 5);		//java.lang.AssertionError: Values should be different. Actual: 5
		assertTrue     (false);	  //java.lang.AssertionError:
		assertFalse    (true);		//java.lang.AssertionError:
		assertNull     (i);       //java.lang.AssertionError: expected null, but was:<1>
	}

}