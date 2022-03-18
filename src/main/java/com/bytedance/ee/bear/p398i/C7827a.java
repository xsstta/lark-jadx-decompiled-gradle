package com.bytedance.ee.bear.p398i;

import com.bytedance.ee.bear.bean.C4517a;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.bear.i.a */
public class C7827a implements Cloneable {

    /* renamed from: a */
    public final String f21134a;

    /* renamed from: b */
    public C4517a[] f21135b;

    /* renamed from: c */
    public C7838i[] f21136c;

    public C7827a() {
        this("", new C4517a[0], new C7838i[0]);
    }

    /* renamed from: a */
    public C7827a clone() {
        try {
            C7827a aVar = (C7827a) super.clone();
            C4517a[] aVarArr = this.f21135b;
            int i = 0;
            if (aVarArr != null) {
                C4517a[] aVarArr2 = (C4517a[]) aVarArr.clone();
                aVar.f21135b = aVarArr2;
                if (aVarArr2 != null) {
                    int i2 = 0;
                    while (true) {
                        C4517a[] aVarArr3 = this.f21135b;
                        if (i2 >= aVarArr3.length) {
                            break;
                        }
                        aVar.f21135b[i2] = aVarArr3[i2].clone();
                        i2++;
                    }
                }
            }
            C7838i[] iVarArr = this.f21136c;
            if (iVarArr != null) {
                C7838i[] iVarArr2 = (C7838i[]) iVarArr.clone();
                aVar.f21136c = iVarArr2;
                if (iVarArr2 != null) {
                    while (true) {
                        C7838i[] iVarArr3 = this.f21136c;
                        if (i >= iVarArr3.length) {
                            break;
                        }
                        aVar.f21136c[i] = iVarArr3[i].clone();
                        i++;
                    }
                }
            }
            return aVar;
        } catch (CloneNotSupportedException e) {
            C13479a.m54759a("AtContent", "colen AtContent failed", e);
            return new C7827a();
        }
    }

    public C7827a(String str, C4517a[] aVarArr, C7838i[] iVarArr) {
        this.f21134a = str;
        this.f21135b = aVarArr;
        this.f21136c = iVarArr;
    }
}
