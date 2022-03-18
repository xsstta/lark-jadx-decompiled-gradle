package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.util.concurrent.ThreadFactoryC21808b;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class bk {

    /* renamed from: a */
    private static final ExecutorService f52707a = new ThreadPoolExecutor(0, 4, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC21808b("GAC_Transform"));

    /* renamed from: a */
    public static ExecutorService m78473a() {
        return f52707a;
    }
}
