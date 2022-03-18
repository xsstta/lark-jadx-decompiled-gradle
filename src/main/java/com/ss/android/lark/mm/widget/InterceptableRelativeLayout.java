package com.ss.android.lark.mm.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0019B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB)\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJ\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0012\u0010\u0017\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u0016H\u0016R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/mm/widget/InterceptableRelativeLayout;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "touchEventDelegater", "Lcom/ss/android/lark/mm/widget/InterceptableRelativeLayout$OnInterceptTouchEventListener;", "getTouchEventDelegater", "()Lcom/ss/android/lark/mm/widget/InterceptableRelativeLayout$OnInterceptTouchEventListener;", "setTouchEventDelegater", "(Lcom/ss/android/lark/mm/widget/InterceptableRelativeLayout$OnInterceptTouchEventListener;)V", "onInterceptTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "onTouchEvent", "event", "OnInterceptTouchEventListener", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public class InterceptableRelativeLayout extends RelativeLayout {

    /* renamed from: a */
    private OnInterceptTouchEventListener f118681a;

    /* renamed from: b */
    private HashMap f118682b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/mm/widget/InterceptableRelativeLayout$OnInterceptTouchEventListener;", "", "onInterceptTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.widget.InterceptableRelativeLayout$a */
    public interface OnInterceptTouchEventListener {
        /* renamed from: a */
        boolean mo164710a(MotionEvent motionEvent);
    }

    /* renamed from: b */
    public View mo164769b(int i) {
        if (this.f118682b == null) {
            this.f118682b = new HashMap();
        }
        View view = (View) this.f118682b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f118682b.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final OnInterceptTouchEventListener getTouchEventDelegater() {
        return this.f118681a;
    }

    public final void setTouchEventDelegater(OnInterceptTouchEventListener aVar) {
        this.f118681a = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public InterceptableRelativeLayout(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        OnInterceptTouchEventListener aVar = this.f118681a;
        if (aVar != null) {
            return aVar.mo164710a(motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        OnInterceptTouchEventListener aVar = this.f118681a;
        if (aVar != null) {
            return aVar.mo164710a(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public InterceptableRelativeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public InterceptableRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InterceptableRelativeLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }
}
