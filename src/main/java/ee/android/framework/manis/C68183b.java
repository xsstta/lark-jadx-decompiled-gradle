package ee.android.framework.manis;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.lark.log.Log;
import ee.android.framework.manis.base.C68189c;
import ee.android.framework.manis.p3450a.C68182c;

/* renamed from: ee.android.framework.manis.b */
public class C68183b {

    /* renamed from: a */
    private final Object f171421a;

    /* renamed from: b */
    private volatile boolean f171422b;

    /* renamed from: c */
    private AbstractC68179a f171423c;

    /* access modifiers changed from: private */
    /* renamed from: ee.android.framework.manis.b$a */
    public static class C68185a {

        /* renamed from: a */
        public static C68183b f171424a = new C68183b();
    }

    /* renamed from: a */
    public static C68183b m264839a() {
        return C68185a.f171424a;
    }

    /* renamed from: b */
    public AbstractC68179a mo237087b() {
        return this.f171423c;
    }

    /* renamed from: c */
    public Object mo237088c() {
        return this.f171421a;
    }

    /* renamed from: d */
    public boolean mo237089d() {
        return this.f171422b;
    }

    private C68183b() {
        this.f171421a = new Object();
    }

    /* renamed from: e */
    public void mo237090e() {
        synchronized (this.f171421a) {
            this.f171421a.notifyAll();
            this.f171422b = true;
        }
    }

    /* renamed from: a */
    public <T> T mo237086a(Context context, Class<T> cls) {
        String c = C68182c.m264836c(context);
        StringBuilder sb = new StringBuilder();
        sb.append("getService ");
        sb.append(cls.getName());
        sb.append(" in process:");
        if (TextUtils.isEmpty(c)) {
            c = "main";
        }
        sb.append(c);
        Log.m165389i("ManisManager", sb.toString());
        return (T) C68189c.m264851a().mo237105a(context, cls);
    }
}
