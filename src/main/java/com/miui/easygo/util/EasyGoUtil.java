package com.miui.easygo.util;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import com.miui.easygo.callback.IEasyGoCallback;

public final class EasyGoUtil extends FunctionUtil {
    public static int getRomSupStatus(Context context, String str) {
        if (!isDbSupport(context)) {
            Log.e("EasyGoUtil", "ErrorCode = 505");
            return 505;
        } else if (isLibSupprt(str)) {
            return 0;
        } else {
            Log.e("EasyGoUtil", "ErrorCode = 504");
            return 504;
        }
    }

    public static void callbackMsg(IEasyGoCallback iEasyGoCallback, int i, Bundle bundle) {
        if (iEasyGoCallback != null) {
            try {
                iEasyGoCallback.callback(i, bundle);
            } catch (RemoteException unused) {
                Log.e("EasyGoUtil", "ErrorCode = 523");
            }
        }
    }
}
