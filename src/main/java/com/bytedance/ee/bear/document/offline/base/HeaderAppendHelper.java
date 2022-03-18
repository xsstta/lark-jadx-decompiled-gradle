package com.bytedance.ee.bear.document.offline.base;

import com.bytedance.ee.bear.persistence.PersistenceSharedPreference;
import com.bytedance.ee.util.p701d.C13616d;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u0011J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014J\b\u0010\u0015\u001a\u00020\u0004H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/bytedance/ee/bear/document/offline/base/HeaderAppendHelper;", "", "()V", "canAppend", "", "getCanAppend", "()Z", "canAppend$delegate", "Lkotlin/Lazy;", "headerAppendSp", "Lcom/bytedance/ee/bear/persistence/PersistenceSharedPreference;", "getHeaderAppendSp", "()Lcom/bytedance/ee/bear/persistence/PersistenceSharedPreference;", "headerAppendSp$delegate", "appendHeaderIfAllow", "", "header", "", "", "builder", "Lokhttp3/Request$Builder;", "canAppendParams", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.document.offline.base.e */
public final class HeaderAppendHelper {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f16539a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(HeaderAppendHelper.class), "canAppend", "getCanAppend()Z")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(HeaderAppendHelper.class), "headerAppendSp", "getHeaderAppendSp()Lcom/bytedance/ee/bear/persistence/PersistenceSharedPreference;"))};

    /* renamed from: b */
    public static final HeaderAppendHelper f16540b = new HeaderAppendHelper();

    /* renamed from: c */
    private static final Lazy f16541c = LazyKt.lazy(C5907a.INSTANCE);

    /* renamed from: d */
    private static final Lazy f16542d = LazyKt.lazy(C5908b.INSTANCE);

    /* renamed from: b */
    private final boolean m23788b() {
        Lazy lazy = f16541c;
        KProperty kProperty = f16539a[0];
        return ((Boolean) lazy.getValue()).booleanValue();
    }

    /* renamed from: c */
    private final PersistenceSharedPreference m23789c() {
        Lazy lazy = f16542d;
        KProperty kProperty = f16539a[1];
        return (PersistenceSharedPreference) lazy.getValue();
    }

    private HeaderAppendHelper() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.offline.base.e$a */
    static final class C5907a extends Lambda implements Function0<Boolean> {
        public static final C5907a INSTANCE = new C5907a();

        C5907a() {
            super(0);
        }

        /* Return type fixed from 'boolean' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return HeaderAppendHelper.f16540b.mo23873a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/persistence/PersistenceSharedPreference;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.offline.base.e$b */
    static final class C5908b extends Lambda implements Function0<PersistenceSharedPreference> {
        public static final C5908b INSTANCE = new C5908b();

        C5908b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final PersistenceSharedPreference invoke() {
            return new PersistenceSharedPreference("header_append_params_sp_name");
        }
    }

    /* renamed from: a */
    public final boolean mo23873a() {
        boolean a = C13616d.m55261a();
        if (!((Boolean) new PersistenceSharedPreference("debug_config").mo34038b("header_append_params_enable", false)).booleanValue() || !a) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo23872a(Map<String, String> map) {
        Intrinsics.checkParameterIsNotNull(map, "header");
        if (m23788b()) {
            Map<String, ?> all = m23789c().getAll();
            if (all != null) {
                for (Map.Entry<String, ?> entry : all.entrySet()) {
                    map.put(entry.getKey(), (String) entry.getValue());
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
        }
    }
}
