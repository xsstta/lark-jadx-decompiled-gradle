package com.bytedance.ee.bear.middleground.permission.collaborator.invite.sendlink;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.C9638a;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.chad.library.adapter.base.C20923c;
import com.larksuite.suite.R;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014¨\u0006\r"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/sendlink/InviteMemberSendLinkAdapter;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/BaseInviteCollaboratorManageAdapter;", "locale", "Ljava/util/Locale;", "account", "Lcom/bytedance/ee/bear/contract/AccountService$Account;", "(Ljava/util/Locale;Lcom/bytedance/ee/bear/contract/AccountService$Account;)V", "convert", "", "helper", "Lcom/chad/library/adapter/base/BaseViewHolder;", "item", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.sendlink.b */
public final class InviteMemberSendLinkAdapter extends C9638a {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/middleground/permission/collaborator/invite/sendlink/InviteMemberSendLinkAdapter$convert$1", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.sendlink.b$a */
    public static final class C9717a extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ InviteMemberSendLinkAdapter f26206a;

        /* renamed from: b */
        final /* synthetic */ UserInfo f26207b;

        /* renamed from: c */
        final /* synthetic */ C20923c f26208c;

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            C9638a.AbstractC9639a aVar = this.f26206a.f25880b;
            if (aVar != null) {
                aVar.mo36860a(this.f26207b, this.f26208c.getLayoutPosition());
            }
        }

        C9717a(InviteMemberSendLinkAdapter bVar, UserInfo userInfo, C20923c cVar) {
            this.f26206a = bVar;
            this.f26207b = userInfo;
            this.f26208c = cVar;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InviteMemberSendLinkAdapter(Locale locale, AccountService.Account account) {
        super(locale, account);
        Intrinsics.checkParameterIsNotNull(locale, "locale");
        Intrinsics.checkParameterIsNotNull(account, "account");
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.C9638a
    /* renamed from: a */
    public void mo16806a(C20923c cVar, UserInfo userInfo) {
        View view;
        ImageView imageView;
        View view2;
        ImageView imageView2;
        View view3;
        ImageView imageView3;
        View view4;
        TextView textView;
        super.mo16806a(cVar, userInfo);
        if (!(cVar == null || (view4 = cVar.itemView) == null || (textView = (TextView) view4.findViewById(R.id.share_item_permission)) == null)) {
            textView.setVisibility(8);
        }
        if (!(cVar == null || (view3 = cVar.itemView) == null || (imageView3 = (ImageView) view3.findViewById(R.id.share_item_permission_icon)) == null)) {
            imageView3.setVisibility(8);
        }
        if (!(cVar == null || (view2 = cVar.itemView) == null || (imageView2 = (ImageView) view2.findViewById(R.id.share_collaborator_delete)) == null)) {
            imageView2.setVisibility(0);
        }
        if (cVar != null && (view = cVar.itemView) != null && (imageView = (ImageView) view.findViewById(R.id.share_collaborator_delete)) != null) {
            imageView.setOnClickListener(new C9717a(this, userInfo, cVar));
        }
    }
}
