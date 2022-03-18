package com.ss.android.lark.mail.impl.settings.subsetting.signature.parse;

import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.message.template.C43032aa;
import com.ss.android.lark.mail.impl.message.template.C43033b;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.lark.mail.impl.settings.subsetting.signature.parse.e */
public class C43608e {

    /* renamed from: a */
    public volatile boolean f110647a;

    /* renamed from: b */
    private String f110648b;

    /* renamed from: c */
    private Map<String, String> f110649c;

    /* renamed from: d */
    private String[] f110650d;

    /* renamed from: com.ss.android.lark.mail.impl.settings.subsetting.signature.parse.e$a */
    public interface AbstractC43611a {
        /* renamed from: a */
        void mo155517a();

        /* renamed from: b */
        void mo155518b();
    }

    /* renamed from: com.ss.android.lark.mail.impl.settings.subsetting.signature.parse.e$b */
    private static class C43612b {

        /* renamed from: a */
        static final C43608e f110654a = new C43608e();
    }

    /* renamed from: a */
    public static C43608e m173074a() {
        return C43612b.f110654a;
    }

    /* renamed from: b */
    public String mo155619b() {
        return this.f110648b;
    }

    private C43608e() {
        C43033b.m171194a().mo154211a(new C43033b.AbstractC43038a() {
            /* class com.ss.android.lark.mail.impl.settings.subsetting.signature.parse.C43608e.C436091 */

            @Override // com.ss.android.lark.mail.impl.message.template.C43033b.AbstractC43038a
            /* renamed from: a */
            public void mo154216a() {
                Log.m165389i("TemplateModel", "dynamic template updated, need to reload  template next time");
                C43608e.this.f110647a = true;
            }
        });
    }

    /* renamed from: c */
    private void m173075c() {
        this.f110650d = new String[]{"script", "style"};
    }

    /* renamed from: a */
    public String mo155617a(String str) {
        String str2;
        Map<String, String> map = this.f110649c;
        if (map == null || (str2 = map.get(str)) == null) {
            return "";
        }
        return str2;
    }

    /* renamed from: a */
    public void mo155618a(final AbstractC43611a aVar) {
        CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.mail.impl.settings.subsetting.signature.parse.C43608e.RunnableC436102 */

            public void run() {
                C43608e.this.mo155620b(aVar);
            }
        });
    }

    /* renamed from: b */
    public void mo155621b(String str) {
        int i;
        int a;
        Log.m165389i("TemplateModel", "parseTemplate_start");
        if (this.f110649c == null) {
            this.f110649c = new HashMap();
        }
        int length = str.length();
        char[] charArray = str.toCharArray();
        int i2 = 0;
        while (i2 < length) {
            if (C43032aa.m171189a(charArray, i2, "<!".toCharArray()) && (a = m173073a(charArray, (i = i2 + 2))) != -1) {
                String substring = str.substring(i, a);
                int length2 = C43032aa.m171190b(substring).length() + i2;
                String c = C43032aa.m171191c(substring);
                String a2 = C43032aa.m171188a(str, i2, substring);
                this.f110649c.put(substring, a2);
                i2 = c.length() + length2 + a2.length();
            }
            i2++;
        }
        Log.m165389i("TemplateModel", "parseTemplate_end");
        m173075c();
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0058 A[SYNTHETIC, Splitter:B:23:0x0058] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0062 A[SYNTHETIC, Splitter:B:28:0x0062] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0082 A[Catch:{ all -> 0x0095 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0087 A[SYNTHETIC, Splitter:B:46:0x0087] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0098 A[SYNTHETIC, Splitter:B:54:0x0098] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a2 A[SYNTHETIC, Splitter:B:59:0x00a2] */
    /* JADX WARNING: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo155620b(com.ss.android.lark.mail.impl.settings.subsetting.signature.parse.C43608e.AbstractC43611a r8) {
        /*
        // Method dump skipped, instructions count: 171
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.settings.subsetting.signature.parse.C43608e.mo155620b(com.ss.android.lark.mail.impl.settings.subsetting.signature.parse.e$a):void");
    }

    /* renamed from: a */
    private int m173073a(char[] cArr, int i) {
        while (i < cArr.length) {
            if (C43032aa.m171189a(cArr, i, "!>".toCharArray())) {
                return i;
            }
            if (C43032aa.m171189a(cArr, i, "<!".toCharArray())) {
                return -1;
            }
            i++;
        }
        return -1;
    }
}
