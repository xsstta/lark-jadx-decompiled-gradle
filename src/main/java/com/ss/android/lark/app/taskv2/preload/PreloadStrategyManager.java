package com.ss.android.lark.app.taskv2.preload;

import android.app.Application;
import android.content.Context;
import com.larksuite.framework.launch.task.ILaunchTask;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.app.taskv2.preload.StartTimingDetector;
import com.ss.android.lark.app.taskv2.scheduler.AppLauncherTaskScheduler;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.biz.core.api.an;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.LarkContext;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class PreloadStrategyManager {

    /* renamed from: a */
    public Application f72804a;

    /* renamed from: b */
    public AppLauncherTaskScheduler f72805b = new AppLauncherTaskScheduler(null, new SerialScheduledExecutorService("launch_preload"), true);

    /* renamed from: c */
    private AtomicBoolean f72806c = new AtomicBoolean(false);

    /* renamed from: d */
    private AtomicBoolean f72807d = new AtomicBoolean(false);

    /* renamed from: e */
    private StartTimingDetector f72808e;

    /* renamed from: f */
    private an f72809f = new an() {
        /* class com.ss.android.lark.app.taskv2.preload.PreloadStrategyManager.C290542 */

        @Override // com.ss.android.lark.biz.core.api.an
        /* renamed from: a */
        public void mo103104a() {
        }

        @Override // com.ss.android.lark.biz.core.api.an
        /* renamed from: b */
        public void mo103105b() {
        }
    };

    /* renamed from: a */
    public void mo103095a() {
        StartTimingDetector startTimingDetector = this.f72808e;
        if (startTimingDetector != null) {
            startTimingDetector.mo103134b();
        }
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).unRegisterStoreStateListener(this.f72809f);
    }

    /* renamed from: a */
    public void mo103096a(Application application) {
        this.f72804a = application;
        StartTimingDetector startTimingDetector = new StartTimingDetector();
        this.f72808e = startTimingDetector;
        startTimingDetector.mo103130a(application, new StartTimingDetector.IStartTimingDetectorObserver() {
            /* class com.ss.android.lark.app.taskv2.preload.PreloadStrategyManager.C290531 */

            @Override // com.ss.android.lark.app.taskv2.preload.StartTimingDetector.IStartTimingDetectorObserver
            /* renamed from: a */
            public void mo103101a() {
                PreloadStrategyManager preloadStrategyManager = PreloadStrategyManager.this;
                preloadStrategyManager.mo103097a((Context) preloadStrategyManager.f72804a);
            }

            @Override // com.ss.android.lark.app.taskv2.preload.StartTimingDetector.IStartTimingDetectorObserver
            /* renamed from: a */
            public void mo103102a(int i) {
                PreloadStrategyManager preloadStrategyManager = PreloadStrategyManager.this;
                preloadStrategyManager.mo103098a(preloadStrategyManager.f72804a, i);
            }

            @Override // com.ss.android.lark.app.taskv2.preload.StartTimingDetector.IStartTimingDetectorObserver
            /* renamed from: a */
            public void mo103103a(String str, int i) {
                if (i == 1) {
                    PreloadStrategyManager.this.mo103099a(str, LarkContext.getApplication());
                }
            }
        });
    }

    /* renamed from: a */
    public void mo103097a(final Context context) {
        CoreThreadPool.getDefault().getScheduleThreadPool().schedule(new Runnable() {
            /* class com.ss.android.lark.app.taskv2.preload.PreloadStrategyManager.RunnableC290553 */

            public void run() {
                List<ILaunchTask> d = PreloadTasksFactory.m106845d();
                PreloadStrategyManager.this.mo103100a(d, false);
                for (ILaunchTask iLaunchTask : d) {
                    PreloadStrategyManager.this.f72805b.mo103151a(iLaunchTask);
                }
                PreloadStrategyManager.this.f72805b.mo103152a(context);
            }
        }, 500, TimeUnit.MILLISECONDS);
    }

    /* renamed from: a */
    public void mo103098a(final Context context, final int i) {
        CoreThreadPool.getDefault().getScheduleThreadPool().schedule(new Runnable() {
            /* class com.ss.android.lark.app.taskv2.preload.PreloadStrategyManager.RunnableC290564 */

            public void run() {
                ArrayList<ILaunchTask> arrayList = new ArrayList();
                PreloadStrategyManager preloadStrategyManager = PreloadStrategyManager.this;
                boolean z = true;
                if (i != 1) {
                    z = false;
                }
                preloadStrategyManager.mo103100a(arrayList, z);
                for (ILaunchTask iLaunchTask : arrayList) {
                    PreloadStrategyManager.this.f72805b.mo103151a(iLaunchTask);
                }
                PreloadStrategyManager.this.f72805b.mo103152a(context);
            }
        }, 500, TimeUnit.MILLISECONDS);
    }

    /* renamed from: a */
    public void mo103099a(final String str, final Context context) {
        CoreThreadPool.getDefault().getScheduleThreadPool().schedule(new Runnable() {
            /* class com.ss.android.lark.app.taskv2.preload.PreloadStrategyManager.RunnableC290575 */

            public void run() {
                ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).noticeFirstScreenEvent(str);
                List<ILaunchTask> c = PreloadTasksFactory.m106844c();
                PreloadStrategyManager.this.mo103100a(c, true);
                for (ILaunchTask iLaunchTask : c) {
                    PreloadStrategyManager.this.f72805b.mo103151a(iLaunchTask);
                }
                PreloadStrategyManager.this.f72805b.mo103152a(context);
            }
        }, 500, TimeUnit.MILLISECONDS);
    }

    /* renamed from: a */
    public void mo103100a(List<ILaunchTask> list, boolean z) {
        if (this.f72806c.compareAndSet(false, true)) {
            list.addAll(PreloadTasksFactory.m106843b());
        }
        if (z && this.f72807d.compareAndSet(false, true)) {
            list.addAll(PreloadTasksFactory.m106842a());
        }
    }
}
