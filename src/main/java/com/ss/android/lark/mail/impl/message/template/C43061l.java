package com.ss.android.lark.mail.impl.message.template;

import com.ss.android.lark.mail.impl.entity.MailCalendar;
import com.ss.android.lark.mail.impl.utils.C43760c;

/* renamed from: com.ss.android.lark.mail.impl.message.template.l */
public class C43061l extends AbstractC43031a<MailCalendar> {
    /* renamed from: a */
    public String mo154240a(final MailCalendar mailCalendar) {
        StringBuilder sb = new StringBuilder();
        mo154210a(sb, mo154209a("calendar-card-notfound"), new AbstractC43088y() {
            /* class com.ss.android.lark.mail.impl.message.template.C43061l.C430621 */

            @Override // com.ss.android.lark.mail.impl.message.template.AbstractC43088y
            /* renamed from: a */
            public String mo154220a(String str) {
                return C43061l.this.mo154241a(str, mailCalendar);
            }
        });
        return sb.toString();
    }

    /* renamed from: a */
    public String mo154241a(String str, MailCalendar mailCalendar) {
        StringBuilder sb = new StringBuilder();
        str.hashCode();
        if (str.equals("calender-action-time") && mailCalendar.mo151275h() != null) {
            sb.append(C43760c.m173463a(mailCalendar.mo151275h().mo151434a() * 1000, mailCalendar.mo151275h().mo151442b() * 1000, mailCalendar.mo151275h().mo151449c()));
        }
        return sb.toString();
    }
}
