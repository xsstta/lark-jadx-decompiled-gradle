package com.squareup.javapoet;

import java.io.IOException;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.lang.model.element.TypeParameterElement;
import javax.lang.model.type.TypeMirror;
import javax.lang.model.util.SimpleTypeVisitor8;

/* renamed from: com.squareup.javapoet.k */
public class C27197k {

    /* renamed from: a */
    private static final C27182c f67676a = C27182c.m98795a("java.lang", "Void", new String[0]);

    /* renamed from: b */
    private static final C27182c f67677b = C27182c.m98795a("java.lang", "Boolean", new String[0]);

    /* renamed from: c */
    private static final C27182c f67678c = C27182c.m98795a("java.lang", "Byte", new String[0]);

    /* renamed from: d */
    private static final C27182c f67679d = C27182c.m98795a("java.lang", "Short", new String[0]);

    /* renamed from: e */
    private static final C27182c f67680e = C27182c.m98795a("java.lang", "Integer", new String[0]);

    /* renamed from: f */
    public static final C27197k f67681f = new C27197k("void");

    /* renamed from: g */
    public static final C27197k f67682g = new C27197k("boolean");

    /* renamed from: h */
    public static final C27197k f67683h = new C27197k("byte");

    /* renamed from: i */
    public static final C27197k f67684i = new C27197k("short");

    /* renamed from: j */
    public static final C27197k f67685j = new C27197k("int");

    /* renamed from: k */
    public static final C27197k f67686k = new C27197k("long");

    /* renamed from: l */
    public static final C27197k f67687l = new C27197k("char");

    /* renamed from: m */
    public static final C27197k f67688m = new C27197k("float");

    /* renamed from: n */
    public static final C27197k f67689n = new C27197k("double");

    /* renamed from: o */
    public static final C27182c f67690o = C27182c.m98795a("java.lang", "Object", new String[0]);

    /* renamed from: q */
    private static final C27182c f67691q = C27182c.m98795a("java.lang", "Long", new String[0]);

    /* renamed from: r */
    private static final C27182c f67692r = C27182c.m98795a("java.lang", "Character", new String[0]);

    /* renamed from: s */
    private static final C27182c f67693s = C27182c.m98795a("java.lang", "Float", new String[0]);

    /* renamed from: t */
    private static final C27182c f67694t = C27182c.m98795a("java.lang", "Double", new String[0]);

    /* renamed from: p */
    public final List<C27180a> f67695p;

    /* renamed from: u */
    private final String f67696u;

    /* renamed from: v */
    private String f67697v;

    /* renamed from: g */
    public boolean mo96859g() {
        if (this.f67696u == null || this == f67681f) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return toString().hashCode();
    }

    public final String toString() {
        String str = this.f67697v;
        if (str != null) {
            return str;
        }
        try {
            StringBuilder sb = new StringBuilder();
            mo96792a(new C27186e(sb));
            String sb2 = sb.toString();
            this.f67697v = sb2;
            return sb2;
        } catch (IOException unused) {
            throw new AssertionError();
        }
    }

    /* renamed from: a */
    public boolean mo96797a() {
        return !this.f67695p.isEmpty();
    }

    C27197k(List<C27180a> list) {
        this(null, list);
    }

    private C27197k(String str) {
        this(str, new ArrayList());
    }

    /* renamed from: a */
    public static C27197k m98864a(Type type) {
        return m98865a(type, new LinkedHashMap());
    }

    /* renamed from: b */
    static C27181b m98869b(C27197k kVar) {
        if (kVar instanceof C27181b) {
            return (C27181b) kVar;
        }
        return null;
    }

    /* renamed from: a */
    public static C27197k m98866a(TypeMirror typeMirror) {
        return m98867a(typeMirror, new LinkedHashMap());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C27186e mo96856b(C27186e eVar) throws IOException {
        for (C27180a aVar : this.f67695p) {
            aVar.mo96788a(eVar, true);
            eVar.mo96815a(" ");
        }
        return eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return toString().equals(obj.toString());
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final List<C27180a> mo96857b(List<C27180a> list) {
        ArrayList arrayList = new ArrayList(this.f67695p);
        arrayList.addAll(list);
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C27186e mo96792a(C27186e eVar) throws IOException {
        if (this.f67696u != null) {
            if (mo96797a()) {
                eVar.mo96815a("");
                mo96856b(eVar);
            }
            return eVar.mo96826b(this.f67696u);
        }
        throw new AssertionError();
    }

    private C27197k(String str, List<C27180a> list) {
        this.f67696u = str;
        this.f67695p = C27200m.m98880a(list);
    }

    /* renamed from: a */
    static C27197k m98867a(TypeMirror typeMirror, final Map<TypeParameterElement, C27199l> map) {
        return (C27197k) typeMirror.accept(new SimpleTypeVisitor8<C27197k, Void>() {
            /* class com.squareup.javapoet.C27197k.C271981 */
        }, (Object) null);
    }

    /* renamed from: a */
    static List<C27197k> m98868a(Type[] typeArr, Map<Type, C27199l> map) {
        ArrayList arrayList = new ArrayList(typeArr.length);
        for (Type type : typeArr) {
            arrayList.add(m98865a(type, map));
        }
        return arrayList;
    }

    /* renamed from: a */
    static C27197k m98865a(Type type, Map<Type, C27199l> map) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (type == Void.TYPE) {
                return f67681f;
            }
            if (type == Boolean.TYPE) {
                return f67682g;
            }
            if (type == Byte.TYPE) {
                return f67683h;
            }
            if (type == Short.TYPE) {
                return f67684i;
            }
            if (type == Integer.TYPE) {
                return f67685j;
            }
            if (type == Long.TYPE) {
                return f67686k;
            }
            if (type == Character.TYPE) {
                return f67687l;
            }
            if (type == Float.TYPE) {
                return f67688m;
            }
            if (type == Double.TYPE) {
                return f67689n;
            }
            if (cls.isArray()) {
                return C27181b.m98788a(m98865a(cls.getComponentType(), map));
            }
            return C27182c.m98794a((Class<?>) cls);
        } else if (type instanceof ParameterizedType) {
            return C27196j.m98861a((ParameterizedType) type, map);
        } else {
            if (type instanceof WildcardType) {
                return C27201n.m98885a((WildcardType) type, map);
            }
            if (type instanceof TypeVariable) {
                return C27199l.m98875a((TypeVariable<?>) ((TypeVariable) type), map);
            }
            if (type instanceof GenericArrayType) {
                return C27181b.m98789a((GenericArrayType) type, map);
            }
            throw new IllegalArgumentException("unexpected type: " + type);
        }
    }
}
