package com.ss.android.lark.app.taskv2.preload;

import android.content.Context;
import com.bytedance.common.jato.Jato;
import com.bytedance.common.jato.JatoListener;
import com.larksuite.framework.launch.task.AbstractLaunchTask;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.biz.im.api.IIMApi;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57852m;

public class JatoTask extends AbstractLaunchTask {
    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        Jato.init(context, C57852m.m224554a(context), new JatoListener() {
            /* class com.ss.android.lark.app.taskv2.preload.JatoTask.C290521 */

            @Override // com.bytedance.common.jato.JatoListener
            public void onDebugInfo(String str) {
                Log.m165389i("JatoTask", "onDebugInfo:" + str);
            }

            @Override // com.bytedance.common.jato.JatoListener
            public void onErrorInfo(String str, Throwable th) {
                Log.m165384e("JatoTask", str, th);
            }
        }, CoreThreadPool.getDefault().newSerialIODensityThreadPool("jato-work"));
        if (C37239a.m146648b().mo136951a("lark.android.jato.gc_blocker")) {
            Jato.requestBlockGc(2500);
        }
        Jato.shrinkVM();
        Jato.initScheduler(-71);
        if (((IIMApi) ApiUtils.getApi(IIMApi.class)).isEnableJatoBoost()) {
            Jato.preloadBoostInfo();
        }
    }
}
