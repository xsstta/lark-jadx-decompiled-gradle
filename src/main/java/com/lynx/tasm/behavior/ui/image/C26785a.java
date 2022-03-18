package com.lynx.tasm.behavior.ui.image;

import android.content.Context;
import android.text.TextUtils;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.AbstractC26674h;
import com.lynx.tasm.behavior.AbstractC26684l;

/* renamed from: com.lynx.tasm.behavior.ui.image.a */
public class C26785a {
    /* renamed from: a */
    public static String m97218a(Context context, String str) {
        AbstractC26684l lVar;
        AbstractC26674h c;
        String a;
        if (!(context instanceof AbstractC26684l) || TextUtils.isEmpty(str) || (c = (lVar = (AbstractC26684l) context).mo94677c()) == null || (a = m97219a(c, str, lVar.mo94691m())) == null) {
            return str;
        }
        return m97220b(context, a);
    }

    /* renamed from: b */
    private static String m97220b(Context context, String str) {
        boolean z;
        if (str.startsWith("res:///")) {
            int i = 7;
            while (true) {
                if (i >= str.length()) {
                    z = true;
                    break;
                }
                char charAt = str.charAt(i);
                if (charAt < '0' || charAt > '9') {
                    z = false;
                } else {
                    i++;
                }
            }
            if (!z) {
                int indexOf = str.indexOf(46);
                if (indexOf < 0) {
                    indexOf = str.length();
                }
                int identifier = context.getResources().getIdentifier(str.substring(7, indexOf), "drawable", context.getPackageName());
                return "res:///" + identifier;
            }
        }
        return str;
    }

    /* renamed from: a */
    private static String m97219a(AbstractC26674h hVar, String str, String str2) {
        int lastIndexOf;
        TraceEvent.m96443a("Interceptor.shouldRedirectImageUrl");
        String b = hVar.mo33934b(str);
        TraceEvent.m96444b("Interceptor.shouldRedirectImageUrl");
        if (b != null) {
            return b;
        }
        if (TextUtils.isEmpty(str) || !str.startsWith("./") || TextUtils.isEmpty(str2) || (lastIndexOf = str2.lastIndexOf("/")) <= 0) {
            return null;
        }
        String str3 = str2.substring(0, lastIndexOf) + str.substring(1);
        LLog.m96423b("ImageUrlRedirectUtils", "shouldRedirectImageUrl use local image url:" + str3);
        if (str3.startsWith("http") || str3.startsWith("file://") || str3.startsWith("content://") || str3.startsWith("res://") || str3.startsWith("data:")) {
            return str3;
        }
        if (str3.startsWith("assets:///")) {
            return str3.replace("assets:///", "asset:///");
        }
        if (str3.startsWith("assets://")) {
            return str3.replace("assets://", "asset:///");
        }
        if (str3.startsWith("asset:///")) {
            return str3;
        }
        return "file://" + str3;
    }
}
