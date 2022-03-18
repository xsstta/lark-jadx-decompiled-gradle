package com.bytedance.ee.bear.middleground.permission.collaborator.manager.doc.singlepage;

import android.app.Activity;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.ee.bear.basesdk.C4484g;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.contract.net.C5203d;
import com.bytedance.ee.bear.contract.net.SimpleRequestResult;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.p424c.AbstractC8149a;
import com.bytedance.ee.bear.middleground.permission.PermissionAnalyticV2;
import com.bytedance.ee.bear.middleground.permission.collaborator.NotNotifyUserEntity;
import com.bytedance.ee.bear.middleground.permission.collaborator.NotNotifyUserResult;
import com.bytedance.ee.bear.middleground.permission.collaborator.ShareUserInfoResult;
import com.bytedance.ee.bear.middleground.permission.collaborator.manager.doc.singlepage.DocCollaboratorSubContract;
import com.bytedance.ee.bear.middleground.permission.permission.doc.DocUserPermission;
import com.bytedance.ee.bear.middleground.permission.util.NotNotifyOperator;
import com.bytedance.ee.bear.middleground.permission.util.PermissionUtils;
import com.bytedance.ee.bear.middleground.permission.widget.editpermdialog.EditPermDialog;
import com.bytedance.ee.bear.middleground.permission.widget.editpermdialog.EditPermItemModel;
import com.bytedance.ee.bear.middleground.permission.widget.editpermdialog.EditPermItemModelHelper;
import com.bytedance.ee.bear.middleground_permission_export.model.MemberChangeListener;
import com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocUserPermission;
import com.bytedance.ee.bear.middleground_permission_export.model.p499a.AbstractC10157c;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.DocPermSetInfo;
import com.bytedance.ee.bear.p522q.C10539a;
import com.bytedance.ee.bear.share.export.AbstractC11003a;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.bytedance.ee.bear.watermark.interfaces.IWatermarkManager;
import com.bytedance.ee.bear.widgets.dialog.BearUDDialogBuilder;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13726a;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.suite.R;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\u000b\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00042\u00020\u0005B5\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0002J\b\u0010(\u001a\u00020)H\u0002J\u0018\u0010*\u001a\u00020)2\u0006\u0010&\u001a\u00020'2\u0006\u0010+\u001a\u00020,H\u0002J\u0010\u0010-\u001a\u00020)2\u0006\u0010&\u001a\u00020'H\u0002J \u0010.\u001a\u00020)2\u0006\u0010&\u001a\u00020'2\u0006\u0010/\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020,H\u0002J\b\u00100\u001a\u00020)H\u0016J\b\u00101\u001a\u00020\u0000H\u0014J\b\u00102\u001a\u00020)H\u0016J\u0018\u00103\u001a\u00020)2\u0006\u0010&\u001a\u00020'2\u0006\u00104\u001a\u00020\u000fH\u0002J\u0010\u00105\u001a\u00020)2\u0006\u0010&\u001a\u00020'H\u0002J\b\u00106\u001a\u00020)H\u0002J(\u00107\u001a\u0012\u0012\u0004\u0012\u00020908j\b\u0012\u0004\u0012\u000209`:2\u0006\u0010&\u001a\u00020'2\u0006\u00104\u001a\u00020\u000fH\u0002J\u0010\u0010;\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0002J\u0010\u0010<\u001a\u00020)2\u0006\u0010=\u001a\u00020%H\u0002J \u0010>\u001a\u00020)2\u0006\u0010/\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020'2\u0006\u00104\u001a\u00020\u000fH\u0002J(\u0010?\u001a\u00020)2\u0006\u0010&\u001a\u00020'2\u0006\u00104\u001a\u00020\u000f2\u0006\u0010/\u001a\u00020\u000f2\u0006\u0010@\u001a\u00020AH\u0002J\u0018\u0010B\u001a\u00020)2\u0006\u0010&\u001a\u00020'2\u0006\u00104\u001a\u00020\u000fH\u0002J\u0010\u0010C\u001a\u00020)2\u0006\u0010&\u001a\u00020'H\u0002J\u0018\u0010D\u001a\u00020)2\u0006\u00104\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020'H\u0016J\b\u0010E\u001a\u00020)H\u0016J\u0010\u0010F\u001a\u00020)2\u0006\u0010G\u001a\u00020\u000fH\u0016J\u0010\u0010H\u001a\u00020)2\u0006\u0010@\u001a\u00020IH\u0002J\u000e\u0010J\u001a\u00020)2\u0006\u0010K\u001a\u00020%J \u0010L\u001a\u00020)2\u0006\u0010+\u001a\u00020,2\u0006\u0010M\u001a\u00020\u00122\u0006\u0010&\u001a\u00020'H\u0002J\u0010\u0010N\u001a\u00020)2\u0006\u0010+\u001a\u00020,H\u0002J(\u0010O\u001a\u00020)2\u0006\u0010P\u001a\u00020\u00122\u0006\u0010Q\u001a\u00020\u00122\u0006\u0010R\u001a\u00020,2\u0006\u0010S\u001a\u00020,H\u0002R\u000e\u0010\u0011\u001a\u00020\u0012XD¢\u0006\u0002\n\u0000R\u001d\u0010\u0013\u001a\u0004\u0018\u00010\u00148BX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u001f\u001a\u00020 8BX\u0002¢\u0006\f\n\u0004\b#\u0010\u0018\u001a\u0004\b!\u0010\"R\u000e\u0010\u0006\u001a\u00020\u0002X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006T"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/manager/doc/singlepage/DocCollaboratorSubPresenter;", "Lcom/larksuite/framework/mvp/BasePresenter;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/manager/doc/singlepage/DocCollaboratorSubContract$IModel;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/manager/doc/singlepage/DocCollaboratorSubContract$IView;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/manager/doc/singlepage/DocCollaboratorSubContract$IView$IViewDelegate;", "Lcom/bytedance/ee/bear/middleground_permission_export/model/MemberChangeListener;", "model", "view", "activity", "Landroid/app/Activity;", "dependency", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/manager/doc/singlepage/IDocCollaboratorManagerDependency;", "permSetInfo", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/DocPermSetInfo;", "permType", "", "(Lcom/bytedance/ee/bear/middleground/permission/collaborator/manager/doc/singlepage/DocCollaboratorSubContract$IModel;Lcom/bytedance/ee/bear/middleground/permission/collaborator/manager/doc/singlepage/DocCollaboratorSubContract$IView;Landroid/app/Activity;Lcom/bytedance/ee/bear/middleground/permission/collaborator/manager/doc/singlepage/IDocCollaboratorManagerDependency;Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/DocPermSetInfo;I)V", "TAG", "", "account", "Lcom/bytedance/ee/bear/contract/AccountService$Account;", "getAccount", "()Lcom/bytedance/ee/bear/contract/AccountService$Account;", "account$delegate", "Lkotlin/Lazy;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "currentShareUserInfoResult", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/ShareUserInfoResult;", "editPermDialog", "Lcom/bytedance/ee/bear/middleground/permission/widget/editpermdialog/EditPermDialog;", "locale", "Ljava/util/Locale;", "getLocale", "()Ljava/util/Locale;", "locale$delegate", "canTransfer", "", "userInfo", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "checkLockStateIfNeed", "", "checkRemoveMemberLock", "runnable", "Ljava/lang/Runnable;", "checkSharePermissionIfNeed", "checkUpdatePermissionLock", "newPermission", "create", "createViewDelegate", "destroy", "doRemove", "position", "doTransferOwner", "exitWhenNoPermission", "getEditPermModelList", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/middleground/permission/widget/editpermdialog/EditPermItemModel;", "Lkotlin/collections/ArrayList;", "isSelf", "loadFirstPageCollaborators", "delay", "modifyPermission", "modifyPermissionSucceed", "it", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/NotNotifyUserResult;", "onClickRemovePermission", "onClickTransferOwner", "onCollaboratorPermissionClick", "onLoadMore", "onMemberChange", "from", "onModifyFailed", "", "setDescVisible", "visible", "showLockTipDialog", "lockReason", "showOperateSelfDialog", "showTipDialog", "title", "message", "confirmJob", "cancelJob", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.b.a.i */
public final class DocCollaboratorSubPresenter extends BasePresenter<DocCollaboratorSubContract.IModel, DocCollaboratorSubContract.IView, DocCollaboratorSubContract.IView.IViewDelegate> implements DocCollaboratorSubContract.IView.IViewDelegate, MemberChangeListener {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f26356a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(DocCollaboratorSubPresenter.class), "account", "getAccount()Lcom/bytedance/ee/bear/contract/AccountService$Account;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(DocCollaboratorSubPresenter.class), "locale", "getLocale()Ljava/util/Locale;"))};

    /* renamed from: b */
    public final String f26357b = "DocCollaboratorSubPresenter";

    /* renamed from: c */
    public final C68289a f26358c = new C68289a();

    /* renamed from: d */
    public ShareUserInfoResult f26359d = new ShareUserInfoResult();

    /* renamed from: e */
    public final DocCollaboratorSubContract.IModel f26360e;

    /* renamed from: f */
    public final DocCollaboratorSubContract.IView f26361f;

    /* renamed from: g */
    public final Activity f26362g;

    /* renamed from: h */
    public final IDocCollaboratorManagerDependency f26363h;

    /* renamed from: i */
    public final DocPermSetInfo f26364i;

    /* renamed from: j */
    public final int f26365j;

    /* renamed from: l */
    private final EditPermDialog f26366l;

    /* renamed from: m */
    private final Lazy f26367m;

    /* renamed from: n */
    private final Lazy f26368n;

    /* renamed from: e */
    private final AccountService.Account m40456e() {
        Lazy lazy = this.f26367m;
        KProperty kProperty = f26356a[0];
        return (AccountService.Account) lazy.getValue();
    }

    /* renamed from: f */
    private final Locale m40458f() {
        Lazy lazy = this.f26368n;
        KProperty kProperty = f26356a[1];
        return (Locale) lazy.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public DocCollaboratorSubPresenter createViewDelegate() {
        return this;
    }

    /* renamed from: a */
    public final void mo37281a(boolean z) {
        if (z) {
            this.f26361f.mo37266b(true);
        } else {
            this.f26361f.mo37265b();
        }
        this.f26358c.mo237937a(this.f26360e.mo37257a("").mo238001b(new C9792q(this), new C9793r(this)));
    }

    /* renamed from: a */
    public final void mo37277a(UserInfo userInfo, int i, int i2, NotNotifyUserResult notNotifyUserResult) {
        this.f26361f.mo37266b(false);
        Toast.showSuccessText(this.f26362g, (int) R.string.Doc_Facade_Success);
        if (userInfo.getPermission() > i2) {
            userInfo.setPermSource("");
        }
        userInfo.setPermission(i2);
        this.f26359d.getUserInfoList().set(i, userInfo);
        this.f26361f.mo37262a(i, userInfo);
        mo37286c();
        mo37287c(userInfo);
    }

    /* renamed from: a */
    public final void mo37280a(Throwable th) {
        C13479a.m54759a(this.f26357b, "modifyPermission()...error", th);
        this.f26361f.mo37266b(false);
        if (C5203d.m21235a(th, 10040)) {
            Toast.showFailureText(this.f26362g, (int) R.string.CreationMobile_DataUpgrade_Locked_toast);
        } else {
            Toast.showFailureText(this.f26362g, (int) R.string.Doc_Share_EditFailed);
        }
    }

    /* renamed from: a */
    public final void mo37276a(UserInfo userInfo, int i) {
        int i2;
        C13479a.m54764b(this.f26357b, "onClickRemovePermission()...");
        PermissionAnalyticV2.m39654c(userInfo);
        this.f26366l.mo38493a();
        RunnableC9799v vVar = new RunnableC9799v(this, userInfo, i);
        if (m40457e(userInfo)) {
            m40452a(vVar);
            return;
        }
        int i3 = -1;
        int ownerType = userInfo.getOwnerType();
        if (ownerType != 16) {
            switch (ownerType) {
                case 8:
                    i2 = R.string.Doc_Share_RemoveCompanyPermissionConfirm;
                    break;
                case 9:
                    i3 = R.string.Doc_Share_RemoveMeetingPermissionTitle;
                    i2 = R.string.Doc_Share_RemoveMeetingPermissionBody;
                    break;
                case 10:
                    i2 = R.string.Doc_Share_RemoveWikiPermission;
                    break;
                default:
                    i2 = R.string.Doc_Share_RemoveUesrPermissionConfirm;
                    break;
            }
        } else {
            i2 = R.string.Doc_Share_WikiRemovePermissionTips;
        }
        PermissionUtils.m41301a(this.f26362g, i3, i2, new DialogInterface$OnClickListenerC9798u(this, userInfo, vVar));
    }

    /* renamed from: a */
    public final void mo37278a(UserInfo userInfo, Runnable runnable) {
        if (this.f26365j == 2) {
            runnable.run();
            return;
        }
        this.f26358c.mo237937a(this.f26360e.mo37260c(userInfo).mo238001b(new C9777b(this, runnable, userInfo), new C9778c(this)));
    }

    /* renamed from: a */
    public final void mo37279a(Runnable runnable, String str, UserInfo userInfo) {
        int i = this.f26364i.mo38844q() ? R.string.CreationMobile_Wiki_Permission_SettingsDivision_Placeholder : R.string.CreationMobile_ECM_PermissionChangedDesc;
        String string = this.f26362g.getString(R.string.CreationMobile_Wiki_Permission_ChangePermission_Title);
        Intrinsics.checkExpressionValueIsNotNull(string, "activity.getString(R.str…n_ChangePermission_Title)");
        String string2 = this.f26362g.getString(i);
        Intrinsics.checkExpressionValueIsNotNull(string2, "activity.getString(msgId)");
        m40453a(string, string2, new RunnableC9771aa(runnable, str, userInfo), new RunnableC9772ab(str));
        PermissionAnalyticV2.m39621a(str, userInfo);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.b.a.i$ab */
    public static final class RunnableC9772ab implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f26372a;

        RunnableC9772ab(String str) {
            this.f26372a = str;
        }

        public final void run() {
            PermissionAnalyticV2.m39626a(this.f26372a, false);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.b.a.i$ad */
    public static final class RunnableC9774ad implements Runnable {

        /* renamed from: a */
        public static final RunnableC9774ad f26374a = new RunnableC9774ad();

        RunnableC9774ad() {
        }

        public final void run() {
            PermissionAnalyticV2.m39650b(false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/contract/AccountService$Account;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.b.a.i$a */
    static final class C9770a extends Lambda implements Function0<AccountService.Account> {
        public static final C9770a INSTANCE = new C9770a();

        C9770a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AccountService.Account invoke() {
            return ((an) KoinJavaComponent.m268613a(an.class, null, null, 6, null)).mo16408f();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.b.a.i$aa */
    public static final class RunnableC9771aa implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Runnable f26369a;

        /* renamed from: b */
        final /* synthetic */ String f26370b;

        /* renamed from: c */
        final /* synthetic */ UserInfo f26371c;

        RunnableC9771aa(Runnable runnable, String str, UserInfo userInfo) {
            this.f26369a = runnable;
            this.f26370b = str;
            this.f26371c = userInfo;
        }

        public final void run() {
            this.f26369a.run();
            PermissionAnalyticV2.m39627a(this.f26370b, true, this.f26371c);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.b.a.i$ac */
    public static final class RunnableC9773ac implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Runnable f26373a;

        RunnableC9773ac(Runnable runnable) {
            this.f26373a = runnable;
        }

        public final void run() {
            this.f26373a.run();
            PermissionAnalyticV2.m39650b(true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Ljava/util/Locale;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.b.a.i$s */
    static final class C9794s extends Lambda implements Function0<Locale> {
        public static final C9794s INSTANCE = new C9794s();

        C9794s() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Locale invoke() {
            return C4484g.m18494b().mo17253d();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.b.a.i$v */
    public static final class RunnableC9799v implements Runnable {

        /* renamed from: a */
        final /* synthetic */ DocCollaboratorSubPresenter f26418a;

        /* renamed from: b */
        final /* synthetic */ UserInfo f26419b;

        /* renamed from: c */
        final /* synthetic */ int f26420c;

        RunnableC9799v(DocCollaboratorSubPresenter iVar, UserInfo userInfo, int i) {
            this.f26418a = iVar;
            this.f26419b = userInfo;
            this.f26420c = i;
        }

        public final void run() {
            this.f26418a.mo37284b(this.f26419b, this.f26420c);
        }
    }

    /* renamed from: c */
    public final void mo37286c() {
        if (this.f26365j == 1) {
            this.f26363h.mo37230a();
        }
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        mo37281a(false);
        ((AbstractC10157c) KoinJavaComponent.m268613a(AbstractC10157c.class, null, null, 6, null)).mo36638a().mo36648a(this);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.b.a.i$t */
    public static final class RunnableC9795t implements Runnable {

        /* renamed from: a */
        final /* synthetic */ DocCollaboratorSubPresenter f26409a;

        /* renamed from: b */
        final /* synthetic */ int f26410b;

        /* renamed from: c */
        final /* synthetic */ UserInfo f26411c;

        /* renamed from: d */
        final /* synthetic */ int f26412d;

        RunnableC9795t(DocCollaboratorSubPresenter iVar, int i, UserInfo userInfo, int i2) {
            this.f26409a = iVar;
            this.f26410b = i;
            this.f26411c = userInfo;
            this.f26412d = i2;
        }

        public final void run() {
            this.f26409a.f26361f.mo37266b(true);
            this.f26409a.f26358c.mo237937a(this.f26409a.f26360e.mo37255a(this.f26410b, this.f26411c).mo238001b(new C9796a(this), new C9797b(this)));
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.b.a.i$t$b */
        static final class C9797b<T> implements Consumer<Throwable> {

            /* renamed from: a */
            final /* synthetic */ RunnableC9795t f26414a;

            C9797b(RunnableC9795t tVar) {
                this.f26414a = tVar;
            }

            /* renamed from: a */
            public final void accept(Throwable th) {
                DocCollaboratorSubPresenter iVar = this.f26414a.f26409a;
                Intrinsics.checkExpressionValueIsNotNull(th, "it");
                iVar.mo37280a(th);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/NotNotifyUserResult;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.b.a.i$t$a */
        static final class C9796a<T> implements Consumer<NotNotifyUserResult> {

            /* renamed from: a */
            final /* synthetic */ RunnableC9795t f26413a;

            C9796a(RunnableC9795t tVar) {
                this.f26413a = tVar;
            }

            /* renamed from: a */
            public final void accept(NotNotifyUserResult notNotifyUserResult) {
                DocCollaboratorSubPresenter iVar = this.f26413a.f26409a;
                UserInfo userInfo = this.f26413a.f26411c;
                int i = this.f26413a.f26412d;
                int i2 = this.f26413a.f26410b;
                Intrinsics.checkExpressionValueIsNotNull(notNotifyUserResult, "it");
                iVar.mo37277a(userInfo, i, i2, notNotifyUserResult);
            }
        }
    }

    /* renamed from: d */
    public final void mo37288d() {
        C13479a.m54764b(this.f26357b, "exit manager activity");
        if (C13726a.m55676b(this.f26362g)) {
            this.f26362g.finish();
        }
        ((AbstractC11003a) KoinJavaComponent.m268613a(AbstractC11003a.class, null, null, 6, null)).mo41768d();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        ((AbstractC10157c) KoinJavaComponent.m268613a(AbstractC10157c.class, null, null, 6, null)).mo36638a().mo36651b(this);
        ((AbstractC10157c) KoinJavaComponent.m268613a(AbstractC10157c.class, null, null, 6, null)).mo36638a().mo36646a(1);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.doc.singlepage.DocCollaboratorSubContract.IView.IViewDelegate
    /* renamed from: a */
    public void mo37268a() {
        DocCollaboratorSubContract.IModel aVar = this.f26360e;
        String lastLabel = this.f26359d.getLastLabel();
        Intrinsics.checkExpressionValueIsNotNull(lastLabel, "currentShareUserInfoResult.lastLabel");
        this.f26358c.mo237937a(aVar.mo37257a(lastLabel).mo238001b(new C9802y(this), new C9803z(this)));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.b.a.i$o */
    public static final class View$OnClickListenerC9790o implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DocCollaboratorSubPresenter f26402a;

        /* renamed from: b */
        final /* synthetic */ UserInfo f26403b;

        View$OnClickListenerC9790o(DocCollaboratorSubPresenter iVar, UserInfo userInfo) {
            this.f26402a = iVar;
            this.f26403b = userInfo;
        }

        public final void onClick(View view) {
            this.f26402a.mo37275a(this.f26403b);
        }
    }

    /* renamed from: b */
    public final void mo37285b(boolean z) {
        this.f26361f.mo37267c(z);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "needLock", "", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.b.a.i$b */
    public static final class C9777b<T> implements Consumer<Boolean> {

        /* renamed from: a */
        final /* synthetic */ DocCollaboratorSubPresenter f26377a;

        /* renamed from: b */
        final /* synthetic */ Runnable f26378b;

        /* renamed from: c */
        final /* synthetic */ UserInfo f26379c;

        C9777b(DocCollaboratorSubPresenter iVar, Runnable runnable, UserInfo userInfo) {
            this.f26377a = iVar;
            this.f26378b = runnable;
            this.f26379c = userInfo;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.Consumer
        public /* synthetic */ void accept(Boolean bool) {
            mo37295a(bool.booleanValue());
        }

        /* renamed from: a */
        public final void mo37295a(boolean z) {
            if (z) {
                this.f26377a.mo37279a(this.f26378b, "reduce_collaborators", this.f26379c);
            } else {
                this.f26378b.run();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "throwable", "", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.b.a.i$c */
    public static final class C9778c<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ DocCollaboratorSubPresenter f26380a;

        C9778c(DocCollaboratorSubPresenter iVar) {
            this.f26380a = iVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            Intrinsics.checkParameterIsNotNull(th, "throwable");
            C13479a.m54759a(this.f26380a.f26357b, " checkLock failed:", th);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "needLock", "", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.b.a.i$f */
    public static final class C9781f<T> implements Consumer<Boolean> {

        /* renamed from: a */
        final /* synthetic */ DocCollaboratorSubPresenter f26383a;

        /* renamed from: b */
        final /* synthetic */ Runnable f26384b;

        /* renamed from: c */
        final /* synthetic */ UserInfo f26385c;

        C9781f(DocCollaboratorSubPresenter iVar, Runnable runnable, UserInfo userInfo) {
            this.f26383a = iVar;
            this.f26384b = runnable;
            this.f26385c = userInfo;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.Consumer
        public /* synthetic */ void accept(Boolean bool) {
            mo37299a(bool.booleanValue());
        }

        /* renamed from: a */
        public final void mo37299a(boolean z) {
            if (z) {
                this.f26383a.mo37279a(this.f26384b, "reduce_permissions", this.f26385c);
            } else {
                this.f26384b.run();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.b.a.i$g */
    public static final class C9782g<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ DocCollaboratorSubPresenter f26386a;

        C9782g(DocCollaboratorSubPresenter iVar) {
            this.f26386a = iVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54759a(this.f26386a.f26357b, "checkLock failed:", th);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.b.a.i$i */
    public static final class C9784i<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ DocCollaboratorSubPresenter f26390a;

        C9784i(DocCollaboratorSubPresenter iVar) {
            this.f26390a = iVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            DocCollaboratorSubPresenter iVar = this.f26390a;
            Intrinsics.checkExpressionValueIsNotNull(th, "it");
            iVar.mo37280a(th);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.b.a.i$l */
    public static final class View$OnClickListenerC9787l implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DocCollaboratorSubPresenter f26393a;

        /* renamed from: b */
        final /* synthetic */ UserInfo f26394b;

        /* renamed from: c */
        final /* synthetic */ int f26395c;

        View$OnClickListenerC9787l(DocCollaboratorSubPresenter iVar, UserInfo userInfo, int i) {
            this.f26393a = iVar;
            this.f26394b = userInfo;
            this.f26395c = i;
        }

        public final void onClick(View view) {
            this.f26393a.mo37274a(1024, this.f26394b, this.f26395c);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.b.a.i$m */
    public static final class View$OnClickListenerC9788m implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DocCollaboratorSubPresenter f26396a;

        /* renamed from: b */
        final /* synthetic */ UserInfo f26397b;

        /* renamed from: c */
        final /* synthetic */ int f26398c;

        View$OnClickListenerC9788m(DocCollaboratorSubPresenter iVar, UserInfo userInfo, int i) {
            this.f26396a = iVar;
            this.f26397b = userInfo;
            this.f26398c = i;
        }

        public final void onClick(View view) {
            this.f26396a.mo37274a(4, this.f26397b, this.f26398c);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.b.a.i$n */
    public static final class View$OnClickListenerC9789n implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DocCollaboratorSubPresenter f26399a;

        /* renamed from: b */
        final /* synthetic */ UserInfo f26400b;

        /* renamed from: c */
        final /* synthetic */ int f26401c;

        View$OnClickListenerC9789n(DocCollaboratorSubPresenter iVar, UserInfo userInfo, int i) {
            this.f26399a = iVar;
            this.f26400b = userInfo;
            this.f26401c = i;
        }

        public final void onClick(View view) {
            this.f26399a.mo37274a(1, this.f26400b, this.f26401c);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.b.a.i$p */
    public static final class View$OnClickListenerC9791p implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DocCollaboratorSubPresenter f26404a;

        /* renamed from: b */
        final /* synthetic */ UserInfo f26405b;

        /* renamed from: c */
        final /* synthetic */ int f26406c;

        View$OnClickListenerC9791p(DocCollaboratorSubPresenter iVar, UserInfo userInfo, int i) {
            this.f26404a = iVar;
            this.f26405b = userInfo;
            this.f26406c = i;
        }

        public final void onClick(View view) {
            this.f26404a.mo37276a(this.f26405b, this.f26406c);
        }
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.MemberChangeListener
    /* renamed from: b */
    public void mo18937b(int i) {
        if (i != 1) {
            mo37281a(true);
            if (i == 2) {
                mo37286c();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.b.a.i$e */
    public static final class C9780e<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ DocCollaboratorSubPresenter f26382a;

        C9780e(DocCollaboratorSubPresenter iVar) {
            this.f26382a = iVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54761a(this.f26382a.f26357b, th);
            if (C5203d.m21235a(th, 4)) {
                this.f26382a.mo37288d();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.b.a.i$k */
    public static final class C9786k<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ DocCollaboratorSubPresenter f26392a;

        C9786k(DocCollaboratorSubPresenter iVar) {
            this.f26392a = iVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54759a(this.f26392a.f26357b, "doTransferOwner()...error", th);
            DocCollaboratorSubPresenter iVar = this.f26392a;
            Intrinsics.checkExpressionValueIsNotNull(th, "it");
            iVar.mo37280a(th);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.b.a.i$z */
    static final class C9803z<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ DocCollaboratorSubPresenter f26425a;

        C9803z(DocCollaboratorSubPresenter iVar) {
            this.f26425a = iVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54759a(this.f26425a.f26357b, "fetchCollaborators()...error", th);
            this.f26425a.f26361f.mo37261a();
            Toast.showFailureText(this.f26425a.f26362g, (int) R.string.Doc_Share_LoadFailed);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "docUserPermission", "Lcom/bytedance/ee/bear/middleground_permission_export/model/doc/IDocUserPermission;", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.b.a.i$d */
    public static final class C9779d<T> implements Consumer<IDocUserPermission> {

        /* renamed from: a */
        final /* synthetic */ DocCollaboratorSubPresenter f26381a;

        C9779d(DocCollaboratorSubPresenter iVar) {
            this.f26381a = iVar;
        }

        /* renamed from: a */
        public final void accept(IDocUserPermission iDocUserPermission) {
            Intrinsics.checkParameterIsNotNull(iDocUserPermission, "docUserPermission");
            this.f26381a.f26364i.mo38820a(iDocUserPermission);
            String str = this.f26381a.f26357b;
            C13479a.m54764b(str, "checkSharePermission()...canShare = " + iDocUserPermission.canManageCollaborator());
            if (!iDocUserPermission.canManageCollaborator()) {
                this.f26381a.mo37288d();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.b.a.i$r */
    public static final class C9793r<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ DocCollaboratorSubPresenter f26408a;

        C9793r(DocCollaboratorSubPresenter iVar) {
            this.f26408a = iVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54759a(this.f26408a.f26357b, "fetchCollaborators()...error", th);
            this.f26408a.f26361f.mo37266b(false);
            Toast.showFailureText(this.f26408a.f26362g, (int) R.string.Doc_Share_LoadFailed);
            if (this.f26408a.f26365j == 2) {
                this.f26408a.f26363h.mo37231a(false);
            }
        }
    }

    /* renamed from: e */
    private final boolean m40457e(UserInfo userInfo) {
        String str;
        if (m40456e() == null) {
            return false;
        }
        AccountService.Account e = m40456e();
        if (e == null || (str = e.f14584a) == null) {
            str = "";
        }
        return TextUtils.equals(str, userInfo.getId());
    }

    /* renamed from: b */
    public final void mo37283b(UserInfo userInfo) {
        PermissionAnalyticV2.m39606a(userInfo, true, false, 4, (Object) null);
        this.f26361f.mo37266b(true);
        this.f26358c.mo237937a(this.f26360e.mo37256a(userInfo).mo238001b(new C9785j(this), new C9786k(this)));
    }

    /* renamed from: c */
    public final void mo37287c(UserInfo userInfo) {
        if (!this.f26364i.mo38845r()) {
            if (m40457e(userInfo) || !userInfo.isUserType()) {
                this.f26358c.mo237937a(((DocCollaboratorSubContract.IModel) getModel()).mo37254a().mo238001b(new C9779d(this), new C9780e(this)));
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/NotNotifyUserResult;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.b.a.i$j */
    public static final class C9785j<T> implements Consumer<NotNotifyUserResult> {

        /* renamed from: a */
        final /* synthetic */ DocCollaboratorSubPresenter f26391a;

        C9785j(DocCollaboratorSubPresenter iVar) {
            this.f26391a = iVar;
        }

        /* renamed from: a */
        public final void accept(NotNotifyUserResult notNotifyUserResult) {
            this.f26391a.f26361f.mo37266b(false);
            Intrinsics.checkExpressionValueIsNotNull(notNotifyUserResult, "it");
            List<NotNotifyUserEntity> notNotifyUsers = notNotifyUserResult.getNotNotifyUsers();
            Intrinsics.checkExpressionValueIsNotNull(notNotifyUsers, "it.notNotifyUsers");
            if (!notNotifyUsers.isEmpty()) {
                NotNotifyOperator.m41293a(this.f26391a.f26362g, notNotifyUserResult.getNotNotifyUsers());
            } else {
                Toast.showSuccessText(this.f26391a.f26362g, (int) R.string.Doc_Facade_Success);
            }
            this.f26391a.f26364i.mo38826b(false);
            this.f26391a.mo37281a(true);
            this.f26391a.mo37286c();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/ShareUserInfoResult;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.b.a.i$q */
    public static final class C9792q<T> implements Consumer<ShareUserInfoResult> {

        /* renamed from: a */
        final /* synthetic */ DocCollaboratorSubPresenter f26407a;

        C9792q(DocCollaboratorSubPresenter iVar) {
            this.f26407a = iVar;
        }

        /* renamed from: a */
        public final void accept(ShareUserInfoResult shareUserInfoResult) {
            this.f26407a.f26361f.mo37266b(false);
            DocCollaboratorSubPresenter iVar = this.f26407a;
            Intrinsics.checkExpressionValueIsNotNull(shareUserInfoResult, "it");
            iVar.f26359d = shareUserInfoResult;
            this.f26407a.f26361f.mo37264a(shareUserInfoResult.isHasMore());
            DocCollaboratorSubContract.IView bVar = this.f26407a.f26361f;
            ArrayList<UserInfo> userInfoList = shareUserInfoResult.getUserInfoList();
            Intrinsics.checkExpressionValueIsNotNull(userInfoList, "it.userInfoList");
            bVar.mo37263a(userInfoList);
            if (this.f26407a.f26365j == 2) {
                IDocCollaboratorManagerDependency kVar = this.f26407a.f26363h;
                ArrayList<UserInfo> userInfoList2 = shareUserInfoResult.getUserInfoList();
                Intrinsics.checkExpressionValueIsNotNull(userInfoList2, "it.userInfoList");
                kVar.mo37231a(!userInfoList2.isEmpty());
            }
            this.f26407a.f26363h.mo37232b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/ShareUserInfoResult;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.b.a.i$y */
    static final class C9802y<T> implements Consumer<ShareUserInfoResult> {

        /* renamed from: a */
        final /* synthetic */ DocCollaboratorSubPresenter f26424a;

        C9802y(DocCollaboratorSubPresenter iVar) {
            this.f26424a = iVar;
        }

        /* renamed from: a */
        public final void accept(ShareUserInfoResult shareUserInfoResult) {
            this.f26424a.f26361f.mo37261a();
            ArrayList<UserInfo> userInfoList = this.f26424a.f26359d.getUserInfoList();
            Intrinsics.checkExpressionValueIsNotNull(shareUserInfoResult, "it");
            userInfoList.addAll(shareUserInfoResult.getUserInfoList());
            shareUserInfoResult.setUserInfoList(this.f26424a.f26359d.getUserInfoList());
            this.f26424a.f26359d = shareUserInfoResult;
            this.f26424a.f26361f.mo37264a(shareUserInfoResult.isHasMore());
            DocCollaboratorSubContract.IView bVar = this.f26424a.f26361f;
            ArrayList<UserInfo> userInfoList2 = shareUserInfoResult.getUserInfoList();
            Intrinsics.checkExpressionValueIsNotNull(userInfoList2, "it.userInfoList");
            bVar.mo37263a(userInfoList2);
        }
    }

    /* renamed from: a */
    private final void m40452a(Runnable runnable) {
        String string = this.f26362g.getString(R.string.CreationMobile_Wiki_Permission_ChangePermission_Title);
        Intrinsics.checkExpressionValueIsNotNull(string, "activity.getString(R.str…n_ChangePermission_Title)");
        String string2 = this.f26362g.getString(R.string.CreationMobile_ECM_PermissionUpdatedDesc);
        Intrinsics.checkExpressionValueIsNotNull(string2, "activity.getString(R.str…CM_PermissionUpdatedDesc)");
        m40453a(string, string2, new RunnableC9773ac(runnable), RunnableC9774ad.f26374a);
        PermissionAnalyticV2.m39691m();
    }

    /* renamed from: d */
    private final boolean m40455d(UserInfo userInfo) {
        boolean z;
        boolean z2;
        AccountService.Account e = m40456e();
        if (e != null) {
            z = e.mo19678a(userInfo.getTenantId());
        } else {
            z = false;
        }
        if (userInfo.getOwnerType() == 0 || userInfo.getOwnerType() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!this.f26364i.aa() || !this.f26364i.mo38845r() || !z2 || !z || m40457e(userInfo) || this.f26365j != 1) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/contract/net/SimpleRequestResult;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.b.a.i$h */
    public static final class C9783h<T> implements Consumer<SimpleRequestResult> {

        /* renamed from: a */
        final /* synthetic */ DocCollaboratorSubPresenter f26387a;

        /* renamed from: b */
        final /* synthetic */ UserInfo f26388b;

        /* renamed from: c */
        final /* synthetic */ int f26389c;

        C9783h(DocCollaboratorSubPresenter iVar, UserInfo userInfo, int i) {
            this.f26387a = iVar;
            this.f26388b = userInfo;
            this.f26389c = i;
        }

        /* renamed from: a */
        public final void accept(SimpleRequestResult simpleRequestResult) {
            this.f26387a.f26361f.mo37266b(false);
            Toast.showSuccessText(this.f26387a.f26362g, (int) R.string.Doc_Facade_Success);
            if (this.f26388b.getOwnerType() == 24) {
                this.f26388b.setPermission(0);
                this.f26387a.f26359d.getUserInfoList().set(this.f26389c, this.f26388b);
                this.f26387a.f26361f.mo37262a(this.f26389c, this.f26388b);
            } else {
                this.f26387a.f26359d.getUserInfoList().remove(this.f26388b);
                DocCollaboratorSubContract.IView bVar = this.f26387a.f26361f;
                ArrayList<UserInfo> userInfoList = this.f26387a.f26359d.getUserInfoList();
                Intrinsics.checkExpressionValueIsNotNull(userInfoList, "currentShareUserInfoResult.userInfoList");
                bVar.mo37263a(userInfoList);
                this.f26387a.f26363h.mo37232b();
                if (this.f26387a.f26365j == 2) {
                    IDocCollaboratorManagerDependency kVar = this.f26387a.f26363h;
                    ArrayList<UserInfo> userInfoList2 = this.f26387a.f26359d.getUserInfoList();
                    Intrinsics.checkExpressionValueIsNotNull(userInfoList2, "currentShareUserInfoResult.userInfoList");
                    kVar.mo37231a(!userInfoList2.isEmpty());
                }
            }
            this.f26387a.mo37286c();
            this.f26387a.mo37287c(this.f26388b);
        }
    }

    /* renamed from: a */
    public final void mo37275a(UserInfo userInfo) {
        int i;
        C13479a.m54764b(this.f26357b, "onClickTransferOwner()...");
        PermissionAnalyticV2.m39664d(userInfo);
        this.f26366l.mo38493a();
        String a = C10539a.m43639a(this.f26362g, R.string.Doc_Share_ConfirmTransferOwner, "who", userInfo.getDisplayName(m40458f()));
        HashMap hashMap = new HashMap();
        String displayName = userInfo.getDisplayName(m40458f());
        Intrinsics.checkExpressionValueIsNotNull(displayName, "userInfo.getDisplayName(locale)");
        hashMap.put("who", displayName);
        String b = ((AbstractC8149a) KoinJavaComponent.m268613a(AbstractC8149a.class, null, null, 6, null)).mo31510b(this.f26362g, this.f26364i.mo38825b());
        Intrinsics.checkExpressionValueIsNotNull(b, "get(IList::class.java).g…y, permSetInfo.getType())");
        hashMap.put("doc_type", b);
        int b2 = this.f26364i.mo38825b();
        C8275a aVar = C8275a.f22379l;
        Intrinsics.checkExpressionValueIsNotNull(aVar, "DocumentType.MINUTES");
        if (b2 == aVar.mo32555b()) {
            i = R.string.CreationMobile_Common_MinutesBot;
        } else {
            i = R.string.CreatinoMobile_Minutes_bot_DocsAssist;
        }
        String string = this.f26362g.getString(i);
        Intrinsics.checkExpressionValueIsNotNull(string, "activity.getString(botStr)");
        hashMap.put("bot", string);
        String a2 = C10539a.m43640a(this.f26362g, R.string.Doc_Share_TransferDocOwnerExplain_AddVariable, hashMap);
        BearUDDialogBuilder bearUDDialogBuilder = new BearUDDialogBuilder(this.f26362g);
        Intrinsics.checkExpressionValueIsNotNull(a, "title");
        BearUDDialogBuilder a3 = bearUDDialogBuilder.mo45353a(a);
        Intrinsics.checkExpressionValueIsNotNull(a2, "message");
        a3.mo45357b(a2).mo45361c(true).mo45343a(260.0f).mo45366g(0).mo45346a(R.id.ud_dialog_btn_primary, R.string.Doc_Share_Transfer, new DialogInterface$OnClickListenerC9800w(this, userInfo)).mo45346a(R.id.ud_dialog_btn_secondary, R.string.Doc_Facade_Cancel, new DialogInterface$OnClickListenerC9801x(userInfo)).mo45355a().show();
        PermissionAnalyticV2.m39670e(userInfo);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.b.a.i$ae */
    public static final class DialogInterface$OnClickListenerC9775ae implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Runnable f26375a;

        DialogInterface$OnClickListenerC9775ae(Runnable runnable) {
            this.f26375a = runnable;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f26375a.run();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.b.a.i$af */
    public static final class DialogInterface$OnClickListenerC9776af implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Runnable f26376a;

        DialogInterface$OnClickListenerC9776af(Runnable runnable) {
            this.f26376a = runnable;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f26376a.run();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.b.a.i$w */
    public static final class DialogInterface$OnClickListenerC9800w implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DocCollaboratorSubPresenter f26421a;

        /* renamed from: b */
        final /* synthetic */ UserInfo f26422b;

        DialogInterface$OnClickListenerC9800w(DocCollaboratorSubPresenter iVar, UserInfo userInfo) {
            this.f26421a = iVar;
            this.f26422b = userInfo;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f26421a.mo37283b(this.f26422b);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.b.a.i$u */
    public static final class DialogInterface$OnClickListenerC9798u implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DocCollaboratorSubPresenter f26415a;

        /* renamed from: b */
        final /* synthetic */ UserInfo f26416b;

        /* renamed from: c */
        final /* synthetic */ Runnable f26417c;

        DialogInterface$OnClickListenerC9798u(DocCollaboratorSubPresenter iVar, UserInfo userInfo, Runnable runnable) {
            this.f26415a = iVar;
            this.f26416b = userInfo;
            this.f26417c = runnable;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f26415a.mo37278a(this.f26416b, this.f26417c);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.b.a.i$x */
    public static final class DialogInterface$OnClickListenerC9801x implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ UserInfo f26423a;

        DialogInterface$OnClickListenerC9801x(UserInfo userInfo) {
            this.f26423a = userInfo;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            PermissionAnalyticV2.m39606a(this.f26423a, false, false, 4, (Object) null);
        }
    }

    /* renamed from: b */
    public final void mo37284b(UserInfo userInfo, int i) {
        this.f26361f.mo37266b(true);
        this.f26358c.mo237937a(this.f26360e.mo37259b(userInfo).mo238001b(new C9783h(this, userInfo, i), new C9784i(this)));
    }

    /* renamed from: c */
    private final ArrayList<EditPermItemModel> m40454c(UserInfo userInfo, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i2;
        boolean z7 = false;
        if (this.f26365j == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            z2 = this.f26364i.mo38850v();
        } else {
            z2 = this.f26364i.mo38854y();
        }
        if (z) {
            z3 = this.f26364i.mo38851w();
        } else {
            z3 = this.f26364i.mo38855z();
        }
        if (z) {
            z4 = this.f26364i.mo38853x();
        } else {
            z4 = this.f26364i.mo38792A();
        }
        boolean g = DocUserPermission.Companion.mo38041g(userInfo.getPermission());
        if (g || !DocUserPermission.Companion.mo38037c(userInfo.getPermission())) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (g || z5 || !DocUserPermission.Companion.mo38035a(userInfo.getPermission())) {
            z6 = false;
        } else {
            z6 = true;
        }
        if (!g && !z5 && !z6) {
            z7 = true;
        }
        boolean d = m40455d(userInfo);
        if (userInfo.getOwnerType() == 24) {
            i2 = R.string.CreationMobile_Wiki_Permission_NoAccess_Options;
        } else {
            i2 = R.string.Doc_Facade_Remove;
        }
        String str = this.f26357b;
        C13479a.m54764b(str, "canUserInviteFa: " + z2 + ", canUserInviteEdit: " + z3 + ", canUserInviteRead:" + z4 + ", memberIsFa:" + g + ", memberIsEdit:" + z5 + ", memberIsRead:" + z6 + ", canTransfer:" + d);
        return new EditPermItemModelHelper(this.f26362g).mo38518a(true, z2, g, this.f26364i.mo38844q(), new View$OnClickListenerC9787l(this, userInfo, i)).mo38521b(z5, z3, new View$OnClickListenerC9788m(this, userInfo, i)).mo38517a(z6, z4, new View$OnClickListenerC9789n(this, userInfo, i)).mo38520b(d, new View$OnClickListenerC9790o(this, userInfo)).mo38514a(i2, true ^ d, z7, new View$OnClickListenerC9791p(this, userInfo, i)).mo38519a();
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.manager.doc.singlepage.DocCollaboratorSubContract.IView.IViewDelegate
    /* renamed from: a */
    public void mo37269a(int i, UserInfo userInfo) {
        Intrinsics.checkParameterIsNotNull(userInfo, "userInfo");
        this.f26366l.mo38494a(userInfo, this.f26364i.mo38827c(), this.f26364i.mo38825b(), m40454c(userInfo, i));
        PermissionAnalyticV2.m39603a(userInfo, this.f26363h.mo37233c(), this.f26365j);
        PermissionAnalyticV2.m39641b(userInfo);
    }

    /* renamed from: a */
    private final void m40451a(UserInfo userInfo, int i, Runnable runnable) {
        if (this.f26365j == 2) {
            runnable.run();
            return;
        }
        this.f26358c.mo237937a(this.f26360e.mo37258b(i, userInfo).mo238001b(new C9781f(this, runnable, userInfo), new C9782g(this)));
    }

    /* renamed from: a */
    public final void mo37274a(int i, UserInfo userInfo, int i2) {
        PermissionAnalyticV2.m39600a(userInfo, i);
        String str = this.f26357b;
        C13479a.m54764b(str, "modifyPermission()...newPermission = " + i);
        this.f26366l.mo38493a();
        RunnableC9795t tVar = new RunnableC9795t(this, i, userInfo, i2);
        if (m40457e(userInfo)) {
            m40452a(tVar);
        } else {
            m40451a(userInfo, i, tVar);
        }
    }

    /* renamed from: a */
    private final void m40453a(String str, String str2, Runnable runnable, Runnable runnable2) {
        ((IWatermarkManager) KoinJavaComponent.m268613a(IWatermarkManager.class, null, null, 6, null)).mo40651a(this.f26364i.mo38827c(), String.valueOf(this.f26364i.mo38825b()), new BearUDDialogBuilder(this.f26362g).mo45353a(str).mo45357b(str2).mo45360c(8388611).mo45346a(R.id.ud_dialog_btn_primary, R.string.Doc_Facade_Confirm, new DialogInterface$OnClickListenerC9775ae(runnable)).mo45346a(R.id.ud_dialog_btn_secondary, R.string.Doc_Facade_Cancel, new DialogInterface$OnClickListenerC9776af(runnable2)).mo45359b());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DocCollaboratorSubPresenter(DocCollaboratorSubContract.IModel aVar, DocCollaboratorSubContract.IView bVar, Activity activity, IDocCollaboratorManagerDependency kVar, DocPermSetInfo docPermSetInfo, int i) {
        super(aVar, bVar);
        Intrinsics.checkParameterIsNotNull(aVar, "model");
        Intrinsics.checkParameterIsNotNull(bVar, "view");
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(kVar, "dependency");
        Intrinsics.checkParameterIsNotNull(docPermSetInfo, "permSetInfo");
        this.f26360e = aVar;
        this.f26361f = bVar;
        this.f26362g = activity;
        this.f26363h = kVar;
        this.f26364i = docPermSetInfo;
        this.f26365j = i;
        this.f26366l = new EditPermDialog(activity);
        this.f26367m = LazyKt.lazy(C9770a.INSTANCE);
        this.f26368n = LazyKt.lazy(C9794s.INSTANCE);
    }
}
