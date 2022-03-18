package com.ss.android.lark.dependency;

import android.app.Activity;
import android.content.Context;
import android.preference.PreferenceManager;
import android.widget.AutoCompleteTextView;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.member_manage.export.p2253a.AbstractC44896a;
import java.util.List;

/* renamed from: com.ss.android.lark.dependency.u */
public interface AbstractC36507u {
    /* renamed from: a */
    int mo134710a();

    /* renamed from: a */
    int mo134711a(String str, boolean z, boolean z2);

    /* renamed from: a */
    void mo134712a(int i, String str, boolean z, AutoCompleteTextView autoCompleteTextView, PreferenceManager.OnActivityResultListener onActivityResultListener);

    /* renamed from: a */
    void mo134713a(Activity activity, C36516a aVar, String str, String str2, int i);

    /* renamed from: a */
    void mo134714a(Activity activity, String str, Boolean bool, int i);

    /* renamed from: a */
    void mo134715a(Context context, String str, List<String> list, int i, AbstractC44896a aVar);

    /* renamed from: a */
    void mo134716a(Context context, String str, List<String> list, boolean z, int i, AbstractC44896a aVar);

    /* renamed from: b */
    void mo134717b();
}
