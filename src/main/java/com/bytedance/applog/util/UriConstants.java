package com.bytedance.applog.util;

import com.bytedance.applog.C3426k;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class UriConstants {

    /* renamed from: a */
    private static final C3426k f10961a = new C3426k.C3428a().mo13780a("https://log.isnssdk.com/service/2/device_register/").mo13783b("https://ichannel.isnssdk.com/service/2/app_alert_check/").mo13781a(new String[]{"https://log.isnssdk.com/service/2/app_log/"}).mo13784b(new String[]{"https://rtlog.isnssdk.com/service/2/app_log/"}).mo13785c("https://log.isnssdk.com/service/2/log_settings/").mo13782a();

    /* renamed from: b */
    private static final C3426k f10962b = new C3426k.C3428a().mo13780a("https://log.sgsnssdk.com/service/2/device_register/").mo13783b("https://ichannel.sgsnssdk.com/service/2/app_alert_check/").mo13781a(new String[]{"https://log.sgsnssdk.com/service/2/app_log/"}).mo13784b(new String[]{"https://rtlog.sgsnssdk.com/service/2/app_log/"}).mo13785c("https://log.sgsnssdk.com/service/2/log_settings/").mo13782a();

    /* renamed from: c */
    private static final C3426k f10963c = new C3426k.C3428a().mo13780a("https://log.byteoversea.com/service/2/device_register/").mo13783b("https://i.byteoversea.com/service/2/app_alert_check/").mo13781a(new String[]{"https://log.byteoversea.com/service/2/app_log/", "https://log15.byteoversea.com/service/2/app_log/"}).mo13784b(new String[]{"https://rtlog.byteoversea.com/service/2/app_log/"}).mo13785c("https://log.byteoversea.com/service/2/log_settings/").mo13782a();

    /* renamed from: d */
    private static final C3426k f10964d = new C3426k.C3428a().mo13780a("https://toblog.tobsnssdk.com/service/2/device_register/").mo13783b("https://toblog.tobsnssdk.com/service/2/app_alert_check/").mo13781a(new String[]{"https://toblog.tobsnssdk.com/service/2/app_log/", "https://tobapplog.tobsnssdk.com/service/2/app_log/"}).mo13785c("https://toblog.tobsnssdk.com/service/2/log_settings/").mo13786d("https://toblog.tobsnssdk.com/service/2/abtest_config/").mo13787e("https://success.tobsnssdk.com/service/2/app_log/").mo13782a();

    /* renamed from: e */
    private static final C3426k f10965e = new C3426k.C3428a().mo13780a("https://toblog.itobsnssdk.com/service/2/device_register/").mo13783b("https://toblog.itobsnssdk.com/service/2/app_alert_check/").mo13781a(new String[]{"https://toblog.itobsnssdk.com/service/2/app_log/", "https://tobapplog.itobsnssdk.com/service/2/app_log/"}).mo13785c("https://toblog.itobsnssdk.com/service/2/log_settings/").mo13786d("https://toblog.itobsnssdk.com/service/2/abtest_config/").mo13787e("https://success.itobsnssdk.com/service/2/app_log/").mo13782a();

    @Retention(RetentionPolicy.SOURCE)
    public @interface UriRegion {
    }

    /* renamed from: a */
    public static final C3426k m14576a(int i) {
        if (i == 1) {
            return f10962b;
        }
        if (i != 3) {
            return f10961a;
        }
        return f10963c;
    }
}
