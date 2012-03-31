package features.tiger;

import static org.junit.Assert.*;
//import org.junit.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {

	FizzBuzz sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new FizzBuzz();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void return_Fizz_when_argument_is_three() { //�O�̎���Fizz��Ԃ�
		assertThat(sut.fizzBuzz(3), is("Fizz"));
	}
	
	@Test
	public void  �܂̎���Buzz��Ԃ�() {
		assertThat(sut.fizzBuzz(5), is("Buzz"));
	}
	
	@Test
	public void �O�̔{���̎���Fizz��Ԃ�() {
		assertThat(sut.fizzBuzz(6), is("Fizz"));
	}
	
	@Test
	public void �܂̔{���̎���Buzz��Ԃ�() {
		assertThat(sut.fizzBuzz(10), is("Buzz"));
	}
	
	@Test
	public void ��̎��͈����̐����𕶎���ɂ��ĕԂ�() {
		assertThat(sut.fizzBuzz(1), is("1"));
	}
	
	@Test
	public void ��̎��͈����̐����𕶎���ɂ��ĕԂ�() {
		assertThat(sut.fizzBuzz(2), is("2"));
	}
	
	@Test
	public void  ���イ���̎���FizzBuzz��Ԃ�() {
		assertThat(sut.fizzBuzz(15), is("FizzBuzz"));
	}
	
	@Test
	public void �O�ƌ܂̌��{���̎���FizzBuzz��Ԃ�() {
		assertThat(sut.fizzBuzz(30), is("FizzBuzz"));
	}
	
}
