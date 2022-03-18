package com.ss.android.lark.mail.impl.message.template;

import android.text.TextUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.entity.MailMessage;
import com.ss.android.lark.mail.impl.utils.C43762e;
import com.ss.android.lark.mail.impl.utils.C43819s;
import java.util.Date;

/* renamed from: com.ss.android.lark.mail.impl.message.template.t */
public class C43078t extends AbstractC43031a<MailMessage> {

    /* renamed from: a */
    private static String f109630a = "$schedule-view-original-button-text$";

    /* renamed from: b */
    private String f109631b;

    /* renamed from: c */
    private boolean f109632c;

    /* renamed from: a */
    private void m171275a() {
        if (TextUtils.isEmpty(this.f109631b)) {
            this.f109631b = mo154209a("schedule_message_banner").replace(f109630a, C43819s.m173684a((int) R.string.Mail_SendLater_CancelSend));
        }
    }

    /* renamed from: a */
    public String mo154260a(MailMessage mailMessage) {
        this.f109632c = C41816b.m166115a().mo150116F().mo150192b();
        m171275a();
        if (mailMessage.mo151559L() <= 0) {
            return "";
        }
        return this.f109631b.replace("$schedule_time$", C43819s.m173686a(R.string.Mail_SendLater_ScheduledForDate, "Time", C43762e.m173476a(new Date(mailMessage.mo151559L()), this.f109632c, true)));
    }
}
