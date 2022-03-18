package com.ss.android.lark.keyboard.plugin.tool.voice.widget;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;

/* renamed from: com.ss.android.lark.keyboard.plugin.tool.voice.widget.a */
public abstract class AbstractC41095a {

    /* renamed from: a */
    public static final AbstractC41095a f104747a = new C41097b();

    /* renamed from: b */
    public static final AbstractC41095a f104748b = new C41096a();

    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.voice.widget.a$a */
    public static class C41096a extends AbstractC41095a {
        @Override // com.ss.android.lark.keyboard.plugin.tool.voice.widget.AbstractC41095a
        /* renamed from: a */
        public float mo148200a(float f) {
            return f;
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.voice.widget.AbstractC41095a
        /* renamed from: b */
        public float mo148201b(float f) {
            return f;
        }
    }

    /* renamed from: a */
    public abstract float mo148200a(float f);

    /* renamed from: b */
    public abstract float mo148201b(float f);

    /* renamed from: c */
    public float mo148202c(float f) {
        return 1.0f;
    }

    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.voice.widget.a$b */
    public static class C41097b extends AbstractC41095a {

        /* renamed from: c */
        private final Interpolator f104749c;

        /* renamed from: d */
        private final Interpolator f104750d;

        public C41097b() {
            this(3.0f);
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.voice.widget.AbstractC41095a
        /* renamed from: a */
        public float mo148200a(float f) {
            return this.f104749c.getInterpolation(f);
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.voice.widget.AbstractC41095a
        /* renamed from: b */
        public float mo148201b(float f) {
            return this.f104750d.getInterpolation(f);
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.voice.widget.AbstractC41095a
        /* renamed from: c */
        public float mo148202c(float f) {
            return 1.0f / ((1.0f - mo148200a(f)) + mo148201b(f));
        }

        public C41097b(float f) {
            this.f104749c = new AccelerateInterpolator(f);
            this.f104750d = new DecelerateInterpolator(f);
        }
    }

    /* renamed from: a */
    public static AbstractC41095a m162933a(int i) {
        if (i == 0) {
            return f104747a;
        }
        if (i == 1) {
            return f104748b;
        }
        throw new IllegalArgumentException("Unknown id: " + i);
    }
}
