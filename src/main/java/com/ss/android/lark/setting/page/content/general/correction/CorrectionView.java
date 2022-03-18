package com.ss.android.lark.setting.page.content.general.correction;

import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.LifecycleOwner;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.larksuite.component.ui.button.LKUISwitchButton;
import com.ss.android.lark.pb.ai.CorrectionSetting;
import com.ss.android.lark.pb.ai.SceneSetting;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0018\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/setting/page/content/general/correction/CorrectionView;", "", "()V", "mSwitchHeaderAll", "Lcom/larksuite/component/ui/button/LKUISwitchButton;", "getMSwitchHeaderAll", "()Lcom/larksuite/component/ui/button/LKUISwitchButton;", "setMSwitchHeaderAll", "(Lcom/larksuite/component/ui/button/LKUISwitchButton;)V", "init", "", "viewModel", "Lcom/ss/android/lark/setting/page/content/general/correction/CorrectionViewModel;", "view", "Landroid/view/ViewGroup;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "setup", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class CorrectionView {
    @BindView(7578)
    public LKUISwitchButton mSwitchHeaderAll;

    /* renamed from: a */
    public final LKUISwitchButton mo186094a() {
        LKUISwitchButton lKUISwitchButton = this.mSwitchHeaderAll;
        if (lKUISwitchButton == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSwitchHeaderAll");
        }
        return lKUISwitchButton;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/pb/ai/CorrectionSetting;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.general.correction.CorrectionView$a */
    public static final class C54439a<T> implements AbstractC1178x<CorrectionSetting> {

        /* renamed from: a */
        final /* synthetic */ CorrectionView f134635a;

        C54439a(CorrectionView correctionView) {
            this.f134635a = correctionView;
        }

        /* renamed from: a */
        public final void onChanged(CorrectionSetting correctionSetting) {
            boolean z;
            Boolean bool;
            LKUISwitchButton a = this.f134635a.mo186094a();
            SceneSetting sceneSetting = correctionSetting.mmessenger_setting;
            if (sceneSetting == null || (bool = sceneSetting.mis_enabled) == null) {
                z = false;
            } else {
                z = bool.booleanValue();
            }
            a.setCheckedImmediatelyNoEvent(z);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "isChecked", "", "onCheckedChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.general.correction.CorrectionView$b */
    public static final class C54440b implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ CorrectionViewModel f134636a;

        C54440b(CorrectionViewModel bVar) {
            this.f134636a = bVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            CorrectionSetting.C49441a aVar = new CorrectionSetting.C49441a();
            aVar.mo172524a(new SceneSetting(Boolean.valueOf(z)));
            CorrectionViewModel bVar = this.f134636a;
            CorrectionSetting a = aVar.build();
            Intrinsics.checkExpressionValueIsNotNull(a, "builder.build()");
            bVar.setCorrectionSetting(a);
        }
    }

    /* renamed from: a */
    private final void m211289a(CorrectionViewModel bVar, LifecycleOwner lifecycleOwner) {
        bVar.getFeatureSetting().mo5923a(lifecycleOwner, new C54439a(this));
        LKUISwitchButton lKUISwitchButton = this.mSwitchHeaderAll;
        if (lKUISwitchButton == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSwitchHeaderAll");
        }
        lKUISwitchButton.setOnCheckedChangeListener(new C54440b(bVar));
    }

    /* renamed from: a */
    public final void mo186095a(CorrectionViewModel bVar, ViewGroup viewGroup, LifecycleOwner lifecycleOwner) {
        Intrinsics.checkParameterIsNotNull(bVar, "viewModel");
        Intrinsics.checkParameterIsNotNull(viewGroup, "view");
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "lifecycleOwner");
        ButterKnife.bind(this, viewGroup);
        m211289a(bVar, lifecycleOwner);
    }
}
