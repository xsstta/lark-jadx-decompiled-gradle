package com.ss.android.lark.ui;

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
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CommonTitleBar extends LinearLayout implements View.OnClickListener, IActionTitlebar {
    private boolean isCenterAlways;
    private final List<IActionTitlebar.Action> mActionList;
    private int mBackIconRes;
    private int mBackground;
    public LinearLayout mCenterLayout;
    private TextView mCenterText;
    public Context mContext;
    private View mDividerView;
    private boolean mDividerVisible;
    private int mHeight;
    private boolean mImmersive;
    private int mLeftDrawablePadding;
    private LinearLayout mLeftLayout;
    private TextView mLeftText;
    private int mLeftTextPadding;
    private int mMinSidePadding;
    private int mOutLeftPadding;
    private int mOutPadding;
    private LinearLayout mRightLayout;
    private int mScreenWidth;
    private TextView mSecLeftText;
    private int mStatusBarHeight;
    private TextView mSubTitleText;
    private String mTitle;
    private int mTitleColor;
    public AbstractC57569a mTitleDoubleTapListener;

    public static class ActionList extends LinkedList<IActionTitlebar.Action> {
    }

    /* renamed from: com.ss.android.lark.ui.CommonTitleBar$a */
    public interface AbstractC57569a {
        /* renamed from: a */
        void mo195514a(View view);
    }

    public LinearLayout getCenterLayout() {
        return this.mCenterLayout;
    }

    public TextView getCenterText() {
        return this.mCenterText;
    }

    public LinearLayout getLeftLayout() {
        return this.mLeftLayout;
    }

    public TextView getLeftText() {
        return this.mLeftText;
    }

    public int getActionCount() {
        return this.mRightLayout.getChildCount();
    }

    public List<IActionTitlebar.Action> getAllActions() {
        return new ArrayList(this.mActionList);
    }

    public TextView getRightText() {
        return getRightText(0);
    }

    private void adjustSecLeftTextPadding() {
        TextView textView = this.mSecLeftText;
        int i = this.mLeftTextPadding;
        textView.setPadding(i, 0, i, 0);
    }

    public static int getStatusBarHeight() {
        return C57582a.m223602a(Resources.getSystem(), "status_bar_height");
    }

    public Drawable getLeftDrawable() {
        return this.mLeftText.getCompoundDrawables()[0];
    }

    public void hideRightAndRemoveActions() {
        this.mRightLayout.setVisibility(8);
        this.mActionList.clear();
    }

    @Override // com.ss.android.lark.ui.IActionTitlebar
    public void removeAllActions() {
        this.mRightLayout.removeAllViews();
        this.mActionList.clear();
    }

    private void adjustLeftTextPadding() {
        int i = this.mOutPadding;
        if (this.mLeftText.getText().toString().length() > 0) {
            i = this.mLeftTextPadding;
        }
        this.mLeftText.setPadding(this.mOutPadding, 0, i, 0);
    }

    private void detectTitleTap() {
        if (this.mCenterLayout != null) {
            final GestureDetector gestureDetector = new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener() {
                /* class com.ss.android.lark.ui.CommonTitleBar.C575672 */

                public boolean onDoubleTap(MotionEvent motionEvent) {
                    if (CommonTitleBar.this.mTitleDoubleTapListener == null) {
                        return false;
                    }
                    motionEvent.getRawX();
                    motionEvent.getRawY();
                    CommonTitleBar.this.mTitleDoubleTapListener.mo195514a(CommonTitleBar.this.mCenterLayout);
                    return true;
                }
            }, new Handler(Looper.getMainLooper()));
            this.mCenterLayout.setOnTouchListener(new View.OnTouchListener() {
                /* class com.ss.android.lark.ui.CommonTitleBar.View$OnTouchListenerC575683 */

                public boolean onTouch(View view, MotionEvent motionEvent) {
                    gestureDetector.onTouchEvent(motionEvent);
                    return true;
                }
            });
        }
    }

    public void registerTitleDoubleTapListener(AbstractC57569a aVar) {
        this.mTitleDoubleTapListener = aVar;
    }

    public CommonTitleBar(Context context) {
        this(context, null);
    }

    public View getViewByAction(IActionTitlebar.Action action) {
        return findViewWithTag(action);
    }

    public void setCenterClickListener(View.OnClickListener onClickListener) {
        this.mCenterLayout.setOnClickListener(onClickListener);
    }

    public void setCenterViewVisible(int i) {
        this.mCenterLayout.setVisibility(i);
    }

    public void setDivider(int i) {
        this.mDividerView.setBackgroundResource(i);
    }

    public void setDividerColor(int i) {
        this.mDividerView.setBackgroundColor(i);
    }

    public void setIsCenterAlways(boolean z) {
        this.isCenterAlways = z;
        invalidate();
    }

    public void setLeftClickListener(View.OnClickListener onClickListener) {
        this.mLeftText.setOnClickListener(onClickListener);
    }

    public void setLeftImageResource(int i) {
        setLeftImageResource(i, R.color.icon_n1);
    }

    public void setLeftTextBackground(int i) {
        this.mLeftText.setBackgroundResource(i);
    }

    public void setLeftTextColor(int i) {
        this.mLeftText.setTextColor(i);
    }

    public void setLeftTextOnly(int i) {
        setLeftText(i);
        setLeftImageDrawable(null);
    }

    public void setLeftTextSize(float f) {
        this.mLeftText.setTextSize(f);
    }

    public void setMainTitleBackground(int i) {
        this.mCenterText.setBackgroundResource(i);
    }

    public void setMainTitleColor(int i) {
        this.mCenterText.setTextColor(i);
    }

    public void setMainTitleSize(float f) {
        this.mCenterText.setTextSize(f);
    }

    public void setRightImage(Drawable drawable) {
        setRightImage(0, drawable);
    }

    public void setRightText(String str) {
        setRightText(0, str);
    }

    public void setSecLeftClickListener(View.OnClickListener onClickListener) {
        this.mSecLeftText.setOnClickListener(onClickListener);
    }

    public void setSecLeftTextColor(int i) {
        this.mSecLeftText.setTextColor(i);
    }

    public void setSubTitleBackground(int i) {
        this.mSubTitleText.setBackgroundResource(i);
    }

    public void setSubTitleColor(int i) {
        this.mSubTitleText.setTextColor(i);
    }

    public void setSubTitleSize(float f) {
        this.mSubTitleText.setTextSize(f);
    }

    @Override // com.ss.android.lark.ui.IActionTitlebar
    public void setTitle(CharSequence charSequence) {
        setTitle(charSequence, false);
    }

    @Override // com.ss.android.lark.ui.IActionTitlebar
    public View addAction(IActionTitlebar.Action action) {
        return addAction(action, this.mRightLayout.getChildCount());
    }

    public TextView getRightText(int i) {
        View rightView = getRightView(i);
        if (rightView == null || !(rightView instanceof TextView)) {
            return null;
        }
        return (TextView) rightView;
    }

    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof IActionTitlebar.Action) {
            ((IActionTitlebar.Action) tag).performAction(view);
        }
    }

    public void removeActionAt(int i) {
        this.mRightLayout.removeViewAt(i);
        this.mActionList.remove(i);
    }

    public void setDividerHeight(int i) {
        this.mDividerView.getLayoutParams().height = i;
    }

    public void setDividerVisible(boolean z) {
        int i;
        View view = this.mDividerView;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }

    public void setHeight(int i) {
        this.mHeight = i;
        setMeasuredDimension(getMeasuredWidth(), this.mHeight);
    }

    public void setImmersive(boolean z) {
        this.mImmersive = z;
        if (z) {
            this.mStatusBarHeight = getStatusBarHeight();
        } else {
            this.mStatusBarHeight = 0;
        }
    }

    public void setLeftText(int i) {
        this.mLeftText.setCompoundDrawablePadding(this.mLeftDrawablePadding);
        this.mLeftText.setText(i);
        adjustLeftTextPadding();
    }

    public void setLeftTextColor(ColorStateList colorStateList) {
        this.mLeftText.setTextColor(colorStateList);
    }

    public void setLeftTextOnly(CharSequence charSequence) {
        setLeftText(charSequence);
        setLeftImageDrawable(null);
    }

    public void setLeftVisible(boolean z) {
        int i;
        TextView textView = this.mLeftText;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
    }

    public void setMainTitleTextStyle(int i) {
        TextView textView = this.mCenterText;
        textView.setTypeface(textView.getTypeface(), i);
    }

    public void setMainTitleVisible(boolean z) {
        int i;
        TextView textView = this.mCenterText;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
    }

    public void setRightVisible(boolean z) {
        int i;
        LinearLayout linearLayout = this.mRightLayout;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        linearLayout.setVisibility(i);
    }

    public void setSecLeftTextColor(ColorStateList colorStateList) {
        this.mSecLeftText.setTextColor(colorStateList);
    }

    public void setSecLeftTextTypeface(int i) {
        this.mSecLeftText.setTypeface(Typeface.defaultFromStyle(i));
    }

    public void setSecLeftVisible(boolean z) {
        int i;
        TextView textView = this.mSecLeftText;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
    }

    public void setSubTitleVisible(boolean z) {
        int i;
        TextView textView = this.mSubTitleText;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
    }

    public void setTitle(int i) {
        setTitle(C57582a.m223604a(getContext(), i));
    }

    public void setTitleMaxLines(int i) {
        if (i == 1) {
            this.mCenterText.setSingleLine();
        }
        this.mCenterText.setMaxLines(i);
    }

    public void updateTitleBarWidth(int i) {
        if (i > 0) {
            this.mScreenWidth = i;
            requestLayout();
        }
    }

    private int getVisibleWidth(View view) {
        if (view == null || view.getVisibility() == 8) {
            return 0;
        }
        return view.getMeasuredWidth();
    }

    private void setDefaultTextStyle(TextView textView) {
        Context context = this.mContext;
        if (context != null) {
            textView.setTextColor(context.getResources().getColor(R.color.text_title));
            textView.setSingleLine();
            textView.setGravity(16);
            textView.setEllipsize(TextUtils.TruncateAt.END);
        }
    }

    public void addActions(ActionList actionList) {
        int size = actionList.size();
        for (int i = 0; i < size; i++) {
            addAction((IActionTitlebar.Action) actionList.get(i));
        }
    }

    public View getRightView(int i) {
        IActionTitlebar.Action action;
        if (i < 0 || i >= this.mActionList.size() || (action = this.mActionList.get(i)) == null) {
            return null;
        }
        return getViewByAction(action);
    }

    public void setCustomTitleView(View view) {
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.mCenterLayout.removeAllViews();
        this.mCenterLayout.addView(view);
    }

    public void setLeftText(CharSequence charSequence) {
        if (charSequence != null) {
            this.mLeftText.setCompoundDrawablePadding(this.mLeftDrawablePadding);
            this.mLeftText.setText(charSequence);
            adjustLeftTextPadding();
        }
    }

    public void setSecLeftImageResource(int i) {
        this.mSecLeftText.setCompoundDrawablesWithIntrinsicBounds(C57582a.m223617e(getContext(), i), (Drawable) null, (Drawable) null, (Drawable) null);
        adjustSecLeftTextPadding();
    }

    public void setSecLeftText(CharSequence charSequence) {
        if (charSequence != null) {
            this.mSecLeftText.setCompoundDrawablePadding(this.mLeftDrawablePadding);
            this.mSecLeftText.setText(charSequence);
            adjustSecLeftTextPadding();
        }
    }

    public void removeAction(IActionTitlebar.Action action) {
        int childCount = this.mRightLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.mRightLayout.getChildAt(i);
            if (childAt != null) {
                Object tag = childAt.getTag();
                if ((tag instanceof IActionTitlebar.Action) && tag.equals(action)) {
                    this.mRightLayout.removeView(childAt);
                    this.mActionList.remove(tag);
                }
            }
        }
    }

    public void setLeftImageDrawable(Drawable drawable) {
        if (!DesktopUtil.m144301a(this.mContext)) {
            this.mLeftText.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        } else if (drawable != null) {
            drawable.setBounds(0, 0, UIHelper.dp2px(18.0f), UIHelper.dp2px(18.0f));
            this.mLeftText.setCompoundDrawables(drawable, null, null, null);
        } else {
            this.mLeftText.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        adjustLeftTextPadding();
    }

    private void init(Context context) {
        this.mScreenWidth = getResources().getDisplayMetrics().widthPixels;
        if (this.mImmersive) {
            this.mStatusBarHeight = getStatusBarHeight();
        } else {
            this.mStatusBarHeight = 0;
        }
        this.mOutPadding = C57580a.m223594a();
        this.mOutLeftPadding = C57580a.m223598b();
        this.mLeftTextPadding = C57582a.m223600a(8);
        this.mLeftDrawablePadding = C57582a.m223600a(0);
        this.mMinSidePadding = C57582a.m223600a(8);
        this.mHeight = context.getResources().getDimensionPixelSize(R.dimen.title_height);
        initView(context);
    }

    private void initView(Context context) {
        setOrientation(0);
        this.mLeftText = new TextView(context);
        this.mSecLeftText = new TextView(context);
        this.mCenterLayout = new LinearLayout(context);
        this.mRightLayout = new LinearLayout(context);
        this.mLeftLayout = new LinearLayout(context);
        this.mDividerView = new View(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        setDefaultTextStyle(this.mLeftText);
        this.mLeftText.setTextSize((float) CommonTitleBarConstants.DEFAULT_LEFT_TEXT_SIZE);
        this.mLeftText.setTextColor(getResources().getColorStateList(R.color.black_c2_c3_selector));
        this.mLeftText.setPadding(this.mOutPadding, 0, 0, 0);
        this.mLeftText.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.ui.CommonTitleBar.View$OnClickListenerC575661 */

            public void onClick(View view) {
                if (CommonTitleBar.this.mContext != null && (CommonTitleBar.this.mContext instanceof Activity)) {
                    ((Activity) CommonTitleBar.this.mContext).finish();
                }
            }
        });
        setDefaultTextStyle(this.mSecLeftText);
        this.mSecLeftText.setTextSize((float) CommonTitleBarConstants.DEFAULT_LEFT_TEXT_SIZE);
        this.mSecLeftText.setTextColor(getResources().getColorStateList(R.color.black_c2_c3_selector));
        this.mCenterText = new TextView(context);
        this.mSubTitleText = new TextView(context);
        this.mCenterLayout.addView(this.mCenterText);
        this.mCenterLayout.addView(this.mSubTitleText);
        this.mCenterLayout.setGravity(17);
        setDefaultTextStyle(this.mCenterText);
        setDefaultTextStyle(this.mSubTitleText);
        this.mCenterText.setTextSize((float) CommonTitleBarConstants.DEFAULT_MAIN_TEXT_SIZE);
        this.mCenterText.setTextColor(this.mTitleColor);
        this.mCenterText.setGravity(17);
        this.mSubTitleText.setTextSize((float) CommonTitleBarConstants.DEFAULT_SUB_TEXT_SIZE);
        this.mSubTitleText.setTextColor(context.getResources().getColor(R.color.text_title));
        this.mSubTitleText.setGravity(17);
        this.mRightLayout.setPadding(0, 0, 0, 0);
        this.mLeftLayout.setPadding(this.mOutPadding, 0, 0, 0);
        this.mLeftLayout.setGravity(16);
        this.mDividerView.setBackgroundColor(context.getResources().getColor(R.color.line_divider_default));
        addView(this.mLeftText, layoutParams);
        addView(this.mSecLeftText, layoutParams);
        addView(this.mLeftLayout, layoutParams);
        addView(this.mCenterLayout, layoutParams);
        addView(this.mRightLayout, layoutParams);
        addView(this.mDividerView, new LinearLayout.LayoutParams(-1, 1));
        setBackgroundColor(this.mBackground);
        setTitle(this.mTitle);
        setLeftImageResource(this.mBackIconRes);
        setDividerVisible(this.mDividerVisible);
        detectTitleTap();
    }

    public CommonTitleBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public View addAction(IActionTitlebar.Action action, ViewGroup.LayoutParams layoutParams) {
        if (action == null) {
            return null;
        }
        int childCount = this.mRightLayout.getChildCount();
        View a = C57580a.m223596a(getContext(), action);
        a.setTag(action);
        a.setOnClickListener(this);
        this.mRightLayout.addView(a, childCount, layoutParams);
        return a;
    }

    public void setRightText(int i, String str) {
        View viewByAction;
        IActionTitlebar.Action action = this.mActionList.get(i);
        if (action != null && (viewByAction = getViewByAction(action)) != null && (viewByAction instanceof TextView)) {
            ((TextView) viewByAction).setText(str);
        }
    }

    public View addAction(IActionTitlebar.Action action, int i) {
        if (action == null) {
            return null;
        }
        this.mActionList.add(i, action);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        View a = C57580a.m223596a(getContext(), action);
        a.setTag(action);
        a.setOnClickListener(this);
        this.mRightLayout.addView(a, i, layoutParams);
        return a;
    }

    public void setLeftImageResource(int i, int i2) {
        Drawable iconDrawable = UDIconUtils.getIconDrawable(getContext(), i, UIUtils.getColor(getContext(), i2));
        if (!DesktopUtil.m144301a(this.mContext)) {
            this.mLeftText.setCompoundDrawablesWithIntrinsicBounds(iconDrawable, (Drawable) null, (Drawable) null, (Drawable) null);
        } else if (iconDrawable != null) {
            iconDrawable.setBounds(0, 0, UIHelper.dp2px(18.0f), UIHelper.dp2px(18.0f));
            this.mLeftText.setCompoundDrawables(iconDrawable, null, null, null);
        } else {
            this.mLeftText.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        adjustLeftTextPadding();
    }

    public void setSecLeftImageResource(int i, int i2) {
        this.mSecLeftText.setCompoundDrawablesWithIntrinsicBounds(UDIconUtils.getIconDrawable(getContext(), i, UIUtils.getColor(getContext(), i2)), (Drawable) null, (Drawable) null, (Drawable) null);
        adjustSecLeftTextPadding();
    }

    public void setRightImage(int i, Drawable drawable) {
        View viewByAction;
        if (i < 0 || i >= this.mActionList.size()) {
            i = 0;
        }
        if (this.mActionList.isEmpty()) {
            addAction(new IActionTitlebar.C57573a(drawable));
            return;
        }
        IActionTitlebar.Action action = this.mActionList.get(i);
        if (action != null && (viewByAction = getViewByAction(action)) != null && (viewByAction instanceof ImageView)) {
            ImageView imageView = (ImageView) viewByAction;
            imageView.setImageDrawable(drawable);
            imageView.setImageTintList(getContext().getResources().getColorStateList(R.color.icon_n1));
        }
    }

    public void setTitle(CharSequence charSequence, boolean z) {
        if (charSequence != null) {
            if (z) {
                this.mCenterLayout.removeAllViews();
                this.mCenterLayout.addView(this.mCenterText);
                this.mCenterLayout.addView(this.mSubTitleText);
            }
            int indexOf = charSequence.toString().indexOf("\n");
            if (indexOf > 0) {
                setTitle(charSequence.subSequence(0, indexOf), charSequence.subSequence(indexOf + 1, charSequence.length()), 1);
                return;
            }
            int indexOf2 = charSequence.toString().indexOf("\t");
            if (indexOf2 > 0) {
                CharSequence subSequence = charSequence.subSequence(0, indexOf2);
                setTitle(subSequence, " " + ((Object) charSequence.subSequence(indexOf2 + 1, charSequence.length())), 0);
                return;
            }
            this.mCenterText.setText(charSequence);
            this.mSubTitleText.setVisibility(8);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            int i4 = this.mHeight;
            i3 = this.mStatusBarHeight + i4;
            i2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        } else {
            i3 = View.MeasureSpec.getSize(i2) + this.mStatusBarHeight;
        }
        measureChild(this.mRightLayout, i, i2);
        measureChild(this.mLeftText, i, i2);
        measureChild(this.mSecLeftText, i, i2);
        int visibleWidth = getVisibleWidth(this.mRightLayout) + this.mMinSidePadding;
        measureChild(this.mLeftLayout, View.MeasureSpec.makeMeasureSpec(this.mScreenWidth - visibleWidth, Integer.MIN_VALUE), i2);
        int max = Math.max(getVisibleWidth(this.mLeftText) + getVisibleWidth(this.mSecLeftText), getVisibleWidth(this.mLeftLayout)) + this.mMinSidePadding;
        if (!this.isCenterAlways) {
            this.mCenterLayout.measure(View.MeasureSpec.makeMeasureSpec((this.mScreenWidth - max) - visibleWidth, Integer.MIN_VALUE), i2);
        } else if (max > visibleWidth) {
            this.mCenterLayout.measure(View.MeasureSpec.makeMeasureSpec(this.mScreenWidth - (max * 2), 1073741824), i2);
        } else {
            this.mCenterLayout.measure(View.MeasureSpec.makeMeasureSpec(this.mScreenWidth - (visibleWidth * 2), 1073741824), i2);
        }
        measureChild(this.mDividerView, i, i2);
        setMeasuredDimension(View.MeasureSpec.getSize(i), i3);
    }

    private void setTitle(CharSequence charSequence, CharSequence charSequence2, int i) {
        this.mCenterLayout.setOrientation(i);
        this.mCenterText.setText(charSequence);
        this.mSubTitleText.setText(charSequence2);
        this.mSubTitleText.setVisibility(0);
    }

    public void setRightText(int i, String str, int i2) {
        View viewByAction;
        IActionTitlebar.Action action = this.mActionList.get(i);
        if (action != null && (viewByAction = getViewByAction(action)) != null && (viewByAction instanceof TextView)) {
            TextView textView = (TextView) viewByAction;
            textView.setText(str);
            textView.setTextColor(i2);
        }
    }

    public CommonTitleBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mActionList = new ArrayList();
        this.isCenterAlways = false;
        this.mTitle = "";
        this.mDividerVisible = false;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.tb_back_icon, R.attr.tb_background, R.attr.tb_divider_visible, R.attr.tb_left_icon, R.attr.tb_left_padding, R.attr.tb_left_text, R.attr.tb_left_text_color, R.attr.tb_left_text_size, R.attr.tb_left_type, R.attr.tb_right_padding, R.attr.tb_right_text, R.attr.tb_right_text_color, R.attr.tb_right_text_size, R.attr.tb_title, R.attr.tb_title_color, R.attr.tb_title_text, R.attr.tb_title_text_size, R.attr.tb_use_defalut_selector});
        this.mTitle = obtainStyledAttributes.getString(13);
        this.mBackground = obtainStyledAttributes.getColor(1, context.getResources().getColor(R.color.bg_body));
        this.mTitleColor = obtainStyledAttributes.getColor(14, context.getResources().getColor(R.color.text_title));
        this.mBackIconRes = obtainStyledAttributes.getResourceId(0, CommonTitleBarConstants.ICON_BACK);
        this.mDividerVisible = obtainStyledAttributes.getBoolean(2, false);
        obtainStyledAttributes.recycle();
        this.mContext = context;
        init(context);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.mScreenWidth != i) {
            this.mScreenWidth = i;
            requestLayout();
        }
    }

    public void setLeftTextPadding(int i, int i2, int i3, int i4) {
        this.mLeftText.setPadding(C57582a.m223600a(i), C57582a.m223600a(i2), C57582a.m223600a(i3), C57582a.m223600a(i4));
    }

    public void setSecLeftTextPadding(int i, int i2, int i3, int i4) {
        this.mSecLeftText.setPadding(C57582a.m223600a(i), C57582a.m223600a(i2), C57582a.m223600a(i3), C57582a.m223600a(i4));
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        TextView textView = this.mLeftText;
        textView.layout(0, this.mStatusBarHeight, textView.getMeasuredWidth(), this.mLeftText.getMeasuredHeight() + this.mStatusBarHeight);
        this.mSecLeftText.layout(this.mLeftText.getMeasuredWidth(), this.mStatusBarHeight, this.mLeftText.getMeasuredWidth() + this.mSecLeftText.getMeasuredWidth(), this.mSecLeftText.getMeasuredHeight() + this.mStatusBarHeight);
        LinearLayout linearLayout = this.mLeftLayout;
        linearLayout.layout(0, this.mStatusBarHeight, linearLayout.getMeasuredWidth(), this.mLeftLayout.getMeasuredHeight() + this.mStatusBarHeight);
        LinearLayout linearLayout2 = this.mRightLayout;
        linearLayout2.layout(this.mScreenWidth - linearLayout2.getMeasuredWidth(), this.mStatusBarHeight, this.mScreenWidth, this.mRightLayout.getMeasuredHeight() + this.mStatusBarHeight);
        int max = Math.max(getVisibleWidth(this.mLeftText) + getVisibleWidth(this.mSecLeftText), getVisibleWidth(this.mLeftLayout)) + this.mMinSidePadding;
        int visibleWidth = getVisibleWidth(this.mRightLayout) + this.mMinSidePadding;
        if (this.isCenterAlways) {
            if (max > visibleWidth) {
                this.mCenterLayout.layout(max, this.mStatusBarHeight, this.mScreenWidth - max, getMeasuredHeight());
            } else {
                this.mCenterLayout.layout(visibleWidth, this.mStatusBarHeight, this.mScreenWidth - visibleWidth, getMeasuredHeight());
            }
            this.mDividerView.layout(0, getMeasuredHeight() - this.mDividerView.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        int i5 = this.mScreenWidth;
        int i6 = (i5 / 2) - max;
        int i7 = (i5 / 2) - visibleWidth;
        int min = Math.min(i6, i7) * 2;
        int measuredWidth = this.mCenterLayout.getMeasuredWidth();
        if (measuredWidth <= min) {
            LinearLayout linearLayout3 = this.mCenterLayout;
            int i8 = this.mScreenWidth;
            int i9 = measuredWidth / 2;
            linearLayout3.layout((i8 / 2) - i9, this.mStatusBarHeight, (i8 / 2) + i9, getMeasuredHeight());
        } else if (i6 > i7) {
            LinearLayout linearLayout4 = this.mCenterLayout;
            int i10 = this.mScreenWidth;
            linearLayout4.layout((i10 - measuredWidth) - visibleWidth, this.mStatusBarHeight, i10 - visibleWidth, getMeasuredHeight());
        } else {
            this.mCenterLayout.layout(max, this.mStatusBarHeight, measuredWidth + max, getMeasuredHeight());
        }
    }
}
