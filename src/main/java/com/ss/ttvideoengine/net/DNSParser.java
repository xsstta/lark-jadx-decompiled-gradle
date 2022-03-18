package com.ss.ttvideoengine.net;

import android.content.Context;
import android.os.SystemClock;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.net.IPCache;
import com.ss.ttvideoengine.utils.Error;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONObject;

public class DNSParser extends BaseDNS implements DNSCompletionListener {
    private boolean hasRecAndExpired;
    private long mClearTime;
    private Context mContext;
    private BaseDNS mCurrentDNS;
    private int mDNSCount;
    private JSONObject mDnsInfo;
    private long mDnsTime;
    private int mExpiredTime = SmEvents.EVENT_NW;
    private boolean mForceReparse;
    private IPCache mIPCache;
    private boolean mIPFromCache;
    private boolean mIPFromServer;
    private int mIndex;
    private int[] mParserIndex;
    private boolean mUseDNSCache;
    private boolean mUseServerDNS;

    @Override // com.ss.ttvideoengine.net.DNSCompletionListener
    public void onCancelled() {
    }

    @Override // com.ss.ttvideoengine.net.DNSCompletionListener
    public void onRetry(Error error) {
    }

    public void setForceReparse() {
        this.mForceReparse = true;
    }

    public boolean getIsUseDNSCache() {
        return this.mUseDNSCache;
    }

    public boolean getIsUseServerDNS() {
        return this.mUseServerDNS;
    }

    @Override // com.ss.ttvideoengine.net.BaseDNS
    public void cancel() {
        if (!this.mCancelled) {
            this.mCancelled = true;
            BaseDNS baseDNS = this.mCurrentDNS;
            if (baseDNS != null) {
                baseDNS.cancel();
            }
        }
    }

    private void DNSParseAsync() {
        int i = this.mParserIndex[this.mIndex];
        if (i == 0) {
            this.mCurrentDNS = new LocalDNS(this.mHostname);
        } else if (i == 1) {
            this.mCurrentDNS = new HTTPDNS(this.mHostname, this.mNetClient, 1);
        } else if (i == 2) {
            this.mCurrentDNS = new HTTPDNS(this.mHostname, this.mNetClient, 2);
        }
        BaseDNS baseDNS = this.mCurrentDNS;
        if (baseDNS != null) {
            baseDNS.setCompletionListener(this);
            this.mCurrentDNS.start();
        }
    }

    public String getTypeStr() {
        if (this.mIPFromCache) {
            return "FromCache";
        }
        if (this.mIPFromServer) {
            return "FromServer";
        }
        int i = this.mParserIndex[this.mIndex];
        if (i == 0) {
            return "local";
        }
        if (i == 1) {
            return "HTTP AL";
        }
        if (i != 2) {
            return "";
        }
        return "TT_HTTP";
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a7  */
    @Override // com.ss.ttvideoengine.net.BaseDNS
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void start() {
        /*
        // Method dump skipped, instructions count: 329
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.net.DNSParser.start():void");
    }

    public void setDNSExpiredTimeInS(int i) {
        this.mExpiredTime = i;
    }

    public void setIsUseDNSCache(boolean z) {
        this.mUseDNSCache = z;
    }

    public void setIsUseServerDNS(boolean z) {
        this.mUseServerDNS = z;
    }

    public void setDnsInfo(JSONObject jSONObject, Long l) {
        this.mDnsInfo = jSONObject;
        this.mDnsTime = l.longValue();
    }

    private void recordIPInfo(JSONObject jSONObject, long j) {
        if (this.mIPCache != null) {
            IPCache.IpInfo ipInfo = new IPCache.IpInfo();
            ipInfo.ip_json = jSONObject;
            ipInfo.ip_expiretime = SystemClock.elapsedRealtime() + (j * 1000);
            this.mIPCache.put(this.mHostname, ipInfo);
        }
    }

    @Override // com.ss.ttvideoengine.net.DNSCompletionListener
    public void onCompletion(JSONObject jSONObject, Error error) {
        if (this.mCancelled) {
            if (!this.hasRecAndExpired || this.mForceReparse) {
                notifyCancelled();
            }
        } else if (error == null) {
            JSONArray jSONArray = null;
            if (jSONObject != null) {
                jSONArray = jSONObject.optJSONArray("ips");
            }
            if (jSONArray == null || jSONArray.length() == 0) {
                if (this.mParserIndex[this.mIndex] == 0) {
                    notifyError(new Error("kTTVideoErrorDomainLocalDNS", -9997, "dns result empty,type:" + this.mParserIndex[this.mIndex]));
                } else {
                    notifyError(new Error("kTTVideoErrorDomainHTTPDNS", -9997, "dns result empty,type:" + this.mParserIndex[this.mIndex]));
                }
                TTVideoEngineLog.m256500d("DNSParser", "ips empty");
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("ip", jSONArray.optString(0));
            } catch (Exception unused) {
            }
            long optLong = jSONObject.optLong("ttl");
            if (optLong == 0) {
                optLong = (long) this.mExpiredTime;
            }
            recordIPInfo(jSONObject2, optLong);
            if (!this.hasRecAndExpired || this.mForceReparse) {
                try {
                    jSONObject2.put("time", jSONObject.optLong("time"));
                    jSONObject2.put("dns_type", jSONObject.optString("dns_type"));
                } catch (Exception e) {
                    TTVideoEngineLog.m256500d("DNSParser", e.toString());
                }
                notifySuccess(jSONObject2);
            }
        } else if (this.mIndex != this.mDNSCount - 1) {
            if (!this.hasRecAndExpired || this.mForceReparse) {
                notifyRetry(error);
            }
            this.mIndex++;
            start();
        } else if (!this.hasRecAndExpired || this.mForceReparse) {
            notifyError(error);
        }
    }

    public DNSParser(Context context, String str, TTVNetClient tTVNetClient) {
        super(str, tTVNetClient);
        int[] iArr = {0, 2};
        this.mParserIndex = iArr;
        this.mContext = context;
        this.mDNSCount = iArr.length;
        int[] dNSType = TTVideoEngine.getDNSType();
        if (dNSType != null && dNSType.length > 0) {
            for (int i = 0; i < dNSType.length; i++) {
                int i2 = dNSType[i];
                if (i2 != 0) {
                    if (i2 == 1) {
                        this.mParserIndex[i] = 2;
                    } else if (i2 != 2) {
                    }
                }
                this.mParserIndex[i] = dNSType[i];
            }
        } else if (TTVideoEngine.isHttpDnsFirst()) {
            int[] iArr2 = this.mParserIndex;
            iArr2[0] = 2;
            iArr2[1] = 0;
        }
        TTVideoEngineLog.m256505i("DNSParser", "DNSType:" + Arrays.toString(this.mParserIndex));
        this.mIPCache = IPCache.getInstance();
    }
}
