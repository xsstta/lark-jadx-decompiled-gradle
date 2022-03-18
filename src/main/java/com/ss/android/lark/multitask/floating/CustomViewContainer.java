package com.ss.android.lark.multitask.floating;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import com.larksuite.suite.R;
import com.ss.android.lark.multitask.floating.AppFloat;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 !2\u00020\u0001:\u0001!B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u001a\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rJ\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\tH\u0002J\u000e\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000fJ\u0010\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u000fH\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\tH\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0016H\u0002J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0006\u0010\u001d\u001a\u00020\u000bJ\u000e\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u000eJ\b\u0010 \u001a\u00020\u000bH\u0002R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/ss/android/lark/multitask/floating/CustomViewContainer;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mCustomViewList", "", "Lcom/ss/android/lark/multitask/floating/CustomView;", "addAllCustomChildren", "", "childrenMap", "", "", "Lcom/ss/android/lark/multitask/floating/AppFloat$CustomViewData;", "addCustomViewWithPriority", "view", "addViewWithPriority", "customViewData", "createChild", "createCustomViewLayoutParams", "Landroid/widget/LinearLayout$LayoutParams;", "customView", "createDivider", "Landroid/view/View;", "createDividerLayoutParams", "hasChildren", "", "removeAllCustomView", "removeCustomView", "key", "resetChildren", "Companion", "base_multitask_impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class CustomViewContainer extends LinearLayout {

    /* renamed from: a */
    public static final Companion f121600a = new Companion(null);

    /* renamed from: b */
    private final List<CustomView> f121601b = new ArrayList();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/multitask/floating/CustomViewContainer$Companion;", "", "()V", "TAG", "", "base_multitask_impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.multitask.floating.CustomViewContainer$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: e */
    private final LinearLayout.LayoutParams m190499e() {
        return new LinearLayout.LayoutParams(-1, 1);
    }

    /* renamed from: a */
    public final void mo168908a() {
        this.f121601b.clear();
        removeAllViews();
    }

    /* renamed from: b */
    public final boolean mo168912b() {
        if (getChildCount() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private final View m190498d() {
        View view = new View(getContext());
        view.setBackgroundColor(ContextCompat.getColor(view.getContext(), R.color.lkui_N300));
        return view;
    }

    /* renamed from: c */
    private final void m190497c() {
        removeAllViews();
        if (this.f121601b.size() != 0) {
            for (CustomView gVar : this.f121601b) {
                if (getChildCount() != 0) {
                    addView(m190498d(), m190499e());
                }
                addView(gVar, m190495b(gVar));
            }
        }
    }

    /* renamed from: b */
    private final LinearLayout.LayoutParams m190495b(CustomView gVar) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(UIHelper.dp2px((float) gVar.getWidthValue()), UIHelper.dp2px((float) gVar.getHeightValue()));
        layoutParams.gravity = 1;
        return layoutParams;
    }

    /* renamed from: a */
    public final void mo168909a(AppFloat.CustomViewData bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "customViewData");
        m190494a(m190496b(bVar));
    }

    /* renamed from: a */
    public final void mo168910a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        int size = this.f121601b.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (Intrinsics.areEqual(this.f121601b.get(i).getKey(), str)) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            this.f121601b.remove(i);
        }
        m190497c();
    }

    /* renamed from: a */
    private final void m190494a(CustomView gVar) {
        if (getChildCount() == 0) {
            addView(gVar, m190495b(gVar));
            this.f121601b.add(gVar);
            return;
        }
        int i = 0;
        int size = this.f121601b.size();
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (this.f121601b.get(i).getPriority() > gVar.getPriority()) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            this.f121601b.add(i, gVar);
        } else {
            this.f121601b.add(gVar);
        }
        m190497c();
    }

    /* renamed from: b */
    private final CustomView m190496b(AppFloat.CustomViewData bVar) {
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        CustomView gVar = new CustomView(context, bVar.mo168966d(), bVar.mo168965c(), bVar.mo168967e());
        Runnable b = bVar.mo168964b();
        if (b != null) {
            gVar.mo168996a(b);
        }
        int[] a = bVar.mo168963a();
        if (a != null) {
            gVar.setWidthValue(RangesKt.coerceAtLeast(gVar.getWidthValue(), a[0]));
            gVar.setHeightValue(RangesKt.coerceAtLeast(gVar.getHeightValue(), a[1]));
        }
        return gVar;
    }

    /* renamed from: a */
    public final void mo168911a(Map<String, AppFloat.CustomViewData> map) {
        Intrinsics.checkParameterIsNotNull(map, "childrenMap");
        removeAllViews();
        for (Map.Entry<String, AppFloat.CustomViewData> entry : map.entrySet()) {
            mo168909a(entry.getValue());
        }
    }

    public CustomViewContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(1);
    }
}
