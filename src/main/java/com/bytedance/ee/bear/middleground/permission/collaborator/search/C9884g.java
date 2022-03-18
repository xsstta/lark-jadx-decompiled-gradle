package com.bytedance.ee.bear.middleground.permission.collaborator.search;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.facade.common.widget.CustomTitleView;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.middleground.permission.PermFGUtils;
import com.bytedance.ee.bear.middleground.permission.collaborator.AvatarLoadHelper;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.InviteMemberParams;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.existmember.Member;
import com.bytedance.ee.bear.middleground.permission.util.ToCUtil;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.util.p702e.C13657b;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.C20923c;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.component.universe_design.image.UDAvatar;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.g */
public class C9884g extends BaseQuickAdapter<UserInfo, C9888b> {

    /* renamed from: a */
    public Context f26735a;

    /* renamed from: b */
    public List<UserInfo> f26736b = new ArrayList();

    /* renamed from: c */
    public InviteMemberParams f26737c = new InviteMemberParams();

    /* renamed from: d */
    private Locale f26738d;

    /* renamed from: e */
    private AccountService.Account f26739e;

    /* renamed from: f */
    private List<UserInfo> f26740f = new ArrayList();

    /* renamed from: g */
    private List<Member> f26741g = new ArrayList();

    /* renamed from: h */
    private AbstractC9887a f26742h;

    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.g$a */
    public interface AbstractC9887a {
        /* renamed from: a */
        void mo37487a(C9888b bVar, UserInfo userInfo, boolean z);

        /* renamed from: a */
        void mo37488a(UserInfo userInfo);
    }

    /* renamed from: a */
    public void mo37641a(AbstractC9887a aVar) {
        this.f26742h = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C9888b mo37650d(View view) {
        return new C9888b(view);
    }

    /* renamed from: e */
    public void mo37652e(List<Member> list) {
        if (C13657b.m55423b(list)) {
            this.f26741g.addAll(list);
        }
    }

    /* renamed from: d */
    private boolean m41099d(UserInfo userInfo) {
        if (this.f26739e == null || !TextUtils.equals(userInfo.getId(), this.f26739e.f14584a)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private boolean m41100e(UserInfo userInfo) {
        if (userInfo.getId() == null || !TextUtils.equals(userInfo.getId(), this.f26737c.mo36836c())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo37644a(UserInfo userInfo) {
        if (!this.f26736b.contains(userInfo)) {
            this.f26736b.add(userInfo);
            notifyDataSetChanged();
        }
    }

    /* renamed from: b */
    public void mo37646b(UserInfo userInfo) {
        this.f26736b.remove(userInfo);
        if (this.f51214t.contains(userInfo)) {
            notifyDataSetChanged();
        }
    }

    /* renamed from: c */
    public void mo37649c(List<UserInfo> list) {
        if (list != null && list.size() > 0) {
            mo70673b().addAll(list);
            notifyDataSetChanged();
        }
    }

    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.g$b */
    public static class C9888b extends C20923c {

        /* renamed from: a */
        public UDAvatar f26747a;

        /* renamed from: b */
        public CustomTitleView f26748b;

        /* renamed from: c */
        public TextView f26749c;

        /* renamed from: d */
        public UDCheckBox f26750d;

        C9888b(View view) {
            super(view);
            this.f26747a = (UDAvatar) view.findViewById(R.id.share_item_icon);
            this.f26748b = (CustomTitleView) view.findViewById(R.id.share_item_name);
            this.f26749c = (TextView) view.findViewById(R.id.share_item_subtitle);
            this.f26750d = (UDCheckBox) view.findViewById(R.id.share_checkbox);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo37653a(boolean z, boolean z2) {
            float f;
            float f2;
            float f3;
            float f4 = 0.3f;
            if (z2) {
                this.f26748b.setAlpha(0.3f);
                this.f26747a.setAlpha(0.3f);
                this.f26749c.setAlpha(0.3f);
                this.f26750d.setAlpha(0.3f);
                return;
            }
            this.itemView.setEnabled(z);
            CustomTitleView customTitleView = this.f26748b;
            if (z) {
                f = 1.0f;
            } else {
                f = 0.3f;
            }
            customTitleView.setAlpha(f);
            UDAvatar uDAvatar = this.f26747a;
            if (z) {
                f2 = 1.0f;
            } else {
                f2 = 0.3f;
            }
            uDAvatar.setAlpha(f2);
            TextView textView = this.f26749c;
            if (z) {
                f3 = 1.0f;
            } else {
                f3 = 0.3f;
            }
            textView.setAlpha(f3);
            UDCheckBox uDCheckBox = this.f26750d;
            if (z) {
                f4 = 1.0f;
            }
            uDCheckBox.setAlpha(f4);
        }
    }

    /* renamed from: b */
    public void mo37647b(List<UserInfo> list) {
        if (!list.isEmpty()) {
            for (UserInfo userInfo : list) {
                if (!this.f26736b.contains(userInfo)) {
                    this.f26736b.add(userInfo);
                }
            }
            notifyDataSetChanged();
        }
    }

    /* renamed from: d */
    public void mo37651d(List<Member> list) {
        this.f26741g.clear();
        if (C13657b.m55423b(list)) {
            this.f26741g.addAll(list);
        }
    }

    /* renamed from: c */
    private boolean m41098c(UserInfo userInfo) {
        if (this.f26737c.mo36845i()) {
            return false;
        }
        if ((this.f26739e != null && TextUtils.equals(userInfo.getId(), this.f26739e.f14584a)) || this.f26740f.contains(userInfo)) {
            return true;
        }
        for (Member member : this.f26741g) {
            if (TextUtils.equals(userInfo.getId(), member.getMemberId())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo37645a(List<UserInfo> list) {
        this.f26740f.clear();
        if (list != null && list.size() > 0) {
            this.f26740f.addAll(list);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16806a(final C9888b bVar, final UserInfo userInfo) {
        boolean z;
        int i;
        boolean z2;
        boolean z3;
        bVar.itemView.setAlpha(1.0f);
        bVar.itemView.setOnClickListener(null);
        AvatarLoadHelper aVar = AvatarLoadHelper.f25748a;
        AvatarLoadHelper.m39732a(bVar.f26747a, userInfo);
        bVar.f26748b.setTitle(userInfo.getDisplayName(this.f26738d));
        CustomTitleView customTitleView = bVar.f26748b;
        if (!userInfo.isExternal() || !ToCUtil.f26828a.mo37759a(this.f26739e)) {
            z = false;
        } else {
            z = true;
        }
        customTitleView.setExternalVisible(z);
        TextView textView = bVar.f26749c;
        if (TextUtils.isEmpty(userInfo.getDisplayLabel())) {
            i = 8;
        } else {
            i = 0;
        }
        textView.setVisibility(i);
        bVar.f26749c.setText(userInfo.getDisplayLabel());
        UDCheckBox uDCheckBox = bVar.f26750d;
        if (this.f26736b.contains(userInfo) || m41098c(userInfo)) {
            z2 = true;
        } else {
            z2 = false;
        }
        uDCheckBox.setChecked(z2);
        bVar.itemView.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.middleground.permission.collaborator.search.C9884g.C98851 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                C9884g.this.mo37643a(bVar, userInfo, !C9884g.this.f26736b.contains(userInfo));
            }
        });
        if (m41099d(userInfo) || m41100e(userInfo) || m41098c(userInfo)) {
            z3 = false;
        } else {
            z3 = true;
        }
        bVar.mo37653a(z3, userInfo.isBlock());
        if (userInfo.isExternal() && !this.f26737c.mo36842g()) {
            bVar.itemView.setAlpha(0.3f);
            bVar.itemView.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
                /* class com.bytedance.ee.bear.middleground.permission.collaborator.search.C9884g.C98862 */

                /* access modifiers changed from: protected */
                @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
                /* renamed from: a */
                public void mo16698a(View view) {
                    int i;
                    if (C9884g.this.f26737c.mo36843h() && C9884g.this.f26737c.mo36848l() && !PermFGUtils.m39534c()) {
                        Toast.showText(C9884g.this.f26735a, (int) R.string.CreationMobile_Wiki_Permission_CannotShareExternally_Toast);
                    } else if (C9884g.this.f26737c.mo36846j()) {
                        if (C9884g.this.f26737c.mo36835b() == C8275a.f22370c.mo32555b()) {
                            i = R.string.CreationMobile_ECM_ExternalShare_Enable_folder_toast;
                        } else {
                            i = R.string.CreationMobile_ECM_ExternalShare_Enable_toast;
                        }
                        Toast.showText(C9884g.this.f26735a, i);
                    } else {
                        Toast.showText(C9884g.this.f26735a, (int) R.string.CreationMobile_ECM_ISVpermission_cannotadd);
                    }
                }
            });
        }
        if (userInfo.getOwnerType() != 2 || userInfo.getUserCount() <= 0) {
            bVar.f26748b.mo30199a(false, "");
            return;
        }
        CustomTitleView customTitleView2 = bVar.f26748b;
        customTitleView2.mo30199a(true, "(" + userInfo.getUserCount() + ")");
    }

    /* renamed from: a */
    public void mo37643a(C9888b bVar, UserInfo userInfo, boolean z) {
        if (!z || !userInfo.isBlock()) {
            bVar.f26750d.setChecked(z);
            if (z) {
                this.f26736b.add(userInfo);
            } else {
                this.f26736b.remove(userInfo);
            }
            AbstractC9887a aVar = this.f26742h;
            if (aVar != null) {
                aVar.mo37487a(bVar, userInfo, z);
                return;
            }
            return;
        }
        AbstractC9887a aVar2 = this.f26742h;
        if (aVar2 != null) {
            aVar2.mo37488a(userInfo);
        }
    }

    public C9884g(Context context, Locale locale, AccountService.Account account, InviteMemberParams inviteMemberParams) {
        super((int) R.layout.share_search_user_result_item);
        this.f26735a = context;
        this.f26738d = locale;
        this.f26739e = account;
        this.f26737c = inviteMemberParams;
    }
}
