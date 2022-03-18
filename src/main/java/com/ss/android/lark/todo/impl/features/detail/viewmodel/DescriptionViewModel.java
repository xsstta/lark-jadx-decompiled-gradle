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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0002J,\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001aH\u0002J\u0018\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\t2\u0006\u0010 \u001a\u00020!H\u0016J\u001a\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\t2\b\u0010 \u001a\u0004\u0018\u00010\"H\u0016J\b\u0010#\u001a\u00020\u0017H\u0016J\u0018\u0010$\u001a\u00020\u00172\u0006\u0010%\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\tH\u0002J\u0012\u0010'\u001a\u00020\u00172\b\b\u0002\u0010(\u001a\u00020\u000bH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006)"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/DescriptionViewModel;", "Lcom/larksuite/framework/section/ViewModelSection;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/TodoDetailModel;", "viewModelAbility", "Lcom/larksuite/framework/section/IViewModelAbility;", "(Lcom/larksuite/framework/section/IViewModelAbility;)V", "pasteContent", "", "pasteSelection", "", "urlPreviewEnable", "", "getUrlPreviewEnable", "()Z", "urlPreviewEnable$delegate", "Lkotlin/Lazy;", "generateDescriptionBean", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/RichTextShowBean;", "generateDescriptionInfo", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/DescriptionInfo;", "generateDescriptionInit", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/DescriptionInit;", "getUrlDocFromContent", "", "content", "docLv", "Landroidx/lifecycle/MutableLiveData;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/DocPasteBean;", "urlLv", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/UrlPasteBean;", "handleAction", "action", "actionData", "Lcom/larksuite/framework/section/IActionData;", "", "initViewData", "pasteDocInDescription", "contentStr", "selection", "updateDescription", "needUpdateTodo", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.h */
public final class DescriptionViewModel extends ViewModelSection<TodoDetailModel> {
    public String pasteContent = "";
    public int pasteSelection = -1;
    private final Lazy urlPreviewEnable$delegate = LazyKt.lazy(C56772c.INSTANCE);

    public final boolean getUrlPreviewEnable() {
        return ((Boolean) this.urlPreviewEnable$delegate.getValue()).booleanValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.h$c */
    static final class C56772c extends Lambda implements Function0<Boolean> {
        public static final C56772c INSTANCE = new C56772c();

        C56772c() {
            super(0);
        }

        /* Return type fixed from 'boolean' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return TodoDependencyHolder.f139242a.mo191731b().mo191933f();
        }
    }

    private final RichTextShowBean generateDescriptionBean() {
        return new RichTextShowBean(((TodoDetailModel) getModelStore()).getRichTextDescription(), false, false, 6, null);
    }

    private final DescriptionInit generateDescriptionInit() {
        return new DescriptionInit(((TodoDetailModel) getModelStore()).isCreateTodo(), ((TodoDetailModel) getModelStore()).isShouldFastCreate());
    }

    @Override // com.larksuite.framework.section.ViewModelSection
    public void initViewData() {
        TodoDetailModel adVar = (TodoDetailModel) getModelStore();
        adVar.getDescriptionInit().mo5929b(generateDescriptionInit());
        adVar.getNeedUpdate().mo5925a(new C56771b(this));
    }

    private final DescriptionInfo generateDescriptionInfo() {
        Map<Integer, Boolean> map;
        boolean z;
        TodoItemPermission todoItemPermission = ((TodoDetailModel) getModelStore()).getTodoItemPermission();
        if (todoItemPermission == null || (map = todoItemPermission.can_edit_commit_keys) == null) {
            map = MapsKt.emptyMap();
        }
        Boolean bool = map.get(Integer.valueOf(Commit.Key.TODO_RICH_DESCRIPTION.getValue()));
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        boolean isComplete = ((TodoDetailModel) getModelStore()).isComplete();
        TodoSource todoSource = ((TodoDetailModel) getModelStore()).getTodoSource();
        if (((TodoDetailModel) getModelStore()).getTodoSource() != TodoSource.OAPI) {
            z = ((TodoDetailModel) getModelStore()).isEditable();
        }
        return new DescriptionInfo(isComplete, todoSource, z);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V", "com/ss/android/lark/todo/impl/features/detail/viewmodel/DescriptionViewModel$initViewData$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.h$b */
    static final class C56771b<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ DescriptionViewModel f140173a;

        C56771b(DescriptionViewModel hVar) {
            this.f140173a = hVar;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            DescriptionViewModel.updateDescription$default(this.f140173a, false, 1, null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DescriptionViewModel(IViewModelAbility<TodoDetailModel> gVar) {
        super(gVar);
        Intrinsics.checkParameterIsNotNull(gVar, "viewModelAbility");
    }

    private final void updateDescription(boolean z) {
        TodoDetailModel adVar = (TodoDetailModel) getModelStore();
        adVar.getDescriptionInfo().mo5929b(generateDescriptionInfo());
        adVar.getDescriptionShowRichText().mo5929b(generateDescriptionBean());
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.todo.impl.features.detail.viewmodel.DescriptionViewModel$getUrlDocFromContent$1", mo239173f = "DescriptionViewModel.kt", mo239174i = {0, 1, 1, 2}, mo239175l = {98, 104, SmEvents.EVENT_NT}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch", "$this$launch", "it", "$this$launch"}, mo239178s = {"L$0", "L$0", "L$1", "L$0"})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.h$a */
    public static final class C56770a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $content;
        final /* synthetic */ C1177w $docLv;
        final /* synthetic */ C1177w $urlLv;
        Object L$0;
        Object L$1;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ DescriptionViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56770a(DescriptionViewModel hVar, String str, C1177w wVar, C1177w wVar2, Continuation cVar) {
            super(2, cVar);
            this.this$0 = hVar;
            this.$content = str;
            this.$urlLv = wVar;
            this.$docLv = wVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C56770a aVar = new C56770a(this.this$0, this.$content, this.$urlLv, this.$docLv, cVar);
            aVar.p$ = (CoroutineScope) obj;
            return aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C56770a) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARNING: Removed duplicated region for block: B:27:0x0096  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x00ce  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
            // Method dump skipped, instructions count: 227
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.todo.impl.features.detail.viewmodel.DescriptionViewModel.C56770a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    private final void pasteDocInDescription(String str, int i) {
        this.pasteSelection = i;
        this.pasteContent = str;
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
        getUrlDocFromContent(str, ((TodoDetailModel) getModelStore()).getDescriptionPasteDoc(), ((TodoDetailModel) getModelStore()).getDescriptionPasteUrl());
    }

    @Override // com.larksuite.framework.section.ViewModelSection
    public void handleAction(int i, IActionData bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "actionData");
        if (i != 53) {
            if (i != 55) {
                if (i == 56 && (bVar instanceof UrlInsertBean)) {
                    UrlInsertBean agVar = (UrlInsertBean) bVar;
                    ((TodoDetailModel) getModelStore()).insertUrlIntoDescriptionMap(agVar.mo192971a(), agVar.mo192972b());
                }
            } else if (bVar instanceof DocInsertBean) {
                DocInsertBean jVar = (DocInsertBean) bVar;
                ((TodoDetailModel) getModelStore()).insertDocIntoDescriptionMap(jVar.mo193007a(), jVar.mo193008b());
            }
        } else if (bVar instanceof PasteBean) {
            PasteBean sVar = (PasteBean) bVar;
            pasteDocInDescription(sVar.mo193037a(), sVar.mo193038b());
        }
    }

    @Override // com.larksuite.framework.section.ViewModelSection
    public void handleAction(int i, Object obj) {
        if (i == 50) {
            if (!(obj instanceof RichText)) {
                obj = null;
            }
            RichText richText = (RichText) obj;
            if (richText != null) {
                ((TodoDetailModel) getModelStore()).setRichTextDescription(richText);
            }
        } else if (i == 58) {
            if (!(obj instanceof RichText)) {
                obj = null;
            }
            RichText richText2 = (RichText) obj;
            if (richText2 != null) {
                ((TodoDetailModel) getModelStore()).setRichTextDescription(richText2);
                ((TodoDetailModel) getModelStore()).getDescriptionShowRichText().mo5926a(new RichTextShowBean(((TodoDetailModel) getModelStore()).getRichTextDescription(), true, false));
                ((TodoDetailModel) getModelStore()).updateTodo();
            }
        }
    }

    private final void getUrlDocFromContent(String str, C1177w<DocPasteBean> wVar, C1177w<UrlPasteBean> wVar2) {
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), Dispatchers.m266326d(), null, new C56770a(this, str, wVar2, wVar, null), 2, null);
    }

    static /* synthetic */ void updateDescription$default(DescriptionViewModel hVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        hVar.updateDescription(z);
    }
}
