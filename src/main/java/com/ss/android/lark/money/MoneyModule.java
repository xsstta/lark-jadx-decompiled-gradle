package com.ss.android.lark.money;

import android.app.Activity;
import android.content.Context;
import com.bytedance.i18n.claymore.ClaymoreImpl;
import com.bytedance.i18n.claymore.ClaymoreServiceLoader;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.money.p2364a.p2365a.C48022a;
import com.ss.android.lark.money.p2366b.C48023a;
import com.ss.android.lark.money.redpacket.p2369b.C48040d;
import com.ss.android.lark.money.redpacket.send.SendRedPacketActivity;
import com.ss.android.lark.money_export.IMoneyModule;
import com.ss.android.lark.money_export.IMoneyModuleDependency;
import java.util.Locale;

@ClaymoreImpl(IMoneyModule.class)
public class MoneyModule implements IMoneyModule {
    public static IMoneyModuleDependency getDependency() {
        return (IMoneyModuleDependency) ClaymoreServiceLoader.loadFirst(IMoneyModuleDependency.class);
    }

    @Override // com.ss.android.lark.money_export.IMoneyModule
    public void openWallet(Context context) {
        C48023a.m189561a().mo168194a(context);
    }

    @Override // com.ss.android.lark.money_export.IMoneyModule
    public void openLynxPage(Context context, String str) {
        C48023a.m189561a().mo168195a(context, str);
    }

    @Override // com.ss.android.lark.money_export.IMoneyModule
    public void openH5(final Context context, final String str) {
        C48040d.m189602a().mo168218a(new IGetDataCallback<String>() {
            /* class com.ss.android.lark.money.MoneyModule.C480211 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165397w("MoneyModule", "getPayToken: onError: " + errorResult);
            }

            /* renamed from: a */
            public void onSuccess(String str) {
                boolean z;
                Locale cacheLanguageSetting = MoneyModule.getDependency().getLanguageDependency().getCacheLanguageSetting();
                if (cacheLanguageSetting != null) {
                    z = Locale.CHINESE.getLanguage().equals(cacheLanguageSetting.getLanguage());
                } else {
                    z = true;
                }
                C48022a.m189559a(context, str, z, str);
            }
        });
    }

    @Override // com.ss.android.lark.money_export.IMoneyModule
    public void createRedPacket(Context context, String str, boolean z, int i, String str2, String str3) {
        context.startActivity(SendRedPacketActivity.m190109a(context, str, z, i, str2, str3));
    }

    @Override // com.ss.android.lark.money_export.IMoneyModule
    public void openRedPacket(Activity activity, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        C48023a.m189561a().mo168192a(activity, str, str2, z, z2, z3, z4);
    }
}
