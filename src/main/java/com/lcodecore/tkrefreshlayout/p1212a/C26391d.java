package com.lcodecore.tkrefreshlayout.p1212a;

import android.os.Handler;
import android.os.Message;
import android.view.MotionEvent;
import android.view.View;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout;
import com.lcodecore.tkrefreshlayout.p1213b.C26397c;

/* renamed from: com.lcodecore.tkrefreshlayout.a.d */
public class C26391d extends AbstractC26389b {

    /* renamed from: c */
    public float f65123c;

    /* renamed from: d */
    public int f65124d;

    /* renamed from: e */
    public Handler f65125e = new Handler() {
        /* class com.lcodecore.tkrefreshlayout.p1212a.C26391d.HandlerC263921 */

        public void handleMessage(Message message) {
            int n = C26391d.this.f65122b.mo93606n();
            int i = message.what;
            if (i == 0) {
                C26391d.this.f65124d = -1;
            } else if (i != 1) {
                if (i == 2) {
                    C26391d.this.f65124d = 60;
                    return;
                }
                return;
            }
            C26391d.this.f65124d++;
            View k = C26391d.this.f65122b.mo93603k();
            if (C26391d.this.f65122b.mo93560C()) {
                if (C26391d.this.f65123c >= 3000.0f) {
                    if (C26397c.m95596a(k, n)) {
                        C26391d.this.f65122b.mo93586b().mo93629a(C26391d.this.f65123c, C26391d.this.f65124d);
                        C26391d.this.f65123c = BitmapDescriptorFactory.HUE_RED;
                        C26391d.this.f65124d = 60;
                    }
                } else if (C26391d.this.f65123c <= -3000.0f && C26397c.m95601b(k, n)) {
                    C26391d.this.f65122b.mo93586b().mo93636b(C26391d.this.f65123c, C26391d.this.f65124d);
                    C26391d.this.f65123c = BitmapDescriptorFactory.HUE_RED;
                    C26391d.this.f65124d = 60;
                }
            }
            if (C26391d.this.f65124d < 60) {
                C26391d.this.f65125e.sendEmptyMessageDelayed(1, 10);
            }
        }
    };

    /* renamed from: f */
    private boolean f65126f;

    /* renamed from: g */
    private boolean f65127g;

    /* renamed from: h */
    private boolean f65128h;

    @Override // com.lcodecore.tkrefreshlayout.p1212a.AbstractC26390c
    /* renamed from: b */
    public boolean mo93664b(MotionEvent motionEvent) {
        if (this.f65121a == null || !this.f65121a.mo93664b(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // com.lcodecore.tkrefreshlayout.p1212a.AbstractC26390c
    /* renamed from: c */
    public boolean mo93665c(MotionEvent motionEvent) {
        if (this.f65121a == null || !this.f65121a.mo93665c(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // com.lcodecore.tkrefreshlayout.p1212a.AbstractC26390c
    /* renamed from: a */
    public boolean mo93663a(MotionEvent motionEvent) {
        if (this.f65121a == null || !this.f65121a.mo93663a(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // com.lcodecore.tkrefreshlayout.p1212a.AbstractC26390c
    /* renamed from: d */
    public void mo93666d(MotionEvent motionEvent) {
        if (this.f65121a != null) {
            this.f65121a.mo93666d(motionEvent);
        }
        this.f65126f = C26397c.m95596a(this.f65122b.mo93603k(), this.f65122b.mo93606n());
        this.f65127g = C26397c.m95601b(this.f65122b.mo93603k(), this.f65122b.mo93606n());
    }

    public C26391d(TwinklingRefreshLayout.C26373a aVar, AbstractC26390c cVar) {
        super(aVar, cVar);
    }

    @Override // com.lcodecore.tkrefreshlayout.p1212a.AbstractC26390c
    /* renamed from: a */
    public void mo93662a(MotionEvent motionEvent, boolean z) {
        boolean z2;
        if (this.f65121a != null) {
            AbstractC26390c cVar = this.f65121a;
            if (!this.f65128h || !z) {
                z2 = false;
            } else {
                z2 = true;
            }
            cVar.mo93662a(motionEvent, z2);
        }
        this.f65128h = false;
    }

    @Override // com.lcodecore.tkrefreshlayout.p1212a.AbstractC26390c
    /* renamed from: a */
    public void mo93660a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.f65121a != null) {
            this.f65121a.mo93660a(motionEvent, motionEvent2, f, f2);
        }
        if (this.f65122b.mo93616x()) {
            int y = (int) (motionEvent2.getY() - motionEvent.getY());
            if (y < (-this.f65122b.mo93606n()) && this.f65127g) {
                return;
            }
            if (y <= this.f65122b.mo93606n() || !this.f65126f) {
                this.f65123c = f2;
                if (Math.abs(f2) >= 3000.0f) {
                    this.f65125e.sendEmptyMessage(0);
                    this.f65128h = true;
                    return;
                }
                this.f65123c = BitmapDescriptorFactory.HUE_RED;
                this.f65124d = 60;
            }
        }
    }

    @Override // com.lcodecore.tkrefreshlayout.p1212a.AbstractC26390c
    /* renamed from: a */
    public void mo93661a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2, float f3, float f4) {
        if (this.f65121a != null) {
            this.f65121a.mo93661a(motionEvent, motionEvent2, f, f2, f3, f4);
        }
    }
}
