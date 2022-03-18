package com.ss.android.lark.mail.impl.settings.component.settingitem;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.p017a.p018a.C0215a;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.component.universe_design.udswitch.UDSwitch;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.settings.component.settingitem.ISettingItemModel;
import com.ss.android.lark.mail.impl.utils.C43819s;
import com.ss.android.lark.utils.UIHelper;

public abstract class AbsSettingItemViewModel {

    /* renamed from: a */
    protected Context f110309a;

    /* renamed from: b */
    protected LifecycleOwner f110310b;

    /* renamed from: c */
    protected AbstractC1178x f110311c;

    /* renamed from: d */
    protected View f110312d;

    /* renamed from: e */
    protected View f110313e;

    /* renamed from: f */
    protected View f110314f;

    /* renamed from: g */
    protected TextView f110315g;

    /* renamed from: h */
    protected TextView f110316h;

    /* renamed from: i */
    protected View f110317i;

    /* renamed from: j */
    protected UDCheckBox f110318j;

    /* renamed from: k */
    protected UDSwitch f110319k;

    /* renamed from: l */
    protected TextView f110320l;

    /* renamed from: m */
    protected ISettingItemModel f110321m;

    /* renamed from: n */
    protected LiveData<Boolean> f110322n;

    /* renamed from: o */
    protected boolean f110323o;

    public enum ActionType {
        Switch,
        Arrow,
        Checkbox
    }

    public enum DividerStyle {
        None,
        Normal,
        LeftIndent,
        Align
    }

    public enum ItemBackgroundType {
        SQUARE,
        CIRCLE,
        TOP_CIRCLE,
        BOTTOM_CIRCLE
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo155205a(View view, boolean z);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract ISettingItemModel.Function mo155208b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract ActionType mo155210c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract String mo155212d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract String mo155213e();

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public boolean mo155214f() {
        return true;
    }

    /* renamed from: h */
    public boolean mo155216h() {
        return true;
    }

    /* renamed from: j */
    private void mo155230j() {
        mo155215g().setVisibility(0);
    }

    /* renamed from: k */
    private void m172347k() {
        mo155215g().setVisibility(8);
    }

    /* renamed from: a */
    public void mo155203a() {
        AbstractC1178x<? super Boolean> xVar;
        this.f110309a = null;
        this.f110312d = null;
        LiveData<Boolean> liveData = this.f110322n;
        if (liveData != null && (xVar = this.f110311c) != null) {
            liveData.mo5928b(xVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public String mo155217i() {
        ISettingItemModel iSettingItemModel = this.f110321m;
        if (iSettingItemModel == null || iSettingItemModel.mo155225c() == null) {
            return "";
        }
        return this.f110321m.mo155225c().mo151848b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel$5 */
    public static /* synthetic */ class C434165 {

        /* renamed from: a */
        static final /* synthetic */ int[] f110328a;

        /* renamed from: b */
        static final /* synthetic */ int[] f110329b;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|(3:23|24|26)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(21:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|26) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        static {
            /*
                com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel$ItemBackgroundType[] r0 = com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel.ItemBackgroundType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel.C434165.f110329b = r0
                r1 = 1
                com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel$ItemBackgroundType r2 = com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel.ItemBackgroundType.SQUARE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel.C434165.f110329b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel$ItemBackgroundType r3 = com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel.ItemBackgroundType.TOP_CIRCLE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel.C434165.f110329b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel$ItemBackgroundType r4 = com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel.ItemBackgroundType.BOTTOM_CIRCLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel.C434165.f110329b     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel$ItemBackgroundType r5 = com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel.ItemBackgroundType.CIRCLE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel$DividerStyle[] r4 = com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel.DividerStyle.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel.C434165.f110328a = r4
                com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel$DividerStyle r5 = com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel.DividerStyle.Normal     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel.C434165.f110328a     // Catch:{ NoSuchFieldError -> 0x004e }
                com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel$DividerStyle r4 = com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel.DividerStyle.LeftIndent     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel.C434165.f110328a     // Catch:{ NoSuchFieldError -> 0x0058 }
                com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel$DividerStyle r1 = com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel.DividerStyle.Align     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r0 = com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel.C434165.f110328a     // Catch:{ NoSuchFieldError -> 0x0062 }
                com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel$DividerStyle r1 = com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel.DividerStyle.None     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel.C434165.<clinit>():void");
        }
    }

    /* renamed from: g */
    public View mo155215g() {
        if (this.f110312d == null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) LayoutInflater.from(this.f110309a).inflate(R.layout.mail_view_setting_item, (ViewGroup) null);
            this.f110312d = constraintLayout;
            this.f110313e = constraintLayout.findViewById(R.id.bottom_divider);
            this.f110314f = constraintLayout.findViewById(R.id.setting_item_panel);
            this.f110315g = (TextView) constraintLayout.findViewById(R.id.setting_item_name);
            this.f110316h = (TextView) constraintLayout.findViewById(R.id.mail_setting_item_tip);
            this.f110317i = constraintLayout.findViewById(R.id.mail_setting_item_blank);
            this.f110319k = (UDSwitch) constraintLayout.findViewById(R.id.setting_item_action_switch);
            this.f110318j = (UDCheckBox) constraintLayout.findViewById(R.id.setting_item_action_checkbox);
            if (mo155210c() == ActionType.Switch) {
                this.f110319k.setVisibility(0);
                this.f110314f.setOnClickListener(null);
                this.f110319k.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    /* class com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel.C434132 */

                    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                        AbsSettingItemViewModel.this.mo155205a(compoundButton, z);
                    }
                });
            } else {
                this.f110319k.setVisibility(8);
            }
            if (mo155210c() == ActionType.Checkbox) {
                this.f110318j.setVisibility(0);
                this.f110314f.setOnClickListener(new View.OnClickListener() {
                    /* class com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel.View$OnClickListenerC434143 */

                    public void onClick(View view) {
                        Boolean bool;
                        boolean z;
                        if (AbsSettingItemViewModel.this.f110322n != null) {
                            bool = AbsSettingItemViewModel.this.f110322n.mo5927b();
                        } else {
                            bool = Boolean.FALSE;
                        }
                        AbsSettingItemViewModel absSettingItemViewModel = AbsSettingItemViewModel.this;
                        if (bool == null || bool.booleanValue()) {
                            z = false;
                        } else {
                            z = true;
                        }
                        absSettingItemViewModel.mo155205a(view, z);
                    }
                });
            } else {
                this.f110318j.setVisibility(8);
            }
            this.f110320l = (TextView) constraintLayout.findViewById(R.id.setting_item_action_arrow);
            Drawable drawable = UIHelper.getDrawable(R.drawable.ud_icon_hide_toolbar_outlined);
            drawable.setBounds(0, 0, UIHelper.dp2px(12.0f), UIHelper.dp2px(12.0f));
            this.f110320l.setCompoundDrawables(null, null, drawable, null);
            if (mo155210c() == ActionType.Arrow) {
                this.f110320l.setVisibility(0);
                this.f110314f.setBackgroundTintList(C0215a.m652a(this.f110309a, R.color.mail_item_bg_color_selector_c11));
                this.f110314f.setOnClickListener(new View.OnClickListener() {
                    /* class com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel.View$OnClickListenerC434154 */

                    public void onClick(View view) {
                        Boolean bool;
                        boolean z;
                        if (AbsSettingItemViewModel.this.f110322n != null) {
                            bool = AbsSettingItemViewModel.this.f110322n.mo5927b();
                        } else {
                            bool = Boolean.FALSE;
                        }
                        AbsSettingItemViewModel absSettingItemViewModel = AbsSettingItemViewModel.this;
                        if (bool != null) {
                            z = bool.booleanValue();
                        } else {
                            z = false;
                        }
                        absSettingItemViewModel.mo155205a(view, z);
                    }
                });
            } else {
                this.f110320l.setVisibility(8);
            }
        }
        return this.f110312d;
    }

    /* renamed from: a */
    public void mo155206a(DividerStyle dividerStyle) {
        m172344a(this.f110313e, dividerStyle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo155202a(boolean z) {
        int i;
        if (z) {
            i = R.string.Mail_Setting_EmailEnabled;
        } else {
            i = R.string.Mail_Setting_EmailNotEnabled;
        }
        return C43819s.m173684a(i);
    }

    /* renamed from: c */
    public void mo155211c(boolean z) {
        boolean z2;
        this.f110323o = z;
        if (z) {
            m172347k();
            return;
        }
        LiveData<Boolean> liveData = this.f110322n;
        if (liveData == null || liveData.mo5927b() == null) {
            z2 = false;
        } else {
            z2 = this.f110322n.mo5927b().booleanValue();
        }
        mo155209b(z2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo155209b(boolean z) {
        mo155215g();
        if (!mo155216h() || this.f110323o) {
            m172347k();
            return;
        }
        mo155230j();
        String d = mo155212d();
        TextView textView = this.f110315g;
        if (d == null) {
            d = "";
        }
        textView.setText(d);
        String e = mo155213e();
        if (TextUtils.isEmpty(e)) {
            this.f110316h.setVisibility(8);
        } else {
            this.f110316h.setVisibility(0);
            this.f110316h.setText(e);
        }
        if (mo155214f()) {
            this.f110317i.setVisibility(0);
        } else {
            this.f110317i.setVisibility(8);
        }
        if (mo155210c() == ActionType.Switch) {
            this.f110319k.setCheckedIgnoreEvent(z);
        } else if (mo155210c() == ActionType.Arrow) {
            this.f110320l.setText(mo155202a(z));
        } else if (mo155210c() == ActionType.Checkbox) {
            this.f110318j.setChecked(z);
        }
    }

    /* renamed from: a */
    public void mo155204a(Context context) {
        this.f110309a = context;
        this.f110312d = mo155215g();
        if (this.f110322n != null) {
            C434121 r3 = new AbstractC1178x<Boolean>() {
                /* class com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel.C434121 */

                /* renamed from: a */
                public void onChanged(Boolean bool) {
                    boolean z;
                    AbsSettingItemViewModel absSettingItemViewModel = AbsSettingItemViewModel.this;
                    if (bool != null) {
                        z = bool.booleanValue();
                    } else {
                        z = false;
                    }
                    absSettingItemViewModel.mo155209b(z);
                }
            };
            this.f110311c = r3;
            this.f110322n.mo5923a(this.f110310b, r3);
            return;
        }
        mo155209b(false);
    }

    /* renamed from: a */
    public void mo155207a(ItemBackgroundType itemBackgroundType) {
        m172345a(this.f110314f, itemBackgroundType);
    }

    public AbsSettingItemViewModel(LifecycleOwner lifecycleOwner, ISettingItemModel iSettingItemModel) {
        this.f110310b = lifecycleOwner;
        this.f110321m = iSettingItemModel;
        if (iSettingItemModel != null) {
            this.f110322n = iSettingItemModel.mo155222a(mo155208b());
        }
    }

    /* renamed from: a */
    public static void m172345a(View view, ItemBackgroundType itemBackgroundType) {
        if (view != null) {
            int i = C434165.f110329b[itemBackgroundType.ordinal()];
            if (i == 1) {
                view.setBackgroundResource(R.drawable.mail_setting_square_corner_box_background);
            } else if (i == 2) {
                view.setBackgroundResource(R.drawable.mail_setting_top_circle_corner_box_background);
            } else if (i != 3) {
                view.setBackgroundResource(R.drawable.mail_setting_circle_corner_box_background);
            } else {
                view.setBackgroundResource(R.drawable.mail_setting_bottom_circle_corner_box_background);
            }
        }
    }

    /* renamed from: a */
    private void m172344a(View view, DividerStyle dividerStyle) {
        int i = C434165.f110328a[dividerStyle.ordinal()];
        if (i == 1) {
            view.setVisibility(0);
            ((ConstraintLayout.LayoutParams) view.getLayoutParams()).leftMargin = 0;
            ((ConstraintLayout.LayoutParams) view.getLayoutParams()).width = -1;
            view.requestLayout();
        } else if (i == 2) {
            view.setVisibility(0);
            ((ConstraintLayout.LayoutParams) view.getLayoutParams()).leftMargin = UIHelper.dp2px(16.0f);
            ((ConstraintLayout.LayoutParams) view.getLayoutParams()).width = -1;
            view.requestLayout();
        } else if (i != 3) {
            view.setVisibility(8);
        } else {
            view.setVisibility(0);
            ((ConstraintLayout.LayoutParams) view.getLayoutParams()).leftMargin = 0;
            ((ConstraintLayout.LayoutParams) view.getLayoutParams()).width = 0;
            view.requestLayout();
        }
    }
}
