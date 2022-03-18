package com.bytedance.platform.godzilla.p860a.p870d;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.platform.godzilla.common.C20323c;
import com.bytedance.platform.godzilla.common.Logger;
import com.bytedance.platform.godzilla.p872b.C20315g;
import com.bytedance.platform.godzilla.plugin.AbstractC20331c;
import java.util.List;

/* renamed from: com.bytedance.platform.godzilla.a.d.g */
public class C20288g extends AbstractC20331c {

    /* renamed from: a */
    private AbstractC20289a f49566a;

    /* renamed from: b */
    private Context f49567b;

    /* renamed from: com.bytedance.platform.godzilla.a.d.g$a */
    public interface AbstractC20289a {
        /* renamed from: a */
        List<C20323c> mo68570a();

        /* renamed from: a */
        void mo68571a(C20323c cVar);

        /* renamed from: b */
        String mo68572b();

        /* renamed from: c */
        int mo68573c();
    }

    @Override // com.bytedance.platform.godzilla.plugin.AbstractC20329a
    /* renamed from: b */
    public String mo68532b() {
        return "CloudUncaughtExceptionCatcher";
    }

    @Override // com.bytedance.platform.godzilla.plugin.AbstractC20331c
    /* renamed from: c */
    public boolean mo68569c() {
        return true;
    }

    public C20288g(AbstractC20289a aVar, Context context) {
        this.f49566a = aVar;
        this.f49567b = context;
        if (aVar == null || context == null) {
            throw new IllegalArgumentException("mConfigFetcher and mContext can not be null.");
        }
    }

    @Override // com.bytedance.platform.godzilla.common.AbstractC20328h
    /* renamed from: a */
    public boolean mo68568a(Thread thread, Throwable th) {
        AbstractC20289a aVar = this.f49566a;
        boolean z = false;
        if (aVar == null) {
            return false;
        }
        List<C20323c> a = aVar.mo68570a();
        if (a != null && !a.isEmpty()) {
            String b = this.f49566a.mo68572b();
            int c = this.f49566a.mo68573c();
            int i = Build.VERSION.SDK_INT;
            String name = thread.getName();
            String a2 = C20315g.m74087a(this.f49567b);
            for (C20323c cVar : a) {
                if ((TextUtils.isEmpty(cVar.f49604e) || cVar.f49604e.equalsIgnoreCase(b)) && ((cVar.f49605f <= 0 || cVar.f49605f == c) && ((cVar.f49608i <= 0 || i == cVar.f49608i) && ((TextUtils.isEmpty(cVar.f49603d) || cVar.f49603d.equalsIgnoreCase(name)) && ((TextUtils.isEmpty(cVar.f49600a) || cVar.f49600a.equalsIgnoreCase(a2)) && ((TextUtils.isEmpty(cVar.f49606g) || cVar.f49606g.equalsIgnoreCase(th.getMessage())) && (TextUtils.isEmpty(cVar.f49607h) || cVar.f49607h.equalsIgnoreCase(th.getClass().getName())))))))) {
                    if (!TextUtils.isEmpty(cVar.f49601b) || !TextUtils.isEmpty(cVar.f49602c)) {
                        if (TextUtils.isEmpty(cVar.f49601b) || TextUtils.isEmpty(cVar.f49602c)) {
                            Logger.m74095a("CloudUntExPlugin", cVar.f49601b + "." + cVar.f49602c + " does not match.");
                        }
                        StackTraceElement[] stackTrace = th.getStackTrace();
                        int length = stackTrace.length;
                        int i2 = 0;
                        while (i2 < length) {
                            StackTraceElement stackTraceElement = stackTrace[i2];
                            if ((TextUtils.isEmpty(cVar.f49601b) || cVar.f49601b.equalsIgnoreCase(stackTraceElement.getClassName())) && (TextUtils.isEmpty(cVar.f49602c) || cVar.f49602c.equalsIgnoreCase(stackTraceElement.getMethodName()))) {
                                Logger.m74095a("CloudUntExPlugin", "Hint crash," + cVar);
                                this.f49566a.mo68571a(cVar);
                                return true;
                            }
                            i2++;
                            z = false;
                        }
                        continue;
                    } else {
                        Logger.m74095a("CloudUntExPlugin", "Hint crash," + cVar);
                        this.f49566a.mo68571a(cVar);
                        return true;
                    }
                }
            }
        }
        return z;
    }
}
