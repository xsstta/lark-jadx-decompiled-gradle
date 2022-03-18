package com.ss.android.lark.searchcommon.view.foldtag;

import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.p2892a.C57582a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/searchcommon/view/foldtag/DefaultFoldView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Lcom/ss/android/lark/searchcommon/view/foldtag/IFoldView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "asView", "Landroid/view/View;", "changeFoldState", "", "isFold", "", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.view.a.a */
public final class DefaultFoldView extends AppCompatImageView implements IFoldView {
    @Override // com.ss.android.lark.searchcommon.view.foldtag.IFoldView
    /* renamed from: a */
    public View mo184647a() {
        return this;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultFoldView(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        setBackgroundResource(R.drawable.search_recommend_tag_item_bg);
        setPadding(C57582a.m223600a(8), C57582a.m223600a(7), C57582a.m223600a(8), C57582a.m223600a(7));
    }

    @Override // com.ss.android.lark.searchcommon.view.foldtag.IFoldView
    /* renamed from: a */
    public void mo184648a(boolean z) {
        if (z) {
            Context context = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            setImageDrawable(UDIconUtils.getIconDrawable(context, (int) R.drawable.ud_icon_down_outlined, getResources().getColor(R.color.icon_n2)));
            return;
        }
        Context context2 = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context2, "context");
        setImageDrawable(UDIconUtils.getIconDrawable(context2, (int) R.drawable.ud_icon_up_outlined, getResources().getColor(R.color.icon_n2)));
    }
}
