package com.bytedance.ee.bear.middleground.permission.collaborator.sharecollaboratev2.folder;

import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.dto.FolderVersion;
import com.bytedance.ee.bear.middleground.permission.PermissionAnalytic;
import com.bytedance.ee.bear.middleground.permission.PermissionAnalyticV2;
import com.bytedance.ee.bear.middleground.permission.collaborator.InviteMembersUtils;
import com.bytedance.ee.bear.middleground.permission.collaborator.ShareUserInfoResult;
import com.bytedance.ee.bear.middleground.permission.collaborator.sharecollaboratev2.IShareMemberView;
import com.bytedance.ee.bear.middleground_permission_export.model.MemberChangeListener;
import com.bytedance.ee.bear.middleground_permission_export.model.p499a.AbstractC10157c;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.FolderPermSetInfo;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.bear.route.PostCard;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.share.export.AbstractC11003a;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.IRequestCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u0000 02\u00020\u00012\u00020\u0002:\u00010BE\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\u0018\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020!0 j\b\u0012\u0004\u0012\u00020!`\"H\u0002J\n\u0010#\u001a\u0004\u0018\u00010!H\u0016J\b\u0010$\u001a\u00020\u0016H\u0002J\b\u0010%\u001a\u00020\rH\u0002J\b\u0010&\u001a\u00020'H\u0016J\b\u0010(\u001a\u00020'H\u0016J\b\u0010)\u001a\u00020'H\u0016J\b\u0010*\u001a\u00020'H\u0016J\u0010\u0010+\u001a\u00020'2\u0006\u0010,\u001a\u00020\u0006H\u0016J\b\u0010-\u001a\u00020'H\u0002J\u0010\u0010.\u001a\u00020'2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010/\u001a\u00020'H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001aR\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/sharecollaboratev2/folder/ShareFolderMemberPresenter;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/sharecollaboratev2/folder/IShareFolderMemberPresenter;", "Lcom/bytedance/ee/bear/middleground_permission_export/model/MemberChangeListener;", "activity", "Landroidx/fragment/app/FragmentActivity;", ShareHitPoint.f121869d, "", "token", "", "spaceId", HiAnalyticsConstant.HaKey.BI_KEY_VERSION, "Lcom/bytedance/ee/bear/list/dto/FolderVersion;", "isShareRoot", "", "module", "view", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/sharecollaboratev2/IShareMemberView;", "(Landroidx/fragment/app/FragmentActivity;ILjava/lang/String;Ljava/lang/String;Lcom/bytedance/ee/bear/list/dto/FolderVersion;ZLjava/lang/String;Lcom/bytedance/ee/bear/middleground/permission/collaborator/sharecollaboratev2/IShareMemberView;)V", "isDetach", "model", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/sharecollaboratev2/folder/ShareFolderMemberModel;", "permSetInfo", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/FolderPermSetInfo;", "serviceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "getServiceContext", "()Lcom/bytedance/ee/bear/service/ServiceContext;", "serviceContext$delegate", "Lkotlin/Lazy;", "shareFolderCollResult", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/ShareUserInfoResult;", "getOriginUserInfos", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "Lkotlin/collections/ArrayList;", "getOwnerInfo", "getPermSetInfo", "isCanShare", "onAttachedToWindow", "", "onClickMemberList", "onClickSearchBar", "onDetachFromWindow", "onMemberChange", "from", "setCollaborateEnable", "setPermInfoAndUserPermission", "unlock", "Companion", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.a.c.c */
public final class ShareFolderMemberPresenter implements IShareFolderMemberPresenter, MemberChangeListener {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f25837a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ShareFolderMemberPresenter.class), "serviceContext", "getServiceContext()Lcom/bytedance/ee/bear/service/ServiceContext;"))};

    /* renamed from: f */
    public static final Companion f25838f = new Companion(null);

    /* renamed from: b */
    public ShareUserInfoResult f25839b;

    /* renamed from: c */
    public boolean f25840c;

    /* renamed from: d */
    public final FragmentActivity f25841d;

    /* renamed from: e */
    public final IShareMemberView f25842e;

    /* renamed from: g */
    private final Lazy f25843g = LazyKt.lazy(C9627d.INSTANCE);

    /* renamed from: h */
    private ShareFolderMemberModel f25844h;

    /* renamed from: i */
    private FolderPermSetInfo f25845i;

    /* renamed from: j */
    private final int f25846j;

    /* renamed from: l */
    private final String f25847l;

    /* renamed from: m */
    private final String f25848m;

    /* renamed from: n */
    private final FolderVersion f25849n;

    /* renamed from: o */
    private final boolean f25850o;

    /* renamed from: p */
    private final String f25851p;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/sharecollaboratev2/folder/ShareFolderMemberPresenter$Companion;", "", "()V", "TAG", "", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.a.c.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/service/ServiceContext;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.a.c.c$d */
    static final class C9627d extends Lambda implements Function0<C10917c> {
        public static final C9627d INSTANCE = new C9627d();

        C9627d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C10917c invoke() {
            return new C10917c(new C10929e());
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.sharecollaboratev2.IShareMemberPresenter
    /* renamed from: c */
    public void mo36772c() {
        InviteMembersUtils.m39848a(this.f25841d, m39821h(), this.f25839b, this.f25851p, true);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.sharecollaboratev2.IShareMemberPresenter
    /* renamed from: b */
    public void mo36771b() {
        ((AbstractC10157c) KoinJavaComponent.m268613a(AbstractC10157c.class, null, null, 6, null)).mo36638a().mo36651b(this);
        this.f25840c = true;
        this.f25844h.mo36813a();
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.sharecollaboratev2.IShareMemberPresenter
    /* renamed from: e */
    public void mo36774e() {
        C13479a.m54764b("ShareFolderMemberPresenter", "unlock()...");
        this.f25844h.mo36814a((IGetDataCallback<Boolean>) new C9628e(this));
    }

    /* renamed from: f */
    public final void mo36820f() {
        if (this.f25845i == null) {
            this.f25842e.setCollaborateEnable(false);
        } else {
            this.f25842e.setCollaborateEnable(m39820g());
        }
    }

    /* renamed from: g */
    private final boolean m39820g() {
        if (!this.f25849n.isFolderV1()) {
            FolderPermSetInfo folderPermSetInfo = this.f25845i;
            if (folderPermSetInfo != null) {
                return folderPermSetInfo.mo38891y();
            }
            return false;
        } else if (this.f25849n.isPersonalFolder()) {
            return true;
        } else {
            FolderPermSetInfo folderPermSetInfo2 = this.f25845i;
            if (folderPermSetInfo2 != null) {
                return folderPermSetInfo2.mo38891y();
            }
            return this.f25850o;
        }
    }

    /* renamed from: h */
    private final FolderPermSetInfo m39821h() {
        FolderPermSetInfo folderPermSetInfo = this.f25845i;
        if (folderPermSetInfo != null) {
            return folderPermSetInfo;
        }
        return new FolderPermSetInfo(this.f25846j, null, this.f25847l, null, null, null, null, null, null, null, this.f25848m, null, false, 7162, null);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.sharecollaboratev2.IShareMemberPresenter
    /* renamed from: a */
    public void mo36769a() {
        ((AbstractC10157c) KoinJavaComponent.m268613a(AbstractC10157c.class, null, null, 6, null)).mo36638a().mo36648a(this);
        this.f25844h.mo36815a(new C9625b(this));
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.sharecollaboratev2.IShareMemberPresenter
    /* renamed from: d */
    public void mo36773d() {
        C13479a.m54764b("ShareFolderMemberPresenter", "onClickCollaboratorList");
        PostCard a = ((AbstractC10740f) KoinJavaComponent.m268613a(AbstractC10740f.class, null, null, 6, null)).mo17295b("/share/collaborator/manage/activity").mo17311a("share_user_result", (Parcelable) this.f25839b);
        C8275a aVar = C8275a.f22370c;
        Intrinsics.checkExpressionValueIsNotNull(aVar, "DocumentType.FOLDER");
        a.mo17308a(ShareHitPoint.f121869d, aVar.mo32555b()).mo17311a("permission_doc_info", m39821h()).mo17314a("permission_module", this.f25851p).mo17308a("permission", m39821h().mo38878n()).mo17317a();
        PermissionAnalytic.m39406a(this.f25847l, this.f25846j, this.f25851p);
        PermissionAnalyticV2.m39653c();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/bytedance/ee/bear/middleground/permission/collaborator/sharecollaboratev2/folder/ShareFolderMemberPresenter$onAttachedToWindow$1", "Lcom/larksuite/framework/callback/IRequestCallback;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/ShareUserInfoResult;", "", "onError", "", "err", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.a.c.c$b */
    public static final class C9625b implements IRequestCallback<ShareUserInfoResult, Throwable> {

        /* renamed from: a */
        final /* synthetic */ ShareFolderMemberPresenter f25852a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C9625b(ShareFolderMemberPresenter cVar) {
            this.f25852a = cVar;
        }

        /* renamed from: a */
        public void onSuccess(ShareUserInfoResult shareUserInfoResult) {
            Intrinsics.checkParameterIsNotNull(shareUserInfoResult, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            C13479a.m54764b("ShareFolderMemberPresenter", "fetchCollaborates()...succeed");
            if (this.f25852a.f25840c) {
                C13479a.m54758a("ShareFolderMemberPresenter", "fetchCollaborates succeed but isDetach");
                return;
            }
            this.f25852a.f25839b = shareUserInfoResult;
            this.f25852a.f25842e.mo36757b();
            IShareMemberView dVar = this.f25852a.f25842e;
            ArrayList<UserInfo> userInfoList = shareUserInfoResult.getUserInfoList();
            Intrinsics.checkExpressionValueIsNotNull(userInfoList, "data.userInfoList");
            dVar.mo36756a(userInfoList, shareUserInfoResult.getTotalNum());
            this.f25852a.mo36820f();
        }

        /* renamed from: a */
        public void onError(Throwable th) {
            Intrinsics.checkParameterIsNotNull(th, "err");
            C13479a.m54758a("ShareFolderMemberPresenter", "fetchCollaborates()...error: " + th);
            if (this.f25852a.f25840c) {
                C13479a.m54758a("ShareFolderMemberPresenter", "fetchCollaborates failed and isDetach");
                return;
            }
            this.f25852a.f25842e.mo36757b();
            this.f25852a.f25842e.mo36755a(th);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/bytedance/ee/bear/middleground/permission/collaborator/sharecollaboratev2/folder/ShareFolderMemberPresenter$onMemberChange$1", "Lcom/larksuite/framework/callback/IRequestCallback;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/ShareUserInfoResult;", "", "onError", "", "err", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.a.c.c$c */
    public static final class C9626c implements IRequestCallback<ShareUserInfoResult, Throwable> {

        /* renamed from: a */
        final /* synthetic */ ShareFolderMemberPresenter f25853a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C9626c(ShareFolderMemberPresenter cVar) {
            this.f25853a = cVar;
        }

        /* renamed from: a */
        public void onError(Throwable th) {
            Intrinsics.checkParameterIsNotNull(th, "err");
            C13479a.m54758a("ShareFolderMemberPresenter", "onMemberChange()...error: " + th);
        }

        /* renamed from: a */
        public void onSuccess(ShareUserInfoResult shareUserInfoResult) {
            Intrinsics.checkParameterIsNotNull(shareUserInfoResult, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            C13479a.m54764b("ShareFolderMemberPresenter", "onMemberChange()...succeed");
            if (this.f25853a.f25840c) {
                C13479a.m54758a("ShareFolderMemberPresenter", "updateMembers succeed but isDetach");
                return;
            }
            this.f25853a.f25839b = shareUserInfoResult;
            IShareMemberView dVar = this.f25853a.f25842e;
            ArrayList<UserInfo> userInfoList = shareUserInfoResult.getUserInfoList();
            Intrinsics.checkExpressionValueIsNotNull(userInfoList, "data.userInfoList");
            dVar.mo36756a(userInfoList, shareUserInfoResult.getTotalNum());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/bytedance/ee/bear/middleground/permission/collaborator/sharecollaboratev2/folder/ShareFolderMemberPresenter$unlock$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.a.c.c$e */
    public static final class C9628e implements IGetDataCallback<Boolean> {

        /* renamed from: a */
        final /* synthetic */ ShareFolderMemberPresenter f25854a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C9628e(ShareFolderMemberPresenter cVar) {
            this.f25854a = cVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
        public /* synthetic */ void onSuccess(Boolean bool) {
            mo36825a(bool.booleanValue());
        }

        /* renamed from: a */
        public void mo36825a(boolean z) {
            ((AbstractC11003a) KoinJavaComponent.m268613a(AbstractC11003a.class, null, null, 6, null)).mo41769e();
            this.f25854a.mo18937b(2);
            Toast.showSuccessText(this.f25854a.f25841d, (int) R.string.CreationMobile_Wiki_Restored_Toast);
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f25854a.f25842e.mo36753a();
            Toast.showFailureText(this.f25854a.f25841d, (int) R.string.CreationMobile_Wiki_CannotRestore_Toast);
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.sharecollaboratev2.folder.IShareFolderMemberPresenter
    /* renamed from: a */
    public void mo36812a(FolderPermSetInfo folderPermSetInfo) {
        Intrinsics.checkParameterIsNotNull(folderPermSetInfo, "permSetInfo");
        this.f25845i = folderPermSetInfo;
        mo36820f();
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.MemberChangeListener
    /* renamed from: b */
    public void mo18937b(int i) {
        C13479a.m54764b("ShareFolderMemberPresenter", "onMemberChange()...");
        this.f25844h.mo36815a(new C9626c(this));
    }

    public ShareFolderMemberPresenter(FragmentActivity fragmentActivity, int i, String str, String str2, FolderVersion folderVersion, boolean z, String str3, IShareMemberView dVar) {
        Intrinsics.checkParameterIsNotNull(fragmentActivity, "activity");
        Intrinsics.checkParameterIsNotNull(str, "token");
        Intrinsics.checkParameterIsNotNull(str2, "spaceId");
        Intrinsics.checkParameterIsNotNull(folderVersion, HiAnalyticsConstant.HaKey.BI_KEY_VERSION);
        Intrinsics.checkParameterIsNotNull(str3, "module");
        Intrinsics.checkParameterIsNotNull(dVar, "view");
        this.f25841d = fragmentActivity;
        this.f25846j = i;
        this.f25847l = str;
        this.f25848m = str2;
        this.f25849n = folderVersion;
        this.f25850o = z;
        this.f25851p = str3;
        this.f25842e = dVar;
        this.f25844h = new ShareFolderMemberModel(folderVersion, str, str2);
    }
}
