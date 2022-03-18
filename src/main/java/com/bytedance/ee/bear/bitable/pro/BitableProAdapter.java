package com.bytedance.ee.bear.bitable.pro;

import android.content.Context;
import android.view.View;
import com.bytedance.ee.bear.middleground_permission_export.model.p499a.AbstractC10157c;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.C20923c;
import com.larksuite.component.universe_design.image.UDAvatar;
import com.larksuite.component.universe_design.image.UDAvatarList;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u000f\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0014R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/bytedance/ee/bear/bitable/pro/BitableProAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/bytedance/ee/bear/bitable/pro/Role;", "Lcom/chad/library/adapter/base/BaseViewHolder;", "pageTrigger", "Lcom/bytedance/ee/bear/bitable/pro/IBitableProPageTrigger;", "(Lcom/bytedance/ee/bear/bitable/pro/IBitableProPageTrigger;)V", "convert", "", "helper", "role", "AvatarListAdapter", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.bitable.pro.b */
public final class BitableProAdapter extends BaseQuickAdapter<Role, C20923c> {

    /* renamed from: a */
    public final IBitableProPageTrigger f14183a;

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004H\u0016¨\u0006\u000b"}, d2 = {"Lcom/bytedance/ee/bear/bitable/pro/BitableProAdapter$AvatarListAdapter;", "Lcom/larksuite/component/universe_design/image/UDAvatarList$AvatarAdapter;", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "avatarSize", "", "(I)V", "onItemCreated", "", "avatar", "Lcom/larksuite/component/universe_design/image/UDAvatar;", "position", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.pro.b$a */
    public static final class AvatarListAdapter extends UDAvatarList.AvatarAdapter<UserInfo> {
        public AvatarListAdapter() {
            this(0, 1, null);
        }

        public AvatarListAdapter(int i) {
            super(i, null, 2, null);
        }

        @Override // com.larksuite.component.universe_design.image.UDAvatarList.AvatarAdapter
        /* renamed from: a */
        public void mo18933a(UDAvatar uDAvatar, int i) {
            Intrinsics.checkParameterIsNotNull(uDAvatar, "avatar");
            UserInfo userInfo = (UserInfo) getItem(i);
            if (userInfo != null) {
                ((AbstractC10157c) KoinJavaComponent.m268613a(AbstractC10157c.class, null, null, 6, null)).mo36639b().mo36677a(uDAvatar, userInfo);
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AvatarListAdapter(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? -1 : i);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/bitable/pro/BitableProAdapter$convert$2", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.pro.b$b */
    public static final class C4831b extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ BitableProAdapter f14184a;

        /* renamed from: b */
        final /* synthetic */ Role f14185b;

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            IBitableProPageTrigger hVar = this.f14184a.f14183a;
            if (hVar != null) {
                hVar.mo18862a(this.f14185b);
            }
        }

        C4831b(BitableProAdapter bVar, Role role) {
            this.f14184a = bVar;
            this.f14185b = role;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/bitable/pro/BitableProAdapter$convert$3", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.pro.b$c */
    public static final class C4832c extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ BitableProAdapter f14186a;

        /* renamed from: b */
        final /* synthetic */ Role f14187b;

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            IBitableProPageTrigger hVar = this.f14186a.f14183a;
            if (hVar != null) {
                hVar.mo18864b(this.f14187b);
            }
        }

        C4832c(BitableProAdapter bVar, Role role) {
            this.f14186a = bVar;
            this.f14187b = role;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/bitable/pro/BitableProAdapter$convert$4", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.pro.b$d */
    public static final class C4833d extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ BitableProAdapter f14188a;

        /* renamed from: b */
        final /* synthetic */ Role f14189b;

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            IBitableProPageTrigger hVar = this.f14188a.f14183a;
            if (hVar != null) {
                hVar.mo18866c(this.f14189b);
            }
        }

        C4833d(BitableProAdapter bVar, Role role) {
            this.f14188a = bVar;
            this.f14189b = role;
        }
    }

    public BitableProAdapter(IBitableProPageTrigger hVar) {
        super((int) R.layout.bitable_pro_card_item);
        this.f14183a = hVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16806a(C20923c cVar, Role role) {
        String str;
        Intrinsics.checkParameterIsNotNull(cVar, "helper");
        Intrinsics.checkParameterIsNotNull(role, "role");
        int canEditTableCount = role.getCanEditTableCount();
        int canReadTableCount = role.getCanReadTableCount();
        if (canEditTableCount <= 0 || canReadTableCount <= 0) {
            if (canEditTableCount > 0) {
                Context context = this.f51211q;
                Intrinsics.checkExpressionValueIsNotNull(context, "mContext");
                str = context.getResources().getQuantityString(R.plurals.Bitable_AdvancedPermission_CanEditNumTable, canEditTableCount, Integer.valueOf(canEditTableCount));
            } else if (canReadTableCount > 0) {
                Context context2 = this.f51211q;
                Intrinsics.checkExpressionValueIsNotNull(context2, "mContext");
                str = context2.getResources().getQuantityString(R.plurals.Bitable_AdvancedPermission_CanViewNumTable, canReadTableCount, Integer.valueOf(canReadTableCount));
            } else {
                str = this.f51211q.getString(R.string.Bitable_AdvancedPermission_NoAccessToAnyTable);
            }
            Intrinsics.checkExpressionValueIsNotNull(str, "if (editCount > 0) {\n   …cessToAnyTable)\n        }");
        } else {
            Context context3 = this.f51211q;
            Intrinsics.checkExpressionValueIsNotNull(context3, "mContext");
            String quantityString = context3.getResources().getQuantityString(R.plurals.Bitable_AdvancedPermission_CanEditNumTable, canEditTableCount, Integer.valueOf(canEditTableCount));
            Intrinsics.checkExpressionValueIsNotNull(quantityString, "mContext.resources.getQu…le, editCount, editCount)");
            Context context4 = this.f51211q;
            Intrinsics.checkExpressionValueIsNotNull(context4, "mContext");
            String quantityString2 = context4.getResources().getQuantityString(R.plurals.Bitable_AdvancedPermission_CanViewNumTable, canReadTableCount, Integer.valueOf(canReadTableCount));
            Intrinsics.checkExpressionValueIsNotNull(quantityString2, "mContext.resources.getQu…le, readCount, readCount)");
            String string = this.f51211q.getString(R.string.CreationMobile_common_punctuation_comma);
            Intrinsics.checkExpressionValueIsNotNull(string, "mContext.getString(R.str…common_punctuation_comma)");
            str = quantityString + string + quantityString2;
        }
        DefaultTagTitleView defaultTagTitleView = (DefaultTagTitleView) cVar.mo70740b(R.id.roleTitle);
        Intrinsics.checkExpressionValueIsNotNull(defaultTagTitleView, "titleView");
        defaultTagTitleView.setTitle(role.getName());
        defaultTagTitleView.mo18869a(role.isDefault(), R.string.Bitable_AdvancedPermission_DefaultPermission);
        cVar.mo70737a(R.id.roleDesc, str);
        if (role.getMembers().isEmpty()) {
            cVar.mo70742b(R.id.managerMemberArrowIcon, true).mo70738a(R.id.memberAvatarList, false);
        } else {
            cVar.mo70738a(R.id.managerMemberArrowIcon, false).mo70742b(R.id.memberAvatarList, true);
            AvatarListAdapter aVar = new AvatarListAdapter(-3);
            aVar.mo91014c(role.getMembers());
            ((UDAvatarList) cVar.mo70740b(R.id.memberAvatarList)).setAdapter(aVar);
        }
        cVar.itemView.setOnClickListener(new C4831b(this, role));
        cVar.mo70740b(R.id.inviteMemberLayout).setOnClickListener(new C4832c(this, role));
        cVar.mo70740b(R.id.managerMemberLayout).setOnClickListener(new C4833d(this, role));
    }
}
