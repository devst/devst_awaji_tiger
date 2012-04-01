package features.tiger;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyersTest {

	Myers sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new Myers();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void �S�Ă̕ӂ������Ȃ�ΐ��O�p�`() {
		assertThat(sut.getName(5, 5, 5), is("���O�p�`"));
	}
	
	@Test
	public void ���T�C�h�̕ӂ̒����������Ȃ�Γ񓙕ӎO�p�`() {
		assertThat(sut.getName(5, 5, 6), is("�񓙕ӎO�p�`"));
	}
	
	@Test
	public void �S�Ă̕ӂ̒������قȂ�Εs���ӎO�p�`() {
		assertThat(sut.getName(5, 4, 3), is("�s���ӎO�p�`"));
	}
	
	@Test
	public void �E���̕ӂƒ�ӂ������Ȃ�Γ񓙕ӎO�p�`() {
		assertThat(sut.getName(5, 6, 6), is("�񓙕ӎO�p�`"));
	}
	
	@Test
	public void �����̕ӂƒ�ӂ������Ȃ�Γ񓙕ӎO�p�`() {
		assertThat(sut.getName(6, 5, 6), is("�񓙕ӎO�p�`"));
	}
	
	@Test(expected=RuntimeException.class)
	public void �T�C�h�̕ӂ̘a����ӂ��Z����Η�O() throws Exception {
		sut.getName(1, 2, 5);
	}

	@Test(expected=RuntimeException.class)
	public void �E���̕ӂƒ�ӂ̘a�������̕ӂ��Z����Η�O() throws Exception {
		sut.getName(1, 5, 2);
	}
	
	@Test(expected=RuntimeException.class)
	public void �����̕ӂƒ�ӂ̘a���E���̕ӂ��Z����Η�O() throws Exception {
		sut.getName(5, 1, 2);
	}
	
	@Test(expected=RuntimeException.class)
	public void �T�C�h�̕ӂ̘a����ӂƓ����Ȃ�Η�O() throws Exception {
		sut.getName(1, 2, 3);
	}
	
	@Test(expected=RuntimeException.class)
	public void �E���̕ӂƒ�ӂ̘a�������̕ӂƓ����Ȃ�Η�O() throws Exception {
		sut.getName(1, 3, 2);
	}
	
	@Test(expected=RuntimeException.class)
	public void �����̕ӂƒ�ӂ̘a���E���̕ӂƓ����Ȃ�Η�O() throws Exception {
		sut.getName(3, 1, 2);
	}

}
