package com.lynx.tasm.p1220b;

import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Base64;
import com.lynx.tasm.behavior.AbstractC26684l;
import com.lynx.tasm.fontface.FontFace;
import com.lynx.tasm.utils.C26958l;

/* renamed from: com.lynx.tasm.b.c */
public class C26603c {

    /* renamed from: a */
    private static AbstractC26606a f65860a = new AbstractC26606a() {
        /* class com.lynx.tasm.p1220b.C26603c.C266041 */
    };

    /* renamed from: a */
    public static AbstractC26606a m96407a() {
        return f65860a;
    }

    /* renamed from: a */
    public static void m96408a(AbstractC26606a aVar) {
        if (aVar == null) {
            f65860a = new AbstractC26606a() {
                /* class com.lynx.tasm.p1220b.C26603c.C266052 */
            };
        } else {
            f65860a = aVar;
        }
    }

    /* renamed from: com.lynx.tasm.b.c$a */
    public static abstract class AbstractC26606a {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo94486a(AbstractC26684l lVar, String str) {
            lVar.mo94669a(str);
        }

        /* renamed from: c */
        public final Typeface mo94487c(AbstractC26684l lVar, FontFace.TYPE type, String str) {
            return mo50289a(lVar, type, str);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Typeface mo50289a(AbstractC26684l lVar, FontFace.TYPE type, String str) {
            if (!TextUtils.isEmpty(str) && type != FontFace.TYPE.LOCAL) {
                int indexOf = str.indexOf("base64,");
                if (str.startsWith("data:") && indexOf != -1) {
                    try {
                        return C26958l.m97965a(lVar, Base64.decode(str.substring(indexOf + 7), 0));
                    } catch (Exception e) {
                        mo94486a(lVar, e.getMessage());
                    }
                }
            }
            return null;
        }
    }
}
