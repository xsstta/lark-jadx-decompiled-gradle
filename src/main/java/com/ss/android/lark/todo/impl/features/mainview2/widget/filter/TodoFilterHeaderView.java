package com.ss.android.lark.todo.impl.features.mainview2.widget.filter;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.lark.pb.todo.v1.TodoListView;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 m2\u00020\u0001:\u0003mnoB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010E\u001a\u00020FH\u0002J\b\u0010G\u001a\u00020FH\u0002J<\u0010H\u001a\u00020F2\b\u0010I\u001a\u0004\u0018\u00010&2\b\u0010J\u001a\u0004\u0018\u00010&2\b\u0010K\u001a\u0004\u0018\u00010\u00012\n\u0010L\u001a\u00060Mj\u0002`N2\b\b\u0002\u0010O\u001a\u00020\u0011H\u0002J\b\u0010P\u001a\u00020FH\u0002J@\u0010Q\u001a\u00020\u00012\u0006\u0010R\u001a\u00020\u00012\u0006\u0010S\u001a\u00020\t2\u0006\u0010T\u001a\u00020&2\u0006\u0010U\u001a\u00020\t2\u0006\u0010V\u001a\u00020\t2\u0006\u0010W\u001a\u00020&2\u0006\u0010X\u001a\u00020\tH\u0002J\u0012\u0010Y\u001a\u00020\t2\b\u0010Z\u001a\u0004\u0018\u00010\u0001H\u0002J\u0010\u0010[\u001a\u00020\\2\u0006\u0010]\u001a\u00020\tH\u0002J\b\u0010^\u001a\u00020FH\u0002J\b\u0010_\u001a\u00020FH\u0002J\b\u0010`\u001a\u00020FH\u0002J\b\u0010a\u001a\u00020FH\u0002J\b\u0010b\u001a\u00020FH\u0002J\b\u0010c\u001a\u00020FH\u0002J\u000e\u0010d\u001a\u00020F2\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010e\u001a\u00020F2\u000e\u0010f\u001a\n\u0018\u00010Mj\u0004\u0018\u0001`NJ6\u0010g\u001a\u00020F2.\u0010h\u001a*\u0012\b\u0012\u00060Mj\u0002`N\u0012\u0004\u0012\u00020\t\u0018\u00010ij\u0014\u0012\b\u0012\u00060Mj\u0002`N\u0012\u0004\u0012\u00020\t\u0018\u0001`jJ\u0010\u0010k\u001a\u00020F2\u0006\u0010l\u001a\u00020&H\u0002R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u000ej\b\u0012\u0004\u0012\u00020\u0001`\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0014\u001a\u00020\u00018BX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0019\u001a\u00020\u00018BX\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001a\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00018BX\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001d\u0010\u0016R\u001b\u0010\u001f\u001a\u00020\u00018BX\u0002¢\u0006\f\n\u0004\b!\u0010\u0018\u001a\u0004\b \u0010\u0016R\u001b\u0010\"\u001a\u00020\u00018BX\u0002¢\u0006\f\n\u0004\b$\u0010\u0018\u001a\u0004\b#\u0010\u0016R\u001b\u0010%\u001a\u00020&8BX\u0002¢\u0006\f\n\u0004\b)\u0010\u0018\u001a\u0004\b'\u0010(R\u001b\u0010*\u001a\u00020&8BX\u0002¢\u0006\f\n\u0004\b,\u0010\u0018\u001a\u0004\b+\u0010(R\u001b\u0010-\u001a\u00020&8BX\u0002¢\u0006\f\n\u0004\b/\u0010\u0018\u001a\u0004\b.\u0010(R\u001b\u00100\u001a\u00020&8BX\u0002¢\u0006\f\n\u0004\b2\u0010\u0018\u001a\u0004\b1\u0010(R\u001b\u00103\u001a\u00020&8BX\u0002¢\u0006\f\n\u0004\b5\u0010\u0018\u001a\u0004\b4\u0010(R\u001b\u00106\u001a\u00020&8BX\u0002¢\u0006\f\n\u0004\b8\u0010\u0018\u001a\u0004\b7\u0010(R\u001b\u00109\u001a\u00020&8BX\u0002¢\u0006\f\n\u0004\b;\u0010\u0018\u001a\u0004\b:\u0010(R\u001b\u0010<\u001a\u00020&8BX\u0002¢\u0006\f\n\u0004\b>\u0010\u0018\u001a\u0004\b=\u0010(R\u001b\u0010?\u001a\u00020&8BX\u0002¢\u0006\f\n\u0004\bA\u0010\u0018\u001a\u0004\b@\u0010(R\u001b\u0010B\u001a\u00020&8BX\u0002¢\u0006\f\n\u0004\bD\u0010\u0018\u001a\u0004\bC\u0010(¨\u0006p"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview2/widget/filter/TodoFilterHeaderView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "classifyClickListener", "Lcom/ss/android/lark/todo/impl/features/mainview2/widget/filter/TodoFilterHeaderView$OnClassifyClickListener;", "containerList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "isArranging", "", "linePosition", "Lcom/ss/android/lark/todo/impl/features/mainview2/widget/filter/TodoFilterHeaderView$LinePosition;", "llAssignFromMe", "getLlAssignFromMe", "()Landroid/widget/LinearLayout;", "llAssignFromMe$delegate", "Lkotlin/Lazy;", "llAssignToMe", "getLlAssignToMe", "llAssignToMe$delegate", "llCompleted", "getLlCompleted", "llCompleted$delegate", "llFollow", "getLlFollow", "llFollow$delegate", "llFromDocs", "getLlFromDocs", "llFromDocs$delegate", "tvAssignFromMe", "Landroid/widget/TextView;", "getTvAssignFromMe", "()Landroid/widget/TextView;", "tvAssignFromMe$delegate", "tvAssignFromMeCount", "getTvAssignFromMeCount", "tvAssignFromMeCount$delegate", "tvAssignToMe", "getTvAssignToMe", "tvAssignToMe$delegate", "tvAssignToMeCount", "getTvAssignToMeCount", "tvAssignToMeCount$delegate", "tvCompleted", "getTvCompleted", "tvCompleted$delegate", "tvCompletedCount", "getTvCompletedCount", "tvCompletedCount$delegate", "tvFollow", "getTvFollow", "tvFollow$delegate", "tvFollowCount", "getTvFollowCount", "tvFollowCount$delegate", "tvFromDocs", "getTvFromDocs", "tvFromDocs$delegate", "tvFromDocsCount", "getTvFromDocsCount", "tvFromDocsCount$delegate", "arrangeClassifyBtn", "", "clearIconAndArrange", "clickClassifyItem", "filterNameTv", "filterNameCountTv", "filterLl", "filterType", "Lcom/bytedance/lark/pb/todo/v1/TodoListView$Type;", "Lcom/ss/android/lark/todo/impl/rustadapter/TodoFilterType;", "isUserOperation", "createClassifyBtn", "createPanelContainer", "containerLl", "containerId", "panelTv", "panelId", "panelResId", "panelCountTv", "panelCountId", "getContainerWidth", "container", "getDisplayCount", "", "countNum", "initListener", "initView", "initialContainer", "initialTextColorAndTypeface", "initialView", "removeOriginContainer", "setActionListener", "updateFilter", ShareHitPoint.f121869d, "updateFilterCount", "filterCountMap", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "updateTextColorAndTypeface", "textView", "Companion", "LinePosition", "OnClassifyClickListener", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class TodoFilterHeaderView extends LinearLayout {

    /* renamed from: A */
    private static final int f140654A = C57582a.m223600a(12);

    /* renamed from: B */
    private static final int f140655B = C57582a.m223600a(10);

    /* renamed from: C */
    private static final int f140656C = C57582a.m223600a(28);

    /* renamed from: a */
    public static final Companion f140657a = new Companion(null);

    /* renamed from: u */
    private static final int f140658u = R.drawable.todo_bg_classify_btn_normal;

    /* renamed from: v */
    private static final int f140659v = R.drawable.todo_bg_classify_btn_clicked;

    /* renamed from: w */
    private static final int f140660w = ResUtil.f139261a.mo191775a(R.color.text_caption);

    /* renamed from: x */
    private static final int f140661x = ResUtil.f139261a.mo191775a(R.color.primary_pri_500);

    /* renamed from: y */
    private static final int f140662y = C57582a.m223600a(16);

    /* renamed from: z */
    private static final int f140663z = C57582a.m223600a(6);

    /* renamed from: D */
    private HashMap f140664D;

    /* renamed from: b */
    private OnClassifyClickListener f140665b;

    /* renamed from: c */
    private final ArrayList<LinearLayout> f140666c;

    /* renamed from: d */
    private LinePosition f140667d;

    /* renamed from: e */
    private boolean f140668e;

    /* renamed from: f */
    private final Lazy f140669f;

    /* renamed from: g */
    private final Lazy f140670g;

    /* renamed from: h */
    private final Lazy f140671h;

    /* renamed from: i */
    private final Lazy f140672i;

    /* renamed from: j */
    private final Lazy f140673j;

    /* renamed from: k */
    private final Lazy f140674k;

    /* renamed from: l */
    private final Lazy f140675l;

    /* renamed from: m */
    private final Lazy f140676m;

    /* renamed from: n */
    private final Lazy f140677n;

    /* renamed from: o */
    private final Lazy f140678o;

    /* renamed from: p */
    private final Lazy f140679p;

    /* renamed from: q */
    private final Lazy f140680q;

    /* renamed from: r */
    private final Lazy f140681r;

    /* renamed from: s */
    private final Lazy f140682s;

    /* renamed from: t */
    private final Lazy f140683t;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview2/widget/filter/TodoFilterHeaderView$LinePosition;", "", "(Ljava/lang/String;I)V", "FIRST", "SECOND", "THIRD", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum LinePosition {
        FIRST,
        SECOND,
        THIRD
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview2/widget/filter/TodoFilterHeaderView$OnClassifyClickListener;", "", "onClassifyBtnClick", "", ShareHitPoint.f121869d, "Lcom/bytedance/lark/pb/todo/v1/TodoListView$Type;", "Lcom/ss/android/lark/todo/impl/rustadapter/TodoFilterType;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.filter.TodoFilterHeaderView$b */
    public interface OnClassifyClickListener {
        /* renamed from: a */
        void mo193662a(TodoListView.Type type);
    }

    /* renamed from: a */
    public View mo193642a(int i) {
        if (this.f140664D == null) {
            this.f140664D = new HashMap();
        }
        View view = (View) this.f140664D.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f140664D.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final LinearLayout getLlAssignFromMe() {
        return (LinearLayout) this.f140672i.getValue();
    }

    public final LinearLayout getLlAssignToMe() {
        return (LinearLayout) this.f140669f.getValue();
    }

    public final LinearLayout getLlCompleted() {
        return (LinearLayout) this.f140678o.getValue();
    }

    public final LinearLayout getLlFollow() {
        return (LinearLayout) this.f140675l.getValue();
    }

    public final LinearLayout getLlFromDocs() {
        return (LinearLayout) this.f140681r.getValue();
    }

    public final TextView getTvAssignFromMe() {
        return (TextView) this.f140673j.getValue();
    }

    public final TextView getTvAssignFromMeCount() {
        return (TextView) this.f140674k.getValue();
    }

    public final TextView getTvAssignToMe() {
        return (TextView) this.f140670g.getValue();
    }

    public final TextView getTvAssignToMeCount() {
        return (TextView) this.f140671h.getValue();
    }

    public final TextView getTvCompleted() {
        return (TextView) this.f140679p.getValue();
    }

    public final TextView getTvCompletedCount() {
        return (TextView) this.f140680q.getValue();
    }

    public final TextView getTvFollow() {
        return (TextView) this.f140676m.getValue();
    }

    public final TextView getTvFollowCount() {
        return (TextView) this.f140677n.getValue();
    }

    public final TextView getTvFromDocs() {
        return (TextView) this.f140682s.getValue();
    }

    public final TextView getTvFromDocsCount() {
        return (TextView) this.f140683t.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview2/widget/filter/TodoFilterHeaderView$Companion;", "", "()V", "bgClickableDrawable", "", "bgInitialDrawable", "containerHeight", "containerMargin", "containerPadding", "lineMargin", "linePadding", "tvBlueColor", "tvGrayColor", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.filter.TodoFilterHeaderView$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo193645a(HashMap<TodoListView.Type, Integer> hashMap) {
        if (hashMap != null) {
            TextView textView = (TextView) mo193642a(R.id.tvToBeCompletedCount);
            Intrinsics.checkExpressionValueIsNotNull(textView, "tvToBeCompletedCount");
            Integer num = hashMap.get(TodoListView.Type.ALL);
            if (num == null) {
                num = 0;
            }
            textView.setText(m221191b(num.intValue()));
            TextView tvAssignFromMeCount = getTvAssignFromMeCount();
            Integer num2 = hashMap.get(TodoListView.Type.ASSIGN_FROM_ME);
            if (num2 == null) {
                num2 = 0;
            }
            tvAssignFromMeCount.setText(m221191b(num2.intValue()));
            TextView tvAssignToMeCount = getTvAssignToMeCount();
            Integer num3 = hashMap.get(TodoListView.Type.ASSIGN_TO_ME);
            if (num3 == null) {
                num3 = 0;
            }
            tvAssignToMeCount.setText(m221191b(num3.intValue()));
            TextView tvFollowCount = getTvFollowCount();
            Integer num4 = hashMap.get(TodoListView.Type.FOLLOWED);
            if (num4 == null) {
                num4 = 0;
            }
            tvFollowCount.setText(m221191b(num4.intValue()));
            mo193643a();
        }
    }

    /* renamed from: f */
    private final void m221196f() {
        m221197g();
        m221198h();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/LinearLayout;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.filter.TodoFilterHeaderView$j */
    static final class C57001j extends Lambda implements Function0<LinearLayout> {
        final /* synthetic */ TodoFilterHeaderView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57001j(TodoFilterHeaderView todoFilterHeaderView) {
            super(0);
            this.this$0 = todoFilterHeaderView;
        }

        @Override // kotlin.jvm.functions.Function0
        public final LinearLayout invoke() {
            return new LinearLayout(this.this$0.getContext());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/LinearLayout;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.filter.TodoFilterHeaderView$k */
    static final class C57002k extends Lambda implements Function0<LinearLayout> {
        final /* synthetic */ TodoFilterHeaderView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57002k(TodoFilterHeaderView todoFilterHeaderView) {
            super(0);
            this.this$0 = todoFilterHeaderView;
        }

        @Override // kotlin.jvm.functions.Function0
        public final LinearLayout invoke() {
            return new LinearLayout(this.this$0.getContext());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/LinearLayout;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.filter.TodoFilterHeaderView$l */
    static final class C57003l extends Lambda implements Function0<LinearLayout> {
        final /* synthetic */ TodoFilterHeaderView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57003l(TodoFilterHeaderView todoFilterHeaderView) {
            super(0);
            this.this$0 = todoFilterHeaderView;
        }

        @Override // kotlin.jvm.functions.Function0
        public final LinearLayout invoke() {
            return new LinearLayout(this.this$0.getContext());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/LinearLayout;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.filter.TodoFilterHeaderView$m */
    static final class C57004m extends Lambda implements Function0<LinearLayout> {
        final /* synthetic */ TodoFilterHeaderView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57004m(TodoFilterHeaderView todoFilterHeaderView) {
            super(0);
            this.this$0 = todoFilterHeaderView;
        }

        @Override // kotlin.jvm.functions.Function0
        public final LinearLayout invoke() {
            return new LinearLayout(this.this$0.getContext());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/LinearLayout;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.filter.TodoFilterHeaderView$n */
    static final class C57005n extends Lambda implements Function0<LinearLayout> {
        final /* synthetic */ TodoFilterHeaderView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57005n(TodoFilterHeaderView todoFilterHeaderView) {
            super(0);
            this.this$0 = todoFilterHeaderView;
        }

        @Override // kotlin.jvm.functions.Function0
        public final LinearLayout invoke() {
            return new LinearLayout(this.this$0.getContext());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.filter.TodoFilterHeaderView$o */
    static final class C57006o extends Lambda implements Function0<TextView> {
        final /* synthetic */ TodoFilterHeaderView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57006o(TodoFilterHeaderView todoFilterHeaderView) {
            super(0);
            this.this$0 = todoFilterHeaderView;
        }

        @Override // kotlin.jvm.functions.Function0
        public final TextView invoke() {
            return new TextView(this.this$0.getContext());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.filter.TodoFilterHeaderView$p */
    static final class C57007p extends Lambda implements Function0<TextView> {
        final /* synthetic */ TodoFilterHeaderView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57007p(TodoFilterHeaderView todoFilterHeaderView) {
            super(0);
            this.this$0 = todoFilterHeaderView;
        }

        @Override // kotlin.jvm.functions.Function0
        public final TextView invoke() {
            return new TextView(this.this$0.getContext());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.filter.TodoFilterHeaderView$q */
    static final class C57008q extends Lambda implements Function0<TextView> {
        final /* synthetic */ TodoFilterHeaderView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57008q(TodoFilterHeaderView todoFilterHeaderView) {
            super(0);
            this.this$0 = todoFilterHeaderView;
        }

        @Override // kotlin.jvm.functions.Function0
        public final TextView invoke() {
            return new TextView(this.this$0.getContext());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.filter.TodoFilterHeaderView$r */
    static final class C57009r extends Lambda implements Function0<TextView> {
        final /* synthetic */ TodoFilterHeaderView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57009r(TodoFilterHeaderView todoFilterHeaderView) {
            super(0);
            this.this$0 = todoFilterHeaderView;
        }

        @Override // kotlin.jvm.functions.Function0
        public final TextView invoke() {
            return new TextView(this.this$0.getContext());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.filter.TodoFilterHeaderView$s */
    static final class C57010s extends Lambda implements Function0<TextView> {
        final /* synthetic */ TodoFilterHeaderView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57010s(TodoFilterHeaderView todoFilterHeaderView) {
            super(0);
            this.this$0 = todoFilterHeaderView;
        }

        @Override // kotlin.jvm.functions.Function0
        public final TextView invoke() {
            return new TextView(this.this$0.getContext());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.filter.TodoFilterHeaderView$t */
    static final class C57011t extends Lambda implements Function0<TextView> {
        final /* synthetic */ TodoFilterHeaderView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57011t(TodoFilterHeaderView todoFilterHeaderView) {
            super(0);
            this.this$0 = todoFilterHeaderView;
        }

        @Override // kotlin.jvm.functions.Function0
        public final TextView invoke() {
            return new TextView(this.this$0.getContext());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.filter.TodoFilterHeaderView$u */
    static final class C57012u extends Lambda implements Function0<TextView> {
        final /* synthetic */ TodoFilterHeaderView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57012u(TodoFilterHeaderView todoFilterHeaderView) {
            super(0);
            this.this$0 = todoFilterHeaderView;
        }

        @Override // kotlin.jvm.functions.Function0
        public final TextView invoke() {
            return new TextView(this.this$0.getContext());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.filter.TodoFilterHeaderView$v */
    static final class C57013v extends Lambda implements Function0<TextView> {
        final /* synthetic */ TodoFilterHeaderView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57013v(TodoFilterHeaderView todoFilterHeaderView) {
            super(0);
            this.this$0 = todoFilterHeaderView;
        }

        @Override // kotlin.jvm.functions.Function0
        public final TextView invoke() {
            return new TextView(this.this$0.getContext());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.filter.TodoFilterHeaderView$w */
    static final class C57014w extends Lambda implements Function0<TextView> {
        final /* synthetic */ TodoFilterHeaderView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57014w(TodoFilterHeaderView todoFilterHeaderView) {
            super(0);
            this.this$0 = todoFilterHeaderView;
        }

        @Override // kotlin.jvm.functions.Function0
        public final TextView invoke() {
            return new TextView(this.this$0.getContext());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.filter.TodoFilterHeaderView$x */
    static final class C57015x extends Lambda implements Function0<TextView> {
        final /* synthetic */ TodoFilterHeaderView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57015x(TodoFilterHeaderView todoFilterHeaderView) {
            super(0);
            this.this$0 = todoFilterHeaderView;
        }

        @Override // kotlin.jvm.functions.Function0
        public final TextView invoke() {
            return new TextView(this.this$0.getContext());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/todo/impl/features/mainview2/widget/filter/TodoFilterHeaderView$initView$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.filter.TodoFilterHeaderView$i */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC57000i implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ TodoFilterHeaderView f140690a;

        public void onGlobalLayout() {
            this.f140690a.mo193643a();
            this.f140690a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        ViewTreeObserver$OnGlobalLayoutListenerC57000i(TodoFilterHeaderView todoFilterHeaderView) {
            this.f140690a = todoFilterHeaderView;
        }
    }

    /* renamed from: b */
    private final void m221192b() {
        LayoutInflater.from(getContext()).inflate(R.layout.todo_widget_classify_view, (ViewGroup) this, true);
        m221193c();
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC57000i(this));
    }

    /* renamed from: g */
    private final void m221197g() {
        int i = f140658u;
        ((LinearLayout) mo193642a(R.id.llToBeCompleted)).setBackgroundResource(i);
        getLlAssignFromMe().setBackgroundResource(i);
        getLlAssignToMe().setBackgroundResource(i);
        getLlFollow().setBackgroundResource(i);
        getLlCompleted().setBackgroundResource(i);
        getLlFromDocs().setBackgroundResource(i);
        invalidate();
    }

    /* renamed from: e */
    private final void m221195e() {
        ((LinearLayout) mo193642a(R.id.llToBeCompleted)).setOnClickListener(new View$OnClickListenerC56994c(this));
        getLlAssignToMe().setOnClickListener(new View$OnClickListenerC56995d(this));
        getLlAssignFromMe().setOnClickListener(new View$OnClickListenerC56996e(this));
        getLlFollow().setOnClickListener(new View$OnClickListenerC56997f(this));
        getLlCompleted().setOnClickListener(new View$OnClickListenerC56998g(this));
        getLlFromDocs().setOnClickListener(new View$OnClickListenerC56999h(this));
    }

    /* renamed from: h */
    private final void m221198h() {
        TextView textView = (TextView) mo193642a(R.id.tvToBeCompleted);
        Intrinsics.checkExpressionValueIsNotNull(textView, "tvToBeCompleted");
        m221188a(textView);
        TextView textView2 = (TextView) mo193642a(R.id.tvToBeCompletedCount);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "tvToBeCompletedCount");
        m221188a(textView2);
        m221188a(getTvAssignFromMe());
        m221188a(getTvAssignFromMeCount());
        m221188a(getTvAssignToMe());
        m221188a(getTvAssignToMeCount());
        m221188a(getTvFollow());
        m221188a(getTvFollowCount());
        m221188a(getTvCompleted());
        m221188a(getTvCompletedCount());
        m221188a(getTvFromDocs());
        m221188a(getTvFromDocsCount());
    }

    /* renamed from: c */
    private final void m221193c() {
        this.f140666c.add(m221187a(getLlAssignToMe(), R.id.llAssignToMe, getTvAssignToMe(), R.id.tvAssignToMe, R.string.Todo_Task_TasksAssignedToMe, getTvAssignToMeCount(), R.id.tvAssignToMeCount));
        this.f140666c.add(m221187a(getLlAssignFromMe(), R.id.llAssignFromMe, getTvAssignFromMe(), R.id.tvAssignFromMe, R.string.Todo_Task_TasksAssignedByMeToOthers, getTvAssignFromMeCount(), R.id.tvAssignFromMeCount));
        this.f140666c.add(m221187a(getLlFollow(), R.id.llFollow, getTvFollow(), R.id.tvFollow, R.string.Todo_Task_FollowedByMe, getTvFollowCount(), R.id.tvFollowCount));
        if (TodoDependencyHolder.f139242a.mo191731b().mo191929b()) {
            this.f140666c.add(m221187a(getLlFromDocs(), R.id.llFromDocs, getTvFromDocs(), R.id.tvFromDocs, R.string.Todo_Task_FromDocs, getTvFromDocsCount(), R.id.tvFromDocsCount));
        }
        this.f140666c.add(m221187a(getLlCompleted(), R.id.llCompleted, getTvCompleted(), R.id.tvCompleted, R.string.Todo_Menu_Completed, getTvCompletedCount(), R.id.tvCompletedCount));
    }

    /* renamed from: i */
    private final void m221199i() {
        boolean z;
        boolean z2;
        for (T t : this.f140666c) {
            LinearLayout linearLayout = (LinearLayout) mo193642a(R.id.llFirstLine);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "llFirstLine");
            boolean z3 = true;
            if (linearLayout.indexOfChild(t) != -1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                ((LinearLayout) mo193642a(R.id.llFirstLine)).removeView(t);
            } else {
                LinearLayout linearLayout2 = (LinearLayout) mo193642a(R.id.llSecondLine);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "llSecondLine");
                if (linearLayout2.indexOfChild(t) != -1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    ((LinearLayout) mo193642a(R.id.llSecondLine)).removeView(t);
                } else {
                    LinearLayout linearLayout3 = (LinearLayout) mo193642a(R.id.llThirdLine);
                    Intrinsics.checkExpressionValueIsNotNull(linearLayout3, "llThirdLine");
                    if (linearLayout3.indexOfChild(t) == -1) {
                        z3 = false;
                    }
                    if (z3) {
                        ((LinearLayout) mo193642a(R.id.llThirdLine)).removeView(t);
                    }
                }
            }
        }
    }

    /* renamed from: d */
    private final void m221194d() {
        int i;
        this.f140667d = LinePosition.FIRST;
        LinearLayout linearLayout = (LinearLayout) mo193642a(R.id.llSecondLine);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "llSecondLine");
        linearLayout.setVisibility(0);
        LinearLayout linearLayout2 = (LinearLayout) mo193642a(R.id.llThirdLine);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "llThirdLine");
        linearLayout2.setVisibility(8);
        LinearLayout linearLayout3 = (LinearLayout) mo193642a(R.id.llFirstLine);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout3, "llFirstLine");
        int width = linearLayout3.getWidth();
        int i2 = f140662y;
        LinearLayout linearLayout4 = (LinearLayout) mo193642a(R.id.llToBeCompleted);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout4, "llToBeCompleted");
        int width2 = (width - (i2 * 2)) - linearLayout4.getWidth();
        LinearLayout linearLayout5 = (LinearLayout) mo193642a(R.id.llSecondLine);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout5, "llSecondLine");
        int width3 = (linearLayout5.getWidth() - i2) - f140663z;
        for (T t : this.f140666c) {
            int a = m221186a((LinearLayout) t);
            if (this.f140667d == LinePosition.THIRD) {
                ((LinearLayout) mo193642a(R.id.llThirdLine)).addView(t);
            } else {
                if (this.f140667d == LinePosition.SECOND) {
                    i = f140655B;
                    if (width3 - i > a) {
                        ((LinearLayout) mo193642a(R.id.llSecondLine)).addView(t);
                    } else {
                        this.f140667d = LinePosition.THIRD;
                        LinearLayout linearLayout6 = (LinearLayout) mo193642a(R.id.llThirdLine);
                        Intrinsics.checkExpressionValueIsNotNull(linearLayout6, "llThirdLine");
                        linearLayout6.setVisibility(0);
                        ((LinearLayout) mo193642a(R.id.llThirdLine)).addView(t);
                    }
                } else {
                    i = f140655B;
                    if (width2 - i > a) {
                        ((LinearLayout) mo193642a(R.id.llFirstLine)).addView(t);
                        width2 -= a + i;
                    } else {
                        this.f140667d = LinePosition.SECOND;
                        ((LinearLayout) mo193642a(R.id.llSecondLine)).addView(t);
                    }
                }
                width3 -= a + i;
            }
        }
        if (this.f140667d == LinePosition.FIRST) {
            LinearLayout linearLayout7 = (LinearLayout) mo193642a(R.id.llSecondLine);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout7, "llSecondLine");
            linearLayout7.setVisibility(8);
            LinearLayout linearLayout8 = (LinearLayout) mo193642a(R.id.llThirdLine);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout8, "llThirdLine");
            linearLayout8.setVisibility(8);
        }
    }

    /* renamed from: a */
    public final void mo193643a() {
        if (!this.f140668e) {
            this.f140668e = true;
            m221199i();
            m221194d();
            this.f140668e = false;
        }
    }

    public final void setActionListener(OnClassifyClickListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "classifyClickListener");
        this.f140665b = bVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TodoFilterHeaderView(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    private final void m221188a(TextView textView) {
        textView.setTextColor(f140660w);
        textView.setTypeface(Typeface.defaultFromStyle(0));
    }

    /* renamed from: a */
    private final int m221186a(LinearLayout linearLayout) {
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
    private final String m221191b(int i) {
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
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.filter.TodoFilterHeaderView$c */
    public static final class View$OnClickListenerC56994c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TodoFilterHeaderView f140684a;

        View$OnClickListenerC56994c(TodoFilterHeaderView todoFilterHeaderView) {
            this.f140684a = todoFilterHeaderView;
        }

        public final void onClick(View view) {
            TodoGeneralHitPoint.f141070a.mo194184b(TodoFilterType.ALL);
            TodoFilterHeaderView todoFilterHeaderView = this.f140684a;
            TodoFilterHeaderView.m221190a(todoFilterHeaderView, (TextView) todoFilterHeaderView.mo193642a(R.id.tvToBeCompleted), (TextView) this.f140684a.mo193642a(R.id.tvToBeCompletedCount), (LinearLayout) this.f140684a.mo193642a(R.id.llToBeCompleted), TodoListView.Type.ALL, false, 16, null);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.filter.TodoFilterHeaderView$d */
    public static final class View$OnClickListenerC56995d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TodoFilterHeaderView f140685a;

        View$OnClickListenerC56995d(TodoFilterHeaderView todoFilterHeaderView) {
            this.f140685a = todoFilterHeaderView;
        }

        public final void onClick(View view) {
            TodoGeneralHitPoint.f141070a.mo194184b(TodoFilterType.ASSIGN_TO_ME);
            TodoFilterHeaderView todoFilterHeaderView = this.f140685a;
            TodoFilterHeaderView.m221190a(todoFilterHeaderView, todoFilterHeaderView.getTvAssignToMe(), this.f140685a.getTvAssignToMeCount(), this.f140685a.getLlAssignToMe(), TodoListView.Type.ASSIGN_TO_ME, false, 16, null);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.filter.TodoFilterHeaderView$e */
    public static final class View$OnClickListenerC56996e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TodoFilterHeaderView f140686a;

        View$OnClickListenerC56996e(TodoFilterHeaderView todoFilterHeaderView) {
            this.f140686a = todoFilterHeaderView;
        }

        public final void onClick(View view) {
            TodoGeneralHitPoint.f141070a.mo194184b(TodoFilterType.ASSIGN_FROM_ME);
            TodoFilterHeaderView todoFilterHeaderView = this.f140686a;
            TodoFilterHeaderView.m221190a(todoFilterHeaderView, todoFilterHeaderView.getTvAssignFromMe(), this.f140686a.getTvAssignFromMeCount(), this.f140686a.getLlAssignFromMe(), TodoListView.Type.ASSIGN_FROM_ME, false, 16, null);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.filter.TodoFilterHeaderView$f */
    public static final class View$OnClickListenerC56997f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TodoFilterHeaderView f140687a;

        View$OnClickListenerC56997f(TodoFilterHeaderView todoFilterHeaderView) {
            this.f140687a = todoFilterHeaderView;
        }

        public final void onClick(View view) {
            TodoGeneralHitPoint.f141070a.mo194184b(TodoFilterType.FOLLOWED);
            TodoFilterHeaderView todoFilterHeaderView = this.f140687a;
            TodoFilterHeaderView.m221190a(todoFilterHeaderView, todoFilterHeaderView.getTvFollow(), this.f140687a.getTvFollowCount(), this.f140687a.getLlFollow(), TodoListView.Type.FOLLOWED, false, 16, null);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.filter.TodoFilterHeaderView$g */
    public static final class View$OnClickListenerC56998g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TodoFilterHeaderView f140688a;

        View$OnClickListenerC56998g(TodoFilterHeaderView todoFilterHeaderView) {
            this.f140688a = todoFilterHeaderView;
        }

        public final void onClick(View view) {
            TodoGeneralHitPoint.f141070a.mo194184b(TodoFilterType.COMPLETED);
            TodoFilterHeaderView todoFilterHeaderView = this.f140688a;
            TodoFilterHeaderView.m221190a(todoFilterHeaderView, todoFilterHeaderView.getTvCompleted(), this.f140688a.getTvCompletedCount(), this.f140688a.getLlCompleted(), TodoListView.Type.COMPLETED, false, 16, null);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.filter.TodoFilterHeaderView$h */
    public static final class View$OnClickListenerC56999h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TodoFilterHeaderView f140689a;

        View$OnClickListenerC56999h(TodoFilterHeaderView todoFilterHeaderView) {
            this.f140689a = todoFilterHeaderView;
        }

        public final void onClick(View view) {
            TodoGeneralHitPoint.f141070a.mo194184b(TodoFilterType.FROM_DOCS);
            TodoFilterHeaderView todoFilterHeaderView = this.f140689a;
            TodoFilterHeaderView.m221190a(todoFilterHeaderView, todoFilterHeaderView.getTvFromDocs(), this.f140689a.getTvFromDocsCount(), this.f140689a.getLlFromDocs(), TodoListView.Type.FROM_DOC, false, 16, null);
        }
    }

    /* renamed from: a */
    public final void mo193644a(TodoListView.Type type) {
        if (type != null) {
            switch (C57021d.f140698b[type.ordinal()]) {
                case 1:
                    m221189a((TextView) mo193642a(R.id.tvToBeCompleted), (TextView) mo193642a(R.id.tvToBeCompletedCount), (LinearLayout) mo193642a(R.id.llToBeCompleted), TodoListView.Type.ALL, false);
                    return;
                case 2:
                    m221189a(getTvAssignToMe(), getTvAssignToMeCount(), getLlAssignToMe(), TodoListView.Type.ASSIGN_TO_ME, false);
                    return;
                case 3:
                    m221189a(getTvAssignFromMe(), getTvAssignFromMeCount(), getLlAssignFromMe(), TodoListView.Type.ASSIGN_FROM_ME, false);
                    return;
                case 4:
                    m221189a(getTvFollow(), getTvFollowCount(), getLlFollow(), TodoListView.Type.FOLLOWED, false);
                    return;
                case 5:
                    m221189a(getTvCompleted(), getTvCompletedCount(), getLlCompleted(), TodoListView.Type.COMPLETED, false);
                    return;
                case 6:
                    m221189a(getTvFromDocs(), getTvFromDocsCount(), getLlFromDocs(), TodoListView.Type.FROM_DOC, false);
                    return;
                default:
                    return;
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TodoFilterHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TodoFilterHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f140666c = new ArrayList<>();
        this.f140667d = LinePosition.FIRST;
        this.f140669f = LazyKt.lazy(new C57002k(this));
        this.f140670g = LazyKt.lazy(new C57008q(this));
        this.f140671h = LazyKt.lazy(new C57009r(this));
        this.f140672i = LazyKt.lazy(new C57001j(this));
        this.f140673j = LazyKt.lazy(new C57006o(this));
        this.f140674k = LazyKt.lazy(new C57007p(this));
        this.f140675l = LazyKt.lazy(new C57004m(this));
        this.f140676m = LazyKt.lazy(new C57012u(this));
        this.f140677n = LazyKt.lazy(new C57013v(this));
        this.f140678o = LazyKt.lazy(new C57003l(this));
        this.f140679p = LazyKt.lazy(new C57010s(this));
        this.f140680q = LazyKt.lazy(new C57011t(this));
        this.f140681r = LazyKt.lazy(new C57005n(this));
        this.f140682s = LazyKt.lazy(new C57014w(this));
        this.f140683t = LazyKt.lazy(new C57015x(this));
        m221192b();
        m221195e();
    }

    /* renamed from: a */
    private final void m221189a(TextView textView, TextView textView2, LinearLayout linearLayout, TodoListView.Type type, boolean z) {
        m221196f();
        if (textView != null) {
            textView.setTextColor(f140661x);
        }
        if (textView != null) {
            textView.setTypeface(Typeface.defaultFromStyle(1));
        }
        if (textView2 != null) {
            textView2.setTextColor(f140661x);
        }
        if (textView2 != null) {
            textView2.setTypeface(Typeface.defaultFromStyle(1));
        }
        if (linearLayout != null) {
            linearLayout.setBackgroundResource(f140659v);
        }
        if (z) {
            String str = "ongoing";
            switch (C57021d.f140697a[type.ordinal()]) {
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
            }
            TodoHitPoint.m221730a(str);
            TodoGeneralHitPoint.f141070a.mo194173a(type);
            OnClassifyClickListener bVar = this.f140665b;
            if (bVar != null) {
                bVar.mo193662a(type);
            }
            TodoHitPoint.m221760m(TodoHitPoint.f141073a.mo194222b(type));
        }
    }

    /* renamed from: a */
    private final LinearLayout m221187a(LinearLayout linearLayout, int i, TextView textView, int i2, int i3, TextView textView2, int i4) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, f140656C);
        layoutParams.setMargins(f140655B, 0, 0, 0);
        linearLayout.setId(i);
        linearLayout.setBackgroundResource(f140658u);
        linearLayout.setGravity(16);
        linearLayout.setOrientation(0);
        int i5 = f140654A;
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
    static /* synthetic */ void m221190a(TodoFilterHeaderView todoFilterHeaderView, TextView textView, TextView textView2, LinearLayout linearLayout, TodoListView.Type type, boolean z, int i, Object obj) {
        boolean z2;
        if ((i & 16) != 0) {
            z2 = true;
        } else {
            z2 = z;
        }
        todoFilterHeaderView.m221189a(textView, textView2, linearLayout, type, z2);
    }
}
