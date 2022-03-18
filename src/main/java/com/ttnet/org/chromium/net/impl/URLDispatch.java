package com.ttnet.org.chromium.net.impl;

import com.huawei.hms.location.LocationRequest;
import com.ttnet.org.chromium.base.Log;
import com.ttnet.org.chromium.net.urlconnection.MessageLoop;
import java.io.IOException;
import java.util.concurrent.RejectedExecutionException;

public class URLDispatch {
    private static final String TAG = "URLDispatch";
    private String mEpoch;
    private String mEtag;
    private String mFinalUrl;
    private MessageLoop mMessageLoop = new MessageLoop();
    private String mOriginalUrl;

    public String getEpoch() {
        return this.mEpoch;
    }

    public String getEtag() {
        return this.mEtag;
    }

    public String getFinalUrl() {
        return this.mFinalUrl;
    }

    public String getOriginalUrl() {
        return this.mOriginalUrl;
    }

    public void done() {
        this.mMessageLoop.quit();
    }

    public void waitResult() throws IOException {
        this.mMessageLoop.loop(LocationRequest.PRIORITY_INDOOR);
    }

    public URLDispatch(String str) {
        this.mOriginalUrl = str;
    }

    public void resume(Runnable runnable) {
        try {
            this.mMessageLoop.execute(runnable);
        } catch (RejectedExecutionException e) {
            Log.m264556e(TAG, "Exception URLDispatch resume ", e);
        }
    }

    public void setResult(String str, String str2, String str3) {
        this.mFinalUrl = str;
        this.mEtag = str2;
        this.mEpoch = str3;
    }
}
