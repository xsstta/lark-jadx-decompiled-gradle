package com.ss.android.lark.app.taskv2.preload;

import android.content.Context;
import android.os.Process;
import com.bytedance.common.jato.Jato;
import com.bytedance.common.jato.JatoListener;
import com.bytedance.common.jato.boost.CpusetManager;
import com.bytedance.common.jato.boost.ProcTidFetcher;
import com.larksuite.framework.launch.task.AsyncLaunchTask;

public class JatoRenderThreadTask extends AsyncLaunchTask {
    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: b */
    public int mo43824b() {
        return 10;
    }

    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        CpusetManager.preload();
        ProcTidFetcher.getTid(new ProcTidFetcher.IFetcher() {
            /* class com.ss.android.lark.app.taskv2.preload.JatoRenderThreadTask.C290511 */

            @Override // com.bytedance.common.jato.boost.ProcTidFetcher.IFetcher
            public void onError(Throwable th) {
                Jato.getListener().onErrorInfo("JatoRenderThreadTask: error when fetch RenderThread tid", th);
            }

            @Override // com.bytedance.common.jato.boost.ProcTidFetcher.IFetcher
            public void onFetch(int i) {
                try {
                    Jato.bindBigCore(i);
                    Jato.setPriority(i, -20);
                    JatoListener listener = Jato.getListener();
                    listener.onDebugInfo("JatoRenderThreadTask: success promote RenderThread priority to -20: " + i + " " + Process.getThreadPriority(i));
                } catch (Throwable th) {
                    Jato.getListener().onErrorInfo("JatoRenderThreadTask: error when promote RenderThread priority to -20", th);
                }
            }
        });
    }
}
