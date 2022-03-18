package com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.facade.common.widget.CustomTitleView;
import com.bytedance.ee.bear.middleground.permission.collaborator.AvatarLoadHelper;
import com.bytedance.ee.bear.middleground.permission.collaborator.manager.p478b.AbstractC9753a;
import com.bytedance.ee.bear.middleground.permission.util.ToCUtil;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.larksuite.suite.R;
import java.util.Locale;

/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.c */
public class C9835c extends AbstractC9753a {

    /* renamed from: a */
    public AbstractC9839b f26493a;

    /* renamed from: b */
    public AbstractC9838a f26494b;

    /* renamed from: c */
    private final Locale f26495c;

    /* renamed from: d */
    private final AccountService.Account f26496d;

    /* renamed from: e */
    private boolean f26497e;

    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.c$a */
    public interface AbstractC9838a {
        void onAvatarClick(UserInfo userInfo);
    }

    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.c$b */
    public interface AbstractC9839b {
        void onItemPermissionClick(UserInfo userInfo, int i);
    }

    /* renamed from: a */
    public void mo37423a(AbstractC9838a aVar) {
        this.f26494b = aVar;
    }

    /* renamed from: a */
    public void mo37424a(AbstractC9839b bVar) {
        this.f26493a = bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16806a(AbstractC9753a.C9754a aVar, final UserInfo userInfo) {
        boolean z;
        int i;
        AvatarLoadHelper aVar2 = AvatarLoadHelper.f25748a;
        AvatarLoadHelper.m39732a(aVar.f26306a, userInfo);
        aVar.f26306a.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.C9835c.C98361 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                if (C9835c.this.f26494b != null) {
                    C9835c.this.f26494b.onAvatarClick(userInfo);
                }
            }
        });
        aVar.f26307b.setTitle(userInfo.getDisplayName(this.f26495c));
        CustomTitleView customTitleView = aVar.f26307b;
        boolean z2 = true;
        if (!userInfo.isOwner() || !this.f26497e) {
            z = false;
        } else {
            z = true;
        }
        customTitleView.setOwnerTagVisible(z);
        CustomTitleView customTitleView2 = aVar.f26307b;
        if (!userInfo.isExternal() || !ToCUtil.f26828a.mo37759a(this.f26496d)) {
            z2 = false;
        }
        customTitleView2.setExternalVisible(z2);
        aVar.f26308c.setText(userInfo.getDisplayLabel());
        TextView textView = aVar.f26308c;
        if (TextUtils.isEmpty(userInfo.getDisplayLabel())) {
            i = 8;
        } else {
            i = 0;
        }
        textView.setVisibility(i);
        if (TextUtils.isEmpty(userInfo.getPermSource()) || !this.f26497e) {
            aVar.f26309d.setVisibility(8);
        } else {
            aVar.f26309d.setVisibility(0);
            aVar.f26309d.setText(this.f51211q.getString(R.string.CreationMobile_ECM_InheritFolderDesc));
        }
        mo37425b(aVar, userInfo);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo37425b(final AbstractC9753a.C9754a aVar, final UserInfo userInfo) {
        String str;
        float f;
        boolean isOwner = userInfo.isOwner();
        boolean equals = TextUtils.equals(userInfo.getId(), this.f26496d.f14584a);
        boolean z = true;
        if (isOwner && !this.f26497e) {
            str = this.f51211q.getString(R.string.Doc_Share_ShareOwner);
        } else if (userInfo.getPermission() == 3) {
            str = this.f51211q.getString(R.string.CreationMobile_Wiki_Permission_FullAccess_Options);
        } else if (userInfo.getPermission() == 2) {
            str = this.f51211q.getString(R.string.Doc_Share_Editable);
        } else if (userInfo.getPermission() == 1) {
            str = this.f51211q.getString(R.string.Doc_Share_Readable);
        } else {
            str = "";
        }
        aVar.f26310e.setText(str);
        int i = 0;
        if (!this.f26497e ? !userInfo.isCan_modify_perm() || isOwner || equals : !userInfo.isCan_modify_perm() || isOwner) {
            z = false;
        }
        aVar.f26310e.setEnabled(z);
        TextView textView = aVar.f26310e;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.5f;
        }
        textView.setAlpha(f);
        ImageView imageView = aVar.f26311f;
        if (!z) {
            i = 8;
        }
        imageView.setVisibility(i);
        aVar.f26311f.setEnabled(z);
        C98372 r0 = new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.C9835c.C98372 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                if (C9835c.this.f26493a != null) {
                    C9835c.this.f26493a.onItemPermissionClick(userInfo, aVar.getLayoutPosition());
                }
            }
        };
        aVar.f26310e.setOnClickListener(r0);
        aVar.f26310e.setOnClickListener(r0);
    }

    public C9835c(Locale locale, AccountService.Account account, boolean z) {
        this.f26495c = locale;
        this.f26496d = account;
        this.f26497e = z;
    }
}
