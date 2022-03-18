package com.ss.android.lark.browser.handler.translate;

import android.net.Uri;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.ss.android.lark.appsetting.annotation.AppConfig;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

@AppConfig(key = "web_translate_config")
public class WebTranslateConfig {
    @SerializedName("sample_text_max_content_length")

    /* renamed from: a */
    public int f74643a;
    @SerializedName("domain_control")

    /* renamed from: b */
    public C29920a f74644b;

    /* renamed from: com.ss.android.lark.browser.handler.translate.WebTranslateConfig$a */
    public static class C29920a {
        @SerializedName(ShareHitPoint.f121869d)

        /* renamed from: a */
        public String f74645a;
        @SerializedName("host_list")

        /* renamed from: b */
        public List<String> f74646b;
        @SerializedName("pattern_list")

        /* renamed from: c */
        public List<String> f74647c;

        /* renamed from: a */
        public boolean mo107781a(String str) {
            List<String> list;
            if ((!"allow".equalsIgnoreCase(this.f74645a) && !"deny".equalsIgnoreCase(this.f74645a)) || TextUtils.isEmpty(str)) {
                return true;
            }
            try {
                Uri parse = Uri.parse(str);
                String str2 = parse.getHost() + parse.getPath();
                if (TextUtils.isEmpty(str2)) {
                    return true;
                }
                boolean z = false;
                List<String> list2 = this.f74646b;
                if (list2 != null && list2.size() > 0) {
                    Iterator<String> it = this.f74646b.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (str2.startsWith(it.next())) {
                                z = true;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                if (!z && (list = this.f74647c) != null && list.size() > 0) {
                    Iterator<String> it2 = this.f74647c.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (Pattern.matches(it2.next(), str2)) {
                                z = true;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                if ("allow".equalsIgnoreCase(this.f74645a)) {
                    return z;
                }
                if ("deny".equalsIgnoreCase(this.f74645a)) {
                    return !z;
                }
                return true;
            } catch (Exception unused) {
                Log.m165383e("DomainControl", "Uri parse error,url=" + str);
                return true;
            }
        }
    }
}
