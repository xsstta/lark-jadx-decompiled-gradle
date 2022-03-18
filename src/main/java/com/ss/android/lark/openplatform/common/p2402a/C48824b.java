package com.ss.android.lark.openplatform.common.p2402a;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.ss.android.lark.sdk.C53241h;
import java.util.Random;

/* renamed from: com.ss.android.lark.openplatform.common.a.b */
public class C48824b {
    /* renamed from: a */
    private static String m192362a() {
        return m192363a(16);
    }

    /* renamed from: a */
    private static String m192363a(int i) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".charAt(random.nextInt(62)));
        }
        return sb.toString();
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:16:0x0055 */
    /* JADX DEBUG: Multi-variable search result rejected for r6v3, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.String] */
    /* renamed from: a */
    public static String[] m192364a(Context context) {
        String str = null;
        String str2 = "";
        String str3 = str2;
        for (int i = 3; i > 0; i--) {
            str2 = m192362a();
            str3 = m192362a();
            Object a = C48823a.m192359a(context, str2 + "#" + str3);
            if (a != 0) {
                str = Base64.encodeToString(a, 10);
            }
            if (!TextUtils.isEmpty(str)) {
                break;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("ttCode isEmpty. key:");
            sb.append(str2);
            sb.append(" iv:");
            sb.append(str3);
            sb.append(" secret:");
            if (a == 0) {
                a = "empty";
            }
            sb.append(a);
            C53241h.m205894a("", sb.toString());
        }
        return new String[]{str, str2, str3};
    }
}
