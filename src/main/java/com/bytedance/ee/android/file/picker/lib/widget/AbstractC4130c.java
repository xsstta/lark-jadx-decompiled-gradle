package com.bytedance.ee.android.file.picker.lib.widget;

import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: com.bytedance.ee.android.file.picker.lib.widget.c */
public interface AbstractC4130c {

    /* renamed from: com.bytedance.ee.android.file.picker.lib.widget.c$a */
    public interface AbstractC4131a {
        /* renamed from: a */
        String mo16190a();

        /* renamed from: a */
        void mo16191a(View view);

        /* renamed from: b */
        int mo16192b();

        /* renamed from: c */
        int mo16193c();
    }

    /* renamed from: com.bytedance.ee.android.file.picker.lib.widget.c$b */
    public static class C4132b implements AbstractC4131a {
        @Override // com.bytedance.ee.android.file.picker.lib.widget.AbstractC4130c.AbstractC4131a
        /* renamed from: a */
        public String mo16190a() {
            return null;
        }

        @Override // com.bytedance.ee.android.file.picker.lib.widget.AbstractC4130c.AbstractC4131a
        /* renamed from: a */
        public void mo16191a(View view) {
        }

        @Override // com.bytedance.ee.android.file.picker.lib.widget.AbstractC4130c.AbstractC4131a
        /* renamed from: b */
        public int mo16192b() {
            return 0;
        }

        @Override // com.bytedance.ee.android.file.picker.lib.widget.AbstractC4130c.AbstractC4131a
        /* renamed from: c */
        public int mo16193c() {
            return 0;
        }
    }

    /* renamed from: com.bytedance.ee.android.file.picker.lib.widget.c$c */
    public static class C4133c extends C4132b {

        /* renamed from: a */
        private int f12528a;

        /* renamed from: b */
        private Drawable f12529b;

        @Override // com.bytedance.ee.android.file.picker.lib.widget.AbstractC4130c.AbstractC4131a, com.bytedance.ee.android.file.picker.lib.widget.AbstractC4130c.C4132b
        /* renamed from: b */
        public int mo16192b() {
            return this.f12528a;
        }

        /* renamed from: d */
        public Drawable mo16194d() {
            return this.f12529b;
        }

        public C4133c(Drawable drawable) {
            this.f12529b = drawable;
        }
    }

    /* renamed from: com.bytedance.ee.android.file.picker.lib.widget.c$d */
    public static class C4134d extends C4132b {

        /* renamed from: a */
        private final String f12530a;

        /* renamed from: b */
        private int f12531b;

        /* renamed from: c */
        private int f12532c;

        @Override // com.bytedance.ee.android.file.picker.lib.widget.AbstractC4130c.AbstractC4131a, com.bytedance.ee.android.file.picker.lib.widget.AbstractC4130c.C4132b
        /* renamed from: a */
        public String mo16190a() {
            return this.f12530a;
        }

        /* renamed from: d */
        public int mo16195d() {
            return this.f12531b;
        }

        /* renamed from: e */
        public int mo16196e() {
            return this.f12532c;
        }
    }

    /* renamed from: com.bytedance.ee.android.file.picker.lib.widget.c$e */
    public static class C4135e extends C4132b {

        /* renamed from: a */
        private View f12533a;

        /* renamed from: d */
        public View mo16197d() {
            return this.f12533a;
        }
    }
}
