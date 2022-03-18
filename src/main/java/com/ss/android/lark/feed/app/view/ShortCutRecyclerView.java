package com.ss.android.lark.feed.app.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.lark.feed.app.shortcut.ShortCutStausManager;
import com.ss.android.lark.log.Log;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001b\u001cB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u0016\u001a\u00020\u0017H\u0014J\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\tH\u0014R\u001a\u0010\u000b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/feed/app/view/ShortCutRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "newColumn", "getNewColumn", "()I", "setNewColumn", "(I)V", "relayoutListener", "Lcom/ss/android/lark/feed/app/view/ShortCutRecyclerView$ShortCutRelayoutListener;", "getRelayoutListener", "()Lcom/ss/android/lark/feed/app/view/ShortCutRecyclerView$ShortCutRelayoutListener;", "setRelayoutListener", "(Lcom/ss/android/lark/feed/app/view/ShortCutRecyclerView$ShortCutRelayoutListener;)V", "onDetachedFromWindow", "", "onMeasure", "widthSpec", "heightSpec", "Companion", "ShortCutRelayoutListener", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
public class ShortCutRecyclerView extends RecyclerView {

    /* renamed from: a */
    public static final Companion f97416a = new Companion(null);

    /* renamed from: b */
    private int f97417b;

    /* renamed from: c */
    private ShortCutRelayoutListener f97418c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/feed/app/view/ShortCutRecyclerView$ShortCutRelayoutListener;", "", "onChanged", "", "newColumn", "", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.view.ShortCutRecyclerView$b */
    public interface ShortCutRelayoutListener {
        /* renamed from: a */
        void mo137314a(int i);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/feed/app/view/ShortCutRecyclerView$Companion;", "", "()V", "TAG", "", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.view.ShortCutRecyclerView$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final int getNewColumn() {
        return this.f97417b;
    }

    public final ShortCutRelayoutListener getRelayoutListener() {
        return this.f97418c;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.recyclerview.widget.RecyclerView
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f97418c = null;
    }

    public final void setNewColumn(int i) {
        this.f97417b = i;
    }

    public final void setRelayoutListener(ShortCutRelayoutListener bVar) {
        this.f97418c = bVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShortCutRecyclerView(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShortCutRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* access modifiers changed from: protected */
    @Override // androidx.recyclerview.widget.RecyclerView
    public void onMeasure(int i, int i2) {
        int i3;
        StringBuilder sb = new StringBuilder();
        sb.append("ShortCutRecyclerView#onMeasure, current column is ");
        ShortCutStausManager a = ShortCutStausManager.m148791a();
        Intrinsics.checkExpressionValueIsNotNull(a, "ShortCutStausManager.inst()");
        sb.append(a.mo138579f());
        sb.append(',');
        sb.append("measureWidth=");
        sb.append(getMeasuredWidth());
        Log.m165389i("Magic_Window", sb.toString());
        if (getMeasuredWidth() != 0) {
            i3 = ShortCutStausManager.m148791a().mo138571b(getMeasuredWidth());
        } else {
            ShortCutStausManager a2 = ShortCutStausManager.m148791a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "ShortCutStausManager.inst()");
            i3 = a2.mo138579f();
        }
        this.f97417b = i3;
        if (getLayoutManager() instanceof GridLayoutManager) {
            RecyclerView.LayoutManager layoutManager = getLayoutManager();
            if (layoutManager != null) {
                int b = ((GridLayoutManager) layoutManager).mo6502b();
                int i4 = this.f97417b;
                if (!(b == i4 || i4 == 0)) {
                    Log.m165379d("Magic_Window", "update recyclerView column when window size change, column=" + this.f97417b + ", currentWidth = " + getMeasuredWidth());
                    ShortCutStausManager a3 = ShortCutStausManager.m148791a();
                    Intrinsics.checkExpressionValueIsNotNull(a3, "ShortCutStausManager.inst()");
                    if (a3.mo138579f() != this.f97417b) {
                        ShortCutStausManager a4 = ShortCutStausManager.m148791a();
                        Intrinsics.checkExpressionValueIsNotNull(a4, "ShortCutStausManager.inst()");
                        a4.mo138566a(this.f97417b);
                    }
                    RecyclerView.LayoutManager layoutManager2 = getLayoutManager();
                    if (layoutManager2 != null) {
                        ((GridLayoutManager) layoutManager2).mo6500a(this.f97417b);
                        ShortCutRelayoutListener bVar = this.f97418c;
                        if (bVar != null) {
                            bVar.mo137314a(this.f97417b);
                        }
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
                    }
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
            }
        }
        super.onMeasure(i, i2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShortCutRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(attributeSet, "attrs");
    }
}
