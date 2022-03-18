package com.huawei.easygo.sdk;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.huawei.easygo.BuildConfig;
import com.huawei.easygo.callback.IEasyGoCallback;
import com.huawei.easygo.manager.EasyGoManager;
import com.huawei.easygo.sdk.module.EasyGoRet;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

public final class EasyGo {
    private EasyGoManager mEasyGoManager;

    public void release() {
        EasyGoManager easyGoManager = this.mEasyGoManager;
        if (easyGoManager == null) {
            Log.e("EasyGo", "Release failed, manager is null.");
        } else {
            easyGoManager.release();
        }
    }

    public EasyGo(Context context) {
        if (getRomSupStatus(context) == 0) {
            Log.i("EasyGo", "New EasyGo success.");
            this.mEasyGoManager = new EasyGoManager(context);
            return;
        }
        Log.e("EasyGo", "New EasyGo failed, ShareLib not exit Or DB not support.");
    }

    private List<Integer> assembleInitFailRet(String[] strArr) {
        if (strArr != null) {
            return Collections.nCopies(strArr.length, 507);
        }
        Log.e("EasyGo", "assembleInitFailRet, functions is null.");
        return null;
    }

    public List<Integer> init(String[] strArr) {
        EasyGoManager easyGoManager = this.mEasyGoManager;
        if (easyGoManager != null) {
            return easyGoManager.init(strArr);
        }
        Log.e("EasyGo", "Init failed, manager is null.");
        return assembleInitFailRet(strArr);
    }

    private int getRomSupStatus(Context context) {
        try {
            return new EasyGoManager(context).getRomSupStatus(context, BuildConfig.VERSION_NAME);
        } catch (NoClassDefFoundError unused) {
            Log.e("EasyGo", "NoClassDefFoundError, ErrCode = 506");
            return 506;
        } catch (SecurityException unused2) {
            Log.e("EasyGo", "SecurityException, ErrCode = 508");
            return 508;
        } catch (Exception unused3) {
            Log.e("EasyGo", "OtherException, ErrCode = 509");
            return 509;
        }
    }

    public EasyGoRet invokeSync(String str, String str2, JSONObject jSONObject, Bundle bundle) {
        EasyGoManager easyGoManager = this.mEasyGoManager;
        if (easyGoManager != null) {
            return new EasyGoRet(easyGoManager.invokeSync(str, str2, jSONObject, bundle));
        }
        Log.e("EasyGo", "Invoke failed, manager is null.");
        return new EasyGoRet(507, new Bundle());
    }

    public void invokeAsync(String str, String str2, JSONObject jSONObject, Bundle bundle, IEasyGoCallback iEasyGoCallback) {
        EasyGoManager easyGoManager = this.mEasyGoManager;
        if (easyGoManager == null) {
            Log.e("EasyGo", "Invoke failed, manager is null.");
        } else {
            easyGoManager.invokeAsync(str, str2, jSONObject, bundle, iEasyGoCallback);
        }
    }
}
