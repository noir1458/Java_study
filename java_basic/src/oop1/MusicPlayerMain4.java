package oop1;

public class MusicPlayerMain4 {
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();

        player.on();
        player.volumeUp();
        player.volumeUp();
        player.volumeDown();
        player.showStatus();
        player.off();

    }
}
/*
음악플레이어를 구성하기 위한 속성과 기능이 하나의 캡슐에 쌓여있는 것 같다.
이렇게 속성과 기능을 하나로 묶어서 필요한 기능을 메서드를 통해 외부에 제공하는 것을 캡슐화라고 한다.

 */
