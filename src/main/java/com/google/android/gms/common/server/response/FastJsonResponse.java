package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.server.converter.zaa;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.C21813g;
import com.google.android.gms.common.util.C21814h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public abstract class FastJsonResponse {

    /* renamed from: com.google.android.gms.common.server.response.FastJsonResponse$a */
    public interface AbstractC21787a<I, O> {
        /* renamed from: a */
        I mo73769a(O o);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo73780a(String str);

    /* renamed from: a */
    public abstract Map<String, Field<?, ?>> mo72968a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo73781b(String str);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo72969a(Field field) {
        if (field.f53137c != 11) {
            return mo73781b(field.f53139e);
        }
        if (field.f53138d) {
            String str = field.f53139e;
            throw new UnsupportedOperationException("Concrete type arrays not supported");
        }
        String str2 = field.f53139e;
        throw new UnsupportedOperationException("Concrete types not supported");
    }

    public static class Field<I, O> extends AbstractSafeParcelable {
        public static final C21797i CREATOR = new C21797i();

        /* renamed from: a */
        protected final int f53135a;

        /* renamed from: b */
        protected final boolean f53136b;

        /* renamed from: c */
        protected final int f53137c;

        /* renamed from: d */
        protected final boolean f53138d;

        /* renamed from: e */
        protected final String f53139e;

        /* renamed from: f */
        protected final int f53140f;

        /* renamed from: g */
        protected final Class<? extends FastJsonResponse> f53141g;

        /* renamed from: h */
        private final int f53142h;

        /* renamed from: i */
        private final String f53143i;

        /* renamed from: j */
        private zak f53144j;

        /* renamed from: k */
        private AbstractC21787a<I, O> f53145k;

        Field(int i, int i2, boolean z, int i3, boolean z2, String str, int i4, String str2, zaa zaa) {
            this.f53142h = i;
            this.f53135a = i2;
            this.f53136b = z;
            this.f53137c = i3;
            this.f53138d = z2;
            this.f53139e = str;
            this.f53140f = i4;
            if (str2 == null) {
                this.f53141g = null;
                this.f53143i = null;
            } else {
                this.f53141g = SafeParcelResponse.class;
                this.f53143i = str2;
            }
            if (zaa == null) {
                this.f53145k = null;
            } else {
                this.f53145k = (AbstractC21787a<I, O>) zaa.mo73778a();
            }
        }

        private Field(int i, boolean z, int i2, boolean z2, String str, int i3, Class<? extends FastJsonResponse> cls, AbstractC21787a<I, O> aVar) {
            this.f53142h = 1;
            this.f53135a = i;
            this.f53136b = z;
            this.f53137c = i2;
            this.f53138d = z2;
            this.f53139e = str;
            this.f53140f = i3;
            this.f53141g = cls;
            if (cls == null) {
                this.f53143i = null;
            } else {
                this.f53143i = cls.getCanonicalName();
            }
            this.f53145k = aVar;
        }

        /* renamed from: a */
        public int mo73783a() {
            return this.f53140f;
        }

        /* renamed from: d */
        private final String m79047d() {
            String str = this.f53143i;
            if (str == null) {
                return null;
            }
            return str;
        }

        /* renamed from: b */
        public final boolean mo73786b() {
            return this.f53145k != null;
        }

        /* renamed from: a */
        public final void mo73785a(zak zak) {
            this.f53144j = zak;
        }

        /* renamed from: e */
        private final zaa m79048e() {
            AbstractC21787a<I, O> aVar = this.f53145k;
            if (aVar == null) {
                return null;
            }
            return zaa.m79031a(aVar);
        }

        /* renamed from: c */
        public final Map<String, Field<?, ?>> mo73787c() {
            Preconditions.checkNotNull(this.f53143i);
            Preconditions.checkNotNull(this.f53144j);
            return this.f53144j.mo73804a(this.f53143i);
        }

        /* renamed from: a */
        public final I mo73784a(O o) {
            return this.f53145k.mo73769a(o);
        }

        /* renamed from: a */
        public static Field<Integer, Integer> m79040a(String str, int i) {
            return new Field<>(0, false, 0, false, str, i, null, null);
        }

        /* renamed from: b */
        public static Field<String, String> m79043b(String str, int i) {
            return new Field<>(7, false, 7, false, str, i, null, null);
        }

        /* renamed from: c */
        public static Field<ArrayList<String>, ArrayList<String>> m79045c(String str, int i) {
            return new Field<>(7, true, 7, true, str, i, null, null);
        }

        /* renamed from: d */
        public static Field<byte[], byte[]> m79046d(String str, int i) {
            return new Field<>(8, false, 8, false, str, i, null, null);
        }

        /* renamed from: a */
        public static <T extends FastJsonResponse> Field<T, T> m79041a(String str, int i, Class<T> cls) {
            return new Field<>(11, false, 11, false, str, i, cls, null);
        }

        /* renamed from: b */
        public static <T extends FastJsonResponse> Field<ArrayList<T>, ArrayList<T>> m79044b(String str, int i, Class<T> cls) {
            return new Field<>(11, true, 11, true, str, i, cls, null);
        }

        public void writeToParcel(Parcel parcel, int i) {
            int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
            SafeParcelWriter.writeInt(parcel, 1, this.f53142h);
            SafeParcelWriter.writeInt(parcel, 2, this.f53135a);
            SafeParcelWriter.writeBoolean(parcel, 3, this.f53136b);
            SafeParcelWriter.writeInt(parcel, 4, this.f53137c);
            SafeParcelWriter.writeBoolean(parcel, 5, this.f53138d);
            SafeParcelWriter.writeString(parcel, 6, this.f53139e, false);
            SafeParcelWriter.writeInt(parcel, 7, mo73783a());
            SafeParcelWriter.writeString(parcel, 8, m79047d(), false);
            SafeParcelWriter.writeParcelable(parcel, 9, m79048e(), i, false);
            SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        }

        public String toString() {
            Objects.ToStringHelper add = Objects.toStringHelper(this).add("versionCode", Integer.valueOf(this.f53142h)).add("typeIn", Integer.valueOf(this.f53135a)).add("typeInArray", Boolean.valueOf(this.f53136b)).add("typeOut", Integer.valueOf(this.f53137c)).add("typeOutArray", Boolean.valueOf(this.f53138d)).add("outputFieldName", this.f53139e).add("safeParcelFieldId", Integer.valueOf(this.f53140f)).add("concreteTypeName", m79047d());
            Class<? extends FastJsonResponse> cls = this.f53141g;
            if (cls != null) {
                add.add("concreteType.class", cls.getCanonicalName());
            }
            AbstractC21787a<I, O> aVar = this.f53145k;
            if (aVar != null) {
                add.add("converterName", aVar.getClass().getCanonicalName());
            }
            return add.toString();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    protected static <O, I> I m79033a(Field<I, O> field, Object obj) {
        return ((Field) field).f53145k != null ? field.mo73784a(obj) : obj;
    }

    public String toString() {
        Map<String, Field<?, ?>> a = mo72968a();
        StringBuilder sb = new StringBuilder(100);
        for (String str : a.keySet()) {
            Field<?, ?> field = a.get(str);
            if (mo72969a(field)) {
                Object a2 = m79033a(field, mo72970b(field));
                if (sb.length() == 0) {
                    sb.append("{");
                } else {
                    sb.append(",");
                }
                sb.append("\"");
                sb.append(str);
                sb.append("\":");
                if (a2 != null) {
                    switch (field.f53137c) {
                        case 8:
                            sb.append("\"");
                            sb.append(Base64Utils.encode((byte[]) a2));
                            sb.append("\"");
                            continue;
                        case 9:
                            sb.append("\"");
                            sb.append(Base64Utils.encodeUrlSafe((byte[]) a2));
                            sb.append("\"");
                            continue;
                        case 10:
                            C21814h.m79092a(sb, (HashMap) a2);
                            continue;
                        default:
                            if (!field.f53136b) {
                                m79034a(sb, field, a2);
                                break;
                            } else {
                                ArrayList arrayList = (ArrayList) a2;
                                sb.append("[");
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    if (i > 0) {
                                        sb.append(",");
                                    }
                                    Object obj = arrayList.get(i);
                                    if (obj != null) {
                                        m79034a(sb, field, obj);
                                    }
                                }
                                sb.append("]");
                                continue;
                            }
                    }
                } else {
                    sb.append("null");
                }
            }
        }
        if (sb.length() > 0) {
            sb.append("}");
        } else {
            sb.append("{}");
        }
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Object mo72970b(Field field) {
        String str = field.f53139e;
        if (field.f53141g == null) {
            return mo73780a(field.f53139e);
        }
        Preconditions.checkState(mo73780a(field.f53139e) == null, "Concrete field shouldn't be value object: %s", field.f53139e);
        boolean z = field.f53138d;
        try {
            char upperCase = Character.toUpperCase(str.charAt(0));
            String substring = str.substring(1);
            StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 4);
            sb.append("get");
            sb.append(upperCase);
            sb.append(substring);
            return getClass().getMethod(sb.toString(), new Class[0]).invoke(this, new Object[0]);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    private static void m79034a(StringBuilder sb, Field field, Object obj) {
        if (field.f53135a == 11) {
            sb.append(((FastJsonResponse) field.f53141g.cast(obj)).toString());
        } else if (field.f53135a == 7) {
            sb.append("\"");
            sb.append(C21813g.m79091a((String) obj));
            sb.append("\"");
        } else {
            sb.append(obj);
        }
    }
}
