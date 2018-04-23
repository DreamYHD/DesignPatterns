/**
 * Created by Administrator on 2018/4/23.
 */
public class PlayCommand implements Command {
    private AudioPlayer audioPlayer;

    public PlayCommand(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    @Override
    public void command() {
        audioPlayer.play();

    }
}
