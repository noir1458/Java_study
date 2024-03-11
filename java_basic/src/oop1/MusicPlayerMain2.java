package oop1;

import ref.Data;

public class MusicPlayerMain2 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        on(data);
        volumeUp(data);
        volumeUp(data);
        volumeDown(data);
        showStatus(data);
        off(data);
    }

    static void on(MusicPlayerData data) {
        //음악 플레이어 켜기
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다");
    }

    static void off(MusicPlayerData data) {
        //음악 플레이어 끄기
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    static void volumeUp(MusicPlayerData data){
        //볼륨 증가
        data.volume++;
        System.out.println("음악 플레이어 볼륨:" + data.volume);
    }
    static void volumeDown(MusicPlayerData data){
        //볼륨 감소
        data.volume--;
        System.out.println("음악 플레이어 볼륨:" + data.volume);
    }
    static void showStatus(MusicPlayerData data){
        //음악 플레이어 상태
        System.out.println("음악 플레이어 상태 확인");
        if (data.isOn) {
            System.out.println("음악 플레이어 ON, 볼륨:" + data.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }
}
/*
지금까지 클래스를 사용해서 관련된 데이터를 하나로 묶고, 또 메서드를 사용해서 각각의 기능을 모듈화했다.
더 개선할수는 없을까.

이 코드의 한계는 데이터와 기능이 분리되어있다는 것
data는
 */
