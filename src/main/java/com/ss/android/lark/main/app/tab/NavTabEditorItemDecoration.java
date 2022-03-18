package com.ss.android.lark.main.app.tab;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.ignition.widget.setting_group.SettingGroupDividerDrawable;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.ttvecamera.p3038g.C60375c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p3466b.C69029a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 &2\u00020\u0001:\u0001&B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J(\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J \u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\f\u0010 \u001a\u00020!*\u00020\u0005H\u0002J\f\u0010\"\u001a\u00020!*\u00020\u0005H\u0002J\u0014\u0010#\u001a\u00020!*\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0014\u0010$\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0014\u0010%\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0017H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\tX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/ss/android/lark/main/app/tab/NavTabEditorItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "context", "Landroid/content/Context;", "paddingStart", "", "(Landroid/content/Context;I)V", "lastBottomMargin", "mBottomBgDrawable", "Landroid/graphics/drawable/Drawable;", "mBounds", "Landroid/graphics/Rect;", "mDivider", "Lcom/larksuite/component/ignition/widget/setting_group/SettingGroupDividerDrawable;", "mSingleBgDrawable", "mTopBgDrawable", "paint", "Landroid/graphics/Paint;", "drawVertical", "", "canvas", "Landroid/graphics/Canvas;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "getItemOffsets", "outRect", "view", "Landroid/view/View;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "onDraw", C60375c.f150914a, "isHeaderType", "", "isItemType", "isLast", "nextType", "previewType", "Companion", "core_main_main_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.main.app.tab.j */
public final class NavTabEditorItemDecoration extends RecyclerView.AbstractC1335d {

    /* renamed from: a */
    public static final Companion f112552a = new Companion(null);

    /* renamed from: b */
    private final int f112553b;

    /* renamed from: c */
    private final Paint f112554c;

    /* renamed from: d */
    private final Rect f112555d = new Rect();

    /* renamed from: e */
    private final SettingGroupDividerDrawable f112556e;

    /* renamed from: f */
    private final Drawable f112557f;

    /* renamed from: g */
    private final Drawable f112558g;

    /* renamed from: h */
    private final Drawable f112559h;

    /* renamed from: i */
    private final Context f112560i;

    /* renamed from: j */
    private final int f112561j;

    /* renamed from: a */
    private final boolean m176013a(int i) {
        return i == R.layout.main_nav_editor_header_layout;
    }

    /* renamed from: b */
    private final boolean m176015b(int i) {
        return i == R.layout.main_nav_editor_item_layout;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tXT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/main/app/tab/NavTabEditorItemDecoration$Companion;", "", "()V", "LAST_BOTTOM_MARGIN", "", "LEFT_PADDING", "NO_VIEW_TYPE", "", "TAG", "", "core_main_main_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.main.app.tab.j$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    private final int m176011a(int i, RecyclerView recyclerView) {
        if (i <= 0) {
            return -1;
        }
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter == null) {
            Intrinsics.throwNpe();
        }
        return adapter.getItemViewType(i - 1);
    }

    /* renamed from: c */
    private final boolean m176016c(int i, RecyclerView recyclerView) {
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull(adapter, "parent.adapter!!");
        if (i == adapter.getItemCount() - 1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private final int m176014b(int i, RecyclerView recyclerView) {
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull(adapter, "parent.adapter!!");
        if (i >= adapter.getItemCount() - 1) {
            return -1;
        }
        RecyclerView.Adapter adapter2 = recyclerView.getAdapter();
        if (adapter2 == null) {
            Intrinsics.throwNpe();
        }
        return adapter2.getItemViewType(i + 1);
    }

    public NavTabEditorItemDecoration(Context context, int i) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f112560i = context;
        this.f112561j = i;
        this.f112553b = C44390w.m176138a(40.0f, context);
        Paint paint = new Paint();
        this.f112554c = paint;
        SettingGroupDividerDrawable bVar = new SettingGroupDividerDrawable(context);
        bVar.mo87052b(UIUtils.getColor(context, R.color.bg_float));
        bVar.mo87051a(C44390w.m176138a(48.0f, context));
        this.f112556e = bVar;
        this.f112557f = ContextCompat.getDrawable(context, R.drawable.editor_tab_item_top_bg);
        this.f112558g = ContextCompat.getDrawable(context, R.drawable.editor_tab_item_bottom_bg);
        this.f112559h = ContextCompat.getDrawable(context, R.drawable.editor_tab_item_single_bg);
        paint.setColor(UIHelper.getColor(R.color.bg_float));
    }

    /* renamed from: a */
    private final void m176012a(Canvas canvas, RecyclerView recyclerView) {
        int i;
        int i2;
        int i3;
        NullPointerException e;
        View findViewByPosition;
        SettingGroupDividerDrawable bVar = this.f112556e;
        Drawable drawable = this.f112557f;
        Drawable drawable2 = this.f112558g;
        Drawable drawable3 = this.f112559h;
        canvas.save();
        int i4 = 0;
        if (recyclerView.getClipToPadding()) {
            int paddingLeft = recyclerView.getPaddingLeft();
            int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(paddingLeft, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
            i = width;
            i2 = paddingLeft;
        } else {
            i = recyclerView.getWidth();
            i2 = 0;
        }
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull(adapter, "parent.adapter!!");
        int itemCount = adapter.getItemCount();
        while (i4 < itemCount) {
            try {
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                if (!(layoutManager == null || (findViewByPosition = layoutManager.findViewByPosition(i4)) == null)) {
                    Intrinsics.checkExpressionValueIsNotNull(findViewByPosition, "parent.layoutManager?.fi…ByPosition(i) ?: continue");
                    RecyclerView.Adapter adapter2 = recyclerView.getAdapter();
                    if (adapter2 == null) {
                        Intrinsics.throwNpe();
                    }
                    if (!m176013a(adapter2.getItemViewType(i4))) {
                        recyclerView.getDecoratedBoundsWithMargins(findViewByPosition, this.f112555d);
                        boolean a = m176013a(m176011a(i4, recyclerView));
                        boolean a2 = m176013a(m176014b(i4, recyclerView));
                        boolean c = m176016c(i4, recyclerView);
                        if (a && a2) {
                            if (drawable3 != null) {
                                drawable3.setBounds(this.f112555d);
                            }
                            if (drawable3 != null) {
                                drawable3.draw(canvas);
                            }
                            i3 = itemCount;
                        } else if (!a || !c) {
                            i3 = itemCount;
                            if (a) {
                                if (drawable != null) {
                                    drawable.setBounds(this.f112555d);
                                }
                                if (drawable != null) {
                                    drawable.draw(canvas);
                                }
                            } else if (c) {
                                if (drawable2 != null) {
                                    drawable2.setBounds(this.f112555d.left, this.f112555d.top, this.f112555d.right, this.f112555d.bottom - this.f112553b);
                                }
                                if (drawable2 != null) {
                                    drawable2.draw(canvas);
                                }
                            } else if (a2) {
                                if (drawable2 != null) {
                                    drawable2.setBounds(this.f112555d);
                                }
                                if (drawable2 != null) {
                                    drawable2.draw(canvas);
                                }
                            } else {
                                canvas.drawRect(this.f112555d, this.f112554c);
                            }
                        } else {
                            if (drawable3 != null) {
                                i3 = itemCount;
                                try {
                                    drawable3.setBounds(this.f112555d.left, this.f112555d.top, this.f112555d.right, this.f112555d.bottom - this.f112553b);
                                } catch (NullPointerException e2) {
                                    e = e2;
                                    Log.m165384e("DividerItem", "drawVertical", e);
                                    i4++;
                                    itemCount = i3;
                                }
                            } else {
                                i3 = itemCount;
                            }
                            if (drawable3 != null) {
                                drawable3.draw(canvas);
                            }
                        }
                        int a3 = this.f112555d.bottom + C69029a.m265653a(findViewByPosition.getTranslationY());
                        if (!m176016c(i4, recyclerView) && !m176013a(m176014b(i4, recyclerView))) {
                            bVar.setBounds(i2, a3 - bVar.getIntrinsicHeight(), i, a3);
                            bVar.draw(canvas);
                        }
                        i4++;
                        itemCount = i3;
                    }
                }
                i3 = itemCount;
            } catch (NullPointerException e3) {
                e = e3;
                i3 = itemCount;
                Log.m165384e("DividerItem", "drawVertical", e);
                i4++;
                itemCount = i3;
            }
            i4++;
            itemCount = i3;
        }
        canvas.restore();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        Intrinsics.checkParameterIsNotNull(canvas, C60375c.f150914a);
        Intrinsics.checkParameterIsNotNull(recyclerView, "parent");
        Intrinsics.checkParameterIsNotNull(state, "state");
        super.onDraw(canvas, recyclerView, state);
        if (recyclerView.getLayoutManager() != null) {
            m176012a(canvas, recyclerView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        Intrinsics.checkParameterIsNotNull(rect, "outRect");
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(recyclerView, "parent");
        Intrinsics.checkParameterIsNotNull(state, "state");
        super.getItemOffsets(rect, view, recyclerView, state);
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition != -1) {
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            if (adapter == null) {
                Intrinsics.throwNpe();
            }
            if (!m176015b(adapter.getItemViewType(childAdapterPosition))) {
                return;
            }
            if (!m176016c(childAdapterPosition, recyclerView) && !m176013a(m176014b(childAdapterPosition, recyclerView))) {
                rect.set(0, 0, 0, C44390w.m176138a(0.5f, this.f112560i));
            } else if (m176016c(childAdapterPosition, recyclerView)) {
                rect.set(0, 0, 0, this.f112553b);
            }
        }
    }
}
