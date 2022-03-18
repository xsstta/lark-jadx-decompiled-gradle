package com.bytedance.morpheus;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.common.utility.Logger;
import com.bytedance.morpheus.core.AbstractC20209b;
import com.bytedance.morpheus.core.C20208a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.bytedance.morpheus.e */
public class C20211e {

    /* renamed from: b */
    private static volatile C20211e f49361b;

    /* renamed from: a */
    public final List<AbstractC20209b> f49362a = new CopyOnWriteArrayList();

    /* renamed from: c */
    private Handler f49363c = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    private final Map<String, C20208a> f49364d = new HashMap();

    /* renamed from: b */
    public Map<String, C20208a> mo68399b() {
        return this.f49364d;
    }

    private C20211e() {
    }

    /* renamed from: a */
    public static C20211e m73772a() {
        if (f49361b == null) {
            synchronized (C20211e.class) {
                if (f49361b == null) {
                    f49361b = new C20211e();
                }
            }
        }
        return f49361b;
    }

    /* renamed from: a */
    public void mo68397a(AbstractC20209b bVar) {
        this.f49362a.add(bVar);
    }

    /* renamed from: b */
    public void mo68400b(AbstractC20209b bVar) {
        this.f49362a.remove(bVar);
    }

    /* renamed from: b */
    private void m73773b(final C20208a aVar) {
        this.f49363c.post(new Runnable() {
            /* class com.bytedance.morpheus.C20211e.RunnableC202121 */

            public void run() {
                for (AbstractC20209b bVar : C20211e.this.f49362a) {
                    bVar.mo68394a(aVar);
                }
            }
        });
    }

    /* renamed from: a */
    public C20208a mo68395a(String str) {
        return this.f49364d.get(str);
    }

    /* renamed from: a */
    public void mo68398a(Map<String, C20208a> map) {
        this.f49364d.putAll(map);
    }

    /* renamed from: a */
    public void mo68396a(C20208a aVar) {
        if (aVar == null || aVar.mo68382b() == null) {
            Logger.m15170e("Morpheus", "modifyState ERROR: newState is null or newState.packageName is null.");
            return;
        }
        synchronized (this.f49364d) {
            C20208a aVar2 = this.f49364d.get(aVar.mo68382b());
            if (aVar2 != null) {
                aVar2.mo68378a(aVar.mo68385c());
                aVar2.mo68383b(aVar.mo68387d());
                aVar2.mo68386c(aVar.mo68390g());
                aVar2.mo68381a(aVar.mo68392i());
                aVar2.mo68380a(aVar.mo68391h());
                aVar2.mo68384b(aVar.mo68389f());
                aVar2.mo68379a(aVar.mo68388e());
                m73773b(aVar2);
            }
        }
    }
}
