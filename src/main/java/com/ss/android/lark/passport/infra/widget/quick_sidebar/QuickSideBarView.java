package com.ss.android.lark.passport.infra.widget.quick_sidebar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.larksuite.suite.R;
import com.ss.android.lark.passport.infra.widget.quick_sidebar.p2451a.AbstractC49275a;
import java.util.Arrays;
import java.util.List;

public class QuickSideBarView extends View {

    /* renamed from: a */
    private AbstractC49275a f123686a;

    /* renamed from: b */
    private List<String> f123687b;

    /* renamed from: c */
    private int f123688c;

    /* renamed from: d */
    private final Paint f123689d;

    /* renamed from: e */
    private float f123690e;

    /* renamed from: f */
    private float f123691f;

    /* renamed from: g */
    private int f123692g;

    /* renamed from: h */
    private int f123693h;

    /* renamed from: i */
    private int f123694i;

    /* renamed from: j */
    private int f123695j;

    /* renamed from: k */
    private float f123696k;

    /* renamed from: l */
    private float f123697l;

    public List<String> getLetters() {
        return this.f123687b;
    }

    public AbstractC49275a getListener() {
        return this.f123686a;
    }

    public void setOnQuickSideBarTouchListener(AbstractC49275a aVar) {
        this.f123686a = aVar;
    }

    public QuickSideBarView(Context context) {
        this(context, null);
    }

    public void setLetters(List<String> list) {
        this.f123687b = list;
        this.f123697l = (((float) this.f123695j) - (((float) list.size()) * this.f123696k)) / 2.0f;
        invalidate();
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        AbstractC49275a aVar;
        int action = motionEvent.getAction();
        float y = motionEvent.getY();
        int i = this.f123688c;
        int i2 = (int) ((y - this.f123697l) / this.f123696k);
        if (action != 1) {
            if (i != i2) {
                if (i2 >= 0 && i2 < this.f123687b.size()) {
                    this.f123688c = i2;
                    if (this.f123686a != null) {
                        Rect rect = new Rect();
                        this.f123689d.getTextBounds(this.f123687b.get(this.f123688c), 0, this.f123687b.get(this.f123688c).length(), rect);
                        float f = this.f123696k;
                        this.f123686a.mo171854a(this.f123687b.get(i2), this.f123688c, (((float) this.f123688c) * f) + ((float) ((int) (((double) (f - ((float) rect.height()))) * 0.5d))) + this.f123697l);
                    }
                }
                invalidate();
            }
            if (motionEvent.getAction() == 3) {
                AbstractC49275a aVar2 = this.f123686a;
                if (aVar2 != null) {
                    aVar2.mo171855a(false);
                }
            } else if (motionEvent.getAction() == 0 && (aVar = this.f123686a) != null) {
                aVar.mo171855a(true);
            }
        } else {
            this.f123688c = -1;
            AbstractC49275a aVar3 = this.f123686a;
            if (aVar3 != null) {
                aVar3.mo171855a(false);
            }
            invalidate();
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        for (int i = 0; i < this.f123687b.size(); i++) {
            this.f123689d.setColor(this.f123692g);
            this.f123689d.setAntiAlias(true);
            this.f123689d.setTextSize(this.f123690e);
            if (i == this.f123688c) {
                this.f123689d.setColor(this.f123693h);
                this.f123689d.setTextSize(this.f123691f);
            }
            Rect rect = new Rect();
            this.f123689d.getTextBounds(this.f123687b.get(i), 0, this.f123687b.get(i).length(), rect);
            float f = this.f123696k;
            float height = (((float) i) * f) + ((float) ((int) (((double) (f - ((float) rect.height()))) * 0.5d))) + this.f123697l;
            canvas.drawText(this.f123687b.get(i), (float) ((int) (((double) (this.f123694i - rect.width())) * 0.5d)), height, this.f123689d);
            this.f123689d.reset();
        }
    }

    public QuickSideBarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f123695j = getMeasuredHeight();
        this.f123694i = getMeasuredWidth();
        this.f123697l = (((float) this.f123695j) - (((float) this.f123687b.size()) * this.f123696k)) / 2.0f;
    }

    /* renamed from: a */
    private void m194165a(Context context, AttributeSet attributeSet) {
        this.f123687b = Arrays.asList(context.getResources().getStringArray(R.array.signin_sdk_quick_sidebar_letters));
        this.f123692g = context.getResources().getColor(R.color.text_title);
        this.f123693h = context.getResources().getColor(R.color.primary_pri_500);
        this.f123690e = (float) context.getResources().getDimensionPixelSize(R.dimen.signin_sdk_textsize_quicksidebar);
        this.f123691f = (float) context.getResources().getDimensionPixelSize(R.dimen.signin_sdk_textsize_quicksidebar);
        this.f123696k = (float) context.getResources().getDimensionPixelSize(R.dimen.signin_sdk_height_quicksidebaritem);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.sidebarBackgroundColor, R.attr.sidebarItemHeight, R.attr.sidebarTextColor, R.attr.sidebarTextColorChoose, R.attr.sidebarTextSize, R.attr.sidebarTextSizeChoose});
            this.f123692g = obtainStyledAttributes.getColor(2, this.f123692g);
            this.f123693h = obtainStyledAttributes.getColor(3, this.f123693h);
            this.f123690e = obtainStyledAttributes.getDimension(4, this.f123690e);
            this.f123691f = obtainStyledAttributes.getDimension(5, this.f123691f);
            this.f123696k = obtainStyledAttributes.getDimension(1, this.f123696k);
            obtainStyledAttributes.recycle();
        }
    }

    public QuickSideBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f123688c = -1;
        this.f123689d = new Paint();
        m194165a(context, attributeSet);
    }
}
