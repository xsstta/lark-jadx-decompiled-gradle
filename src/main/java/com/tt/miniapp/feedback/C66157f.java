package com.tt.miniapp.feedback;

import com.tt.miniapp.util.MiniAppDateUtils;

/* renamed from: com.tt.miniapp.feedback.f */
public class C66157f {
    /* renamed from: a */
    public static String m259066a(Object... objArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(MiniAppDateUtils.m261181b(System.currentTimeMillis()));
        sb.append(" ");
        for (Object obj : objArr) {
            sb.append(" ");
            if (obj != null) {
                sb.append(obj);
            } else {
                sb.append("null");
            }
        }
        sb.append("\n");
        return sb.toString();
    }
}
