package com.ss.android.lark.platform.p2482c;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.lark.platform.c.c */
public class C51792c {

    /* renamed from: a */
    private Map<Integer, Integer> f128736a = new HashMap();

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.platform.c.c$a */
    public static final class C51793a {

        /* renamed from: a */
        public static final C51792c f128737a = new C51792c();
    }

    /* renamed from: com.ss.android.lark.platform.c.c$b */
    public interface AbstractC51794b {
        /* renamed from: a */
        void mo177909a(int i, int i2);
    }

    /* renamed from: a */
    public static C51792c m200792a() {
        return C51793a.f128737a;
    }

    /* renamed from: a */
    public void mo177906a(int i) {
        this.f128736a.remove(Integer.valueOf(i));
    }

    /* renamed from: a */
    public void mo177907a(int i, int i2) {
        this.f128736a.put(Integer.valueOf(i), Integer.valueOf(i2));
    }

    /* renamed from: a */
    public void mo177908a(int i, int i2, AbstractC51794b bVar) {
        Integer num = this.f128736a.get(Integer.valueOf(i));
        if (num != null && num.intValue() != i2) {
            this.f128736a.put(Integer.valueOf(i), Integer.valueOf(i2));
            if (bVar != null) {
                bVar.mo177909a(num.intValue(), i2);
            }
        }
    }
}
