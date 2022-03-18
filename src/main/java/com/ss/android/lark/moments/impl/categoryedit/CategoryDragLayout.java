package com.ss.android.lark.moments.impl.categoryedit;

import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.DragEvent;
import android.view.View;
import android.view.ViewParent;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.C0919u;
import com.bytedance.lark.pb.moments.v1.Tab;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.location.LocationRequest;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.moments.impl.categoryedit.OnClickTabItemListener;
import com.ss.ttm.player.MediaPlayer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\b\u0018\u0000 ?2\u00020\u0001:\u0002?@B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B#\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000e\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&J\u0016\u0010'\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010(\u001a\u00020\tJ\u0016\u0010)\u001a\u0012\u0012\u0004\u0012\u00020+0*j\b\u0012\u0004\u0012\u00020+`,J\u0016\u0010-\u001a\u0012\u0012\u0004\u0012\u00020\f0*j\b\u0012\u0004\u0012\u00020\f`,J\u0010\u0010.\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0002J\u0010\u0010/\u001a\u00020\t2\u0006\u00100\u001a\u000201H\u0002J\b\u00102\u001a\u000203H\u0002J\u000e\u00104\u001a\u0002032\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u00105\u001a\u0002032\u0006\u00106\u001a\u00020\u0013J\u0014\u00107\u001a\u0002032\f\u00108\u001a\b\u0012\u0004\u0012\u00020&09J\u000e\u0010:\u001a\u0002032\u0006\u0010;\u001a\u00020 J\u0010\u0010<\u001a\u0002032\b\u0010!\u001a\u0004\u0018\u00010\"J\u0006\u0010=\u001a\u000203J\u0006\u0010>\u001a\u000203R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001cX.¢\u0006\u0004\n\u0002\u0010\u001eR\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u000e¢\u0006\u0002\n\u0000¨\u0006A"}, d2 = {"Lcom/ss/android/lark/moments/impl/categoryedit/CategoryDragLayout;", "Landroid/widget/GridLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "currentTabId", "", "getCurrentTabId", "()Ljava/lang/String;", "setCurrentTabId", "(Ljava/lang/String;)V", "disableCount", "enableChangePosition", "", "gridBinder", "Lcom/ss/android/lark/moments/impl/categoryedit/MomentsCategoryGridBinder;", "isAllowDrag", "mDragListener", "Landroid/view/View$OnDragListener;", "mLongClickListener", "Landroid/view/View$OnLongClickListener;", "mRect", "", "Landroid/graphics/Rect;", "[Landroid/graphics/Rect;", "onClickTabItemListener", "Lcom/ss/android/lark/moments/impl/categoryedit/OnClickTabItemListener;", "onItemActionClickListener", "Lcom/ss/android/lark/moments/impl/categoryedit/CategoryDragLayout$OnItemActionClickListener;", "addItem", "Landroid/view/View;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/moments/impl/categoryedit/TabData;", "addItemAtIndex", "index", "getChildrenData", "Ljava/util/ArrayList;", "Lcom/bytedance/lark/pb/moments/v1/Tab;", "Lkotlin/collections/ArrayList;", "getChildrenTabIds", "getItemView", "getTouchIndex", "event", "Landroid/view/DragEvent;", "initRect", "", "setBinder", "setEnableChangePosition", "enable", "setItems", "items", "", "setOnClickMyTabListener", "itemListener", "setOnDragItemClickListener", "shutEditing", "triggerEditing", "Companion", "OnItemActionClickListener", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class CategoryDragLayout extends GridLayout {

    /* renamed from: g */
    public static final Companion f119189g = new Companion(null);

    /* renamed from: a */
    public OnClickTabItemListener f119190a;

    /* renamed from: b */
    public int f119191b;

    /* renamed from: c */
    public boolean f119192c = true;

    /* renamed from: d */
    public MomentsCategoryGridBinder f119193d;

    /* renamed from: e */
    public OnItemActionClickListener f119194e;

    /* renamed from: f */
    public final View.OnLongClickListener f119195f;

    /* renamed from: h */
    private String f119196h;

    /* renamed from: i */
    private boolean f119197i;

    /* renamed from: j */
    private Rect[] f119198j;

    /* renamed from: k */
    private final View.OnDragListener f119199k;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/moments/impl/categoryedit/CategoryDragLayout$OnItemActionClickListener;", "", "onItemActionClick", "", "view", "Lcom/ss/android/lark/moments/impl/categoryedit/CategoryItemView;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.categoryedit.CategoryDragLayout$b */
    public interface OnItemActionClickListener {
        /* renamed from: a */
        void mo166103a(CategoryItemView aVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/moments/impl/categoryedit/CategoryDragLayout$Companion;", "", "()V", "columnCount", "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.categoryedit.CategoryDragLayout$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J \u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\rH\u0016J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014H\u0016¨\u0006\u0015"}, d2 = {"com/ss/android/lark/moments/impl/categoryedit/CategoryDragLayout$setOnClickMyTabListener$1", "Lcom/ss/android/lark/moments/impl/categoryedit/OnClickTabItemListener;", "onActionClick", "", "view", "Lcom/ss/android/lark/moments/impl/categoryedit/CategoryItemView;", "onClickMoreTab", "id", "", "name", "iconKey", "onClickMyTab", "onLongClick", "", "v", "Landroid/view/View;", "isEditing", "enableDrag", "setMoreSubTitleVisible", "visibility", "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.categoryedit.CategoryDragLayout$e */
    public static final class C47258e implements OnClickTabItemListener {

        /* renamed from: a */
        final /* synthetic */ CategoryDragLayout f119204a;

        /* renamed from: b */
        final /* synthetic */ OnClickTabItemListener f119205b;

        @Override // com.ss.android.lark.moments.impl.categoryedit.OnClickTabItemListener
        /* renamed from: a */
        public void mo166108a() {
            OnClickTabItemListener.C47278a.m187213a(this);
        }

        @Override // com.ss.android.lark.moments.impl.categoryedit.OnClickTabItemListener
        /* renamed from: a */
        public void mo166109a(int i) {
            this.f119205b.mo166109a(i);
        }

        @Override // com.ss.android.lark.moments.impl.categoryedit.OnClickTabItemListener
        /* renamed from: a */
        public void mo166110a(CategoryItemView aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "view");
            OnItemActionClickListener bVar = this.f119204a.f119194e;
            if (bVar != null) {
                bVar.mo166103a(aVar);
            }
        }

        @Override // com.ss.android.lark.moments.impl.categoryedit.OnClickTabItemListener
        /* renamed from: a */
        public void mo166111a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "id");
            this.f119205b.mo166111a(str);
        }

        C47258e(CategoryDragLayout categoryDragLayout, OnClickTabItemListener gVar) {
            this.f119204a = categoryDragLayout;
            this.f119205b = gVar;
        }

        @Override // com.ss.android.lark.moments.impl.categoryedit.OnClickTabItemListener
        /* renamed from: a */
        public void mo166112a(String str, String str2, String str3) {
            Intrinsics.checkParameterIsNotNull(str, "id");
            Intrinsics.checkParameterIsNotNull(str2, "name");
            Intrinsics.checkParameterIsNotNull(str3, "iconKey");
            this.f119205b.mo166112a(str, str2, str3);
        }

        @Override // com.ss.android.lark.moments.impl.categoryedit.OnClickTabItemListener
        /* renamed from: a */
        public boolean mo166113a(View view, boolean z, boolean z2) {
            Intrinsics.checkParameterIsNotNull(view, "v");
            if (!z) {
                this.f119205b.mo166108a();
            }
            if (!z2) {
                return true;
            }
            return this.f119204a.f119195f.onLongClick(view);
        }
    }

    public final String getCurrentTabId() {
        return this.f119196h;
    }

    /* renamed from: b */
    public final void mo166092b() {
        this.f119197i = true;
        setOnDragListener(this.f119199k);
        Iterator<View> a = C0919u.m4412b(this).mo4717a();
        while (a.hasNext()) {
            View next = a.next();
            long random = (long) RangesKt.random(new IntRange(0, LocationRequest.PRIORITY_INDOOR), Random.f173148c);
            if (!(next instanceof CategoryItemView)) {
                next = null;
            }
            CategoryItemView aVar = (CategoryItemView) next;
            if (aVar != null) {
                aVar.mo166133a(random);
            }
        }
    }

    /* renamed from: c */
    public final void mo166093c() {
        this.f119197i = false;
        setOnDragListener(null);
        Iterator<View> a = C0919u.m4412b(this).mo4717a();
        while (a.hasNext()) {
            View next = a.next();
            if (!(next instanceof CategoryItemView)) {
                next = null;
            }
            CategoryItemView aVar = (CategoryItemView) next;
            if (aVar != null) {
                aVar.mo166136b();
            }
        }
    }

    public final ArrayList<Tab> getChildrenData() {
        TabData tabData;
        ArrayList<Tab> arrayList = new ArrayList<>();
        Iterator<View> a = C0919u.m4412b(this).mo4717a();
        while (a.hasNext()) {
            View next = a.next();
            if ((next instanceof CategoryItemView) && (tabData = ((CategoryItemView) next).getTabData()) != null) {
                arrayList.add(new Tab(tabData.mo166160a(), tabData.mo166161b(), tabData.mo166162c(), Boolean.valueOf(tabData.mo166163d())));
            }
        }
        return arrayList;
    }

    public final ArrayList<String> getChildrenTabIds() {
        String str;
        boolean z;
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<View> a = C0919u.m4412b(this).mo4717a();
        while (a.hasNext()) {
            View next = a.next();
            if (next instanceof CategoryItemView) {
                TabData tabData = ((CategoryItemView) next).getTabData();
                if (tabData != null) {
                    str = tabData.mo166160a();
                } else {
                    str = null;
                }
                String str2 = str;
                if (str2 == null || str2.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    arrayList.add(str);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo166091a() {
        this.f119198j = new Rect[getChildCount()];
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            Intrinsics.checkExpressionValueIsNotNull(childAt, "childView");
            Rect rect = new Rect(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
            Rect[] rectArr = this.f119198j;
            if (rectArr == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRect");
            }
            rectArr[i] = rect;
        }
    }

    public final void setCurrentTabId(String str) {
        this.f119196h = str;
    }

    public final void setEnableChangePosition(boolean z) {
        this.f119192c = z;
    }

    public final void setOnDragItemClickListener(OnItemActionClickListener bVar) {
        this.f119194e = bVar;
    }

    public final void setBinder(MomentsCategoryGridBinder eVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "gridBinder");
        this.f119193d = eVar;
    }

    public final void setOnClickMyTabListener(OnClickTabItemListener gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "itemListener");
        this.f119190a = new C47258e(this, gVar);
    }

    /* renamed from: b */
    private final View m187149b(TabData hVar) {
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        CategoryItemView aVar = new CategoryItemView(context);
        aVar.mo166134a(hVar, this.f119190a);
        return aVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onLongClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.categoryedit.CategoryDragLayout$d */
    static final class View$OnLongClickListenerC47256d implements View.OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ CategoryDragLayout f119201a;

        View$OnLongClickListenerC47256d(CategoryDragLayout categoryDragLayout) {
            this.f119201a = categoryDragLayout;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"com/ss/android/lark/moments/impl/categoryedit/CategoryDragLayout$mLongClickListener$1$shadowBuilder$1", "Landroid/view/View$DragShadowBuilder;", "point", "Landroid/graphics/Point;", "onDrawShadow", "", "canvas", "Landroid/graphics/Canvas;", "onProvideShadowMetrics", "outShadowSize", "outShadowTouchPoint", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.moments.impl.categoryedit.CategoryDragLayout$d$a */
        public static final class C47257a extends View.DragShadowBuilder {

            /* renamed from: a */
            final /* synthetic */ View f119202a;

            /* renamed from: b */
            private Point f119203b;

            public void onDrawShadow(Canvas canvas) {
                View view;
                Intrinsics.checkParameterIsNotNull(canvas, "canvas");
                Point point = this.f119203b;
                if (point != null && (view = getView()) != null) {
                    canvas.scale(((float) point.x) / ((float) view.getWidth()), ((float) point.y) / ((float) view.getHeight()));
                    view.draw(canvas);
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C47257a(View view, View view2) {
                super(view2);
                this.f119202a = view;
            }

            public void onProvideShadowMetrics(Point point, Point point2) {
                Intrinsics.checkParameterIsNotNull(point, "outShadowSize");
                Intrinsics.checkParameterIsNotNull(point2, "outShadowTouchPoint");
                View view = getView();
                if (view != null) {
                    point.set((int) (((double) view.getWidth()) * 1.2d), (int) (((double) view.getHeight()) * 1.2d));
                    point2.set(point.x / 2, point.y / 2);
                    this.f119203b = point;
                }
            }
        }

        public final boolean onLongClick(View view) {
            MomentsCategoryGridBinder eVar = this.f119201a.f119193d;
            if (eVar != null) {
                eVar.mo166144a(view);
            }
            C47257a aVar = new C47257a(view, view);
            Intrinsics.checkExpressionValueIsNotNull(view, "v");
            ImageView imageView = (ImageView) view.findViewById(R.id.ivAction);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "v.ivAction");
            imageView.setVisibility(8);
            View view2 = aVar.getView();
            Intrinsics.checkExpressionValueIsNotNull(view2, "shadowBuilder.view");
            view2.setAlpha(1.0f);
            if (Build.VERSION.SDK_INT >= 24) {
                view.startDragAndDrop(null, aVar, null, MediaPlayer.MEDIA_PLAYER_OPTION_APPID);
            } else {
                view.startDrag(null, aVar, null, 0);
            }
            ((TextView) view.findViewById(R.id.tvCategory)).setTextColor(UIUtils.getColor(this.f119201a.getContext(), R.color.bg_body));
            TextView textView = (TextView) view.findViewById(R.id.tvCategory);
            Intrinsics.checkExpressionValueIsNotNull(textView, "v.tvCategory");
            textView.setBackground(null);
            view.setEnabled(false);
            view.clearAnimation();
            view.setPressed(true);
            return true;
        }
    }

    public CategoryDragLayout(Context context) {
        super(context);
        setColumnCount(2);
        setLayoutTransition(new LayoutTransition());
        this.f119195f = new View$OnLongClickListenerC47256d(this);
        this.f119199k = new View$OnDragListenerC47255c(this);
    }

    /* renamed from: a */
    public final int mo166088a(DragEvent dragEvent) {
        Rect[] rectArr = this.f119198j;
        if (rectArr == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRect");
        }
        int length = rectArr.length;
        for (int i = 0; i < length; i++) {
            Rect[] rectArr2 = this.f119198j;
            if (rectArr2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRect");
            }
            Rect rect = rectArr2[i];
            if (rect != null && rect.contains((int) dragEvent.getX(), (int) dragEvent.getY())) {
                return i;
            }
        }
        return -1;
    }

    public final void setItems(List<TabData> list) {
        Intrinsics.checkParameterIsNotNull(list, "items");
        removeAllViews();
        this.f119191b = 0;
        for (T t : list) {
            View b = m187149b(t);
            if (!t.mo166163d()) {
                this.f119191b++;
            }
            addView(b);
        }
    }

    /* renamed from: a */
    public final View mo166089a(TabData hVar) {
        CategoryState categoryState;
        View view;
        Intrinsics.checkParameterIsNotNull(hVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        if (hVar.mo166164e() == CategoryState.CURRENT_CATEGORY_IN_MORE) {
            categoryState = CategoryState.CURRENT_CATEGORY_IN_MY;
        } else {
            categoryState = CategoryState.MY_CATEGORY;
        }
        View b = m187149b(new TabData(hVar.mo166160a(), hVar.mo166161b(), hVar.mo166162c(), hVar.mo166163d(), categoryState));
        addView(b);
        if (!(b instanceof CategoryItemView)) {
            view = null;
        } else {
            view = b;
        }
        CategoryItemView aVar = (CategoryItemView) view;
        if (aVar != null) {
            CategoryItemView.m187193a(aVar, 0, 1, null);
        }
        return b;
    }

    public CategoryDragLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setColumnCount(2);
        setLayoutTransition(new LayoutTransition());
        this.f119195f = new View$OnLongClickListenerC47256d(this);
        this.f119199k = new View$OnDragListenerC47255c(this);
    }

    /* renamed from: a */
    public final View mo166090a(TabData hVar, int i) {
        CategoryState categoryState;
        View view;
        Intrinsics.checkParameterIsNotNull(hVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        if (hVar.mo166164e() == CategoryState.CURRENT_CATEGORY_IN_MY) {
            categoryState = CategoryState.CURRENT_CATEGORY_IN_MORE;
        } else {
            categoryState = CategoryState.MORE_CATEGORY;
        }
        View b = m187149b(new TabData(hVar.mo166160a(), hVar.mo166161b(), hVar.mo166162c(), hVar.mo166163d(), categoryState));
        addView(b, i);
        if (!(b instanceof CategoryItemView)) {
            view = null;
        } else {
            view = b;
        }
        CategoryItemView aVar = (CategoryItemView) view;
        if (aVar != null) {
            CategoryItemView.m187193a(aVar, 0, 1, null);
        }
        return b;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "event", "Landroid/view/DragEvent;", "onDrag"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.categoryedit.CategoryDragLayout$c */
    static final class View$OnDragListenerC47255c implements View.OnDragListener {

        /* renamed from: a */
        final /* synthetic */ CategoryDragLayout f119200a;

        View$OnDragListenerC47255c(CategoryDragLayout categoryDragLayout) {
            this.f119200a = categoryDragLayout;
        }

        public final boolean onDrag(View view, DragEvent dragEvent) {
            View view2;
            View a;
            View view3;
            View a2;
            CategoryDragLayout categoryDragLayout;
            View view4;
            TabData tabData;
            OnClickTabItemListener gVar;
            Intrinsics.checkExpressionValueIsNotNull(dragEvent, "event");
            int action = dragEvent.getAction();
            if (action != 1) {
                boolean z = false;
                CategoryDragLayout categoryDragLayout2 = null;
                if (action == 2) {
                    MomentsCategoryGridBinder eVar = this.f119200a.f119193d;
                    if (eVar != null) {
                        eVar.mo166148c(this.f119200a);
                    }
                    if (!this.f119200a.f119192c) {
                        return true;
                    }
                    MomentsCategoryGridBinder eVar2 = this.f119200a.f119193d;
                    if (eVar2 != null) {
                        view2 = eVar2.mo166143a();
                    } else {
                        view2 = null;
                    }
                    int a3 = this.f119200a.mo166088a(dragEvent);
                    if (!(a3 <= this.f119200a.f119191b - 1 || view2 == null || view2 == this.f119200a.getChildAt(a3))) {
                        ViewParent parent = view2.getParent();
                        if (parent instanceof CategoryDragLayout) {
                            categoryDragLayout2 = parent;
                        }
                        CategoryDragLayout categoryDragLayout3 = categoryDragLayout2;
                        if (categoryDragLayout3 != null) {
                            if (categoryDragLayout3.indexOfChild(view2) != -1) {
                                z = true;
                            }
                            if (z) {
                                view2.clearAnimation();
                                categoryDragLayout3.removeView(view2);
                            }
                        }
                        this.f119200a.addView(view2, a3);
                    }
                } else if (action == 4) {
                    MomentsCategoryGridBinder eVar3 = this.f119200a.f119193d;
                    if (!(eVar3 == null || (a2 = eVar3.mo166143a()) == null)) {
                        MomentsCategoryGridBinder eVar4 = this.f119200a.f119193d;
                        if (eVar4 != null) {
                            categoryDragLayout = eVar4.mo166146b();
                        } else {
                            categoryDragLayout = null;
                        }
                        if (Intrinsics.areEqual(categoryDragLayout, this.f119200a) && a2.getParent() != null && (!Intrinsics.areEqual(a2.getParent(), this.f119200a))) {
                            ViewParent parent2 = a2.getParent();
                            if (!(parent2 instanceof CategoryDragLayout)) {
                                parent2 = null;
                            }
                            CategoryDragLayout categoryDragLayout4 = (CategoryDragLayout) parent2;
                            if (categoryDragLayout4 != null) {
                                categoryDragLayout4.removeView(a2);
                            }
                            if (!(a2 instanceof CategoryItemView)) {
                                view4 = null;
                            } else {
                                view4 = a2;
                            }
                            CategoryItemView aVar = (CategoryItemView) view4;
                            if (!(aVar == null || (tabData = aVar.getTabData()) == null)) {
                                View a4 = this.f119200a.mo166090a(new TabData(tabData.mo166160a(), tabData.mo166161b(), tabData.mo166162c(), tabData.mo166163d(), tabData.mo166164e()), 0);
                                MomentsCategoryGridBinder eVar5 = this.f119200a.f119193d;
                                if (eVar5 != null) {
                                    eVar5.mo166144a(a4);
                                }
                                if (this.f119200a.getChildCount() > 0 && (gVar = this.f119200a.f119190a) != null) {
                                    gVar.mo166109a(0);
                                }
                            }
                        }
                        a2.setPressed(false);
                    }
                    MomentsCategoryGridBinder eVar6 = this.f119200a.f119193d;
                    if (!(eVar6 == null || (a = eVar6.mo166143a()) == null)) {
                        a.setEnabled(true);
                        if (!(a instanceof CategoryItemView)) {
                            view3 = null;
                        } else {
                            view3 = a;
                        }
                        CategoryItemView aVar2 = (CategoryItemView) view3;
                        if (aVar2 != null) {
                            CategoryItemView.m187193a(aVar2, 0, 1, null);
                        }
                        ImageView imageView = (ImageView) a.findViewById(R.id.ivAction);
                        Intrinsics.checkExpressionValueIsNotNull(imageView, "it.ivAction");
                        imageView.setVisibility(0);
                        a.setPressed(false);
                    }
                }
            } else {
                this.f119200a.mo166091a();
            }
            return true;
        }
    }

    public CategoryDragLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setColumnCount(2);
        setLayoutTransition(new LayoutTransition());
        this.f119195f = new View$OnLongClickListenerC47256d(this);
        this.f119199k = new View$OnDragListenerC47255c(this);
    }
}
