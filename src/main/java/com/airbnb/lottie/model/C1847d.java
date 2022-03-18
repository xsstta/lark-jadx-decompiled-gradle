package com.airbnb.lottie.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.airbnb.lottie.model.d */
public class C1847d {

    /* renamed from: a */
    public static final C1847d f6370a = new C1847d("COMPOSITION");

    /* renamed from: b */
    private final List<String> f6371b;

    /* renamed from: c */
    private AbstractC1848e f6372c;

    /* renamed from: a */
    public AbstractC1848e mo9256a() {
        return this.f6372c;
    }

    /* renamed from: b */
    private boolean m8278b() {
        List<String> list = this.f6371b;
        return list.get(list.size() - 1).equals("**");
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder();
        sb.append("KeyPath{keys=");
        sb.append(this.f6371b);
        sb.append(",resolved=");
        if (this.f6372c != null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: b */
    private boolean m8279b(String str) {
        return "__container".equals(str);
    }

    /* renamed from: a */
    public C1847d mo9254a(AbstractC1848e eVar) {
        C1847d dVar = new C1847d(this);
        dVar.f6372c = eVar;
        return dVar;
    }

    public C1847d(String... strArr) {
        this.f6371b = Arrays.asList(strArr);
    }

    /* renamed from: a */
    public C1847d mo9255a(String str) {
        C1847d dVar = new C1847d(this);
        dVar.f6371b.add(str);
        return dVar;
    }

    private C1847d(C1847d dVar) {
        this.f6371b = new ArrayList(dVar.f6371b);
        this.f6372c = dVar.f6372c;
    }

    /* renamed from: b */
    public int mo9258b(String str, int i) {
        if (m8279b(str)) {
            return 0;
        }
        if (!this.f6371b.get(i).equals("**")) {
            return 1;
        }
        if (i != this.f6371b.size() - 1 && this.f6371b.get(i + 1).equals(str)) {
            return 2;
        }
        return 0;
    }

    /* renamed from: d */
    public boolean mo9260d(String str, int i) {
        if (!"__container".equals(str) && i >= this.f6371b.size() - 1 && !this.f6371b.get(i).equals("**")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo9257a(String str, int i) {
        if (m8279b(str)) {
            return true;
        }
        if (i >= this.f6371b.size()) {
            return false;
        }
        if (this.f6371b.get(i).equals(str) || this.f6371b.get(i).equals("**") || this.f6371b.get(i).equals("*")) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public boolean mo9259c(String str, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        if (i >= this.f6371b.size()) {
            return false;
        }
        if (i == this.f6371b.size() - 1) {
            z = true;
        } else {
            z = false;
        }
        String str2 = this.f6371b.get(i);
        if (!str2.equals("**")) {
            if (str2.equals(str) || str2.equals("*")) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((z || (i == this.f6371b.size() - 2 && m8278b())) && z3) {
                return true;
            }
            return false;
        }
        if (z || !this.f6371b.get(i + 1).equals(str)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            if (i == this.f6371b.size() - 2 || (i == this.f6371b.size() - 3 && m8278b())) {
                return true;
            }
            return false;
        } else if (z) {
            return true;
        } else {
            int i2 = i + 1;
            if (i2 < this.f6371b.size() - 1) {
                return false;
            }
            return this.f6371b.get(i2).equals(str);
        }
    }
}
