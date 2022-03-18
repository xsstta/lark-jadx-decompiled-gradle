package com.ss.android.lark.chatsetting.impl.group.ownership.memberlimit.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chatsetting.impl.group.ownership.memberlimit.customview.ViewCompanion;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u0000 *2\u00020\u00012\u00020\u0002:\u0001*B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ$\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0014\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0016\u0010\u0017\u001a\u00020\u00122\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u0018H\u0002J2\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u001a2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u00182\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\bH\u0002J\b\u0010\u001d\u001a\u00020\u0012H\u0002J0\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\b2\u0006\u0010#\u001a\u00020\b2\u0006\u0010$\u001a\u00020\bH\u0014J\u0018\u0010%\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\b2\u0006\u0010'\u001a\u00020\bH\u0014J\u0014\u0010(\u001a\u00020\u00122\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00100\u0018R*\u0010\n\u001a\u001e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u000bj\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b`\rX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/memberlimit/customview/UserInfoFlowView;", "Landroid/widget/FrameLayout;", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/memberlimit/customview/ViewCompanion;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "indexMap", "Ljava/util/LinkedHashMap;", "Landroid/view/View;", "Lkotlin/collections/LinkedHashMap;", "infoList", "", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "addView", "", "child", "index", "params", "Landroid/view/ViewGroup$LayoutParams;", "bindItems", "", "calculateChildrenSize", "Lkotlin/Pair;", "parentMaxWidth", "parentMaxHeight", "diffChildView", "onLayout", "changed", "", "left", "top", "right", "bottom", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "setUserInfo", "list", "Companion", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class UserInfoFlowView extends FrameLayout implements ViewCompanion {

    /* renamed from: a */
    public static final Companion f89793a = new Companion(null);

    /* renamed from: b */
    private final List<Chatter> f89794b;

    /* renamed from: c */
    private final LinkedHashMap<View, Integer> f89795c;

    public UserInfoFlowView(Context context) {
        this(context, null, 0, 6, null);
    }

    public UserInfoFlowView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/memberlimit/customview/UserInfoFlowView$Companion;", "", "()V", "BUBBLE_HEIGHT", "", "ITEM_MARGIN", "LINE_MARGIN", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.memberlimit.customview.UserInfoFlowView$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.memberlimit.customview.ViewCompanion
    public Context ay_() {
        return ViewCompanion.C34764a.m135160a(this);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.memberlimit.customview.UserInfoFlowView$b */
    public static final class C34763b extends Lambda implements Function0<Integer> {
        final /* synthetic */ Ref.IntRef $currentLineIndex;
        final /* synthetic */ Ref.IntRef $lineWidthCanProvide;
        final /* synthetic */ int $parentMaxWidth;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34763b(Ref.IntRef intRef, int i, Ref.IntRef intRef2) {
            super(0);
            this.$lineWidthCanProvide = intRef;
            this.$parentMaxWidth = i;
            this.$currentLineIndex = intRef2;
        }

        /* Return type fixed from 'int' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            this.$lineWidthCanProvide.element = this.$parentMaxWidth;
            Ref.IntRef intRef = this.$currentLineIndex;
            int i = intRef.element;
            intRef.element = i + 1;
            return i;
        }
    }

    /* renamed from: b */
    private final void m135155b() {
        int childCount = getChildCount();
        int size = this.f89794b.size();
        while (childCount > size) {
            removeViewAt(childCount - 1);
            childCount--;
        }
        while (childCount < size) {
            Context context = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            addView(new UserInfoBubbleView(context, null, 0, 6, null));
            childCount++;
        }
    }

    /* renamed from: a */
    public int mo128341a(int i) {
        return ViewCompanion.C34764a.m135159a(this, i);
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.memberlimit.customview.ViewCompanion
    /* renamed from: b */
    public float mo128336b(int i) {
        return ViewCompanion.C34764a.m135161b(this, i);
    }

    public final void setUserInfo(List<? extends Chatter> list) {
        Intrinsics.checkParameterIsNotNull(list, "list");
        this.f89794b.clear();
        this.f89794b.addAll(list);
        m135155b();
    }

    /* renamed from: a */
    private final void m135154a(List<? extends Chatter> list) {
        int min = Math.min(list.size(), getChildCount());
        for (int i = 0; i < min; i++) {
            View childAt = getChildAt(i);
            if (childAt != null) {
                ((UserInfoBubbleView) childAt).mo128334a((Chatter) list.get(i));
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chatsetting.impl.group.ownership.memberlimit.customview.UserInfoBubbleView");
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        List<? extends Chatter> list = CollectionsKt.toList(this.f89794b);
        this.f89795c.clear();
        m135154a(list);
        Pair<Integer, Integer> a = m135153a(list, View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        setMeasuredDimension(a.component1().intValue(), a.component2().intValue());
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof UserInfoBubbleView) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new RuntimeException("You must not call addView for UserInfoFlowView");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserInfoFlowView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f89794b = new ArrayList();
        this.f89795c = new LinkedHashMap<>();
    }

    /* renamed from: a */
    private final Pair<Integer, Integer> m135153a(List<? extends Chatter> list, int i, int i2) {
        boolean z;
        boolean z2;
        Ref.IntRef intRef = new Ref.IntRef();
        int i3 = 0;
        intRef.element = 0;
        Ref.IntRef intRef2 = new Ref.IntRef();
        intRef2.element = i;
        int min = Math.min(CollectionsKt.toList(list).size(), getChildCount());
        C34763b bVar = new C34763b(intRef2, i, intRef);
        int i4 = 0;
        while (true) {
            boolean z3 = true;
            if (i4 < min) {
                View childAt = getChildAt(i4);
                if (childAt != null) {
                    UserInfoBubbleView userInfoBubbleView = (UserInfoBubbleView) childAt;
                    userInfoBubbleView.measure(View.MeasureSpec.makeMeasureSpec(intRef2.element, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE));
                    int measuredWidth = userInfoBubbleView.getMeasuredWidth();
                    if (userInfoBubbleView.getNameView$im_chatsetting_release().getLayout().getEllipsisCount(0) > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z || measuredWidth == i) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (measuredWidth >= intRef2.element) {
                        z3 = false;
                    }
                    if (z3 || z2) {
                        intRef2.element -= measuredWidth;
                        this.f89795c.put(userInfoBubbleView, Integer.valueOf(intRef.element));
                        if (z3 || !z2) {
                            intRef2.element -= mo128341a(8);
                        } else {
                            bVar.invoke();
                        }
                        i4++;
                    } else {
                        bVar.invoke();
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chatsetting.impl.group.ownership.memberlimit.customview.UserInfoBubbleView");
                }
            } else {
                int i5 = intRef.element + 1;
                if (i5 > 0 && intRef2.element == i) {
                    i5--;
                }
                if (i5 > 0) {
                    i3 = Math.max((mo128341a(24) * i5) + ((i5 - 1) * mo128341a(8)), 0);
                }
                return TuplesKt.to(Integer.valueOf(i), Integer.valueOf(i3));
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UserInfoFlowView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        for (Map.Entry<View, Integer> entry : this.f89795c.entrySet()) {
            View key = entry.getKey();
            if (entry.getValue().intValue() != i5) {
                i6 += mo128341a(24) + mo128341a(8);
                i5++;
                i7 = 0;
            }
            key.layout(i7, i6, key.getMeasuredWidth() + i7, key.getMeasuredHeight() + i6);
            i7 += key.getWidth() + mo128341a(8);
        }
    }
}
