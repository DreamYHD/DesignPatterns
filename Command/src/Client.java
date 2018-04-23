/**
 * Created by Administrator on 2018/4/23.
 */
public class Client {
    public static void main(String[] args) {
        AudioPlayer audioPlayer  = new AudioPlayer();
        Command command_play = new PlayCommand(audioPlayer);
        Command command_stop = new StopCommand(audioPlayer);
        Command command_rewind = new RewindCommand(audioPlayer);

        Keypad keypad = new Keypad();
        keypad.setPlayCommand(command_play);
        keypad.setRewindCommand(command_rewind);
        keypad.setStopCommand(command_stop);
        keypad.rewind();
        keypad.stop();
        keypad.play();






    }
}
