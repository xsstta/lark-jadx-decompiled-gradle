package com.bytedance.ee.bear.middleground.permission.collaborator.invite;

import android.text.TextUtils;
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

/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.a */
public class C9638a extends BaseQuickAdapter<UserInfo, C20923c> {

    /* renamed from: a */
    protected AccountService.Account f25879a;

    /* renamed from: b */
    public AbstractC9639a f25880b;

    /* renamed from: c */
    private Locale f25881c;

    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.a$a */
    public interface AbstractC9639a {
        /* renamed from: a */
        void mo36860a(UserInfo userInfo, int i);
    }

    /* renamed from: a */
    public void mo36858a(AbstractC9639a aVar) {
        this.f25880b = aVar;
    }

    public C9638a(Locale locale, AccountService.Account account) {
        super((int) R.layout.share_folder_permission_manage_item);
        this.f25881c = locale;
        this.f25879a = account;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16806a(C20923c cVar, UserInfo userInfo) {
        boolean z;
        AvatarLoadHelper aVar = AvatarLoadHelper.f25748a;
        AvatarLoadHelper.m39732a((UDAvatar) cVar.mo70740b(R.id.share_item_icon), userInfo);
        CustomTitleView customTitleView = (CustomTitleView) cVar.mo70740b(R.id.share_item_name);
        customTitleView.setTitle(userInfo.getDisplayName(this.f25881c));
        int i = 0;
        if (!userInfo.isExternal() || !ToCUtil.f26828a.mo37759a(this.f25879a)) {
            z = false;
        } else {
            z = true;
        }
        customTitleView.setExternalVisible(z);
        TextView textView = (TextView) cVar.mo70740b(R.id.share_item_subtitle);
        textView.setText(userInfo.getDisplayLabel());
        if (TextUtils.isEmpty(userInfo.getDisplayLabel())) {
            i = 8;
        }
        textView.setVisibility(i);
    }
}
