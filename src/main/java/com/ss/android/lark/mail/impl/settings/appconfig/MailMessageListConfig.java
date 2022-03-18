package com.ss.android.lark.mail.impl.settings.appconfig;

import com.google.gson.annotations.SerializedName;
import com.ss.android.lark.appsetting.annotation.AppConfig;
import java.util.List;

@AppConfig(key = "mail_config")
public class MailMessageListConfig {
    @SerializedName("renderTimeout")

    /* renamed from: a */
    public List<C43394a> f110281a;

    public String toString() {
        return "{timeoutConfigList=" + this.f110281a + '}';
    }

    /* renamed from: com.ss.android.lark.mail.impl.settings.appconfig.MailMessageListConfig$a */
    public static class C43394a {
        @SerializedName("dataLen")

        /* renamed from: a */
        public int f110282a;
        @SerializedName("time")

        /* renamed from: b */
        public int f110283b;

        public String toString() {
            return "{dataLen=" + this.f110282a + ", time=" + this.f110283b + '}';
        }
    }
}
