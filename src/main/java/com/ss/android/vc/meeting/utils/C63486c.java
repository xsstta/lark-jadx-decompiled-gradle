package com.ss.android.vc.meeting.utils;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.vc.meeting.utils.c */
public class C63486c<K, V> {

    /* renamed from: a */
    private Map<K, C63486c<K, V>.C63487a> f160391a = new HashMap();

    /* renamed from: b */
    private int f160392b = 0;

    /* renamed from: c */
    private int f160393c;

    /* renamed from: d */
    private C63486c<K, V>.C63487a f160394d;

    /* renamed from: e */
    private C63486c<K, V>.C63487a f160395e;

    /* renamed from: a */
    private C63486c<K, V>.C63487a m248799a() {
        C63486c<K, V>.C63487a aVar = this.f160395e.f160398c;
        m248801c(aVar);
        return aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.vc.meeting.utils.c$a */
    public class C63487a {

        /* renamed from: a */
        K f160396a;

        /* renamed from: b */
        V f160397b;

        /* renamed from: c */
        C63486c<K, V>.C63487a f160398c;

        /* renamed from: d */
        C63486c<K, V>.C63487a f160399d;

        C63487a() {
        }
    }

    /* renamed from: b */
    private void m248800b(C63486c<K, V>.C63487a aVar) {
        m248801c(aVar);
        m248802d(aVar);
    }

    /* renamed from: c */
    private void m248801c(C63486c<K, V>.C63487a aVar) {
        C63486c<K, V>.C63487a aVar2 = aVar.f160398c;
        C63486c<K, V>.C63487a aVar3 = aVar.f160399d;
        aVar2.f160399d = aVar3;
        aVar3.f160398c = aVar2;
    }

    /* renamed from: a */
    private int m248798a(C63486c<K, V>.C63487a aVar) {
        C63486c<K, V>.C63487a aVar2 = this.f160394d;
        int i = -1;
        while (aVar != null && aVar != this.f160395e && aVar.f160397b != aVar2.f160397b) {
            aVar2 = aVar2.f160399d;
            i++;
        }
        if (aVar2 == this.f160395e) {
            return -1;
        }
        return i;
    }

    /* renamed from: d */
    private void m248802d(C63486c<K, V>.C63487a aVar) {
        aVar.f160398c = this.f160394d;
        aVar.f160399d = this.f160394d.f160399d;
        this.f160394d.f160399d.f160398c = aVar;
        this.f160394d.f160399d = aVar;
    }

    /* renamed from: b */
    public void mo219633b(K k) {
        C63486c<K, V>.C63487a aVar = this.f160391a.get(k);
        if (aVar != null) {
            m248801c(aVar);
            this.f160391a.remove(k);
        }
    }

    public C63486c(int i) {
        this.f160393c = i;
        this.f160394d = new C63487a();
        C63486c<K, V>.C63487a aVar = new C63487a();
        this.f160395e = aVar;
        this.f160394d.f160399d = aVar;
        this.f160395e.f160398c = this.f160394d;
    }

    /* renamed from: a */
    public int mo219631a(K k) {
        C63486c<K, V>.C63487a aVar = this.f160391a.get(k);
        if (aVar == null) {
            return -1;
        }
        return m248798a(aVar);
    }

    /* renamed from: a */
    public void mo219632a(K k, V v) {
        C63486c<K, V>.C63487a aVar = this.f160391a.get(k);
        if (aVar == null) {
            C63486c<K, V>.C63487a aVar2 = new C63487a();
            aVar2.f160396a = k;
            aVar2.f160397b = v;
            this.f160391a.put(k, aVar2);
            m248802d(aVar2);
            int i = this.f160392b + 1;
            this.f160392b = i;
            if (i > this.f160393c) {
                this.f160391a.remove(m248799a().f160396a);
                this.f160392b--;
                return;
            }
            return;
        }
        aVar.f160397b = v;
        m248800b(aVar);
    }
}
