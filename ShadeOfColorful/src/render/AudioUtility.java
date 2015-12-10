package render;

import java.applet.Applet;
import java.applet.AudioClip;

public class AudioUtility {
	private static AudioClip Intro,Click;
	
	static{
		try {
			ClassLoader cl = AudioUtility.class.getClassLoader();
			Intro = Applet.newAudioClip(cl.getResource("audio/Intro.wav").toURI().toURL());
			Click = Applet.newAudioClip(cl.getResource("audio/Click.wav").toURI().toURL());
		} catch (Exception e) {
			Intro=null;
			Click=null;
			System.out.println("Can't Load");
		}
		
	}
	
	public static void playSound(String identifier){
		/* fill code */
		if(identifier.equalsIgnoreCase("Intro")){
			Intro.loop();
		}
		else if(identifier.equalsIgnoreCase("Click")){
			Click.play();
		}
	}
}
