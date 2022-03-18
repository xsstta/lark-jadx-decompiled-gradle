package com.ss.android.lark.setting.page.content.general.feedfilter.view;

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
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.ttvecamera.p3038g.C60375c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p3466b.C69029a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 '2\u00020\u0001:\u0001'B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J(\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J \u0010\u001f\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\f\u0010!\u001a\u00020\"*\u00020\u0005H\u0002J\f\u0010#\u001a\u00020\"*\u00020\u0005H\u0002J\u0014\u0010$\u001a\u00020\"*\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0014\u0010%\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0014\u0010&\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0018H\u0002R\u000e\u0010\u0007\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\nX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/ss/android/lark/setting/page/content/general/feedfilter/view/FeedMessageFilterItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "context", "Landroid/content/Context;", "paddingStart", "", "(Landroid/content/Context;I)V", "dividerBottom", "lastBottomMargin", "mBottomBgDrawable", "Landroid/graphics/drawable/Drawable;", "mBounds", "Landroid/graphics/Rect;", "mDivider", "Lcom/larksuite/component/ignition/widget/setting_group/SettingGroupDividerDrawable;", "mSingleBgDrawable", "mTopBgDrawable", "paint", "Landroid/graphics/Paint;", "drawVertical", "", "canvas", "Landroid/graphics/Canvas;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "getItemOffsets", "outRect", "view", "Landroid/view/View;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "onDraw", C60375c.f150914a, "isHeaderType", "", "isItemType", "isLast", "nextType", "previewType", "Companion", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.setting.page.content.general.feedfilter.c.b */
public final class FeedMessageFilterItemDecoration extends RecyclerView.AbstractC1335d {

    /* renamed from: a */
    public static final Companion f134729a = new Companion(null);

    /* renamed from: b */
    private final int f134730b;

    /* renamed from: c */
    private final int f134731c;

    /* renamed from: d */
    private final Paint f134732d;

    /* renamed from: e */
    private final Rect f134733e = new Rect();

    /* renamed from: f */
    private final SettingGroupDividerDrawable f134734f;

    /* renamed from: g */
    private final Drawable f134735g;

    /* renamed from: h */
    private final Drawable f134736h;

    /* renamed from: i */
    private final Drawable f134737i;

    /* renamed from: j */
    private final int f134738j;

    /* renamed from: a */
    private final boolean m211448a(int i) {
        return i == R.layout.feed_editor_header_layout;
    }

    /* renamed from: b */
    private final boolean m211450b(int i) {
        return i == R.layout.feed_editor_item_layout;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/setting/page/content/general/feedfilter/view/FeedMessageFilterItemDecoration$Companion;", "", "()V", "DIVIDER_LEFT_PADDING", "", "DIVIDER_RECT_BOTTOM", "LAST_BOTTOM_MARGIN", "NO_VIEW_TYPE", "", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.general.feedfilter.c.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    private final int m211446a(int i, RecyclerView recyclerView) {
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
    private final boolean m211451c(int i, RecyclerView recyclerView) {
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
    private final int m211449b(int i, RecyclerView recyclerView) {
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

    public FeedMessageFilterItemDecoration(Context context, int i) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f134738j = i;
        this.f134730b = C57582a.m223601a(context, 40.0f);
        this.f134731c = C57582a.m223601a(context, 0.5f);
        Paint paint = new Paint();
        this.f134732d = paint;
        SettingGroupDividerDrawable bVar = new SettingGroupDividerDrawable(context);
        bVar.mo87052b(UIUtils.getColor(context, R.color.bg_float));
        bVar.mo87051a(C57582a.m223601a(context, 48.0f));
        this.f134734f = bVar;
        this.f134735g = ContextCompat.getDrawable(context, R.drawable.editor_tab_item_top_bg);
        this.f134736h = ContextCompat.getDrawable(context, R.drawable.editor_tab_item_bottom_bg);
        this.f134737i = ContextCompat.getDrawable(context, R.drawable.editor_tab_item_single_bg);
        paint.setColor(UIHelper.getColor(R.color.bg_float));
    }

    /* renamed from: a */
    private final void m211447a(Canvas canvas, RecyclerView recyclerView) {
        int i;
        int i2;
        int i3;
        IndexOutOfBoundsException e;
        View findViewByPosition;
        SettingGroupDividerDrawable bVar = this.f134734f;
        Drawable drawable = this.f134735g;
        Drawable drawable2 = this.f134736h;
        Drawable drawable3 = this.f134737i;
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
                    if (!m211448a(adapter2.getItemViewType(i4))) {
                        recyclerView.getDecoratedBoundsWithMargins(findViewByPosition, this.f134733e);
                        boolean a = m211448a(m211446a(i4, recyclerView));
                        boolean a2 = m211448a(m211449b(i4, recyclerView));
                        boolean c = m211451c(i4, recyclerView);
                        if (a && a2) {
                            if (drawable3 != null) {
                                drawable3.setBounds(this.f134733e);
                            }
                            if (drawable3 != null) {
                                drawable3.draw(canvas);
                            }
                            i3 = itemCount;
                        } else if (!a || !c) {
                            i3 = itemCount;
                            if (a) {
                                if (drawable != null) {
                                    drawable.setBounds(this.f134733e);
                                }
                                if (drawable != null) {
                                    drawable.draw(canvas);
                                }
                            } else if (c) {
                                if (drawable2 != null) {
                                    drawable2.setBounds(this.f134733e.left, this.f134733e.top, this.f134733e.right, this.f134733e.bottom - this.f134730b);
                                }
                                if (drawable2 != null) {
                                    drawable2.draw(canvas);
                                }
                            } else if (a2) {
                                if (drawable2 != null) {
                                    drawable2.setBounds(this.f134733e);
                                }
                                if (drawable2 != null) {
                                    drawable2.draw(canvas);
                                }
                            } else {
                                canvas.drawRect(this.f134733e, this.f134732d);
                            }
                        } else {
                            if (drawable3 != null) {
                                i3 = itemCount;
                                try {
                                    drawable3.setBounds(this.f134733e.left, this.f134733e.top, this.f134733e.right, this.f134733e.bottom - this.f134730b);
                                } catch (IndexOutOfBoundsException e2) {
                                    e = e2;
                                    e.printStackTrace();
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
                        int a3 = this.f134733e.bottom + C69029a.m265653a(findViewByPosition.getTranslationY());
                        if (!m211451c(i4, recyclerView) && !m211448a(m211449b(i4, recyclerView))) {
                            bVar.setBounds(i2, a3 - bVar.getIntrinsicHeight(), i, a3);
                            bVar.draw(canvas);
                        }
                        i4++;
                        itemCount = i3;
                    }
                }
                i3 = itemCount;
            } catch (IndexOutOfBoundsException e3) {
                e = e3;
                i3 = itemCount;
                e.printStackTrace();
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
            m211447a(canvas, recyclerView);
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
            if (!m211450b(adapter.getItemViewType(childAdapterPosition))) {
                return;
            }
            if (!m211451c(childAdapterPosition, recyclerView) && !m211448a(m211449b(childAdapterPosition, recyclerView))) {
                rect.set(0, 0, 0, this.f134731c);
            } else if (m211451c(childAdapterPosition, recyclerView)) {
                rect.set(0, 0, 0, this.f134730b);
            }
        }
    }
}
