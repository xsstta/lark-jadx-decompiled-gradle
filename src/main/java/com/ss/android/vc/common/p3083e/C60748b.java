package com.ss.android.vc.common.p3083e;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.lark.p1786d.AbstractC36435f;

/* renamed from: com.ss.android.vc.common.e.b */
public class C60748b {
    /* renamed from: a */
    public static View m236068a(Context context, int i, ViewGroup viewGroup, boolean z) {
        return m236069a(context, i, viewGroup, z, context.getResources().getResourceEntryName(i));
    }

    /* renamed from: a */
    public static View m236069a(Context context, int i, ViewGroup viewGroup, boolean z, String str) {
        if (!(context instanceof AbstractC36435f)) {
            return LayoutInflater.from(context).inflate(i, viewGroup, z);
        }
        View a = ((AbstractC36435f) context).mo129674a().mo134294a(context, i, viewGroup, false);
        if (!z) {
            return a;
        }
        viewGroup.addView(a);
        return a;
    }
}
