package com.ss.android.lark.chatsetting.impl.group.share;

import android.content.Context;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import butterknife.BindView;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chatsetting.ChatSettingModule;
import com.ss.android.lark.chatsetting.dto.ChatLinkTokenResponse;
import com.ss.android.lark.chatsetting.impl.C34501a;
import com.ss.android.lark.chatsetting.impl.group.GroupShareUtil;
import com.ss.android.lark.chatsetting.impl.group.share.C35006i;
import com.ss.android.lark.chatsetting.impl.statistics.ChatSettingExtraParams;
import com.ss.android.lark.chatsetting.impl.statistics.ChatSettingHitPointNew;
import com.ss.android.lark.chatsetting.impl.statistics.group.GroupHitPoint;
import com.ss.android.lark.chatsetting.p1693a.AbstractC34461c;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.statistics.extensions.IParam;
import com.ss.android.lark.statistics.extensions.TARGET_NONE;
import com.ss.android.lark.ui.RotateLoadingView;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;

public class GroupShareLinkView implements C35006i.AbstractC35008b {

    /* renamed from: f */
    private static final int f90276f = UIHelper.dp2px(48.0f);

    /* renamed from: a */
    public final Context f90277a;

    /* renamed from: b */
    public C35006i.AbstractC35008b.AbstractC35009a f90278b;

    /* renamed from: c */
    public String f90279c;

    /* renamed from: d */
    public final boolean f90280d;

    /* renamed from: e */
    public final AbstractC34461c.AbstractC34483v f90281e = ChatSettingModule.m133639a().mo127285o();

    /* renamed from: g */
    private final AbstractC34981a f90282g;

    /* renamed from: h */
    private final AbstractC34461c.AbstractC34474m f90283h = ChatSettingModule.m133639a().mo127279i();
    @BindView(6762)
    TextView mContentEmptyTipTV;
    @BindView(6760)
    View mContentEmptyView;
    @BindView(6766)
    TextView mContentRetryTipTV;
    @BindView(6751)
    View mContentView;
    @BindView(7627)
    TextView mGroupAddTipTV;
    @BindView(6748)
    LKUIRoundedImageView mGroupAvatarIV;
    @BindView(6754)
    TextView mGroupDescTV;
    @BindView(7434)
    TextView mGroupModifyShareCardValidityPeriod;
    @BindView(6769)
    TextView mGroupTitleTV;
    @BindView(6791)
    TextView mLeftActionBtn;
    @BindView(6767)
    RotateLoadingView mLoadingView;
    @BindView(6792)
    TextView mRightActionBtn;
    @BindView(6752)
    TextView mTokenLinkTV;
    @BindView(6753)
    TextView mTokenValidDateTV;

    /* renamed from: com.ss.android.lark.chatsetting.impl.group.share.GroupShareLinkView$a */
    public interface AbstractC34981a {
        /* renamed from: a */
        void mo128941a(GroupShareLinkView groupShareLinkView);

        /* renamed from: a */
        void mo128942a(String str);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f90282g.mo128941a(this);
        m136212a();
        ChatSettingHitPointNew.m136645j();
    }

    /* renamed from: a */
    private void m136212a() {
        this.mLeftActionBtn.setText(R.string.Lark_Chat_Copy);
        this.mRightActionBtn.setText(R.string.Lark_Legacy_QrCodeShare);
        this.mLeftActionBtn.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.chatsetting.impl.group.share.GroupShareLinkView.C349771 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                GroupHitPoint.f90519a.mo129214a("copy", GroupShareLinkView.this.f90280d, GroupShareLinkView.this.f90278b.mo128982a());
                if (GroupShareLinkView.this.f90278b.mo128983b()) {
                    GroupHitPoint.f90519a.mo129207a(3, 1);
                }
                ChatSettingExtraParams.Click click = ChatSettingExtraParams.Click.COPY;
                GroupShareLinkView groupShareLinkView = GroupShareLinkView.this;
                ChatSettingHitPointNew.m136650l(click.plus(groupShareLinkView.mo128943a(groupShareLinkView.f90278b.mo128986e())).plus(TARGET_NONE.f135700a));
                GroupHitPoint.f90519a.mo129219b(GroupShareLinkView.this.f90278b.mo128985d(), GroupShareLinkView.this.f90278b.mo128987f(), GroupShareLinkView.this.f90278b.mo128986e());
                C34501a.m133932a(GroupShareLinkView.this.f90277a, GroupShareLinkView.this.mTokenLinkTV.getText().toString());
            }
        });
        this.mRightActionBtn.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.chatsetting.impl.group.share.GroupShareLinkView.C349782 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                GroupHitPoint.f90519a.mo129214a("share", GroupShareLinkView.this.f90280d, GroupShareLinkView.this.f90278b.mo128982a());
                final boolean b = GroupShareLinkView.this.f90278b.mo128983b();
                if (b) {
                    GroupHitPoint.f90519a.mo129207a(3, 2);
                }
                ChatSettingExtraParams.Click click = ChatSettingExtraParams.Click.SHARE;
                ChatSettingExtraParams.Target target = ChatSettingExtraParams.Target.IM_GROUP_QR_SHARE_TO_VIEW;
                GroupShareLinkView groupShareLinkView = GroupShareLinkView.this;
                ChatSettingHitPointNew.m136650l(click.plus(groupShareLinkView.mo128943a(groupShareLinkView.f90278b.mo128986e())).plus(target));
                GroupHitPoint.f90519a.mo129225c(GroupShareLinkView.this.f90278b.mo128985d(), GroupShareLinkView.this.f90278b.mo128987f(), GroupShareLinkView.this.f90278b.mo128986e());
                GroupShareLinkView.this.f90281e.mo127440a(GroupShareLinkView.this.f90277a, UIUtils.getString(GroupShareLinkView.this.f90277a, R.string.Lark_UserGrowth_InvitePeopleContactsShareLinkTitle), GroupShareLinkView.this.mTokenLinkTV.getText().toString(), GroupShareLinkView.this.f90279c, new IGetDataCallback<String>() {
                    /* class com.ss.android.lark.chatsetting.impl.group.share.GroupShareLinkView.C349782.C349791 */

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        if (errorResult.getErrorCode() == 101) {
                            LKUIToast.show(GroupShareLinkView.this.f90277a, (int) R.string.Lark_UserGrowth_InvitePeopleContactsShareNotInstalled);
                        }
                    }

                    /* renamed from: a */
                    public void onSuccess(String str) {
                        if ("wechat_session".equals(str)) {
                            GroupHitPoint.f90519a.mo129240f(GroupShareLinkView.this.f90278b.mo128982a());
                        }
                        GroupHitPoint.f90519a.mo129228c(str, GroupShareLinkView.this.f90278b.mo128982a());
                        if (b) {
                            GroupHitPoint.f90519a.mo129216a(false, str);
                        }
                    }
                });
            }
        });
        m136213a(false);
        if (DesktopUtil.m144307b()) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.mContentEmptyView.getLayoutParams();
            layoutParams.height = 466;
            this.mContentEmptyView.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: a */
    public void setViewDelegate(C35006i.AbstractC35008b.AbstractC35009a aVar) {
        this.f90278b = aVar;
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.share.C35006i.AbstractC35008b
    /* renamed from: b */
    public void mo128949b(String str) {
        this.f90282g.mo128942a(str);
    }

    /* renamed from: a */
    private void m136213a(boolean z) {
        this.mLeftActionBtn.setEnabled(z);
        this.mRightActionBtn.setEnabled(z);
    }

    /* renamed from: a */
    public IParam mo128943a(int i) {
        if (i == 0) {
            return ChatSettingExtraParams.ValidPeriod.WITHIN_7_DAYS;
        }
        if (i == 1) {
            return ChatSettingExtraParams.ValidPeriod.WITHIN_1_YEARS;
        }
        if (i != 2) {
            return ChatSettingExtraParams.ValidPeriod.WITHIN_7_DAYS;
        }
        return ChatSettingExtraParams.ValidPeriod.PERMANENT;
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.share.C35006i.AbstractC35008b
    /* renamed from: a */
    public void mo128944a(Chat chat) {
        String str;
        String name = chat.getName();
        if (!TextUtils.isEmpty(name)) {
            this.mGroupTitleTV.setText(name);
            this.mGroupTitleTV.setVisibility(0);
        } else {
            this.mGroupTitleTV.setVisibility(8);
        }
        if (chat.isCrossTenant()) {
            this.mGroupDescTV.setVisibility(8);
        } else {
            this.mGroupDescTV.setText(ChatSettingModule.m133639a().mo127277g().mo127414b());
            this.mGroupDescTV.setVisibility(0);
        }
        if (!chat.isCrossTenant()) {
            String b = ChatSettingModule.m133639a().mo127277g().mo127414b();
            if (chat.isThread()) {
                str = UIHelper.mustacheFormat((int) R.string.Lark_Groups_CircleQRCodeOrLinkInternalOnly, "company_name", b);
            } else {
                str = UIHelper.mustacheFormat((int) R.string.Lark_Chat_ShareLinkInternalChat, "company_name", b);
            }
            this.mGroupAddTipTV.setText(str);
        } else if (!chat.isEdu()) {
            this.mGroupAddTipTV.setText("");
            this.mGroupAddTipTV.setVisibility(8);
        }
        AbstractC34461c.AbstractC34474m mVar = this.f90283h;
        Context context = this.f90277a;
        String avatarKey = chat.getAvatarKey();
        String id = chat.getId();
        LKUIRoundedImageView lKUIRoundedImageView = this.mGroupAvatarIV;
        int i = f90276f;
        mVar.mo127409a(context, avatarKey, id, lKUIRoundedImageView, i, i);
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.share.C35006i.AbstractC35008b
    /* renamed from: a */
    public void mo128947a(String str) {
        String mustacheFormat = UIHelper.mustacheFormat((int) R.string.Lark_Education_NeedApprovalToJoinGroup, "ClassName", str);
        this.mGroupAddTipTV.setVisibility(0);
        this.mGroupAddTipTV.setText(mustacheFormat);
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.share.C35006i.AbstractC35008b
    /* renamed from: a */
    public void mo128945a(ChatLinkTokenResponse chatLinkTokenResponse, int i) {
        m136213a(true);
        this.mContentView.setVisibility(0);
        this.mTokenLinkTV.setText(chatLinkTokenResponse.getDisplayContent());
        if (GroupShareUtil.m134454a()) {
            String mustacheFormat = UIHelper.mustacheFormat((int) R.string.Lark_Group_LinkValidity, "option", GroupShareUtil.m134455b(i));
            this.mGroupModifyShareCardValidityPeriod.setText(GroupShareUtil.m134453a(this.mGroupModifyShareCardValidityPeriod, "", UIHelper.getString(R.string.Lark_Group_ChangeQRcodeValidity), new View.OnClickListener() {
                /* class com.ss.android.lark.chatsetting.impl.group.share.GroupShareLinkView.View$OnClickListenerC349803 */

                public void onClick(View view) {
                    GroupShareLinkView.this.f90278b.mo128984c();
                }
            }));
            this.mGroupModifyShareCardValidityPeriod.setMovementMethod(LinkMovementMethod.getInstance());
            this.mTokenValidDateTV.setText(mustacheFormat);
        } else {
            this.mTokenValidDateTV.setText(C34501a.m133929a(UIUtils.getString(this.f90277a, R.string.Lark_Chat_LinkExpiration), "expiration_date", chatLinkTokenResponse.getExpireTime()));
        }
        this.f90279c = chatLinkTokenResponse.getSharedUrl();
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.share.C35006i.AbstractC35008b
    /* renamed from: a */
    public void mo128948a(boolean z, boolean z2) {
        int i;
        int i2;
        RotateLoadingView rotateLoadingView = this.mLoadingView;
        int i3 = 0;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        rotateLoadingView.setVisibility(i);
        View view = this.mContentView;
        if (z || z2) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        view.setVisibility(i2);
        View view2 = this.mContentEmptyView;
        if (z || !z2) {
            i3 = 8;
        }
        view2.setVisibility(i3);
    }

    public GroupShareLinkView(Context context, AbstractC34981a aVar, boolean z) {
        this.f90277a = context;
        this.f90282g = aVar;
        this.f90280d = z;
    }
}
