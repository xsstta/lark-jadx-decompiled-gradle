package com.ss.android.lark.ug.plugin.internal;

import com.squareup.wire.Message;
import com.ss.android.lark.ug.plugin.ReachPoint;
import com.ss.android.lark.ug.plugin.ReachPointPlugin;
import java.util.HashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005¢\u0006\u0002\u0010\u0002JN\u0010\b\u001a\u00020\t2F\u0010\n\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000bj\n\u0012\u0002\b\u0003\u0012\u0002\b\u0003`\f\u0012\"\b\u0001\u0012\u001e\u0012\u001a\b\u0001\u0012\u0016\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000bj\n\u0012\u0002\b\u0003\u0012\u0002\b\u0003`\f0\r0\u0006J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0005J`\u0010\u0011\u001aD\u0012\u001a\b\u0001\u0012\u0016\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000bj\n\u0012\u0002\b\u0003\u0012\u0002\b\u0003`\f\u0012\"\b\u0001\u0012\u001e\u0012\u001a\b\u0001\u0012\u0016\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000bj\n\u0012\u0002\b\u0003\u0012\u0002\b\u0003`\f0\r\u0018\u00010\u00062\u0016\u0010\u0012\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00060\u0013JP\u0010\u0011\u001aD\u0012\u001a\b\u0001\u0012\u0016\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000bj\n\u0012\u0002\b\u0003\u0012\u0002\b\u0003`\f\u0012\"\b\u0001\u0012\u001e\u0012\u001a\b\u0001\u0012\u0016\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000bj\n\u0012\u0002\b\u0003\u0012\u0002\b\u0003`\f0\r\u0018\u00010\u00062\u0006\u0010\u0010\u001a\u00020\u0005J\u001a\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00060\u0015J\u000e\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0005R:\u0010\u0003\u001a.\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00060\u0004j\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0006`\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/ug/plugin/internal/PluginManager;", "", "()V", "pluginsMap", "Ljava/util/HashMap;", "", "Lcom/ss/android/lark/ug/plugin/ReachPointPlugin;", "Lkotlin/collections/HashMap;", "addPlugin", "", "plugin", "Lcom/squareup/wire/Message;", "Lcom/ss/android/lark/ug/plugin/ReachPointData;", "Lcom/ss/android/lark/ug/plugin/ReachPoint;", "contains", "", "reachPointType", "getPlugin", "reachPointPluginClazz", "Ljava/lang/Class;", "getPlugins", "", "removePlugin", "Companion", "ug-reach-sdk_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.ug.plugin.c.a */
public final class PluginManager {

    /* renamed from: a */
    public static final Lazy f141754a = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C57534b.INSTANCE);

    /* renamed from: b */
    public static final Companion f141755b = new Companion(null);

    /* renamed from: c */
    private final HashMap<String, ReachPointPlugin<?, ?>> f141756c = new HashMap<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\u0004H\u0007R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/ug/plugin/internal/PluginManager$Companion;", "", "()V", "instance", "Lcom/ss/android/lark/ug/plugin/internal/PluginManager;", "getInstance", "()Lcom/ss/android/lark/ug/plugin/internal/PluginManager;", "instance$delegate", "Lkotlin/Lazy;", "inst", "ug-reach-sdk_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.ug.plugin.c.a$a */
    public static final class Companion {

        /* renamed from: a */
        static final /* synthetic */ KProperty[] f141757a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "instance", "getInstance()Lcom/ss/android/lark/ug/plugin/internal/PluginManager;"))};

        /* renamed from: b */
        private final PluginManager m223355b() {
            Lazy lazy = PluginManager.f141754a;
            Companion aVar = PluginManager.f141755b;
            KProperty kProperty = f141757a[0];
            return (PluginManager) lazy.getValue();
        }

        private Companion() {
        }

        @JvmStatic
        /* renamed from: a */
        public final PluginManager mo195252a() {
            return m223355b();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/ug/plugin/internal/PluginManager;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.ug.plugin.c.a$b */
    static final class C57534b extends Lambda implements Function0<PluginManager> {
        public static final C57534b INSTANCE = new C57534b();

        C57534b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final PluginManager invoke() {
            return new PluginManager();
        }
    }

    /* renamed from: a */
    public final Map<String, ReachPointPlugin<?, ?>> mo195250a() {
        return this.f141756c;
    }

    /* JADX DEBUG: Type inference failed for r2v3. Raw type applied. Possible types: com.ss.android.lark.ug.plugin.g<?, ?>, com.ss.android.lark.ug.plugin.g<? extends com.squareup.wire.Message<?, ?>, ? extends com.ss.android.lark.ug.plugin.d<? extends com.squareup.wire.Message<?, ?>>> */
    /* renamed from: a */
    public final synchronized ReachPointPlugin<? extends Message<?, ?>, ? extends ReachPoint<? extends Message<?, ?>>> mo195249a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "reachPointType");
        return this.f141756c.get(str);
    }

    /* renamed from: a */
    public final synchronized void mo195251a(ReachPointPlugin<? extends Message<?, ?>, ? extends ReachPoint<? extends Message<?, ?>>> gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "plugin");
        this.f141756c.put(gVar.mo195260a(), gVar);
    }
}
