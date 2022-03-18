package com.ss.android.lark.mail.impl.message.template;

import android.text.TextUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.entity.MailMessage;
import com.ss.android.lark.mail.impl.message.recall.sender.C42984a;
import com.ss.android.lark.mail.impl.p2171h.C42330c;
import com.ss.android.lark.mail.impl.utils.C43819s;

/* renamed from: com.ss.android.lark.mail.impl.message.template.s */
public class C43077s extends AbstractC43031a<MailMessage> {

    /* renamed from: a */
    private String f109628a;

    /* renamed from: b */
    private String f109629b;

    /* renamed from: a */
    public boolean mo154259a() {
        return "0".equals(this.f109629b);
    }

    /* renamed from: b */
    private void m171272b(MailMessage mailMessage) {
        String str;
        if (TextUtils.isEmpty(this.f109628a)) {
            if (mailMessage.mo151551D() == null) {
                str = C43819s.m173684a((int) R.string.Mail_Recall_BannerRecalled);
            } else {
                str = C42984a.m171086a().mo154139b(mailMessage.mo151551D().mo151640a());
            }
            this.f109628a = mo154209a("recall_message_banner").replace("$recalling_text$", C43819s.m173684a((int) R.string.Mail_Recall_BannerRecalling)).replace("$completed_text$", str).replace("$button_detail$", C43819s.m173684a((int) R.string.Mail_Recall_Details));
        }
    }

    /* renamed from: a */
    public String mo154258a(MailMessage mailMessage) {
        String str;
        String str2;
        String str3;
        String str4;
        if (!C42984a.m171086a().mo154142d(mailMessage)) {
            return "";
        }
        m171272b(mailMessage);
        boolean a = C42984a.m171086a().mo154138a(mailMessage);
        boolean c = C42984a.m171086a().mo154141c(mailMessage);
        boolean b = C42984a.m171086a().mo154140b(mailMessage);
        String str5 = this.f109628a;
        if (a || c || b) {
            str = "showRecallBanner";
        } else {
            str = "";
        }
        String replace = str5.replace("$showRecallBanner$", str);
        if (a || c) {
            str2 = "showRecalling";
        } else {
            str2 = "";
        }
        String replace2 = replace.replace("$showRecalling$", str2);
        if (b) {
            str3 = "showRecalled";
        } else {
            str3 = "";
        }
        String replace3 = replace2.replace("$showRecalled$", str3);
        if (c || b) {
            str4 = "showRecallDetail";
        } else {
            str4 = "";
        }
        String replace4 = replace3.replace("$showRecallDetail$", str4);
        if (a) {
            this.f109629b = "1";
        } else if (c) {
            this.f109629b = "2";
        } else if (b) {
            this.f109629b = "3";
        } else {
            this.f109629b = "0";
        }
        if (mailMessage.mo151551D() != null) {
            this.f109629b = mailMessage.mo151551D().mo151640a() + "";
        }
        C42330c.m169075d(this.f109629b);
        return replace4.replace("$recall_state$", this.f109629b);
    }
}
