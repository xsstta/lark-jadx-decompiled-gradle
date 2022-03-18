package com.facebook.yoga.android;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.yoga.YogaNode;
import com.facebook.yoga.android.YogaLayout;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class VirtualYogaLayout extends ViewGroup {
    private final List<View> mChildren;
    private final YogaNode mYogaNode;
    private final Map<View, YogaNode> mYogaNodes;

    public YogaNode getYogaNode() {
        return this.mYogaNode;
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new YogaLayout.LayoutParams(-1, -1);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof YogaLayout.LayoutParams;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new YogaLayout.LayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new YogaLayout.LayoutParams(getContext(), attributeSet);
    }

    public VirtualYogaLayout(Context context) {
        super(context);
        this.mChildren = new LinkedList();
        this.mYogaNodes = new HashMap();
        this.mYogaNode = new YogaNode();
    }

    /* access modifiers changed from: protected */
    public void transferChildren(ViewGroup viewGroup) {
        if (viewGroup instanceof VirtualYogaLayout) {
            for (View view : this.mChildren) {
                ((VirtualYogaLayout) viewGroup).addView(view, this.mYogaNodes.get(view));
            }
        } else if (viewGroup instanceof YogaLayout) {
            for (View view2 : this.mChildren) {
                ((YogaLayout) viewGroup).addView(view2, this.mYogaNodes.get(view2));
            }
        } else {
            throw new RuntimeException("VirtualYogaLayout cannot transfer children to ViewGroup of type " + viewGroup.getClass().getCanonicalName() + ".  Must either be a VirtualYogaLayout or a YogaLayout.");
        }
        this.mChildren.clear();
    }

    public VirtualYogaLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void addView(View view, YogaNode yogaNode) {
        this.mChildren.add(view);
        this.mYogaNodes.put(view, yogaNode);
    }

    public VirtualYogaLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mChildren = new LinkedList();
        this.mYogaNodes = new HashMap();
        YogaNode yogaNode = new YogaNode();
        this.mYogaNode = yogaNode;
        YogaLayout.applyLayoutParams(new YogaLayout.LayoutParams(context, attributeSet), yogaNode, this);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof VirtualYogaLayout) {
            VirtualYogaLayout virtualYogaLayout = (VirtualYogaLayout) view;
            virtualYogaLayout.transferChildren(this);
            YogaNode yogaNode = virtualYogaLayout.getYogaNode();
            YogaNode yogaNode2 = this.mYogaNode;
            yogaNode2.addChildAt(yogaNode, yogaNode2.getChildCount());
            return;
        }
        YogaNode yogaNode3 = new YogaNode();
        YogaLayout.applyLayoutParams(new YogaLayout.LayoutParams(layoutParams), yogaNode3, view);
        yogaNode3.setData(view);
        yogaNode3.setMeasureFunction(new YogaLayout.ViewMeasureFunction());
        YogaNode yogaNode4 = this.mYogaNode;
        yogaNode4.addChildAt(yogaNode3, yogaNode4.getChildCount());
        addView(view, yogaNode3);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        throw new RuntimeException("Attempting to layout a VirtualYogaLayout");
    }
}
