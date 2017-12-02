package methods;

//Copyright (c) The League of Amazing Programmers 2013-2017
//Level 0


import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class AnimalFarm {

AnimalFarm() {
	
	
	 String animal= JOptionPane.showInputDialog("Enter an animal");
		 if(animal.equals("Cow")){
		playMoo();
		 }
		 if(animal.equals("Duck")){
		playQuack("quack.wav");
		 }
		 if(animal.equals("Woof")){
		playWoof();
		 }
		 
	 }
		
void playMoo() {
	playNoise(mooFile);
	
}

void playQuack(String quackFile) {
	playNoise(quackFile);
}

void playWoof() {
	playNoise(woofFile);
}


	
String mooFile = "moo.wav";
String woofFile = "woof.wav";
String meowFile = "meow.wav";
String llamaFile = "llama.wav";


/* Ignore this stuff */

public void playNoise(String soundFile) {
	try {
		 Clip clip = AudioSystem.getClip();
		 clip.open(AudioSystem.getAudioInputStream(getClass().getResource(soundFile)));
		 clip.start();
		 Thread.sleep(3400);
	} catch (Exception ex) {
  	ex.printStackTrace();
	}
}

public static void main(String[] args) {
	new AnimalFarm();
}

}

