package com.ss.android.lark.voip.service.impl.app;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3083e.C60765l;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.lark.voip.service.impl.app.s */
public class C58131s {

    /* renamed from: a */
    public static Toast f143001a;

    /* renamed from: b */
    private static WeakReference<Handler> f143002b;

    /* renamed from: a */
    private static void m225479a(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
            return;
        }
        WeakReference<Handler> weakReference = f143002b;
        if (weakReference == null || weakReference.get() == null) {
            f143002b = new WeakReference<>(new Handler(Looper.getMainLooper()));
        }
        f143002b.get().post(runnable);
    }

    /* renamed from: a */
    public static void m225478a(final Context context, final String str) {
        m225479a(new Runnable() {
            /* class com.ss.android.lark.voip.service.impl.app.C58131s.RunnableC581321 */

            public void run() {
                View inflate = LayoutInflater.from(context).inflate(R.layout.voip_toast, (ViewGroup) null);
                ((TextView) inflate.findViewById(R.id.toast_text)).setText(str);
                ((ImageView) inflate.findViewById(R.id.toast_image)).setVisibility(8);
                C60765l lVar = new C60765l(context);
                lVar.setGravity(80, 0, C58131s.m225477a(context, 148.0d));
                lVar.setView(inflate);
                if (C58131s.f143001a != null) {
                    C58131s.f143001a.cancel();
                }
                C58131s.f143001a = lVar;
                lVar.show();
            }
        });
    }

    /* renamed from: a */
    public static int m225477a(Context context, double d) {
        return (int) ((d * ((double) context.getResources().getDisplayMetrics().density)) + 0.5d);
    }
}
