package com.ss.android.lark.mm.module.share.repo;

import android.os.SystemClock;
import com.google.firebase.messaging.Constants;
import com.google.gson.Gson;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.mm.depend.C45899c;
import com.ss.android.lark.mm.depend.IMmDepend;
import com.ss.android.lark.mm.module.share.model.InviteUser;
import com.ss.android.lark.mm.module.share.model.LinkShare;
import com.ss.android.lark.mm.module.share.model.SearchResponse;
import com.ss.android.lark.mm.module.share.model.ShareModel;
import com.ss.android.lark.mm.module.share.model.SharePermission;
import com.ss.android.lark.mm.module.share.model.ShareStatus;
import com.ss.android.lark.mm.module.share.model.ShareType;
import com.ss.android.lark.mm.module.share.model.User;
import com.ss.android.lark.mm.net.p2332a.C47057a;
import com.ss.android.lark.mm.net.p2333b.AbstractC47070c;
import com.ss.android.lark.mm.net.p2333b.C47068a;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.statistics.hitpoint.C47084f;
import com.ss.android.lark.mm.statistics.hitpoint.MmHitPointContextProvider;
import com.ss.android.lark.mm.utils.UrlUtil;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.AbstractC68322n;
import io.reactivex.functions.Consumer;
import io.reactivex.p3457e.C68296b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 F2\u00020\u0001:\u0002FGB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u001d\u001a\u00020\u001eJ\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\f0 2\u0006\u0010!\u001a\u00020\u0014J!\u0010\"\u001a\u00020\u001e2\b\u0010#\u001a\u0004\u0018\u00010\u00032\b\u0010$\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0002\u0010%J\u0006\u0010&\u001a\u00020\u001eJ\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\f0 J\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010 J\b\u0010)\u001a\u00020\u001eH\u0003J\b\u0010*\u001a\u0004\u0018\u00010+J\n\u0010,\u001a\u0004\u0018\u00010\u0005H\u0016J\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010 J\u0006\u0010.\u001a\u00020\u0014J\u0014\u0010/\u001a\u00020\u001e2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u001e01J\u0018\u00102\u001a\u00020\u001e2\u0010\b\u0002\u00100\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u000101J\u001c\u00103\u001a\u00020\u001e2\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u00105\u001a\u00020\u0014J\u000e\u00106\u001a\u00020\u00142\u0006\u00107\u001a\u00020\fJ\u001e\u00108\u001a\u00020\u001e2\u0006\u00109\u001a\u00020\u00142\u0006\u0010:\u001a\u00020\u00142\u0006\u0010;\u001a\u00020\u0014J\u001c\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020\u000f2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u001e01J\u0014\u0010@\u001a\u00020\u001e2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020\f0 J!\u0010B\u001a\u00020\u001e2\b\u0010#\u001a\u0004\u0018\u00010\u00032\b\u0010$\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0002\u0010%J\u0016\u0010C\u001a\u00020\u001e2\u0006\u00107\u001a\u00020\f2\u0006\u0010D\u001a\u00020ER\u000e\u0010\u0007\u001a\u00020\bXD¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0003XD¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0010\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u000f0\u000f0\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006H"}, d2 = {"Lcom/ss/android/lark/mm/module/share/repo/ShareRepo;", "Lcom/ss/android/lark/mm/statistics/hitpoint/MmHitPointContextProvider;", "url", "", "trackContext", "Lcom/ss/android/lark/mm/statistics/hitpoint/MmHitPointContext;", "(Ljava/lang/String;Lcom/ss/android/lark/mm/statistics/hitpoint/MmHitPointContext;)V", "MAX_CANDIDATE_COUNT", "", "TAG", "candidateUsers", "", "Lcom/ss/android/lark/mm/module/share/model/User;", "dataSubject", "Lio/reactivex/subjects/PublishSubject;", "Lcom/ss/android/lark/mm/module/share/repo/ShareRepo$DataSource;", "kotlin.jvm.PlatformType", "host", "inviteUsers", "isAutoSearch", "", "model", "Lcom/ss/android/lark/mm/module/share/model/ShareModel;", "searchKeyword", "token", "getTrackContext", "()Lcom/ss/android/lark/mm/statistics/hitpoint/MmHitPointContext;", "getUrl", "()Ljava/lang/String;", "clearCandidates", "", "copyCandidates", "", "isForce", "deletePermission", "userId", "userType", "(Ljava/lang/String;Ljava/lang/Integer;)V", "dispose", "getCandidates", "getCollaboratorList", "getFeedList", "getLinkShare", "Lcom/ss/android/lark/mm/module/share/model/LinkShare;", "getMmHitPointContext", "getSearchList", "hasReachMaxCandidateCount", "invite", "onResult", "Lkotlin/Function0;", "loadShareInfo", "search", "keyword", "isAuto", "selectCandidate", "user", "shareSetting", "isOpen", "isInternal", "isViewOnly", "subscribeData", "Lio/reactivex/disposables/Disposable;", ShareHitPoint.f121868c, "onChanged", "syncCandidateStatus", "userList", "transferPermission", "updatePermission", "permission", "Lcom/ss/android/lark/mm/module/share/model/SharePermission;", "Companion", "DataSource", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ShareRepo implements MmHitPointContextProvider {

    /* renamed from: d */
    public static final ConcurrentHashMap<String, ShareRepo> f118325d = new ConcurrentHashMap<>();

    /* renamed from: e */
    public static final Companion f118326e = new Companion(null);

    /* renamed from: a */
    public final String f118327a = "ShareRepo";

    /* renamed from: b */
    public final ShareModel f118328b;

    /* renamed from: c */
    public final C68296b<DataSource> f118329c;

    /* renamed from: f */
    private final int f118330f = 2000;

    /* renamed from: g */
    private String f118331g;

    /* renamed from: h */
    private String f118332h;

    /* renamed from: i */
    private String f118333i;

    /* renamed from: j */
    private boolean f118334j;

    /* renamed from: k */
    private final List<User> f118335k;

    /* renamed from: l */
    private List<User> f118336l;

    /* renamed from: m */
    private final String f118337m;

    /* renamed from: n */
    private final C47084f f118338n;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/mm/module/share/repo/ShareRepo$DataSource;", "", "(Ljava/lang/String;I)V", "ShareInfo", "Search", "Candidate", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum DataSource {
        ShareInfo,
        Search,
        Candidate
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0005J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\u0005R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/mm/module/share/repo/ShareRepo$Companion;", "", "()V", "repos", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lcom/ss/android/lark/mm/module/share/repo/ShareRepo;", "create", "url", "trackContext", "Lcom/ss/android/lark/mm/statistics/hitpoint/MmHitPointContext;", "delete", "", "id", "get", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.share.repo.ShareRepo$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public final ShareRepo mo165209b(String str) {
            Intrinsics.checkParameterIsNotNull(str, "id");
            return ShareRepo.f118325d.get(str);
        }

        /* renamed from: a */
        public final void mo165208a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "id");
            ShareRepo shareRepo = ShareRepo.f118325d.get(str);
            if (shareRepo != null) {
                shareRepo.mo165192a();
                ShareRepo.f118325d.remove(str);
            }
        }

        /* renamed from: a */
        public final synchronized String mo165207a(String str, C47084f fVar) {
            String str2;
            Intrinsics.checkParameterIsNotNull(str, "url");
            str2 = "ShareRepo@" + SystemClock.elapsedRealtime();
            ShareRepo.f118325d.put(str2, new ShareRepo(str, fVar));
            return str2;
        }
    }

    @Override // com.ss.android.lark.mm.statistics.hitpoint.MmHitPointContextProvider
    /* renamed from: e */
    public C47084f mo161231e() {
        return this.f118338n;
    }

    /* renamed from: f */
    public final List<User> mo165203f() {
        return this.f118335k;
    }

    /* renamed from: i */
    public final C47084f mo165206i() {
        return this.f118338n;
    }

    /* renamed from: a */
    public final void mo165196a(Function0<Unit> function0) {
        C47057a.m186285e(this.f118331g, this.f118332h, new C47013e(this, function0));
    }

    /* renamed from: a */
    public final void mo165197a(boolean z, boolean z2, boolean z3) {
        C47057a.m186245a(this.f118331g, this.f118332h, (z ? ShareStatus.Open : ShareStatus.Closed).getValue(), (z2 ? ShareType.Internal : ShareType.Anyone).getValue(), (z3 ? SharePermission.VIEW : SharePermission.EDIT).getValue(), new C47015g(this));
    }

    /* renamed from: a */
    public final boolean mo165198a(User user) {
        T t;
        Intrinsics.checkParameterIsNotNull(user, "user");
        T t2 = null;
        if (!user.isSelected()) {
            Iterator<T> it = this.f118335k.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (Intrinsics.areEqual(t.getUserId(), user.getUserId())) {
                    break;
                }
            }
            T t3 = t;
            if (t3 != null) {
                this.f118335k.remove(t3);
                mo165195a(this.f118328b.getSearchList());
                this.f118329c.onNext(DataSource.Candidate);
                return true;
            }
        }
        Iterator<T> it2 = this.f118335k.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            T next = it2.next();
            if (Intrinsics.areEqual(next.getUserId(), user.getUserId())) {
                t2 = next;
                break;
            }
        }
        if (t2 != null || mo165204g()) {
            return false;
        }
        this.f118335k.add(user);
        mo165195a(this.f118328b.getSearchList());
        this.f118329c.onNext(DataSource.Candidate);
        return true;
    }

    /* renamed from: a */
    public final void mo165192a() {
        this.f118329c.onComplete();
    }

    /* renamed from: b */
    public final List<User> mo165199b() {
        return this.f118328b.getCollaboratorList();
    }

    /* renamed from: c */
    public final LinkShare mo165201c() {
        return this.f118328b.getLinkShare();
    }

    /* renamed from: d */
    public final List<User> mo165202d() {
        return this.f118328b.getSearchList();
    }

    /* renamed from: h */
    public final void mo165205h() {
        this.f118335k.clear();
    }

    /* renamed from: j */
    private final void m186093j() {
        C47057a.m186287f(this.f118331g, this.f118332h, new C47011c(this));
    }

    /* renamed from: g */
    public final boolean mo165204g() {
        if (this.f118335k.size() >= this.f118330f) {
            return true;
        }
        return false;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mm/module/share/repo/ShareRepo$deletePermission$1", "Lcom/ss/android/lark/mm/net/callback/IHttpDataCallback;", "", "onError", "", "errorResult", "Lcom/ss/android/lark/mm/net/callback/HttpErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.share.repo.ShareRepo$b */
    public static final class C47010b extends AbstractC47070c<String> {

        /* renamed from: a */
        final /* synthetic */ ShareRepo f118339a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C47010b(ShareRepo shareRepo) {
            this.f118339a = shareRepo;
        }

        /* renamed from: a */
        public void mo161289a(String str) {
            ShareRepo.m186090a(this.f118339a, null, 1, null);
        }

        @Override // com.ss.android.lark.mm.net.p2333b.AbstractC47069b
        /* renamed from: a */
        public void mo161288a(C47068a aVar) {
            String str = this.f118339a.f118327a;
            C45855f.m181666e(str, "[deletePermission] [onError] error: " + aVar);
            ShareRepo.m186090a(this.f118339a, null, 1, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mm/module/share/repo/ShareRepo$getFeedList$1", "Lcom/ss/android/lark/mm/net/callback/IHttpDataCallback;", "", "onError", "", "errorResult", "Lcom/ss/android/lark/mm/net/callback/HttpErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.share.repo.ShareRepo$c */
    public static final class C47011c extends AbstractC47070c<String> {

        /* renamed from: a */
        final /* synthetic */ ShareRepo f118340a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C47011c(ShareRepo shareRepo) {
            this.f118340a = shareRepo;
        }

        @Override // com.ss.android.lark.mm.net.p2333b.AbstractC47069b
        /* renamed from: a */
        public void mo161288a(C47068a aVar) {
            String str = this.f118340a.f118327a;
            C45855f.m181666e(str, "[search] [onError] error: " + aVar);
            this.f118340a.f118329c.onNext(DataSource.Search);
        }

        /* renamed from: a */
        public void mo161289a(String str) {
            try {
                this.f118340a.f118328b.getSearchList().clear();
                List<User> users = ((SearchResponse) new Gson().fromJson(str, SearchResponse.class)).getUsers();
                if (users != null) {
                    this.f118340a.mo165195a(users);
                    this.f118340a.f118328b.getSearchList().addAll(users);
                }
            } catch (Exception e) {
                String str2 = this.f118340a.f118327a;
                C45855f.m181666e(str2, "[search] [onSuccess] ex: " + e);
            }
            this.f118340a.f118329c.onNext(DataSource.Search);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mm/module/share/repo/ShareRepo$search$1", "Lcom/ss/android/lark/mm/net/callback/IHttpDataCallback;", "", "onError", "", "errorResult", "Lcom/ss/android/lark/mm/net/callback/HttpErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.share.repo.ShareRepo$f */
    public static final class C47014f extends AbstractC47070c<String> {

        /* renamed from: a */
        final /* synthetic */ ShareRepo f118345a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C47014f(ShareRepo shareRepo) {
            this.f118345a = shareRepo;
        }

        @Override // com.ss.android.lark.mm.net.p2333b.AbstractC47069b
        /* renamed from: a */
        public void mo161288a(C47068a aVar) {
            String str = this.f118345a.f118327a;
            C45855f.m181666e(str, "[search] [onError] error: " + aVar);
            this.f118345a.f118329c.onNext(DataSource.Search);
        }

        /* renamed from: a */
        public void mo161289a(String str) {
            try {
                this.f118345a.f118328b.getSearchList().clear();
                List<User> users = ((SearchResponse) new Gson().fromJson(str, SearchResponse.class)).getUsers();
                if (users != null) {
                    this.f118345a.mo165195a(users);
                    this.f118345a.f118328b.getSearchList().addAll(users);
                }
            } catch (Exception e) {
                String str2 = this.f118345a.f118327a;
                C45855f.m181666e(str2, "[search] [onSuccess] ex: " + e);
            }
            this.f118345a.f118329c.onNext(DataSource.Search);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mm/module/share/repo/ShareRepo$shareSetting$1", "Lcom/ss/android/lark/mm/net/callback/IHttpDataCallback;", "", "onError", "", "errorResult", "Lcom/ss/android/lark/mm/net/callback/HttpErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.share.repo.ShareRepo$g */
    public static final class C47015g extends AbstractC47070c<String> {

        /* renamed from: a */
        final /* synthetic */ ShareRepo f118346a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C47015g(ShareRepo shareRepo) {
            this.f118346a = shareRepo;
        }

        /* renamed from: a */
        public void mo161289a(String str) {
            ShareRepo.m186090a(this.f118346a, null, 1, null);
        }

        @Override // com.ss.android.lark.mm.net.p2333b.AbstractC47069b
        /* renamed from: a */
        public void mo161288a(C47068a aVar) {
            String str = this.f118346a.f118327a;
            C45855f.m181666e(str, "[shareSetting] [onError] error: " + aVar);
            ShareRepo.m186090a(this.f118346a, null, 1, null);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/mm/module/share/repo/ShareRepo$DataSource;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.share.repo.ShareRepo$i */
    public static final class C47017i<T> implements Consumer<DataSource> {

        /* renamed from: a */
        final /* synthetic */ Function0 f118348a;

        C47017i(Function0 function0) {
            this.f118348a = function0;
        }

        /* renamed from: a */
        public final void accept(DataSource dataSource) {
            this.f118348a.invoke();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mm/module/share/repo/ShareRepo$transferPermission$1", "Lcom/ss/android/lark/mm/net/callback/IHttpDataCallback;", "", "onError", "", "errorResult", "Lcom/ss/android/lark/mm/net/callback/HttpErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.share.repo.ShareRepo$j */
    public static final class C47018j extends AbstractC47070c<String> {

        /* renamed from: a */
        final /* synthetic */ ShareRepo f118349a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C47018j(ShareRepo shareRepo) {
            this.f118349a = shareRepo;
        }

        /* renamed from: a */
        public void mo161289a(String str) {
            ShareRepo.m186090a(this.f118349a, null, 1, null);
        }

        @Override // com.ss.android.lark.mm.net.p2333b.AbstractC47069b
        /* renamed from: a */
        public void mo161288a(C47068a aVar) {
            String str = this.f118349a.f118327a;
            C45855f.m181666e(str, "[transferPermission] [onError] error: " + aVar);
            ShareRepo.m186090a(this.f118349a, null, 1, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mm/module/share/repo/ShareRepo$updatePermission$5", "Lcom/ss/android/lark/mm/net/callback/IHttpDataCallback;", "", "onError", "", "errorResult", "Lcom/ss/android/lark/mm/net/callback/HttpErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.share.repo.ShareRepo$l */
    public static final class C47020l extends AbstractC47070c<String> {

        /* renamed from: a */
        final /* synthetic */ ShareRepo f118350a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C47020l(ShareRepo shareRepo) {
            this.f118350a = shareRepo;
        }

        /* renamed from: a */
        public void mo161289a(String str) {
            ShareRepo.m186090a(this.f118350a, null, 1, null);
        }

        @Override // com.ss.android.lark.mm.net.p2333b.AbstractC47069b
        /* renamed from: a */
        public void mo161288a(C47068a aVar) {
            String str = this.f118350a.f118327a;
            C45855f.m181666e(str, "[updatePermission] [onError] error: " + aVar);
            ShareRepo.m186090a(this.f118350a, null, 1, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mm/module/share/repo/ShareRepo$invite$3", "Lcom/ss/android/lark/mm/net/callback/IHttpDataCallback;", "", "onError", "", "errorResult", "Lcom/ss/android/lark/mm/net/callback/HttpErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.share.repo.ShareRepo$d */
    public static final class C47012d extends AbstractC47070c<String> {

        /* renamed from: a */
        final /* synthetic */ ShareRepo f118341a;

        /* renamed from: b */
        final /* synthetic */ Function0 f118342b;

        /* renamed from: a */
        public void mo161289a(String str) {
            this.f118342b.invoke();
            ShareRepo.m186090a(this.f118341a, null, 1, null);
        }

        @Override // com.ss.android.lark.mm.net.p2333b.AbstractC47069b
        /* renamed from: a */
        public void mo161288a(C47068a aVar) {
            String str = this.f118341a.f118327a;
            C45855f.m181666e(str, "[invite] [onError] error: " + aVar);
        }

        C47012d(ShareRepo shareRepo, Function0 function0) {
            this.f118341a = shareRepo;
            this.f118342b = function0;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/mm/module/share/repo/ShareRepo$DataSource;", "test"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.share.repo.ShareRepo$h */
    public static final class C47016h<T> implements AbstractC68322n<DataSource> {

        /* renamed from: a */
        final /* synthetic */ DataSource f118347a;

        C47016h(DataSource dataSource) {
            this.f118347a = dataSource;
        }

        /* renamed from: a */
        public final boolean test(DataSource dataSource) {
            Intrinsics.checkParameterIsNotNull(dataSource, "it");
            if (dataSource == this.f118347a) {
                return true;
            }
            return false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/mm/module/share/model/User;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.share.repo.ShareRepo$k */
    static final class C47019k extends Lambda implements Function1<User, Boolean> {
        final /* synthetic */ User $user;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47019k(User user) {
            super(1);
            this.$user = user;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Boolean invoke(User user) {
            return Boolean.valueOf(invoke(user));
        }

        public final boolean invoke(User user) {
            Intrinsics.checkParameterIsNotNull(user, "it");
            return Intrinsics.areEqual(user.getUserId(), this.$user.getUserId());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mm/module/share/repo/ShareRepo$loadShareInfo$1", "Lcom/ss/android/lark/mm/net/callback/IHttpDataCallback;", "", "onError", "", "errorResult", "Lcom/ss/android/lark/mm/net/callback/HttpErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.share.repo.ShareRepo$e */
    public static final class C47013e extends AbstractC47070c<String> {

        /* renamed from: a */
        final /* synthetic */ ShareRepo f118343a;

        /* renamed from: b */
        final /* synthetic */ Function0 f118344b;

        @Override // com.ss.android.lark.mm.net.p2333b.AbstractC47069b
        /* renamed from: a */
        public void mo161288a(C47068a aVar) {
            String str = this.f118343a.f118327a;
            C45855f.m181666e(str, "[loadShareInfo] [onError] error: " + aVar);
            this.f118343a.f118329c.onNext(DataSource.ShareInfo);
            Function0 function0 = this.f118344b;
            if (function0 != null) {
                Unit unit = (Unit) function0.invoke();
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0043 A[Catch:{ JsonSyntaxException -> 0x005a }] */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0024 A[SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo161289a(java.lang.String r6) {
            /*
            // Method dump skipped, instructions count: 135
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mm.module.share.repo.ShareRepo.C47013e.mo161289a(java.lang.String):void");
        }

        C47013e(ShareRepo shareRepo, Function0 function0) {
            this.f118343a = shareRepo;
            this.f118344b = function0;
        }
    }

    /* renamed from: b */
    public final void mo165200b(Function0<Unit> function0) {
        Intrinsics.checkParameterIsNotNull(function0, "onResult");
        List<User> list = this.f118336l;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (T t : list) {
            arrayList.add(new InviteUser(t.getUserType(), t.getUserId(), t.getPermissions()));
        }
        String json = new Gson().toJson(arrayList);
        Intrinsics.checkExpressionValueIsNotNull(json, "Gson().toJson(this)");
        C47057a.m186284d(this.f118331g, this.f118332h, json, new C47012d(this, function0));
    }

    /* renamed from: a */
    public final List<User> mo165191a(boolean z) {
        SharePermission sharePermission;
        T t;
        List<User> list = this.f118335k;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (T t2 : list) {
            if (t2.isOwner()) {
                sharePermission = SharePermission.OWNER;
            } else if (t2.isEditable()) {
                sharePermission = SharePermission.EDIT;
            } else {
                sharePermission = SharePermission.VIEW;
            }
            Integer valueOf = Integer.valueOf(sharePermission.getValue());
            LinkShare linkShare = this.f118328b.getLinkShare();
            if (linkShare == null || !linkShare.isOwner()) {
                LinkShare linkShare2 = this.f118328b.getLinkShare();
                if (linkShare2 == null || !linkShare2.canEdit()) {
                    LinkShare linkShare3 = this.f118328b.getLinkShare();
                    if (linkShare3 != null && linkShare3.canView()) {
                        valueOf = Integer.valueOf(SharePermission.VIEW.getValue());
                    }
                } else if (valueOf.intValue() == SharePermission.OWNER.getValue()) {
                    valueOf = Integer.valueOf(SharePermission.EDIT.getValue());
                }
            }
            if (!z) {
                Iterator<T> it = this.f118336l.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (Intrinsics.areEqual(t.getUserId(), t2.getUserId())) {
                        break;
                    }
                }
                T t3 = t;
                if (t3 == null || (valueOf = t3.getPermissions()) == null) {
                    valueOf = t2.getPermissions();
                }
            }
            arrayList.add(User.copy$default(t2, null, null, null, null, null, valueOf, null, null, null, null, null, null, null, null, null, false, true, false, null, null, 983007, null));
        }
        List<User> mutableList = CollectionsKt.toMutableList((Collection) arrayList);
        this.f118336l = mutableList;
        return mutableList;
    }

    /* renamed from: a */
    public final void mo165195a(List<User> list) {
        T t;
        Intrinsics.checkParameterIsNotNull(list, "userList");
        if (!(list.isEmpty() || this.f118335k.isEmpty())) {
            for (T t2 : list) {
                Iterator<T> it = this.f118335k.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (Intrinsics.areEqual(t.getUserId(), t2.getUserId())) {
                        break;
                    }
                }
                T t3 = t;
                if (t3 != null) {
                    t2.setSelected(t3.isSelected());
                }
            }
        }
    }

    /* renamed from: b */
    private final void m186092b(String str, Integer num) {
        int i;
        String str2 = this.f118331g;
        String str3 = this.f118332h;
        if (str == null) {
            str = "";
        }
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        C47057a.m186273b(str2, str3, str, i, new C47018j(this));
    }

    /* renamed from: a */
    private final void m186091a(String str, Integer num) {
        int i;
        String str2 = this.f118331g;
        String str3 = this.f118332h;
        if (str == null) {
            str = "";
        }
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        C47057a.m186253a(str2, str3, str, i, new C47010b(this));
    }

    public ShareRepo(String str, C47084f fVar) {
        Intrinsics.checkParameterIsNotNull(str, "url");
        this.f118337m = str;
        this.f118338n = fVar;
        this.f118331g = UrlUtil.f118671a.mo165518b(str);
        this.f118332h = UrlUtil.f118671a.mo165517a(str);
        this.f118328b = new ShareModel(null, null, null, 7, null);
        C68296b<DataSource> a = C68296b.m265052a();
        Intrinsics.checkExpressionValueIsNotNull(a, "PublishSubject.create<DataSource>()");
        this.f118329c = a;
        this.f118335k = new ArrayList();
        this.f118336l = new ArrayList();
    }

    /* renamed from: a */
    public final Disposable mo165190a(DataSource dataSource, Function0<Unit> function0) {
        Intrinsics.checkParameterIsNotNull(dataSource, ShareHitPoint.f121868c);
        Intrinsics.checkParameterIsNotNull(function0, "onChanged");
        Observable<DataSource> filter = this.f118329c.filter(new C47016h(dataSource));
        IMmDepend a = C45899c.m181859a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
        IMmDepend.AbstractC45893s threadDepend = a.getThreadDepend();
        Intrinsics.checkExpressionValueIsNotNull(threadDepend, "MmDepend.impl().threadDepend");
        Disposable subscribe = filter.subscribeOn(threadDepend.mo144598a()).observeOn(AndroidSchedulers.mainThread()).subscribe(new C47017i(function0));
        Intrinsics.checkExpressionValueIsNotNull(subscribe, "dataSubject\n            …onChanged()\n            }");
        return subscribe;
    }

    /* renamed from: a */
    public final void mo165193a(User user, SharePermission sharePermission) {
        int i;
        T t;
        boolean z;
        Intrinsics.checkParameterIsNotNull(user, "user");
        Intrinsics.checkParameterIsNotNull(sharePermission, "permission");
        if (user.isCandidate()) {
            T t2 = null;
            if (sharePermission == SharePermission.NONE) {
                Iterator<T> it = this.f118328b.getSearchList().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    if (Intrinsics.areEqual(next.getUserId(), user.getUserId())) {
                        t2 = next;
                        break;
                    }
                }
                T t3 = t2;
                if (t3 != null) {
                    t3.setSelected(false);
                }
                this.f118329c.onNext(DataSource.Search);
                CollectionsKt.removeAll((List) this.f118335k, (Function1) new C47019k(user));
            } else {
                if (sharePermission == SharePermission.OWNER) {
                    Iterator<T> it2 = this.f118336l.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            t = null;
                            break;
                        }
                        t = it2.next();
                        Integer permissions = t.getPermissions();
                        int value = SharePermission.OWNER.getValue();
                        if (permissions != null && permissions.intValue() == value) {
                            z = true;
                            continue;
                        } else {
                            z = false;
                            continue;
                        }
                        if (z) {
                            break;
                        }
                    }
                    T t4 = t;
                    if (t4 != null) {
                        t4.setPermissions(Integer.valueOf(SharePermission.EDIT.getValue()));
                    }
                }
                Iterator<T> it3 = this.f118336l.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    T next2 = it3.next();
                    if (Intrinsics.areEqual(next2.getUserId(), user.getUserId())) {
                        t2 = next2;
                        break;
                    }
                }
                T t5 = t2;
                if (t5 != null) {
                    t5.setPermissions(Integer.valueOf(sharePermission.getValue()));
                }
            }
            this.f118329c.onNext(DataSource.Candidate);
        } else if (sharePermission == SharePermission.NONE) {
            m186091a(user.getUserId(), user.getUserType());
        } else if (sharePermission == SharePermission.OWNER) {
            m186092b(user.getUserId(), user.getUserType());
        } else {
            String str = this.f118331g;
            String str2 = this.f118332h;
            String userId = user.getUserId();
            if (userId == null) {
                userId = "";
            }
            Integer userType = user.getUserType();
            if (userType != null) {
                i = userType.intValue();
            } else {
                i = 0;
            }
            C47057a.m186252a(str, str2, userId, i, sharePermission.getValue(), new C47020l(this));
        }
    }

    /* renamed from: a */
    public final void mo165194a(String str, boolean z) {
        boolean z2;
        this.f118333i = str;
        this.f118334j = z;
        String str2 = str;
        if (str2 == null || str2.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            m186093j();
        } else {
            C47057a.m186286e(this.f118331g, this.f118332h, this.f118333i, new C47014f(this));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.ss.android.lark.mm.module.share.repo.ShareRepo */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static /* synthetic */ void m186090a(ShareRepo shareRepo, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            function0 = null;
        }
        shareRepo.mo165196a(function0);
    }

    /* renamed from: a */
    public static /* synthetic */ void m186089a(ShareRepo shareRepo, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        shareRepo.mo165194a(str, z);
    }
}
