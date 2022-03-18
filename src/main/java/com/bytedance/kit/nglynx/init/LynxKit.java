package com.bytedance.kit.nglynx.init;

import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.ies.bullet.service.base.IResourceLoaderService;
import com.bytedance.ies.bullet.service.base.ResourceInfo;
import com.bytedance.ies.bullet.service.base.api.IServiceToken;
import com.bytedance.ies.bullet.service.base.resourceloader.config.TaskConfig;
import com.bytedance.sysoptimizer.TypeFaceLancet;
import com.bytedance.sysoptimizer.TypeFaceOptimizer;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.AbstractC26684l;
import com.lynx.tasm.behavior.shadow.text.C26734o;
import com.lynx.tasm.common.C26872a;
import com.lynx.tasm.fontface.FontFace;
import com.lynx.tasm.p1220b.C26603c;
import com.lynx.tasm.utils.C26958l;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0016\u001a\u00020\fJ\b\u0010\u0017\u001a\u00020\u0013H\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000f0\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/bytedance/kit/nglynx/init/LynxKit;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "fontFaceLoader", "Lcom/lynx/tasm/loader/LynxFontFaceLoader$Loader;", "initLock", "Ljava/util/concurrent/atomic/AtomicBoolean;", "initedFlag", "", "mFontCache", "Ljava/util/concurrent/ConcurrentHashMap;", "Landroid/graphics/Typeface;", "token", "Lcom/bytedance/ies/bullet/service/base/api/IServiceToken;", "init", "", "lynxConfig", "Lcom/bytedance/kit/nglynx/init/LynxConfig;", "ready", "setFontLoader", "x-lynx-kit_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.kit.nglynx.c.e */
public final class LynxKit {

    /* renamed from: a */
    public static final LynxKit f38569a = new LynxKit();

    /* renamed from: b */
    private static final String f38570b = f38570b;

    /* renamed from: c */
    private static final AtomicBoolean f38571c = new AtomicBoolean(false);

    /* renamed from: d */
    private static boolean f38572d;

    /* renamed from: e */
    private static C26603c.AbstractC26606a f38573e;

    /* renamed from: f */
    private static ConcurrentHashMap<String, Typeface> f38574f = new ConcurrentHashMap<>();

    /* renamed from: g */
    private static IServiceToken f38575g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tJ(\u0010\n\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014¨\u0006\u000b"}, d2 = {"com/bytedance/kit/nglynx/init/LynxKit$setFontLoader$1", "Lcom/lynx/tasm/loader/LynxFontFaceLoader$Loader;", "loadFromBase64", "Landroid/graphics/Typeface;", "context", "Lcom/lynx/tasm/behavior/LynxContext;", ShareHitPoint.f121869d, "Lcom/lynx/tasm/fontface/FontFace$TYPE;", "src", "", "onLoadFontFace", "x-lynx-kit_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.kit.nglynx.c.e$a */
    public static final class C14565a extends C26603c.AbstractC26606a {
        C14565a() {
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ies/bullet/service/base/ResourceInfo;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.bytedance.kit.nglynx.c.e$a$a */
        static final class C14566a extends Lambda implements Function1<ResourceInfo, Unit> {
            final /* synthetic */ String $src;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14566a(String str) {
                super(1);
                this.$src = str;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ResourceInfo mVar) {
                invoke(mVar);
                return Unit.INSTANCE;
            }

            public static Typeface INVOKESTATIC_com_bytedance_kit_nglynx_init_LynxKit$setFontLoader$1$onLoadFontFace$2_com_bytedance_sysoptimizer_TypeFaceLancet_createFromFile(File file) {
                String path;
                if (TypeFaceOptimizer.getSwitch() && (path = file.getPath()) != null) {
                    if (TypeFaceLancet.cache.contains(path)) {
                        return (Typeface) TypeFaceLancet.cache.get(path);
                    }
                    Typeface createFromFile = Typeface.createFromFile(file);
                    if (createFromFile != null) {
                        TypeFaceLancet.cache.put(path, createFromFile);
                        return createFromFile;
                    }
                }
                return Typeface.createFromFile(file);
            }

            public final void invoke(ResourceInfo mVar) {
                boolean z;
                Intrinsics.checkParameterIsNotNull(mVar, "it");
                String c = mVar.mo52705c();
                if (c == null || c.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    try {
                        String c2 = mVar.mo52705c();
                        if (c2 == null) {
                            Intrinsics.throwNpe();
                        }
                        Typeface INVOKESTATIC_com_bytedance_kit_nglynx_init_LynxKit$setFontLoader$1$onLoadFontFace$2_com_bytedance_sysoptimizer_TypeFaceLancet_createFromFile = INVOKESTATIC_com_bytedance_kit_nglynx_init_LynxKit$setFontLoader$1$onLoadFontFace$2_com_bytedance_sysoptimizer_TypeFaceLancet_createFromFile(new File(c2));
                        if (INVOKESTATIC_com_bytedance_kit_nglynx_init_LynxKit$setFontLoader$1$onLoadFontFace$2_com_bytedance_sysoptimizer_TypeFaceLancet_createFromFile != null) {
                            LynxKit eVar = LynxKit.f38569a;
                            LynxKit.f38574f.put(this.$src, INVOKESTATIC_com_bytedance_kit_nglynx_init_LynxKit$setFontLoader$1$onLoadFontFace$2_com_bytedance_sysoptimizer_TypeFaceLancet_createFromFile);
                            String a = LynxKit.f38569a.mo53771a();
                            LLog.m96425c(a, "cache font for " + this.$src);
                        }
                    } catch (Exception e) {
                        LLog.m96429e(LynxKit.f38569a.mo53771a(), e.getMessage());
                    }
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.bytedance.kit.nglynx.c.e$a$b */
        static final class C14567b extends Lambda implements Function1<Throwable, Unit> {
            public static final C14567b INSTANCE = new C14567b();

            C14567b() {
                super(1);
            }

            public final void invoke(Throwable th) {
                Intrinsics.checkParameterIsNotNull(th, "it");
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke(th);
                return Unit.INSTANCE;
            }
        }

        /* access modifiers changed from: protected */
        @Override // com.lynx.tasm.p1220b.C26603c.AbstractC26606a
        /* renamed from: a */
        public Typeface mo50289a(AbstractC26684l lVar, FontFace.TYPE type, String str) {
            boolean z;
            String str2 = str;
            if (str2 == null || str2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return null;
            }
            IResourceLoaderService iResourceLoaderService = (IResourceLoaderService) LynxKit.m58975a(LynxKit.f38569a).mo52657a(IResourceLoaderService.class);
            if (iResourceLoaderService != null) {
                TaskConfig jVar = new TaskConfig(null, 1, null);
                jVar.mo52750a(LynxKit.m58975a(LynxKit.f38569a));
                iResourceLoaderService.loadAsync(str, jVar, new C14566a(str), C14567b.INSTANCE);
            }
            LynxKit eVar = LynxKit.f38569a;
            Typeface typeface = (Typeface) LynxKit.f38574f.get(str);
            if (typeface != null) {
                return typeface;
            }
            return mo53773b(lVar, type, str);
        }

        /* renamed from: b */
        public final Typeface mo53773b(AbstractC26684l lVar, FontFace.TYPE type, String str) {
            String str2 = str;
            if (TextUtils.isEmpty(str2) || type == FontFace.TYPE.LOCAL) {
                return null;
            }
            if (str == null) {
                Intrinsics.throwNpe();
            }
            int indexOf$default = StringsKt.indexOf$default((CharSequence) str2, "base64,", 0, false, 6, (Object) null);
            if (!StringsKt.startsWith$default(str, "data:", false, 2, (Object) null) || indexOf$default == -1) {
                return null;
            }
            String substring = str.substring(indexOf$default + 7);
            Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.String).substring(startIndex)");
            try {
                return C26958l.m97965a(lVar, Base64.decode(substring, 0));
            } catch (Exception e) {
                mo94486a(lVar, e.getMessage());
                return null;
            }
        }
    }

    private LynxKit() {
    }

    /* renamed from: a */
    public final String mo53771a() {
        return f38570b;
    }

    /* renamed from: b */
    private final void m58977b() {
        C14565a aVar = new C14565a();
        f38573e = aVar;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fontFaceLoader");
        }
        C26603c.m96408a(aVar);
        C26734o.m96873a(C14568b.f38576a);
    }

    /* renamed from: a */
    public static final /* synthetic */ IServiceToken m58975a(LynxKit eVar) {
        IServiceToken jVar = f38575g;
        if (jVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("token");
        }
        return jVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Landroid/graphics/Typeface;", "kotlin.jvm.PlatformType", "fontFamilyName", "", "style", "", "getTypeface"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.kit.nglynx.c.e$b */
    public static final class C14568b implements C26734o.AbstractC26735a {

        /* renamed from: a */
        public static final C14568b f38576a = new C14568b();

        C14568b() {
        }

        @Override // com.lynx.tasm.behavior.shadow.text.C26734o.AbstractC26735a
        /* renamed from: a */
        public final Typeface mo53776a(String str, int i) {
            return C26734o.m96876b(LynxKitBase.f38578b.mo53777a().getAssets(), str, i, "font/");
        }
    }

    /* renamed from: a */
    public final void mo53772a(LynxConfig cVar, IServiceToken jVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "lynxConfig");
        Intrinsics.checkParameterIsNotNull(jVar, "token");
        if (f38572d || f38571c.compareAndSet(false, true)) {
            f38575g = jVar;
            try {
                m58977b();
                C26872a.f66718a.mo95653a(LynxKitBase.f38578b.mo53780b());
                LynxKitEnv.f38582a.mo53782a(cVar, jVar);
                LynxEnv e = LynxEnv.m96123e();
                Intrinsics.checkExpressionValueIsNotNull(e, "LynxEnv.inst()");
                if (e.mo94107n()) {
                    f38572d = true;
                } else {
                    f38571c.set(false);
                    throw new RuntimeException("Lynx so Init Failed");
                }
            } catch (Throwable th) {
                f38571c.set(false);
                jVar.printReject(th, "LynxKit Init Failed");
                th.printStackTrace();
            }
        }
    }
}
