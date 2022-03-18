package com.ss.android.lark.setting.page.content.general.correction;

import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.lark.setting.C54115c;
import com.ss.android.lark.setting.service.usersetting.p2674b.C54655a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/setting/page/content/general/correction/CorrectionSettingComponent;", "", "mLifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "(Landroidx/lifecycle/LifecycleOwner;)V", "mView", "Lcom/ss/android/lark/setting/page/content/general/correction/CorrectionView;", "mViewModel", "Lcom/ss/android/lark/setting/page/content/general/correction/CorrectionViewModel;", "init", "", "viewGroup", "Landroid/view/ViewGroup;", "unInit", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.setting.page.content.general.correction.a */
public final class CorrectionSettingComponent {

    /* renamed from: a */
    private final CorrectionView f134638a = new CorrectionView();

    /* renamed from: b */
    private final CorrectionViewModel f134639b;

    /* renamed from: c */
    private final LifecycleOwner f134640c;

    public CorrectionSettingComponent(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "mLifecycleOwner");
        this.f134640c = lifecycleOwner;
        C54655a a = C54655a.m212173a();
        Intrinsics.checkExpressionValueIsNotNull(a, "ASSettingServiceImpl.inst()");
        this.f134639b = new CorrectionViewModel(a);
    }

    /* renamed from: a */
    public final void mo186098a(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "viewGroup");
        if (!C54115c.m210080a().mo178308t().mo178315a()) {
            viewGroup.setVisibility(8);
        }
        this.f134638a.mo186095a(this.f134639b, viewGroup, this.f134640c);
        this.f134639b.init();
    }
}
