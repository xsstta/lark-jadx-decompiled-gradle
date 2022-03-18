package com.ss.android.lark.mail.impl.service;

import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.action.AbsChangeMailAction;
import com.ss.android.lark.mail.impl.action.AbstractC41815b;
import com.ss.android.lark.mail.impl.utils.C43849u;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.service.b */
public class C43307b {

    /* renamed from: a */
    private List<AbstractC43311a> f110153a;

    /* renamed from: com.ss.android.lark.mail.impl.service.b$a */
    public interface AbstractC43311a {
        void onActionChange(AbsChangeMailAction absChangeMailAction);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.mail.impl.service.b$b */
    public static class C43312b {

        /* renamed from: a */
        public static C43307b f110159a = new C43307b();
    }

    /* renamed from: a */
    public static C43307b m172030a() {
        return C43312b.f110159a;
    }

    /* renamed from: b */
    public List<AbstractC43311a> mo154980b() {
        return this.f110153a;
    }

    private C43307b() {
        this.f110153a = new ArrayList();
    }

    /* renamed from: b */
    public void mo154982b(AbstractC43311a aVar) {
        if (aVar != null) {
            this.f110153a.remove(aVar);
        }
    }

    /* renamed from: a */
    public void mo154977a(AbsChangeMailAction absChangeMailAction) {
        Log.m165389i("ActionService", "ChangeAction: " + absChangeMailAction);
        mo154978a(absChangeMailAction, 0);
    }

    /* renamed from: b */
    public void mo154981b(AbsChangeMailAction absChangeMailAction) {
        if (absChangeMailAction != null) {
            for (AbstractC43311a aVar : this.f110153a) {
                aVar.onActionChange(absChangeMailAction);
            }
        }
    }

    /* renamed from: a */
    public void mo154979a(AbstractC43311a aVar) {
        if (aVar != null && !this.f110153a.contains(aVar)) {
            this.f110153a.add(aVar);
        }
    }

    /* renamed from: a */
    public void mo154978a(final AbsChangeMailAction absChangeMailAction, final long j) {
        absChangeMailAction.mo150238a(new AbstractC41815b() {
            /* class com.ss.android.lark.mail.impl.service.C43307b.C433081 */

            @Override // com.ss.android.lark.mail.impl.action.AbstractC41815b
            /* renamed from: b */
            public void mo150377b() {
            }

            @Override // com.ss.android.lark.mail.impl.action.AbstractC41815b
            /* renamed from: a */
            public void mo150376a() {
                if (j == 0) {
                    C43849u.m173826a(new Runnable() {
                        /* class com.ss.android.lark.mail.impl.service.C43307b.C433081.RunnableC433091 */

                        public void run() {
                            C43307b.this.mo154981b(absChangeMailAction);
                        }
                    });
                } else {
                    C43849u.m173827a(new Runnable() {
                        /* class com.ss.android.lark.mail.impl.service.C43307b.C433081.RunnableC433102 */

                        public void run() {
                            C43307b.this.mo154981b(absChangeMailAction);
                        }
                    }, j);
                }
            }
        });
    }
}
