package com.ss.android.lark.message.card.view.richtext;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import com.facebook.yoga.YogaAlign;
import com.facebook.yoga.YogaEdge;
import com.facebook.yoga.YogaNode;
import com.facebook.yoga.android.YogaLayout;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;

public class MsgCardRoundedYogaLayout extends YogaLayout {

    /* renamed from: a */
    public float f114790a;

    /* renamed from: b */
    protected int f114791b;

    /* renamed from: c */
    private final Context f114792c;

    /* renamed from: d */
    private int f114793d;

    /* renamed from: e */
    private int f114794e;

    /* renamed from: f */
    private int f114795f;

    /* renamed from: g */
    private int f114796g;

    /* renamed from: h */
    private int f114797h;

    /* renamed from: i */
    private float f114798i;

    /* renamed from: j */
    private float f114799j;

    /* renamed from: k */
    private float f114800k;

    /* renamed from: l */
    private float f114801l;

    /* renamed from: m */
    private boolean f114802m;

    /* renamed from: n */
    private boolean f114803n;

    /* renamed from: o */
    private ImageView f114804o;

    /* renamed from: p */
    private int f114805p;

    /* renamed from: q */
    private int f114806q;

    /* renamed from: r */
    private YogaNode f114807r;

    private int getDefaultBgColor() {
        if (this.f114803n) {
            return 0;
        }
        if (this.f114802m) {
            return this.f114793d;
        }
        return this.f114795f;
    }

    /* renamed from: b */
    private boolean mo160143b() {
        if (this.f114793d == 0 && this.f114794e == 0 && this.f114795f == 0 && (this.f114796g == 0 || this.f114797h <= 0)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private void m180044c() {
        if (mo160143b()) {
            GradientDrawable a = m180039a(getDefaultBgColor(), this.f114797h, this.f114796g);
            GradientDrawable a2 = m180039a(this.f114794e, this.f114797h, this.f114796g);
            GradientDrawable a3 = m180039a(this.f114795f, this.f114797h, this.f114796g);
            StateListDrawable stateListDrawable = new StateListDrawable();
            if (this.f114803n) {
                a2.setColor(getResources().getColor(17170445));
            }
            if (this.f114794e != 0) {
                stateListDrawable.addState(new int[]{16842919}, a2);
                stateListDrawable.addState(new int[]{16842908}, a2);
                stateListDrawable.addState(new int[]{-16842910}, a3);
            }
            stateListDrawable.addState(new int[0], a);
            setBackground(stateListDrawable);
        }
    }

    /* renamed from: a */
    public void mo160124a() {
        this.f114807r.setMargin(YogaEdge.RIGHT, (float) UIUtils.dp2px(this.f114792c, 6.0f));
        this.f114807r.setWidth((float) this.f114805p);
        this.f114807r.setHeight((float) this.f114806q);
        this.f114804o.setVisibility(0);
        RotateAnimation rotateAnimation = new RotateAnimation(BitmapDescriptorFactory.HUE_RED, 360.0f, 0, ((float) this.f114805p) / 2.0f, 0, ((float) this.f114806q) / 2.0f);
        rotateAnimation.setDuration(1000);
        rotateAnimation.setFillAfter(true);
        rotateAnimation.setInterpolator(new LinearInterpolator());
        rotateAnimation.setRepeatMode(1);
        rotateAnimation.setRepeatCount(-1);
        this.f114804o.setAnimation(rotateAnimation);
    }

    /* renamed from: com.ss.android.lark.message.card.view.richtext.MsgCardRoundedYogaLayout$a */
    public static final class C45342a {

        /* renamed from: a */
        Integer f114808a;

        /* renamed from: b */
        Integer f114809b;

        /* renamed from: c */
        Integer f114810c;

        /* renamed from: d */
        Integer f114811d;

        /* renamed from: e */
        Integer f114812e;

        /* renamed from: f */
        Float f114813f;

        /* renamed from: g */
        Float f114814g;

        /* renamed from: h */
        Float f114815h;

        /* renamed from: i */
        Float f114816i;

        /* renamed from: j */
        Float f114817j;

        /* renamed from: a */
        public C45342a mo160132a(float f) {
            this.f114813f = Float.valueOf(f);
            return this;
        }

        /* renamed from: b */
        public C45342a mo160134b(int i) {
            this.f114809b = Integer.valueOf(i);
            return this;
        }

        /* renamed from: c */
        public C45342a mo160135c(int i) {
            this.f114810c = Integer.valueOf(i);
            return this;
        }

        /* renamed from: d */
        public C45342a mo160136d(int i) {
            this.f114811d = Integer.valueOf(i);
            return this;
        }

        /* renamed from: e */
        public C45342a mo160137e(int i) {
            this.f114812e = Integer.valueOf(i);
            return this;
        }

        /* renamed from: a */
        public C45342a mo160133a(int i) {
            this.f114808a = Integer.valueOf(i);
            return this;
        }
    }

    public MsgCardRoundedYogaLayout(Context context) {
        this(context, null);
    }

    public void setBackgroundColor(int i) {
        this.f114793d = i;
        m180044c();
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f114802m = z;
    }

    public void setLoadingIcon(int i) {
        this.f114804o.setImageResource(i);
    }

    public void setTintColorForLoadingIcon(int i) {
        this.f114804o.setImageDrawable(UDIconUtils.getIconDrawable(this.f114792c, (int) R.drawable.ud_icon_loading_outlined, UDColorUtils.getColor(this.f114792c, i)));
    }

    /* renamed from: a */
    private void m180042a(GradientDrawable gradientDrawable) {
        float f = this.f114790a;
        if (f > BitmapDescriptorFactory.HUE_RED) {
            gradientDrawable.setCornerRadius(f);
            return;
        }
        float f2 = this.f114798i;
        float f3 = this.f114799j;
        float f4 = this.f114801l;
        float f5 = this.f114800k;
        gradientDrawable.setCornerRadii(new float[]{f2, f2, f3, f3, f4, f4, f5, f5});
    }

    /* renamed from: a */
    private void m180040a(Context context) {
        this.f114804o = new ImageView(this.f114792c);
        this.f114804o.setImageDrawable(UDIconUtils.getIconDrawable(this.f114792c, (int) R.drawable.ud_icon_loading_outlined, UDColorUtils.getColor(this.f114792c, R.color.primary_pri_500)));
        addView(this.f114804o);
        this.f114807r = getYogaNodeForView(this.f114804o);
        int dp2px = UIUtils.dp2px(context, 13.0f);
        this.f114806q = dp2px;
        this.f114805p = dp2px;
        this.f114807r.setMargin(YogaEdge.RIGHT, BitmapDescriptorFactory.HUE_RED);
        this.f114807r.setWidth(BitmapDescriptorFactory.HUE_RED);
        this.f114807r.setHeight(BitmapDescriptorFactory.HUE_RED);
        this.f114804o.setVisibility(8);
    }

    public void setCustomizations(C45342a aVar) {
        if (aVar != null) {
            if (aVar.f114808a != null) {
                this.f114793d = aVar.f114808a.intValue();
            }
            if (aVar.f114809b != null) {
                this.f114794e = aVar.f114809b.intValue();
            }
            if (aVar.f114810c != null) {
                this.f114795f = aVar.f114810c.intValue();
            }
            if (aVar.f114812e != null) {
                this.f114797h = aVar.f114812e.intValue();
            }
            if (aVar.f114811d != null) {
                this.f114796g = aVar.f114811d.intValue();
            }
            if (aVar.f114813f != null) {
                this.f114790a = aVar.f114813f.floatValue();
            }
            if (aVar.f114814g != null) {
                this.f114798i = aVar.f114814g.floatValue();
                this.f114799j = aVar.f114815h.floatValue();
                this.f114800k = aVar.f114816i.floatValue();
                this.f114801l = aVar.f114817j.floatValue();
            }
            m180044c();
        }
    }

    /* renamed from: a */
    private void m180041a(TypedArray typedArray) {
        this.f114793d = typedArray.getColor(3, this.f114793d);
        this.f114794e = typedArray.getColor(6, this.f114794e);
        this.f114795f = typedArray.getColor(4, this.f114795f);
        boolean z = typedArray.getBoolean(0, isEnabled());
        this.f114802m = z;
        super.setEnabled(z);
        this.f114796g = typedArray.getColor(1, this.f114796g);
        this.f114797h = (int) typedArray.getDimension(2, (float) this.f114797h);
        float dimension = typedArray.getDimension(7, this.f114790a);
        this.f114790a = dimension;
        this.f114798i = typedArray.getDimension(10, dimension);
        this.f114799j = typedArray.getDimension(11, this.f114790a);
        this.f114800k = typedArray.getDimension(8, this.f114790a);
        this.f114801l = typedArray.getDimension(9, this.f114790a);
        this.f114803n = typedArray.getBoolean(5, this.f114803n);
    }

    /* renamed from: a */
    public void mo160125a(YogaAlign yogaAlign) {
        this.f114807r.setAlignSelf(yogaAlign);
        this.f114807r.setPosition(YogaEdge.RIGHT, BitmapDescriptorFactory.HUE_RED);
        this.f114807r.setPosition(YogaEdge.TOP, 5.0f);
    }

    public MsgCardRoundedYogaLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: com.ss.android.lark.message.card.view.richtext.MsgCardRoundedYogaLayout$b */
    private class C45343b extends ViewOutlineProvider {

        /* renamed from: a */
        int f114818a;

        /* renamed from: b */
        int f114819b;

        public void getOutline(View view, Outline outline) {
            if (MsgCardRoundedYogaLayout.this.f114790a == BitmapDescriptorFactory.HUE_RED) {
                outline.setRect(0, 10, this.f114818a, this.f114819b);
            } else {
                outline.setRoundRect(0, 10, this.f114818a, this.f114819b, MsgCardRoundedYogaLayout.this.f114790a);
            }
        }

        C45343b(int i, int i2) {
            this.f114818a = i;
            this.f114819b = i2;
        }
    }

    /* renamed from: a */
    private GradientDrawable m180039a(int i, int i2, int i3) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i);
        if (i2 > 0 && i3 != 0) {
            gradientDrawable.setStroke(i2, i3);
        }
        m180042a(gradientDrawable);
        return gradientDrawable;
    }

    public MsgCardRoundedYogaLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f114802m = true;
        this.f114792c = context;
        this.f114791b = UIUtils.dp2px(context, 13.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842766, R.attr.fb_borderColor, R.attr.fb_borderWidth, R.attr.fb_defaultColor, R.attr.fb_disabledColor, R.attr.fb_ghost, R.attr.fb_pressedColor, R.attr.fb_radius, R.attr.fb_radiusBottomLeft, R.attr.fb_radiusBottomRight, R.attr.fb_radiusTopLeft, R.attr.fb_radiusTopRight}, i, 0);
        m180041a(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        m180040a(context);
        m180044c();
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        setOutlineProvider(new C45343b(i, i2));
    }
}
