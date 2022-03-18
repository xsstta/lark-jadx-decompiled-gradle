package com.ss.android.lark.appcenter.wrapper.impl.p1362a;

import android.content.Context;
import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.appcenter.common.util.C28184h;
import com.ss.android.appcenter.p1262a.p1263a.AbstractC27545j;
import com.ss.android.lark.appcenter.wrapper.AppCenterModule;
import com.ss.android.lark.appcenter.wrapper.dependency.IAppCenterModuleDependency;
import com.ss.android.lark.log.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.appcenter.wrapper.impl.a.k */
public class C29155k implements AbstractC27545j {

    /* renamed from: a */
    IAppCenterModuleDependency.AbstractC29135f f72973a = AppCenterModule.m107044a().getLoginDependency();

    /* renamed from: b */
    public Context f72974b;

    public C29155k(Context context) {
        this.f72974b = context;
    }

    @Override // com.ss.android.appcenter.p1262a.p1263a.AbstractC27545j
    /* renamed from: a */
    public void mo98203a(final String str) {
        String str2;
        if (!TextUtils.isEmpty(str)) {
            try {
                str2 = new JSONObject(str).getString("BotID");
            } catch (JSONException e) {
                e.printStackTrace();
                str2 = "";
            }
            if (!TextUtils.isEmpty(str2)) {
                AppCenterModule.m107044a().getOnCallDependency().mo103394a(this.f72973a.mo103389b(), str2, new IGetDataCallback<String>() {
                    /* class com.ss.android.lark.appcenter.wrapper.impl.p1362a.C29155k.C291561 */

                    /* renamed from: a */
                    public void onSuccess(String str) {
                        if (!TextUtils.isEmpty(str)) {
                            AppCenterModule.m107044a().getChatDependency().mo103373a(C29155k.this.f72974b, str);
                        }
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        C28184h.m103248b("RouterProvider", "err: " + errorResult.toString());
                    }
                });
            }
        }
    }

    @Override // com.ss.android.appcenter.p1262a.p1263a.AbstractC27545j
    /* renamed from: c */
    public void mo98206c(Context context, String str) {
        AppCenterModule.m107044a().startWebPageActivity(context, str, null, false, null, null);
    }

    @Override // com.ss.android.appcenter.p1262a.p1263a.AbstractC27545j
    /* renamed from: f */
    public void mo98209f(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            AppCenterModule.m107044a().enterBotChat(str);
        }
    }

    @Override // com.ss.android.appcenter.p1262a.p1263a.AbstractC27545j
    /* renamed from: b */
    public boolean mo98205b(Context context, String str) {
        if (!mo98204a(context, str)) {
            return false;
        }
        AppCenterModule.m107044a().openByAppLink(context, str);
        return true;
    }

    @Override // com.ss.android.appcenter.p1262a.p1263a.AbstractC27545j
    /* renamed from: d */
    public void mo98207d(Context context, String str) {
        IAppCenterModuleDependency.AbstractC29131b chatDependency;
        if (!TextUtils.isEmpty(str) && (chatDependency = AppCenterModule.m107044a().getChatDependency()) != null) {
            chatDependency.mo103374a(context, str, null);
        }
    }

    @Override // com.ss.android.appcenter.p1262a.p1263a.AbstractC27545j
    /* renamed from: e */
    public void mo98208e(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            IAppCenterModuleDependency.AbstractC29131b chatDependency = AppCenterModule.m107044a().getChatDependency();
            if (chatDependency != null) {
                chatDependency.mo103375b(context, str);
            } else {
                Log.m165383e("RouterProvider", "open chat activity chatModule null");
            }
        } else {
            Log.m165383e("RouterProvider", "open chat activity chatId null");
        }
    }

    @Override // com.ss.android.appcenter.p1262a.p1263a.AbstractC27545j
    /* renamed from: a */
    public boolean mo98204a(Context context, String str) {
        return AppCenterModule.m107044a().canOpenByAppLink(context, str);
    }

    @Override // com.ss.android.appcenter.p1262a.p1263a.AbstractC27545j
    /* renamed from: a */
    public void mo98200a(Context context, String str, int i) {
        AppCenterModule.m107044a().startMiniProgramActivity(context, str, i);
    }

    @Override // com.ss.android.appcenter.p1262a.p1263a.AbstractC27545j
    /* renamed from: a */
    public void mo98201a(Context context, String str, String str2) {
        IAppCenterModuleDependency.AbstractC29131b chatDependency;
        if (!TextUtils.isEmpty(str) && (chatDependency = AppCenterModule.m107044a().getChatDependency()) != null) {
            chatDependency.mo103374a(context, str, str2);
        }
    }

    @Override // com.ss.android.appcenter.p1262a.p1263a.AbstractC27545j
    /* renamed from: a */
    public void mo98202a(Context context, String str, String str2, boolean z, String str3, String str4) {
        AppCenterModule.m107044a().startWebPageActivity(context, str, str2, z, str3, str4);
    }
}
