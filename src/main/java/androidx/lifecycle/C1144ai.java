package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* renamed from: androidx.lifecycle.ai */
public class C1144ai {

    /* renamed from: a */
    private final AbstractC1146b f4260a;

    /* renamed from: b */
    private final ak f4261b;

    /* renamed from: androidx.lifecycle.ai$b */
    public interface AbstractC1146b {
        <T extends AbstractC1142af> T create(Class<T> cls);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.lifecycle.ai$c */
    public static abstract class AbstractC1147c extends C1149e implements AbstractC1146b {
        /* renamed from: a */
        public abstract <T extends AbstractC1142af> T mo5972a(String str, Class<T> cls);

        AbstractC1147c() {
        }

        @Override // androidx.lifecycle.C1144ai.AbstractC1146b
        public <T extends AbstractC1142af> T create(Class<T> cls) {
            throw new UnsupportedOperationException("create(String, Class<?>) must be called on implementaions of KeyedFactory");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.lifecycle.ai$e */
    public static class C1149e {
        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo5974a(AbstractC1142af afVar) {
        }

        C1149e() {
        }
    }

    /* renamed from: androidx.lifecycle.ai$d */
    public static class C1148d implements AbstractC1146b {

        /* renamed from: a */
        private static C1148d f4264a;

        /* renamed from: a */
        static C1148d m5362a() {
            if (f4264a == null) {
                f4264a = new C1148d();
            }
            return f4264a;
        }

        @Override // androidx.lifecycle.C1144ai.AbstractC1146b
        public <T extends AbstractC1142af> T create(Class<T> cls) {
            try {
                return cls.newInstance();
            } catch (InstantiationException e) {
                throw new RuntimeException("Cannot create an instance of " + cls, e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Cannot create an instance of " + cls, e2);
            }
        }
    }

    /* renamed from: androidx.lifecycle.ai$a */
    public static class C1145a extends C1148d {

        /* renamed from: a */
        private static C1145a f4262a;

        /* renamed from: b */
        private Application f4263b;

        public C1145a(Application application) {
            this.f4263b = application;
        }

        /* renamed from: a */
        public static C1145a m5360a(Application application) {
            if (f4262a == null) {
                f4262a = new C1145a(application);
            }
            return f4262a;
        }

        @Override // androidx.lifecycle.C1144ai.C1148d, androidx.lifecycle.C1144ai.AbstractC1146b
        public <T extends AbstractC1142af> T create(Class<T> cls) {
            if (!C1150b.class.isAssignableFrom(cls)) {
                return (T) super.create(cls);
            }
            try {
                return cls.getConstructor(Application.class).newInstance(this.f4263b);
            } catch (NoSuchMethodException e) {
                throw new RuntimeException("Cannot create an instance of " + cls, e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Cannot create an instance of " + cls, e2);
            } catch (InstantiationException e3) {
                throw new RuntimeException("Cannot create an instance of " + cls, e3);
            } catch (InvocationTargetException e4) {
                throw new RuntimeException("Cannot create an instance of " + cls, e4);
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1144ai(androidx.lifecycle.ViewModelStoreOwner r3) {
        /*
            r2 = this;
            androidx.lifecycle.ak r0 = r3.getViewModelStore()
            boolean r1 = r3 instanceof androidx.lifecycle.HasDefaultViewModelProviderFactory
            if (r1 == 0) goto L_0x000f
            androidx.lifecycle.HasDefaultViewModelProviderFactory r3 = (androidx.lifecycle.HasDefaultViewModelProviderFactory) r3
            androidx.lifecycle.ai$b r3 = r3.getDefaultViewModelProviderFactory()
            goto L_0x0013
        L_0x000f:
            androidx.lifecycle.ai$d r3 = androidx.lifecycle.C1144ai.C1148d.m5362a()
        L_0x0013:
            r2.<init>(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C1144ai.<init>(androidx.lifecycle.ViewModelStoreOwner):void");
    }

    /* renamed from: a */
    public <T extends AbstractC1142af> T mo6005a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) mo6006a("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public C1144ai(ViewModelStoreOwner viewModelStoreOwner, AbstractC1146b bVar) {
        this(viewModelStoreOwner.getViewModelStore(), bVar);
    }

    public C1144ai(ak akVar, AbstractC1146b bVar) {
        this.f4260a = bVar;
        this.f4261b = akVar;
    }

    /* renamed from: a */
    public <T extends AbstractC1142af> T mo6006a(String str, Class<T> cls) {
        T t = (T) this.f4261b.mo6007a(str);
        if (cls.isInstance(t)) {
            AbstractC1146b bVar = this.f4260a;
            if (bVar instanceof C1149e) {
                ((C1149e) bVar).mo5974a(t);
            }
            return t;
        }
        AbstractC1146b bVar2 = this.f4260a;
        T t2 = bVar2 instanceof AbstractC1147c ? (T) ((AbstractC1147c) bVar2).mo5972a(str, cls) : (T) bVar2.create(cls);
        this.f4261b.mo6009a(str, t2);
        return t2;
    }
}
