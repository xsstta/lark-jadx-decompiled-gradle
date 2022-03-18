package com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.bitablepro;

import android.view.View;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.C9638a;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.chad.library.adapter.base.C20923c;
import com.larksuite.suite.R;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u001a\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0011"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/bitablepro/BitableProInviteMemberManagerAdapter;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/BaseInviteCollaboratorManageAdapter;", "locale", "Ljava/util/Locale;", "account", "Lcom/bytedance/ee/bear/contract/AccountService$Account;", "(Ljava/util/Locale;Lcom/bytedance/ee/bear/contract/AccountService$Account;)V", "getAccount", "()Lcom/bytedance/ee/bear/contract/AccountService$Account;", "getLocale", "()Ljava/util/Locale;", "convert", "", "helper", "Lcom/chad/library/adapter/base/BaseViewHolder;", "item", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.a.a */
public final class BitableProInviteMemberManagerAdapter extends C9638a {

    /* renamed from: c */
    private final Locale f25884c;

    /* renamed from: d */
    private final AccountService.Account f25885d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/bitablepro/BitableProInviteMemberManagerAdapter$convert$1", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.a.a$a */
    public static final class C9640a extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ BitableProInviteMemberManagerAdapter f25886a;

        /* renamed from: b */
        final /* synthetic */ UserInfo f25887b;

        /* renamed from: c */
        final /* synthetic */ C20923c f25888c;

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            C9638a.AbstractC9639a aVar = this.f25886a.f25880b;
            if (aVar != null) {
                aVar.mo36860a(this.f25887b, this.f25888c.getLayoutPosition());
            }
        }

        C9640a(BitableProInviteMemberManagerAdapter aVar, UserInfo userInfo, C20923c cVar) {
            this.f25886a = aVar;
            this.f25887b = userInfo;
            this.f25888c = cVar;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BitableProInviteMemberManagerAdapter(Locale locale, AccountService.Account account) {
        super(locale, account);
        Intrinsics.checkParameterIsNotNull(locale, "locale");
        this.f25884c = locale;
        this.f25885d = account;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.C9638a
    /* renamed from: a */
    public void mo16806a(C20923c cVar, UserInfo userInfo) {
        Intrinsics.checkParameterIsNotNull(cVar, "helper");
        super.mo16806a(cVar, userInfo);
        cVar.mo70742b(R.id.share_item_permission, false).mo70742b(R.id.share_item_permission_icon, false).mo70742b(R.id.share_collaborator_delete, true);
        cVar.mo70740b(R.id.share_collaborator_delete).setOnClickListener(new C9640a(this, userInfo, cVar));
    }
}
