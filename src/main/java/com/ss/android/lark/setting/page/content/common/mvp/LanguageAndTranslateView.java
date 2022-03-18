package com.ss.android.lark.setting.page.content.common.mvp;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.BindView;
import com.larksuite.component.ui.button.LKUISwitchButton;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.dialog.C25644o;
import com.larksuite.component.ui.display.manager.LKUIDisplayManager;
import com.larksuite.component.universe_design.dialog.UDBaseListDialogBuilder;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.setting.C54115c;
import com.ss.android.lark.setting.dependency.ISettingDependency;
import com.ss.android.lark.setting.page.content.common.impl.font.FontSizeSettingHitPoint;
import com.ss.android.lark.setting.page.content.common.mvp.AbstractC54411a;
import com.ss.android.lark.setting.service.usersetting.appearance.UiModeService;
import com.ss.android.lark.setting.service.usersetting.keyboardsend.KeyboardSendManager;
import com.ss.android.lark.setting.service.usersetting.msgalignmentstyle.AlignMode;
import com.ss.android.lark.setting.service.usersetting.msgalignmentstyle.MessageAlignModeService;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

public class LanguageAndTranslateView implements AbstractC54411a.AbstractC54413b {

    /* renamed from: a */
    public AbstractC54410a f134573a;

    /* renamed from: b */
    public AbstractC54411a.AbstractC54413b.AbstractC54414a f134574b;

    /* renamed from: c */
    public final ISettingDependency.IFeatureGatingDependency f134575c = C54115c.m210080a().mo178291e();

    /* renamed from: d */
    private final Activity f134576d;

    /* renamed from: e */
    private CompoundButton.OnCheckedChangeListener f134577e;

    /* renamed from: f */
    private CompoundButton.OnCheckedChangeListener f134578f;

    /* renamed from: g */
    private CompoundButton.OnCheckedChangeListener f134579g;

    /* renamed from: h */
    private final ISettingDependency.IFeatureConfigDependency f134580h = C54115c.m210080a().mo178296h();
    @BindView(7687)
    View mChatBubbleAlignmentSettingLayout;
    @BindView(6680)
    TextView mChatBubbleAlignmentTips;
    @BindView(6735)
    public TextView mClearCacheLanguageTV;
    @BindView(6815)
    TextView mDesktopTitleBar;
    @BindView(7690)
    View mDisplayAppearanceLayout;
    @BindView(6847)
    TextView mDisplayAppearanceModeTip;
    @BindView(6849)
    View mDisplayLayout;
    @BindView(6730)
    ConstraintLayout mEnterSendLayout;
    @BindView(6924)
    LKUISwitchButton mEnterSendSwitchButton;
    @BindView(7193)
    View mFontSettingLayout;
    @BindView(7004)
    TextView mFontSizeTitleDesc;
    @BindView(7712)
    View mSettingTranslateLayout;
    @BindView(7714)
    View mSettingWrittenLanguageLayout;
    @BindView(7815)
    LKUISwitchButton mSwitchButton;
    @BindView(7912)
    CommonTitleBar mTitleBar;
    @BindView(7877)
    TextView mTranslateSettingTV;
    @BindView(6732)
    ConstraintLayout simpleConstraintLayout;
    @BindView(7726)
    TextView simpleModeTitleDescView;
    @BindView(7727)
    LKUISwitchButton simpleSwitchButton;

    /* renamed from: com.ss.android.lark.setting.page.content.common.mvp.LanguageAndTranslateView$a */
    public interface AbstractC54410a {
        /* renamed from: a */
        void mo185353a();

        /* renamed from: a */
        void mo185354a(LanguageAndTranslateView languageAndTranslateView);

        /* renamed from: a */
        void mo185355a(boolean z, String str);

        /* renamed from: b */
        void mo185356b();

        /* renamed from: c */
        void mo185357c();

        /* renamed from: d */
        void mo185358d();

        /* renamed from: e */
        void mo185359e();

        /* renamed from: f */
        void mo185360f();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f134574b = null;
        this.f134573a = null;
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f134573a.mo185354a(this);
        m211180d();
    }

    /* renamed from: e */
    private void m211181e() {
        if (C54115c.m210080a().mo178307s().mo178375a()) {
            this.simpleConstraintLayout.setVisibility(0);
            this.simpleModeTitleDescView.setText(UIHelper.mustacheFormat((int) R.string.Lark_Settings_BasicModeDesc));
            $$Lambda$LanguageAndTranslateView$GO3yUbBAWut_XHyV7JLHnIwdTg r0 = new CompoundButton.OnCheckedChangeListener() {
                /* class com.ss.android.lark.setting.page.content.common.mvp.$$Lambda$LanguageAndTranslateView$GO3yUbBAWut_XHyV7JLHnIwdTg */

                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    LanguageAndTranslateView.this.m211177b((LanguageAndTranslateView) compoundButton, (CompoundButton) z);
                }
            };
            this.f134578f = r0;
            this.simpleSwitchButton.setOnCheckedChangeListener(r0);
            this.simpleSwitchButton.setChecked(false);
        }
    }

    /* renamed from: f */
    private void m211182f() {
        if (KeyboardSendManager.f135088a.mo186784a()) {
            this.mEnterSendLayout.setVisibility(0);
            $$Lambda$LanguageAndTranslateView$BBSzamks2cSKWhr1JMyQLrMksA r0 = $$Lambda$LanguageAndTranslateView$BBSzamks2cSKWhr1JMyQLrMksA.INSTANCE;
            this.f134579g = r0;
            this.mEnterSendSwitchButton.setOnCheckedChangeListener(r0);
            this.mEnterSendSwitchButton.setChecked(KeyboardSendManager.f135088a.mo186785b());
        }
    }

    /* renamed from: g */
    private void m211183g() {
        if (!DesktopUtil.m144301a((Context) this.f134576d)) {
            this.mTitleBar.setVisibility(0);
            this.mDesktopTitleBar.setVisibility(8);
            return;
        }
        this.mTitleBar.setVisibility(8);
        this.mDesktopTitleBar.setVisibility(0);
        this.mDesktopTitleBar.setText(R.string.Lark_NewSettings_GeneralMobile);
    }

    /* renamed from: h */
    private boolean m211184h() {
        if (!MessageAlignModeService.f135136a.mo186840b()) {
            this.mChatBubbleAlignmentSettingLayout.setVisibility(8);
            return false;
        }
        this.mChatBubbleAlignmentSettingLayout.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.setting.page.content.common.mvp.$$Lambda$LanguageAndTranslateView$GuSMavkFkgpMIKQTEWPzUUvfb9U */

            public final void onClick(View view) {
                LanguageAndTranslateView.this.m211176b((LanguageAndTranslateView) view);
            }
        });
        mo186034a(MessageAlignModeService.f135136a.mo186841c());
        return true;
    }

    @Override // com.ss.android.lark.setting.page.content.common.mvp.AbstractC54411a.AbstractC54413b
    /* renamed from: a */
    public void mo186031a() {
        this.mClearCacheLanguageTV.setText(R.string.Lark_Settings_CacheDeleting);
    }

    /* renamed from: b */
    public void mo186037b() {
        this.mClearCacheLanguageTV.setVisibility(0);
        this.mClearCacheLanguageTV.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.setting.page.content.common.mvp.LanguageAndTranslateView.C544086 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                LanguageAndTranslateView.this.mo186039c();
            }
        });
        mo186038b(this.f134576d.getString(R.string.Lark_Legacy_MineSettingCalculate));
    }

    /* renamed from: i */
    private boolean m211185i() {
        boolean c = C54115c.m210080a().mo178288c("lark.core.dark_mode_android_overall");
        boolean c2 = UiModeService.f135042b.mo186696c();
        if (!c || !c2) {
            this.mDisplayAppearanceLayout.setVisibility(8);
            return false;
        }
        this.mDisplayAppearanceLayout.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.setting.page.content.common.mvp.$$Lambda$LanguageAndTranslateView$Diyf_EgMrTn5EfVvWwF2npvGWGk */

            public final void onClick(View view) {
                LanguageAndTranslateView.this.m211173a((LanguageAndTranslateView) view);
            }
        });
        int d = UiModeService.f135042b.mo186697d();
        int i = R.string.Lark_Settings_DisplayFollowSystem;
        if (d != 0) {
            if (d == 1) {
                i = R.string.Lark_Settings_DisplayDark;
            } else if (d == 2) {
                i = R.string.Lark_Settings_DisplayLight;
            }
        }
        this.mDisplayAppearanceModeTip.setText(i);
        return true;
    }

    /* renamed from: d */
    private void m211180d() {
        m211183g();
        int i = 0;
        if (LKUIDisplayManager.m91879b() && !DesktopUtil.m144307b()) {
            this.mFontSettingLayout.setVisibility(0);
            this.mFontSizeTitleDesc.setVisibility(0);
        }
        this.mSettingWrittenLanguageLayout.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.setting.page.content.common.mvp.LanguageAndTranslateView.View$OnClickListenerC544031 */

            public void onClick(View view) {
                LanguageAndTranslateView.this.f134573a.mo185353a();
            }
        });
        String string = UIHelper.getString(R.string.Lark_NewSettings_ContentTranslationMobile);
        TextView textView = this.mTranslateSettingTV;
        if (!this.f134575c.mo178337a("auto.translation")) {
            string = UIHelper.getString(R.string.Lark_Legacy_MineSettingTranslateLanguage);
        }
        textView.setText(string);
        View view = this.mSettingTranslateLayout;
        if (!this.f134580h.mo178334a()) {
            i = 8;
        }
        view.setVisibility(i);
        this.mSettingTranslateLayout.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.setting.page.content.common.mvp.LanguageAndTranslateView.View$OnClickListenerC544042 */

            public void onClick(View view) {
                if (LanguageAndTranslateView.this.f134575c.mo178337a("auto.translation")) {
                    LanguageAndTranslateView.this.f134573a.mo185356b();
                } else {
                    LanguageAndTranslateView.this.f134573a.mo185357c();
                }
            }
        });
        C544053 r0 = new CompoundButton.OnCheckedChangeListener() {
            /* class com.ss.android.lark.setting.page.content.common.mvp.LanguageAndTranslateView.C544053 */

            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                LanguageAndTranslateView.this.f134574b.mo186050a(z);
            }
        };
        this.f134577e = r0;
        this.mSwitchButton.setOnCheckedChangeListener(r0);
        m211181e();
        m211182f();
        this.mFontSettingLayout.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.setting.page.content.common.mvp.LanguageAndTranslateView.C544064 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                LanguageAndTranslateView.this.f134573a.mo185360f();
                FontSizeSettingHitPoint.f134143a.mo185458b();
            }
        });
        boolean i2 = m211185i();
        boolean h = m211184h();
        if (!i2 && !h) {
            this.mDisplayLayout.setVisibility(8);
        }
        mo186037b();
    }

    /* renamed from: c */
    public void mo186039c() {
        String string = this.f134576d.getString(R.string.Lark_NewSettings_ClearCacheConfirmDescription);
        if (DesktopUtil.m144301a((Context) this.f134576d)) {
            C25639g gVar = new C25639g(this.f134576d);
            gVar.mo89242c(string).mo89222a(440.0f).mo89224a(R.id.lkui_dialog_btn_left, R.string.Lark_Legacy_Cancel, $$Lambda$LanguageAndTranslateView$YnhrBPN0WBT5hh2ZbNzJNSfSQec.INSTANCE).mo89229a(new C25639g.C25640a().mo89266a(R.id.lkui_dialog_btn_right).mo89269b(R.string.Lark_Legacy_ClearConfirm).mo89271d(R.color.function_danger_500).mo89267a(new DialogInterface.OnClickListener() {
                /* class com.ss.android.lark.setting.page.content.common.mvp.$$Lambda$LanguageAndTranslateView$AHhxKc3butCslcQgzHgNlkXV6T8 */

                public final void onClick(DialogInterface dialogInterface, int i) {
                    LanguageAndTranslateView.this.m211179c(dialogInterface, i);
                }
            })).mo89239c();
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new UDBaseListDialogBuilder.ListItemBuilder(this.f134576d.getString(R.string.Lark_Legacy_ClearConfirm)).mo90888b(R.color.function_danger_500).mo90889c());
        ((C25644o) ((C25644o) ((C25644o) ((C25644o) ((C25644o) ((C25644o) ((C25644o) new C25644o(this.f134576d).mo89237b(string)).mo89251j(3)).mo89250i(R.color.text_caption)).mo89249h(14)).mo89208b(arrayList)).mo89290y(0).mo89202a(new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.setting.page.content.common.mvp.$$Lambda$LanguageAndTranslateView$Wv0nWhwMq7dbn4KGmzJglnEAjxY */

            public final void onClick(DialogInterface dialogInterface, int i) {
                LanguageAndTranslateView.this.m211172a((LanguageAndTranslateView) dialogInterface, (DialogInterface) i);
            }
        })).mo89225a(R.id.lkui_dialog_btn_cancel, this.f134576d.getString(R.string.Lark_Legacy_Cancel), new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.setting.page.content.common.mvp.LanguageAndTranslateView.DialogInterface$OnClickListenerC544097 */

            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        })).mo89239c();
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC54411a.AbstractC54413b.AbstractC54414a aVar) {
        this.f134574b = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m211173a(View view) {
        this.f134573a.mo185358d();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m211176b(View view) {
        this.f134573a.mo185359e();
    }

    /* renamed from: b */
    private void m211178b(boolean z) {
        if (z) {
            C54115c.m210080a().mo178307s().mo178374a(this.f134576d, new Function1<Boolean, Unit>() {
                /* class com.ss.android.lark.setting.page.content.common.mvp.LanguageAndTranslateView.C544075 */

                /* renamed from: a */
                public Unit invoke(Boolean bool) {
                    if (bool.booleanValue()) {
                        return null;
                    }
                    LanguageAndTranslateView.this.simpleSwitchButton.setChecked(false);
                    return null;
                }
            });
        }
    }

    @Override // com.ss.android.lark.setting.page.content.common.mvp.AbstractC54411a.AbstractC54413b
    /* renamed from: a */
    public void mo186032a(InitData initData) {
        mo186036a(initData.is24HourTime);
    }

    @Override // com.ss.android.lark.setting.page.content.common.mvp.AbstractC54411a.AbstractC54413b
    /* renamed from: b */
    public void mo186038b(String str) {
        this.mClearCacheLanguageTV.setText(this.f134576d.getString(R.string.Lark_NewSettings_ClearCacheMobile) + " (" + str + ")");
    }

    @Override // com.ss.android.lark.setting.page.content.common.mvp.AbstractC54411a.AbstractC54413b
    /* renamed from: a */
    public void mo186034a(AlignMode alignMode) {
        int i;
        if (alignMode == AlignMode.AlignLeftAndRight) {
            i = R.string.Lark_Settings_MessageAlignLeftAndRight;
        } else {
            i = R.string.Lark_Settings_MessageAlignLeft;
        }
        this.mChatBubbleAlignmentTips.setText(i);
    }

    @Override // com.ss.android.lark.setting.page.content.common.mvp.AbstractC54411a.AbstractC54413b
    /* renamed from: a */
    public void mo186035a(String str) {
        AbstractC54410a aVar = this.f134573a;
        if (aVar != null) {
            aVar.mo185355a(true, str);
        }
    }

    @Override // com.ss.android.lark.setting.page.content.common.mvp.AbstractC54411a.AbstractC54413b
    /* renamed from: a */
    public void mo186036a(boolean z) {
        this.mSwitchButton.setOnCheckedChangeListener(null);
        this.mSwitchButton.setChecked(z);
        this.mSwitchButton.setOnCheckedChangeListener(this.f134577e);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m211179c(DialogInterface dialogInterface, int i) {
        this.f134574b.mo186049a(this.f134576d);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m211172a(DialogInterface dialogInterface, int i) {
        if (i == 0) {
            this.f134574b.mo186049a(this.f134576d);
        }
        dialogInterface.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m211177b(CompoundButton compoundButton, boolean z) {
        m211178b(z);
    }

    public LanguageAndTranslateView(Activity activity, AbstractC54410a aVar) {
        this.f134576d = activity;
        this.f134573a = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m211174a(CompoundButton compoundButton, boolean z) {
        KeyboardSendManager.f135088a.mo186783a(z);
    }
}
