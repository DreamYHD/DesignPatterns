import com.sun.org.apache.regexp.internal.RE;

/**
 * Created by Administrator on 2018/4/23.
 */
public class Keypad {
    private Command playCommand;
    private Command stopCommand;
    private Command rewindCommand;

    public void setPlayCommand(Command playCommand) {
        this.playCommand = playCommand;
    }

    public void setStopCommand(Command stopCommand) {
        this.stopCommand = stopCommand;
    }

    public void setRewindCommand(Command rewindCommand) {
        this.rewindCommand = rewindCommand;
    }
    public void play(){
        playCommand.command();
    }
    public void stop(){
        stopCommand.command();
    }
    public void rewind(){
        rewindCommand.command();
    }


}
