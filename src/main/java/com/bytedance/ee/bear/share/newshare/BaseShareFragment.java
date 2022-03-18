package com.bytedance.ee.bear.share.newshare;

import android.app.Dialog;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.fragment.app.DialogInterface$OnCancelListenerC1021b;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.bizwidget.p271a.C4860a;
import com.bytedance.ee.bear.bizwidget.shareview.AbstractC4881a;
import com.bytedance.ee.bear.bizwidget.shareview.C4887d;
import com.bytedance.ee.bear.bizwidget.shareview.ExternalShareMinaConfig;
import com.bytedance.ee.bear.bizwidget.shareview.ExternalShareView;
import com.bytedance.ee.bear.bizwidget.shareview.ShareType;
import com.bytedance.ee.bear.contract.AbstractC5089af;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.al;
import com.bytedance.ee.bear.contract.net.C5203d;
import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.middleground_permission_export.model.AbstractC10154a;
import com.bytedance.ee.bear.middleground_permission_export.model.IAuditApi;
import com.bytedance.ee.bear.middleground_permission_export.model.p499a.AbstractC10157c;
import com.bytedance.ee.bear.middleground_permission_export.model.p499a.AbstractC10158d;
import com.bytedance.ee.bear.middleground_permission_export.model.p499a.AbstractC10159e;
import com.bytedance.ee.bear.p522q.C10539a;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.share.IShareInfo;
import com.bytedance.ee.bear.share.ShareAnalytic;
import com.bytedance.ee.bear.share.ShareAnalyticV2;
import com.bytedance.ee.bear.share.ShareUtils;
import com.bytedance.ee.bear.share.export.AbstractC11003a;
import com.bytedance.ee.bear.share.export.AbstractC11005b;
import com.bytedance.ee.bear.share.export.ShareParams;
import com.bytedance.ee.bear.share.externalshare.C11007b;
import com.bytedance.ee.bear.watermark.interfaces.IWatermarkManager;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.bear.widgets.BaseTitleBar;
import com.bytedance.ee.bear.widgets.C11811a;
import com.bytedance.ee.bear.widgets.universedesign.SpaceSettingGroupLayout;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.NonProguard;
import com.bytedance.ee.util.p701d.C13614b;
import com.bytedance.ee.util.p718t.C13749l;
import com.larksuite.suite.R;
import io.reactivex.disposables.C68289a;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0016\u0018\u0000 n2\u00020\u00012\u00020\u0002:\u0001nB\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0004J\u0018\u0010(\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020+H\u0002J\u0018\u0010,\u001a\u00020%2\u0006\u0010)\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020+H\u0002J\b\u0010-\u001a\u00020+H\u0004J\u0014\u0010.\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020+0/H\u0002J\n\u00100\u001a\u0004\u0018\u000101H\u0016J\b\u00102\u001a\u00020+H\u0004J\b\u00103\u001a\u00020+H\u0002J\b\u00104\u001a\u000205H\u0016J\u0006\u00106\u001a\u00020%J\b\u00107\u001a\u00020%H\u0016J\b\u00108\u001a\u00020\u000bH\u0002J\b\u00109\u001a\u00020%H\u0016J \u0010:\u001a\u00020%2\u0006\u0010;\u001a\u00020\u000b2\u0006\u0010<\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020+H\u0004J\b\u0010=\u001a\u00020%H\u0016J\u0012\u0010>\u001a\u00020%2\b\u0010?\u001a\u0004\u0018\u00010@H\u0016J&\u0010A\u001a\u0004\u0018\u00010B2\u0006\u0010C\u001a\u00020D2\b\u0010E\u001a\u0004\u0018\u00010F2\b\u0010?\u001a\u0004\u0018\u00010@H\u0016J\b\u0010G\u001a\u00020%H\u0016J\b\u0010H\u001a\u00020%H\u0016J\b\u0010I\u001a\u00020%H\u0016J\b\u0010J\u001a\u00020%H\u0016J\b\u0010K\u001a\u00020%H\u0016J\b\u0010L\u001a\u00020%H\u0016J\b\u0010M\u001a\u00020%H\u0016J\b\u0010N\u001a\u00020%H\u0016J\b\u0010O\u001a\u00020%H\u0016J\b\u0010P\u001a\u00020%H\u0016J\b\u0010Q\u001a\u00020%H\u0016J\b\u0010R\u001a\u00020%H\u0016J\u001a\u0010S\u001a\u00020%2\u0006\u0010T\u001a\u00020B2\b\u0010?\u001a\u0004\u0018\u00010@H\u0016J \u0010U\u001a\u00020%2\u0006\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020+2\u0006\u0010Y\u001a\u00020+H\u0002J\u0010\u0010Z\u001a\u00020%2\u0006\u0010[\u001a\u00020+H\u0002J\u001a\u0010Z\u001a\u00020%2\u0006\u0010[\u001a\u00020+2\b\u0010\\\u001a\u0004\u0018\u00010+H\u0004J\b\u0010]\u001a\u00020%H\u0004J \u0010^\u001a\u00020%2\u0006\u0010_\u001a\u00020+2\b\u0010`\u001a\u0004\u0018\u00010+2\u0006\u0010a\u001a\u00020\u000bJ\u0018\u0010b\u001a\u00020%2\u0006\u0010V\u001a\u00020W2\u0006\u0010c\u001a\u00020+H\u0002J\u0006\u0010d\u001a\u00020%J\u0018\u0010e\u001a\u00020%2\u0006\u0010f\u001a\u0002012\u0006\u0010g\u001a\u00020hH\u0002J\u0010\u0010i\u001a\u00020%2\u0006\u0010j\u001a\u00020kH\u0004J\u0018\u0010l\u001a\u00020%2\u0006\u0010V\u001a\u00020W2\u0006\u0010Y\u001a\u00020+H\u0002J\b\u0010m\u001a\u00020%H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001b\u0010\u0019\u001a\u00020\u001a8DX\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\u001f\u001a\u00020 8DX\u0002¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b!\u0010\"¨\u0006o"}, d2 = {"Lcom/bytedance/ee/bear/share/newshare/BaseShareFragment;", "Lcom/bytedance/ee/bear/bizwidget/dialogfragment/BaseBottomSheetDialogFragment;", "Lcom/bytedance/ee/bear/bizwidget/shareview/OnShareItemClickListener;", "()V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getCompositeDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "externalShareMinaConfig", "Lcom/bytedance/ee/bear/bizwidget/shareview/ExternalShareMinaConfig;", "hasReportShowPanel", "", "isDocsApp", "originBearUrl", "Lcom/bytedance/ee/bear/domain/BearUrl;", "getOriginBearUrl", "()Lcom/bytedance/ee/bear/domain/BearUrl;", "setOriginBearUrl", "(Lcom/bytedance/ee/bear/domain/BearUrl;)V", "params", "Lcom/bytedance/ee/bear/share/export/ShareParams;", "getParams", "()Lcom/bytedance/ee/bear/share/export/ShareParams;", "setParams", "(Lcom/bytedance/ee/bear/share/export/ShareParams;)V", "permDependency", "Lcom/bytedance/ee/bear/middleground_permission_export/model/api/IPermissionApi;", "getPermDependency", "()Lcom/bytedance/ee/bear/middleground_permission_export/model/api/IPermissionApi;", "permDependency$delegate", "Lkotlin/Lazy;", "serviceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "getServiceContext", "()Lcom/bytedance/ee/bear/service/ServiceContext;", "serviceContext$delegate", "auditShareAction", "", "appDetail", "", "copyLink", "withPassword", "password", "", "copyLinkClick", "getHandlerUrl", "getRenameMap", "Ljava/util/HashMap;", "getShareInfo", "Lcom/bytedance/ee/bear/share/IShareInfo;", "getShareUrl", "getSource", "getSpaceSettingGroupLayout", "Lcom/bytedance/ee/bear/widgets/universedesign/SpaceSettingGroupLayout;", "hide", "initData", "isShareFragmentShowing", "onCopyLink", "onCopyLinkClicked", "isOwner", "hasPassword", "onCopyText", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onDestroyView", "onDownLoad", "onExportImage", "onShareMore", "onShareToByteMoments", "onShareToLark", "onShareToQQ", "onShareToWechat", "onShareToWechatMoments", "onShareToWeibo", "onSlideExport", "onViewCreated", "view", "performSdkShareH5", "shareType", "Lcom/bytedance/ee/bear/bizwidget/shareview/ShareType;", "title", "content", "reportShareAction", "platform", "flag", "reportShowSharePanel", "setAnalyticCommonParams", "userPerm", "publicPerm", "fromVc", "shareToTencentApp", "toPlatform", "show", "showExternalShareLinkTips", "shareInfo", "externalShareCallback", "Lcom/bytedance/ee/bear/middleground_permission_export/model/ExternalShareCallback;", "showLoadFailedToast", "throwable", "", "showShareLinkDialog", "updatePermission", "Companion", "share-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.share.a.a */
public class BaseShareFragment extends C4860a implements AbstractC4881a {

    /* renamed from: e */
    static final /* synthetic */ KProperty[] f29532e = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(BaseShareFragment.class), "serviceContext", "getServiceContext()Lcom/bytedance/ee/bear/service/ServiceContext;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(BaseShareFragment.class), "permDependency", "getPermDependency()Lcom/bytedance/ee/bear/middleground_permission_export/model/api/IPermissionApi;"))};

    /* renamed from: i */
    public static final Companion f29533i = new Companion(null);

    /* renamed from: c */
    private BearUrl f29534c;

    /* renamed from: d */
    private final C68289a f29535d = new C68289a();

    /* renamed from: f */
    protected ShareParams f29536f;

    /* renamed from: g */
    public boolean f29537g;

    /* renamed from: h */
    public ExternalShareMinaConfig f29538h = new ExternalShareMinaConfig();

    /* renamed from: j */
    private boolean f29539j;

    /* renamed from: k */
    private final Lazy f29540k = LazyKt.lazy(C10974i.INSTANCE);

    /* renamed from: l */
    private final Lazy f29541l = LazyKt.lazy(C10973h.INSTANCE);

    /* renamed from: m */
    private HashMap f29542m;

    /* renamed from: a */
    public View mo41695a(int i) {
        if (this.f29542m == null) {
            this.f29542m = new HashMap();
        }
        View view = (View) this.f29542m.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f29542m.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: n */
    public IShareInfo mo41705n() {
        return null;
    }

    /* renamed from: o */
    public void mo41706o() {
    }

    /* renamed from: p */
    public void mo41707p() {
        HashMap hashMap = this.f29542m;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final C10917c mo41710s() {
        Lazy lazy = this.f29540k;
        KProperty kProperty = f29532e[0];
        return (C10917c) lazy.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final AbstractC10157c mo41711t() {
        Lazy lazy = this.f29541l;
        KProperty kProperty = f29532e[1];
        return (AbstractC10157c) lazy.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ee/bear/share/newshare/BaseShareFragment$Companion;", "", "()V", "EXTRA_PARAMS", "", "TAG", "share-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.share.a.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final C68289a mo41709r() {
        return this.f29535d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo41702a(boolean z, boolean z2, String str) {
        Intrinsics.checkParameterIsNotNull(str, "password");
        if (!z || !z2) {
            mo41701a(false, str);
            return;
        }
        C11811a.m48976a(getContext()).mo45220a((CharSequence) getString(R.string.Doc_Facade_CopyLinkHasPasswordDialogTips)).mo45221a(getString(R.string.Doc_Facade_CopyLinkAndPassword), new View$OnClickListenerC10967b(this, str)).mo45221a(getString(R.string.Doc_Facade_CopyLinkOnly), new View$OnClickListenerC10968c(this, str)).mo45218a(new View$OnClickListenerC10969d(this)).mo45231c();
        ShareParams shareParams = this.f29536f;
        if (shareParams == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        String token = shareParams.getToken();
        ShareParams shareParams2 = this.f29536f;
        if (shareParams2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        int type = shareParams2.getType();
        ShareParams shareParams3 = this.f29536f;
        if (shareParams3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        String subType = shareParams3.getSubType();
        ShareParams shareParams4 = this.f29536f;
        if (shareParams4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        ShareAnalyticV2.m45783c(token, type, subType, shareParams4.isWiki());
    }

    /* renamed from: a */
    public final void mo41701a(boolean z, String str) {
        if (m45591b(z, str)) {
            Toast.showSuccessText(getContext(), getString(R.string.Doc_Facade_CopyLinkSuccessfully), 0);
        } else {
            Toast.showFailureText(getContext(), getString(R.string.Doc_Facade_CopyLinkFailed), 0);
        }
        mo5513b();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onDismiss"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.share.a.a$m */
    public static final class C10979m implements C4887d.AbstractC4889b {

        /* renamed from: a */
        final /* synthetic */ BaseShareFragment f29559a;

        C10979m(BaseShareFragment aVar) {
            this.f29559a = aVar;
        }

        @Override // com.bytedance.ee.bear.bizwidget.shareview.C4887d.AbstractC4889b
        /* renamed from: a */
        public final void mo19201a() {
            this.f29559a.mo5513b();
        }
    }

    @Override // com.bytedance.ee.bear.bizwidget.shareview.AbstractC4881a
    /* renamed from: f */
    public void mo19178f() {
        C13479a.m54764b("BaseShareFragment", "onDownLoad");
    }

    @Override // com.bytedance.ee.bear.bizwidget.shareview.AbstractC4881a
    /* renamed from: k */
    public void mo19183k() {
        C13479a.m54764b("BaseShareFragment", "onCopyText");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/middleground_permission_export/model/api/IPermissionApi;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.share.a.a$h */
    static final class C10973h extends Lambda implements Function0<AbstractC10157c> {
        public static final C10973h INSTANCE = new C10973h();

        C10973h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC10157c invoke() {
            return (AbstractC10157c) KoinJavaComponent.m268613a(AbstractC10157c.class, null, null, 6, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/service/ServiceContext;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.share.a.a$i */
    static final class C10974i extends Lambda implements Function0<C10917c> {
        public static final C10974i INSTANCE = new C10974i();

        C10974i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C10917c invoke() {
            return new C10917c(new C10929e());
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f29535d.dispose();
        mo41707p();
    }

    /* renamed from: q */
    public final ShareParams mo41708q() {
        ShareParams shareParams = this.f29536f;
        if (shareParams == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        return shareParams;
    }

    /* renamed from: x */
    public final void mo41715x() {
        Dialog v_;
        if (m45587D() && (v_ = v_()) != null) {
            v_.hide();
        }
    }

    /* renamed from: y */
    public final void mo41716y() {
        Dialog v_;
        if (!m45587D() && (v_ = v_()) != null) {
            v_.show();
        }
    }

    /* renamed from: B */
    private final String mo41722B() {
        ShareParams shareParams = this.f29536f;
        if (shareParams == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        int source = shareParams.getSource();
        if (source == 0) {
            return "left_slide";
        }
        if (source != 1) {
            return "innerpage";
        }
        return "grid_more";
    }

    /* renamed from: D */
    private final boolean m45587D() {
        Window window;
        View decorView;
        Dialog v_ = v_();
        if (v_ == null || (window = v_.getWindow()) == null || (decorView = window.getDecorView()) == null || decorView.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        ((AbstractC11003a) KoinJavaComponent.m268613a(AbstractC11003a.class, null, null, 6, null)).mo41763a((DialogInterface$OnCancelListenerC1021b) null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/bytedance/ee/bear/share/newshare/BaseShareFragment$onShareMore$externalShareCallback$1", "Lcom/bytedance/ee/bear/middleground_permission_export/model/ExternalShareCallback;", "onComplete", "", "share-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.share.a.a$e */
    public static final class C10970e implements AbstractC10154a {

        /* renamed from: a */
        final /* synthetic */ BaseShareFragment f29548a;

        @Override // com.bytedance.ee.bear.middleground_permission_export.model.AbstractC10154a
        /* renamed from: a */
        public void mo38590a() {
            if (this.f29548a.getActivity() == null) {
                C13479a.m54758a("BaseShareFragment", "onShareMore()...activity is null");
                return;
            }
            C11007b.m45853a(this.f29548a.getActivity(), this.f29548a.mo41713v());
            this.f29548a.mo5513b();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C10970e(BaseShareFragment aVar) {
            this.f29548a = aVar;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "OnClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.share.a.a$l */
    public static final class C10978l implements C4887d.AbstractC4890c {

        /* renamed from: a */
        final /* synthetic */ BaseShareFragment f29557a;

        /* renamed from: b */
        final /* synthetic */ ShareType f29558b;

        C10978l(BaseShareFragment aVar, ShareType shareType) {
            this.f29557a = aVar;
            this.f29558b = shareType;
        }

        @Override // com.bytedance.ee.bear.bizwidget.shareview.C4887d.AbstractC4890c
        /* renamed from: a */
        public final void mo19202a() {
            if (this.f29558b == ShareType.Wechat) {
                ShareAnalyticV2.m45777a(this.f29557a.mo41708q().getToken(), this.f29557a.mo41708q().getType(), this.f29557a.mo41708q().getSubType(), this.f29557a.mo41708q().isWiki(), false);
            }
        }
    }

    /* renamed from: A */
    public SpaceSettingGroupLayout mo41694A() {
        SpaceSettingGroupLayout spaceSettingGroupLayout = new SpaceSettingGroupLayout(requireContext());
        spaceSettingGroupLayout.setItemBackgroundColor(R.color.facade_selector_item_float);
        spaceSettingGroupLayout.setDividerBackgroundColor(R.color.bg_float);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int a = C13749l.m55738a(16);
        layoutParams.leftMargin = a;
        layoutParams.rightMargin = a;
        layoutParams.topMargin = a;
        spaceSettingGroupLayout.setLayoutParams(layoutParams);
        return spaceSettingGroupLayout;
    }

    @Override // com.bytedance.ee.bear.bizwidget.shareview.AbstractC4881a
    public void H_() {
        C13479a.m54764b("BaseShareFragment", "onShareToByteMoments");
        ShareParams shareParams = this.f29536f;
        if (shareParams == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        String token = shareParams.getToken();
        ShareParams shareParams2 = this.f29536f;
        if (shareParams2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        int type = shareParams2.getType();
        ShareParams shareParams3 = this.f29536f;
        if (shareParams3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        String subType = shareParams3.getSubType();
        ShareParams shareParams4 = this.f29536f;
        if (shareParams4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        ShareAnalyticV2.m45791k(token, type, subType, shareParams4.isWiki());
        m45589a("toutiao_circle");
    }

    @Override // com.bytedance.ee.bear.bizwidget.shareview.AbstractC4881a
    public void I_() {
        C13479a.m54764b("BaseShareFragment", "onSlideExport");
        ShareParams shareParams = this.f29536f;
        if (shareParams == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        String token = shareParams.getToken();
        ShareParams shareParams2 = this.f29536f;
        if (shareParams2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        int type = shareParams2.getType();
        ShareParams shareParams3 = this.f29536f;
        if (shareParams3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        String subType = shareParams3.getSubType();
        ShareParams shareParams4 = this.f29536f;
        if (shareParams4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        ShareAnalyticV2.m45786f(token, type, subType, shareParams4.isWiki());
        m45589a("export");
    }

    @Override // com.bytedance.ee.bear.bizwidget.shareview.AbstractC4881a
    /* renamed from: c */
    public void mo19176c() {
        C13479a.m54764b("BaseShareFragment", "onCopyLink");
        m45589a("copy");
        ShareParams shareParams = this.f29536f;
        if (shareParams == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        String token = shareParams.getToken();
        ShareParams shareParams2 = this.f29536f;
        if (shareParams2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        int type = shareParams2.getType();
        ShareParams shareParams3 = this.f29536f;
        if (shareParams3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        String subType = shareParams3.getSubType();
        ShareParams shareParams4 = this.f29536f;
        if (shareParams4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        ShareAnalyticV2.m45785e(token, type, subType, shareParams4.isWiki());
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final String mo41713v() {
        String u = mo41712u();
        if (TextUtils.isEmpty(u)) {
            return "";
        }
        String builder = Uri.parse(u).buildUpon().clearQuery().toString();
        Intrinsics.checkExpressionValueIsNotNull(builder, "Uri.parse(url).buildUpon().clearQuery().toString()");
        return builder;
    }

    /* renamed from: z */
    public final HashMap<String, String> mo41717z() {
        HashMap<String, String> hashMap = new HashMap<>();
        HashMap<String, String> hashMap2 = hashMap;
        ShareParams shareParams = this.f29536f;
        if (shareParams == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        hashMap2.put("Doc_name", shareParams.getDocName());
        hashMap2.put("Doc_url", mo41713v());
        hashMap2.put("emoji", "👉");
        return hashMap;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/bytedance/ee/bear/share/newshare/BaseShareFragment$onShareToWeibo$externalShareCallback$1", "Lcom/bytedance/ee/bear/middleground_permission_export/model/ExternalShareCallback;", "onComplete", "", "share-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.share.a.a$f */
    public static final class C10971f implements AbstractC10154a {

        /* renamed from: a */
        final /* synthetic */ BaseShareFragment f29549a;

        @Override // com.bytedance.ee.bear.middleground_permission_export.model.AbstractC10154a
        /* renamed from: a */
        public void mo38590a() {
            if (this.f29549a.getContext() == null) {
                C13479a.m54758a("BaseShareFragment", "onShareToWeibo()...context == null");
                return;
            }
            String a = C10539a.m43640a(this.f29549a.getContext(), R.string.Doc_Share_WeiboShareContent, this.f29549a.mo41717z());
            if (!this.f29549a.f29538h.isShareChannelBanned(ShareType.Weibo)) {
                boolean z = this.f29549a.f29537g;
                Context context = this.f29549a.getContext();
                if (context == null) {
                    Intrinsics.throwNpe();
                }
                C11007b.m45860a(z, context, ShareType.Weibo, a, (AbstractC11005b) null);
            } else {
                Context context2 = this.f29549a.getContext();
                if (context2 == null) {
                    Intrinsics.throwNpe();
                }
                C11007b.m45856a(context2, ShareType.Weibo, a, null);
            }
            this.f29549a.mo5513b();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C10971f(BaseShareFragment aVar) {
            this.f29549a = aVar;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "OnClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.share.a.a$k */
    public static final class C10977k implements C4887d.AbstractC4890c {

        /* renamed from: a */
        final /* synthetic */ BaseShareFragment f29554a;

        /* renamed from: b */
        final /* synthetic */ ShareType f29555b;

        /* renamed from: c */
        final /* synthetic */ String f29556c;

        C10977k(BaseShareFragment aVar, ShareType shareType, String str) {
            this.f29554a = aVar;
            this.f29555b = shareType;
            this.f29556c = str;
        }

        @Override // com.bytedance.ee.bear.bizwidget.shareview.C4887d.AbstractC4890c
        /* renamed from: a */
        public final void mo19202a() {
            if (this.f29555b == ShareType.Wechat) {
                ShareAnalyticV2.m45777a(this.f29554a.mo41708q().getToken(), this.f29554a.mo41708q().getType(), this.f29554a.mo41708q().getSubType(), this.f29554a.mo41708q().isWiki(), true);
            }
            if (this.f29554a.getContext() != null) {
                if (this.f29555b == ShareType.WechatMoments) {
                    C11007b.m45854a(this.f29554a.requireContext());
                } else {
                    C11007b.m45856a(this.f29554a.requireContext(), this.f29555b, this.f29556c, null);
                }
                this.f29554a.mo5513b();
                return;
            }
            C13479a.m54758a("BaseShareFragment", "setOnShareBtnClickListener()....context == null");
        }
    }

    @Override // com.bytedance.ee.bear.bizwidget.shareview.AbstractC4881a
    /* renamed from: d */
    public void mo19177d() {
        C13479a.m54764b("BaseShareFragment", "onExportImage");
        ShareParams shareParams = this.f29536f;
        if (shareParams == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        String token = shareParams.getToken();
        ShareParams shareParams2 = this.f29536f;
        if (shareParams2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        int type = shareParams2.getType();
        ShareParams shareParams3 = this.f29536f;
        if (shareParams3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        String subType = shareParams3.getSubType();
        ShareParams shareParams4 = this.f29536f;
        if (shareParams4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        ShareAnalyticV2.m45786f(token, type, subType, shareParams4.isWiki());
        m45589a("gene_long_image");
        mo41703b(0);
    }

    @Override // com.bytedance.ee.bear.bizwidget.shareview.AbstractC4881a
    /* renamed from: g */
    public void mo19179g() {
        C13479a.m54764b("BaseShareFragment", "onShareToWechat");
        ShareParams shareParams = this.f29536f;
        if (shareParams == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        String token = shareParams.getToken();
        ShareParams shareParams2 = this.f29536f;
        if (shareParams2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        int type = shareParams2.getType();
        ShareParams shareParams3 = this.f29536f;
        if (shareParams3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        String subType = shareParams3.getSubType();
        ShareParams shareParams4 = this.f29536f;
        if (shareParams4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        ShareAnalyticV2.m45787g(token, type, subType, shareParams4.isWiki());
        m45589a("wechat");
        mo41703b(1);
        m45590b(ShareType.Wechat, "wechat");
    }

    @Override // com.bytedance.ee.bear.bizwidget.shareview.AbstractC4881a
    /* renamed from: h */
    public void mo19180h() {
        C13479a.m54764b("BaseShareFragment", "onShareToWechatMoments");
        ShareParams shareParams = this.f29536f;
        if (shareParams == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        String token = shareParams.getToken();
        ShareParams shareParams2 = this.f29536f;
        if (shareParams2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        int type = shareParams2.getType();
        ShareParams shareParams3 = this.f29536f;
        if (shareParams3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        String subType = shareParams3.getSubType();
        ShareParams shareParams4 = this.f29536f;
        if (shareParams4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        ShareAnalyticV2.m45788h(token, type, subType, shareParams4.isWiki());
        m45589a("wechat_article");
        mo41703b(2);
        m45590b(ShareType.WechatMoments, "wechat_article");
    }

    @Override // com.bytedance.ee.bear.bizwidget.shareview.AbstractC4881a
    /* renamed from: i */
    public void mo19181i() {
        C13479a.m54764b("BaseShareFragment", "onShareToQQ");
        ShareParams shareParams = this.f29536f;
        if (shareParams == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        String token = shareParams.getToken();
        ShareParams shareParams2 = this.f29536f;
        if (shareParams2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        int type = shareParams2.getType();
        ShareParams shareParams3 = this.f29536f;
        if (shareParams3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        String subType = shareParams3.getSubType();
        ShareParams shareParams4 = this.f29536f;
        if (shareParams4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        ShareAnalyticV2.m45789i(token, type, subType, shareParams4.isWiki());
        m45589a("qq");
        mo41703b(3);
        m45590b(ShareType.QQ, "qq");
    }

    @Override // com.bytedance.ee.bear.bizwidget.shareview.AbstractC4881a
    /* renamed from: j */
    public void mo19182j() {
        C13479a.m54764b("BaseShareFragment", "onShareToWeibo");
        ShareParams shareParams = this.f29536f;
        if (shareParams == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        String token = shareParams.getToken();
        ShareParams shareParams2 = this.f29536f;
        if (shareParams2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        int type = shareParams2.getType();
        ShareParams shareParams3 = this.f29536f;
        if (shareParams3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        String subType = shareParams3.getSubType();
        ShareParams shareParams4 = this.f29536f;
        if (shareParams4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        ShareAnalyticV2.m45790j(token, type, subType, shareParams4.isWiki());
        m45589a("weibo");
        mo41703b(4);
        if (C11007b.m45864a(getContext(), ShareType.Weibo)) {
            if (mo41705n() == null) {
                C13479a.m54758a("BaseShareFragment", "onShareToWeibo()...mShareInfo is null!");
                return;
            }
            C10971f fVar = new C10971f(this);
            IShareInfo n = mo41705n();
            if (n == null) {
                Intrinsics.throwNpe();
            }
            m45588a(n, fVar);
        }
    }

    @Override // com.bytedance.ee.bear.bizwidget.shareview.AbstractC4881a
    /* renamed from: l */
    public void mo19184l() {
        C13479a.m54764b("BaseShareFragment", "onShareMore");
        ShareParams shareParams = this.f29536f;
        if (shareParams == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        String token = shareParams.getToken();
        ShareParams shareParams2 = this.f29536f;
        if (shareParams2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        int type = shareParams2.getType();
        ShareParams shareParams3 = this.f29536f;
        if (shareParams3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        String subType = shareParams3.getSubType();
        ShareParams shareParams4 = this.f29536f;
        if (shareParams4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        ShareAnalyticV2.m45792l(token, type, subType, shareParams4.isWiki());
        m45589a("more");
        mo41703b(5);
        if (mo41705n() == null) {
            C13479a.m54758a("BaseShareFragment", "onShareMore()...mShareInfo is null!");
            return;
        }
        C10970e eVar = new C10970e(this);
        IShareInfo n = mo41705n();
        if (n == null) {
            Intrinsics.throwNpe();
        }
        m45588a(n, eVar);
    }

    /* renamed from: m */
    public void mo41704m() {
        Serializable serializable;
        ShareParams shareParams;
        boolean z;
        Bundle arguments = getArguments();
        if (arguments != null) {
            serializable = arguments.getSerializable("extra_params");
        } else {
            serializable = null;
        }
        if (serializable instanceof ShareParams) {
            shareParams = (ShareParams) serializable;
        } else {
            FragmentActivity requireActivity = requireActivity();
            Intrinsics.checkExpressionValueIsNotNull(requireActivity, "requireActivity()");
            shareParams = new ShareParams(requireActivity);
        }
        this.f29536f = shareParams;
        if (shareParams == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        if (!TextUtils.isEmpty(shareParams.getOriginUrl())) {
            C6313i a = C6313i.m25327a();
            ShareParams shareParams2 = this.f29536f;
            if (shareParams2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("params");
            }
            this.f29534c = a.mo25399g(shareParams2.getOriginUrl());
        }
        al d = C4511g.m18594d();
        Intrinsics.checkExpressionValueIsNotNull(d, "InfoProvideServiceImp.getInstance()");
        if (d.mo17344E() == 2) {
            z = true;
        } else {
            z = false;
        }
        this.f29537g = z;
        NonProguard a2 = C4211a.m17514a().mo16532a("external_share_config", ExternalShareMinaConfig.class, new ExternalShareMinaConfig());
        Intrinsics.checkExpressionValueIsNotNull(a2, "AppSetting.getInstance()…xternalShareMinaConfig())");
        this.f29538h = (ExternalShareMinaConfig) a2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final String mo41712u() {
        ShareParams shareParams = this.f29536f;
        if (shareParams == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        if (TextUtils.isEmpty(shareParams.getOriginUrl())) {
            ShareParams shareParams2 = this.f29536f;
            if (shareParams2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("params");
            }
            return shareParams2.getUrl();
        }
        ShareParams shareParams3 = this.f29536f;
        if (shareParams3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        int type = shareParams3.getType();
        C8275a aVar = C8275a.f22375h;
        Intrinsics.checkExpressionValueIsNotNull(aVar, "DocumentType.FILE");
        if (type != aVar.mo32555b()) {
            ShareParams shareParams4 = this.f29536f;
            if (shareParams4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("params");
            }
            int type2 = shareParams4.getType();
            C8275a aVar2 = C8275a.f22373f;
            Intrinsics.checkExpressionValueIsNotNull(aVar2, "DocumentType.BITABLE");
            if (type2 != aVar2.mo32555b()) {
                ShareParams shareParams5 = this.f29536f;
                if (shareParams5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("params");
                }
                return shareParams5.getUrl();
            }
        }
        ShareParams shareParams6 = this.f29536f;
        if (shareParams6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        return shareParams6.getOriginUrl();
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final void mo41714w() {
        if (!this.f29539j) {
            this.f29539j = true;
            ShareAnalytic.m45768a(mo41705n(), "show_share_page");
            ShareParams shareParams = this.f29536f;
            if (shareParams == null) {
                Intrinsics.throwUninitializedPropertyAccessException("params");
            }
            String token = shareParams.getToken();
            ShareParams shareParams2 = this.f29536f;
            if (shareParams2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("params");
            }
            int type = shareParams2.getType();
            ShareParams shareParams3 = this.f29536f;
            if (shareParams3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("params");
            }
            String subType = shareParams3.getSubType();
            ShareParams shareParams4 = this.f29536f;
            if (shareParams4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("params");
            }
            ShareAnalyticV2.m45774a(token, type, subType, shareParams4.isWiki());
        }
    }

    @Override // com.bytedance.ee.bear.bizwidget.shareview.AbstractC4881a
    /* renamed from: a */
    public void mo19175a() {
        C13479a.m54764b("BaseShareFragment", "onShareToLark");
        m45589a("lark");
        ShareParams shareParams = this.f29536f;
        if (shareParams == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        String token = shareParams.getToken();
        ShareParams shareParams2 = this.f29536f;
        if (shareParams2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        int type = shareParams2.getType();
        ShareParams shareParams3 = this.f29536f;
        if (shareParams3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        String subType = shareParams3.getSubType();
        ShareParams shareParams4 = this.f29536f;
        if (shareParams4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        ShareAnalyticV2.m45784d(token, type, subType, shareParams4.isWiki());
        ShareParams shareParams5 = this.f29536f;
        if (shareParams5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        C10989d.m45671a(shareParams5.getDocName(), mo41712u(), mo41710s());
        mo5513b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/bytedance/ee/bear/share/newshare/BaseShareFragment$shareToTencentApp$externalShareCallback$1", "Lcom/bytedance/ee/bear/middleground_permission_export/model/ExternalShareCallback;", "onComplete", "", "share-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.share.a.a$j */
    public static final class C10975j implements AbstractC10154a {

        /* renamed from: a */
        final /* synthetic */ BaseShareFragment f29551a;

        /* renamed from: b */
        final /* synthetic */ ShareType f29552b;

        /* renamed from: c */
        final /* synthetic */ String f29553c;

        @Override // com.bytedance.ee.bear.middleground_permission_export.model.AbstractC10154a
        /* renamed from: a */
        public void mo38590a() {
            boolean z;
            if (this.f29551a.getContext() == null) {
                C13479a.m54758a("BaseShareFragment", "shareToTencentApp()...context == null");
                return;
            }
            Dialog v_ = this.f29551a.v_();
            if (v_ != null) {
                v_.hide();
            }
            boolean isShareChannelBanned = this.f29551a.f29538h.isShareChannelBanned(this.f29552b);
            boolean isShareDomainBanned = this.f29551a.f29538h.isShareDomainBanned(this.f29552b);
            IShareInfo n = this.f29551a.mo41705n();
            if (n != null) {
                z = n.mo41668l();
            } else {
                z = false;
            }
            if (isShareDomainBanned) {
                this.f29551a.mo41698a(this.f29553c, "2");
                int type = this.f29551a.mo41708q().getType();
                C8275a aVar = C8275a.f22371d;
                Intrinsics.checkExpressionValueIsNotNull(aVar, "DocumentType.DOC");
                if (type == aVar.mo32555b() && this.f29551a.mo41708q().getSource() == 2 && z) {
                    ((AbstractC5089af) KoinJavaComponent.m268613a(AbstractC5089af.class, null, null, 6, null)).mo20188a(this.f29552b.name());
                    this.f29551a.mo5513b();
                    return;
                }
                String a = C10539a.m43640a(this.f29551a.getContext(), R.string.Doc_Share_ExternalShareContentV2, this.f29551a.mo41717z());
                BaseShareFragment aVar2 = this.f29551a;
                ShareType shareType = this.f29552b;
                Intrinsics.checkExpressionValueIsNotNull(a, "content");
                aVar2.mo41696a(shareType, a);
            } else if (isShareChannelBanned) {
                this.f29551a.mo41698a(this.f29553c, "1");
                if (this.f29552b == ShareType.WechatMoments) {
                    int type2 = this.f29551a.mo41708q().getType();
                    C8275a aVar3 = C8275a.f22371d;
                    Intrinsics.checkExpressionValueIsNotNull(aVar3, "DocumentType.DOC");
                    if (type2 == aVar3.mo32555b() && this.f29551a.mo41708q().getSource() == 2 && z) {
                        ((AbstractC5089af) KoinJavaComponent.m268613a(AbstractC5089af.class, null, null, 6, null)).mo20188a(this.f29552b.name());
                        this.f29551a.mo5513b();
                        return;
                    }
                }
                String a2 = C10539a.m43640a(this.f29551a.getContext(), R.string.Doc_Share_ExternalShareContentV1, this.f29551a.mo41717z());
                BaseShareFragment aVar4 = this.f29551a;
                ShareType shareType2 = this.f29552b;
                Intrinsics.checkExpressionValueIsNotNull(a2, "content");
                aVar4.mo41696a(shareType2, a2);
            } else {
                this.f29551a.mo41698a(this.f29553c, "0");
                if (this.f29552b != ShareType.Wechat || !this.f29551a.f29538h.isEnableShareMiniApp()) {
                    ShareUtils.m45874a((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null), String.valueOf(this.f29551a.mo41708q().getType()), this.f29551a.mo41708q().getToken(), new C10976a(this));
                    return;
                }
                Context context = this.f29551a.getContext();
                if (context != null) {
                    C11007b.m45862a(this.f29551a.f29537g, context, this.f29551a.mo41708q().getDocName(), this.f29551a.mo41713v(), this.f29551a.mo41708q().getType(), this.f29551a.mo41708q().getSubType(), this.f29551a.mo41708q().getToken());
                    this.f29551a.mo5513b();
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "content", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.share.a.a$j$a */
        static final class C10976a extends Lambda implements Function1<String, Unit> {
            final /* synthetic */ C10975j this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C10976a(C10975j jVar) {
                super(1);
                this.this$0 = jVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                invoke(str);
                return Unit.INSTANCE;
            }

            public final void invoke(String str) {
                String docName = this.this$0.f29551a.mo41708q().getDocName();
                if (str == null) {
                    str = "";
                }
                IShareInfo n = this.this$0.f29551a.mo41705n();
                boolean z = true;
                if (n != null && (n.mo41669m() || n.mo41672p() || n.mo41673q())) {
                    z = false;
                }
                int type = this.this$0.f29551a.mo41708q().getType();
                C8275a aVar = C8275a.f22370c;
                Intrinsics.checkExpressionValueIsNotNull(aVar, "DocumentType.FOLDER");
                if (type != aVar.mo32555b() && z) {
                    String string = this.this$0.f29551a.getString(R.string.Doc_Permission_NoPermissionAccess);
                    Intrinsics.checkExpressionValueIsNotNull(string, "getString(R.string.Doc_P…ssion_NoPermissionAccess)");
                    String string2 = this.this$0.f29551a.getString(R.string.Doc_Permission_NoPermissionAccess);
                    Intrinsics.checkExpressionValueIsNotNull(string2, "getString(\n             …ssion_NoPermissionAccess)");
                    docName = string;
                    str = string2;
                }
                this.this$0.f29551a.mo41697a(this.this$0.f29552b, docName, str);
            }
        }

        C10975j(BaseShareFragment aVar, ShareType shareType, String str) {
            this.f29551a = aVar;
            this.f29552b = shareType;
            this.f29553c = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/share/newshare/BaseShareFragment$onViewCreated$1", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "share-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.share.a.a$g */
    public static final class C10972g extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ BaseShareFragment f29550a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C10972g(BaseShareFragment aVar) {
            this.f29550a = aVar;
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            this.f29550a.mo5513b();
        }
    }

    /* renamed from: a */
    private final void m45589a(String str) {
        ShareAnalytic.m45769a(mo41705n(), mo41722B(), str);
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo41704m();
        ((AbstractC11003a) KoinJavaComponent.m268613a(AbstractC11003a.class, null, null, 6, null)).mo41763a(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.share.a.a$b */
    static final class View$OnClickListenerC10967b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BaseShareFragment f29543a;

        /* renamed from: b */
        final /* synthetic */ String f29544b;

        View$OnClickListenerC10967b(BaseShareFragment aVar, String str) {
            this.f29543a = aVar;
            this.f29544b = str;
        }

        public final void onClick(View view) {
            this.f29543a.mo41701a(true, this.f29544b);
            ShareAnalyticV2.m45793m(this.f29543a.mo41708q().getToken(), this.f29543a.mo41708q().getType(), this.f29543a.mo41708q().getSubType(), this.f29543a.mo41708q().isWiki());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.share.a.a$c */
    static final class View$OnClickListenerC10968c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BaseShareFragment f29545a;

        /* renamed from: b */
        final /* synthetic */ String f29546b;

        View$OnClickListenerC10968c(BaseShareFragment aVar, String str) {
            this.f29545a = aVar;
            this.f29546b = str;
        }

        public final void onClick(View view) {
            this.f29545a.mo41701a(false, this.f29546b);
            ShareAnalyticV2.m45794n(this.f29545a.mo41708q().getToken(), this.f29545a.mo41708q().getType(), this.f29545a.mo41708q().getSubType(), this.f29545a.mo41708q().isWiki());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.share.a.a$d */
    static final class View$OnClickListenerC10969d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BaseShareFragment f29547a;

        View$OnClickListenerC10969d(BaseShareFragment aVar) {
            this.f29547a = aVar;
        }

        public final void onClick(View view) {
            ShareAnalyticV2.m45795o(this.f29547a.mo41708q().getToken(), this.f29547a.mo41708q().getType(), this.f29547a.mo41708q().getSubType(), this.f29547a.mo41708q().isWiki());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo41703b(int i) {
        int i2;
        String str;
        BearUrl bearUrl;
        String str2;
        IAuditApi cVar = (IAuditApi) KoinJavaComponent.m268613a(IAuditApi.class, null, null, 6, null);
        ShareParams shareParams = this.f29536f;
        if (shareParams == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        C8275a b = C8275a.m34052b(shareParams.getType());
        Intrinsics.checkExpressionValueIsNotNull(b, "DocumentType.getDocumentType(params.type)");
        if (i == 0) {
            i2 = 12;
        } else {
            i2 = 10;
        }
        ShareParams shareParams2 = this.f29536f;
        if (shareParams2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        String token = shareParams2.getToken();
        ShareParams shareParams3 = this.f29536f;
        if (shareParams3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        boolean isWiki = shareParams3.isWiki();
        ShareParams shareParams4 = this.f29536f;
        if (shareParams4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        if (!shareParams4.isWiki() || (bearUrl = this.f29534c) == null || (str2 = bearUrl.f17447b) == null) {
            str = "";
        } else {
            str = str2;
        }
        cVar.mo37703a(b, i2, token, i, isWiki ? 1 : 0, str);
    }

    /* renamed from: a */
    public final void mo41700a(Throwable th) {
        Intrinsics.checkParameterIsNotNull(th, "throwable");
        if (C5203d.m21235a(th, 1002) || C5203d.m21235a(th, 4)) {
            Toast.showFailureText(getContext(), (int) R.string.CreationMobile_ECM_shortcut_sharing_failed_NoPermission_toast);
        } else {
            Toast.showFailureText(getContext(), getString(R.string.Doc_Share_LoadFailed));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo41698a(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "platform");
        ShareAnalytic.m45770a(mo41705n(), mo41722B(), str, str2);
    }

    /* renamed from: b */
    private final void m45590b(ShareType shareType, String str) {
        if (C11007b.m45864a(getContext(), shareType)) {
            if (mo41705n() == null) {
                C13479a.m54758a("BaseShareFragment", "onShareToWeibo()...mShareInfo is null!");
                return;
            }
            C10975j jVar = new C10975j(this, shareType, str);
            IShareInfo n = mo41705n();
            if (n == null) {
                Intrinsics.throwNpe();
            }
            m45588a(n, jVar);
        }
    }

    /* renamed from: a */
    private final void m45588a(IShareInfo bVar, AbstractC10154a aVar) {
        boolean z;
        AbstractC10159e b = mo41711t().mo36639b();
        Context context = getContext();
        ShareParams shareParams = this.f29536f;
        if (shareParams == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        int type = shareParams.getType();
        String i = bVar.mo41665i();
        if (bVar.mo41672p() || bVar.mo41673q()) {
            z = true;
        } else {
            z = false;
        }
        boolean j = bVar.mo41666j();
        boolean g = bVar.mo41662g();
        boolean k = bVar.mo41667k();
        boolean h = bVar.mo41663h();
        ShareParams shareParams2 = this.f29536f;
        if (shareParams2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        String subType = shareParams2.getSubType();
        ShareParams shareParams3 = this.f29536f;
        if (shareParams3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        b.mo36670a(context, type, i, z, j, g, k, h, aVar, subType, shareParams3.isWiki(), bVar.mo41674r());
    }

    /* renamed from: b */
    private final boolean m45591b(boolean z, String str) {
        String v = mo41713v();
        if (z) {
            HashMap hashMap = new HashMap();
            hashMap.put("link", v);
            hashMap.put("password", str);
            v = C10539a.m43640a(getContext(), R.string.Doc_Facade_LinkAndPasswordText, hashMap);
            Intrinsics.checkExpressionValueIsNotNull(v, "UIHelper.mustacheFormat(…AndPasswordText, hashMap)");
        }
        try {
            C13614b.m55259a(getContext(), v);
            return true;
        } catch (Exception e) {
            C13479a.m54761a("BaseShareFragment", e);
            return false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        ((ExternalShareView) mo41695a(R.id.shareExternalView)).setOnShareItemClickListener(this);
        IWatermarkManager aVar = (IWatermarkManager) KoinJavaComponent.m268613a(IWatermarkManager.class, null, null, 6, null);
        ShareParams shareParams = this.f29536f;
        if (shareParams == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        String token = shareParams.getToken();
        ShareParams shareParams2 = this.f29536f;
        if (shareParams2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        aVar.mo40649a(token, String.valueOf(shareParams2.getType()));
        ((IWatermarkManager) KoinJavaComponent.m268613a(IWatermarkManager.class, null, null, 6, null)).mo40644a(v_());
        ((BaseTitleBar) mo41695a(R.id.share_title_bar)).setLeftClickListener(new C10972g(this));
        ((BaseTitleBar) mo41695a(R.id.share_title_bar)).setMainTitleSize(17.0f);
    }

    /* renamed from: a */
    public final void mo41696a(ShareType shareType, String str) {
        int i;
        C4887d.C4888a b = new C4887d.C4888a(getContext()).mo19193a(shareType).mo19196a(getResources().getString(R.string.Doc_Share_LinkCopied)).mo19199b(str);
        Context context = getContext();
        if (shareType == ShareType.WechatMoments) {
            i = R.string.Doc_Share_ShareToExternalApp;
        } else {
            i = R.string.Doc_Share_PasteToFriends;
        }
        b.mo19200c(C10539a.m43639a(context, i, "channelName", C11007b.m45866b(getContext(), shareType))).mo19195a(new C10977k(this, shareType, str)).mo19198b(new C10978l(this, shareType)).mo19194a(new C10979m(this)).mo19197a();
        if (shareType == ShareType.Wechat) {
            ShareParams shareParams = this.f29536f;
            if (shareParams == null) {
                Intrinsics.throwUninitializedPropertyAccessException("params");
            }
            String token = shareParams.getToken();
            ShareParams shareParams2 = this.f29536f;
            if (shareParams2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("params");
            }
            int type = shareParams2.getType();
            ShareParams shareParams3 = this.f29536f;
            if (shareParams3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("params");
            }
            String subType = shareParams3.getSubType();
            ShareParams shareParams4 = this.f29536f;
            if (shareParams4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("params");
            }
            ShareAnalyticV2.m45782b(token, type, subType, shareParams4.isWiki());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.share_fragment_layout, viewGroup, false);
    }

    /* renamed from: a */
    public final void mo41697a(ShareType shareType, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            str2 = getResources().getString(R.string.Doc_Share_SharedFromFeishu);
            Intrinsics.checkExpressionValueIsNotNull(str2, "resources.getString(R.st…c_Share_SharedFromFeishu)");
        }
        Context context = getContext();
        if (context != null) {
            C11007b.m45861a(this.f29537g, context, shareType, str, str2, mo41713v());
            mo5513b();
        }
    }

    /* renamed from: a */
    public final void mo41699a(String str, String str2, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "userPerm");
        AbstractC10158d d = ((AbstractC10157c) KoinJavaComponent.m268613a(AbstractC10157c.class, null, null, 6, null)).mo36641d();
        ShareParams shareParams = this.f29536f;
        if (shareParams == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        String token = shareParams.getToken();
        ShareParams shareParams2 = this.f29536f;
        if (shareParams2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        int type = shareParams2.getType();
        ShareParams shareParams3 = this.f29536f;
        if (shareParams3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        String subType = shareParams3.getSubType();
        ShareParams shareParams4 = this.f29536f;
        if (shareParams4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        boolean isWiki = shareParams4.isWiki();
        ShareParams shareParams5 = this.f29536f;
        if (shareParams5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        String module = shareParams5.getModule();
        ShareParams shareParams6 = this.f29536f;
        if (shareParams6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        d.mo36654a(token, type, subType, isWiki, str, str2, z, module, shareParams6.getSubModule());
        ShareParams shareParams7 = this.f29536f;
        if (shareParams7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        String module2 = shareParams7.getModule();
        ShareParams shareParams8 = this.f29536f;
        if (shareParams8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("params");
        }
        ShareAnalyticV2.m45779a(str, str2, z, module2, shareParams8.getSubModule());
    }
}
