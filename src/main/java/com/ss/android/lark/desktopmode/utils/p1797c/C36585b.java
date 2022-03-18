package com.ss.android.lark.desktopmode.utils.p1797c;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import com.larksuite.framework.utils.RomUtils;

/* renamed from: com.ss.android.lark.desktopmode.utils.c.b */
public class C36585b {

    /* renamed from: a */
    private AbstractC36588c f94145a;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.desktopmode.utils.c.b$a */
    public static class C36587a {

        /* renamed from: a */
        static final C36585b f94146a = new C36585b();
    }

    /* renamed from: a */
    public static C36585b m144332a() {
        return C36587a.f94146a;
    }

    private C36585b() {
        if (RomUtils.m94953h()) {
            this.f94145a = new C36590e();
        } else if (RomUtils.m94950f()) {
            this.f94145a = new C36589d();
        } else {
            this.f94145a = new C36584a();
        }
    }

    /* renamed from: a */
    public Rect mo134976a(Activity activity) {
        return this.f94145a.mo134973a(activity);
    }

    /* renamed from: b */
    public int[] mo134978b(Activity activity) {
        return this.f94145a.mo134975b(activity);
    }

    /* renamed from: a */
    public int[] mo134977a(View view) {
        return this.f94145a.mo134974a(view);
    }
}
