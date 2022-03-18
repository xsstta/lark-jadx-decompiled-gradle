package com.huawei.hms.site;

import android.text.TextUtils;
import android.util.Log;
import com.ss.ttm.player.MediaPlayer;
import java.util.regex.Pattern;

/* renamed from: com.huawei.hms.site.n */
public class C23762n {

    /* renamed from: a */
    public static final Pattern f58835a = Pattern.compile("[0-9]*[a-z|A-Z]*[一-龥]*");

    /* renamed from: com.huawei.hms.site.n$a */
    public static class C23763a extends Throwable {

        /* renamed from: a */
        public String f58836a;

        /* renamed from: b */
        public Throwable f58837b;

        /* renamed from: c */
        public Throwable f58838c;

        public C23763a(Throwable th) {
            this.f58838c = th;
        }

        public Throwable getCause() {
            Throwable th = this.f58837b;
            if (th == this) {
                return null;
            }
            return th;
        }

        public String getMessage() {
            return this.f58836a;
        }

        public String toString() {
            Throwable th = this.f58838c;
            if (th == null) {
                return "";
            }
            String name = th.getClass().getName();
            if (this.f58836a == null) {
                return name;
            }
            String str = name + ": ";
            if (this.f58836a.startsWith(str)) {
                return this.f58836a;
            }
            StringBuilder a = C23738a.m86922a(str);
            a.append(this.f58836a);
            return a.toString();
        }
    }

    /* renamed from: a */
    public static String m86937a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int length = str.length();
        int i = 1;
        if (1 == length) {
            return String.valueOf('*');
        }
        StringBuilder sb = new StringBuilder(length);
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (f58835a.matcher(String.valueOf(charAt)).matches()) {
                if (i % 2 == 0) {
                    charAt = '*';
                }
                i++;
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static String m86938a(String str, boolean z) {
        StringBuilder sb = new StringBuilder((int) MediaPlayer.MEDIA_PLAYER_OPTION_APPID);
        if (!TextUtils.isEmpty(str)) {
            if (z) {
                str = m86937a(str);
            }
            sb.append(str);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static void m86940a(String str, String str2, Throwable th, boolean z) {
        if (!TextUtils.isEmpty(str2) || th != null) {
            Log.e(str, m86938a(str2, z), m86939a(th));
        }
    }

    /* renamed from: a */
    public static void m86941a(String str, String str2, boolean z) {
        if (!TextUtils.isEmpty(str2)) {
            Log.d(str, m86938a(str2, z));
        }
    }

    /* renamed from: b */
    public static String m86942b(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (i % 2 == 0) {
                charArray[i] = '*';
            }
        }
        return new String(charArray);
    }

    /* renamed from: b */
    public static void m86943b(String str, String str2, boolean z) {
        if (!TextUtils.isEmpty(str2)) {
            Log.e(str, m86938a(str2, z));
        }
    }

    /* renamed from: c */
    public static void m86944c(String str, String str2, boolean z) {
        if (!TextUtils.isEmpty(str2)) {
            Log.i(str, m86938a(str2, z));
        }
    }

    /* renamed from: a */
    public static Throwable m86939a(Throwable th) {
        if (th == null) {
            return null;
        }
        C23763a aVar = new C23763a(th);
        aVar.setStackTrace(th.getStackTrace());
        aVar.f58836a = m86942b(th.getMessage());
        Throwable cause = th.getCause();
        C23763a aVar2 = aVar;
        while (cause != null) {
            C23763a aVar3 = new C23763a(cause);
            aVar3.setStackTrace(cause.getStackTrace());
            aVar3.f58836a = m86942b(cause.getMessage());
            aVar2.f58837b = aVar3;
            cause = cause.getCause();
            aVar2 = aVar3;
        }
        return aVar;
    }
}
