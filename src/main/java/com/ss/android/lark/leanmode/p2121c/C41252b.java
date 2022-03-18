package com.ss.android.lark.leanmode.p2121c;

import com.ss.android.lark.leanmode.C41267h;
import com.ss.android.lark.leanmode.dto.C41262a;
import com.ss.android.lark.leanmode.dto.LeanMode;
import com.ss.android.lark.leanmode.impl.C41271a;
import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.lark.leanmode.c.b */
public class C41252b {

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.leanmode.c.b$a */
    public static final class C41254a {

        /* renamed from: a */
        public static final C41252b f105024a = new C41252b();
    }

    private C41252b() {
    }

    /* renamed from: a */
    public static C41252b m163563a() {
        return C41254a.f105024a;
    }

    /* renamed from: a */
    public void mo148609a(C41262a aVar) {
        if (aVar == null) {
            Log.m165383e("LeanModeCleanDataManager", "clean called. cleanData is null.");
        } else if (C41267h.m163598a().mo143881g()) {
            Log.m165383e("LeanModeCleanDataManager", "clean called. enter doze.");
        } else {
            Log.m165389i("LeanModeCleanDataManager", "clean called. CleanLevel is " + aVar.mo148645a() + "，timeLimit:" + aVar.mo148648b());
            LeanMode c = C41271a.m163643j().mo148684c();
            if (c == null || !c.isDeviceInLeanMode()) {
                Log.m165383e("LeanModeCleanDataManager", "clean called. leanMode is null or isn't in leanMode.");
            } else if (aVar.mo148649c()) {
                C41267h.m163598a().mo143872a(aVar);
            }
        }
    }
}
