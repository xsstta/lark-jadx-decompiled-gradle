package com.lcodecore.tkrefreshlayout.header.bezierlayout;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.huawei.hms.location.LocationRequest;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;

public class RoundDotView extends View {

    /* renamed from: a */
    private Paint f65183a;

    /* renamed from: b */
    private float f65184b;

    /* renamed from: c */
    private int f65185c;

    /* renamed from: d */
    private int f65186d;

    /* renamed from: a */
    private void m95668a() {
        Paint paint = new Paint();
        this.f65183a = paint;
        paint.setAntiAlias(true);
        this.f65183a.setColor(Color.rgb((int) SmEvents.EVENT_TO, (int) SmEvents.EVENT_TO, (int) SmEvents.EVENT_TO));
    }

    public void setCir_x(int i) {
        this.f65186d = i;
    }

    public RoundDotView(Context context) {
        this(context, null, 0);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int measuredWidth = (getMeasuredWidth() / this.f65185c) - 10;
        for (int i = 0; i < this.f65185c; i++) {
            switch (i) {
                case 0:
                    this.f65183a.setAlpha(35);
                    canvas.drawCircle((float) (((getMeasuredWidth() / 2) - (this.f65186d * 3)) - (((measuredWidth * 3) / 3) * 2)), (float) (getMeasuredHeight() / 2), this.f65184b, this.f65183a);
                    break;
                case 1:
                    this.f65183a.setAlpha(LocationRequest.PRIORITY_NO_POWER);
                    canvas.drawCircle((float) (((getMeasuredWidth() / 2) - (this.f65186d * 2)) - (((measuredWidth * 2) / 3) * 2)), (float) (getMeasuredHeight() / 2), this.f65184b, this.f65183a);
                    break;
                case 2:
                    this.f65183a.setAlpha(SmEvents.EVENT_UA_ERROR);
                    canvas.drawCircle((float) (((getMeasuredWidth() / 2) - (this.f65186d * 1)) - ((measuredWidth / 3) * 2)), (float) (getMeasuredHeight() / 2), this.f65184b, this.f65183a);
                    break;
                case 3:
                    this.f65183a.setAlpha(255);
                    canvas.drawCircle((float) (getMeasuredWidth() / 2), (float) (getMeasuredHeight() / 2), this.f65184b, this.f65183a);
                    break;
                case 4:
                    this.f65183a.setAlpha(SmEvents.EVENT_UA_ERROR);
                    canvas.drawCircle((float) ((getMeasuredWidth() / 2) + (this.f65186d * 1) + ((measuredWidth / 3) * 2)), (float) (getMeasuredHeight() / 2), this.f65184b, this.f65183a);
                    break;
                case 5:
                    this.f65183a.setAlpha(LocationRequest.PRIORITY_NO_POWER);
                    canvas.drawCircle((float) ((getMeasuredWidth() / 2) + (this.f65186d * 2) + (((measuredWidth * 2) / 3) * 2)), (float) (getMeasuredHeight() / 2), this.f65184b, this.f65183a);
                    break;
                case 6:
                    this.f65183a.setAlpha(35);
                    canvas.drawCircle((float) ((getMeasuredWidth() / 2) + (this.f65186d * 3) + (((measuredWidth * 3) / 3) * 2)), (float) (getMeasuredHeight() / 2), this.f65184b, this.f65183a);
                    break;
            }
        }
    }

    public RoundDotView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RoundDotView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f65184b = 15.0f;
        this.f65185c = 7;
        m95668a();
    }
}
