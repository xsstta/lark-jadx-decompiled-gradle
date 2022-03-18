package com.larksuite.component.ignition.widget.setting_group;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ttvecamera.p3038g.C60375c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p3466b.C69029a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000eH\u0002J(\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J \u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0019\u001a\u00020\n2\b\b\u0001\u0010\u001a\u001a\u00020\u0010R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/larksuite/component/ignition/widget/setting_group/SettingGroupDividerItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "bounds", "Landroid/graphics/Rect;", "divider", "Lcom/larksuite/component/ignition/widget/setting_group/SettingGroupDividerDrawable;", "drawVertical", "", "canvas", "Landroid/graphics/Canvas;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "getDrawCount", "", "getItemOffsets", "outRect", "view", "Landroid/view/View;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "onDraw", C60375c.f150914a, "setDividerBackgroundColor", "dividerBackgroundColor", "ignition-widget-settinggroup_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.larksuite.component.ignition.widget.setting_group.c */
public final class SettingGroupDividerItemDecoration extends RecyclerView.AbstractC1335d {

    /* renamed from: a */
    private final SettingGroupDividerDrawable f60017a;

    /* renamed from: b */
    private final Rect f60018b = new Rect();

    /* renamed from: a */
    private final int m88809a(RecyclerView recyclerView) {
        return recyclerView.getChildCount() - 1;
    }

    /* renamed from: a */
    public final void mo87060a(int i) {
        this.f60017a.mo87052b(i);
    }

    public SettingGroupDividerItemDecoration(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f60017a = new SettingGroupDividerDrawable(context);
    }

    /* renamed from: a */
    private final void m88810a(Canvas canvas, RecyclerView recyclerView) {
        canvas.save();
        SettingGroupDividerDrawable bVar = this.f60017a;
        int paddingLeft = recyclerView.getPaddingLeft();
        int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        canvas.clipRect(paddingLeft, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        int a = m88809a(recyclerView);
        for (int i = 0; i < a; i++) {
            View childAt = recyclerView.getChildAt(i);
            recyclerView.getDecoratedBoundsWithMargins(childAt, this.f60018b);
            int i2 = this.f60018b.bottom;
            Intrinsics.checkExpressionValueIsNotNull(childAt, "child");
            int a2 = i2 + C69029a.m265653a(childAt.getTranslationY());
            bVar.setBounds(paddingLeft, a2 - bVar.getIntrinsicHeight(), width, a2);
            bVar.draw(canvas);
        }
        canvas.restore();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        Intrinsics.checkParameterIsNotNull(canvas, C60375c.f150914a);
        Intrinsics.checkParameterIsNotNull(recyclerView, "parent");
        Intrinsics.checkParameterIsNotNull(state, "state");
        if (recyclerView.getLayoutManager() != null) {
            m88810a(canvas, recyclerView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        Intrinsics.checkParameterIsNotNull(rect, "outRect");
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(recyclerView, "parent");
        Intrinsics.checkParameterIsNotNull(state, "state");
        rect.set(0, 0, 0, this.f60017a.getIntrinsicHeight());
    }
}
