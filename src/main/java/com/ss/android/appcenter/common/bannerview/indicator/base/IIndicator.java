package com.ss.android.appcenter.common.bannerview.indicator.base;

import androidx.viewpager.widget.ViewPager;
import com.ss.android.appcenter.common.bannerview.indicator.option.IndicatorOptions;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/appcenter/common/bannerview/indicator/base/IIndicator;", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "notifyDataChanged", "", "setIndicatorOptions", "options", "Lcom/ss/android/appcenter/common/bannerview/indicator/option/IndicatorOptions;", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.appcenter.common.bannerview.indicator.base.a */
public interface IIndicator extends ViewPager.OnPageChangeListener {
    /* renamed from: a */
    void mo100200a();

    void setIndicatorOptions(IndicatorOptions bVar);
}
