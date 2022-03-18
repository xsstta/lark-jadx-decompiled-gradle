package com.ss.android.lark.multitask.tasklist;

import android.animation.LayoutTransition;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.AbstractC0203c;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.multitask.task.C48376q;
import com.ss.android.lark.multitask.task.GlobalTaskContainerImpl;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.chat.ChatTypeStateKeeper;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.C69043h;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u0006\u0010\u0011\u001a\u00020\u0012J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\tH\u0002J\u0012\u0010\u0015\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J$\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0006\u0010\u001d\u001a\u00020\u0012J\u0006\u0010\u001e\u001a\u00020\u0012J\u0006\u0010\u001f\u001a\u00020\u0012R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\fX\u0004¢\u0006\u0004\n\u0002\u0010\r¨\u0006 "}, d2 = {"Lcom/ss/android/lark/multitask/tasklist/MultitaskListFragment;", "Landroidx/fragment/app/Fragment;", "()V", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "scrollToTopView", "Landroid/view/View;", "textResourceTaskTypeMap", "", "", "", "typeOrder", "", "[Ljava/lang/Integer;", "computeMultitaskList", "", "", "finishAfter500Ms", "", "getTextResourceByTaskType", ShareHitPoint.f121869d, "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "sendBackPressedEvent", "sendTaskListOpenEvent", "triggerBackPressed", "base_multitask_impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.multitask.tasklist.b */
public final class MultitaskListFragment extends Fragment {

    /* renamed from: a */
    public RecyclerView f121851a;

    /* renamed from: b */
    public final Integer[] f121852b;

    /* renamed from: c */
    private View f121853c;

    /* renamed from: d */
    private final Map<String, Integer> f121854d;

    /* renamed from: e */
    private HashMap f121855e;

    /* renamed from: f */
    public void mo169289f() {
        HashMap hashMap = this.f121855e;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo169289f();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/multitask/tasklist/MultitaskListFragment$onActivityCreated$1", "Landroidx/activity/OnBackPressedCallback;", "handleOnBackPressed", "", "base_multitask_impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.multitask.tasklist.b$g */
    public static final class C48395g extends AbstractC0203c {

        /* renamed from: a */
        final /* synthetic */ MultitaskListFragment f121858a;

        @Override // androidx.activity.AbstractC0203c
        public void handleOnBackPressed() {
            this.f121858a.mo169288e();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48395g(MultitaskListFragment bVar, boolean z) {
            super(z);
            this.f121858a = bVar;
        }
    }

    /* renamed from: c */
    public final void mo169286c() {
        Statistics.sendEvent("tasklist_back");
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.multitask.tasklist.b$b */
    public static final class RunnableC48390b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MultitaskListFragment f121857a;

        RunnableC48390b(MultitaskListFragment bVar) {
            this.f121857a = bVar;
        }

        public final void run() {
            FragmentActivity activity = this.f121857a.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0004"}, d2 = {"<anonymous>", "", "invoke", "com/ss/android/lark/multitask/tasklist/MultitaskListFragment$onActivityCreated$2$1$4", "com/ss/android/lark/multitask/tasklist/MultitaskListFragment$$special$$inlined$apply$lambda$4"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.multitask.tasklist.b$f */
    static final class C48394f extends Lambda implements Function0<Unit> {
        final /* synthetic */ MultitaskListFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48394f(MultitaskListFragment bVar) {
            super(0);
            this.this$0 = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            this.this$0.mo169288e();
        }
    }

    /* renamed from: e */
    public final void mo169288e() {
        mo169286c();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0004"}, d2 = {"<anonymous>", "", "invoke", "com/ss/android/lark/multitask/tasklist/MultitaskListFragment$onActivityCreated$2$1$2", "com/ss/android/lark/multitask/tasklist/MultitaskListFragment$$special$$inlined$apply$lambda$2"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.multitask.tasklist.b$d */
    static final class C48392d extends Lambda implements Function0<Unit> {
        final /* synthetic */ MultitaskListAdapter $this_apply;
        final /* synthetic */ MultitaskListFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48392d(MultitaskListAdapter aVar, MultitaskListFragment bVar) {
            super(0);
            this.$this_apply = aVar;
            this.this$0 = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            GlobalTaskContainerImpl.f121803b.mo169229e();
            this.$this_apply.submitList(CollectionsKt.emptyList());
            this.this$0.mo169287d();
        }
    }

    /* renamed from: b */
    public final void mo169285b() {
        List<C48376q> c = GlobalTaskContainerImpl.m190803c();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("view_num", c.size());
        Statistics.sendEvent("tasklist_open", jSONObject);
    }

    /* renamed from: d */
    public final void mo169287d() {
        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC48390b(this), 500);
    }

    public MultitaskListFragment() {
        Integer valueOf = Integer.valueOf((int) R.string.Lark_Floating_Topics);
        Integer valueOf2 = Integer.valueOf((int) R.string.Lark_Floating_Chats);
        Integer valueOf3 = Integer.valueOf((int) R.string.Lark_Floating_Links);
        Integer valueOf4 = Integer.valueOf((int) R.string.Lark_Floating_Apps);
        this.f121854d = MapsKt.mapOf(TuplesKt.to("circle", valueOf), TuplesKt.to("group", valueOf2), TuplesKt.to("private", valueOf2), TuplesKt.to("secret", valueOf2), TuplesKt.to("bot", valueOf2), TuplesKt.to(ChatTypeStateKeeper.f135670e, valueOf), TuplesKt.to("web", valueOf3), TuplesKt.to("gadget", valueOf4));
        this.f121852b = new Integer[]{valueOf2, valueOf, Integer.valueOf((int) R.string.Lark_Floating_Docs), valueOf4, valueOf3};
    }

    /* renamed from: a */
    public final List<Object> mo169284a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : CollectionsKt.reversed(GlobalTaskContainerImpl.m190803c())) {
            String d = ((C48376q) obj).mo169242d();
            Intrinsics.checkExpressionValueIsNotNull(d, "it.type");
            Integer valueOf = Integer.valueOf(m190908a(d));
            Object obj2 = linkedHashMap.get(valueOf);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(valueOf, obj2);
            }
            ((List) obj2).add(obj);
        }
        SortedMap sortedMap = MapsKt.toSortedMap(linkedHashMap, new C48389a(this));
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Title(0, 1, null));
        Set<Integer> keySet = sortedMap.keySet();
        Intrinsics.checkExpressionValueIsNotNull(keySet, "sortedTaskSnapshots.keys");
        for (Integer num : keySet) {
            Intrinsics.checkExpressionValueIsNotNull(num, "it");
            TaskType eVar = new TaskType(num.intValue());
            if (!arrayList.contains(eVar)) {
                arrayList.add(eVar);
            }
            Object obj3 = linkedHashMap.get(num);
            if (obj3 == null) {
                Intrinsics.throwNpe();
            }
            Iterable<C48376q> iterable = (Iterable) obj3;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            for (C48376q qVar : iterable) {
                arrayList2.add(new TaskItem(qVar));
            }
            arrayList.addAll(arrayList2);
        }
        if (arrayList.size() == 1) {
            arrayList.clear();
        }
        return arrayList;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0006"}, d2 = {"<anonymous>", "", "snapshot", "Lcom/ss/android/lark/multitask/task/TaskSnapshot;", "invoke", "com/ss/android/lark/multitask/tasklist/MultitaskListFragment$onActivityCreated$2$1$1", "com/ss/android/lark/multitask/tasklist/MultitaskListFragment$$special$$inlined$apply$lambda$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.multitask.tasklist.b$c */
    static final class C48391c extends Lambda implements Function1<C48376q, Unit> {
        final /* synthetic */ MultitaskListAdapter $this_apply;
        final /* synthetic */ MultitaskListFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48391c(MultitaskListAdapter aVar, MultitaskListFragment bVar) {
            super(1);
            this.$this_apply = aVar;
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C48376q qVar) {
            invoke(qVar);
            return Unit.INSTANCE;
        }

        public final void invoke(C48376q qVar) {
            Intrinsics.checkParameterIsNotNull(qVar, "snapshot");
            GlobalTaskContainerImpl.m190804c(qVar);
            List<Object> a = this.this$0.mo169284a();
            this.$this_apply.submitList(a);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("task_position", GlobalTaskContainerImpl.m190803c().indexOf(qVar) + 1);
            jSONObject.put("task_type", qVar.mo169242d());
            Statistics.sendEvent("tasklist_delete", jSONObject);
            if (a.isEmpty()) {
                this.this$0.mo169287d();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0006"}, d2 = {"<anonymous>", "", "task", "Lcom/ss/android/lark/multitask/task/TaskSnapshot;", "invoke", "com/ss/android/lark/multitask/tasklist/MultitaskListFragment$onActivityCreated$2$1$3", "com/ss/android/lark/multitask/tasklist/MultitaskListFragment$$special$$inlined$apply$lambda$3"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.multitask.tasklist.b$e */
    static final class C48393e extends Lambda implements Function1<C48376q, Unit> {
        final /* synthetic */ MultitaskListFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48393e(MultitaskListFragment bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C48376q qVar) {
            invoke(qVar);
            return Unit.INSTANCE;
        }

        public final void invoke(C48376q qVar) {
            Intrinsics.checkParameterIsNotNull(qVar, "task");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("task_position", GlobalTaskContainerImpl.m190803c().indexOf(qVar) + 1);
            jSONObject.put("task_type", qVar.mo169242d());
            Statistics.sendEvent("tasklist_valid_click", jSONObject);
            GlobalTaskContainerImpl.f121803b.mo169227b(qVar);
            FragmentActivity activity = this.this$0.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.multitask.tasklist.b$i */
    static final class View$OnClickListenerC48397i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MultitaskListFragment f121860a;

        View$OnClickListenerC48397i(MultitaskListFragment bVar) {
            this.f121860a = bVar;
        }

        public final void onClick(View view) {
            this.f121860a.mo169288e();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/multitask/tasklist/MultitaskListFragment$onCreateView$3$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.multitask.tasklist.b$h */
    static final class View$OnClickListenerC48396h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MultitaskListFragment f121859a;

        View$OnClickListenerC48396h(MultitaskListFragment bVar) {
            this.f121859a = bVar;
        }

        public final void onClick(View view) {
            RecyclerView recyclerView = this.f121859a.f121851a;
            if (recyclerView != null) {
                recyclerView.smoothScrollToPosition(0);
            }
        }
    }

    /* renamed from: a */
    private final int m190908a(String str) {
        Integer num = this.f121854d.get(str);
        if (num == null) {
            return R.string.Lark_Floating_Docs;
        }
        return num.intValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        OnBackPressedDispatcher onBackPressedDispatcher;
        super.onActivityCreated(bundle);
        FragmentActivity activity = getActivity();
        if (!(activity == null || (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) == null)) {
            onBackPressedDispatcher.addCallback(getViewLifecycleOwner(), new C48395g(this, true));
        }
        mo169285b();
        RecyclerView recyclerView = this.f121851a;
        if (recyclerView != null) {
            recyclerView.addItemDecoration(new MultitaskListItemDecoration(UIUtils.dp2px(requireContext(), 4.0f), UIUtils.dp2px(requireContext(), 24.0f)));
            MultitaskListAdapter aVar = new MultitaskListAdapter();
            aVar.submitList(mo169284a());
            aVar.mo169265a(new C48391c(aVar, this));
            aVar.mo169264a(new C48392d(aVar, this));
            aVar.mo169268b(new C48393e(this));
            aVar.mo169267b(new C48394f(this));
            recyclerView.setAdapter(aVar);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "o1", "kotlin.jvm.PlatformType", "o2", "compare", "(Ljava/lang/Integer;Ljava/lang/Integer;)I"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.multitask.tasklist.b$a */
    public static final class C48389a<T> implements Comparator<Integer> {

        /* renamed from: a */
        final /* synthetic */ MultitaskListFragment f121856a;

        C48389a(MultitaskListFragment bVar) {
            this.f121856a = bVar;
        }

        /* renamed from: a */
        public final int compare(Integer num, Integer num2) {
            return C69043h.m265770c(this.f121856a.f121852b, num) - C69043h.m265770c(this.f121856a.f121852b, num2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_multitask_list, viewGroup, false);
        if (inflate != null) {
            LayoutTransition layoutTransition = new LayoutTransition();
            layoutTransition.enableTransitionType(4);
            ((ViewGroup) inflate).setLayoutTransition(layoutTransition);
            inflate.setOnClickListener(new View$OnClickListenerC48397i(this));
            this.f121851a = (RecyclerView) inflate.findViewById(R.id.recyclerView_multitask_list);
            View findViewById = inflate.findViewById(R.id.multitask_list_scroll_to_top);
            findViewById.setOnClickListener(new View$OnClickListenerC48396h(this));
            this.f121853c = findViewById;
            return inflate;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
    }
}
