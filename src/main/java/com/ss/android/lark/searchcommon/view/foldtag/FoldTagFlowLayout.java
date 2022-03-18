package com.ss.android.lark.searchcommon.view.foldtag;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.larksuite.framework.ui.flowlayout.AbstractC26225a;
import com.larksuite.framework.ui.flowlayout.C26227b;
import com.larksuite.framework.ui.flowlayout.TagFlowLayout;
import com.ss.android.vesdk.p3188b.C63954b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0019\u001a\u00020\u001aH\u0016J0\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u0014H\u0014J\u0018\u0010!\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u0014H\u0014J\u0012\u0010$\u001a\u00020\u001a2\n\u0010%\u001a\u0006\u0012\u0002\b\u00030\u0006J\b\u0010&\u001a\u00020\u001aH\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R$\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006'"}, d2 = {"Lcom/ss/android/lark/searchcommon/view/foldtag/FoldTagFlowLayout;", "Lcom/larksuite/framework/ui/flowlayout/TagFlowLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "mAdapter", "Lcom/ss/android/lark/searchcommon/view/foldtag/FoldTagAdapter;", "mFoldView", "Lcom/ss/android/lark/searchcommon/view/foldtag/IFoldView;", "mFoldViewContainer", "Lcom/larksuite/framework/ui/flowlayout/TagView;", "mIsFold", "", "value", "mIsNeedFold", "getMIsNeedFold", "()Z", "setMIsNeedFold", "(Z)V", "mMaxLineCount", "", "getMMaxLineCount", "()I", "setMMaxLineCount", "(I)V", "onChanged", "", "onLayout", "changed", "l", "t", "r", C63954b.f161494a, "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "setAdapter", "adapter", "setFoldView", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.view.a.c */
public final class FoldTagFlowLayout extends TagFlowLayout {

    /* renamed from: f */
    public boolean f133483f;

    /* renamed from: g */
    public IFoldView f133484g;

    /* renamed from: h */
    private FoldTagAdapter<?> f133485h;

    /* renamed from: i */
    private boolean f133486i;

    /* renamed from: j */
    private int f133487j = Integer.MAX_VALUE;

    /* renamed from: k */
    private C26227b f133488k;

    public final boolean getMIsNeedFold() {
        return this.f133486i;
    }

    public final int getMMaxLineCount() {
        return this.f133487j;
    }

    @Override // com.larksuite.framework.ui.flowlayout.TagFlowLayout, com.larksuite.framework.ui.flowlayout.AbstractC26225a.AbstractC26226a
    /* renamed from: a */
    public void mo93277a() {
        super.mo93277a();
        if (this.f133486i) {
            m209321b();
        }
    }

    /* renamed from: b */
    private final void m209321b() {
        IFoldView dVar;
        View a;
        FoldTagAdapter<?> bVar = this.f133485h;
        if (bVar != null) {
            dVar = bVar.mo184649d();
        } else {
            dVar = null;
        }
        this.f133484g = dVar;
        if (dVar != null) {
            dVar.mo184648a(this.f133483f);
        }
        IFoldView dVar2 = this.f133484g;
        if (dVar2 != null && (a = dVar2.mo184647a()) != null) {
            a.setOnClickListener(new View$OnClickListenerC53974a(this));
            this.f133488k = new C26227b(getContext());
            a.setDuplicateParentStateEnabled(true);
            if (a.getLayoutParams() == null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                marginLayoutParams.setMargins(TagFlowLayout.m94838a(getContext(), 5.0f), TagFlowLayout.m94838a(getContext(), 5.0f), TagFlowLayout.m94838a(getContext(), 5.0f), TagFlowLayout.m94838a(getContext(), 5.0f));
                C26227b bVar2 = this.f133488k;
                if (bVar2 == null) {
                    Intrinsics.throwNpe();
                }
                bVar2.setLayoutParams(marginLayoutParams);
            }
            C26227b bVar3 = this.f133488k;
            if (bVar3 == null) {
                Intrinsics.throwNpe();
            }
            bVar3.addView(a);
            C26227b bVar4 = this.f133488k;
            if (bVar4 == null) {
                Intrinsics.throwNpe();
            }
            addView(bVar4);
        }
    }

    public final void setMMaxLineCount(int i) {
        this.f133487j = i;
    }

    public final void setMIsNeedFold(boolean z) {
        if (z) {
            this.f133483f = true;
        }
        this.f133486i = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FoldTagFlowLayout(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.view.a.c$a */
    public static final class View$OnClickListenerC53974a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ FoldTagFlowLayout f133489a;

        View$OnClickListenerC53974a(FoldTagFlowLayout cVar) {
            this.f133489a = cVar;
        }

        public final void onClick(View view) {
            FoldTagFlowLayout cVar = this.f133489a;
            cVar.f133483f = !cVar.f133483f;
            IFoldView dVar = this.f133489a.f133484g;
            if (dVar != null) {
                dVar.mo184648a(this.f133489a.f133483f);
            }
            this.f133489a.mo93277a();
        }
    }

    public final void setAdapter(FoldTagAdapter<?> bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "adapter");
        super.setAdapter((AbstractC26225a) bVar);
        this.f133485h = bVar;
        mo93277a();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x019c, code lost:
        r16 = r8;
     */
    @Override // com.larksuite.framework.ui.flowlayout.TagFlowLayout, com.larksuite.framework.ui.flowlayout.FlowLayout
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r22, int r23) {
        /*
        // Method dump skipped, instructions count: 458
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.searchcommon.view.foldtag.FoldTagFlowLayout.onMeasure(int, int):void");
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.framework.ui.flowlayout.FlowLayout
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        C26227b bVar;
        FoldTagFlowLayout cVar = this;
        cVar.f64759a.clear();
        cVar.f64760b.clear();
        cVar.f64761c.clear();
        cVar.f64763e.clear();
        int width = getWidth();
        if (!cVar.f133486i || (bVar = cVar.f133488k) == null) {
            i6 = 0;
            i5 = 0;
        } else {
            if (bVar == null) {
                Intrinsics.throwNpe();
            }
            ViewGroup.LayoutParams layoutParams = bVar.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                C26227b bVar2 = cVar.f133488k;
                if (bVar2 == null) {
                    Intrinsics.throwNpe();
                }
                i6 = bVar2.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                C26227b bVar3 = cVar.f133488k;
                if (bVar3 == null) {
                    Intrinsics.throwNpe();
                }
                i5 = bVar3.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        int childCount = getChildCount();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            i7 = 1;
            if (i10 >= childCount) {
                break;
            }
            View childAt = cVar.getChildAt(i10);
            Intrinsics.checkExpressionValueIsNotNull(childAt, "child");
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
                if (layoutParams2 != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    int measuredWidth = childAt.getMeasuredWidth() + marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin;
                    int measuredHeight = childAt.getMeasuredHeight() + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
                    if (!cVar.f133486i || cVar.f133488k == null) {
                        if (measuredWidth + i11 > (width - getPaddingLeft()) - getPaddingRight()) {
                            cVar.f64760b.add(Integer.valueOf(i12));
                            cVar.f64759a.add(cVar.f64763e);
                            cVar.f64761c.add(Integer.valueOf(i11));
                            cVar.f64763e = new ArrayList();
                            i12 = measuredHeight;
                            i11 = 0;
                        }
                        i11 += measuredWidth;
                        i12 = Math.max(i12, measuredHeight);
                        cVar.f64763e.add(childAt);
                    } else {
                        if (!cVar.f133483f) {
                            if (cVar.f133487j - 1 == cVar.f64760b.size() && measuredWidth + i11 + i5 > (width - getPaddingLeft()) - getPaddingRight()) {
                                i11 += i5;
                                i12 = Math.max(i12, i6);
                                cVar.f64763e.add(cVar.f133488k);
                                break;
                            }
                            int i13 = measuredWidth + i11;
                            if (i13 <= (width - getPaddingLeft()) - getPaddingRight()) {
                                int max = Math.max(i12, measuredHeight);
                                cVar.f64763e.add(childAt);
                                i12 = max;
                                i11 = i13;
                            } else if (cVar.f64760b.size() >= cVar.f133487j - 1) {
                                break;
                            } else {
                                cVar.f64760b.add(Integer.valueOf(i12));
                                cVar.f64759a.add(cVar.f64763e);
                                cVar.f64761c.add(Integer.valueOf(i11));
                                cVar.f64763e = new ArrayList();
                                cVar.f64763e.add(childAt);
                                i12 = measuredHeight;
                            }
                        } else if (cVar.f64760b.size() != 0 || !Intrinsics.areEqual(childAt, cVar.f133488k)) {
                            measuredWidth += i11;
                            if (measuredWidth + i5 > (width - getPaddingLeft()) - getPaddingRight()) {
                                i11 += i5;
                                i12 = Math.max(i12, i6);
                                cVar.f64763e.add(cVar.f133488k);
                                break;
                            }
                            i12 = Math.max(i12, measuredHeight);
                            cVar.f64763e.add(childAt);
                        }
                        i11 = measuredWidth;
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
            }
            i10++;
        }
        cVar.f64760b.add(Integer.valueOf(i12));
        cVar.f64761c.add(Integer.valueOf(i11));
        cVar.f64759a.add(cVar.f64763e);
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int size = cVar.f64759a.size();
        int i14 = 0;
        while (i14 < size) {
            cVar.f64763e = (List) cVar.f64759a.get(i14);
            Object obj = cVar.f64760b.get(i14);
            Intrinsics.checkExpressionValueIsNotNull(obj, "mLineHeight[i]");
            int intValue = ((Number) obj).intValue();
            Integer num = (Integer) cVar.f64761c.get(i14);
            int i15 = cVar.f64762d;
            if (i15 != -1) {
                if (i15 == 0) {
                    Intrinsics.checkExpressionValueIsNotNull(num, "currentLineWidth");
                    i9 = (width - num.intValue()) / 2;
                    i8 = getPaddingLeft();
                } else if (i15 == i7) {
                    Intrinsics.checkExpressionValueIsNotNull(num, "currentLineWidth");
                    i9 = width - num.intValue();
                    i8 = getPaddingLeft();
                }
                paddingLeft = i9 + i8;
            } else {
                paddingLeft = getPaddingLeft();
            }
            List list = cVar.f64763e;
            Intrinsics.checkExpressionValueIsNotNull(list, "lineViews");
            int size2 = list.size();
            int i16 = 0;
            while (i16 < size2) {
                View view = (View) cVar.f64763e.get(i16);
                Intrinsics.checkExpressionValueIsNotNull(view, "child");
                if (view.getVisibility() != 8) {
                    ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
                    if (layoutParams3 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                        int i17 = marginLayoutParams3.leftMargin + paddingLeft;
                        int i18 = marginLayoutParams3.topMargin + paddingTop;
                        view.layout(i17, i18, i17 + view.getMeasuredWidth(), i18 + view.getMeasuredHeight());
                        paddingLeft += view.getMeasuredWidth() + marginLayoutParams3.leftMargin + marginLayoutParams3.rightMargin;
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                }
                i16++;
                cVar = this;
            }
            paddingTop += intValue;
            i14++;
            i7 = 1;
            cVar = this;
        }
    }
}
