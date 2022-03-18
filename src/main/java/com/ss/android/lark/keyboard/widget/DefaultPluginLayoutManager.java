package com.ss.android.lark.keyboard.widget;

import android.view.View;
import android.widget.LinearLayout;
import com.ss.android.lark.utils.UIHelper;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/keyboard/widget/DefaultPluginLayoutManager;", "Lcom/ss/android/lark/keyboard/widget/IPluginLayoutManager;", "()V", "onLayoutPlugin", "", "container", "Landroid/widget/LinearLayout;", "visibleChildViews", "", "Landroid/view/View;", "Companion", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.keyboard.widget.b */
public final class DefaultPluginLayoutManager implements IPluginLayoutManager {

    /* renamed from: a */
    public static final Companion f104803a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/keyboard/widget/DefaultPluginLayoutManager$Companion;", "", "()V", "DEFAULT_MARGIN", "", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.widget.b$a */
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
        int dp2px = UIHelper.dp2px(6.0f);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            C41112g.m163058a(it.next(), dp2px, 0, 2, null);
        }
    }
}
