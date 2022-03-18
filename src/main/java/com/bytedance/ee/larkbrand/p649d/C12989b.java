package com.bytedance.ee.larkbrand.p649d;

import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.bytedance.ee.larkbrand.abtest.C12956a;
import com.bytedance.ee.larkbrand.nativeMoudule.C13149b;
import com.bytedance.ee.ref.impl.host.HostExtensionManager;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.larkbrand.d.b */
public class C12989b {

    /* renamed from: a */
    public boolean f34592a;

    /* renamed from: b */
    public String f34593b;

    /* renamed from: c */
    public List<C13149b.C13153a> f34594c;

    /* renamed from: d */
    private LarkExtensionManager f34595d;

    /* renamed from: e */
    private C12956a f34596e;

    /* renamed from: f */
    private HostExtensionManager f34597f;

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.larkbrand.d.b$a */
    public static class C12991a {

        /* renamed from: a */
        static C12989b f34598a = new C12989b();
    }

    /* renamed from: a */
    public static C12989b m53447a() {
        return C12991a.f34598a;
    }

    private C12989b() {
        this.f34594c = new ArrayList();
    }

    /* renamed from: b */
    public LarkExtensionManager mo48912b() {
        if (this.f34595d == null) {
            synchronized (LarkExtensionManager.class) {
                if (this.f34595d == null) {
                    this.f34595d = new LarkExtensionManager();
                }
            }
        }
        return this.f34595d;
    }

    /* renamed from: c */
    public C12956a mo48913c() {
        if (this.f34596e == null) {
            synchronized (C12956a.class) {
                if (this.f34596e == null) {
                    this.f34596e = new C12956a();
                }
            }
        }
        return this.f34596e;
    }

    /* renamed from: d */
    public HostExtensionManager mo48914d() {
        if (this.f34597f == null) {
            synchronized (HostExtensionManager.class) {
                if (this.f34597f == null) {
                    this.f34597f = new HostExtensionManager();
                }
            }
        }
        return this.f34597f;
    }
}
