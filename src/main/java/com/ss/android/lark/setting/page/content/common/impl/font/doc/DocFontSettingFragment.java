package com.ss.android.lark.setting.page.content.common.impl.font.doc;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.larksuite.component.ui.display.manager.C25649b;
import com.larksuite.component.ui.display.manager.LarkFont;
import com.larksuite.component.ui.display.manager.ZoomLevel;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.setting.page.content.common.impl.font.FontSettingFragment;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J&\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001a\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/setting/page/content/common/impl/font/doc/DocFontSettingFragment;", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "Lcom/ss/android/lark/setting/page/content/common/impl/font/FontSettingFragment$OnFontSettingViewSlideListener;", "()V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onSlideListener", "", "zoomLevel", "Lcom/larksuite/component/ui/display/manager/ZoomLevel;", "onViewCreated", "view", "updateView", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.setting.page.content.common.impl.font.b.a */
public final class DocFontSettingFragment extends BaseFragment implements FontSettingFragment.OnFontSettingViewSlideListener {

    /* renamed from: a */
    private HashMap f134142a;

    /* renamed from: a */
    public View mo185453a(int i) {
        if (this.f134142a == null) {
            this.f134142a = new HashMap();
        }
        View view = (View) this.f134142a.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f134142a.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public void mo185454a() {
        HashMap hashMap = this.f134142a;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo185454a();
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.font.FontSettingFragment.OnFontSettingViewSlideListener
    /* renamed from: a */
    public void mo185442a(ZoomLevel zoomLevel) {
        Intrinsics.checkParameterIsNotNull(zoomLevel, "zoomLevel");
        m210353b(zoomLevel);
    }

    /* renamed from: b */
    private final void m210353b(ZoomLevel zoomLevel) {
        TextView textView = (TextView) mo185453a(R.id.text_title);
        Intrinsics.checkExpressionValueIsNotNull(textView, "text_title");
        C25649b.m91858a(textView, LarkFont.TITLE0, zoomLevel);
        TextView textView2 = (TextView) mo185453a(R.id.text_explain);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "text_explain");
        C25649b.m91858a(textView2, LarkFont.BODY0, zoomLevel);
        ImageView imageView = (ImageView) mo185453a(R.id.dot_above);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "dot_above");
        C25649b.m91855a(imageView, 16, zoomLevel);
        TextView textView3 = (TextView) mo185453a(R.id.text_preview);
        Intrinsics.checkExpressionValueIsNotNull(textView3, "text_preview");
        C25649b.m91858a(textView3, LarkFont.BODY0, zoomLevel);
        ImageView imageView2 = (ImageView) mo185453a(R.id.dot_below);
        Intrinsics.checkExpressionValueIsNotNull(imageView2, "dot_below");
        C25649b.m91855a(imageView2, 16, zoomLevel);
        TextView textView4 = (TextView) mo185453a(R.id.text_preview_another);
        Intrinsics.checkExpressionValueIsNotNull(textView4, "text_preview_another");
        C25649b.m91858a(textView4, LarkFont.BODY0, zoomLevel);
        ImageView imageView3 = (ImageView) mo185453a(R.id.image_welcome);
        Intrinsics.checkExpressionValueIsNotNull(imageView3, "image_welcome");
        C25649b.m91855a(imageView3, 24, zoomLevel);
        TextView textView5 = (TextView) mo185453a(R.id.text_welcome);
        Intrinsics.checkExpressionValueIsNotNull(textView5, "text_welcome");
        C25649b.m91858a(textView5, LarkFont.BODY0, zoomLevel);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        m210353b(FontSettingFragment.f134120e.mo185440a());
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.activity_doc_font_setting, viewGroup, false);
    }
}
