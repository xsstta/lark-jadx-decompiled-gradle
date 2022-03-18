package com.ss.android.lark.todo.impl.features.detail.viewmodel;

import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1143ag;
import androidx.lifecycle.C1177w;
import com.bytedance.lark.pb.todo.v1.Commit;
import com.bytedance.lark.pb.todo.v1.TodoItemPermission;
import com.bytedance.lark.pb.todo.v1.TodoSource;
import com.larksuite.framework.section.IActionData;
import com.larksuite.framework.section.IViewModelAbility;
import com.larksuite.framework.section.ViewModelSection;
import com.ss.android.lark.todo.dependency.TodoDependencyHolder;
import com.ss.android.lark.widget.richtext.RichText;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import kotlinx.coroutines.C69553g;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0002J,\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00072\f\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\"H\u0002J\u0010\u0010&\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020\rH\u0016J\u0018\u0010&\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020\r2\u0006\u0010(\u001a\u00020)H\u0016J\u001a\u0010&\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020\r2\b\u0010(\u001a\u0004\u0018\u00010*H\u0016J\b\u0010+\u001a\u00020\u001fH\u0016J\u0018\u0010,\u001a\u00020\u001f2\u0006\u0010-\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\rH\u0002J\u0012\u0010/\u001a\u00020\u001f2\b\b\u0002\u00100\u001a\u00020\u0013H\u0002R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015¨\u00061"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/SummaryViewModel;", "Lcom/larksuite/framework/section/ViewModelSection;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/TodoDetailModel;", "viewModelAbility", "Lcom/larksuite/framework/section/IViewModelAbility;", "(Lcom/larksuite/framework/section/IViewModelAbility;)V", "summaryContent", "", "getSummaryContent", "()Ljava/lang/String;", "setSummaryContent", "(Ljava/lang/String;)V", "summarySelection", "", "getSummarySelection", "()I", "setSummarySelection", "(I)V", "urlPreviewEnable", "", "getUrlPreviewEnable", "()Z", "urlPreviewEnable$delegate", "Lkotlin/Lazy;", "generateSummaryBean", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/RichTextShowBean;", "generateSummaryInfo", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/SummaryInfo;", "generateSummaryInit", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/SummaryInit;", "getUrlDocFromContent", "", "content", "docLv", "Landroidx/lifecycle/MutableLiveData;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/DocPasteBean;", "urlLv", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/UrlPasteBean;", "handleAction", "action", "actionData", "Lcom/larksuite/framework/section/IActionData;", "", "initViewData", "pasteDocInSummary", "contentStr", "selection", "updateSummary", "needUpdateTodo", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.y */
public final class SummaryViewModel extends ViewModelSection<TodoDetailModel> {
    private String summaryContent = "";
    private int summarySelection = -1;
    private final Lazy urlPreviewEnable$delegate = LazyKt.lazy(C56791c.INSTANCE);

    public final boolean getUrlPreviewEnable() {
        return ((Boolean) this.urlPreviewEnable$delegate.getValue()).booleanValue();
    }

    public final String getSummaryContent() {
        return this.summaryContent;
    }

    public final int getSummarySelection() {
        return this.summarySelection;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.y$c */
    static final class C56791c extends Lambda implements Function0<Boolean> {
        public static final C56791c INSTANCE = new C56791c();

        C56791c() {
            super(0);
        }

        /* Return type fixed from 'boolean' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return TodoDependencyHolder.f139242a.mo191731b().mo191933f();
        }
    }

    private final RichTextShowBean generateSummaryBean() {
        return new RichTextShowBean(((TodoDetailModel) getModelStore()).getRichTextSummary(), true, true);
    }

    private final SummaryInit generateSummaryInit() {
        return new SummaryInit(((TodoDetailModel) getModelStore()).isCreateTodo(), ((TodoDetailModel) getModelStore()).isShouldFastCreate());
    }

    @Override // com.larksuite.framework.section.ViewModelSection
    public void initViewData() {
        TodoDetailModel adVar = (TodoDetailModel) getModelStore();
        adVar.getSummaryInit().mo5929b(generateSummaryInit());
        adVar.getNeedUpdate().mo5925a(new C56790b(this));
    }

    private final SummaryInfo generateSummaryInfo() {
        Map<Integer, Boolean> map;
        boolean z;
        TodoItemPermission todoItemPermission = ((TodoDetailModel) getModelStore()).getTodoItemPermission();
        if (todoItemPermission == null || (map = todoItemPermission.can_edit_commit_keys) == null) {
            map = MapsKt.emptyMap();
        }
        Boolean bool = map.get(Integer.valueOf(Commit.Key.TODO_RICH_SUMMARY.getValue()));
        boolean z2 = false;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        Long l = ((TodoDetailModel) getModelStore()).getTodoBuilder().f48017D;
        if (l == null) {
            z2 = ((TodoDetailModel) getModelStore()).isComplete();
        } else if (l.longValue() > 0) {
            z2 = true;
        }
        TodoSource todoSource = ((TodoDetailModel) getModelStore()).getTodoSource();
        if (!(((TodoDetailModel) getModelStore()).getTodoSource() == TodoSource.OAPI || ((TodoDetailModel) getModelStore()).getTodoSource() == TodoSource.DOC)) {
            z = ((TodoDetailModel) getModelStore()).isEditable();
        }
        return new SummaryInfo(z2, todoSource, z);
    }

    public final void setSummarySelection(int i) {
        this.summarySelection = i;
    }

    public final void setSummaryContent(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.summaryContent = str;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V", "com/ss/android/lark/todo/impl/features/detail/viewmodel/SummaryViewModel$initViewData$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.y$b */
    static final class C56790b<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ SummaryViewModel f140204a;

        C56790b(SummaryViewModel yVar) {
            this.f140204a = yVar;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            SummaryViewModel.updateSummary$default(this.f140204a, false, 1, null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SummaryViewModel(IViewModelAbility<TodoDetailModel> gVar) {
        super(gVar);
        Intrinsics.checkParameterIsNotNull(gVar, "viewModelAbility");
    }

    private final void updateSummary(boolean z) {
        TodoDetailModel adVar = (TodoDetailModel) getModelStore();
        adVar.getSummaryShowRichText().mo92060c(generateSummaryBean());
        adVar.getSummaryInfo().mo5929b(generateSummaryInfo());
    }

    @Override // com.larksuite.framework.section.ViewModelSection
    public void handleAction(int i) {
        if (i == 83 && ((TodoDetailModel) getModelStore()).isInLineSummaryChanged()) {
            updateSummary$default(this, false, 1, null);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.detail.viewmodel.SummaryViewModel$getUrlDocFromContent$1", mo239173f = "SummaryViewModel.kt", mo239174i = {0, 1, 1, 2}, mo239175l = {106, SmEvents.EVENT_NE_RR, 119}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch", "$this$launch", "it", "$this$launch"}, mo239178s = {"L$0", "L$0", "L$1", "L$0"})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.y$a */
    public static final class C56789a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $content;
        final /* synthetic */ C1177w $docLv;
        final /* synthetic */ C1177w $urlLv;
        Object L$0;
        Object L$1;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ SummaryViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56789a(SummaryViewModel yVar, String str, C1177w wVar, C1177w wVar2, Continuation cVar) {
            super(2, cVar);
            this.this$0 = yVar;
            this.$content = str;
            this.$urlLv = wVar;
            this.$docLv = wVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C56789a aVar = new C56789a(this.this$0, this.$content, this.$urlLv, this.$docLv, cVar);
            aVar.p$ = (CoroutineScope) obj;
            return aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C56789a) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARNING: Removed duplicated region for block: B:27:0x009b  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x00d7  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
            // Method dump skipped, instructions count: 240
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.todo.impl.features.detail.viewmodel.SummaryViewModel.C56789a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Override // com.larksuite.framework.section.ViewModelSection
    public void handleAction(int i, Object obj) {
        if (i == 80) {
            if (!(obj instanceof RichText)) {
                obj = null;
            }
            RichText richText = (RichText) obj;
            if (richText != null) {
                ((TodoDetailModel) getModelStore()).setRichTextSummary(richText);
                ((TodoDetailModel) getModelStore()).setSummaryChanged(true);
            }
        }
    }

    private final void pasteDocInSummary(String str, int i) {
        this.summarySelection = i;
        this.summaryContent = str;
        while (str.length() > 1 && StringsKt.startsWith$default(str, " ", false, 2, (Object) null)) {
            if (str != null) {
                str = str.substring(1);
                Intrinsics.checkExpressionValueIsNotNull(str, "(this as java.lang.String).substring(startIndex)");
            } else {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
        }
        while (str.length() > 1 && StringsKt.endsWith$default(str, "\n", false, 2, (Object) null)) {
            int length = str.length() - 1;
            if (str != null) {
                str = str.substring(0, length);
                Intrinsics.checkExpressionValueIsNotNull(str, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            } else {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
        }
        getUrlDocFromContent(str, ((TodoDetailModel) getModelStore()).getSummaryPasteDoc(), ((TodoDetailModel) getModelStore()).getSummaryPasteUrl());
    }

    @Override // com.larksuite.framework.section.ViewModelSection
    public void handleAction(int i, IActionData bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "actionData");
        if (i != 43) {
            if (i != 45) {
                if (i == 46 && (bVar instanceof UrlInsertBean)) {
                    UrlInsertBean agVar = (UrlInsertBean) bVar;
                    ((TodoDetailModel) getModelStore()).insertUrlIntoMap(agVar.mo192971a(), agVar.mo192972b());
                }
            } else if (bVar instanceof DocInsertBean) {
                DocInsertBean jVar = (DocInsertBean) bVar;
                ((TodoDetailModel) getModelStore()).insertDocIntoMap(jVar.mo193007a(), jVar.mo193008b());
            }
        } else if (bVar instanceof PasteBean) {
            PasteBean sVar = (PasteBean) bVar;
            pasteDocInSummary(sVar.mo193037a(), sVar.mo193038b());
        }
    }

    private final void getUrlDocFromContent(String str, C1177w<DocPasteBean> wVar, C1177w<UrlPasteBean> wVar2) {
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), Dispatchers.m266326d(), null, new C56789a(this, str, wVar2, wVar, null), 2, null);
    }

    static /* synthetic */ void updateSummary$default(SummaryViewModel yVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        yVar.updateSummary(z);
    }
}
