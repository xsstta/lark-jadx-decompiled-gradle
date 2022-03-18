package com.bytedance.ee.bear.task;

import android.content.Context;
import com.bytedance.common.profilesdk.deximage.Deximage;
import com.bytedance.ee.log.C13479a;
import com.larksuite.framework.utils.C26284k;

public class SnapBoostTask extends BaseAsyncLaunchTask {
    @Override // com.bytedance.ee.bear.task.BaseAsyncLaunchTask, com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        super.mo43817a(context);
        try {
            Deximage.init(context, C26284k.m95186b(context));
            int commit = Deximage.createEditorBuidler().name("ccm_preload_class").classList("preloadclass.txt").build().commit();
            C13479a.m54764b("SnapBoostTask", "profile editor commit ret " + commit);
        } catch (Throwable th) {
            C13479a.m54759a("SnapBoostTask", "SnapBoostTask execute error!", th);
        }
    }
}
