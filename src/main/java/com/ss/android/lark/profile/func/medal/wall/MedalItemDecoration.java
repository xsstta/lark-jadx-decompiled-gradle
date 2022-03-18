package com.ss.android.lark.profile.func.medal.wall;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0005¢\u0006\u0002\u0010\u0002J(\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/profile/func/medal/wall/MedalItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "()V", "columnNum", "", "distance", "isColumnInited", "", "topDistance", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", "view", "Landroid/view/View;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "Companion", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.medal.wall.a */
public final class MedalItemDecoration extends RecyclerView.AbstractC1335d {

    /* renamed from: a */
    public static int f129839a = UIHelper.dp2px(174.0f);

    /* renamed from: b */
    public static final Companion f129840b = new Companion(null);

    /* renamed from: c */
    private int f129841c;

    /* renamed from: d */
    private final int f129842d = UIHelper.dp2px(14.0f);

    /* renamed from: e */
    private boolean f129843e;

    /* renamed from: f */
    private int f129844f = 2;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/profile/func/medal/wall/MedalItemDecoration$Companion;", "", "()V", "MEDAL_ITEM_WIDTH", "", "getMEDAL_ITEM_WIDTH", "()I", "setMEDAL_ITEM_WIDTH", "(I)V", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.medal.wall.a$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final int mo179329a() {
            return MedalItemDecoration.f129839a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        Intrinsics.checkParameterIsNotNull(rect, "outRect");
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(recyclerView, "parent");
        Intrinsics.checkParameterIsNotNull(state, "state");
        if (!this.f129843e) {
            this.f129843e = true;
            this.f129844f = recyclerView.getMeasuredWidth() / f129839a;
            int measuredWidth = recyclerView.getMeasuredWidth();
            int i = f129839a;
            int i2 = this.f129844f;
            this.f129841c = (measuredWidth - (i * i2)) / (i2 * 2);
        }
        rect.left = this.f129841c;
        rect.top = this.f129842d;
    }
}
