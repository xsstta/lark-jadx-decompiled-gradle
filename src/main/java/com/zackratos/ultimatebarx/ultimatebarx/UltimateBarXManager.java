package com.zackratos.ultimatebarx.ultimatebarx;

import android.content.Context;
import android.os.Build;
import android.view.Window;
import androidx.collection.ArrayMap;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import com.zackratos.ultimatebarx.ultimatebarx.bean.BarConfig;
import com.zackratos.ultimatebarx.ultimatebarx.p3442c.C68100c;
import com.zackratos.ultimatebarx.ultimatebarx.rom.Rom;
import java.lang.reflect.Field;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 P2\u00020\u0001:\u0002PQB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010+\u001a\u00020\u00062\b\b\u0001\u0010,\u001a\u00020-H\u0002J\u0015\u0010.\u001a\u00020\u00062\u0006\u0010/\u001a\u000200H\u0000¢\u0006\u0002\b1J\u0015\u00102\u001a\u00020\u00062\u0006\u0010/\u001a\u000200H\u0000¢\u0006\u0002\b3J\u0015\u00104\u001a\u00020\u001a2\u0006\u0010/\u001a\u000200H\u0000¢\u0006\u0002\b5J\u0015\u00106\u001a\u00020\u00062\u0006\u0010/\u001a\u000200H\u0000¢\u0006\u0002\b7J\u0015\u00108\u001a\u00020\u001a2\u0006\u0010/\u001a\u000200H\u0000¢\u0006\u0002\b9J\u0015\u0010:\u001a\u00020\u00062\u0006\u0010/\u001a\u000200H\u0000¢\u0006\u0002\b;J\u0015\u0010<\u001a\u00020=2\u0006\u0010/\u001a\u000200H\u0000¢\u0006\u0002\b>J\u0015\u0010?\u001a\u00020=2\u0006\u0010/\u001a\u000200H\u0000¢\u0006\u0002\b@J\u001d\u0010A\u001a\u00020=2\u0006\u0010/\u001a\u0002002\u0006\u0010B\u001a\u00020\u001aH\u0000¢\u0006\u0002\bCJ\u0015\u0010D\u001a\u00020=2\u0006\u0010/\u001a\u000200H\u0000¢\u0006\u0002\bEJ\u0015\u0010F\u001a\u00020=2\u0006\u0010G\u001a\u00020HH\u0001¢\u0006\u0002\bIJ\u001d\u0010J\u001a\u00020=2\u0006\u0010/\u001a\u0002002\u0006\u0010B\u001a\u00020\u001aH\u0000¢\u0006\u0002\bKJ\u0015\u0010L\u001a\u00020=2\u0006\u0010/\u001a\u000200H\u0000¢\u0006\u0002\bMJ\u0015\u0010N\u001a\u00020=2\u0006\u0010/\u001a\u000200H\u0000¢\u0006\u0002\bOR'\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\u00020\fX.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0011\u001a\u00020\u00128@X\u0002¢\u0006\f\n\u0004\b\u0015\u0010\n\u001a\u0004\b\u0013\u0010\u0014R'\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048BX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\n\u001a\u0004\b\u0017\u0010\bR'\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001a0\u00048BX\u0002¢\u0006\f\n\u0004\b\u001c\u0010\n\u001a\u0004\b\u001b\u0010\bR'\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048BX\u0002¢\u0006\f\n\u0004\b\u001f\u0010\n\u001a\u0004\b\u001e\u0010\bR\u001b\u0010 \u001a\u00020!8@X\u0002¢\u0006\f\n\u0004\b$\u0010\n\u001a\u0004\b\"\u0010#R'\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001a0\u00048BX\u0002¢\u0006\f\n\u0004\b'\u0010\n\u001a\u0004\b&\u0010\bR'\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048BX\u0002¢\u0006\f\n\u0004\b*\u0010\n\u001a\u0004\b)\u0010\b¨\u0006R"}, d2 = {"Lcom/zackratos/ultimatebarx/ultimatebarx/UltimateBarXManager;", "", "()V", "addObsMap", "", "", "", "getAddObsMap", "()Ljava/util/Map;", "addObsMap$delegate", "Lkotlin/Lazy;", "context", "Landroid/content/Context;", "getContext$ultimatebarx_release", "()Landroid/content/Context;", "setContext$ultimatebarx_release", "(Landroid/content/Context;)V", "fragmentViewFiled", "Ljava/lang/reflect/Field;", "getFragmentViewFiled$ultimatebarx_release", "()Ljava/lang/reflect/Field;", "fragmentViewFiled$delegate", "initializationMap", "getInitializationMap", "initializationMap$delegate", "navConfigMap", "Lcom/zackratos/ultimatebarx/ultimatebarx/bean/BarConfig;", "getNavConfigMap", "navConfigMap$delegate", "navDefMap", "getNavDefMap", "navDefMap$delegate", "rom", "Lcom/zackratos/ultimatebarx/ultimatebarx/rom/Rom;", "getRom$ultimatebarx_release", "()Lcom/zackratos/ultimatebarx/ultimatebarx/rom/Rom;", "rom$delegate", "staConfigMap", "getStaConfigMap", "staConfigMap$delegate", "staDefMap", "getStaDefMap", "staDefMap$delegate", "calculateLight", "color", "", "getAddObserver", "owner", "Landroidx/lifecycle/LifecycleOwner;", "getAddObserver$ultimatebarx_release", "getInitialization", "getInitialization$ultimatebarx_release", "getNavigationBarConfig", "getNavigationBarConfig$ultimatebarx_release", "getNavigationBarDefault", "getNavigationBarDefault$ultimatebarx_release", "getStatusBarConfig", "getStatusBarConfig$ultimatebarx_release", "getStatusBarDefault", "getStatusBarDefault$ultimatebarx_release", "putAddObserver", "", "putAddObserver$ultimatebarx_release", "putInitialization", "putInitialization$ultimatebarx_release", "putNavigationBarConfig", "config", "putNavigationBarConfig$ultimatebarx_release", "putNavigationBarDefault", "putNavigationBarDefault$ultimatebarx_release", "putOriginConfig", "activity", "Landroidx/fragment/app/FragmentActivity;", "putOriginConfig$ultimatebarx_release", "putStatusBarConfig", "putStatusBarConfig$ultimatebarx_release", "putStatusBarDefault", "putStatusBarDefault$ultimatebarx_release", "removeAllData", "removeAllData$ultimatebarx_release", "Companion", "Holder", "ultimatebarx_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.zackratos.ultimatebarx.ultimatebarx.c */
public final class UltimateBarXManager {

    /* renamed from: b */
    public static final Companion f171319b = new Companion(null);

    /* renamed from: a */
    public Context f171320a;

    /* renamed from: c */
    private final Lazy f171321c;

    /* renamed from: d */
    private final Lazy f171322d;

    /* renamed from: e */
    private final Lazy f171323e;

    /* renamed from: f */
    private final Lazy f171324f;

    /* renamed from: g */
    private final Lazy f171325g;

    /* renamed from: h */
    private final Lazy f171326h;

    /* renamed from: i */
    private final Lazy f171327i;

    /* renamed from: j */
    private final Lazy f171328j;

    /* renamed from: a */
    private final boolean m264656a(int i) {
        return i > -16777216;
    }

    /* renamed from: d */
    private final Map<String, Boolean> m264657d() {
        return (Map) this.f171323e.getValue();
    }

    /* renamed from: e */
    private final Map<String, Boolean> m264658e() {
        return (Map) this.f171324f.getValue();
    }

    /* renamed from: f */
    private final Map<String, Boolean> m264659f() {
        return (Map) this.f171325g.getValue();
    }

    /* renamed from: g */
    private final Map<String, Boolean> m264660g() {
        return (Map) this.f171326h.getValue();
    }

    /* renamed from: h */
    private final Map<String, BarConfig> m264661h() {
        return (Map) this.f171327i.getValue();
    }

    /* renamed from: i */
    private final Map<String, BarConfig> m264662i() {
        return (Map) this.f171328j.getValue();
    }

    /* renamed from: a */
    public final Rom mo236975a() {
        return (Rom) this.f171321c.getValue();
    }

    /* renamed from: c */
    public final Field mo236983c() {
        return (Field) this.f171322d.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/zackratos/ultimatebarx/ultimatebarx/UltimateBarXManager$Companion;", "", "()V", "getInstance", "Lcom/zackratos/ultimatebarx/ultimatebarx/UltimateBarXManager;", "ultimatebarx_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.zackratos.ultimatebarx.ultimatebarx.c$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final UltimateBarXManager mo236993a() {
            return Holder.f171329a.mo236994a();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/zackratos/ultimatebarx/ultimatebarx/UltimateBarXManager$Holder;", "", "()V", "INSTANCE", "Lcom/zackratos/ultimatebarx/ultimatebarx/UltimateBarXManager;", "getINSTANCE", "()Lcom/zackratos/ultimatebarx/ultimatebarx/UltimateBarXManager;", "ultimatebarx_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.zackratos.ultimatebarx.ultimatebarx.c$b */
    public static final class Holder {

        /* renamed from: a */
        public static final Holder f171329a = new Holder();

        /* renamed from: b */
        private static final UltimateBarXManager f171330b = new UltimateBarXManager(null);

        private Holder() {
        }

        /* renamed from: a */
        public final UltimateBarXManager mo236994a() {
            return f171330b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/collection/ArrayMap;", "", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.zackratos.ultimatebarx.ultimatebarx.c$c */
    static final class C68090c extends Lambda implements Function0<ArrayMap<String, Boolean>> {
        public static final C68090c INSTANCE = new C68090c();

        C68090c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ArrayMap<String, Boolean> invoke() {
            return new ArrayMap<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/collection/ArrayMap;", "", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.zackratos.ultimatebarx.ultimatebarx.c$e */
    static final class C68092e extends Lambda implements Function0<ArrayMap<String, Boolean>> {
        public static final C68092e INSTANCE = new C68092e();

        C68092e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ArrayMap<String, Boolean> invoke() {
            return new ArrayMap<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/collection/ArrayMap;", "", "Lcom/zackratos/ultimatebarx/ultimatebarx/bean/BarConfig;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.zackratos.ultimatebarx.ultimatebarx.c$f */
    static final class C68093f extends Lambda implements Function0<ArrayMap<String, BarConfig>> {
        public static final C68093f INSTANCE = new C68093f();

        C68093f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ArrayMap<String, BarConfig> invoke() {
            return new ArrayMap<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/collection/ArrayMap;", "", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.zackratos.ultimatebarx.ultimatebarx.c$g */
    static final class C68094g extends Lambda implements Function0<ArrayMap<String, Boolean>> {
        public static final C68094g INSTANCE = new C68094g();

        C68094g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ArrayMap<String, Boolean> invoke() {
            return new ArrayMap<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/zackratos/ultimatebarx/ultimatebarx/rom/Rom;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.zackratos.ultimatebarx.ultimatebarx.c$h */
    static final class C68095h extends Lambda implements Function0<Rom> {
        public static final C68095h INSTANCE = new C68095h();

        C68095h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Rom invoke() {
            return C68100c.m264693a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/collection/ArrayMap;", "", "Lcom/zackratos/ultimatebarx/ultimatebarx/bean/BarConfig;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.zackratos.ultimatebarx.ultimatebarx.c$i */
    static final class C68096i extends Lambda implements Function0<ArrayMap<String, BarConfig>> {
        public static final C68096i INSTANCE = new C68096i();

        C68096i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ArrayMap<String, BarConfig> invoke() {
            return new ArrayMap<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/collection/ArrayMap;", "", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.zackratos.ultimatebarx.ultimatebarx.c$j */
    static final class C68097j extends Lambda implements Function0<ArrayMap<String, Boolean>> {
        public static final C68097j INSTANCE = new C68097j();

        C68097j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ArrayMap<String, Boolean> invoke() {
            return new ArrayMap<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/lang/reflect/Field;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.zackratos.ultimatebarx.ultimatebarx.c$d */
    static final class C68091d extends Lambda implements Function0<Field> {
        public static final C68091d INSTANCE = new C68091d();

        C68091d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Field invoke() {
            Field declaredField = Fragment.class.getDeclaredField("mView");
            declaredField.setAccessible(true);
            return declaredField;
        }
    }

    /* renamed from: b */
    public final Context mo236980b() {
        Context context = this.f171320a;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
        }
        return context;
    }

    private UltimateBarXManager() {
        this.f171321c = LazyKt.lazy(C68095h.INSTANCE);
        this.f171322d = LazyKt.lazy(C68091d.INSTANCE);
        this.f171323e = LazyKt.lazy(C68097j.INSTANCE);
        this.f171324f = LazyKt.lazy(C68094g.INSTANCE);
        this.f171325g = LazyKt.lazy(C68090c.INSTANCE);
        this.f171326h = LazyKt.lazy(C68092e.INSTANCE);
        this.f171327i = LazyKt.lazy(C68096i.INSTANCE);
        this.f171328j = LazyKt.lazy(C68093f.INSTANCE);
    }

    public /* synthetic */ UltimateBarXManager(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    public final void mo236976a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "<set-?>");
        this.f171320a = context;
    }

    /* renamed from: b */
    public final void mo236981b(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "owner");
        m264659f().put(String.valueOf(lifecycleOwner.hashCode()), true);
    }

    /* renamed from: c */
    public final boolean mo236984c(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "owner");
        Boolean bool = m264659f().get(String.valueOf(lifecycleOwner.hashCode()));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* renamed from: d */
    public final void mo236985d(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "owner");
        m264657d().put(String.valueOf(lifecycleOwner.hashCode()), true);
    }

    /* renamed from: e */
    public final void mo236986e(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "owner");
        m264658e().put(String.valueOf(lifecycleOwner.hashCode()), true);
    }

    /* renamed from: f */
    public final boolean mo236987f(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "owner");
        Boolean bool = m264657d().get(String.valueOf(lifecycleOwner.hashCode()));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* renamed from: g */
    public final boolean mo236988g(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "owner");
        Boolean bool = m264658e().get(String.valueOf(lifecycleOwner.hashCode()));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* renamed from: h */
    public final boolean mo236989h(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "owner");
        Boolean bool = m264660g().get(String.valueOf(lifecycleOwner.hashCode()));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* renamed from: i */
    public final void mo236990i(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "owner");
        m264660g().put(String.valueOf(lifecycleOwner.hashCode()), true);
    }

    /* renamed from: a */
    public final void mo236978a(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "owner");
        String valueOf = String.valueOf(lifecycleOwner.hashCode());
        m264657d().remove(valueOf);
        m264658e().remove(valueOf);
        m264659f().remove(valueOf);
        m264660g().remove(valueOf);
        m264661h().remove(valueOf);
        m264662i().remove(valueOf);
    }

    /* renamed from: j */
    public final BarConfig mo236991j(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "owner");
        BarConfig bVar = m264661h().get(String.valueOf(lifecycleOwner.hashCode()));
        if (bVar != null) {
            return bVar;
        }
        return BarConfig.f171313a.mo236974a();
    }

    /* renamed from: k */
    public final BarConfig mo236992k(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "owner");
        BarConfig bVar = m264662i().get(String.valueOf(lifecycleOwner.hashCode()));
        if (bVar != null) {
            return bVar;
        }
        return BarConfig.f171313a.mo236974a();
    }

    /* renamed from: a */
    public final void mo236977a(FragmentActivity fragmentActivity) {
        int i;
        int i2;
        Intrinsics.checkParameterIsNotNull(fragmentActivity, "activity");
        int i3 = -16777216;
        if (Build.VERSION.SDK_INT < 21) {
            i = -16777216;
        } else {
            Window window = fragmentActivity.getWindow();
            int i4 = 0;
            if (window != null) {
                i2 = window.getStatusBarColor();
            } else {
                i2 = 0;
            }
            Window window2 = fragmentActivity.getWindow();
            if (window2 != null) {
                i4 = window2.getNavigationBarColor();
            }
            i3 = i2;
            i = i4;
        }
        FragmentActivity fragmentActivity2 = fragmentActivity;
        BarConfig j = mo236991j(fragmentActivity2);
        j.mo236967c().mo236952a(i3);
        mo236979a(fragmentActivity2, j);
        BarConfig k = mo236992k(fragmentActivity2);
        k.mo236967c().mo236952a(i);
        k.mo236968c(m264656a(i));
        mo236982b(fragmentActivity2, k);
    }

    /* renamed from: b */
    public final void mo236982b(LifecycleOwner lifecycleOwner, BarConfig bVar) {
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "owner");
        Intrinsics.checkParameterIsNotNull(bVar, "config");
        m264662i().put(String.valueOf(lifecycleOwner.hashCode()), bVar);
    }

    /* renamed from: a */
    public final void mo236979a(LifecycleOwner lifecycleOwner, BarConfig bVar) {
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "owner");
        Intrinsics.checkParameterIsNotNull(bVar, "config");
        m264661h().put(String.valueOf(lifecycleOwner.hashCode()), bVar);
    }
}
