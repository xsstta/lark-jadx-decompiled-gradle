package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.larksuite.suite.R;

public class Placeholder extends View {

    /* renamed from: a */
    private int f2845a = -1;

    /* renamed from: b */
    private View f2846b;

    /* renamed from: c */
    private int f2847c = 4;

    public View getContent() {
        return this.f2846b;
    }

    public int getEmptyVisibility() {
        return this.f2847c;
    }

    public void setEmptyVisibility(int i) {
        this.f2847c = i;
    }

    public Placeholder(Context context) {
        super(context);
        m3376a((AttributeSet) null);
    }

    /* renamed from: a */
    public void mo3864a(ConstraintLayout constraintLayout) {
        if (this.f2845a == -1 && !isInEditMode()) {
            setVisibility(this.f2847c);
        }
        View findViewById = constraintLayout.findViewById(this.f2845a);
        this.f2846b = findViewById;
        if (findViewById != null) {
            ((ConstraintLayout.LayoutParams) findViewById.getLayoutParams()).ab = true;
            this.f2846b.setVisibility(0);
            setVisibility(0);
        }
    }

    public void setContentId(int i) {
        View findViewById;
        if (this.f2845a != i) {
            View view = this.f2846b;
            if (view != null) {
                view.setVisibility(0);
                ((ConstraintLayout.LayoutParams) this.f2846b.getLayoutParams()).ab = false;
                this.f2846b = null;
            }
            this.f2845a = i;
            if (i != -1 && (findViewById = ((View) getParent()).findViewById(i)) != null) {
                findViewById.setVisibility(8);
            }
        }
    }

    /* renamed from: a */
    private void m3376a(AttributeSet attributeSet) {
        super.setVisibility(this.f2847c);
        this.f2845a = -1;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.content, R.attr.placeholder_emptyVisibility});
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.f2845a = obtainStyledAttributes.getResourceId(index, this.f2845a);
                } else if (index == 1) {
                    this.f2847c = obtainStyledAttributes.getInt(index, this.f2847c);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    public void mo3865b(ConstraintLayout constraintLayout) {
        if (this.f2846b != null) {
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) this.f2846b.getLayoutParams();
            layoutParams2.an.mo3570j(0);
            if (layoutParams.an.mo3517S() != ConstraintWidget.DimensionBehaviour.FIXED) {
                layoutParams.an.mo3579o(layoutParams2.an.mo3499A());
            }
            if (layoutParams.an.mo3518T() != ConstraintWidget.DimensionBehaviour.FIXED) {
                layoutParams.an.mo3581p(layoutParams2.an.mo3500B());
            }
            layoutParams2.an.mo3570j(8);
        }
    }

    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize((float) rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((((float) width) / 2.0f) - (((float) rect.width()) / 2.0f)) - ((float) rect.left), ((((float) height) / 2.0f) + (((float) rect.height()) / 2.0f)) - ((float) rect.bottom), paint);
        }
    }

    public Placeholder(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m3376a(attributeSet);
    }

    public Placeholder(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m3376a(attributeSet);
    }
}
