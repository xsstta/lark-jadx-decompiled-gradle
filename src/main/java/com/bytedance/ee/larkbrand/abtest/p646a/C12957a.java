package com.bytedance.ee.larkbrand.abtest.p646a;

import com.bytedance.ee.larkbrand.abtest.experiment.C12959b;
import com.bytedance.ee.larkbrand.abtest.experiment.C12963f;
import com.bytedance.ee.larkbrand.abtest.experiment.C12966i;
import com.bytedance.ee.larkbrand.abtest.experiment.C12967j;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.larkbrand.abtest.a.a */
public class C12957a {
    /* renamed from: a */
    public static JSONObject m53363a(String str) {
        if (str == null) {
            return null;
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1166142097:
                if (str.equals("pre_render_config")) {
                    c = 0;
                    break;
                }
                break;
            case -1113515482:
                if (str.equals("preloadSP")) {
                    c = 1;
                    break;
                }
                break;
            case -593831248:
                if (str.equals("code_cache")) {
                    c = 2;
                    break;
                }
                break;
            case -181311971:
                if (str.equals("snapshot_config")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return C12963f.m53375b();
            case 1:
                return C12966i.m53384b();
            case 2:
                return C12959b.m53367c();
            case 3:
                return C12967j.m53389b();
            default:
                return new JSONObject();
        }
    }
}
