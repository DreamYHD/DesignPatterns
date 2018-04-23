/**
 * Created by Administrator on 2018/4/23.
 */
public class StopCommand implements Command {
    private AudioPlayer audioPlayer;

    public StopCommand(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    @Override
    public void command() {
        audioPlayer.stop();
    }
}
