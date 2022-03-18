package com.ss.android.lark.ai.smartcompose;

import android.text.Layout;
import android.text.Spannable;
import android.text.method.BaseMovementMethod;
import android.text.method.MovementMethod;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.TextView;
import com.ss.android.lark.ai.smartcompose.p1342b.AbstractC28583a;

/* renamed from: com.ss.android.lark.ai.smartcompose.a */
public class C28578a extends BaseMovementMethod {

    /* renamed from: a */
    private MovementMethod f71912a;

    /* renamed from: b */
    private AbstractC28579a f71913b;

    /* renamed from: com.ss.android.lark.ai.smartcompose.a$a */
    public interface AbstractC28579a {
        void onOtherAreaClick(Spannable spannable);
    }

    public boolean canSelectArbitrarily() {
        MovementMethod movementMethod = this.f71912a;
        if (movementMethod != null) {
            return movementMethod.canSelectArbitrarily();
        }
        return super.canSelectArbitrarily();
    }

    /* renamed from: a */
    public void mo101751a(AbstractC28579a aVar) {
        this.f71913b = aVar;
    }

    public C28578a(MovementMethod movementMethod) {
        this.f71912a = movementMethod;
    }

    public void initialize(TextView textView, Spannable spannable) {
        MovementMethod movementMethod = this.f71912a;
        if (movementMethod != null) {
            movementMethod.initialize(textView, spannable);
        } else {
            super.initialize(textView, spannable);
        }
    }

    public boolean onGenericMotionEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        MovementMethod movementMethod = this.f71912a;
        if (movementMethod != null) {
            return movementMethod.onGenericMotionEvent(textView, spannable, motionEvent);
        }
        return super.onGenericMotionEvent(textView, spannable, motionEvent);
    }

    public boolean onKeyOther(TextView textView, Spannable spannable, KeyEvent keyEvent) {
        MovementMethod movementMethod = this.f71912a;
        if (movementMethod != null) {
            return movementMethod.onKeyOther(textView, spannable, keyEvent);
        }
        return super.onKeyOther(textView, spannable, keyEvent);
    }

    public void onTakeFocus(TextView textView, Spannable spannable, int i) {
        MovementMethod movementMethod = this.f71912a;
        if (movementMethod != null) {
            movementMethod.onTakeFocus(textView, spannable, i);
        } else {
            super.onTakeFocus(textView, spannable, i);
        }
    }

    public boolean onTrackballEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        MovementMethod movementMethod = this.f71912a;
        if (movementMethod != null) {
            return movementMethod.onTrackballEvent(textView, spannable, motionEvent);
        }
        return super.onTrackballEvent(textView, spannable, motionEvent);
    }

    public boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        AbstractC28583a[] aVarArr = (AbstractC28583a[]) spannable.getSpans(0, spannable.length(), AbstractC28583a.class);
        if (action == 0 && aVarArr.length != 0) {
            int x = ((int) motionEvent.getX()) - textView.getTotalPaddingLeft();
            int y = ((int) motionEvent.getY()) - textView.getTotalPaddingTop();
            int scrollX = x + textView.getScrollX();
            int scrollY = y + textView.getScrollY();
            Layout layout = textView.getLayout();
            int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(scrollY), (float) scrollX);
            AbstractC28583a[] aVarArr2 = (AbstractC28583a[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, AbstractC28583a.class);
            if (aVarArr2.length != 0) {
                aVarArr2[0].mo101617a(textView);
                return true;
            }
            AbstractC28579a aVar = this.f71913b;
            if (aVar != null) {
                aVar.onOtherAreaClick(spannable);
            }
        }
        MovementMethod movementMethod = this.f71912a;
        if (movementMethod != null) {
            return movementMethod.onTouchEvent(textView, spannable, motionEvent);
        }
        return super.onTouchEvent(textView, spannable, motionEvent);
    }

    public boolean onKeyDown(TextView textView, Spannable spannable, int i, KeyEvent keyEvent) {
        MovementMethod movementMethod = this.f71912a;
        if (movementMethod != null) {
            return movementMethod.onKeyDown(textView, spannable, i, keyEvent);
        }
        return super.onKeyDown(textView, spannable, i, keyEvent);
    }

    public boolean onKeyUp(TextView textView, Spannable spannable, int i, KeyEvent keyEvent) {
        MovementMethod movementMethod = this.f71912a;
        if (movementMethod != null) {
            return movementMethod.onKeyUp(textView, spannable, i, keyEvent);
        }
        return super.onKeyUp(textView, spannable, i, keyEvent);
    }
}
