package com.bytedance.crash.runtime;

import com.bytedance.crash.C3686a;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.ICrashCallback;
import com.bytedance.crash.IOOMCallback;
import com.bytedance.crash.util.ListMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.bytedance.crash.runtime.c */
public class C3846c {

    /* renamed from: a */
    private final ListMap<CrashType, ICrashCallback> f11813a = new ListMap<>();

    /* renamed from: b */
    private final ListMap<CrashType, C3686a> f11814b = new ListMap<>();

    /* renamed from: c */
    private final List<IOOMCallback> f11815c = new CopyOnWriteArrayList();

    /* renamed from: d */
    private final List<IOOMCallback> f11816d = new CopyOnWriteArrayList();

    /* renamed from: a */
    public List<IOOMCallback> mo15438a() {
        return this.f11815c;
    }

    /* renamed from: b */
    public List<IOOMCallback> mo15443b() {
        return this.f11816d;
    }

    /* renamed from: c */
    public List<ICrashCallback> mo15446c() {
        return this.f11813a.getList(CrashType.LAUNCH);
    }

    /* renamed from: d */
    public List<ICrashCallback> mo15448d() {
        return this.f11813a.getList(CrashType.JAVA);
    }

    /* renamed from: e */
    public List<ICrashCallback> mo15450e() {
        return this.f11813a.getList(CrashType.NATIVE);
    }

    /* renamed from: f */
    public List<ICrashCallback> mo15451f() {
        return this.f11813a.getList(CrashType.ANR);
    }

    /* renamed from: a */
    public List<C3686a> mo15439a(CrashType crashType) {
        return this.f11814b.getList(crashType);
    }

    /* renamed from: b */
    public void mo15445b(IOOMCallback iOOMCallback) {
        this.f11815c.remove(iOOMCallback);
    }

    /* renamed from: c */
    public void mo15447c(IOOMCallback iOOMCallback) {
        this.f11816d.add(iOOMCallback);
    }

    /* renamed from: d */
    public void mo15449d(IOOMCallback iOOMCallback) {
        this.f11816d.remove(iOOMCallback);
    }

    /* renamed from: a */
    public void mo15441a(IOOMCallback iOOMCallback) {
        this.f11815c.add(iOOMCallback);
    }

    /* renamed from: b */
    public void mo15444b(ICrashCallback iCrashCallback, CrashType crashType) {
        if (crashType == CrashType.ALL) {
            this.f11813a.removeAll(iCrashCallback);
        } else {
            this.f11813a.removeInList(crashType, iCrashCallback);
        }
    }

    /* renamed from: a */
    public void mo15440a(ICrashCallback iCrashCallback, CrashType crashType) {
        if (crashType == CrashType.ALL) {
            this.f11813a.addMulti(iCrashCallback, CrashType.NATIVE, CrashType.ANR, CrashType.JAVA, CrashType.LAUNCH);
            return;
        }
        this.f11813a.add(crashType, iCrashCallback);
    }

    /* renamed from: a */
    public void mo15442a(C3686a aVar, CrashType crashType) {
        if (crashType == CrashType.ALL) {
            this.f11814b.addMulti(aVar, CrashType.NATIVE, CrashType.ANR, CrashType.JAVA, CrashType.LAUNCH);
            return;
        }
        this.f11814b.add(crashType, aVar);
    }
}
