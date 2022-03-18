package com.google.android.gms.location;

import android.content.Context;
import com.google.android.gms.common.api.C21611a;
import com.google.android.gms.common.api.C21628c;
import com.google.android.gms.common.api.internal.C21644a;
import com.google.android.gms.common.internal.C21752k;
import com.google.android.gms.tasks.Task;

/* renamed from: com.google.android.gms.location.i */
public class C21954i extends C21628c<Object> {
    public C21954i(Context context) {
        super(context, C21949e.f53431a, (C21611a.AbstractC21615d) null, new C21644a());
    }

    /* renamed from: a */
    public Task<C21951f> mo74358a(LocationSettingsRequest locationSettingsRequest) {
        return C21752k.m79001a(C21949e.f53434d.mo74048a(mo73254g(), locationSettingsRequest), new C21951f());
    }
}
