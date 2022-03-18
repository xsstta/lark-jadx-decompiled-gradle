package com.ss.android.lark.todo.impl.features.mainview2.widget.list.recyclerView;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.lark.todo.impl.features.mainview.adapter.pinned.AbstractC56807a;
import com.ss.android.lark.widget.recyclerview.CommonRecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\n\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u000fH\u0016R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/recyclerView/PinnedHeaderRecyclerView;", "Lcom/ss/android/lark/widget/recyclerview/CommonRecyclerView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mPinnedHeaderHandle", "", "getPinnedHeaderDecoration", "Lcom/ss/android/lark/todo/impl/features/mainview/adapter/pinned/IPinnedHeaderDecoration;", "onInterceptTouchEvent", "e", "Landroid/view/MotionEvent;", "onTouchEvent", "ev", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class PinnedHeaderRecyclerView extends CommonRecyclerView {

    /* renamed from: a */
    private boolean f140857a;

    public PinnedHeaderRecyclerView(Context context) {
        this(context, null, 0, 6, null);
    }

    public PinnedHeaderRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final AbstractC56807a getPinnedHeaderDecoration() {
        int itemDecorationCount = getItemDecorationCount();
        if (itemDecorationCount < 0) {
            return null;
        }
        int i = 0;
        while (true) {
            RecyclerView.AbstractC1335d itemDecorationAt = getItemDecorationAt(i);
            Intrinsics.checkExpressionValueIsNotNull(itemDecorationAt, "getItemDecorationAt(index)");
            if (itemDecorationAt instanceof AbstractC56807a) {
                return (AbstractC56807a) itemDecorationAt;
            }
            if (i == itemDecorationCount) {
                return null;
            }
            i++;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Intrinsics.checkParameterIsNotNull(motionEvent, "e");
        AbstractC56807a pinnedHeaderDecoration = getPinnedHeaderDecoration();
        if (pinnedHeaderDecoration == null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        Rect a = pinnedHeaderDecoration.mo193132a();
        int b = pinnedHeaderDecoration.mo193133b();
        if (a == null || b == -1) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 0 && a.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        if (r0 != 3) goto L_0x00a9;
     */
    @Override // androidx.recyclerview.widget.RecyclerView
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
        // Method dump skipped, instructions count: 184
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.todo.impl.features.mainview2.widget.list.recyclerView.PinnedHeaderRecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PinnedHeaderRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PinnedHeaderRecyclerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
