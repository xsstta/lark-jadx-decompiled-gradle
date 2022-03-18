package com.google.firebase.encoders.p997a;

import android.util.Base64;
import android.util.JsonWriter;
import com.google.firebase.encoders.AbstractC22788c;
import com.google.firebase.encoders.AbstractC22789d;
import com.google.firebase.encoders.AbstractC22790e;
import com.google.firebase.encoders.AbstractC22791f;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.google.firebase.encoders.a.d */
public final class C22786d implements AbstractC22789d, AbstractC22791f {

    /* renamed from: a */
    private C22786d f56337a;

    /* renamed from: b */
    private boolean f56338b = true;

    /* renamed from: c */
    private final JsonWriter f56339c;

    /* renamed from: d */
    private final Map<Class<?>, AbstractC22788c<?>> f56340d;

    /* renamed from: e */
    private final Map<Class<?>, AbstractC22790e<?>> f56341e;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo79213a() throws IOException {
        m82784b();
        this.f56339c.flush();
    }

    /* renamed from: b */
    private void m82784b() throws IOException {
        if (this.f56338b) {
            C22786d dVar = this.f56337a;
            if (dVar != null) {
                dVar.m82784b();
                this.f56337a.f56338b = false;
                this.f56337a = null;
                this.f56339c.endObject();
                return;
            }
            return;
        }
        throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
    }

    /* renamed from: a */
    public C22786d mo79204a(int i) throws IOException, EncodingException {
        m82784b();
        this.f56339c.value((long) i);
        return this;
    }

    /* renamed from: b */
    public C22786d mo79211a(String str) throws IOException, EncodingException {
        m82784b();
        this.f56339c.value(str);
        return this;
    }

    /* renamed from: a */
    public C22786d mo79205a(long j) throws IOException, EncodingException {
        m82784b();
        this.f56339c.value(j);
        return this;
    }

    /* renamed from: a */
    public C22786d mo79207a(byte[] bArr) throws IOException, EncodingException {
        m82784b();
        if (bArr == null) {
            this.f56339c.nullValue();
        } else {
            this.f56339c.value(Base64.encodeToString(bArr, 2));
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C22786d mo79206a(Object obj) throws IOException, EncodingException {
        if (obj == null) {
            this.f56339c.nullValue();
            return this;
        } else if (obj instanceof Number) {
            this.f56339c.value((Number) obj);
            return this;
        } else {
            int i = 0;
            if (obj.getClass().isArray()) {
                if (obj instanceof byte[]) {
                    return mo79207a((byte[]) obj);
                }
                this.f56339c.beginArray();
                if (obj instanceof int[]) {
                    int[] iArr = (int[]) obj;
                    int length = iArr.length;
                    while (i < length) {
                        this.f56339c.value((long) iArr[i]);
                        i++;
                    }
                } else if (obj instanceof long[]) {
                    long[] jArr = (long[]) obj;
                    int length2 = jArr.length;
                    while (i < length2) {
                        mo79205a(jArr[i]);
                        i++;
                    }
                } else if (obj instanceof double[]) {
                    double[] dArr = (double[]) obj;
                    int length3 = dArr.length;
                    while (i < length3) {
                        this.f56339c.value(dArr[i]);
                        i++;
                    }
                } else if (obj instanceof boolean[]) {
                    boolean[] zArr = (boolean[]) obj;
                    int length4 = zArr.length;
                    while (i < length4) {
                        this.f56339c.value(zArr[i]);
                        i++;
                    }
                } else if (obj instanceof Number[]) {
                    Number[] numberArr = (Number[]) obj;
                    int length5 = numberArr.length;
                    while (i < length5) {
                        mo79206a(numberArr[i]);
                        i++;
                    }
                } else {
                    Object[] objArr = (Object[]) obj;
                    int length6 = objArr.length;
                    while (i < length6) {
                        mo79206a(objArr[i]);
                        i++;
                    }
                }
                this.f56339c.endArray();
                return this;
            } else if (obj instanceof Collection) {
                this.f56339c.beginArray();
                for (Object obj2 : (Collection) obj) {
                    mo79206a(obj2);
                }
                this.f56339c.endArray();
                return this;
            } else if (obj instanceof Map) {
                this.f56339c.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        mo79210a((String) key, entry.getValue());
                    } catch (ClassCastException e) {
                        throw new EncodingException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e);
                    }
                }
                this.f56339c.endObject();
                return this;
            } else {
                AbstractC22788c<?> cVar = this.f56340d.get(obj.getClass());
                if (cVar != null) {
                    this.f56339c.beginObject();
                    cVar.mo72519a(obj, this);
                    this.f56339c.endObject();
                    return this;
                }
                AbstractC22790e<?> eVar = this.f56341e.get(obj.getClass());
                if (eVar != null) {
                    eVar.mo72519a(obj, this);
                    return this;
                } else if (obj instanceof Enum) {
                    mo79211a(((Enum) obj).name());
                    return this;
                } else {
                    throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
                }
            }
        }
    }

    /* renamed from: b */
    public C22786d mo79212a(boolean z) throws IOException, EncodingException {
        m82784b();
        this.f56339c.value(z);
        return this;
    }

    /* renamed from: b */
    public C22786d mo79208a(String str, int i) throws IOException, EncodingException {
        m82784b();
        this.f56339c.name(str);
        return mo79204a(i);
    }

    /* renamed from: b */
    public C22786d mo79209a(String str, long j) throws IOException, EncodingException {
        m82784b();
        this.f56339c.name(str);
        return mo79205a(j);
    }

    /* renamed from: b */
    public C22786d mo79210a(String str, Object obj) throws IOException, EncodingException {
        m82784b();
        this.f56339c.name(str);
        if (obj != null) {
            return mo79206a(obj);
        }
        this.f56339c.nullValue();
        return this;
    }

    C22786d(Writer writer, Map<Class<?>, AbstractC22788c<?>> map, Map<Class<?>, AbstractC22790e<?>> map2) {
        this.f56339c = new JsonWriter(writer);
        this.f56340d = map;
        this.f56341e = map2;
    }
}
