package com.ss.android.lark.mm.module.participant;

import android.os.SystemClock;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.actions.SearchIntents;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.mm.base.p2289a.C45861b;
import com.ss.android.lark.mm.depend.C45899c;
import com.ss.android.lark.mm.depend.IMmDepend;
import com.ss.android.lark.mm.module.detail.baseinfo.MmBaseInfo;
import com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.data.MmParticipantsSearchRes;
import com.ss.android.lark.mm.module.participant.model.MmParticipants;
import com.ss.android.lark.mm.module.participant.model.ParticipantModel;
import com.ss.android.lark.mm.net.p2332a.C47057a;
import com.ss.android.lark.mm.net.p2333b.AbstractC47070c;
import com.ss.android.lark.mm.net.p2333b.C47068a;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.p2288b.C45858j;
import com.ss.android.lark.mm.utils.ResString;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.AbstractC68322n;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.p3457e.C68296b;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 E2\u00020\u0001:\u0002EFB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0014\u0010\u0017\u001a\u00020\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u001aJE\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u00032\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00180\u001e2!\u0010 \u001a\u001d\u0012\u0013\u0012\u00110!¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00180\u001eJ3\u0010%\u001a\u00020\u00182\u0006\u0010&\u001a\u00020\u00032!\u0010'\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b((\u0012\u0004\u0012\u00020\u00180\u001eH\u0002JT\u0010)\u001a\u00020\u00182\u0006\u0010*\u001a\u00020\u00032\b\u0010+\u001a\u0004\u0018\u00010\u00032\b\u0010,\u001a\u0004\u0018\u00010-2\b\u0010&\u001a\u0004\u0018\u00010\u00032!\u0010'\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b((\u0012\u0004\u0012\u00020\u00180\u001e¢\u0006\u0002\u0010.J\u0006\u0010/\u001a\u00020\u0018J\u0018\u00100\u001a\u00020\u00182\u0006\u00101\u001a\u00020-2\u0006\u00102\u001a\u00020-H\u0002J\u0018\u00103\u001a\u00020\u00182\u0006\u00101\u001a\u00020-2\u0006\u00102\u001a\u00020-H\u0002J\u000e\u00104\u001a\u00020\u00182\u0006\u00105\u001a\u00020\u000eJ\u000e\u00106\u001a\u0002072\u0006\u00105\u001a\u00020\u000eJ\u000e\u00108\u001a\u00020\u00182\u0006\u00105\u001a\u00020\u000eJ(\u00109\u001a\u00020\u00182\u0006\u0010:\u001a\u00020\u00032\u0018\u0010;\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0<\u0012\u0004\u0012\u00020\u00180\u001eJ\u0016\u0010=\u001a\u00020\u00182\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u001f0<H\u0002J7\u0010?\u001a\u00020@\"\u0004\b\u0000\u0010A2\u0006\u0010B\u001a\u00020\u000e2!\u0010C\u001a\u001d\u0012\u0013\u0012\u0011HA¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(D\u0012\u0004\u0012\u00020\u00180\u001eR\u000e\u0010\b\u001a\u00020\u0003XD¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR0\u0010\u000b\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0002\b\u0003 \u000f*\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0002\b\u0003\u0018\u00010\r0\r0\fX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011¨\u0006G"}, d2 = {"Lcom/ss/android/lark/mm/module/participant/ParticipantRepo;", "", "host", "", "objectToken", "baseInfo", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "(Ljava/lang/String;Ljava/lang/String;Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;)V", "TAG", "getBaseInfo", "()Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "dataSubject", "Lio/reactivex/subjects/PublishSubject;", "Lkotlin/Pair;", "Lcom/ss/android/lark/mm/module/participant/ParticipantRepo$DataSource;", "kotlin.jvm.PlatformType", "getHost", "()Ljava/lang/String;", "model", "Lcom/ss/android/lark/mm/module/participant/model/ParticipantModel;", "getModel", "()Lcom/ss/android/lark/mm/module/participant/model/ParticipantModel;", "getObjectToken", "addParticipants", "", "callback", "Lkotlin/Function0;", "addVirtualMember", "userName", "success", "Lkotlin/Function1;", "Lcom/ss/android/lark/mm/module/participant/model/MmParticipants$MmParticipantInfo;", "error", "Lcom/ss/android/lark/mm/net/callback/HttpErrorResult;", "Lkotlin/ParameterName;", "name", "errorResult", "afterDelete", "userId", "onResponse", "errorMsg", "delete", "token", "actionId", "userType", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "dispose", "fetchParticipants", "offset", "size", "fetchSuggestionParticipants", "firstPage", "ds", "hasMore", "", "nextPage", "searchMembers", SearchIntents.EXTRA_QUERY, "onSuccess", "", "setListIsSelected", "list", "subscribeData", "Lio/reactivex/disposables/Disposable;", "T", ShareHitPoint.f121868c, "onChanged", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Companion", "DataSource", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ParticipantRepo {

    /* renamed from: c */
    public static final int f117150c = f117150c;

    /* renamed from: d */
    public static final ConcurrentHashMap<String, ParticipantRepo> f117151d = new ConcurrentHashMap<>();

    /* renamed from: e */
    public static final Companion f117152e = new Companion(null);

    /* renamed from: a */
    public final String f117153a = "ListRepo";

    /* renamed from: b */
    public final C68296b<Pair<DataSource, ?>> f117154b;

    /* renamed from: f */
    private final ParticipantModel f117155f = new ParticipantModel(null, null, null, null, 15, null);

    /* renamed from: g */
    private final String f117156g;

    /* renamed from: h */
    private final String f117157h;

    /* renamed from: i */
    private final MmBaseInfo f117158i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/mm/module/participant/ParticipantRepo$DataSource;", "", "(Ljava/lang/String;I)V", "ParticipantsFirstPage", "ParticipantsNextPage", "ParticipantSuggestionFirstPage", "ParticipantSuggestionNextPage", "ParticipantsRefresh", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum DataSource {
        ParticipantsFirstPage,
        ParticipantsNextPage,
        ParticipantSuggestionFirstPage,
        ParticipantSuggestionNextPage,
        ParticipantsRefresh
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0010\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "T", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lcom/ss/android/lark/mm/module/participant/ParticipantRepo$DataSource;", "apply"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.participant.ParticipantRepo$i */
    static final class C46550i<T, R> implements Function<T, R> {

        /* renamed from: a */
        public static final C46550i f117174a = new C46550i();

        C46550i() {
        }

        /* renamed from: a */
        public final Object apply(Pair<? extends DataSource, ?> pair) {
            Intrinsics.checkParameterIsNotNull(pair, "<name for destructuring parameter 0>");
            return pair.component2();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\tJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0012\u001a\u00020\tR\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/mm/module/participant/ParticipantRepo$Companion;", "", "()V", "PAGE_SIZE", "", "getPAGE_SIZE", "()I", "repos", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lcom/ss/android/lark/mm/module/participant/ParticipantRepo;", "create", "host", "objectToken", "baseInfo", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "delete", "", "id", "get", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.participant.ParticipantRepo$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final int mo163487a() {
            return ParticipantRepo.f117150c;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public final ParticipantRepo mo163490b(String str) {
            Intrinsics.checkParameterIsNotNull(str, "id");
            return ParticipantRepo.f117151d.get(str);
        }

        /* renamed from: a */
        public final void mo163489a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "id");
            ParticipantRepo participantRepo = ParticipantRepo.f117151d.get(str);
            if (participantRepo != null) {
                participantRepo.mo163481b();
                ParticipantRepo.f117151d.remove(str);
            }
        }

        /* renamed from: a */
        public final synchronized String mo163488a(String str, String str2, MmBaseInfo mmBaseInfo) {
            String str3;
            Intrinsics.checkParameterIsNotNull(str, "host");
            Intrinsics.checkParameterIsNotNull(str2, "objectToken");
            Intrinsics.checkParameterIsNotNull(mmBaseInfo, "baseInfo");
            str3 = "ParticipantRepo@" + SystemClock.elapsedRealtime();
            ParticipantRepo.f117151d.put(str3, new ParticipantRepo(str, str2, mmBaseInfo));
            return str3;
        }
    }

    /* renamed from: a */
    public final ParticipantModel mo163473a() {
        return this.f117155f;
    }

    /* renamed from: c */
    public final String mo163484c() {
        return this.f117157h;
    }

    /* renamed from: d */
    public final MmBaseInfo mo163486d() {
        return this.f117158i;
    }

    /* renamed from: b */
    public final void mo163481b() {
        this.f117154b.onComplete();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.participant.ParticipantRepo$j */
    static final class C46551j<T> implements Consumer<Object> {

        /* renamed from: a */
        final /* synthetic */ Function1 f117175a;

        C46551j(Function1 function1) {
            this.f117175a = function1;
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(Object obj) {
            this.f117175a.invoke(obj);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mm/module/participant/ParticipantRepo$addVirtualMember$1", "Lcom/ss/android/lark/mm/net/callback/IHttpDataCallback;", "Lcom/ss/android/lark/mm/module/participant/model/MmParticipants$MmParticipantInfo;", "onError", "", "errorResult", "Lcom/ss/android/lark/mm/net/callback/HttpErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.participant.ParticipantRepo$c */
    public static final class C46544c extends AbstractC47070c<MmParticipants.MmParticipantInfo> {

        /* renamed from: a */
        final /* synthetic */ ParticipantRepo f117161a;

        /* renamed from: b */
        final /* synthetic */ Function1 f117162b;

        /* renamed from: c */
        final /* synthetic */ Function1 f117163c;

        /* renamed from: a */
        public void mo161289a(MmParticipants.MmParticipantInfo mmParticipantInfo) {
            Intrinsics.checkParameterIsNotNull(mmParticipantInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            C45855f.m181664c(this.f117161a.f117153a, "addVirtualMember, success");
            this.f117162b.invoke(mmParticipantInfo);
        }

        @Override // com.ss.android.lark.mm.net.p2333b.AbstractC47069b
        /* renamed from: a */
        public void mo161288a(C47068a aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "errorResult");
            String str = this.f117161a.f117153a;
            C45855f.m181664c(str, "addVirtualMember, failed:" + aVar);
            this.f117163c.invoke(aVar);
        }

        C46544c(ParticipantRepo participantRepo, Function1 function1, Function1 function12) {
            this.f117161a = participantRepo;
            this.f117162b = function1;
            this.f117163c = function12;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mm/module/participant/ParticipantRepo$delete$1", "Lcom/ss/android/lark/mm/net/callback/IHttpDataCallback;", "", "onError", "", "errorResult", "Lcom/ss/android/lark/mm/net/callback/HttpErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.participant.ParticipantRepo$d */
    public static final class C46545d extends AbstractC47070c<String> {

        /* renamed from: a */
        final /* synthetic */ ParticipantRepo f117164a;

        /* renamed from: b */
        final /* synthetic */ String f117165b;

        /* renamed from: c */
        final /* synthetic */ Function1 f117166c;

        /* renamed from: a */
        public void mo161289a(String str) {
            ParticipantRepo participantRepo = this.f117164a;
            String str2 = this.f117165b;
            if (str2 == null) {
                str2 = "";
            }
            participantRepo.mo163483b(str2, this.f117166c);
            C45861b.m181700a().f115690a.mo161177a((Object) null, this.f117164a.mo163484c());
        }

        @Override // com.ss.android.lark.mm.net.p2333b.AbstractC47069b
        /* renamed from: a */
        public void mo161288a(C47068a aVar) {
            Integer num;
            String str;
            String str2 = this.f117164a.f117153a;
            C45855f.m181666e(str2, "delete error: " + aVar);
            if (aVar == null || aVar.mo165306a() != 410) {
                if (aVar != null) {
                    num = Integer.valueOf(aVar.mo165306a());
                } else {
                    num = null;
                }
                if (num != null && num.intValue() == 403) {
                    str = ResString.f118656a.mo165504a(R.string.MMWeb_G_NoPermissionToDelete);
                } else {
                    str = ResString.f118656a.mo165504a(R.string.MMWeb_G_SomethingWentWrong);
                }
                this.f117166c.invoke(str);
                return;
            }
            C45858j.m181680b(ResString.f118656a.mo165504a(R.string.MMWeb_G_DeletedByOwner));
            ParticipantRepo participantRepo = this.f117164a;
            String str3 = this.f117165b;
            if (str3 == null) {
                str3 = "";
            }
            participantRepo.mo163483b(str3, this.f117166c);
        }

        C46545d(ParticipantRepo participantRepo, String str, Function1 function1) {
            this.f117164a = participantRepo;
            this.f117165b = str;
            this.f117166c = function1;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mm/module/participant/ParticipantRepo$fetchParticipants$1", "Lcom/ss/android/lark/mm/net/callback/IHttpDataCallback;", "Lcom/ss/android/lark/mm/module/participant/model/MmParticipants;", "onError", "", "errorResult", "Lcom/ss/android/lark/mm/net/callback/HttpErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.participant.ParticipantRepo$e */
    public static final class C46546e extends AbstractC47070c<MmParticipants> {

        /* renamed from: a */
        final /* synthetic */ ParticipantRepo f117167a;

        /* renamed from: b */
        final /* synthetic */ int f117168b;

        @Override // com.ss.android.lark.mm.net.p2333b.AbstractC47069b
        /* renamed from: a */
        public void mo161288a(C47068a aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "errorResult");
            String str = this.f117167a.f117153a;
            C45855f.m181666e(str, "[getParticipants] [onError] error: " + aVar);
        }

        /* renamed from: a */
        public void mo161289a(MmParticipants mmParticipants) {
            DataSource dataSource;
            MmParticipants participantsData;
            List<MmParticipants.MmParticipantInfo> list;
            List<MmParticipants.MmParticipantInfo> list2;
            Intrinsics.checkParameterIsNotNull(mmParticipants, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            if (this.f117168b == 0) {
                MmParticipants participantsData2 = this.f117167a.mo163473a().getParticipantsData();
                if (!(participantsData2 == null || (list2 = participantsData2.getList()) == null)) {
                    list2.clear();
                }
                this.f117167a.mo163473a().setParticipantsData(mmParticipants);
                dataSource = DataSource.ParticipantsFirstPage;
            } else {
                List<MmParticipants.MmParticipantInfo> list3 = mmParticipants.getList();
                if (!(list3 == null || (participantsData = this.f117167a.mo163473a().getParticipantsData()) == null || (list = participantsData.getList()) == null)) {
                    list.addAll(list3);
                }
                MmParticipants participantsData3 = this.f117167a.mo163473a().getParticipantsData();
                if (participantsData3 != null) {
                    participantsData3.setOffset(mmParticipants.getOffset());
                }
                MmParticipants participantsData4 = this.f117167a.mo163473a().getParticipantsData();
                if (participantsData4 != null) {
                    participantsData4.setSize(mmParticipants.getSize());
                }
                MmParticipants participantsData5 = this.f117167a.mo163473a().getParticipantsData();
                if (participantsData5 != null) {
                    participantsData5.setTotal(mmParticipants.getTotal());
                }
                MmParticipants participantsData6 = this.f117167a.mo163473a().getParticipantsData();
                if (participantsData6 != null) {
                    participantsData6.setHasMore(mmParticipants.isHasMore());
                }
                dataSource = DataSource.ParticipantsNextPage;
            }
            this.f117167a.f117154b.onNext(TuplesKt.to(dataSource, mmParticipants));
        }

        C46546e(ParticipantRepo participantRepo, int i) {
            this.f117167a = participantRepo;
            this.f117168b = i;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mm/module/participant/ParticipantRepo$fetchSuggestionParticipants$1", "Lcom/ss/android/lark/mm/net/callback/IHttpDataCallback;", "Lcom/ss/android/lark/mm/module/participant/model/MmParticipants;", "onError", "", "errorResult", "Lcom/ss/android/lark/mm/net/callback/HttpErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.participant.ParticipantRepo$f */
    public static final class C46547f extends AbstractC47070c<MmParticipants> {

        /* renamed from: a */
        final /* synthetic */ ParticipantRepo f117169a;

        /* renamed from: b */
        final /* synthetic */ int f117170b;

        @Override // com.ss.android.lark.mm.net.p2333b.AbstractC47069b
        /* renamed from: a */
        public void mo161288a(C47068a aVar) {
            String str = this.f117169a.f117153a;
            C45855f.m181666e(str, "[fetchSuggestionParticipants] [onError] error: " + aVar);
        }

        /* renamed from: a */
        public void mo161289a(MmParticipants mmParticipants) {
            DataSource dataSource;
            List<MmParticipants.MmParticipantInfo> list;
            List<MmParticipants.MmParticipantInfo> list2;
            List<MmParticipants.MmParticipantInfo> list3;
            Intrinsics.checkParameterIsNotNull(mmParticipants, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            String str = this.f117169a.f117153a;
            C45855f.m181664c(str, "[getParticipants] [onSuccess] size: " + mmParticipants.getSize());
            if (this.f117170b == 0) {
                MmParticipants suggestionData = this.f117169a.mo163473a().getSuggestionData();
                if (!(suggestionData == null || (list3 = suggestionData.getList()) == null)) {
                    list3.clear();
                }
                this.f117169a.mo163473a().setSuggestionData(mmParticipants);
                MmParticipants suggestionData2 = this.f117169a.mo163473a().getSuggestionData();
                if (!(suggestionData2 == null || (list2 = suggestionData2.getList()) == null)) {
                    this.f117169a.mo163478a(list2);
                }
                dataSource = DataSource.ParticipantSuggestionFirstPage;
            } else {
                List<MmParticipants.MmParticipantInfo> list4 = mmParticipants.getList();
                if (list4 != null) {
                    this.f117169a.mo163478a(list4);
                    MmParticipants suggestionData3 = this.f117169a.mo163473a().getSuggestionData();
                    if (!(suggestionData3 == null || (list = suggestionData3.getList()) == null)) {
                        list.addAll(list4);
                    }
                }
                MmParticipants suggestionData4 = this.f117169a.mo163473a().getSuggestionData();
                if (suggestionData4 != null) {
                    suggestionData4.setOffset(mmParticipants.getOffset());
                }
                MmParticipants suggestionData5 = this.f117169a.mo163473a().getSuggestionData();
                if (suggestionData5 != null) {
                    suggestionData5.setSize(mmParticipants.getSize());
                }
                MmParticipants suggestionData6 = this.f117169a.mo163473a().getSuggestionData();
                if (suggestionData6 != null) {
                    suggestionData6.setTotal(mmParticipants.getTotal());
                }
                MmParticipants suggestionData7 = this.f117169a.mo163473a().getSuggestionData();
                if (suggestionData7 != null) {
                    suggestionData7.setHasMore(mmParticipants.isHasMore());
                }
                dataSource = DataSource.ParticipantSuggestionNextPage;
            }
            this.f117169a.f117154b.onNext(TuplesKt.to(dataSource, mmParticipants));
        }

        C46547f(ParticipantRepo participantRepo, int i) {
            this.f117169a = participantRepo;
            this.f117170b = i;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mm/module/participant/ParticipantRepo$searchMembers$1", "Lcom/ss/android/lark/mm/net/callback/IHttpDataCallback;", "Lcom/ss/android/lark/mm/module/detail/subtitles/edit/speaker/data/MmParticipantsSearchRes;", "onError", "", "errorResult", "Lcom/ss/android/lark/mm/net/callback/HttpErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.participant.ParticipantRepo$g */
    public static final class C46548g extends AbstractC47070c<MmParticipantsSearchRes> {

        /* renamed from: a */
        final /* synthetic */ ParticipantRepo f117171a;

        /* renamed from: b */
        final /* synthetic */ Function1 f117172b;

        @Override // com.ss.android.lark.mm.net.p2333b.AbstractC47069b
        /* renamed from: a */
        public void mo161288a(C47068a aVar) {
            String str = this.f117171a.f117153a;
            C45855f.m181664c(str, "searchSpeakers error:" + aVar);
        }

        /* renamed from: a */
        public void mo161289a(MmParticipantsSearchRes mmParticipantsSearchRes) {
            List<MmParticipants.MmParticipantInfo> list;
            C45855f.m181664c(this.f117171a.f117153a, "searchSpeakers success");
            if (mmParticipantsSearchRes == null || (list = mmParticipantsSearchRes.getList()) == null) {
                list = Collections.emptyList();
                Intrinsics.checkExpressionValueIsNotNull(list, "Collections.emptyList()");
            }
            this.f117171a.mo163478a(list);
            this.f117172b.invoke(list);
        }

        C46548g(ParticipantRepo participantRepo, Function1 function1) {
            this.f117171a = participantRepo;
            this.f117172b = function1;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0010\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "T", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lcom/ss/android/lark/mm/module/participant/ParticipantRepo$DataSource;", "test"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.participant.ParticipantRepo$h */
    static final class C46549h<T> implements AbstractC68322n<Pair<? extends DataSource, ?>> {

        /* renamed from: a */
        final /* synthetic */ DataSource f117173a;

        C46549h(DataSource dataSource) {
            this.f117173a = dataSource;
        }

        /* renamed from: a */
        public final boolean test(Pair<? extends DataSource, ?> pair) {
            Intrinsics.checkParameterIsNotNull(pair, "<name for destructuring parameter 0>");
            if (((DataSource) pair.component1()) == this.f117173a) {
                return true;
            }
            return false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mm/module/participant/ParticipantRepo$addParticipants$1", "Lcom/ss/android/lark/mm/net/callback/IHttpDataCallback;", "", "onError", "", "errorResult", "Lcom/ss/android/lark/mm/net/callback/HttpErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.participant.ParticipantRepo$b */
    public static final class C46543b extends AbstractC47070c<String> {

        /* renamed from: a */
        final /* synthetic */ ParticipantRepo f117159a;

        /* renamed from: b */
        final /* synthetic */ Function0 f117160b;

        @Override // com.ss.android.lark.mm.net.p2333b.AbstractC47069b
        /* renamed from: a */
        public void mo161288a(C47068a aVar) {
        }

        /* renamed from: a */
        public void mo161289a(String str) {
            this.f117159a.f117154b.onNext(TuplesKt.to(DataSource.ParticipantsRefresh, new Object()));
            C45861b.m181700a().f115690a.mo161177a((Object) null, this.f117159a.mo163484c());
            this.f117160b.invoke();
        }

        C46543b(ParticipantRepo participantRepo, Function0 function0) {
            this.f117159a = participantRepo;
            this.f117160b = function0;
        }
    }

    /* renamed from: b */
    public final void mo163482b(DataSource dataSource) {
        Intrinsics.checkParameterIsNotNull(dataSource, "ds");
        int i = C46586c.f117232b[dataSource.ordinal()];
        if (i == 1) {
            m184101a(0, f117150c);
        } else if (i == 2) {
            m184102b(0, f117150c);
        }
    }

    /* renamed from: c */
    public final void mo163485c(DataSource dataSource) {
        List<MmParticipants.MmParticipantInfo> list;
        List<MmParticipants.MmParticipantInfo> list2;
        Intrinsics.checkParameterIsNotNull(dataSource, "ds");
        int i = C46586c.f117233c[dataSource.ordinal()];
        int i2 = 0;
        if (i == 1) {
            MmParticipants participantsData = this.f117155f.getParticipantsData();
            if (!(participantsData == null || (list = participantsData.getList()) == null)) {
                i2 = list.size();
            }
            m184101a(i2, f117150c);
        } else if (i == 2) {
            MmParticipants suggestionData = this.f117155f.getSuggestionData();
            if (!(suggestionData == null || (list2 = suggestionData.getList()) == null)) {
                i2 = list2.size();
            }
            m184102b(i2, f117150c);
        }
    }

    /* renamed from: a */
    public final void mo163478a(List<? extends MmParticipants.MmParticipantInfo> list) {
        T t;
        for (T t2 : list) {
            Iterator<T> it = this.f117155f.getSelectedUsers().iterator();
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
            if (t != null || t2.is_in_participants()) {
                t2.setIsSelected(true);
            }
        }
    }

    /* renamed from: a */
    public final void mo163479a(Function0<Unit> function0) {
        Intrinsics.checkParameterIsNotNull(function0, "callback");
        C47057a.m186261a(this.f117156g, this.f117157h, this.f117155f.getSelectedUsers(), this.f117155f.getUuid(), new C46543b(this, function0));
    }

    /* renamed from: a */
    public final boolean mo163480a(DataSource dataSource) {
        int i;
        int i2;
        List<MmParticipants.MmParticipantInfo> list;
        int i3;
        int i4;
        List<MmParticipants.MmParticipantInfo> list2;
        Intrinsics.checkParameterIsNotNull(dataSource, "ds");
        int i5 = C46586c.f117231a[dataSource.ordinal()];
        if (i5 == 1 || i5 == 2) {
            MmParticipants participantsData = this.f117155f.getParticipantsData();
            if (participantsData != null) {
                i = participantsData.getTotal();
            } else {
                i = 0;
            }
            MmParticipants participantsData2 = this.f117155f.getParticipantsData();
            if (participantsData2 == null || (list = participantsData2.getList()) == null) {
                i2 = 0;
            } else {
                i2 = list.size();
            }
            if (i > i2) {
                return true;
            }
        } else if (i5 == 3 || i5 == 4) {
            MmParticipants suggestionData = this.f117155f.getSuggestionData();
            if (suggestionData != null) {
                i3 = suggestionData.getTotal();
            } else {
                i3 = 0;
            }
            MmParticipants suggestionData2 = this.f117155f.getSuggestionData();
            if (suggestionData2 == null || (list2 = suggestionData2.getList()) == null) {
                i4 = 0;
            } else {
                i4 = list2.size();
            }
            if (i3 > i4) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private final void m184101a(int i, int i2) {
        C47057a.m186246a(this.f117156g, this.f117157h, i, i2, new C46546e(this, i));
    }

    /* renamed from: b */
    private final void m184102b(int i, int i2) {
        C47057a.m186279c(this.f117156g, this.f117157h, i, i2, new C46547f(this, i));
    }

    /* renamed from: a */
    public final void mo163476a(String str, Function1<? super List<? extends MmParticipants.MmParticipantInfo>, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(str, SearchIntents.EXTRA_QUERY);
        Intrinsics.checkParameterIsNotNull(function1, "onSuccess");
        C47057a.m186275b(this.f117156g, this.f117157h, str, this.f117155f.getUuid(), new C46548g(this, function1));
    }

    /* renamed from: a */
    public final <T> Disposable mo163474a(DataSource dataSource, Function1<? super T, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(dataSource, ShareHitPoint.f121868c);
        Intrinsics.checkParameterIsNotNull(function1, "onChanged");
        Observable<R> map = this.f117154b.filter(new C46549h(dataSource)).map(C46550i.f117174a);
        IMmDepend a = C45899c.m181859a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
        IMmDepend.AbstractC45893s threadDepend = a.getThreadDepend();
        Intrinsics.checkExpressionValueIsNotNull(threadDepend, "MmDepend.impl().threadDepend");
        Disposable subscribe = map.subscribeOn(threadDepend.mo144598a()).observeOn(AndroidSchedulers.mainThread()).subscribe(new C46551j(function1));
        Intrinsics.checkExpressionValueIsNotNull(subscribe, "dataSubject\n            …(data as T)\n            }");
        return subscribe;
    }

    /* renamed from: b */
    public final void mo163483b(String str, Function1<? super String, Unit> function1) {
        List<MmParticipants.MmParticipantInfo> list;
        T t;
        MmParticipants participantsData;
        List<MmParticipants.MmParticipantInfo> list2;
        MmParticipants participantsData2 = this.f117155f.getParticipantsData();
        if (!(participantsData2 == null || (list = participantsData2.getList()) == null)) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                T t2 = t;
                Intrinsics.checkExpressionValueIsNotNull(t2, "it");
                if (Intrinsics.areEqual(t2.getUserId(), str)) {
                    break;
                }
            }
            T t3 = t;
            if (!(t3 == null || (participantsData = this.f117155f.getParticipantsData()) == null || (list2 = participantsData.getList()) == null)) {
                list2.remove(t3);
            }
        }
        function1.invoke("");
    }

    public ParticipantRepo(String str, String str2, MmBaseInfo mmBaseInfo) {
        Intrinsics.checkParameterIsNotNull(str, "host");
        Intrinsics.checkParameterIsNotNull(str2, "objectToken");
        Intrinsics.checkParameterIsNotNull(mmBaseInfo, "baseInfo");
        this.f117156g = str;
        this.f117157h = str2;
        this.f117158i = mmBaseInfo;
        C68296b<Pair<DataSource, ?>> a = C68296b.m265052a();
        Intrinsics.checkExpressionValueIsNotNull(a, "PublishSubject.create<Pair<DataSource, *>>()");
        this.f117154b = a;
    }

    /* renamed from: a */
    public final void mo163477a(String str, Function1<? super MmParticipants.MmParticipantInfo, Unit> function1, Function1<? super C47068a, Unit> function12) {
        Intrinsics.checkParameterIsNotNull(str, "userName");
        Intrinsics.checkParameterIsNotNull(function1, "success");
        Intrinsics.checkParameterIsNotNull(function12, "error");
        C47057a.m186282c(this.f117156g, this.f117157h, this.f117155f.getUuid(), str, new C46544c(this, function1, function12));
    }

    /* renamed from: a */
    public final void mo163475a(String str, String str2, Integer num, String str3, Function1<? super String, Unit> function1) {
        String str4;
        int i;
        String str5;
        Intrinsics.checkParameterIsNotNull(str, "token");
        Intrinsics.checkParameterIsNotNull(function1, "onResponse");
        IMmDepend a = C45899c.m181859a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
        IMmDepend.AbstractC45875c domainDepend = a.getDomainDepend();
        Intrinsics.checkExpressionValueIsNotNull(domainDepend, "MmDepend.impl().domainDepend");
        String a2 = domainDepend.mo144616a();
        if (str2 != null) {
            str4 = str2;
        } else {
            str4 = "";
        }
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        if (str3 != null) {
            str5 = str3;
        } else {
            str5 = "";
        }
        C47057a.m186254a(a2, str, str4, i, str5, new C46545d(this, str3, function1));
    }
}
