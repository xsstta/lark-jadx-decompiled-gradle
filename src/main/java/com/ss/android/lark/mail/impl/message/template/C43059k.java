package com.ss.android.lark.mail.impl.message.template;

import com.bytedance.lark.pb.basic.v1.EmailCalendarEventInfo;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.entity.MailCalendar;
import com.ss.android.lark.mail.impl.utils.C43819s;

/* renamed from: com.ss.android.lark.mail.impl.message.template.k */
public class C43059k extends AbstractC43031a<MailCalendar> {
    /* renamed from: a */
    public String mo154238a(final MailCalendar mailCalendar) {
        StringBuilder sb = new StringBuilder();
        mo154210a(sb, mo154209a("calendar-card-invalid"), new AbstractC43088y() {
            /* class com.ss.android.lark.mail.impl.message.template.C43059k.C430601 */

            @Override // com.ss.android.lark.mail.impl.message.template.AbstractC43088y
            /* renamed from: a */
            public String mo154220a(String str) {
                return C43059k.this.mo154239a(str, mailCalendar);
            }
        });
        return sb.toString();
    }

    /* renamed from: a */
    public String mo154239a(String str, MailCalendar mailCalendar) {
        StringBuilder sb = new StringBuilder();
        str.hashCode();
        if (str.equals("calender-invalid-state")) {
            if (mailCalendar.mo151272f() == EmailCalendarEventInfo.CalendarMailMessageType.EVENT_CANCEL) {
                sb.append(C43819s.m173684a((int) R.string.Mail_Calendar_CardCancel));
            } else if (mailCalendar.mo151272f() == EmailCalendarEventInfo.CalendarMailMessageType.EVENT_UPDATE_OUTDATED) {
                if (mailCalendar.mo151280m()) {
                    if (mailCalendar.mo151283p() == EmailCalendarEventInfo.OutdatedType.CANCEL) {
                        sb.append(C43819s.m173684a((int) R.string.Mail_Calendar_CardOutOfDateAndCancel));
                    } else {
                        sb.append(C43819s.m173684a((int) R.string.Mail_Calendar_CardOutOfDate));
                    }
                }
            } else if (mailCalendar.mo151272f() == EmailCalendarEventInfo.CalendarMailMessageType.EVENT_SELF_DELETE) {
                sb.append(C43819s.m173684a((int) R.string.Mail_Calendar_Deleted));
            }
        }
        return sb.toString();
    }
}
