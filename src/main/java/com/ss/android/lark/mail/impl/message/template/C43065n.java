package com.ss.android.lark.mail.impl.message.template;

import com.bytedance.lark.pb.basic.v1.EmailCalendarEventInfo;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.entity.MailCalendar;
import com.ss.android.lark.mail.impl.entity.MailMessage;
import com.ss.android.lark.mail.impl.p2171h.C42187a;
import com.ss.android.lark.mail.impl.utils.C43819s;

/* renamed from: com.ss.android.lark.mail.impl.message.template.n */
public class C43065n extends AbstractC43031a<MailMessage> {
    /* renamed from: a */
    public String mo154244a(final MailMessage mailMessage) {
        if (!mailMessage.mo151549B()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        mo154210a(sb, mo154209a("calendar-card"), new AbstractC43088y() {
            /* class com.ss.android.lark.mail.impl.message.template.C43065n.C430661 */

            @Override // com.ss.android.lark.mail.impl.message.template.AbstractC43088y
            /* renamed from: a */
            public String mo154220a(String str) {
                return C43065n.this.mo154245a(str, mailMessage.mo151548A());
            }
        });
        C42187a.m168519d(mailMessage.mo151548A().mo151286s());
        return sb.toString();
    }

    /* renamed from: a */
    public String mo154245a(String str, MailCalendar mailCalendar) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1935513577:
                if (str.equals("calendar-summary")) {
                    c = 0;
                    break;
                }
                break;
            case -1219736237:
                if (str.equals("calendar-card-feedback")) {
                    c = 1;
                    break;
                }
                break;
            case -703116535:
                if (str.equals("calendar-title")) {
                    c = 2;
                    break;
                }
                break;
            case -605658901:
                if (str.equals("calendar-card-content")) {
                    c = 3;
                    break;
                }
                break;
            case -465353518:
                if (str.equals("calendar-card-removed")) {
                    c = 4;
                    break;
                }
                break;
            case 144224430:
                if (str.equals("calendar-is-cancel")) {
                    c = 5;
                    break;
                }
                break;
            case 402595433:
                if (str.equals("calendar-card-invalid")) {
                    c = 6;
                    break;
                }
                break;
            case 554637917:
                if (str.equals("calendar-card-notfound")) {
                    c = 7;
                    break;
                }
                break;
            case 759116521:
                if (str.equals("calendar-card-footer")) {
                    c = '\b';
                    break;
                }
                break;
            case 1777804139:
                if (str.equals("calendar-originator")) {
                    c = '\t';
                    break;
                }
                break;
            case 1866878582:
                if (str.equals("calendar-card-mark-action-tag-list")) {
                    c = '\n';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                if (mailCalendar.mo151275h() != null) {
                    return C43032aa.m171192d(mailCalendar.mo151275h().mo151450d());
                }
                if (mailCalendar.mo151274g() != null) {
                    return C43032aa.m171192d(mailCalendar.mo151274g().mo151644a());
                }
                return "";
            case 1:
                if (mailCalendar.mo151284q() == null) {
                    return "";
                }
                C43050h hVar = new C43050h();
                String str2 = "" + hVar.mo154229a(mailCalendar);
                C43054i iVar = new C43054i();
                return str2 + iVar.mo154234a(mailCalendar);
            case 2:
                if (mailCalendar.mo151275h() != null) {
                    if (mailCalendar.mo151277j()) {
                        return mailCalendar.mo151269e() + C43819s.m173684a((int) R.string.Mail_Calendar_InvitationNotify);
                    } else if (mailCalendar.mo151279l()) {
                        return mailCalendar.mo151269e() + C43819s.m173684a((int) R.string.Mail_Calendar_InvitationUpdate);
                    } else if (mailCalendar.mo151285r()) {
                        return C43819s.m173690b((int) R.string.Mail_Calendar_CannotFindEvent);
                    } else {
                        return "";
                    }
                } else if (mailCalendar.mo151282o()) {
                    EmailCalendarEventInfo.CalendarMailMessageType n = mailCalendar.mo151281n();
                    if (n == EmailCalendarEventInfo.CalendarMailMessageType.EVENT_INVITE) {
                        return mailCalendar.mo151269e() + C43819s.m173684a((int) R.string.Mail_Calendar_InvitationNotify);
                    } else if (n != EmailCalendarEventInfo.CalendarMailMessageType.EVENT_UPDATE) {
                        return "";
                    } else {
                        return mailCalendar.mo151269e() + C43819s.m173684a((int) R.string.Mail_Calendar_InvitationUpdate);
                    }
                } else if (mailCalendar.mo151278k()) {
                    return mailCalendar.mo151269e() + C43819s.m173684a((int) R.string.Mail_Calendar_TitleCancel);
                } else if ((mailCalendar.mo151280m() && mailCalendar.mo151283p() == EmailCalendarEventInfo.OutdatedType.CANCEL) || mailCalendar.mo151284q() != null) {
                    return "";
                } else {
                    return mailCalendar.mo151269e() + C43819s.m173684a((int) R.string.Mail_Calendar_InvitationNotify);
                }
            case 3:
                StringBuilder sb = new StringBuilder();
                if (!mailCalendar.mo151285r() && mailCalendar.mo151275h() != null) {
                    sb.append(new C43050h().mo154229a(mailCalendar));
                }
                return sb.toString();
            case 4:
                if (mailCalendar.mo151282o()) {
                    return new C43063m().mo154242a(mailCalendar);
                }
                return "";
            case 5:
                if (!mailCalendar.mo151285r()) {
                    if (mailCalendar.mo151274g() == null) {
                        return "";
                    }
                    if (mailCalendar.mo151284q() == null || mailCalendar.mo151284q().mo151419b() == EmailCalendarEventInfo.MailReplyStatus.MAIL_DECLINE) {
                        return "is-cancel";
                    }
                    return "";
                }
                return "is-cancel";
            case 6:
                if (mailCalendar.mo151275h() == null && mailCalendar.mo151284q() == null && !mailCalendar.mo151282o()) {
                    return new C43059k().mo154238a(mailCalendar);
                }
                return "";
            case 7:
                if (mailCalendar.mo151285r()) {
                    return new C43061l().mo154240a(mailCalendar);
                }
                return "";
            case '\b':
                if (mailCalendar.mo151285r() || mailCalendar.mo151275h() == null) {
                    return "";
                }
                return new C43057j().mo154236a(mailCalendar);
            case '\t':
                if (mailCalendar.mo151269e() != null) {
                    return mailCalendar.mo151269e();
                }
                return "";
            case '\n':
                StringBuilder sb2 = new StringBuilder();
                if (mailCalendar.mo151275h() != null) {
                    if (!mailCalendar.mo151285r() && mailCalendar.mo151275h().mo151457g()) {
                        sb2.append(new C43046f().mo154226b(C43819s.m173684a((int) R.string.Mail_Calendar_Optional)));
                    }
                    if (EmailCalendarEventInfo.InteroperabilityType.EXTERNAL == mailCalendar.mo151275h().mo151458h()) {
                        sb2.append(new C43046f().mo154226b(C43819s.m173684a((int) R.string.Mail_Calendar_External)));
                    }
                } else if (mailCalendar.mo151274g() != null) {
                    if (!mailCalendar.mo151285r() && mailCalendar.mo151274g().mo151648b()) {
                        sb2.append(new C43046f().mo154226b(C43819s.m173684a((int) R.string.Mail_Calendar_Optional)));
                    }
                    if (EmailCalendarEventInfo.InteroperabilityType.EXTERNAL == mailCalendar.mo151274g().mo151649c()) {
                        sb2.append(new C43046f().mo154226b(C43819s.m173684a((int) R.string.Mail_Calendar_External)));
                    }
                }
                return sb2.toString();
            default:
                return "";
        }
    }
}
