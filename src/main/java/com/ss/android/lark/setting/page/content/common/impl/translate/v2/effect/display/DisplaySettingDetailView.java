package com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.display;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.framework.mvp.IView;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.AbstractC54318a;
import com.ss.android.lark.setting.page.content.common.impl.translate.v2.entity.C54379e;
import com.ss.android.lark.setting.page.content.common.impl.translate.v2.entity.LanguageDisplayRule;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.utils.UIHelper;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;

public class DisplaySettingDetailView implements AbstractC54318a.AbstractC54320b<C54379e> {

    /* renamed from: a */
    private final AbstractC54355b f134461a;

    /* renamed from: b */
    private final Context f134462b;

    /* renamed from: c */
    private final Map<Integer, C54354a> f134463c = new LinkedHashMap();

    /* renamed from: d */
    private AbstractC54318a.AbstractC54320b.AbstractC54321a f134464d;

    /* renamed from: e */
    private C54379e f134465e;
    public TextView mDescription;
    public LinearLayout mDetailItemContainer;
    public CommonTitleBar mTitleBar;

    /* renamed from: com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.display.DisplaySettingDetailView$b */
    public interface AbstractC54355b<H> {
        /* renamed from: a */
        String mo185916a();

        /* renamed from: a */
        void mo185917a(IView iView);

        /* renamed from: b */
        String mo185918b();

        /* renamed from: c */
        void mo185919c();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    /* renamed from: com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.display.DisplaySettingDetailView$a */
    public static class C54354a {

        /* renamed from: a */
        public String f134466a;

        /* renamed from: b */
        private WeakReference<UDCheckBox> f134467b;

        /* renamed from: a */
        public UDCheckBox mo185914a() {
            WeakReference<UDCheckBox> weakReference = this.f134467b;
            if (weakReference == null) {
                return null;
            }
            return weakReference.get();
        }

        public C54354a(String str) {
            this.f134466a = str;
        }

        /* renamed from: a */
        public void mo185915a(UDCheckBox uDCheckBox) {
            this.f134467b = new WeakReference<>(uDCheckBox);
        }
    }

    /* renamed from: a */
    private void m211004a() {
        this.f134463c.put(Integer.valueOf(LanguageDisplayRule.WITH_ORIGINAL.getValue()), new C54354a(UIHelper.getString(R.string.Lark_Chat_TranslationAndOriginalMessage)));
        this.f134463c.put(Integer.valueOf(LanguageDisplayRule.ONLY_TRANSLATION.getValue()), new C54354a(UIHelper.getString(R.string.Lark_Chat_TranslationOnly)));
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f134461a.mo185917a(this);
        m211004a();
        m211007b();
        this.f134464d.mo185853a();
        this.mTitleBar.setTitle(this.f134461a.mo185916a());
        this.mTitleBar.setLeftClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.display.$$Lambda$DisplaySettingDetailView$MOyMy_MZqMKOKmwqDokk2fWWoUQ */

            public final void onClick(View view) {
                DisplaySettingDetailView.lambda$MOyMy_MZqMKOKmwqDokk2fWWoUQ(DisplaySettingDetailView.this, view);
            }
        });
        this.mDescription.setText(this.f134461a.mo185918b());
    }

    /* renamed from: b */
    private void m211007b() {
        LayoutInflater from = LayoutInflater.from(this.f134462b);
        for (Map.Entry<Integer, C54354a> entry : this.f134463c.entrySet()) {
            View inflate = from.inflate(R.layout.item_display_detail, (ViewGroup) null);
            TextView textView = (TextView) inflate.findViewById(R.id.language_display);
            if (textView != null) {
                textView.setText(entry.getValue().f134466a);
                UDCheckBox uDCheckBox = (UDCheckBox) inflate.findViewById(R.id.select_state);
                if (uDCheckBox != null) {
                    uDCheckBox.setClickable(false);
                    entry.getValue().mo185915a(uDCheckBox);
                    inflate.setOnClickListener(new View.OnClickListener(entry) {
                        /* class com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.display.$$Lambda$DisplaySettingDetailView$LWNZqijNsvD_nuEOvy3X4JpkYEg */
                        public final /* synthetic */ Map.Entry f$1;

                        {
                            this.f$1 = r2;
                        }

                        public final void onClick(View view) {
                            DisplaySettingDetailView.lambda$LWNZqijNsvD_nuEOvy3X4JpkYEg(DisplaySettingDetailView.this, this.f$1, view);
                        }
                    });
                    if (DesktopUtil.m144301a(this.f134462b)) {
                        DesktopUtil.m144299a(textView);
                        DesktopUtil.m144298a(inflate.findViewById(R.id.language_layout));
                    }
                    this.mDetailItemContainer.addView(inflate);
                }
            }
        }
        DesktopUtil.m144306b(this.mDescription);
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC54318a.AbstractC54320b.AbstractC54321a aVar) {
        this.f134464d = aVar;
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m211005a(View view) {
        this.f134461a.mo185919c();
    }

    @Override // com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.AbstractC54318a.AbstractC54320b
    /* renamed from: a */
    public void mo185852a(String str) {
        if (TextUtils.isEmpty(str)) {
            LKUIToast.show(this.f134462b, (int) R.string.Lark_Legacy_MineMessageSettingSetupFailed);
        } else {
            LKUIToast.show(this.f134462b, str);
        }
    }

    /* renamed from: a */
    public void mo185851a(C54379e eVar) {
        boolean z;
        this.f134465e = eVar;
        LanguageDisplayRule b = eVar.mo185991b();
        for (Map.Entry<Integer, C54354a> entry : this.f134463c.entrySet()) {
            UDCheckBox a = entry.getValue().mo185914a();
            if (a != null) {
                if (b.getValue() == entry.getKey().intValue()) {
                    z = true;
                } else {
                    z = false;
                }
                a.setChecked(z);
            }
        }
    }

    public DisplaySettingDetailView(Context context, AbstractC54355b bVar) {
        this.f134462b = context;
        this.f134461a = bVar;
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m211006a(Map.Entry entry, View view) {
        C54379e eVar;
        C54379e eVar2 = this.f134465e;
        if (eVar2 == null) {
            eVar = null;
        } else {
            eVar = eVar2.clone();
        }
        if (eVar != null) {
            eVar.mo185990a(LanguageDisplayRule.fromValue(((Integer) entry.getKey()).intValue()));
            this.f134464d.mo185854a(eVar);
        }
    }
}
