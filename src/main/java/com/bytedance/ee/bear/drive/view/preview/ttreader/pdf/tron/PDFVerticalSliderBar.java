package com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.customview.p030a.C0959c;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13749l;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.concurrent.TimeUnit;

public class PDFVerticalSliderBar extends FrameLayout {

    /* renamed from: a */
    public ViewGroup f20109a;

    /* renamed from: b */
    public TextView f20110b;

    /* renamed from: c */
    public AbstractC7461a f20111c;

    /* renamed from: d */
    public int f20112d;

    /* renamed from: e */
    public int f20113e;

    /* renamed from: f */
    public boolean f20114f;

    /* renamed from: g */
    public int f20115g;

    /* renamed from: h */
    public int f20116h;

    /* renamed from: i */
    private C0959c f20117i;

    /* renamed from: j */
    private TextView f20118j;

    /* renamed from: k */
    private ValueAnimator f20119k;

    /* renamed from: l */
    private Disposable f20120l;

    /* renamed from: com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.PDFVerticalSliderBar$a */
    public interface AbstractC7461a {
        /* renamed from: a */
        void mo29074a();

        /* renamed from: a */
        void mo29075a(int i);

        /* renamed from: a */
        void mo29076a(int i, int i2, boolean z);

        /* renamed from: b */
        void mo29077b();
    }

    public int getCurrentIndicatorPage() {
        return this.f20113e;
    }

    public int getIndicatorHeight() {
        return this.f20118j.getHeight();
    }

    public float getIndicatorPercent() {
        if (getHeight() <= 0) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        return (((float) this.f20115g) * 1.0f) / ((float) getHeight());
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Disposable disposable = this.f20120l;
        if (disposable != null && !disposable.isDisposed()) {
            this.f20120l.dispose();
        }
    }

    /* renamed from: a */
    public void mo29096a() {
        int i = this.f20113e + 1;
        this.f20118j.setText(String.valueOf(i));
        if (i < 100) {
            this.f20118j.setTextSize(2, 16.0f);
        } else if (i < 1000) {
            this.f20118j.setTextSize(2, 13.0f);
        } else if (i < 10000) {
            this.f20118j.setTextSize(2, 10.0f);
        } else {
            this.f20118j.setTextSize(2, 7.0f);
        }
    }

    /* renamed from: b */
    private void m29825b() {
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(getContext()).inflate(R.layout.drive_slider_indicator, (ViewGroup) this, false);
        this.f20109a = viewGroup;
        this.f20118j = (TextView) viewGroup.findViewById(R.id.drive_slider_indicator_tv);
        this.f20110b = new TextView(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, C13749l.m55738a(24));
        layoutParams.gravity = 5;
        layoutParams.rightMargin = -C13749l.m55738a(2);
        this.f20110b.setLayoutParams(layoutParams);
        this.f20110b.setPadding(C13749l.m55738a(7), 0, C13749l.m55738a(7), 0);
        this.f20110b.setGravity(17);
        this.f20110b.setVisibility(4);
        this.f20110b.setTextColor(-1);
        this.f20110b.setTextSize(2, 10.0f);
        this.f20110b.setTypeface(null, 1);
        this.f20110b.setBackgroundDrawable(getResources().getDrawable(R.drawable.drive_bg_slider_stub_indicator));
        this.f20110b.setElevation((float) C13749l.m55738a(6));
        addView(this.f20110b);
        addView(this.f20109a);
        mo29096a();
        this.f20117i = C0959c.m4642a(this, new C0959c.AbstractC0962a() {
            /* class com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.PDFVerticalSliderBar.C74601 */

            /* renamed from: b */
            private int f20122b;

            @Override // androidx.customview.p030a.C0959c.AbstractC0962a
            /* renamed from: b */
            public boolean mo4900b(View view, int i) {
                boolean z;
                if (view == PDFVerticalSliderBar.this.f20109a) {
                    z = true;
                } else {
                    z = false;
                }
                C13479a.m54764b("PDFVerticalSliderBar", "tryCaptureView() captured=" + z);
                if (!z) {
                    return false;
                }
                PDFVerticalSliderBar.this.f20114f = true;
                PDFVerticalSliderBar pDFVerticalSliderBar = PDFVerticalSliderBar.this;
                pDFVerticalSliderBar.f20116h = pDFVerticalSliderBar.f20109a.getTop();
                PDFVerticalSliderBar.this.f20110b.setText(String.valueOf(PDFVerticalSliderBar.this.f20113e + 1));
                PDFVerticalSliderBar.this.f20110b.setVisibility(0);
                this.f20122b = 0;
                if (PDFVerticalSliderBar.this.f20111c != null) {
                    PDFVerticalSliderBar.this.f20111c.mo29074a();
                }
                return true;
            }

            @Override // androidx.customview.p030a.C0959c.AbstractC0962a
            /* renamed from: a */
            public void mo4893a(View view, float f, float f2) {
                super.mo4893a(view, f, f2);
                C13479a.m54764b("PDFVerticalSliderBar", "onViewReleased()");
                if (PDFVerticalSliderBar.this.f20111c != null) {
                    PDFVerticalSliderBar.this.f20111c.mo29075a(PDFVerticalSliderBar.this.f20113e);
                }
                PDFVerticalSliderBar.this.f20110b.setVisibility(4);
            }

            @Override // androidx.customview.p030a.C0959c.AbstractC0962a
            /* renamed from: b */
            public int mo4897b(View view, int i, int i2) {
                C13479a.m54764b("PDFVerticalSliderBar", "clampViewPositionVertical() dy=" + i2);
                int i3 = 0;
                if (PDFVerticalSliderBar.this.getHeight() - PDFVerticalSliderBar.this.f20109a.getHeight() <= 0) {
                    C13479a.m54764b("PDFVerticalSliderBar", "clampViewPositionVertical() wrong state, return 0.");
                    return 0;
                }
                this.f20122b += i2;
                if (i < 0) {
                    i = 0;
                } else if (i > PDFVerticalSliderBar.this.getHeight() - PDFVerticalSliderBar.this.f20109a.getHeight()) {
                    i = PDFVerticalSliderBar.this.getHeight() - PDFVerticalSliderBar.this.f20109a.getHeight();
                }
                int height = (((int) ((((float) i) * 100.0f) / ((float) (PDFVerticalSliderBar.this.getHeight() - PDFVerticalSliderBar.this.f20109a.getHeight())))) * PDFVerticalSliderBar.this.f20112d) / 100;
                if (height > 0) {
                    if (height >= PDFVerticalSliderBar.this.f20112d - 1) {
                        i3 = PDFVerticalSliderBar.this.f20112d - 1;
                    } else {
                        i3 = height;
                    }
                }
                if (i3 != PDFVerticalSliderBar.this.f20113e) {
                    PDFVerticalSliderBar.this.f20113e = i3;
                    PDFVerticalSliderBar.this.mo29096a();
                }
                PDFVerticalSliderBar pDFVerticalSliderBar = PDFVerticalSliderBar.this;
                pDFVerticalSliderBar.mo29097a(this.f20122b, pDFVerticalSliderBar.f20113e);
                PDFVerticalSliderBar.this.f20115g = i;
                if (PDFVerticalSliderBar.this.f20111c != null) {
                    PDFVerticalSliderBar.this.f20111c.mo29077b();
                }
                return i;
            }
        });
    }

    public void setMaxPageCount(int i) {
        this.f20112d = i;
    }

    public void setSeekListener(AbstractC7461a aVar) {
        this.f20111c = aVar;
    }

    public PDFVerticalSliderBar(Context context) {
        super(context);
        m29825b();
    }

    /* renamed from: a */
    private int m29820a(int i) {
        return m29824b(i, (int) (((((float) i) * 1.0f) / ((float) this.f20112d)) * ((float) (getHeight() - this.f20109a.getHeight()))));
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean a = this.f20117i.mo4867a(motionEvent);
        C13479a.m54764b("PDFVerticalSliderBar", "slider onInterceptTouchEvent=" + a);
        return a;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f20117i.mo4872b(motionEvent);
        if (motionEvent.getAction() != 2) {
            C13479a.m54764b("PDFVerticalSliderBar", "slider onTouchEvent acton=" + motionEvent.getAction());
        }
        if (this.f20117i.mo4870b() == 1) {
            return true;
        }
        return false;
    }

    public void setCurrentIndicatorPage(int i) {
        this.f20113e = i;
        mo29096a();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f20109a.getLayoutParams();
        if (!this.f20114f) {
            ValueAnimator valueAnimator = this.f20119k;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f20119k.cancel();
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(layoutParams.topMargin, m29820a(this.f20113e));
            this.f20119k = ofInt;
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(layoutParams) {
                /* class com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.$$Lambda$PDFVerticalSliderBar$IoO_GH4uw3vsR_0ILL5qwOaYjEk */
                public final /* synthetic */ FrameLayout.LayoutParams f$1;

                {
                    this.f$1 = r2;
                }

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    PDFVerticalSliderBar.this.m29822a((PDFVerticalSliderBar) this.f$1, (FrameLayout.LayoutParams) valueAnimator);
                }
            });
            this.f20119k.start();
        } else {
            layoutParams.topMargin = m29824b(this.f20113e, this.f20115g);
            this.f20115g = layoutParams.topMargin;
            this.f20109a.setLayoutParams(layoutParams);
        }
        this.f20114f = false;
    }

    public PDFVerticalSliderBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m29825b();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m29821a(int i, Integer num) throws Exception {
        AbstractC7461a aVar = this.f20111c;
        if (aVar != null) {
            aVar.mo29076a(i, num.intValue(), true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m29822a(FrameLayout.LayoutParams layoutParams, ValueAnimator valueAnimator) {
        layoutParams.topMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.f20115g = layoutParams.topMargin;
        this.f20109a.setLayoutParams(layoutParams);
    }

    /* renamed from: b */
    private int m29824b(int i, int i2) {
        if (i2 < 0 || i <= 0) {
            return 0;
        }
        if (i2 > getHeight() - this.f20109a.getHeight() || i >= this.f20112d - 1) {
            return getHeight() - this.f20109a.getHeight();
        }
        return i2;
    }

    /* renamed from: a */
    public void mo29097a(int i, int i2) {
        Disposable disposable = this.f20120l;
        if (disposable != null && !disposable.isDisposed()) {
            C13479a.m54772d("PDFVerticalSliderBar", "user move too fast, ignore it");
            this.f20120l.dispose();
        }
        this.f20120l = AbstractC68307f.m265083a(Integer.valueOf(i2)).mo238019d(10, TimeUnit.MILLISECONDS).mo237985a(C11678b.m48481e()).mo238001b(new Consumer(i) {
            /* class com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.$$Lambda$PDFVerticalSliderBar$Swqqr7OS1ckN2FgePn7uULKEmFU */
            public final /* synthetic */ int f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                PDFVerticalSliderBar.this.m29821a((PDFVerticalSliderBar) this.f$1, (int) ((Integer) obj));
            }
        }, $$Lambda$PDFVerticalSliderBar$LhkIj_bXG6PAwifERK4KblejBo.INSTANCE);
    }

    public PDFVerticalSliderBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m29825b();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ViewGroup viewGroup = this.f20109a;
        viewGroup.layout(viewGroup.getLeft(), this.f20115g, this.f20109a.getRight(), this.f20115g + this.f20109a.getHeight());
        if (this.f20114f) {
            TextView textView = this.f20110b;
            textView.layout(textView.getLeft(), this.f20116h, this.f20110b.getRight(), this.f20116h + this.f20110b.getHeight());
        }
    }
}
