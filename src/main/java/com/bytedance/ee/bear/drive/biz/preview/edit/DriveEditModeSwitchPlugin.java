package com.bytedance.ee.bear.drive.biz.preview.edit;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.BasePlugin;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.drive.common.p342b.C6891a;
import com.bytedance.ee.bear.drive.core.DrivePluginHost;
import com.bytedance.ee.bear.widgets.button.CommonEditButton;
import com.bytedance.ee.log.C13479a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0018\u0010\u000b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0016J\u0006\u0010\u000f\u001a\u00020\u0007R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/preview/edit/DriveEditModeSwitchPlugin;", "Lcom/bytedance/ee/bear/browser/plugin/BasePlugin;", "Lcom/bytedance/ee/bear/drive/core/DrivePluginHost;", "()V", "mEditModeSwitchView", "Lcom/bytedance/ee/bear/widgets/button/CommonEditButton;", "hideButton", "", "observeEditSwitchActive", "host", "onAttachToHost", "onAttachToUIContainer", "uiContainer", "Lcom/bytedance/ee/bear/browser/plugin/UIContainer;", "onDetachFromUIContainer", "showButton", "Companion", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DriveEditModeSwitchPlugin extends BasePlugin<DrivePluginHost> {
    public static final Companion Companion = new Companion(null);
    private CommonEditButton mEditModeSwitchView;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/preview/edit/DriveEditModeSwitchPlugin$Companion;", "", "()V", "TAG", "", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.edit.DriveEditModeSwitchPlugin$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final void hideButton() {
        CommonEditButton commonEditButton = this.mEditModeSwitchView;
        if (commonEditButton != null && commonEditButton.getVisibility() == 0) {
            C13479a.m54764b("DriveEditModeSwitchPlugin", "hide button");
            CommonEditButton commonEditButton2 = this.mEditModeSwitchView;
            if (commonEditButton2 != null) {
                commonEditButton2.setVisibility(8);
            }
        }
    }

    public final void showButton() {
        CommonEditButton commonEditButton = this.mEditModeSwitchView;
        if (commonEditButton != null && commonEditButton.getVisibility() == 8) {
            C13479a.m54764b("DriveEditModeSwitchPlugin", "show button");
            CommonEditButton commonEditButton2 = this.mEditModeSwitchView;
            if (commonEditButton2 != null) {
                commonEditButton2.setVisibility(0);
            }
        }
    }

    public void onAttachToHost(DrivePluginHost aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "host");
        super.onAttachToHost((C4943e) aVar);
        observeEditSwitchActive(aVar);
    }

    private final void observeEditSwitchActive(DrivePluginHost aVar) {
        C6891a.m27236d(aVar).liveInnerEditModeSwitchActive().mo5923a(getLifecycleOwner(), new C6566b(this, aVar));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "visible", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.edit.DriveEditModeSwitchPlugin$b */
    public static final class C6566b<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ DriveEditModeSwitchPlugin f18052a;

        /* renamed from: b */
        final /* synthetic */ DrivePluginHost f18053b;

        C6566b(DriveEditModeSwitchPlugin driveEditModeSwitchPlugin, DrivePluginHost aVar) {
            this.f18052a = driveEditModeSwitchPlugin;
            this.f18053b = aVar;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            C13479a.m54764b("DriveEditModeSwitchPlugin", "switch edit mode: " + bool);
            Intrinsics.checkExpressionValueIsNotNull(bool, "visible");
            if (bool.booleanValue()) {
                C6891a.m27229a(this.f18053b).mo27954e(this.f18053b.mo27261l().getFileModel());
                this.f18052a.showButton();
                return;
            }
            this.f18052a.hideButton();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/bytedance/ee/bear/drive/biz/preview/edit/DriveEditModeSwitchPlugin$onAttachToUIContainer$1$1"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.edit.DriveEditModeSwitchPlugin$c */
    public static final class View$OnClickListenerC6567c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DrivePluginHost f18054a;

        View$OnClickListenerC6567c(DrivePluginHost aVar) {
            this.f18054a = aVar;
        }

        public final void onClick(View view) {
            C13479a.m54764b("DriveEditModeSwitchPlugin", "click button enter edit mode");
            C6891a.m27229a(this.f18054a).mo27941c(this.f18054a.mo27261l().getFileModel(), "edit", "none");
            C6891a.m27236d(this.f18054a).liveInnerEditModeSwitchAction().mo5926a((Integer) 1);
        }
    }

    public void onAttachToUIContainer(DrivePluginHost aVar, AbstractC4958n nVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "host");
        Intrinsics.checkParameterIsNotNull(nVar, "uiContainer");
        super.onAttachToUIContainer((C4943e) aVar, nVar);
        if (this.mEditModeSwitchView == null) {
            Context context = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            CommonEditButton commonEditButton = new CommonEditButton(context, null, 0, 0, 14, null);
            commonEditButton.setOnClickListener(new View$OnClickListenerC6567c(aVar));
            this.mEditModeSwitchView = commonEditButton;
            nVar.mo19588a(this, commonEditButton);
        }
    }

    public void onDetachFromUIContainer(DrivePluginHost aVar, AbstractC4958n nVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "host");
        Intrinsics.checkParameterIsNotNull(nVar, "uiContainer");
        super.onDetachFromUIContainer((C4943e) aVar, nVar);
        CommonEditButton commonEditButton = this.mEditModeSwitchView;
        if (commonEditButton != null) {
            nVar.mo19594b(this, commonEditButton);
            this.mEditModeSwitchView = null;
        }
    }
}
