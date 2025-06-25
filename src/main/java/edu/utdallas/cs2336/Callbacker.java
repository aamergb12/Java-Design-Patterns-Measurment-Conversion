package edu.utdallas.cs2336;

import java.util.ArrayList;
import java.util.List;

public class Callbacker {
    private List<Callback> callbacks = new ArrayList<>();


    public Callbacker(Callback callback) {
        callbacks.add(callback);
    }


    public int doCallbacks() {
        int sum = 0;
        for (Callback callback : callbacks) {
            sum += callback.callbackHappened();
        }
        return sum;
    }


    public void addCallback(Callback callback) {
        callbacks.add(callback);
    }


    public void removeCallback(Callback callback) {
        callbacks.remove(callback);
    }
}