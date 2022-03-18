package com.ss.android.appcenter.common.util;

import com.huawei.hms.feature.dynamic.DynamicModule;
import com.tt.frontendapiinterface.ApiHandler;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.ss.android.appcenter.common.util.i */
public class C28186i {
    /* renamed from: a */
    public static String m103256a(String str) {
        if (str == null) {
            return "";
        }
        try {
            MessageDigest instance = MessageDigest.getInstance("md5");
            instance.update(str.getBytes());
            byte[] digest = instance.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                int i = b;
                if (b < 0) {
                    i = b + DynamicModule.f58006b;
                }
                if (i < 16) {
                    sb.append('0');
                }
                sb.append(Integer.toHexString(i == 1 ? 1 : 0));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            C28184h.m103247a("MD5Utils", ApiHandler.API_CALLBACK_EXCEPTION, e);
            return "";
        }
    }
}
