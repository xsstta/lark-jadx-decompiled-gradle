package com.ss.android.lark.mail.impl.widget.time.multitimezone;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.C14002h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u001bB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB)\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J(\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\tH\u0014J\u000e\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u000eR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/TouchListenerLinearLayout;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "mTouchListener", "Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/TouchListenerLinearLayout$TouchListener;", "onInterceptTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "onSizeChanged", "", "w", C14002h.f36692e, "oldw", "oldh", "setTouchListener", "listener", "TouchListener", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class TouchListenerLinearLayout extends LinearLayout {

    /* renamed from: a */
    private TouchListener f111977a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/TouchListenerLinearLayout$TouchListener;", "", "onSizeChanged", "", "width", "", "height", "onTouch", "ev", "Landroid/view/MotionEvent;", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.widget.time.multitimezone.TouchListenerLinearLayout$a */
    public interface TouchListener {
        /* renamed from: a */
        void mo156919a(int i, int i2);

        /* renamed from: a */
        void mo156920a(MotionEvent motionEvent);
    }

    public final void setTouchListener(TouchListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        this.f111977a = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TouchListenerLinearLayout(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        TouchListener aVar;
        Intrinsics.checkParameterIsNotNull(motionEvent, "ev");
        if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 2) && (aVar = this.f111977a) != null) {
            aVar.mo156920a(motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TouchListenerLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TouchListenerLinearLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        TouchListener aVar;
        super.onSizeChanged(i, i2, i3, i4);
        if ((i != i3 || i2 != i4) && (aVar = this.f111977a) != null) {
            aVar.mo156919a(i, i2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TouchListenerLinearLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }
}
