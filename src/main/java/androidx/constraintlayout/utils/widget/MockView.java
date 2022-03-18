package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;

public class MockView extends View {

    /* renamed from: a */
    protected String f2744a = null;

    /* renamed from: b */
    private Paint f2745b = new Paint();

    /* renamed from: c */
    private Paint f2746c = new Paint();

    /* renamed from: d */
    private Paint f2747d = new Paint();

    /* renamed from: e */
    private boolean f2748e = true;

    /* renamed from: f */
    private boolean f2749f = true;

    /* renamed from: g */
    private Rect f2750g = new Rect();

    /* renamed from: h */
    private int f2751h = Color.argb(255, 0, 0, 0);

    /* renamed from: i */
    private int f2752i = Color.argb(255, (int) LocationRequest.PRIORITY_HD_ACCURACY, (int) LocationRequest.PRIORITY_HD_ACCURACY, (int) LocationRequest.PRIORITY_HD_ACCURACY);

    /* renamed from: j */
    private int f2753j = Color.argb(255, 50, 50, 50);

    /* renamed from: k */
    private int f2754k = 4;

    public MockView(Context context) {
        super(context);
        m3329a(context, null);
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f2748e) {
            width--;
            height--;
            float f = (float) width;
            float f2 = (float) height;
            canvas.drawLine(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, f2, this.f2745b);
            canvas.drawLine(BitmapDescriptorFactory.HUE_RED, f2, f, BitmapDescriptorFactory.HUE_RED, this.f2745b);
            canvas.drawLine(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, this.f2745b);
            canvas.drawLine(f, BitmapDescriptorFactory.HUE_RED, f, f2, this.f2745b);
            canvas.drawLine(f, f2, BitmapDescriptorFactory.HUE_RED, f2, this.f2745b);
            canvas.drawLine(BitmapDescriptorFactory.HUE_RED, f2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, this.f2745b);
        }
        String str = this.f2744a;
        if (str != null && this.f2749f) {
            this.f2746c.getTextBounds(str, 0, str.length(), this.f2750g);
            float width2 = ((float) (width - this.f2750g.width())) / 2.0f;
            float height2 = (((float) (height - this.f2750g.height())) / 2.0f) + ((float) this.f2750g.height());
            this.f2750g.offset((int) width2, (int) height2);
            Rect rect = this.f2750g;
            rect.set(rect.left - this.f2754k, this.f2750g.top - this.f2754k, this.f2750g.right + this.f2754k, this.f2750g.bottom + this.f2754k);
            canvas.drawRect(this.f2750g, this.f2747d);
            canvas.drawText(this.f2744a, width2, height2, this.f2746c);
        }
    }

    public MockView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m3329a(context, attributeSet);
    }

    /* renamed from: a */
    private void m3329a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.mock_diagonalsColor, R.attr.mock_label, R.attr.mock_labelBackgroundColor, R.attr.mock_labelColor, R.attr.mock_showDiagonals, R.attr.mock_showLabel});
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 1) {
                    this.f2744a = obtainStyledAttributes.getString(index);
                } else if (index == 4) {
                    this.f2748e = obtainStyledAttributes.getBoolean(index, this.f2748e);
                } else if (index == 0) {
                    this.f2751h = obtainStyledAttributes.getColor(index, this.f2751h);
                } else if (index == 2) {
                    this.f2753j = obtainStyledAttributes.getColor(index, this.f2753j);
                } else if (index == 3) {
                    this.f2752i = obtainStyledAttributes.getColor(index, this.f2752i);
                } else if (index == 5) {
                    this.f2749f = obtainStyledAttributes.getBoolean(index, this.f2749f);
                }
            }
            obtainStyledAttributes.recycle();
        }
        if (this.f2744a == null) {
            try {
                this.f2744a = context.getResources().getResourceEntryName(getId());
            } catch (Exception unused) {
            }
        }
        this.f2745b.setColor(this.f2751h);
        this.f2745b.setAntiAlias(true);
        this.f2746c.setColor(this.f2752i);
        this.f2746c.setAntiAlias(true);
        this.f2747d.setColor(this.f2753j);
        this.f2754k = Math.round(((float) this.f2754k) * (getResources().getDisplayMetrics().xdpi / 160.0f));
    }

    public MockView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m3329a(context, attributeSet);
    }
}
