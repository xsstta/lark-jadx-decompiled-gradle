package com.ss.android.lark.threadwindow;

import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.threadwindow.AbstractC56050c;
import com.ss.android.lark.threadwindow.fragment.AbstractC56087e;
import com.ss.android.lark.threadwindow.fragment.AbstractC56088f;
import com.ss.android.lark.threadwindow.fragment.C56067a;
import com.ss.android.lark.threadwindow.fragment.p2765a.C56077a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ThreadWindowFragmentFactory {

    /* renamed from: a */
    Map<Integer, List<C55992a>> f138395a = new HashMap();

    /* renamed from: b */
    private final AbstractC56087e f138396b;

    /* renamed from: c */
    private final AbstractC56050c.AbstractC56053b.AbstractC56054a f138397c;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Topic_Type {
    }

    /* renamed from: a */
    private void m217648a() {
        ArrayList arrayList = new ArrayList();
        C56067a aVar = new C56067a();
        aVar.mo104652d(false);
        arrayList.add(m217647a(0, R.string.Lark_Chat_TopicFilterAll, aVar));
        C56077a aVar2 = new C56077a();
        aVar2.mo104652d(false);
        arrayList.add(m217647a(7, R.string.Lark_Groups_TopicFilterFollowed, aVar2));
        this.f138395a.put(0, arrayList);
    }

    /* renamed from: c */
    public List<C55992a> mo190887c(int i) {
        List<C55992a> list = this.f138395a.get(Integer.valueOf(i));
        if (list == null) {
            return new ArrayList();
        }
        return list;
    }

    /* renamed from: b */
    public List<AbstractC56088f> mo190886b(int i) {
        List<C55992a> list = this.f138395a.get(Integer.valueOf(i));
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (C55992a aVar : list) {
            arrayList.add(aVar.f138400c);
        }
        return arrayList;
    }

    /* renamed from: d */
    public Map<Integer, Integer> mo190888d(int i) {
        List<C55992a> list = this.f138395a.get(Integer.valueOf(i));
        if (list == null) {
            return new HashMap();
        }
        HashMap hashMap = new HashMap();
        for (int i2 = 0; i2 < list.size(); i2++) {
            hashMap.put(list.get(i2).f138398a, Integer.valueOf(i2));
        }
        return hashMap;
    }

    /* renamed from: a */
    public List<String> mo190885a(int i) {
        List<C55992a> list = this.f138395a.get(Integer.valueOf(i));
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (C55992a aVar : list) {
            arrayList.add(aVar.f138399b);
        }
        return arrayList;
    }

    public ThreadWindowFragmentFactory(AbstractC56087e eVar, AbstractC56050c.AbstractC56053b.AbstractC56054a aVar) {
        this.f138396b = eVar;
        this.f138397c = aVar;
        m217648a();
    }

    /* renamed from: com.ss.android.lark.threadwindow.ThreadWindowFragmentFactory$a */
    public static class C55992a {

        /* renamed from: a */
        public Integer f138398a;

        /* renamed from: b */
        public String f138399b;

        /* renamed from: c */
        public AbstractC56088f f138400c;

        public C55992a(Integer num, String str, AbstractC56088f fVar) {
            this.f138398a = num;
            this.f138399b = str;
            this.f138400c = fVar;
        }
    }

    /* renamed from: a */
    private C55992a m217647a(Integer num, int i, AbstractC56088f fVar) {
        fVar.mo191355a(this.f138396b);
        return new C55992a(num, UIUtils.getString(C29990c.m110930b().mo134528a(), i), fVar);
    }
}
