package com.ss.android.lark.applink;

import com.ss.android.lark.appsetting.api.SettingManager;
import com.ss.android.lark.log.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R$\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0007\u0010\u0002\u001a\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/applink/AppLinkSetting;", "", "()V", "TAG", "", "hostAllowedList", "", "hostAllowedList$annotations", "getHostAllowedList", "()Ljava/util/List;", "pathList", "", "getAllowedPathList", "lib_applink_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.applink.d */
public final class AppLinkSetting {

    /* renamed from: a */
    public static final AppLinkSetting f73067a = new AppLinkSetting();

    /* renamed from: b */
    private static Set<String> f73068b;

    /* renamed from: c */
    private static final List<String> f73069c;

    private AppLinkSetting() {
    }

    /* renamed from: a */
    public static final List<String> m107338a() {
        return f73069c;
    }

    static {
        List<String> list;
        AppLinkHostSetting appLinkHostSetting = (AppLinkHostSetting) SettingManager.getInstance().get(AppLinkHostSetting.class);
        if (appLinkHostSetting != null) {
            list = appLinkHostSetting.mo103445a();
        } else {
            list = null;
        }
        f73069c = list;
    }

    @JvmStatic
    /* renamed from: b */
    public static final Set<String> m107339b() {
        List<String> a;
        Set<String> set = f73068b;
        if (set != null) {
            return set;
        }
        AppLinkPathSetting appLinkPathSetting = (AppLinkPathSetting) SettingManager.getInstance().get(AppLinkPathSetting.class);
        if (appLinkPathSetting == null || (a = appLinkPathSetting.mo103446a()) == null) {
            Log.m165383e("AppLinkSetting", "getPath null");
        } else {
            HashSet hashSet = new HashSet();
            Iterator<T> it = a.iterator();
            while (it.hasNext()) {
                hashSet.add(it.next());
            }
            f73068b = hashSet;
        }
        return f73068b;
    }
}
