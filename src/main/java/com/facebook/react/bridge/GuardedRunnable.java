package com.facebook.react.bridge;

public abstract class GuardedRunnable implements Runnable {
    private final NativeModuleCallExceptionHandler mExceptionHandler;

    public abstract void runGuarded();

    public final void run() {
        try {
            runGuarded();
        } catch (RuntimeException e) {
            this.mExceptionHandler.handleException(e);
        }
    }

    public GuardedRunnable(NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler) {
        this.mExceptionHandler = nativeModuleCallExceptionHandler;
    }

    public GuardedRunnable(ReactContext reactContext) {
        this(reactContext.getExceptionHandler());
    }
}
