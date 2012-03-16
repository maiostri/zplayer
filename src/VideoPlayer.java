import org.gstreamer.*;
import org.gstreamer.elements.*;
import org.gstreamer.event.*;
import org.gstreamer.glib.*;
import org.gstreamer.interfaces.*;
import org.gstreamer.io.*;
import org.gstreamer.lowlevel.*;
import org.gstreamer.media.*;
import org.gstreamer.message.*;
import org.gstreamer.query.*;
import org.gstreamer.swing.*;
import com.sun.jna.*;

import java.io.File;
import javax.swing.*;
import java.awt.*;

public class VideoPlayer extends Playerpai {

	VideoPlayer() {  
             super();
             playbin = new PlayBin("VideoPlayer");
         }
        
        void tocar(File arquivo) {
        SwingUtilities.invokeLater(new Runnable() {

            public void run() {
                VideoComponent videoComponent = new VideoComponent();
                playbin.setVideoSink(videoComponent.getElement());

                JFrame frame = new JFrame("VideoPlayer");
                frame.getContentPane().add(videoComponent, BorderLayout.CENTER);
                frame.setPreferredSize(new Dimension(640, 480));
                frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
                try {
			playbin.setState(State.PLAYING); 
		} catch (Exception e) {
			e.printStackTrace();
		}
            }
        });
        Gst.main();
        playbin.setState(State.NULL);
    }

}
