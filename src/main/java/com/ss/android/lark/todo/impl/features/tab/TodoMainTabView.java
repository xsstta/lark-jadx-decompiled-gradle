package com.ss.android.lark.todo.impl.features.tab;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.todo.impl.features.badge.TodoRedDotHelper;
import com.ss.android.lark.todo.impl.utils.ResUtil;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.tab.C59204a;
import com.ss.android.lark.widget.tab.MainTabItemView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B#\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0002J\b\u0010\u0010\u001a\u00020\u000eH\u0014J\b\u0010\u0011\u001a\u00020\u000eH\u0014J\b\u0010\u0012\u001a\u00020\u000eH\u0002R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/tab/TodoMainTabView;", "Lcom/ss/android/lark/widget/tab/MainTabItemView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mRedDotHelper", "Lcom/ss/android/lark/todo/impl/features/badge/TodoRedDotHelper;", "initView", "", "mount", "onAttachedToWindow", "onDetachedFromWindow", "unMount", "Companion", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class TodoMainTabView extends MainTabItemView {

    /* renamed from: a */
    public static final Companion f141035a = new Companion(null);

    /* renamed from: b */
    private TodoRedDotHelper f141036b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/tab/TodoMainTabView$Companion;", "", "()V", "TAG", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.tab.TodoMainTabView$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/graphics/drawable/Drawable;", "kotlin.jvm.PlatformType", "getDrawable"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.tab.TodoMainTabView$b */
    public static final class C57204b implements MainTabItemView.AbstractC59196a {

        /* renamed from: a */
        public static final C57204b f141037a = new C57204b();

        C57204b() {
        }

        @Override // com.ss.android.lark.widget.tab.MainTabItemView.AbstractC59196a
        public final Drawable getDrawable() {
            return UIHelper.getDrawable(R.drawable.ud_icon_todo_colorful);
        }
    }

    /* renamed from: d */
    private final void m221598d() {
        TodoRedDotHelper cVar = this.f141036b;
        if (cVar != null) {
            cVar.mo191796a();
        }
    }

    /* renamed from: e */
    private final void m221599e() {
        TodoRedDotHelper cVar = this.f141036b;
        if (cVar != null) {
            cVar.mo191798b();
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m221598d();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        m221599e();
        super.onDetachedFromWindow();
    }

    /* renamed from: c */
    private final void m221597c() {
        setTabTitle(ResUtil.f139261a.mo191781c(R.string.Todo_Task_Tasks));
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        mo201235a(UDIconUtils.getIconDrawable(context, (int) R.drawable.ud_icon_tab_todo_filled, UIHelper.getColor(R.color.ud_N500)), C57204b.f141037a);
        TodoRedDotHelper cVar = new TodoRedDotHelper(new C57205c(this));
        this.f141036b = cVar;
        if (cVar == null) {
            Intrinsics.throwNpe();
        }
        cVar.mo191797a(getContext());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0010\u0010\u0004\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/todo/impl/features/tab/TodoMainTabView$initView$2", "Lcom/ss/android/lark/todo/impl/features/badge/TodoRedDotHelper$RedDotDelegate;", "onRedDotViewPrepared", "", "redDotView", "Lcom/ss/android/lark/widget/tab/RedDotView;", "onShowRedDot", "count", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.tab.TodoMainTabView$c */
    public static final class C57205c implements TodoRedDotHelper.RedDotDelegate {

        /* renamed from: a */
        final /* synthetic */ TodoMainTabView f141038a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C57205c(TodoMainTabView todoMainTabView) {
            this.f141038a = todoMainTabView;
        }

        @Override // com.ss.android.lark.todo.impl.features.badge.TodoRedDotHelper.RedDotDelegate
        /* renamed from: a */
        public void mo191799a(int i) {
            this.f141038a.mo201233a(i);
        }

        @Override // com.ss.android.lark.todo.impl.features.badge.TodoRedDotHelper.RedDotDelegate
        /* renamed from: a */
        public void mo191800a(C59204a<?, ?> aVar) {
            ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-2, -2);
            layoutParams.f2815g = R.id.icon;
            layoutParams.f2813e = R.id.icon;
            layoutParams.f2816h = R.id.icon;
            layoutParams.f2818j = R.id.icon;
            this.f141038a.mo201236a(aVar, layoutParams);
        }
    }

    public TodoMainTabView(Context context) {
        super(context);
        m221597c();
    }

    public TodoMainTabView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m221597c();
    }

    public TodoMainTabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m221597c();
    }
}
