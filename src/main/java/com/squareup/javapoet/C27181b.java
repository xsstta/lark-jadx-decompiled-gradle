package com.squareup.javapoet;

import java.io.IOException;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.squareup.javapoet.b */
public final class C27181b extends C27197k {

    /* renamed from: a */
    public final C27197k f67608a;

    /* renamed from: a */
    public static C27181b m98788a(C27197k kVar) {
        return new C27181b(kVar);
    }

    private C27181b(C27197k kVar) {
        this(kVar, new ArrayList());
    }

    /* renamed from: c */
    private C27186e m98791c(C27186e eVar) throws IOException {
        if (C27197k.m98869b(this.f67608a) != null) {
            return C27197k.m98869b(this.f67608a).m98791c(eVar);
        }
        return this.f67608a.mo96792a(eVar);
    }

    /* access modifiers changed from: package-private */
    @Override // com.squareup.javapoet.C27197k
    /* renamed from: a */
    public C27186e mo96792a(C27186e eVar) throws IOException {
        return mo96793a(eVar, false);
    }

    /* renamed from: a */
    static C27181b m98789a(GenericArrayType genericArrayType, Map<Type, C27199l> map) {
        return m98788a(m98865a(genericArrayType.getGenericComponentType(), map));
    }

    private C27181b(C27197k kVar, List<C27180a> list) {
        super(list);
        this.f67608a = (C27197k) C27200m.m98877a(kVar, "rawType == null", new Object[0]);
    }

    /* renamed from: b */
    private C27186e m98790b(C27186e eVar, boolean z) throws IOException {
        if (mo96797a()) {
            eVar.mo96815a(" ");
            mo96856b(eVar);
        }
        String str = "[]";
        if (C27197k.m98869b(this.f67608a) == null) {
            if (z) {
                str = "...";
            }
            return eVar.mo96815a(str);
        }
        eVar.mo96815a(str);
        return C27197k.m98869b(this.f67608a).m98790b(eVar, z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C27186e mo96793a(C27186e eVar, boolean z) throws IOException {
        m98791c(eVar);
        return m98790b(eVar, z);
    }
}
