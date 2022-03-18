package com.ss.android.lark.app.taskv2.scheduler;

import com.bytedance.common.utility.collection.CollectionUtils;
import com.larksuite.framework.launch.task.ILaunchTask;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TaskDependencyResolver {

    /* renamed from: a */
    private static final Object f72880a = new Object();

    /* renamed from: b */
    private StartAnchorTask f72881b = new StartAnchorTask();

    /* renamed from: c */
    private Map<Class<?>, Set<Class<?>>> f72882c = new HashMap();

    /* renamed from: d */
    private Map<Class<?>, Set<Class<?>>> f72883d = new HashMap();

    /* renamed from: e */
    private List<ILaunchTask> f72884e;

    /* renamed from: f */
    private Map<Class<?>, Object> f72885f = new HashMap();

    /* renamed from: g */
    private Map<Class<?>, ILaunchTask> f72886g;

    /* renamed from: a */
    public synchronized List<ILaunchTask> mo103160a() {
        ArrayList arrayList;
        if (CollectionUtils.isEmpty(this.f72884e)) {
            mo103163b(this.f72881b);
        }
        arrayList = new ArrayList(this.f72884e);
        this.f72884e.clear();
        return arrayList;
    }

    public TaskDependencyResolver() {
        HashMap hashMap = new HashMap();
        this.f72886g = hashMap;
        hashMap.put(this.f72881b.getClass(), this.f72881b);
        this.f72884e = new ArrayList();
    }

    /* renamed from: a */
    public synchronized void mo103161a(ILaunchTask iLaunchTask) {
        mo103162a(iLaunchTask, iLaunchTask.mo92545c());
    }

    /* renamed from: b */
    public synchronized void mo103163b(ILaunchTask iLaunchTask) {
        this.f72885f.put(iLaunchTask.getClass(), f72880a);
        Set<Class<?>> remove = this.f72882c.remove(iLaunchTask.getClass());
        this.f72886g.remove(iLaunchTask.getClass());
        if (!CollectionUtils.isEmpty(remove)) {
            for (Class<?> cls : remove) {
                Set<Class<?>> set = this.f72883d.get(cls);
                if (!CollectionUtils.isEmpty(set)) {
                    set.remove(iLaunchTask.getClass());
                }
                ILaunchTask iLaunchTask2 = this.f72886g.get(cls);
                if (CollectionUtils.isEmpty(set) && iLaunchTask2 != null) {
                    this.f72884e.add(iLaunchTask2);
                }
            }
        }
    }

    /* renamed from: a */
    private void m106917a(Class<?> cls, Class<?> cls2) {
        m106918b(cls, cls2);
        m106919c(cls2, cls);
    }

    /* renamed from: b */
    private void m106918b(Class<?> cls, Class<?> cls2) {
        Set<Class<?>> set = this.f72882c.get(cls);
        if (set == null) {
            set = new HashSet<>();
            this.f72882c.put(cls, set);
        }
        set.add(cls2);
    }

    /* renamed from: c */
    private void m106919c(Class<?> cls, Class<?> cls2) {
        Set<Class<?>> set = this.f72883d.get(cls);
        if (set == null) {
            set = new HashSet<>();
            this.f72883d.put(cls, set);
        }
        set.add(cls2);
    }

    /* renamed from: a */
    public synchronized void mo103162a(ILaunchTask iLaunchTask, List<Class<? extends ILaunchTask>> list) {
        this.f72886g.put(iLaunchTask.getClass(), iLaunchTask);
        m106917a(this.f72881b.getClass(), iLaunchTask.getClass());
        if (!CollectionUtils.isEmpty(list)) {
            for (Class<? extends ILaunchTask> cls : list) {
                if (!this.f72885f.containsKey(cls)) {
                    m106917a(cls, iLaunchTask.getClass());
                }
            }
        }
    }
}
