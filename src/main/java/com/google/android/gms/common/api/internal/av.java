package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.util.concurrent.ThreadFactoryC21808b;
import com.google.android.gms.internal.base.C21906e;
import java.util.concurrent.ExecutorService;

public final class av {

    /* renamed from: a */
    private static final ExecutorService f52689a = C21906e.m79216a().mo74010a(2, new ThreadFactoryC21808b("GAC_Executor"), 9);

    /* renamed from: a */
    public static ExecutorService m78440a() {
        return f52689a;
    }
}
