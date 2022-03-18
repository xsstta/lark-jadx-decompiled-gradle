package com.bytedance.ee.bear.share.newshare;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.ee.bear.bizwidget.shareview.ExternalShareView;
import com.bytedance.ee.bear.middleground_permission_export.model.folder.PermissionAction;
import com.bytedance.ee.bear.middleground_permission_export.model.folder.ShareFolderPermission;
import com.bytedance.ee.bear.middleground_permission_export.model.folder.ShareFolderPublicPermission;
import com.bytedance.ee.bear.middleground_permission_export.model.folder.ShareFolderUserPermission;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.FolderPermSetInfo;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.IFolderPermSetInfo;
import com.bytedance.ee.bear.share.IShareInfo;
import com.bytedance.ee.bear.share.ShareFolderInfo;
import com.bytedance.ee.bear.share.export.ShareParams;
import com.bytedance.ee.bear.share.externalshare.C11006a;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.bear.widgets.universedesign.SpaceSettingGroupLayout;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\nH\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\n\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\nH\u0016J\b\u0010\u0017\u001a\u00020\nH\u0016J\u001a\u0010\u0018\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bH\u0002J\b\u0010\u001c\u001a\u00020\nH\u0016J\b\u0010\u001d\u001a\u00020\nH\u0002R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/bytedance/ee/bear/share/newshare/ShareFolderFragment;", "Lcom/bytedance/ee/bear/share/newshare/BaseShareFragment;", "()V", "folderPermSetInfoToViewList", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/IFolderPermSetInfo;", "Lkotlin/collections/ArrayList;", "shareFolderInfo", "Lcom/bytedance/ee/bear/share/ShareFolderInfo;", "addPermSetInfoView", "", "view", "Landroid/view/View;", "fetchFolderPerm", "getPersonalFolderUserPerm", "Lcom/bytedance/ee/bear/middleground_permission_export/model/folder/ShareFolderUserPermission;", "getShareInfo", "Lcom/bytedance/ee/bear/share/IShareInfo;", "shareFolderPerm", "Lcom/bytedance/ee/bear/middleground_permission_export/model/folder/ShareFolderPermission;", "linkShareViewEnable", "", "onCopyLink", "onResume", "onViewCreated", "savedInstanceState", "Landroid/os/Bundle;", "updateFolderPermSetInfo", "updatePermission", "updateShareItemState", "Companion", "share-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.share.a.c */
public final class ShareFolderFragment extends BaseShareFragment {

    /* renamed from: d */
    public static final Companion f29575d = new Companion(null);

    /* renamed from: c */
    public ShareFolderInfo f29576c;

    /* renamed from: j */
    private final ArrayList<IFolderPermSetInfo> f29577j = new ArrayList<>();

    /* renamed from: k */
    private HashMap f29578k;

    @JvmStatic
    /* renamed from: a */
    public static final ShareFolderFragment m45655a(ShareParams shareParams) {
        return f29575d.mo41730a(shareParams);
    }

    @Override // com.bytedance.ee.bear.share.newshare.BaseShareFragment
    /* renamed from: a */
    public View mo41695a(int i) {
        if (this.f29578k == null) {
            this.f29578k = new HashMap();
        }
        View view = (View) this.f29578k.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f29578k.put(Integer.valueOf(i), findViewById);
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
        HashMap hashMap = this.f29578k;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/share/newshare/ShareFolderFragment$Companion;", "", "()V", "TAG", "", "show", "Lcom/bytedance/ee/bear/share/newshare/ShareFolderFragment;", "params", "Lcom/bytedance/ee/bear/share/export/ShareParams;", "share-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.share.a.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final ShareFolderFragment mo41730a(ShareParams shareParams) {
            Intrinsics.checkParameterIsNotNull(shareParams, "params");
            Bundle bundle = new Bundle();
            bundle.putSerializable("extra_params", shareParams);
            String name = ShareFolderFragment.class.getName();
            Intrinsics.checkExpressionValueIsNotNull(name, "ShareFolderFragment::class.java.name");
            Fragment instantiate = Fragment.instantiate(shareParams.getActivity(), name, bundle);
            if (instantiate != null) {
                ShareFolderFragment cVar = (ShareFolderFragment) instantiate;
                cVar.mo5511a(shareParams.getActivity().getSupportFragmentManager(), name);
                return cVar;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.share.newshare.ShareFolderFragment");
        }
    }

    @Override // com.bytedance.ee.bear.share.newshare.BaseShareFragment
    /* renamed from: n */
    public IShareInfo mo41705n() {
        return this.f29576c;
    }

    @Override // com.bytedance.ee.bear.share.newshare.BaseShareFragment
    /* renamed from: o */
    public void mo41706o() {
        super.mo41706o();
        m45651B();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        m45651B();
    }

    /* renamed from: D */
    private final ShareFolderUserPermission m45652D() {
        int i;
        if (mo41708q().isOwner()) {
            i = 2;
        } else {
            i = 1;
        }
        return new ShareFolderUserPermission(i, PermissionAction.Companion.mo38686a(), mo41708q().getFolderVersion(), mo41708q().isShareRoot(), null, 16, null);
    }

    /* renamed from: E */
    private final void m45653E() {
        ((ExternalShareView) mo41695a(R.id.shareExternalView)).mo19155a(C11006a.m45842a(mo41710s(), mo41708q().getType(), mo41708q().getToken()));
    }

    /* renamed from: F */
    private final boolean m45654F() {
        if (!mo41708q().getFolderVersion().isShareFolderV2() && mo41708q().getFolderVersion().isPersonalFolder()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ee.bear.bizwidget.shareview.AbstractC4881a, com.bytedance.ee.bear.share.newshare.BaseShareFragment
    /* renamed from: c */
    public void mo19176c() {
        ShareFolderPublicPermission shareFolderPublicPermission;
        boolean z;
        String str;
        ShareFolderPermission t;
        super.mo19176c();
        ShareFolderInfo shareFolderInfo = this.f29576c;
        if (shareFolderInfo == null || (t = shareFolderInfo.mo41689t()) == null) {
            shareFolderPublicPermission = null;
        } else {
            shareFolderPublicPermission = t.mo38690b();
        }
        boolean z2 = false;
        if (shareFolderPublicPermission == null || !shareFolderPublicPermission.isOwner()) {
            z = false;
        } else {
            z = true;
        }
        if (shareFolderPublicPermission != null && shareFolderPublicPermission.getHasLinkPassword()) {
            z2 = true;
        }
        if (shareFolderPublicPermission == null || (str = shareFolderPublicPermission.getLinkPassword()) == null) {
            str = "";
        }
        mo41702a(z, z2, str);
    }

    /* renamed from: B */
    private final void m45651B() {
        String str;
        String str2;
        if (!mo41708q().getFolderVersion().isFolderV1()) {
            if (mo41708q().getFolderVersion().isShareFolderV2()) {
                str = mo41708q().getToken();
            } else {
                str = mo41708q().getSpaceId();
            }
            mo41709r().mo237937a(mo41711t().mo36638a().mo36650b(str, mo41708q().getFolderVersion(), mo41708q().isShareRoot()).mo238020d(new C10986e(this)).mo237985a(C11678b.m48481e()).mo238001b(new C10987f(this), new C10988g(this)));
        } else if (mo41708q().getFolderVersion().isOldShareFolder() && !mo41708q().getFolderVersion().isPersonalFolder()) {
            if (mo41708q().getFolderVersion().isShareFolderV2()) {
                str2 = mo41708q().getToken();
            } else {
                str2 = mo41708q().getSpaceId();
            }
            mo41709r().mo237937a(mo41711t().mo36638a().mo36650b(str2, mo41708q().getFolderVersion(), mo41708q().isShareRoot()).mo238020d(new C10983b(this)).mo237985a(C11678b.m48481e()).mo238001b(new C10984c(this), new C10985d(this)));
        } else if (mo41708q().getFolderVersion().isPersonalFolder()) {
            ShareFolderInfo a = mo41728a(new ShareFolderPermission(m45652D(), new ShareFolderPublicPermission(mo41708q().isOwner(), false, false, false, null, 0, false, false, false, false, null, 2046, null)));
            this.f29576c = a;
            if (a == null) {
                Intrinsics.throwNpe();
            }
            mo41729a(a);
            mo41714w();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/share/ShareFolderInfo;", "it", "Lcom/bytedance/ee/bear/middleground_permission_export/model/folder/ShareFolderPermission;", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.share.a.c$b */
    public static final class C10983b<T, R> implements Function<T, R> {

        /* renamed from: a */
        final /* synthetic */ ShareFolderFragment f29579a;

        C10983b(ShareFolderFragment cVar) {
            this.f29579a = cVar;
        }

        /* renamed from: a */
        public final ShareFolderInfo apply(ShareFolderPermission shareFolderPermission) {
            Intrinsics.checkParameterIsNotNull(shareFolderPermission, "it");
            return this.f29579a.mo41728a(shareFolderPermission);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.share.a.c$d */
    public static final class C10985d<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ ShareFolderFragment f29581a;

        C10985d(ShareFolderFragment cVar) {
            this.f29581a = cVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54761a("ShareFolderFragment", th);
            ShareFolderFragment cVar = this.f29581a;
            Intrinsics.checkExpressionValueIsNotNull(th, "it");
            cVar.mo41700a(th);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/share/ShareFolderInfo;", "it", "Lcom/bytedance/ee/bear/middleground_permission_export/model/folder/ShareFolderPermission;", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.share.a.c$e */
    public static final class C10986e<T, R> implements Function<T, R> {

        /* renamed from: a */
        final /* synthetic */ ShareFolderFragment f29582a;

        C10986e(ShareFolderFragment cVar) {
            this.f29582a = cVar;
        }

        /* renamed from: a */
        public final ShareFolderInfo apply(ShareFolderPermission shareFolderPermission) {
            Intrinsics.checkParameterIsNotNull(shareFolderPermission, "it");
            return this.f29582a.mo41728a(shareFolderPermission);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.share.a.c$g */
    public static final class C10988g<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ ShareFolderFragment f29584a;

        C10988g(ShareFolderFragment cVar) {
            this.f29584a = cVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54761a("ShareFolderFragment", th);
            ShareFolderFragment cVar = this.f29584a;
            Intrinsics.checkExpressionValueIsNotNull(th, "it");
            cVar.mo41700a(th);
        }
    }

    /* renamed from: a */
    private final void m45656a(View view) {
        if (view instanceof IFolderPermSetInfo) {
            this.f29577j.add(view);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/share/ShareFolderInfo;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.share.a.c$c */
    public static final class C10984c<T> implements Consumer<ShareFolderInfo> {

        /* renamed from: a */
        final /* synthetic */ ShareFolderFragment f29580a;

        C10984c(ShareFolderFragment cVar) {
            this.f29580a = cVar;
        }

        /* renamed from: a */
        public final void accept(ShareFolderInfo shareFolderInfo) {
            this.f29580a.f29576c = shareFolderInfo;
            ShareFolderFragment cVar = this.f29580a;
            Intrinsics.checkExpressionValueIsNotNull(shareFolderInfo, "it");
            cVar.mo41729a(shareFolderInfo);
            this.f29580a.mo41714w();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/share/ShareFolderInfo;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.share.a.c$f */
    public static final class C10987f<T> implements Consumer<ShareFolderInfo> {

        /* renamed from: a */
        final /* synthetic */ ShareFolderFragment f29583a;

        C10987f(ShareFolderFragment cVar) {
            this.f29583a = cVar;
        }

        /* renamed from: a */
        public final void accept(ShareFolderInfo shareFolderInfo) {
            this.f29583a.f29576c = shareFolderInfo;
            ShareFolderFragment cVar = this.f29583a;
            Intrinsics.checkExpressionValueIsNotNull(shareFolderInfo, "it");
            cVar.mo41729a(shareFolderInfo);
            this.f29583a.mo41714w();
        }
    }

    /* renamed from: a */
    public final ShareFolderInfo mo41728a(ShareFolderPermission shareFolderPermission) {
        return new ShareFolderInfo(mo41708q().getType(), mo41708q().getUrl(), mo41708q().getToken(), mo41708q().getOwnerUid(), mo41708q().getCreateTime(), mo41708q().getSpaceId(), mo41708q().getOwnerTenantId(), mo41708q().getFolderVersion(), shareFolderPermission);
    }

    /* renamed from: a */
    public final void mo41729a(ShareFolderInfo shareFolderInfo) {
        FolderPermSetInfo folderPermSetInfo = new FolderPermSetInfo(mo41708q().getType(), mo41708q().getUrl(), mo41708q().getToken(), mo41708q().getDocName(), mo41708q().getOwnerUid(), mo41708q().getOwnerName(), shareFolderInfo.mo41655b(), shareFolderInfo.mo41688s(), shareFolderInfo.mo41661f(), shareFolderInfo.mo41689t(), mo41708q().getSpaceId(), mo41708q().getFolderVersion(), mo41708q().isShareRoot());
        Iterator<IFolderPermSetInfo> it = this.f29577j.iterator();
        while (it.hasNext()) {
            it.next().setFolderPermSetInfo(folderPermSetInfo);
        }
        ShareFolderUserPermission a = shareFolderInfo.mo41689t().mo38687a();
        mo41699a(a.getReportJson(), shareFolderInfo.mo41689t().mo38690b().getReportPublicPermJson(), false);
    }

    @Override // androidx.fragment.app.Fragment, com.bytedance.ee.bear.share.newshare.BaseShareFragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
        View a = mo41711t().mo36639b().mo36665a(getActivity(), mo41708q().getType(), mo41708q().getToken(), mo41708q().getSpaceId(), mo41708q().getModule(), mo41708q().getFolderVersion(), mo41708q().isShareRoot(), m45654F());
        ((LinearLayout) mo41695a(R.id.shareContainer)).addView(a, layoutParams);
        Intrinsics.checkExpressionValueIsNotNull(a, "collAvatarView");
        m45656a(a);
        if (m45654F()) {
            View a2 = mo41711t().mo36639b().mo36663a(getContext(), mo41708q().isShareRoot(), mo41708q().getModule(), false);
            SpaceSettingGroupLayout A = mo41694A();
            ((LinearLayout) mo41695a(R.id.shareContainer)).addView(A);
            A.addView(a2);
            Intrinsics.checkExpressionValueIsNotNull(a2, "linkShareView");
            m45656a(a2);
        }
        m45653E();
    }
}
