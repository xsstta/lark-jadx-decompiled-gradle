package com.ss.android.lark.widget.quick_sidebar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.quick_sidebar.p2963a.AbstractC58955a;
import java.util.Arrays;
import java.util.List;

public class QuickSideBarView extends View {

    /* renamed from: a */
    private AbstractC58955a f146051a;

    /* renamed from: b */
    private List<String> f146052b;

    /* renamed from: c */
    private int f146053c;

    /* renamed from: d */
    private Paint f146054d;

    /* renamed from: e */
    private float f146055e;

    /* renamed from: f */
    private float f146056f;

    /* renamed from: g */
    private int f146057g;

    /* renamed from: h */
    private int f146058h;

    /* renamed from: i */
    private int f146059i;

    /* renamed from: j */
    private int f146060j;

    /* renamed from: k */
    private float f146061k;

    /* renamed from: l */
    private float f146062l;

    public List<String> getLetters() {
        return this.f146052b;
    }

    public AbstractC58955a getListener() {
        return this.f146051a;
    }

    public void setOnQuickSideBarTouchListener(AbstractC58955a aVar) {
        this.f146051a = aVar;
    }

    public QuickSideBarView(Context context) {
        this(context, null);
    }

    public void setLetters(List<String> list) {
        this.f146052b = list;
        this.f146062l = (((float) this.f146060j) - (((float) list.size()) * this.f146061k)) / 2.0f;
        invalidate();
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        AbstractC58955a aVar;
        int action = motionEvent.getAction();
        float y = motionEvent.getY();
        int i = this.f146053c;
        int i2 = (int) ((y - this.f146062l) / this.f146061k);
        if (action != 1) {
            if (i != i2) {
                if (i2 >= 0 && i2 < this.f146052b.size()) {
                    this.f146053c = i2;
                    if (this.f146051a != null) {
                        Rect rect = new Rect();
                        this.f146054d.getTextBounds(this.f146052b.get(this.f146053c), 0, this.f146052b.get(this.f146053c).length(), rect);
                        float f = this.f146061k;
                        this.f146051a.mo131378a(this.f146052b.get(i2), this.f146053c, (((float) this.f146053c) * f) + ((float) ((int) (((double) (f - ((float) rect.height()))) * 0.5d))) + this.f146062l);
                    }
                }
                invalidate();
            }
            if (motionEvent.getAction() == 3) {
                AbstractC58955a aVar2 = this.f146051a;
                if (aVar2 != null) {
                    aVar2.mo131379a(false);
                }
            } else if (motionEvent.getAction() == 0 && (aVar = this.f146051a) != null) {
                aVar.mo131379a(true);
            }
        } else {
            this.f146053c = -1;
            AbstractC58955a aVar3 = this.f146051a;
            if (aVar3 != null) {
                aVar3.mo131379a(false);
            }
            invalidate();
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        for (int i = 0; i < this.f146052b.size(); i++) {
            this.f146054d.setColor(this.f146057g);
            this.f146054d.setAntiAlias(true);
            this.f146054d.setTextSize(this.f146055e);
            if (i == this.f146053c) {
                this.f146054d.setColor(this.f146058h);
                this.f146054d.setFakeBoldText(true);
                this.f146054d.setTypeface(Typeface.DEFAULT_BOLD);
                this.f146054d.setTextSize(this.f146056f);
            }
            Rect rect = new Rect();
            this.f146054d.getTextBounds(this.f146052b.get(i), 0, this.f146052b.get(i).length(), rect);
            float f = this.f146061k;
            float height = (((float) i) * f) + ((float) ((int) (((double) (f - ((float) rect.height()))) * 0.5d))) + this.f146062l;
            canvas.drawText(this.f146052b.get(i), (float) ((int) (((double) (this.f146059i - rect.width())) * 0.5d)), height, this.f146054d);
            this.f146054d.reset();
        }
    }

    public QuickSideBarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f146060j = getMeasuredHeight();
        this.f146059i = getMeasuredWidth();
        this.f146062l = (((float) this.f146060j) - (((float) this.f146052b.size()) * this.f146061k)) / 2.0f;
    }

    /* renamed from: a */
    private void m228846a(Context context, AttributeSet attributeSet) {
        this.f146052b = Arrays.asList(context.getResources().getStringArray(R.array.quickSideBarLetters));
        this.f146057g = context.getResources().getColor(17170444);
        this.f146058h = context.getResources().getColor(17170444);
        this.f146055e = (float) context.getResources().getDimensionPixelSize(R.dimen.textSize_quicksidebar);
        this.f146056f = (float) context.getResources().getDimensionPixelSize(R.dimen.textSize_quicksidebar_choose);
        this.f146061k = context.getResources().getDimension(R.dimen.height_quicksidebaritem);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.sidebarBackgroundColor, R.attr.sidebarItemHeight, R.attr.sidebarTextColor, R.attr.sidebarTextColorChoose, R.attr.sidebarTextSize, R.attr.sidebarTextSizeChoose});
            this.f146057g = obtainStyledAttributes.getColor(2, this.f146057g);
            this.f146058h = obtainStyledAttributes.getColor(3, this.f146058h);
            this.f146055e = obtainStyledAttributes.getDimension(4, this.f146055e);
            this.f146056f = obtainStyledAttributes.getDimension(5, this.f146056f);
            this.f146061k = obtainStyledAttributes.getDimension(1, this.f146061k);
            obtainStyledAttributes.recycle();
        }
    }

    public QuickSideBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f146053c = -1;
        this.f146054d = new Paint();
        m228846a(context, attributeSet);
    }
}
