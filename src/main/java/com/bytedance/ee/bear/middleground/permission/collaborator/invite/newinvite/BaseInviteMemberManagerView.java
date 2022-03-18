package com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite;

import android.content.Context;
import android.content.DialogInterface;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.basesdk.C4484g;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.facade.common.widget.recyclerview.LinearLayoutManagerWrapper;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.p424c.AbstractC8149a;
import com.bytedance.ee.bear.middleground.permission.PermissionAnalyticV2;
import com.bytedance.ee.bear.middleground.permission.collaborator.NotNotifyUserEntity;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.C9638a;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.IInviteMemberManagerContract;
import com.bytedance.ee.bear.middleground.permission.util.NotNotifyOperator;
import com.bytedance.ee.bear.p513o.AbstractC10365a;
import com.bytedance.ee.bear.p522q.C10539a;
import com.bytedance.ee.bear.p522q.p523a.C10548d;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.bear.widgets.C11824c;
import com.bytedance.ee.bear.widgets.dialog.BearUDDialogBuilder;
import com.bytedance.ee.bear.widgets.universedesign.SpaceEditText;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p701d.C13615c;
import com.bytedance.ee.util.p712o.p713a.C13716b;
import com.larksuite.component.universe_design.notice.UDNotice;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.component.universe_design.toast.UDToastImpl;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0003\n\u0002\b\u0012\b&\u0018\u0000 U2\u00020\u0001:\u0001UB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u001f\u001a\u00020\u0014H\u0002J\b\u0010 \u001a\u00020\u0014H\u0002J\b\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020\"H\u0016J\b\u0010$\u001a\u00020\u001aH&J\b\u0010%\u001a\u00020\u0007H\u0016J\u0016\u0010&\u001a\u00020\t2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020)0(H\u0002J\b\u0010*\u001a\u00020\tH\u0016J\u0018\u0010+\u001a\u0012\u0012\u0004\u0012\u00020-0,j\b\u0012\u0004\u0012\u00020-`.H\u0002J\u0006\u0010/\u001a\u00020\"J\u0006\u00100\u001a\u00020\"J\u0006\u00101\u001a\u00020\"J\b\u00102\u001a\u00020\"H\u0016J\b\u00103\u001a\u00020\"H\u0002J\b\u00104\u001a\u00020\"H\u0002J\b\u00105\u001a\u00020\"H\u0002J\b\u00106\u001a\u00020\u0014H\u0016J\b\u00107\u001a\u00020\u0014H\u0016J\u0010\u00108\u001a\u00020\"2\u0006\u00109\u001a\u00020\u0014H\u0002J\u0010\u0010:\u001a\u00020\"2\u0006\u0010;\u001a\u00020\u0014H\u0014J\u0012\u0010<\u001a\u00020\"2\b\u0010=\u001a\u0004\u0018\u00010\fH\u0016J\u0010\u0010>\u001a\u00020\"2\u0006\u0010?\u001a\u00020\tH\u0002J\u0010\u0010@\u001a\u00020\"2\u0006\u0010?\u001a\u00020\tH\u0002J\b\u0010A\u001a\u00020\"H\u0002J \u0010B\u001a\u00020\"2\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020\t2\u0006\u0010F\u001a\u00020\tH\u0016J\b\u0010G\u001a\u00020\"H\u0016J\b\u0010H\u001a\u00020\"H\u0016J\u0016\u0010I\u001a\u00020\"2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020)0(H\u0016J\u001e\u0010J\u001a\u00020\"2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020)0(2\u0006\u0010K\u001a\u00020\tH\u0016J\b\u0010L\u001a\u00020\"H\u0002J\b\u0010M\u001a\u00020\"H\u0002J\b\u0010N\u001a\u00020\u0014H\u0016J\u0010\u0010O\u001a\u00020\"2\u0006\u0010K\u001a\u00020\tH\u0016J\u0018\u0010P\u001a\u00020\"2\u0006\u0010Q\u001a\u00020\t2\u0006\u0010K\u001a\u00020\tH\u0003J \u0010R\u001a\u00020\"2\u0016\u0010S\u001a\u0012\u0012\u0004\u0012\u00020-0,j\b\u0012\u0004\u0012\u00020-`.H\u0016J\b\u0010T\u001a\u00020\"H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X.¢\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u00020\u001aX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006V"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/BaseInviteMemberManagerView;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/IInviteMemberManagerContract$IView;", "context", "Landroid/content/Context;", "rootView", "Landroid/view/View;", ShareHitPoint.f121869d, "", "creatorTenantId", "", "(Landroid/content/Context;Landroid/view/View;ILjava/lang/String;)V", "delegate", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/IInviteMemberManagerContract$IView$IViewDelegate;", "getDelegate", "()Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/IInviteMemberManagerContract$IView$IViewDelegate;", "setDelegate", "(Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/IInviteMemberManagerContract$IView$IViewDelegate;)V", "disposable", "Lio/reactivex/disposables/Disposable;", "isConsumer", "", "isLastNotesEmpty", "isSameTenant", "loadingDialog", "Lcom/bytedance/ee/bear/widgets/LoadingDialog;", "managerAdapter", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/BaseInviteCollaboratorManageAdapter;", "getManagerAdapter", "()Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/BaseInviteCollaboratorManageAdapter;", "setManagerAdapter", "(Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/BaseInviteCollaboratorManageAdapter;)V", "containDepartment", "containOverSizedGroup", "create", "", "destroy", "getAdapter", "getInviteBtnTextId", "getNotNotifyText", "notNotifyUsers", "", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/NotNotifyUserEntity;", "getNotes", "getSelectedUsers", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "Lkotlin/collections/ArrayList;", "hideBanner", "hideBanner2", "hideBanner3", "hideLoading", "initListener", "initRecyclerView", "initRootView", "isSelectContainerPerm", "isSendNotify", "setCheckboxEnable", "enable", "setNotesInput", "visible", "setViewDelegate", "viewDelegate", "showBanner", "tips", "showBanner2", "showBanner3", "showInviteFailedToast", "throwable", "", "token", "module", "showInviteSuccessToast", "showLoading", "showNotNotifyToast", "showNotNotifyToastWithOperate", "notificationId", "showNotifyContainDepDialog", "showNotifyContainOverSizedGroupDialog", "showNotifyTipsIfNeed", "showOperateSuccessToast", "showOperationToast", "text", "showUsers", "selectedUserList", "updateBannerVisible", "Companion", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.b */
public abstract class BaseInviteMemberManagerView implements IInviteMemberManagerContract.IView {

    /* renamed from: e */
    public static final Companion f25918e = new Companion(null);

    /* renamed from: a */
    protected C9638a f25919a;

    /* renamed from: b */
    public boolean f25920b = true;

    /* renamed from: c */
    public final Context f25921c;

    /* renamed from: d */
    public final View f25922d;

    /* renamed from: f */
    private IInviteMemberManagerContract.IView.IViewDelegate f25923f;

    /* renamed from: g */
    private C11824c f25924g;

    /* renamed from: h */
    private Disposable f25925h;

    /* renamed from: i */
    private boolean f25926i;

    /* renamed from: j */
    private boolean f25927j;

    /* renamed from: k */
    private final int f25928k;

    /* renamed from: l */
    private final String f25929l;

    /* renamed from: c */
    public abstract C9638a mo36882c();

    /* renamed from: d */
    public int mo36893d() {
        return R.string.Doc_Share_CollaboratorInvite;
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.IInviteMemberManagerContract.IView
    /* renamed from: i */
    public boolean mo36898i() {
        return true;
    }

    /* renamed from: r */
    public boolean mo36884r() {
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/BaseInviteMemberManagerView$Companion;", "", "()V", "TAG", "", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/BaseInviteMemberManagerView$initRecyclerView$1", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.b$f */
    public static final class C9649f extends RecyclerView.OnScrollListener {
        C9649f() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            if (i != 0 && recyclerView.requestFocus()) {
                C10548d.m43697a(recyclerView);
            }
        }
    }

    /* renamed from: a */
    public final IInviteMemberManagerContract.IView.IViewDelegate mo36885a() {
        return this.f25923f;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.b$j */
    static final class RunnableC9653j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BaseInviteMemberManagerView f25937a;

        /* renamed from: b */
        final /* synthetic */ Throwable f25938b;

        /* renamed from: c */
        final /* synthetic */ String f25939c;

        /* renamed from: d */
        final /* synthetic */ String f25940d;

        RunnableC9653j(BaseInviteMemberManagerView bVar, Throwable th, String str, String str2) {
            this.f25937a = bVar;
            this.f25938b = th;
            this.f25939c = str;
            this.f25940d = str2;
        }

        public final void run() {
            NotNotifyOperator.m41297a(this.f25937a.f25921c, this.f25938b, this.f25939c, this.f25940d);
        }
    }

    /* renamed from: b */
    public final C9638a mo36892b() {
        C9638a aVar = this.f25919a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("managerAdapter");
        }
        return aVar;
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        m39905u();
        m39906v();
        m39907w();
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.IInviteMemberManagerContract.IView
    /* renamed from: k */
    public void mo36900k() {
        C11824c cVar = this.f25924g;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadingDialog");
        }
        cVar.mo45304d();
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.IInviteMemberManagerContract.IView
    /* renamed from: l */
    public void mo36901l() {
        C11824c cVar = this.f25924g;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadingDialog");
        }
        cVar.mo45303c();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        Disposable disposable;
        C11824c cVar = this.f25924g;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadingDialog");
        }
        cVar.mo45303c();
        Disposable disposable2 = this.f25925h;
        if (disposable2 != null && !disposable2.isDisposed() && (disposable = this.f25925h) != null) {
            disposable.dispose();
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.IInviteMemberManagerContract.IView
    /* renamed from: h */
    public boolean mo36897h() {
        ImageView imageView = (ImageView) this.f25922d.findViewById(R.id.notificationCheckbox);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "rootView.notificationCheckbox");
        return imageView.isSelected();
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.IInviteMemberManagerContract.IView
    /* renamed from: j */
    public String mo36899j() {
        String obj;
        SpaceEditText spaceEditText = (SpaceEditText) this.f25922d.findViewById(R.id.notesInput);
        Intrinsics.checkExpressionValueIsNotNull(spaceEditText, "rootView.notesInput");
        Editable text = spaceEditText.getText();
        if (text == null || (obj = text.toString()) == null) {
            return "";
        }
        return obj;
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.IInviteMemberManagerContract.IView
    /* renamed from: m */
    public void mo36902m() {
        String string = this.f25921c.getString(R.string.Doc_Share_AddCollaboratorSuccessfully);
        Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(R.stri…CollaboratorSuccessfully)");
        Toast.showSuccessText(this.f25921c, string);
    }

    /* renamed from: t */
    public final ArrayList<UserInfo> mo36907t() {
        ArrayList<UserInfo> c;
        IInviteMemberManagerContract.IView.IViewDelegate aVar = this.f25923f;
        if (aVar == null || (c = aVar.mo36879c()) == null) {
            return new ArrayList<>();
        }
        return c;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/BaseInviteMemberManagerView$showOperationToast$2", "Lcom/larksuite/component/universe_design/toast/UDToast$OnToastDismissListener;", "onToastDismiss", "", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.b$o */
    public static final class C9658o implements UDToast.OnToastDismissListener {

        /* renamed from: a */
        final /* synthetic */ BaseInviteMemberManagerView f25945a;

        /* renamed from: b */
        final /* synthetic */ Ref.BooleanRef f25946b;

        /* renamed from: c */
        final /* synthetic */ String f25947c;

        @Override // com.larksuite.component.universe_design.toast.UDToast.OnToastDismissListener
        /* renamed from: a */
        public void mo36915a() {
            IInviteMemberManagerContract.IView.IViewDelegate a;
            C13479a.m54764b("BaseInviteMemberManagerView", "dismiss()...isUndoClick = " + this.f25946b.element);
            if (!this.f25946b.element && (a = this.f25945a.mo36885a()) != null) {
                a.mo36877a(this.f25947c);
            }
        }

        C9658o(BaseInviteMemberManagerView bVar, Ref.BooleanRef booleanRef, String str) {
            this.f25945a = bVar;
            this.f25946b = booleanRef;
            this.f25947c = str;
        }
    }

    /* renamed from: e */
    public final void mo36894e() {
        UDNotice uDNotice = (UDNotice) this.f25922d.findViewById(R.id.bannerTipsLayout);
        Intrinsics.checkExpressionValueIsNotNull(uDNotice, "rootView.bannerTipsLayout");
        if (uDNotice.getVisibility() != 8) {
            UDNotice uDNotice2 = (UDNotice) this.f25922d.findViewById(R.id.bannerTipsLayout);
            Intrinsics.checkExpressionValueIsNotNull(uDNotice2, "rootView.bannerTipsLayout");
            uDNotice2.setVisibility(8);
        }
    }

    /* renamed from: f */
    public final void mo36895f() {
        UDNotice uDNotice = (UDNotice) this.f25922d.findViewById(R.id.bannerTipsLayout2);
        Intrinsics.checkExpressionValueIsNotNull(uDNotice, "rootView.bannerTipsLayout2");
        if (uDNotice.getVisibility() != 8) {
            UDNotice uDNotice2 = (UDNotice) this.f25922d.findViewById(R.id.bannerTipsLayout2);
            Intrinsics.checkExpressionValueIsNotNull(uDNotice2, "rootView.bannerTipsLayout2");
            uDNotice2.setVisibility(8);
        }
    }

    /* renamed from: g */
    public final void mo36896g() {
        UDNotice uDNotice = (UDNotice) this.f25922d.findViewById(R.id.bannerTipsLayout3);
        Intrinsics.checkExpressionValueIsNotNull(uDNotice, "rootView.bannerTipsLayout3");
        if (uDNotice.getVisibility() != 8) {
            UDNotice uDNotice2 = (UDNotice) this.f25922d.findViewById(R.id.bannerTipsLayout3);
            Intrinsics.checkExpressionValueIsNotNull(uDNotice2, "rootView.bannerTipsLayout3");
            uDNotice2.setVisibility(8);
        }
    }

    /* renamed from: o */
    public final boolean mo36903o() {
        Iterator<UserInfo> it = mo36907t().iterator();
        while (it.hasNext()) {
            UserInfo next = it.next();
            Intrinsics.checkExpressionValueIsNotNull(next, "userInfo");
            if (next.getOwnerType() == 18) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: p */
    public final boolean mo36904p() {
        Iterator<UserInfo> it = mo36907t().iterator();
        while (it.hasNext()) {
            UserInfo next = it.next();
            Intrinsics.checkExpressionValueIsNotNull(next, "userInfo");
            if (next.getOwnerType() == 2 && next.getUserCount() >= 500) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: s */
    public final void mo36906s() {
        new BearUDDialogBuilder(this.f25921c).mo45344a(R.string.CreationMobile_Docs_AddCollaborator_department_notice_title).mo45362d(R.string.CreationMobile_Docs_AddCollaborator_LargeGroup_notice_content).mo45346a(R.id.ud_dialog_btn_primary, R.string.CreationMobile_Docs_AddCollaborator_department_notice_confirm_btn, new DialogInterface$OnClickListenerC9656m(this)).mo45346a(R.id.ud_dialog_btn_secondary, R.string.Doc_Facade_Cancel, (DialogInterface.OnClickListener) null).mo45359b();
    }

    /* renamed from: u */
    private final void m39905u() {
        this.f25922d.setOnClickListener(View$OnClickListenerC9652i.f25936a);
        boolean o = mo36903o();
        ImageView imageView = (ImageView) this.f25922d.findViewById(R.id.notificationCheckbox);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "rootView.notificationCheckbox");
        imageView.setSelected(!o);
        ((TextView) this.f25922d.findViewById(R.id.inviteBtn)).setText(mo36893d());
        ((UDNotice) this.f25922d.findViewById(R.id.bannerTipsLayout)).setType(UDNotice.Type.WARNING);
        ((UDNotice) this.f25922d.findViewById(R.id.bannerTipsLayout2)).setType(UDNotice.Type.WARNING);
        mo36881a(!o);
    }

    /* renamed from: w */
    private final void m39907w() {
        ((ImageView) this.f25922d.findViewById(R.id.titleBackIcon)).setOnClickListener(new C9645b(this));
        ((ImageView) this.f25922d.findViewById(R.id.notificationCheckbox)).setOnClickListener(new C9646c(this));
        ((ImageView) this.f25922d.findViewById(R.id.containerPermCheckBox)).setOnClickListener(new C9647d(this));
        ((TextView) this.f25922d.findViewById(R.id.inviteBtn)).setOnClickListener(new C9648e(this));
    }

    /* renamed from: v */
    private final void m39906v() {
        this.f25919a = mo36882c();
        RecyclerView recyclerView = (RecyclerView) this.f25922d.findViewById(R.id.usersRv);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rootView.usersRv");
        recyclerView.setLayoutManager(new LinearLayoutManagerWrapper(this.f25921c));
        RecyclerView recyclerView2 = (RecyclerView) this.f25922d.findViewById(R.id.usersRv);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "rootView.usersRv");
        C9638a aVar = this.f25919a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("managerAdapter");
        }
        recyclerView2.setAdapter(aVar);
        this.f25924g = new C11824c(this.f25921c);
        ((RecyclerView) this.f25922d.findViewById(R.id.usersRv)).addOnScrollListener(new C9649f());
        this.f25925h = C13716b.m55614a((SpaceEditText) this.f25922d.findViewById(R.id.notesInput)).debounce(300, TimeUnit.MILLISECONDS, C11678b.m48480d()).observeOn(C11678b.m48481e()).subscribe(new C9650g(this), C9651h.f25935a);
    }

    /* renamed from: q */
    public final void mo36905q() {
        String str;
        Iterator<UserInfo> it = mo36907t().iterator();
        String str2 = "";
        int i = 0;
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            UserInfo next = it.next();
            Intrinsics.checkExpressionValueIsNotNull(next, "userInfo");
            if (next.getOwnerType() == 18) {
                i++;
                if (str2.length() != 0) {
                    z = false;
                }
                if (z && (str2 = next.getDisplayName(C4484g.m18494b().mo17253d())) == null) {
                    str2 = "";
                }
            }
        }
        if (i == 1) {
            str = C10539a.m43639a(this.f25921c, R.string.CreationMobile_Docs_AddCollaborator_department_notice_content_singular, "department", str2);
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("department", str2);
            hashMap.put("count", String.valueOf(i));
            str = C10539a.m43640a(this.f25921c, R.string.CreationMobile_Docs_AddCollaborator_department_notice_content_plural, hashMap);
        }
        BearUDDialogBuilder a = new BearUDDialogBuilder(this.f25921c).mo45344a(R.string.CreationMobile_Docs_AddCollaborator_department_notice_title);
        Intrinsics.checkExpressionValueIsNotNull(str, "message");
        a.mo45357b(str).mo45346a(R.id.ud_dialog_btn_primary, R.string.CreationMobile_Docs_AddCollaborator_department_notice_confirm_btn, new DialogInterface$OnClickListenerC9654k(this)).mo45346a(R.id.ud_dialog_btn_secondary, R.string.Doc_Facade_Cancel, DialogInterface$OnClickListenerC9655l.f25942a).mo45359b();
        PermissionAnalyticV2.m39679h();
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.IInviteMemberManagerContract.IView
    /* renamed from: n */
    public void mo36883n() {
        String str;
        Iterator<UserInfo> it = mo36907t().iterator();
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (it.hasNext()) {
            UserInfo next = it.next();
            Intrinsics.checkExpressionValueIsNotNull(next, "selectedUser");
            if (next.getOwnerType() == 18) {
                z = true;
            }
            if (next.isExternal()) {
                z2 = true;
            }
            if (!next.isExternal() && next.getOwnerType() == 2) {
                z3 = true;
            }
        }
        C13479a.m54764b("BaseInviteMemberManagerView", "isContainsDep=" + z + ", " + "isContainsExternal=" + z2 + ", " + "isContainsInner=" + z3);
        if (!mo36897h() || !z) {
            mo36894e();
        } else {
            int i = this.f25928k;
            C8275a aVar = C8275a.f22379l;
            Intrinsics.checkExpressionValueIsNotNull(aVar, "DocumentType.MINUTES");
            if (i == aVar.mo32555b()) {
                str = this.f25921c.getString(R.string.CreationMobile_Common_MinutesBot);
            } else {
                str = this.f25921c.getString(R.string.CreatinoMobile_Minutes_bot_DocsAssist);
            }
            Intrinsics.checkExpressionValueIsNotNull(str, "if (type == DocumentType…e_Minutes_bot_DocsAssist)");
            String a = C10539a.m43639a(this.f25921c, R.string.CreatinoMobile_Minutes_share_notification, "bot", str);
            Intrinsics.checkExpressionValueIsNotNull(a, "UIHelper.mustacheFormat(…notification, \"bot\", bot)");
            m39903b(a);
        }
        boolean z4 = this.f25927j;
        if (!z4 && this.f25926i && z2) {
            String a2 = C10539a.m43639a(this.f25921c, R.string.Doc_Permission_ExternalUsersSendInvitationTips, "doc_type", ((AbstractC8149a) KoinJavaComponent.m268613a(AbstractC8149a.class, null, null, 6, null)).mo31510b(this.f25921c, this.f25928k));
            Intrinsics.checkExpressionValueIsNotNull(a2, "tips");
            m39904c(a2);
        } else if (z4 || this.f25926i || !z3) {
            mo36895f();
        } else {
            String a3 = C10539a.m43639a(this.f25921c, R.string.Doc_Permission_ExternalOwnerShareTips, "doc_type", ((AbstractC8149a) KoinJavaComponent.m268613a(AbstractC8149a.class, null, null, 6, null)).mo31510b(this.f25921c, this.f25928k));
            Intrinsics.checkExpressionValueIsNotNull(a3, "tips");
            m39904c(a3);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/BaseInviteMemberManagerView$initListener$1", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.b$b */
    public static final class C9645b extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ BaseInviteMemberManagerView f25930a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C9645b(BaseInviteMemberManagerView bVar) {
            this.f25930a = bVar;
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            IInviteMemberManagerContract.IView.IViewDelegate a = this.f25930a.mo36885a();
            if (a != null) {
                a.mo36875a();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/BaseInviteMemberManagerView$initListener$2", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.b$c */
    public static final class C9646c extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ BaseInviteMemberManagerView f25931a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C9646c(BaseInviteMemberManagerView bVar) {
            this.f25931a = bVar;
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            ImageView imageView = (ImageView) this.f25931a.f25922d.findViewById(R.id.notificationCheckbox);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "rootView.notificationCheckbox");
            ImageView imageView2 = (ImageView) this.f25931a.f25922d.findViewById(R.id.notificationCheckbox);
            Intrinsics.checkExpressionValueIsNotNull(imageView2, "rootView.notificationCheckbox");
            imageView.setSelected(!imageView2.isSelected());
            ImageView imageView3 = (ImageView) this.f25931a.f25922d.findViewById(R.id.notificationCheckbox);
            Intrinsics.checkExpressionValueIsNotNull(imageView3, "rootView.notificationCheckbox");
            this.f25931a.mo36881a(imageView3.isSelected());
            this.f25931a.mo36883n();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/BaseInviteMemberManagerView$initListener$3", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.b$d */
    public static final class C9647d extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ BaseInviteMemberManagerView f25932a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C9647d(BaseInviteMemberManagerView bVar) {
            this.f25932a = bVar;
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            int i;
            ImageView imageView = (ImageView) this.f25932a.f25922d.findViewById(R.id.containerPermCheckBox);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "rootView.containerPermCheckBox");
            ImageView imageView2 = (ImageView) this.f25932a.f25922d.findViewById(R.id.containerPermCheckBox);
            Intrinsics.checkExpressionValueIsNotNull(imageView2, "rootView.containerPermCheckBox");
            imageView.setSelected(!imageView2.isSelected());
            ImageView imageView3 = (ImageView) this.f25932a.f25922d.findViewById(R.id.containerPermCheckBox);
            Intrinsics.checkExpressionValueIsNotNull(imageView3, "rootView.containerPermCheckBox");
            if (imageView3.isSelected()) {
                i = R.string.CreationMobile_Wiki_SharePanel_AllowAccess_OnDesc;
            } else {
                i = R.string.CreationMobile_Wiki_SharePanel_AllowAccess_OffDesc;
            }
            ((TextView) this.f25932a.f25922d.findViewById(R.id.containerPermTipsDesc)).setText(i);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/BaseInviteMemberManagerView$initListener$4", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.b$e */
    public static final class C9648e extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ BaseInviteMemberManagerView f25933a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C9648e(BaseInviteMemberManagerView bVar) {
            this.f25933a = bVar;
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            if (this.f25933a.mo36884r() && this.f25933a.mo36903o() && this.f25933a.mo36897h()) {
                this.f25933a.mo36905q();
            } else if (!this.f25933a.mo36884r() || !this.f25933a.mo36904p() || !this.f25933a.mo36897h()) {
                IInviteMemberManagerContract.IView.IViewDelegate a = this.f25933a.mo36885a();
                if (a != null) {
                    a.mo36878b();
                }
            } else {
                this.f25933a.mo36906s();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "throwable", "", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.b$h */
    public static final class C9651h<T> implements Consumer<Throwable> {

        /* renamed from: a */
        public static final C9651h f25935a = new C9651h();

        C9651h() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54761a("BaseInviteMemberManagerView", th);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.b$i */
    public static final class View$OnClickListenerC9652i implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC9652i f25936a = new View$OnClickListenerC9652i();

        View$OnClickListenerC9652i() {
        }

        public final void onClick(View view) {
            C13479a.m54764b("BaseInviteMemberManagerView", "rootView click");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/BaseInviteMemberManagerView$showOperationToast$1", "Lcom/larksuite/component/universe_design/toast/UDToast$OnActionClickListener;", "onActionClick", "", "toast", "Lcom/larksuite/component/universe_design/toast/UDToastImpl;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.b$n */
    public static final class C9657n implements UDToast.OnActionClickListener {

        /* renamed from: a */
        final /* synthetic */ Ref.BooleanRef f25944a;

        C9657n(Ref.BooleanRef booleanRef) {
            this.f25944a = booleanRef;
        }

        @Override // com.larksuite.component.universe_design.toast.UDToast.OnActionClickListener
        public void onActionClick(UDToastImpl dVar) {
            Intrinsics.checkParameterIsNotNull(dVar, "toast");
            C13479a.m54764b("BaseInviteMemberManagerView", "click undo");
            Toast.showSuccessText(C13615c.f35773a, (int) R.string.Doc_Permission_PermissionsNotificationSuccessToast);
            dVar.cancel();
            this.f25944a.element = true;
        }
    }

    /* renamed from: a */
    public void setViewDelegate(IInviteMemberManagerContract.IView.IViewDelegate aVar) {
        this.f25923f = aVar;
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.IInviteMemberManagerContract.IView
    /* renamed from: a */
    public void mo36887a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "notificationId");
        String string = this.f25921c.getString(R.string.Doc_Share_AddCollaboratorSuccessfully);
        Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(R.stri…CollaboratorSuccessfully)");
        m39901a(string, str);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.b$g */
    public static final class C9650g<T> implements Consumer<CharSequence> {

        /* renamed from: a */
        final /* synthetic */ BaseInviteMemberManagerView f25934a;

        C9650g(BaseInviteMemberManagerView bVar) {
            this.f25934a = bVar;
        }

        /* renamed from: a */
        public final void accept(CharSequence charSequence) {
            boolean z;
            Intrinsics.checkExpressionValueIsNotNull(charSequence, "it");
            if (charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f25934a.f25920b = true;
                this.f25934a.mo36883n();
            } else if (this.f25934a.f25920b) {
                this.f25934a.f25920b = false;
                this.f25934a.mo36883n();
            }
        }
    }

    /* renamed from: b */
    private final void m39903b(String str) {
        ((UDNotice) this.f25922d.findViewById(R.id.bannerTipsLayout)).setText(str);
        UDNotice uDNotice = (UDNotice) this.f25922d.findViewById(R.id.bannerTipsLayout);
        Intrinsics.checkExpressionValueIsNotNull(uDNotice, "rootView.bannerTipsLayout");
        if (uDNotice.getVisibility() != 0) {
            UDNotice uDNotice2 = (UDNotice) this.f25922d.findViewById(R.id.bannerTipsLayout);
            Intrinsics.checkExpressionValueIsNotNull(uDNotice2, "rootView.bannerTipsLayout");
            uDNotice2.setVisibility(0);
        }
    }

    /* renamed from: c */
    private final void m39904c(String str) {
        ((UDNotice) this.f25922d.findViewById(R.id.bannerTipsLayout2)).setText(str);
        UDNotice uDNotice = (UDNotice) this.f25922d.findViewById(R.id.bannerTipsLayout2);
        Intrinsics.checkExpressionValueIsNotNull(uDNotice, "rootView.bannerTipsLayout2");
        if (uDNotice.getVisibility() != 0) {
            UDNotice uDNotice2 = (UDNotice) this.f25922d.findViewById(R.id.bannerTipsLayout2);
            Intrinsics.checkExpressionValueIsNotNull(uDNotice2, "rootView.bannerTipsLayout2");
            uDNotice2.setVisibility(0);
        }
    }

    /* renamed from: b */
    private final String m39902b(List<? extends NotNotifyUserEntity> list) {
        HashMap hashMap = new HashMap();
        String string = this.f25921c.getString(R.string.Doc_Share_AddCollaboratorSuccessfully);
        Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(R.stri…CollaboratorSuccessfully)");
        hashMap.put("operate", string);
        String string2 = this.f25921c.getString(R.string.Doc_Permission_AdminSetting);
        Intrinsics.checkExpressionValueIsNotNull(string2, "context.getString(R.stri…_Permission_AdminSetting)");
        hashMap.put("reason", string2);
        hashMap.put("users", NotNotifyOperator.m41291a(list));
        String a = C10539a.m43640a(this.f25921c, R.string.Doc_Permission_NotNotifyTip, hashMap);
        Intrinsics.checkExpressionValueIsNotNull(a, "UIHelper.mustacheFormat(…ission_NotNotifyTip, map)");
        return a;
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.IInviteMemberManagerContract.IView
    /* renamed from: a */
    public void mo36889a(ArrayList<UserInfo> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "selectedUserList");
        C9638a aVar = this.f25919a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("managerAdapter");
        }
        aVar.mo70690f(arrayList);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.IInviteMemberManagerContract.IView
    /* renamed from: a */
    public void mo36890a(List<? extends NotNotifyUserEntity> list) {
        Intrinsics.checkParameterIsNotNull(list, "notNotifyUsers");
        Toast.showSuccessText(this.f25921c, m39902b(list));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36881a(boolean z) {
        int i;
        SpaceEditText spaceEditText = (SpaceEditText) this.f25922d.findViewById(R.id.notesInput);
        Intrinsics.checkExpressionValueIsNotNull(spaceEditText, "rootView.notesInput");
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        spaceEditText.setVisibility(i);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.b$l */
    public static final class DialogInterface$OnClickListenerC9655l implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC9655l f25942a = new DialogInterface$OnClickListenerC9655l();

        DialogInterface$OnClickListenerC9655l() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            PermissionAnalyticV2.m39682i();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.b$m */
    public static final class DialogInterface$OnClickListenerC9656m implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BaseInviteMemberManagerView f25943a;

        DialogInterface$OnClickListenerC9656m(BaseInviteMemberManagerView bVar) {
            this.f25943a = bVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            IInviteMemberManagerContract.IView.IViewDelegate a = this.f25943a.mo36885a();
            if (a != null) {
                a.mo36878b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.b$k */
    public static final class DialogInterface$OnClickListenerC9654k implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BaseInviteMemberManagerView f25941a;

        DialogInterface$OnClickListenerC9654k(BaseInviteMemberManagerView bVar) {
            this.f25941a = bVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            boolean z;
            IInviteMemberManagerContract.IView.IViewDelegate a = this.f25941a.mo36885a();
            if (a != null) {
                a.mo36878b();
            }
            ArrayList<UserInfo> t = this.f25941a.mo36907t();
            if (this.f25941a.mo36899j().length() > 0) {
                z = true;
            } else {
                z = false;
            }
            PermissionAnalyticV2.m39631a(t, z);
        }
    }

    /* renamed from: a */
    private final void m39901a(String str, String str2) {
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = false;
        UDToast.build(this.f25921c).mo91643a(str).mo91647b(R.drawable.facade_widget_toast_ic_success).mo91639a(R.string.Doc_Permission_AddUserCancelNotice, new C9657n(booleanRef)).mo91642a(new C9658o(this, booleanRef, str2)).mo91656k();
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.IInviteMemberManagerContract.IView
    /* renamed from: a */
    public void mo36891a(List<? extends NotNotifyUserEntity> list, String str) {
        Intrinsics.checkParameterIsNotNull(list, "notNotifyUsers");
        Intrinsics.checkParameterIsNotNull(str, "notificationId");
        m39901a(m39902b(list), str);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.IInviteMemberManagerContract.IView
    /* renamed from: a */
    public void mo36888a(Throwable th, String str, String str2) {
        Intrinsics.checkParameterIsNotNull(th, "throwable");
        Intrinsics.checkParameterIsNotNull(str, "token");
        Intrinsics.checkParameterIsNotNull(str2, "module");
        ((AbstractC10365a) KoinJavaComponent.m268613a(AbstractC10365a.class, null, null, 6, null)).mo39502b(this.f25921c, th, new RunnableC9653j(this, th, str, str2));
    }

    public BaseInviteMemberManagerView(Context context, View view, int i, String str) {
        String str2;
        boolean z;
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        Intrinsics.checkParameterIsNotNull(str, "creatorTenantId");
        this.f25921c = context;
        this.f25922d = view;
        this.f25928k = i;
        this.f25929l = str;
        boolean z2 = true;
        AccountService.Account f = ((an) KoinJavaComponent.m268613a(an.class, null, null, 6, null)).mo16408f();
        String str3 = (f == null || (str2 = f.f14592i) == null) ? "" : str2;
        this.f25926i = TextUtils.equals(str3, str);
        if (f != null) {
            z = f.mo19681c();
        } else {
            z = false;
        }
        this.f25927j = z;
        StringBuilder sb = new StringBuilder();
        sb.append("isSameTenant=");
        sb.append(this.f25926i);
        sb.append(", ");
        sb.append("userTenantId is empty=");
        sb.append(str3.length() != 0 ? false : z2);
        sb.append(", ");
        sb.append("isConsumer=");
        sb.append(this.f25927j);
        C13479a.m54764b("BaseInviteMemberManagerView", sb.toString());
    }
}
