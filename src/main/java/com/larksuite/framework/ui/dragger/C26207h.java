package com.larksuite.framework.ui.dragger;

import android.graphics.Color;

/* renamed from: com.larksuite.framework.ui.dragger.h */
public class C26207h {

    /* renamed from: a */
    private DragTriggerAction f64706a = DragTriggerAction.LONG_PRESS;

    /* renamed from: b */
    private boolean f64707b = true;

    /* renamed from: c */
    private int f64708c = Color.argb(238, 193, 193, 193);

    /* renamed from: d */
    private float f64709d = 1.0f;

    /* renamed from: a */
    public DragTriggerAction mo93210a() {
        return this.f64706a;
    }

    /* renamed from: b */
    public boolean mo93215b() {
        return this.f64707b;
    }

    /* renamed from: c */
    public int mo93216c() {
        return this.f64708c;
    }

    /* renamed from: d */
    public float mo93217d() {
        return this.f64709d;
    }

    /* renamed from: a */
    public C26207h mo93211a(int i) {
        this.f64708c = i;
        return this;
    }

    /* renamed from: a */
    public C26207h mo93212a(DragTriggerAction dragTriggerAction) {
        this.f64706a = dragTriggerAction;
        return this;
    }

    /* renamed from: a */
    public C26207h mo93213a(boolean z) {
        this.f64707b = z;
        return this;
    }

    /* renamed from: a */
    public void mo93214a(float f) {
        this.f64709d = f;
    }
}
