/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TextToSpeech;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

/**
 *
 * @author Vipul
 */
public class TextToSpeech {
    private static String VOICENAME = "kevin16";

    public void speech(String text) {
        Voice voice;
        VoiceManager voiceManager = VoiceManager.getInstance();
    

        voice = voiceManager.getVoice(VOICENAME);
        voice.allocate();
        voice.speak(text);
    }
   
 
}
