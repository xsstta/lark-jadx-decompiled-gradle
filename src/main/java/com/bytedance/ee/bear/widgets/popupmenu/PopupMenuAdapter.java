package com.bytedance.ee.bear.widgets.popupmenu;

import android.widget.ImageView;
import android.widget.TextView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.C20923c;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\b\u0016\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0014¨\u0006\u000b"}, d2 = {"Lcom/bytedance/ee/bear/widgets/popupmenu/PopupMenuAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/bytedance/ee/bear/widgets/popupmenu/PopupMenuItem;", "Lcom/chad/library/adapter/base/BaseViewHolder;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "(Ljava/util/List;)V", "convert", "", "helper", "item", "ccm-widget_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.widgets.popupmenu.a */
public final class PopupMenuAdapter extends BaseQuickAdapter<PopupMenuItem, C20923c> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PopupMenuAdapter(List<PopupMenuItem> list) {
        super(R.layout.widget_popup_menu_item, list);
        Intrinsics.checkParameterIsNotNull(list, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16806a(C20923c cVar, PopupMenuItem bVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "helper");
        Intrinsics.checkParameterIsNotNull(bVar, "item");
        TextView textView = (TextView) cVar.mo70740b(R.id.widget_menu_name);
        ((ImageView) cVar.mo70740b(R.id.widget_menu_img)).setImageResource(bVar.mo45477b());
        Intrinsics.checkExpressionValueIsNotNull(textView, "tvName");
        textView.setText(bVar.mo45476a());
    }
}
