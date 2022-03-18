package com.bytedance.ee.bear.middleground.feed.statistics;

import android.os.SystemClock;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.contract.AbstractC5238z;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.C5102ai;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.net.C5202c;
import com.bytedance.ee.bear.contract.net.C5203d;
import com.bytedance.ee.bear.document.AbstractC6158t;
import com.bytedance.ee.bear.middleground.feed.data.FeedInfo;
import com.bytedance.ee.bear.middleground.feed.export.bean.DocFeed;
import com.bytedance.ee.bear.middleground.feed.p453a.C9420b;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13748k;
import com.google.firebase.messaging.Constants;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0015\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010#\u001a\u00020$2\b\b\u0001\u0010%\u001a\u00020\bJ\u0006\u0010&\u001a\u00020$J\u0006\u0010'\u001a\u00020$J\u0006\u0010(\u001a\u00020$J\u0006\u0010)\u001a\u00020$J\u0006\u0010*\u001a\u00020$J\u0006\u0010+\u001a\u00020$J\u0006\u0010,\u001a\u00020$J\u0006\u0010-\u001a\u00020$J\n\u0010.\u001a\u0004\u0018\u00010\u000eH\u0002J\b\u0010/\u001a\u00020$H\u0002J\u001e\u00100\u001a\u00020$2\u0016\u00101\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u000102J\u0010\u00103\u001a\u00020\b2\b\u00104\u001a\u0004\u0018\u000105J\u001c\u00106\u001a\u00020$2\b\b\u0001\u00107\u001a\u00020\b2\n\b\u0002\u00108\u001a\u0004\u0018\u00010\bJ&\u00109\u001a\u00020$2\b\b\u0001\u0010%\u001a\u00020\b2\b\b\u0001\u0010:\u001a\u00020\b2\b\b\u0001\u00107\u001a\u00020\bH\u0002J\u001c\u0010;\u001a\u00020$2\b\b\u0001\u0010:\u001a\u00020\b2\b\b\u0001\u00107\u001a\u00020\bH\u0002J\u0006\u0010<\u001a\u00020$J\u0010\u0010=\u001a\u00020$2\b\b\u0001\u00107\u001a\u00020\bJ\u0006\u0010>\u001a\u00020$J\b\u0010?\u001a\u00020$H\u0002J\u0010\u0010@\u001a\u00020\b2\b\u00104\u001a\u0004\u0018\u000105J\u001a\u0010A\u001a\u00020$2\b\b\u0001\u0010%\u001a\u00020\b2\b\b\u0001\u00107\u001a\u00020\bJ\u0010\u0010B\u001a\u00020$2\b\b\u0001\u0010%\u001a\u00020\bJ\u0006\u0010C\u001a\u00020$J\u0010\u0010D\u001a\u00020$2\b\u0010E\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010F\u001a\u00020$2\b\u0010G\u001a\u0004\u0018\u00010\u0011J\u0006\u0010H\u001a\u00020$J\b\u0010I\u001a\u00020$H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0017\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u000e\u0010\u0019\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u001a\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u000e\u0010\u001c\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u001d\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u000e\u0010\u001f\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006J"}, d2 = {"Lcom/bytedance/ee/bear/middleground/feed/statistics/FeedReportV2;", "", "()V", "DEBUG", "", "OPEN_FEED_TIMEOUT", "", "TAG", "", "ZERO", "", "openLarkFeedTimeoutRunnable", "Ljava/lang/Runnable;", "sFeedData", "Lcom/bytedance/ee/bear/middleground/feed/data/Data;", "sFeedDataFromNotify", "sFeedInfo", "Lcom/bytedance/ee/bear/middleground/feed/data/FeedInfo;", "sFromLarkFeed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getSFromLarkFeed", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "sHasReportOpenResult", "sHasSetFeeShow", "getSHasSetFeeShow", "sHasSetFeedData", "sHasSetFeedDataFromDB", "getSHasSetFeedDataFromDB", "sHasSetFeedDataFromNotify", "sHasSetFeedDataFromRN", "getSHasSetFeedDataFromRN", "sHasSetFeedInfo", "sServiceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "timeCount", "beginCollectStageData", "", "stage", "clearFeedDataFromNotify", "clearFeedDataOnlyOnce", "collectOpenFeedTimeSinceFeedShowStart", "collectOpenFeedTimeSinceHandleDataFromDB", "collectOpenFeedTimeSinceHandleDataFromJS", "collectOpenFeedTimeSinceLarkFeedClick", "collectOpenFeedTimeSinceVCOnCreate", "collectOpenFeedTimeSinceViewOnCreated", "getFeedData", "inTheEnd", "mergeCommonFields", "map", "", "reportCheckPermissionFailedError", "throwable", "", "reportFeedError", "resultCode", "customErrno", "reportFeedStage", "resultValue", "reportOpenFeedResult", "reportOpenLarkFeedCancel", "reportOpenLarkFeedFailed", "reportOpenLarkFeedSuccess", "reportOpenLarkFeedTimeout", "reportPullDataFromNetworkFailedError", "reportStageFailed", "reportStageSuccess", "reset", "setFeedDataOnlyOnce", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "setFeedInfoOnlyOnce", "feedInfo", "startOpenLarkFeedTimeoutMonitor", "stopOpenLarkFeedTimeoutMonitor", "middleground-feed_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.feed.c.a */
public final class FeedReportV2 {

    /* renamed from: a */
    public static final FeedReportV2 f25356a = new FeedReportV2();

    /* renamed from: b */
    private static boolean f25357b;

    /* renamed from: c */
    private static long f25358c;

    /* renamed from: d */
    private static FeedInfo f25359d;

    /* renamed from: e */
    private static C9420b f25360e;

    /* renamed from: f */
    private static C9420b f25361f;

    /* renamed from: g */
    private static final C10917c f25362g = new C10917c(new C10929e());

    /* renamed from: h */
    private static final AtomicBoolean f25363h = new AtomicBoolean(false);

    /* renamed from: i */
    private static final AtomicBoolean f25364i = new AtomicBoolean(false);

    /* renamed from: j */
    private static final AtomicBoolean f25365j = new AtomicBoolean(false);

    /* renamed from: k */
    private static final AtomicBoolean f25366k = new AtomicBoolean(false);

    /* renamed from: l */
    private static final AtomicBoolean f25367l = new AtomicBoolean(false);

    /* renamed from: m */
    private static final AtomicBoolean f25368m = new AtomicBoolean(false);

    /* renamed from: n */
    private static final AtomicBoolean f25369n = new AtomicBoolean(false);

    /* renamed from: o */
    private static final AtomicBoolean f25370o = new AtomicBoolean(false);

    /* renamed from: p */
    private static final Runnable f25371p = RunnableC9436a.f25372a;

    private FeedReportV2() {
    }

    /* renamed from: q */
    private final void m39038q() {
        m39039r();
    }

    /* renamed from: a */
    public final AtomicBoolean mo35952a() {
        return f25367l;
    }

    /* renamed from: b */
    public final AtomicBoolean mo35959b() {
        return f25368m;
    }

    /* renamed from: c */
    public final AtomicBoolean mo35962c() {
        return f25369n;
    }

    /* renamed from: d */
    public final AtomicBoolean mo35964d() {
        return f25370o;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.feed.c.a$a */
    static final class RunnableC9436a implements Runnable {

        /* renamed from: a */
        public static final RunnableC9436a f25372a = new RunnableC9436a();

        RunnableC9436a() {
        }

        public final void run() {
            FeedReportV2.f25356a.mo35974n();
        }
    }

    /* renamed from: p */
    private final C9420b m39037p() {
        C9420b bVar = f25361f;
        if (bVar != null) {
            return bVar;
        }
        return f25360e;
    }

    /* renamed from: r */
    private final void m39039r() {
        C13748k.m55735c(f25371p);
    }

    /* renamed from: l */
    public final void mo35972l() {
        m39036c("success", "NB0");
        m39038q();
    }

    /* renamed from: m */
    public final void mo35973m() {
        m39036c("cancel", "NB1");
        m39038q();
    }

    /* renamed from: n */
    public final void mo35974n() {
        m39036c("timeout", "NB2");
        m39038q();
    }

    /* renamed from: g */
    public final void mo35967g() {
        try {
            AbstractC5233x b = C5234y.m21391b();
            Intrinsics.checkExpressionValueIsNotNull(b, "AnalyticServiceImp.getInstance()");
            b.mo21078a("tag_doc_feedopen_feed_from_larkfeed", "key_open_start_vc_oncreate", String.valueOf(SystemClock.uptimeMillis()));
        } catch (Throwable th) {
            C13479a.m54761a("Feed_FeedReportV2", th);
        }
    }

    /* renamed from: h */
    public final void mo35968h() {
        try {
            AbstractC5233x b = C5234y.m21391b();
            Intrinsics.checkExpressionValueIsNotNull(b, "AnalyticServiceImp.getInstance()");
            b.mo21078a("tag_doc_feedopen_feed_from_larkfeed", "key_open_start_view_oncreated", String.valueOf(SystemClock.uptimeMillis()));
        } catch (Throwable th) {
            C13479a.m54761a("Feed_FeedReportV2", th);
        }
    }

    /* renamed from: j */
    public final void mo35970j() {
        try {
            AbstractC5233x b = C5234y.m21391b();
            Intrinsics.checkExpressionValueIsNotNull(b, "AnalyticServiceImp.getInstance()");
            b.mo21078a("tag_doc_feedopen_feed_from_larkfeed", "key_feed_handle_data_from_DB", String.valueOf(SystemClock.uptimeMillis()));
        } catch (Throwable th) {
            C13479a.m54761a("Feed_FeedReportV2", th);
        }
    }

    /* renamed from: k */
    public final void mo35971k() {
        try {
            AbstractC5233x b = C5234y.m21391b();
            Intrinsics.checkExpressionValueIsNotNull(b, "AnalyticServiceImp.getInstance()");
            b.mo21078a("tag_doc_feedopen_feed_from_larkfeed", "key_feed_handle_data_from_JS", String.valueOf(SystemClock.uptimeMillis()));
        } catch (Throwable th) {
            C13479a.m54761a("Feed_FeedReportV2", th);
        }
    }

    /* renamed from: o */
    public final void mo35975o() {
        m39039r();
        FeedInfo dVar = f25359d;
        if (dVar != null) {
            Boolean.valueOf(dVar.mo35912h()).booleanValue();
        }
        C13748k.m55733a(f25371p, 30000);
    }

    /* renamed from: e */
    public final void mo35965e() {
        f25359d = null;
        C9420b bVar = null;
        f25360e = bVar;
        f25361f = bVar;
        f25358c = 0;
        f25363h.compareAndSet(true, false);
        f25364i.compareAndSet(true, false);
        f25365j.compareAndSet(true, false);
        f25366k.compareAndSet(true, false);
        f25367l.set(false);
        f25368m.set(false);
        f25369n.set(false);
        f25370o.set(false);
        m39039r();
    }

    /* renamed from: f */
    public final void mo35966f() {
        try {
            AbstractC5233x b = C5234y.m21391b();
            Intrinsics.checkExpressionValueIsNotNull(b, "AnalyticServiceImp.getInstance()");
            b.mo21077a("tag_doc_feedopen_feed_from_larkfeed");
            b.mo21078a("tag_doc_feedopen_feed_from_larkfeed", "key_open_start_click_lark_feed", String.valueOf(SystemClock.uptimeMillis()));
        } catch (Throwable th) {
            C13479a.m54761a("Feed_FeedReportV2", th);
        }
    }

    /* renamed from: i */
    public final void mo35969i() {
        try {
            f25369n.set(true);
            AbstractC5233x b = C5234y.m21391b();
            Intrinsics.checkExpressionValueIsNotNull(b, "AnalyticServiceImp.getInstance()");
            b.mo21078a("tag_doc_feedopen_feed_from_larkfeed", "key_open_feed_show_start", String.valueOf(SystemClock.uptimeMillis()));
        } catch (Throwable th) {
            C13479a.m54761a("Feed_FeedReportV2", th);
        }
    }

    /* renamed from: b */
    public final void mo35960b(@DocFeed.Value.Stage String str) {
        Intrinsics.checkParameterIsNotNull(str, "stage");
        m39035a(str, "success", "NB0");
    }

    /* renamed from: a */
    public final void mo35953a(C9420b bVar) {
        if (!f25365j.getAndSet(true)) {
            f25360e = bVar;
        }
    }

    /* renamed from: a */
    public final void mo35954a(FeedInfo dVar) {
        if (!f25364i.getAndSet(true)) {
            f25359d = dVar;
        }
    }

    /* renamed from: c */
    public final void mo35963c(@DocFeed.Value.Stage String str) {
        Intrinsics.checkParameterIsNotNull(str, "stage");
        try {
            AbstractC5233x b = C5234y.m21391b();
            Intrinsics.checkExpressionValueIsNotNull(b, "AnalyticServiceImp.getInstance()");
            b.mo21077a(str);
            b.mo21078a(str, "key_doc_feed", String.valueOf(SystemClock.uptimeMillis()));
        } catch (Throwable th) {
            C13479a.m54761a("Feed_FeedReportV2", th);
        }
    }

    /* renamed from: a */
    public final void mo35955a(@DocFeed.Value.ResultCode String str) {
        Intrinsics.checkParameterIsNotNull(str, "resultCode");
        m39036c("fail", str);
        m39038q();
    }

    /* renamed from: b */
    public final String mo35958b(Throwable th) {
        if (th == null) {
            mo35961b("NB210", "null_throwable");
            return "NB210";
        } else if (C5203d.m21235a(th, 4)) {
            m39034a(this, "NB201", null, 2, null);
            mo35956a("stage_native_pull_data", "NB201");
            mo35955a("NB201");
            return "NB201";
        } else if (th instanceof NetService.ParseException) {
            m39034a(this, "NB203", null, 2, null);
            return "NB203";
        } else {
            int a = C5203d.m21234a(th);
            if (a != -1) {
                mo35961b("NB204", String.valueOf(a));
                return "NB204";
            }
            int a2 = C5202c.m21233a(th);
            if (a2 != -3) {
                mo35961b("NB202", String.valueOf(a2));
                return "NB202";
            } else if (!(th instanceof NetService.HttpErrorException)) {
                mo35961b("NB209", th.getMessage());
                return "NB209";
            } else {
                mo35961b("NB205", String.valueOf(((NetService.HttpErrorException) th).getCode()));
                return "NB205";
            }
        }
    }

    /* renamed from: a */
    public final String mo35951a(Throwable th) {
        if (th == null) {
            mo35961b("NB110", "null_throwable");
            return "NB110";
        } else if (C5203d.m21235a(th, 4)) {
            m39034a(this, "NB101", null, 2, null);
            mo35956a("stage_native_check_permission", "NB101");
            mo35955a("NB101");
            return "NB101";
        } else if (th instanceof NetService.ParseException) {
            m39034a(this, "NB103", null, 2, null);
            return "NB103";
        } else {
            int a = C5203d.m21234a(th);
            if (a != -1) {
                mo35961b("NB104", String.valueOf(a) + "");
                return "NB104";
            }
            int a2 = C5202c.m21233a(th);
            if (a2 != -3) {
                mo35961b("NB102", String.valueOf(a2) + "");
                return "NB102";
            } else if (!(th instanceof NetService.HttpErrorException)) {
                mo35961b("NB109", th.getMessage());
                return "NB109";
            } else {
                int code = ((NetService.HttpErrorException) th).getCode();
                mo35961b("NB105", String.valueOf(code) + "");
                return "NB105";
            }
        }
    }

    /* renamed from: a */
    public final void mo35957a(Map<String, Object> map) {
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        boolean z;
        if (map != null) {
            FeedInfo dVar = f25359d;
            if (dVar != null) {
                i = dVar.mo35910f();
            } else {
                i = 0;
            }
            FeedInfo dVar2 = f25359d;
            String str6 = null;
            if (dVar2 != null) {
                str = dVar2.mo35907d();
            } else {
                str = null;
            }
            String str7 = "";
            if (str == null) {
                str = str7;
            }
            FeedInfo dVar3 = f25359d;
            if (dVar3 != null) {
                str2 = dVar3.mo35905b();
            } else {
                str2 = null;
            }
            if (str2 == null) {
                str2 = str7;
            }
            map.put("file_id", str2);
            FeedInfo dVar4 = f25359d;
            if (dVar4 != null) {
                str3 = dVar4.mo35904a();
            } else {
                str3 = null;
            }
            if (str3 == null) {
                str3 = str7;
            }
            map.put("file_type", str3);
            map.put("file_length", 0);
            map.put("file_lines", 0);
            map.put("scm_version", ((AbstractC6158t) KoinJavaComponent.m268613a(AbstractC6158t.class, null, null, 6, null)).mo20315a());
            AbstractC5238z j = C5102ai.m20872j();
            Intrinsics.checkExpressionValueIsNotNull(j, "DocumentSdkVisibleServiceImpl.getInstance()");
            map.put("is_doze", Boolean.valueOf(j.mo20214f()));
            map.put("app_visible", Boolean.valueOf(C5102ai.m20872j().mo20212d()));
            ConnectionService d = C5084ad.m20847d();
            Intrinsics.checkExpressionValueIsNotNull(d, "ConnectionServiceImp.getInstance()");
            map.put("network_state", d.mo20039c());
            map.put("feed_unread_badge_count", Integer.valueOf(i));
            FeedInfo dVar5 = f25359d;
            if (dVar5 != null) {
                str4 = dVar5.mo35906c();
            } else {
                str4 = null;
            }
            if (str4 == null) {
                str4 = str7;
            }
            map.put("feed_id", str4);
            C9420b p = m39037p();
            if (p != null) {
                str5 = p.f25321a;
            } else {
                str5 = null;
            }
            if (str5 == null) {
                str5 = str7;
            }
            map.put("feed_data_source", str5);
            FeedInfo dVar6 = f25359d;
            if (dVar6 != null) {
                str6 = dVar6.mo35908e();
            }
            if (str6 != null) {
                str7 = str6;
            }
            map.put("feed_open_from", str7);
            FeedInfo dVar7 = f25359d;
            if (dVar7 != null) {
                z = Boolean.valueOf(dVar7.mo35912h());
            } else {
                z = false;
            }
            map.put("feed_is_auto_show", z);
            map.put("feed_msg_type", str);
        }
    }

    /* renamed from: b */
    public final void mo35961b(@DocFeed.Value.ResultCode String str, String str2) {
        FeedInfo dVar;
        Intrinsics.checkParameterIsNotNull(str, "resultCode");
        String str3 = null;
        if (!f25363h.get() && (dVar = f25359d) != null) {
            boolean z = true;
            if (dVar.mo35911g()) {
                try {
                    AbstractC5233x b = C5234y.m21391b();
                    Intrinsics.checkExpressionValueIsNotNull(b, "AnalyticServiceImp.getInstance()");
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("result_key", "fail");
                    linkedHashMap.put("result_code", str);
                    if (str2 != null) {
                        String str4 = str2;
                        if (str4.length() != 0) {
                            z = false;
                        }
                        if (z) {
                            str4 = "error_null";
                        }
                        str3 = str4;
                    }
                    linkedHashMap.put("http_errno", str3);
                    mo35957a(linkedHashMap);
                    b.mo21079a("dev_performance_feed_open_error", linkedHashMap);
                    C13479a.m54758a("Feed_FeedReportV2", "Error: " + linkedHashMap);
                    return;
                } catch (Throwable th) {
                    C13479a.m54761a("Feed_FeedReportV2", th);
                    return;
                }
            }
        }
        if (f25357b) {
            StringBuilder sb = new StringBuilder();
            sb.append("reportFeedError: isLarkFeed = ");
            FeedInfo dVar2 = f25359d;
            if (dVar2 != null) {
                str3 = Boolean.valueOf(dVar2.mo35911g());
            }
            sb.append(str3);
            sb.append(", don't report to TEA; resultCode = ");
            sb.append(str);
            sb.append(", customErrno = ");
            if (str2 == null) {
                str2 = "";
            }
            sb.append(str2);
            C13479a.m54772d("Feed_FeedReportV2", sb.toString());
        }
        mo35965e();
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x006a A[Catch:{ all -> 0x020c }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01f3 A[Catch:{ all -> 0x020a }] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m39036c(@com.bytedance.ee.bear.middleground.feed.export.bean.DocFeed.Value.Result java.lang.String r22, @com.bytedance.ee.bear.middleground.feed.export.bean.DocFeed.Value.ResultCode java.lang.String r23) {
        /*
        // Method dump skipped, instructions count: 534
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.middleground.feed.statistics.FeedReportV2.m39036c(java.lang.String, java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo35956a(@DocFeed.Value.Stage String str, @DocFeed.Value.ResultCode String str2) {
        Intrinsics.checkParameterIsNotNull(str, "stage");
        Intrinsics.checkParameterIsNotNull(str2, "resultCode");
        m39035a(str, "fail", str2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x004e A[Catch:{ all -> 0x00a5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a4 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m39035a(@com.bytedance.ee.bear.middleground.feed.export.bean.DocFeed.Value.Stage java.lang.String r8, @com.bytedance.ee.bear.middleground.feed.export.bean.DocFeed.Value.Result java.lang.String r9, @com.bytedance.ee.bear.middleground.feed.export.bean.DocFeed.Value.ResultCode java.lang.String r10) {
        /*
        // Method dump skipped, instructions count: 234
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.middleground.feed.statistics.FeedReportV2.m39035a(java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* renamed from: a */
    public static /* synthetic */ void m39034a(FeedReportV2 aVar, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        aVar.mo35961b(str, str2);
    }
}
