package com.ss.android.lark.widget.settingitem;

import android.app.Application;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.button.LKUICheckBox;
import com.larksuite.component.ui.button.LKUISwitchButton;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.lark.widget.C58323b;
import com.ss.android.lark.widget.listener.OnSingleClickListener;

public class SettingItemView extends ConstraintLayout {

    /* renamed from: a */
    private TextView f146667a;

    /* renamed from: b */
    private TextView f146668b;

    /* renamed from: c */
    private RelativeLayout f146669c;

    /* renamed from: d */
    private RelativeLayout f146670d;

    /* renamed from: e */
    private View f146671e;

    /* renamed from: f */
    private View f146672f;

    /* renamed from: g */
    private String f146673g;

    /* renamed from: h */
    private String f146674h;

    /* renamed from: i */
    private String f146675i;

    /* renamed from: j */
    private int f146676j;

    /* renamed from: k */
    private Drawable f146677k;

    /* renamed from: l */
    private ColorStateList f146678l;

    /* renamed from: m */
    private boolean f146679m;

    /* renamed from: n */
    private boolean f146680n;

    /* renamed from: o */
    private int f146681o;

    /* renamed from: p */
    private int f146682p;

    /* renamed from: q */
    private boolean f146683q;

    /* renamed from: r */
    private boolean f146684r;

    /* renamed from: s */
    private Drawable f146685s;

    /* renamed from: t */
    private String f146686t;

    /* renamed from: u */
    private int f146687u;

    /* renamed from: v */
    private Drawable f146688v;

    /* renamed from: w */
    private AbstractC59129b f146689w;

    /* renamed from: x */
    private AbstractC59129b f146690x;

    /* renamed from: y */
    private int f146691y;

    /* renamed from: z */
    private int f146692z;

    public enum Event {
        SetText,
        SetEnable,
        GetSwitchBtn,
        GetCheckBox,
        GetRadioBtn
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.widget.settingitem.SettingItemView$b */
    public interface AbstractC59129b {
        /* renamed from: a */
        Object mo200895a(Event event, Object obj);
    }

    public LKUICheckBox getLeftCheckBox() {
        AbstractC59129b bVar = this.f146689w;
        if (bVar != null) {
            Object a = bVar.mo200895a(Event.GetCheckBox, null);
            if (a instanceof LKUICheckBox) {
                return (LKUICheckBox) a;
            }
        }
        return null;
    }

    public UDCheckBox getLeftRadioButton() {
        AbstractC59129b bVar = this.f146689w;
        if (bVar != null) {
            Object a = bVar.mo200895a(Event.GetRadioBtn, null);
            if (a instanceof UDCheckBox) {
                return (UDCheckBox) a;
            }
        }
        return null;
    }

    public LKUISwitchButton getRightSwitch() {
        AbstractC59129b bVar = this.f146690x;
        if (bVar != null) {
            Object a = bVar.mo200895a(Event.GetSwitchBtn, null);
            if (a instanceof LKUISwitchButton) {
                return (LKUISwitchButton) a;
            }
        }
        return null;
    }

    /* renamed from: com.ss.android.lark.widget.settingitem.SettingItemView$4 */
    static /* synthetic */ class C591274 {

        /* renamed from: a */
        static final /* synthetic */ int[] f146699a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.ss.android.lark.widget.settingitem.SettingItemView$Event[] r0 = com.ss.android.lark.widget.settingitem.SettingItemView.Event.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.widget.settingitem.SettingItemView.C591274.f146699a = r0
                com.ss.android.lark.widget.settingitem.SettingItemView$Event r1 = com.ss.android.lark.widget.settingitem.SettingItemView.Event.GetRadioBtn     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.widget.settingitem.SettingItemView.C591274.f146699a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.widget.settingitem.SettingItemView$Event r1 = com.ss.android.lark.widget.settingitem.SettingItemView.Event.SetEnable     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.widget.settingitem.SettingItemView.C591274.f146699a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.widget.settingitem.SettingItemView$Event r1 = com.ss.android.lark.widget.settingitem.SettingItemView.Event.SetText     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.widget.settingitem.SettingItemView.C591274.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.widget.settingitem.SettingItemView$a */
    public static class ApplicationC59128a extends Application {
        public ApplicationC59128a(Context context) {
            attachBaseContext(context);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.widget.settingitem.SettingItemView$c */
    public static class C59130c implements AbstractC59129b {

        /* renamed from: a */
        private ImageView f146700a;

        public C59130c(ImageView imageView) {
            this.f146700a = imageView;
        }

        @Override // com.ss.android.lark.widget.settingitem.SettingItemView.AbstractC59129b
        /* renamed from: a */
        public Object mo200895a(Event event, Object obj) {
            if (event != Event.SetEnable || !(obj instanceof Boolean)) {
                return null;
            }
            this.f146700a.setEnabled(((Boolean) obj).booleanValue());
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.widget.settingitem.SettingItemView$d */
    public static class C59131d implements AbstractC59129b {

        /* renamed from: a */
        private UDCheckBox f146701a;

        public C59131d(UDCheckBox uDCheckBox) {
            this.f146701a = uDCheckBox;
        }

        @Override // com.ss.android.lark.widget.settingitem.SettingItemView.AbstractC59129b
        /* renamed from: a */
        public Object mo200895a(Event event, Object obj) {
            int i = C591274.f146699a[event.ordinal()];
            if (i == 1) {
                return this.f146701a;
            }
            if (i != 2 || !(obj instanceof Boolean)) {
                return null;
            }
            this.f146701a.setEnabled(((Boolean) obj).booleanValue());
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.widget.settingitem.SettingItemView$e */
    public static class C59132e implements AbstractC59129b {

        /* renamed from: a */
        private LKUISwitchButton f146702a;

        public C59132e(LKUISwitchButton lKUISwitchButton) {
            this.f146702a = lKUISwitchButton;
        }

        @Override // com.ss.android.lark.widget.settingitem.SettingItemView.AbstractC59129b
        /* renamed from: a */
        public Object mo200895a(Event event, Object obj) {
            if (event == Event.SetEnable && (obj instanceof Boolean)) {
                this.f146702a.setEnabled(((Boolean) obj).booleanValue());
                return null;
            } else if (event == Event.GetSwitchBtn) {
                return this.f146702a;
            } else {
                return null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.widget.settingitem.SettingItemView$g */
    public static class C59134g implements AbstractC59129b {

        /* renamed from: a */
        private LKUICheckBox f146705a;

        public C59134g(LKUICheckBox lKUICheckBox) {
            this.f146705a = lKUICheckBox;
        }

        @Override // com.ss.android.lark.widget.settingitem.SettingItemView.AbstractC59129b
        /* renamed from: a */
        public Object mo200895a(Event event, Object obj) {
            if (event == Event.GetCheckBox) {
                return this.f146705a;
            }
            if (event != Event.SetEnable || !(obj instanceof Boolean)) {
                return null;
            }
            this.f146705a.setEnabled(((Boolean) obj).booleanValue());
            return null;
        }
    }

    public SettingItemView(Context context) {
        this(context, null);
    }

    public void setRightText(String str) {
        AbstractC59129b bVar = this.f146690x;
        if (bVar != null) {
            bVar.mo200895a(Event.SetText, str);
        }
    }

    public void setDescription(String str) {
        int i;
        this.f146668b.setText(str);
        TextView textView = this.f146668b;
        if (TextUtils.isEmpty(str)) {
            i = 8;
        } else {
            i = 0;
        }
        textView.setVisibility(i);
    }

    public void setTitle(String str) {
        int i;
        this.f146667a.setText(str);
        TextView textView = this.f146667a;
        if (TextUtils.isEmpty(str)) {
            i = 8;
        } else {
            i = 0;
        }
        textView.setVisibility(i);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        TextView textView = this.f146667a;
        if (textView != null) {
            textView.setEnabled(z);
        }
        TextView textView2 = this.f146668b;
        if (textView2 != null) {
            textView2.setEnabled(z);
        }
        AbstractC59129b bVar = this.f146690x;
        if (bVar != null) {
            bVar.mo200895a(Event.SetEnable, Boolean.valueOf(z));
        }
        AbstractC59129b bVar2 = this.f146689w;
        if (bVar2 != null) {
            bVar2.mo200895a(Event.SetEnable, Boolean.valueOf(z));
        }
    }

    /* renamed from: a */
    private void m229675a(Context context) {
        int i;
        int i2;
        int i3;
        if (isInEditMode()) {
            LarkContext.setApplication(new ApplicationC59128a(getContext().getApplicationContext()));
        }
        RelativeLayout relativeLayout = new RelativeLayout(context);
        this.f146670d = relativeLayout;
        relativeLayout.setId(R.id.left_custom_fl);
        ConstraintLayout.LayoutParams a = C58323b.m226143a(-2.0f, -2.0f, 16, 0, 0, 0);
        if (this.f146684r) {
            a.f2816h = R.id.setting_name_tv;
        } else {
            a.f2816h = 0;
            a.f2819k = 0;
        }
        if (this.f146684r) {
            i = -1;
        } else {
            i = 0;
        }
        a.f2819k = i;
        a.f2825q = 0;
        a.f2812d = 0;
        a.f2828t = 0;
        addView(this.f146670d, a);
        TextView textView = new TextView(context);
        this.f146667a = textView;
        textView.setId(R.id.setting_name_tv);
        this.f146667a.setTextSize((float) this.f146691y);
        this.f146667a.setTextColor(context.getResources().getColorStateList(R.color.setting_item_title_text_color));
        TextView textView2 = this.f146667a;
        if (this.f146683q) {
            i2 = 2;
        } else {
            i2 = Integer.MAX_VALUE;
        }
        textView2.setMaxLines(i2);
        setTitle(this.f146673g);
        ConstraintLayout.LayoutParams a2 = C58323b.m226143a(BitmapDescriptorFactory.HUE_RED, -2.0f, 16, 16, 5, 0);
        a2.f2831w = UIUtils.dp2px(context, 16.0f);
        a2.f2833y = UIUtils.dp2px(context, 16.0f);
        a2.f2816h = 0;
        a2.f2818j = R.id.setting_desc_tv;
        a2.f2824p = R.id.left_custom_fl;
        a2.f2826r = R.id.right_custom_fl;
        a2.f2790H = 2;
        addView(this.f146667a, a2);
        TextView textView3 = new TextView(context);
        this.f146668b = textView3;
        textView3.setId(R.id.setting_desc_tv);
        this.f146668b.setTextSize((float) this.f146692z);
        this.f146668b.setTextColor(C57582a.m223616d(context, R.color.text_placeholder));
        this.f146668b.setMaxLines(2);
        this.f146668b.setEllipsize(TextUtils.TruncateAt.END);
        setDescription(this.f146674h);
        ConstraintLayout.LayoutParams a3 = C58323b.m226143a(BitmapDescriptorFactory.HUE_RED, -2.0f, 0, 4, 0, 16);
        a3.f2817i = R.id.setting_name_tv;
        a3.f2819k = 0;
        a3.f2825q = R.id.setting_name_tv;
        a3.f2827s = R.id.setting_name_tv;
        addView(this.f146668b, a3);
        RelativeLayout relativeLayout2 = new RelativeLayout(context);
        this.f146669c = relativeLayout2;
        relativeLayout2.setId(R.id.right_custom_fl);
        ConstraintLayout.LayoutParams a4 = C58323b.m226143a(-2.0f, -2.0f, 0, 0, 16, 0);
        a4.f2816h = 0;
        a4.f2819k = 0;
        a4.f2827s = 0;
        addView(this.f146669c, a4);
        View view = new View(context);
        this.f146671e = view;
        view.setId(R.id.top_divider);
        this.f146671e.setBackgroundColor(UIUtils.getColor(context, R.color.line_divider_default));
        View view2 = this.f146671e;
        int i4 = 8;
        if (this.f146679m) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        view2.setVisibility(i3);
        ConstraintLayout.LayoutParams a5 = C58323b.m226143a(BitmapDescriptorFactory.HUE_RED, 0.5f, this.f146681o, 0, 0, 0);
        a5.f2816h = 0;
        a5.f2825q = 0;
        a5.f2827s = 0;
        addView(this.f146671e, a5);
        View view3 = new View(context);
        this.f146672f = view3;
        view3.setId(R.id.bottom_divider);
        this.f146672f.setBackgroundColor(UIUtils.getColor(context, R.color.line_divider_default));
        View view4 = this.f146672f;
        if (this.f146680n) {
            i4 = 0;
        }
        view4.setVisibility(i4);
        ConstraintLayout.LayoutParams a6 = C58323b.m226143a(BitmapDescriptorFactory.HUE_RED, 0.5f, this.f146682p, 0, 0, 0);
        a6.f2819k = 0;
        a6.f2825q = 0;
        a6.f2827s = 0;
        addView(this.f146672f, a6);
        setBackground(this.f146685s);
        setClickable(true);
        this.f146689w = m229674a(context, this.f146670d, this.f146687u, this.f146688v, this.f146686t);
        ColorStateList colorStateList = this.f146678l;
        if (colorStateList != null) {
            this.f146677k.setTintList(colorStateList);
            this.f146677k.setTintMode(PorterDuff.Mode.SRC_ATOP);
        }
        this.f146690x = m229674a(context, this.f146669c, this.f146676j, this.f146677k, this.f146675i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.widget.settingitem.SettingItemView$f */
    public static class C59133f implements AbstractC59129b {

        /* renamed from: a */
        private TextView f146703a;

        /* renamed from: b */
        private ImageView f146704b;

        public C59133f(TextView textView, ImageView imageView) {
            this.f146703a = textView;
            this.f146704b = imageView;
        }

        @Override // com.ss.android.lark.widget.settingitem.SettingItemView.AbstractC59129b
        /* renamed from: a */
        public Object mo200895a(Event event, Object obj) {
            int i = C591274.f146699a[event.ordinal()];
            if (i != 2) {
                if (i != 3 || !(obj instanceof String)) {
                    return null;
                }
                this.f146703a.setText((String) obj);
                return null;
            } else if (!(obj instanceof Boolean)) {
                return null;
            } else {
                Boolean bool = (Boolean) obj;
                this.f146703a.setEnabled(bool.booleanValue());
                this.f146704b.setEnabled(bool.booleanValue());
                return null;
            }
        }
    }

    public SettingItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m229676a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.bottom_divider_start_margin, R.attr.bottom_divider_visible, R.attr.description, R.attr.leftType, R.attr.left_icon, R.attr.left_layout, R.attr.left_text, R.attr.limit_title_lines, R.attr.margin_left_layout_top, R.attr.rightType, R.attr.right_icon, R.attr.right_icon_tint, R.attr.right_layout, R.attr.right_text, R.attr.setting_background, R.attr.title, R.attr.top_divider_start_margin, R.attr.top_divider_visible});
            this.f146673g = obtainStyledAttributes.getString(15);
            this.f146674h = obtainStyledAttributes.getString(2);
            this.f146675i = obtainStyledAttributes.getString(13);
            this.f146676j = obtainStyledAttributes.getInteger(9, 0);
            this.f146677k = obtainStyledAttributes.getDrawable(10);
            this.f146678l = obtainStyledAttributes.getColorStateList(11);
            this.f146686t = obtainStyledAttributes.getString(6);
            this.f146687u = obtainStyledAttributes.getInteger(3, -1);
            this.f146688v = obtainStyledAttributes.getDrawable(4);
            this.f146679m = obtainStyledAttributes.getBoolean(17, false);
            this.f146681o = obtainStyledAttributes.getDimensionPixelSize(16, 0);
            this.f146680n = obtainStyledAttributes.getBoolean(1, false);
            this.f146682p = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.f146683q = obtainStyledAttributes.getBoolean(7, this.f146683q);
            this.f146684r = obtainStyledAttributes.getBoolean(8, this.f146684r);
            Drawable drawable = obtainStyledAttributes.getDrawable(14);
            this.f146685s = drawable;
            if (drawable == null) {
                this.f146685s = C57582a.m223614c(context, R.drawable.item_bg_selector_c11);
            }
            obtainStyledAttributes.recycle();
        }
    }

    public enum ContainerType {
        ICON_BTN(0),
        SWITCH_BTN(1),
        RADIO_BTN(2),
        CUSTOM(3),
        TEXT_ICON_BTN(4),
        THROTTLE_CHECKBOX(5);
        
        final int type;

        private ContainerType(int i) {
            this.type = i;
        }
    }

    public SettingItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f146683q = true;
        this.f146691y = 16;
        this.f146692z = 14;
        m229676a(context, attributeSet);
        if (DesktopUtil.m144301a(context)) {
            this.f146691y = 14;
            this.f146692z = 12;
        }
        m229675a(context);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v2, resolved type: android.widget.LinearLayout */
    /* JADX DEBUG: Multi-variable search result rejected for r3v4, resolved type: com.larksuite.component.universe_design.checkbox.UDCheckBox */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private AbstractC59129b m229674a(Context context, RelativeLayout relativeLayout, int i, Drawable drawable, String str) {
        AbstractC59129b bVar;
        RelativeLayout.LayoutParams layoutParams;
        AbstractC59129b gVar;
        ThrottleCheckBox throttleCheckBox;
        ImageView imageView = null;
        if (i == ContainerType.ICON_BTN.type) {
            ImageView imageView2 = new ImageView(context);
            imageView2.setImageDrawable(drawable);
            imageView2.setScaleType(ImageView.ScaleType.FIT_XY);
            layoutParams = C58323b.m226141a(16.0f, 16.0f, 13);
            bVar = new C59130c(imageView2);
            imageView = imageView2;
        } else if (i == ContainerType.SWITCH_BTN.type) {
            View inflate = LayoutInflater.from(context).inflate(R.layout.setting_item_item_switch_btn, (ViewGroup) null);
            final LKUISwitchButton lKUISwitchButton = (LKUISwitchButton) inflate.findViewById(R.id.setting_item_switch_btn);
            setOnClickListener(new OnSingleClickListener() {
                /* class com.ss.android.lark.widget.settingitem.SettingItemView.C591241 */

                @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                public void onSingleClick(View view) {
                    LKUISwitchButton lKUISwitchButton = lKUISwitchButton;
                    lKUISwitchButton.setChecked(!lKUISwitchButton.isChecked());
                }
            });
            bVar = new C59132e(lKUISwitchButton);
            imageView = inflate;
            layoutParams = null;
        } else {
            if (i == ContainerType.RADIO_BTN.type) {
                final UDCheckBox uDCheckBox = new UDCheckBox(context);
                uDCheckBox.setType(UDCheckBox.CheckBoxType.RADIO);
                uDCheckBox.setPadding(0, 0, 0, 0);
                setOnClickListener(new OnSingleClickListener() {
                    /* class com.ss.android.lark.widget.settingitem.SettingItemView.C591252 */

                    @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                    public void onSingleClick(View view) {
                        UDCheckBox uDCheckBox = uDCheckBox;
                        uDCheckBox.setChecked(!uDCheckBox.isChecked());
                    }
                });
                gVar = new C59131d(uDCheckBox);
                throttleCheckBox = uDCheckBox;
            } else if (i == ContainerType.TEXT_ICON_BTN.type) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                TextView textView = new TextView(context);
                textView.setText(str);
                textView.setTextSize(14.0f);
                textView.setTextColor(C57582a.m223616d(context, R.color.text_placeholder));
                linearLayout.addView(textView, C58323b.m226139a(-2, -2, 16, 0, 0, 12, 0));
                ImageView imageView3 = new ImageView(context);
                imageView3.setImageDrawable(drawable);
                imageView3.setScaleType(ImageView.ScaleType.FIT_XY);
                linearLayout.addView(imageView3, C58323b.m226138a(16, 16, 16));
                layoutParams = C58323b.m226141a(-2.0f, -2.0f, 13);
                bVar = new C59133f(textView, imageView3);
                imageView = linearLayout;
            } else if (i == ContainerType.THROTTLE_CHECKBOX.type) {
                final ThrottleCheckBox throttleCheckBox2 = new ThrottleCheckBox(context);
                View$OnClickListenerC591263 r1 = new View.OnClickListener() {
                    /* class com.ss.android.lark.widget.settingitem.SettingItemView.View$OnClickListenerC591263 */

                    public void onClick(View view) {
                        LKUICheckBox lKUICheckBox = throttleCheckBox2;
                        lKUICheckBox.setChecked(!lKUICheckBox.isChecked());
                    }
                };
                throttleCheckBox2.setClickable(false);
                setOnClickListener(r1);
                relativeLayout.setOnClickListener(r1);
                gVar = new C59134g(throttleCheckBox2);
                throttleCheckBox = throttleCheckBox2;
            } else {
                layoutParams = null;
                bVar = null;
            }
            bVar = gVar;
            layoutParams = null;
            imageView = throttleCheckBox;
        }
        if (imageView != null) {
            if (layoutParams != null) {
                relativeLayout.addView(imageView, layoutParams);
            } else {
                relativeLayout.addView(imageView);
            }
            relativeLayout.setVisibility(0);
        } else {
            relativeLayout.setVisibility(8);
        }
        return bVar;
    }
}
