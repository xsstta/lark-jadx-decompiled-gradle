package com.ss.android.lark.todo.impl.features.mainview.adapter.pinned;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.lark.widget.recyclerview.CommonRecyclerView;

public class PinnedHeaderRecyclerView extends CommonRecyclerView {

    /* renamed from: a */
    private boolean f140263a;

    /* renamed from: b */
    private boolean f140264b;

    public AbstractC56807a getPinnedHeaderDecoration() {
        RecyclerView.AbstractC1335d itemDecorationAt;
        int i = 0;
        do {
            itemDecorationAt = getItemDecorationAt(i);
            if (itemDecorationAt instanceof AbstractC56807a) {
                return (AbstractC56807a) itemDecorationAt;
            }
            i++;
        } while (itemDecorationAt != null);
        return null;
    }

    public PinnedHeaderRecyclerView(Context context) {
        super(context);
    }

    public void setIsChatList(boolean z) {
        this.f140264b = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
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

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        if (r0 != 3) goto L_0x00af;
     */
    @Override // androidx.recyclerview.widget.RecyclerView
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
        // Method dump skipped, instructions count: 185
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.todo.impl.features.mainview.adapter.pinned.PinnedHeaderRecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public PinnedHeaderRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PinnedHeaderRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
