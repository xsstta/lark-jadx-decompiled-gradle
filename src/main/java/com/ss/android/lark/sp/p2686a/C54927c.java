package com.ss.android.lark.sp.p2686a;

import android.content.Context;
import com.ss.android.lark.p2909v.AbstractC57894a;
import com.ss.android.lark.p2909v.AbstractC57895b;
import com.ss.android.lark.sp.AbstractC54924a;
import com.ss.android.lark.sp.AbstractC54929b;
import com.tencent.mmkv.MMKV;

/* renamed from: com.ss.android.lark.sp.a.c */
public class C54927c implements AbstractC54929b {
    @Override // com.ss.android.lark.sp.AbstractC54929b
    /* renamed from: a */
    public AbstractC54924a mo187323a(Context context, String str, int i, AbstractC57895b bVar, AbstractC57894a aVar) {
        return new C54928d(MMKV.mmkvWithID(str, i), bVar);
    }
}
