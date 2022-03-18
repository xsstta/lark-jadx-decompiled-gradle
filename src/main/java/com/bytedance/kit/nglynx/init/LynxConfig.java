package com.bytedance.kit.nglynx.init;

import android.app.Application;
import com.bytedance.ies.bullet.service.base.lynx.ILynxConfig;
import com.bytedance.kit.nglynx.debug.LynxDevtoolProcessor;
import com.bytedance.kit.nglynx.model.LynxModuleWrapper;
import com.lynx.tasm.AbstractC26887e;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.behavior.C26622a;
import com.lynx.tasm.provider.AbstractC26934b;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u001fB\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bJ\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rJ\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\rJ\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012J\u0006\u0010\u0015\u001a\u00020\u0016J\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018J\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aJ\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/bytedance/kit/nglynx/init/LynxConfig;", "Lcom/bytedance/ies/bullet/service/base/lynx/ILynxConfig;", "context", "Landroid/app/Application;", "builder", "Lcom/bytedance/kit/nglynx/init/LynxConfig$Builder;", "(Landroid/app/Application;Lcom/bytedance/kit/nglynx/init/LynxConfig$Builder;)V", "additionLynxInit", "Lkotlin/Function1;", "Lcom/lynx/tasm/LynxEnv;", "", "Lkotlin/ExtensionFunctionType;", "devtoolProcessors", "", "Lcom/bytedance/kit/nglynx/debug/LynxDevtoolProcessor;", "globalBehaviors", "Lcom/lynx/tasm/behavior/Behavior;", "globalModules", "", "", "Lcom/bytedance/kit/nglynx/model/LynxModuleWrapper;", "isCheckPropsSetter", "", "libraryLoader", "Lcom/lynx/tasm/INativeLibraryLoader;", "lynxCanvasConfig", "Lcom/bytedance/kit/nglynx/init/ILynxCanvasConfig;", "lynxImageConfig", "Lcom/bytedance/kit/nglynx/init/ILynxImageConfig;", "templateProvider", "Lcom/lynx/tasm/provider/AbsTemplateProvider;", "Builder", "x-lynx-kit_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.kit.nglynx.c.c */
public class LynxConfig implements ILynxConfig {

    /* renamed from: a */
    private final Builder f38555a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010=\u001a\u00020\u00002\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00170?J\u000e\u0010@\u001a\u00020\u00002\u0006\u0010A\u001a\u00020\u0013J\u001a\u0010B\u001a\u00020\u00002\u0012\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001aJ\u0006\u0010D\u001a\u00020EJ\u001f\u0010F\u001a\u00020\u00002\u0017\u0010G\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tJ\u000e\u0010+\u001a\u00020\u00002\u0006\u0010+\u001a\u00020,J\u000e\u00101\u001a\u00020\u00002\u0006\u00101\u001a\u000202J\u000e\u0010H\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010I\u001a\u00020\u00002\u0006\u0010J\u001a\u00020 J\u000e\u0010K\u001a\u00020\u00002\u0006\u0010%\u001a\u00020&J\u000e\u0010L\u001a\u00020\u00002\u0006\u0010J\u001a\u00020 J\u000e\u0010M\u001a\u00020\u00002\u0006\u00107\u001a\u000208R+\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0004R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0012X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001aX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020 X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001c\u0010%\u001a\u0004\u0018\u00010&X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001c\u0010+\u001a\u0004\u0018\u00010,X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001c\u00101\u001a\u0004\u0018\u000102X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001c\u00107\u001a\u0004\u0018\u000108X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<¨\u0006N"}, d2 = {"Lcom/bytedance/kit/nglynx/init/LynxConfig$Builder;", "", "context", "Landroid/app/Application;", "(Landroid/app/Application;)V", "additionInit", "Lkotlin/Function1;", "Lcom/lynx/tasm/LynxEnv;", "", "Lkotlin/ExtensionFunctionType;", "getAdditionInit$x_lynx_kit_release", "()Lkotlin/jvm/functions/Function1;", "setAdditionInit$x_lynx_kit_release", "(Lkotlin/jvm/functions/Function1;)V", "getContext", "()Landroid/app/Application;", "setContext", "devtoolProcessors", "", "Lcom/bytedance/kit/nglynx/debug/LynxDevtoolProcessor;", "getDevtoolProcessors$x_lynx_kit_release", "()Ljava/util/List;", "globalBehaviors", "Lcom/lynx/tasm/behavior/Behavior;", "getGlobalBehaviors$x_lynx_kit_release", "globalModules", "", "", "Lcom/bytedance/kit/nglynx/model/LynxModuleWrapper;", "getGlobalModules$x_lynx_kit_release", "()Ljava/util/Map;", "isCheckPropsSetter", "", "isCheckPropsSetter$x_lynx_kit_release", "()Z", "setCheckPropsSetter$x_lynx_kit_release", "(Z)V", "libraryLoader", "Lcom/lynx/tasm/INativeLibraryLoader;", "getLibraryLoader$x_lynx_kit_release", "()Lcom/lynx/tasm/INativeLibraryLoader;", "setLibraryLoader$x_lynx_kit_release", "(Lcom/lynx/tasm/INativeLibraryLoader;)V", "lynxCanvasConfig", "Lcom/bytedance/kit/nglynx/init/ILynxCanvasConfig;", "getLynxCanvasConfig$x_lynx_kit_release", "()Lcom/bytedance/kit/nglynx/init/ILynxCanvasConfig;", "setLynxCanvasConfig$x_lynx_kit_release", "(Lcom/bytedance/kit/nglynx/init/ILynxCanvasConfig;)V", "lynxImageConfig", "Lcom/bytedance/kit/nglynx/init/ILynxImageConfig;", "getLynxImageConfig$x_lynx_kit_release", "()Lcom/bytedance/kit/nglynx/init/ILynxImageConfig;", "setLynxImageConfig$x_lynx_kit_release", "(Lcom/bytedance/kit/nglynx/init/ILynxImageConfig;)V", "templateProvider", "Lcom/lynx/tasm/provider/AbsTemplateProvider;", "getTemplateProvider$x_lynx_kit_release", "()Lcom/lynx/tasm/provider/AbsTemplateProvider;", "setTemplateProvider$x_lynx_kit_release", "(Lcom/lynx/tasm/provider/AbsTemplateProvider;)V", "addBehaviors", "behaviors", "", "addLynxDevtoolProcessor", "lynxDevtoolProcessor", "addLynxModules", "modules", "build", "Lcom/bytedance/kit/nglynx/init/LynxConfig;", "lynxAdditionInit", "addition", "setCheckPropsSetter", "setDebug", "debug", "setLynxLibraryLoader", "setOuterDevtoolControl", "setTemplateProvider", "x-lynx-kit_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.kit.nglynx.c.c$a */
    public static final class Builder {

        /* renamed from: a */
        private boolean f38556a = true;

        /* renamed from: b */
        private final List<LynxDevtoolProcessor> f38557b = new ArrayList();

        /* renamed from: c */
        private AbstractC26887e f38558c;

        /* renamed from: d */
        private AbstractC26934b f38559d;

        /* renamed from: e */
        private final List<C26622a> f38560e = new ArrayList();

        /* renamed from: f */
        private final Map<String, LynxModuleWrapper> f38561f = new LinkedHashMap();

        /* renamed from: g */
        private ILynxCanvasConfig f38562g;

        /* renamed from: h */
        private ILynxImageConfig f38563h;

        /* renamed from: i */
        private Function1<? super LynxEnv, Unit> f38564i = C14564a.INSTANCE;

        /* renamed from: j */
        private Application f38565j;

        /* renamed from: a */
        public final boolean mo53758a() {
            return this.f38556a;
        }

        /* renamed from: c */
        public final AbstractC26887e mo53761c() {
            return this.f38558c;
        }

        /* renamed from: d */
        public final AbstractC26934b mo53762d() {
            return this.f38559d;
        }

        /* renamed from: e */
        public final List<C26622a> mo53763e() {
            return this.f38560e;
        }

        /* renamed from: f */
        public final Map<String, LynxModuleWrapper> mo53764f() {
            return this.f38561f;
        }

        /* renamed from: g */
        public final ILynxCanvasConfig mo53765g() {
            return this.f38562g;
        }

        /* renamed from: h */
        public final ILynxImageConfig mo53766h() {
            return this.f38563h;
        }

        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super com.lynx.tasm.LynxEnv, kotlin.Unit>, kotlin.jvm.functions.Function1<com.lynx.tasm.LynxEnv, kotlin.Unit> */
        /* renamed from: i */
        public final Function1<LynxEnv, Unit> mo53767i() {
            return this.f38564i;
        }

        /* renamed from: b */
        public final List<LynxDevtoolProcessor> mo53760b() {
            return this.f38557b;
        }

        /* renamed from: j */
        public final LynxConfig mo53768j() {
            return new LynxConfig(this.f38565j, this, null);
        }

        /* renamed from: b */
        public final Builder mo53759b(boolean z) {
            this.f38556a = z;
            return this;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/lynx/tasm/LynxEnv;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.bytedance.kit.nglynx.c.c$a$a */
        static final class C14564a extends Lambda implements Function1<LynxEnv, Unit> {
            public static final C14564a INSTANCE = new C14564a();

            C14564a() {
                super(1);
            }

            public final void invoke(LynxEnv lynxEnv) {
                Intrinsics.checkParameterIsNotNull(lynxEnv, "$receiver");
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(LynxEnv lynxEnv) {
                invoke(lynxEnv);
                return Unit.INSTANCE;
            }
        }

        /* renamed from: a */
        public final Builder mo53753a(ILynxImageConfig bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "lynxImageConfig");
            this.f38563h = bVar;
            return this;
        }

        /* renamed from: a */
        public final Builder mo53752a(LynxDevtoolProcessor aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "lynxDevtoolProcessor");
            this.f38557b.add(aVar);
            return this;
        }

        /* renamed from: a */
        public final Builder mo53754a(AbstractC26887e eVar) {
            Intrinsics.checkParameterIsNotNull(eVar, "libraryLoader");
            this.f38558c = eVar;
            return this;
        }

        public Builder(Application application) {
            Intrinsics.checkParameterIsNotNull(application, "context");
            this.f38565j = application;
        }

        /* renamed from: a */
        public final Builder mo53755a(AbstractC26934b bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "templateProvider");
            this.f38559d = bVar;
            return this;
        }

        /* renamed from: a */
        public final Builder mo53756a(List<? extends C26622a> list) {
            Intrinsics.checkParameterIsNotNull(list, "behaviors");
            this.f38560e.addAll(list);
            return this;
        }

        /* renamed from: a */
        public final Builder mo53757a(boolean z) {
            LynxKitBase.f38578b.mo53779a(z);
            return this;
        }
    }

    /* renamed from: a */
    public final Function1<LynxEnv, Unit> mo53743a() {
        return this.f38555a.mo53767i();
    }

    /* renamed from: b */
    public final List<LynxDevtoolProcessor> mo53744b() {
        return this.f38555a.mo53760b();
    }

    /* renamed from: c */
    public final AbstractC26887e mo53745c() {
        return this.f38555a.mo53761c();
    }

    /* renamed from: d */
    public final AbstractC26934b mo53746d() {
        return this.f38555a.mo53762d();
    }

    /* renamed from: e */
    public final List<C26622a> mo53747e() {
        return this.f38555a.mo53763e();
    }

    /* renamed from: f */
    public final Map<String, LynxModuleWrapper> mo53748f() {
        return this.f38555a.mo53764f();
    }

    /* renamed from: g */
    public final boolean mo53749g() {
        return this.f38555a.mo53758a();
    }

    /* renamed from: h */
    public final ILynxCanvasConfig mo53750h() {
        return this.f38555a.mo53765g();
    }

    /* renamed from: i */
    public final ILynxImageConfig mo53751i() {
        return this.f38555a.mo53766h();
    }

    private LynxConfig(Application application, Builder aVar) {
        this.f38555a = aVar;
        LynxKitBase.f38578b.mo53778a(application);
    }

    public /* synthetic */ LynxConfig(Application application, Builder aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(application, aVar);
    }
}
