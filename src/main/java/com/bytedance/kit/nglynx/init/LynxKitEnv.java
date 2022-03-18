package com.bytedance.kit.nglynx.init;

import android.app.Application;
import com.C1711a;
import com.bytedance.ies.bullet.service.base.api.IServiceToken;
import com.bytedance.kit.nglynx.debug.LynxDevtoolProcessor;
import com.bytedance.kit.nglynx.debug.LynxDevtoolWrapper;
import com.bytedance.kit.nglynx.log.LynxKitALogDelegate;
import com.bytedance.kit.nglynx.model.LynxModuleWrapper;
import com.bytedance.kit.nglynx.resource.DefaultLynxRequestProvider;
import com.lynx.tasm.AbstractC26887e;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.AbstractC26624b;
import com.lynx.tasm.behavior.C26622a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/bytedance/kit/nglynx/init/LynxKitEnv;", "", "()V", "init", "", "lynxConfig", "Lcom/bytedance/kit/nglynx/init/LynxConfig;", "token", "Lcom/bytedance/ies/bullet/service/base/api/IServiceToken;", "x-lynx-kit_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.kit.nglynx.c.g */
public final class LynxKitEnv {

    /* renamed from: a */
    public static final LynxKitEnv f38582a = new LynxKitEnv();

    private LynxKitEnv() {
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Ljava/util/ArrayList;", "Lcom/lynx/tasm/behavior/Behavior;", "Lkotlin/collections/ArrayList;", "create"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.kit.nglynx.c.g$b */
    public static final class C14570b implements AbstractC26624b {

        /* renamed from: a */
        final /* synthetic */ LynxConfig f38584a;

        C14570b(LynxConfig cVar) {
            this.f38584a = cVar;
        }

        /* renamed from: b */
        public final ArrayList<C26622a> mo53784a() {
            ArrayList<C26622a> arrayList = new ArrayList<>();
            arrayList.addAll(this.f38584a.mo53747e());
            ILynxImageConfig i = this.f38584a.mo53751i();
            if (i != null) {
                arrayList.addAll(i.mo53742b());
            }
            return arrayList;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "loadLibrary"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.kit.nglynx.c.g$a */
    public static final class C14569a implements AbstractC26887e {

        /* renamed from: a */
        public static final C14569a f38583a = new C14569a();

        C14569a() {
        }

        @Override // com.lynx.tasm.AbstractC26887e
        public final void loadLibrary(String str) {
            try {
                C1711a.m7628a(str);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo53782a(LynxConfig cVar, IServiceToken jVar) {
        C14569a aVar;
        Intrinsics.checkParameterIsNotNull(cVar, "lynxConfig");
        Intrinsics.checkParameterIsNotNull(jVar, "token");
        LynxEnv.m96123e().mo94095c();
        if (cVar.mo53745c() == null) {
            aVar = C14569a.f38583a;
        } else {
            aVar = cVar.mo53745c();
        }
        ILynxImageConfig i = cVar.mo53751i();
        if (i != null) {
            LynxEnv e = LynxEnv.m96123e();
            Intrinsics.checkExpressionValueIsNotNull(e, "LynxEnv.inst()");
            e.mo94084a(i.mo53741a());
        }
        C14570b bVar = new C14570b(cVar);
        LynxEnv e2 = LynxEnv.m96123e();
        Intrinsics.checkExpressionValueIsNotNull(e2, "LynxEnv.inst()");
        e2.mo94087a(new DefaultLynxRequestProvider(jVar));
        LynxEnv e3 = LynxEnv.m96123e();
        Intrinsics.checkExpressionValueIsNotNull(e3, "LynxEnv.inst()");
        e3.mo94098d(cVar.mo53749g());
        LynxEnv e4 = LynxEnv.m96123e();
        Application a = LynxKitBase.f38578b.mo53777a();
        XResourceTemplateProvider d = cVar.mo53746d();
        if (d == null) {
            d = new XResourceTemplateProvider(jVar);
        }
        e4.mo94083a(a, aVar, d, bVar, null);
        LynxEnv e5 = LynxEnv.m96123e();
        Intrinsics.checkExpressionValueIsNotNull(e5, "LynxEnv.inst()");
        if (e5.mo94107n()) {
            LLog.m96417a(LynxKitALogDelegate.f38589c.mo53800a());
            LLog.m96412a(new LynxKitALogDelegate(jVar));
            ILynxCanvasConfig h = cVar.mo53750h();
            if (h != null) {
                h.mo53740a(LynxKitBase.f38578b.mo53777a(), aVar);
            }
        }
        for (T t : cVar.mo53748f().entrySet()) {
            LynxEnv.m96123e().mo94089a((String) t.getKey(), ((LynxModuleWrapper) t.getValue()).mo53809a(), ((LynxModuleWrapper) t.getValue()).mo53810b());
        }
        Function1<LynxEnv, Unit> a2 = cVar.mo53743a();
        LynxEnv e6 = LynxEnv.m96123e();
        Intrinsics.checkExpressionValueIsNotNull(e6, "LynxEnv.inst()");
        a2.invoke(e6);
        boolean z = false;
        if (!LynxKitBase.f38578b.mo53780b()) {
            LynxEnv.m96123e().mo94096c(false);
            LynxEnv.m96123e().mo94091a(false);
            return;
        }
        List<LynxDevtoolProcessor> b = cVar.mo53744b();
        if (b.size() > 0) {
            z = true;
        }
        if (!z) {
            b = null;
        }
        if (b != null) {
            LynxDevtoolWrapper.f38542a.mo53717a();
            if (b != null) {
                Iterator<T> it = b.iterator();
                while (it.hasNext()) {
                    LynxDevtoolWrapper.f38542a.mo53718a((LynxDevtoolProcessor) it.next());
                }
            }
        }
    }
}
