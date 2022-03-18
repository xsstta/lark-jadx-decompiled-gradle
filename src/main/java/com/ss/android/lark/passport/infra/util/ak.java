package com.ss.android.lark.passport.infra.util;

import android.os.SystemClock;
import android.view.View;
import com.ss.android.lark.passport.infra.log.PassportLog;

public class ak {

    /* renamed from: com.ss.android.lark.passport.infra.util.ak$a */
    private static class View$OnClickListenerC49158a implements View.OnClickListener {

        /* renamed from: a */
        private final View.OnClickListener f123440a;

        /* renamed from: b */
        private long f123441b;

        public View$OnClickListenerC49158a(View.OnClickListener onClickListener) {
            this.f123440a = onClickListener;
        }

        public void onClick(View view) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            PassportLog a = PassportLog.f123351c.mo171474a();
            a.mo171465b("ViewUtil", "click time -> " + elapsedRealtime + " lastTime -> " + this.f123441b);
            if (elapsedRealtime - this.f123441b > 500) {
                PassportLog a2 = PassportLog.f123351c.mo171474a();
                a2.mo171465b("ViewUtil", " click vaild " + (elapsedRealtime - this.f123441b));
                this.f123441b = elapsedRealtime;
                View.OnClickListener onClickListener = this.f123440a;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m193850a(View view, View.OnClickListener onClickListener) {
        if (view != null && onClickListener != null) {
            view.setOnClickListener(new View$OnClickListenerC49158a(onClickListener));
        }
    }
}
