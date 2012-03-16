import org.gstreamer.*;
import org.gstreamer.Gst;
import org.gstreamer.elements.PlayBin;
import org.gstreamer.Format;
import java.io.*;

public class Playerpai {
    protected PlayBin playbin; 

    Playerpai() { Gst.init(); }

    void tocar(File arquivo) { }

   
    void associar(File arquivo) { playbin.setInputFile(arquivo); }

    void pausar() { 
	if (this.playbin.getState() == State.PLAYING) {
                playbin.setState(State.PAUSED);
                playbin.getState();
        }
	else if (this.playbin.getState() == State.PAUSED)
		playbin.play();

    }
    void parar() {
	if (this.playbin.getState() == State.PLAYING)
		this.playbin.stop();
    }

    void setVolume(int percent) {
	if (this.playbin.getState() == State.PLAYING)
                playbin.setVolumePercent(percent);
    }

/*    double duracao(File arquivo) {

        String bitrate;
        int[] d;
	playbin.getBus().connect(new Bus.TAG() {
            int i = 0;
            public void tagsFound(GstObject source, TagList tagList) {
                    Object o = (tagList.getNumber(Tag.BITRATE,0));
                    String bitrate = o.toString();
                    bitrate = bitrate.substring(0,6);
                    d[i] = Integer.parseInt(bitrate);
                    System.out.println("Ae " +bitrate);
                    i++;
            } 
               
            });
        
        return d[0];

    }  */

    long  percentual() {
        if (true) {
		long  l = playbin.queryPosition(Format.PERCENT);
		int i = Math.round(10);
		return l;
	     }    
        else return 0;
    }


    boolean tocando() { return playbin.getState() == State.PLAYING; }

}

   
