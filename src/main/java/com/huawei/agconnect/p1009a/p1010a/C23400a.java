package com.huawei.agconnect.p1009a.p1010a;

import android.content.Context;
import com.huawei.agconnect.p1009a.AbstractC23399a;
import com.huawei.agconnect.p1009a.AbstractC23409b;
import java.io.InputStream;
import java.util.Objects;

/* renamed from: com.huawei.agconnect.a.a.a */
public class C23400a extends AbstractC23399a {

    /* renamed from: a */
    private final Context f57713a;

    /* renamed from: b */
    private final String f57714b;

    /* renamed from: c */
    private AbstractC23409b f57715c;

    /* renamed from: d */
    private volatile AbstractC23402b f57716d;

    /* renamed from: e */
    private final Object f57717e = new Object();

    public C23400a(Context context, String str) {
        this.f57713a = context;
        this.f57714b = str;
    }

    /* renamed from: a */
    private static AbstractC23409b m84926a(Context context, final InputStream inputStream) {
        return new AbstractC23409b(context) {
            /* class com.huawei.agconnect.p1009a.p1010a.C23400a.C234011 */

            @Override // com.huawei.agconnect.p1009a.AbstractC23409b
            /* renamed from: a */
            public InputStream mo81789a(Context context) {
                return inputStream;
            }
        };
    }

    /* renamed from: b */
    private static String m84927b(String str) {
        int i = 0;
        if (str.length() > 0) {
            while (str.charAt(i) == '/') {
                i++;
            }
        }
        return '/' + str.substring(i);
    }

    @Override // com.huawei.agconnect.p1009a.AbstractC23399a
    /* renamed from: a */
    public String mo81785a(String str) {
        return mo81786a(str, (String) null);
    }

    @Override // com.huawei.agconnect.p1009a.AbstractC23399a
    /* renamed from: a */
    public String mo81786a(String str, String str2) {
        Objects.requireNonNull(str, "path must not be null.");
        if (this.f57716d == null) {
            synchronized (this.f57717e) {
                if (this.f57716d == null) {
                    AbstractC23409b bVar = this.f57715c;
                    if (bVar != null) {
                        this.f57716d = new C23404d(bVar.mo81792b());
                        this.f57715c.mo81791a();
                        this.f57715c = null;
                    } else {
                        this.f57716d = new C23407g(this.f57713a, this.f57714b);
                    }
                }
            }
        }
        return this.f57716d.mo81790a(m84927b(str), str2);
    }

    /* renamed from: a */
    public void mo81788a(AbstractC23409b bVar) {
        this.f57715c = bVar;
    }

    @Override // com.huawei.agconnect.p1009a.AbstractC23399a
    /* renamed from: a */
    public void mo81787a(InputStream inputStream) {
        mo81788a(m84926a(this.f57713a, inputStream));
    }
}
