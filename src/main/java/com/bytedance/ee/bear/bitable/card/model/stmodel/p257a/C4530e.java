package com.bytedance.ee.bear.bitable.card.model.stmodel.p257a;

import android.text.TextUtils;
import com.bytedance.ee.bear.bitable.card.model.enums.EFieldType;
import com.bytedance.ee.bear.bitable.card.model.stmodel.C4535b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.bitable.card.model.stmodel.a.e */
public class C4530e extends C4533g {

    /* renamed from: a */
    private List<C4531a> f13316a;

    /* renamed from: com.bytedance.ee.bear.bitable.card.model.stmodel.a.e$a */
    public static class C4531a {

        /* renamed from: a */
        private String f13317a;

        /* renamed from: b */
        private String f13318b;

        /* renamed from: c */
        private int f13319c;

        /* renamed from: d */
        private String f13320d;

        /* renamed from: e */
        private String f13321e;

        /* renamed from: a */
        public String mo17731a() {
            return this.f13317a;
        }

        /* renamed from: b */
        public String mo17734b() {
            return this.f13318b;
        }

        /* renamed from: c */
        public int mo17736c() {
            return this.f13319c;
        }

        /* renamed from: d */
        public String mo17738d() {
            return this.f13320d;
        }

        /* renamed from: e */
        public String mo17739e() {
            return this.f13321e;
        }

        /* renamed from: a */
        public void mo17732a(int i) {
            this.f13319c = i;
        }

        /* renamed from: b */
        public void mo17735b(String str) {
            this.f13320d = str;
        }

        /* renamed from: c */
        public void mo17737c(String str) {
            this.f13321e = str;
        }

        /* renamed from: a */
        public void mo17733a(String str) {
            this.f13318b = str;
        }

        public C4531a(String str, String str2, int i, String str3, String str4) {
            this.f13317a = str;
            this.f13318b = str2;
            this.f13319c = i;
            this.f13320d = str3;
            this.f13321e = str4;
        }
    }

    /* renamed from: a */
    public List<C4531a> mo17727a() {
        return this.f13316a;
    }

    /* renamed from: a */
    public C4531a mo17726a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (C4531a aVar : this.f13316a) {
            if (str.equals(aVar.mo17731a())) {
                return aVar;
            }
        }
        return null;
    }

    /* renamed from: b */
    public int mo17729b(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        int size = this.f13316a.size();
        for (int i = 0; i < size; i++) {
            if (TextUtils.equals(this.f13316a.get(i).mo17731a(), str)) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public List<C4531a> mo17728a(List<String> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            C4531a a = mo17726a(str);
            if (a != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public List<Integer> mo17730b(List<String> list) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        int size = this.f13316a.size();
        for (String str : list) {
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                } else if (TextUtils.equals(this.f13316a.get(i).mo17731a(), str)) {
                    arrayList.add(Integer.valueOf(i));
                    break;
                } else {
                    i++;
                }
            }
        }
        return arrayList;
    }

    public C4530e(C4535b bVar, String str, String str2, EFieldType eFieldType, List<C4531a> list, boolean z) {
        super(bVar, eFieldType, str, str2, z);
        this.f13316a = list;
    }
}
