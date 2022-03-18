package com.webianks.library.scroll_choice;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Scroller;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

public abstract class WheelPicker extends View {

    /* renamed from: A */
    private int f171257A;

    /* renamed from: B */
    private int f171258B;

    /* renamed from: C */
    private int f171259C;

    /* renamed from: D */
    private int f171260D;

    /* renamed from: E */
    private int f171261E;

    /* renamed from: F */
    private int f171262F;

    /* renamed from: G */
    private int f171263G;

    /* renamed from: H */
    private int f171264H;

    /* renamed from: I */
    private int f171265I;

    /* renamed from: J */
    private int f171266J;

    /* renamed from: K */
    private int f171267K;

    /* renamed from: L */
    private int f171268L;

    /* renamed from: M */
    private int f171269M;

    /* renamed from: N */
    private int f171270N;

    /* renamed from: O */
    private int f171271O;

    /* renamed from: P */
    private int f171272P;

    /* renamed from: Q */
    private int f171273Q;

    /* renamed from: R */
    private int f171274R;

    /* renamed from: S */
    private boolean f171275S;

    /* renamed from: T */
    private boolean f171276T;

    /* renamed from: U */
    private boolean f171277U;

    /* renamed from: V */
    private int f171278V;

    /* renamed from: W */
    private int f171279W;

    /* renamed from: a */
    private final Paint f171280a;
    private Runnable aa;

    /* renamed from: b */
    public final Handler f171281b;

    /* renamed from: c */
    public Scroller f171282c;

    /* renamed from: d */
    public AbstractC68085c f171283d;

    /* renamed from: e */
    public AbstractC68086d f171284e;

    /* renamed from: f */
    public AbstractC68084b f171285f;

    /* renamed from: g */
    public int f171286g;

    /* renamed from: h */
    public int f171287h;

    /* renamed from: i */
    public int f171288i;

    /* renamed from: j */
    public int f171289j;

    /* renamed from: k */
    public boolean f171290k;

    /* renamed from: l */
    private Paint f171291l;

    /* renamed from: m */
    private VelocityTracker f171292m;

    /* renamed from: n */
    private Rect f171293n;

    /* renamed from: o */
    private Rect f171294o;

    /* renamed from: p */
    private Rect f171295p;

    /* renamed from: q */
    private Rect f171296q;

    /* renamed from: r */
    private String f171297r;

    /* renamed from: s */
    private int f171298s;

    /* renamed from: t */
    private int f171299t;

    /* renamed from: u */
    private int f171300u;

    /* renamed from: v */
    private int f171301v;

    /* renamed from: w */
    private int f171302w;

    /* renamed from: x */
    private int f171303x;

    /* renamed from: y */
    private int f171304y;

    /* renamed from: z */
    private int f171305z;

    /* renamed from: com.webianks.library.scroll_choice.WheelPicker$b */
    public interface AbstractC68084b {
        /* renamed from: a */
        int mo236938a();

        /* renamed from: a */
        Object mo236939a(int i);

        /* renamed from: b */
        String mo236940b(int i);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.webianks.library.scroll_choice.WheelPicker$c */
    public interface AbstractC68085c {
        /* renamed from: a */
        void mo236941a(WheelPicker wheelPicker, int i);

        /* renamed from: a */
        void mo236942a(WheelPicker wheelPicker, Object obj, int i);
    }

    /* renamed from: com.webianks.library.scroll_choice.WheelPicker$d */
    public interface AbstractC68086d {
        /* renamed from: a */
        void mo236943a(int i);

        /* renamed from: b */
        void mo236944b(int i);

        /* renamed from: c */
        void mo236945c(int i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo236893a(int i, Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo236894b(int i, Object obj);

    public abstract int getDefaultItemPosition();

    public int getCurrentItemPosition() {
        return this.f171288i;
    }

    public int getIndicatorColor() {
        return this.f171258B;
    }

    public int getIndicatorSize() {
        return this.f171257A;
    }

    public int getItemAlign() {
        return this.f171260D;
    }

    public int getItemSpace() {
        return this.f171259C;
    }

    public int getItemTextColor() {
        return this.f171303x;
    }

    public int getItemTextSize() {
        return this.f171305z;
    }

    public String getMaximumWidthText() {
        return this.f171297r;
    }

    public int getMaximumWidthTextPosition() {
        return this.f171271O;
    }

    public int getSelectedItemPosition() {
        return this.f171287h;
    }

    public int getSelectedItemTextColor() {
        return this.f171304y;
    }

    public int getVisibleItemCount() {
        return this.f171298s;
    }

    /* renamed from: com.webianks.library.scroll_choice.WheelPicker$a */
    public static class C68083a implements AbstractC68084b {

        /* renamed from: a */
        private List f171307a;

        @Override // com.webianks.library.scroll_choice.WheelPicker.AbstractC68084b
        /* renamed from: a */
        public int mo236938a() {
            return this.f171307a.size();
        }

        public C68083a() {
            this(new ArrayList());
        }

        @Override // com.webianks.library.scroll_choice.WheelPicker.AbstractC68084b
        /* renamed from: a */
        public Object mo236939a(int i) {
            int a = mo236938a();
            return this.f171307a.get((i + a) % a);
        }

        @Override // com.webianks.library.scroll_choice.WheelPicker.AbstractC68084b
        /* renamed from: b */
        public String mo236940b(int i) {
            return String.valueOf(this.f171307a.get(i));
        }

        public C68083a(List list) {
            ArrayList arrayList = new ArrayList();
            this.f171307a = arrayList;
            arrayList.addAll(list);
        }
    }

    public Typeface getTypeface() {
        Paint paint = this.f171291l;
        if (paint != null) {
            return paint.getTypeface();
        }
        return null;
    }

    /* renamed from: c */
    private void m264588c() {
        int i = this.f171298s;
        if (i >= 2) {
            if (i % 2 == 0) {
                this.f171298s = i + 1;
            }
            int i2 = this.f171298s + 2;
            this.f171299t = i2;
            this.f171300u = i2 / 2;
            return;
        }
        throw new ArithmeticException("Wheel's visible item count can not be less than 2!");
    }

    /* renamed from: e */
    private void m264590e() {
        int i = this.f171260D;
        if (i == 1) {
            this.f171291l.setTextAlign(Paint.Align.LEFT);
        } else if (i != 2) {
            this.f171291l.setTextAlign(Paint.Align.CENTER);
        } else {
            this.f171291l.setTextAlign(Paint.Align.RIGHT);
        }
    }

    /* renamed from: g */
    private void m264592g() {
        int i = this.f171287h;
        int i2 = this.f171286g;
        int i3 = i * i2;
        this.f171263G = ((-i2) * (this.f171285f.mo236938a() - 1)) + i3;
        this.f171264H = i3;
    }

    /* renamed from: i */
    private void m264594i() {
        if (this.f171304y != -1) {
            this.f171296q.set(this.f171293n.left, this.f171268L - this.f171261E, this.f171293n.right, this.f171268L + this.f171261E);
        }
    }

    /* renamed from: f */
    private void m264591f() {
        int i = this.f171260D;
        if (i == 1) {
            this.f171269M = this.f171293n.left;
        } else if (i != 2) {
            this.f171269M = this.f171267K;
        } else {
            this.f171269M = this.f171293n.right;
        }
        this.f171270N = (int) (((float) this.f171268L) - ((this.f171291l.ascent() + this.f171291l.descent()) / 2.0f));
    }

    /* renamed from: h */
    private void m264593h() {
        if (this.f171275S) {
            int i = this.f171257A / 2;
            int i2 = this.f171268L;
            int i3 = this.f171261E;
            int i4 = i2 + i3;
            int i5 = i2 - i3;
            this.f171294o.set(this.f171293n.left, i4 - i, this.f171293n.right, i4 + i);
            this.f171295p.set(this.f171293n.left, i5 - i, this.f171293n.right, i5 + i);
        }
    }

    /* renamed from: a */
    public final void mo236900a() {
        int i = this.f171288i;
        Object a = this.f171285f.mo236939a(i);
        AbstractC68085c cVar = this.f171283d;
        if (cVar != null) {
            cVar.mo236942a(this, a, i);
        }
        mo236893a(i, a);
    }

    /* renamed from: b */
    public void mo236901b() {
        if (this.f171287h > this.f171285f.mo236938a() - 1 || this.f171288i > this.f171285f.mo236938a() - 1) {
            int a = this.f171285f.mo236938a() - 1;
            this.f171288i = a;
            this.f171287h = a;
        } else {
            this.f171287h = this.f171288i;
        }
        this.f171289j = 0;
        m264589d();
        m264592g();
        requestLayout();
        invalidate();
    }

    public Locale getCurrentLocale() {
        if (Build.VERSION.SDK_INT >= 24) {
            return getResources().getConfiguration().getLocales().get(0);
        }
        return getResources().getConfiguration().locale;
    }

    /* renamed from: d */
    private void m264589d() {
        this.f171302w = 0;
        this.f171301v = 0;
        if (m264586a(this.f171271O)) {
            this.f171301v = (int) this.f171291l.measureText(this.f171285f.mo236940b(this.f171271O));
        } else if (!TextUtils.isEmpty(this.f171297r)) {
            this.f171301v = (int) this.f171291l.measureText(this.f171297r);
        } else {
            int a = this.f171285f.mo236938a();
            for (int i = 0; i < a; i++) {
                String b = this.f171285f.mo236940b(i);
                this.f171301v = Math.max(this.f171301v, (int) this.f171291l.measureText(b));
            }
        }
        Paint.FontMetrics fontMetrics = this.f171291l.getFontMetrics();
        this.f171302w = (int) (fontMetrics.bottom - fontMetrics.top);
    }

    public void setOnItemSelectedListener(AbstractC68085c cVar) {
        this.f171283d = cVar;
    }

    public void setOnWheelChangeListener(AbstractC68086d dVar) {
        this.f171284e = dVar;
    }

    public WheelPicker(Context context) {
        this(context, null);
    }

    public void setAdapter(C68083a aVar) {
        this.f171285f = aVar;
        mo236901b();
    }

    public void setAtmospheric(boolean z) {
        this.f171276T = z;
        invalidate();
    }

    public void setIndicatorColor(int i) {
        this.f171258B = i;
        invalidate();
    }

    public void setItemTextColor(int i) {
        this.f171303x = i;
        invalidate();
    }

    public void setIndicator(boolean z) {
        this.f171275S = z;
        m264593h();
        invalidate();
    }

    public void setIndicatorSize(int i) {
        this.f171257A = i;
        m264593h();
        invalidate();
    }

    public void setItemAlign(int i) {
        this.f171260D = i;
        m264590e();
        m264591f();
        invalidate();
    }

    public void setItemSpace(int i) {
        this.f171259C = i;
        requestLayout();
        invalidate();
    }

    public void setSelectedItemTextColor(int i) {
        this.f171304y = i;
        m264594i();
        invalidate();
    }

    public void setVisibleItemCount(int i) {
        this.f171298s = i;
        m264588c();
        requestLayout();
    }

    /* renamed from: a */
    private boolean m264586a(int i) {
        if (i < 0 || i >= this.f171285f.mo236938a()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private int m264587b(int i) {
        int i2;
        if (Math.abs(i) <= this.f171261E) {
            return -i;
        }
        if (this.f171289j < 0) {
            i2 = -this.f171286g;
        } else {
            i2 = this.f171286g;
        }
        return i2 - i;
    }

    public void setItemTextSize(int i) {
        this.f171305z = i;
        this.f171291l.setTextSize((float) i);
        m264589d();
        requestLayout();
        invalidate();
    }

    public void setMaximumWidthText(String str) {
        Objects.requireNonNull(str, "Maximum width text can not be null!");
        this.f171297r = str;
        m264589d();
        requestLayout();
        invalidate();
    }

    public void setTypeface(Typeface typeface) {
        Paint paint = this.f171291l;
        if (paint != null) {
            paint.setTypeface(typeface);
        }
        m264589d();
        requestLayout();
        invalidate();
    }

    public void setMaximumWidthTextPosition(int i) {
        if (m264586a(i)) {
            this.f171271O = i;
            m264589d();
            requestLayout();
            invalidate();
            return;
        }
        throw new ArrayIndexOutOfBoundsException("Maximum width text Position must in [0, " + this.f171285f.mo236938a() + "), but current is " + i);
    }

    public void setSelectedItemPosition(int i) {
        int max = Math.max(Math.min(i, this.f171285f.mo236938a() - 1), 0);
        this.f171287h = max;
        this.f171288i = max;
        this.f171289j = 0;
        m264592g();
        requestLayout();
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        String str;
        AbstractC68086d dVar = this.f171284e;
        if (dVar != null) {
            dVar.mo236943a(this.f171289j);
        }
        int i = ((-this.f171289j) / this.f171286g) - this.f171300u;
        this.f171280a.setColor(this.f171278V);
        canvas.drawRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) canvas.getWidth(), (float) canvas.getHeight(), this.f171280a);
        this.f171280a.setColor(this.f171279W);
        this.f171280a.setStyle(Paint.Style.FILL);
        canvas.drawRect(this.f171296q, this.f171280a);
        int i2 = this.f171287h + i;
        int i3 = -this.f171300u;
        while (i2 < this.f171287h + i + this.f171299t) {
            if (m264586a(i2)) {
                str = this.f171285f.mo236940b(i2);
            } else {
                str = "";
            }
            this.f171291l.setColor(this.f171303x);
            this.f171291l.setTextSize((float) this.f171305z);
            this.f171291l.setStyle(Paint.Style.FILL);
            int i4 = 0;
            this.f171291l.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            int i5 = this.f171270N;
            int i6 = this.f171286g;
            int i7 = (i3 * i6) + i5 + (this.f171289j % i6);
            if (this.f171276T) {
                int abs = (int) (((((float) (i5 - Math.abs(i5 - i7))) * 1.0f) / ((float) this.f171270N)) * 255.0f);
                if (abs >= 0) {
                    i4 = abs;
                }
                this.f171291l.setAlpha(i4);
            }
            if (this.f171304y != -1) {
                canvas.save();
                canvas.clipRect(this.f171296q, Region.Op.DIFFERENCE);
                float f = (float) i7;
                canvas.drawText(str, (float) this.f171269M, f, this.f171291l);
                canvas.restore();
                this.f171291l.setColor(this.f171304y);
                this.f171291l.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
                this.f171291l.setTextSize((float) (this.f171305z + 10));
                canvas.save();
                canvas.clipRect(this.f171296q);
                canvas.drawText(str, (float) this.f171269M, f, this.f171291l);
                canvas.restore();
            } else {
                canvas.save();
                canvas.clipRect(this.f171293n);
                canvas.drawText(str, (float) this.f171269M, (float) i7, this.f171291l);
                canvas.restore();
            }
            i2++;
            i3++;
        }
        if (this.f171275S) {
            this.f171291l.setColor(this.f171258B);
            this.f171291l.setStyle(Paint.Style.FILL);
            canvas.drawRect(this.f171294o, this.f171291l);
            canvas.drawRect(this.f171295p, this.f171291l);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            VelocityTracker velocityTracker = this.f171292m;
            if (velocityTracker == null) {
                this.f171292m = VelocityTracker.obtain();
            } else {
                velocityTracker.clear();
            }
            this.f171292m.addMovement(motionEvent);
            if (!this.f171282c.isFinished()) {
                this.f171282c.abortAnimation();
                this.f171290k = true;
            }
            int y = (int) motionEvent.getY();
            this.f171272P = y;
            this.f171273Q = y;
        } else if (action == 1) {
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
            if (!this.f171277U) {
                this.f171292m.addMovement(motionEvent);
                if (Build.VERSION.SDK_INT >= 4) {
                    this.f171292m.computeCurrentVelocity(1000, (float) this.f171266J);
                } else {
                    this.f171292m.computeCurrentVelocity(1000);
                }
                this.f171290k = false;
                int yVelocity = (int) this.f171292m.getYVelocity();
                if (Math.abs(yVelocity) > this.f171265I) {
                    this.f171282c.fling(0, this.f171289j, 0, yVelocity, 0, 0, this.f171263G, this.f171264H);
                    Scroller scroller = this.f171282c;
                    scroller.setFinalY(scroller.getFinalY() + m264587b(this.f171282c.getFinalY() % this.f171286g));
                } else {
                    Scroller scroller2 = this.f171282c;
                    int i = this.f171289j;
                    scroller2.startScroll(0, i, 0, m264587b(i % this.f171286g));
                }
                this.f171281b.post(this.aa);
                VelocityTracker velocityTracker2 = this.f171292m;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f171292m = null;
                }
            }
        } else if (action != 2) {
            if (action == 3) {
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
                VelocityTracker velocityTracker3 = this.f171292m;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f171292m = null;
                }
            }
        } else if (Math.abs(((float) this.f171273Q) - motionEvent.getY()) < ((float) this.f171274R)) {
            this.f171277U = true;
        } else {
            this.f171277U = false;
            this.f171292m.addMovement(motionEvent);
            AbstractC68086d dVar = this.f171284e;
            if (dVar != null) {
                dVar.mo236945c(1);
            }
            float y2 = motionEvent.getY() - ((float) this.f171272P);
            if (Math.abs(y2) >= 1.0f) {
                this.f171289j = (int) (((float) this.f171289j) + y2);
                this.f171272P = (int) motionEvent.getY();
                invalidate();
            }
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i3 = this.f171301v;
        int i4 = this.f171302w;
        int i5 = this.f171298s;
        int i6 = (i4 * i5) + (this.f171259C * (i5 - 1));
        setMeasuredDimension(m264585a(mode, size, i3 + getPaddingLeft() + getPaddingRight()), m264585a(mode2, size2, i6 + getPaddingTop() + getPaddingBottom()));
    }

    public WheelPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f171281b = new Handler();
        this.f171265I = 50;
        this.f171266J = JosStatusCodes.RTN_CODE_COMMON_ERROR;
        this.f171274R = 8;
        this.aa = new Runnable() {
            /* class com.webianks.library.scroll_choice.WheelPicker.RunnableC680821 */

            public void run() {
                int a;
                if (WheelPicker.this.f171285f != null && (a = WheelPicker.this.f171285f.mo236938a()) != 0) {
                    if (WheelPicker.this.f171282c.isFinished() && !WheelPicker.this.f171290k) {
                        if (WheelPicker.this.f171286g != 0) {
                            int i = (((-WheelPicker.this.f171289j) / WheelPicker.this.f171286g) + WheelPicker.this.f171287h) % a;
                            if (i < 0) {
                                i += a;
                            }
                            WheelPicker.this.f171288i = i;
                            WheelPicker.this.mo236900a();
                            if (WheelPicker.this.f171284e != null) {
                                WheelPicker.this.f171284e.mo236944b(i);
                                WheelPicker.this.f171284e.mo236945c(0);
                            }
                        } else {
                            return;
                        }
                    }
                    if (WheelPicker.this.f171282c.computeScrollOffset()) {
                        if (WheelPicker.this.f171284e != null) {
                            WheelPicker.this.f171284e.mo236945c(2);
                        }
                        WheelPicker wheelPicker = WheelPicker.this;
                        wheelPicker.f171289j = wheelPicker.f171282c.getCurrY();
                        int i2 = (((-WheelPicker.this.f171289j) / WheelPicker.this.f171286g) + WheelPicker.this.f171287h) % a;
                        if (WheelPicker.this.f171283d != null) {
                            WheelPicker.this.f171283d.mo236941a(WheelPicker.this, i2);
                        }
                        WheelPicker wheelPicker2 = WheelPicker.this;
                        wheelPicker2.mo236894b(i2, wheelPicker2.f171285f.mo236939a(i2));
                        WheelPicker.this.postInvalidate();
                        WheelPicker.this.f171281b.postDelayed(this, 16);
                    }
                }
            }
        };
        this.f171285f = new C68083a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.scroll_atmospheric, R.attr.scroll_background_color, R.attr.scroll_data, R.attr.scroll_indicator, R.attr.scroll_indicator_color, R.attr.scroll_indicator_size, R.attr.scroll_item_align, R.attr.scroll_item_space, R.attr.scroll_item_text_color, R.attr.scroll_item_text_size, R.attr.scroll_maximum_width_text, R.attr.scroll_maximum_width_text_position, R.attr.scroll_selected_item_background, R.attr.scroll_selected_item_position, R.attr.scroll_selected_item_text_color, R.attr.scroll_visible_item_count});
        this.f171305z = obtainStyledAttributes.getDimensionPixelSize(9, getResources().getDimensionPixelSize(R.dimen.WheelItemTextSize));
        this.f171298s = obtainStyledAttributes.getInt(15, 7);
        this.f171287h = obtainStyledAttributes.getInt(13, 0);
        this.f171271O = obtainStyledAttributes.getInt(11, -1);
        this.f171297r = obtainStyledAttributes.getString(10);
        this.f171304y = obtainStyledAttributes.getColor(14, -1);
        this.f171303x = obtainStyledAttributes.getColor(8, -12434878);
        this.f171278V = obtainStyledAttributes.getColor(1, -657931);
        this.f171279W = obtainStyledAttributes.getColor(12, -1);
        this.f171259C = obtainStyledAttributes.getDimensionPixelSize(7, getResources().getDimensionPixelSize(R.dimen.WheelItemSpace));
        this.f171275S = obtainStyledAttributes.getBoolean(3, false);
        this.f171258B = obtainStyledAttributes.getColor(4, -2236963);
        this.f171257A = obtainStyledAttributes.getDimensionPixelSize(5, getResources().getDimensionPixelSize(R.dimen.WheelIndicatorSize));
        this.f171276T = obtainStyledAttributes.getBoolean(0, false);
        this.f171260D = obtainStyledAttributes.getInt(6, 0);
        obtainStyledAttributes.recycle();
        m264588c();
        this.f171291l = new Paint(69);
        this.f171280a = new Paint(5);
        this.f171291l.setTextSize((float) this.f171305z);
        m264590e();
        m264589d();
        this.f171282c = new Scroller(getContext());
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f171265I = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f171266J = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f171274R = viewConfiguration.getScaledTouchSlop();
        this.f171293n = new Rect();
        this.f171294o = new Rect();
        this.f171295p = new Rect();
        this.f171296q = new Rect();
    }

    /* renamed from: a */
    private int m264585a(int i, int i2, int i3) {
        if (i == 1073741824) {
            return i2;
        }
        if (i == Integer.MIN_VALUE) {
            return Math.min(i3, i2);
        }
        return i3;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        this.f171293n.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        this.f171267K = this.f171293n.centerX();
        this.f171268L = this.f171293n.centerY();
        m264591f();
        this.f171262F = this.f171293n.height() / 2;
        int height = this.f171293n.height() / this.f171298s;
        this.f171286g = height;
        this.f171261E = height / 2;
        m264592g();
        m264593h();
        m264594i();
    }
}
