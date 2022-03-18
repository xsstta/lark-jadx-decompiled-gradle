package com.ss.android.lark.mail.impl.home.p2178a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.universe_design.badge.UDBadgeView;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.entity.UserType;
import com.ss.android.lark.mail.impl.utils.C43761d;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.home.a.a */
public class C42359a extends RecyclerView.Adapter<C42360a> {

    /* renamed from: a */
    private Context f107827a;

    /* renamed from: b */
    private List<C42368d> f107828b = new ArrayList();

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f107828b.size();
    }

    public C42359a(Context context) {
        this.f107827a = context;
    }

    /* renamed from: a */
    public void mo152516a(List<C42368d> list) {
        this.f107828b.clear();
        if (list != null) {
            this.f107828b.addAll(list);
        } else {
            this.f107828b.clear();
        }
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public C42360a onCreateViewHolder(ViewGroup viewGroup, int i) {
        boolean z;
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        return new C42360a(viewGroup, z);
    }

    /* renamed from: a */
    public void onBindViewHolder(C42360a aVar, int i) {
        int i2;
        C42368d dVar = this.f107828b.get(i);
        aVar.itemView.setTag(dVar);
        if (dVar.f107849a.f107028e) {
            aVar.f107829a.setTextColor(C43761d.m173472c(R.color.primary_pri_500));
            aVar.f107832d.setVisibility(0);
        } else {
            aVar.f107829a.setTextColor(C43761d.m173472c(R.color.text_title));
            aVar.f107832d.setVisibility(8);
        }
        if (dVar.f107849a.f107030g == 1) {
            aVar.f107829a.setText(dVar.f107849a.f107027d);
            aVar.f107830b.setVisibility(0);
            aVar.f107830b.setText(UIHelper.getString(R.string.Mail_Mailbox_AccountsExpired));
            m169144a(aVar.f107830b, R.color.udtoken_tag_text_s_red, R.color.udtoken_tag_bg_red);
        } else if (dVar.f107849a.f107030g != 2) {
            aVar.f107829a.setText(dVar.f107849a.f107027d);
            aVar.f107830b.setVisibility(8);
        } else if (UserType.GMAIL_API_CLIENT == dVar.f107849a.mo151815f() || UserType.EXCHANGE_API_CLIENT == dVar.f107849a.mo151815f()) {
            aVar.f107829a.setText(dVar.f107849a.f107027d);
            aVar.f107830b.setVisibility(8);
        } else {
            aVar.f107829a.setText(R.string.Mail_Mailbox_BusinessEmailDidntLink);
            aVar.f107830b.setVisibility(0);
            aVar.f107830b.setText(R.string.Mail_Mailbox_DidntLinkTag);
            m169144a(aVar.f107830b, R.color.udtoken_tag_text_s_red, R.color.udtoken_tag_bg_red);
        }
        if (dVar.f107849a.f107030g != 2) {
            if (dVar.f107850b <= 0 || dVar.f107849a.f107028e) {
                aVar.f107831c.setVisibility(8);
            } else {
                aVar.f107831c.setVisibility(0);
            }
            UDBadgeView uDBadgeView = aVar.f107831c;
            uDBadgeView.setText("" + dVar.f107850b);
            UDBadgeView uDBadgeView2 = aVar.f107831c;
            if (dVar.f107851c) {
                i2 = R.color.function_danger_500;
            } else {
                i2 = R.color.icon_disable;
            }
            uDBadgeView2.setBadgeColorRes(i2);
            aVar.f107831c.mo90238b();
        }
        int dp2px = UIHelper.dp2px(240.0f);
        if (aVar.f107830b.getVisibility() != 0) {
            dp2px += UIHelper.dp2px(40.0f);
        }
        if (aVar.f107831c.getVisibility() != 0) {
            dp2px += UIHelper.dp2px(20.0f);
        }
        aVar.f107829a.setMaxWidth(dp2px);
    }

    /* renamed from: a */
    private void m169144a(TextView textView, int i, int i2) {
        Drawable mutate = textView.getContext().getDrawable(R.drawable.mail_lable_text_bg).mutate();
        if (mutate instanceof GradientDrawable) {
            ((GradientDrawable) mutate).setColor(UIHelper.getColor(i2));
        }
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        textView.setBackground(mutate);
        textView.setTextColor(UIHelper.getColor(i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.mail.impl.home.a.a$a */
    public class C42360a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        TextView f107829a = ((TextView) this.itemView.findViewById(R.id.mail_account_address_tv));

        /* renamed from: b */
        TextView f107830b = ((TextView) this.itemView.findViewById(R.id.mail_account_flag_tv));

        /* renamed from: c */
        UDBadgeView f107831c = ((UDBadgeView) this.itemView.findViewById(R.id.mail_account_unread_count));

        /* renamed from: d */
        ImageView f107832d = ((ImageView) this.itemView.findViewById(R.id.mail_account_chosen_mark));

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C42360a(ViewGroup viewGroup, boolean z) {
            super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mail_account_item, viewGroup, false));
            int i = 0;
            this.itemView.findViewById(R.id.mail_account_list_item_top_divider).setVisibility(!z ? 4 : i);
        }
    }
}
