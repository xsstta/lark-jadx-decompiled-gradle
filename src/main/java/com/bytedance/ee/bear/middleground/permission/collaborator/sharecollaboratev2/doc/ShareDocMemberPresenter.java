package com.bytedance.ee.bear.middleground.permission.collaborator.sharecollaboratev2.doc;

import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.middleground.permission.PermissionAnalytic;
import com.bytedance.ee.bear.middleground.permission.PermissionAnalyticV2;
import com.bytedance.ee.bear.middleground.permission.collaborator.InviteMembersUtils;
import com.bytedance.ee.bear.middleground.permission.collaborator.ShareUserInfoResult;
import com.bytedance.ee.bear.middleground.permission.collaborator.sharecollaboratev2.IShareMemberView;
import com.bytedance.ee.bear.middleground_permission_export.model.MemberChangeListener;
import com.bytedance.ee.bear.middleground_permission_export.model.p499a.AbstractC10157c;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.DocPermSetInfo;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.share.export.AbstractC11003a;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.IRequestCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u0000 )2\u00020\u00012\u00020\u0002:\u0001)B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0016\u0010\u0018\u001a\u0010\u0012\f\u0012\n \u001b*\u0004\u0018\u00010\u001a0\u001a0\u0019H\u0002J\n\u0010\u001c\u001a\u0004\u0018\u00010\u001aH\u0016J\u0006\u0010\u001d\u001a\u00020\u0012J\b\u0010\u001e\u001a\u00020\u0016H\u0002J\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020 H\u0016J\b\u0010\"\u001a\u00020 H\u0016J\b\u0010#\u001a\u00020 H\u0016J\u0010\u0010$\u001a\u00020 2\u0006\u0010%\u001a\u00020\u0006H\u0016J\b\u0010&\u001a\u00020 H\u0002J\u0018\u0010'\u001a\u00020 2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0006H\u0016J\b\u0010(\u001a\u00020 H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/sharecollaboratev2/doc/ShareDocMemberPresenter;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/sharecollaboratev2/doc/IShareDocMemberPresenter;", "Lcom/bytedance/ee/bear/middleground_permission_export/model/MemberChangeListener;", "context", "Landroidx/fragment/app/FragmentActivity;", ShareHitPoint.f121869d, "", "token", "", "module", "view", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/sharecollaboratev2/IShareMemberView;", "(Landroidx/fragment/app/FragmentActivity;ILjava/lang/String;Ljava/lang/String;Lcom/bytedance/ee/bear/middleground/permission/collaborator/sharecollaboratev2/IShareMemberView;)V", "isDetach", "", "model", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/sharecollaboratev2/doc/ShareDocMemberModel;", "permSetInfo", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/DocPermSetInfo;", "serviceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "shareUserInfoResult", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/ShareUserInfoResult;", "userPerm", "getOriginUserInfos", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "kotlin.jvm.PlatformType", "getOwnerInfo", "getPermSetInfo", "getShareUserInfoResult", "onAttachedToWindow", "", "onClickMemberList", "onClickSearchBar", "onDetachFromWindow", "onMemberChange", "from", "setCollaborateEnable", "setPermInfoAndUserPermission", "unlock", "Companion", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.a.b.c */
public final class ShareDocMemberPresenter implements IShareDocMemberPresenter, MemberChangeListener {

    /* renamed from: e */
    public static final Companion f25795e = new Companion(null);

    /* renamed from: a */
    public ShareUserInfoResult f25796a;

    /* renamed from: b */
    public boolean f25797b;

    /* renamed from: c */
    public final FragmentActivity f25798c;

    /* renamed from: d */
    public final IShareMemberView f25799d;

    /* renamed from: f */
    private final C10917c f25800f = new C10917c(new C10929e());

    /* renamed from: g */
    private ShareDocMemberModel f25801g;

    /* renamed from: h */
    private DocPermSetInfo f25802h;

    /* renamed from: i */
    private int f25803i;

    /* renamed from: j */
    private final int f25804j;

    /* renamed from: l */
    private final String f25805l;

    /* renamed from: m */
    private final String f25806m;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/sharecollaboratev2/doc/ShareDocMemberPresenter$Companion;", "", "()V", "TAG", "", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.a.b.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: i */
    private final ShareUserInfoResult m39781i() {
        ShareUserInfoResult shareUserInfoResult = this.f25796a;
        if (shareUserInfoResult != null) {
            return shareUserInfoResult;
        }
        return new ShareUserInfoResult();
    }

    /* renamed from: h */
    private final ArrayList<UserInfo> m39780h() {
        ArrayList<UserInfo> userInfoList;
        ShareUserInfoResult shareUserInfoResult = this.f25796a;
        if (shareUserInfoResult == null || (userInfoList = shareUserInfoResult.getUserInfoList()) == null) {
            return new ArrayList<>();
        }
        return userInfoList;
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.sharecollaboratev2.IShareMemberPresenter
    /* renamed from: b */
    public void mo36771b() {
        ((AbstractC10157c) KoinJavaComponent.m268613a(AbstractC10157c.class, null, null, 6, null)).mo36638a().mo36651b(this);
        this.f25797b = true;
        this.f25801g.mo36789a();
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.sharecollaboratev2.IShareMemberPresenter
    /* renamed from: c */
    public void mo36772c() {
        InviteMembersUtils.m39847a(this.f25798c, mo36798g(), m39780h(), this.f25806m, true);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.sharecollaboratev2.IShareMemberPresenter
    /* renamed from: e */
    public void mo36774e() {
        C13479a.m54764b("ShareDocMemberPresenter", "unlock()...");
        if (this.f25802h == null) {
            C13479a.m54775e("ShareDocMemberPresenter", "unlock()... permSetInfo == null");
        } else {
            this.f25801g.mo36790a((IGetDataCallback<Boolean>) new C9611d(this));
        }
    }

    /* renamed from: f */
    public final void mo36797f() {
        DocPermSetInfo docPermSetInfo = this.f25802h;
        boolean z = false;
        if (docPermSetInfo == null) {
            this.f25799d.setCollaborateEnable(false);
            return;
        }
        IShareMemberView dVar = this.f25799d;
        if (docPermSetInfo != null && docPermSetInfo.mo38796E()) {
            z = true;
        }
        dVar.setCollaborateEnable(z);
    }

    /* renamed from: g */
    public final DocPermSetInfo mo36798g() {
        DocPermSetInfo docPermSetInfo = this.f25802h;
        if (docPermSetInfo != null) {
            return docPermSetInfo;
        }
        return new DocPermSetInfo(null, this.f25804j, this.f25805l, false, null, null, null, false, false, false, 1017, null);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.sharecollaboratev2.IShareMemberPresenter
    /* renamed from: a */
    public void mo36769a() {
        ((AbstractC10157c) KoinJavaComponent.m268613a(AbstractC10157c.class, null, null, 6, null)).mo36638a().mo36648a(this);
        this.f25801g.mo36791a(new C9609b(this));
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.sharecollaboratev2.IShareMemberPresenter
    /* renamed from: d */
    public void mo36773d() {
        C13479a.m54764b("ShareDocMemberPresenter", "onClickCollaboratorList");
        ((AbstractC10740f) KoinJavaComponent.m268613a(AbstractC10740f.class, null, null, 6, null)).mo17295b("/share/collaborator/manage/activity").mo17308a(ShareHitPoint.f121869d, this.f25804j).mo17311a("permission_doc_info", mo36798g()).mo17315a("permission_users", (ArrayList<? extends Parcelable>) m39780h()).mo17311a("collaborator_users", (Parcelable) m39781i()).mo17314a("permission_module", this.f25806m).mo17308a("permission", this.f25803i).mo17317a();
        PermissionAnalytic.m39406a(this.f25805l, this.f25804j, this.f25806m);
        PermissionAnalyticV2.m39653c();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/bytedance/ee/bear/middleground/permission/collaborator/sharecollaboratev2/doc/ShareDocMemberPresenter$onAttachedToWindow$1", "Lcom/larksuite/framework/callback/IRequestCallback;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/ShareUserInfoResult;", "", "onError", "", "throwable", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.a.b.c$b */
    public static final class C9609b implements IRequestCallback<ShareUserInfoResult, Throwable> {

        /* renamed from: a */
        final /* synthetic */ ShareDocMemberPresenter f25807a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C9609b(ShareDocMemberPresenter cVar) {
            this.f25807a = cVar;
        }

        /* renamed from: a */
        public void onSuccess(ShareUserInfoResult shareUserInfoResult) {
            Intrinsics.checkParameterIsNotNull(shareUserInfoResult, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            C13479a.m54764b("ShareDocMemberPresenter", "fetchCollaborates()...succeed");
            if (this.f25807a.f25797b) {
                C13479a.m54758a("ShareDocMemberPresenter", "fetchCollaborates succeed but isDetach");
                return;
            }
            this.f25807a.f25796a = shareUserInfoResult;
            this.f25807a.f25799d.mo36757b();
            IShareMemberView dVar = this.f25807a.f25799d;
            ArrayList<UserInfo> userInfoList = shareUserInfoResult.getUserInfoList();
            Intrinsics.checkExpressionValueIsNotNull(userInfoList, "data.userInfoList");
            dVar.mo36756a(userInfoList, shareUserInfoResult.getTotalNum());
            this.f25807a.mo36797f();
        }

        /* renamed from: a */
        public void onError(Throwable th) {
            Intrinsics.checkParameterIsNotNull(th, "throwable");
            C13479a.m54759a("ShareDocMemberPresenter", "fetchCollaborates()...failed, e=", th);
            if (this.f25807a.f25797b) {
                C13479a.m54758a("ShareDocMemberPresenter", "fetchCollaborates failed and isDetach");
                return;
            }
            this.f25807a.f25799d.mo36757b();
            this.f25807a.f25799d.mo36755a(th);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/bytedance/ee/bear/middleground/permission/collaborator/sharecollaboratev2/doc/ShareDocMemberPresenter$onMemberChange$1", "Lcom/larksuite/framework/callback/IRequestCallback;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/ShareUserInfoResult;", "", "onError", "", "err", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.a.b.c$c */
    public static final class C9610c implements IRequestCallback<ShareUserInfoResult, Throwable> {

        /* renamed from: a */
        final /* synthetic */ ShareDocMemberPresenter f25808a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C9610c(ShareDocMemberPresenter cVar) {
            this.f25808a = cVar;
        }

        /* renamed from: a */
        public void onError(Throwable th) {
            Intrinsics.checkParameterIsNotNull(th, "err");
            C13479a.m54759a("ShareDocMemberPresenter", "onMemberChange()...fail, err:", th);
        }

        /* renamed from: a */
        public void onSuccess(ShareUserInfoResult shareUserInfoResult) {
            Intrinsics.checkParameterIsNotNull(shareUserInfoResult, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            C13479a.m54764b("ShareDocMemberPresenter", "onMemberChange()...success");
            if (this.f25808a.f25797b) {
                C13479a.m54758a("ShareDocMemberPresenter", "fetchCollaborates succeed but isDetach");
                return;
            }
            this.f25808a.f25796a = shareUserInfoResult;
            IShareMemberView dVar = this.f25808a.f25799d;
            ArrayList<UserInfo> userInfoList = shareUserInfoResult.getUserInfoList();
            Intrinsics.checkExpressionValueIsNotNull(userInfoList, "data.userInfoList");
            dVar.mo36756a(userInfoList, shareUserInfoResult.getTotalNum());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/bytedance/ee/bear/middleground/permission/collaborator/sharecollaboratev2/doc/ShareDocMemberPresenter$unlock$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.a.b.c$d */
    public static final class C9611d implements IGetDataCallback<Boolean> {

        /* renamed from: a */
        final /* synthetic */ ShareDocMemberPresenter f25809a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C9611d(ShareDocMemberPresenter cVar) {
            this.f25809a = cVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
        public /* synthetic */ void onSuccess(Boolean bool) {
            mo36803a(bool.booleanValue());
        }

        /* renamed from: a */
        public void mo36803a(boolean z) {
            ((AbstractC11003a) KoinJavaComponent.m268613a(AbstractC11003a.class, null, null, 6, null)).mo41769e();
            this.f25809a.mo18937b(2);
            Toast.showSuccessText(this.f25809a.f25798c, (int) R.string.CreationMobile_Wiki_Restored_Toast);
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f25809a.f25799d.mo36753a();
            Toast.showFailureText(this.f25809a.f25798c, (int) R.string.CreationMobile_Wiki_CannotRestore_Toast);
        }
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.MemberChangeListener
    /* renamed from: b */
    public void mo18937b(int i) {
        C13479a.m54764b("ShareDocMemberPresenter", "onMemberChange()...");
        this.f25801g.mo36791a(new C9610c(this));
    }

    /* renamed from: a */
    public void mo36796a(DocPermSetInfo docPermSetInfo, int i) {
        Intrinsics.checkParameterIsNotNull(docPermSetInfo, "permSetInfo");
        this.f25802h = docPermSetInfo;
        this.f25803i = i;
        mo36797f();
    }

    public ShareDocMemberPresenter(FragmentActivity fragmentActivity, int i, String str, String str2, IShareMemberView dVar) {
        Intrinsics.checkParameterIsNotNull(fragmentActivity, "context");
        Intrinsics.checkParameterIsNotNull(str, "token");
        Intrinsics.checkParameterIsNotNull(str2, "module");
        Intrinsics.checkParameterIsNotNull(dVar, "view");
        this.f25798c = fragmentActivity;
        this.f25804j = i;
        this.f25805l = str;
        this.f25806m = str2;
        this.f25799d = dVar;
        this.f25801g = new ShareDocMemberModel(i, str);
        this.f25803i = -1;
    }
}
