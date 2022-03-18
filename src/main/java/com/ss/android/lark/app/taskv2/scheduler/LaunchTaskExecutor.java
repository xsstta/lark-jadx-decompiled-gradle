package com.ss.android.lark.app.taskv2.scheduler;

import com.larksuite.framework.launch.task.ILaunchTask;
import java.util.concurrent.LinkedBlockingDeque;

public class LaunchTaskExecutor {

    /* renamed from: a */
    private boolean f72875a;

    /* renamed from: b */
    private LinkedBlockingDeque<TaskWrapper> f72876b;

    public interface IExecutor {
        /* renamed from: a */
        void mo103155a(ILaunchTask iLaunchTask);
    }

    /* access modifiers changed from: private */
    public static class InstanceHolder {

        /* renamed from: a */
        static LaunchTaskExecutor f72877a = new LaunchTaskExecutor();
    }

    /* renamed from: a */
    public static LaunchTaskExecutor m106910a() {
        return InstanceHolder.f72877a;
    }

    /* renamed from: b */
    public void mo103158b() {
        m106911d();
    }

    private LaunchTaskExecutor() {
        this.f72876b = new LinkedBlockingDeque<>();
    }

    /* renamed from: c */
    public void mo103159c() {
        this.f72875a = true;
        this.f72876b.add(new TaskWrapper(null, null));
    }

    /* renamed from: d */
    private void m106911d() {
        TaskWrapper taskWrapper = null;
        while (!this.f72875a) {
            try {
                taskWrapper = this.f72876b.take();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (!(taskWrapper == null || taskWrapper.f72878a == null)) {
                taskWrapper.f72879b.mo103155a(taskWrapper.f72878a);
            }
        }
    }

    public static final class TaskWrapper {

        /* renamed from: a */
        ILaunchTask f72878a;

        /* renamed from: b */
        IExecutor f72879b;

        public TaskWrapper(ILaunchTask iLaunchTask, IExecutor iExecutor) {
            this.f72878a = iLaunchTask;
            this.f72879b = iExecutor;
        }
    }

    /* renamed from: a */
    public void mo103157a(ILaunchTask iLaunchTask, IExecutor iExecutor) {
        synchronized (this) {
            this.f72876b.add(new TaskWrapper(iLaunchTask, iExecutor));
        }
    }
}
