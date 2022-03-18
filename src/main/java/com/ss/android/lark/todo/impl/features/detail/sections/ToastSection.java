package com.ss.android.lark.todo.impl.features.detail.sections;

import com.larksuite.framework.section.IViewAbility;
import com.larksuite.framework.section.ViewSection;
import com.ss.android.lark.todo.impl.features.common.helper.OperationToastHelper;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewDataStore;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.data.TodoToastUnit;
import com.ss.android.lark.todo.impl.framework.architecture.EventObserver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/sections/ToastSection;", "Lcom/larksuite/framework/section/ViewSection;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/ITodoDetailViewDataStore;", "viewAbility", "Lcom/larksuite/framework/section/IViewAbility;", "(Lcom/larksuite/framework/section/IViewAbility;)V", "initViewAction", "", "initViewObserver", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.d.n */
public final class ToastSection extends ViewSection<ITodoDetailViewDataStore> {
    @Override // com.larksuite.framework.section.ViewSection
    /* renamed from: g */
    public void mo92110g() {
    }

    @Override // com.larksuite.framework.section.ViewSection
    /* renamed from: f */
    public void mo92109f() {
        ((ITodoDetailViewDataStore) mo92096a()).getToast().mo5923a(mo92105b(), new EventObserver(new C56692a(this)));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/data/TodoToastUnit;", "invoke", "com/ss/android/lark/todo/impl/features/detail/sections/ToastSection$initViewObserver$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.d.n$a */
    static final class C56692a extends Lambda implements Function1<TodoToastUnit, Unit> {
        final /* synthetic */ ToastSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56692a(ToastSection nVar) {
            super(1);
            this.this$0 = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(TodoToastUnit aVar) {
            invoke(aVar);
            return Unit.INSTANCE;
        }

        public final void invoke(TodoToastUnit aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "it");
            int b = aVar.mo192768b();
            if (b == 1) {
                OperationToastHelper.m219774a(OperationToastHelper.f139395a, this.this$0.mo92106c(), aVar.mo192767a(), null, null, null, 28, null);
            } else if (b == 2) {
                OperationToastHelper.m219775a(OperationToastHelper.f139395a, this.this$0.mo92106c(), aVar.mo192767a(), aVar.mo192769c(), null, null, null, 56, null);
            } else if (b == 3) {
                OperationToastHelper.f139395a.mo191991a(this.this$0.mo92106c(), aVar.mo192767a());
            } else if (b != 4) {
                OperationToastHelper.f139395a.mo191995b(this.this$0.mo92106c(), aVar.mo192767a());
            } else {
                OperationToastHelper.m219777b(OperationToastHelper.f139395a, this.this$0.mo92106c(), aVar.mo192767a(), aVar.mo192769c(), null, null, null, 56, null);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ToastSection(IViewAbility<ITodoDetailViewDataStore> fVar) {
        super(fVar);
        Intrinsics.checkParameterIsNotNull(fVar, "viewAbility");
    }
}
