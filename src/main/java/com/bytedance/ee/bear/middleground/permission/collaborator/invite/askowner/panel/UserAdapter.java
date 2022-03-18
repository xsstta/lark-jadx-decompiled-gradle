package com.bytedance.ee.bear.middleground.permission.collaborator.invite.askowner.panel;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.facade.common.widget.CustomTitleView;
import com.bytedance.ee.bear.middleground.permission.collaborator.AvatarLoadHelper;
import com.bytedance.ee.bear.middleground.permission.util.ToCUtil;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.C20923c;
import com.larksuite.component.universe_design.image.UDAvatar;
import com.larksuite.suite.R;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0014R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/askowner/panel/UserAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/askowner/panel/UserAdapter$ViewHolder;", "locale", "Ljava/util/Locale;", "account", "Lcom/bytedance/ee/bear/contract/AccountService$Account;", "(Ljava/util/Locale;Lcom/bytedance/ee/bear/contract/AccountService$Account;)V", "convert", "", "helper", "item", "ViewHolder", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.askowner.a.g */
public final class UserAdapter extends BaseQuickAdapter<UserInfo, ViewHolder> {

    /* renamed from: a */
    private final Locale f26136a;

    /* renamed from: b */
    private final AccountService.Account f26137b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/askowner/panel/UserAdapter$ViewHolder;", "Lcom/chad/library/adapter/base/BaseViewHolder;", "root", "Landroid/view/View;", "(Landroid/view/View;)V", "avatarView", "Lcom/larksuite/component/universe_design/image/UDAvatar;", "getAvatarView", "()Lcom/larksuite/component/universe_design/image/UDAvatar;", "divider", "getDivider", "()Landroid/view/View;", "labelView", "Landroid/widget/TextView;", "getLabelView", "()Landroid/widget/TextView;", "userNameView", "Lcom/bytedance/ee/bear/facade/common/widget/CustomTitleView;", "getUserNameView", "()Lcom/bytedance/ee/bear/facade/common/widget/CustomTitleView;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.askowner.a.g$a */
    public static final class ViewHolder extends C20923c {

        /* renamed from: a */
        private final CustomTitleView f26138a;

        /* renamed from: b */
        private final TextView f26139b;

        /* renamed from: c */
        private final UDAvatar f26140c;

        /* renamed from: d */
        private final View f26141d;

        /* renamed from: a */
        public final CustomTitleView mo37011a() {
            return this.f26138a;
        }

        /* renamed from: b */
        public final TextView mo37012b() {
            return this.f26139b;
        }

        /* renamed from: c */
        public final UDAvatar mo37013c() {
            return this.f26140c;
        }

        /* renamed from: d */
        public final View mo37014d() {
            return this.f26141d;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "root");
            CustomTitleView customTitleView = (CustomTitleView) view.findViewById(R.id.userNameView);
            Intrinsics.checkExpressionValueIsNotNull(customTitleView, "root.userNameView");
            this.f26138a = customTitleView;
            TextView textView = (TextView) view.findViewById(R.id.labelView);
            Intrinsics.checkExpressionValueIsNotNull(textView, "root.labelView");
            this.f26139b = textView;
            UDAvatar uDAvatar = (UDAvatar) view.findViewById(R.id.avatarView);
            Intrinsics.checkExpressionValueIsNotNull(uDAvatar, "root.avatarView");
            this.f26140c = uDAvatar;
            View findViewById = view.findViewById(R.id.divider);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "root.divider");
            this.f26141d = findViewById;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserAdapter(Locale locale, AccountService.Account account) {
        super((int) R.layout.permission_user_item);
        Intrinsics.checkParameterIsNotNull(locale, "locale");
        this.f26136a = locale;
        this.f26137b = account;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16806a(ViewHolder aVar, UserInfo userInfo) {
        boolean z;
        int i;
        Intrinsics.checkParameterIsNotNull(aVar, "helper");
        Intrinsics.checkParameterIsNotNull(userInfo, "item");
        aVar.mo37011a().setTitle(userInfo.getDisplayName(this.f26136a));
        CustomTitleView a = aVar.mo37011a();
        boolean z2 = true;
        int i2 = 0;
        if (!userInfo.isExternal() || !ToCUtil.f26828a.mo37759a(this.f26137b)) {
            z = false;
        } else {
            z = true;
        }
        a.setExternalVisible(z);
        String displayLabel = userInfo.getDisplayLabel();
        TextView b = aVar.mo37012b();
        String str = displayLabel;
        if (TextUtils.isEmpty(str)) {
            i = 8;
        } else {
            i = 0;
        }
        b.setVisibility(i);
        aVar.mo37012b().setText(str);
        AvatarLoadHelper.m39732a(aVar.mo37013c(), userInfo);
        if (aVar.getAdapterPosition() != mo70673b().size() - 1) {
            z2 = false;
        }
        View d = aVar.mo37014d();
        if (z2) {
            i2 = 8;
        }
        d.setVisibility(i2);
    }
}
