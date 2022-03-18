package com.ss.android.lark.mail.impl.message.recall.sender.detail;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lark.pb.email.client.v1.MailGetRecallDetailResponse;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.utils.C43819s;
import com.ss.android.lark.mail.impl.widget.MailDefaultAvatarView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.message.recall.sender.detail.c */
public class C43002c extends RecyclerView.Adapter<C43004a> {

    /* renamed from: a */
    private List<C43001b> f109483a = new ArrayList();

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f109483a.size();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.mail.impl.message.recall.sender.detail.c$1 */
    public static /* synthetic */ class C430031 {

        /* renamed from: a */
        static final /* synthetic */ int[] f109484a;

        /* renamed from: b */
        static final /* synthetic */ int[] f109485b;

        /* JADX WARNING: Can't wrap try/catch for region: R(21:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|24|26) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|24|26) */
        /* JADX WARNING: Can't wrap try/catch for region: R(23:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|24|26) */
        /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0063 */
        static {
            /*
            // Method dump skipped, instructions count: 111
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.message.recall.sender.detail.C43002c.C430031.<clinit>():void");
        }
    }

    /* renamed from: a */
    public void mo154168a(List<C43001b> list) {
        this.f109483a.clear();
        this.f109483a.addAll(list);
        notifyDataSetChanged();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.mail.impl.message.recall.sender.detail.c$a */
    public static class C43004a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        MailDefaultAvatarView f109486a;

        /* renamed from: b */
        TextView f109487b;

        /* renamed from: c */
        ImageView f109488c;

        /* renamed from: d */
        TextView f109489d;

        public C43004a(View view) {
            super(view);
            this.f109486a = (MailDefaultAvatarView) view.findViewById(R.id.mail_recall_avatar_iv);
            this.f109487b = (TextView) view.findViewById(R.id.mail_recall_name_tv);
            this.f109488c = (ImageView) view.findViewById(R.id.mail_recall_status_icon);
            this.f109489d = (TextView) view.findViewById(R.id.mail_recall_status_tv);
        }
    }

    /* renamed from: a */
    public C43004a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C43004a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mail_recall_detail_item, viewGroup, false));
    }

    /* renamed from: a */
    public void onBindViewHolder(C43004a aVar, int i) {
        String str;
        String str2;
        C43001b bVar = this.f109483a.get(i);
        MailGetRecallDetailResponse.Item item = bVar.f109482a;
        if (!TextUtils.isEmpty(item.address.display_name)) {
            str = item.address.display_name;
        } else {
            str = item.address.name;
        }
        SpannableString spannableString = new SpannableString(" <" + item.address.address + ">");
        spannableString.setSpan(new ForegroundColorSpan(aVar.f109487b.getResources().getColor(R.color.text_placeholder)), 0, spannableString.length(), 33);
        aVar.f109487b.setText(new SpannableStringBuilder().append((CharSequence) str).append((CharSequence) spannableString));
        aVar.f109486a.mo156548a(bVar.f109482a.address.lark_entity_id_string, null, bVar.f109482a.address.address);
        int i2 = C430031.f109485b[item.status.ordinal()];
        if (i2 == 1) {
            aVar.f109488c.setImageResource(R.drawable.ud_icon_succeed_colorful);
            aVar.f109489d.setText(R.string.Mail_Recall_StatusSucceed);
        } else if (i2 == 2) {
            aVar.f109488c.setImageResource(R.drawable.mail_recall_recalling_icon);
            aVar.f109489d.setText(R.string.Mail_Recall_StatusRecalling);
        } else if (item.is_mailing_list.booleanValue()) {
            aVar.f109488c.setImageResource(R.drawable.ud_icon_error_colorful);
            TextView textView = aVar.f109489d;
            textView.setText(item.number_of_failure + " " + C43819s.m173684a((int) R.string.Mail_Recall_StatusFailed));
        } else {
            int i3 = C430031.f109484a[item.comment.ordinal()];
            if (i3 == 1) {
                str2 = "";
            } else if (i3 == 2) {
                str2 = C43819s.m173684a((int) R.string.Mail_Recall_FailNotLarkMail);
            } else if (i3 == 3) {
                str2 = C43819s.m173684a((int) R.string.Mail_Recall_FailHasBeenRead);
            } else if (i3 == 4) {
                str2 = C43819s.m173684a((int) R.string.Mail_Recall_FailNotSameTenant);
            } else if (i3 != 5) {
                str2 = C43819s.m173684a((int) R.string.Mail_Recall_FailUnknown);
            } else {
                str2 = C43819s.m173684a((int) R.string.Mail_Recall_FailedAddressDeleted);
            }
            aVar.f109488c.setImageResource(R.drawable.ud_icon_error_colorful);
            TextView textView2 = aVar.f109489d;
            textView2.setText(C43819s.m173684a((int) R.string.Mail_Recall_StatusFailed) + str2);
        }
    }
}
