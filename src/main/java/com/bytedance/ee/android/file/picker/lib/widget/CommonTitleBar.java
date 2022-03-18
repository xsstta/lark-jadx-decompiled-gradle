package com.bytedance.ee.android.file.picker.lib.widget;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.p017a.p018a.C0215a;
import com.bytedance.ee.android.file.picker.lib.utils.UIHelper;
import com.bytedance.ee.android.file.picker.lib.widget.AbstractC4130c;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CommonTitleBar extends LinearLayout implements View.OnClickListener, AbstractC4130c {

    /* renamed from: a */
    public Context f12488a;

    /* renamed from: b */
    public LinearLayout f12489b;

    /* renamed from: c */
    public AbstractC4127a f12490c;

    /* renamed from: d */
    private final List<AbstractC4130c.AbstractC4131a> f12491d;

    /* renamed from: e */
    private TextView f12492e;

    /* renamed from: f */
    private TextView f12493f;

    /* renamed from: g */
    private LinearLayout f12494g;

    /* renamed from: h */
    private LinearLayout f12495h;

    /* renamed from: i */
    private TextView f12496i;

    /* renamed from: j */
    private TextView f12497j;

    /* renamed from: k */
    private View f12498k;

    /* renamed from: l */
    private boolean f12499l;

    /* renamed from: m */
    private int f12500m;

    /* renamed from: n */
    private int f12501n;

    /* renamed from: o */
    private int f12502o;

    /* renamed from: p */
    private int f12503p;

    /* renamed from: q */
    private int f12504q;

    /* renamed from: r */
    private int f12505r;

    /* renamed from: s */
    private int f12506s;

    /* renamed from: t */
    private int f12507t;

    /* renamed from: u */
    private boolean f12508u;

    /* renamed from: v */
    private String f12509v;

    /* renamed from: w */
    private int f12510w;

    /* renamed from: x */
    private int f12511x;

    /* renamed from: y */
    private int f12512y;

    /* renamed from: z */
    private boolean f12513z;

    public static class ActionList extends LinkedList<AbstractC4130c.AbstractC4131a> {
    }

    /* renamed from: com.bytedance.ee.android.file.picker.lib.widget.CommonTitleBar$a */
    public interface AbstractC4127a {
        /* renamed from: a */
        void mo16186a(View view);
    }

    public LinearLayout getCenterLayout() {
        return this.f12489b;
    }

    public TextView getCenterText() {
        return this.f12496i;
    }

    public LinearLayout getLeftLayout() {
        return this.f12495h;
    }

    public TextView getLeftText() {
        return this.f12492e;
    }

    /* renamed from: a */
    public void mo16128a(CharSequence charSequence, boolean z) {
        if (charSequence != null) {
            if (z) {
                this.f12489b.removeAllViews();
                this.f12489b.addView(this.f12496i);
                this.f12489b.addView(this.f12497j);
            }
            int indexOf = charSequence.toString().indexOf("\n");
            if (indexOf > 0) {
                m17175a(charSequence.subSequence(0, indexOf), charSequence.subSequence(indexOf + 1, charSequence.length()), 1);
                return;
            }
            int indexOf2 = charSequence.toString().indexOf("\t");
            if (indexOf2 > 0) {
                CharSequence subSequence = charSequence.subSequence(0, indexOf2);
                m17175a(subSequence, " " + ((Object) charSequence.subSequence(indexOf2 + 1, charSequence.length())), 0);
                return;
            }
            this.f12496i.setText(charSequence);
            this.f12497j.setVisibility(8);
        }
    }

    /* renamed from: a */
    public void mo16126a(int i, Drawable drawable) {
        View b;
        if (i < 0 || i >= this.f12491d.size()) {
            i = 0;
        }
        if (this.f12491d.isEmpty()) {
            mo16124a(new AbstractC4130c.C4133c(drawable));
            return;
        }
        AbstractC4130c.AbstractC4131a aVar = this.f12491d.get(i);
        if (aVar != null && (b = mo16129b(aVar)) != null && (b instanceof ImageView)) {
            ((ImageView) b).setImageDrawable(drawable);
        }
    }

    /* renamed from: a */
    public void mo16127a(int i, String str) {
        View b;
        AbstractC4130c.AbstractC4131a aVar = this.f12491d.get(i);
        if (aVar != null && (b = mo16129b(aVar)) != null && (b instanceof TextView)) {
            ((TextView) b).setText(str);
        }
    }

    public int getActionCount() {
        return this.f12494g.getChildCount();
    }

    public TextView getRightText() {
        return mo16130b(0);
    }

    /* renamed from: b */
    private void m17176b() {
        TextView textView = this.f12493f;
        int i = this.f12505r;
        textView.setPadding(i, 0, i, 0);
    }

    public static int getStatusBarHeight() {
        return m17171a(Resources.getSystem(), "status_bar_height");
    }

    public Drawable getLeftDrawable() {
        return this.f12492e.getCompoundDrawables()[0];
    }

    /* renamed from: c */
    private void m17178c() {
        if (this.f12489b != null) {
            final GestureDetector gestureDetector = new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener() {
                /* class com.bytedance.ee.android.file.picker.lib.widget.CommonTitleBar.C41252 */

                public boolean onDoubleTap(MotionEvent motionEvent) {
                    if (CommonTitleBar.this.f12490c == null) {
                        return false;
                    }
                    motionEvent.getRawX();
                    motionEvent.getRawY();
                    CommonTitleBar.this.f12490c.mo16186a(CommonTitleBar.this.f12489b);
                    return true;
                }
            }, new Handler(Looper.getMainLooper()));
            this.f12489b.setOnTouchListener(new View.OnTouchListener() {
                /* class com.bytedance.ee.android.file.picker.lib.widget.CommonTitleBar.View$OnTouchListenerC41263 */

                public boolean onTouch(View view, MotionEvent motionEvent) {
                    gestureDetector.onTouchEvent(motionEvent);
                    return true;
                }
            });
        }
    }

    /* renamed from: a */
    private void m17173a() {
        int i = this.f12503p;
        if (this.f12492e.getText().toString().length() > 0) {
            i = this.f12505r;
        }
        this.f12492e.setPadding(this.f12503p, 0, i, 0);
    }

    public CommonTitleBar(Context context) {
        this(context, null);
    }

    /* renamed from: b */
    public View mo16129b(AbstractC4130c.AbstractC4131a aVar) {
        return findViewWithTag(aVar);
    }

    public void setCenterClickListener(View.OnClickListener onClickListener) {
        this.f12489b.setOnClickListener(onClickListener);
    }

    public void setCenterViewVisible(int i) {
        this.f12489b.setVisibility(i);
    }

    public void setDivider(int i) {
        this.f12498k.setBackgroundResource(i);
    }

    public void setDividerColor(int i) {
        this.f12498k.setBackgroundColor(i);
    }

    public void setIsCenterAlways(boolean z) {
        this.f12508u = z;
        invalidate();
    }

    public void setLeftClickListener(View.OnClickListener onClickListener) {
        this.f12492e.setOnClickListener(onClickListener);
    }

    public void setLeftTextBackground(int i) {
        this.f12492e.setBackgroundResource(i);
    }

    public void setLeftTextColor(int i) {
        this.f12492e.setTextColor(i);
    }

    public void setLeftTextSize(float f) {
        this.f12492e.setTextSize(f);
    }

    public void setMainTitleBackground(int i) {
        this.f12496i.setBackgroundResource(i);
    }

    public void setMainTitleColor(int i) {
        this.f12496i.setTextColor(i);
    }

    public void setMainTitleSize(float f) {
        this.f12496i.setTextSize(f);
    }

    public void setRightImage(Drawable drawable) {
        mo16126a(0, drawable);
    }

    public void setRightText(String str) {
        mo16127a(0, str);
    }

    public void setSecLeftClickListener(View.OnClickListener onClickListener) {
        this.f12493f.setOnClickListener(onClickListener);
    }

    public void setSecLeftTextColor(int i) {
        this.f12493f.setTextColor(i);
    }

    public void setSubTitleBackground(int i) {
        this.f12497j.setBackgroundResource(i);
    }

    public void setSubTitleColor(int i) {
        this.f12497j.setTextColor(i);
    }

    public void setSubTitleSize(float f) {
        this.f12497j.setTextSize(f);
    }

    public void setTitle(CharSequence charSequence) {
        mo16128a(charSequence, false);
    }

    /* renamed from: a */
    public View mo16124a(AbstractC4130c.AbstractC4131a aVar) {
        return mo16125a(aVar, this.f12494g.getChildCount());
    }

    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof AbstractC4130c.AbstractC4131a) {
            ((AbstractC4130c.AbstractC4131a) tag).mo16191a(view);
        }
    }

    public void setDividerHeight(int i) {
        this.f12498k.getLayoutParams().height = i;
    }

    public void setDividerVisible(boolean z) {
        int i;
        View view = this.f12498k;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }

    public void setHeight(int i) {
        this.f12507t = i;
        setMeasuredDimension(getMeasuredWidth(), this.f12507t);
    }

    public void setImmersive(boolean z) {
        this.f12499l = z;
        if (z) {
            this.f12501n = getStatusBarHeight();
        } else {
            this.f12501n = 0;
        }
    }

    public void setLeftImageDrawable(Drawable drawable) {
        this.f12492e.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        m17173a();
    }

    public void setLeftText(int i) {
        this.f12492e.setCompoundDrawablePadding(this.f12502o);
        this.f12492e.setText(i);
        m17173a();
    }

    public void setLeftTextColor(ColorStateList colorStateList) {
        this.f12492e.setTextColor(colorStateList);
    }

    public void setLeftVisible(boolean z) {
        int i;
        TextView textView = this.f12492e;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
    }

    public void setMainTitleTextStyle(int i) {
        TextView textView = this.f12496i;
        textView.setTypeface(textView.getTypeface(), i);
    }

    public void setMainTitleVisible(boolean z) {
        int i;
        TextView textView = this.f12496i;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
    }

    public void setRightVisible(boolean z) {
        int i;
        LinearLayout linearLayout = this.f12494g;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        linearLayout.setVisibility(i);
    }

    public void setSecLeftTextColor(ColorStateList colorStateList) {
        this.f12493f.setTextColor(colorStateList);
    }

    public void setSecLeftTextTypeface(int i) {
        this.f12493f.setTypeface(Typeface.defaultFromStyle(i));
    }

    public void setSecLeftVisible(boolean z) {
        int i;
        TextView textView = this.f12493f;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
    }

    public void setSubTitleVisible(boolean z) {
        int i;
        TextView textView = this.f12497j;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
    }

    public void setTitle(int i) {
        setTitle(UIHelper.f12487a.mo16122a(getContext(), i));
    }

    /* renamed from: a */
    public static int m17170a(int i) {
        return (int) ((((float) i) * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    private void setDefaultTextStyle(TextView textView) {
        Context context = this.f12488a;
        if (context != null) {
            textView.setTextColor(context.getResources().getColor(R.color.file_picker_lkui_grey_8));
            textView.setSingleLine();
            textView.setGravity(16);
            textView.setEllipsize(TextUtils.TruncateAt.END);
        }
    }

    /* renamed from: b */
    public TextView mo16130b(int i) {
        View c = mo16131c(i);
        if (c == null || !(c instanceof TextView)) {
            return null;
        }
        return (TextView) c;
    }

    /* renamed from: c */
    public View mo16131c(int i) {
        AbstractC4130c.AbstractC4131a aVar;
        if (i < 0 || i >= this.f12491d.size() || (aVar = this.f12491d.get(i)) == null) {
            return null;
        }
        return mo16129b(aVar);
    }

    public void setCustomTitleView(View view) {
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.f12489b.removeAllViews();
        this.f12489b.addView(view);
    }

    public void setLeftImageResource(int i) {
        this.f12492e.setCompoundDrawablesWithIntrinsicBounds(C0215a.m655b(getContext(), i), (Drawable) null, (Drawable) null, (Drawable) null);
        m17173a();
    }

    public void setLeftText(CharSequence charSequence) {
        if (charSequence != null) {
            this.f12492e.setCompoundDrawablePadding(this.f12502o);
            this.f12492e.setText(charSequence);
            m17173a();
        }
    }

    public void setSecLeftImageResource(int i) {
        this.f12493f.setCompoundDrawablesWithIntrinsicBounds(C0215a.m655b(getContext(), i), (Drawable) null, (Drawable) null, (Drawable) null);
        m17176b();
    }

    public void setSecLeftText(CharSequence charSequence) {
        if (charSequence != null) {
            this.f12493f.setCompoundDrawablePadding(this.f12502o);
            this.f12493f.setText(charSequence);
            m17176b();
        }
    }

    /* renamed from: a */
    private int m17172a(View view) {
        int i;
        int i2 = this.f12506s;
        if (view == null) {
            return i2;
        }
        if (view.getVisibility() == 8) {
            i = this.f12506s;
        } else {
            i = view.getMeasuredWidth();
        }
        return i;
    }

    /* renamed from: a */
    private void m17174a(Context context) {
        this.f12500m = getResources().getDisplayMetrics().widthPixels;
        if (this.f12499l) {
            this.f12501n = getStatusBarHeight();
        } else {
            this.f12501n = 0;
        }
        this.f12503p = C4128a.m17188a();
        this.f12504q = C4128a.m17192b();
        this.f12505r = m17170a(8);
        this.f12502o = m17170a(0);
        this.f12506s = m17170a(10);
        this.f12507t = context.getResources().getDimensionPixelSize(R.dimen.file_picker_title_height);
        m17177b(context);
    }

    /* renamed from: b */
    private void m17177b(Context context) {
        float f;
        float f2;
        setOrientation(0);
        this.f12492e = new TextView(context);
        this.f12493f = new TextView(context);
        this.f12489b = new LinearLayout(context);
        this.f12494g = new LinearLayout(context);
        this.f12495h = new LinearLayout(context);
        this.f12498k = new View(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        setDefaultTextStyle(this.f12492e);
        TextView textView = this.f12492e;
        float f3 = 14.0f;
        if (DesktopUtil.m144301a(this.f12488a)) {
            f = 14.0f;
        } else {
            f = 17.0f;
        }
        textView.setTextSize(f);
        this.f12492e.setTextColor(getResources().getColorStateList(R.color.file_picker_black_c2_c3_selector));
        this.f12492e.setPadding(this.f12503p, 0, 0, 0);
        this.f12492e.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.android.file.picker.lib.widget.CommonTitleBar.View$OnClickListenerC41241 */

            public void onClick(View view) {
                if (CommonTitleBar.this.f12488a != null && (CommonTitleBar.this.f12488a instanceof Activity)) {
                    ((Activity) CommonTitleBar.this.f12488a).finish();
                }
            }
        });
        setDefaultTextStyle(this.f12493f);
        TextView textView2 = this.f12493f;
        if (!DesktopUtil.m144301a(this.f12488a)) {
            f3 = 17.0f;
        }
        textView2.setTextSize(f3);
        this.f12493f.setTextColor(getResources().getColorStateList(R.color.file_picker_black_c2_c3_selector));
        this.f12496i = new TextView(context);
        this.f12497j = new TextView(context);
        this.f12489b.addView(this.f12496i);
        this.f12489b.addView(this.f12497j);
        this.f12489b.setGravity(17);
        setDefaultTextStyle(this.f12496i);
        setDefaultTextStyle(this.f12497j);
        TextView textView3 = this.f12496i;
        if (DesktopUtil.m144301a(this.f12488a)) {
            f2 = 16.0f;
        } else {
            f2 = 18.0f;
        }
        textView3.setTextSize(f2);
        this.f12496i.setTextColor(this.f12511x);
        this.f12496i.setGravity(17);
        this.f12497j.setTextSize(12.0f);
        this.f12497j.setTextColor(context.getResources().getColor(R.color.file_picker_black));
        this.f12497j.setGravity(17);
        this.f12494g.setPadding(this.f12503p, 0, 0, 0);
        this.f12495h.setPadding(this.f12503p, 0, 0, 0);
        this.f12495h.setGravity(16);
        this.f12498k.setBackgroundColor(context.getResources().getColor(R.color.file_picker_lkui_grey_3));
        addView(this.f12492e, layoutParams);
        addView(this.f12493f, layoutParams);
        addView(this.f12495h, layoutParams);
        addView(this.f12489b);
        addView(this.f12494g, layoutParams);
        addView(this.f12498k, new LinearLayout.LayoutParams(-1, 1));
        setBackgroundColor(this.f12510w);
        setTitle(this.f12509v);
        setLeftImageResource(this.f12512y);
        setDividerVisible(this.f12513z);
        m17178c();
    }

    public CommonTitleBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private static int m17171a(Resources resources, String str) {
        int identifier = resources.getIdentifier(str, "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            int i5 = this.f12507t;
            i3 = this.f12501n + i5;
            i2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        } else {
            i3 = View.MeasureSpec.getSize(i2) + this.f12501n;
        }
        measureChild(this.f12492e, i, i2);
        measureChild(this.f12493f, i, i2);
        measureChild(this.f12495h, i, i2);
        measureChild(this.f12494g, i, i2);
        int measuredWidth = this.f12492e.getMeasuredWidth();
        if (this.f12493f.getVisibility() != 8) {
            i4 = this.f12493f.getMeasuredWidth();
        } else {
            i4 = 0;
        }
        int i6 = measuredWidth + i4;
        if (this.f12495h.getVisibility() != 8) {
            i6 = Math.max(i6, this.f12495h.getMeasuredWidth());
        }
        int measuredWidth2 = this.f12494g.getMeasuredWidth();
        if (!this.f12508u) {
            this.f12489b.measure(View.MeasureSpec.makeMeasureSpec(((this.f12500m - m17172a(this.f12492e)) - m17172a(this.f12493f)) - m17172a(this.f12494g), 1073741824), i2);
        } else if (i6 > measuredWidth2) {
            this.f12489b.measure(View.MeasureSpec.makeMeasureSpec(this.f12500m - (i6 * 2), 1073741824), i2);
        } else {
            this.f12489b.measure(View.MeasureSpec.makeMeasureSpec(this.f12500m - (measuredWidth2 * 2), 1073741824), i2);
        }
        measureChild(this.f12498k, i, i2);
        setMeasuredDimension(View.MeasureSpec.getSize(i), i3);
    }

    /* renamed from: a */
    public View mo16125a(AbstractC4130c.AbstractC4131a aVar, int i) {
        if (aVar == null) {
            return null;
        }
        this.f12491d.add(i, aVar);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        View a = C4128a.m17190a(getContext(), aVar);
        a.setTag(aVar);
        a.setOnClickListener(this);
        this.f12494g.addView(a, i, layoutParams);
        return a;
    }

    public CommonTitleBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12491d = new ArrayList();
        this.f12508u = true;
        this.f12509v = "";
        this.f12510w = 16382457;
        this.f12511x = 3752003;
        this.f12512y = R.drawable.file_picker_titlebar_back_bg_selector;
        this.f12513z = false;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.tb_back_icon, R.attr.tb_background, R.attr.tb_divider_visible, R.attr.tb_left_icon, R.attr.tb_left_padding, R.attr.tb_left_text, R.attr.tb_left_text_color, R.attr.tb_left_text_size, R.attr.tb_left_type, R.attr.tb_right_padding, R.attr.tb_right_text, R.attr.tb_right_text_color, R.attr.tb_right_text_size, R.attr.tb_title, R.attr.tb_title_color, R.attr.tb_title_text, R.attr.tb_title_text_size, R.attr.tb_use_defalut_selector});
        this.f12509v = obtainStyledAttributes.getString(13);
        this.f12510w = obtainStyledAttributes.getColor(1, context.getResources().getColor(R.color.file_picker_lkui_grey_1));
        this.f12511x = obtainStyledAttributes.getColor(14, context.getResources().getColor(R.color.file_picker_black));
        this.f12512y = obtainStyledAttributes.getResourceId(0, R.drawable.file_picker_titlebar_back_bg_selector);
        this.f12513z = obtainStyledAttributes.getBoolean(2, false);
        obtainStyledAttributes.recycle();
        this.f12488a = context;
        m17174a(context);
    }

    /* renamed from: a */
    private void m17175a(CharSequence charSequence, CharSequence charSequence2, int i) {
        this.f12489b.setOrientation(i);
        this.f12496i.setText(charSequence);
        this.f12497j.setVisibility(8);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        TextView textView = this.f12492e;
        textView.layout(0, this.f12501n, textView.getMeasuredWidth(), this.f12492e.getMeasuredHeight() + this.f12501n);
        this.f12493f.layout(this.f12492e.getMeasuredWidth(), this.f12501n, this.f12492e.getMeasuredWidth() + this.f12493f.getMeasuredWidth(), this.f12493f.getMeasuredHeight() + this.f12501n);
        LinearLayout linearLayout = this.f12495h;
        linearLayout.layout(0, this.f12501n, linearLayout.getMeasuredWidth(), this.f12495h.getMeasuredHeight() + this.f12501n);
        LinearLayout linearLayout2 = this.f12494g;
        linearLayout2.layout(this.f12500m - linearLayout2.getMeasuredWidth(), this.f12501n, this.f12500m, this.f12494g.getMeasuredHeight() + this.f12501n);
        int measuredWidth = this.f12492e.getMeasuredWidth();
        if (this.f12493f.getVisibility() != 8) {
            i5 = this.f12493f.getMeasuredWidth();
        } else {
            i5 = 0;
        }
        int max = Math.max(measuredWidth + i5, this.f12495h.getMeasuredWidth());
        int measuredWidth2 = this.f12494g.getMeasuredWidth();
        if (!this.f12508u) {
            LinearLayout linearLayout3 = this.f12489b;
            int a = m17172a(this.f12492e);
            int i10 = this.f12501n;
            if (DesktopUtil.m144301a(this.f12488a)) {
                i6 = getMeasuredWidth();
                i7 = m17172a(this.f12494g);
            } else {
                i6 = this.f12500m;
                i7 = m17172a(this.f12494g);
            }
            linearLayout3.layout(a, i10, i6 - i7, getMeasuredHeight());
        } else if (max > measuredWidth2) {
            LinearLayout linearLayout4 = this.f12489b;
            int i11 = this.f12501n;
            if (DesktopUtil.m144301a(this.f12488a)) {
                i9 = getMeasuredWidth();
            } else {
                i9 = this.f12500m;
            }
            linearLayout4.layout(max, i11, i9 - max, getMeasuredHeight());
        } else {
            LinearLayout linearLayout5 = this.f12489b;
            int i12 = this.f12501n;
            if (DesktopUtil.m144301a(this.f12488a)) {
                i8 = getMeasuredWidth();
            } else {
                i8 = this.f12500m;
            }
            linearLayout5.layout(measuredWidth2, i12, i8 - measuredWidth2, getMeasuredHeight());
        }
        this.f12498k.layout(0, getMeasuredHeight() - this.f12498k.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
    }
}
