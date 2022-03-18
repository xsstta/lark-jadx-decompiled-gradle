package com.ss.android.lark.todo.impl.features.detail.assignee.add.mvvm;

import android.app.Application;
import androidx.lifecycle.C1150b;
import androidx.lifecycle.C1177w;
import com.bytedance.lark.pb.todo.v1.GetRecommendedContentsResponse;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.todo.dependency.TodoDependencyHolder;
import com.ss.android.lark.todo.dependency.idependency.IChatModuleDependency;
import com.ss.android.lark.todo.dependency.idependency.ILoginDependency;
import com.ss.android.lark.todo.impl.features.detail.assignee.add.adapter.RecommendItem;
import com.ss.android.lark.todo.impl.features.detail.assignee.service.TodoAssigneeService;
import com.ss.android.lark.todo.impl.features.detail.assignee.service.data.MentionData;
import com.ss.android.lark.todo.impl.features.detail.assignee.service.data.RecommendData;
import com.ss.android.lark.todo.impl.utils.LogMessageUtil;
import com.ss.android.lark.todo.impl.utils.ResUtil;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 42\u00020\u0001:\u00014B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\tJ\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u001e\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\"2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\bH\u0002J\u0016\u0010$\u001a\u00020\u001d2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\bH\u0002JJ\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00180\b2\u0006\u0010&\u001a\u00020\"2\u000e\u0010'\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010(2\u0014\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020+\u0018\u00010*2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\bH\u0002J$\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00180\b2\u0006\u0010-\u001a\u00020.2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\bH\u0002J$\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00180\b2\u0006\u0010-\u001a\u0002002\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\bH\u0002J&\u00101\u001a\u00020\u001d2\b\u0010!\u001a\u0004\u0018\u00010\"2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\b2\u0006\u00102\u001a\u00020\u0011J\u000e\u00103\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\tR\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0004¢\u0006\u0002\n\u0000R&\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\u000e\u0010\u0014\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\bX\u000e¢\u0006\u0002\n\u0000R&\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\b0\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000f¨\u00065"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/assignee/add/mvvm/TodoAssigneeAddViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "chatDependency", "Lcom/ss/android/lark/todo/dependency/idependency/IChatModuleDependency;", "chosenMemberList", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "chosenMembersLv", "Landroidx/lifecycle/MutableLiveData;", "getChosenMembersLv", "()Landroidx/lifecycle/MutableLiveData;", "setChosenMembersLv", "(Landroidx/lifecycle/MutableLiveData;)V", "finishLv", "", "getFinishLv", "setFinishLv", "isSinglePicker", "loginDependency", "Lcom/ss/android/lark/todo/dependency/idependency/ILoginDependency;", "showDataList", "Lcom/ss/android/lark/todo/impl/features/detail/assignee/add/adapter/RecommendItem;", "showDataLv", "getShowDataLv", "setShowDataLv", "addChatter", "", "chatterInfo", "getChosenMembers", "getDataFromMention", "chatId", "", "selectedIds", "getDataFromRecommend", "getItemListWithTitle", "titleStr", "chatterIds", "", "chatterMap", "", "Lcom/bytedance/lark/pb/basic/v1/Chatter;", "getMentionList", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/todo/impl/features/detail/assignee/service/data/MentionData;", "getRecommendShowData", "Lcom/ss/android/lark/todo/impl/features/detail/assignee/service/data/RecommendData;", "initData", "singlePicker", "removeChatter", "Companion", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.assignee.add.mvvm.a */
public final class TodoAssigneeAddViewModel extends C1150b {
    public static final Companion Companion = new Companion(null);
    private final IChatModuleDependency chatDependency = TodoDependencyHolder.f139242a.mo191730a().chatModuleDependency();
    private final ArrayList<SearchBaseInfo> chosenMemberList;
    private C1177w<ArrayList<SearchBaseInfo>> chosenMembersLv;
    private C1177w<Boolean> finishLv = new C1177w<>(false);
    private boolean isSinglePicker;
    private final ILoginDependency loginDependency = TodoDependencyHolder.f139242a.mo191730a().loginDependency();
    public ArrayList<RecommendItem> showDataList;
    private C1177w<ArrayList<RecommendItem>> showDataLv;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/assignee/add/mvvm/TodoAssigneeAddViewModel$Companion;", "", "()V", "RECOMMEND_COUNT", "", "TAG", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.assignee.add.mvvm.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final C1177w<ArrayList<SearchBaseInfo>> getChosenMembersLv() {
        return this.chosenMembersLv;
    }

    public final C1177w<Boolean> getFinishLv() {
        return this.finishLv;
    }

    public final C1177w<ArrayList<RecommendItem>> getShowDataLv() {
        return this.showDataLv;
    }

    public final ArrayList<SearchBaseInfo> getChosenMembers() {
        ArrayList<SearchBaseInfo> b = this.chosenMembersLv.mo5927b();
        if (b == null) {
            b = new ArrayList<>();
        }
        Intrinsics.checkExpressionValueIsNotNull(b, "chosenMembersLv.value ?: ArrayList()");
        return b;
    }

    public final void setChosenMembersLv(C1177w<ArrayList<SearchBaseInfo>> wVar) {
        Intrinsics.checkParameterIsNotNull(wVar, "<set-?>");
        this.chosenMembersLv = wVar;
    }

    public final void setFinishLv(C1177w<Boolean> wVar) {
        Intrinsics.checkParameterIsNotNull(wVar, "<set-?>");
        this.finishLv = wVar;
    }

    public final void setShowDataLv(C1177w<ArrayList<RecommendItem>> wVar) {
        Intrinsics.checkParameterIsNotNull(wVar, "<set-?>");
        this.showDataLv = wVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/todo/impl/features/detail/assignee/add/mvvm/TodoAssigneeAddViewModel$getDataFromMention$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/todo/impl/features/detail/assignee/service/data/MentionData;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.assignee.add.mvvm.a$b */
    public static final class C56446b implements IGetDataCallback<MentionData> {

        /* renamed from: a */
        final /* synthetic */ TodoAssigneeAddViewModel f139590a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f139591b;

        /* renamed from: c */
        final /* synthetic */ String f139592c;

        /* renamed from: d */
        final /* synthetic */ String f139593d;

        /* renamed from: a */
        public void onSuccess(MentionData aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            TodoAssigneeAddViewModel aVar2 = this.f139590a;
            aVar2.showDataList = aVar2.getMentionList(aVar, this.f139591b);
            this.f139590a.getShowDataLv().mo5929b(this.f139590a.showDataList);
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("TodoAssigneeAddViewModel", LogMessageUtil.f139260a.mo191766a(this.f139592c, this.f139593d, errorResult));
        }

        C56446b(TodoAssigneeAddViewModel aVar, ArrayList arrayList, String str, String str2) {
            this.f139590a = aVar;
            this.f139591b = arrayList;
            this.f139592c = str;
            this.f139593d = str2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/todo/impl/features/detail/assignee/add/mvvm/TodoAssigneeAddViewModel$getDataFromRecommend$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/todo/impl/features/detail/assignee/service/data/RecommendData;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.assignee.add.mvvm.a$c */
    public static final class C56447c implements IGetDataCallback<RecommendData> {

        /* renamed from: a */
        final /* synthetic */ TodoAssigneeAddViewModel f139594a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f139595b;

        /* renamed from: c */
        final /* synthetic */ String f139596c;

        /* renamed from: d */
        final /* synthetic */ String f139597d;

        /* renamed from: a */
        public void onSuccess(RecommendData bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            TodoAssigneeAddViewModel aVar = this.f139594a;
            aVar.showDataList = aVar.getRecommendShowData(bVar, this.f139595b);
            this.f139594a.getShowDataLv().mo5929b(this.f139594a.showDataList);
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("TodoAssigneeAddViewModel", LogMessageUtil.f139260a.mo191766a(this.f139596c, this.f139597d, errorResult));
        }

        C56447c(TodoAssigneeAddViewModel aVar, ArrayList arrayList, String str, String str2) {
            this.f139594a = aVar;
            this.f139595b = arrayList;
            this.f139596c = str;
            this.f139597d = str2;
        }
    }

    private final void getDataFromRecommend(ArrayList<String> arrayList) {
        String valueOf = String.valueOf(new Date().getTime());
        Log.m165389i("TodoAssigneeAddViewModel", LogMessageUtil.f139260a.mo191770b(valueOf, "getDataFromRecommend", new String[0]));
        C56447c cVar = new C56447c(this, arrayList, valueOf, "getDataFromRecommend");
        TodoAssigneeService.Companion aVar = TodoAssigneeService.f139598a;
        UIGetDataCallback wrapAndAddGetDataCallback = new CallbackManager().wrapAndAddGetDataCallback(cVar);
        Intrinsics.checkExpressionValueIsNotNull(wrapAndAddGetDataCallback, "CallbackManager().wrapAn…GetDataCallback(callback)");
        aVar.mo192213a(50, wrapAndAddGetDataCallback);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TodoAssigneeAddViewModel(Application application) {
        super(application);
        Intrinsics.checkParameterIsNotNull(application, "application");
        ArrayList<RecommendItem> arrayList = new ArrayList<>();
        this.showDataList = arrayList;
        this.showDataLv = new C1177w<>(arrayList);
        ArrayList<SearchBaseInfo> arrayList2 = new ArrayList<>();
        this.chosenMemberList = arrayList2;
        this.chosenMembersLv = new C1177w<>(arrayList2);
    }

    public final void addChatter(SearchBaseInfo searchBaseInfo) {
        String str;
        Chatter a;
        Intrinsics.checkParameterIsNotNull(searchBaseInfo, "chatterInfo");
        if (!this.chosenMemberList.contains(searchBaseInfo)) {
            this.chosenMemberList.add(searchBaseInfo);
            this.chosenMembersLv.mo5929b(this.chosenMemberList);
        }
        if (this.isSinglePicker) {
            this.finishLv.mo5926a((Boolean) true);
            return;
        }
        for (T t : this.showDataList) {
            RecommendItem.ChatterItem d = t.mo192168d();
            if (d == null || (a = d.mo192172a()) == null) {
                str = null;
            } else {
                str = a.getId();
            }
            if (Intrinsics.areEqual(str, searchBaseInfo.getId())) {
                t.mo192165a(true);
            }
        }
        this.showDataLv.mo5929b(this.showDataList);
    }

    public final void removeChatter(SearchBaseInfo searchBaseInfo) {
        String str;
        Chatter a;
        Intrinsics.checkParameterIsNotNull(searchBaseInfo, "chatterInfo");
        if (this.chosenMemberList.contains(searchBaseInfo)) {
            this.chosenMemberList.remove(searchBaseInfo);
            this.chosenMembersLv.mo5929b(this.chosenMemberList);
        }
        for (T t : this.showDataList) {
            RecommendItem.ChatterItem d = t.mo192168d();
            if (d == null || (a = d.mo192172a()) == null) {
                str = null;
            } else {
                str = a.getId();
            }
            if (Intrinsics.areEqual(str, searchBaseInfo.getId())) {
                t.mo192165a(false);
            }
        }
        this.showDataLv.mo5929b(this.showDataList);
    }

    private final void getDataFromMention(String str, ArrayList<String> arrayList) {
        String valueOf = String.valueOf(new Date().getTime());
        Log.m165389i("TodoAssigneeAddViewModel", LogMessageUtil.f139260a.mo191770b(valueOf, "getDataFromMention", new String[0]));
        C56446b bVar = new C56446b(this, arrayList, valueOf, "getDataFromMention");
        TodoAssigneeService.Companion aVar = TodoAssigneeService.f139598a;
        UIGetDataCallback wrapAndAddGetDataCallback = new CallbackManager().wrapAndAddGetDataCallback(bVar);
        Intrinsics.checkExpressionValueIsNotNull(wrapAndAddGetDataCallback, "CallbackManager().wrapAn…GetDataCallback(callback)");
        aVar.mo192214a(str, wrapAndAddGetDataCallback);
    }

    public final ArrayList<RecommendItem> getMentionList(MentionData aVar, ArrayList<String> arrayList) {
        ArrayList<RecommendItem> arrayList2 = new ArrayList<>();
        arrayList2.addAll(getItemListWithTitle(ResUtil.f139261a.mo191781c(R.string.Todo_Task_Mention), aVar.mo192218a(), aVar.mo192221d(), arrayList));
        arrayList2.addAll(getItemListWithTitle(ResUtil.f139261a.mo191781c(R.string.Todo_Task_ChatMembers), aVar.mo192219b(), aVar.mo192221d(), arrayList));
        return arrayList2;
    }

    public final ArrayList<RecommendItem> getRecommendShowData(RecommendData bVar, ArrayList<String> arrayList) {
        boolean z;
        com.bytedance.lark.pb.basic.v1.Chatter chatter;
        Map<String, com.bytedance.lark.pb.basic.v1.Chatter> b = bVar.mo192226b();
        ArrayList<RecommendItem> arrayList2 = new ArrayList<>();
        List<GetRecommendedContentsResponse.RecommendContent> a = bVar.mo192225a();
        if (a != null) {
            for (T t : a) {
                if (t.content_type == GetRecommendedContentsResponse.RecommendContent.Type.CHATTER) {
                    if (b == null || b.isEmpty()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z && b.containsKey(t.id)) {
                        if (!arrayList.contains(t.id) && (chatter = b.get(t.id)) != null) {
                            Chatter a2 = this.chatDependency.mo145369a(chatter);
                            if (a2 != null && !a2.isBot() && !a2.isAnonymous()) {
                                RecommendItem.ShowType showType = RecommendItem.ShowType.CHATTER;
                                String str = t.department;
                                Intrinsics.checkExpressionValueIsNotNull(str, "content.department");
                                arrayList2.add(new RecommendItem(showType, false, null, new RecommendItem.ChatterItem(a2, str), 6, null));
                            }
                        }
                    }
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            arrayList2.add(0, new RecommendItem(RecommendItem.ShowType.TITLE, false, ResUtil.f139261a.mo191781c(R.string.Todo_Task_Mention), null, 10, null));
        }
        return arrayList2;
    }

    public final void initData(String str, ArrayList<String> arrayList, boolean z) {
        boolean z2;
        Intrinsics.checkParameterIsNotNull(arrayList, "selectedIds");
        this.isSinglePicker = z;
        String str2 = str;
        if (str2 == null || str2.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            getDataFromRecommend(arrayList);
        } else {
            getDataFromMention(str, arrayList);
        }
    }

    private final ArrayList<RecommendItem> getItemListWithTitle(String str, List<String> list, Map<String, com.bytedance.lark.pb.basic.v1.Chatter> map, ArrayList<String> arrayList) {
        boolean z;
        com.bytedance.lark.pb.basic.v1.Chatter chatter;
        ArrayList<RecommendItem> arrayList2 = new ArrayList<>();
        if (list != null) {
            for (T t : list) {
                if (map == null || map.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z && map.containsKey(t)) {
                    if (!arrayList.contains(t) && (chatter = map.get(t)) != null) {
                        Chatter a = this.chatDependency.mo145369a(chatter);
                        if (a != null && !a.isBot() && !a.isAnonymous()) {
                            arrayList2.add(new RecommendItem(RecommendItem.ShowType.CHATTER, false, null, new RecommendItem.ChatterItem(a, null, 2, null), 6, null));
                        }
                    }
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            arrayList2.add(0, new RecommendItem(RecommendItem.ShowType.TITLE, false, str, null, 10, null));
        }
        return arrayList2;
    }
}
