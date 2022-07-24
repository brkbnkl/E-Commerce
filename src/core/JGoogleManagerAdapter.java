package core;

import JGoogle.JGoogleManager;

public class JGoogleManagerAdapter implements GoogleService {
    @Override
    public void google(String message) {
        JGoogleManager manager = new JGoogleManager();
        manager.google(message);

    }
}
