package com.ss.android.lark.app.p1358d;

import java.util.LinkedList;
import java.util.Queue;

/* renamed from: com.ss.android.lark.app.d.a */
public class C28877a {

    /* renamed from: a */
    private final Queue<AbstractC28878a> f72487a = new LinkedList();

    /* renamed from: com.ss.android.lark.app.d.a$a */
    public interface AbstractC28878a {
        void doWork();
    }

    /* renamed from: a */
    public void mo102532a() {
        mo102534b();
    }

    /* renamed from: b */
    public void mo102534b() {
        AbstractC28878a poll;
        if (!this.f72487a.isEmpty() && (poll = this.f72487a.poll()) != null) {
            poll.doWork();
        }
    }

    /* renamed from: a */
    public void mo102533a(AbstractC28878a aVar) {
        this.f72487a.offer(aVar);
    }
}
