package com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.bitablepro;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ee.bear.basesdk.C4484g;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.C9638a;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.BaseInviteMemberManagerView;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.IInviteMemberManagerContract;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.bytedance.ee.bear.widgets.universedesign.SpaceEditText;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0014J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0013\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/bitablepro/BitableProInviteMemberManagerView;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/BaseInviteMemberManagerView;", "context", "Landroid/content/Context;", "view", "Landroid/view/View;", ShareHitPoint.f121869d, "", "creatorTenantId", "", "(Landroid/content/Context;Landroid/view/View;ILjava/lang/String;)V", "create", "", "getAdapter", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/BaseInviteCollaboratorManageAdapter;", "setNotesInput", "visible", "", "showNotifyTipsIfNeed", "updateBannerVisible", "Companion", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.a.e */
public final class BitableProInviteMemberManagerView extends BaseInviteMemberManagerView {

    /* renamed from: f */
    public static final Companion f25912f = new Companion(null);

    /* renamed from: g */
    private final Context f25913g;

    /* renamed from: h */
    private final View f25914h;

    /* renamed from: i */
    private final int f25915i;

    /* renamed from: j */
    private final String f25916j;

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.BaseInviteMemberManagerView
    /* renamed from: r */
    public boolean mo36884r() {
        return false;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/bitablepro/BitableProInviteMemberManagerView$Companion;", "", "()V", "TAG", "", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.a.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.BaseInviteMemberManagerView, com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.IInviteMemberManagerContract.IView
    /* renamed from: n */
    public void mo36883n() {
        mo36894e();
        mo36895f();
        mo36896g();
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.BaseInviteMemberManagerView
    /* renamed from: c */
    public C9638a mo36882c() {
        Locale d = C4484g.m18494b().mo17253d();
        Intrinsics.checkExpressionValueIsNotNull(d, "SdkLocaleServiceWrapper.…nstance().provideLocale()");
        BitableProInviteMemberManagerAdapter aVar = new BitableProInviteMemberManagerAdapter(d, ((an) KoinJavaComponent.m268613a(an.class, null, null, 6, null)).mo16408f());
        aVar.mo36858a((C9638a.AbstractC9639a) new C9644b(this));
        return aVar;
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.BaseInviteMemberManagerView, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        TextView textView = (TextView) this.f25914h.findViewById(R.id.notificationTv);
        Intrinsics.checkExpressionValueIsNotNull(textView, "view.notificationTv");
        textView.setVisibility(4);
        ImageView imageView = (ImageView) this.f25914h.findViewById(R.id.notificationCheckbox);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "view.notificationCheckbox");
        imageView.setVisibility(4);
        SpaceEditText spaceEditText = (SpaceEditText) this.f25914h.findViewById(R.id.notesInput);
        Intrinsics.checkExpressionValueIsNotNull(spaceEditText, "view.notesInput");
        spaceEditText.setVisibility(8);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.BaseInviteMemberManagerView
    /* renamed from: a */
    public void mo36881a(boolean z) {
        super.mo36881a(false);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "userInfo", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "kotlin.jvm.PlatformType", "position", "", "onItemPermissionClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.a.e$b */
    static final class C9644b implements C9638a.AbstractC9639a {

        /* renamed from: a */
        final /* synthetic */ BitableProInviteMemberManagerView f25917a;

        C9644b(BitableProInviteMemberManagerView eVar) {
            this.f25917a = eVar;
        }

        @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.C9638a.AbstractC9639a
        /* renamed from: a */
        public final void mo36860a(UserInfo userInfo, int i) {
            C13479a.m54764b("BitableShareInviteMemberManagerView", "onClickRemovePermission()...pos = " + i);
            IInviteMemberManagerContract.IView.IViewDelegate a = this.f25917a.mo36885a();
            if (a != null) {
                Intrinsics.checkExpressionValueIsNotNull(userInfo, "userInfo");
                a.mo36876a(userInfo);
            }
            this.f25917a.mo36892b().notifyItemRemoved(i);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BitableProInviteMemberManagerView(Context context, View view, int i, String str) {
        super(context, view, i, str);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(str, "creatorTenantId");
        this.f25913g = context;
        this.f25914h = view;
        this.f25915i = i;
        this.f25916j = str;
    }
}
