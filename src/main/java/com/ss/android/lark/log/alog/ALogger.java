package com.ss.android.lark.log.alog;

import android.text.TextUtils;
import com.ss.android.lark.log.AbstractC41687a;
import com.ss.android.lark.log.C41702d;
import com.ss.android.lark.log.LogLevel;
import com.ss.android.vc.statistics.p3180a.C63690d;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010$\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J&\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u001c\u0010\f\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J&\u0010\f\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016JU\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\b2\u0010\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00122\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0018\u0010\u0013\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0014H\u0016¢\u0006\u0002\u0010\u0015J\u001c\u0010\u0016\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J&\u0010\u0016\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J&\u0010\u0017\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\bH\u0016J\u001c\u0010\u0019\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J&\u0010\u0019\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u001c\u0010\u001a\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J&\u0010\u001a\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u001c\u0010\u001b\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J&\u0010\u001b\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J&\u0010\u001c\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/log/alog/ALogger;", "Lcom/ss/android/lark/log/BaseLogger;", "logConfig", "Lcom/ss/android/lark/log/LogConfig;", "(Lcom/ss/android/lark/log/LogConfig;)V", C63690d.f160779a, "", "tag", "", "msg", "tr", "", "e", "event", "level", "", "logId", "tags", "", "params", "", "(ILjava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "i", "json", "jsonContent", "v", "w", "wtf", "xml", "xmlContent", "logger_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.log.alog.e */
public final class ALogger extends AbstractC41687a {
    public ALogger(C41702d dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "logConfig");
        ALogDelegate.f105876g.mo149933a(dVar);
    }

    @Override // com.ss.android.lark.log.AbstractC41701c, com.ss.android.lark.log.AbstractC41687a
    /* renamed from: a */
    public void mo149895a(String str, String str2) {
        ALogDelegate c = ALogDelegate.f105876g.mo149937c();
        if (c != null) {
            c.mo149928c(str, str2);
        }
    }

    @Override // com.ss.android.lark.log.AbstractC41701c, com.ss.android.lark.log.AbstractC41687a
    /* renamed from: b */
    public void mo149898b(String str, String str2) {
        ALogDelegate c = ALogDelegate.f105876g.mo149937c();
        if (c != null) {
            c.mo149924a(str, str2);
        }
    }

    @Override // com.ss.android.lark.log.AbstractC41701c, com.ss.android.lark.log.AbstractC41687a
    /* renamed from: c */
    public void mo149901c(String str, String str2) {
        ALogDelegate c = ALogDelegate.f105876g.mo149937c();
        if (c != null) {
            c.mo149926b(str, str2);
        }
    }

    @Override // com.ss.android.lark.log.AbstractC41701c, com.ss.android.lark.log.AbstractC41687a
    /* renamed from: d */
    public void mo149903d(String str, String str2) {
        ALogDelegate c = ALogDelegate.f105876g.mo149937c();
        if (c != null) {
            c.mo149929d(str, str2);
        }
    }

    @Override // com.ss.android.lark.log.AbstractC41701c, com.ss.android.lark.log.AbstractC41687a
    /* renamed from: e */
    public void mo149905e(String str, String str2) {
        ALogDelegate c = ALogDelegate.f105876g.mo149937c();
        if (c != null) {
            c.mo149930e(str, str2);
        }
    }

    @Override // com.ss.android.lark.log.AbstractC41701c, com.ss.android.lark.log.AbstractC41687a
    /* renamed from: f */
    public void mo149907f(String str, String str2, Throwable th) {
        ALogDelegate c = ALogDelegate.f105876g.mo149937c();
        if (c != null) {
            c.mo149927b(str, str2, th);
        }
    }

    @Override // com.ss.android.lark.log.AbstractC41701c, com.ss.android.lark.log.AbstractC41687a
    /* renamed from: a */
    public void mo149897a(String str, String str2, Throwable th) {
        ALogDelegate c = ALogDelegate.f105876g.mo149937c();
        if (c != null) {
            c.mo149927b(str, str2, th);
        }
    }

    @Override // com.ss.android.lark.log.AbstractC41701c, com.ss.android.lark.log.AbstractC41687a
    /* renamed from: e */
    public void mo149906e(String str, String str2, Throwable th) {
        ALogDelegate c = ALogDelegate.f105876g.mo149937c();
        if (c != null) {
            c.mo149925a(str, str2, th);
        }
    }

    @Override // com.ss.android.lark.log.AbstractC41701c, com.ss.android.lark.log.AbstractC41687a
    /* renamed from: a */
    public void mo149896a(String str, String str2, String str3) {
        String str4 = "msg: " + str2 + ", jsonContent: " + str3;
        ALogDelegate c = ALogDelegate.f105876g.mo149937c();
        if (c != null) {
            c.mo149928c(str, str4);
        }
    }

    @Override // com.ss.android.lark.log.AbstractC41701c, com.ss.android.lark.log.AbstractC41687a
    /* renamed from: b */
    public void mo149899b(String str, String str2, String str3) {
        String str4 = "msg: " + str2 + ", xmlContent: " + str3;
        ALogDelegate c = ALogDelegate.f105876g.mo149937c();
        if (c != null) {
            c.mo149928c(str, str4);
        }
    }

    @Override // com.ss.android.lark.log.AbstractC41701c, com.ss.android.lark.log.AbstractC41687a
    /* renamed from: c */
    public void mo149902c(String str, String str2, Throwable th) {
        String str3 = "msg: " + str2 + ", tr: " + th;
        ALogDelegate c = ALogDelegate.f105876g.mo149937c();
        if (c != null) {
            c.mo149924a(str, str3);
        }
    }

    @Override // com.ss.android.lark.log.AbstractC41701c, com.ss.android.lark.log.AbstractC41687a
    /* renamed from: d */
    public void mo149904d(String str, String str2, Throwable th) {
        String str3 = "msg: " + str2 + ", tr: " + th;
        ALogDelegate c = ALogDelegate.f105876g.mo149937c();
        if (c != null) {
            c.mo149926b(str, str3);
        }
    }

    @Override // com.ss.android.lark.log.AbstractC41701c, com.ss.android.lark.log.AbstractC41687a
    /* renamed from: b */
    public void mo149900b(String str, String str2, Throwable th) {
        String str3 = "msg: " + str2 + ", tr: " + th;
        ALogDelegate c = ALogDelegate.f105876g.mo149937c();
        if (c != null) {
            c.mo149928c(str, str3);
        }
    }

    @Override // com.ss.android.lark.log.AbstractC41701c, com.ss.android.lark.log.AbstractC41687a
    /* renamed from: a */
    public void mo149894a(int i, String str, String[] strArr, String str2, Map<String, String> map) {
        String str3;
        ALogDelegate c;
        if (strArr == null) {
            str3 = "";
        } else {
            str3 = TextUtils.join(",", strArr);
        }
        String str4 = "logId: " + str + ", msg: " + str2 + ", extras: ";
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                str4 = str4 + " " + entry.getKey() + ": " + entry.getValue();
            }
        }
        if (i == LogLevel.VERBOSE.getNumber()) {
            ALogDelegate c2 = ALogDelegate.f105876g.mo149937c();
            if (c2 != null) {
                c2.mo149924a(str3, str4);
            }
        } else if (i == LogLevel.DEBUG.getNumber()) {
            ALogDelegate c3 = ALogDelegate.f105876g.mo149937c();
            if (c3 != null) {
                c3.mo149926b(str3, str4);
            }
        } else if (i == LogLevel.INFO.getNumber()) {
            ALogDelegate c4 = ALogDelegate.f105876g.mo149937c();
            if (c4 != null) {
                c4.mo149928c(str3, str4);
            }
        } else if (i == LogLevel.WARN.getNumber()) {
            ALogDelegate c5 = ALogDelegate.f105876g.mo149937c();
            if (c5 != null) {
                c5.mo149929d(str3, str4);
            }
        } else if (i == LogLevel.ERROR.getNumber() && (c = ALogDelegate.f105876g.mo149937c()) != null) {
            c.mo149930e(str3, str4);
        }
    }
}
