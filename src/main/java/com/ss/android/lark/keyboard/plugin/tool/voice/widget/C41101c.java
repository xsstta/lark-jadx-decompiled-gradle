package com.ss.android.lark.keyboard.plugin.tool.voice.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C0906h;
import androidx.core.view.ViewCompat;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.keyboard.plugin.tool.voice.widget.c */
public final class C41101c {
    /* renamed from: d */
    static int m162965d(View view) {
        return m162961a(view, false);
    }

    /* renamed from: e */
    static int m162966e(View view) {
        return m162963b(view, false);
    }

    /* renamed from: a */
    static int m162960a(View view) {
        if (view == null) {
            return 0;
        }
        return view.getMeasuredWidth();
    }

    /* renamed from: b */
    static int m162962b(View view) {
        if (view == null) {
            return 0;
        }
        return view.getWidth();
    }

    /* renamed from: c */
    static int m162964c(View view) {
        return m162962b(view) + m162972k(view);
    }

    /* renamed from: f */
    static int m162967f(View view) {
        if (view == null) {
            return 0;
        }
        return ViewCompat.m4094l(view);
    }

    /* renamed from: g */
    static int m162968g(View view) {
        if (view == null) {
            return 0;
        }
        return ViewCompat.m4097m(view);
    }

    /* renamed from: h */
    static int m162969h(View view) {
        if (view == null) {
            return 0;
        }
        return view.getPaddingLeft() + view.getPaddingRight();
    }

    /* renamed from: i */
    static int m162970i(View view) {
        if (view == null) {
            return 0;
        }
        return C0906h.m4355a((ViewGroup.MarginLayoutParams) view.getLayoutParams());
    }

    /* renamed from: j */
    static int m162971j(View view) {
        if (view == null) {
            return 0;
        }
        return C0906h.m4357b((ViewGroup.MarginLayoutParams) view.getLayoutParams());
    }

    /* renamed from: l */
    static boolean m162973l(View view) {
        if (ViewCompat.m4082h(view) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    static int m162972k(View view) {
        if (view == null) {
            return 0;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return C0906h.m4355a(marginLayoutParams) + C0906h.m4357b(marginLayoutParams);
    }

    /* renamed from: a */
    static int m162961a(View view, boolean z) {
        if (view == null) {
            return 0;
        }
        if (m162973l(view)) {
            if (z) {
                return view.getRight() - m162967f(view);
            }
            return view.getRight();
        } else if (z) {
            return view.getLeft() + m162967f(view);
        } else {
            return view.getLeft();
        }
    }

    /* renamed from: b */
    static int m162963b(View view, boolean z) {
        if (view == null) {
            return 0;
        }
        if (m162973l(view)) {
            if (z) {
                return view.getLeft() + m162968g(view);
            }
            return view.getLeft();
        } else if (z) {
            return view.getRight() - m162968g(view);
        } else {
            return view.getRight();
        }
    }
}
