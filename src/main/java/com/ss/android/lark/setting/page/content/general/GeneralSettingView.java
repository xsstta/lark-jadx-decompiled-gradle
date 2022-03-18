package com.ss.android.lark.setting.page.content.general;

import ai.v1.MobileComposerSetting;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import butterknife.BindView;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.featuregating.p1846c.AbstractC37250a;
import com.ss.android.lark.permission.AbstractC51324c;
import com.ss.android.lark.setting.C54115c;
import com.ss.android.lark.setting.dependency.ISettingDependency;
import com.ss.android.lark.setting.page.content.general.IGeneralSettingContract;
import com.ss.android.lark.setting.page.statistics.SettingHitPoint;
import com.ss.android.lark.setting.page.v1.view.SwitchButtonWithLoading;
import com.ss.android.lark.ui.CommonTitleBar;

public class GeneralSettingView implements IGeneralSettingContract.AbstractC54432b {

    /* renamed from: a */
    public final Context f134609a;

    /* renamed from: b */
    public AbstractC54429a f134610b;

    /* renamed from: c */
    public IGeneralSettingContract.AbstractC54432b.AbstractC54433a f134611c;

    /* renamed from: d */
    private final AbstractC37250a f134612d;

    /* renamed from: e */
    private final ISettingDependency.IFeatureConfigDependency f134613e = C54115c.m210080a().mo178296h();

    /* renamed from: f */
    private SwitchButtonWithLoading.AbstractC54589a f134614f;

    /* renamed from: g */
    private UDCheckBox.OnCheckedChangeListener f134615g;

    /* renamed from: h */
    private final boolean f134616h;
    @BindView(6597)
    SwitchButtonWithLoading mAutoAudio2TextSwitcher;
    @BindView(6569)
    View mAutoAudio2TextView;
    @BindView(6815)
    TextView mDesktopTitleBar;
    @BindView(7342)
    View mMessagesFilterCl;
    @BindView(6971)
    View mMessagesFilterContainer;
    @BindView(6795)
    View mPersonalStatusContainer;
    @BindView(7738)
    UDCheckBox mSmartActionCb;
    @BindView(7739)
    View mSmartActionContainer;
    @BindView(7743)
    SwitchButtonWithLoading mSmartComposeBoxSwitcher;
    @BindView(7740)
    View mSmartComposeContainer;
    @BindView(7744)
    UDCheckBox mSmartComposeDocCb;
    @BindView(7746)
    UDCheckBox mSmartComposeMailCb;
    @BindView(7748)
    UDCheckBox mSmartComposeMessageCb;
    @BindView(7755)
    SwitchButtonWithLoading mSmartReplyBoxSwitcher;
    @BindView(7752)
    View mSmartReplyContainer;
    @BindView(7912)
    CommonTitleBar mTitleBar;
    @BindView(8040)
    View mUrgentDetectContainer;
    @BindView(8042)
    SwitchButtonWithLoading mUrgentNumberSaveSwitcher;
    @BindView(8143)
    View mWhenIViewAChatContainer;
    @BindView(6602)
    SwitchButtonWithLoading mWorkoutLeaveSwitcher;
    @BindView(8150)
    View mWorkoutLeaveView;

    /* renamed from: com.ss.android.lark.setting.page.content.general.GeneralSettingView$a */
    public interface AbstractC54429a {
        /* renamed from: a */
        void mo186084a(AbstractC51324c cVar);

        /* renamed from: a */
        void mo186085a(GeneralSettingView generalSettingView);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f134611c = null;
        this.f134610b = null;
    }

    /* renamed from: b */
    private void m211254b() {
        boolean z;
        SwitchButtonWithLoading switchButtonWithLoading = this.mSmartComposeBoxSwitcher;
        if (this.mSmartComposeMailCb.isChecked() || this.mSmartComposeDocCb.isChecked() || this.mSmartComposeMessageCb.isChecked()) {
            z = true;
        } else {
            z = false;
        }
        switchButtonWithLoading.mo186487a(z);
    }

    /* renamed from: a */
    public void mo186077a() {
        if (!DesktopUtil.m144301a(this.f134609a)) {
            this.mTitleBar.setVisibility(0);
            this.mDesktopTitleBar.setVisibility(8);
            return;
        }
        this.mTitleBar.setVisibility(8);
        this.mDesktopTitleBar.setVisibility(0);
        this.mDesktopTitleBar.setText(R.string.Lark_NewSettings_Efficiency);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        int i;
        int i2;
        int i3;
        boolean z;
        int i4;
        this.f134610b.mo186085a(this);
        mo186077a();
        View view = this.mAutoAudio2TextView;
        int i5 = 8;
        if (this.f134613e.mo178335b()) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
        this.mAutoAudio2TextSwitcher.setOnSwitchListener(new SwitchButtonWithLoading.AbstractC54589a() {
            /* class com.ss.android.lark.setting.page.content.general.$$Lambda$GeneralSettingView$TcewnYI8Y3hIk9Oc2SnusbrzbhY */

            @Override // com.ss.android.lark.setting.page.v1.view.SwitchButtonWithLoading.AbstractC54589a
            public final void onButtonSwitched(boolean z) {
                GeneralSettingView.lambda$TcewnYI8Y3hIk9Oc2SnusbrzbhY(GeneralSettingView.this, z);
            }
        });
        this.mWorkoutLeaveView.setVisibility(0);
        this.mWorkoutLeaveSwitcher.setOnSwitchListener(new SwitchButtonWithLoading.AbstractC54589a() {
            /* class com.ss.android.lark.setting.page.content.general.$$Lambda$GeneralSettingView$EBtmmwZL1cVMR9XvpPTKyMwjmzY */

            @Override // com.ss.android.lark.setting.page.v1.view.SwitchButtonWithLoading.AbstractC54589a
            public final void onButtonSwitched(boolean z) {
                GeneralSettingView.lambda$EBtmmwZL1cVMR9XvpPTKyMwjmzY(GeneralSettingView.this, z);
            }
        });
        this.mPersonalStatusContainer.setVisibility(0);
        this.mPersonalStatusContainer.findViewById(R.id.custom_status_cl).setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.setting.page.content.general.$$Lambda$GeneralSettingView$6fGd2Fq3Hd67NabvIRk6HcsCpbo */

            public final void onClick(View view) {
                GeneralSettingView.lambda$6fGd2Fq3Hd67NabvIRk6HcsCpbo(GeneralSettingView.this, view);
            }
        });
        View view2 = this.mSmartReplyContainer;
        if (C54115c.m210080a().mo178269E()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        view2.setVisibility(i2);
        View view3 = this.mSmartComposeContainer;
        if (C54115c.m210080a().mo178268D()) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        view3.setVisibility(i3);
        boolean A = C54115c.m210080a().mo178265A();
        boolean a = C54115c.m210080a().mo178302n().mo178356a();
        if (!A || a) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            this.mUrgentDetectContainer.setVisibility(8);
        } else {
            this.mUrgentDetectContainer.setVisibility(0);
            C544271 r0 = new SwitchButtonWithLoading.AbstractC54589a() {
                /* class com.ss.android.lark.setting.page.content.general.GeneralSettingView.C544271 */

                @Override // com.ss.android.lark.setting.page.v1.view.SwitchButtonWithLoading.AbstractC54589a
                public void onButtonSwitched(final boolean z) {
                    GeneralSettingView.this.f134610b.mo186084a(new AbstractC51324c() {
                        /* class com.ss.android.lark.setting.page.content.general.GeneralSettingView.C544271.C544281 */

                        @Override // com.ss.android.lark.permission.AbstractC51324c
                        /* renamed from: a */
                        public void mo49823a() {
                            GeneralSettingView.this.f134611c.mo186090c(z);
                        }

                        @Override // com.ss.android.lark.permission.AbstractC51324c
                        /* renamed from: b */
                        public void mo49824b() {
                            UDToast.show(GeneralSettingView.this.f134609a, UIUtils.getString(GeneralSettingView.this.f134609a, R.string.Lark_Legacy_PermissionFailTip));
                            GeneralSettingView.this.mo186080a(false);
                        }
                    });
                    SettingHitPoint.f134851a.mo186396a(z);
                }
            };
            this.f134614f = r0;
            this.mUrgentNumberSaveSwitcher.setOnSwitchListener(r0);
        }
        this.mMessagesFilterCl.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.setting.page.content.general.$$Lambda$GeneralSettingView$HRfJ75PPmkfP71ft3w7wbFBbok */

            public final void onClick(View view) {
                GeneralSettingView.m270973lambda$HRfJ75PPmkfP71ft3w7wbFBbok(GeneralSettingView.this, view);
            }
        });
        View view4 = this.mMessagesFilterContainer;
        if (this.f134612d.mo136952a("lark.feed.filter", false)) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        view4.setVisibility(i4);
        View view5 = this.mWhenIViewAChatContainer;
        if (this.f134612d.mo136955b("im.chat.start.from.which.message", false)) {
            i5 = 0;
        }
        view5.setVisibility(i5);
        this.mWhenIViewAChatContainer.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.setting.page.content.general.$$Lambda$GeneralSettingView$QraHyukG3b0NCrNF4b_AI5flcXE */

            public final void onClick(View view) {
                GeneralSettingView.lambda$QraHyukG3b0NCrNF4b_AI5flcXE(GeneralSettingView.this, view);
            }
        });
    }

    /* renamed from: a */
    public void setViewDelegate(IGeneralSettingContract.AbstractC54432b.AbstractC54433a aVar) {
        this.f134611c = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m211251a(View view) {
        GeneralSettingLauncher.f134644a.mo186112b(this.f134609a);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m211255b(View view) {
        GeneralSettingLauncher.f134644a.mo186111a(this.f134609a, 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m211260e(boolean z) {
        IGeneralSettingContract.AbstractC54432b.AbstractC54433a aVar = this.f134611c;
        if (aVar != null) {
            aVar.mo186087a(z);
        }
        SettingHitPoint.f134851a.mo186398b(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m211257c(View view) {
        C54115c.m210080a().mo178309u().mo178365a(this.f134609a);
        SettingHitPoint.m211619b();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m211259d(boolean z) {
        if (this.f134611c != null) {
            SettingHitPoint.f134851a.mo186400c(!z);
            this.f134611c.mo186089b(z);
        }
    }

    /* renamed from: a */
    public void mo186079a(C54434a aVar) {
        if (aVar != null) {
            this.mAutoAudio2TextSwitcher.mo186487a(aVar.mo186091a());
            this.mWorkoutLeaveSwitcher.mo186487a(aVar.mo186092b());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m211258c(boolean z) {
        IGeneralSettingContract.AbstractC54432b.AbstractC54433a aVar = this.f134611c;
        if (aVar != null) {
            aVar.mo186088a(z, z);
        }
        this.mSmartActionCb.setOnCheckedChangeListener(null);
        this.mSmartActionCb.setChecked(z);
        this.mSmartActionCb.setOnCheckedChangeListener(this.f134615g);
        if (z) {
            this.mSmartActionContainer.setVisibility(0);
        } else {
            this.mSmartActionContainer.setVisibility(8);
        }
        SettingHitPoint.f134851a.mo186402d(z);
    }

    /* renamed from: b */
    public void mo186083b(boolean z) {
        int i;
        View view = this.mWorkoutLeaveView;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }

    /* renamed from: a */
    public void mo186080a(boolean z) {
        this.mUrgentNumberSaveSwitcher.setOnSwitchListener(null);
        this.mUrgentNumberSaveSwitcher.mo186487a(z);
        this.mUrgentNumberSaveSwitcher.setOnSwitchListener(this.f134614f);
    }

    public GeneralSettingView(Context context, AbstractC54429a aVar) {
        AbstractC37250a b = C37239a.m146648b();
        this.f134612d = b;
        this.f134616h = b.mo136951a("lark.core.status.5.0");
        this.f134609a = context;
        this.f134610b = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m211256b(UDCheckBox uDCheckBox, boolean z) {
        this.f134611c.mo186088a(this.mSmartReplyBoxSwitcher.mo186488a(), z);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m211253a(UDCheckBox uDCheckBox, boolean z) {
        if (this.f134611c != null) {
            MobileComposerSetting.C0069a aVar = new MobileComposerSetting.C0069a();
            if (uDCheckBox == this.mSmartComposeMailCb) {
                aVar.f123c = Boolean.valueOf(z);
            } else if (uDCheckBox == this.mSmartComposeDocCb) {
                aVar.f122b = Boolean.valueOf(z);
            } else if (uDCheckBox == this.mSmartComposeMessageCb) {
                aVar.f121a = Boolean.valueOf(z);
            }
            this.f134611c.mo186086a(aVar.build());
        }
        m211254b();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m211252a(UDCheckBox.OnCheckedChangeListener gVar, boolean z) {
        if (!z || (!this.mSmartComposeMessageCb.isChecked() && !this.mSmartComposeDocCb.isChecked() && !this.mSmartComposeMailCb.isChecked())) {
            if (this.f134611c != null) {
                MobileComposerSetting.C0069a aVar = new MobileComposerSetting.C0069a();
                aVar.f123c = Boolean.valueOf(z);
                aVar.f122b = Boolean.valueOf(z);
                aVar.f121a = Boolean.valueOf(z);
                this.f134611c.mo186086a(aVar.build());
            }
            this.mSmartComposeMailCb.setOnCheckedChangeListener(null);
            this.mSmartComposeDocCb.setOnCheckedChangeListener(null);
            this.mSmartComposeMessageCb.setOnCheckedChangeListener(null);
            this.mSmartComposeMailCb.setChecked(z);
            this.mSmartComposeDocCb.setChecked(z);
            this.mSmartComposeMessageCb.setChecked(z);
            this.mSmartComposeMailCb.setOnCheckedChangeListener(gVar);
            this.mSmartComposeDocCb.setOnCheckedChangeListener(gVar);
            this.mSmartComposeMessageCb.setOnCheckedChangeListener(gVar);
        }
    }

    /* renamed from: a */
    public void mo186081a(boolean z, boolean z2) {
        this.f134615g = new UDCheckBox.OnCheckedChangeListener() {
            /* class com.ss.android.lark.setting.page.content.general.$$Lambda$GeneralSettingView$2PSuDqUtqgUf0UpReew_8n6kmZU */

            @Override // com.larksuite.component.universe_design.checkbox.UDCheckBox.OnCheckedChangeListener
            public final void onCheckedChanged(UDCheckBox uDCheckBox, boolean z) {
                GeneralSettingView.lambda$2PSuDqUtqgUf0UpReew_8n6kmZU(GeneralSettingView.this, uDCheckBox, z);
            }
        };
        this.mSmartReplyBoxSwitcher.mo186487a(z);
        if (z) {
            this.mSmartActionContainer.setVisibility(0);
        } else {
            this.mSmartActionContainer.setVisibility(8);
        }
        this.mSmartActionCb.setChecked(z2);
        this.mSmartReplyBoxSwitcher.setOnSwitchListener(new SwitchButtonWithLoading.AbstractC54589a() {
            /* class com.ss.android.lark.setting.page.content.general.$$Lambda$GeneralSettingView$x5ZruN9hKDpRs3mTx3TZOTrq6Tk */

            @Override // com.ss.android.lark.setting.page.v1.view.SwitchButtonWithLoading.AbstractC54589a
            public final void onButtonSwitched(boolean z) {
                GeneralSettingView.lambda$x5ZruN9hKDpRs3mTx3TZOTrq6Tk(GeneralSettingView.this, z);
            }
        });
        this.mSmartActionCb.setOnCheckedChangeListener(this.f134615g);
    }

    /* renamed from: a */
    public void mo186082a(boolean z, boolean z2, boolean z3) {
        boolean z4;
        this.mSmartComposeDocCb.setChecked(z3);
        this.mSmartComposeMailCb.setChecked(z2);
        this.mSmartComposeMessageCb.setChecked(z);
        SwitchButtonWithLoading switchButtonWithLoading = this.mSmartComposeBoxSwitcher;
        if (z3 || z2 || z) {
            z4 = true;
        } else {
            z4 = false;
        }
        switchButtonWithLoading.mo186487a(z4);
        $$Lambda$GeneralSettingView$AmsTm9uDkCba_RjMK86if2g1M8 r2 = new UDCheckBox.OnCheckedChangeListener() {
            /* class com.ss.android.lark.setting.page.content.general.$$Lambda$GeneralSettingView$AmsTm9uDkCba_RjMK86if2g1M8 */

            @Override // com.larksuite.component.universe_design.checkbox.UDCheckBox.OnCheckedChangeListener
            public final void onCheckedChanged(UDCheckBox uDCheckBox, boolean z) {
                GeneralSettingView.m270972lambda$AmsTm9uDkCba_RjMK86if2g1M8(GeneralSettingView.this, uDCheckBox, z);
            }
        };
        this.mSmartComposeMailCb.setOnCheckedChangeListener(r2);
        this.mSmartComposeDocCb.setOnCheckedChangeListener(r2);
        this.mSmartComposeMessageCb.setOnCheckedChangeListener(r2);
        this.mSmartComposeBoxSwitcher.setOnSwitchListener(new SwitchButtonWithLoading.AbstractC54589a(r2) {
            /* class com.ss.android.lark.setting.page.content.general.$$Lambda$GeneralSettingView$SoIeE0Cy30SttfHTWVbp_Ub5VM */
            public final /* synthetic */ UDCheckBox.OnCheckedChangeListener f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.ss.android.lark.setting.page.v1.view.SwitchButtonWithLoading.AbstractC54589a
            public final void onButtonSwitched(boolean z) {
                GeneralSettingView.m270974lambda$SoIeE0Cy30SttfHTWVbp_Ub5VM(GeneralSettingView.this, this.f$1, z);
            }
        });
    }
}
