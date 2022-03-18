package com.ss.android.photoeditor.ve.p3013b;

import android.content.Context;
import android.view.MotionEvent;

/* renamed from: com.ss.android.photoeditor.ve.b.b */
public class C59831b extends AbstractC59833c {

    /* renamed from: l */
    private final AbstractC59832a f148756l;

    /* renamed from: m */
    private boolean f148757m;

    /* renamed from: com.ss.android.photoeditor.ve.b.b$a */
    public interface AbstractC59832a {
        /* renamed from: a */
        boolean mo203644a(C59831b bVar);

        /* renamed from: b */
        void mo203645b(C59831b bVar);

        /* renamed from: c */
        boolean mo203646c(C59831b bVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.photoeditor.ve.p3013b.AbstractC59830a
    /* renamed from: a */
    public void mo203638a() {
        super.mo203638a();
        this.f148757m = false;
    }

    /* renamed from: b */
    public float mo203643b() {
        return (float) (((Math.atan2((double) this.f148759i, (double) this.f148758h) - Math.atan2((double) this.f148761k, (double) this.f148760j)) * 180.0d) / 3.141592653589793d);
    }

    public C59831b(Context context, AbstractC59832a aVar) {
        super(context);
        this.f148756l = aVar;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.photoeditor.ve.p3013b.AbstractC59830a, com.ss.android.photoeditor.ve.p3013b.AbstractC59833c
    /* renamed from: a */
    public void mo203639a(int i, MotionEvent motionEvent) {
        if (i != 2) {
            if (i == 5) {
                mo203638a();
                this.f148751c = MotionEvent.obtain(motionEvent);
                this.f148755g = 0;
                mo203642b(motionEvent);
                boolean c = mo203647c(motionEvent);
                this.f148757m = c;
                if (!c) {
                    this.f148750b = this.f148756l.mo203646c(this);
                }
            }
        } else if (this.f148757m) {
            boolean c2 = mo203647c(motionEvent);
            this.f148757m = c2;
            if (!c2) {
                this.f148750b = this.f148756l.mo203646c(this);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.photoeditor.ve.p3013b.AbstractC59830a, com.ss.android.photoeditor.ve.p3013b.AbstractC59833c
    /* renamed from: b */
    public void mo203641b(int i, MotionEvent motionEvent) {
        if (i == 2) {
            mo203642b(motionEvent);
            if (this.f148753e / this.f148754f > 0.67f && this.f148756l.mo203644a(this)) {
                this.f148751c.recycle();
                this.f148751c = MotionEvent.obtain(motionEvent);
            }
        } else if (i == 3) {
            if (!this.f148757m) {
                this.f148756l.mo203645b(this);
            }
            mo203638a();
        } else if (i == 6) {
            mo203642b(motionEvent);
            if (!this.f148757m) {
                this.f148756l.mo203645b(this);
            }
            mo203638a();
        }
    }
}
