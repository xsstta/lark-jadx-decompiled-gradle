package com.ss.android.lark.widget.timepicker.monthview;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: com.ss.android.lark.widget.timepicker.monthview.c */
public class C59239c {

    /* renamed from: a */
    private FrameLayout f147100a;

    /* renamed from: b */
    private View f147101b;

    /* renamed from: a */
    public View mo201374a() {
        return this.f147100a;
    }

    /* renamed from: b */
    public View mo201376b() {
        return this.f147101b;
    }

    /* renamed from: c */
    public void mo201377c() {
        this.f147100a.removeAllViews();
    }

    /* renamed from: a */
    public void mo201375a(View view) {
        this.f147101b = view;
        this.f147100a.addView(view);
    }

    public C59239c(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.f147100a = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
    }
}
