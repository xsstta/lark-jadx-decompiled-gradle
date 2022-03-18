package com.ss.android.lark.mm.module.tab;

import android.content.Context;
import android.util.AttributeSet;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.utils.ResString;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.tab.NavigationTabItemView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B#\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\fH\u0002¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/mm/module/tab/MmNavigationTabView;", "Lcom/ss/android/lark/widget/tab/NavigationTabItemView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "init", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MmNavigationTabView extends NavigationTabItemView {
    /* renamed from: a */
    private final void m186176a() {
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        setTabIcon(UDIconUtils.getIconDrawable(context, (int) R.drawable.ud_icon_tab_minutes_filled, UIHelper.getColor(R.color.ud_B500)));
        setTabTitle(ResString.f118656a.mo165504a(R.string.MMWeb_G_MinutesNameShort));
    }

    public MmNavigationTabView(Context context) {
        this(context, null);
    }

    public MmNavigationTabView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MmNavigationTabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m186176a();
    }
}
