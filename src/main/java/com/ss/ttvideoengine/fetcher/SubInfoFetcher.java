package com.ss.ttvideoengine.fetcher;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.google.firebase.messaging.Constants;
import com.ss.ttvideoengine.net.TTHTTPNetwork;
import com.ss.ttvideoengine.net.TTVNetClient;
import com.ss.ttvideoengine.utils.Error;
import com.ss.ttvideoengine.utils.TTHelper;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

public class SubInfoFetcher {
    public boolean mCancelled;
    private Context mContext;
    private Handler mHandler;
    public FetcherListener mListener;
    private TTVNetClient mNetworkSession;
    private String mSubApiString = "";

    public interface FetcherListener {
        void onCompletion(String str, Error error);

        void onLog(String str);
    }

    public String _extractFields(JSONObject jSONObject) {
        return "";
    }

    private void _fetchInfoInternal() {
        if (TextUtils.isEmpty(this.mSubApiString)) {
            _notifyError(new Error("kTTVideoErrorDomainSubFetchingInfo", -9930, "sub ApiString empty"));
        } else {
            _beginToFetch(this.mSubApiString);
        }
    }

    public void cancel() {
        synchronized (this) {
            this.mHandler.removeCallbacksAndMessages(null);
            FetcherListener fetcherListener = this.mListener;
            if (fetcherListener != null) {
                fetcherListener.onLog("fetcher cancelled");
                if (!this.mCancelled) {
                    this.mCancelled = true;
                    this.mNetworkSession.cancel();
                }
            }
        }
    }

    public void setListener(FetcherListener fetcherListener) {
        this.mListener = fetcherListener;
    }

    public void fetchInfo(String str) {
        this.mSubApiString = str;
        _fetchInfoInternal();
    }

    private void _beginToFetch(String str) {
        this.mNetworkSession.startTask(str, new TTVNetClient.CompletionListener() {
            /* class com.ss.ttvideoengine.fetcher.SubInfoFetcher.C654441 */

            @Override // com.ss.ttvideoengine.net.TTVNetClient.CompletionListener
            public void onCompletion(JSONObject jSONObject, Error error) {
                if (jSONObject != null || error == null) {
                    SubInfoFetcher.this._getInfoSuccess(jSONObject);
                } else {
                    SubInfoFetcher.this._notifyError(error);
                }
            }
        });
    }

    private void _notifySuccess(String str) {
        this.mHandler.sendMessage(this.mHandler.obtainMessage(2, str));
    }

    public void _notifyError(Error error) {
        this.mHandler.sendMessage(this.mHandler.obtainMessage(1, error));
    }

    private static class MyHandler extends Handler {
        private final WeakReference<SubInfoFetcher> mFetcherRef;

        public void handleMessage(Message message) {
            FetcherListener fetcherListener;
            SubInfoFetcher subInfoFetcher = this.mFetcherRef.get();
            if (subInfoFetcher != null && (fetcherListener = subInfoFetcher.mListener) != null) {
                if (subInfoFetcher.mCancelled) {
                    fetcherListener.onLog("fetcher is cancelled");
                    return;
                }
                int i = message.what;
                if (i == 1) {
                    fetcherListener.onCompletion(null, (Error) message.obj);
                } else if (i == 2) {
                    fetcherListener.onCompletion((String) message.obj, null);
                }
            }
        }

        public MyHandler(SubInfoFetcher subInfoFetcher, Looper looper) {
            super(looper);
            this.mFetcherRef = new WeakReference<>(subInfoFetcher);
        }
    }

    public void _getInfoSuccess(JSONObject jSONObject) {
        synchronized (this) {
            if (!this.mCancelled) {
                if (jSONObject != null) {
                    TTVideoEngineLog.m256500d("SubInfoFetcher", "sub jsonObject:" + jSONObject.toString());
                    int optInt = jSONObject.optInt("code");
                    String optString = jSONObject.optString("message");
                    String optString2 = jSONObject.optString("trace_id");
                    if (optInt != 200) {
                        Error error = new Error("kTTVideoErrorDomainSubFetchingInfo", -9932, optInt, optString);
                        error.parameters.put("log_id", optString2);
                        _notifyError(error);
                        return;
                    }
                    JSONObject optJSONObject = jSONObject.optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                    if (optJSONObject == null) {
                        _notifyError(new Error("kTTVideoErrorDomainSubFetchingInfo", -9931, "sub fetched info Result is empty"));
                    } else {
                        _notifySuccess(optJSONObject.toString());
                    }
                }
            }
        }
    }

    public SubInfoFetcher(Context context, TTVNetClient tTVNetClient) {
        this.mContext = context;
        this.mHandler = new MyHandler(this, TTHelper.getLooper());
        if (tTVNetClient == null) {
            this.mNetworkSession = new TTHTTPNetwork();
        } else {
            this.mNetworkSession = tTVNetClient;
        }
    }
}
