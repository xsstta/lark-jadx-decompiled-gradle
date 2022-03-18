package com.bytedance.article.common.monitor.stack;

import com.bytedance.apm.internal.ApmDelegate;
import com.bytedance.apm.p153n.C3047b;
import java.util.LinkedList;

/* renamed from: com.bytedance.article.common.monitor.stack.a */
public class C3472a {

    /* renamed from: a */
    public final LinkedList<C3480f> f10995a = new LinkedList<>();

    /* renamed from: b */
    private volatile boolean f10996b = false;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo13918a() {
        if (!this.f10996b) {
            if (ApmDelegate.m12591a().mo12794g()) {
                this.f10996b = true;
            }
            C3047b.m12756a().mo12890b(new Runnable() {
                /* class com.bytedance.article.common.monitor.stack.C3472a.RunnableC34731 */

                public void run() {
                    try {
                        if (ApmDelegate.m12591a().mo12794g()) {
                            LinkedList linkedList = new LinkedList();
                            synchronized (C3472a.this.f10995a) {
                                linkedList.addAll(C3472a.this.f10995a);
                                C3472a.this.f10995a.clear();
                            }
                            while (!linkedList.isEmpty()) {
                                C3480f fVar = (C3480f) linkedList.poll();
                                if (fVar != null) {
                                    C3475c.m14705a().mo13922a(fVar.f11010a, fVar.f11011b, null, false);
                                }
                            }
                        }
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo13919a(String str, String str2) {
        if (!this.f10996b) {
            synchronized (this.f10995a) {
                if (this.f10995a.size() > 40) {
                    this.f10995a.poll();
                }
                this.f10995a.add(new C3480f(str, str2));
            }
        }
    }
}
