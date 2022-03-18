package com.ss.android.lark.todo.impl.features.detail.sections;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1178x;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.larksuite.framework.p1173a.p1174a.C25877a;
import com.larksuite.framework.section.IViewAbility;
import com.larksuite.framework.section.ViewSection;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.todo.impl.features.detail.sections.AssigneeAvatarAdapter;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.AssigneeBean;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewDataStore;
import com.ss.android.lark.todo.impl.framework.hitpoint.event.TodoHitPoint;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002*+B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010!\u001a\u00020\"H\u0002J\b\u0010#\u001a\u00020\"H\u0016J\b\u0010$\u001a\u00020\"H\u0016J\b\u0010%\u001a\u00020\"H\u0002J\u0016\u0010&\u001a\u00020\"2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020)0(H\u0002R\u001b\u0010\b\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u000e\u001a\u00060\u000fR\u00020\u00008BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0018\u001a\u00020\u0019X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u001c\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u001f\u0010\r\u001a\u0004\b\u001d\u0010\u001eR\u000e\u0010 \u001a\u00020\u001bXD¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/sections/AssigneeSection;", "Lcom/larksuite/framework/section/ViewSection;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/ITodoDetailViewDataStore;", "containerView", "Landroid/view/View;", "viewAbility", "Lcom/larksuite/framework/section/IViewAbility;", "(Landroid/view/View;Lcom/larksuite/framework/section/IViewAbility;)V", "assigneeAvatarAdapter", "Lcom/ss/android/lark/todo/impl/features/detail/sections/AssigneeAvatarAdapter;", "getAssigneeAvatarAdapter", "()Lcom/ss/android/lark/todo/impl/features/detail/sections/AssigneeAvatarAdapter;", "assigneeAvatarAdapter$delegate", "Lkotlin/Lazy;", "dismissRevokeRunnable", "Lcom/ss/android/lark/todo/impl/features/detail/sections/AssigneeSection$DismissRevokeRunnable;", "getDismissRevokeRunnable", "()Lcom/ss/android/lark/todo/impl/features/detail/sections/AssigneeSection$DismissRevokeRunnable;", "dismissRevokeRunnable$delegate", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "handler$delegate", "hasOngoingRevokeRunnable", "", "lastShowRevokeTime", "", "layout_assignee", "getLayout_assignee", "()Landroid/view/View;", "layout_assignee$delegate", "revokeToastTime", "checkPostRevokeRunnable", "", "initViewAction", "initViewObserver", "showRevokeUserView", "updateAssigneeView", "assignees", "", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/AssigneeBean;", "Companion", "DismissRevokeRunnable", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.d.d */
public final class AssigneeSection extends ViewSection<ITodoDetailViewDataStore> {

    /* renamed from: d */
    public static final Companion f139954d = new Companion(null);

    /* renamed from: a */
    public final long f139955a;

    /* renamed from: b */
    public long f139956b;

    /* renamed from: c */
    public final View f139957c;

    /* renamed from: e */
    private final Lazy f139958e = LazyKt.lazy(new C56584i(this));

    /* renamed from: f */
    private final Lazy f139959f;

    /* renamed from: g */
    private boolean f139960g;

    /* renamed from: h */
    private final Lazy f139961h;

    /* renamed from: i */
    private final Lazy f139962i;

    /* renamed from: l */
    private final View m220393l() {
        return (View) this.f139958e.getValue();
    }

    /* renamed from: m */
    private final AssigneeAvatarAdapter m220394m() {
        return (AssigneeAvatarAdapter) this.f139959f.getValue();
    }

    /* renamed from: n */
    private final DismissRevokeRunnable m220395n() {
        return (DismissRevokeRunnable) this.f139962i.getValue();
    }

    /* renamed from: j */
    public final Handler mo192555j() {
        return (Handler) this.f139961h.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/sections/AssigneeSection$Companion;", "", "()V", "ASSIGNEE_DISTANCE", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00060\u0001R\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/todo/impl/features/detail/sections/AssigneeSection$DismissRevokeRunnable;", "Lcom/ss/android/lark/todo/impl/features/detail/sections/AssigneeSection;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.d$d */
    static final class C56579d extends Lambda implements Function0<DismissRevokeRunnable> {
        final /* synthetic */ AssigneeSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56579d(AssigneeSection dVar) {
            super(0);
            this.this$0 = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final DismissRevokeRunnable invoke() {
            return new DismissRevokeRunnable();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/os/Handler;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.d$e */
    static final class C56580e extends Lambda implements Function0<Handler> {
        public static final C56580e INSTANCE = new C56580e();

        C56580e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.d$i */
    static final class C56584i extends Lambda implements Function0<View> {
        final /* synthetic */ AssigneeSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56584i(AssigneeSection dVar) {
            super(0);
            this.this$0 = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final View invoke() {
            return this.this$0.f139957c.findViewById(R.id.layout_assignee);
        }
    }

    /* renamed from: o */
    private final void m220396o() {
        if (!this.f139960g) {
            this.f139960g = true;
            mo192555j().postDelayed(m220395n(), this.f139955a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/todo/impl/features/detail/sections/AssigneeAvatarAdapter;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.d$c */
    static final class C56577c extends Lambda implements Function0<AssigneeAvatarAdapter> {
        final /* synthetic */ IViewAbility $viewAbility;
        final /* synthetic */ AssigneeSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56577c(AssigneeSection dVar, IViewAbility fVar) {
            super(0);
            this.this$0 = dVar;
            this.$viewAbility = fVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final AssigneeAvatarAdapter invoke() {
            AssigneeAvatarAdapter aVar = new AssigneeAvatarAdapter(this.this$0.mo92106c());
            aVar.mo192536a(new AssigneeAvatarAdapter.ItemClickListener(this) {
                /* class com.ss.android.lark.todo.impl.features.detail.sections.AssigneeSection.C56577c.C565781 */

                /* renamed from: a */
                final /* synthetic */ C56577c f139964a;

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f139964a = r1;
                }

                @Override // com.ss.android.lark.todo.impl.features.detail.sections.AssigneeAvatarAdapter.ItemClickListener
                /* renamed from: a */
                public void mo191810a(View view, AssigneeAvatarBean bVar) {
                    Intrinsics.checkParameterIsNotNull(view, "view");
                    Intrinsics.checkParameterIsNotNull(bVar, "item");
                    this.f139964a.$viewAbility.mo92075d().mo92064a(CommonCode.StatusCode.API_CLIENT_EXPIRED);
                    this.f139964a.$viewAbility.mo92075d().mo92064a(21);
                }
            });
            aVar.mo192535a(UIUtils.dp2px(this.this$0.mo92106c(), 5.0f));
            return aVar;
        }
    }

    @Override // com.larksuite.framework.section.ViewSection
    /* renamed from: f */
    public void mo92109f() {
        ITodoDetailViewDataStore qVar = (ITodoDetailViewDataStore) mo92096a();
        mo92103a(qVar.getAssignees(), new C56581f(this));
        mo92103a(qVar.getShowRevokeAssignee(), new C56582g(this));
        ((ITodoDetailViewDataStore) mo92096a()).getAssignees().mo5923a(mo92105b(), new C56583h(this));
    }

    /* renamed from: k */
    public final void mo192556k() {
        this.f139956b = System.currentTimeMillis();
        LinearLayout linearLayout = (LinearLayout) this.f139957c.findViewById(R.id.layout_revoke_assignee);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "containerView.layout_revoke_assignee");
        linearLayout.setVisibility(0);
        m220396o();
        ((TextView) this.f139957c.findViewById(R.id.text_revoke_assignee)).setOnClickListener(new View$OnClickListenerC56585j(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/sections/AssigneeSection$DismissRevokeRunnable;", "Ljava/lang/Runnable;", "(Lcom/ss/android/lark/todo/impl/features/detail/sections/AssigneeSection;)V", "run", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.d$b */
    public final class DismissRevokeRunnable implements Runnable {
        public void run() {
            long currentTimeMillis = (AssigneeSection.this.f139955a - System.currentTimeMillis()) + AssigneeSection.this.f139956b;
            if (currentTimeMillis <= 0) {
                LinearLayout linearLayout = (LinearLayout) AssigneeSection.this.f139957c.findViewById(R.id.layout_revoke_assignee);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout, "containerView.layout_revoke_assignee");
                linearLayout.setVisibility(8);
                AssigneeSection.this.mo92107d().mo92069a(24, false);
                return;
            }
            AssigneeSection.this.mo192555j().postDelayed(this, currentTimeMillis);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public DismissRevokeRunnable() {
        }
    }

    @Override // com.larksuite.framework.section.ViewSection
    /* renamed from: g */
    public void mo92110g() {
        C25877a.m93658a(m220393l(), mo92107d(), CommonCode.StatusCode.API_CLIENT_EXPIRED, 21);
        RecyclerView recyclerView = (RecyclerView) this.f139957c.findViewById(R.id.assignee_avatar_list);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "containerView.assignee_avatar_list");
        C25877a.m93658a(recyclerView, mo92107d(), CommonCode.StatusCode.API_CLIENT_EXPIRED, 21);
        LinearLayout linearLayout = (LinearLayout) this.f139957c.findViewById(R.id.detail_assignee_container);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "containerView.detail_assignee_container");
        C25877a.m93658a(linearLayout, mo92107d(), CommonCode.StatusCode.API_CLIENT_EXPIRED, 22);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/AssigneeBean;", "invoke", "com/ss/android/lark/todo/impl/features/detail/sections/AssigneeSection$initViewObserver$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.d$f */
    static final class C56581f extends Lambda implements Function1<List<? extends AssigneeBean>, Unit> {
        final /* synthetic */ AssigneeSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56581f(AssigneeSection dVar) {
            super(1);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends AssigneeBean> list) {
            invoke((List<AssigneeBean>) list);
            return Unit.INSTANCE;
        }

        public final void invoke(List<AssigneeBean> list) {
            Intrinsics.checkParameterIsNotNull(list, "it");
            this.this$0.mo192554a(list);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "com/ss/android/lark/todo/impl/features/detail/sections/AssigneeSection$initViewObserver$1$2"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.d$g */
    static final class C56582g extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ AssigneeSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56582g(AssigneeSection dVar) {
            super(1);
            this.this$0 = dVar;
        }

        public final void invoke(boolean z) {
            this.this$0.mo192556k();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/AssigneeBean;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.d$h */
    static final class C56583h<T> implements AbstractC1178x<List<? extends AssigneeBean>> {

        /* renamed from: a */
        final /* synthetic */ AssigneeSection f139965a;

        C56583h(AssigneeSection dVar) {
            this.f139965a = dVar;
        }

        /* renamed from: a */
        public final void onChanged(List<AssigneeBean> list) {
            AssigneeSection dVar = this.f139965a;
            Intrinsics.checkExpressionValueIsNotNull(list, "it");
            dVar.mo192554a(list);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.d$j */
    public static final class View$OnClickListenerC56585j implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AssigneeSection f139966a;

        View$OnClickListenerC56585j(AssigneeSection dVar) {
            this.f139966a = dVar;
        }

        public final void onClick(View view) {
            this.f139966a.mo92107d().mo92069a(24, true);
            LinearLayout linearLayout = (LinearLayout) this.f139966a.f139957c.findViewById(R.id.layout_revoke_assignee);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "containerView.layout_revoke_assignee");
            linearLayout.setVisibility(8);
            TodoHitPoint.f141073a.mo194227f();
        }
    }

    /* renamed from: a */
    public final void mo192554a(List<AssigneeBean> list) {
        List<AssigneeBean> list2;
        boolean z;
        int size = list.size();
        if (size > 0) {
            TextView textView = (TextView) this.f139957c.findViewById(R.id.text_add_assignee);
            Intrinsics.checkExpressionValueIsNotNull(textView, "containerView.text_add_assignee");
            textView.setVisibility(8);
            LinearLayout linearLayout = (LinearLayout) this.f139957c.findViewById(R.id.detail_assignee_container);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "containerView.detail_assignee_container");
            linearLayout.setClickable(false);
            m220393l().setVisibility(0);
            if (list.size() > 3) {
                list2 = list.subList(0, 3);
            } else {
                list2 = list;
            }
            AssigneeAvatarAdapter m = m220394m();
            ArrayList arrayList = new ArrayList();
            for (T t : list2) {
                String a = t.mo192757a();
                String c = t.mo192759c();
                if (!t.mo192764g() || !Intrinsics.areEqual((Object) ((ITodoDetailViewDataStore) mo92096a()).getAssigneeMultiStrategy().mo5927b(), (Object) true)) {
                    z = false;
                } else {
                    z = true;
                }
                arrayList.add(new AssigneeAvatarBean(a, c, z));
            }
            m.mo192537a(arrayList);
            if (size == 1) {
                TextView textView2 = (TextView) m220393l().findViewById(R.id.assignee_avatar_text);
                Intrinsics.checkExpressionValueIsNotNull(textView2, "layout_assignee.assignee_avatar_text");
                textView2.setText(list.get(0).mo192758b());
                return;
            }
            TextView textView3 = (TextView) m220393l().findViewById(R.id.assignee_avatar_text);
            Intrinsics.checkExpressionValueIsNotNull(textView3, "layout_assignee.assignee_avatar_text");
            textView3.setText(UIHelper.getQuantityString(R.plurals.Todo_Task_NumAssignees, size));
            return;
        }
        TextView textView4 = (TextView) this.f139957c.findViewById(R.id.text_add_assignee);
        Intrinsics.checkExpressionValueIsNotNull(textView4, "containerView.text_add_assignee");
        textView4.setVisibility(0);
        LinearLayout linearLayout2 = (LinearLayout) this.f139957c.findViewById(R.id.detail_assignee_container);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "containerView.detail_assignee_container");
        linearLayout2.setClickable(true);
        m220393l().setVisibility(8);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AssigneeSection(View view, IViewAbility<ITodoDetailViewDataStore> fVar) {
        super(fVar);
        Intrinsics.checkParameterIsNotNull(view, "containerView");
        Intrinsics.checkParameterIsNotNull(fVar, "viewAbility");
        this.f139957c = view;
        this.f139959f = LazyKt.lazy(new C56577c(this, fVar));
        RecyclerView recyclerView = (RecyclerView) m220393l().findViewById(R.id.assignee_avatar_list);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "layout_assignee.assignee_avatar_list");
        recyclerView.setLayoutManager(new LinearLayoutManager(mo92106c(), 0, false));
        RecyclerView recyclerView2 = (RecyclerView) m220393l().findViewById(R.id.assignee_avatar_list);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "layout_assignee.assignee_avatar_list");
        recyclerView2.setAdapter(m220394m());
        this.f139955a = 3000;
        this.f139961h = LazyKt.lazy(C56580e.INSTANCE);
        this.f139962i = LazyKt.lazy(new C56579d(this));
    }
}
