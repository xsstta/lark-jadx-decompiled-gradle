package com.ss.android.lark.mail.impl.message.template;

import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.message.template.C43033b;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.lark.mail.impl.message.template.z */
public class C43089z {

    /* renamed from: a */
    public volatile boolean f109662a;

    /* renamed from: b */
    private String f109663b;

    /* renamed from: c */
    private Map<String, String> f109664c;

    /* renamed from: d */
    private String[] f109665d;

    /* renamed from: com.ss.android.lark.mail.impl.message.template.z$a */
    public interface AbstractC43092a {
        /* renamed from: a */
        void mo153830a();

        /* renamed from: b */
        void mo153831b();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.mail.impl.message.template.z$b */
    public static class C43093b {

        /* renamed from: a */
        static final C43089z f109669a = new C43089z();
    }

    /* renamed from: a */
    public static C43089z m171291a() {
        return C43093b.f109669a;
    }

    /* renamed from: b */
    public String mo154274b() {
        return this.f109663b;
    }

    private C43089z() {
        C43033b.m171194a().mo154211a(new C43033b.AbstractC43038a() {
            /* class com.ss.android.lark.mail.impl.message.template.C43089z.C430901 */

            @Override // com.ss.android.lark.mail.impl.message.template.C43033b.AbstractC43038a
            /* renamed from: a */
            public void mo154216a() {
                Log.m165389i("TemplateModel", "dynamic template updated, need to reload  template next time");
                C43089z.this.f109662a = true;
            }
        });
    }

    /* renamed from: c */
    private void m171292c() {
        this.f109665d = new String[]{"script", "style"};
    }

    /* renamed from: b */
    public synchronized void mo154275b(AbstractC43092a aVar) {
        mo154277c(aVar);
    }

    /* renamed from: a */
    public String mo154272a(String str) {
        String str2;
        Map<String, String> map = this.f109664c;
        if (map == null || (str2 = map.get(str)) == null) {
            return "";
        }
        return str2;
    }

    /* renamed from: a */
    public void mo154273a(final AbstractC43092a aVar) {
        CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.mail.impl.message.template.C43089z.RunnableC430912 */

            public void run() {
                C43089z.this.mo154277c(aVar);
            }
        });
    }

    /* renamed from: b */
    public void mo154276b(String str) {
        int i;
        int a;
        Log.m165389i("TemplateModel", "parseTemplate_start");
        if (this.f109664c == null) {
            this.f109664c = new HashMap();
        }
        int length = str.length();
        char[] charArray = str.toCharArray();
        int i2 = 0;
        while (i2 < length) {
            if (C43032aa.m171189a(charArray, i2, "<!".toCharArray()) && (a = m171290a(charArray, (i = i2 + 2))) != -1) {
                String substring = str.substring(i, a);
                int length2 = C43032aa.m171190b(substring).length() + i2;
                String c = C43032aa.m171191c(substring);
                String a2 = C43032aa.m171188a(str, i2, substring);
                this.f109664c.put(substring, a2);
                i2 = c.length() + length2 + a2.length();
            }
            i2++;
        }
        Log.m165389i("TemplateModel", "parseTemplate_end");
        m171292c();
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0082 A[Catch:{ IOException -> 0x00ae, all -> 0x00ab }, LOOP:0: B:27:0x007c->B:29:0x0082, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0098 A[SYNTHETIC, Splitter:B:36:0x0098] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a2 A[SYNTHETIC, Splitter:B:41:0x00a2] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00c2 A[Catch:{ all -> 0x00d5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00c7 A[SYNTHETIC, Splitter:B:59:0x00c7] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00d8 A[SYNTHETIC, Splitter:B:67:0x00d8] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00e2 A[SYNTHETIC, Splitter:B:72:0x00e2] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0086 A[EDGE_INSN: B:77:0x0086->B:30:0x0086 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo154277c(com.ss.android.lark.mail.impl.message.template.C43089z.AbstractC43092a r8) {
        /*
        // Method dump skipped, instructions count: 235
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.message.template.C43089z.mo154277c(com.ss.android.lark.mail.impl.message.template.z$a):void");
    }

    /* renamed from: a */
    private int m171290a(char[] cArr, int i) {
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
