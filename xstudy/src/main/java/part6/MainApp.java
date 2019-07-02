package part6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		ApplicationContext ac = new GenericXmlApplicationContext("spring/context5.xml");
		//ctrl shift o ������
		
		
		Board board = ac.getBean("board", Board.class);
		board.boardWrite();
	}
}

