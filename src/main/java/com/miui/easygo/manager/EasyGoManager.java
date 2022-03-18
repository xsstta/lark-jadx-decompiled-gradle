package com.miui.easygo.manager;

import android.content.Context;
import android.os.Bundle;
import com.miui.easygo.callback.IEasyGoCallback;
import com.miui.easygo.sdk.module.EasyGoRet;
import java.util.List;
import org.json.JSONObject;

public final class EasyGoManager {
    private Context mContext;

    private int initFunction(String str) {
        return 560;
    }

    public int getRomSupStatus(Context context, String str) {
        return 0;
    }

    public List<Integer> init(String[] strArr) {
        return null;
    }

    public void invokeAsync(String str, String str2, JSONObject jSONObject, Bundle bundle, IEasyGoCallback iEasyGoCallback) {
    }

    public EasyGoRet invokeSync(String str, String str2, JSONObject jSONObject, Bundle bundle) {
        return null;
    }

    public void release() {
    }

    public EasyGoManager(Context context) {
        if (this.mContext == null) {
            this.mContext = context;
        }
    }
}
