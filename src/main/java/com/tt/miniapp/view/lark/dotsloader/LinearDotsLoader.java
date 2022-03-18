package com.tt.miniapp.view.lark.dotsloader;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.suite.R;
import java.util.Timer;
import java.util.TimerTask;

public class LinearDotsLoader extends DotsLoaderBaseView {

    /* renamed from: l */
    public boolean f169532l;

    /* renamed from: m */
    public boolean f169533m;

    /* renamed from: n */
    public int f169534n;

    /* renamed from: o */
    public final Handler f169535o;

    /* renamed from: p */
    private Timer f169536p;

    /* renamed from: q */
    private int f169537q;

    /* renamed from: r */
    private int f169538r;

    /* renamed from: s */
    private int f169539s;

    /* renamed from: t */
    private boolean f169540t;

    /* renamed from: d */
    private void m261864d() {
        AppBrandLogger.m52828d("LinearDotsLoader", "scheduleTimer enter");
        Timer timer = new Timer();
        this.f169536p = timer;
        timer.scheduleAtFixedRate(new TimerTask() {
            /* class com.tt.miniapp.view.lark.dotsloader.LinearDotsLoader.C671971 */

            public void run() {
                if (LinearDotsLoader.this.f169532l) {
                    LinearDotsLoader.this.f169524h++;
                    if (LinearDotsLoader.this.f169524h > LinearDotsLoader.this.f169534n) {
                        LinearDotsLoader.this.f169524h = 1;
                    }
                } else if (LinearDotsLoader.this.f169533m) {
                    LinearDotsLoader.this.f169524h++;
                    if (LinearDotsLoader.this.f169524h == LinearDotsLoader.this.f169534n) {
                        LinearDotsLoader linearDotsLoader = LinearDotsLoader.this;
                        linearDotsLoader.f169533m = true ^ linearDotsLoader.f169533m;
                    }
                } else {
                    LinearDotsLoader.this.f169524h--;
                    if (LinearDotsLoader.this.f169524h == 1) {
                        LinearDotsLoader linearDotsLoader2 = LinearDotsLoader.this;
                        linearDotsLoader2.f169533m = true ^ linearDotsLoader2.f169533m;
                    }
                }
                LinearDotsLoader.this.f169535o.post(new Runnable() {
                    /* class com.tt.miniapp.view.lark.dotsloader.LinearDotsLoader.C671971.RunnableC671981 */

                    public void run() {
                        LinearDotsLoader.this.invalidate();
                    }
                });
            }
        }, 0, (long) this.f169517a);
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapp.view.lark.dotsloader.DotsLoaderBaseView
    /* renamed from: a */
    public void mo233610a() {
        this.f169537q = this.f169539s - this.f169526j;
        this.f169518b = new float[this.f169534n];
        for (int i = 0; i < this.f169534n; i++) {
            this.f169518b[i] = (float) ((this.f169538r * i) + (((i * 2) + 1) * this.f169526j));
        }
    }

    public LinearDotsLoader(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m261863a(canvas);
    }

    public void setDotsDistance(int i) {
        this.f169538r = i;
        mo233610a();
    }

    public void setExpandOnSelect(boolean z) {
        this.f169540t = z;
        mo233610a();
    }

    public void setNoOfDots(int i) {
        this.f169534n = i;
        mo233610a();
    }

    public void setSelRadius(int i) {
        this.f169539s = i;
        mo233610a();
    }

    @Override // com.tt.miniapp.view.lark.dotsloader.DotsLoaderBaseView
    /* renamed from: a */
    public void mo233611a(AttributeSet attributeSet) {
        super.mo233611a(attributeSet);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.loader_dotsDist, R.attr.loader_expandOnSelect, R.attr.loader_isSingleDir, R.attr.loader_noOfDots, R.attr.loader_selectedRadius}, 0, 0);
        this.f169534n = obtainStyledAttributes.getInt(3, 3);
        this.f169539s = obtainStyledAttributes.getDimensionPixelSize(4, this.f169526j + 10);
        this.f169538r = obtainStyledAttributes.getDimensionPixelSize(0, 15);
        this.f169532l = obtainStyledAttributes.getBoolean(2, false);
        this.f169540t = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private void m261863a(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = 0;
        while (i9 < this.f169534n) {
            float f = this.f169518b[i9];
            if (this.f169540t) {
                int i10 = i9 + 1;
                if (i10 == this.f169524h) {
                    i8 = this.f169537q;
                } else if (i10 > this.f169524h) {
                    i8 = this.f169537q * 2;
                }
                f += (float) i8;
            }
            if ((!this.f169533m || this.f169524h <= 1) && this.f169524h != this.f169534n) {
                i2 = this.f169524h + 1;
                i = i2 + 1;
            } else {
                i2 = this.f169524h - 1;
                i = i2 - 1;
            }
            i9++;
            if (i9 == this.f169524h) {
                if (this.f169540t) {
                    i6 = this.f169539s;
                } else {
                    i6 = this.f169526j;
                }
                float f2 = (float) i6;
                if (this.f169540t) {
                    i7 = this.f169539s;
                } else {
                    i7 = this.f169526j;
                }
                canvas.drawCircle(f, f2, (float) i7, this.f169520d);
            } else if (this.f169527k && i9 == i2) {
                if (this.f169540t) {
                    i5 = this.f169539s;
                } else {
                    i5 = this.f169526j;
                }
                canvas.drawCircle(f, (float) i5, (float) this.f169526j, this.f169521e);
            } else if (!this.f169527k || i9 != i) {
                if (this.f169540t) {
                    i3 = this.f169539s;
                } else {
                    i3 = this.f169526j;
                }
                canvas.drawCircle(f, (float) i3, (float) this.f169526j, this.f169519c);
            } else {
                if (this.f169540t) {
                    i4 = this.f169539s;
                } else {
                    i4 = this.f169526j;
                }
                canvas.drawCircle(f, (float) i4, (float) this.f169526j, this.f169522f);
            }
        }
    }

    public LinearDotsLoader(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i != 0) {
            Timer timer = this.f169536p;
            if (timer != null) {
                timer.cancel();
            }
        } else if (this.f169523g) {
            m261864d();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        super.onMeasure(i, i2);
        if (this.f169540t) {
            i4 = (this.f169534n * 2 * this.f169526j) + ((this.f169534n - 1) * this.f169538r) + (this.f169537q * 2);
            i3 = this.f169539s * 2;
        } else {
            i3 = this.f169526j * 2;
            i4 = (this.f169534n * 2 * this.f169526j) + ((this.f169534n - 1) * this.f169538r);
        }
        setMeasuredDimension(i4, i3);
    }

    public LinearDotsLoader(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f169532l = true;
        this.f169533m = true;
        this.f169538r = 15;
        this.f169534n = 3;
        this.f169539s = 38;
        this.f169535o = new Handler(Looper.getMainLooper());
        mo233611a(attributeSet);
        mo233610a();
        mo233612b();
        this.f169527k = false;
    }
}
