package com.google.android.material.floatingactionbutton;

import android.animation.Animator;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.material.floatingactionbutton.a */
public class C22285a {

    /* renamed from: a */
    private Animator f54506a;

    /* renamed from: b */
    public void mo77578b() {
        this.f54506a = null;
    }

    C22285a() {
    }

    /* renamed from: a */
    public void mo77576a() {
        Animator animator = this.f54506a;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* renamed from: a */
    public void mo77577a(Animator animator) {
        mo77576a();
        this.f54506a = animator;
    }
}
