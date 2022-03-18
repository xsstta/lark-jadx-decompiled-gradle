package com.bytedance.ee.larkbrand.nativeMoudule.photo;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.animation.TranslateAnimation;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.tt.miniapp.chooser.view.HackyViewPager;

public class FlexibleViewPager extends HackyViewPager {

    /* renamed from: a */
    float f34883a = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: b */
    int f34884b = 0;

    /* renamed from: c */
    private boolean f34885c = true;

    /* renamed from: d */
    private boolean f34886d;

    /* renamed from: e */
    private Rect f34887e = new Rect();

    /* renamed from: f */
    private AbstractC13159a f34888f;

    /* renamed from: com.bytedance.ee.larkbrand.nativeMoudule.photo.FlexibleViewPager$a */
    public interface AbstractC13159a {
        /* renamed from: a */
        void mo49224a();

        /* renamed from: b */
        void mo49225b();
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
    }

    public void setOnRefreshListener(AbstractC13159a aVar) {
        this.f34888f = aVar;
    }

    public FlexibleViewPager(Context context) {
        super(context);
    }

    /* renamed from: a */
    public void mo49221a(int i) {
        if (this.f34888f != null) {
            if (i > getWidth() / 6) {
                this.f34888f.mo49225b();
            } else if (i < (-getWidth()) / 6) {
                this.f34888f.mo49224a();
            }
        }
        this.f34883a = BitmapDescriptorFactory.HUE_RED;
        TranslateAnimation translateAnimation = new TranslateAnimation(getX(), (float) this.f34887e.left, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        translateAnimation.setDuration(200);
        startAnimation(translateAnimation);
        layout(this.f34887e.left, this.f34887e.top, this.f34887e.right, this.f34887e.bottom);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 1) {
            if (action == 2) {
                if (this.f34883a == BitmapDescriptorFactory.HUE_RED) {
                    this.f34883a = motionEvent.getX();
                }
                int x = ((int) (this.f34883a - motionEvent.getX())) / 2;
                this.f34884b = x;
                if ((this.f34885c && x <= 0) || (this.f34886d && x >= 0)) {
                    layout(-x, this.f34887e.top, this.f34887e.right - this.f34884b, this.f34887e.bottom);
                    return true;
                }
            }
        } else if (this.f34885c || this.f34886d) {
            mo49221a(this.f34884b);
        }
        return super.onTouchEvent(motionEvent);
    }

    public FlexibleViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.viewpager.widget.ViewPager
    public void onPageScrolled(int i, float f, int i2) {
        if (getAdapter() == null && getAdapter().getCount() == 0) {
            this.f34885c = false;
            this.f34886d = false;
        } else if (i == 0 && f == BitmapDescriptorFactory.HUE_RED && i2 == 0) {
            this.f34885c = true;
        } else if (i == getAdapter().getCount() - 1 && f == BitmapDescriptorFactory.HUE_RED && i2 == 0) {
            this.f34886d = true;
        } else {
            this.f34885c = false;
            this.f34886d = false;
        }
        if (this.f34887e.isEmpty() || this.f34887e.top - this.f34887e.bottom == 0) {
            this.f34887e.set(getLeft(), getTop(), getRight(), getBottom());
        }
        super.onPageScrolled(i, f, i2);
    }
}
