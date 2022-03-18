package com.ss.android.lark.searchcommon.view.avataritem.title;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import com.larksuite.component.ui.list.IComponentBinder;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.C57782ag;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/searchcommon/view/avataritem/title/TitleBinder;", "Lcom/larksuite/component/ui/list/IComponentBinder;", "Landroid/widget/TextView;", "Lcom/ss/android/lark/searchcommon/view/avataritem/title/TitleModel;", "()V", "bind", "", "view", "model", "unbind", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.view.avataritem.g.a */
public final class TitleBinder implements IComponentBinder<TextView, TitleModel> {

    /* renamed from: a */
    public static final TitleBinder f133542a = new TitleBinder();

    private TitleBinder() {
    }

    /* renamed from: a */
    public void mo88913a(TextView textView) {
        Intrinsics.checkParameterIsNotNull(textView, "view");
        textView.setVisibility(8);
    }

    /* renamed from: a */
    public void mo88915a(TextView textView, TitleModel bVar) {
        Intrinsics.checkParameterIsNotNull(textView, "view");
        Intrinsics.checkParameterIsNotNull(bVar, "model");
        if (TextUtils.isEmpty(bVar.mo184732a())) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        if (bVar.mo184733b()) {
            Context context = textView.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "view.context");
            textView.setTextColor(context.getResources().getColor(R.color.text_title));
        } else {
            Context context2 = textView.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context2, "view.context");
            textView.setTextColor(context2.getResources().getColor(R.color.text_placeholder));
        }
        if (CollectionUtils.isEmpty(bVar.mo184734c())) {
            textView.setText(bVar.mo184732a());
            return;
        }
        CharSequence a = bVar.mo184732a();
        List<String> c = bVar.mo184734c();
        Context context3 = textView.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context3, "view.context");
        textView.setText(C57782ag.m224235a(a, c, context3.getResources().getColor(bVar.mo184735d())));
    }
}
