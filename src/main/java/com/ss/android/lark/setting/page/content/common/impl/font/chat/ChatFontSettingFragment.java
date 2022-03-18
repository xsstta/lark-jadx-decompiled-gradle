package com.ss.android.lark.setting.page.content.common.impl.font.chat;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.larksuite.component.ui.display.manager.ZoomLevel;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.setting.page.content.common.impl.font.FontSettingFragment;
import com.ss.android.lark.setting.page.content.common.impl.font.FontSizeSettingHitPoint;
import com.ss.android.lark.setting.page.content.common.impl.font.chat.IChatFontSettingContract;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0002J&\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/setting/page/content/common/impl/font/chat/ChatFontSettingFragment;", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "Lcom/ss/android/lark/setting/page/content/common/impl/font/FontSettingFragment$OnFontSettingViewSlideListener;", "()V", "mRootView", "Landroid/view/View;", "view", "Lcom/ss/android/lark/setting/page/content/common/impl/font/chat/IChatFontSettingContract$IView;", "initMVP", "", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onSlideListener", "zoomLevel", "Lcom/larksuite/component/ui/display/manager/ZoomLevel;", "onViewCreated", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.setting.page.content.common.impl.font.a.a */
public final class ChatFontSettingFragment extends BaseFragment implements FontSettingFragment.OnFontSettingViewSlideListener {

    /* renamed from: a */
    private View f134131a;

    /* renamed from: b */
    private IChatFontSettingContract.IView f134132b;

    /* renamed from: c */
    private HashMap f134133c;

    /* renamed from: a */
    public void mo185445a() {
        HashMap hashMap = this.f134133c;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo185445a();
    }

    /* renamed from: b */
    private final void m210338b() {
        ChatFontSettingModel bVar = new ChatFontSettingModel();
        Context context = this.mContext;
        Intrinsics.checkExpressionValueIsNotNull(context, "this.mContext");
        View view = this.f134131a;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        ChatFontSettingView dVar = new ChatFontSettingView(context, view);
        this.f134132b = dVar;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("view");
        }
        new ChatFontSettingPresenter(bVar, dVar).create();
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.font.FontSettingFragment.OnFontSettingViewSlideListener
    /* renamed from: a */
    public void mo185442a(ZoomLevel zoomLevel) {
        Intrinsics.checkParameterIsNotNull(zoomLevel, "zoomLevel");
        IChatFontSettingContract.IView bVar = this.f134132b;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("view");
        }
        bVar.mo185450a(zoomLevel);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        m210338b();
        FontSizeSettingHitPoint.f134143a.mo185459c();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.activity_chat_font_setting, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "inflater.inflate(R.layou…etting, container, false)");
        this.f134131a = inflate;
        if (inflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        return inflate;
    }
}
