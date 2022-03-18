package com.ss.android.lark.mail.impl.uiframework.view.webview;

import android.text.TextUtils;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.mail.impl.entity.MailImage;
import com.ss.android.lark.mail.impl.utils.C43849u;
import java.util.HashMap;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.mail.impl.uiframework.view.webview.i */
public class C43746i {

    /* renamed from: a */
    public int f111011a;

    /* renamed from: b */
    public Map<String, Integer> f111012b = new HashMap();

    /* renamed from: c */
    public Map<String, MailImage> f111013c = new HashMap();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo155884a() {
        return this.f111011a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo155887b() {
        C43849u.m173826a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.uiframework.view.webview.C43746i.RunnableC437504 */

            public void run() {
                C43746i.this.f111011a = 0;
                C43746i.this.f111012b.clear();
                C43746i.this.f111013c.clear();
            }
        });
    }

    C43746i() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo155885a(final String str) {
        C43849u.m173826a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.uiframework.view.webview.C43746i.RunnableC437482 */

            public void run() {
                if (!TextUtils.isEmpty(str)) {
                    Integer num = C43746i.this.f111012b.get(str);
                    if (num == null) {
                        C43746i.this.f111012b.put(str, 1);
                    } else {
                        C43746i.this.f111012b.put(str, Integer.valueOf(num.intValue() + 1));
                    }
                    if (C43746i.this.f111013c.get(str) == null && CollectionUtils.isNotEmpty(C43746i.this.f111012b.keySet())) {
                        for (String str : C43746i.this.f111012b.keySet()) {
                            if (!TextUtils.isEmpty(str) && C43746i.this.f111013c.containsKey(str)) {
                                C43746i.this.f111011a++;
                                return;
                            }
                        }
                    }
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo155888b(final String str) {
        C43849u.m173826a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.uiframework.view.webview.C43746i.RunnableC437493 */

            public void run() {
                Integer num;
                if (!TextUtils.isEmpty(str) && (num = C43746i.this.f111012b.get(str)) != null) {
                    Integer valueOf = Integer.valueOf(num.intValue() - 1);
                    if (valueOf.intValue() <= 0) {
                        C43746i.this.f111012b.remove(str);
                    } else {
                        C43746i.this.f111012b.put(str, valueOf);
                    }
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo155886a(final String str, final MailImage mailImage) {
        C43849u.m173826a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.uiframework.view.webview.C43746i.RunnableC437471 */

            public void run() {
                C43746i.this.f111013c.put(str, mailImage);
            }
        });
    }
}
