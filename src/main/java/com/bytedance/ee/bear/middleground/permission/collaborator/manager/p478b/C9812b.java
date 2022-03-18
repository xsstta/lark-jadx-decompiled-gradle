package com.bytedance.ee.bear.middleground.permission.collaborator.manager.p478b;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.facade.common.widget.CustomTitleView;
import com.bytedance.ee.bear.middleground.permission.collaborator.AvatarLoadHelper;
import com.bytedance.ee.bear.middleground.permission.collaborator.manager.p478b.AbstractC9753a;
import com.bytedance.ee.bear.middleground.permission.permission.doc.DocUserPermission;
import com.bytedance.ee.bear.middleground.permission.util.ToCUtil;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.larksuite.suite.R;
import java.util.Locale;

/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.b.b */
public class C9812b extends AbstractC9753a {

    /* renamed from: a */
    public AbstractC9817a f26444a;

    /* renamed from: b */
    public AbstractC9818b f26445b;

    /* renamed from: c */
    public AbstractC9819c f26446c;

    /* renamed from: d */
    private final AccountService.Account f26447d;

    /* renamed from: e */
    private final Locale f26448e;

    /* renamed from: f */
    private final boolean f26449f;

    /* renamed from: g */
    private final boolean f26450g;

    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.b.b$a */
    public interface AbstractC9817a {
        void onAvatarClick(int i, UserInfo userInfo);
    }

    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.b.b$b */
    public interface AbstractC9818b {
        void onEditPermission(int i, UserInfo userInfo);
    }

    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.b.b$c */
    public interface AbstractC9819c {
        void onTipsClick(int i, UserInfo userInfo);
    }

    /* renamed from: a */
    public void mo37325a(AbstractC9817a aVar) {
        this.f26444a = aVar;
    }

    /* renamed from: a */
    public void mo37326a(AbstractC9818b bVar) {
        this.f26445b = bVar;
    }

    /* renamed from: c */
    private void m40521c(View view) {
        view.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.middleground.permission.collaborator.manager.p478b.C9812b.C98142 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
            }
        });
    }

    /* renamed from: a */
    private void m40515a(AbstractC9753a.C9754a aVar) {
        int i;
        if (this.f26449f) {
            i = R.string.CreationMobile_Wiki_Permission_FullAccess_Options;
        } else {
            i = R.string.Doc_Share_ShareOwner;
        }
        aVar.f26310e.setText(this.f51211q.getString(i));
        aVar.f26310e.setTextColor(this.f51211q.getResources().getColor(R.color.text_caption));
        aVar.f26311f.setVisibility(8);
        aVar.f26310e.setOnClickListener(null);
    }

    /* renamed from: a */
    private boolean m40517a(UserInfo userInfo) {
        if (this.f26449f) {
            return !userInfo.isCan_modify_perm();
        }
        if ((this.f26447d == null || !TextUtils.equals(userInfo.getId(), this.f26447d.f14584a)) && userInfo.isCan_modify_perm()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo37327a(AbstractC9819c cVar) {
        this.f26446c = cVar;
    }

    /* renamed from: a */
    private void m40516a(UserInfo userInfo, CustomTitleView customTitleView) {
        boolean z;
        String displayName = userInfo.getDisplayName(this.f26448e);
        if (!TextUtils.isEmpty(displayName)) {
            customTitleView.setTitle(displayName.replaceAll("<em>", "").replaceAll("</em>", ""));
        }
        if (!userInfo.isExternal() || !ToCUtil.f26828a.mo37759a(this.f26447d)) {
            z = false;
        } else {
            z = true;
        }
        customTitleView.setExternalVisible(z);
        customTitleView.setTipsVisible(false);
        customTitleView.setOwnerTagVisible(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16806a(AbstractC9753a.C9754a aVar, UserInfo userInfo) {
        int i;
        int adapterPosition = aVar.getAdapterPosition() - mo70678c();
        UserInfo userInfo2 = (UserInfo) mo70685d(adapterPosition);
        AvatarLoadHelper aVar2 = AvatarLoadHelper.f25748a;
        AvatarLoadHelper.m39732a(aVar.f26306a, userInfo2);
        if (TextUtils.isEmpty(userInfo.getPermSource()) || !this.f26449f) {
            aVar.f26309d.setVisibility(8);
        } else {
            aVar.f26309d.setVisibility(0);
            if (this.f26450g) {
                i = R.string.CreationMobile_Wiki_Permission_InheritPermissions_Tooltip;
            } else {
                i = R.string.CreationMobile_ECM_InheritFolderDesc;
            }
            aVar.f26309d.setText(this.f51211q.getString(i));
        }
        if (userInfo2.isOwner()) {
            m40514a(adapterPosition, userInfo2, aVar);
        } else if (userInfo2.getOwnerType() == 5 || userInfo2.getOwnerType() == 11) {
            m40519b(adapterPosition, userInfo2, aVar);
        } else if (userInfo2.getOwnerType() == 16) {
            m40520c(adapterPosition, userInfo2, aVar);
        } else if (userInfo2.getOwnerType() == 9) {
            m40522d(adapterPosition, userInfo2, aVar);
        } else if (userInfo2.getOwnerType() == 2) {
            m40523e(adapterPosition, userInfo2, aVar);
        } else if (userInfo2.getOwnerType() == 18) {
            m40524f(adapterPosition, userInfo, aVar);
        } else {
            m40525g(adapterPosition, userInfo2, aVar);
        }
    }

    /* renamed from: a */
    private void m40512a(final int i, final UserInfo userInfo, View view) {
        view.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.middleground.permission.collaborator.manager.p478b.C9812b.C98131 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                if (C9812b.this.f26444a != null) {
                    C9812b.this.f26444a.onAvatarClick(i, userInfo);
                }
            }
        });
    }

    /* renamed from: b */
    private void m40518b(final int i, final UserInfo userInfo, View view) {
        view.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.middleground.permission.collaborator.manager.p478b.C9812b.C98164 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                if (C9812b.this.f26445b != null) {
                    C9812b.this.f26445b.onEditPermission(i, userInfo);
                }
            }
        });
    }

    /* renamed from: a */
    private void m40513a(final int i, final UserInfo userInfo, CustomTitleView customTitleView) {
        customTitleView.setTipsClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.middleground.permission.collaborator.manager.p478b.C9812b.C98153 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                if (C9812b.this.f26446c != null) {
                    C9812b.this.f26446c.onTipsClick(i, userInfo);
                }
            }
        });
    }

    /* renamed from: c */
    private void m40520c(int i, UserInfo userInfo, AbstractC9753a.C9754a aVar) {
        m40521c((View) aVar.f26306a);
        m40516a(userInfo, aVar.f26307b);
        aVar.f26308c.setVisibility(8);
        m40526h(i, userInfo, aVar);
    }

    /* renamed from: f */
    private void m40524f(int i, UserInfo userInfo, AbstractC9753a.C9754a aVar) {
        m40521c((View) aVar.f26306a);
        m40516a(userInfo, aVar.f26307b);
        aVar.f26308c.setVisibility(8);
        m40526h(i, userInfo, aVar);
    }

    /* renamed from: b */
    private void m40519b(int i, UserInfo userInfo, AbstractC9753a.C9754a aVar) {
        m40521c((View) aVar.f26306a);
        m40516a(userInfo, aVar.f26307b);
        aVar.f26307b.setTipsVisible(userInfo.isHas_tips());
        m40513a(i, userInfo, aVar.f26307b);
        aVar.f26308c.setVisibility(8);
        m40526h(i, userInfo, aVar);
    }

    /* renamed from: d */
    private void m40522d(int i, UserInfo userInfo, AbstractC9753a.C9754a aVar) {
        m40521c((View) aVar.f26306a);
        m40516a(userInfo, aVar.f26307b);
        aVar.f26307b.setTipsVisible(userInfo.isHas_tips());
        m40513a(i, userInfo, aVar.f26307b);
        aVar.f26308c.setVisibility(8);
        m40526h(i, userInfo, aVar);
    }

    /* renamed from: e */
    private void m40523e(int i, UserInfo userInfo, AbstractC9753a.C9754a aVar) {
        String str;
        m40521c((View) aVar.f26306a);
        m40516a(userInfo, aVar.f26307b);
        aVar.f26308c.setVisibility(0);
        TextView textView = aVar.f26308c;
        if (TextUtils.isEmpty(userInfo.getLabel())) {
            str = this.f51211q.getString(R.string.Doc_Facade_NoGroupDesc);
        } else {
            str = userInfo.getLabel();
        }
        textView.setText(str);
        m40526h(i, userInfo, aVar);
    }

    /* renamed from: g */
    private void m40525g(int i, UserInfo userInfo, AbstractC9753a.C9754a aVar) {
        m40512a(i, userInfo, aVar.f26306a);
        m40516a(userInfo, aVar.f26307b);
        String displayLabel = userInfo.getDisplayLabel();
        if (TextUtils.isEmpty(displayLabel)) {
            aVar.f26308c.setVisibility(8);
        } else {
            aVar.f26308c.setVisibility(0);
            aVar.f26308c.setText(displayLabel);
        }
        m40526h(i, userInfo, aVar);
    }

    /* renamed from: a */
    private void m40514a(int i, UserInfo userInfo, AbstractC9753a.C9754a aVar) {
        boolean z;
        m40512a(i, userInfo, aVar.f26306a);
        aVar.f26307b.setTitle(userInfo.getDisplayName(this.f26448e));
        aVar.f26307b.setOwnerTagVisible(this.f26449f);
        aVar.f26307b.setTipsVisible(false);
        CustomTitleView customTitleView = aVar.f26307b;
        if (!userInfo.isExternal() || !ToCUtil.f26828a.mo37759a(this.f26447d)) {
            z = false;
        } else {
            z = true;
        }
        customTitleView.setExternalVisible(z);
        aVar.f26309d.setVisibility(8);
        if (TextUtils.isEmpty(userInfo.getLabel())) {
            aVar.f26308c.setVisibility(8);
        } else {
            aVar.f26308c.setVisibility(0);
            aVar.f26308c.setText(userInfo.getLabel());
        }
        m40515a(aVar);
    }

    /* renamed from: h */
    private void m40526h(int i, UserInfo userInfo, AbstractC9753a.C9754a aVar) {
        if (DocUserPermission.isFullAccess(userInfo.getPermission())) {
            aVar.f26310e.setText(this.f51211q.getString(R.string.CreationMobile_Wiki_Permission_FullAccess_Options));
        } else if (DocUserPermission.canEdit(userInfo.getPermission())) {
            aVar.f26310e.setText(R.string.Doc_Share_Editable);
        } else if (DocUserPermission.canRead(userInfo.getPermission())) {
            aVar.f26310e.setText(R.string.Doc_Share_Readable);
        } else {
            aVar.f26310e.setText(this.f51211q.getString(R.string.CreationMobile_Wiki_Permission_NoAccess_Options));
        }
        if (m40517a(userInfo)) {
            aVar.f26310e.setOnClickListener(null);
            aVar.f26311f.setOnClickListener(null);
            aVar.f26310e.setTextColor(this.f51211q.getResources().getColor(R.color.text_title));
            aVar.f26311f.setVisibility(8);
            return;
        }
        aVar.f26310e.setTextColor(this.f51211q.getResources().getColor(R.color.text_title));
        aVar.f26311f.setVisibility(0);
        m40518b(i, userInfo, aVar.f26310e);
        m40518b(i, userInfo, aVar.f26311f);
    }

    public C9812b(AccountService.Account account, Locale locale, boolean z, boolean z2) {
        this.f26447d = account;
        this.f26448e = locale;
        this.f26450g = z;
        this.f26449f = z2;
    }
}
