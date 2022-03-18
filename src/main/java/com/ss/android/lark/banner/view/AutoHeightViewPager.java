package com.ss.android.lark.banner.view;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0014¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/banner/view/AutoHeightViewPager;", "Landroidx/viewpager/widget/ViewPager;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "onMeasure", "", "widthMeasureSpec", "", "heightMeasureSpec", "core_banner_banner_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.banner.view.a */
public final class AutoHeightViewPager extends ViewPager {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AutoHeightViewPager(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* access modifiers changed from: protected */
    @Override // androidx.viewpager.widget.ViewPager
    public void onMeasure(int i, int i2) {
        PagerAdapter adapter = getAdapter();
        if (adapter instanceof CarouselPagerAdapter) {
            int windowWidth = UIHelper.getWindowWidth(getContext());
            if (getParent() instanceof ViewGroup) {
                ViewParent parent = getParent();
                if (parent != null) {
                    int measuredWidth = ((ViewGroup) parent).getMeasuredWidth();
                    if (1 <= measuredWidth && windowWidth > measuredWidth) {
                        windowWidth = measuredWidth;
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
                }
            }
            Context context = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(((CarouselPagerAdapter) adapter).mo104582a(context, windowWidth), 1073741824));
            return;
        }
        super.onMeasure(i, i2);
    }
}
