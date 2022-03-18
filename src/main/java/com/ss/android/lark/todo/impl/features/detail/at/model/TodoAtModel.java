package com.ss.android.lark.todo.impl.features.detail.at.model;

import android.text.TextUtils;
import com.bytedance.ee.bear.document.tips.BottomDialog;
import com.bytedance.lark.pb.basic.v1.Chatter;
import com.bytedance.lark.pb.todo.v1.GetRecommendedContentsResponse;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.todo.dependency.TodoDependencyHolder;
import com.ss.android.lark.todo.dependency.entity.SearchChatterResult;
import com.ss.android.lark.todo.dependency.entity.SearchInfo;
import com.ss.android.lark.todo.dependency.idependency.ILoginDependency;
import com.ss.android.lark.todo.dependency.idependency.ISearchModuleDependency;
import com.ss.android.lark.todo.impl.features.detail.assignee.service.TodoAssigneeService;
import com.ss.android.lark.todo.impl.features.detail.assignee.service.data.MentionData;
import com.ss.android.lark.todo.impl.features.detail.assignee.service.data.RecommendData;
import com.ss.android.lark.todo.impl.features.detail.at.view.adapter.AtBean;
import com.ss.android.lark.todo.impl.features.detail.at.view.adapter.AtDataBean;
import com.ss.android.lark.todo.impl.utils.LogMessageUtil;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 12\u00020\u0001:\u00011B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ0\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001e2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020!\u0018\u00010 H\u0002J\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0005H\u0016J\u0018\u0010%\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\b\u0010&\u001a\u00020#H\u0002J\u0010\u0010'\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0005H\u0002J\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)2\u0006\u0010+\u001a\u00020,H\u0002J\u0016\u0010-\u001a\b\u0012\u0004\u0012\u00020*0)2\u0006\u0010+\u001a\u00020.H\u0002J\u0018\u0010/\u001a\b\u0012\u0004\u0012\u00020*0)2\b\u0010+\u001a\u0004\u0018\u000100H\u0002R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\r\u001a\u00020\u000e8BX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u00062"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/at/model/TodoAtModel;", "Lcom/ss/android/lark/todo/impl/features/detail/at/model/ITodoAtModel;", "viewModel", "Lcom/ss/android/lark/todo/impl/features/detail/at/model/TodoAtViewModel;", "chatId", "", "largeMargin", "", "(Lcom/ss/android/lark/todo/impl/features/detail/at/model/TodoAtViewModel;Ljava/lang/String;Z)V", "getChatId", "()Ljava/lang/String;", "getLargeMargin", "()Z", "loginDependency", "Lcom/ss/android/lark/todo/dependency/idependency/ILoginDependency;", "getLoginDependency", "()Lcom/ss/android/lark/todo/dependency/idependency/ILoginDependency;", "loginDependency$delegate", "Lkotlin/Lazy;", "mSearchDependency", "Lcom/ss/android/lark/todo/dependency/idependency/ISearchModuleDependency;", "getMSearchDependency", "()Lcom/ss/android/lark/todo/dependency/idependency/ISearchModuleDependency;", "mSearchDependency$delegate", "getViewModel", "()Lcom/ss/android/lark/todo/impl/features/detail/at/model/TodoAtViewModel;", "buildViewBean", "Lcom/ss/android/lark/todo/impl/features/detail/at/view/adapter/AtDataBean;", BottomDialog.f17198f, ShareHitPoint.f121868c, "", "map", "", "Lcom/bytedance/lark/pb/basic/v1/Chatter;", "fetchRecommendList", "", "key", "getTodoMentionList", "getTodoRecommendList", "getTodoSearchList", "processMentionList", "", "Lcom/ss/android/lark/todo/impl/features/detail/at/view/adapter/AtBean;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/todo/impl/features/detail/assignee/service/data/MentionData;", "processRecommendList", "Lcom/ss/android/lark/todo/impl/features/detail/assignee/service/data/RecommendData;", "processSearchList", "Lcom/ss/android/lark/todo/dependency/entity/SearchChatterResult;", "Companion", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.at.a.a */
public final class TodoAtModel {

    /* renamed from: a */
    public static final Companion f139633a = new Companion(null);

    /* renamed from: b */
    private final Lazy f139634b = LazyKt.lazy(C56460e.INSTANCE);

    /* renamed from: c */
    private final Lazy f139635c = LazyKt.lazy(C56461f.INSTANCE);

    /* renamed from: d */
    private final TodoAtViewModel f139636d;

    /* renamed from: e */
    private final String f139637e;

    /* renamed from: f */
    private final boolean f139638f;

    /* renamed from: b */
    private final ILoginDependency m220042b() {
        return (ILoginDependency) this.f139634b.getValue();
    }

    /* renamed from: c */
    private final ISearchModuleDependency m220044c() {
        return (ISearchModuleDependency) this.f139635c.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/at/model/TodoAtModel$Companion;", "", "()V", "RECOMMEND_COUNT", "", "SEARCH_COUNT", "TAG", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.at.a.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final TodoAtViewModel mo192246a() {
        return this.f139636d;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/todo/dependency/idependency/ILoginDependency;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.at.a.a$e */
    static final class C56460e extends Lambda implements Function0<ILoginDependency> {
        public static final C56460e INSTANCE = new C56460e();

        C56460e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ILoginDependency invoke() {
            return TodoDependencyHolder.f139242a.mo191730a().loginDependency();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/todo/dependency/idependency/ISearchModuleDependency;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.at.a.a$f */
    static final class C56461f extends Lambda implements Function0<ISearchModuleDependency> {
        public static final C56461f INSTANCE = new C56461f();

        C56461f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ISearchModuleDependency invoke() {
            return TodoDependencyHolder.f139242a.mo191730a().searchDependency();
        }
    }

    /* renamed from: d */
    private final void m220045d() {
        String valueOf = String.valueOf(new Date().getTime());
        Log.m165389i("TodoAtModel", LogMessageUtil.f139260a.mo191770b(valueOf, "getDataFromRecommend", new String[0]));
        TodoAssigneeService.f139598a.mo192213a(50, new C56458c(this, valueOf, "getDataFromRecommend"));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/todo/impl/features/detail/at/model/TodoAtModel$getTodoMentionList$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/todo/impl/features/detail/assignee/service/data/MentionData;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.at.a.a$b */
    public static final class C56457b implements IGetDataCallback<MentionData> {

        /* renamed from: a */
        final /* synthetic */ TodoAtModel f139639a;

        /* renamed from: b */
        final /* synthetic */ String f139640b;

        /* renamed from: c */
        final /* synthetic */ String f139641c;

        /* renamed from: a */
        public void onSuccess(MentionData aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            this.f139639a.mo192246a().getTodoAtList().mo5926a(this.f139639a.mo192248a(aVar));
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("TodoAtModel", LogMessageUtil.f139260a.mo191766a(this.f139640b, this.f139641c, errorResult));
        }

        C56457b(TodoAtModel aVar, String str, String str2) {
            this.f139639a = aVar;
            this.f139640b = str;
            this.f139641c = str2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/todo/impl/features/detail/at/model/TodoAtModel$getTodoRecommendList$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/todo/impl/features/detail/assignee/service/data/RecommendData;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.at.a.a$c */
    public static final class C56458c implements IGetDataCallback<RecommendData> {

        /* renamed from: a */
        final /* synthetic */ TodoAtModel f139642a;

        /* renamed from: b */
        final /* synthetic */ String f139643b;

        /* renamed from: c */
        final /* synthetic */ String f139644c;

        /* renamed from: a */
        public void onSuccess(RecommendData bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            this.f139642a.mo192246a().getTodoAtList().mo5926a(this.f139642a.mo192249a(bVar));
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("TodoAtModel", LogMessageUtil.f139260a.mo191766a(this.f139643b, this.f139644c, errorResult));
        }

        C56458c(TodoAtModel aVar, String str, String str2) {
            this.f139642a = aVar;
            this.f139643b = str;
            this.f139644c = str2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/todo/impl/features/detail/at/model/TodoAtModel$getTodoSearchList$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/todo/dependency/entity/SearchChatterResult;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.at.a.a$d */
    public static final class C56459d implements IGetDataCallback<SearchChatterResult> {

        /* renamed from: a */
        final /* synthetic */ TodoAtModel f139645a;

        /* renamed from: b */
        final /* synthetic */ String f139646b;

        /* renamed from: c */
        final /* synthetic */ String f139647c;

        /* renamed from: a */
        public void onSuccess(SearchChatterResult aVar) {
            this.f139645a.mo192246a().getTodoAtList().mo5926a(this.f139645a.mo192247a(aVar));
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("TodoAtModel", LogMessageUtil.f139260a.mo191766a(this.f139646b, this.f139647c, errorResult));
        }

        C56459d(TodoAtModel aVar, String str, String str2) {
            this.f139645a = aVar;
            this.f139646b = str;
            this.f139647c = str2;
        }
    }

    /* renamed from: b */
    private final void m220043b(String str) {
        String valueOf = String.valueOf(new Date().getTime());
        Log.m165389i("TodoAtModel", LogMessageUtil.f139260a.mo191770b(valueOf, "getDataFromSearch", new String[0]));
        m220044c().mo145425a(str, 50, new C56459d(this, valueOf, "getDataFromSearch"));
    }

    /* renamed from: a */
    public final List<AtBean> mo192247a(SearchChatterResult aVar) {
        List<SearchInfo> a;
        ArrayList arrayList = new ArrayList();
        if (!(aVar == null || (a = aVar.mo191748a()) == null)) {
            for (T t : a) {
                arrayList.add(new AtDataBean(t.mo191754c(), t.mo191752a(), t.mo191753b(), t.mo191755d(), 3, t.mo191756e()));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final List<AtBean> mo192248a(MentionData aVar) {
        ArrayList arrayList = new ArrayList();
        List<String> a = aVar.mo192218a();
        if (a != null) {
            Iterator<T> it = a.iterator();
            while (it.hasNext()) {
                AtDataBean a2 = m220040a(it.next(), 0, aVar.mo192221d());
                if (a2 != null) {
                    arrayList.add(a2);
                }
            }
        }
        List<String> b = aVar.mo192219b();
        if (b != null) {
            Iterator<T> it2 = b.iterator();
            while (it2.hasNext()) {
                AtDataBean a3 = m220040a(it2.next(), 1, aVar.mo192221d());
                if (a3 != null) {
                    arrayList.add(a3);
                }
            }
        }
        List<String> c = aVar.mo192220c();
        if (c != null) {
            Iterator<T> it3 = c.iterator();
            while (it3.hasNext()) {
                AtDataBean a4 = m220040a(it3.next(), 2, aVar.mo192221d());
                if (a4 != null) {
                    arrayList.add(a4);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final List<AtBean> mo192249a(RecommendData bVar) {
        ArrayList arrayList = new ArrayList();
        List<GetRecommendedContentsResponse.RecommendContent> a = bVar.mo192225a();
        if (a != null) {
            ArrayList<GetRecommendedContentsResponse.RecommendContent> arrayList2 = new ArrayList();
            Iterator<T> it = a.iterator();
            while (true) {
                boolean z = false;
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (next.content_type == GetRecommendedContentsResponse.RecommendContent.Type.CHATTER) {
                    z = true;
                }
                if (z) {
                    arrayList2.add(next);
                }
            }
            for (GetRecommendedContentsResponse.RecommendContent recommendContent : arrayList2) {
                String str = recommendContent.id;
                Intrinsics.checkExpressionValueIsNotNull(str, "it.id");
                AtDataBean a2 = m220040a(str, 0, bVar.mo192226b());
                if (a2 != null) {
                    String str2 = recommendContent.department;
                    Intrinsics.checkExpressionValueIsNotNull(str2, "it.department");
                    a2.mo192275a(str2);
                    arrayList.add(a2);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo192250a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        if (!TextUtils.isEmpty(str)) {
            m220043b(str);
            return;
        }
        String str2 = this.f139637e;
        if (str2 == null || Intrinsics.areEqual(str2, "")) {
            m220045d();
        } else {
            m220041a(str, str2);
        }
    }

    /* renamed from: a */
    private final void m220041a(String str, String str2) {
        String valueOf = String.valueOf(new Date().getTime());
        Log.m165389i("TodoAtModel", LogMessageUtil.f139260a.mo191770b(valueOf, "getDataFromMention", new String[0]));
        TodoAssigneeService.f139598a.mo192215a(str2, str, new C56457b(this, valueOf, "getDataFromMention"));
    }

    public TodoAtModel(TodoAtViewModel bVar, String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(bVar, "viewModel");
        this.f139636d = bVar;
        this.f139637e = str;
        this.f139638f = z;
    }

    /* renamed from: a */
    private final AtDataBean m220040a(String str, int i, Map<String, Chatter> map) {
        Chatter chatter;
        if (map == null || (chatter = map.get(str)) == null || chatter.type == Chatter.Type.BOT || !(!Intrinsics.areEqual((Object) chatter.is_anonymous, (Object) true))) {
            return null;
        }
        String str2 = chatter.localized_name;
        Intrinsics.checkExpressionValueIsNotNull(str2, "it.localized_name");
        String str3 = chatter.avatar_key;
        Intrinsics.checkExpressionValueIsNotNull(str3, "it.avatar_key");
        return new AtDataBean(str, str2, "", str3, i, !Intrinsics.areEqual(chatter.tenant_id, m220042b().mo145412b()));
    }
}
