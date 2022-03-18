package com.ss.android.openbusiness.bot.addsearch;

import android.app.Application;
import androidx.lifecycle.C1150b;
import androidx.lifecycle.C1177w;
import com.huawei.hms.actions.SearchIntents;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.opmonitor.service.OPMonitor;
import com.ss.android.openbusiness.bot.net.GroupBotApi;
import com.ss.android.openbusiness.bot.net.IBotDataService;
import com.ss.android.openbusiness.bot.net.data.Bot;
import com.ss.android.openbusiness.bot.net.data.C59537a;
import com.ss.android.openbusiness.bot.net.data.C59538b;
import com.ss.android.openbusiness.monitor.GroupBotMonitorCode;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0016\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0012R#\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068FX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR#\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068FX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\r\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/ss/android/openbusiness/bot/addsearch/AddSearchViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "mAddMutableLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/ss/android/openbusiness/bot/net/data/Data;", "getMAddMutableLiveData", "()Landroidx/lifecycle/MutableLiveData;", "mAddMutableLiveData$delegate", "Lkotlin/Lazy;", "mSearchMutableLiveData", "getMSearchMutableLiveData", "mSearchMutableLiveData$delegate", "getCanAddBotList", "", "chatId", "", "onSearch", SearchIntents.EXTRA_QUERY, "Companion", "openbusiness_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.openbusiness.bot.addsearch.a */
public final class AddSearchViewModel extends C1150b {
    public static final Companion Companion = new Companion(null);
    private final Lazy mAddMutableLiveData$delegate = LazyKt.lazy(C59517c.INSTANCE);
    private final Lazy mSearchMutableLiveData$delegate = LazyKt.lazy(C59518d.INSTANCE);

    public final C1177w<C59538b> getMAddMutableLiveData() {
        return (C1177w) this.mAddMutableLiveData$delegate.getValue();
    }

    public final C1177w<C59538b> getMSearchMutableLiveData() {
        return (C1177w) this.mSearchMutableLiveData$delegate.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/openbusiness/bot/addsearch/AddSearchViewModel$Companion;", "", "()V", "TAG", "", "openbusiness_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.openbusiness.bot.addsearch.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroidx/lifecycle/MutableLiveData;", "Lcom/ss/android/openbusiness/bot/net/data/Data;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.openbusiness.bot.addsearch.a$c */
    static final class C59517c extends Lambda implements Function0<C1177w<C59538b>> {
        public static final C59517c INSTANCE = new C59517c();

        C59517c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C1177w<C59538b> invoke() {
            return new C1177w<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroidx/lifecycle/MutableLiveData;", "Lcom/ss/android/openbusiness/bot/net/data/Data;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.openbusiness.bot.addsearch.a$d */
    static final class C59518d extends Lambda implements Function0<C1177w<C59538b>> {
        public static final C59518d INSTANCE = new C59518d();

        C59518d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C1177w<C59538b> invoke() {
            return new C1177w<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/openbusiness/bot/addsearch/AddSearchViewModel$getCanAddBotList$1", "Lcom/ss/android/openbusiness/bot/net/IBotDataService$CallResult;", "onFail", "", "errorMsg", "", "onSuccess", "botListResult", "Lcom/ss/android/openbusiness/bot/net/data/BotListResult;", "openbusiness_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.openbusiness.bot.addsearch.a$b */
    public static final class C59516b implements IBotDataService.CallResult {

        /* renamed from: a */
        final /* synthetic */ AddSearchViewModel f147745a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C59516b(AddSearchViewModel aVar) {
            this.f147745a = aVar;
        }

        @Override // com.ss.android.openbusiness.bot.net.IBotDataService.CallResult
        /* renamed from: a */
        public void mo202851a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "errorMsg");
            Log.m165383e("AddSearchViewModel", "request can add list fail " + str);
            this.f147745a.getMAddMutableLiveData().mo5926a((C59538b) null);
            new OPMonitor("op_groupbot_pull_candidate_data", GroupBotMonitorCode.f147810k.mo202927d()).flush();
        }

        @Override // com.ss.android.openbusiness.bot.net.IBotDataService.CallResult
        /* renamed from: a */
        public void mo202850a(C59537a aVar) {
            Integer num;
            List<Bot> a;
            Intrinsics.checkParameterIsNotNull(aVar, "botListResult");
            StringBuilder sb = new StringBuilder();
            sb.append("request can add list success ");
            C59538b c = aVar.mo202921c();
            if (c == null || (a = c.mo202922a()) == null) {
                num = null;
            } else {
                num = Integer.valueOf(a.size());
            }
            sb.append(num);
            Log.m165389i("AddSearchViewModel", sb.toString());
            this.f147745a.getMAddMutableLiveData().mo5926a(aVar.mo202921c());
            new OPMonitor("op_groupbot_pull_candidate_data", GroupBotMonitorCode.f147810k.mo202926c()).flush();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddSearchViewModel(Application application) {
        super(application);
        Intrinsics.checkParameterIsNotNull(application, "application");
    }

    public final void getCanAddBotList(String str) {
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        Log.m165389i("AddSearchViewModel", "request can add bot list");
        GroupBotApi.f147779b.mo202883b().mo202886b(str, new C59516b(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/openbusiness/bot/addsearch/AddSearchViewModel$onSearch$1", "Lcom/ss/android/openbusiness/bot/net/IBotDataService$CallResult;", "onFail", "", "errorMsg", "", "onSuccess", "botListResult", "Lcom/ss/android/openbusiness/bot/net/data/BotListResult;", "openbusiness_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.openbusiness.bot.addsearch.a$e */
    public static final class C59519e implements IBotDataService.CallResult {

        /* renamed from: a */
        final /* synthetic */ AddSearchViewModel f147746a;

        /* renamed from: b */
        final /* synthetic */ String f147747b;

        @Override // com.ss.android.openbusiness.bot.net.IBotDataService.CallResult
        /* renamed from: a */
        public void mo202851a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "errorMsg");
            Log.m165389i("AddSearchViewModel", "search bot fail, " + str);
            this.f147746a.getMSearchMutableLiveData().mo5926a((C59538b) null);
            new OPMonitor("op_groupbot_search_data", GroupBotMonitorCode.f147810k.mo202929f()).flush();
        }

        @Override // com.ss.android.openbusiness.bot.net.IBotDataService.CallResult
        /* renamed from: a */
        public void mo202850a(C59537a aVar) {
            Integer num;
            List<Bot> a;
            Intrinsics.checkParameterIsNotNull(aVar, "botListResult");
            StringBuilder sb = new StringBuilder();
            sb.append("search bot success ");
            sb.append(this.f147747b);
            sb.append((char) 65292);
            C59538b c = aVar.mo202921c();
            if (c == null || (a = c.mo202922a()) == null) {
                num = null;
            } else {
                num = Integer.valueOf(a.size());
            }
            sb.append(num);
            Log.m165389i("AddSearchViewModel", sb.toString());
            this.f147746a.getMSearchMutableLiveData().mo5926a(aVar.mo202921c());
            new OPMonitor("op_groupbot_search_data", GroupBotMonitorCode.f147810k.mo202928e()).flush();
        }

        C59519e(AddSearchViewModel aVar, String str) {
            this.f147746a = aVar;
            this.f147747b = str;
        }
    }

    public final void onSearch(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, SearchIntents.EXTRA_QUERY);
        Intrinsics.checkParameterIsNotNull(str2, "chatId");
        Log.m165389i("AddSearchViewModel", "search bot " + str);
        GroupBotApi.f147779b.mo202883b().mo202885a(str, str2, new C59519e(this, str));
    }
}
