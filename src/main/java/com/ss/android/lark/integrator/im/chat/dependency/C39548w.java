package com.ss.android.lark.integrator.im.chat.dependency;

import android.app.Activity;
import android.content.Context;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.ss.android.lark.dependency.AbstractC36456ae;
import com.ss.android.lark.integrator.im.money.MoneyModuleProvider;
import com.ss.android.lark.mira.UIGetPluginCallback;
import com.ss.android.lark.money_export.IMoneyModule;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.lark.integrator.im.chat.dependency.w */
class C39548w implements AbstractC36456ae {
    C39548w() {
    }

    @Override // com.ss.android.lark.dependency.AbstractC36456ae
    /* renamed from: a */
    public String mo134423a() {
        return MoneyModuleProvider.m157726a();
    }

    @Override // com.ss.android.lark.dependency.AbstractC36456ae
    /* renamed from: a */
    public void mo134425a(final Context context) {
        MoneyModuleProvider.m157727a(new UIGetPluginCallback<IMoneyModule>() {
            /* class com.ss.android.lark.integrator.im.chat.dependency.C39548w.C395502 */

            @Override // com.larksuite.framework.callback.UIGetDataCallback
            public void onErrored(ErrorResult errorResult) {
            }

            /* renamed from: a */
            public void onSuccessed(IMoneyModule iMoneyModule) {
                iMoneyModule.openWallet(context);
            }
        });
    }

    @Override // com.ss.android.lark.dependency.AbstractC36456ae
    /* renamed from: a */
    public void mo134427a(final AbstractC36456ae.AbstractC36457a aVar) {
        MoneyModuleProvider.m157727a(new UIGetPluginCallback<IMoneyModule>() {
            /* class com.ss.android.lark.integrator.im.chat.dependency.C39548w.C395524 */

            @Override // com.ss.android.lark.mira.UIGetPluginCallback
            /* renamed from: a */
            public void mo143154a() {
                aVar.mo122737b();
            }

            @Override // com.larksuite.framework.callback.UIGetDataCallback
            public void onErrored(ErrorResult errorResult) {
                aVar.mo122736a(errorResult);
            }

            /* renamed from: a */
            public void onSuccessed(IMoneyModule iMoneyModule) {
                aVar.mo122735a();
            }
        });
    }

    @Override // com.ss.android.lark.dependency.AbstractC36456ae
    /* renamed from: a */
    public void mo134426a(final Context context, final String str, final boolean z, final int i, final String str2, final String str3) {
        final WeakReference weakReference = new WeakReference(context);
        MoneyModuleProvider.m157727a(new UIGetPluginCallback<IMoneyModule>() {
            /* class com.ss.android.lark.integrator.im.chat.dependency.C39548w.C395491 */

            @Override // com.larksuite.framework.callback.UIGetDataCallback
            public void onErrored(ErrorResult errorResult) {
            }

            /* renamed from: a */
            public void onSuccessed(IMoneyModule iMoneyModule) {
                if (weakReference.get() != null) {
                    iMoneyModule.createRedPacket(context, str, z, i, str2, str3);
                }
            }
        });
    }

    @Override // com.ss.android.lark.dependency.AbstractC36456ae
    /* renamed from: a */
    public void mo134424a(final Activity activity, final String str, final String str2, final boolean z, final boolean z2, final boolean z3, final boolean z4) {
        MoneyModuleProvider.m157727a(new UIGetPluginCallback<IMoneyModule>() {
            /* class com.ss.android.lark.integrator.im.chat.dependency.C39548w.C395513 */

            @Override // com.larksuite.framework.callback.UIGetDataCallback
            public void onErrored(ErrorResult errorResult) {
            }

            /* renamed from: a */
            public void onSuccessed(IMoneyModule iMoneyModule) {
                iMoneyModule.openRedPacket(activity, str, str2, z, z2, z3, z4);
            }
        });
    }
}
