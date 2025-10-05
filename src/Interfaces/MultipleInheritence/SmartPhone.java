package Interfaces.MultipleInheritence;

public class SmartPhone implements Camera,MusicPlayer,Phone {
    @Override
    public void takePhoto() {
        System.out.println("Taking photo with SmartPhone");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording Video with SmartPhone");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing Music with SmartPhone");
    }

    @Override
    public void stopMusic() {
        System.out.println("Stopping music player in SmartPhone");
    }

    @Override
    public void makeCall() {
        System.out.println("Calling a person");
    }

    @Override
    public void endCall() {
        System.out.println("Ending the call");
    }
}
