import org.gstreamer.*;
import org.gstreamer.Gst;
import org.gstreamer.elements.PlayBin;
import java.io.*;

public class AudioPlayer extends Playerpai {

    AudioPlayer() { 
        super(); 
        playbin = new PlayBin("AudioPlayer");
    }

    void tocar(File music) {
		playbin.setVideoSink(ElementFactory.make("fakesink", "videosink"));     
                playbin.setState(State.PLAYING);
                Gst.main();
                playbin.setState(State.NULL);
    }

}

   
