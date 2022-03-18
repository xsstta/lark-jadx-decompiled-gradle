package com.ss.android.lark.mail.impl.utils;

import com.huawei.hms.location.LocationRequest;
import com.ss.android.lark.mail.impl.entity.MailAddress;
import com.ss.android.lark.mail.impl.entity.MailDraft;
import com.ss.android.lark.mail.impl.service.C43350d;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.utils.f */
public class C43763f {
    /* renamed from: a */
    public static int m173477a() {
        if (C43350d.m172098a().mo155012D()) {
            return ParticipantRepo.f117150c;
        }
        if (C43350d.m172098a().mo155013E()) {
            return LocationRequest.PRIORITY_HD_ACCURACY;
        }
        return 100;
    }

    /* renamed from: a */
    public static int m173478a(MailDraft mailDraft) {
        int a = m173477a();
        if (m173480b(mailDraft) > a) {
            return a;
        }
        return 0;
    }

    /* renamed from: b */
    public static int m173480b(MailDraft mailDraft) {
        return m173479a(mailDraft.mo151339d()) + 0 + m173479a(mailDraft.mo151343e()) + m173479a(mailDraft.mo151347f());
    }

    /* renamed from: a */
    private static int m173479a(List<MailAddress> list) {
        if (list != null) {
            return list.size();
        }
        return 0;
    }
}
