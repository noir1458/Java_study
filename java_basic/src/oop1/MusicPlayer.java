package oop1;

public class MusicPlayer {
    int volume = 0;
    boolean isOn = false;

    void on() {
        //음악 플레이어 켜기
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다");
    }

    void off() {
        //음악 플레이어 끄기
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    void volumeUp(){
        //볼륨 증가
        volume++;
        System.out.println("음악 플레이어 볼륨:" + volume);
    }
    void volumeDown(){
        //볼륨 감소
        volume--;
        System.out.println("음악 플레이어 볼륨:" + volume);
    }
    void showStatus(){
        //음악 플레이어 상태
        System.out.println("음악 플레이어 상태 확인");
        if (isOn) {
            System.out.println("음악 플레이어 ON, 볼륨:" + volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }}
