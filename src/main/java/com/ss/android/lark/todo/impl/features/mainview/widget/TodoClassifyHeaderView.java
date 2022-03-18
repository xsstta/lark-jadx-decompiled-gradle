package com.ss.android.lark.todo.impl.features.mainview.widget;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.todo.dependency.TodoDependencyHolder;
import com.ss.android.lark.todo.impl.features.mainview.entity.TodoFilterType;
import com.ss.android.lark.todo.impl.framework.hitpoint.event.TodoGeneralHitPoint;
import com.ss.android.lark.todo.impl.framework.hitpoint.event.TodoHitPoint;
import com.ss.android.lark.todo.impl.utils.ResUtil;
import com.ss.android.lark.ui.p2892a.C57582a;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 l2\u00020\u0001:\u0003lmnB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010E\u001a\u00020FH\u0002J\b\u0010G\u001a\u00020FH\u0002J8\u0010H\u001a\u00020F2\b\u0010I\u001a\u0004\u0018\u00010&2\b\u0010J\u001a\u0004\u0018\u00010&2\b\u0010K\u001a\u0004\u0018\u00010\u00012\u0006\u0010L\u001a\u00020M2\b\b\u0002\u0010N\u001a\u00020\u0011H\u0002J\b\u0010O\u001a\u00020FH\u0002J@\u0010P\u001a\u00020\u00012\u0006\u0010Q\u001a\u00020\u00012\u0006\u0010R\u001a\u00020\t2\u0006\u0010S\u001a\u00020&2\u0006\u0010T\u001a\u00020\t2\u0006\u0010U\u001a\u00020\t2\u0006\u0010V\u001a\u00020&2\u0006\u0010W\u001a\u00020\tH\u0002J\u0012\u0010X\u001a\u00020\t2\b\u0010Y\u001a\u0004\u0018\u00010\u0001H\u0002J\u0010\u0010Z\u001a\u00020[2\u0006\u0010\\\u001a\u00020\tH\u0002J\b\u0010]\u001a\u00020FH\u0002J\b\u0010^\u001a\u00020FH\u0002J\b\u0010_\u001a\u00020FH\u0002J\b\u0010`\u001a\u00020FH\u0002J\b\u0010a\u001a\u00020FH\u0002J\b\u0010b\u001a\u00020FH\u0002J\u000e\u0010c\u001a\u00020F2\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010d\u001a\u00020F2\b\u0010e\u001a\u0004\u0018\u00010MJ.\u0010f\u001a\u00020F2&\u0010g\u001a\"\u0012\u0004\u0012\u00020M\u0012\u0004\u0012\u00020\t\u0018\u00010hj\u0010\u0012\u0004\u0012\u00020M\u0012\u0004\u0012\u00020\t\u0018\u0001`iJ\u0010\u0010j\u001a\u00020F2\u0006\u0010k\u001a\u00020&H\u0002R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u000ej\b\u0012\u0004\u0012\u00020\u0001`\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0014\u001a\u00020\u00018BX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0019\u001a\u00020\u00018BX\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001a\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00018BX\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001d\u0010\u0016R\u001b\u0010\u001f\u001a\u00020\u00018BX\u0002¢\u0006\f\n\u0004\b!\u0010\u0018\u001a\u0004\b \u0010\u0016R\u001b\u0010\"\u001a\u00020\u00018BX\u0002¢\u0006\f\n\u0004\b$\u0010\u0018\u001a\u0004\b#\u0010\u0016R\u001b\u0010%\u001a\u00020&8BX\u0002¢\u0006\f\n\u0004\b)\u0010\u0018\u001a\u0004\b'\u0010(R\u001b\u0010*\u001a\u00020&8BX\u0002¢\u0006\f\n\u0004\b,\u0010\u0018\u001a\u0004\b+\u0010(R\u001b\u0010-\u001a\u00020&8BX\u0002¢\u0006\f\n\u0004\b/\u0010\u0018\u001a\u0004\b.\u0010(R\u001b\u00100\u001a\u00020&8BX\u0002¢\u0006\f\n\u0004\b2\u0010\u0018\u001a\u0004\b1\u0010(R\u001b\u00103\u001a\u00020&8BX\u0002¢\u0006\f\n\u0004\b5\u0010\u0018\u001a\u0004\b4\u0010(R\u001b\u00106\u001a\u00020&8BX\u0002¢\u0006\f\n\u0004\b8\u0010\u0018\u001a\u0004\b7\u0010(R\u001b\u00109\u001a\u00020&8BX\u0002¢\u0006\f\n\u0004\b;\u0010\u0018\u001a\u0004\b:\u0010(R\u001b\u0010<\u001a\u00020&8BX\u0002¢\u0006\f\n\u0004\b>\u0010\u0018\u001a\u0004\b=\u0010(R\u001b\u0010?\u001a\u00020&8BX\u0002¢\u0006\f\n\u0004\bA\u0010\u0018\u001a\u0004\b@\u0010(R\u001b\u0010B\u001a\u00020&8BX\u0002¢\u0006\f\n\u0004\bD\u0010\u0018\u001a\u0004\bC\u0010(¨\u0006o"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview/widget/TodoClassifyHeaderView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "classifyClickListener", "Lcom/ss/android/lark/todo/impl/features/mainview/widget/TodoClassifyHeaderView$OnClassifyClickListener;", "containerList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "isArranging", "", "linePosition", "Lcom/ss/android/lark/todo/impl/features/mainview/widget/TodoClassifyHeaderView$LinePosition;", "llAssignFromMe", "getLlAssignFromMe", "()Landroid/widget/LinearLayout;", "llAssignFromMe$delegate", "Lkotlin/Lazy;", "llAssignToMe", "getLlAssignToMe", "llAssignToMe$delegate", "llCompleted", "getLlCompleted", "llCompleted$delegate", "llFollow", "getLlFollow", "llFollow$delegate", "llFromDocs", "getLlFromDocs", "llFromDocs$delegate", "tvAssignFromMe", "Landroid/widget/TextView;", "getTvAssignFromMe", "()Landroid/widget/TextView;", "tvAssignFromMe$delegate", "tvAssignFromMeCount", "getTvAssignFromMeCount", "tvAssignFromMeCount$delegate", "tvAssignToMe", "getTvAssignToMe", "tvAssignToMe$delegate", "tvAssignToMeCount", "getTvAssignToMeCount", "tvAssignToMeCount$delegate", "tvCompleted", "getTvCompleted", "tvCompleted$delegate", "tvCompletedCount", "getTvCompletedCount", "tvCompletedCount$delegate", "tvFollow", "getTvFollow", "tvFollow$delegate", "tvFollowCount", "getTvFollowCount", "tvFollowCount$delegate", "tvFromDocs", "getTvFromDocs", "tvFromDocs$delegate", "tvFromDocsCount", "getTvFromDocsCount", "tvFromDocsCount$delegate", "arrangeClassifyBtn", "", "clearIconAndArrange", "clickClassifyItem", "filterNameTv", "filterNameCountTv", "filterLl", "filterType", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoFilterType;", "isUserOperation", "createClassifyBtn", "createPanelContainer", "containerLl", "containerId", "panelTv", "panelId", "panelResId", "panelCountTv", "panelCountId", "getContainerWidth", "container", "getDisplayCount", "", "countNum", "initListener", "initView", "initialContainer", "initialTextColorAndTypeface", "initialView", "removeOriginContainer", "setActionListener", "updateFilter", ShareHitPoint.f121869d, "updateFilterCount", "filterCountMap", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "updateTextColorAndTypeface", "textView", "Companion", "LinePosition", "OnClassifyClickListener", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class TodoClassifyHeaderView extends LinearLayout {

    /* renamed from: A */
    private static final int f140481A = C57582a.m223600a(12);

    /* renamed from: B */
    private static final int f140482B = C57582a.m223600a(10);

    /* renamed from: C */
    private static final int f140483C = C57582a.m223600a(28);

    /* renamed from: a */
    public static final Companion f140484a = new Companion(null);

    /* renamed from: u */
    private static final int f140485u = R.drawable.todo_bg_classify_btn_normal;

    /* renamed from: v */
    private static final int f140486v = R.drawable.todo_bg_classify_btn_clicked;

    /* renamed from: w */
    private static final int f140487w = ResUtil.f139261a.mo191775a(R.color.text_caption);

    /* renamed from: x */
    private static final int f140488x = ResUtil.f139261a.mo191775a(R.color.primary_pri_500);

    /* renamed from: y */
    private static final int f140489y = C57582a.m223600a(16);

    /* renamed from: z */
    private static final int f140490z = C57582a.m223600a(6);

    /* renamed from: D */
    private HashMap f140491D;

    /* renamed from: b */
    private OnClassifyClickListener f140492b;

    /* renamed from: c */
    private final ArrayList<LinearLayout> f140493c;

    /* renamed from: d */
    private LinePosition f140494d;

    /* renamed from: e */
    private boolean f140495e;

    /* renamed from: f */
    private final Lazy f140496f;

    /* renamed from: g */
    private final Lazy f140497g;

    /* renamed from: h */
    private final Lazy f140498h;

    /* renamed from: i */
    private final Lazy f140499i;

    /* renamed from: j */
    private final Lazy f140500j;

    /* renamed from: k */
    private final Lazy f140501k;

    /* renamed from: l */
    private final Lazy f140502l;

    /* renamed from: m */
    private final Lazy f140503m;

    /* renamed from: n */
    private final Lazy f140504n;

    /* renamed from: o */
    private final Lazy f140505o;

    /* renamed from: p */
    private final Lazy f140506p;

    /* renamed from: q */
    private final Lazy f140507q;

    /* renamed from: r */
    private final Lazy f140508r;

    /* renamed from: s */
    private final Lazy f140509s;

    /* renamed from: t */
    private final Lazy f140510t;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview/widget/TodoClassifyHeaderView$LinePosition;", "", "(Ljava/lang/String;I)V", "FIRST", "SECOND", "THIRD", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum LinePosition {
        FIRST,
        SECOND,
        THIRD
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview/widget/TodoClassifyHeaderView$OnClassifyClickListener;", "", "onClassifyBtnClick", "", ShareHitPoint.f121869d, "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoFilterType;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.widget.TodoClassifyHeaderView$b */
    public interface OnClassifyClickListener {
        /* renamed from: a */
        void mo193275a(TodoFilterType todoFilterType);
    }

    /* renamed from: a */
    public View mo193424a(int i) {
        if (this.f140491D == null) {
            this.f140491D = new HashMap();
        }
        View view = (View) this.f140491D.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f140491D.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final LinearLayout getLlAssignFromMe() {
        return (LinearLayout) this.f140499i.getValue();
    }

    public final LinearLayout getLlAssignToMe() {
        return (LinearLayout) this.f140496f.getValue();
    }

    public final LinearLayout getLlCompleted() {
        return (LinearLayout) this.f140505o.getValue();
    }

    public final LinearLayout getLlFollow() {
        return (LinearLayout) this.f140502l.getValue();
    }

    public final LinearLayout getLlFromDocs() {
        return (LinearLayout) this.f140508r.getValue();
    }

    public final TextView getTvAssignFromMe() {
        return (TextView) this.f140500j.getValue();
    }

    public final TextView getTvAssignFromMeCount() {
        return (TextView) this.f140501k.getValue();
    }

    public final TextView getTvAssignToMe() {
        return (TextView) this.f140497g.getValue();
    }

    public final TextView getTvAssignToMeCount() {
        return (TextView) this.f140498h.getValue();
    }

    public final TextView getTvCompleted() {
        return (TextView) this.f140506p.getValue();
    }

    public final TextView getTvCompletedCount() {
        return (TextView) this.f140507q.getValue();
    }

    public final TextView getTvFollow() {
        return (TextView) this.f140503m.getValue();
    }

    public final TextView getTvFollowCount() {
        return (TextView) this.f140504n.getValue();
    }

    public final TextView getTvFromDocs() {
        return (TextView) this.f140509s.getValue();
    }

    public final TextView getTvFromDocsCount() {
        return (TextView) this.f140510t.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview/widget/TodoClassifyHeaderView$Companion;", "", "()V", "bgClickableDrawable", "", "bgInitialDrawable", "containerHeight", "containerMargin", "containerPadding", "lineMargin", "linePadding", "tvBlueColor", "tvGrayColor", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.widget.TodoClassifyHeaderView$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo193427a(HashMap<TodoFilterType, Integer> hashMap) {
        if (hashMap != null) {
            TextView textView = (TextView) mo193424a(R.id.tvToBeCompletedCount);
            Intrinsics.checkExpressionValueIsNotNull(textView, "tvToBeCompletedCount");
            Integer num = hashMap.get(TodoFilterType.ALL);
            if (num == null) {
                num = 0;
            }
            textView.setText(m221011b(num.intValue()));
            TextView tvAssignFromMeCount = getTvAssignFromMeCount();
            Integer num2 = hashMap.get(TodoFilterType.ASSIGN_FROM_ME);
            if (num2 == null) {
                num2 = 0;
            }
            tvAssignFromMeCount.setText(m221011b(num2.intValue()));
            TextView tvAssignToMeCount = getTvAssignToMeCount();
            Integer num3 = hashMap.get(TodoFilterType.ASSIGN_TO_ME);
            if (num3 == null) {
                num3 = 0;
            }
            tvAssignToMeCount.setText(m221011b(num3.intValue()));
            TextView tvFollowCount = getTvFollowCount();
            Integer num4 = hashMap.get(TodoFilterType.FOLLOWED);
            if (num4 == null) {
                num4 = 0;
            }
            tvFollowCount.setText(m221011b(num4.intValue()));
            mo193425a();
        }
    }

    /* renamed from: f */
    private final void m221016f() {
        m221017g();
        m221018h();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/LinearLayout;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.widget.TodoClassifyHeaderView$j */
    static final class C56921j extends Lambda implements Function0<LinearLayout> {
        final /* synthetic */ TodoClassifyHeaderView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56921j(TodoClassifyHeaderView todoClassifyHeaderView) {
            super(0);
            this.this$0 = todoClassifyHeaderView;
        }

        @Override // kotlin.jvm.functions.Function0
        public final LinearLayout invoke() {
            return new LinearLayout(this.this$0.getContext());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/LinearLayout;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.widget.TodoClassifyHeaderView$k */
    static final class C56922k extends Lambda implements Function0<LinearLayout> {
        final /* synthetic */ TodoClassifyHeaderView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56922k(TodoClassifyHeaderView todoClassifyHeaderView) {
            super(0);
            this.this$0 = todoClassifyHeaderView;
        }

        @Override // kotlin.jvm.functions.Function0
        public final LinearLayout invoke() {
            return new LinearLayout(this.this$0.getContext());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/LinearLayout;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.widget.TodoClassifyHeaderView$l */
    static final class C56923l extends Lambda implements Function0<LinearLayout> {
        final /* synthetic */ TodoClassifyHeaderView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56923l(TodoClassifyHeaderView todoClassifyHeaderView) {
            super(0);
            this.this$0 = todoClassifyHeaderView;
        }

        @Override // kotlin.jvm.functions.Function0
        public final LinearLayout invoke() {
            return new LinearLayout(this.this$0.getContext());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/LinearLayout;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.widget.TodoClassifyHeaderView$m */
    static final class C56924m extends Lambda implements Function0<LinearLayout> {
        final /* synthetic */ TodoClassifyHeaderView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56924m(TodoClassifyHeaderView todoClassifyHeaderView) {
            super(0);
            this.this$0 = todoClassifyHeaderView;
        }

        @Override // kotlin.jvm.functions.Function0
        public final LinearLayout invoke() {
            return new LinearLayout(this.this$0.getContext());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/LinearLayout;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.widget.TodoClassifyHeaderView$n */
    static final class C56925n extends Lambda implements Function0<LinearLayout> {
        final /* synthetic */ TodoClassifyHeaderView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56925n(TodoClassifyHeaderView todoClassifyHeaderView) {
            super(0);
            this.this$0 = todoClassifyHeaderView;
        }

        @Override // kotlin.jvm.functions.Function0
        public final LinearLayout invoke() {
            return new LinearLayout(this.this$0.getContext());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.widget.TodoClassifyHeaderView$o */
    static final class C56926o extends Lambda implements Function0<TextView> {
        final /* synthetic */ TodoClassifyHeaderView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56926o(TodoClassifyHeaderView todoClassifyHeaderView) {
            super(0);
            this.this$0 = todoClassifyHeaderView;
        }

        @Override // kotlin.jvm.functions.Function0
        public final TextView invoke() {
            return new TextView(this.this$0.getContext());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.widget.TodoClassifyHeaderView$p */
    static final class C56927p extends Lambda implements Function0<TextView> {
        final /* synthetic */ TodoClassifyHeaderView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56927p(TodoClassifyHeaderView todoClassifyHeaderView) {
            super(0);
            this.this$0 = todoClassifyHeaderView;
        }

        @Override // kotlin.jvm.functions.Function0
        public final TextView invoke() {
            return new TextView(this.this$0.getContext());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.widget.TodoClassifyHeaderView$q */
    static final class C56928q extends Lambda implements Function0<TextView> {
        final /* synthetic */ TodoClassifyHeaderView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56928q(TodoClassifyHeaderView todoClassifyHeaderView) {
            super(0);
            this.this$0 = todoClassifyHeaderView;
        }

        @Override // kotlin.jvm.functions.Function0
        public final TextView invoke() {
            return new TextView(this.this$0.getContext());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.widget.TodoClassifyHeaderView$r */
    static final class C56929r extends Lambda implements Function0<TextView> {
        final /* synthetic */ TodoClassifyHeaderView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56929r(TodoClassifyHeaderView todoClassifyHeaderView) {
            super(0);
            this.this$0 = todoClassifyHeaderView;
        }

        @Override // kotlin.jvm.functions.Function0
        public final TextView invoke() {
            return new TextView(this.this$0.getContext());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.widget.TodoClassifyHeaderView$s */
    static final class C56930s extends Lambda implements Function0<TextView> {
        final /* synthetic */ TodoClassifyHeaderView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56930s(TodoClassifyHeaderView todoClassifyHeaderView) {
            super(0);
            this.this$0 = todoClassifyHeaderView;
        }

        @Override // kotlin.jvm.functions.Function0
        public final TextView invoke() {
            return new TextView(this.this$0.getContext());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.widget.TodoClassifyHeaderView$t */
    static final class C56931t extends Lambda implements Function0<TextView> {
        final /* synthetic */ TodoClassifyHeaderView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56931t(TodoClassifyHeaderView todoClassifyHeaderView) {
            super(0);
            this.this$0 = todoClassifyHeaderView;
        }

        @Override // kotlin.jvm.functions.Function0
        public final TextView invoke() {
            return new TextView(this.this$0.getContext());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.widget.TodoClassifyHeaderView$u */
    static final class C56932u extends Lambda implements Function0<TextView> {
        final /* synthetic */ TodoClassifyHeaderView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56932u(TodoClassifyHeaderView todoClassifyHeaderView) {
            super(0);
            this.this$0 = todoClassifyHeaderView;
        }

        @Override // kotlin.jvm.functions.Function0
        public final TextView invoke() {
            return new TextView(this.this$0.getContext());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.widget.TodoClassifyHeaderView$v */
    static final class C56933v extends Lambda implements Function0<TextView> {
        final /* synthetic */ TodoClassifyHeaderView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56933v(TodoClassifyHeaderView todoClassifyHeaderView) {
            super(0);
            this.this$0 = todoClassifyHeaderView;
        }

        @Override // kotlin.jvm.functions.Function0
        public final TextView invoke() {
            return new TextView(this.this$0.getContext());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.widget.TodoClassifyHeaderView$w */
    static final class C56934w extends Lambda implements Function0<TextView> {
        final /* synthetic */ TodoClassifyHeaderView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56934w(TodoClassifyHeaderView todoClassifyHeaderView) {
            super(0);
            this.this$0 = todoClassifyHeaderView;
        }

        @Override // kotlin.jvm.functions.Function0
        public final TextView invoke() {
            return new TextView(this.this$0.getContext());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.widget.TodoClassifyHeaderView$x */
    static final class C56935x extends Lambda implements Function0<TextView> {
        final /* synthetic */ TodoClassifyHeaderView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56935x(TodoClassifyHeaderView todoClassifyHeaderView) {
            super(0);
            this.this$0 = todoClassifyHeaderView;
        }

        @Override // kotlin.jvm.functions.Function0
        public final TextView invoke() {
            return new TextView(this.this$0.getContext());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/todo/impl/features/mainview/widget/TodoClassifyHeaderView$initView$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.widget.TodoClassifyHeaderView$i */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC56920i implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ TodoClassifyHeaderView f140517a;

        public void onGlobalLayout() {
            this.f140517a.mo193425a();
            this.f140517a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        ViewTreeObserver$OnGlobalLayoutListenerC56920i(TodoClassifyHeaderView todoClassifyHeaderView) {
            this.f140517a = todoClassifyHeaderView;
        }
    }

    /* renamed from: b */
    private final void m221012b() {
        LayoutInflater.from(getContext()).inflate(R.layout.todo_widget_classify_view, (ViewGroup) this, true);
        m221013c();
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC56920i(this));
    }

    /* renamed from: g */
    private final void m221017g() {
        int i = f140485u;
        ((LinearLayout) mo193424a(R.id.llToBeCompleted)).setBackgroundResource(i);
        getLlAssignFromMe().setBackgroundResource(i);
        getLlAssignToMe().setBackgroundResource(i);
        getLlFollow().setBackgroundResource(i);
        getLlCompleted().setBackgroundResource(i);
        getLlFromDocs().setBackgroundResource(i);
        invalidate();
    }

    /* renamed from: e */
    private final void m221015e() {
        ((LinearLayout) mo193424a(R.id.llToBeCompleted)).setOnClickListener(new View$OnClickListenerC56914c(this));
        getLlAssignToMe().setOnClickListener(new View$OnClickListenerC56915d(this));
        getLlAssignFromMe().setOnClickListener(new View$OnClickListenerC56916e(this));
        getLlFollow().setOnClickListener(new View$OnClickListenerC56917f(this));
        getLlCompleted().setOnClickListener(new View$OnClickListenerC56918g(this));
        getLlFromDocs().setOnClickListener(new View$OnClickListenerC56919h(this));
    }

    /* renamed from: h */
    private final void m221018h() {
        TextView textView = (TextView) mo193424a(R.id.tvToBeCompleted);
        Intrinsics.checkExpressionValueIsNotNull(textView, "tvToBeCompleted");
        m221008a(textView);
        TextView textView2 = (TextView) mo193424a(R.id.tvToBeCompletedCount);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "tvToBeCompletedCount");
        m221008a(textView2);
        m221008a(getTvAssignFromMe());
        m221008a(getTvAssignFromMeCount());
        m221008a(getTvAssignToMe());
        m221008a(getTvAssignToMeCount());
        m221008a(getTvFollow());
        m221008a(getTvFollowCount());
        m221008a(getTvCompleted());
        m221008a(getTvCompletedCount());
        m221008a(getTvFromDocs());
        m221008a(getTvFromDocsCount());
    }

    /* renamed from: c */
    private final void m221013c() {
        this.f140493c.add(m221007a(getLlAssignToMe(), R.id.llAssignToMe, getTvAssignToMe(), R.id.tvAssignToMe, R.string.Todo_Task_TasksAssignedToMe, getTvAssignToMeCount(), R.id.tvAssignToMeCount));
        this.f140493c.add(m221007a(getLlAssignFromMe(), R.id.llAssignFromMe, getTvAssignFromMe(), R.id.tvAssignFromMe, R.string.Todo_Task_TasksAssignedByMeToOthers, getTvAssignFromMeCount(), R.id.tvAssignFromMeCount));
        this.f140493c.add(m221007a(getLlFollow(), R.id.llFollow, getTvFollow(), R.id.tvFollow, R.string.Todo_Task_FollowedByMe, getTvFollowCount(), R.id.tvFollowCount));
        if (TodoDependencyHolder.f139242a.mo191731b().mo191929b()) {
            this.f140493c.add(m221007a(getLlFromDocs(), R.id.llFromDocs, getTvFromDocs(), R.id.tvFromDocs, R.string.Todo_Task_FromDocs, getTvFromDocsCount(), R.id.tvFromDocsCount));
        }
        this.f140493c.add(m221007a(getLlCompleted(), R.id.llCompleted, getTvCompleted(), R.id.tvCompleted, R.string.Todo_Menu_Completed, getTvCompletedCount(), R.id.tvCompletedCount));
    }

    /* renamed from: i */
    private final void m221019i() {
        boolean z;
        boolean z2;
        for (T t : this.f140493c) {
            LinearLayout linearLayout = (LinearLayout) mo193424a(R.id.llFirstLine);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "llFirstLine");
            boolean z3 = true;
            if (linearLayout.indexOfChild(t) != -1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                ((LinearLayout) mo193424a(R.id.llFirstLine)).removeView(t);
            } else {
                LinearLayout linearLayout2 = (LinearLayout) mo193424a(R.id.llSecondLine);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "llSecondLine");
                if (linearLayout2.indexOfChild(t) != -1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    ((LinearLayout) mo193424a(R.id.llSecondLine)).removeView(t);
                } else {
                    LinearLayout linearLayout3 = (LinearLayout) mo193424a(R.id.llThirdLine);
                    Intrinsics.checkExpressionValueIsNotNull(linearLayout3, "llThirdLine");
                    if (linearLayout3.indexOfChild(t) == -1) {
                        z3 = false;
                    }
                    if (z3) {
                        ((LinearLayout) mo193424a(R.id.llThirdLine)).removeView(t);
                    }
                }
            }
        }
    }

    /* renamed from: d */
    private final void m221014d() {
        int i;
        this.f140494d = LinePosition.FIRST;
        LinearLayout linearLayout = (LinearLayout) mo193424a(R.id.llSecondLine);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "llSecondLine");
        linearLayout.setVisibility(0);
        LinearLayout linearLayout2 = (LinearLayout) mo193424a(R.id.llThirdLine);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "llThirdLine");
        linearLayout2.setVisibility(8);
        LinearLayout linearLayout3 = (LinearLayout) mo193424a(R.id.llFirstLine);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout3, "llFirstLine");
        int width = linearLayout3.getWidth();
        int i2 = f140489y;
        LinearLayout linearLayout4 = (LinearLayout) mo193424a(R.id.llToBeCompleted);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout4, "llToBeCompleted");
        int width2 = (width - (i2 * 2)) - linearLayout4.getWidth();
        LinearLayout linearLayout5 = (LinearLayout) mo193424a(R.id.llSecondLine);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout5, "llSecondLine");
        int width3 = (linearLayout5.getWidth() - i2) - f140490z;
        for (T t : this.f140493c) {
            int a = m221006a((LinearLayout) t);
            if (this.f140494d == LinePosition.THIRD) {
                ((LinearLayout) mo193424a(R.id.llThirdLine)).addView(t);
            } else {
                if (this.f140494d == LinePosition.SECOND) {
                    i = f140482B;
                    if (width3 - i > a) {
                        ((LinearLayout) mo193424a(R.id.llSecondLine)).addView(t);
                    } else {
                        this.f140494d = LinePosition.THIRD;
                        LinearLayout linearLayout6 = (LinearLayout) mo193424a(R.id.llThirdLine);
                        Intrinsics.checkExpressionValueIsNotNull(linearLayout6, "llThirdLine");
                        linearLayout6.setVisibility(0);
                        ((LinearLayout) mo193424a(R.id.llThirdLine)).addView(t);
                    }
                } else {
                    i = f140482B;
                    if (width2 - i > a) {
                        ((LinearLayout) mo193424a(R.id.llFirstLine)).addView(t);
                        width2 -= a + i;
                    } else {
                        this.f140494d = LinePosition.SECOND;
                        ((LinearLayout) mo193424a(R.id.llSecondLine)).addView(t);
                    }
                }
                width3 -= a + i;
            }
        }
        if (this.f140494d == LinePosition.FIRST) {
            LinearLayout linearLayout7 = (LinearLayout) mo193424a(R.id.llSecondLine);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout7, "llSecondLine");
            linearLayout7.setVisibility(8);
            LinearLayout linearLayout8 = (LinearLayout) mo193424a(R.id.llThirdLine);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout8, "llThirdLine");
            linearLayout8.setVisibility(8);
        }
    }

    /* renamed from: a */
    public final void mo193425a() {
        if (!this.f140495e) {
            this.f140495e = true;
            m221019i();
            m221014d();
            this.f140495e = false;
        }
    }

    public final void setActionListener(OnClassifyClickListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "classifyClickListener");
        this.f140492b = bVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TodoClassifyHeaderView(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    private final void m221008a(TextView textView) {
        textView.setTextColor(f140487w);
        textView.setTypeface(Typeface.defaultFromStyle(0));
    }

    /* renamed from: a */
    private final int m221006a(LinearLayout linearLayout) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        if (linearLayout != null) {
            linearLayout.measure(makeMeasureSpec, makeMeasureSpec2);
        }
        if (linearLayout != null) {
            return linearLayout.getMeasuredWidth();
        }
        return 0;
    }

    /* renamed from: b */
    private final String m221011b(int i) {
        if (i >= 100) {
            return " 99+";
        }
        if (i <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(' ');
        sb.append(i);
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.widget.TodoClassifyHeaderView$c */
    public static final class View$OnClickListenerC56914c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TodoClassifyHeaderView f140511a;

        View$OnClickListenerC56914c(TodoClassifyHeaderView todoClassifyHeaderView) {
            this.f140511a = todoClassifyHeaderView;
        }

        public final void onClick(View view) {
            TodoGeneralHitPoint.f141070a.mo194184b(TodoFilterType.ALL);
            TodoClassifyHeaderView todoClassifyHeaderView = this.f140511a;
            TodoClassifyHeaderView.m221010a(todoClassifyHeaderView, (TextView) todoClassifyHeaderView.mo193424a(R.id.tvToBeCompleted), (TextView) this.f140511a.mo193424a(R.id.tvToBeCompletedCount), (LinearLayout) this.f140511a.mo193424a(R.id.llToBeCompleted), TodoFilterType.ALL, false, 16, null);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.widget.TodoClassifyHeaderView$d */
    public static final class View$OnClickListenerC56915d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TodoClassifyHeaderView f140512a;

        View$OnClickListenerC56915d(TodoClassifyHeaderView todoClassifyHeaderView) {
            this.f140512a = todoClassifyHeaderView;
        }

        public final void onClick(View view) {
            TodoGeneralHitPoint.f141070a.mo194184b(TodoFilterType.ASSIGN_TO_ME);
            TodoClassifyHeaderView todoClassifyHeaderView = this.f140512a;
            TodoClassifyHeaderView.m221010a(todoClassifyHeaderView, todoClassifyHeaderView.getTvAssignToMe(), this.f140512a.getTvAssignToMeCount(), this.f140512a.getLlAssignToMe(), TodoFilterType.ASSIGN_TO_ME, false, 16, null);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.widget.TodoClassifyHeaderView$e */
    public static final class View$OnClickListenerC56916e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TodoClassifyHeaderView f140513a;

        View$OnClickListenerC56916e(TodoClassifyHeaderView todoClassifyHeaderView) {
            this.f140513a = todoClassifyHeaderView;
        }

        public final void onClick(View view) {
            TodoGeneralHitPoint.f141070a.mo194184b(TodoFilterType.ASSIGN_FROM_ME);
            TodoClassifyHeaderView todoClassifyHeaderView = this.f140513a;
            TodoClassifyHeaderView.m221010a(todoClassifyHeaderView, todoClassifyHeaderView.getTvAssignFromMe(), this.f140513a.getTvAssignFromMeCount(), this.f140513a.getLlAssignFromMe(), TodoFilterType.ASSIGN_FROM_ME, false, 16, null);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.widget.TodoClassifyHeaderView$f */
    public static final class View$OnClickListenerC56917f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TodoClassifyHeaderView f140514a;

        View$OnClickListenerC56917f(TodoClassifyHeaderView todoClassifyHeaderView) {
            this.f140514a = todoClassifyHeaderView;
        }

        public final void onClick(View view) {
            TodoGeneralHitPoint.f141070a.mo194184b(TodoFilterType.FOLLOWED);
            TodoClassifyHeaderView todoClassifyHeaderView = this.f140514a;
            TodoClassifyHeaderView.m221010a(todoClassifyHeaderView, todoClassifyHeaderView.getTvFollow(), this.f140514a.getTvFollowCount(), this.f140514a.getLlFollow(), TodoFilterType.FOLLOWED, false, 16, null);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.widget.TodoClassifyHeaderView$g */
    public static final class View$OnClickListenerC56918g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TodoClassifyHeaderView f140515a;

        View$OnClickListenerC56918g(TodoClassifyHeaderView todoClassifyHeaderView) {
            this.f140515a = todoClassifyHeaderView;
        }

        public final void onClick(View view) {
            TodoGeneralHitPoint.f141070a.mo194184b(TodoFilterType.COMPLETED);
            TodoClassifyHeaderView todoClassifyHeaderView = this.f140515a;
            TodoClassifyHeaderView.m221010a(todoClassifyHeaderView, todoClassifyHeaderView.getTvCompleted(), this.f140515a.getTvCompletedCount(), this.f140515a.getLlCompleted(), TodoFilterType.COMPLETED, false, 16, null);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.widget.TodoClassifyHeaderView$h */
    public static final class View$OnClickListenerC56919h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TodoClassifyHeaderView f140516a;

        View$OnClickListenerC56919h(TodoClassifyHeaderView todoClassifyHeaderView) {
            this.f140516a = todoClassifyHeaderView;
        }

        public final void onClick(View view) {
            TodoGeneralHitPoint.f141070a.mo194184b(TodoFilterType.FROM_DOCS);
            TodoClassifyHeaderView todoClassifyHeaderView = this.f140516a;
            TodoClassifyHeaderView.m221010a(todoClassifyHeaderView, todoClassifyHeaderView.getTvFromDocs(), this.f140516a.getTvFromDocsCount(), this.f140516a.getLlFromDocs(), TodoFilterType.FROM_DOCS, false, 16, null);
        }
    }

    /* renamed from: a */
    public final void mo193426a(TodoFilterType todoFilterType) {
        if (todoFilterType != null) {
            switch (C56936b.f140519b[todoFilterType.ordinal()]) {
                case 1:
                    m221009a((TextView) mo193424a(R.id.tvToBeCompleted), (TextView) mo193424a(R.id.tvToBeCompletedCount), (LinearLayout) mo193424a(R.id.llToBeCompleted), TodoFilterType.ALL, false);
                    return;
                case 2:
                    m221009a(getTvAssignToMe(), getTvAssignToMeCount(), getLlAssignToMe(), TodoFilterType.ASSIGN_TO_ME, false);
                    return;
                case 3:
                    m221009a(getTvAssignFromMe(), getTvAssignFromMeCount(), getLlAssignFromMe(), TodoFilterType.ASSIGN_FROM_ME, false);
                    return;
                case 4:
                    m221009a(getTvFollow(), getTvFollowCount(), getLlFollow(), TodoFilterType.FOLLOWED, false);
                    return;
                case 5:
                    m221009a(getTvCompleted(), getTvCompletedCount(), getLlCompleted(), TodoFilterType.COMPLETED, false);
                    return;
                case 6:
                    m221009a(getTvFromDocs(), getTvFromDocsCount(), getLlFromDocs(), TodoFilterType.FROM_DOCS, false);
                    return;
                default:
                    return;
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TodoClassifyHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TodoClassifyHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f140493c = new ArrayList<>();
        this.f140494d = LinePosition.FIRST;
        this.f140496f = LazyKt.lazy(new C56922k(this));
        this.f140497g = LazyKt.lazy(new C56928q(this));
        this.f140498h = LazyKt.lazy(new C56929r(this));
        this.f140499i = LazyKt.lazy(new C56921j(this));
        this.f140500j = LazyKt.lazy(new C56926o(this));
        this.f140501k = LazyKt.lazy(new C56927p(this));
        this.f140502l = LazyKt.lazy(new C56924m(this));
        this.f140503m = LazyKt.lazy(new C56932u(this));
        this.f140504n = LazyKt.lazy(new C56933v(this));
        this.f140505o = LazyKt.lazy(new C56923l(this));
        this.f140506p = LazyKt.lazy(new C56930s(this));
        this.f140507q = LazyKt.lazy(new C56931t(this));
        this.f140508r = LazyKt.lazy(new C56925n(this));
        this.f140509s = LazyKt.lazy(new C56934w(this));
        this.f140510t = LazyKt.lazy(new C56935x(this));
        m221012b();
        m221015e();
    }

    /* renamed from: a */
    private final void m221009a(TextView textView, TextView textView2, LinearLayout linearLayout, TodoFilterType todoFilterType, boolean z) {
        String str;
        m221016f();
        if (textView != null) {
            textView.setTextColor(f140488x);
        }
        if (textView != null) {
            textView.setTypeface(Typeface.defaultFromStyle(1));
        }
        if (textView2 != null) {
            textView2.setTextColor(f140488x);
        }
        if (textView2 != null) {
            textView2.setTypeface(Typeface.defaultFromStyle(1));
        }
        if (linearLayout != null) {
            linearLayout.setBackgroundResource(f140486v);
        }
        if (z) {
            switch (C56936b.f140518a[todoFilterType.ordinal()]) {
                case 1:
                    str = "ongoing";
                    break;
                case 2:
                    str = "received";
                    break;
                case 3:
                    str = "assigned";
                    break;
                case 4:
                    str = "following";
                    break;
                case 5:
                    str = "completed";
                    break;
                case 6:
                    str = "from_doc";
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            TodoHitPoint.m221730a(str);
            TodoGeneralHitPoint.f141070a.mo194174a(todoFilterType);
            OnClassifyClickListener bVar = this.f140492b;
            if (bVar != null) {
                bVar.mo193275a(todoFilterType);
            }
            TodoHitPoint.m221760m(TodoHitPoint.m221741b(todoFilterType));
        }
    }

    /* renamed from: a */
    private final LinearLayout m221007a(LinearLayout linearLayout, int i, TextView textView, int i2, int i3, TextView textView2, int i4) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, f140483C);
        layoutParams.setMargins(f140482B, 0, 0, 0);
        linearLayout.setId(i);
        linearLayout.setBackgroundResource(f140485u);
        linearLayout.setGravity(16);
        linearLayout.setOrientation(0);
        int i5 = f140481A;
        linearLayout.setPadding(i5, 0, i5, 0);
        linearLayout.setLayoutParams(layoutParams);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2);
        layoutParams2.weight = 1.0f;
        textView.setId(i2);
        textView.setSingleLine(true);
        textView.setTextColor(ResUtil.f139261a.mo191775a(R.color.text_caption));
        textView.setText(ResUtil.f139261a.mo191781c(i3));
        textView.setLayoutParams(layoutParams2);
        textView.setTextSize(1, 12.0f);
        linearLayout.addView(textView);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        textView2.setId(i4);
        textView2.setSingleLine(true);
        textView2.setTextColor(ResUtil.f139261a.mo191775a(R.color.text_caption));
        textView2.setLayoutParams(layoutParams3);
        textView2.setTextSize(1, 12.0f);
        linearLayout.addView(textView2);
        return linearLayout;
    }

    /* renamed from: a */
    static /* synthetic */ void m221010a(TodoClassifyHeaderView todoClassifyHeaderView, TextView textView, TextView textView2, LinearLayout linearLayout, TodoFilterType todoFilterType, boolean z, int i, Object obj) {
        boolean z2;
        if ((i & 16) != 0) {
            z2 = true;
        } else {
            z2 = z;
        }
        todoClassifyHeaderView.m221009a(textView, textView2, linearLayout, todoFilterType, z2);
    }
}
