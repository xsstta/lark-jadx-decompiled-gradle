package com.bytedance.ee.bear.drive.biz.feed;

import android.animation.ValueAnimator;
import android.view.View;
import com.bytedance.ee.bear.drive.biz.comment.AbstractC6395l;
import com.bytedance.ee.bear.drive.biz.preview.screen.DriveFullScreenVM;
import com.bytedance.ee.bear.drive.core.C6937b;
import com.bytedance.ee.bear.drive.core.model.AbstractC6946a;
import com.bytedance.ee.util.p718t.C13727b;

/* renamed from: com.bytedance.ee.bear.drive.biz.feed.d */
public class C6462d {

    /* renamed from: a */
    public ValueAnimator f17849a;

    /* renamed from: b */
    private C6937b f17850b;

    /* renamed from: c */
    private DriveFullScreenVM f17851c;

    /* renamed from: d */
    private View f17852d;

    /* renamed from: e */
    private AbstractC6395l f17853e;

    /* renamed from: f */
    private int f17854f;

    /* renamed from: g */
    private int f17855g;

    /* renamed from: a */
    public AbstractC6395l mo25840a() {
        return this.f17853e;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m25943b() {
        this.f17854f = this.f17852d.getHeight();
    }

    /* renamed from: a */
    public void mo25841a(int i) {
        AbstractC6946a fileModel = this.f17850b.getFileModel();
        if (i != this.f17855g && fileModel != null && this.f17852d != null) {
            if (i != 0 || this.f17851c.getLiveFullScreen().mo5927b() == null || !this.f17851c.getLiveFullScreen().mo5927b().booleanValue()) {
                this.f17855g = i;
                ValueAnimator valueAnimator = this.f17849a;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                if (this.f17855g == 0) {
                    this.f17849a = C13727b.m55678a(this.f17852d, 0, this.f17854f);
                } else {
                    this.f17849a = C13727b.m55678a(this.f17852d, this.f17854f, 0);
                }
                this.f17849a.setDuration(150L);
                this.f17849a.start();
            }
        }
    }

    public C6462d(C6937b bVar, DriveFullScreenVM bVar2, AbstractC6395l lVar, View view) {
        this.f17850b = bVar;
        this.f17851c = bVar2;
        this.f17853e = lVar;
        this.f17852d = view;
        if (view != null) {
            view.post(new Runnable() {
                /* class com.bytedance.ee.bear.drive.biz.feed.$$Lambda$d$f_Ntd93oDuK10juFGLf4sd6aDDU */

                public final void run() {
                    C6462d.this.m25943b();
                }
            });
            this.f17852d.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
                /* class com.bytedance.ee.bear.drive.biz.feed.C6462d.View$OnAttachStateChangeListenerC64631 */

                public void onViewAttachedToWindow(View view) {
                }

                public void onViewDetachedFromWindow(View view) {
                    if (C6462d.this.f17849a != null && C6462d.this.f17849a.isRunning()) {
                        C6462d.this.f17849a.cancel();
                    }
                }
            });
        }
    }
}
