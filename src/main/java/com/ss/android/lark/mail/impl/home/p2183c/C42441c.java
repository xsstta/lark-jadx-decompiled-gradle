package com.ss.android.lark.mail.impl.home.p2183c;

import com.bytedance.lark.pb.email.client.v1.FilterType;
import com.ss.android.lark.mail.impl.action.C41814a;
import com.ss.android.lark.mail.impl.entity.MailLabelEntity;
import com.ss.android.lark.mail.impl.entity.MailThread;
import com.ss.android.lark.mail.impl.service.C43374f;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.home.c.c */
public class C42441c {

    /* renamed from: b */
    private static C42441c f108045b;

    /* renamed from: a */
    private HashMap<FilterType, AbstractC42440b> f108046a = new HashMap<>();

    private C42441c() {
        m169466c();
    }

    /* renamed from: a */
    public static synchronized C42441c m169464a() {
        C42441c cVar;
        synchronized (C42441c.class) {
            if (f108045b == null) {
                f108045b = new C42441c();
            }
            cVar = f108045b;
        }
        return cVar;
    }

    /* renamed from: c */
    private void m169466c() {
        this.f108046a.put(FilterType.ALL_MAIL, new C42439a());
        this.f108046a.put(FilterType.UNREAD, new C42443e());
    }

    /* renamed from: d */
    private AbstractC42440b m169467d() {
        return this.f108046a.get(C43374f.m172264f().mo155135w());
    }

    /* renamed from: b */
    public void mo152740b() {
        AbstractC42440b d = m169467d();
        if (d != null) {
            d.mo152733a("");
        }
    }

    /* renamed from: a */
    public void mo152736a(C41814a aVar) {
        AbstractC42440b d = m169467d();
        if (d != null) {
            d.mo152732a(aVar);
        }
    }

    /* renamed from: b */
    public String mo152739b(MailLabelEntity mailLabelEntity) {
        AbstractC42440b d = m169467d();
        if (d != null) {
            return d.mo152735a(mailLabelEntity);
        }
        return "";
    }

    /* renamed from: a */
    public void mo152737a(String str) {
        AbstractC42440b d = m169467d();
        if (d != null) {
            d.mo152733a(str);
        }
    }

    /* renamed from: a */
    public static boolean m169465a(MailLabelEntity mailLabelEntity) {
        if (mailLabelEntity != null && mailLabelEntity.mo151529m() && !"INBOX".equals(mailLabelEntity.mo151527k()) && !"SPAM".equals(mailLabelEntity.mo151527k()) && !"SHARE".equals(mailLabelEntity.mo151527k()) && !"IMPORTANT".equals(mailLabelEntity.mo151527k()) && !"OTHER".equals(mailLabelEntity.mo151527k())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo152738a(List<MailThread> list) {
        AbstractC42440b d = m169467d();
        if (d != null) {
            d.mo152734a(list);
        }
    }
}
