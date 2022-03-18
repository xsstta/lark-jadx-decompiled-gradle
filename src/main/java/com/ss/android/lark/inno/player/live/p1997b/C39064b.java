package com.ss.android.lark.inno.player.live.p1997b;

import com.ss.android.lark.inno.network.model.C38938a;
import com.ss.android.lark.inno.network.model.C38941b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.inno.player.live.b.b */
public class C39064b {

    /* renamed from: a */
    public C38941b f100304a;

    /* renamed from: b */
    public boolean f100305b;

    /* renamed from: c */
    public int f100306c = 1;

    /* renamed from: b */
    public int mo142860b() {
        return this.f100306c;
    }

    /* renamed from: d */
    public C38938a mo142862d() {
        if (this.f100305b) {
            return this.f100304a.f100052a;
        }
        return this.f100304a.f100053b;
    }

    /* renamed from: c */
    public List<C38938a> mo142861c() {
        ArrayList arrayList = new ArrayList();
        if (this.f100304a.f100052a != null) {
            arrayList.add(this.f100304a.f100052a);
        }
        if (this.f100304a.f100053b != null) {
            arrayList.add(this.f100304a.f100053b);
        }
        return arrayList;
    }

    /* renamed from: a */
    public List<Integer> mo142858a() {
        List<C38938a.C38939a> list = this.f100304a.mo142538a().f100041e.f100051c;
        ArrayList arrayList = new ArrayList();
        for (C38938a.C38939a aVar : list) {
            arrayList.add(Integer.valueOf(aVar.f100042a));
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo142859a(C38938a aVar) {
        this.f100305b = aVar.f100039c;
    }

    /* renamed from: a */
    public static C39064b m154174a(C38941b bVar) {
        if (bVar == null) {
            return null;
        }
        C39064b bVar2 = new C39064b();
        bVar2.f100304a = bVar;
        bVar2.f100305b = bVar.f100054c;
        if (bVar.mo142538a() != null) {
            bVar2.f100306c = bVar.mo142538a().f100037a;
        }
        return bVar2;
    }
}
