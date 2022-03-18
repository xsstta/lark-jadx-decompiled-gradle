package com.ss.android.lark.upgrade.p2894b;

import android.content.Context;
import android.text.TextUtils;
import com.larksuite.framework.utils.C26246a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.upgrade.C57607a;
import com.ss.android.lark.upgrade.statistics.UpgradeHitPoint;
import com.ss.android.lark.util.share_preference.C57744a;
import com.ss.android.lark.utils.PackageChannelManager;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.lark.upgrade.b.a */
public class C57620a {

    /* renamed from: a */
    private Context f141979a;

    /* renamed from: b */
    private Map<String, Boolean> f141980b;

    /* renamed from: c */
    private boolean f141981c;

    /* renamed from: d */
    private String f141982d;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.upgrade.b.a$a */
    public static class C57622a {

        /* renamed from: a */
        public static final C57620a f141983a = new C57620a();
    }

    /* renamed from: a */
    public static C57620a m223723a() {
        return C57622a.f141983a;
    }

    /* renamed from: b */
    public void mo195612b() {
        if (mo195611a(null)) {
            m223724c();
        }
    }

    private C57620a() {
        this.f141980b = new ConcurrentHashMap();
        this.f141979a = C57607a.m223662a().mo177704a();
    }

    /* renamed from: c */
    private void m223724c() {
        if (!this.f141981c) {
            this.f141981c = true;
            String string = C57744a.m224104a().getString("sp.key.last.channel");
            UpgradeHitPoint.f141994a.mo195628a(this.f141982d, string);
            Log.m165379d("InstallManager", "lastVersionName : " + this.f141982d);
            Log.m165379d("InstallManager", "lastChannel : " + string);
            C57744a.m224104a().putString("sp.key.last.channel", PackageChannelManager.getBuildPackageChannel(this.f141979a));
        }
    }

    /* renamed from: a */
    public boolean mo195611a(String str) {
        String str2 = "sp.key.last.version.name.";
        if (!TextUtils.isEmpty(str)) {
            str2 = str2 + str;
        }
        if (this.f141980b.containsKey(str2)) {
            boolean booleanValue = this.f141980b.get(str2).booleanValue();
            Log.m165379d("InstallManager", str2 + " : " + booleanValue);
            return booleanValue;
        }
        String a = C26246a.m94977a(this.f141979a);
        String string = C57744a.m224104a().getString(str2);
        this.f141982d = string;
        boolean z = !TextUtils.equals(a, string);
        this.f141980b.put(str2, Boolean.valueOf(z));
        C57744a.m224104a().putString(str2, a);
        Log.m165379d("InstallManager", str2 + " : " + z);
        return z;
    }
}
