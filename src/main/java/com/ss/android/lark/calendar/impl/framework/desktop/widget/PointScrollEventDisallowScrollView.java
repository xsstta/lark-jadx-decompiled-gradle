package com.ss.android.lark.calendar.impl.framework.desktop.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ScrollView;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0014¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/calendar/impl/framework/desktop/widget/PointScrollEventDisallowScrollView;", "Landroid/widget/ScrollView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "dispatchGenericPointerEvent", "", "event", "Landroid/view/MotionEvent;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public class PointScrollEventDisallowScrollView extends ScrollView {

    /* renamed from: a */
    private HashMap f83311a;

    /* renamed from: b */
    public View mo114297b(int i) {
        if (this.f83311a == null) {
            this.f83311a = new HashMap();
        }
        View view = (View) this.f83311a.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f83311a.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PointScrollEventDisallowScrollView(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* access modifiers changed from: protected */
    public boolean dispatchGenericPointerEvent(MotionEvent motionEvent) {
        Intrinsics.checkParameterIsNotNull(motionEvent, "event");
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() != 8) {
            return super.dispatchGenericPointerEvent(motionEvent);
        }
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PointScrollEventDisallowScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PointScrollEventDisallowScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }
}
