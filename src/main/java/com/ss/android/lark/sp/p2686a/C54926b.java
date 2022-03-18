package com.ss.android.lark.sp.p2686a;

import android.content.Context;
import android.content.SharedPreferences;
import com.ss.android.lark.p2909v.AbstractC57894a;
import com.ss.android.lark.p2909v.AbstractC57895b;
import com.ss.android.lark.sp.AbstractC54924a;
import com.ss.android.lark.sp.AbstractC54929b;
import com.ss.android.lark.util.share_preference.SharedPreferencesC57745b;

/* renamed from: com.ss.android.lark.sp.a.b */
public class C54926b implements AbstractC54929b {
    /* renamed from: a */
    private static SharedPreferences m212995a(Context context, String str, int i, AbstractC57894a aVar) {
        if (i == 0) {
            return context.getSharedPreferences(str, i);
        }
        return SharedPreferencesC57745b.m224109a();
    }

    @Override // com.ss.android.lark.sp.AbstractC54929b
    /* renamed from: a */
    public AbstractC54924a mo187323a(Context context, String str, int i, AbstractC57895b bVar, AbstractC57894a aVar) {
        return new C54925a(m212995a(context, str, i, aVar), bVar);
    }
}
