package com.ss.android.lark.threadwindow.p2760a.p2762b;

import android.content.Context;
import com.ss.android.lark.chat.core.model.AbstractC33953b;
import com.ss.android.lark.chat.core.model.C33952a;
import com.ss.android.lark.chat.core.model.C33958d;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.thread.ThreadInfo;
import com.ss.android.lark.chatbase.AbstractC34417b;
import com.ss.android.lark.threadwindow.p2760a.p2761a.AbstractC56008a;
import com.ss.android.lark.threadwindow.p2760a.p2761a.C56009b;
import com.ss.android.lark.threadwindow.p2760a.p2761a.C56010c;
import com.ss.android.lark.threadwindow.p2760a.p2761a.C56011d;
import com.ss.android.lark.threadwindow.p2760a.p2761a.C56012e;
import com.ss.android.lark.threadwindow.p2760a.p2761a.C56013f;
import com.ss.android.lark.threadwindow.p2760a.p2761a.C56015h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.ss.android.lark.threadwindow.a.b.b */
public class C56020b {

    /* renamed from: g */
    private static final int[] f138511g = {8, 6, 5, 4, 7};

    /* renamed from: h */
    private static final int[] f138512h = {7};

    /* renamed from: a */
    private final String f138513a;

    /* renamed from: b */
    private final String f138514b;

    /* renamed from: c */
    private final Context f138515c;

    /* renamed from: d */
    private final long f138516d;

    /* renamed from: e */
    private final int[] f138517e;

    /* renamed from: f */
    private final C56015h.AbstractC56017a f138518f;

    /* renamed from: i */
    private final Map<Integer, C56022a> f138519i = new HashMap();

    /* renamed from: com.ss.android.lark.threadwindow.a.b.b$a */
    private static class C56022a {

        /* renamed from: a */
        public int f138520a;

        /* renamed from: b */
        public C33958d f138521b;

        /* renamed from: c */
        public AbstractC56008a f138522c;

        /* renamed from: d */
        public AbstractC33953b<ThreadInfo, C33952a<ThreadInfo>> f138523d;

        private C56022a() {
        }
    }

    /* renamed from: c */
    public Map<Integer, AbstractC34417b<ThreadInfo, C33952a<ThreadInfo>>> mo191056c() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<Integer, C56022a> entry : this.f138519i.entrySet()) {
            AbstractC56008a aVar = entry.getValue().f138522c;
            if (aVar != null) {
                hashMap.put(Integer.valueOf(entry.getKey().intValue()), aVar);
            }
        }
        return hashMap;
    }

    /* renamed from: d */
    public void mo191057d() {
        for (Map.Entry<Integer, C56022a> entry : this.f138519i.entrySet()) {
            entry.getValue().f138521b.mo124077c();
        }
    }

    /* renamed from: b */
    public Map<Integer, AbstractC56008a> mo191054b() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<Integer, C56022a> entry : this.f138519i.entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue().f138522c);
        }
        return hashMap;
    }

    /* renamed from: a */
    public void mo191052a() {
        for (int i : this.f138517e) {
            Integer valueOf = Integer.valueOf(i);
            C56022a aVar = new C56022a();
            aVar.f138520a = valueOf.intValue();
            aVar.f138521b = C33958d.m131429a("lk-thread-filter" + valueOf);
            aVar.f138523d = m217936b(valueOf.intValue(), aVar.f138521b);
            aVar.f138522c = m217935a(valueOf.intValue(), aVar.f138521b);
            if (aVar.f138522c != null) {
                aVar.f138522c.mo191020b(this.f138514b);
                aVar.f138522c.mo191017a(this.f138516d);
            }
            this.f138519i.put(valueOf, aVar);
        }
    }

    /* renamed from: a */
    public Executor mo191051a(int i) {
        C56022a aVar = this.f138519i.get(Integer.valueOf(i));
        if (aVar == null) {
            return null;
        }
        return aVar.f138521b;
    }

    /* renamed from: b */
    public AbstractC33953b<ThreadInfo, C33952a<ThreadInfo>> mo191053b(int i) {
        C56022a aVar = this.f138519i.get(Integer.valueOf(i));
        if (aVar == null) {
            return null;
        }
        return aVar.f138523d;
    }

    /* renamed from: c */
    public AbstractC56008a mo191055c(int i) {
        C56022a aVar = this.f138519i.get(Integer.valueOf(i));
        if (aVar == null) {
            return null;
        }
        return aVar.f138522c;
    }

    /* renamed from: b */
    private AbstractC33953b<ThreadInfo, C33952a<ThreadInfo>> m217936b(int i, C33958d dVar) {
        String num = Integer.toString(i);
        if (i == 7) {
            num = Integer.toString(1);
        }
        if (i != 6) {
            return new C56023c(this.f138513a, num, dVar);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.toString(9));
        arrayList.add(Integer.toString(6));
        return new C56025d(this.f138513a, arrayList, dVar);
    }

    /* renamed from: a */
    private AbstractC56008a m217935a(int i, C33958d dVar) {
        switch (i) {
            case 4:
                return new C56012e(dVar, null, this.f138518f, this.f138515c);
            case 5:
                return new C56013f(dVar, null, this.f138518f, this.f138515c);
            case 6:
                return new C56011d(dVar, null, this.f138518f, this.f138515c);
            case 7:
                return new C56010c(dVar, null, this.f138518f, this.f138515c);
            case 8:
                return new C56009b(dVar, null, this.f138518f, this.f138515c);
            default:
                return null;
        }
    }

    public C56020b(Chat chat, ChatChatter chatChatter, C56015h.AbstractC56017a aVar, Context context) {
        this.f138513a = chat.getId();
        this.f138516d = chat.getThreadReadTimeStamp();
        this.f138514b = chatChatter.getId();
        this.f138518f = aVar;
        this.f138515c = context;
        this.f138517e = f138512h;
    }
}
