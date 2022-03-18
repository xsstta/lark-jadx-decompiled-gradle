package com.ss.android.lark.moments.impl.mainview.badge;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.imageview.LKUIBadgeView;
import com.larksuite.suite.R;
import com.ss.android.lark.reaction.widget.p2560b.C52990a;
import com.ss.android.lark.widget.tab.C59204a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0005H\u0014J\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0003H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/moments/impl/mainview/badge/MomentsBadgeView;", "Lcom/ss/android/lark/widget/tab/RedDotView;", "Lcom/larksuite/component/ui/imageview/LKUIBadgeView;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "hasStroke", "", "initView", "", "setHasStroke", "show", "count", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.mainview.badge.a */
public final class MomentsBadgeView extends C59204a<LKUIBadgeView, Integer> {

    /* renamed from: a */
    private boolean f120256a = true;

    /* renamed from: b */
    private final Context f120257b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MomentsBadgeView(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f120257b = context;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.ss.android.lark.widget.tab.C59204a
    /* renamed from: a */
    public /* synthetic */ void mo31307a(Integer num) {
        mo167377a(num.intValue());
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.widget.tab.C59204a
    /* renamed from: a */
    public void mo31305a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        super.mo31305a(context);
        this.f147019e = new MomentsLKUIBadgeView(context);
    }

    /* renamed from: a */
    public void mo167377a(int i) {
        ViewGroup.LayoutParams layoutParams;
        int i2;
        super.mo31307a(Integer.valueOf(i));
        if (i == 0) {
            LKUIBadgeView lKUIBadgeView = (LKUIBadgeView) mo201282b();
            Intrinsics.checkExpressionValueIsNotNull(lKUIBadgeView, "contentView");
            lKUIBadgeView.setVisibility(8);
            return;
        }
        LKUIBadgeView lKUIBadgeView2 = (LKUIBadgeView) mo201282b();
        Intrinsics.checkExpressionValueIsNotNull(lKUIBadgeView2, "contentView");
        lKUIBadgeView2.setVisibility(0);
        LKUIBadgeView lKUIBadgeView3 = (LKUIBadgeView) mo201282b();
        MomentsLKUIBadgeView momentsLKUIBadgeView = null;
        if (lKUIBadgeView3 != null) {
            layoutParams = lKUIBadgeView3.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (!(layoutParams instanceof ConstraintLayout.LayoutParams)) {
            layoutParams = null;
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        String valueOf = String.valueOf(i);
        if (i < 0) {
            View view = this.f147019e;
            if (view instanceof MomentsLKUIBadgeView) {
                momentsLKUIBadgeView = view;
            }
            MomentsLKUIBadgeView momentsLKUIBadgeView2 = (MomentsLKUIBadgeView) momentsLKUIBadgeView;
            if (momentsLKUIBadgeView2 != null) {
                momentsLKUIBadgeView2.setIsSmallRedDot(true);
            }
            ((LKUIBadgeView) mo201282b()).mo89322b(R.drawable.moments_badge_no_text).mo89319a("").mo89316a(BitmapDescriptorFactory.HUE_RED).mo89320a();
            return;
        }
        if (i < 10) {
            View view2 = this.f147019e;
            if (view2 instanceof MomentsLKUIBadgeView) {
                momentsLKUIBadgeView = view2;
            }
            MomentsLKUIBadgeView momentsLKUIBadgeView3 = (MomentsLKUIBadgeView) momentsLKUIBadgeView;
            if (momentsLKUIBadgeView3 != null) {
                momentsLKUIBadgeView3.setIsSmallRedDot(false);
            }
            if (layoutParams2 != null) {
                layoutParams2.leftMargin = C52990a.m205224a(this.f120257b, 12.0f);
            }
            if (this.f120256a) {
                i2 = R.drawable.badge_orange_single_count_bg_stroke;
            } else {
                i2 = R.drawable.badge_orange_single_count_bg_no_stroke;
            }
        } else if (i < 999) {
            View view3 = this.f147019e;
            if (view3 instanceof MomentsLKUIBadgeView) {
                momentsLKUIBadgeView = view3;
            }
            MomentsLKUIBadgeView momentsLKUIBadgeView4 = momentsLKUIBadgeView;
            if (momentsLKUIBadgeView4 != null) {
                momentsLKUIBadgeView4.setIsSmallRedDot(false);
            }
            if (i < 99) {
                if (layoutParams2 != null) {
                    layoutParams2.leftMargin = C52990a.m205224a(this.f120257b, 8.0f);
                }
            } else if (layoutParams2 != null) {
                layoutParams2.leftMargin = C52990a.m205224a(this.f120257b, 2.0f);
            }
            if (this.f120256a) {
                i2 = R.drawable.badge_orange_multi_count_bg_stroke;
            } else {
                i2 = R.drawable.badge_orange_multi_count_bg_no_stroke;
            }
        } else {
            if (this.f120256a) {
                i2 = R.drawable.badge_orange_bg_etc_count_stroke;
            } else {
                i2 = R.drawable.badge_orange_bg_etc_count;
            }
            valueOf = "";
        }
        ((LKUIBadgeView) mo201282b()).mo89322b(i2).mo89317a(-1).mo89319a(valueOf).mo89316a(12.0f).mo89320a();
    }
}
