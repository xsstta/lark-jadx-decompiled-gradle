package com.facebook.react.bridge;

import android.os.AsyncTask;

public abstract class GuardedAsyncTask<Params, Progress> extends AsyncTask<Params, Progress, Void> {
    private final NativeModuleCallExceptionHandler mExceptionHandler;

    /* access modifiers changed from: protected */
    public abstract void doInBackgroundGuarded(Params... paramsArr);

    protected GuardedAsyncTask(NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler) {
        this.mExceptionHandler = nativeModuleCallExceptionHandler;
    }

    protected GuardedAsyncTask(ReactContext reactContext) {
        this(reactContext.getExceptionHandler());
    }

    /* access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public final Void doInBackground(Params... paramsArr) {
        try {
            doInBackgroundGuarded(paramsArr);
            return null;
        } catch (RuntimeException e) {
            this.mExceptionHandler.handleException(e);
            return null;
        }
    }
}
