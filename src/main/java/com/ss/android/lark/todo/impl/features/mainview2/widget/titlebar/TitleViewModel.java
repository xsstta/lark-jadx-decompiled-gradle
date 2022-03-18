package com.ss.android.lark.todo.impl.features.mainview2.widget.titlebar;

import com.bytedance.lark.pb.todo.v1.TodoListView;
import com.bytedance.lark.pb.todo.v1.TodoListViewSetting;
import com.bytedance.lark.pb.todo.v1.TodoSortType;
import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.section.IViewModelAbility;
import com.larksuite.framework.section.ViewModelSection;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.todo.dependency.TodoDependencyHolder;
import com.ss.android.lark.todo.impl.features.common.helper.OperationToastHelper;
import com.ss.android.lark.todo.impl.features.mainview.entity.TodoListToastUnit;
import com.ss.android.lark.todo.impl.features.mainview2.mvvm.TodoMainModel2;
import com.ss.android.lark.todo.impl.features.mainview2.widget.titlebar.TitleViewSection;
import com.ss.android.lark.todo.impl.features.setting.TodoSettingService;
import com.ss.android.lark.todo.impl.utils.LogMessageUtil;
import com.ss.android.lark.todo.impl.utils.ResUtil;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u001a\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0012\u0010\u0010\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u000bH\u0016R\u000e\u0010\u0006\u001a\u00020\u0002X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview2/widget/titlebar/TitleViewModel;", "Lcom/larksuite/framework/section/ViewModelSection;", "Lcom/ss/android/lark/todo/impl/features/mainview2/mvvm/TodoMainModel2;", "viewModelAbility", "Lcom/larksuite/framework/section/IViewModelAbility;", "(Lcom/larksuite/framework/section/IViewModelAbility;)V", "model", "getMoreListItems", "", "Lcom/ss/android/lark/todo/impl/features/mainview2/widget/titlebar/TitleViewSection$MenuDisplayItem;", "handleAction", "", "action", "", "actionData", "", "handleSortType", "todoSortType", "Lcom/bytedance/lark/pb/todo/v1/TodoSortType;", "initViewData", "Companion", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.titlebar.b */
public final class TitleViewModel extends ViewModelSection<TodoMainModel2> {
    public static final Companion Companion = new Companion(null);
    public final TodoMainModel2 model;

    @Override // com.larksuite.framework.section.ViewModelSection
    public void initViewData() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview2/widget/titlebar/TitleViewModel$Companion;", "", "()V", "TAG", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.titlebar.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final List<TitleViewSection.MenuDisplayItem> getMoreListItems() {
        ArrayList arrayList = new ArrayList();
        if (this.model.ae() != TodoListView.Type.COMPLETED) {
            arrayList.add(new TitleViewSection.MenuDisplayItem(ResUtil.f139261a.mo191781c(R.string.Todo_Menu_Sort), TitleViewSection.MenuItemType.SORT));
        }
        if (TodoDependencyHolder.f139242a.mo191731b().mo191928a()) {
            arrayList.add(new TitleViewSection.MenuDisplayItem(ResUtil.f139261a.mo191781c(R.string.Todo_Settings_Tooltip), TitleViewSection.MenuItemType.SETTING));
        }
        if (TodoDependencyHolder.f139242a.mo191731b().mo191939l()) {
            arrayList.add(new TitleViewSection.MenuDisplayItem(ResUtil.f139261a.mo191781c(R.string.Todo_Common_HelpCenter), TitleViewSection.MenuItemType.HELP_CENTER));
        }
        return arrayList;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/todo/impl/features/mainview2/widget/titlebar/TitleViewModel$handleSortType$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "result", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.titlebar.b$b */
    public static final class C57131b implements IGetDataCallback<Boolean> {

        /* renamed from: a */
        final /* synthetic */ TitleViewModel f140873a;

        /* renamed from: b */
        final /* synthetic */ String f140874b;

        /* renamed from: c */
        final /* synthetic */ String f140875c;

        /* renamed from: d */
        final /* synthetic */ TodoSortType f140876d;

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
        public /* synthetic */ void onSuccess(Boolean bool) {
            mo193913a(bool.booleanValue());
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("TitleViewModel", LogMessageUtil.f139260a.mo191766a(this.f140874b, this.f140875c, errorResult));
            this.f140873a.model.mo193563U().mo5926a(new TodoListToastUnit(R.string.Todo_Task_FailedToSet, OperationToastHelper.ToastType.FAIL, null, 4, null));
        }

        /* renamed from: a */
        public void mo193913a(boolean z) {
            Log.m165389i("TitleViewModel", LogMessageUtil.f139260a.mo191768a(this.f140874b, this.f140875c, "result", String.valueOf(z)));
            this.f140873a.model.mo193599p().mo5926a(this.f140876d);
            this.f140873a.model.mo193572a(this.f140876d);
            if (this.f140873a.model.ae() == TodoListView.Type.FROM_DOC) {
                TodoMainModel2.m221096a(this.f140873a.model, TodoListView.Type.FROM_DOC, false, 2, null);
            }
        }

        C57131b(TitleViewModel bVar, String str, String str2, TodoSortType todoSortType) {
            this.f140873a = bVar;
            this.f140874b = str;
            this.f140875c = str2;
            this.f140876d = todoSortType;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TitleViewModel(IViewModelAbility<TodoMainModel2> gVar) {
        super(gVar);
        Intrinsics.checkParameterIsNotNull(gVar, "viewModelAbility");
        TodoMainModel2 cVar = (TodoMainModel2) getModelStore();
        this.model = cVar;
        cVar.mo193585b().mo5929b(ResUtil.f139261a.mo191781c(R.string.Todo_Task_Tasks));
    }

    private final void handleSortType(TodoSortType todoSortType) {
        if (todoSortType != null && this.model.ae() != TodoListView.Type.COMPLETED) {
            TodoListViewSetting todoListViewSetting = new TodoListViewSetting(this.model.ae(), todoSortType);
            String valueOf = String.valueOf(new Date().getTime());
            Log.m165389i("TitleViewModel", LogMessageUtil.f139260a.mo191770b(valueOf, "updateTodoViewSetting", new String[0]));
            TodoSettingService.Companion aVar = TodoSettingService.f141012a;
            UIGetDataCallback wrapAndAddGetDataCallback = new CallbackManager().wrapAndAddGetDataCallback(new C57131b(this, valueOf, "updateTodoViewSetting", todoSortType));
            Intrinsics.checkExpressionValueIsNotNull(wrapAndAddGetDataCallback, "CallbackManager().wrapAn…         }\n            })");
            aVar.mo194069a(todoListViewSetting, wrapAndAddGetDataCallback);
        }
    }

    @Override // com.larksuite.framework.section.ViewModelSection
    public void handleAction(int i) {
        if (i == 1) {
            this.model.mo193585b().mo5929b(ResUtil.f139261a.mo191781c(R.string.Todo_Task_Tasks));
            this.model.ah();
        } else if (i == 54) {
            this.model.ai();
        } else if (i == 51) {
            this.model.mo193587d().mo5929b(getMoreListItems());
        } else if (i == 52) {
            this.model.mo193589f().mo5929b(this.model.af());
        }
    }

    @Override // com.larksuite.framework.section.ViewModelSection
    public void handleAction(int i, Object obj) {
        if (i == 53) {
            handleSortType((TodoSortType) obj);
        }
    }
}
