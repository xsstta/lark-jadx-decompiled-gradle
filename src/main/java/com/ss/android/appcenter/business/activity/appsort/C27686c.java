package com.ss.android.appcenter.business.activity.appsort;

import com.ss.android.appcenter.business.net.dto.ItemInfo;
import com.ss.android.appcenter.business.net.useritems.UserItemsData;
import com.ss.android.appcenter.business.p1265a.C27569b;
import com.ss.android.appcenter.common.util.C28182f;
import com.ss.android.appcenter.common.util.C28184h;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.appcenter.business.activity.appsort.c */
public class C27686c {

    /* renamed from: a */
    private List<Integer> f69175a;

    /* renamed from: b */
    private List<ItemInfo> f69176b;

    /* renamed from: c */
    private List<ItemInfo> f69177c;

    /* renamed from: d */
    private List<ItemInfo> f69178d;

    /* renamed from: e */
    private List<Integer> f69179e = new ArrayList();

    /* renamed from: f */
    public List<Integer> mo98644f() {
        return C28182f.m103237b(this.f69179e);
    }

    /* renamed from: e */
    public List<Integer> mo98643e() {
        if (this.f69175a == null) {
            this.f69175a = new ArrayList();
        }
        return this.f69175a;
    }

    /* renamed from: a */
    public boolean mo98639a() {
        if (!C28182f.m103238c(this.f69176b) || !C28182f.m103238c(this.f69177c) || !C28182f.m103238c(this.f69178d)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public List<ItemInfo> mo98640b() {
        if (C28182f.m103238c(this.f69176b)) {
            this.f69176b = new ArrayList();
        }
        return this.f69176b;
    }

    /* renamed from: c */
    public List<ItemInfo> mo98641c() {
        if (C28182f.m103238c(this.f69177c)) {
            this.f69177c = new ArrayList();
        }
        return this.f69177c;
    }

    /* renamed from: d */
    public List<ItemInfo> mo98642d() {
        if (C28182f.m103238c(this.f69178d)) {
            this.f69178d = new ArrayList();
        }
        return this.f69178d;
    }

    /* renamed from: a */
    public static C27686c m101189a(UserItemsData userItemsData) {
        Map<String, ItemInfo> allItemInfos = userItemsData.getAllItemInfos();
        if (allItemInfos == null) {
            C28184h.m103250d("App_Sort_Page", "UserItemsData item map is empty");
            C27686c cVar = new C27686c();
            if (C27569b.m100618a()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(4);
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(0);
                cVar.f69175a = arrayList2;
                cVar.f69179e = arrayList;
            }
            return cVar;
        }
        C27686c cVar2 = new C27686c();
        ArrayList arrayList3 = new ArrayList();
        if (C27569b.m100618a()) {
            arrayList3.add(4);
            ArrayList arrayList4 = new ArrayList();
            arrayList4.add(0);
            cVar2.f69175a = arrayList4;
        }
        List<ItemInfo> a = m101190a(userItemsData.getRecommendItemList(), allItemInfos);
        if (!a.isEmpty()) {
            cVar2.f69176b = a;
            arrayList3.add(1);
        }
        List<ItemInfo> a2 = m101190a(userItemsData.getCommonWidgetItemList(), allItemInfos);
        if (!a2.isEmpty()) {
            cVar2.f69177c = a2;
            arrayList3.add(2);
        }
        List<ItemInfo> a3 = m101190a(userItemsData.getCommonIconItemList(), allItemInfos);
        if (!a3.isEmpty()) {
            cVar2.f69178d = a3;
            arrayList3.add(3);
        }
        cVar2.f69179e = arrayList3;
        return cVar2;
    }

    /* renamed from: a */
    private static List<ItemInfo> m101190a(List<String> list, Map<String, ItemInfo> map) {
        ArrayList arrayList = new ArrayList();
        if (C28182f.m103238c(list)) {
            return arrayList;
        }
        for (String str : list) {
            ItemInfo itemInfo = map.get(str);
            if (itemInfo != null) {
                arrayList.add(itemInfo);
            }
        }
        return arrayList;
    }
}
