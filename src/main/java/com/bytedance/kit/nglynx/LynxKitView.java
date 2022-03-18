package com.bytedance.kit.nglynx;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.bytedance.android.monitor.lynx.LynxMonitor;
import com.bytedance.android.monitor.lynx.config.LynxMonitorConfig;
import com.bytedance.android.monitor.lynx.jsb.LynxMonitorModule;
import com.bytedance.android.monitor.lynx.jsb.MonitorViewProvider;
import com.bytedance.android.monitor.lynx_helper.LynxMonitorHelper;
import com.bytedance.android.monitor.webview.AbstractC2677a;
import com.bytedance.ies.bullet.service.base.IMonitorReportService;
import com.bytedance.ies.bullet.service.base.IResourceLoaderService;
import com.bytedance.ies.bullet.service.base.MonitorConfig;
import com.bytedance.ies.bullet.service.base.ResourceInfo;
import com.bytedance.ies.bullet.service.base.api.IServiceToken;
import com.bytedance.ies.bullet.service.base.impl.BaseBulletService;
import com.bytedance.ies.bullet.service.base.lynx.ILynxViewDelegate;
import com.bytedance.ies.bullet.service.base.resourceloader.config.TaskConfig;
import com.bytedance.kit.nglynx.init.LynxGroupHolder;
import com.bytedance.kit.nglynx.init.LynxKit;
import com.bytedance.kit.nglynx.init.LynxKitBase;
import com.bytedance.kit.nglynx.model.LynxInitData;
import com.bytedance.kit.nglynx.model.LynxModuleWrapper;
import com.google.firebase.messaging.Constants;
import com.lynx.tasm.C26908k;
import com.lynx.tasm.C26910m;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.TemplateData;
import com.lynx.tasm.ThreadStrategyForRendering;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.C26622a;
import com.lynx.tasm.behavior.shadow.text.C26734o;
import com.lynx.tasm.navigator.NavigationModule;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 92\u00020\u0001:\u00019B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001a\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0002\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\fH\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0017\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0002\u0010#J\u001a\u0010$\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010%\u001a\u0004\u0018\u00010\u0012H\u0016J\u0010\u0010$\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\u0012H\u0016J\u0010\u0010'\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\u0012H\u0002J\b\u0010(\u001a\u00020\u001eH\u0016J\b\u0010)\u001a\u00020\u001eH\u0016J\b\u0010*\u001a\u00020\u001eH\u0002J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010+\u001a\u00020\u001eH\u0016J \u0010,\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020\u00122\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010.H\u0016J\u001c\u00100\u001a\u00020\u001e2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020/02H\u0016J\u0018\u00103\u001a\u00020\u001e2\u0006\u00104\u001a\u0002052\u0006\u0010\u001c\u001a\u000206H\u0002J\u0018\u00107\u001a\u000205*\u0002052\n\b\u0002\u00108\u001a\u0004\u0018\u00010\fH\u0002R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u0002\n\u0000¨\u0006:"}, d2 = {"Lcom/bytedance/kit/nglynx/LynxKitView;", "Lcom/bytedance/ies/bullet/service/base/lynx/ILynxViewDelegate;", "context", "Lcom/bytedance/ies/bullet/service/base/api/IServiceToken;", "bulletService", "Lcom/bytedance/ies/bullet/service/base/impl/BaseBulletService;", "(Lcom/bytedance/ies/bullet/service/base/api/IServiceToken;Lcom/bytedance/ies/bullet/service/base/impl/BaseBulletService;)V", "getContext", "()Lcom/bytedance/ies/bullet/service/base/api/IServiceToken;", "setContext", "(Lcom/bytedance/ies/bullet/service/base/api/IServiceToken;)V", "initParams", "Lcom/bytedance/kit/nglynx/LynxKitInitParams;", "lynxMonitorConfig", "Lcom/bytedance/android/monitor/lynx/config/LynxMonitorConfig;", "lynxMonitorProvider", "Lcom/bytedance/android/monitor/lynx/jsb/MonitorViewProvider;", "rawUrl", "", "realView", "Landroid/view/View;", "resourceLoader", "Lcom/bytedance/ies/bullet/service/base/IResourceLoaderService;", "templateArray", "", "createLynxView", "Lcom/lynx/tasm/LynxView;", "Landroid/content/Context;", "params", "destroy", "", "getStrategyById", "Lcom/lynx/tasm/ThreadStrategyForRendering;", "id", "", "(Ljava/lang/Integer;)Lcom/lynx/tasm/ThreadStrategyForRendering;", "load", "baseUrl", "url", "loadInner", "onHide", "onShow", "preloadFont", "reload", "sendEvent", "eventName", "", "", "updateData", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "useAsyncLayout", "lynxViewBuilder", "Lcom/lynx/tasm/LynxViewBuilder;", "Lcom/bytedance/kit/nglynx/LynxAsyncLayoutParam;", "init", "lynxKitInitParams", "Companion", "x-lynx-kit_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.kit.nglynx.e */
public final class LynxKitView implements ILynxViewDelegate {

    /* renamed from: a */
    public static int f38593a = 0;

    /* renamed from: b */
    public static final String f38594b = f38594b;

    /* renamed from: c */
    public static final Companion f38595c = new Companion(null);

    /* renamed from: d */
    private View f38596d;

    /* renamed from: e */
    private String f38597e;

    /* renamed from: f */
    private byte[] f38598f;

    /* renamed from: g */
    private LynxKitInitParams f38599g;

    /* renamed from: h */
    private IResourceLoaderService f38600h;

    /* renamed from: i */
    private LynxMonitorConfig f38601i;

    /* renamed from: j */
    private final MonitorViewProvider f38602j = new MonitorViewProvider();

    /* renamed from: k */
    private IServiceToken f38603k;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nXD¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/bytedance/kit/nglynx/LynxKitView$Companion;", "", "()V", "CONTAINER_ID", "", "getCONTAINER_ID", "()I", "setCONTAINER_ID", "(I)V", "LYNX_PREFIX", "", "getLYNX_PREFIX", "()Ljava/lang/String;", "x-lynx-kit_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.kit.nglynx.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.IKitViewService
    /* renamed from: a */
    public View mo52662a() {
        return this.f38596d;
    }

    /* renamed from: c */
    public IServiceToken mo53803c() {
        return this.f38603k;
    }

    @Override // com.bytedance.ies.bullet.service.base.IKitViewService
    /* renamed from: b */
    public void mo52664b() {
        String b;
        LynxKitInitParams cVar = this.f38599g;
        if (cVar != null && (b = cVar.mo53728b()) != null) {
            LynxGroupHolder.f38566a.mo53770a(b);
        }
    }

    /* renamed from: d */
    private final void m59009d() {
        String str;
        boolean z;
        LynxKitInitParams cVar = this.f38599g;
        String str2 = null;
        if (cVar != null) {
            str = cVar.mo53738i();
        } else {
            str = null;
        }
        String str3 = str;
        if (str3 == null || str3.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            str2 = str;
        }
        if (str2 != null && !C26734o.m96875a(str2)) {
            C26734o.m96872a(LynxKitBase.f38578b.mo53777a().getAssets(), str2, "font/");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ies/bullet/service/base/ResourceInfo;", "invoke", "com/bytedance/kit/nglynx/LynxKitView$load$4$2"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.kit.nglynx.e$b */
    static final class C14575b extends Lambda implements Function1<ResourceInfo, Unit> {
        final /* synthetic */ String $url$inlined;
        final /* synthetic */ LynxKitView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14575b(LynxKitView eVar, String str) {
            super(1);
            this.this$0 = eVar;
            this.$url$inlined = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ResourceInfo mVar) {
            invoke(mVar);
            return Unit.INSTANCE;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0056, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0057, code lost:
            kotlin.io.C69101b.m265907a(r0, r9);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x005a, code lost:
            throw r1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void invoke(com.bytedance.ies.bullet.service.base.ResourceInfo r9) {
            /*
            // Method dump skipped, instructions count: 142
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.kit.nglynx.LynxKitView.C14575b.invoke(com.bytedance.ies.bullet.service.base.m):void");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "com/bytedance/kit/nglynx/LynxKitView$load$4$3"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.kit.nglynx.e$c */
    static final class C14576c extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ String $url$inlined;
        final /* synthetic */ LynxKitView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14576c(LynxKitView eVar, String str) {
            super(1);
            this.this$0 = eVar;
            this.$url$inlined = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke(th);
            return Unit.INSTANCE;
        }

        public final void invoke(Throwable th) {
            Intrinsics.checkParameterIsNotNull(th, "it");
            String a = LynxKit.f38569a.mo53771a();
            LLog.m96429e(a, "ResoureLoader template load error, " + th.getMessage());
            this.this$0.mo53802b(this.$url$inlined);
        }
    }

    /* renamed from: b */
    public final void mo53802b(String str) {
        LynxInitData g;
        this.f38597e = str;
        View view = this.f38596d;
        TemplateData templateData = null;
        if (view == null || !(view instanceof LynxView)) {
            view = null;
        }
        if (view != null) {
            LynxView lynxView = (LynxView) view;
            LynxKitInitParams cVar = this.f38599g;
            if (!(cVar == null || (g = cVar.mo53735g()) == null)) {
                templateData = g.mo53806a();
            }
            if (templateData == null) {
                templateData = TemplateData.m96223a();
            }
            lynxView.renderTemplateUrl(str, templateData);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.lynx.tasm.LynxView");
    }

    /* renamed from: a */
    private final ThreadStrategyForRendering m59006a(Integer num) {
        int id = ThreadStrategyForRendering.ALL_ON_UI.id();
        if (num != null && num.intValue() == id) {
            return ThreadStrategyForRendering.ALL_ON_UI;
        }
        int id2 = ThreadStrategyForRendering.MOST_ON_TASM.id();
        if (num != null && num.intValue() == id2) {
            return ThreadStrategyForRendering.MOST_ON_TASM;
        }
        int id3 = ThreadStrategyForRendering.PART_ON_LAYOUT.id();
        if (num != null && num.intValue() == id3) {
            return ThreadStrategyForRendering.PART_ON_LAYOUT;
        }
        int id4 = ThreadStrategyForRendering.MULTI_THREADS.id();
        if (num != null && num.intValue() == id4) {
            return ThreadStrategyForRendering.MULTI_THREADS;
        }
        return ThreadStrategyForRendering.ALL_ON_UI;
    }

    @Override // com.bytedance.ies.bullet.service.base.IKitViewService
    /* renamed from: a */
    public void mo52663a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "url");
        if (this.f38596d != null) {
            IResourceLoaderService iResourceLoaderService = this.f38600h;
            if (iResourceLoaderService == null) {
                mo53802b(str);
            } else if (iResourceLoaderService != null) {
                TaskConfig jVar = new TaskConfig(null, 1, null);
                jVar.mo52750a(mo53803c());
                try {
                    Uri parse = Uri.parse(str);
                    String queryParameter = parse.getQueryParameter("surl");
                    if (queryParameter != null) {
                        Intrinsics.checkExpressionValueIsNotNull(queryParameter, "it");
                        jVar.mo52756c(queryParameter);
                    }
                    String queryParameter2 = parse.getQueryParameter("channel");
                    if (queryParameter2 != null) {
                        Intrinsics.checkExpressionValueIsNotNull(queryParameter2, "it");
                        jVar.mo52752a(queryParameter2);
                    }
                    String queryParameter3 = parse.getQueryParameter("bundle");
                    if (queryParameter3 != null) {
                        Intrinsics.checkExpressionValueIsNotNull(queryParameter3, "it");
                        jVar.mo52754b(queryParameter3);
                    }
                    jVar.mo52749a(1);
                    String queryParameter4 = parse.getQueryParameter("dynamic");
                    if (queryParameter4 != null) {
                        Intrinsics.checkExpressionValueIsNotNull(queryParameter4, "it");
                        jVar.mo52749a(Integer.parseInt(queryParameter4));
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                iResourceLoaderService.loadAsync(str, jVar, new C14575b(this, str), new C14576c(this, str));
            }
        }
    }

    /* renamed from: a */
    private final void m59008a(C26910m mVar, LynxAsyncLayoutParam bVar) {
        boolean z;
        int i;
        Boolean b = bVar.mo53715b();
        if (b != null) {
            z = b.booleanValue();
        } else {
            z = false;
        }
        mVar.mo95733b(z);
        mVar.mo95729b(m59006a(bVar.mo53716c()));
        Integer a = bVar.mo53714a();
        if (a != null) {
            i = a.intValue();
        } else {
            i = 0;
        }
        mVar.mo95728b(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    /* renamed from: a */
    private final LynxView m59005a(Context context, LynxKitInitParams cVar) {
        MonitorConfig b;
        JSONObject d;
        Iterator<String> keys;
        C26910m mVar = new C26910m();
        m59007a(mVar, cVar);
        LynxView a = mVar.mo95734a(context);
        a.addLynxViewClient(new DefaultLynxViewClient(cVar, this.f38600h, mo53803c()));
        IMonitorReportService eVar = (IMonitorReportService) mo53803c().mo52657a(IMonitorReportService.class);
        if (!(eVar == null || (b = eVar.mo52616b()) == null || (d = b.mo52674d()) == null || (keys = d.keys()) == null)) {
            while (keys.hasNext()) {
                String next = keys.next();
                Object opt = d.opt(next);
                if (opt != null) {
                    LynxMonitor a2 = LynxMonitor.f8455b.mo11508a();
                    Intrinsics.checkExpressionValueIsNotNull(a, "lynxView");
                    Intrinsics.checkExpressionValueIsNotNull(next, "key");
                    a2.mo11500a(a, next, opt);
                }
            }
        }
        this.f38602j.mo11546a(a);
        LynxMonitorConfig bVar = this.f38601i;
        if (bVar != null) {
            Intrinsics.checkExpressionValueIsNotNull(a, "lynxView");
            LynxMonitorHelper.m11137a(a, bVar);
        }
        return a;
    }

    public LynxKitView(IServiceToken jVar, BaseBulletService aVar) {
        String str;
        String str2;
        boolean z;
        String str3;
        MonitorConfig b;
        MonitorConfig b2;
        Intrinsics.checkParameterIsNotNull(jVar, "context");
        Intrinsics.checkParameterIsNotNull(aVar, "bulletService");
        this.f38603k = jVar;
        final IMonitorReportService eVar = (IMonitorReportService) aVar.mo52629a(IMonitorReportService.class);
        Map<String, Object> map = null;
        if (eVar == null || (b2 = eVar.mo52616b()) == null) {
            str = null;
        } else {
            str = b2.mo52672b();
        }
        LynxMonitorConfig bVar = new LynxMonitorConfig((eVar == null || (b = eVar.mo52616b()) == null || (str2 = b.mo52671a()) == null) ? "" : str2, new AbstractC2677a() {
            /* class com.bytedance.kit.nglynx.LynxKitView.C145741 */

            @Override // com.bytedance.android.monitor.webview.AbstractC2677a
            /* renamed from: a */
            public void mo11563a(String str, int i, JSONObject jSONObject, JSONObject jSONObject2) {
                IMonitorReportService eVar = eVar;
                if (eVar != null) {
                    eVar.mo52614a(str, i, jSONObject, jSONObject2);
                }
            }
        });
        bVar.mo11483b(str);
        String str4 = str;
        if (str4 == null || str4.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str3 = "detect_when_load_success";
        } else {
            str3 = "detect_when_detach";
        }
        bVar.mo11482a(str3);
        this.f38601i = bVar;
        this.f38600h = (IResourceLoaderService) aVar.mo52629a(IResourceLoaderService.class);
        LynxKitInitParams cVar = (LynxKitInitParams) mo53803c().mo52659b().mo52654b().mo52632a(LynxKitInitParams.class);
        if (cVar != null) {
            this.f38599g = cVar;
            Context c = mo53803c().mo52659b().mo52655c();
            if (c == null) {
                Intrinsics.throwNpe();
            }
            this.f38596d = m59005a(c, cVar);
            Map<String, Object> c2 = cVar.mo53730c();
            map = true ^ c2.containsKey("containerID") ? c2 : map;
            if (map != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(f38594b);
                int i = f38593a;
                f38593a = i + 1;
                sb.append(i);
                map.put("containerID", sb.toString());
            }
            View view = this.f38596d;
            if (view != null) {
                ((LynxView) view).setGlobalProps(TemplateData.m96225a(cVar.mo53730c()));
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.lynx.tasm.LynxView");
            }
        }
        m59009d();
    }

    /* renamed from: a */
    private final C26910m m59007a(C26910m mVar, LynxKitInitParams cVar) {
        List<C26622a> f;
        Map<String, LynxModuleWrapper> e;
        LynxAsyncLayoutParam h;
        C26908k a;
        if (!(cVar == null || (a = cVar.mo53723a()) == null)) {
            mVar.mo95731b(a);
        }
        if (!(cVar == null || (h = cVar.mo53736h()) == null)) {
            m59008a(mVar, h);
        }
        mVar.mo95727a(NavigationModule.NAME, NavigationModule.class, null);
        mVar.mo95727a("hybridMonitor", LynxMonitorModule.class, this.f38602j);
        if (!(cVar == null || (e = cVar.mo53732e()) == null)) {
            for (Map.Entry<String, LynxModuleWrapper> entry : e.entrySet()) {
                mVar.mo95727a(entry.getKey(), entry.getValue().mo53809a(), entry.getValue().mo53810b());
            }
        }
        if (!(cVar == null || (f = cVar.mo53734f()) == null)) {
            mVar.mo95732b(f);
        }
        return mVar;
    }

    /* renamed from: a */
    public void mo53801a(byte[] bArr, String str) {
        LynxInitData g;
        Intrinsics.checkParameterIsNotNull(bArr, "templateArray");
        this.f38598f = bArr;
        this.f38597e = str;
        View view = this.f38596d;
        TemplateData templateData = null;
        if (view == null || !(view instanceof LynxView)) {
            view = null;
        }
        if (view != null) {
            LynxView lynxView = (LynxView) view;
            LynxKitInitParams cVar = this.f38599g;
            if (!(cVar == null || (g = cVar.mo53735g()) == null)) {
                templateData = g.mo53806a();
            }
            lynxView.renderTemplateWithBaseUrl(bArr, templateData, str);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.lynx.tasm.LynxView");
    }
}
