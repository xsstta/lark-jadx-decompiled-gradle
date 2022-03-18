package com.bytedance.ee.bear.middleground.permission.collaborator.sharecollaboratev2.bitableshare;

import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.middleground.permission.PermBitableShareAnalytic;
import com.bytedance.ee.bear.middleground.permission.collaborator.InviteMembersUtils;
import com.bytedance.ee.bear.middleground.permission.collaborator.ShareUserInfoResult;
import com.bytedance.ee.bear.middleground.permission.collaborator.sharecollaboratev2.IShareMemberView;
import com.bytedance.ee.bear.middleground_permission_export.model.MemberChangeListener;
import com.bytedance.ee.bear.middleground_permission_export.model.p499a.AbstractC10157c;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.BitableSharePermSetInfo;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.share.IShareMeta;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.IRequestCallback;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u0000 )2\u00020\u00012\u00020\u0002:\u0001)B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0016\u0010\u0017\u001a\u0010\u0012\f\u0012\n \u001a*\u0004\u0018\u00010\u00190\u00190\u0018H\u0002J\n\u0010\u001b\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001c\u001a\u00020\u0010H\u0002J\b\u0010\u001d\u001a\u00020\u0016H\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u001fH\u0016J\b\u0010!\u001a\u00020\u001fH\u0016J\b\u0010\"\u001a\u00020\u001fH\u0016J\u0010\u0010#\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020\u0006H\u0016J\b\u0010%\u001a\u00020\u001fH\u0002J\u0010\u0010&\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020\u0010H\u0016J\b\u0010(\u001a\u00020\u001fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/sharecollaboratev2/bitableshare/BitableShareMemberPresenter;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/sharecollaboratev2/bitableshare/IBitableShareMemberPresenter;", "Lcom/bytedance/ee/bear/middleground_permission_export/model/MemberChangeListener;", "context", "Landroidx/fragment/app/FragmentActivity;", ShareHitPoint.f121869d, "", "token", "", "shareToken", "view", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/sharecollaboratev2/IShareMemberView;", "(Landroidx/fragment/app/FragmentActivity;ILjava/lang/String;Ljava/lang/String;Lcom/bytedance/ee/bear/middleground/permission/collaborator/sharecollaboratev2/IShareMemberView;)V", "isDetach", "", "mPermSetInfo", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/BitableSharePermSetInfo;", "model", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/sharecollaboratev2/bitableshare/BitableShareMemberModel;", "serviceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "shareUserInfoResult", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/ShareUserInfoResult;", "getOriginUserInfos", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "kotlin.jvm.PlatformType", "getOwnerInfo", "getPermSetInfo", "getShareUserInfoResult", "onAttachedToWindow", "", "onClickMemberList", "onClickSearchBar", "onDetachFromWindow", "onMemberChange", "from", "setCollaborateEnable", "setPermSetInfo", "bitableSharePermSetInfo", "unlock", "Companion", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.a.a.b */
public final class BitableShareMemberPresenter implements IBitableShareMemberPresenter, MemberChangeListener {

    /* renamed from: d */
    public static final Companion f25761d = new Companion(null);

    /* renamed from: a */
    public ShareUserInfoResult f25762a;

    /* renamed from: b */
    public boolean f25763b;

    /* renamed from: c */
    public final IShareMemberView f25764c;

    /* renamed from: e */
    private final C10917c f25765e = new C10917c(new C10929e());

    /* renamed from: f */
    private BitableShareMemberModel f25766f;

    /* renamed from: g */
    private BitableSharePermSetInfo f25767g;

    /* renamed from: h */
    private final FragmentActivity f25768h;

    /* renamed from: i */
    private final int f25769i;

    /* renamed from: j */
    private final String f25770j;

    /* renamed from: l */
    private final String f25771l;

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.sharecollaboratev2.IShareMemberPresenter
    /* renamed from: e */
    public void mo36774e() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/sharecollaboratev2/bitableshare/BitableShareMemberPresenter$Companion;", "", "()V", "TAG", "", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.a.a.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: h */
    private final ShareUserInfoResult m39746h() {
        ShareUserInfoResult shareUserInfoResult = this.f25762a;
        if (shareUserInfoResult != null) {
            return shareUserInfoResult;
        }
        return new ShareUserInfoResult();
    }

    /* renamed from: g */
    private final ArrayList<UserInfo> m39745g() {
        ArrayList<UserInfo> userInfoList;
        ShareUserInfoResult shareUserInfoResult = this.f25762a;
        if (shareUserInfoResult == null || (userInfoList = shareUserInfoResult.getUserInfoList()) == null) {
            return new ArrayList<>();
        }
        return userInfoList;
    }

    /* renamed from: i */
    private final BitableSharePermSetInfo m39747i() {
        BitableSharePermSetInfo bitableSharePermSetInfo = this.f25767g;
        if (bitableSharePermSetInfo != null) {
            return bitableSharePermSetInfo;
        }
        return new BitableSharePermSetInfo(null, this.f25769i, this.f25770j, null, null, 25, null);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.sharecollaboratev2.IShareMemberPresenter
    /* renamed from: b */
    public void mo36771b() {
        ((AbstractC10157c) KoinJavaComponent.m268613a(AbstractC10157c.class, null, null, 6, null)).mo36638a().mo36651b(this);
        this.f25763b = true;
        this.f25766f.mo36764a();
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.sharecollaboratev2.IShareMemberPresenter
    /* renamed from: c */
    public void mo36772c() {
        InviteMembersUtils.m39846a(this.f25768h, m39747i(), m39745g(), true);
        PermBitableShareAnalytic.f25618a.mo36529c();
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.sharecollaboratev2.IShareMemberPresenter
    /* renamed from: a */
    public void mo36769a() {
        ((AbstractC10157c) KoinJavaComponent.m268613a(AbstractC10157c.class, null, null, 6, null)).mo36638a().mo36648a(this);
        this.f25766f.mo36765a(new C9596b(this));
    }

    /* renamed from: f */
    public final void mo36775f() {
        boolean z;
        boolean z2;
        IShareMeta e;
        BitableSharePermSetInfo bitableSharePermSetInfo = this.f25767g;
        boolean z3 = false;
        if (bitableSharePermSetInfo == null) {
            this.f25764c.setCollaborateEnable(false);
            return;
        }
        if (bitableSharePermSetInfo == null || (e = bitableSharePermSetInfo.mo38785e()) == null) {
            z = false;
        } else {
            z = e.isOpen();
        }
        BitableSharePermSetInfo bitableSharePermSetInfo2 = this.f25767g;
        if (bitableSharePermSetInfo2 != null) {
            z2 = bitableSharePermSetInfo2.mo38781b();
        } else {
            z2 = false;
        }
        IShareMemberView dVar = this.f25764c;
        if (z && z2) {
            z3 = true;
        }
        dVar.setCollaborateEnable(z3);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.sharecollaboratev2.IShareMemberPresenter
    /* renamed from: d */
    public void mo36773d() {
        C13479a.m54764b("ShareFormMemberPresenter", "onClickCollaboratorList");
        ((AbstractC10740f) KoinJavaComponent.m268613a(AbstractC10740f.class, null, null, 6, null)).mo17295b("/share/collaborator/manage/activity").mo17308a(ShareHitPoint.f121869d, this.f25769i).mo17311a("permission_doc_info", m39747i()).mo17315a("permission_users", (ArrayList<? extends Parcelable>) m39745g()).mo17311a("collaborator_users", (Parcelable) m39746h()).mo17314a("permission_module", "").mo17317a();
        PermBitableShareAnalytic.f25618a.mo36528b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/bytedance/ee/bear/middleground/permission/collaborator/sharecollaboratev2/bitableshare/BitableShareMemberPresenter$onAttachedToWindow$1", "Lcom/larksuite/framework/callback/IRequestCallback;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/ShareUserInfoResult;", "", "onError", "", "throwable", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.a.a.b$b */
    public static final class C9596b implements IRequestCallback<ShareUserInfoResult, Throwable> {

        /* renamed from: a */
        final /* synthetic */ BitableShareMemberPresenter f25772a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C9596b(BitableShareMemberPresenter bVar) {
            this.f25772a = bVar;
        }

        /* renamed from: a */
        public void onSuccess(ShareUserInfoResult shareUserInfoResult) {
            Intrinsics.checkParameterIsNotNull(shareUserInfoResult, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            C13479a.m54764b("ShareFormMemberPresenter", "fetchCollaborates()...succeed");
            if (this.f25772a.f25763b) {
                C13479a.m54758a("ShareFormMemberPresenter", "fetchCollaborates succeed but isDetach");
                return;
            }
            this.f25772a.f25762a = shareUserInfoResult;
            this.f25772a.f25764c.mo36757b();
            IShareMemberView dVar = this.f25772a.f25764c;
            ArrayList<UserInfo> userInfoList = shareUserInfoResult.getUserInfoList();
            Intrinsics.checkExpressionValueIsNotNull(userInfoList, "data.userInfoList");
            dVar.mo36756a(userInfoList, shareUserInfoResult.getTotalNum());
            this.f25772a.mo36775f();
        }

        /* renamed from: a */
        public void onError(Throwable th) {
            Intrinsics.checkParameterIsNotNull(th, "throwable");
            C13479a.m54759a("ShareFormMemberPresenter", "fetchCollaborates()...failed, e=", th);
            if (this.f25772a.f25763b) {
                C13479a.m54758a("ShareFormMemberPresenter", "fetchCollaborates failed and isDetach");
                return;
            }
            this.f25772a.f25764c.mo36757b();
            this.f25772a.f25764c.mo36755a(th);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/bytedance/ee/bear/middleground/permission/collaborator/sharecollaboratev2/bitableshare/BitableShareMemberPresenter$onMemberChange$1", "Lcom/larksuite/framework/callback/IRequestCallback;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/ShareUserInfoResult;", "", "onError", "", "err", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.a.a.b$c */
    public static final class C9597c implements IRequestCallback<ShareUserInfoResult, Throwable> {

        /* renamed from: a */
        final /* synthetic */ BitableShareMemberPresenter f25773a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C9597c(BitableShareMemberPresenter bVar) {
            this.f25773a = bVar;
        }

        /* renamed from: a */
        public void onError(Throwable th) {
            Intrinsics.checkParameterIsNotNull(th, "err");
            C13479a.m54759a("ShareFormMemberPresenter", "onMemberChange()...fail, err:", th);
        }

        /* renamed from: a */
        public void onSuccess(ShareUserInfoResult shareUserInfoResult) {
            Intrinsics.checkParameterIsNotNull(shareUserInfoResult, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            C13479a.m54764b("ShareFormMemberPresenter", "onMemberChange()...success");
            if (this.f25773a.f25763b) {
                C13479a.m54758a("ShareFormMemberPresenter", "fetchCollaborates succeed but isDetach");
                return;
            }
            this.f25773a.f25762a = shareUserInfoResult;
            IShareMemberView dVar = this.f25773a.f25764c;
            ArrayList<UserInfo> userInfoList = shareUserInfoResult.getUserInfoList();
            Intrinsics.checkExpressionValueIsNotNull(userInfoList, "data.userInfoList");
            dVar.mo36756a(userInfoList, shareUserInfoResult.getTotalNum());
        }
    }

    /* renamed from: a */
    public void mo36770a(BitableSharePermSetInfo bitableSharePermSetInfo) {
        Intrinsics.checkParameterIsNotNull(bitableSharePermSetInfo, "bitableSharePermSetInfo");
        this.f25767g = bitableSharePermSetInfo;
        this.f25766f.mo36766a(bitableSharePermSetInfo.mo38785e().getShareToken());
        mo18937b(0);
        mo36775f();
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.MemberChangeListener
    /* renamed from: b */
    public void mo18937b(int i) {
        C13479a.m54764b("ShareFormMemberPresenter", "onMemberChange()...");
        this.f25766f.mo36765a(new C9597c(this));
    }

    public BitableShareMemberPresenter(FragmentActivity fragmentActivity, int i, String str, String str2, IShareMemberView dVar) {
        Intrinsics.checkParameterIsNotNull(fragmentActivity, "context");
        Intrinsics.checkParameterIsNotNull(str, "token");
        Intrinsics.checkParameterIsNotNull(str2, "shareToken");
        Intrinsics.checkParameterIsNotNull(dVar, "view");
        this.f25768h = fragmentActivity;
        this.f25769i = i;
        this.f25770j = str;
        this.f25771l = str2;
        this.f25764c = dVar;
        this.f25766f = new BitableShareMemberModel(str, str2);
    }
}
