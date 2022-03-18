package com.ss.android.vc.meeting.module.meetingdialog.pstn.country.quickbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.common.p3083e.C60773o;
import java.util.List;

public class QuickSideBarView extends View {

    /* renamed from: a */
    private AbstractC62418b f156991a;

    /* renamed from: b */
    private List<String> f156992b;

    /* renamed from: c */
    private int f156993c;

    /* renamed from: d */
    private Paint f156994d;

    /* renamed from: e */
    private float f156995e;

    /* renamed from: f */
    private float f156996f;

    /* renamed from: g */
    private int f156997g;

    /* renamed from: h */
    private int f156998h;

    /* renamed from: i */
    private int f156999i;

    /* renamed from: j */
    private int f157000j;

    /* renamed from: k */
    private float f157001k;

    /* renamed from: l */
    private float f157002l;

    public List<String> getLetters() {
        return this.f156992b;
    }

    public AbstractC62418b getListener() {
        return this.f156991a;
    }

    public void setOnQuickSideBarTouchListener(AbstractC62418b bVar) {
        this.f156991a = bVar;
    }

    public QuickSideBarView(Context context) {
        this(context, null);
    }

    public void setLetters(List<String> list) {
        this.f156992b = list;
        this.f157002l = (((float) this.f157000j) - (((float) list.size()) * this.f157001k)) / 2.0f;
        invalidate();
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        AbstractC62418b bVar;
        if (this.f156992b != null) {
            int action = motionEvent.getAction();
            float y = motionEvent.getY();
            int i = this.f156993c;
            int i2 = (int) ((y - this.f157002l) / this.f157001k);
            if (action != 1) {
                if (i != i2) {
                    if (i2 >= 0 && i2 < this.f156992b.size()) {
                        this.f156993c = i2;
                        if (this.f156991a != null) {
                            Rect rect = new Rect();
                            this.f156994d.getTextBounds(this.f156992b.get(this.f156993c), 0, this.f156992b.get(this.f156993c).length(), rect);
                            float f = this.f157001k;
                            this.f156991a.mo215781a(this.f156992b.get(i2), this.f156993c, (((float) this.f156993c) * f) + ((float) ((int) (((double) (f - ((float) rect.height()))) * 0.5d))) + this.f157002l);
                        }
                    }
                    invalidate();
                }
                if (motionEvent.getAction() == 3) {
                    AbstractC62418b bVar2 = this.f156991a;
                    if (bVar2 != null) {
                        bVar2.mo215782a(false);
                    }
                } else if (motionEvent.getAction() == 0 && (bVar = this.f156991a) != null) {
                    bVar.mo215782a(true);
                }
            } else {
                this.f156993c = -1;
                AbstractC62418b bVar3 = this.f156991a;
                if (bVar3 != null) {
                    bVar3.mo215782a(false);
                }
                invalidate();
            }
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f156992b != null) {
            for (int i = 0; i < this.f156992b.size(); i++) {
                this.f156994d.setColor(this.f156997g);
                this.f156994d.setAntiAlias(true);
                this.f156994d.setTextSize(this.f156995e);
                if (i == this.f156993c) {
                    this.f156994d.setColor(this.f156998h);
                    this.f156994d.setTextSize(this.f156996f);
                }
                Rect rect = new Rect();
                this.f156994d.getTextBounds(this.f156992b.get(i), 0, this.f156992b.get(i).length(), rect);
                float f = this.f157001k;
                float height = (((float) i) * f) + ((float) ((int) (((double) (f - ((float) rect.height()))) * 0.5d))) + this.f157002l;
                canvas.drawText(this.f156992b.get(i), (float) ((int) (((double) (this.f156999i - rect.width())) * 0.5d)), height, this.f156994d);
                this.f156994d.reset();
            }
        }
    }

    public QuickSideBarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f157000j = getMeasuredHeight();
        this.f156999i = getMeasuredWidth();
        List<String> list = this.f156992b;
        if (list != null) {
            this.f157002l = (((float) this.f157000j) - (((float) list.size()) * this.f157001k)) / 2.0f;
        }
    }

    /* renamed from: a */
    private void m243948a(Context context, AttributeSet attributeSet) {
        this.f156997g = C60773o.m236126d(R.color.text_placeholder);
        this.f156998h = C60773o.m236126d(R.color.primary_pri_500);
        this.f156995e = (float) UIHelper.dp2px(12.0f);
        this.f156996f = (float) UIHelper.dp2px(12.0f);
        this.f157001k = (float) UIHelper.dp2px(18.0f);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.sidebarBackgroundColor, R.attr.sidebarItemHeight, R.attr.sidebarTextColor, R.attr.sidebarTextColorChoose, R.attr.sidebarTextSize, R.attr.sidebarTextSizeChoose});
            this.f156997g = obtainStyledAttributes.getColor(2, this.f156997g);
            this.f156998h = obtainStyledAttributes.getColor(3, this.f156998h);
            this.f156995e = obtainStyledAttributes.getDimension(4, this.f156995e);
            this.f156996f = obtainStyledAttributes.getDimension(5, this.f156996f);
            this.f157001k = obtainStyledAttributes.getDimension(1, this.f157001k);
            obtainStyledAttributes.recycle();
        }
    }

    public QuickSideBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f156993c = -1;
        this.f156994d = new Paint();
        m243948a(context, attributeSet);
    }
}
