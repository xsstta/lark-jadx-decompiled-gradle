package com.ss.android.lark.todo.impl.features.detail.viewmodel;

import android.content.Context;
import android.net.Uri;
import androidx.lifecycle.AbstractC1178x;
import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.bytedance.lark.pb.todo.v1.TodoSource;
import com.larksuite.framework.section.IViewModelAbility;
import com.larksuite.framework.section.ViewModelSection;
import com.ss.android.lark.dynamicconfig.DynamicConfigModule;
import com.ss.android.lark.todo.dependency.TodoDependencyHolder;
import com.ss.android.lark.todo.dependency.idependency.IOldModuleDependency;
import com.ss.android.lark.todo.dependency.p2789a.AbstractC56253e;
import com.ss.android.lark.todo.impl.framework.hitpoint.event.TodoGeneralHitPoint;
import com.ss.android.lark.todo.impl.framework.hitpoint.event.TodoHitPoint;
import com.ss.android.lark.widget.richtext.C59035h;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0014\u001a\u00020\u0010H\u0016J\b\u0010\u0015\u001a\u00020\u0010H\u0002J\u0010\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0012H\u0002R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\u00078BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\r\u0010\t¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/TitleBarViewDataStore;", "Lcom/larksuite/framework/section/ViewModelSection;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/TodoDetailModel;", "viewModelAbility", "Lcom/larksuite/framework/section/IViewModelAbility;", "(Lcom/larksuite/framework/section/IViewModelAbility;)V", "reportHost", "", "getReportHost", "()Ljava/lang/String;", "reportHost$delegate", "Lkotlin/Lazy;", "reportUrl", "getReportUrl", "reportUrl$delegate", "handleAction", "", "action", "", "actionData", "initViewData", "moreAction", "titleIconShow", "isShow", "", "updateCreateIconState", "textLength", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.ac */
public final class TitleBarViewDataStore extends ViewModelSection<TodoDetailModel> {
    private final Lazy reportHost$delegate = LazyKt.lazy(C56737c.INSTANCE);
    private final Lazy reportUrl$delegate = LazyKt.lazy(new C56738d(this));

    private final String getReportUrl() {
        return (String) this.reportUrl$delegate.getValue();
    }

    public final String getReportHost() {
        return (String) this.reportHost$delegate.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.ac$c */
    static final class C56737c extends Lambda implements Function0<String> {
        public static final C56737c INSTANCE = new C56737c();

        C56737c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return DynamicConfigModule.m145551a(DomainSettings.Alias.SUITE_REPORT);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.ac$d */
    static final class C56738d extends Lambda implements Function0<String> {
        final /* synthetic */ TitleBarViewDataStore this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56738d(TitleBarViewDataStore acVar) {
            super(0);
            this.this$0 = acVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "https://" + this.this$0.getReportHost() + "/report/?type=todo&params=";
        }
    }

    private final void moreAction() {
        int i;
        TodoDetailModel adVar = (TodoDetailModel) getModelStore();
        if (adVar.getCanDelete() && adVar.getTodoSource() != TodoSource.DOC) {
            i = 1;
        } else if (adVar.getCanQuit()) {
            i = 2;
        } else {
            i = 0;
        }
        adVar.getMoreIconState().mo5929b(Integer.valueOf(i));
    }

    @Override // com.larksuite.framework.section.ViewModelSection
    public void initViewData() {
        ((TodoDetailModel) getModelStore()).getNeedUpdate().mo5925a(new C56736b(this));
        ((TodoDetailModel) getModelStore()).getLoading().mo5925a(new C56735a(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V", "com/ss/android/lark/todo/impl/features/detail/viewmodel/TitleBarViewDataStore$initViewData$2$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.ac$a */
    static final class C56735a<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ TitleBarViewDataStore f140145a;

        C56735a(TitleBarViewDataStore acVar) {
            this.f140145a = acVar;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            this.f140145a.titleIconShow(!bool.booleanValue());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TitleBarViewDataStore(IViewModelAbility<TodoDetailModel> gVar) {
        super(gVar);
        Intrinsics.checkParameterIsNotNull(gVar, "viewModelAbility");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.ac$b */
    static final class C56736b<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ TitleBarViewDataStore f140146a;

        C56736b(TitleBarViewDataStore acVar) {
            this.f140146a = acVar;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            TodoDetailModel adVar = (TodoDetailModel) this.f140146a.getModelStore();
            this.f140146a.titleIconShow(true);
            if (!adVar.isCreateTodo()) {
                adVar.getLeftIconState().mo92060c(1);
            } else if (adVar.isShouldFastCreate()) {
                adVar.getLeftIconState().mo92060c(1);
            } else {
                adVar.getLeftIconState().mo92060c(0);
            }
        }
    }

    public final void titleIconShow(boolean z) {
        boolean z2;
        TodoDetailModel adVar = (TodoDetailModel) getModelStore();
        if (!z || adVar.isCreateTodo() || !adVar.getHasValidTodo() || !adVar.getCanRead() || adVar.isDeleted()) {
            z2 = false;
        } else {
            z2 = true;
        }
        adVar.getShareIconShow().mo92060c(Boolean.valueOf(z2));
        adVar.getMoreIconShow().mo92060c(Boolean.valueOf(z2));
    }

    private final void updateCreateIconState(int i) {
        boolean z;
        TodoDetailModel adVar = (TodoDetailModel) getModelStore();
        boolean isCreateTodo = adVar.isCreateTodo();
        int i2 = 0;
        if (isCreateTodo) {
            if (i <= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (adVar.isShowCreateAndSend()) {
                    i2 = 2;
                }
            } else if (z) {
                throw new NoWhenBranchMatchedException();
            } else if (adVar.isShowCreateAndSend()) {
                i2 = 3;
            } else {
                i2 = 1;
            }
        } else if (!isCreateTodo) {
            i2 = -1;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        adVar.getCreateIconState().mo92060c(Integer.valueOf(i2));
    }

    @Override // com.larksuite.framework.section.ViewModelSection
    public void handleAction(int i) {
        if (i == 412) {
            TodoDetailModel adVar = (TodoDetailModel) getModelStore();
            TodoGeneralHitPoint.m221669a(adVar.getGuid(), "view_history", false, 4, null);
            TodoGeneralHitPoint.f141070a.mo194191c(adVar.getGuid(), adVar.getChatIdForAddAssignee());
            TodoHitPoint.m221752f(adVar.getGuid());
        } else if (i != 413) {
            switch (i) {
                case 102:
                    ((TodoDetailModel) getModelStore()).quitTodo();
                    return;
                case 103:
                    TodoGeneralHitPoint.m221669a(((TodoDetailModel) getModelStore()).getGuid(), "more", false, 4, null);
                    moreAction();
                    return;
                case 104:
                    TodoHitPoint.m221759l("task details");
                    TodoGeneralHitPoint.m221669a(((TodoDetailModel) getModelStore()).getGuid(), "share", false, 4, null);
                    IOldModuleDependency oldModuleDependency = TodoDependencyHolder.f139242a.mo191730a().oldModuleDependency();
                    Context context = getContext();
                    String guid = ((TodoDetailModel) getModelStore()).getGuid();
                    String a = C59035h.m229208a(((TodoDetailModel) getModelStore()).getRichTextSummary(), false);
                    if (a == null) {
                        a = "";
                    }
                    oldModuleDependency.mo145422a(context, null, guid, a, 1);
                    return;
                default:
                    switch (i) {
                        case 3200:
                            TodoDetailModel adVar2 = (TodoDetailModel) getModelStore();
                            adVar2.deleteTodo();
                            TodoHitPoint.m221749d(adVar2.getGuid());
                            TodoGeneralHitPoint.m221669a(adVar2.getGuid(), "leave_task", false, 4, null);
                            return;
                        case 3201:
                            TodoHitPoint.m221751e(((TodoDetailModel) getModelStore()).getGuid());
                            return;
                        case 3202:
                            TodoHitPoint.m221747c(((TodoDetailModel) getModelStore()).getGuid());
                            return;
                        default:
                            return;
                    }
            }
        } else {
            JSONObject put = new JSONObject().put("guid", ((TodoDetailModel) getModelStore()).getGuid());
            Intrinsics.checkExpressionValueIsNotNull(put, "JSONObject().put(\"guid\", getModelStore().guid)");
            AbstractC56253e browserDependency = TodoDependencyHolder.f139242a.mo191730a().browserDependency();
            Context context2 = getContext();
            browserDependency.mo145368a(context2, getReportUrl() + Uri.encode(put.toString()));
        }
    }

    @Override // com.larksuite.framework.section.ViewModelSection
    public void handleAction(int i, int i2) {
        if (i == 520) {
            updateCreateIconState(i2);
        }
    }
}
