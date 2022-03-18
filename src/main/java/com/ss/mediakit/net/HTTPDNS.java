package com.ss.mediakit.net;

import android.os.Handler;
import android.text.TextUtils;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.mediakit.medialoader.AVMDLLog;
import com.ss.mediakit.net.AVMDLNetClient;
import java.lang.reflect.Method;
import org.json.JSONArray;
import org.json.JSONObject;

public class HTTPDNS extends BaseDNS {
    private static String mGoogleDNSServer = "/resolve?name=";
    private static String mTTDNSServer = "/q?host=";
    private int mHttpDNSType = 2;
    private Object mSource;
    private long mSourceId;

    @Override // com.ss.mediakit.net.BaseDNS
    public void cancel() {
        if (!this.mCancelled) {
            this.mCancelled = true;
            this.mNetClient.cancel();
        }
    }

    private String _getURL() {
        StringBuilder sb = new StringBuilder();
        int i = this.mHttpDNSType;
        if (i == 2 || i == 1) {
            sb.append("https://" + AVMDLDNSParser.mGlobalOwnDNSParseHost + mTTDNSServer);
        } else if (i == 3) {
            sb.append("https://" + AVMDLDNSParser.mGlobalGoogleDNSParseHost + mGoogleDNSServer);
        }
        sb.append(this.mHostname);
        int i2 = this.mHttpDNSType;
        if (i2 == 2 || i2 == 1) {
            sb.append("&source=vod");
        }
        return sb.toString();
    }

    @Override // com.ss.mediakit.net.BaseDNS
    public void start() {
        String _getURL = _getURL();
        AVMDLLog.m256407d("HTTPDNS", "http dns url:" + _getURL);
        Method[] declaredMethods = this.mNetClient.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Method method = declaredMethods[i];
            if (method.getName().equals("startTask") && method.getParameterTypes().length == 5) {
                z = true;
                break;
            }
            i++;
        }
        if (z) {
            this.mNetClient.startTask(_getURL, null, null, 0, new AVMDLNetClient.CompletionListener() {
                /* class com.ss.mediakit.net.HTTPDNS.C653801 */

                @Override // com.ss.mediakit.net.AVMDLNetClient.CompletionListener
                public void onCompletion(JSONObject jSONObject, Error error) {
                    HTTPDNS.this._handleResponse(jSONObject, error);
                }
            });
        } else {
            this.mNetClient.startTask(_getURL, null, new AVMDLNetClient.CompletionListener() {
                /* class com.ss.mediakit.net.HTTPDNS.C653812 */

                @Override // com.ss.mediakit.net.AVMDLNetClient.CompletionListener
                public void onCompletion(JSONObject jSONObject, Error error) {
                    HTTPDNS.this._handleResponse(jSONObject, error);
                }
            });
        }
    }

    private AVMDLDNSInfo parserResult(JSONObject jSONObject) {
        long j;
        String str;
        int i = this.mHttpDNSType;
        String str2 = "";
        int i2 = 60;
        if (i != 2 && i != 1) {
            j = 0;
            str = null;
        } else if (jSONObject == null || jSONObject.length() == 0) {
            return null;
        } else {
            if (jSONObject.has("ttl")) {
                i2 = jSONObject.optInt("ttl");
            }
            AVMDLLog.m256407d("HTTPDNS", String.format("receive expiredtime:%d force expiredtime:%d ", Integer.valueOf(i2), Integer.valueOf(AVMDLDNSParser.mGlobalForceExpiredTime)));
            if (AVMDLDNSParser.mGlobalForceExpiredTime > 0) {
                i2 = AVMDLDNSParser.mGlobalForceExpiredTime;
            }
            j = System.currentTimeMillis() + ((long) (i2 * 1000));
            JSONArray optJSONArray = jSONObject.optJSONArray("ips");
            if (optJSONArray == null || optJSONArray.length() == 0) {
                return null;
            }
            str = null;
            for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                try {
                    str = optJSONArray.getString(i3);
                } catch (Exception e) {
                    e.printStackTrace();
                    str = null;
                }
                if (!TextUtils.isEmpty(str)) {
                    str2 = TextUtils.isEmpty(str2) ? str2 + str : str2 + "," + str;
                }
            }
        }
        if (this.mHttpDNSType == 3) {
            try {
                JSONArray jSONArray = jSONObject.getJSONArray("Answer");
                for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i4);
                    if (jSONObject2.has(ShareHitPoint.f121869d) && jSONObject2.getInt(ShareHitPoint.f121869d) == 1) {
                        if (jSONObject2.has("TTL")) {
                            i2 = jSONObject2.optInt("TTL");
                        }
                        if (jSONObject2.has(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)) {
                            str = jSONObject2.optString(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                        }
                        if (!TextUtils.isEmpty(str)) {
                            str2 = TextUtils.isEmpty(str2) ? str2 + str : str2 + "," + str;
                        }
                    }
                }
                AVMDLLog.m256407d("HTTPDNS", String.format("receive expiredtime:%d force expiredtime:%d ", Integer.valueOf(i2), Integer.valueOf(AVMDLDNSParser.mGlobalForceExpiredTime)));
                if (AVMDLDNSParser.mGlobalForceExpiredTime > 0) {
                    i2 = AVMDLDNSParser.mGlobalForceExpiredTime;
                }
                j = System.currentTimeMillis() + ((long) (i2 * 1000));
            } catch (Exception e2) {
                e2.printStackTrace();
                return null;
            }
        }
        return new AVMDLDNSInfo(this.mHttpDNSType, this.mHostname, str2, j, this.mId);
    }

    public void _handleResponse(JSONObject jSONObject, Error error) {
        AVMDLDNSInfo aVMDLDNSInfo;
        AVMDLLog.m256407d("HTTPDNS", String.format("****http dns id:%s type:%d host:%s", this.mId, Integer.valueOf(this.mHttpDNSType), this.mHostname));
        AVMDLDNSInfo aVMDLDNSInfo2 = new AVMDLDNSInfo(this.mHttpDNSType, this.mHostname, (String) null, 0, this.mId);
        if (error != null) {
            aVMDLDNSInfo2.mErrorStr = error.errStr;
            AVMDLLog.m256407d("HTTPDNS", String.format("handle response receive err:%s", error.errStr));
        } else if (jSONObject == null || jSONObject.length() == 0) {
            new Error(this.mHttpDNSType, this.mHostname, this.mId, String.format("HTTP dns empty, type:%d", Integer.valueOf(this.mHttpDNSType)));
            AVMDLLog.m256407d("HTTPDNS", String.format("json null err", new Object[0]));
        } else {
            try {
                aVMDLDNSInfo = parserResult(jSONObject);
            } catch (Throwable th) {
                AVMDLLog.m256407d("HTTPDNS", String.format("handle response exception:%s", th.toString()));
                aVMDLDNSInfo = null;
            }
            if (aVMDLDNSInfo == null) {
                AVMDLLog.m256407d("HTTPDNS", String.format("info null err", new Object[0]));
            } else {
                AVMDLLog.m256407d("HTTPDNS", String.format("****parse suc for host:%s iplist:%s", this.mHostname, aVMDLDNSInfo.mIpList));
                IPCache.getInstance().put(this.mHostname, aVMDLDNSInfo);
                notifySuccess(aVMDLDNSInfo);
                return;
            }
        }
        AVMDLLog.m256407d("HTTPDNS", String.format("****parse failed for host:%s", this.mHostname));
        notifyError(aVMDLDNSInfo2);
    }

    public HTTPDNS(String str, AVMDLNetClient aVMDLNetClient, int i, Handler handler) {
        super(str, aVMDLNetClient, handler);
        this.mHttpDNSType = i;
    }
}
