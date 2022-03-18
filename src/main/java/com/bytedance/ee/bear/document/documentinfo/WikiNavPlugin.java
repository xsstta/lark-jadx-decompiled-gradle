package com.bytedance.ee.bear.document.documentinfo;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ee.bear.DocObjInfo;
import com.bytedance.ee.bear.WikiNavInfo;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.contract.doc.DocsOpenSource;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.DocViewModel;
import com.bytedance.ee.bear.document.DocumentPlugin;
import com.bytedance.ee.bear.document.follow.FollowPlugin;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.bear.route.RouteBean;
import com.bytedance.ee.log.C13479a;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\tH\u0002J\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rJ\u0006\u0010\u000f\u001a\u00020\tJ\u0012\u0010\u0010\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0012\u0010\u0013\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0006\u0010\u0014\u001a\u00020\tJ\u0006\u0010\u0015\u001a\u00020\tR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/bytedance/ee/bear/document/documentinfo/WikiNavPlugin;", "Lcom/bytedance/ee/bear/document/DocumentPlugin;", "()V", "mObserver", "Landroidx/lifecycle/Observer;", "Lcom/bytedance/ee/bear/document/documentinfo/DocumentInfo;", "getMObserver", "()Landroidx/lifecycle/Observer;", "checkFinish", "", "generateRouteBean", "Lcom/bytedance/ee/bear/route/RouteBean;", "generateWikiUrl", "", "wikiToken", "getDocumentInfoSuccess", "onAttachToHost", "host", "Lcom/bytedance/ee/bear/document/DocumentPluginHost;", "onDetachFromHost", "routeToWiki", "sendMoveToWikiToVC", "Companion", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class WikiNavPlugin extends DocumentPlugin {
    public static final Companion Companion = new Companion(null);
    private final AbstractC1178x<DocumentInfo> mObserver = new C5744b(this);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ee/bear/document/documentinfo/WikiNavPlugin$Companion;", "", "()V", "FROM_MOV_WIKI", "", "TAG", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.documentinfo.WikiNavPlugin$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final AbstractC1178x<DocumentInfo> getMObserver() {
        return this.mObserver;
    }

    private final void checkFinish() {
        if (getDocViewModel().getOpenSource() != DocsOpenSource.vc) {
            C6095s sVar = (C6095s) getHost();
            Intrinsics.checkExpressionValueIsNotNull(sVar, "host");
            sVar.mo19564f().finish();
        }
    }

    public final RouteBean generateRouteBean() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("popLastDocument", true);
        RouteBean routeBean = new RouteBean();
        routeBean.mo40613b(bundle);
        return routeBean;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.bytedance.ee.bear.document.documentinfo.f] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void sendMoveToWikiToVC() {
        /*
            r4 = this;
            com.bytedance.ee.bear.document.DocViewModel r0 = r4.getDocViewModel()
            com.bytedance.ee.bear.contract.doc.DocsOpenSource r0 = r0.getOpenSource()
            com.bytedance.ee.bear.contract.doc.DocsOpenSource r1 = com.bytedance.ee.bear.contract.doc.DocsOpenSource.vc
            if (r0 != r1) goto L_0x0025
            com.bytedance.ee.bear.browser.plugin.e r0 = r4.getHost()
            com.bytedance.ee.bear.document.s r0 = (com.bytedance.ee.bear.document.C6095s) r0
            java.lang.Class<com.bytedance.ee.bear.document.follow.FollowPlugin> r1 = com.bytedance.ee.bear.document.follow.FollowPlugin.class
            com.bytedance.ee.bear.document.documentinfo.WikiNavPlugin$c r2 = com.bytedance.ee.bear.document.documentinfo.WikiNavPlugin.C5745c.INSTANCE
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            if (r2 == 0) goto L_0x0020
            com.bytedance.ee.bear.document.documentinfo.f r3 = new com.bytedance.ee.bear.document.documentinfo.f
            r3.<init>(r2)
            r2 = r3
        L_0x0020:
            com.bytedance.ee.bear.browser.plugin.d r2 = (com.bytedance.ee.bear.browser.plugin.AbstractC4942d) r2
            r0.mo19549a(r1, r2)
        L_0x0025:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.document.documentinfo.WikiNavPlugin.sendMoveToWikiToVC():void");
    }

    public final void getDocumentInfoSuccess() {
        boolean z;
        DocObjInfo docObjInfo;
        WikiNavInfo wikiInfo;
        DocViewModel docViewModel = getDocViewModel();
        Intrinsics.checkExpressionValueIsNotNull(docViewModel, "docViewModel");
        DocumentInfo documentInfoData = docViewModel.getDocumentInfoData();
        if (documentInfoData == null || (docObjInfo = documentInfoData.getDocObjInfo()) == null || (wikiInfo = docObjInfo.getWikiInfo()) == null) {
            z = false;
        } else {
            z = wikiInfo.isWiki();
        }
        if (z) {
            C6095s sVar = (C6095s) getHost();
            Intrinsics.checkExpressionValueIsNotNull(sVar, "host");
            Context e = sVar.mo19562e();
            Intrinsics.checkExpressionValueIsNotNull(e, "host.context");
            UDToast.build(e).mo91637a(R.string.CreationMobile_Docs_MoveToWiki_NotExist_Toast).mo91656k();
            routeToWiki();
        }
    }

    public final void routeToWiki() {
        String str;
        DocObjInfo docObjInfo;
        WikiNavInfo wikiInfo;
        DocViewModel docViewModel = getDocViewModel();
        Intrinsics.checkExpressionValueIsNotNull(docViewModel, "docViewModel");
        DocumentInfo documentInfoData = docViewModel.getDocumentInfoData();
        if (documentInfoData == null || (docObjInfo = documentInfoData.getDocObjInfo()) == null || (wikiInfo = docObjInfo.getWikiInfo()) == null || (str = wikiInfo.getWikiToken()) == null) {
            str = "";
        }
        String generateWikiUrl = generateWikiUrl(str);
        if (!TextUtils.isEmpty(generateWikiUrl)) {
            sendMoveToWikiToVC();
            AbstractC10740f fVar = (AbstractC10740f) KoinJavaComponent.m268613a(AbstractC10740f.class, null, null, 6, null);
            if (fVar != null) {
                C13479a.m54764b("WikiNavPlugin", "already move to wiki,now jump to wiki...");
                RouteBean routeBean = new RouteBean();
                Bundle bundle = new Bundle();
                bundle.putBoolean("popLastDocument", true);
                routeBean.mo40613b(bundle);
                fVar.mo17293a(generateWikiUrl, routeBean);
                checkFinish();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/document/documentinfo/DocumentInfo;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.documentinfo.WikiNavPlugin$b */
    static final class C5744b<T> implements AbstractC1178x<DocumentInfo> {

        /* renamed from: a */
        final /* synthetic */ WikiNavPlugin f16201a;

        C5744b(WikiNavPlugin wikiNavPlugin) {
            this.f16201a = wikiNavPlugin;
        }

        /* renamed from: a */
        public final void onChanged(DocumentInfo documentInfo) {
            if (documentInfo != null) {
                this.f16201a.getDocumentInfoSuccess();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "p1", "Lcom/bytedance/ee/bear/document/follow/FollowPlugin;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.documentinfo.WikiNavPlugin$c */
    public static final /* synthetic */ class C5745c extends FunctionReference implements Function1<FollowPlugin, Unit> {
        public static final C5745c INSTANCE = new C5745c();

        C5745c() {
            super(1);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public final String getName() {
            return "processMoveToWiki";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(FollowPlugin.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "processMoveToWiki()V";
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FollowPlugin followPlugin) {
            invoke(followPlugin);
            return Unit.INSTANCE;
        }

        public final void invoke(FollowPlugin followPlugin) {
            Intrinsics.checkParameterIsNotNull(followPlugin, "p1");
            followPlugin.processMoveToWiki();
        }
    }

    public void onDetachFromHost(C6095s sVar) {
        DocViewModel m;
        C1177w<DocumentInfo> liveDocumentInfoData;
        if (!(sVar == null || (m = sVar.mo24598m()) == null || (liveDocumentInfoData = m.liveDocumentInfoData()) == null)) {
            liveDocumentInfoData.mo5928b(this.mObserver);
        }
        super.onDetachFromHost((C4943e) sVar);
    }

    public void onAttachToHost(C6095s sVar) {
        C13479a.m54772d("WikiNavPlugin", "onAttachToHost !");
        super.onAttachToHost((C4943e) sVar);
        C4943e host = getHost();
        Intrinsics.checkExpressionValueIsNotNull(host, "getHost()");
        LifecycleOwner h = ((C6095s) host).mo19566h();
        if (h != null) {
            getDocViewModel().liveDocumentInfoData().mo5923a(h, this.mObserver);
        }
    }

    public final String generateWikiUrl(String str) {
        Intrinsics.checkParameterIsNotNull(str, "wikiToken");
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        C6313i a = C6313i.m25327a();
        C8275a aVar = C8275a.f22377j;
        Intrinsics.checkExpressionValueIsNotNull(aVar, "DocumentType.WIKI");
        String a2 = a.mo25382a(aVar.mo32553a(), str, "move_to_wiki");
        Intrinsics.checkExpressionValueIsNotNull(a2, "SpaceKitUrlHelper.getIns…wikiToken, FROM_MOV_WIKI)");
        C13479a.m54772d("WikiNavPlugin", "wikiUrl is " + a2);
        return a2;
    }
}
