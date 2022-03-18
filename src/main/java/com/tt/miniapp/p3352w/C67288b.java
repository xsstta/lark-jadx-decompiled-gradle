package com.tt.miniapp.p3352w;

import com.tt.miniapp.p3352w.p3353a.AbstractC67287b;
import com.tt.miniapp.p3352w.p3353a.C67286a;
import com.tt.miniapp.p3352w.p3354b.C67294b;
import com.tt.miniapp.p3352w.p3354b.C67298d;
import com.tt.miniapphost.data.ContextSingletonInstance;
import com.tt.miniapphost.util.DebugUtil;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tt.miniapp.w.b */
public class C67288b {

    /* renamed from: a */
    private Map<Class, AbstractC67292a> f169833a;

    /* access modifiers changed from: private */
    /* renamed from: com.tt.miniapp.w.b$a */
    public interface AbstractC67292a {
        /* renamed from: a */
        AbstractC67285a mo233959a();
    }

    /* renamed from: a */
    public static C67288b m262152a() {
        return ContextSingletonInstance.getInstance().getServiceProvider();
    }

    public C67288b() {
        HashMap hashMap = new HashMap();
        this.f169833a = hashMap;
        hashMap.put(AbstractC67287b.class, new AbstractC67292a() {
            /* class com.tt.miniapp.p3352w.C67288b.C672891 */

            @Override // com.tt.miniapp.p3352w.C67288b.AbstractC67292a
            /* renamed from: a */
            public AbstractC67285a mo233959a() {
                return new C67286a();
            }
        });
        this.f169833a.put(C67298d.class, new AbstractC67292a() {
            /* class com.tt.miniapp.p3352w.C67288b.C672902 */

            /* renamed from: b */
            private C67298d f169836b = new C67298d();

            @Override // com.tt.miniapp.p3352w.C67288b.AbstractC67292a
            /* renamed from: a */
            public AbstractC67285a mo233959a() {
                return this.f169836b;
            }
        });
        this.f169833a.put(C67294b.class, new AbstractC67292a() {
            /* class com.tt.miniapp.p3352w.C67288b.C672913 */

            /* renamed from: b */
            private C67294b f169838b = new C67294b();

            @Override // com.tt.miniapp.p3352w.C67288b.AbstractC67292a
            /* renamed from: a */
            public AbstractC67285a mo233959a() {
                return this.f169838b;
            }
        });
    }

    /* renamed from: a */
    public <T extends AbstractC67285a> T mo233958a(Class<T> cls) {
        AbstractC67292a aVar = this.f169833a.get(cls);
        if (aVar != null) {
            return (T) aVar.mo233959a();
        }
        DebugUtil.outputError("ServiceProvider", cls + "没有对应的实现类");
        return null;
    }
}
