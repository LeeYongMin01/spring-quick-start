package spring.study;


public class SonySpeaker implements Speaker {

  public SonySpeaker() {
    System.out.println("===> SonySpeaker 객체 생성");
  }
  
  public void volumeUp() {
    System.out.println("SonySpeeaker ---소리 올린다.");
  }
  
  public void volumeDown() {
    System.out.println("Sonyspeaker ---소리 내린다.");
  }
}
