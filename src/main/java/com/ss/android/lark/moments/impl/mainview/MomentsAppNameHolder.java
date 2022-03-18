package com.ss.android.lark.moments.impl.mainview;

import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.maincore.dto.TabAppInfo;
import com.ss.android.lark.moments.dependency.MomentsDependencyHolder;
import com.ss.android.lark.utils.UIHelper;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0007J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/moments/impl/mainview/MomentsAppNameHolder;", "", "()V", "LOG_TAG", "", "tabInfo", "Lcom/ss/android/lark/maincore/dto/TabAppInfo;", "getTabName", "setTabInfo", "", "tabAppInfo", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.mainview.b */
public final class MomentsAppNameHolder {

    /* renamed from: a */
    public static final MomentsAppNameHolder f120253a = new MomentsAppNameHolder();

    /* renamed from: b */
    private static TabAppInfo f120254b;

    private MomentsAppNameHolder() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final String m188686a() {
        TabAppInfo.Name name;
        TabAppInfo.Name name2;
        boolean z;
        boolean z2;
        StringBuilder sb = new StringBuilder();
        sb.append("getTabName name=");
        TabAppInfo tabAppInfo = f120254b;
        String str = null;
        if (tabAppInfo != null) {
            name = tabAppInfo.getName();
        } else {
            name = null;
        }
        sb.append(name);
        Log.m165389i("MomentsAppNameHolder", sb.toString());
        TabAppInfo tabAppInfo2 = f120254b;
        if (tabAppInfo2 == null || (name2 = tabAppInfo2.getName()) == null) {
            String string = UIHelper.getString(R.string.Lark_Community_Moments);
            Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.str…g.Lark_Community_Moments)");
            return string;
        }
        String a = MomentsDependencyHolder.f118998b.mo165899a().languageDependency().mo144716a();
        Locale locale = Locale.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.getDefault()");
        if (a != null) {
            String lowerCase = a.toLowerCase(locale);
            Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            int hashCode = lowerCase.hashCode();
            if (hashCode != 3241) {
                if (hashCode != 3383) {
                    if (hashCode == 3886 && lowerCase.equals("zh")) {
                        str = name2.getCn();
                    }
                } else if (lowerCase.equals("ja")) {
                    str = name2.getJp();
                }
            } else if (lowerCase.equals("en")) {
                str = name2.getUs();
            }
            String str2 = str;
            boolean z3 = false;
            if (str2 == null || str2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return str;
            }
            String us = name2.getUs();
            if (us == null || us.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                String us2 = name2.getUs();
                Intrinsics.checkExpressionValueIsNotNull(us2, "tabName.us");
                return us2;
            }
            String cn = name2.getCn();
            if (cn == null || cn.length() == 0) {
                z3 = true;
            }
            if (!z3) {
                String cn2 = name2.getCn();
                Intrinsics.checkExpressionValueIsNotNull(cn2, "tabName.cn");
                return cn2;
            }
            String string2 = UIHelper.getString(R.string.Lark_Community_Moments);
            Intrinsics.checkExpressionValueIsNotNull(string2, "UIHelper.getString(R.str…g.Lark_Community_Moments)");
            return string2;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: a */
    public final void mo167375a(TabAppInfo tabAppInfo) {
        Intrinsics.checkParameterIsNotNull(tabAppInfo, "tabAppInfo");
        Log.m165389i("MomentsAppNameHolder", "setTabInfo name=" + tabAppInfo.getName());
        f120254b = tabAppInfo;
    }
}
