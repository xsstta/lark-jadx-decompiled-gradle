package com.ss.android.lark.widget.chat_function_view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.desktopmode.p1788b.p1791c.AbstractC36546c;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB\u001f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0006\u0010\u0013\u001a\u00020\rJ\u001a\u0010\u0014\u001a\u00020\u00152\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\b\u0010\u001a\u001a\u00020\u0015H\u0016J\u0014\u0010\u001b\u001a\u00020\u00152\n\u0010\u001c\u001a\u0006\u0012\u0002\b\u00030\u001dH\u0016R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0002X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/widget/chat_function_view/ChatFunctionView;", "Landroid/widget/FrameLayout;", "Lcom/ss/android/lark/desktopmode/frame/drawer/ISideMenuView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "sideMenuViewDelegate", "getSideMenuViewDelegate", "()Lcom/ss/android/lark/desktopmode/frame/drawer/ISideMenuView;", "setSideMenuViewDelegate", "(Lcom/ss/android/lark/desktopmode/frame/drawer/ISideMenuView;)V", "getRecyclerView", "initRV", "", "adapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "layoutManager", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "onDrawerClosed", "onDrawerOpened", "fragment", "Lcom/ss/android/lark/desktopmode/app/DesktopCompatFragment;", "com.ss.android.lark.widget"}, mo238835k = 1, mv = {1, 1, 16})
public final class ChatFunctionView extends FrameLayout implements AbstractC36546c {

    /* renamed from: a */
    private final RecyclerView f143602a;

    /* renamed from: b */
    private AbstractC36546c f143603b;

    public final RecyclerView getRecyclerView() {
        return this.f143602a;
    }

    public final AbstractC36546c getSideMenuViewDelegate() {
        return this.f143603b;
    }

    @Override // com.ss.android.lark.desktopmode.p1788b.p1791c.AbstractC36546c
    /* renamed from: a */
    public void mo129894a() {
        AbstractC36546c cVar = this.f143603b;
        if (cVar != null) {
            cVar.mo129894a();
        }
    }

    public final void setSideMenuViewDelegate(AbstractC36546c cVar) {
        this.f143603b = cVar;
    }

    @Override // com.ss.android.lark.desktopmode.p1788b.p1791c.AbstractC36546c
    /* renamed from: a */
    public void mo129897a(C36516a<?> aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "fragment");
        AbstractC36546c cVar = this.f143603b;
        if (cVar != null) {
            cVar.mo129897a(aVar);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChatFunctionView(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        RecyclerView recyclerView = new RecyclerView(getContext());
        this.f143602a = recyclerView;
        setBackgroundColor(C57582a.m223616d(getContext(), R.color.bg_body));
        setPaddingRelative(UIHelper.dp2px(20.0f), 0, UIHelper.dp2px(20.0f), UIHelper.dp2px(8.0f));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        recyclerView.setLayoutParams(layoutParams);
        recyclerView.setPaddingRelative(0, UIHelper.dp2px(3.0f), 0, 0);
        addView(recyclerView);
    }

    /* renamed from: a */
    public final void mo197607a(RecyclerView.Adapter<?> adapter, RecyclerView.LayoutManager layoutManager) {
        Intrinsics.checkParameterIsNotNull(adapter, "adapter");
        Intrinsics.checkParameterIsNotNull(layoutManager, "layoutManager");
        this.f143602a.setAdapter(adapter);
        this.f143602a.setLayoutManager(layoutManager);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChatFunctionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(attributeSet, "attrs");
        RecyclerView recyclerView = new RecyclerView(getContext());
        this.f143602a = recyclerView;
        setBackgroundColor(C57582a.m223616d(getContext(), R.color.bg_body));
        setPaddingRelative(UIHelper.dp2px(20.0f), 0, UIHelper.dp2px(20.0f), UIHelper.dp2px(8.0f));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        recyclerView.setLayoutParams(layoutParams);
        recyclerView.setPaddingRelative(0, UIHelper.dp2px(3.0f), 0, 0);
        addView(recyclerView);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChatFunctionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(attributeSet, "attrs");
        RecyclerView recyclerView = new RecyclerView(getContext());
        this.f143602a = recyclerView;
        setBackgroundColor(C57582a.m223616d(getContext(), R.color.bg_body));
        setPaddingRelative(UIHelper.dp2px(20.0f), 0, UIHelper.dp2px(20.0f), UIHelper.dp2px(8.0f));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        recyclerView.setLayoutParams(layoutParams);
        recyclerView.setPaddingRelative(0, UIHelper.dp2px(3.0f), 0, 0);
        addView(recyclerView);
    }
}
