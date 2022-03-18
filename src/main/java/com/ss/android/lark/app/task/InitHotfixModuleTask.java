package com.ss.android.lark.app.task;

import android.content.Context;
import com.larksuite.framework.launch.task.AsyncLaunchTask;
import com.larksuite.framework.utils.C26252ad;
import com.ss.android.lark.p2094l.C41114b;
import com.ss.android.lark.sdk.C53241h;

public class InitHotfixModuleTask extends AsyncLaunchTask {
    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        boolean b = C41114b.m163062b();
        C53241h.m205898b("InitHotfixModuleTask", "hotFixEnable = " + b);
        if (b) {
            boolean a = C41114b.m163061a();
            boolean b2 = C26252ad.m94993b(context);
            C53241h.m205898b("InitHotfixModuleTask", "inMainProcess = " + b2 + ", hotFixMultiProcessEnable = " + a);
            if (b2 || a) {
                C41114b.m163059a(context);
            }
        }
    }
}
