package com.ss.android.lark.app.task.base;

import com.larksuite.framework.launch.task.ILaunchTask;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;

public class TaskDependencyResolver {

    /* renamed from: a */
    private HashMap<Class<? extends ILaunchTask>, ILaunchTask> f72656a = new HashMap<>();

    /* renamed from: b */
    private HashMap<Class<? extends ILaunchTask>, ArrayList<ILaunchTask>> f72657b = new HashMap<>();

    /* renamed from: c */
    private TaskDependencyWrapper f72658c = new TaskDependencyWrapper();

    /* renamed from: b */
    public void mo102772b(ILaunchTask iLaunchTask) {
        this.f72658c.mo102774a(iLaunchTask);
    }

    /* access modifiers changed from: private */
    public class TaskDependencyWrapper {

        /* renamed from: b */
        private Map<Class<? extends ILaunchTask>, CountDownLatch> f72660b;

        private TaskDependencyWrapper() {
            this.f72660b = new ConcurrentHashMap();
        }

        /* renamed from: a */
        public void mo102775a(Class<? extends ILaunchTask> cls) {
            CountDownLatch countDownLatch = this.f72660b.get(cls);
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
        }

        /* renamed from: a */
        public void mo102774a(ILaunchTask iLaunchTask) {
            CountDownLatch countDownLatch = this.f72660b.get(iLaunchTask.getClass());
            if (countDownLatch != null) {
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused) {
                    Log.m165383e(iLaunchTask.mo92547e(), " await failed.");
                }
            }
        }

        /* renamed from: a */
        public void mo102776a(Class<? extends ILaunchTask> cls, int i) {
            CountDownLatch countDownLatch = this.f72660b.get(cls);
            if (countDownLatch == null) {
                countDownLatch = new CountDownLatch(i);
            } else {
                Log.m165383e("TaskDependencyResolver", "initTaskDependency: Repeated addition, task= " + cls);
            }
            this.f72660b.put(cls, countDownLatch);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: java.util.HashMap<java.lang.Class<? extends com.larksuite.framework.launch.task.ILaunchTask>, com.larksuite.framework.launch.task.ILaunchTask> */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: com.ss.android.lark.app.task.base.TaskDependencyResolver$TaskDependencyWrapper */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public void mo102773c(ILaunchTask iLaunchTask) {
        ArrayList<ILaunchTask> arrayList;
        synchronized (this) {
            this.f72656a.put(iLaunchTask.getClass(), iLaunchTask);
            arrayList = this.f72657b.get(iLaunchTask.getClass());
        }
        if (!CollectionUtils.isEmpty(arrayList)) {
            for (ILaunchTask iLaunchTask2 : arrayList) {
                this.f72658c.mo102775a((Class<? extends ILaunchTask>) iLaunchTask2.getClass());
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: com.ss.android.lark.app.task.base.TaskDependencyResolver$TaskDependencyWrapper */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: com.ss.android.lark.app.task.base.TaskDependencyResolver$TaskDependencyWrapper */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public void mo102771a(ILaunchTask iLaunchTask) {
        int i;
        int i2;
        List<Class<? extends ILaunchTask>> c = iLaunchTask.mo92545c();
        if (!CollectionUtils.isEmpty(c)) {
            this.f72658c.mo102776a(iLaunchTask.getClass(), c.size());
            synchronized (this) {
                i2 = 0;
                for (Class<? extends ILaunchTask> cls : c) {
                    if (this.f72657b.get(cls) == null) {
                        this.f72657b.put(cls, new ArrayList<>());
                    }
                    this.f72657b.get(cls).add(iLaunchTask);
                    if (this.f72656a.containsKey(cls)) {
                        i2++;
                    }
                }
            }
            for (i = 0; i < i2; i++) {
                this.f72658c.mo102775a((Class<? extends ILaunchTask>) iLaunchTask.getClass());
            }
        }
    }
}
