package com.ss.android.lark.searchcommon.view.avataritem.title;

import android.widget.TextView;
import com.larksuite.component.ui.list.IComponentBinder;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/searchcommon/view/avataritem/title/TitleTailBinder;", "Lcom/larksuite/component/ui/list/IComponentBinder;", "Landroid/widget/TextView;", "Lcom/ss/android/lark/searchcommon/view/avataritem/title/TitleTailModel;", "()V", "bind", "", "view", "model", "unbind", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.view.avataritem.g.c */
public final class TitleTailBinder implements IComponentBinder<TextView, TitleTailModel> {

    /* renamed from: a */
    public static final TitleTailBinder f133547a = new TitleTailBinder();

    private TitleTailBinder() {
    }

    /* renamed from: a */
    public void mo88913a(TextView textView) {
        Intrinsics.checkParameterIsNotNull(textView, "view");
        textView.setVisibility(8);
    }

    /* renamed from: a */
    public void mo88915a(TextView textView, TitleTailModel dVar) {
        Intrinsics.checkParameterIsNotNull(textView, "view");
        Intrinsics.checkParameterIsNotNull(dVar, "model");
        textView.setVisibility(0);
        textView.setText(dVar.mo184738a());
        textView.setTextColor(UIHelper.getColor(dVar.mo184739b()));
    }
}
