package com.ss.android.lark.floating.widget.appfloat;

import android.content.Context;
import android.graphics.Rect;
import com.ss.android.lark.floating.data.FloatConfig;
import com.ss.android.lark.floating.interfaces.OnFloatCallbacks;
import com.ss.android.lark.log.Log;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.internal.C69121n;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ss.android.lark.floating.widget.appfloat.c */
public final class FloatManager {

    /* renamed from: a */
    public static final FloatManager f98554a = new FloatManager();

    /* renamed from: b */
    private static final Map<String, AppFloatManager> f98555b = new LinkedHashMap();

    /* renamed from: d */
    public final String mo140334d(String str) {
        return str != null ? str : "default";
    }

    private FloatManager() {
    }

    /* renamed from: a */
    public final Map<String, AppFloatManager> mo140327a() {
        return f98555b;
    }

    /* renamed from: com.ss.android.lark.floating.widget.appfloat.c$a */
    public static final class RunnableC38356a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f98556a;

        /* renamed from: b */
        final /* synthetic */ int f98557b;

        /* renamed from: c */
        final /* synthetic */ AppFloatManager f98558c;

        RunnableC38356a(int i, int i2, AppFloatManager aVar) {
            this.f98556a = i;
            this.f98557b = i2;
            this.f98558c = aVar;
        }

        public final void run() {
            this.f98558c.mo140301a(this.f98556a, this.f98557b);
        }
    }

    /* renamed from: e */
    public final AppFloatManager mo140335e(String str) {
        return f98555b.get(mo140334d(str));
    }

    /* renamed from: a */
    private final boolean m151015a(FloatConfig aVar) {
        aVar.mo140180a(mo140334d(aVar.mo140191d()));
        String d = aVar.mo140191d();
        if (d == null) {
            return true;
        }
        return !f98555b.containsKey(d);
    }

    /* renamed from: b */
    public final Unit mo140332b(String str) {
        AppFloatManager aVar = f98555b.get(mo140334d(str));
        if (aVar == null) {
            return null;
        }
        aVar.mo140311e();
        return Unit.INSTANCE;
    }

    /* renamed from: c */
    public final AppFloatManager mo140333c(String str) {
        Map<String, AppFloatManager> map = f98555b;
        if (map != null) {
            return (AppFloatManager) C69121n.m265993j(map).remove(str);
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
    }

    /* renamed from: a */
    public final void mo140330a(String str) {
        ParentFrameLayout c;
        AppFloatManager aVar = f98555b.get(mo140334d(str));
        if (aVar != null && (c = aVar.mo140309c()) != null) {
            c.post(new RunnableC38356a(c.getWidth(), c.getHeight(), aVar));
        }
    }

    /* renamed from: a */
    public final void mo140329a(Context context, FloatConfig aVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(aVar, "config");
        if (m151015a(aVar)) {
            String d = aVar.mo140191d();
            if (d != null) {
                Map<String, AppFloatManager> map = f98555b;
                Context applicationContext = context.getApplicationContext();
                Intrinsics.checkExpressionValueIsNotNull(applicationContext, "context.applicationContext");
                AppFloatManager aVar2 = new AppFloatManager(applicationContext, aVar);
                aVar2.mo140310d();
                map.put(d, aVar2);
                return;
            }
            return;
        }
        OnFloatCallbacks x = aVar.mo140219x();
        if (x != null) {
            x.mo140244a(false, "Tag exception. You need to set different EasyFloat tag.", null);
        }
        Log.m165396w("Tag exception. You need to set different EasyFloat tag.");
    }

    /* renamed from: a */
    public final void mo140331a(String str, List<Rect> list) {
        FloatConfig h;
        Intrinsics.checkParameterIsNotNull(list, "rects");
        Map<String, AppFloatManager> map = f98555b;
        AppFloatManager aVar = map.get(mo140334d(str));
        if (!(aVar == null || (h = aVar.mo140314h()) == null)) {
            h.mo140181a(list);
        }
        AppFloatManager aVar2 = map.get(mo140334d(str));
        if (aVar2 != null) {
            aVar2.mo140305a(list);
        }
    }

    /* renamed from: a */
    public final Unit mo140328a(boolean z, String str, boolean z2) {
        int i;
        AppFloatManager aVar = f98555b.get(mo140334d(str));
        if (aVar == null) {
            return null;
        }
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        aVar.mo140302a(i, z2);
        return Unit.INSTANCE;
    }

    /* renamed from: a */
    public static /* synthetic */ Unit m151014a(FloatManager cVar, boolean z, String str, boolean z2, int i, Object obj) {
        FloatConfig h;
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            AppFloatManager aVar = f98555b.get(str);
            if (aVar == null || (h = aVar.mo140314h()) == null) {
                z2 = true;
            } else {
                z2 = h.mo140171E();
            }
        }
        return cVar.mo140328a(z, str, z2);
    }
}
