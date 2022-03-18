package com.bytedance.ee.bear.share.newshare;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.ee.bear.DocMetaInfo;
import com.bytedance.ee.bear.bizwidget.shareview.ExternalShareView;
import com.bytedance.ee.bear.bizwidget.shareview.ShareType;
import com.bytedance.ee.bear.contract.AbstractC5089af;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.document.AbstractC6158t;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.guide.p396b.C7811a;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.dto.DocVersion;
import com.bytedance.ee.bear.list.p424c.AbstractC8149a;
import com.bytedance.ee.bear.middleground_permission_export.model.doc.DocPermission;
import com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission;
import com.bytedance.ee.bear.middleground_permission_export.model.p499a.AbstractC10159e;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.DocPermSetInfo;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.IDocPermSetInfo;
import com.bytedance.ee.bear.service.remote.BinderParcel;
import com.bytedance.ee.bear.share.IShareInfo;
import com.bytedance.ee.bear.share.ShareDocInfo;
import com.bytedance.ee.bear.share.export.ShareParams;
import com.bytedance.ee.bear.share.externalshare.C11006a;
import com.bytedance.ee.bear.share.notification.ShareNotifySetView;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.bear.widgets.universedesign.SpaceSettingGroupLayout;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13749l;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.diskmanage.cipher.C36808a;
import com.ss.android.lark.doc.IReminder;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.AbstractC68314f;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000 ,2\u00020\u0001:\u0001,B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\n\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0016H\u0016J\b\u0010\u001a\u001a\u00020\u0016H\u0002J\b\u0010\u001b\u001a\u00020\u0016H\u0016J\b\u0010\u001c\u001a\u00020\u0016H\u0016J\b\u0010\u001d\u001a\u00020\u0016H\u0016J\b\u0010\u001e\u001a\u00020\u0016H\u0016J\b\u0010\u001f\u001a\u00020\u0016H\u0016J\b\u0010 \u001a\u00020\u0016H\u0016J\u001a\u0010!\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\b2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u0010%\u001a\u00020\u0016H\u0002J\u0010\u0010&\u001a\u00020\u00162\u0006\u0010'\u001a\u00020\u0013H\u0002J\u0010\u0010(\u001a\u00020\u00162\u0006\u0010)\u001a\u00020\u0011H\u0002J\b\u0010*\u001a\u00020\u0016H\u0016J\u0010\u0010+\u001a\u00020\u00162\u0006\u0010)\u001a\u00020\u0011H\u0002R\"\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\"\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/bytedance/ee/bear/share/newshare/ShareDocFragment;", "Lcom/bytedance/ee/bear/share/newshare/BaseShareFragment;", "()V", "badgeShareTypes", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "collAvatarView", "Landroid/view/View;", "disabledShareTypes", "linkShareView", "notifySetView", "Lcom/bytedance/ee/bear/share/notification/ShareNotifySetView;", "permSetView", "reminder", "Lcom/ss/android/lark/doc/IReminder;", "shareDocInfo", "Lcom/bytedance/ee/bear/share/ShareDocInfo;", "showNotifySetView", "", "wiki2Disable", "fetchDocPermAndInfo", "", "getShareInfo", "Lcom/bytedance/ee/bear/share/IShareInfo;", "initData", "initPeekHeight", "onCopyLink", "onExportImage", "onResume", "onShareToByteMoments", "onSlideExport", "onStart", "onViewCreated", "view", "savedInstanceState", "Landroid/os/Bundle;", "showOnBoardingIfNeed", "updateExternalShareView", "canExport", "updatePermSetInfoToView", "shareInfo", "updatePermission", "updateViewStatus", "Companion", "share-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.share.a.b */
public class ShareDocFragment extends BaseShareFragment {

    /* renamed from: d */
    public static final Companion f29560d = new Companion(null);

    /* renamed from: c */
    public ShareDocInfo f29561c;

    /* renamed from: j */
    private IReminder f29562j;

    /* renamed from: k */
    private boolean f29563k = true;

    /* renamed from: l */
    private ArrayList<Integer> f29564l;

    /* renamed from: m */
    private ArrayList<Integer> f29565m;

    /* renamed from: n */
    private View f29566n;

    /* renamed from: o */
    private View f29567o;

    /* renamed from: p */
    private View f29568p;

    /* renamed from: q */
    private ShareNotifySetView f29569q;

    /* renamed from: r */
    private boolean f29570r;

    /* renamed from: s */
    private HashMap f29571s;

    @JvmStatic
    /* renamed from: a */
    public static final ShareDocFragment m45635a(ShareParams shareParams, Bundle bundle) {
        return f29560d.mo41724a(shareParams, bundle);
    }

    @Override // com.bytedance.ee.bear.share.newshare.BaseShareFragment
    /* renamed from: a */
    public View mo41695a(int i) {
        if (this.f29571s == null) {
            this.f29571s = new HashMap();
        }
        View view = (View) this.f29571s.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f29571s.put(Integer.valueOf(i), findViewById);
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
        HashMap hashMap = this.f29571s;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/bytedance/ee/bear/share/newshare/ShareDocFragment$Companion;", "", "()V", "EXTRA_REMINDER_BINDER", "", "TAG", "show", "Lcom/bytedance/ee/bear/share/newshare/ShareDocFragment;", "params", "Lcom/bytedance/ee/bear/share/export/ShareParams;", "reminderBinder", "Landroid/os/Bundle;", "share-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.share.a.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final ShareDocFragment mo41724a(ShareParams shareParams, Bundle bundle) {
            Intrinsics.checkParameterIsNotNull(shareParams, "params");
            Bundle bundle2 = new Bundle();
            bundle2.putSerializable("extra_params", shareParams);
            if (bundle != null) {
                bundle2.putBundle("extra_reminder_binder", bundle);
            }
            String name = ShareDocFragment.class.getName();
            Intrinsics.checkExpressionValueIsNotNull(name, "ShareDocFragment::class.java.name");
            Fragment instantiate = Fragment.instantiate(shareParams.getActivity(), name, bundle2);
            if (instantiate != null) {
                ShareDocFragment bVar = (ShareDocFragment) instantiate;
                bVar.mo5511a(shareParams.getActivity().getSupportFragmentManager(), name);
                return bVar;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.share.newshare.ShareDocFragment");
        }
    }

    @Override // com.bytedance.ee.bear.share.newshare.BaseShareFragment
    /* renamed from: o */
    public void mo41706o() {
        m45634E();
    }

    @Override // com.bytedance.ee.bear.share.newshare.BaseShareFragment
    /* renamed from: n */
    public IShareInfo mo41705n() {
        return this.f29561c;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        m45634E();
    }

    @Override // com.bytedance.ee.bear.bizwidget.shareview.AbstractC4881a, com.bytedance.ee.bear.share.newshare.BaseShareFragment
    public void I_() {
        super.I_();
        ((AbstractC5089af) KoinJavaComponent.m268613a(AbstractC5089af.class, null, null, 6, null)).mo20183a();
        mo5513b();
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        if (C13749l.m55763g(getContext())) {
            m45633D();
        }
    }

    @Override // com.bytedance.ee.bear.bizwidget.shareview.AbstractC4881a, com.bytedance.ee.bear.share.newshare.BaseShareFragment
    /* renamed from: c */
    public void mo19176c() {
        IDocPublicPermission iDocPublicPermission;
        boolean z;
        String str;
        DocPermission x;
        super.mo19176c();
        ShareDocInfo shareDocInfo = this.f29561c;
        if (shareDocInfo == null || (x = shareDocInfo.mo41682x()) == null) {
            iDocPublicPermission = null;
        } else {
            iDocPublicPermission = x.mo38594b();
        }
        boolean z2 = false;
        if (iDocPublicPermission == null || !iDocPublicPermission.isOwner()) {
            z = false;
        } else {
            z = true;
        }
        if (iDocPublicPermission != null && iDocPublicPermission.hasLinkPassword()) {
            z2 = true;
        }
        if (iDocPublicPermission == null || (str = iDocPublicPermission.linkPassword()) == null) {
            str = "";
        }
        mo41702a(z, z2, str);
    }

    /* renamed from: D */
    private final void m45633D() {
        ViewGroup.LayoutParams layoutParams;
        Window window;
        View decorView;
        FrameLayout frameLayout;
        try {
            Dialog v_ = v_();
            if (v_ == null || (window = v_.getWindow()) == null || (decorView = window.getDecorView()) == null || (frameLayout = (FrameLayout) decorView.findViewById(R.id.design_bottom_sheet)) == null) {
                layoutParams = null;
            } else {
                layoutParams = frameLayout.getLayoutParams();
            }
            if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
                CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
                if (behavior instanceof BottomSheetBehavior) {
                    ((BottomSheetBehavior) behavior).mo76702a(UIUtils.getScreenHeight(getContext()));
                }
            }
        } catch (Throwable th) {
            C13479a.m54759a("ShareDocFragment", "init peek height", th);
        }
    }

    /* renamed from: B */
    public final void mo41722B() {
        Window window;
        if (mo41708q().getSource() == 2) {
            View view = this.f29567o;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("linkShareView");
            }
            View findViewById = view.findViewById(R.id.linkShareTitle);
            if (findViewById != null) {
                boolean isOwner = mo41708q().isOwner();
                Dialog v_ = v_();
                if (v_ != null) {
                    window = v_.getWindow();
                } else {
                    window = null;
                }
                C7811a.m31301a(isOwner, findViewById, window, getActivity(), getString(R.string.Doc_Share_OnboardingDesc), C8275a.m34050a(mo41708q().getType()));
            }
        }
    }

    @Override // com.bytedance.ee.bear.bizwidget.shareview.AbstractC4881a, com.bytedance.ee.bear.share.newshare.BaseShareFragment
    public void H_() {
        boolean z;
        ConnectionService.NetworkState b;
        super.H_();
        ConnectionService d = C5084ad.m20847d();
        if (d == null || (b = d.mo20038b()) == null) {
            z = false;
        } else {
            z = b.mo20041b();
        }
        if (!z) {
            Toast.showFailureText(getContext(), getString(R.string.Doc_Share_FailNoNet), 0);
        } else {
            C10989d.m45672a(mo41712u(), mo41708q().getDocContent(), mo41708q().getDocTopic(), mo41710s());
        }
    }

    @Override // com.bytedance.ee.bear.bizwidget.shareview.AbstractC4881a, com.bytedance.ee.bear.share.newshare.BaseShareFragment
    /* renamed from: d */
    public void mo19177d() {
        super.mo19177d();
        int c = C36808a.m145211c();
        C13479a.m54772d("ShareDocFragment", "onExportImage... triggered with status: " + c);
        if (C36808a.m145211c() == 1) {
            Toast.showText(getContext(), getString(R.string.CreationMobile_ECM_ShareSecuritySettingKAToast), 1);
            mo5513b();
            return;
        }
        if (mo41708q().getType() == 3) {
            ((AbstractC5089af) KoinJavaComponent.m268613a(AbstractC5089af.class, null, null, 6, null)).mo20183a();
        } else {
            ((AbstractC5089af) KoinJavaComponent.m268613a(AbstractC5089af.class, null, null, 6, null)).mo20188a(ShareType.ExportImage.name());
        }
        mo5513b();
    }

    /* renamed from: E */
    private final void m45634E() {
        mo41709r().mo237937a(AbstractC68307f.m265094a(mo41711t().mo36638a().mo36642a(mo41708q().getToken(), mo41708q().getType()), ((AbstractC6158t) KoinJavaComponent.m268613a(AbstractC6158t.class, null, null, 6, null)).mo20313a(mo41708q().getToken(), mo41708q().getType()), ((AbstractC8149a) KoinJavaComponent.m268613a(AbstractC8149a.class, null, null, 6, null)).mo31488a(mo41708q().getToken(), mo41708q().getType()), new C10980b(this)).mo237985a(C11678b.m48481e()).mo238001b(new C10981c(this), new C10982d(this)));
    }

    @Override // com.bytedance.ee.bear.share.newshare.BaseShareFragment
    /* renamed from: m */
    public void mo41704m() {
        boolean z;
        IBinder asBinder;
        Bundle bundle;
        super.mo41704m();
        if (!TextUtils.isEmpty(mo41708q().getFeedId())) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                bundle = arguments.getBundle("extra_reminder_binder");
            } else {
                bundle = null;
            }
            if (bundle != null) {
                bundle.setClassLoader(BinderParcel.class.getClassLoader());
                BinderParcel binderParcel = (BinderParcel) bundle.getParcelable("remind_binder");
                if (binderParcel != null) {
                    this.f29562j = IReminder.Stub.asInterface(binderParcel.mo41529a());
                }
            }
        }
        boolean z2 = false;
        if (!mo41708q().isWiki() || !mo41708q().isWikiVersionV2() || !mo41711t().mo36640c().mo36636b()) {
            z = false;
        } else {
            z = true;
        }
        this.f29563k = z;
        IReminder iReminder = this.f29562j;
        if (iReminder != null && (asBinder = iReminder.asBinder()) != null && asBinder.isBinderAlive() && !TextUtils.isEmpty(mo41708q().getFeedId())) {
            z2 = true;
        }
        this.f29570r = z2;
        C13479a.m54764b("ShareDocFragment", "isOwner=" + mo41708q() + ".isOwner, wiki2Disable=" + this.f29563k + ", " + "passwordSharingEnable=" + mo41708q() + ".passwordSharingEnable, " + "transferOwnerEnable: " + mo41708q() + ".transferOwnerEnable");
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.share.a.b$d */
    public static final class C10982d<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ ShareDocFragment f29574a;

        C10982d(ShareDocFragment bVar) {
            this.f29574a = bVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54759a("ShareDocFragment", "fetch metaInfo and permission failed", th);
            ShareDocFragment bVar = this.f29574a;
            Intrinsics.checkExpressionValueIsNotNull(th, "it");
            bVar.mo41700a(th);
        }
    }

    /* renamed from: c */
    public final void mo38116c(boolean z) {
        ((ExternalShareView) mo41695a(R.id.shareExternalView)).mo19155a(C11006a.m45841a(mo41710s(), mo41708q().getSource(), mo41708q().getType(), mo41708q().getToken(), mo41708q().isWiki(), z, mo41708q().getMindnoteViewType(), this.f29564l, this.f29565m));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/share/ShareDocInfo;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.share.a.b$c */
    public static final class C10981c<T> implements Consumer<ShareDocInfo> {

        /* renamed from: a */
        final /* synthetic */ ShareDocFragment f29573a;

        C10981c(ShareDocFragment bVar) {
            this.f29573a = bVar;
        }

        /* renamed from: a */
        public final void accept(ShareDocInfo shareDocInfo) {
            this.f29573a.f29561c = shareDocInfo;
            this.f29573a.mo41708q().setOwner(shareDocInfo.mo41656c());
            this.f29573a.mo41708q().setDocName(shareDocInfo.mo41680w().getTitle());
            this.f29573a.mo41708q().setCreateTime(shareDocInfo.mo41680w().getCreateTime());
            this.f29573a.mo41708q().setOwnerUid(shareDocInfo.mo41680w().getOwnerUid());
            ShareDocFragment bVar = this.f29573a;
            Intrinsics.checkExpressionValueIsNotNull(shareDocInfo, "it");
            bVar.mo41723a(shareDocInfo);
            this.f29573a.mo38116c(shareDocInfo.mo41682x().mo38591a().canExport());
            String reportJson = shareDocInfo.mo41682x().mo38591a().getReportJson();
            String reportJson2 = shareDocInfo.mo41682x().mo38594b().getReportJson();
            ShareDocFragment bVar2 = this.f29573a;
            bVar2.mo41699a(reportJson, reportJson2, bVar2.mo41708q().isAtVC());
            this.f29573a.mo41714w();
            this.f29573a.mo41722B();
        }
    }

    /* renamed from: b */
    private final void m45636b(ShareDocInfo shareDocInfo) {
        boolean z;
        int i;
        boolean isOwner = shareDocInfo.mo41682x().mo38594b().isOwner();
        boolean canManagePermissionMeta = shareDocInfo.mo41682x().mo38591a().canManagePermissionMeta();
        if ((isOwner || canManagePermissionMeta) && !this.f29563k) {
            z = true;
        } else {
            z = false;
        }
        View view = this.f29568p;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("permSetView");
        }
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
        if (this.f29570r) {
            View view2 = this.f29567o;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("linkShareView");
            }
            if (view2 != null) {
                ((IDocPermSetInfo) view2).setDivider(true);
                View view3 = this.f29568p;
                if (view3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("permSetView");
                }
                if (view3 != null) {
                    ((IDocPermSetInfo) view3).setDivider(true);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.middleground_permission_export.model.permissionset.IDocPermSetInfo");
            }
            throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.middleground_permission_export.model.permissionset.IDocPermSetInfo");
        } else if (z) {
            View view4 = this.f29567o;
            if (view4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("linkShareView");
            }
            if (view4 != null) {
                ((IDocPermSetInfo) view4).setDivider(true);
                View view5 = this.f29568p;
                if (view5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("permSetView");
                }
                if (view5 != null) {
                    ((IDocPermSetInfo) view5).setDivider(false);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.middleground_permission_export.model.permissionset.IDocPermSetInfo");
            }
            throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.middleground_permission_export.model.permissionset.IDocPermSetInfo");
        } else {
            View view6 = this.f29567o;
            if (view6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("linkShareView");
            }
            if (view6 != null) {
                ((IDocPermSetInfo) view6).setDivider(false);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.middleground_permission_export.model.permissionset.IDocPermSetInfo");
        }
    }

    /* renamed from: a */
    public final void mo41723a(ShareDocInfo shareDocInfo) {
        m45636b(shareDocInfo);
        DocPermSetInfo docPermSetInfo = new DocPermSetInfo(shareDocInfo.mo41676t(), shareDocInfo.mo41675s(), shareDocInfo.mo41678u(), mo41708q().isWiki(), shareDocInfo.mo41680w(), shareDocInfo.mo41682x(), shareDocInfo.mo41679v(), mo41708q().getPasswordSharingEnable(), mo41708q().getTransferOwnerEnable(), mo41708q().isWikiVersionV2());
        View view = this.f29566n;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("collAvatarView");
        }
        if (view != null) {
            ((IDocPermSetInfo) view).setDocPermSetInfo(docPermSetInfo);
            View view2 = this.f29567o;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("linkShareView");
            }
            if (view2 != null) {
                ((IDocPermSetInfo) view2).setDocPermSetInfo(docPermSetInfo);
                View view3 = this.f29568p;
                if (view3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("permSetView");
                }
                if (view3 != null) {
                    ((IDocPermSetInfo) view3).setDocPermSetInfo(docPermSetInfo);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.middleground_permission_export.model.permissionset.IDocPermSetInfo");
            }
            throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.middleground_permission_export.model.permissionset.IDocPermSetInfo");
        }
        throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.middleground_permission_export.model.permissionset.IDocPermSetInfo");
    }

    @Override // androidx.fragment.app.Fragment, com.bytedance.ee.bear.share.newshare.BaseShareFragment
    public void onViewCreated(View view, Bundle bundle) {
        boolean z;
        int i;
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        boolean z2 = true;
        if (!mo41708q().isOwner() || this.f29563k) {
            z = false;
        } else {
            z = true;
        }
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
        View a = mo41711t().mo36639b().mo36666a(getActivity(), mo41708q().getType(), mo41708q().getToken(), mo41708q().getDocName(), mo41708q().getModule(), mo41708q().isWiki(), true);
        Intrinsics.checkExpressionValueIsNotNull(a, "permDependency.view.getS…ule, params.isWiki, true)");
        this.f29566n = a;
        AbstractC10159e b = mo41711t().mo36639b();
        Context context = getContext();
        String module = mo41708q().getModule();
        if (!z && !this.f29570r) {
            z2 = false;
        }
        View a2 = b.mo36662a(context, module, z2);
        Intrinsics.checkExpressionValueIsNotNull(a2, "permDependency.view.getD…Set || showNotifySetView)");
        this.f29567o = a2;
        LinearLayout linearLayout = (LinearLayout) mo41695a(R.id.shareContainer);
        View view2 = this.f29566n;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("collAvatarView");
        }
        linearLayout.addView(view2, layoutParams);
        SpaceSettingGroupLayout A = mo41694A();
        ((LinearLayout) mo41695a(R.id.shareContainer)).addView(A);
        View view3 = this.f29567o;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("linkShareView");
        }
        A.addView(view3, layoutParams);
        View a3 = mo41711t().mo36639b().mo36661a(getContext(), mo41708q().getUrl(), mo41708q().getToken(), mo41708q().getType(), mo41708q().getModule(), this.f29570r);
        Intrinsics.checkExpressionValueIsNotNull(a3, "permDependency.view.getP…odule, showNotifySetView)");
        this.f29568p = a3;
        if (a3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("permSetView");
        }
        A.addView(a3, layoutParams);
        View view4 = this.f29568p;
        if (view4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("permSetView");
        }
        int i2 = 8;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view4.setVisibility(i);
        Context requireContext = requireContext();
        Intrinsics.checkExpressionValueIsNotNull(requireContext, "requireContext()");
        ShareNotifySetView shareNotifySetView = new ShareNotifySetView(requireContext);
        this.f29569q = shareNotifySetView;
        if (shareNotifySetView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("notifySetView");
        }
        shareNotifySetView.mo42015a(mo41708q().getFeedId(), this.f29562j);
        LinearLayout linearLayout2 = (LinearLayout) mo41695a(R.id.shareContainer);
        ShareNotifySetView shareNotifySetView2 = this.f29569q;
        if (shareNotifySetView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("notifySetView");
        }
        linearLayout2.addView(shareNotifySetView2, layoutParams);
        ShareNotifySetView shareNotifySetView3 = this.f29569q;
        if (shareNotifySetView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("notifySetView");
        }
        if (this.f29570r) {
            i2 = 0;
        }
        shareNotifySetView3.setVisibility(i2);
        mo38116c(false);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/share/ShareDocInfo;", "docPermission", "Lcom/bytedance/ee/bear/middleground_permission_export/model/doc/DocPermission;", "docMetaInfo", "Lcom/bytedance/ee/bear/DocMetaInfo;", HiAnalyticsConstant.HaKey.BI_KEY_VERSION, "Lcom/bytedance/ee/bear/list/dto/DocVersion;", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.share.a.b$b */
    public static final class C10980b<T1, T2, T3, R> implements AbstractC68314f<DocPermission, DocMetaInfo, DocVersion, ShareDocInfo> {

        /* renamed from: a */
        final /* synthetic */ ShareDocFragment f29572a;

        C10980b(ShareDocFragment bVar) {
            this.f29572a = bVar;
        }

        /* renamed from: a */
        public final ShareDocInfo apply(DocPermission docPermission, DocMetaInfo docMetaInfo, DocVersion docVersion) {
            Intrinsics.checkParameterIsNotNull(docPermission, "docPermission");
            Intrinsics.checkParameterIsNotNull(docMetaInfo, "docMetaInfo");
            Intrinsics.checkParameterIsNotNull(docVersion, HiAnalyticsConstant.HaKey.BI_KEY_VERSION);
            return new ShareDocInfo(this.f29572a.mo41708q().getType(), this.f29572a.mo41708q().getUrl(), this.f29572a.mo41708q().getToken(), docVersion, docMetaInfo, docPermission);
        }
    }
}
