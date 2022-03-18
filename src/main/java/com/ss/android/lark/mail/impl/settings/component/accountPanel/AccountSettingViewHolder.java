package com.ss.android.lark.mail.impl.settings.component.accountPanel;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.larksuite.component.universe_design.tag.UDTagsDrawable;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.entity.C42087a;
import com.ss.android.lark.mail.impl.entity.UserType;
import com.ss.android.lark.mail.impl.home.aggregation.C42409b;
import com.ss.android.lark.mail.impl.p2171h.p2172a.C42209j;
import com.ss.android.lark.mail.impl.p2195i.C42699a;
import com.ss.android.lark.mail.impl.utils.toast.MailToast;
import com.ss.android.lark.mail.impl.widget.MailDefaultAvatarView;
import com.ss.android.lark.utils.UIHelper;

class AccountSettingViewHolder {

    /* renamed from: a */
    protected View f110286a;

    /* renamed from: b */
    protected MailDefaultAvatarView f110287b;

    /* renamed from: c */
    protected TextView f110288c = ((TextView) this.f110286a.findViewById(R.id.setting_account_name_tv));

    /* renamed from: d */
    protected TextView f110289d = ((TextView) this.f110286a.findViewById(R.id.setting_account_address_tv));

    /* renamed from: e */
    protected View f110290e = this.f110286a.findViewById(R.id.setting_account_arrow);

    /* renamed from: f */
    protected View f110291f = this.f110286a.findViewById(R.id.bottom_divider);

    /* renamed from: g */
    private final Context f110292g;

    public enum ActionType {
        NONE,
        ARROW
    }

    public enum DividerStyle {
        None,
        Normal,
        LeftIndent
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.mail.impl.settings.component.accountPanel.AccountSettingViewHolder$2 */
    public static /* synthetic */ class C434022 {

        /* renamed from: a */
        static final /* synthetic */ int[] f110294a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.ss.android.lark.mail.impl.settings.component.accountPanel.AccountSettingViewHolder$DividerStyle[] r0 = com.ss.android.lark.mail.impl.settings.component.accountPanel.AccountSettingViewHolder.DividerStyle.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.mail.impl.settings.component.accountPanel.AccountSettingViewHolder.C434022.f110294a = r0
                com.ss.android.lark.mail.impl.settings.component.accountPanel.AccountSettingViewHolder$DividerStyle r1 = com.ss.android.lark.mail.impl.settings.component.accountPanel.AccountSettingViewHolder.DividerStyle.Normal     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.mail.impl.settings.component.accountPanel.AccountSettingViewHolder.C434022.f110294a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.mail.impl.settings.component.accountPanel.AccountSettingViewHolder$DividerStyle r1 = com.ss.android.lark.mail.impl.settings.component.accountPanel.AccountSettingViewHolder.DividerStyle.LeftIndent     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.mail.impl.settings.component.accountPanel.AccountSettingViewHolder.C434022.f110294a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.mail.impl.settings.component.accountPanel.AccountSettingViewHolder$DividerStyle r1 = com.ss.android.lark.mail.impl.settings.component.accountPanel.AccountSettingViewHolder.DividerStyle.None     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.settings.component.accountPanel.AccountSettingViewHolder.C434022.<clinit>():void");
        }
    }

    /* renamed from: a */
    public void mo155183a(DividerStyle dividerStyle) {
        m172326a(this.f110291f, dividerStyle);
    }

    /* renamed from: a */
    private void m172326a(View view, DividerStyle dividerStyle) {
        int i = C434022.f110294a[dividerStyle.ordinal()];
        if (i == 1) {
            view.setVisibility(0);
            ((ConstraintLayout.LayoutParams) view.getLayoutParams()).leftMargin = 0;
            view.requestLayout();
        } else if (i != 2) {
            view.setVisibility(8);
        } else {
            view.setVisibility(0);
            ((ConstraintLayout.LayoutParams) view.getLayoutParams()).leftMargin = UIHelper.dp2px(60.0f);
            view.requestLayout();
        }
    }

    public AccountSettingViewHolder(ViewGroup viewGroup, Context context) {
        this.f110292g = context;
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mail_setting_account_item, viewGroup, false);
        this.f110286a = inflate;
        this.f110287b = (MailDefaultAvatarView) inflate.findViewById(R.id.setting_account_avatar_iv);
    }

    /* renamed from: a */
    public void mo155182a(C42087a aVar, boolean z) {
        UDTagsDrawable a;
        int i;
        int i2;
        this.f110286a.setTag(aVar);
        ActionType actionType = ActionType.ARROW;
        if (aVar.f107030g == 0 || UserType.GMAIL_API_CLIENT == aVar.mo151815f() || UserType.EXCHANGE_API_CLIENT == aVar.mo151815f()) {
            if (aVar.f107029f) {
                this.f110287b.mo156548a(aVar.mo151808a(), aVar.mo151810b(), aVar.f107027d);
            } else {
                this.f110287b.mo156548a(null, null, aVar.f107027d);
            }
            this.f110287b.setWarningFlag(false);
            this.f110288c.setText(aVar.f107026c);
            this.f110289d.setText(aVar.f107027d);
            C42409b.m169266a(this.f110288c);
            if (z && !aVar.f107029f && (a = C42409b.m169264a(this.f110292g, R.color.udtoken_tag_bg_blue, R.color.udtoken_tag_text_s_blue, UIHelper.getString(R.string.Mail_Mailbox_Public), UIHelper.dp2px(166.0f), -1, UIHelper.dp2px(4.0f), UIHelper.dp2px(18.0f), UIHelper.getDimens(R.dimen.ud_text_caption0))) != null) {
                a.mo91369a(this.f110288c);
            }
            if (!z) {
                actionType = ActionType.NONE;
            }
        } else if (aVar.f107030g == 1) {
            this.f110287b.mo156548a(aVar.mo151808a(), aVar.mo151810b(), aVar.f107027d);
            this.f110287b.setWarningFlag(true);
            this.f110288c.setText(aVar.f107026c);
            this.f110289d.setText(aVar.f107027d);
            C42409b.m169266a(this.f110288c);
            UDTagsDrawable a2 = C42409b.m169264a(this.f110292g, R.color.udtoken_tag_bg_red, R.color.udtoken_tag_text_s_red, UIHelper.getString(R.string.Mail_Mailbox_AccountsExpired), UIHelper.dp2px(166.0f), -1, UIHelper.dp2px(4.0f), UIHelper.dp2px(18.0f), UIHelper.getDimens(R.dimen.ud_text_caption0));
            if (a2 != null) {
                a2.mo91369a(this.f110288c);
            }
            if (!z) {
                actionType = ActionType.NONE;
            }
        } else if (aVar.f107030g == 2) {
            MailDefaultAvatarView mailDefaultAvatarView = this.f110287b;
            if (aVar.mo151815f() == UserType.EXCHANGE_NEW_USER) {
                i = R.drawable.mail_ic_exchange_avatar;
            } else {
                i = R.drawable.mail_ic_google_avatar;
            }
            mailDefaultAvatarView.setAvatar(i);
            this.f110287b.setWarningFlag(true);
            this.f110288c.setText(R.string.Mail_Setting_LinkCorporateEmail);
            TextView textView = this.f110289d;
            if (aVar.mo151815f() == UserType.EXCHANGE_NEW_USER) {
                i2 = R.string.Mail_Outlook_OnlySupportBusinessOutlookAccount;
            } else {
                i2 = R.string.Mail_Setting_LinkCorporateEmailDescription;
            }
            textView.setText(i2);
            C42409b.m169266a(this.f110288c);
        }
        if (actionType == ActionType.ARROW) {
            this.f110290e.setVisibility(0);
            this.f110286a.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.mail.impl.settings.component.accountPanel.AccountSettingViewHolder.View$OnClickListenerC434011 */

                /* access modifiers changed from: private */
                /* renamed from: a */
                public static /* synthetic */ void m172329a() {
                    MailToast.m173697a((int) R.string.Mail_Client_Delinkerror);
                    C42209j.m168612a("mailclient_oauth_access_denied_deleting", "toast");
                }

                public void onClick(View view) {
                    boolean z;
                    C42087a aVar = (C42087a) view.getTag();
                    if (!TextUtils.isEmpty(aVar.f107024a)) {
                        if (aVar.f107030g != 2) {
                            C42699a.m170280d(AccountSettingViewHolder.this.f110286a.getContext(), aVar.f107024a);
                        } else if (aVar.mo151815f() != UserType.EXCHANGE_API_CLIENT && aVar.mo151815f() != UserType.GMAIL_API_CLIENT) {
                            Context context = AccountSettingViewHolder.this.f110286a.getContext();
                            if (aVar.mo151815f() == UserType.EXCHANGE_NEW_USER) {
                                z = true;
                            } else {
                                z = false;
                            }
                            C42699a.m170248a(context, z, $$Lambda$AccountSettingViewHolder$1$hUeVzrBbB2bu_bo5iPgnY7VQwv4.INSTANCE);
                        }
                    }
                }
            });
            return;
        }
        View view = this.f110286a;
        view.setBackgroundColor(view.getResources().getColor(R.color.bg_body));
        this.f110290e.setVisibility(8);
        this.f110286a.setOnClickListener(null);
    }
}
