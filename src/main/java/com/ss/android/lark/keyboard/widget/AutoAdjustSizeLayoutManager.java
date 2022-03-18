package com.ss.android.lark.keyboard.widget;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.LinearLayout;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p3466b.C69029a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/keyboard/widget/AutoAdjustSizeLayoutManager;", "Lcom/ss/android/lark/keyboard/widget/IPluginLayoutManager;", "()V", "horizontalPadding", "", "onLayoutPlugin", "", "container", "Landroid/widget/LinearLayout;", "visibleChildViews", "", "Landroid/view/View;", "Companion", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.keyboard.widget.a */
public final class AutoAdjustSizeLayoutManager implements IPluginLayoutManager {

    /* renamed from: a */
    public static final Companion f104801a = new Companion(null);

    /* renamed from: b */
    private final int f104802b = UIHelper.getDimens(R.dimen.keyboard_icon_horizontal_padding);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/keyboard/widget/AutoAdjustSizeLayoutManager$Companion;", "", "()V", "MIDDLE_ICON_MARGIN", "", "SCREEN_SIZE_MIDDLE", "SCREEN_SIZE_SMALL", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.widget.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.keyboard.widget.IPluginLayoutManager
    /* renamed from: a */
    public void mo147347a(LinearLayout linearLayout, List<? extends View> list) {
        Intrinsics.checkParameterIsNotNull(linearLayout, "container");
        Intrinsics.checkParameterIsNotNull(list, "visibleChildViews");
        int size = list.size();
        Context context = linearLayout.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        Resources resources = context.getResources();
        Intrinsics.checkExpressionValueIsNotNull(resources, "context.resources");
        int i = resources.getDisplayMetrics().widthPixels;
        Resources resources2 = context.getResources();
        Intrinsics.checkExpressionValueIsNotNull(resources2, "context.resources");
        int a = C69029a.m265653a(((float) i) / resources2.getDisplayMetrics().density);
        int measuredWidth = linearLayout.getMeasuredWidth();
        List<? extends View> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().getMeasuredWidth()));
        }
        int sumOfInt = measuredWidth - CollectionsKt.sumOfInt(arrayList);
        if (a < 360) {
            int i2 = sumOfInt / size;
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                C41112g.m163058a(it2.next(), i2, 0, 2, null);
            }
        } else if (a < 416) {
            int i3 = (sumOfInt - (this.f104802b * 3)) / (size + 1);
            Iterator<T> it3 = list2.iterator();
            while (it3.hasNext()) {
                C41112g.m163058a(it3.next(), i3, 0, 2, null);
            }
            C41112g.m163058a((View) CollectionsKt.last((List) list), i3 * 2, 0, 2, null);
        } else {
            int a2 = C57582a.m223600a(14);
            Iterator<T> it4 = list2.iterator();
            while (it4.hasNext()) {
                C41112g.m163058a(it4.next(), a2, 0, 2, null);
            }
        }
    }
}
