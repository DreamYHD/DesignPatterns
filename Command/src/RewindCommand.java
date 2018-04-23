/**
 * Created by Administrator on 2018/4/23.
 */
public class RewindCommand implements Command {
    private AudioPlayer audioPlayer;

    public RewindCommand(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    @Override
    public void command() {
        audioPlayer.rewind();
    }
}
