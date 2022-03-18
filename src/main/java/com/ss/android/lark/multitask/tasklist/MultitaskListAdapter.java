package com.ss.android.lark.multitask.tasklist;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.AbstractC1396o;
import androidx.recyclerview.widget.C1374g;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.universe_design.dimension.UDDimension;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.multitask.task.C48376q;
import com.ss.android.lark.multitask.task.Task;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p3466b.C69029a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\"#$%B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J\u0018\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J\u0018\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u001aH\u0016R\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR(\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0007\u0018\u00010\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R(\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0007\u0018\u00010\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\"\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\t\"\u0004\b\u0018\u0010\u000b¨\u0006&"}, d2 = {"Lcom/ss/android/lark/multitask/tasklist/MultitaskListAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "()V", "onBlankAreaClick", "Lkotlin/Function0;", "", "getOnBlankAreaClick", "()Lkotlin/jvm/functions/Function0;", "setOnBlankAreaClick", "(Lkotlin/jvm/functions/Function0;)V", "onItemClick", "Lkotlin/Function1;", "Lcom/ss/android/lark/multitask/task/TaskSnapshot;", "getOnItemClick", "()Lkotlin/jvm/functions/Function1;", "setOnItemClick", "(Lkotlin/jvm/functions/Function1;)V", "onItemDeleted", "getOnItemDeleted", "setOnItemDeleted", "onItemsCleared", "getOnItemsCleared", "setOnItemsCleared", "getItemViewType", "", "position", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "TaskItemViewHolder", "TaskTypeViewHolder", "TitleViewHolder", "base_multitask_impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.multitask.tasklist.a */
public final class MultitaskListAdapter extends AbstractC1396o<Object, RecyclerView.ViewHolder> {

    /* renamed from: a */
    public static final Companion f121830a = new Companion(null);

    /* renamed from: b */
    private Function1<? super C48376q, Unit> f121831b;

    /* renamed from: c */
    private Function0<Unit> f121832c;

    /* renamed from: d */
    private Function1<? super C48376q, Unit> f121833d;

    /* renamed from: e */
    private Function0<Unit> f121834e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/multitask/tasklist/MultitaskListAdapter$Companion;", "", "()V", "TYPE_TASK_ITEM", "", "TYPE_TASK_TITLE", "TYPE_TASK_TYPE", "base_multitask_impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.multitask.tasklist.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001c\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fR\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/multitask/tasklist/MultitaskListAdapter$TitleViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/ss/android/lark/multitask/tasklist/MultitaskListAdapter;Landroid/view/View;)V", "clickTimes", "", "getClickTimes", "()I", "setClickTimes", "(I)V", "createFadeOutAndFadeInAnimation", "Landroid/view/animation/AlphaAnimation;", "view", "doOnFadeOutEnd", "Lkotlin/Function0;", "", "base_multitask_impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.multitask.tasklist.a$d */
    public final class TitleViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ MultitaskListAdapter f121844a;

        /* renamed from: b */
        private int f121845b;

        /* renamed from: a */
        public final int mo169276a() {
            return this.f121845b;
        }

        /* renamed from: a */
        public final void mo169278a(int i) {
            this.f121845b = i;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\b¸\u0006\u0000"}, d2 = {"com/ss/android/lark/multitask/tasklist/MultitaskListAdapter$TitleViewHolder$createFadeOutAndFadeInAnimation$1$1", "Landroid/view/animation/Animation$AnimationListener;", "onAnimationEnd", "", "animation", "Landroid/view/animation/Animation;", "onAnimationRepeat", "onAnimationStart", "base_multitask_impl_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.multitask.tasklist.a$d$b  reason: invalid class name */
        public static final class animationAnimation$AnimationListenerC48388b implements Animation.AnimationListener {

            /* renamed from: a */
            final /* synthetic */ Function0 f121849a;

            /* renamed from: b */
            final /* synthetic */ View f121850b;

            public void onAnimationRepeat(Animation animation) {
            }

            public void onAnimationStart(Animation animation) {
            }

            public void onAnimationEnd(Animation animation) {
                this.f121849a.invoke();
                View view = this.f121850b;
                AlphaAnimation alphaAnimation = new AlphaAnimation((float) BitmapDescriptorFactory.HUE_RED, 1.0f);
                alphaAnimation.setDuration(200);
                view.startAnimation(alphaAnimation);
            }

            animationAnimation$AnimationListenerC48388b(Function0 function0, View view) {
                this.f121849a = function0;
                this.f121850b = view;
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/multitask/tasklist/MultitaskListAdapter$TitleViewHolder$1$1"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.multitask.tasklist.a$d$a */
        public static final class View$OnClickListenerC48386a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ TextView f121847a;

            /* renamed from: b */
            final /* synthetic */ TitleViewHolder f121848b;

            View$OnClickListenerC48386a(TextView textView, TitleViewHolder dVar) {
                this.f121847a = textView;
                this.f121848b = dVar;
            }

            public final void onClick(final View view) {
                if (this.f121848b.mo169276a() == 0) {
                    this.f121848b.mo169278a(1);
                    TitleViewHolder dVar = this.f121848b;
                    Intrinsics.checkExpressionValueIsNotNull(view, "it");
                    view.startAnimation(dVar.mo169277a(view, new Function0<Unit>(this) {
                        /* class com.ss.android.lark.multitask.tasklist.MultitaskListAdapter.TitleViewHolder.View$OnClickListenerC48386a.C483871 */
                        final /* synthetic */ View$OnClickListenerC48386a this$0;

                        {
                            this.this$0 = r1;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final void invoke() {
                            TextView textView = this.this$0.f121847a;
                            Context context = this.this$0.f121847a.getContext();
                            Intrinsics.checkExpressionValueIsNotNull(context, "context");
                            textView.setCompoundDrawables(UDIconUtils.getIconDrawable(context, R.drawable.ud_icon_close_outlined, ContextCompat.getColor(this.this$0.f121847a.getContext(), R.color.ud_B500), new UDDimension.Dp(16)), null, null, null);
                            TextView textView2 = this.this$0.f121847a;
                            UDDimension.Dp aVar = new UDDimension.Dp(4);
                            Context context2 = this.this$0.f121847a.getContext();
                            Intrinsics.checkExpressionValueIsNotNull(context2, "context");
                            textView2.setCompoundDrawablePadding(C69029a.m265653a(aVar.mo90193a(context2)));
                            View view = view;
                            if (view != null) {
                                ((TextView) view).setText(R.string.Lark_Floating_ConfirmClear);
                                return;
                            }
                            throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
                        }
                    }));
                    return;
                }
                Function0<Unit> b = this.f121848b.f121844a.mo169266b();
                if (b != null) {
                    b.invoke();
                }
                this.f121847a.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public TitleViewHolder(MultitaskListAdapter aVar, View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            this.f121844a = aVar;
            TextView textView = (TextView) view.findViewById(R.id.clear_tasks);
            textView.setOnClickListener(new View$OnClickListenerC48386a(textView, this));
            view.setOnClickListener(new View.OnClickListener(this) {
                /* class com.ss.android.lark.multitask.tasklist.MultitaskListAdapter.TitleViewHolder.View$OnClickListenerC483851 */

                /* renamed from: a */
                final /* synthetic */ TitleViewHolder f121846a;

                {
                    this.f121846a = r1;
                }

                public final void onClick(View view) {
                    Function0<Unit> d = this.f121846a.f121844a.mo169270d();
                    if (d != null) {
                        d.invoke();
                    }
                }
            });
        }

        /* renamed from: a */
        public final AlphaAnimation mo169277a(View view, Function0<Unit> function0) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(function0, "doOnFadeOutEnd");
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, (float) BitmapDescriptorFactory.HUE_RED);
            alphaAnimation.setDuration(200);
            alphaAnimation.setAnimationListener(new animationAnimation$AnimationListenerC48388b(function0, view));
            return alphaAnimation;
        }
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super com.ss.android.lark.multitask.task.q, kotlin.Unit>, kotlin.jvm.functions.Function1<com.ss.android.lark.multitask.task.q, kotlin.Unit> */
    /* renamed from: a */
    public final Function1<C48376q, Unit> mo169263a() {
        return this.f121831b;
    }

    /* renamed from: b */
    public final Function0<Unit> mo169266b() {
        return this.f121832c;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super com.ss.android.lark.multitask.task.q, kotlin.Unit>, kotlin.jvm.functions.Function1<com.ss.android.lark.multitask.task.q, kotlin.Unit> */
    /* renamed from: c */
    public final Function1<C48376q, Unit> mo169269c() {
        return this.f121833d;
    }

    /* renamed from: d */
    public final Function0<Unit> mo169270d() {
        return this.f121834e;
    }

    public MultitaskListAdapter() {
        super(new C1374g.AbstractC1378c<Object>() {
            /* class com.ss.android.lark.multitask.tasklist.MultitaskListAdapter.C483811 */

            @Override // androidx.recyclerview.widget.C1374g.AbstractC1378c
            public boolean areContentsTheSame(Object obj, Object obj2) {
                Intrinsics.checkParameterIsNotNull(obj, "oldItem");
                Intrinsics.checkParameterIsNotNull(obj2, "newItem");
                return Intrinsics.areEqual(obj, obj2);
            }

            @Override // androidx.recyclerview.widget.C1374g.AbstractC1378c
            public boolean areItemsTheSame(Object obj, Object obj2) {
                Intrinsics.checkParameterIsNotNull(obj, "oldItem");
                Intrinsics.checkParameterIsNotNull(obj2, "newItem");
                if ((obj instanceof TaskItem) && (obj2 instanceof TaskItem)) {
                    return Intrinsics.areEqual(((TaskItem) obj).mo169297a(), ((TaskItem) obj2).mo169297a());
                }
                if (!(obj instanceof TaskType) || !(obj2 instanceof TaskType)) {
                    if (!(obj instanceof Title) || !(obj2 instanceof Title)) {
                        return false;
                    }
                    return true;
                } else if (((TaskType) obj).mo169301a() == ((TaskType) obj2).mo169301a()) {
                    return true;
                } else {
                    return false;
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo169264a(Function0<Unit> function0) {
        this.f121832c = function0;
    }

    /* renamed from: b */
    public final void mo169267b(Function0<Unit> function0) {
        this.f121834e = function0;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/multitask/tasklist/MultitaskListAdapter$TaskTypeViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/ss/android/lark/multitask/tasklist/MultitaskListAdapter;Landroid/view/View;)V", "text", "Landroid/widget/TextView;", "bind", "", "taskType", "Lcom/ss/android/lark/multitask/tasklist/TaskType;", "base_multitask_impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.multitask.tasklist.a$c */
    public final class TaskTypeViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ MultitaskListAdapter f121841a;

        /* renamed from: b */
        private final TextView f121842b;

        /* renamed from: a */
        public final void mo169274a(TaskType eVar) {
            Intrinsics.checkParameterIsNotNull(eVar, "taskType");
            this.f121842b.setText(eVar.mo169301a());
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public TaskTypeViewHolder(MultitaskListAdapter aVar, View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            this.f121841a = aVar;
            this.f121842b = (TextView) view;
            view.setOnClickListener(new View.OnClickListener(this) {
                /* class com.ss.android.lark.multitask.tasklist.MultitaskListAdapter.TaskTypeViewHolder.View$OnClickListenerC483841 */

                /* renamed from: a */
                final /* synthetic */ TaskTypeViewHolder f121843a;

                {
                    this.f121843a = r1;
                }

                public final void onClick(View view) {
                    Function0<Unit> d = this.f121843a.f121841a.mo169270d();
                    if (d != null) {
                        d.invoke();
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo169265a(Function1<? super C48376q, Unit> function1) {
        this.f121831b = function1;
    }

    /* renamed from: b */
    public final void mo169268b(Function1<? super C48376q, Unit> function1) {
        this.f121833d = function1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        Object item = getItem(i);
        if (item instanceof TaskType) {
            return 0;
        }
        if (item instanceof TaskItem) {
            return 1;
        }
        return 2;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u0016\u0010\u0005\u001a\n \u0006*\u0004\u0018\u00010\u00030\u0003X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \u0006*\u0004\u0018\u00010\b0\bX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u0006*\u0004\u0018\u00010\n0\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/multitask/tasklist/MultitaskListAdapter$TaskItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/ss/android/lark/multitask/tasklist/MultitaskListAdapter;Landroid/view/View;)V", "deleteButton", "kotlin.jvm.PlatformType", "taskIcon", "Landroid/widget/ImageView;", "taskName", "Landroid/widget/TextView;", "bind", "", "taskItem", "Lcom/ss/android/lark/multitask/tasklist/TaskItem;", "base_multitask_impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.multitask.tasklist.a$b */
    public final class TaskItemViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ MultitaskListAdapter f121835a;

        /* renamed from: b */
        private final ImageView f121836b;

        /* renamed from: c */
        private final TextView f121837c;

        /* renamed from: d */
        private final View f121838d;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/multitask/tasklist/MultitaskListAdapter$TaskItemViewHolder$deleteButton$1$1"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.multitask.tasklist.a$b$a */
        static final class View$OnClickListenerC48383a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ TaskItemViewHolder f121840a;

            View$OnClickListenerC48383a(TaskItemViewHolder bVar) {
                this.f121840a = bVar;
            }

            public final void onClick(View view) {
                Object item = this.f121840a.f121835a.getItem(this.f121840a.getAdapterPosition());
                Function1<C48376q, Unit> a = this.f121840a.f121835a.mo169263a();
                if (a == null) {
                    return;
                }
                if (item != null) {
                    a.invoke(((TaskItem) item).mo169297a());
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.multitask.tasklist.TaskItem");
            }
        }

        /* renamed from: a */
        public final void mo169271a(TaskItem dVar) {
            Intrinsics.checkParameterIsNotNull(dVar, "taskItem");
            C48376q a = dVar.mo169297a();
            Task.IconFactory e = a.mo169243e();
            View view = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            e.createDrawableForTask(view.getContext(), a, this.f121836b);
            TextView textView = this.f121837c;
            Intrinsics.checkExpressionValueIsNotNull(textView, "taskName");
            textView.setText(a.mo169239b());
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public TaskItemViewHolder(MultitaskListAdapter aVar, View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            this.f121835a = aVar;
            this.f121836b = (ImageView) view.findViewById(R.id.iv_task_item);
            this.f121837c = (TextView) view.findViewById(R.id.tv_task_name);
            View findViewById = view.findViewById(R.id.v_delete_task);
            findViewById.setOnClickListener(new View$OnClickListenerC48383a(this));
            this.f121838d = findViewById;
            view.setOnClickListener(new View.OnClickListener(this) {
                /* class com.ss.android.lark.multitask.tasklist.MultitaskListAdapter.TaskItemViewHolder.View$OnClickListenerC483821 */

                /* renamed from: a */
                final /* synthetic */ TaskItemViewHolder f121839a;

                {
                    this.f121839a = r1;
                }

                public final void onClick(View view) {
                    int adapterPosition = this.f121839a.getAdapterPosition();
                    if (adapterPosition != -1) {
                        Object item = this.f121839a.f121835a.getItem(adapterPosition);
                        if (item instanceof TaskItem) {
                            C48376q a = ((TaskItem) item).mo169297a();
                            Function1<C48376q, Unit> c = this.f121839a.f121835a.mo169269c();
                            if (c != null) {
                                c.invoke(a);
                            }
                        }
                    }
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Intrinsics.checkParameterIsNotNull(viewHolder, "holder");
        int itemViewType = getItemViewType(i);
        if (itemViewType == 0) {
            TaskTypeViewHolder cVar = (TaskTypeViewHolder) viewHolder;
            Object item = getItem(i);
            if (item != null) {
                cVar.mo169274a((TaskType) item);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.multitask.tasklist.TaskType");
        } else if (itemViewType == 1) {
            TaskItemViewHolder bVar = (TaskItemViewHolder) viewHolder;
            Object item2 = getItem(i);
            if (item2 != null) {
                bVar.mo169271a((TaskItem) item2);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.multitask.tasklist.TaskItem");
        } else if (itemViewType == 2) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 0) {
            View inflate = from.inflate(R.layout.item_multitask_list_type, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "inflater.inflate(R.layou…list_type, parent, false)");
            return new TaskTypeViewHolder(this, inflate);
        } else if (i != 1) {
            View inflate2 = from.inflate(R.layout.item_multitask_list_title, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate2, "inflater.inflate(R.layou…ist_title, parent, false)");
            return new TitleViewHolder(this, inflate2);
        } else {
            View inflate3 = from.inflate(R.layout.item_multitask_list_task, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate3, "inflater.inflate(R.layou…list_task, parent, false)");
            return new TaskItemViewHolder(this, inflate3);
        }
    }
}
