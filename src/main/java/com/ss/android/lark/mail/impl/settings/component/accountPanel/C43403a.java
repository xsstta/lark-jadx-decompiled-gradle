package com.ss.android.lark.mail.impl.settings.component.accountPanel;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LifecycleOwner;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.entity.C42087a;
import com.ss.android.lark.mail.impl.entity.C42088b;
import com.ss.android.lark.mail.impl.entity.UserType;
import com.ss.android.lark.mail.impl.service.C43350d;
import com.ss.android.lark.mail.impl.settings.component.accountPanel.AccountSettingViewHolder;
import com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel;
import com.ss.android.lark.mail.impl.utils.C43819s;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.settings.component.accountPanel.a */
public class C43403a {

    /* renamed from: a */
    protected Context f110295a;

    /* renamed from: b */
    protected LifecycleOwner f110296b;

    /* renamed from: c */
    protected View f110297c;

    /* renamed from: d */
    protected LinearLayout f110298d;

    /* renamed from: e */
    protected TextView f110299e;

    /* renamed from: f */
    protected View f110300f;

    /* renamed from: g */
    protected C1177w<C42088b> f110301g;

    /* renamed from: h */
    protected AbstractC1178x f110302h;

    /* renamed from: a */
    public void mo155185a() {
        AbstractC1178x<? super C42088b> xVar;
        this.f110295a = null;
        this.f110297c = null;
        C1177w<C42088b> wVar = this.f110301g;
        if (wVar != null && (xVar = this.f110302h) != null) {
            wVar.mo5928b(xVar);
        }
    }

    /* renamed from: b */
    public View mo155188b() {
        if (this.f110297c == null) {
            LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(this.f110295a).inflate(R.layout.mail_view_setting_account_panel, (ViewGroup) null);
            this.f110297c = linearLayout;
            this.f110298d = (LinearLayout) linearLayout.findViewById(R.id.mail_setting_account_list);
            this.f110299e = (TextView) linearLayout.findViewById(R.id.mail_setting_account_panel_tips);
            this.f110300f = linearLayout.findViewById(R.id.mail_setting_item_blank);
        }
        return this.f110297c;
    }

    /* renamed from: a */
    public void mo155186a(Context context) {
        this.f110295a = context;
        this.f110297c = mo155188b();
        if (this.f110301g != null) {
            C434041 r3 = new AbstractC1178x<C42088b>() {
                /* class com.ss.android.lark.mail.impl.settings.component.accountPanel.C43403a.C434041 */

                /* renamed from: a */
                public void onChanged(C42088b bVar) {
                    if (bVar != null) {
                        C43403a.this.mo155187a(bVar.mo151820b());
                    } else {
                        C43403a.this.mo155187a((List<C42087a>) null);
                    }
                }
            };
            this.f110302h = r3;
            this.f110301g.mo5923a(this.f110296b, r3);
            return;
        }
        mo155187a((List<C42087a>) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo155187a(List<C42087a> list) {
        int i;
        boolean z;
        C42087a aVar;
        int i2;
        mo155188b();
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        if (i > 1) {
            this.f110299e.setText(C43819s.m173684a((int) R.string.Mail_Mailbox_PublicMailboxSettingSync));
            this.f110299e.setVisibility(0);
            this.f110300f.setVisibility(8);
        } else {
            if (i == 0) {
                aVar = null;
            } else {
                aVar = list.get(0);
            }
            if (aVar == null || !C43350d.m172099a(aVar.mo151808a()).mo155018J()) {
                this.f110299e.setVisibility(8);
                this.f110300f.setVisibility(0);
            } else {
                TextView textView = this.f110299e;
                if (aVar.mo151815f() == UserType.EXCHANGE_CLIENT) {
                    i2 = R.string.Mail_Outlook_OperationWillSynchronizedToOutlook;
                } else {
                    i2 = R.string.Mail_Client_AccountTip;
                }
                textView.setText(C43819s.m173690b(i2));
                this.f110299e.setVisibility(0);
                this.f110300f.setVisibility(8);
            }
        }
        this.f110298d.removeAllViews();
        for (int i3 = 0; i3 < i; i3++) {
            AccountSettingViewHolder accountSettingViewHolder = new AccountSettingViewHolder(this.f110298d, this.f110295a);
            C42087a aVar2 = list.get(i3);
            if (i > 1) {
                z = true;
            } else {
                z = false;
            }
            accountSettingViewHolder.mo155182a(aVar2, z);
            if (i == 1) {
                accountSettingViewHolder.mo155183a(AccountSettingViewHolder.DividerStyle.None);
                AbsSettingItemViewModel.m172345a(accountSettingViewHolder.f110286a, AbsSettingItemViewModel.ItemBackgroundType.CIRCLE);
            } else if (i3 == 0) {
                accountSettingViewHolder.mo155183a(AccountSettingViewHolder.DividerStyle.LeftIndent);
                AbsSettingItemViewModel.m172345a(accountSettingViewHolder.f110286a, AbsSettingItemViewModel.ItemBackgroundType.TOP_CIRCLE);
            } else if (i3 == i - 1) {
                accountSettingViewHolder.mo155183a(AccountSettingViewHolder.DividerStyle.None);
                AbsSettingItemViewModel.m172345a(accountSettingViewHolder.f110286a, AbsSettingItemViewModel.ItemBackgroundType.BOTTOM_CIRCLE);
            } else {
                accountSettingViewHolder.mo155183a(AccountSettingViewHolder.DividerStyle.LeftIndent);
                AbsSettingItemViewModel.m172345a(accountSettingViewHolder.f110286a, AbsSettingItemViewModel.ItemBackgroundType.SQUARE);
            }
            this.f110298d.addView(accountSettingViewHolder.f110286a);
        }
    }

    public C43403a(LifecycleOwner lifecycleOwner, C1177w<C42088b> wVar) {
        this.f110296b = lifecycleOwner;
        this.f110301g = wVar;
    }
}
