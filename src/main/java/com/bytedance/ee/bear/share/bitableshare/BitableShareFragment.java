package com.bytedance.ee.bear.share.bitableshare;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.fragment.app.DialogInterface$OnCancelListenerC1021b;
import androidx.fragment.app.Fragment;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.bizwidget.shareview.ExternalShareView;
import com.bytedance.ee.bear.bizwidget.shareview.ShareItemModel;
import com.bytedance.ee.bear.bizwidget.shareview.ShareState;
import com.bytedance.ee.bear.bizwidget.shareview.ShareType;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.contract.al;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.middleground_permission_export.model.form.BitableSharePermission;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.BitableSharePermSetInfo;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.IBitableSharePermSetInfo;
import com.bytedance.ee.bear.p522q.C10539a;
import com.bytedance.ee.bear.share.IShareInfo;
import com.bytedance.ee.bear.share.export.ShareParams;
import com.bytedance.ee.bear.share.externalshare.C11006a;
import com.bytedance.ee.bear.share.externalshare.C11007b;
import com.bytedance.ee.bear.share.newshare.BaseShareFragment;
import com.bytedance.ee.bear.share.p542a.C10989d;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.bear.widgets.BaseTitleBar;
import com.bytedance.ee.bear.widgets.universedesign.SpaceSettingGroupLayout;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import com.bytedance.ee.util.p701d.C13614b;
import com.larksuite.suite.R;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 02\u00020\u00012\u00020\u0002:\u00010B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u000b\u001a\u00020\u0007H\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\b\u0010\u000f\u001a\u00020\rH\u0002J\n\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u0005H\u0016J\b\u0010\u0018\u001a\u00020\u0013H\u0016J\b\u0010\u0019\u001a\u00020\u0013H\u0016J\b\u0010\u001a\u001a\u00020\u0013H\u0016J\b\u0010\u001b\u001a\u00020\u0013H\u0016J\b\u0010\u001c\u001a\u00020\u0013H\u0016J\b\u0010\u001d\u001a\u00020\u0013H\u0016J\b\u0010\u001e\u001a\u00020\u0013H\u0016J\b\u0010\u001f\u001a\u00020\u0013H\u0016J\b\u0010 \u001a\u00020\u0013H\u0016J\b\u0010!\u001a\u00020\u0013H\u0016J\u001a\u0010\"\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u00072\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u0010\u0010&\u001a\u00020\u00132\u0006\u0010'\u001a\u00020(H\u0002J\b\u0010)\u001a\u00020\u0005H\u0002J\b\u0010*\u001a\u00020\u0013H\u0002J\u0010\u0010+\u001a\u00020\u00132\u0006\u0010,\u001a\u00020-H\u0002J\b\u0010.\u001a\u00020\u0013H\u0016J\u0010\u0010/\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/bytedance/ee/bear/share/bitableshare/BitableShareFragment;", "Lcom/bytedance/ee/bear/share/newshare/BaseShareFragment;", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "()V", "isShareTokenEmpty", "", "linkShareSetView", "Landroid/view/View;", "memberView", "shareFormInfo", "Lcom/bytedance/ee/bear/share/bitableshare/BitableShareInfo;", "generateDividerView", "getBitableFormShareUrl", "", "shareToken", "getExternalShareContent", "getShareInfo", "Lcom/bytedance/ee/bear/share/IShareInfo;", "initData", "", "onCheckedChanged", "buttonView", "Landroid/widget/CompoundButton;", "isChecked", "onCopyLink", "onDestroy", "onResume", "onShareMore", "onShareToByteMoments", "onShareToLark", "onShareToQQ", "onShareToWechat", "onShareToWechatMoments", "onShareToWeibo", "onViewCreated", "view", "savedInstanceState", "Landroid/os/Bundle;", "performSysShareText", "shareType", "Lcom/bytedance/ee/bear/bizwidget/shareview/ShareType;", "safeCopyLink", "updateExternalShareView", "updatePermSetInfoToView", "bitableSharePermission", "Lcom/bytedance/ee/bear/middleground_permission_export/model/form/BitableSharePermission;", "updatePermission", "updateViewStatus", "Companion", "share-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.share.bitableshare.b */
public final class BitableShareFragment extends BaseShareFragment implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: d */
    public static final Companion f29600d = new Companion(null);

    /* renamed from: c */
    public BitableShareInfo f29601c;

    /* renamed from: j */
    private View f29602j;

    /* renamed from: k */
    private View f29603k;

    /* renamed from: l */
    private boolean f29604l;

    /* renamed from: m */
    private HashMap f29605m;

    @JvmStatic
    /* renamed from: a */
    public static final DialogInterface$OnCancelListenerC1021b m45716a(ShareParams shareParams) {
        return f29600d.mo41747a(shareParams);
    }

    @Override // com.bytedance.ee.bear.share.newshare.BaseShareFragment
    /* renamed from: a */
    public View mo41695a(int i) {
        if (this.f29605m == null) {
            this.f29605m = new HashMap();
        }
        View view = (View) this.f29605m.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f29605m.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment, com.bytedance.ee.bear.share.newshare.BaseShareFragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo41707p();
    }

    @Override // com.bytedance.ee.bear.share.newshare.BaseShareFragment
    /* renamed from: p */
    public void mo41707p() {
        HashMap hashMap = this.f29605m;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/bytedance/ee/bear/share/bitableshare/BitableShareFragment$Companion;", "", "()V", "EXTRA_PARAMS", "", "TAG", "show", "Landroidx/fragment/app/DialogFragment;", "shareParams", "Lcom/bytedance/ee/bear/share/export/ShareParams;", "share-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.share.bitableshare.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final DialogInterface$OnCancelListenerC1021b mo41747a(ShareParams shareParams) {
            Intrinsics.checkParameterIsNotNull(shareParams, "shareParams");
            Bundle bundle = new Bundle();
            bundle.putSerializable("extra_params", shareParams);
            String name = BitableShareFragment.class.getName();
            Intrinsics.checkExpressionValueIsNotNull(name, "BitableShareFragment::class.java.name");
            Fragment instantiate = Fragment.instantiate(shareParams.getActivity(), name, bundle);
            if (instantiate != null) {
                BitableShareFragment bVar = (BitableShareFragment) instantiate;
                bVar.mo5511a(shareParams.getActivity().getSupportFragmentManager(), name);
                return bVar;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.share.bitableshare.BitableShareFragment");
        }
    }

    @Override // com.bytedance.ee.bear.share.newshare.BaseShareFragment
    /* renamed from: n */
    public IShareInfo mo41705n() {
        return this.f29601c;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        mo41706o();
    }

    @Override // androidx.fragment.app.Fragment, com.bytedance.ee.bear.share.newshare.BaseShareFragment
    public void onDestroy() {
        super.onDestroy();
        C5234y.m21391b().mo21087d("bitableFormPermCommonParams");
    }

    /* renamed from: D */
    private final boolean m45714D() {
        try {
            C13614b.m55259a(getContext(), mo41712u());
            return true;
        } catch (Throwable th) {
            C13479a.m54761a("BitableShareFragment", th);
            return false;
        }
    }

    @Override // com.bytedance.ee.bear.bizwidget.shareview.AbstractC4881a, com.bytedance.ee.bear.share.newshare.BaseShareFragment
    /* renamed from: g */
    public void mo19179g() {
        C13479a.m54764b("BitableShareFragment", "onShareToWechat()...");
        ShareBitableShareAnalytic.f29611a.mo41753c();
        mo41703b(1);
        m45718a(ShareType.Wechat);
        mo5513b();
    }

    @Override // com.bytedance.ee.bear.bizwidget.shareview.AbstractC4881a, com.bytedance.ee.bear.share.newshare.BaseShareFragment
    /* renamed from: h */
    public void mo19180h() {
        C13479a.m54764b("BitableShareFragment", "onShareToWechatMoments()...");
        ShareBitableShareAnalytic.f29611a.mo41754d();
        mo41703b(2);
        m45714D();
        C11007b.m45854a(requireContext());
        mo5513b();
    }

    @Override // com.bytedance.ee.bear.bizwidget.shareview.AbstractC4881a, com.bytedance.ee.bear.share.newshare.BaseShareFragment
    /* renamed from: i */
    public void mo19181i() {
        C13479a.m54764b("BitableShareFragment", "onShareToQQ()...");
        ShareBitableShareAnalytic.f29611a.mo41755e();
        mo41703b(3);
        m45718a(ShareType.QQ);
        mo5513b();
    }

    @Override // com.bytedance.ee.bear.bizwidget.shareview.AbstractC4881a, com.bytedance.ee.bear.share.newshare.BaseShareFragment
    /* renamed from: j */
    public void mo19182j() {
        C13479a.m54764b("BitableShareFragment", "onShareToWeibo()...");
        ShareBitableShareAnalytic.f29611a.mo41756f();
        mo41703b(4);
        m45718a(ShareType.Weibo);
        mo5513b();
    }

    /* renamed from: E */
    private final String m45715E() {
        return C10539a.m43639a(requireContext(), R.string.Bitable_Form_ShareViaWechat, "formName", mo41708q().getDocName()) + mo41712u();
    }

    @Override // com.bytedance.ee.bear.bizwidget.shareview.AbstractC4881a, com.bytedance.ee.bear.share.newshare.BaseShareFragment
    public void H_() {
        boolean z;
        ConnectionService.NetworkState b;
        C13479a.m54764b("BitableShareFragment", "onShareToByteMoments()...");
        ShareBitableShareAnalytic.f29611a.mo41759i();
        ConnectionService d = C5084ad.m20847d();
        if (d == null || (b = d.mo20038b()) == null) {
            z = false;
        } else {
            z = b.mo20041b();
        }
        if (!z) {
            Toast.showFailureText(getContext(), (int) R.string.Doc_Share_FailNoNet);
            return;
        }
        C10989d.m45672a(m45715E(), "", "", mo41710s());
        mo5513b();
    }

    @Override // com.bytedance.ee.bear.bizwidget.shareview.AbstractC4881a, com.bytedance.ee.bear.share.newshare.BaseShareFragment
    /* renamed from: c */
    public void mo19176c() {
        C13479a.m54764b("BitableShareFragment", "onCopyLink()...");
        ShareBitableShareAnalytic.f29611a.mo41752b();
        if (m45714D()) {
            Toast.showSuccessText(getContext(), (int) R.string.Doc_Facade_CopyLinkSuccessfully);
        } else {
            Toast.showFailureText(getContext(), (int) R.string.Doc_Facade_CopyLinkFailed);
        }
        mo5513b();
    }

    @Override // com.bytedance.ee.bear.bizwidget.shareview.AbstractC4881a, com.bytedance.ee.bear.share.newshare.BaseShareFragment
    /* renamed from: l */
    public void mo19184l() {
        C13479a.m54764b("BitableShareFragment", "onShareMore()...");
        ShareBitableShareAnalytic.f29611a.mo41757g();
        mo41703b(5);
        C11007b.m45853a(getActivity(), m45715E());
        mo5513b();
    }

    /* renamed from: B */
    private final void m45713B() {
        ((ExternalShareView) mo41695a(R.id.shareExternalView)).mo19155a(C11006a.m45841a(mo41710s(), mo41708q().getSource(), mo41708q().getType(), mo41708q().getToken(), mo41708q().isWiki(), true, mo41708q().getMindnoteViewType(), mo41708q().getDisabledShareTypes(), mo41708q().getBadgeShareTypes()));
        ((ExternalShareView) mo41695a(R.id.shareExternalView)).setInterceptNotClick(false);
    }

    @Override // com.bytedance.ee.bear.bizwidget.shareview.AbstractC4881a, com.bytedance.ee.bear.share.newshare.BaseShareFragment
    /* renamed from: a */
    public void mo19175a() {
        C13479a.m54764b("BitableShareFragment", "onShareToLark()...");
        ShareBitableShareAnalytic.f29611a.mo41758h();
        C10989d.m45671a(mo41708q().getDocName(), mo41712u(), mo41710s());
        mo5513b();
    }

    @Override // com.bytedance.ee.bear.share.newshare.BaseShareFragment
    /* renamed from: m */
    public void mo41704m() {
        boolean z;
        super.mo41704m();
        if (mo41708q().getBitableShareMeta().getShareToken().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            mo41708q().setUrl(m45717a(mo41708q().getBitableShareMeta().getShareToken()));
        }
        AbstractC5233x b = C5234y.m21391b();
        b.mo21077a("bitableFormPermCommonParams");
        b.mo21078a("bitableFormPermCommonParams", "bitable_id", C13598b.m55197d(mo41708q().getToken()));
        b.mo21078a("bitableFormPermCommonParams", "table_id", C13598b.m55197d(mo41708q().getTableId()));
        b.mo21078a("bitableFormPermCommonParams", "view_id", C13598b.m55197d(mo41708q().getViewId()));
        b.mo21078a("bitableFormPermCommonParams", "bitable_type", mo41708q().getBitableType());
        b.mo21078a("bitableFormPermCommonParams", "is_full_screen", "true");
        b.mo21078a("bitableFormPermCommonParams", "view_type", "form");
    }

    @Override // com.bytedance.ee.bear.share.newshare.BaseShareFragment
    /* renamed from: o */
    public void mo41706o() {
        if (this.f29604l) {
            C13479a.m54775e("BitableShareFragment", "shareToken is empty!!!");
            this.f29601c = new BitableShareInfo(mo41708q().getToken(), mo41708q().getType(), new BitableSharePermission(null, null, 3, null));
            mo41745a(new BitableSharePermission(null, null, 3, null));
            return;
        }
        mo41709r().mo237937a(mo41711t().mo36638a().mo36645a(mo41708q().getToken(), mo41708q().getBitableShareMeta().getShareToken(), mo41708q().getTableId(), mo41708q().getViewId(), mo41708q().getShareType()).mo237985a(C11678b.m48481e()).mo238001b(new C10994b(this), new C10995c(this)));
    }

    /* renamed from: a */
    private final void m45718a(ShareType shareType) {
        C11007b.m45856a(requireContext(), shareType, m45715E(), null);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.share.bitableshare.b$c */
    public static final class C10995c<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ BitableShareFragment f29607a;

        C10995c(BitableShareFragment bVar) {
            this.f29607a = bVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54759a("BitableShareFragment", "updatePermission()...error", th);
            BitableShareFragment bVar = this.f29607a;
            Intrinsics.checkExpressionValueIsNotNull(th, "it");
            bVar.mo41700a(th);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/middleground_permission_export/model/form/BitableSharePermission;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.share.bitableshare.b$b */
    public static final class C10994b<T> implements Consumer<BitableSharePermission> {

        /* renamed from: a */
        final /* synthetic */ BitableShareFragment f29606a;

        C10994b(BitableShareFragment bVar) {
            this.f29606a = bVar;
        }

        /* renamed from: a */
        public final void accept(BitableSharePermission bitableSharePermission) {
            BitableShareFragment bVar = this.f29606a;
            String token = bVar.mo41708q().getToken();
            int type = this.f29606a.mo41708q().getType();
            Intrinsics.checkExpressionValueIsNotNull(bitableSharePermission, "it");
            bVar.f29601c = new BitableShareInfo(token, type, bitableSharePermission);
            this.f29606a.mo41745a(bitableSharePermission);
        }
    }

    /* renamed from: a */
    private final String m45717a(String str) {
        al d = C4511g.m18594d();
        Uri.Builder scheme = new Uri.Builder().scheme("https");
        Intrinsics.checkExpressionValueIsNotNull(d, "infoProvideService");
        Uri.Builder authority = scheme.authority(d.mo17363m());
        Uri build = authority.path("share/base/" + str).build();
        Intrinsics.checkExpressionValueIsNotNull(build, "Uri.Builder().scheme(\"ht…\n                .build()");
        String uri = build.toString();
        Intrinsics.checkExpressionValueIsNotNull(uri, "uri.toString()");
        return uri;
    }

    /* renamed from: c */
    private final void m45719c(boolean z) {
        View view = this.f29602j;
        if (view instanceof IBitableSharePermSetInfo) {
            if (view != null) {
                ((IBitableSharePermSetInfo) view).setEnable(z);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.middleground_permission_export.model.permissionset.IBitableSharePermSetInfo");
            }
        }
        View view2 = this.f29603k;
        if (view2 instanceof IBitableSharePermSetInfo) {
            if (view2 != null) {
                ((IBitableSharePermSetInfo) view2).setEnable(z);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.middleground_permission_export.model.permissionset.IBitableSharePermSetInfo");
            }
        }
        List<ShareItemModel> a = C11006a.m45841a(mo41710s(), mo41708q().getSource(), mo41708q().getType(), mo41708q().getToken(), mo41708q().isWiki(), true, mo41708q().getMindnoteViewType(), mo41708q().getDisabledShareTypes(), mo41708q().getBadgeShareTypes());
        if (!z) {
            for (ShareItemModel shareItemModel : a) {
                Intrinsics.checkExpressionValueIsNotNull(shareItemModel, "shareItemModel");
                shareItemModel.setState(ShareState.NOT_CLICK);
            }
            Context requireContext = requireContext();
            Intrinsics.checkExpressionValueIsNotNull(requireContext, "requireContext()");
            ((ExternalShareView) mo41695a(R.id.shareExternalView)).setOnShareItemClickListener(new BitableShareBottomMenuClickListenerImpl(requireContext));
        } else {
            ((ExternalShareView) mo41695a(R.id.shareExternalView)).setOnShareItemClickListener(this);
        }
        ((ExternalShareView) mo41695a(R.id.shareExternalView)).mo19155a(a);
    }

    /* renamed from: a */
    public final void mo41745a(BitableSharePermission bitableSharePermission) {
        BitableSharePermSetInfo bitableSharePermSetInfo = new BitableSharePermSetInfo(mo41708q().getUrl(), mo41708q().getType(), mo41708q().getToken(), mo41708q().getBitableShareMeta(), bitableSharePermission);
        View view = this.f29602j;
        if (view instanceof IBitableSharePermSetInfo) {
            if (view != null) {
                ((IBitableSharePermSetInfo) view).setBitableSharePermSetInfo(bitableSharePermSetInfo);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.middleground_permission_export.model.permissionset.IBitableSharePermSetInfo");
            }
        }
        View view2 = this.f29603k;
        if (view2 instanceof IBitableSharePermSetInfo) {
            if (view2 != null) {
                ((IBitableSharePermSetInfo) view2).setBitableSharePermSetInfo(bitableSharePermSetInfo);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.middleground_permission_export.model.permissionset.IBitableSharePermSetInfo");
            }
        }
        if (!bitableSharePermission.mo38769a().canShare()) {
            C13479a.m54764b("BitableShareFragment", "can not share");
            m45719c(false);
        }
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        boolean z2;
        m45719c(z);
        if (this.f29604l) {
            if (mo41708q().getBitableShareMeta().getShareToken().length() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                this.f29604l = false;
                mo41706o();
                mo41708q().setUrl(m45717a(mo41708q().getBitableShareMeta().getShareToken()));
            }
        }
    }

    @Override // androidx.fragment.app.Fragment, com.bytedance.ee.bear.share.newshare.BaseShareFragment
    public void onViewCreated(View view, Bundle bundle) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        ((BaseTitleBar) mo41695a(R.id.share_title_bar)).setTitle(R.string.Bitable_Form_ShareForm);
        ((BaseTitleBar) mo41695a(R.id.share_title_bar)).setMainTitleSize(17.0f);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
        Context requireContext = requireContext();
        Intrinsics.checkExpressionValueIsNotNull(requireContext, "requireContext()");
        BitableShareSwitchView bitableShareSwitchView = new BitableShareSwitchView(requireContext);
        bitableShareSwitchView.mo41738a(mo41708q().getToken(), mo41708q().getTableId(), mo41708q().getViewId(), mo41708q().getShareType(), mo41708q().getBitableShareMeta(), this);
        SpaceSettingGroupLayout A = mo41694A();
        ((LinearLayout) mo41695a(R.id.shareContainer)).addView(A);
        A.addView(bitableShareSwitchView, layoutParams);
        View a = mo41711t().mo36639b().mo36660a(getContext());
        this.f29602j = a;
        A.addView(a, layoutParams);
        this.f29603k = mo41711t().mo36639b().mo36664a(requireActivity(), mo41708q().getType(), mo41708q().getToken(), mo41708q().getBitableShareMeta().getShareToken());
        ((LinearLayout) mo41695a(R.id.shareContainer)).addView(this.f29603k, layoutParams);
        m45713B();
        m45719c(mo41708q().getBitableShareMeta().isOpen());
        if (mo41708q().getBitableShareMeta().getShareToken().length() == 0) {
            z = true;
        } else {
            z = false;
        }
        this.f29604l = z;
        ShareBitableShareAnalytic.f29611a.mo41750a();
    }
}
