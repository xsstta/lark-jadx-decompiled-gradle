package com.ss.android.lark.mail.impl.message.template;

import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.entity.MailCalendar;
import com.ss.android.lark.mail.impl.utils.C43819s;

/* renamed from: com.ss.android.lark.mail.impl.message.template.m */
public class C43063m extends AbstractC43031a<MailCalendar> {
    /* renamed from: b */
    private String m171244b(MailCalendar mailCalendar) {
        if (mailCalendar.mo151282o()) {
            return C43819s.m173684a((int) R.string.Mail_Calendar_SelfDeleteEvent);
        }
        return "";
    }

    /* renamed from: a */
    public String mo154242a(final MailCalendar mailCalendar) {
        StringBuilder sb = new StringBuilder();
        mo154210a(sb, mo154209a("calendar-card-removed"), new AbstractC43088y() {
            /* class com.ss.android.lark.mail.impl.message.template.C43063m.C430641 */

            @Override // com.ss.android.lark.mail.impl.message.template.AbstractC43088y
            /* renamed from: a */
            public String mo154220a(String str) {
                return C43063m.this.mo154243a(str, mailCalendar);
            }
        });
        return sb.toString();
    }

    /* renamed from: a */
    public String mo154243a(String str, MailCalendar mailCalendar) {
        StringBuilder sb = new StringBuilder();
        str.hashCode();
        if (str.equals("calender-feedback-state")) {
            sb.append(m171244b(mailCalendar));
        }
        return sb.toString();
    }
}
