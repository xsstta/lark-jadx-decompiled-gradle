package com.ss.android.lark.mail.impl.home.threadlist.p2188c;

import android.graphics.drawable.Drawable;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.action.ArchiveMailAction;
import com.ss.android.lark.mail.impl.action.ReadThreadListMailAction;
import com.ss.android.lark.mail.impl.entity.MailThread;
import com.ss.android.lark.mail.impl.p2171h.C42187a;
import com.ss.android.lark.mail.impl.p2171h.C42330c;
import com.ss.android.lark.mail.impl.service.C43307b;
import com.ss.android.lark.mail.impl.service.C43374f;
import com.ss.android.lark.mail.impl.utils.C43819s;

/* renamed from: com.ss.android.lark.mail.impl.home.threadlist.c.c */
public class C42638c extends AbstractC42636a {

    /* renamed from: j */
    private static final Drawable[] f108514j = {UIUtils.getDrawable(C41816b.m166115a().mo150132b(), R.drawable.mail_ic_home_action_read), UIUtils.getDrawable(C41816b.m166115a().mo150132b(), R.drawable.mail_ic_home_action_read), UIUtils.getDrawable(C41816b.m166115a().mo150132b(), R.drawable.ud_icon_archive_outlined), UIUtils.getDrawable(C41816b.m166115a().mo150132b(), R.drawable.ud_icon_archive_outlined)};

    /* renamed from: k */
    private static final Drawable[] f108515k = {UIUtils.getDrawable(C41816b.m166115a().mo150132b(), R.drawable.ud_icon_unread_outlined), UIUtils.getDrawable(C41816b.m166115a().mo150132b(), R.drawable.ud_icon_unread_outlined), UIUtils.getDrawable(C41816b.m166115a().mo150132b(), R.drawable.ud_icon_archive_outlined), UIUtils.getDrawable(C41816b.m166115a().mo150132b(), R.drawable.ud_icon_archive_outlined)};

    /* renamed from: h */
    private final String[] f108516h = {C43819s.m173684a((int) R.string.Mail_ThreadList_SetRead), C43819s.m173684a((int) R.string.Mail_ThreadList_SetRead), C43819s.m173684a((int) R.string.Mail_ThreadList_ActionArchived), C43819s.m173684a((int) R.string.Mail_ThreadList_ActionArchived)};

    /* renamed from: i */
    private final String[] f108517i = {C43819s.m173684a((int) R.string.Mail_ThreadList_SetUnread), C43819s.m173684a((int) R.string.Mail_ThreadList_SetUnread), C43819s.m173684a((int) R.string.Mail_ThreadList_ActionArchived), C43819s.m173684a((int) R.string.Mail_ThreadList_ActionArchived)};

    @Override // com.ss.android.lark.mail.impl.home.threadlist.p2188c.AbstractC42637b
    /* renamed from: d */
    public String[] mo153208d(MailThread mailThread) {
        if (mailThread.mo151716k()) {
            return this.f108517i;
        }
        return this.f108516h;
    }

    @Override // com.ss.android.lark.mail.impl.home.threadlist.p2188c.AbstractC42637b
    /* renamed from: e */
    public Drawable[] mo153209e(MailThread mailThread) {
        if (mailThread.mo151716k()) {
            return f108515k;
        }
        return f108514j;
    }

    @Override // com.ss.android.lark.mail.impl.home.threadlist.p2188c.AbstractC42636a, com.ss.android.lark.mail.impl.home.threadlist.p2188c.AbstractC42637b
    /* renamed from: a */
    public void mo153203a(MailThread mailThread, String str) {
        boolean z = !mailThread.mo151716k();
        mailThread.mo151690b(z);
        C43307b.m172030a().mo154977a(new ReadThreadListMailAction(mailThread.mo151676a(), str, z));
        C43374f.m172264f();
        String b = C43374f.m172261b(str);
        if (!z) {
            C42187a.m168544i(mailThread.mo151676a(), C42187a.C42191c.f107464o, b);
            C42330c.m169059a(false, C42330c.C42332a.f107636d, C42330c.C42333b.f107655h);
        } else {
            C42187a.m168540h(mailThread.mo151676a(), C42187a.C42191c.f107464o, b);
            C42330c.m169059a(false, C42330c.C42332a.f107636d, C42330c.C42333b.f107654g);
        }
        C42187a.m168492a(z, 1, false, C42187a.C42191c.f107435L);
    }

    @Override // com.ss.android.lark.mail.impl.home.threadlist.p2188c.AbstractC42636a, com.ss.android.lark.mail.impl.home.threadlist.p2188c.AbstractC42637b
    /* renamed from: b */
    public void mo153205b(MailThread mailThread, String str) {
        if (mailThread.mo151691c().mo151743e()) {
            C43307b.m172030a().mo154977a(new ArchiveMailAction(mailThread.mo151676a(), "ARCHIVED", "INBOX"));
        } else {
            C43307b.m172030a().mo154977a(new ArchiveMailAction(mailThread.mo151676a(), str, "ARCHIVED"));
            C42187a.m168469a(1, false, C42187a.C42191c.f107435L);
        }
        C43374f.m172264f();
        C42187a.m168532f(mailThread.mo151676a(), C42187a.C42191c.f107464o, C43374f.m172261b(str));
        C42330c.m169059a(false, C42330c.C42332a.f107636d, C42330c.C42333b.f107650c);
    }
}
