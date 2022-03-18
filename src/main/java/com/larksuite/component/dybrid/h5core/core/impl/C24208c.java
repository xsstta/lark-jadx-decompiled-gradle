package com.larksuite.component.dybrid.h5core.core.impl;

import android.os.Bundle;
import com.larksuite.component.dybrid.h5api.api.H5Param;
import com.larksuite.component.dybrid.h5core.p1082h.C24246a;

/* renamed from: com.larksuite.component.dybrid.h5core.core.impl.c */
public class C24208c {

    /* renamed from: a */
    private String f59835a;

    /* renamed from: b */
    private String f59836b;

    /* renamed from: c */
    private H5Param.ParamType f59837c;

    /* renamed from: d */
    private Object f59838d;

    /* renamed from: a */
    public String mo86842a() {
        return this.f59835a;
    }

    /* renamed from: b */
    public String mo86843b() {
        return this.f59836b;
    }

    /* renamed from: a */
    public Bundle mo86841a(Bundle bundle, boolean z) {
        if (!z && !C24246a.m88566b(bundle, this.f59835a) && !C24246a.m88566b(bundle, this.f59836b)) {
            return bundle;
        }
        if (H5Param.ParamType.BOOLEAN == this.f59837c) {
            boolean booleanValue = ((Boolean) this.f59838d).booleanValue();
            Object obj = null;
            if (bundle.containsKey(this.f59836b)) {
                obj = bundle.get(this.f59836b);
            } else if (bundle.containsKey(this.f59835a)) {
                obj = bundle.get(this.f59835a);
            }
            if (obj instanceof String) {
                String str = (String) obj;
                if ("YES".equalsIgnoreCase(str)) {
                    booleanValue = true;
                } else if ("NO".equalsIgnoreCase(str)) {
                    booleanValue = false;
                }
            } else if (obj instanceof Boolean) {
                booleanValue = ((Boolean) obj).booleanValue();
            }
            bundle.putBoolean(this.f59835a, booleanValue);
        } else if (H5Param.ParamType.STRING == this.f59837c) {
            String str2 = (String) this.f59838d;
            if (C24246a.m88566b(bundle, this.f59836b)) {
                str2 = C24246a.m88556a(bundle, this.f59836b, str2);
            } else if (C24246a.m88566b(bundle, this.f59835a)) {
                str2 = C24246a.m88556a(bundle, this.f59835a, str2);
            }
            bundle.putString(this.f59835a, str2);
        } else if (H5Param.ParamType.INT.equals(this.f59837c)) {
            int intValue = ((Integer) this.f59838d).intValue();
            if (C24246a.m88566b(bundle, this.f59836b)) {
                intValue = C24246a.m88549a(bundle, this.f59836b, intValue);
            } else if (C24246a.m88566b(bundle, this.f59835a)) {
                intValue = C24246a.m88549a(bundle, this.f59835a, intValue);
            }
            bundle.putInt(this.f59835a, intValue);
        } else if (H5Param.ParamType.DOUBLE.equals(this.f59837c)) {
            double doubleValue = ((Double) this.f59838d).doubleValue();
            if (C24246a.m88566b(bundle, this.f59836b)) {
                doubleValue = C24246a.m88548a(bundle, this.f59836b, doubleValue);
            } else if (C24246a.m88566b(bundle, this.f59835a)) {
                doubleValue = C24246a.m88548a(bundle, this.f59835a, doubleValue);
            }
            bundle.putDouble(this.f59835a, doubleValue);
        }
        bundle.remove(this.f59836b);
        return bundle;
    }

    public C24208c(String str, String str2, H5Param.ParamType paramType, Object obj) {
        this.f59836b = str;
        this.f59835a = str2;
        this.f59837c = paramType;
        this.f59838d = obj;
    }
}
