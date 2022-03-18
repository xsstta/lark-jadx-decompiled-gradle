package com.ss.android.lark.mail.impl.action;

import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.entity.MailThread;
import com.ss.android.lark.mail.impl.home.p2182b.AbstractC42436a;
import com.ss.android.lark.mail.impl.home.p2183c.C42441c;
import com.ss.android.lark.mail.impl.p2168g.C42176e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class PushMultiThreadAction extends AbsChangeMailAction {

    /* renamed from: a */
    private List<String> f106113a;

    /* renamed from: b */
    private long f106114b;

    /* renamed from: c */
    private final List<String> f106115c = new ArrayList();

    /* renamed from: d */
    private final List<MailThread> f106116d = new ArrayList();

    /* renamed from: e */
    private List<String> f106117e;

    /* renamed from: f */
    private HashMap<String, MailThread> f106118f;

    /* renamed from: g */
    private List<MailThread> f106119g;

    /* renamed from: h */
    private boolean f106120h;

    /* renamed from: i */
    private MailThread f106121i;

    /* renamed from: com.ss.android.lark.mail.impl.action.PushMultiThreadAction$a */
    public static class C41799a {

        /* renamed from: a */
        private List<MailThread> f106124a;

        /* renamed from: b */
        private List<String> f106125b;

        /* renamed from: a */
        public List<MailThread> mo150329a() {
            return this.f106124a;
        }

        /* renamed from: b */
        public List<String> mo150330b() {
            return this.f106125b;
        }

        public C41799a(List<MailThread> list, List<String> list2) {
            this.f106124a = list;
            this.f106125b = list2;
        }
    }

    /* renamed from: f */
    public List<MailThread> mo150326f() {
        return this.f106119g;
    }

    /* renamed from: g */
    public boolean mo150327g() {
        return this.f106120h;
    }

    /* renamed from: e */
    public MailThread mo150325e() {
        MailThread mailThread = this.f106121i;
        this.f106121i = null;
        return mailThread;
    }

    @Override // com.ss.android.lark.mail.impl.action.AbsChangeMailAction
    /* renamed from: a */
    public void mo150238a(final AbstractC41815b bVar) {
        if (this.f106113a == null) {
            mo150324a((List<MailThread>) null, (List<String>) null);
            bVar.mo150376a();
            return;
        }
        C42176e.m168344a().mo152215a(mo150245a(), this.f106113a, this.f106114b, new IGetDataCallback<C41799a>() {
            /* class com.ss.android.lark.mail.impl.action.PushMultiThreadAction.C417981 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                bVar.mo150377b();
            }

            /* renamed from: a */
            public void onSuccess(C41799a aVar) {
                PushMultiThreadAction.this.mo150324a(aVar.mo150329a(), aVar.mo150330b());
                bVar.mo150376a();
            }
        });
    }

    @Override // com.ss.android.lark.mail.impl.action.AbsChangeMailAction
    /* renamed from: a */
    public int mo150234a(MailThread mailThread) {
        MailThread mailThread2;
        String a = mailThread.mo151676a();
        if (a == null) {
            return 0;
        }
        List<String> list = this.f106117e;
        if (list != null && list.size() > 0 && this.f106117e.contains(a)) {
            return 1;
        }
        HashMap<String, MailThread> hashMap = this.f106118f;
        if (hashMap == null || (mailThread2 = hashMap.get(mailThread.mo151676a())) == null) {
            List<MailThread> list2 = this.f106119g;
            if (list2 == null || list2.size() <= 0) {
                return 0;
            }
            for (int size = this.f106119g.size() - 1; size >= 0; size--) {
                MailThread mailThread3 = this.f106119g.get(size);
                if (mailThread3.mo151719n() < mailThread.mo151719n()) {
                    this.f106121i = mailThread3;
                    this.f106119g.remove(mailThread3);
                    return 2;
                }
            }
            return 0;
        }
        this.f106121i = mailThread2;
        this.f106118f.remove(mailThread.mo151676a());
        return 3;
    }

    /* renamed from: a */
    public void mo150323a(List<AbstractC42436a> list) {
        this.f106117e = new ArrayList(this.f106115c);
        this.f106118f = new HashMap<>();
        ArrayList arrayList = new ArrayList();
        this.f106119g = arrayList;
        if (list != null) {
            arrayList.addAll(this.f106116d);
            C42441c.m169464a().mo152738a(this.f106119g);
            for (AbstractC42436a aVar : list) {
                if (aVar instanceof MailThread) {
                    Iterator<MailThread> it = this.f106116d.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        MailThread next = it.next();
                        MailThread mailThread = (MailThread) aVar;
                        if (TextUtils.equals(mailThread.mo151676a(), next.mo151676a())) {
                            if (mailThread.mo151719n() == next.mo151719n()) {
                                this.f106118f.put(next.mo151676a(), next);
                                this.f106119g.remove(next);
                            } else {
                                this.f106117e.add(next.mo151676a());
                                if (!this.f106119g.contains(next)) {
                                    int i = 0;
                                    while (i < this.f106119g.size() && this.f106119g.get(i).mo151719n() > next.mo151719n()) {
                                        i++;
                                    }
                                    this.f106119g.add(i, next);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void mo150324a(List<MailThread> list, List<String> list2) {
        this.f106115c.clear();
        if (list2 != null) {
            this.f106115c.addAll(list2);
        }
        this.f106116d.clear();
        long j = -1;
        if (list != null && list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                MailThread mailThread = list.get(i);
                int i2 = 0;
                while (i2 < list.size() && list.get(i2).mo151719n() > mailThread.mo151719n()) {
                    i2++;
                }
                this.f106116d.add(i2, mailThread);
                if (j < 0 || mailThread.mo151719n() < j) {
                    j = mailThread.mo151719n();
                }
            }
            if (j < this.f106114b) {
                this.f106120h = true;
                Log.m165388i("set needLoadMore after compare cursor");
            }
        }
    }

    public PushMultiThreadAction(String str, List<String> list, boolean z, long j) {
        super(str);
        this.f106113a = list;
        this.f106120h = z;
        if (z) {
            Log.m165388i("set needLoadMore on construct");
        }
        this.f106114b = j;
    }
}
