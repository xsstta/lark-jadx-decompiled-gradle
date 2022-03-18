package com.ss.android.lark.app.task;

import android.content.Context;
import com.larksuite.framework.launch.task.AsyncLaunchTask;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.platform.network.ttnet.C51880f;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57765ac;
import com.ss.android.lark.utils.C57824f;

public class UpdateUserAgentTask extends AsyncLaunchTask {
    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: b */
    public int mo43824b() {
        return 10;
    }

    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        ICoreApi iCoreApi = (ICoreApi) ApiUtils.getApi(ICoreApi.class);
        if (C57765ac.m224188b(context) && !C57824f.m224467b()) {
            C57824f.m224462a(context, false);
        } else if (C57765ac.m224187a(context)) {
            C57824f.m224462a(context, true);
        } else if (C57765ac.m224188b(context) && iCoreApi.isUsingTTWebView() && C37239a.m146648b().mo136952a("lark.browser.user.agent.refresh", false)) {
            CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable(context) {
                /* class com.ss.android.lark.app.task.$$Lambda$UpdateUserAgentTask$asLXahi6N0mI8DQ27k2J5Mvi2Lc */
                public final /* synthetic */ Context f$0;

                {
                    this.f$0 = r1;
                }

                /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
                    java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1
                    	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
                    	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
                    	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
                    	at java.base/java.util.Objects.checkIndex(Objects.java:372)
                    	at java.base/java.util.ArrayList.get(ArrayList.java:459)
                    	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
                    	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
                    	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
                    	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
                    	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
                    */
                public final void run() {
                    /*
                        r1 = this;
                        android.content.Context r0 = r1.f$0
                        com.ss.android.lark.app.task.UpdateUserAgentTask.lambda$asLXahi6N0mI8DQ27k2J5Mvi2Lc(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.app.task.$$Lambda$UpdateUserAgentTask$asLXahi6N0mI8DQ27k2J5Mvi2Lc.run():void");
                }
            });
        }
        if (iCoreApi.isUsingTTWebView() && C37239a.m146648b().mo136952a("lark.browser.user.cookie.inject", false)) {
            iCoreApi.syncMainDomainSessionCookie();
        }
        if (iCoreApi.isUsingTTWebView()) {
            C51880f.m201211b(context);
        }
    }
}
