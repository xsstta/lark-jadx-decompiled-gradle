package com.bytedance.ee.bear.widgets;

import android.content.Context;
import android.util.AttributeSet;
import com.ss.android.lark.widget.recyclerview.CommonRecyclerView;

public class BaseRecyclerView extends CommonRecyclerView {

    /* renamed from: a */
    private AbstractC11798a f31687a;

    /* renamed from: com.bytedance.ee.bear.widgets.BaseRecyclerView$a */
    public interface AbstractC11798a {
        /* renamed from: a */
        void mo33327a(int i, int i2, int i3, int i4, int[] iArr, int i5);

        /* renamed from: a */
        void mo32605a(int i, int i2, int[] iArr, int[] iArr2, int i3);
    }

    public AbstractC11798a getNestScrollListener() {
        return this.f31687a;
    }

    @Override // com.ss.android.lark.widget.recyclerview.CommonRecyclerView
    public String getSceneTag() {
        return "docs_" + super.getSceneTag();
    }

    public BaseRecyclerView(Context context) {
        super(context);
    }

    public void setNestScrollListener(AbstractC11798a aVar) {
        this.f31687a = aVar;
    }

    public BaseRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BaseRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // androidx.core.view.NestedScrollingChild2, androidx.recyclerview.widget.RecyclerView
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        AbstractC11798a aVar = this.f31687a;
        if (aVar != null) {
            aVar.mo32605a(i, i2, iArr, iArr2, i3);
        }
        return super.dispatchNestedPreScroll(i, i2, iArr, iArr2, i3);
    }

    @Override // androidx.core.view.NestedScrollingChild2, androidx.recyclerview.widget.RecyclerView
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        AbstractC11798a aVar = this.f31687a;
        if (aVar != null) {
            aVar.mo33327a(i, i2, i3, i4, iArr, i5);
        }
        return super.dispatchNestedScroll(i, i2, i3, i4, iArr, i5);
    }
}
