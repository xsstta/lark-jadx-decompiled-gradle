package com.ss.android.lark.mail.impl.message.template;

import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.entity.MailAttachment;
import com.ss.android.lark.mail.impl.entity.MailMessage;
import com.ss.android.lark.mail.impl.utils.C43819s;

/* renamed from: com.ss.android.lark.mail.impl.message.template.d */
public class C43042d extends AbstractC43031a<MailMessage> {
    /* renamed from: a */
    public String mo154221a(final MailMessage mailMessage) {
        StringBuilder sb = new StringBuilder();
        mo154210a(sb, mo154209a("attachment"), new AbstractC43088y() {
            /* class com.ss.android.lark.mail.impl.message.template.C43042d.C430431 */

            @Override // com.ss.android.lark.mail.impl.message.template.AbstractC43088y
            /* renamed from: a */
            public String mo154220a(String str) {
                return C43042d.this.mo154222a(str, mailMessage);
            }
        });
        return sb.toString();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public String mo154222a(String str, MailMessage mailMessage) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1788087493:
                if (str.equals("attachment_show_more")) {
                    c = 0;
                    break;
                }
                break;
            case -775957366:
                if (str.equals("attachment_summary")) {
                    c = 1;
                    break;
                }
                break;
            case -673231302:
                if (str.equals("attachment_list")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return C43819s.m173684a((int) R.string.Mail_Attachment_ShowMore);
            case 1:
                return new C43044e().mo154223a(mailMessage);
            case 2:
                if (mailMessage.mo151622v()) {
                    StringBuilder sb = new StringBuilder();
                    C43040c cVar = new C43040c();
                    cVar.mo154219a(mailMessage.mo151625x());
                    for (MailAttachment mailAttachment : mailMessage.mo151610j()) {
                        sb.append(cVar.mo154217a(mailAttachment));
                    }
                    return sb.toString();
                }
                break;
        }
        return "";
    }
}
