package com.ss.android.lark.mail.impl.view.undo;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.mail.impl.view.undo.AbstractC43978c;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.mail.impl.view.undo.d */
public class C43980d extends AbstractC43978c {

    /* renamed from: b */
    private final ViewPropertyAnimator f111613b;

    /* access modifiers changed from: package-private */
    @Override // com.ss.android.lark.mail.impl.view.undo.AbstractC43978c
    /* renamed from: a */
    public void mo156527a(float f) {
        this.f111612a.setAlpha(f);
    }

    C43980d(View view) {
        super(view);
        this.f111613b = view.animate();
    }

    /* access modifiers changed from: package-private */
    @Override // com.ss.android.lark.mail.impl.view.undo.AbstractC43978c
    /* renamed from: a */
    public void mo156528a(long j) {
        this.f111613b.cancel();
        this.f111613b.alpha(1.0f).setDuration(j).setListener(null);
    }

    /* access modifiers changed from: package-private */
    @Override // com.ss.android.lark.mail.impl.view.undo.AbstractC43978c
    /* renamed from: a */
    public void mo156529a(long j, final AbstractC43978c.AbstractC43979a aVar) {
        this.f111613b.cancel();
        this.f111613b.alpha(BitmapDescriptorFactory.HUE_RED).setDuration(j).setListener(new AnimatorListenerAdapter() {
            /* class com.ss.android.lark.mail.impl.view.undo.C43980d.C439811 */

            public void onAnimationEnd(Animator animator) {
                aVar.mo156493a();
            }
        });
    }
}
