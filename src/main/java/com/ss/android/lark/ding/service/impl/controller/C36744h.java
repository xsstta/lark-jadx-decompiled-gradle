package com.ss.android.lark.ding.service.impl.controller;

import android.text.TextUtils;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.ding.C36618a;
import com.ss.android.lark.ding.dto.C36636a;
import com.ss.android.lark.ding.p1803a.AbstractC36620b;
import com.ss.android.lark.ding.p1803a.AbstractC36621c;
import com.ss.android.lark.ding.service.impl.C36685b;
import com.ss.android.lark.ding.service.impl.C36758e;
import com.ss.android.lark.exception.entity.AbstractCallableC37029a;
import java.util.Comparator;
import java.util.Iterator;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.Future;

/* renamed from: com.ss.android.lark.ding.service.impl.controller.h */
public class C36744h {

    /* renamed from: a */
    volatile AbstractC36750a f94440a;

    /* renamed from: b */
    private ConcurrentSkipListSet<Future> f94441b = new ConcurrentSkipListSet<>(new Comparator<Future>() {
        /* class com.ss.android.lark.ding.service.impl.controller.C36744h.C367451 */

        /* renamed from: a */
        public int compare(Future future, Future future2) {
            return 0;
        }
    });

    /* renamed from: c */
    private AbstractC36620b f94442c = new AbstractC36620b() {
        /* class com.ss.android.lark.ding.service.impl.controller.C36744h.C367462 */

        @Override // com.ss.android.lark.ding.p1803a.AbstractC36620b
        /* renamed from: a */
        public void mo135094a(C36636a aVar, MessageInfo messageInfo) {
            C36744h.this.mo135433b(aVar, messageInfo);
        }
    };

    /* renamed from: d */
    private AbstractC36621c f94443d = new AbstractC36621c() {
        /* class com.ss.android.lark.ding.service.impl.controller.C36744h.C367473 */

        @Override // com.ss.android.lark.ding.p1803a.AbstractC36621c
        /* renamed from: a */
        public void mo135095a(C36636a aVar, MessageInfo messageInfo) {
            C36744h.this.mo135431a(aVar, messageInfo);
        }
    };

    /* renamed from: com.ss.android.lark.ding.service.impl.controller.h$a */
    public interface AbstractC36750a {
        /* renamed from: a */
        void mo135365a(C36758e eVar);

        /* renamed from: a */
        void mo135366a(String str, String str2);
    }

    /* renamed from: b */
    private void m144945b() {
        C36685b.m144766a().mo135292a(this.f94442c);
        C36685b.m144766a().mo135293a(this.f94443d);
    }

    /* renamed from: c */
    private void m144946c() {
        C36685b.m144766a().mo135295b(this.f94442c);
        C36685b.m144766a().mo135296b(this.f94443d);
    }

    /* renamed from: a */
    public void mo135430a() {
        m144946c();
        this.f94440a = null;
        Iterator<Future> it = this.f94441b.iterator();
        while (it.hasNext()) {
            it.next().cancel(false);
        }
        this.f94441b.clear();
    }

    /* renamed from: a */
    public void mo135432a(AbstractC36750a aVar) {
        this.f94440a = aVar;
        m144945b();
    }

    /* renamed from: a */
    public void mo135431a(final C36636a aVar, final MessageInfo messageInfo) {
        this.f94441b.add(CoreThreadPool.getDefault().getFixedThreadPool().submit(new AbstractCallableC37029a<Boolean>() {
            /* class com.ss.android.lark.ding.service.impl.controller.C36744h.C367484 */

            /* renamed from: a */
            public Boolean mo102726b() throws Exception {
                MessageInfo messageInfo;
                if (aVar == null || (messageInfo = messageInfo) == null || messageInfo.getMessage().isFromMe()) {
                    return false;
                }
                C36758e eVar = new C36758e(aVar);
                eVar.mo135443a(messageInfo);
                C36723d.m144893a(eVar);
                if (C36744h.this.f94440a != null) {
                    C36744h.this.f94440a.mo135365a(eVar);
                }
                return true;
            }
        }));
    }

    /* renamed from: b */
    public void mo135433b(final C36636a aVar, final MessageInfo messageInfo) {
        this.f94441b.add(CoreThreadPool.getDefault().getFixedThreadPool().submit(new AbstractCallableC37029a<Boolean>() {
            /* class com.ss.android.lark.ding.service.impl.controller.C36744h.C367495 */

            /* renamed from: a */
            public Boolean mo102726b() throws Exception {
                C36636a aVar = aVar;
                if (aVar == null || messageInfo == null) {
                    return false;
                }
                String e = aVar.mo135177e();
                if (TextUtils.isEmpty(e) || !e.equals(C36618a.m144492a().mo135102g().mo135154a())) {
                    return false;
                }
                if (C36744h.this.f94440a != null) {
                    C36744h.this.f94440a.mo135366a(aVar.mo135172b(), aVar.mo135167a());
                }
                return true;
            }
        }));
    }
}
