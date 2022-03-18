package androidx.versionedparcelable;

import android.os.Parcelable;
import androidx.collection.ArrayMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class VersionedParcel {

    /* renamed from: a */
    protected final ArrayMap<String, Method> f5466a;

    /* renamed from: b */
    protected final ArrayMap<String, Method> f5467b;

    /* renamed from: c */
    protected final ArrayMap<String, Class> f5468c;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo8071a(int i);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo8073a(Parcelable parcelable);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo8078a(CharSequence charSequence);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo8080a(String str);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo8082a(boolean z);

    /* renamed from: a */
    public void mo8084a(boolean z, boolean z2) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo8085a(byte[] bArr);

    /* renamed from: a */
    public boolean mo8087a() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo8093b();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo8094b(int i);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract VersionedParcel mo8097c();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo8098c(int i);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract int mo8099d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract String mo8100e();

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract byte[] mo8101f();

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract CharSequence mo8102g();

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract <T extends Parcelable> T mo8103h();

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract boolean mo8104i();

    /* renamed from: a */
    public void mo8083a(boolean z, int i) {
        mo8098c(i);
        mo8082a(z);
    }

    /* renamed from: a */
    public void mo8086a(byte[] bArr, int i) {
        mo8098c(i);
        mo8085a(bArr);
    }

    /* renamed from: a */
    public void mo8079a(CharSequence charSequence, int i) {
        mo8098c(i);
        mo8078a(charSequence);
    }

    /* renamed from: a */
    public void mo8081a(String str, int i) {
        mo8098c(i);
        mo8080a(str);
    }

    /* renamed from: b */
    public boolean mo8095b(boolean z, int i) {
        if (!mo8094b(i)) {
            return z;
        }
        return mo8104i();
    }

    /* renamed from: b */
    public byte[] mo8096b(byte[] bArr, int i) {
        if (!mo8094b(i)) {
            return bArr;
        }
        return mo8101f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public <T extends AbstractC1566b> T mo8105j() {
        String e = mo8100e();
        if (e == null) {
            return null;
        }
        return (T) mo8070a(e, mo8097c());
    }

    public static class ParcelException extends RuntimeException {
        public ParcelException(Throwable th) {
            super(th);
        }
    }

    /* renamed from: a */
    private Method m7148a(Class cls) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method method = this.f5467b.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class b = m7149b(cls);
        System.currentTimeMillis();
        Method declaredMethod = b.getDeclaredMethod("write", cls, VersionedParcel.class);
        this.f5467b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* renamed from: b */
    private Class m7149b(Class<? extends AbstractC1566b> cls) throws ClassNotFoundException {
        Class cls2 = this.f5468c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        this.f5468c.put(cls.getName(), cls3);
        return cls3;
    }

    /* renamed from: b */
    private Method m7150b(String str) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method method = this.f5466a.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, VersionedParcel.class.getClassLoader()).getDeclaredMethod("read", VersionedParcel.class);
        this.f5466a.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: androidx.versionedparcelable.VersionedParcel */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    private void m7151b(AbstractC1566b bVar) {
        try {
            mo8080a(m7149b((Class<? extends AbstractC1566b>) bVar.getClass()).getName());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(bVar.getClass().getSimpleName() + " does not have a Parcelizer", e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8075a(AbstractC1566b bVar) {
        if (bVar == null) {
            mo8080a((String) null);
            return;
        }
        m7151b(bVar);
        VersionedParcel c = mo8097c();
        mo8077a(bVar, c);
        c.mo8093b();
    }

    /* renamed from: a */
    public void mo8072a(int i, int i2) {
        mo8098c(i2);
        mo8071a(i);
    }

    /* renamed from: b */
    public int mo8088b(int i, int i2) {
        if (!mo8094b(i2)) {
            return i;
        }
        return mo8099d();
    }

    /* renamed from: a */
    public void mo8074a(Parcelable parcelable, int i) {
        mo8098c(i);
        mo8073a(parcelable);
    }

    /* renamed from: b */
    public <T extends Parcelable> T mo8089b(T t, int i) {
        return !mo8094b(i) ? t : (T) mo8103h();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public <T extends AbstractC1566b> T mo8070a(String str, VersionedParcel versionedParcel) {
        try {
            return (T) ((AbstractC1566b) m7150b(str).invoke(null, versionedParcel));
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    /* renamed from: a */
    public void mo8076a(AbstractC1566b bVar, int i) {
        mo8098c(i);
        mo8075a(bVar);
    }

    /* renamed from: b */
    public <T extends AbstractC1566b> T mo8090b(T t, int i) {
        return !mo8094b(i) ? t : (T) mo8105j();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public <T extends AbstractC1566b> void mo8077a(T t, VersionedParcel versionedParcel) {
        try {
            m7148a(t.getClass()).invoke(null, t, versionedParcel);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    /* renamed from: b */
    public CharSequence mo8091b(CharSequence charSequence, int i) {
        if (!mo8094b(i)) {
            return charSequence;
        }
        return mo8102g();
    }

    /* renamed from: b */
    public String mo8092b(String str, int i) {
        if (!mo8094b(i)) {
            return str;
        }
        return mo8100e();
    }

    public VersionedParcel(ArrayMap<String, Method> arrayMap, ArrayMap<String, Method> arrayMap2, ArrayMap<String, Class> arrayMap3) {
        this.f5466a = arrayMap;
        this.f5467b = arrayMap2;
        this.f5468c = arrayMap3;
    }
}
