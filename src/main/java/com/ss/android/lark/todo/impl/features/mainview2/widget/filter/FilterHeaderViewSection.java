package com.ss.android.lark.todo.impl.features.mainview2.widget.filter;

import com.bytedance.lark.pb.todo.v1.TodoListView;
import com.larksuite.framework.section.IActionData;
import com.larksuite.framework.section.IViewAbility;
import com.larksuite.framework.section.ViewSection;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.todo.impl.features.mainview2.entity.ClickFilterActionData;
import com.ss.android.lark.todo.impl.features.mainview2.mvvm.IMainFragmentLiveDataStore;
import com.ss.android.lark.todo.impl.features.mainview2.widget.filter.TodoFilterHeaderView;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0002\u0010\u0007J\r\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010\u0016J\b\u0010\u0017\u001a\u00020\u0015H\u0016J\b\u0010\u0018\u001a\u00020\u0015H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview2/widget/filter/FilterHeaderViewSection;", "Lcom/larksuite/framework/section/ViewSection;", "Lcom/ss/android/lark/todo/impl/features/mainview2/mvvm/IMainFragmentLiveDataStore;", "filterHeaderView", "Lcom/ss/android/lark/todo/impl/features/mainview2/widget/filter/TodoFilterHeaderView;", "viewAbility", "Lcom/larksuite/framework/section/IViewAbility;", "(Lcom/ss/android/lark/todo/impl/features/mainview2/widget/filter/TodoFilterHeaderView;Lcom/larksuite/framework/section/IViewAbility;)V", "filterTypeParam", "Lcom/bytedance/lark/pb/todo/v1/TodoListView$Type;", "getFilterTypeParam$todo_release", "()Lcom/bytedance/lark/pb/todo/v1/TodoListView$Type;", "setFilterTypeParam$todo_release", "(Lcom/bytedance/lark/pb/todo/v1/TodoListView$Type;)V", "isResetExpandStateParam", "", "isResetExpandStateParam$todo_release", "()Z", "setResetExpandStateParam$todo_release", "(Z)V", "enterFilterByType", "", "()Lkotlin/Unit;", "initViewAction", "initViewObserver", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.filter.b */
public final class FilterHeaderViewSection extends ViewSection<IMainFragmentLiveDataStore> {

    /* renamed from: a */
    public final TodoFilterHeaderView f140693a;

    /* renamed from: b */
    private TodoListView.Type f140694b;

    /* renamed from: c */
    private boolean f140695c;

    @Override // com.larksuite.framework.section.ViewSection
    /* renamed from: g */
    public void mo92110g() {
        this.f140693a.setActionListener(new C57019a(this));
    }

    @Override // com.larksuite.framework.section.ViewSection
    /* renamed from: f */
    public void mo92109f() {
        mo92103a(((IMainFragmentLiveDataStore) mo92096a()).mo193595l(), new C57020b(this));
    }

    /* renamed from: j */
    public final Unit mo193676j() {
        TodoListView.Type type = this.f140694b;
        if (type == null) {
            return null;
        }
        mo92107d().mo92066a(100, (IActionData) new ClickFilterActionData(type, this.f140695c));
        this.f140693a.mo193644a(type);
        return Unit.INSTANCE;
    }

    /* renamed from: a */
    public final void mo193674a(TodoListView.Type type) {
        this.f140694b = type;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/todo/impl/features/mainview2/widget/filter/FilterHeaderViewSection$initViewAction$1", "Lcom/ss/android/lark/todo/impl/features/mainview2/widget/filter/TodoFilterHeaderView$OnClassifyClickListener;", "onClassifyBtnClick", "", ShareHitPoint.f121869d, "Lcom/bytedance/lark/pb/todo/v1/TodoListView$Type;", "Lcom/ss/android/lark/todo/impl/rustadapter/TodoFilterType;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.filter.b$a */
    public static final class C57019a implements TodoFilterHeaderView.OnClassifyClickListener {

        /* renamed from: a */
        final /* synthetic */ FilterHeaderViewSection f140696a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C57019a(FilterHeaderViewSection bVar) {
            this.f140696a = bVar;
        }

        @Override // com.ss.android.lark.todo.impl.features.mainview2.widget.filter.TodoFilterHeaderView.OnClassifyClickListener
        /* renamed from: a */
        public void mo193662a(TodoListView.Type type) {
            Intrinsics.checkParameterIsNotNull(type, ShareHitPoint.f121869d);
            this.f140696a.mo92107d().mo92066a(100, (IActionData) new ClickFilterActionData(type, false));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0012\u0004\u0012\u00020\u00060\u0003j\u0012\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0012\u0004\u0012\u00020\u0006`\u0007H\n¢\u0006\u0002\b\b¨\u0006\t"}, d2 = {"<anonymous>", "", "it", "Ljava/util/HashMap;", "Lcom/bytedance/lark/pb/todo/v1/TodoListView$Type;", "Lcom/ss/android/lark/todo/impl/rustadapter/TodoFilterType;", "", "Lkotlin/collections/HashMap;", "invoke", "com/ss/android/lark/todo/impl/features/mainview2/widget/filter/FilterHeaderViewSection$initViewObserver$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.filter.b$b */
    static final class C57020b extends Lambda implements Function1<HashMap<TodoListView.Type, Integer>, Unit> {
        final /* synthetic */ FilterHeaderViewSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57020b(FilterHeaderViewSection bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HashMap<TodoListView.Type, Integer> hashMap) {
            invoke(hashMap);
            return Unit.INSTANCE;
        }

        public final void invoke(HashMap<TodoListView.Type, Integer> hashMap) {
            Intrinsics.checkParameterIsNotNull(hashMap, "it");
            this.this$0.f140693a.mo193645a(hashMap);
        }
    }

    /* renamed from: a */
    public final void mo193675a(boolean z) {
        this.f140695c = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FilterHeaderViewSection(TodoFilterHeaderView todoFilterHeaderView, IViewAbility<IMainFragmentLiveDataStore> fVar) {
        super(fVar);
        Intrinsics.checkParameterIsNotNull(todoFilterHeaderView, "filterHeaderView");
        Intrinsics.checkParameterIsNotNull(fVar, "viewAbility");
        this.f140693a = todoFilterHeaderView;
    }
}
