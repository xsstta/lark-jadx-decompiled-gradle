package com.ss.android.lark.mail.impl.message.template;

import com.bytedance.lark.pb.basic.v1.EmailCalendarEventInfo;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.entity.MailCalendar;
import com.ss.android.lark.mail.impl.entity.MailFullEventInfo;
import com.ss.android.lark.mail.impl.utils.C43819s;

/* renamed from: com.ss.android.lark.mail.impl.message.template.j */
public class C43057j extends AbstractC43031a<MailCalendar> {
    /* renamed from: a */
    public String mo154236a(final MailCalendar mailCalendar) {
        StringBuilder sb = new StringBuilder();
        mo154210a(sb, mo154209a("calendar-card-footer"), new AbstractC43088y() {
            /* class com.ss.android.lark.mail.impl.message.template.C43057j.C430581 */

            @Override // com.ss.android.lark.mail.impl.message.template.AbstractC43088y
            /* renamed from: a */
            public String mo154220a(String str) {
                return C43057j.this.mo154237a(str, mailCalendar.mo151275h());
            }
        });
        return sb.toString();
    }

    /* renamed from: a */
    public String mo154237a(String str, MailFullEventInfo mailFullEventInfo) {
        if (mailFullEventInfo == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1861499835:
                if (str.equals("calendar-accept-tip")) {
                    c = 0;
                    break;
                }
                break;
            case -1342293162:
                if (str.equals("calendar-pending-tip")) {
                    c = 1;
                    break;
                }
                break;
            case -1306600589:
                if (str.equals("calender-action-pending")) {
                    c = 2;
                    break;
                }
                break;
            case -897458210:
                if (str.equals("calendar-refuse-active-tip")) {
                    c = 3;
                    break;
                }
                break;
            case 679946858:
                if (str.equals("calendar-accept-active-tip")) {
                    c = 4;
                    break;
                }
                break;
            case 1050261420:
                if (str.equals("calender-action-accept")) {
                    c = 5;
                    break;
                }
                break;
            case 1193594425:
                if (str.equals("calendar-pending-active-tip")) {
                    c = 6;
                    break;
                }
                break;
            case 1538908856:
                if (str.equals("calender-action-refuse")) {
                    c = 7;
                    break;
                }
                break;
            case 2093451601:
                if (str.equals("calendar-refuse-tip")) {
                    c = '\b';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                sb.append(C43819s.m173684a((int) R.string.Mail_Calendar_Accept));
                break;
            case 1:
                sb.append(C43819s.m173684a((int) R.string.Mail_Calendar_Maybe));
                break;
            case 2:
                if (mailFullEventInfo.mo151461k() == EmailCalendarEventInfo.AttendeeStatus.TENTATIVE) {
                    sb.append("calender-action-pending active");
                    break;
                }
                break;
            case 3:
                sb.append(C43819s.m173684a((int) R.string.Mail_Calendar_Refused));
                break;
            case 4:
                sb.append(C43819s.m173684a((int) R.string.Mail_Calendar_Accepted));
                break;
            case 5:
                if (mailFullEventInfo.mo151461k() == EmailCalendarEventInfo.AttendeeStatus.ACCEPT) {
                    sb.append("calender-action-accept active");
                    break;
                }
                break;
            case 6:
                sb.append(C43819s.m173684a((int) R.string.Mail_Calendar_Maybe));
                break;
            case 7:
                if (mailFullEventInfo.mo151461k() == EmailCalendarEventInfo.AttendeeStatus.DECLINE) {
                    sb.append("calender-action-refuse active");
                    break;
                }
                break;
            case '\b':
                sb.append(C43819s.m173684a((int) R.string.Mail_Calendar_Refuse));
                break;
        }
        return sb.toString();
    }
}
