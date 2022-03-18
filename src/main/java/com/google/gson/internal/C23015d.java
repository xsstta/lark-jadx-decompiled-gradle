package com.google.gson.internal;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.Since;
import com.google.gson.annotations.Until;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.gson.internal.d */
public final class C23015d implements TypeAdapterFactory, Cloneable {

    /* renamed from: a */
    public static final C23015d f56868a = new C23015d();

    /* renamed from: b */
    private double f56869b = -1.0d;

    /* renamed from: c */
    private int f56870c = 136;

    /* renamed from: d */
    private boolean f56871d = true;

    /* renamed from: e */
    private boolean f56872e;

    /* renamed from: f */
    private List<ExclusionStrategy> f56873f = Collections.emptyList();

    /* renamed from: g */
    private List<ExclusionStrategy> f56874g = Collections.emptyList();

    /* renamed from: a */
    public boolean mo79959a(Field field, boolean z) {
        Expose expose;
        if ((this.f56870c & field.getModifiers()) != 0) {
            return true;
        }
        if (!(this.f56869b == -1.0d || m83472a((Since) field.getAnnotation(Since.class), (Until) field.getAnnotation(Until.class))) || field.isSynthetic()) {
            return true;
        }
        if (this.f56872e && ((expose = (Expose) field.getAnnotation(Expose.class)) == null || (!z ? !expose.deserialize() : !expose.serialize()))) {
            return true;
        }
        if ((!this.f56871d && m83477c(field.getType())) || m83475b(field.getType())) {
            return true;
        }
        List<ExclusionStrategy> list = z ? this.f56873f : this.f56874g;
        if (list.isEmpty()) {
            return false;
        }
        FieldAttributes fieldAttributes = new FieldAttributes(field);
        for (ExclusionStrategy exclusionStrategy : list) {
            if (exclusionStrategy.shouldSkipField(fieldAttributes)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public C23015d mo79960b() {
        C23015d a = clone();
        a.f56871d = false;
        return a;
    }

    /* renamed from: c */
    public C23015d mo79961c() {
        C23015d a = clone();
        a.f56872e = true;
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C23015d clone() {
        try {
            return (C23015d) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    public C23015d mo79955a(double d) {
        C23015d a = clone();
        a.f56869b = d;
        return a;
    }

    /* renamed from: a */
    private boolean m83471a(Since since) {
        if (since == null || since.value() <= this.f56869b) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private boolean m83477c(Class<?> cls) {
        if (!cls.isMemberClass() || m83478d(cls)) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private boolean m83478d(Class<?> cls) {
        if ((cls.getModifiers() & 8) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private boolean m83475b(Class<?> cls) {
        if (Enum.class.isAssignableFrom(cls) || (!cls.isAnonymousClass() && !cls.isLocalClass())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private boolean m83473a(Until until) {
        if (until == null || until.value() > this.f56869b) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private boolean m83474a(Class<?> cls) {
        if (this.f56869b != -1.0d && !m83472a((Since) cls.getAnnotation(Since.class), (Until) cls.getAnnotation(Until.class))) {
            return true;
        }
        if ((this.f56871d || !m83477c(cls)) && !m83475b(cls)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public C23015d mo79957a(int... iArr) {
        C23015d a = clone();
        a.f56870c = 0;
        for (int i : iArr) {
            a.f56870c = i | a.f56870c;
        }
        return a;
    }

    /* renamed from: a */
    private boolean m83472a(Since since, Until until) {
        if (!m83471a(since) || !m83473a(until)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private boolean m83476b(Class<?> cls, boolean z) {
        List<ExclusionStrategy> list;
        if (z) {
            list = this.f56873f;
        } else {
            list = this.f56874g;
        }
        for (ExclusionStrategy exclusionStrategy : list) {
            if (exclusionStrategy.shouldSkipClass(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.gson.TypeAdapterFactory
    public <T> TypeAdapter<T> create(final Gson gson, final TypeToken<T> typeToken) {
        final boolean z;
        final boolean z2;
        Class<? super T> rawType = typeToken.getRawType();
        boolean a = m83474a(rawType);
        if (a || m83476b(rawType, true)) {
            z = true;
        } else {
            z = false;
        }
        if (a || m83476b(rawType, false)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z || z2) {
            return new TypeAdapter<T>() {
                /* class com.google.gson.internal.C23015d.C230161 */

                /* renamed from: f */
                private TypeAdapter<T> f56880f;

                /* renamed from: a */
                private TypeAdapter<T> m83487a() {
                    TypeAdapter<T> typeAdapter = this.f56880f;
                    if (typeAdapter != null) {
                        return typeAdapter;
                    }
                    TypeAdapter<T> delegateAdapter = gson.getDelegateAdapter(C23015d.this, typeToken);
                    this.f56880f = delegateAdapter;
                    return delegateAdapter;
                }

                @Override // com.google.gson.TypeAdapter
                public T read(JsonReader jsonReader) throws IOException {
                    if (!z2) {
                        return (T) m83487a().read(jsonReader);
                    }
                    jsonReader.skipValue();
                    return null;
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, T t) throws IOException {
                    if (z) {
                        jsonWriter.nullValue();
                    } else {
                        m83487a().write(jsonWriter, t);
                    }
                }
            };
        }
        return null;
    }

    /* renamed from: a */
    public boolean mo79958a(Class<?> cls, boolean z) {
        if (m83474a(cls) || m83476b(cls, z)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public C23015d mo79956a(ExclusionStrategy exclusionStrategy, boolean z, boolean z2) {
        C23015d a = clone();
        if (z) {
            ArrayList arrayList = new ArrayList(this.f56873f);
            a.f56873f = arrayList;
            arrayList.add(exclusionStrategy);
        }
        if (z2) {
            ArrayList arrayList2 = new ArrayList(this.f56874g);
            a.f56874g = arrayList2;
            arrayList2.add(exclusionStrategy);
        }
        return a;
    }
}
