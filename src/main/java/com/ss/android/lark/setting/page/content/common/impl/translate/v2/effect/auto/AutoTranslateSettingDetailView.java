package com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.auto;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.larksuite.component.ui.button.LKUISwitchButton;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.mvp.IView;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.setting.page.content.common.impl.translate.v2.C54307a;
import com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.AbstractC54318a;
import com.ss.android.lark.setting.page.content.common.impl.translate.v2.entity.C54377c;
import com.ss.android.lark.setting.page.content.common.impl.translate.v2.entity.C54378d;
import com.ss.android.lark.setting.page.content.common.statistics.TranslateHitPoint;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.settingitem.SettingItemView;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;

public class AutoTranslateSettingDetailView implements AbstractC54318a.AbstractC54320b<C54378d> {

    /* renamed from: a */
    public final AbstractC54330b f134413a;

    /* renamed from: b */
    public AbstractC54318a.AbstractC54320b.AbstractC54321a f134414b;

    /* renamed from: c */
    public C54378d f134415c;

    /* renamed from: d */
    private final Context f134416d;

    /* renamed from: e */
    private final Map<Integer, C54329a> f134417e = new LinkedHashMap();
    public TextView mDescription;
    public LinearLayout mDetailItemContainer;
    public CommonTitleBar mTitleBar;

    /* renamed from: com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.auto.AutoTranslateSettingDetailView$b */
    public interface AbstractC54330b<H> {
        /* renamed from: a */
        String mo185877a();

        /* renamed from: a */
        void mo185878a(IView iView);

        /* renamed from: b */
        String mo185879b();

        /* renamed from: c */
        void mo185880c();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    /* renamed from: com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.auto.AutoTranslateSettingDetailView$a */
    public static class C54329a {

        /* renamed from: a */
        public String f134419a;

        /* renamed from: b */
        private WeakReference<SettingItemView> f134420b;

        /* renamed from: a */
        public SettingItemView mo185875a() {
            WeakReference<SettingItemView> weakReference = this.f134420b;
            if (weakReference == null) {
                return null;
            }
            return weakReference.get();
        }

        public C54329a(String str) {
            this.f134419a = str;
        }

        /* renamed from: a */
        public void mo185876a(SettingItemView settingItemView) {
            this.f134420b = new WeakReference<>(settingItemView);
        }
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f134413a.mo185878a(this);
        m210925b();
        m210923a();
        this.mTitleBar.setTitle(this.f134413a.mo185877a());
        this.mDescription.setText(this.f134413a.mo185879b());
        this.f134414b.mo185853a();
    }

    /* renamed from: b */
    private void m210925b() {
        this.f134417e.put(Integer.valueOf(C54377c.f134510b), new C54329a(UIHelper.getString(R.string.Lark_Chat_TranslateMessage)));
        this.f134417e.put(Integer.valueOf(C54377c.f134514f), new C54329a(UIHelper.getString(R.string.Lark_Chat_TranslateDocs)));
        if (C54307a.m210866a()) {
            this.f134417e.put(Integer.valueOf(C54377c.f134513e), new C54329a(UIHelper.getString(R.string.Lark_Chat_SetWebAutoTranslate)));
        }
        if (C54307a.m210867b()) {
            this.f134417e.put(Integer.valueOf(C54377c.f134515g), new C54329a(UIHelper.getString(R.string.Mail_Translations_AutoMailSetting)));
        }
    }

    /* renamed from: a */
    private void m210923a() {
        SettingItemView settingItemView;
        if (this.mDetailItemContainer != null) {
            this.mTitleBar.setLeftClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.auto.$$Lambda$AutoTranslateSettingDetailView$3AS8_F4_xJyTwfEjSe_A2315eTs */

                public final void onClick(View view) {
                    AutoTranslateSettingDetailView.lambda$3AS8_F4_xJyTwfEjSe_A2315eTs(AutoTranslateSettingDetailView.this, view);
                }
            });
            LayoutInflater from = LayoutInflater.from(this.f134416d);
            for (Map.Entry<Integer, C54329a> entry : this.f134417e.entrySet()) {
                View inflate = from.inflate(R.layout.item_auto_translate_detail, (ViewGroup) null);
                if (inflate instanceof SettingItemView) {
                    settingItemView = (SettingItemView) inflate;
                } else {
                    settingItemView = (SettingItemView) inflate.findViewById(R.id.item_view);
                }
                if (settingItemView != null) {
                    settingItemView.setTitle(entry.getValue().f134419a);
                    entry.getValue().mo185876a(settingItemView);
                    settingItemView.getRightSwitch().setTag(entry.getKey());
                    settingItemView.getRightSwitch().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                        /* class com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.auto.AutoTranslateSettingDetailView.C543281 */

                        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                            C54378d dVar;
                            if (compoundButton instanceof LKUISwitchButton) {
                                LKUISwitchButton lKUISwitchButton = (LKUISwitchButton) compoundButton;
                                if (AutoTranslateSettingDetailView.this.f134413a != null) {
                                    if (AutoTranslateSettingDetailView.this.f134415c == null) {
                                        dVar = null;
                                    } else {
                                        dVar = AutoTranslateSettingDetailView.this.f134415c.clone();
                                    }
                                    if (dVar != null) {
                                        Object tag = lKUISwitchButton.getTag();
                                        if (tag instanceof Integer) {
                                            Integer num = (Integer) tag;
                                            if (lKUISwitchButton.isChecked()) {
                                                dVar.mo185984a().mo185976c(num.intValue());
                                            } else {
                                                dVar.mo185984a().mo185978d(num.intValue());
                                            }
                                            if (AutoTranslateSettingDetailView.this.f134415c != null) {
                                                TranslateHitPoint.m210262a(num.intValue(), AutoTranslateSettingDetailView.this.f134415c.mo185986c(), AutoTranslateSettingDetailView.this.f134415c.mo185985b(), lKUISwitchButton.isChecked());
                                            }
                                        }
                                        AutoTranslateSettingDetailView.this.f134414b.mo185854a(dVar);
                                    }
                                }
                            }
                        }
                    });
                    settingItemView.setOnClickListener(null);
                    if (DesktopUtil.m144301a(this.f134416d)) {
                        this.mDetailItemContainer.addView(settingItemView, -1, UIHelper.dp2px(48.0f));
                    } else {
                        this.mDetailItemContainer.addView(settingItemView);
                    }
                }
            }
            DesktopUtil.m144306b(this.mDescription);
        }
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC54318a.AbstractC54320b.AbstractC54321a aVar) {
        this.f134414b = aVar;
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m210924a(View view) {
        this.f134413a.mo185880c();
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.AbstractC54318a.AbstractC54320b
    /* renamed from: a */
    public void mo185852a(String str) {
        if (TextUtils.isEmpty(str)) {
            LKUIToast.show(this.f134416d, (int) R.string.Lark_Legacy_MineMessageSettingSetupFailed);
        } else {
            LKUIToast.show(this.f134416d, str);
        }
    }

    /* renamed from: a */
    public void mo185851a(C54378d dVar) {
        if (this.mDetailItemContainer != null) {
            this.f134415c = dVar;
            C54377c a = dVar.mo185984a();
            C54377c b = dVar.mo185985b();
            for (Map.Entry<Integer, C54329a> entry : this.f134417e.entrySet()) {
                SettingItemView a2 = entry.getValue().mo185875a();
                if (a2 != null) {
                    a2.setEnabled(b.mo185975b(entry.getKey().intValue()));
                    if (a2.getRightSwitch() != null) {
                        a2.getRightSwitch().setCheckedNoEvent(a.mo185975b(entry.getKey().intValue()));
                    }
                }
            }
        }
    }

    public AutoTranslateSettingDetailView(Context context, AbstractC54330b bVar) {
        this.f134416d = context;
        this.f134413a = bVar;
    }
}
