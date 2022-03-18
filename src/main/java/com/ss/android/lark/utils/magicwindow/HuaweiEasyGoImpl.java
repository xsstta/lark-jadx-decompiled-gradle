package com.ss.android.lark.utils.magicwindow;

import android.content.Context;
import com.huawei.easygo.sdk.EasyGo;
import com.huawei.easygo.sdk.module.EasyGoRet;
import com.ss.android.lark.log.Log;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/utils/magicwindow/HuaweiEasyGoImpl;", "Lcom/ss/android/lark/utils/magicwindow/EasyGoWrapper;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "easyGo", "Lcom/huawei/easygo/sdk/EasyGo;", "getEasyGo", "()Lcom/huawei/easygo/sdk/EasyGo;", "setEasyGo", "(Lcom/huawei/easygo/sdk/EasyGo;)V", "init", "", "setLoginStatus", "value", "", "feature-shared-utils_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.utils.d.b */
public final class HuaweiEasyGoImpl implements EasyGoWrapper {

    /* renamed from: a */
    public EasyGo f142423a;

    @Override // com.ss.android.lark.utils.magicwindow.EasyGoWrapper
    /* renamed from: a */
    public void mo196169a() {
        String str;
        if (this.f142423a != null) {
            String[] strArr = {"magicwindow"};
            try {
                EasyGo easyGo = this.f142423a;
                if (easyGo == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("easyGo");
                }
                List<Integer> init = easyGo.init(strArr);
                StringBuilder sb = new StringBuilder();
                sb.append("huawei init EasyGo success, ");
                if (init != null) {
                    str = init.toString();
                } else {
                    str = null;
                }
                sb.append(str);
                Log.m165397w("Magic_Window", sb.toString());
            } catch (Throwable th) {
                Log.m165398w("Magic_Window", "huawei pad init EasyGo error", th);
            }
        } else {
            Log.m165397w("Magic_Window", "HuaweiEasyGoImpl#init, easyGo not init");
        }
    }

    public HuaweiEasyGoImpl(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        try {
            this.f142423a = new EasyGo(context);
        } catch (Throwable th) {
            Log.m165398w("Magic_Window", "HuaweiEasyGoImpl init error", th);
        }
    }

    @Override // com.ss.android.lark.utils.magicwindow.EasyGoWrapper
    /* renamed from: a */
    public void mo196170a(int i) {
        if (this.f142423a != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("@int:loginStatus", i);
                EasyGo easyGo = this.f142423a;
                if (easyGo == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("easyGo");
                }
                Integer num = null;
                EasyGoRet invokeSync = easyGo.invokeSync("magicwindow", "setLoginStatus", jSONObject, null);
                StringBuilder sb = new StringBuilder();
                sb.append("huawei setLoginStatus success, result is ");
                if (invokeSync != null) {
                    num = Integer.valueOf(invokeSync.code);
                }
                sb.append(num);
                Log.m165397w("Magic_Window", sb.toString());
            } catch (Throwable th) {
                Log.m165398w("Magic_Window", "huawei setLoginStatus error", th);
            }
        } else {
            Log.m165397w("Magic_Window", "HuaweiEasyGoImpl#setLoginStatus, easyGo not init");
        }
    }
}
