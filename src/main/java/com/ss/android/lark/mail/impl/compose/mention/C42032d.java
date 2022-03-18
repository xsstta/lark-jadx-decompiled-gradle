package com.ss.android.lark.mail.impl.compose.mention;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lark.pb.email.client.v1.SearchMemberInfo;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.AbstractC41849c;
import com.ss.android.lark.mail.impl.C41816b;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.mail.impl.compose.mention.d */
public class C42032d extends RecyclerView.ViewHolder {

    /* renamed from: a */
    private final String f106662a = "MentionListItemViewHolder";

    /* renamed from: b */
    private Context f106663b;

    /* renamed from: c */
    private TextView f106664c;

    /* renamed from: d */
    private TextView f106665d;

    /* renamed from: e */
    private LKUIRoundedImageView f106666e;

    /* renamed from: f */
    private View f106667f;

    /* renamed from: g */
    private TextAppearanceSpan f106668g;

    /* renamed from: h */
    private int f106669h;

    /* renamed from: a */
    private void m167203a() {
        this.f106669h = this.f106663b.getResources().getDimensionPixelSize(R.dimen.mail_mention_select_list_item_avatar_size);
        LKUIRoundedImageView lKUIRoundedImageView = (LKUIRoundedImageView) this.itemView.findViewById(R.id.mail_mention_select_list_item_avatar);
        this.f106666e = lKUIRoundedImageView;
        lKUIRoundedImageView.setOval(true);
        this.f106664c = (TextView) this.itemView.findViewById(R.id.mail_mention_select_list_item_name);
        this.f106665d = (TextView) this.itemView.findViewById(R.id.mail_mention_select_list_item_description);
        this.f106668g = new TextAppearanceSpan(this.f106663b, R.style.MailMentionListItemEmail);
        this.f106667f = this.itemView.findViewById(R.id.mail_mention_item_divider);
    }

    C42032d(Context context, View view) {
        super(view);
        this.f106663b = context;
        m167203a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo151048a(SearchMemberInfo searchMemberInfo, boolean z) {
        int i;
        if (searchMemberInfo == null) {
            Log.m165383e("MentionListItemViewHolder", "update empty data");
            return;
        }
        AbstractC41849c.AbstractC41861l v = C41816b.m166115a().mo150155v();
        Context context = this.f106663b;
        String str = searchMemberInfo.avatar_key;
        String str2 = searchMemberInfo.user_id;
        LKUIRoundedImageView lKUIRoundedImageView = this.f106666e;
        int i2 = this.f106669h;
        v.mo150206a(context, str, str2, lKUIRoundedImageView, i2, i2);
        if (TextUtils.isEmpty(searchMemberInfo.email_address)) {
            this.f106664c.setText(searchMemberInfo.name);
        } else {
            if (TextUtils.isEmpty(searchMemberInfo.name)) {
                i = 0;
            } else {
                i = searchMemberInfo.name.length();
            }
            String str3 = searchMemberInfo.name + " <" + searchMemberInfo.email_address + ">";
            SpannableString spannableString = new SpannableString(str3);
            spannableString.setSpan(this.f106668g, i, str3.length(), 33);
            this.f106664c.setText(spannableString);
        }
        String str4 = searchMemberInfo.department;
        if (TextUtils.isEmpty(str4)) {
            this.f106665d.setVisibility(8);
            this.f106665d.setText("");
        } else {
            this.f106665d.setVisibility(0);
            this.f106665d.setText(str4);
        }
        if (z) {
            this.f106667f.setVisibility(8);
        } else {
            this.f106667f.setVisibility(0);
        }
    }
}
