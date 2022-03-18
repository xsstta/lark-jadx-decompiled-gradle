package com.ss.mediakit.net;

import android.os.Handler;
import android.text.TextUtils;
import com.ss.mediakit.medialoader.AVMDLLog;
import com.ss.mediakit.net.AVMDLNetClient;
import java.lang.reflect.Method;
import org.json.JSONArray;
import org.json.JSONObject;

public class HTTPDNSHosts {
    private static String mTTDNSServer = "/q?host=";
    protected boolean mCancelled;
    protected Handler mHandler;
    public String[] mHostnames;
    private int mHttpDNSType = 2;
    public String mId;
    protected AVMDLNetClient mNetClient;

    public void cancel() {
        if (!this.mCancelled) {
            this.mCancelled = true;
            this.mNetClient.cancel();
        }
    }

    private String _getURL() {
        StringBuilder sb = new StringBuilder();
        sb.append("https://" + AVMDLDNSParser.mGlobalOwnDNSParseHost + mTTDNSServer);
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = this.mHostnames;
            if (i >= strArr.length) {
                return sb.toString();
            }
            if (!TextUtils.isEmpty(strArr[i])) {
                if (i2 == 0) {
                    sb.append(this.mHostnames[i]);
                } else {
                    sb.append("," + this.mHostnames[i]);
                }
                i2++;
            }
            i++;
        }
    }

    public void start() {
        String _getURL = _getURL();
        AVMDLLog.m256407d("BatchParseHTTPDNSHosts", "batch http dns  url:" + _getURL);
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
                /* class com.ss.mediakit.net.HTTPDNSHosts.C653821 */

                @Override // com.ss.mediakit.net.AVMDLNetClient.CompletionListener
                public void onCompletion(JSONObject jSONObject, Error error) {
                    HTTPDNSHosts.this._handleResponse(jSONObject, error);
                }
            });
        } else {
            this.mNetClient.startTask(_getURL, null, new AVMDLNetClient.CompletionListener() {
                /* class com.ss.mediakit.net.HTTPDNSHosts.C653832 */

                @Override // com.ss.mediakit.net.AVMDLNetClient.CompletionListener
                public void onCompletion(JSONObject jSONObject, Error error) {
                    HTTPDNSHosts.this._handleResponse(jSONObject, error);
                }
            });
        }
    }

    private void parseResult(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                JSONArray jSONArray = jSONObject.getJSONArray("dns");
                for (int i = 0; i < jSONArray.length(); i++) {
                    AVMDLDNSInfo parserResultForSingleHost = parserResultForSingleHost(jSONArray.getJSONObject(i));
                    if (parserResultForSingleHost != null) {
                        IPCache.getInstance().put(parserResultForSingleHost.mHost, parserResultForSingleHost);
                    }
                }
            } catch (Exception e) {
                AVMDLLog.m256407d("BatchParseHTTPDNSHosts", "parse json exception" + e);
            }
        }
    }

    private AVMDLDNSInfo parserResultForSingleHost(JSONObject jSONObject) {
        long j;
        String str;
        String str2;
        int i;
        String str3;
        int i2 = this.mHttpDNSType;
        String str4 = "";
        if (i2 == 2 || i2 == 1) {
            if (!(jSONObject == null || jSONObject.length() == 0)) {
                if (jSONObject.has("ttl")) {
                    i = jSONObject.optInt("ttl");
                } else {
                    i = 60;
                }
                String optString = jSONObject.has("host") ? jSONObject.optString("host") : null;
                long currentTimeMillis = System.currentTimeMillis() + ((long) (i * 1000));
                JSONArray optJSONArray = jSONObject.optJSONArray("ips");
                if (!(optJSONArray == null || optJSONArray.length() == 0)) {
                    for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                        try {
                            str3 = optJSONArray.getString(i3);
                        } catch (Exception e) {
                            e.printStackTrace();
                            str3 = null;
                        }
                        if (!TextUtils.isEmpty(str3)) {
                            str4 = TextUtils.isEmpty(str4) ? str4 + str3 : str4 + "," + str3;
                        }
                    }
                    str = str4;
                    str2 = optString;
                    j = currentTimeMillis;
                }
            }
            return null;
        }
        str2 = null;
        str = str4;
        j = 0;
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            AVMDLLog.m256407d("BatchParseHTTPDNSHosts", "parse result is null");
            return null;
        }
        AVMDLLog.m256407d("BatchParseHTTPDNSHosts", String.format("parse result host:%s ips:%s expiredT:%d", str2, str, Long.valueOf(j)));
        return new AVMDLDNSInfo(this.mHttpDNSType, str2, str, j, this.mId);
    }

    public void _handleResponse(JSONObject jSONObject, Error error) {
        AVMDLLog.m256407d("BatchParseHTTPDNSHosts", String.format("****http dns id:%s type:%d", this.mId, Integer.valueOf(this.mHttpDNSType)));
        if (error != null) {
            AVMDLLog.m256407d("BatchParseHTTPDNSHosts", String.format("handle response receive err:%s", error.errStr));
        } else if (jSONObject == null || jSONObject.length() == 0) {
            AVMDLLog.m256407d("BatchParseHTTPDNSHosts", String.format("json null err", new Object[0]));
        } else {
            try {
                parseResult(jSONObject);
            } catch (Throwable th) {
                AVMDLLog.m256407d("BatchParseHTTPDNSHosts", String.format("handle response exception:%s", th.toString()));
            }
            AVMDLLog.m256407d("BatchParseHTTPDNSHosts", String.format("****parse end", new Object[0]));
        }
    }

    public HTTPDNSHosts(String[] strArr, AVMDLNetClient aVMDLNetClient, int i, Handler handler) throws Exception {
        if (i != 2) {
            AVMDLLog.m256407d("BatchParseHTTPDNSHosts", "create fail type is not own");
            throw new Exception("type is not own");
        } else if (strArr == null || strArr.length == 0) {
            AVMDLLog.m256407d("BatchParseHTTPDNSHosts", "host array is valid");
            throw new Exception("host array is valid");
        } else {
            this.mHttpDNSType = i;
            this.mHostnames = strArr;
            this.mNetClient = aVMDLNetClient;
            if (aVMDLNetClient == null) {
                this.mNetClient = new AVMDLHTTPNetwork();
            }
            this.mHttpDNSType = i;
            this.mHandler = handler;
        }
    }
}
