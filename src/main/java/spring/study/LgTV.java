package spring.study;

import org.springframework.stereotype.Component;

@Component
public class LgTV implements TV {
	public LgTV() {
		System.out.println("===> LgTV 객체 생성");
	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		
	}

}
