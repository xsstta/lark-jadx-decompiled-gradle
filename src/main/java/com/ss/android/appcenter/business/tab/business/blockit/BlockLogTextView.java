package com.ss.android.appcenter.business.tab.business.blockit;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.ui.p2892a.C57582a;
import java.util.HashSet;
import java.util.Set;

public class BlockLogTextView extends AppCompatTextView {

    /* renamed from: a */
    private final Rect f69466a = new Rect();

    /* renamed from: b */
    private final Paint f69467b;

    /* renamed from: c */
    private final int f69468c;

    /* renamed from: e */
    private final Set<Integer> f69469e;

    public void setLineEndSet(Set<Integer> set) {
        this.f69469e.clear();
        this.f69469e.addAll(set);
    }

    public BlockLogTextView(Context context) {
        super(context);
        Paint paint = new Paint();
        this.f69467b = paint;
        this.f69468c = C57582a.m223600a(3);
        paint.setColor(-7829368);
        this.f69469e = new HashSet();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Layout layout = getLayout();
        int lineCount = getLineCount();
        for (int i = 0; i < lineCount; i++) {
            if (this.f69469e.contains(Integer.valueOf(layout.getLineEnd(i)))) {
                getLineBounds(i, this.f69466a);
                canvas.drawLine(BitmapDescriptorFactory.HUE_RED, (float) (this.f69466a.bottom - this.f69468c), (float) this.f69466a.right, (float) (this.f69466a.bottom - this.f69468c), this.f69467b);
            }
        }
    }

    public BlockLogTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.f69467b = paint;
        this.f69468c = C57582a.m223600a(3);
        paint.setColor(-7829368);
        this.f69469e = new HashSet();
    }

    public BlockLogTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint();
        this.f69467b = paint;
        this.f69468c = C57582a.m223600a(3);
        paint.setColor(-7829368);
        this.f69469e = new HashSet();
    }
}
