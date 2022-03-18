package com.ss.android.lark.tab.manager.view;

import android.graphics.Canvas;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.p943f.p944a.AbstractC20983m;
import com.ss.android.ttvecamera.p3038g.C60375c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b&\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J@\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0004H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/tab/manager/view/TranslationZDragCallback;", "Lcom/xwray/groupie/TouchCallback;", "()V", "cardPicked", "", "reset", "clearView", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "viewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "onChildDraw", C60375c.f150914a, "Landroid/graphics/Canvas;", "dX", "", "dY", "actionState", "", "isCurrentlyActive", "Companion", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.tab.manager.view.b */
public abstract class TranslationZDragCallback extends AbstractC20983m {

    /* renamed from: a */
    public static final Companion f136403a = new Companion(null);

    /* renamed from: b */
    private boolean f136404b = true;

    /* renamed from: c */
    private boolean f136405c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/tab/manager/view/TranslationZDragCallback$Companion;", "", "()V", "DURATION", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.manager.view.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.AbstractC1303a
    /* renamed from: e */
    public void mo6591e(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
        Intrinsics.checkParameterIsNotNull(viewHolder, "viewHolder");
        super.mo6591e(recyclerView, viewHolder);
        this.f136405c = true;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.AbstractC1303a
    /* renamed from: a */
    public void mo6573a(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f, float f2, int i, boolean z) {
        Intrinsics.checkParameterIsNotNull(canvas, C60375c.f150914a);
        Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
        Intrinsics.checkParameterIsNotNull(viewHolder, "viewHolder");
        if (this.f136404b) {
            ViewPropertyAnimator animate = viewHolder.itemView.animate();
            animate.translationZ(8.0f);
            animate.setDuration(200);
            animate.setInterpolator(new AccelerateDecelerateInterpolator());
            animate.start();
            this.f136404b = false;
        }
        if (this.f136405c) {
            ViewPropertyAnimator animate2 = viewHolder.itemView.animate();
            animate2.translationZ(BitmapDescriptorFactory.HUE_RED);
            animate2.setDuration(200);
            animate2.setInterpolator(new AccelerateInterpolator());
            animate2.start();
            this.f136404b = true;
            this.f136405c = false;
        }
        super.mo6573a(canvas, recyclerView, viewHolder, f, f2, i, z);
    }
}
