package com.ss.android.lark.notification.p2382e;

import com.ss.android.lark.notification.export.AbstractNotification;
import com.ss.android.lark.notification.export.entity.C48499a;
import com.ss.android.lark.notification.export.entity.Notice;

/* renamed from: com.ss.android.lark.notification.e.h */
public class C48463h<T extends Notice, R extends C48499a> {

    /* renamed from: a */
    private AbstractNotification.AbstractC48495b<T> f121941a;

    /* renamed from: b */
    private AbstractNotification.AbstractNotificationDisplayer<R> f121942b;

    /* renamed from: c */
    private AbstractNotification.AbstractC48494a f121943c;

    /* renamed from: d */
    private AbstractNotification.AbstractC48496c<T> f121944d;

    /* renamed from: d */
    private boolean m191141d(Notice notice) {
        return this.f121942b.mo31145a(notice);
    }

    /* renamed from: e */
    private R m191142e(Notice notice) {
        return this.f121942b.mo31147c(notice);
    }

    /* renamed from: b */
    private Notice m191139b(Notice notice) {
        AbstractNotification.AbstractC48495b<T> bVar = this.f121941a;
        if (bVar == null) {
            return notice;
        }
        return bVar.mo31140c(notice);
    }

    /* renamed from: c */
    private int m191140c(Notice notice) {
        AbstractNotification.AbstractC48495b<T> bVar = this.f121941a;
        if (bVar == null) {
            return 0;
        }
        return bVar.mo31139b(notice);
    }

    /* renamed from: f */
    private void m191143f(Notice notice) {
        AbstractNotification.AbstractC48494a aVar = this.f121943c;
        if (aVar != null) {
            aVar.mo135461a(notice);
        }
    }

    /* renamed from: g */
    private void m191144g(Notice notice) {
        AbstractNotification.AbstractC48496c<T> cVar = this.f121944d;
        if (cVar != null) {
            cVar.mo31117a(notice);
        }
    }

    /* renamed from: h */
    private void m191145h(Notice notice) {
        AbstractNotification.AbstractC48496c<T> cVar = this.f121944d;
        if (cVar != null) {
            cVar.mo31118b(notice);
        }
    }

    protected C48463h(AbstractNotification<T, R> abstractNotification) {
        this.f121941a = abstractNotification.mo31113b();
        this.f121942b = abstractNotification.mo31114c();
        this.f121943c = abstractNotification.mo135459e();
        this.f121944d = abstractNotification.mo31115d();
    }

    /* renamed from: a */
    private void m191138a(R r) {
        int a = this.f121942b.mo131697a(r);
        if (a == 0) {
            C48471l.m191163a().mo169535b(r);
        } else if (a == 1) {
            C48471l.m191163a().mo169534a(r);
        }
    }

    /* renamed from: a */
    public void mo169530a(Notice notice) {
        Notice b = m191139b(notice);
        if (b != null) {
            int c = m191140c(b);
            if (c == 0) {
                m191145h(b);
                if (m191141d(b)) {
                    m191144g(b);
                    R e = m191142e(b);
                    if (e != null) {
                        m191138a(e);
                    }
                }
            } else if (c == 1) {
                m191143f(b);
            }
        }
    }
}
