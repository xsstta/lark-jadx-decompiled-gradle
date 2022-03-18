package com.larksuite.framework.launch.scheduler;

import com.larksuite.framework.launch.task.ILaunchTask;
import com.larksuite.framework.launch.task.StartAnchorTask;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.larksuite.framework.launch.scheduler.j */
public class C26031j {

    /* renamed from: a */
    private static final Object f64430a = new Object();

    /* renamed from: b */
    private StartAnchorTask f64431b = new StartAnchorTask();

    /* renamed from: c */
    private Map<Class<?>, Set<Class<?>>> f64432c = new HashMap();

    /* renamed from: d */
    private Map<Class<?>, Set<Class<?>>> f64433d = new HashMap();

    /* renamed from: e */
    private List<ILaunchTask> f64434e;

    /* renamed from: f */
    private Map<Class<?>, Object> f64435f = new HashMap();

    /* renamed from: g */
    private Map<Class<?>, ILaunchTask> f64436g;

    public C26031j() {
        HashMap hashMap = new HashMap();
        this.f64436g = hashMap;
        hashMap.put(this.f64431b.getClass(), this.f64431b);
        this.f64434e = new ArrayList();
    }

    /* renamed from: a */
    public synchronized Set<ILaunchTask> mo92539a() {
        HashSet hashSet;
        hashSet = new HashSet();
        for (ILaunchTask iLaunchTask : this.f64436g.values()) {
            if (!iLaunchTask.mo92546d()) {
                hashSet.add(iLaunchTask);
            }
        }
        hashSet.remove(this.f64431b);
        return hashSet;
    }

    /* renamed from: b */
    public synchronized List<ILaunchTask> mo92542b() {
        ArrayList arrayList;
        if (C26030i.m94206a(this.f64434e)) {
            mo92543b(this.f64431b);
        }
        arrayList = new ArrayList(this.f64434e);
        this.f64434e.clear();
        return arrayList;
    }

    /* renamed from: a */
    public synchronized void mo92540a(ILaunchTask iLaunchTask) {
        mo92541a(iLaunchTask, iLaunchTask.mo92545c());
    }

    /* renamed from: b */
    public synchronized void mo92543b(ILaunchTask iLaunchTask) {
        this.f64435f.put(iLaunchTask.getClass(), f64430a);
        Set<Class<?>> remove = this.f64432c.remove(iLaunchTask.getClass());
        this.f64436g.remove(iLaunchTask.getClass());
        if (!C26030i.m94206a(remove)) {
            for (Class<?> cls : remove) {
                Set<Class<?>> set = this.f64433d.get(cls);
                if (!C26030i.m94206a(set)) {
                    set.remove(iLaunchTask.getClass());
                }
                ILaunchTask iLaunchTask2 = this.f64436g.get(cls);
                if (C26030i.m94206a(set) && iLaunchTask2 != null) {
                    this.f64434e.add(iLaunchTask2);
                }
            }
        }
    }

    /* renamed from: a */
    private void m94207a(Class<?> cls, Class<?> cls2) {
        m94208b(cls, cls2);
        m94209c(cls2, cls);
    }

    /* renamed from: b */
    private void m94208b(Class<?> cls, Class<?> cls2) {
        Set<Class<?>> set = this.f64432c.get(cls);
        if (set == null) {
            set = new HashSet<>();
            this.f64432c.put(cls, set);
        }
        set.add(cls2);
    }

    /* renamed from: c */
    private void m94209c(Class<?> cls, Class<?> cls2) {
        Set<Class<?>> set = this.f64433d.get(cls);
        if (set == null) {
            set = new HashSet<>();
            this.f64433d.put(cls, set);
        }
        set.add(cls2);
    }

    /* renamed from: a */
    public synchronized void mo92541a(ILaunchTask iLaunchTask, List<Class<? extends ILaunchTask>> list) {
        this.f64436g.put(iLaunchTask.getClass(), iLaunchTask);
        m94207a(this.f64431b.getClass(), iLaunchTask.getClass());
        if (!C26030i.m94206a(list)) {
            for (Class<? extends ILaunchTask> cls : list) {
                if (!this.f64435f.containsKey(cls)) {
                    m94207a(cls, iLaunchTask.getClass());
                }
            }
        }
    }
}
