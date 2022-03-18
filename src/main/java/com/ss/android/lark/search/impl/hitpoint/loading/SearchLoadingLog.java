package com.ss.android.lark.search.impl.hitpoint.loading;

import android.util.SparseArray;
import com.ss.android.lark.searchcommon.p2634b.C53883a;
import com.ss.android.lark.statistics.Statistics;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u001b\u001cB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u000bH\u0016J\b\u0010\u0012\u001a\u00020\u000bH\u0016J \u0010\u0013\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0006H\u0016J\u0018\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J \u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0004H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u00048BX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/search/impl/hitpoint/loading/SearchLoadingLog;", "Lcom/ss/android/lark/search/impl/hitpoint/loading/ISearchLoadingLog;", "()V", "TAG", "", "loadMoreStartTime", "", "netSession", "getNetSession", "()Ljava/lang/String;", "loadMoreBegin", "", "loadMoreEnd", "resultType", "", "isRemote", "", "loadMoreReset", "reportChatSearchImageLoadEnd", "reportDetailSearchRefreshUILog", "timeDelay", "reportFps", "fps", "", "reportMainSearchRefreshUILog", "location", "dataSource", "Constants", "Mapping", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.search.impl.c.a.a */
public final class SearchLoadingLog {

    /* renamed from: a */
    public static final SearchLoadingLog f131887a = new SearchLoadingLog();

    /* renamed from: b */
    private static long f131888b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/search/impl/hitpoint/loading/SearchLoadingLog$Mapping;", "", "()V", "Companion", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.impl.c.a.a$a */
    public static final class Mapping {

        /* renamed from: a */
        public static final Lazy f131889a = LazyKt.lazy(C53362b.INSTANCE);

        /* renamed from: b */
        public static final Companion f131890b = new Companion(null);

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048FX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/search/impl/hitpoint/loading/SearchLoadingLog$Mapping$Companion;", "", "()V", "RESULT_TYPE_2_LOCATION", "Landroid/util/SparseArray;", "", "getRESULT_TYPE_2_LOCATION", "()Landroid/util/SparseArray;", "RESULT_TYPE_2_LOCATION$delegate", "Lkotlin/Lazy;", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.search.impl.c.a.a$a$a */
        public static final class Companion {
            /* renamed from: a */
            public final SparseArray<String> mo182032a() {
                Lazy lazy = Mapping.f131889a;
                Companion aVar = Mapping.f131890b;
                return (SparseArray) lazy.getValue();
            }

            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/util/SparseArray;", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.search.impl.c.a.a$a$b */
        static final class C53362b extends Lambda implements Function0<SparseArray<String>> {
            public static final C53362b INSTANCE = new C53362b();

            C53362b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final SparseArray<String> invoke() {
                SparseArray<String> sparseArray = new SparseArray<>();
                sparseArray.put(3, "message");
                sparseArray.put(1, "contact");
                sparseArray.put(2, "group");
                sparseArray.put(10, "helpdesk");
                sparseArray.put(12, "app");
                sparseArray.put(13, "message");
                sparseArray.put(10000001, "message");
                return sparseArray;
            }
        }
    }

    private SearchLoadingLog() {
    }

    /* renamed from: b */
    public void mo182030b() {
        f131888b = 0;
    }

    /* renamed from: c */
    public void mo182031c() {
        f131888b = System.currentTimeMillis();
    }

    /* renamed from: d */
    private final String m206560d() {
        C53883a a = C53883a.m208794a();
        Intrinsics.checkExpressionValueIsNotNull(a, "NetSearchSessionManager.getInstance()");
        String b = a.mo183799b();
        Intrinsics.checkExpressionValueIsNotNull(b, "NetSearchSessionManager.…tInstance().searchSession");
        return b;
    }

    /* renamed from: a */
    public void mo182026a() {
        long currentTimeMillis = System.currentTimeMillis() - f131888b;
        if (currentTimeMillis > 0) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("return_data_time", currentTimeMillis);
            Statistics.sendEvent("chat_history_view_picture", jSONObject);
        }
    }

    /* renamed from: a */
    public void mo182027a(int i, double d) {
        String str;
        int i2 = (int) d;
        if (i2 > 0 && (str = Mapping.f131890b.mo182032a().get(i)) != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("location", str);
            jSONObject.put("fps", i2);
            Statistics.sendEvent("view_search_result_roll_fps", jSONObject);
        }
    }

    /* renamed from: a */
    public void mo182028a(int i, boolean z) {
        String str;
        if (f131888b > 0) {
            long currentTimeMillis = System.currentTimeMillis() - f131888b;
            if (currentTimeMillis > 0) {
                String str2 = Mapping.f131890b.mo182032a().get(i);
                if (z) {
                    str = "server";
                } else if (!z) {
                    str = "local";
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                if (str2 != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("location", str2);
                    jSONObject.put("time", currentTimeMillis);
                    jSONObject.put("result_type", str);
                    Statistics.sendEvent("view_search_result", jSONObject);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo182029a(int i, boolean z, long j) {
        String str;
        String str2 = Mapping.f131890b.mo182032a().get(i);
        if (z) {
            str = "server";
        } else if (!z) {
            str = "local";
        } else {
            throw new NoWhenBranchMatchedException();
        }
        if (str2 != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("location", str2);
            jSONObject.put("time", j);
            jSONObject.put("result_type", str);
            jSONObject.put("session_id", f131887a.m206560d());
            Statistics.sendEvent("search_time", jSONObject);
        }
    }
}
