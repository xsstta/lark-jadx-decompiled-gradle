package com.ss.android.lark.mail.impl.service.p2215a;

import com.bytedance.lark.pb.basic.v1.Command;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.service.p2215a.p2216a.C43288a;
import com.ss.android.lark.mail.impl.service.p2215a.p2216a.C43289b;
import com.ss.android.lark.mail.impl.service.p2215a.p2216a.C43290c;
import com.ss.android.lark.mail.impl.service.p2215a.p2216a.C43291d;
import com.ss.android.lark.mail.impl.service.p2215a.p2216a.C43292e;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.service.a.e */
public class C43298e {

    /* renamed from: a */
    private static List<AbstractC43286a> f110150a;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.mail.impl.service.a.e$a */
    public static class C43300a {

        /* renamed from: a */
        public static final C43298e f110151a = new C43298e();
    }

    /* renamed from: a */
    public static final C43298e m172008a() {
        return C43300a.f110151a;
    }

    /* renamed from: c */
    public List<AbstractC43286a> mo154976c() {
        return f110150a;
    }

    private C43298e() {
        f110150a = new ArrayList();
    }

    /* renamed from: b */
    public void mo154975b() {
        Log.m165388i("PushProcessManager initPush");
        f110150a.add(new C43293b());
        f110150a.add(new C43306j());
        f110150a.add(new C43289b());
        f110150a.add(new C43288a());
        f110150a.add(new C43291d());
        f110150a.add(new C43292e());
        f110150a.add(new C43294c());
        f110150a.add(new C43301f());
        f110150a.add(new C43302g());
        f110150a.add(new C43305i());
        f110150a.add(new C43290c());
        C43296d.m172003a();
    }

    /* renamed from: a */
    public AbstractC43286a mo154974a(Command command) {
        for (int i = 0; i < f110150a.size(); i++) {
            AbstractC43286a aVar = f110150a.get(i);
            if (aVar.mo154970b().getValue() == command.getValue()) {
                return aVar;
            }
        }
        return null;
    }
}
