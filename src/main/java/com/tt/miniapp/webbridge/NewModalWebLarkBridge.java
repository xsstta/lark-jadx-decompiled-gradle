package com.tt.miniapp.webbridge;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.CharacterUtils;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.component.openplatform.core.plugin.op.C25379c;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapp.webbridge.aysnc.C67303a;
import com.tt.miniapp.webbridge.sync.C67323a;
import com.tt.option.ext.AbstractC67619e;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\bH\u0002J$\u0010\u000f\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0012\u001a\u00020\u0003H\u0014J\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\u0010\u001a\u0004\u0018\u00010\bH\u0014R\u000e\u0010\u0007\u001a\u00020\bXD¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/tt/miniapp/webbridge/NewModalWebLarkBridge;", "Lcom/tt/miniapp/webbridge/NewBrandRenderBridge;", "webViewId", "", "appContext", "Lcom/bytedance/ee/lark/infra/sandbox/context/IAppContext;", "(ILcom/bytedance/ee/lark/infra/sandbox/context/IAppContext;)V", "TAG", "", "interceptInvokeList", "", "callbackWebView", "", "callbackId", "msg", "handleInterceptedInvoke", "event", "param", "callBackId", "interceptInvoke", "", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.tt.miniapp.webbridge.d */
public final class NewModalWebLarkBridge extends NewBrandRenderBridge {

    /* renamed from: c */
    private final String f169863c = "ModalWebLarkBridge";

    /* renamed from: d */
    private final List<String> f169864d = CollectionsKt.listOf((Object[]) new String[]{"getHostInfoSync", "hostLogin", "callHostMethod"});

    /* renamed from: e */
    private final int f169865e;

    /* renamed from: f */
    private final IAppContext f169866f;

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapp.webbridge.NewBrandRenderBridge
    /* renamed from: a */
    public boolean mo233987a(String str) {
        return CollectionsKt.contains(this.f169864d, str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "callbackId", "", "msg", "", "kotlin.jvm.PlatformType", "callback"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.tt.miniapp.webbridge.d$a */
    static final class C67313a implements AbstractC67619e {

        /* renamed from: a */
        final /* synthetic */ NewModalWebLarkBridge f169867a;

        C67313a(NewModalWebLarkBridge dVar) {
            this.f169867a = dVar;
        }

        @Override // com.tt.option.ext.AbstractC67619e
        public final void callback(int i, String str) {
            NewModalWebLarkBridge dVar = this.f169867a;
            Intrinsics.checkExpressionValueIsNotNull(str, "msg");
            dVar.mo233990a(i, str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "callbackId", "", "msg", "", "kotlin.jvm.PlatformType", "callback"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.tt.miniapp.webbridge.d$b */
    static final class C67314b implements AbstractC67619e {

        /* renamed from: a */
        final /* synthetic */ NewModalWebLarkBridge f169868a;

        C67314b(NewModalWebLarkBridge dVar) {
            this.f169868a = dVar;
        }

        @Override // com.tt.option.ext.AbstractC67619e
        public final void callback(int i, String str) {
            NewModalWebLarkBridge dVar = this.f169868a;
            Intrinsics.checkExpressionValueIsNotNull(str, "msg");
            dVar.mo233990a(i, str);
        }
    }

    /* renamed from: a */
    public final void mo233990a(int i, String str) {
        AppbrandApplicationImpl inst = AppbrandApplicationImpl.getInst(this.f169866f);
        Intrinsics.checkExpressionValueIsNotNull(inst, "AppbrandApplicationImpl.getInst(appContext)");
        RenderViewManager renderViewManager = inst.getRenderViewManager();
        if (renderViewManager != null) {
            renderViewManager.invokeHandler(this.f169865e, i, str);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewModalWebLarkBridge(int i, IAppContext iAppContext) {
        super(iAppContext, null, 0, 6, null);
        Intrinsics.checkParameterIsNotNull(iAppContext, "appContext");
        this.f169865e = i;
        this.f169866f = iAppContext;
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapp.webbridge.NewBrandRenderBridge
    /* renamed from: a */
    public String mo233985a(String str, String str2, int i) {
        if (TextUtils.isEmpty(str)) {
            AppBrandLogger.m52828d(this.f169863c, "event is null");
            String empty = CharacterUtils.empty();
            Intrinsics.checkExpressionValueIsNotNull(empty, "CharacterUtils.empty()");
            return empty;
        }
        AppBrandLogger.m52828d(this.f169863c, "handleInterceptedInvoke event ", str, " param ", str2, " callbackId ", Integer.valueOf(i));
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -734965087) {
                if (hashCode != -238006873) {
                    if (hashCode == 180138151 && str.equals("getHostInfoSync")) {
                        C67323a aVar = new C67323a(str2);
                        aVar.mo232450a(this.f169866f);
                        String b = aVar.mo87634b();
                        Intrinsics.checkExpressionValueIsNotNull(b, "apiGetHostInfoSyncCtrl.act()");
                        return b;
                    }
                } else if (str.equals("callHostMethod")) {
                    C25379c cVar = new C25379c(str2, i, new C67313a(this));
                    cVar.setAppContext(this.f169866f);
                    cVar.doAct();
                    String empty2 = CharacterUtils.empty();
                    Intrinsics.checkExpressionValueIsNotNull(empty2, "CharacterUtils.empty()");
                    return empty2;
                }
            } else if (str.equals("hostLogin")) {
                C67303a aVar2 = new C67303a(str2, i, new C67314b(this));
                aVar2.setAppContext(this.f169866f);
                aVar2.doAct();
                String empty22 = CharacterUtils.empty();
                Intrinsics.checkExpressionValueIsNotNull(empty22, "CharacterUtils.empty()");
                return empty22;
            }
        }
        String str3 = this.f169863c;
        AppBrandLogger.m52829e(str3, "handleInterceptedInvoke event is " + str + ", no handle");
        String empty222 = CharacterUtils.empty();
        Intrinsics.checkExpressionValueIsNotNull(empty222, "CharacterUtils.empty()");
        return empty222;
    }
}
