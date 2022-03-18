package com.ss.android.lark.leanmode.p2121c;

import android.content.Context;
import com.ss.android.lark.leanmode.AbstractC41264f;
import com.ss.android.lark.leanmode.ui.close.CloseLeanModeActivity;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.lark.leanmode.c.c */
public class C41255c {

    /* renamed from: a */
    private Map<String, AbstractC41264f> f105025a;

    /* renamed from: com.ss.android.lark.leanmode.c.c$a */
    private static final class C41257a {

        /* renamed from: a */
        public static final C41255c f105026a = new C41255c();
    }

    /* renamed from: a */
    public static C41255c m163565a() {
        return C41257a.f105026a;
    }

    private C41255c() {
        this.f105025a = new HashMap();
    }

    /* renamed from: a */
    public void mo148611a(String str) {
        if (this.f105025a.containsKey(str)) {
            this.f105025a.remove(str);
        }
    }

    /* renamed from: a */
    public void mo148612a(String str, boolean z) {
        AbstractC41264f fVar;
        if (this.f105025a.containsKey(str) && (fVar = this.f105025a.get(str)) != null) {
            fVar.handleResult(z);
            this.f105025a.remove(str);
        }
    }

    /* renamed from: a */
    public void mo148610a(Context context, String str, String str2, AbstractC41264f fVar) {
        if (fVar != null) {
            this.f105025a.put(str2, fVar);
        }
        CloseLeanModeActivity.m163685a(context, str, str2);
    }
}
