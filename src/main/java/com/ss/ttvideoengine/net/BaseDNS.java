package com.ss.ttvideoengine.net;

import android.os.Handler;
import android.os.Message;
import com.ss.ttvideoengine.utils.Error;
import com.ss.ttvideoengine.utils.TTHelper;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

public class BaseDNS {
    protected boolean mCancelled;
    protected Handler mHandler = new MyHandler(this);
    protected String mHostname;
    protected DNSCompletionListener mListener;
    protected TTVNetClient mNetClient;

    public void cancel() {
    }

    public void close() {
    }

    public void start() {
    }

    /* access modifiers changed from: protected */
    public void notifyCancelled() {
        this.mHandler.sendEmptyMessage(0);
    }

    public void setCompletionListener(DNSCompletionListener dNSCompletionListener) {
        this.mListener = dNSCompletionListener;
    }

    private static class MyHandler extends Handler {
        private final WeakReference<BaseDNS> mDNSRef;

        public MyHandler(BaseDNS baseDNS) {
            super(TTHelper.getLooper());
            this.mDNSRef = new WeakReference<>(baseDNS);
        }

        public void handleMessage(Message message) {
            DNSCompletionListener dNSCompletionListener;
            BaseDNS baseDNS = this.mDNSRef.get();
            if (baseDNS != null && (dNSCompletionListener = baseDNS.mListener) != null && !baseDNS.mCancelled) {
                int i = message.what;
                if (i == 0) {
                    dNSCompletionListener.onCancelled();
                } else if (i == 1) {
                    baseDNS.close();
                    dNSCompletionListener.onRetry((Error) message.obj);
                } else if (i == 2) {
                    baseDNS.close();
                    dNSCompletionListener.onCompletion(null, (Error) message.obj);
                } else if (i == 3) {
                    baseDNS.close();
                    dNSCompletionListener.onCompletion((JSONObject) message.obj, null);
                }
            }
        }
    }

    public BaseDNS(String str) {
        this.mHostname = str;
    }

    /* access modifiers changed from: protected */
    public void notifyError(Error error) {
        this.mHandler.sendMessage(this.mHandler.obtainMessage(2, error));
    }

    /* access modifiers changed from: protected */
    public void notifyRetry(Error error) {
        this.mHandler.sendMessage(this.mHandler.obtainMessage(1, error));
    }

    /* access modifiers changed from: protected */
    public void notifySuccess(JSONObject jSONObject) {
        this.mHandler.sendMessage(this.mHandler.obtainMessage(3, jSONObject));
    }

    public BaseDNS(String str, TTVNetClient tTVNetClient) {
        this.mHostname = str;
        this.mNetClient = tTVNetClient == null ? new TTHTTPNetwork() : tTVNetClient;
    }
}
