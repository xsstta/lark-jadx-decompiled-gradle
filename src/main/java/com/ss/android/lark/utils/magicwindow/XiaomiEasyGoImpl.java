package com.ss.android.lark.utils.magicwindow;

import android.content.Context;
import com.miui.easygo.sdk.EasyGo;
import com.miui.easygo.sdk.module.EasyGoRet;
import com.ss.android.lark.log.Log;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/utils/magicwindow/XiaomiEasyGoImpl;", "Lcom/ss/android/lark/utils/magicwindow/EasyGoWrapper;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "easyGo", "Lcom/miui/easygo/sdk/EasyGo;", "getEasyGo", "()Lcom/miui/easygo/sdk/EasyGo;", "setEasyGo", "(Lcom/miui/easygo/sdk/EasyGo;)V", "init", "", "setLoginStatus", "value", "", "feature-shared-utils_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.utils.d.c */
public final class XiaomiEasyGoImpl implements EasyGoWrapper {

    /* renamed from: a */
    public EasyGo f142424a;

    @Override // com.ss.android.lark.utils.magicwindow.EasyGoWrapper
    /* renamed from: a */
    public void mo196169a() {
        String str;
        if (this.f142424a != null) {
            String[] strArr = {"magicwindow"};
            try {
                EasyGo easyGo = this.f142424a;
                if (easyGo == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("easyGo");
                }
                List<Integer> init = easyGo.init(strArr);
                StringBuilder sb = new StringBuilder();
                sb.append("xiaomi init EasyGo success, ");
                String str2 = null;
                if (init != null) {
                    str = init.toString();
                } else {
                    str = null;
                }
                sb.append(str);
                Log.m165389i("Magic_Window", sb.toString());
                if (init != null && init.size() == 1 && init.get(0).intValue() == 0) {
                    Log.m165397w("Magic_Window", "connectServer success");
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("connectServer error, init result=");
                if (init != null) {
                    str2 = init.toString();
                }
                sb2.append(str2);
                Log.m165397w("Magic_Window", sb2.toString());
            } catch (Throwable th) {
                Log.m165398w("Magic_Window", "xiaomi init EasyGo error", th);
            }
        } else {
            Log.m165389i("Magic_Window", "XiaomiEasyGoImpl#init, easyGo not init");
        }
    }

    public XiaomiEasyGoImpl(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        try {
            this.f142424a = new EasyGo(context);
        } catch (Throwable th) {
            Log.m165398w("Magic_Window", "XiaomiEasyGoImpl init error", th);
        }
    }

    @Override // com.ss.android.lark.utils.magicwindow.EasyGoWrapper
    /* renamed from: a */
    public void mo196170a(int i) {
        if (this.f142424a != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("@int:loginStatus", i);
                EasyGo easyGo = this.f142424a;
                if (easyGo == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("easyGo");
                }
                Integer num = null;
                EasyGoRet invokeSync = easyGo.invokeSync("magicwindow", "setLoginStatus", jSONObject, null);
                StringBuilder sb = new StringBuilder();
                sb.append("xiaomi setLoginStatus success, result is ");
                if (invokeSync != null) {
                    num = Integer.valueOf(invokeSync.code);
                }
                sb.append(num);
                Log.m165389i("Magic_Window", sb.toString());
                if (i == 1) {
                    Log.m165389i("Magic_Window", "syncLoginStatus(), login success");
                } else {
                    Log.m165397w("Magic_Window", "syncLoginStatus(), login failed");
                }
            } catch (Throwable th) {
                Log.m165398w("Magic_Window", "xiaomi setLoginStatus error", th);
            }
        } else {
            Log.m165389i("Magic_Window", "XiaomiEasyGoImpl#setLoginStatus, easyGo not init");
        }
    }
}
