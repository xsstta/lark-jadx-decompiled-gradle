package com.bytedance.ee.bear.list.preload;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.ee.bear.widgets.BaseRecyclerView;
import com.larksuite.suite.R;

public class RecentListContainer extends FrameLayout {

    /* renamed from: a */
    private BaseRecyclerView f23460a;

    /* renamed from: b */
    private boolean f23461b;

    /* renamed from: c */
    private AbstractC8663a f23462c;

    /* renamed from: com.bytedance.ee.bear.list.preload.RecentListContainer$a */
    public interface AbstractC8663a {
        void onFirstContentShowed();
    }

    /* renamed from: b */
    private boolean m36215b() {
        if (this.f23460a.getChildCount() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo33668a() {
        this.f23460a = (BaseRecyclerView) findViewById(R.id.list_recycler_view);
    }

    public RecentListContainer(Context context) {
        super(context);
    }

    public void setFirstPageViewListener(AbstractC8663a aVar) {
        this.f23462c = aVar;
    }

    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (!this.f23461b && m36215b()) {
            this.f23461b = true;
            AbstractC8663a aVar = this.f23462c;
            if (aVar != null) {
                aVar.onFirstContentShowed();
            }
        }
    }

    public RecentListContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RecentListContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
