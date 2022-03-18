package com.bytedance.ee.bear.middleground.permission.collaborator.search.searchresult;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.contract.net.AbstractC5204e;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.middleground.permission.PermissionAnalytic;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.InviteMemberParams;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.existmember.ExistMemberResult;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.existmember.ExistMemberUtils;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.existmember.Member;
import com.bytedance.ee.bear.middleground.permission.collaborator.search.C9889h;
import com.bytedance.ee.bear.middleground.permission.collaborator.search.SearchUserResult;
import com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.ISelectedUserModel;
import com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.SelectedUserChangeListener;
import com.bytedance.ee.bear.middleground.permission.collaborator.search.searchresult.ISearchUserResultContract;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.regex.RegexUtils;
import com.huawei.hms.actions.SearchIntents;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;
import org.p3511d.AbstractC70020b;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 52\u00020\u0001:\u00015B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0017H\u0002J\b\u0010\u001b\u001a\u00020\u0017H\u0002J\b\u0010\u001c\u001a\u00020\u0017H\u0016J\b\u0010\u001d\u001a\u00020\u0017H\u0016J\u0016\u0010\u001e\u001a\u00020\u00172\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 H\u0002J\u0016\u0010\"\u001a\u00020\u00172\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 H\u0002J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020!0$2\u0006\u0010%\u001a\u00020!H\u0002J\u000e\u0010&\u001a\b\u0012\u0004\u0012\u00020!0'H\u0002J\u0018\u0010(\u001a\u0012\u0012\u0004\u0012\u00020\u00190)j\b\u0012\u0004\u0012\u00020\u0019`*H\u0016J\u000e\u0010+\u001a\b\u0012\u0004\u0012\u00020!0$H\u0002J\u0016\u0010,\u001a\u00020\u00172\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 H\u0016J\u0010\u0010-\u001a\u00020\u00172\u0006\u0010.\u001a\u00020/H\u0016J\u0010\u00100\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J \u00101\u001a\u00020\u00172\u0016\u00102\u001a\u0012\u0012\u0004\u0012\u00020\u00190)j\b\u0012\u0004\u0012\u00020\u0019`*H\u0002J\u001e\u00103\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 H\u0016J\u0010\u00104\u001a\u00020\u00172\u0006\u0010.\u001a\u00020/H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/searchresult/SearchUserResultModel;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/searchresult/ISearchUserResultContract$IModel;", "context", "Landroid/content/Context;", "serviceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "selectedUserModel", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/newsearch/ISelectedUserModel;", "params", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/InviteMemberParams;", "(Landroid/content/Context;Lcom/bytedance/ee/bear/service/ServiceContext;Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/newsearch/ISelectedUserModel;Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/InviteMemberParams;)V", "countryDisposable", "Lio/reactivex/disposables/Disposable;", "depType", "", "disposable", "isConsumer", "", "keyword", "", "loginCpType", "start", "addSelectedUser", "", "userInfo", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "cancelInitCountryCode", "cancelRequest", "create", "destroy", "doSearch", "callback", "Lcom/bytedance/ee/bear/contract/net/SimpleRequestCallback;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/SearchUserResult;", "doSearchByWord", "getExistMember", "Lio/reactivex/Flowable;", "userResult", "getSearchUserPuller", "Lcom/bytedance/ee/bear/contract/NetService$Puller;", "getSelectedUsers", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getWordFlow", "loadMore", "registerChangeListener", "listener", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/newsearch/SelectedUserChangeListener;", "removeSelectedUser", "reportSearchCollaborate", "userInfos", "searchUsers", "unregisterChangeListener", "Companion", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.a.c */
public final class SearchUserResultModel implements ISearchUserResultContract.IModel {

    /* renamed from: c */
    public static final Companion f26569c = new Companion(null);

    /* renamed from: a */
    public String f26570a = "";

    /* renamed from: b */
    public int f26571b;

    /* renamed from: d */
    private Disposable f26572d;

    /* renamed from: e */
    private Disposable f26573e;

    /* renamed from: f */
    private int f26574f;

    /* renamed from: g */
    private int f26575g = 1;

    /* renamed from: h */
    private boolean f26576h;

    /* renamed from: i */
    private final Context f26577i;

    /* renamed from: j */
    private final C10917c f26578j;

    /* renamed from: k */
    private final ISelectedUserModel f26579k;

    /* renamed from: l */
    private final InviteMemberParams f26580l;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/searchresult/SearchUserResultModel$Companion;", "", "()V", "COUNT", "", "DEP_TYPE_DISABLE", "DEP_TYPE_ENABLE", "LOGIN_CP_TYPE_DISABLE", "LOGIN_CP_TYPE_ENABLE", "TAG", "", "USER_TYPE_B", "USER_TYPE_SMALL_B", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.a.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.searchresult.ISearchUserResultContract.IModel
    /* renamed from: a */
    public ArrayList<UserInfo> mo37448a() {
        return this.f26579k.getSelected();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        C13479a.m54764b("SearchUserResultModel", "destroy()...");
        m40831b();
        m40836e();
    }

    /* renamed from: b */
    private final void m40831b() {
        Disposable disposable;
        C13479a.m54764b("SearchUserResultModel", "cancelRequest()...");
        Disposable disposable2 = this.f26572d;
        if (disposable2 != null && !disposable2.isDisposed() && (disposable = this.f26572d) != null) {
            disposable.dispose();
        }
    }

    /* renamed from: d */
    private final NetService.AbstractC5075d<SearchUserResult> m40835d() {
        NetService.AbstractC5075d<SearchUserResult> a = ((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null)).mo20117a(new C9889h(this.f26577i));
        Intrinsics.checkExpressionValueIsNotNull(a, "KoinJavaComponent.get(Ne…serResultParser(context))");
        return a;
    }

    /* renamed from: e */
    private final void m40836e() {
        Boolean bool;
        Disposable disposable;
        StringBuilder sb = new StringBuilder();
        sb.append("cancelInitCountryCode()... isDisposed = ");
        Disposable disposable2 = this.f26573e;
        if (disposable2 != null) {
            bool = Boolean.valueOf(disposable2.isDisposed());
        } else {
            bool = null;
        }
        sb.append(bool);
        C13479a.m54764b("SearchUserResultModel", sb.toString());
        Disposable disposable3 = this.f26573e;
        if (disposable3 != null && !disposable3.isDisposed() && (disposable = this.f26573e) != null) {
            disposable.dispose();
        }
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f26574f = this.f26580l.mo36841f() ? 1 : 0;
        boolean z = false;
        this.f26575g = 0;
        AccountService.Account f = ((an) KoinJavaComponent.m268613a(an.class, null, null, 6, null)).mo16408f();
        if (f != null) {
            z = f.mo19681c();
        }
        this.f26576h = z;
        C13479a.m54764b("SearchUserResultModel", "isConsumer = " + this.f26576h);
    }

    /* renamed from: c */
    private final AbstractC68307f<SearchUserResult> m40833c() {
        boolean z;
        NetService.C5077f fVar = new NetService.C5077f("/api/search/permission_candidates/");
        fVar.mo20145a(SearchIntents.EXTRA_QUERY, this.f26570a);
        fVar.mo20145a("offset", String.valueOf(this.f26571b));
        fVar.mo20145a("count", String.valueOf(10));
        if (!TextUtils.isEmpty(this.f26580l.mo36834a())) {
            fVar.mo20145a("token", this.f26580l.mo36834a());
            fVar.mo20145a(ShareHitPoint.f121869d, String.valueOf(this.f26580l.mo36835b()));
        }
        fVar.mo20145a("department_type", String.valueOf(this.f26574f));
        fVar.mo20145a("logincp_type", String.valueOf(this.f26575g));
        int i = 1;
        if (this.f26570a.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z || !this.f26576h) {
            i = 0;
        }
        fVar.mo20145a("user_type", String.valueOf(i));
        AbstractC68307f<SearchUserResult> f = m40835d().mo20141a(fVar).mo238029f(C9858g.f26587a);
        Intrinsics.checkExpressionValueIsNotNull(f, "getSearchUserPuller().pu…esult()\n                }");
        return f;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lio/reactivex/Flowable;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/SearchUserResult;", "userResult", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.a.c$b */
    public static final class C9853b<T, R> implements Function<T, AbstractC70020b<? extends R>> {

        /* renamed from: a */
        final /* synthetic */ SearchUserResultModel f26581a;

        C9853b(SearchUserResultModel cVar) {
            this.f26581a = cVar;
        }

        /* renamed from: a */
        public final AbstractC68307f<SearchUserResult> apply(SearchUserResult searchUserResult) {
            Intrinsics.checkParameterIsNotNull(searchUserResult, "userResult");
            return this.f26581a.mo37471a(searchUserResult);
        }
    }

    /* renamed from: b */
    private final void m40832b(AbstractC5204e<SearchUserResult> eVar) {
        C13479a.m54764b("SearchUserResultModel", "doSearch()...");
        m40831b();
        m40834c(eVar);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.searchresult.ISearchUserResultContract.IModel
    /* renamed from: a */
    public void mo37450a(SelectedUserChangeListener cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "listener");
        this.f26579k.registerChangeListener(cVar);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/SearchUserResult;", "it", "", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.a.c$f */
    public static final class C9857f<T, R> implements Function<Throwable, SearchUserResult> {

        /* renamed from: a */
        final /* synthetic */ SearchUserResult f26586a;

        C9857f(SearchUserResult searchUserResult) {
            this.f26586a = searchUserResult;
        }

        /* renamed from: a */
        public final SearchUserResult apply(Throwable th) {
            Intrinsics.checkParameterIsNotNull(th, "it");
            C13479a.m54758a("SearchUserResultModel", "getExistMember error: " + th);
            return this.f26586a;
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.searchresult.ISearchUserResultContract.IModel
    /* renamed from: a */
    public void mo37449a(AbstractC5204e<SearchUserResult> eVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "callback");
        C13479a.m54764b("SearchUserResultModel", "loadMore()...");
        this.f26571b += 10;
        m40832b(eVar);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "result", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/SearchUserResult;", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.a.c$c */
    public static final class C9854c<T> implements Consumer<SearchUserResult> {

        /* renamed from: a */
        final /* synthetic */ SearchUserResultModel f26582a;

        /* renamed from: b */
        final /* synthetic */ AbstractC5204e f26583b;

        C9854c(SearchUserResultModel cVar, AbstractC5204e eVar) {
            this.f26582a = cVar;
            this.f26583b = eVar;
        }

        /* renamed from: a */
        public final void accept(SearchUserResult searchUserResult) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(searchUserResult, "result");
            C13479a.m54764b("SearchUserResultModel", "doSearchByWord()...success");
            if (this.f26582a.f26571b == 0) {
                z = true;
            } else {
                z = false;
            }
            searchUserResult.refresh = z;
            searchUserResult.isRecent = TextUtils.isEmpty(this.f26582a.f26570a);
            this.f26583b.mo20806a(searchUserResult);
            SearchUserResultModel cVar = this.f26582a;
            ArrayList<UserInfo> arrayList = searchUserResult.list;
            Intrinsics.checkExpressionValueIsNotNull(arrayList, "result.list");
            cVar.mo37472a(arrayList);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "throwable", "", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.a.c$d */
    public static final class C9855d<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ AbstractC5204e f26584a;

        C9855d(AbstractC5204e eVar) {
            this.f26584a = eVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            Intrinsics.checkParameterIsNotNull(th, "throwable");
            C13479a.m54758a("SearchUserResultModel", "doSearchByWord()...failed, error = " + th);
            this.f26584a.mo20807a(th);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/SearchUserResult;", "existMemberResult", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/existmember/ExistMemberResult;", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.a.c$e */
    public static final class C9856e<T, R> implements Function<T, R> {

        /* renamed from: a */
        final /* synthetic */ SearchUserResult f26585a;

        C9856e(SearchUserResult searchUserResult) {
            this.f26585a = searchUserResult;
        }

        /* renamed from: a */
        public final SearchUserResult apply(ExistMemberResult existMemberResult) {
            Intrinsics.checkParameterIsNotNull(existMemberResult, "existMemberResult");
            this.f26585a.existMembers = existMemberResult.getExistMembers();
            C13479a.m54764b("SearchUserResultModel", "getExistMember(): " + existMemberResult.getExistMembers());
            return this.f26585a;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/SearchUserResult;", "throwable", "", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.a.c$g */
    public static final class C9858g<T, R> implements Function<Throwable, SearchUserResult> {

        /* renamed from: a */
        public static final C9858g f26587a = new C9858g();

        C9858g() {
        }

        /* renamed from: a */
        public final SearchUserResult apply(Throwable th) {
            Intrinsics.checkParameterIsNotNull(th, "throwable");
            C13479a.m54758a("SearchUserResultModel", "getWordFlow()...error = " + th);
            return new SearchUserResult();
        }
    }

    /* renamed from: c */
    private final void m40834c(AbstractC5204e<SearchUserResult> eVar) {
        C13479a.m54764b("SearchUserResultModel", "doSearchByWord()....");
        this.f26572d = m40833c().mo238014c(new C9853b(this)).mo238001b(new C9854c(this, eVar), new C9855d(eVar));
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.searchresult.ISearchUserResultContract.IModel
    /* renamed from: a */
    public void mo37451a(UserInfo userInfo) {
        Intrinsics.checkParameterIsNotNull(userInfo, "userInfo");
        this.f26579k.addUser(userInfo);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.searchresult.ISearchUserResultContract.IModel
    /* renamed from: b */
    public void mo37453b(SelectedUserChangeListener cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "listener");
        this.f26579k.unregisterChangeListener(cVar);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.searchresult.ISearchUserResultContract.IModel
    /* renamed from: b */
    public void mo37454b(UserInfo userInfo) {
        Intrinsics.checkParameterIsNotNull(userInfo, "userInfo");
        this.f26579k.removeUser(userInfo);
    }

    /* renamed from: a */
    public final AbstractC68307f<SearchUserResult> mo37471a(SearchUserResult searchUserResult) {
        AbstractC68307f<ExistMemberResult> fVar;
        if (searchUserResult.list.size() == 0 || this.f26580l.mo36845i() || this.f26580l.mo36847k()) {
            AbstractC68307f<SearchUserResult> a = AbstractC68307f.m265083a(searchUserResult);
            Intrinsics.checkExpressionValueIsNotNull(a, "Flowable.just(userResult)");
            return a;
        }
        ArrayList<UserInfo> arrayList = searchUserResult.list;
        ArrayList arrayList2 = new ArrayList();
        Iterator<UserInfo> it = arrayList.iterator();
        while (it.hasNext()) {
            UserInfo next = it.next();
            Intrinsics.checkExpressionValueIsNotNull(next, "userInfo");
            arrayList2.add(new Member(next.getOwnerType(), next.getId()));
        }
        int b = this.f26580l.mo36835b();
        C8275a aVar = C8275a.f22370c;
        Intrinsics.checkExpressionValueIsNotNull(aVar, "DocumentType.FOLDER");
        if (b == aVar.mo32555b()) {
            fVar = ExistMemberUtils.m40196a(this.f26580l.mo36834a(), this.f26580l.mo36845i(), arrayList2);
        } else {
            fVar = ExistMemberUtils.m40195a(this.f26580l.mo36834a(), this.f26580l.mo36835b(), arrayList2);
        }
        AbstractC68307f<SearchUserResult> f = fVar.mo238020d(new C9856e(searchUserResult)).mo238029f(new C9857f(searchUserResult));
        Intrinsics.checkExpressionValueIsNotNull(f, "flowable\n               …rResult\n                }");
        return f;
    }

    /* renamed from: a */
    public final void mo37472a(ArrayList<UserInfo> arrayList) {
        PermissionAnalytic.m39410a(this.f26580l.mo36834a(), Integer.valueOf(this.f26580l.mo36835b()), RegexUtils.f35905a.mo50675a(this.f26570a), arrayList);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.searchresult.ISearchUserResultContract.IModel
    /* renamed from: a */
    public void mo37452a(String str, AbstractC5204e<SearchUserResult> eVar) {
        Intrinsics.checkParameterIsNotNull(str, "keyword");
        Intrinsics.checkParameterIsNotNull(eVar, "callback");
        this.f26571b = 0;
        this.f26570a = str;
        m40832b(eVar);
    }

    public SearchUserResultModel(Context context, C10917c cVar, ISelectedUserModel bVar, InviteMemberParams inviteMemberParams) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(cVar, "serviceContext");
        Intrinsics.checkParameterIsNotNull(bVar, "selectedUserModel");
        Intrinsics.checkParameterIsNotNull(inviteMemberParams, "params");
        this.f26577i = context;
        this.f26578j = cVar;
        this.f26579k = bVar;
        this.f26580l = inviteMemberParams;
    }
}
