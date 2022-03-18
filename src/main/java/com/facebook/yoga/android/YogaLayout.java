package com.facebook.yoga.android;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.yoga.YogaAlign;
import com.facebook.yoga.YogaDirection;
import com.facebook.yoga.YogaDisplay;
import com.facebook.yoga.YogaEdge;
import com.facebook.yoga.YogaFlexDirection;
import com.facebook.yoga.YogaJustify;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaMeasureMode;
import com.facebook.yoga.YogaMeasureOutput;
import com.facebook.yoga.YogaNode;
import com.facebook.yoga.YogaOverflow;
import com.facebook.yoga.YogaPositionType;
import com.facebook.yoga.YogaWrap;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import java.util.HashMap;
import java.util.Map;

public class YogaLayout extends ViewGroup {
    private final YogaNode mYogaNode;
    private final Map<View, YogaNode> mYogaNodes;

    public YogaNode getYogaNode() {
        return this.mYogaNode;
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    public void removeAllViews() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            removeViewFromYogaTree(getChildAt(i), false);
        }
        super.removeAllViews();
    }

    public void removeAllViewsInLayout() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            removeViewFromYogaTree(getChildAt(i), true);
        }
        super.removeAllViewsInLayout();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public YogaLayout(Context context) {
        this(context, null, 0);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public void removeView(View view) {
        removeViewFromYogaTree(view, false);
        super.removeView(view);
    }

    public void removeViewInLayout(View view) {
        removeViewFromYogaTree(view, true);
        super.removeViewInLayout(view);
    }

    public static class ViewMeasureFunction implements YogaMeasureFunction {
        private int viewMeasureSpecFromYogaMeasureMode(YogaMeasureMode yogaMeasureMode) {
            if (yogaMeasureMode == YogaMeasureMode.AT_MOST) {
                return Integer.MIN_VALUE;
            }
            if (yogaMeasureMode == YogaMeasureMode.EXACTLY) {
                return 1073741824;
            }
            return 0;
        }

        @Override // com.facebook.yoga.YogaMeasureFunction
        public long measure(YogaNode yogaNode, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
            View view = (View) yogaNode.getData();
            if (view == null || (view instanceof YogaLayout)) {
                return YogaMeasureOutput.make(0, 0);
            }
            view.measure(View.MeasureSpec.makeMeasureSpec((int) f, viewMeasureSpecFromYogaMeasureMode(yogaMeasureMode)), View.MeasureSpec.makeMeasureSpec((int) f2, viewMeasureSpecFromYogaMeasureMode(yogaMeasureMode2)));
            return YogaMeasureOutput.make(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public YogaNode getYogaNodeForView(View view) {
        return this.mYogaNodes.get(view);
    }

    public void removeViewAt(int i) {
        removeViewFromYogaTree(getChildAt(i), false);
        super.removeViewAt(i);
    }

    public void invalidate(View view) {
        if (this.mYogaNodes.containsKey(view)) {
            this.mYogaNodes.get(view).dirty();
            return;
        }
        int childCount = this.mYogaNode.getChildCount();
        for (int i = 0; i < childCount; i++) {
            YogaNode childAt = this.mYogaNode.getChildAt(i);
            if (childAt.getData() instanceof YogaLayout) {
                ((YogaLayout) childAt.getData()).invalidate(view);
            }
        }
        invalidate();
    }

    public static class LayoutParams extends ViewGroup.LayoutParams {
        SparseArray<Float> numericAttributes;
        SparseArray<String> stringAttributes;

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            if (layoutParams instanceof LayoutParams) {
                LayoutParams layoutParams2 = (LayoutParams) layoutParams;
                this.numericAttributes = layoutParams2.numericAttributes.clone();
                this.stringAttributes = layoutParams2.stringAttributes.clone();
                return;
            }
            this.numericAttributes = new SparseArray<>();
            this.stringAttributes = new SparseArray<>();
            if (layoutParams.width >= 0) {
                this.numericAttributes.put(55, Float.valueOf((float) this.width));
            }
            if (layoutParams.height >= 0) {
                this.numericAttributes.put(20, Float.valueOf((float) this.height));
            }
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.numericAttributes = new SparseArray<>();
            this.stringAttributes = new SparseArray<>();
            if (i >= 0) {
                this.numericAttributes.put(55, Float.valueOf((float) i));
            }
            if (i2 >= 0) {
                this.numericAttributes.put(20, Float.valueOf((float) i2));
            }
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.numericAttributes = new SparseArray<>();
            this.stringAttributes = new SparseArray<>();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.yg_alignContent, R.attr.yg_alignItems, R.attr.yg_alignSelf, R.attr.yg_aspectRatio, R.attr.yg_borderAll, R.attr.yg_borderBottom, R.attr.yg_borderEnd, R.attr.yg_borderHorizontal, R.attr.yg_borderLeft, R.attr.yg_borderRight, R.attr.yg_borderStart, R.attr.yg_borderTop, R.attr.yg_borderVertical, R.attr.yg_direction, R.attr.yg_display, R.attr.yg_flex, R.attr.yg_flexBasis, R.attr.yg_flexDirection, R.attr.yg_flexGrow, R.attr.yg_flexShrink, R.attr.yg_height, R.attr.yg_justifyContent, R.attr.yg_marginAll, R.attr.yg_marginBottom, R.attr.yg_marginEnd, R.attr.yg_marginHorizontal, R.attr.yg_marginLeft, R.attr.yg_marginRight, R.attr.yg_marginStart, R.attr.yg_marginTop, R.attr.yg_marginVertical, R.attr.yg_maxHeight, R.attr.yg_maxWidth, R.attr.yg_minHeight, R.attr.yg_minWidth, R.attr.yg_overflow, R.attr.yg_paddingAll, R.attr.yg_paddingBottom, R.attr.yg_paddingEnd, R.attr.yg_paddingHorizontal, R.attr.yg_paddingLeft, R.attr.yg_paddingRight, R.attr.yg_paddingStart, R.attr.yg_paddingTop, R.attr.yg_paddingVertical, R.attr.yg_positionAll, R.attr.yg_positionBottom, R.attr.yg_positionEnd, R.attr.yg_positionHorizontal, R.attr.yg_positionLeft, R.attr.yg_positionRight, R.attr.yg_positionStart, R.attr.yg_positionTop, R.attr.yg_positionType, R.attr.yg_positionVertical, R.attr.yg_width, R.attr.yg_wrap});
            if (this.width >= 0) {
                this.numericAttributes.put(55, Float.valueOf((float) this.width));
            }
            if (this.height >= 0) {
                this.numericAttributes.put(20, Float.valueOf((float) this.height));
            }
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                TypedValue typedValue = new TypedValue();
                obtainStyledAttributes.getValue(index, typedValue);
                if (typedValue.type == 5) {
                    this.numericAttributes.put(index, Float.valueOf((float) obtainStyledAttributes.getDimensionPixelSize(index, 0)));
                } else if (typedValue.type == 3) {
                    this.stringAttributes.put(index, obtainStyledAttributes.getString(index));
                } else {
                    this.numericAttributes.put(index, Float.valueOf(obtainStyledAttributes.getFloat(index, BitmapDescriptorFactory.HUE_RED)));
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public YogaLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void addView(View view, YogaNode yogaNode) {
        this.mYogaNodes.put(view, yogaNode);
        addView(view);
    }

    public void removeViews(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            removeViewFromYogaTree(getChildAt(i3), false);
        }
        super.removeViews(i, i2);
    }

    public void removeViewsInLayout(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            removeViewFromYogaTree(getChildAt(i3), true);
        }
        super.removeViewsInLayout(i, i2);
    }

    private void createLayout(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode2 == 1073741824) {
            this.mYogaNode.setHeight((float) size2);
        }
        if (mode == 1073741824) {
            this.mYogaNode.setWidth((float) size);
        }
        if (mode2 == Integer.MIN_VALUE) {
            this.mYogaNode.setMaxHeight((float) size2);
        }
        if (mode == Integer.MIN_VALUE) {
            this.mYogaNode.setMaxWidth((float) size);
        }
        this.mYogaNode.calculateLayout(1.0E21f, 1.0E21f);
    }

    private void removeViewFromYogaTree(View view, boolean z) {
        YogaNode yogaNode = this.mYogaNodes.get(view);
        if (yogaNode != null) {
            YogaNode owner = yogaNode.getOwner();
            int i = 0;
            while (true) {
                if (i >= owner.getChildCount()) {
                    break;
                } else if (owner.getChildAt(i).equals(yogaNode)) {
                    owner.removeChildAt(i);
                    break;
                } else {
                    i++;
                }
            }
            yogaNode.setData(null);
            this.mYogaNodes.remove(view);
            if (z) {
                this.mYogaNode.calculateLayout(1.0E21f, 1.0E21f);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (!(getParent() instanceof YogaLayout)) {
            createLayout(i, i2);
        }
        setMeasuredDimension(Math.round(this.mYogaNode.getLayoutWidth()), Math.round(this.mYogaNode.getLayoutHeight()));
    }

    public YogaLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutParams layoutParams;
        YogaNode yogaNode = new YogaNode();
        this.mYogaNode = yogaNode;
        this.mYogaNodes = new HashMap();
        yogaNode.setData(this);
        yogaNode.setMeasureFunction(new ViewMeasureFunction());
        if (attributeSet != null) {
            layoutParams = new LayoutParams(context, attributeSet);
        } else {
            layoutParams = (LayoutParams) generateDefaultLayoutParams();
        }
        applyLayoutParams(layoutParams, yogaNode, this);
    }

    private void applyLayoutRecursive(YogaNode yogaNode, float f, float f2) {
        View view = (View) yogaNode.getData();
        if (!(view == null || view == this)) {
            if (view.getVisibility() != 8) {
                int round = Math.round(yogaNode.getLayoutX() + f);
                int round2 = Math.round(yogaNode.getLayoutY() + f2);
                view.measure(View.MeasureSpec.makeMeasureSpec(Math.round(yogaNode.getLayoutWidth()), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.round(yogaNode.getLayoutHeight()), 1073741824));
                view.layout(round, round2, view.getMeasuredWidth() + round, view.getMeasuredHeight() + round2);
            } else {
                return;
            }
        }
        int childCount = yogaNode.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (equals(view)) {
                applyLayoutRecursive(yogaNode.getChildAt(i), f, f2);
            } else if (!(view instanceof YogaLayout)) {
                applyLayoutRecursive(yogaNode.getChildAt(i), yogaNode.getLayoutX() + f, yogaNode.getLayoutY() + f2);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        YogaNode yogaNode;
        this.mYogaNode.setMeasureFunction(null);
        if (view instanceof VirtualYogaLayout) {
            VirtualYogaLayout virtualYogaLayout = (VirtualYogaLayout) view;
            virtualYogaLayout.transferChildren(this);
            YogaNode yogaNode2 = virtualYogaLayout.getYogaNode();
            YogaNode yogaNode3 = this.mYogaNode;
            yogaNode3.addChildAt(yogaNode2, yogaNode3.getChildCount());
            return;
        }
        super.addView(view, i, layoutParams);
        if (!this.mYogaNodes.containsKey(view)) {
            if (view instanceof YogaLayout) {
                yogaNode = ((YogaLayout) view).getYogaNode();
            } else {
                if (this.mYogaNodes.containsKey(view)) {
                    yogaNode = this.mYogaNodes.get(view);
                } else {
                    yogaNode = new YogaNode();
                }
                yogaNode.setData(view);
                yogaNode.setMeasureFunction(new ViewMeasureFunction());
            }
            applyLayoutParams((LayoutParams) view.getLayoutParams(), yogaNode, view);
            this.mYogaNodes.put(view, yogaNode);
            YogaNode yogaNode4 = this.mYogaNode;
            yogaNode4.addChildAt(yogaNode, yogaNode4.getChildCount());
        }
    }

    protected static void applyLayoutParams(LayoutParams layoutParams, YogaNode yogaNode, View view) {
        int i;
        int i2 = 1;
        if (Build.VERSION.SDK_INT >= 17 && view.getResources().getConfiguration().getLayoutDirection() == 1) {
            yogaNode.setDirection(YogaDirection.RTL);
        }
        Drawable background = view.getBackground();
        if (background != null) {
            Rect rect = new Rect();
            if (background.getPadding(rect)) {
                yogaNode.setPadding(YogaEdge.LEFT, (float) rect.left);
                yogaNode.setPadding(YogaEdge.TOP, (float) rect.top);
                yogaNode.setPadding(YogaEdge.RIGHT, (float) rect.right);
                yogaNode.setPadding(YogaEdge.BOTTOM, (float) rect.bottom);
            }
        }
        int i3 = 0;
        while (true) {
            i = 16;
            if (i3 >= layoutParams.numericAttributes.size()) {
                break;
            }
            int keyAt = layoutParams.numericAttributes.keyAt(i3);
            float floatValue = layoutParams.numericAttributes.valueAt(i3).floatValue();
            if (keyAt == 0) {
                yogaNode.setAlignContent(YogaAlign.fromInt(Math.round(floatValue)));
            } else if (keyAt == i2) {
                yogaNode.setAlignItems(YogaAlign.fromInt(Math.round(floatValue)));
            } else if (keyAt == 2) {
                yogaNode.setAlignSelf(YogaAlign.fromInt(Math.round(floatValue)));
            } else if (keyAt == 3) {
                yogaNode.setAspectRatio(floatValue);
            } else if (keyAt == 8) {
                yogaNode.setBorder(YogaEdge.LEFT, floatValue);
            } else if (keyAt == 11) {
                yogaNode.setBorder(YogaEdge.TOP, floatValue);
            } else if (keyAt == 9) {
                yogaNode.setBorder(YogaEdge.RIGHT, floatValue);
            } else if (keyAt == 5) {
                yogaNode.setBorder(YogaEdge.BOTTOM, floatValue);
            } else if (keyAt == 10) {
                yogaNode.setBorder(YogaEdge.START, floatValue);
            } else if (keyAt == 6) {
                yogaNode.setBorder(YogaEdge.END, floatValue);
            } else if (keyAt == 7) {
                yogaNode.setBorder(YogaEdge.HORIZONTAL, floatValue);
            } else if (keyAt == 12) {
                yogaNode.setBorder(YogaEdge.VERTICAL, floatValue);
            } else if (keyAt == 4) {
                yogaNode.setBorder(YogaEdge.ALL, floatValue);
            } else if (keyAt == 13) {
                yogaNode.setDirection(YogaDirection.fromInt(Math.round(floatValue)));
            } else if (keyAt == 14) {
                yogaNode.setDisplay(YogaDisplay.fromInt(Math.round(floatValue)));
            } else if (keyAt == 15) {
                yogaNode.setFlex(floatValue);
            } else if (keyAt == 16) {
                yogaNode.setFlexBasis(floatValue);
            } else if (keyAt == 17) {
                yogaNode.setFlexDirection(YogaFlexDirection.fromInt(Math.round(floatValue)));
            } else if (keyAt == 18) {
                yogaNode.setFlexGrow(floatValue);
            } else if (keyAt == 19) {
                yogaNode.setFlexShrink(floatValue);
            } else if (keyAt == 20) {
                yogaNode.setHeight(floatValue);
            } else if (keyAt == 26) {
                yogaNode.setMargin(YogaEdge.LEFT, floatValue);
            } else if (keyAt == 21) {
                yogaNode.setJustifyContent(YogaJustify.fromInt(Math.round(floatValue)));
            } else if (keyAt == 29) {
                yogaNode.setMargin(YogaEdge.TOP, floatValue);
            } else if (keyAt == 27) {
                yogaNode.setMargin(YogaEdge.RIGHT, floatValue);
            } else if (keyAt == 23) {
                yogaNode.setMargin(YogaEdge.BOTTOM, floatValue);
            } else if (keyAt == 28) {
                yogaNode.setMargin(YogaEdge.START, floatValue);
            } else if (keyAt == 24) {
                yogaNode.setMargin(YogaEdge.END, floatValue);
            } else if (keyAt == 25) {
                yogaNode.setMargin(YogaEdge.HORIZONTAL, floatValue);
            } else if (keyAt == 30) {
                yogaNode.setMargin(YogaEdge.VERTICAL, floatValue);
            } else if (keyAt == 22) {
                yogaNode.setMargin(YogaEdge.ALL, floatValue);
            } else if (keyAt == 31) {
                yogaNode.setMaxHeight(floatValue);
            } else if (keyAt == 32) {
                yogaNode.setMaxWidth(floatValue);
            } else if (keyAt == 33) {
                yogaNode.setMinHeight(floatValue);
            } else if (keyAt == 34) {
                yogaNode.setMinWidth(floatValue);
            } else if (keyAt == 35) {
                yogaNode.setOverflow(YogaOverflow.fromInt(Math.round(floatValue)));
            } else if (keyAt == 40) {
                yogaNode.setPadding(YogaEdge.LEFT, floatValue);
            } else if (keyAt == 43) {
                yogaNode.setPadding(YogaEdge.TOP, floatValue);
            } else if (keyAt == 41) {
                yogaNode.setPadding(YogaEdge.RIGHT, floatValue);
            } else if (keyAt == 37) {
                yogaNode.setPadding(YogaEdge.BOTTOM, floatValue);
            } else if (keyAt == 42) {
                yogaNode.setPadding(YogaEdge.START, floatValue);
            } else if (keyAt == 38) {
                yogaNode.setPadding(YogaEdge.END, floatValue);
            } else if (keyAt == 39) {
                yogaNode.setPadding(YogaEdge.HORIZONTAL, floatValue);
            } else if (keyAt == 44) {
                yogaNode.setPadding(YogaEdge.VERTICAL, floatValue);
            } else if (keyAt == 36) {
                yogaNode.setPadding(YogaEdge.ALL, floatValue);
            } else if (keyAt == 49) {
                yogaNode.setPosition(YogaEdge.LEFT, floatValue);
            } else if (keyAt == 52) {
                yogaNode.setPosition(YogaEdge.TOP, floatValue);
            } else if (keyAt == 50) {
                yogaNode.setPosition(YogaEdge.RIGHT, floatValue);
            } else if (keyAt == 46) {
                yogaNode.setPosition(YogaEdge.BOTTOM, floatValue);
            } else if (keyAt == 51) {
                yogaNode.setPosition(YogaEdge.START, floatValue);
            } else if (keyAt == 47) {
                yogaNode.setPosition(YogaEdge.END, floatValue);
            } else if (keyAt == 48) {
                yogaNode.setPosition(YogaEdge.HORIZONTAL, floatValue);
            } else if (keyAt == 54) {
                yogaNode.setPosition(YogaEdge.VERTICAL, floatValue);
            } else if (keyAt == 45) {
                yogaNode.setPosition(YogaEdge.ALL, floatValue);
            } else if (keyAt == 53) {
                yogaNode.setPositionType(YogaPositionType.fromInt(Math.round(floatValue)));
            } else if (keyAt == 55) {
                yogaNode.setWidth(floatValue);
            } else if (keyAt == 56) {
                yogaNode.setWrap(YogaWrap.fromInt(Math.round(floatValue)));
            }
            i3++;
            i2 = 1;
        }
        int i4 = 0;
        while (i4 < layoutParams.stringAttributes.size()) {
            int keyAt2 = layoutParams.stringAttributes.keyAt(i4);
            String valueAt = layoutParams.stringAttributes.valueAt(i4);
            if (valueAt.equals("auto")) {
                if (keyAt2 == 26) {
                    yogaNode.setMarginAuto(YogaEdge.LEFT);
                } else if (keyAt2 == 29) {
                    yogaNode.setMarginAuto(YogaEdge.TOP);
                } else if (keyAt2 == 27) {
                    yogaNode.setMarginAuto(YogaEdge.RIGHT);
                } else if (keyAt2 == 23) {
                    yogaNode.setMarginAuto(YogaEdge.BOTTOM);
                } else if (keyAt2 == 28) {
                    yogaNode.setMarginAuto(YogaEdge.START);
                } else if (keyAt2 == 24) {
                    yogaNode.setMarginAuto(YogaEdge.END);
                } else if (keyAt2 == 25) {
                    yogaNode.setMarginAuto(YogaEdge.HORIZONTAL);
                } else if (keyAt2 == 30) {
                    yogaNode.setMarginAuto(YogaEdge.VERTICAL);
                } else if (keyAt2 == 22) {
                    yogaNode.setMarginAuto(YogaEdge.ALL);
                }
            }
            if (valueAt.endsWith("%")) {
                float parseFloat = Float.parseFloat(valueAt.substring(0, valueAt.length() - 1));
                if (keyAt2 == i) {
                    yogaNode.setFlexBasisPercent(parseFloat);
                } else if (keyAt2 == 20) {
                    yogaNode.setHeightPercent(parseFloat);
                } else if (keyAt2 == 26) {
                    yogaNode.setMarginPercent(YogaEdge.LEFT, parseFloat);
                } else if (keyAt2 == 29) {
                    yogaNode.setMarginPercent(YogaEdge.TOP, parseFloat);
                } else if (keyAt2 == 27) {
                    yogaNode.setMarginPercent(YogaEdge.RIGHT, parseFloat);
                } else if (keyAt2 == 23) {
                    yogaNode.setMarginPercent(YogaEdge.BOTTOM, parseFloat);
                } else if (keyAt2 == 28) {
                    yogaNode.setMarginPercent(YogaEdge.START, parseFloat);
                } else if (keyAt2 == 24) {
                    yogaNode.setMarginPercent(YogaEdge.END, parseFloat);
                } else if (keyAt2 == 25) {
                    yogaNode.setMarginPercent(YogaEdge.HORIZONTAL, parseFloat);
                } else if (keyAt2 == 30) {
                    yogaNode.setMarginPercent(YogaEdge.VERTICAL, parseFloat);
                } else if (keyAt2 == 22) {
                    yogaNode.setMarginPercent(YogaEdge.ALL, parseFloat);
                } else if (keyAt2 == 31) {
                    yogaNode.setMaxHeightPercent(parseFloat);
                } else if (keyAt2 == 32) {
                    yogaNode.setMaxWidthPercent(parseFloat);
                } else if (keyAt2 == 33) {
                    yogaNode.setMinHeightPercent(parseFloat);
                } else if (keyAt2 == 34) {
                    yogaNode.setMinWidthPercent(parseFloat);
                } else if (keyAt2 == 40) {
                    yogaNode.setPaddingPercent(YogaEdge.LEFT, parseFloat);
                } else if (keyAt2 == 43) {
                    yogaNode.setPaddingPercent(YogaEdge.TOP, parseFloat);
                } else if (keyAt2 == 41) {
                    yogaNode.setPaddingPercent(YogaEdge.RIGHT, parseFloat);
                } else if (keyAt2 == 37) {
                    yogaNode.setPaddingPercent(YogaEdge.BOTTOM, parseFloat);
                } else if (keyAt2 == 42) {
                    yogaNode.setPaddingPercent(YogaEdge.START, parseFloat);
                } else if (keyAt2 == 38) {
                    yogaNode.setPaddingPercent(YogaEdge.END, parseFloat);
                } else if (keyAt2 == 39) {
                    yogaNode.setPaddingPercent(YogaEdge.HORIZONTAL, parseFloat);
                } else if (keyAt2 == 44) {
                    yogaNode.setPaddingPercent(YogaEdge.VERTICAL, parseFloat);
                } else if (keyAt2 == 36) {
                    yogaNode.setPaddingPercent(YogaEdge.ALL, parseFloat);
                } else if (keyAt2 == 49) {
                    yogaNode.setPositionPercent(YogaEdge.LEFT, parseFloat);
                } else if (keyAt2 == 52) {
                    yogaNode.setPositionPercent(YogaEdge.TOP, parseFloat);
                } else if (keyAt2 == 50) {
                    yogaNode.setPositionPercent(YogaEdge.RIGHT, parseFloat);
                } else if (keyAt2 == 46) {
                    yogaNode.setPositionPercent(YogaEdge.BOTTOM, parseFloat);
                } else if (keyAt2 == 51) {
                    yogaNode.setPositionPercent(YogaEdge.START, parseFloat);
                } else if (keyAt2 == 47) {
                    yogaNode.setPositionPercent(YogaEdge.END, parseFloat);
                } else if (keyAt2 == 48) {
                    yogaNode.setPositionPercent(YogaEdge.HORIZONTAL, parseFloat);
                } else if (keyAt2 == 54) {
                    yogaNode.setPositionPercent(YogaEdge.VERTICAL, parseFloat);
                } else if (keyAt2 == 45) {
                    yogaNode.setPositionPercent(YogaEdge.ALL, parseFloat);
                } else if (keyAt2 == 55) {
                    yogaNode.setWidthPercent(parseFloat);
                }
            }
            i4++;
            i = 16;
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (!(getParent() instanceof YogaLayout)) {
            createLayout(View.MeasureSpec.makeMeasureSpec(i3 - i, 1073741824), View.MeasureSpec.makeMeasureSpec(i4 - i2, 1073741824));
        }
        applyLayoutRecursive(this.mYogaNode, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
    }
}
