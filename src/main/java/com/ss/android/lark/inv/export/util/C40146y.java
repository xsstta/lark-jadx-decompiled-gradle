package com.ss.android.lark.inv.export.util;

import com.larksuite.framework.thread.CoreThreadPool;

/* renamed from: com.ss.android.lark.inv.export.util.y */
public class C40146y {
    /* renamed from: a */
    public static void m159159a(Runnable runnable) {
        CoreThreadPool.getDefault().getCachedThreadPool().execute(runnable);
    }
}
