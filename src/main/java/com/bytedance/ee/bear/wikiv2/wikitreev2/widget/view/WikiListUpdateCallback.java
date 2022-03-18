package com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view;

import androidx.recyclerview.widget.AbstractC1398p;
import com.chad.library.adapter.base.BaseQuickAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\u0010\u0002\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003¢\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0016J\u0018\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016R\u0016\u0010\u0002\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/view/WikiListUpdateCallback;", "Landroidx/recyclerview/widget/ListUpdateCallback;", "adapter", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "(Lcom/chad/library/adapter/base/BaseQuickAdapter;)V", "onChanged", "", "position", "", "count", "payload", "", "onInserted", "onMoved", "fromPosition", "toPosition", "onRemoved", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.e */
public final class WikiListUpdateCallback implements AbstractC1398p {

    /* renamed from: a */
    private final BaseQuickAdapter<?, ?> f33685a;

    public WikiListUpdateCallback(BaseQuickAdapter<?, ?> baseQuickAdapter) {
        Intrinsics.checkParameterIsNotNull(baseQuickAdapter, "adapter");
        this.f33685a = baseQuickAdapter;
    }

    @Override // androidx.recyclerview.widget.AbstractC1398p
    /* renamed from: a */
    public void mo7365a(int i, int i2) {
        BaseQuickAdapter<?, ?> baseQuickAdapter = this.f33685a;
        baseQuickAdapter.notifyItemRangeInserted(i + baseQuickAdapter.mo70678c(), i2);
    }

    @Override // androidx.recyclerview.widget.AbstractC1398p
    /* renamed from: b */
    public void mo7367b(int i, int i2) {
        BaseQuickAdapter<?, ?> baseQuickAdapter = this.f33685a;
        baseQuickAdapter.notifyItemRangeRemoved(i + baseQuickAdapter.mo70678c(), i2);
    }

    @Override // androidx.recyclerview.widget.AbstractC1398p
    /* renamed from: c */
    public void mo7368c(int i, int i2) {
        BaseQuickAdapter<?, ?> baseQuickAdapter = this.f33685a;
        baseQuickAdapter.notifyItemMoved(i + baseQuickAdapter.mo70678c(), i2);
    }

    @Override // androidx.recyclerview.widget.AbstractC1398p
    /* renamed from: a */
    public void mo7366a(int i, int i2, Object obj) {
        BaseQuickAdapter<?, ?> baseQuickAdapter = this.f33685a;
        baseQuickAdapter.notifyItemRangeChanged(i + baseQuickAdapter.mo70678c(), i2, obj);
    }
}
