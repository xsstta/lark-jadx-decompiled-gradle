package com.ss.android.openbusiness.bot.list;

import android.app.Application;
import androidx.lifecycle.C1150b;
import androidx.lifecycle.C1177w;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R)\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u00068FX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/ss/android/openbusiness/bot/list/GroupBotListViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "mBotList", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/ss/android/openbusiness/bot/net/data/Bot;", "getMBotList", "()Landroidx/lifecycle/MutableLiveData;", "mBotList$delegate", "Lkotlin/Lazy;", "triggerReload", "", "chatId", "", "Companion", "openbusiness_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.openbusiness.bot.list.b */
public final class GroupBotListViewModel extends C1150b {
    public static final Companion Companion = new Companion(null);
    private final Lazy mBotList$delegate = LazyKt.lazy(C59532b.INSTANCE);

    public final C1177w<List<Bot>> getMBotList() {
        return (C1177w) this.mBotList$delegate.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/openbusiness/bot/list/GroupBotListViewModel$Companion;", "", "()V", "TAG", "", "openbusiness_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.openbusiness.bot.list.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/ss/android/openbusiness/bot/net/data/Bot;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.openbusiness.bot.list.b$b */
    static final class C59532b extends Lambda implements Function0<C1177w<List<Bot>>> {
        public static final C59532b INSTANCE = new C59532b();

        C59532b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C1177w<List<Bot>> invoke() {
            return new C1177w<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/openbusiness/bot/list/GroupBotListViewModel$triggerReload$1", "Lcom/ss/android/openbusiness/bot/net/IBotDataService$CallResult;", "onFail", "", "errorMsg", "", "onSuccess", "botListResult", "Lcom/ss/android/openbusiness/bot/net/data/BotListResult;", "openbusiness_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.openbusiness.bot.list.b$c */
    public static final class C59533c implements IBotDataService.CallResult {

        /* renamed from: a */
        final /* synthetic */ GroupBotListViewModel f147777a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C59533c(GroupBotListViewModel bVar) {
            this.f147777a = bVar;
        }

        @Override // com.ss.android.openbusiness.bot.net.IBotDataService.CallResult
        /* renamed from: a */
        public void mo202851a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "errorMsg");
            Log.m165383e("GroupBotListViewModel", "request bot list error: " + str);
            this.f147777a.getMBotList().mo5926a((List<Bot>) null);
            new OPMonitor("op_groupbot_pull_list_data", GroupBotMonitorCode.f147810k.mo202925b()).flush();
        }

        @Override // com.ss.android.openbusiness.bot.net.IBotDataService.CallResult
        /* renamed from: a */
        public void mo202850a(C59537a aVar) {
            List<Bot> list;
            Intrinsics.checkParameterIsNotNull(aVar, "botListResult");
            Log.m165383e("GroupBotListViewModel", "request bot list success: " + aVar.mo202921c());
            C1177w<List<Bot>> mBotList = this.f147777a.getMBotList();
            C59538b c = aVar.mo202921c();
            if (c != null) {
                list = c.mo202922a();
            } else {
                list = null;
            }
            mBotList.mo5926a(list);
            new OPMonitor("op_groupbot_pull_list_data", GroupBotMonitorCode.f147810k.mo202924a()).flush();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GroupBotListViewModel(Application application) {
        super(application);
        Intrinsics.checkParameterIsNotNull(application, "application");
    }

    public final void triggerReload(String str) {
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        GroupBotApi.f147779b.mo202883b().mo202884a(str, new C59533c(this));
    }
}
