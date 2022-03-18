package com.bytedance.push.third;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import android.util.Pair;
import com.bytedance.push.C20386c;
import com.bytedance.push.third.p891a.C20540a;
import com.bytedance.push.third.p891a.C20541b;
import com.bytedance.push.third.p891a.C20542c;
import com.bytedance.push.third.p891a.C20543d;
import com.bytedance.push.utils.C20552c;
import com.ss.android.message.AppProvider;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Set;
import org.json.JSONArray;

public class PushChannelHelper extends AbstractC20539a {
    private static volatile PushChannelHelper sPushChannelHelper;

    @Retention(RetentionPolicy.SOURCE)
    public @interface PushType {
    }

    @Override // com.bytedance.push.third.AbstractC20539a
    public int getTryRegisterChannelId() {
        return 6;
    }

    public boolean isDirectOpenActivitySender(int i) {
        return i == 10 || i == 16 || i == 7 || i == 11;
    }

    @Override // com.bytedance.push.third.AbstractC20539a
    public boolean isNeedUnzip(int i) {
        return i == 11;
    }

    public static boolean isAliYunPushAvailable() {
        initAllowPushSet();
        return false;
    }

    @Override // com.bytedance.push.third.AbstractC20539a
    public /* bridge */ /* synthetic */ JSONArray buildApplogHeader() {
        return super.buildApplogHeader();
    }

    @Override // com.bytedance.push.third.AbstractC20539a
    public /* bridge */ /* synthetic */ Set getChannels() {
        return super.getChannels();
    }

    public static boolean isHWPushAvailable() {
        return mAllowPushSet.contains(7);
    }

    public static boolean isMZPushAvailable() {
        initAllowPushSet();
        return mAllowPushSet.contains(8);
    }

    public static boolean isMiPushAvailable() {
        initAllowPushSet();
        return mAllowPushSet.contains(1);
    }

    public static boolean isMySelfPushAvailable() {
        initAllowPushSet();
        return mAllowPushSet.contains(2);
    }

    public static boolean isOpPushAvailable() {
        initAllowPushSet();
        return mAllowPushSet.contains(10);
    }

    public static boolean isUmPushAvailable() {
        initAllowPushSet();
        return mAllowPushSet.contains(6);
    }

    public static boolean isVivoPushAvailable() {
        initAllowPushSet();
        return mAllowPushSet.contains(11);
    }

    @Override // com.bytedance.push.third.AbstractC20539a
    public boolean requestOpNotificationPermission() {
        IPushAdapter adapterInstance = inst(AppProvider.getApp()).getAdapterInstance(10);
        if (adapterInstance != null) {
            try {
                return adapterInstance.requestNotificationPermission(10);
            } catch (Throwable th) {
                C20552c.m74850b("PushChannelHelper", "requestNotificationPermission error" + Log.getStackTraceString(th));
                return false;
            }
        } else {
            C20552c.m74850b("PushChannelHelper", "requestNotificationPermission can't find adapter for type:10");
            return false;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.push.third.AbstractC20539a
    public void initChannels() {
        if (this.mPushChannelMap.size() == 0) {
            Application app = AppProvider.getApp();
            this.mPushChannelMap.put(1, new C20546d(1, "com.xm.MiPushAdapter", "xm/MiPush", new C20542c(app)));
            this.mPushChannelMap.put(2, new C20546d(2, "com.bytedance.push.self.SelfPushAdapter", "SelfPush", new C20540a(app)));
            this.mPushChannelMap.put(6, new C20546d(6, "com.um.UmPushAdapter", "um", new C20541b()));
            this.mPushChannelMap.put(7, new C20546d(7, "com.hw.HWPushAdapter", "hw", new C20541b()));
            this.mPushChannelMap.put(8, new C20546d(8, "com.mz.MzPushAdapter", "mz", new C20542c(app)));
            this.mPushChannelMap.put(10, new C20546d(10, "com.coloros.OpPushAdapter", "op", new C20542c(app)));
            this.mPushChannelMap.put(11, new C20546d(11, "com.vv.VvPushAdapter", "vv", new C20540a(app)));
            this.mPushChannelMap.put(16, new C20546d(16, "com.smt.SmtPushAdapter", "SmtPush", new C20540a(app)));
            this.mPushChannelMap.put(5, new C20546d(5, "com.fcm.FcmPushAdapter", "fcm", new C20543d(AppProvider.getApp())));
            this.mPushChannelMap.put(14, new C20546d(14, "com.adm.push.AdmPushAdapter", "amazon", new C20540a(AppProvider.getApp())));
            this.mPushChannelMap.put(15, new C20546d(15, "com.bytedance.push.frontier.FrontierPushAdapter", "frontierPush", new C20540a(AppProvider.getApp())));
        }
    }

    @Override // com.bytedance.push.third.AbstractC20539a
    public /* bridge */ /* synthetic */ IPushAdapter getAdapterInstance(int i) {
        return super.getAdapterInstance(i);
    }

    @Override // com.bytedance.push.third.AbstractC20539a
    public /* bridge */ /* synthetic */ int getChannelId(String str) {
        return super.getChannelId(str);
    }

    @Override // com.bytedance.push.third.AbstractC20539a
    public /* bridge */ /* synthetic */ String getSenderNameById(int i) {
        return super.getSenderNameById(i);
    }

    @Override // com.bytedance.push.third.AbstractC20539a
    public /* bridge */ /* synthetic */ boolean hasSupportChannel(String str) {
        return super.hasSupportChannel(str);
    }

    @Override // com.bytedance.push.third.AbstractC20539a
    public /* bridge */ /* synthetic */ boolean isLocalSupportChannel(int i) {
        return super.isLocalSupportChannel(i);
    }

    private PushChannelHelper(Context context) {
        AppProvider.initApp((Application) context.getApplicationContext());
    }

    public static PushChannelHelper inst(Context context) {
        if (sPushChannelHelper == null) {
            synchronized (PushChannelHelper.class) {
                if (sPushChannelHelper == null) {
                    sPushChannelHelper = new PushChannelHelper(context);
                }
            }
        }
        return sPushChannelHelper;
    }

    @Override // com.bytedance.push.third.AbstractC20539a
    public Pair<String, String> getPushConfig(int i, C20386c cVar) {
        if (i == 1) {
            return cVar.f49796r.mo68788a();
        }
        if (i == 8) {
            return cVar.f49796r.mo68790b();
        }
        if (i == 10) {
            return cVar.f49796r.mo68791c();
        }
        return null;
    }
}
