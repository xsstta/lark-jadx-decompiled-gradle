package com.ss.android.lark.mail.impl.search.p2214a;

import com.ss.android.lark.mail.impl.entity.MailLabelEntity;
import com.ss.android.lark.mail.impl.search.p2214a.C43252a;
import com.ss.android.lark.mail.impl.service.C43374f;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.search.a.b */
public class C43254b extends C43252a<MailLabelEntity> {
    public C43254b() {
        super(new C43255a());
    }

    /* renamed from: a */
    public void mo154859a(String str) {
        MailLabelEntity c;
        if (str != null && (c = C43374f.m172264f().mo155117c(str)) != null) {
            mo154857a(c);
        }
    }

    /* renamed from: a */
    public void mo154860a(List<String> list) {
        if (list != null) {
            for (String str : list) {
                mo154859a(str);
            }
        }
    }

    /* renamed from: com.ss.android.lark.mail.impl.search.a.b$a */
    public static class C43255a implements C43252a.AbstractC43253a<MailLabelEntity> {
        /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x005e, code lost:
            if (r6.equals("IMPORTANT") == false) goto L_0x002a;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo154858a(com.ss.android.lark.mail.impl.entity.MailLabelEntity r6) {
            /*
            // Method dump skipped, instructions count: 168
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.search.p2214a.C43254b.C43255a.mo154858a(com.ss.android.lark.mail.impl.entity.MailLabelEntity):int");
        }
    }
}
