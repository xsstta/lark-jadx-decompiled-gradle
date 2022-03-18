package com.ss.android.lark.reaction.widget.flowlayout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.larksuite.suite.R;
import com.ss.android.lark.reaction.widget.p2560b.C52990a;
import java.util.ArrayList;
import java.util.List;

public class ReactionTagLayout extends TagFlowLayout {

    /* renamed from: f */
    private int f131118f;

    /* renamed from: g */
    private AbstractC53055a f131119g;

    /* renamed from: h */
    private AbstractC53056b f131120h;

    /* renamed from: i */
    private int f131121i;

    /* renamed from: j */
    private int f131122j;

    /* renamed from: com.ss.android.lark.reaction.widget.flowlayout.ReactionTagLayout$a */
    public interface AbstractC53055a {
        int calculate(View view, int i);
    }

    /* renamed from: com.ss.android.lark.reaction.widget.flowlayout.ReactionTagLayout$b */
    public interface AbstractC53056b {
        int calculate(View view, int i, int i2, int i3);
    }

    public void setChildXOffset(int i) {
        this.f131121i = i;
    }

    public void setChildYOffset(int i) {
        this.f131122j = i;
    }

    public void setRequestItemMinWidthCalculator(AbstractC53055a aVar) {
        this.f131119g = aVar;
    }

    public void setRequestLeftTextSpaceCalculator(AbstractC53056b bVar) {
        this.f131120h = bVar;
    }

    public ReactionTagLayout(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private void m205404a(int i) {
        int i2;
        int i3;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int size = this.f131071a.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.f131075e = (List) this.f131071a.get(i4);
            int intValue = ((Integer) this.f131072b.get(i4)).intValue();
            int intValue2 = ((Integer) this.f131073c.get(i4)).intValue();
            int i5 = this.f131074d;
            if (i5 != -1) {
                if (i5 == 0) {
                    i3 = (i - intValue2) / 2;
                    i2 = getPaddingLeft();
                } else if (i5 == 1) {
                    i3 = i - intValue2;
                    i2 = getPaddingLeft();
                }
                paddingLeft = i3 + i2;
            } else {
                paddingLeft = getPaddingLeft();
            }
            for (int i6 = 0; i6 < this.f131075e.size(); i6++) {
                View view = (View) this.f131075e.get(i6);
                if (view.getVisibility() != 8) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    int i7 = marginLayoutParams.leftMargin + paddingLeft + (this.f131121i * i6);
                    int i8 = marginLayoutParams.topMargin + paddingTop + (this.f131122j * i4);
                    view.layout(i7, i8, view.getMeasuredWidth() + i7, view.getMeasuredHeight() + i8);
                    paddingLeft += view.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                }
            }
            paddingTop += intValue;
        }
    }

    public ReactionTagLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a5, code lost:
        if (r20.f131119g.calculate(r13, r20.f131118f) > (r4 - r11)) goto L_0x00a7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00bd  */
    @Override // com.ss.android.lark.reaction.widget.flowlayout.TagFlowLayout, com.ss.android.lark.reaction.widget.flowlayout.FlowLayout
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r21, int r22) {
        /*
        // Method dump skipped, instructions count: 262
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.reaction.widget.flowlayout.ReactionTagLayout.onMeasure(int, int):void");
    }

    public ReactionTagLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_reaction_component_flow_detail_item, (ViewGroup) this, false);
        View findViewById = inflate.findViewById(R.id.vertical_split_reaction);
        View findViewById2 = inflate.findViewById(R.id.names_reaction_list);
        int a = C52990a.m205226a(findViewById);
        this.f131118f = (C52990a.m205226a(inflate) - a) - C52990a.m205226a(findViewById2);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.reaction.widget.flowlayout.FlowLayout
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f131071a.clear();
        this.f131072b.clear();
        this.f131073c.clear();
        this.f131075e.clear();
        int width = getWidth();
        int childCount = getChildCount();
        int paddingLeft = (width - getPaddingLeft()) - getPaddingRight();
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                View tagView = ((C53063b) childAt).getTagView();
                int i8 = paddingLeft / 2;
                if (C52990a.m205226a(tagView) + i6 + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin > paddingLeft && (i6 > i8 || this.f131119g.calculate(childAt, this.f131118f) > paddingLeft - i6)) {
                    this.f131072b.add(Integer.valueOf(i5));
                    this.f131071a.add(this.f131075e);
                    this.f131073c.add(Integer.valueOf(i6));
                    i5 = marginLayoutParams.topMargin + measuredHeight + marginLayoutParams.bottomMargin;
                    this.f131075e = new ArrayList();
                    i6 = 0;
                }
                int calculate = this.f131120h.calculate(childAt, paddingLeft, marginLayoutParams.leftMargin + i6 + marginLayoutParams.rightMargin, this.f131118f);
                C52990a.m205226a(tagView);
                i6 += calculate + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                i5 = Math.max(i5, measuredHeight + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin);
                this.f131075e.add(childAt);
            }
        }
        this.f131072b.add(Integer.valueOf(i5));
        this.f131073c.add(Integer.valueOf(i6));
        this.f131071a.add(this.f131075e);
        m205404a(width);
    }
}
