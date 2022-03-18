package com.ss.android.lark.mail.impl.message.template;

import com.larksuite.framework.utils.C26311p;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.entity.MailMessage;
import com.ss.android.lark.mail.impl.utils.C43819s;

/* renamed from: com.ss.android.lark.mail.impl.message.template.e */
public class C43044e extends AbstractC43031a<MailMessage> {
    /* renamed from: a */
    public String mo154223a(final MailMessage mailMessage) {
        StringBuilder sb = new StringBuilder();
        mo154210a(sb, mo154209a("attachment_summary"), new AbstractC43088y() {
            /* class com.ss.android.lark.mail.impl.message.template.C43044e.C430451 */

            @Override // com.ss.android.lark.mail.impl.message.template.AbstractC43088y
            /* renamed from: a */
            public String mo154220a(String str) {
                return C43044e.this.mo154224a(str, mailMessage);
            }
        });
        return sb.toString();
    }

    /* renamed from: a */
    public String mo154224a(String str, MailMessage mailMessage) {
        str.hashCode();
        if (str.equals("attachment_summary_value")) {
            return C26311p.m95277b(mailMessage.mo151626y().longValue());
        }
        if (!str.equals("attachment_count")) {
            return "";
        }
        return C43819s.m173685a((int) R.plurals.Mail_Attachment_Count, mailMessage.mo151625x());
    }
}
