package com.ss.android.lark.ug.banner.ui.template;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/ug/banner/ui/template/TemplateItemViewV2;", "Lcom/ss/android/lark/ug/banner/ui/template/BaseTemplateItemView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "onCreateView", "", "ug-banner-ui_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.ug.banner.ui.template.g */
public final class TemplateItemViewV2 extends BaseTemplateItemView {
    @Override // com.ss.android.lark.ug.banner.ui.template.BaseTemplateItemView
    /* renamed from: a */
    public void mo194644a() {
        LayoutInflater.from(getContext()).inflate(R.layout.ug_banner_template_item_2, (ViewGroup) this, true);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TemplateItemViewV2(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }
}
