package com.ss.sys.ces.out;

import android.content.Context;
import com.ss.sys.ces.utils.NetInterface;
import java.util.HashMap;

public interface ISdk {

    public interface reportCallback {
        void onError(String str);

        void onSuccess(String str);
    }

    void InitSelas();

    void SetRegionType(int i);

    boolean checkSign();

    String debugEntry(Context context, int i);

    byte[] encode(byte[] bArr);

    String onEvent();

    String pullSg();

    String pullVer(String str);

    void reportNow(String str);

    void reportNow(String str, reportCallback reportcallback);

    void setCustomInfo(HashMap<String, Object> hashMap);

    void setEfficientDebug(boolean z);

    void setInterface(NetInterface netInterface);

    void setNetwork(boolean z);

    void setParams(String str, String str2);

    void setParams(String str, String str2, boolean z);

    void setSession(String str);

    void setUrlInterface(int i, String str);
}
