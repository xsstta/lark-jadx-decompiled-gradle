package com.bytedance.ee.bear.sheet.panel.panelcell;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.ee.bear.sheet.panel.SheetItem;
import com.bytedance.ee.bear.sheet.panel.panelcell.AbstractC11286a;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.bear.widgets.shape.C11852a;
import com.larksuite.component.universe_design.badge.UDBadgeView;
import com.larksuite.suite.R;

public class SheetListItemView extends LinearLayout implements AbstractC11286a {

    /* renamed from: a */
    protected AbstractC11286a.AbstractC11287a f30339a;

    /* renamed from: b */
    protected View f30340b;

    /* renamed from: c */
    private boolean f30341c;

    /* renamed from: d */
    private boolean f30342d;

    /* renamed from: e */
    private TextView f30343e;

    /* renamed from: f */
    private ImageView f30344f;

    /* renamed from: g */
    private UDBadgeView f30345g;

    /* renamed from: h */
    private ImageView f30346h;

    /* renamed from: i */
    private ImageView f30347i;

    /* renamed from: j */
    private Drawable f30348j;

    /* renamed from: k */
    private Drawable f30349k;

    /* renamed from: l */
    private EnumC11285a f30350l;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.sheet.panel.panelcell.SheetListItemView$2 */
    public static /* synthetic */ class C112842 {

        /* renamed from: a */
        static final /* synthetic */ int[] f30353a;

        /* renamed from: b */
        static final /* synthetic */ int[] f30354b;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Can't wrap try/catch for region: R(19:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004d */
        static {
            /*
                com.bytedance.ee.bear.sheet.panel.SheetItem$GroupPosition[] r0 = com.bytedance.ee.bear.sheet.panel.SheetItem.GroupPosition.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bytedance.ee.bear.sheet.panel.panelcell.SheetListItemView.C112842.f30354b = r0
                r1 = 1
                com.bytedance.ee.bear.sheet.panel.SheetItem$GroupPosition r2 = com.bytedance.ee.bear.sheet.panel.SheetItem.GroupPosition.TOP     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = com.bytedance.ee.bear.sheet.panel.panelcell.SheetListItemView.C112842.f30354b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.ee.bear.sheet.panel.SheetItem$GroupPosition r3 = com.bytedance.ee.bear.sheet.panel.SheetItem.GroupPosition.CENTER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = com.bytedance.ee.bear.sheet.panel.panelcell.SheetListItemView.C112842.f30354b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bytedance.ee.bear.sheet.panel.SheetItem$GroupPosition r4 = com.bytedance.ee.bear.sheet.panel.SheetItem.GroupPosition.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.bytedance.ee.bear.sheet.panel.panelcell.SheetListItemView$a[] r3 = com.bytedance.ee.bear.sheet.panel.panelcell.SheetListItemView.EnumC11285a.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                com.bytedance.ee.bear.sheet.panel.panelcell.SheetListItemView.C112842.f30353a = r3
                com.bytedance.ee.bear.sheet.panel.panelcell.SheetListItemView$a r4 = com.bytedance.ee.bear.sheet.panel.panelcell.SheetListItemView.EnumC11285a.SINGLE     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = com.bytedance.ee.bear.sheet.panel.panelcell.SheetListItemView.C112842.f30353a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.bytedance.ee.bear.sheet.panel.panelcell.SheetListItemView$a r3 = com.bytedance.ee.bear.sheet.panel.panelcell.SheetListItemView.EnumC11285a.TOP     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = com.bytedance.ee.bear.sheet.panel.panelcell.SheetListItemView.C112842.f30353a     // Catch:{ NoSuchFieldError -> 0x004d }
                com.bytedance.ee.bear.sheet.panel.panelcell.SheetListItemView$a r1 = com.bytedance.ee.bear.sheet.panel.panelcell.SheetListItemView.EnumC11285a.CENTER     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                int[] r0 = com.bytedance.ee.bear.sheet.panel.panelcell.SheetListItemView.C112842.f30353a     // Catch:{ NoSuchFieldError -> 0x0058 }
                com.bytedance.ee.bear.sheet.panel.panelcell.SheetListItemView$a r1 = com.bytedance.ee.bear.sheet.panel.panelcell.SheetListItemView.EnumC11285a.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.sheet.panel.panelcell.SheetListItemView.C112842.<clinit>():void");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo43227a() {
        this.f30340b = findViewById(R.id.list_item_container);
        this.f30343e = (TextView) findViewById(R.id.list_item_title);
        this.f30344f = (ImageView) findViewById(R.id.list_item_icon);
        this.f30346h = (ImageView) findViewById(R.id.list_item_next);
        this.f30345g = (UDBadgeView) findViewById(R.id.list_item_badge);
        setShowDivider(this.f30341c);
        setIcon(this.f30348j);
        setShowNext(this.f30342d);
        setIndicator(this.f30349k);
    }

    @Override // com.bytedance.ee.bear.sheet.panel.panelcell.AbstractC11286a
    public void setClickListener(AbstractC11286a.AbstractC11287a aVar) {
        this.f30339a = aVar;
    }

    public SheetListItemView(Context context) {
        this(context, null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.bytedance.ee.bear.sheet.panel.panelcell.AbstractC11286a
    /* renamed from: a */
    public void mo43223a(boolean z) {
        int i;
        UDBadgeView uDBadgeView = this.f30345g;
        if (uDBadgeView != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            uDBadgeView.setVisibility(i);
        }
    }

    public void setShowNext(boolean z) {
        int i;
        ImageView imageView = this.f30346h;
        if (imageView != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            imageView.setVisibility(i);
        }
    }

    public void setIcon(Drawable drawable) {
        int i;
        ImageView imageView = this.f30344f;
        if (imageView != null) {
            if (drawable != null) {
                i = 0;
            } else {
                i = 8;
            }
            imageView.setVisibility(i);
            if (drawable != null) {
                this.f30344f.setImageDrawable(drawable);
            }
        }
    }

    public void setIndicator(Drawable drawable) {
        int i;
        ImageView imageView = (ImageView) findViewById(R.id.list_item_indicator_icon);
        this.f30347i = imageView;
        if (imageView != null) {
            if (drawable != null) {
                i = 0;
            } else {
                i = 8;
            }
            imageView.setVisibility(i);
            if (drawable != null) {
                this.f30347i.setImageDrawable(drawable);
            }
        }
    }

    public void setShowDivider(boolean z) {
        int i;
        View findViewById = findViewById(R.id.list_item_divider);
        if (findViewById != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            findViewById.setVisibility(i);
        }
    }

    @Override // com.bytedance.ee.bear.sheet.panel.panelcell.AbstractC11286a
    /* renamed from: a */
    public void mo43222a(final SheetItem sheetItem) {
        boolean z;
        int i;
        int i2;
        this.f30343e.setText(sheetItem.getTitle());
        if (!sheetItem.isEnable() || sheetItem.isAdminLimit()) {
            z = false;
        } else {
            z = true;
        }
        TextView textView = this.f30343e;
        Resources resources = getResources();
        if (z) {
            i = R.color.sheet_item_text_normal;
        } else {
            i = R.color.sheet_item_text_disable;
        }
        textView.setTextColor(resources.getColor(i));
        ImageView imageView = this.f30344f;
        Resources resources2 = getResources();
        int i3 = R.color.sheet_item_icon_disable;
        if (z) {
            i2 = R.color.sheet_item_icon_normal;
        } else {
            i2 = R.color.sheet_item_icon_disable;
        }
        imageView.setImageTintList(resources2.getColorStateList(i2));
        ImageView imageView2 = this.f30346h;
        Resources resources3 = getResources();
        if (z) {
            i3 = R.color.text_placeholder;
        }
        imageView2.setImageTintList(resources3.getColorStateList(i3));
        mo43228a(sheetItem.getGroupPosition(), z);
        setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.sheet.panel.panelcell.SheetListItemView.C112831 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                if (SheetListItemView.this.f30339a != null) {
                    SheetListItemView.this.f30339a.clickItem(sheetItem.getId(), null);
                }
            }
        });
    }

    public SheetListItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo43228a(SheetItem.GroupPosition groupPosition, boolean z) {
        ColorStateList colorStateList;
        if (this.f30350l != EnumC11285a.NONE) {
            int i = C112842.f30353a[this.f30350l.ordinal()];
            if (i == 1) {
                groupPosition = SheetItem.GroupPosition.SINGLE;
            } else if (i == 2) {
                groupPosition = SheetItem.GroupPosition.TOP;
            } else if (i == 3) {
                groupPosition = SheetItem.GroupPosition.CENTER;
            } else if (i == 4) {
                groupPosition = SheetItem.GroupPosition.BOTTOM;
            }
        }
        int color = getResources().getColor(R.color.bg_body_overlay);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.ud_radius_l);
        if (z) {
            colorStateList = getResources().getColorStateList(R.color.sheet_list_item_tint_selector);
        } else {
            colorStateList = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f30340b.getLayoutParams();
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.space_kit_len_8);
        int i2 = C112842.f30354b[groupPosition.ordinal()];
        if (i2 == 1) {
            this.f30340b.setBackground(C11852a.m49212a(color, (float) dimensionPixelSize, colorStateList));
            marginLayoutParams.setMargins(0, dimensionPixelSize2, 0, 0);
            setShowDivider(true);
        } else if (i2 == 2) {
            this.f30340b.setBackground(C11852a.m49213a(color, colorStateList));
            marginLayoutParams.setMargins(0, 0, 0, 0);
            setShowDivider(true);
        } else if (i2 != 3) {
            this.f30340b.setBackground(C11852a.m49218e(color, (float) dimensionPixelSize, colorStateList));
            marginLayoutParams.setMargins(0, dimensionPixelSize2, 0, dimensionPixelSize2);
            setShowDivider(false);
        } else {
            this.f30340b.setBackground(C11852a.m49215b(color, (float) dimensionPixelSize, colorStateList));
            marginLayoutParams.setMargins(0, 0, 0, dimensionPixelSize2);
            setShowDivider(false);
        }
        this.f30340b.setLayoutParams(marginLayoutParams);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.sheet.panel.panelcell.SheetListItemView$a */
    public enum EnumC11285a {
        SINGLE(0),
        TOP(1),
        CENTER(2),
        BOTTOM(3),
        NONE(4);
        
        public int value;

        private EnumC11285a(int i) {
            this.value = i;
        }
    }

    public SheetListItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.forceGroupPosition, R.attr.showListItemDivider, R.attr.showListItemIcon, R.attr.showListItemIndicator, R.attr.showListItemNext});
        if (obtainStyledAttributes != null) {
            this.f30341c = obtainStyledAttributes.getBoolean(1, false);
            this.f30342d = obtainStyledAttributes.getBoolean(4, false);
            this.f30348j = obtainStyledAttributes.getDrawable(2);
            this.f30349k = obtainStyledAttributes.getDrawable(3);
            this.f30350l = EnumC11285a.values()[obtainStyledAttributes.getInt(0, EnumC11285a.NONE.value)];
            obtainStyledAttributes.recycle();
        }
        LayoutInflater.from(getContext()).inflate(R.layout.sheet_panel_list_item, (ViewGroup) this, true);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        mo43227a();
    }
}
