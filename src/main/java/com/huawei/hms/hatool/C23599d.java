package com.huawei.hms.hatool;

import android.util.Pair;
import com.huawei.secure.android.common.p1021a.p1022a.C23804a;
import com.huawei.secure.android.common.p1021a.p1026d.C23809b;
import java.nio.charset.Charset;

/* renamed from: com.huawei.hms.hatool.d */
public class C23599d {

    /* renamed from: a */
    public static final Charset f58187a = Charset.forName("UTF-8");

    /* renamed from: a */
    public static Pair<byte[], String> m85663a(String str) {
        if (str == null || str.length() < 32) {
            return new Pair<>(new byte[0], str);
        }
        String substring = str.substring(0, 32);
        return new Pair<>(C23809b.m87023a(substring), str.substring(32));
    }

    /* renamed from: a */
    public static String m85664a(String str, String str2) {
        Pair<byte[], String> a = m85663a(str);
        return new String(C23804a.m87005b(C23809b.m87023a((String) a.second), C23809b.m87023a(str2), (byte[]) a.first), f58187a);
    }

    /* renamed from: b */
    public static String m85665b(String str, String str2) {
        return C23809b.m87022a(C23804a.m87002a(str.getBytes(f58187a), C23809b.m87023a(str2)));
    }
}
