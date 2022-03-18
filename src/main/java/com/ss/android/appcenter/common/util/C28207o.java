package com.ss.android.appcenter.common.util;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.larksuite.suite.R;

/* renamed from: com.ss.android.appcenter.common.util.o */
public class C28207o {

    /* renamed from: com.ss.android.appcenter.common.util.o$a */
    public static class C28208a {

        /* renamed from: a */
        View f70712a;

        /* renamed from: b */
        ObjectAnimator f70713b;

        /* renamed from: a */
        public View mo100414a() {
            return this.f70712a;
        }

        /* renamed from: b */
        public ObjectAnimator mo100415b() {
            return this.f70713b;
        }

        /* renamed from: c */
        public void mo100416c() {
            View view = this.f70712a;
            if (view != null) {
                view.setVisibility(0);
            }
            ObjectAnimator objectAnimator = this.f70713b;
            if (objectAnimator != null) {
                objectAnimator.start();
            }
        }

        public C28208a(View view, ObjectAnimator objectAnimator) {
            this.f70712a = view;
            this.f70713b = objectAnimator;
        }
    }

    /* renamed from: a */
    public static void m103287a(C28208a aVar) {
        if (aVar != null) {
            if (aVar.mo100414a() != null) {
                aVar.mo100414a().setVisibility(8);
            }
            if (aVar.mo100415b() != null) {
                aVar.mo100415b().cancel();
            }
        }
    }

    /* renamed from: a */
    public static C28208a m103285a(Context context, ViewGroup viewGroup, String str) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.appcenter_common_loadingtoast_layout, viewGroup, false);
        inflate.setOnClickListener($$Lambda$o$5MU0eqXHDenziUNPO_YWTWVkrU.INSTANCE);
        inflate.setVisibility(0);
        viewGroup.addView(inflate);
        if (!TextUtils.isEmpty(str)) {
            ((TextView) inflate.findViewById(R.id.loading_tv)).setText(str);
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(inflate.findViewById(R.id.loading_iv), "rotation", -180.0f, 180.0f).setDuration(800L);
        duration.setRepeatCount(-1);
        duration.start();
        return new C28208a(inflate, duration);
    }
}
