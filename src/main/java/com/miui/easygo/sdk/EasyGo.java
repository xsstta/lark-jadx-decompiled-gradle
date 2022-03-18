package com.miui.easygo.sdk;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.huawei.easygo.BuildConfig;
import com.miui.easygo.callback.IEasyGoCallback;
import com.miui.easygo.manager.EasyGoManager;
import com.miui.easygo.sdk.module.EasyGoRet;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

public final class EasyGo {
    private EasyGoManager mEasyGoManager;

    public final void release() {
        EasyGoManager easyGoManager = this.mEasyGoManager;
        if (easyGoManager != null) {
            easyGoManager.release();
        }
    }

    private List<Integer> assembleInitFailRet(String[] strArr) {
        if (strArr == null) {
            return null;
        }
        return Collections.nCopies(strArr.length, 507);
    }

    public final List<Integer> init(String[] strArr) {
        EasyGoManager easyGoManager = this.mEasyGoManager;
        if (easyGoManager == null) {
            return assembleInitFailRet(strArr);
        }
        return easyGoManager.init(strArr);
    }

    public EasyGo(Context context) {
        if (getRomSupStatus(context) == 0) {
            this.mEasyGoManager = new EasyGoManager(context);
        }
        if (this.mEasyGoManager == null) {
            Log.d("EasyGo", "mEasyGoManager == null");
        }
    }

    private int getRomSupStatus(Context context) {
        try {
            return new EasyGoManager(context).getRomSupStatus(context, BuildConfig.VERSION_NAME);
        } catch (NoClassDefFoundError unused) {
            return 506;
        } catch (SecurityException unused2) {
            return 508;
        } catch (Exception unused3) {
            return 509;
        }
    }

    public final EasyGoRet invokeSync(String str, String str2, JSONObject jSONObject, Bundle bundle) {
        EasyGoManager easyGoManager = this.mEasyGoManager;
        if (easyGoManager == null) {
            return new EasyGoRet(507, new Bundle());
        }
        return easyGoManager.invokeSync(str, str2, jSONObject, bundle);
    }

    public final void invokeAsync(String str, String str2, JSONObject jSONObject, Bundle bundle, IEasyGoCallback iEasyGoCallback) {
        EasyGoManager easyGoManager = this.mEasyGoManager;
        if (easyGoManager != null) {
            easyGoManager.invokeAsync(str, str2, jSONObject, bundle, iEasyGoCallback);
        }
    }
}
