package com.larksuite.component.dynamicresources;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import com.larksuite.component.air.C24044a;
import java.io.Serializable;

public class DynamicResourcesFacade {

    /* renamed from: a */
    static boolean f59931a = false;

    /* renamed from: b */
    private static boolean f59932b = true;

    /* renamed from: c */
    private static boolean f59933c;

    public interface ChangeResourcesExecutor extends Serializable {

        /* renamed from: com.larksuite.component.dynamicresources.DynamicResourcesFacade$ChangeResourcesExecutor$a */
        public interface AbstractC24275a<T> {
            /* renamed from: a */
            void mo86912a(T t);
        }

        /* renamed from: com.larksuite.component.dynamicresources.DynamicResourcesFacade$ChangeResourcesExecutor$b */
        public interface AbstractC24276b<T> {
            /* renamed from: a */
            T mo86913a();
        }

        <T> void execute(AbstractC24276b<T> bVar, AbstractC24275a<T> aVar);
    }

    /* renamed from: a */
    public static String m88630a() {
        return C24301g.m88706a().mo86997b();
    }

    /* renamed from: b */
    public static void m88634b(boolean z) {
        f59933c = z;
    }

    /* renamed from: b */
    public static boolean m88635b(int i) {
        return m88633a(i);
    }

    /* renamed from: c */
    public static void m88636c(boolean z) {
        if (f59932b) {
            C24044a.m87852a().mo86281a(new C24291d(z));
        }
    }

    /* renamed from: a */
    public static void m88632a(boolean z) {
        f59932b = z;
        Log.i("DynamicResourcesFacade", "enable = " + f59932b);
    }

    /* renamed from: a */
    public static boolean m88633a(int i) {
        if (!f59932b) {
            return f59933c;
        }
        if (C24301g.m88706a().mo86996a(i) || f59933c) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static Resources m88629a(Application application, Resources resources) {
        if (!f59932b) {
            return null;
        }
        return C24301g.m88706a().mo86990a(application, resources);
    }

    /* renamed from: a */
    public static void m88631a(Context context, String str) {
        Log.i("DynamicResourcesFacade", "setChangeDynamicResourcesExecute is default, enable = " + f59932b);
        if (f59932b) {
            C24301g.m88706a().mo86995a(context, str, new C24289c());
        }
    }
}
