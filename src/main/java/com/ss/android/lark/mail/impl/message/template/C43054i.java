package com.ss.android.lark.mail.impl.message.template;

import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.entity.MailCalendar;
import com.ss.android.lark.mail.impl.utils.C43819s;

/* renamed from: com.ss.android.lark.mail.impl.message.template.i */
public class C43054i extends AbstractC43031a<MailCalendar> {

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.mail.impl.message.template.i$2 */
    public static /* synthetic */ class C430562 {

        /* renamed from: a */
        static final /* synthetic */ int[] f109580a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.bytedance.lark.pb.basic.v1.EmailCalendarEventInfo$MailReplyStatus[] r0 = com.bytedance.lark.pb.basic.v1.EmailCalendarEventInfo.MailReplyStatus.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.mail.impl.message.template.C43054i.C430562.f109580a = r0
                com.bytedance.lark.pb.basic.v1.EmailCalendarEventInfo$MailReplyStatus r1 = com.bytedance.lark.pb.basic.v1.EmailCalendarEventInfo.MailReplyStatus.MAIL_ACCEPT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.mail.impl.message.template.C43054i.C430562.f109580a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.lark.pb.basic.v1.EmailCalendarEventInfo$MailReplyStatus r1 = com.bytedance.lark.pb.basic.v1.EmailCalendarEventInfo.MailReplyStatus.MAIL_DECLINE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.mail.impl.message.template.C43054i.C430562.f109580a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bytedance.lark.pb.basic.v1.EmailCalendarEventInfo$MailReplyStatus r1 = com.bytedance.lark.pb.basic.v1.EmailCalendarEventInfo.MailReplyStatus.MAIL_TENTATIVE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.message.template.C43054i.C430562.<clinit>():void");
        }
    }

    /* renamed from: a */
    public String mo154234a(final MailCalendar mailCalendar) {
        StringBuilder sb = new StringBuilder();
        mo154210a(sb, mo154209a("calendar-card-feedback"), new AbstractC43088y() {
            /* class com.ss.android.lark.mail.impl.message.template.C43054i.C430551 */

            @Override // com.ss.android.lark.mail.impl.message.template.AbstractC43088y
            /* renamed from: a */
            public String mo154220a(String str) {
                return C43054i.this.mo154235a(str, mailCalendar);
            }
        });
        return sb.toString();
    }

    /* renamed from: b */
    private String m171231b(MailCalendar mailCalendar) {
        int i = C430562.f109580a[mailCalendar.mo151284q().mo151419b().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return "";
                }
                if (!mailCalendar.mo151284q().mo151418a()) {
                    return C43819s.m173684a((int) R.string.Mail_Calendar_TentativedByOtherParty);
                }
                return C43819s.m173684a((int) R.string.Mail_Calendar_TentativeByOtherParty);
            } else if (!mailCalendar.mo151284q().mo151418a()) {
                return C43819s.m173684a((int) R.string.Mail_Calendar_RejectedByOtherParty);
            } else {
                return C43819s.m173684a((int) R.string.Mail_Calendar_RejectByOtherParty);
            }
        } else if (!mailCalendar.mo151284q().mo151418a()) {
            return C43819s.m173684a((int) R.string.Mail_Calendar_AcceptedByOtherParty);
        } else {
            return C43819s.m173684a((int) R.string.Mail_Calendar_AcceptByOtherParty);
        }
    }

    /* renamed from: a */
    public String mo154235a(String str, MailCalendar mailCalendar) {
        StringBuilder sb = new StringBuilder();
        str.hashCode();
        if (str.equals("calender-feedback-state")) {
            sb.append(m171231b(mailCalendar));
        }
        return sb.toString();
    }
}
