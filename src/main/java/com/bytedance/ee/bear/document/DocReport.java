package com.bytedance.ee.bear.document;

import android.app.Application;
import android.app.KeyguardManager;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.ee.bear.browser.C4927f;
import com.bytedance.ee.bear.connection.C4974b;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.contract.AbstractC5238z;
import com.bytedance.ee.bear.contract.C5102ai;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.contract.al;
import com.bytedance.ee.bear.contract.doc.C5130a;
import com.bytedance.ee.bear.document.offline.C5890a;
import com.bytedance.ee.bear.middleground.drive.export.NetworkLevel;
import com.bytedance.ee.bear.middleground.drive.p452a.AbstractC9349a;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.common.C13608f;
import com.bytedance.ee.util.deviceinfo.DeviceInfoDetector;
import com.bytedance.ee.util.p700c.C13598b;
import com.bytedance.ee.util.p701d.C13615c;
import com.bytedance.ee.util.p701d.C13631k;
import com.bytedance.framwork.core.monitor.MonitorUtils;
import com.bytedance.lynx.webview.TTWebSdk;
import com.bytedance.lynx.webview.internal.C20011y;
import com.bytedance.ttnet.TTNetInit;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.util.share_preference.UserSP;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010$\n\u0002\b\f\u0018\u0000 C2\u00020\u0001:\u0004CDEFB-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0010\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0002J\b\u0010*\u001a\u00020\u000bH\u0002J\u000e\u0010+\u001a\u00020\u00132\u0006\u0010,\u001a\u00020-J\u001e\u0010.\u001a\u00020'2\u0006\u0010/\u001a\u00020\u00132\u0006\u00100\u001a\u00020\u00162\u0006\u00101\u001a\u00020\u000bJ\u0006\u00102\u001a\u00020'J\u0016\u00103\u001a\u00020'2\u0006\u00104\u001a\u00020\u000b2\u0006\u00105\u001a\u00020\u001eJ\b\u00106\u001a\u00020'H\u0002J\u000e\u00107\u001a\u00020'2\u0006\u00108\u001a\u00020\u0013J,\u00109\u001a\u00020'2\u0014\u0010:\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010;2\u0006\u00100\u001a\u00020\u00162\u0006\u00101\u001a\u00020\u000bJ\u001e\u0010<\u001a\u00020'2\u0006\u0010/\u001a\u00020\u00132\u0006\u00100\u001a\u00020\u00162\u0006\u00101\u001a\u00020\u000bJ,\u0010=\u001a\u00020'2\u0014\u0010:\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010;2\u0006\u00100\u001a\u00020\u00162\u0006\u00101\u001a\u00020\u000bJ\u000e\u0010>\u001a\u00020'2\u0006\u0010?\u001a\u00020\u000bJ\u0006\u0010@\u001a\u00020'J\u0006\u0010A\u001a\u00020'J\u0006\u0010B\u001a\u00020'R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00138BX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u001eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020\u001eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010 \"\u0004\b%\u0010\"¨\u0006G"}, d2 = {"Lcom/bytedance/ee/bear/document/DocReport;", "", "mConnectionService", "Lcom/bytedance/ee/bear/contract/ConnectionService;", "mAnalyticService", "Lcom/bytedance/ee/bear/contract/AnalyticService;", "infoService", "Lcom/bytedance/ee/bear/contract/InfoProvideService;", "appVisibleService", "Lcom/bytedance/ee/bear/contract/AppVisibleService;", "versionType", "", "(Lcom/bytedance/ee/bear/contract/ConnectionService;Lcom/bytedance/ee/bear/contract/AnalyticService;Lcom/bytedance/ee/bear/contract/InfoProvideService;Lcom/bytedance/ee/bear/contract/AppVisibleService;Ljava/lang/String;)V", "getAppVisibleService", "()Lcom/bytedance/ee/bear/contract/AppVisibleService;", "fileId", "getInfoService", "()Lcom/bytedance/ee/bear/contract/InfoProvideService;", "isCoverEnabled", "", "()I", "isTTWebView", "", "getMAnalyticService", "()Lcom/bytedance/ee/bear/contract/AnalyticService;", "getMConnectionService", "()Lcom/bytedance/ee/bear/contract/ConnectionService;", "getVersionType", "()Ljava/lang/String;", "waitDownloadResourceTime", "", "getWaitDownloadResourceTime", "()J", "setWaitDownloadResourceTime", "(J)V", "waitPreloadTemplateTime", "getWaitPreloadTemplateTime", "setWaitPreloadTemplateTime", "appendCommonInfo", "", "map", "Lorg/json/JSONObject;", "getFileid", "getOvertimeCode", "state", "Lcom/bytedance/ee/bear/document/DocLoadingState;", "reportCancelDoc", "code", "hasWaitPreload", "tag", "reportCreateUI", "reportJsReady", ShareHitPoint.f121869d, "startTime", "reportLoadUrlStart", "reportLoginFail", "resultCode", "reportOpenDocFailed", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "reportOpenDocOvertime", "reportOpenDocSuccess", "reportTopBarClickEvent", "action", "reportTopBarViewEvent", "updateWaitDownloadResourceTime", "updateWaitPreloadTemplateTime", "Companion", "ErrCode", "EventID", "EventPARAM", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.document.d */
public final class DocReport {

    /* renamed from: b */
    public static final String f16141b = f16141b;

    /* renamed from: c */
    public static boolean f16142c;

    /* renamed from: d */
    public static String f16143d = "tab_other";

    /* renamed from: e */
    public static int f16144e = 1;

    /* renamed from: f */
    public static int f16145f;

    /* renamed from: g */
    public static final AtomicBoolean f16146g = new AtomicBoolean(true);

    /* renamed from: h */
    public static final AtomicBoolean f16147h = new AtomicBoolean(true);

    /* renamed from: i */
    public static boolean f16148i;

    /* renamed from: j */
    public static long f16149j;

    /* renamed from: k */
    public static long f16150k;

    /* renamed from: l */
    public static long f16151l;

    /* renamed from: m */
    public static String f16152m;

    /* renamed from: n */
    public static final Companion f16153n = new Companion(null);

    /* renamed from: a */
    public final boolean f16154a = C20011y.m73013k();

    /* renamed from: o */
    private String f16155o = "";

    /* renamed from: p */
    private long f16156p;

    /* renamed from: q */
    private long f16157q;

    /* renamed from: r */
    private final ConnectionService f16158r;

    /* renamed from: s */
    private final AbstractC5233x f16159s;

    /* renamed from: t */
    private final al f16160t;

    /* renamed from: u */
    private final AbstractC5238z f16161u;

    /* renamed from: v */
    private final String f16162v;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0015\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u0001012\u0006\u00102\u001a\u00020\b2\u0006\u00103\u001a\u00020\u0004J\u001e\u00104\u001a\u00020/2\u0006\u00105\u001a\u00020\u00132\u0006\u00106\u001a\u00020\u00132\u0006\u00107\u001a\u00020\bR\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\t\"\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000bR\u001a\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0015\"\u0004\b$\u0010\u0017R\u001a\u0010%\u001a\u00020\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001b\"\u0004\b'\u0010\u001dR\u001a\u0010(\u001a\u00020\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001b\"\u0004\b*\u0010\u001dR\u001a\u0010+\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0006\"\u0004\b-\u0010!¨\u00068"}, d2 = {"Lcom/bytedance/ee/bear/document/DocReport$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "isEnablePreloadHtml", "", "()Z", "setEnablePreloadHtml", "(Z)V", "isFirstLoadHtml", "Ljava/util/concurrent/atomic/AtomicBoolean;", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "isFirstOpenDocs", "isLarkWebview", "setLarkWebview", "mCacheLength", "", "getMCacheLength", "()I", "setMCacheLength", "(I)V", "mCacheStartTime", "", "getMCacheStartTime", "()J", "setMCacheStartTime", "(J)V", "mFrom", "getMFrom", "setMFrom", "(Ljava/lang/String;)V", "mHasCache", "getMHasCache", "setMHasCache", "mLoadUrlStart", "getMLoadUrlStart", "setMLoadUrlStart", "mOnViewCreated", "getMOnViewCreated", "setMOnViewCreated", "ttWebSoVersionCode", "getTtWebSoVersionCode", "setTtWebSoVersionCode", "reportWebviewOOm", "", "analyticService", "Lcom/bytedance/ee/bear/contract/AnalyticService;", "isGlOOM", "content", "setReportParams", "hasCache", "cacheLength", "larkWebview", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.d$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final String mo23012a() {
            return DocReport.f16141b;
        }

        /* renamed from: b */
        public final String mo23018b() {
            return DocReport.f16143d;
        }

        /* renamed from: c */
        public final int mo23022c() {
            return DocReport.f16144e;
        }

        /* renamed from: d */
        public final AtomicBoolean mo23023d() {
            return DocReport.f16146g;
        }

        /* renamed from: e */
        public final boolean mo23024e() {
            return DocReport.f16148i;
        }

        /* renamed from: f */
        public final long mo23025f() {
            return DocReport.f16149j;
        }

        /* renamed from: g */
        public final long mo23026g() {
            return DocReport.f16150k;
        }

        /* renamed from: h */
        public final long mo23027h() {
            return DocReport.f16151l;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo23013a(int i) {
            DocReport.f16144e = i;
        }

        /* renamed from: b */
        public final void mo23019b(int i) {
            DocReport.f16145f = i;
        }

        /* renamed from: b */
        public final void mo23020b(long j) {
            DocReport.f16151l = j;
        }

        /* renamed from: a */
        public final void mo23015a(long j) {
            DocReport.f16150k = j;
        }

        /* renamed from: b */
        public final void mo23021b(boolean z) {
            DocReport.f16148i = z;
        }

        /* renamed from: a */
        public final void mo23016a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            DocReport.f16143d = str;
        }

        /* renamed from: a */
        public final void mo23017a(boolean z) {
            DocReport.f16142c = z;
        }

        /* renamed from: a */
        public final void mo23014a(int i, int i2, boolean z) {
            Companion aVar = this;
            aVar.mo23013a(i);
            aVar.mo23019b(i2);
            aVar.mo23017a(z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b%\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0006R\u0014\u0010\u0019\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0006R\u0014\u0010\u001b\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0006R\u0014\u0010\u001d\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0006R\u0014\u0010\u001f\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0006R\u0014\u0010!\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0006R\u0014\u0010#\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0006R\u0014\u0010%\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0006R\u0014\u0010'\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0006¨\u0006)"}, d2 = {"Lcom/bytedance/ee/bear/document/DocReport$ErrCode;", "", "()V", "ERRCODE_DEFAULT", "", "getERRCODE_DEFAULT", "()I", "ERRCODE_NOT_RENDER", "getERRCODE_NOT_RENDER", "ERRCODE_PRELOAD_FAIL", "getERRCODE_PRELOAD_FAIL", "ERRCODE_PULL_DATA_END_NOT_READY", "getERRCODE_PULL_DATA_END_NOT_READY", "ERRCODE_PULL_DATA_END_READY", "getERRCODE_PULL_DATA_END_READY", "ERRCODE_PULL_DATA_START_NOT_READY", "getERRCODE_PULL_DATA_START_NOT_READY", "ERRCODE_PULL_DATA_START_READY", "getERRCODE_PULL_DATA_START_READY", "ERRCODE_RENDERING_NOT_READY", "getERRCODE_RENDERING_NOT_READY", "ERRCODE_RENDERING_READY", "getERRCODE_RENDERING_READY", "ERRCODE_RENDER_CACHE_END_NOT_READY", "getERRCODE_RENDER_CACHE_END_NOT_READY", "ERRCODE_RENDER_CACHE_END_READY", "getERRCODE_RENDER_CACHE_END_READY", "ERRCODE_RENDER_CACHE_START_NOT_READY", "getERRCODE_RENDER_CACHE_START_NOT_READY", "ERRCODE_RENDER_CACHE_START_READY", "getERRCODE_RENDER_CACHE_START_READY", "ERRCODE_RENDER_DOC_END_NOT_READY", "getERRCODE_RENDER_DOC_END_NOT_READY", "ERRCODE_RENDER_DOC_END_READY", "getERRCODE_RENDER_DOC_END_READY", "ERRCODE_RENDER_DOC_START_NOT_READY", "getERRCODE_RENDER_DOC_START_NOT_READY", "ERRCODE_RENDER_DOC_START_READY", "getERRCODE_RENDER_DOC_START_READY", "ERRCODE_RENDER_DOC_WAIT_DOWNLOAD", "getERRCODE_RENDER_DOC_WAIT_DOWNLOAD", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.d$b */
    public static final class ErrCode {

        /* renamed from: a */
        public static final ErrCode f16163a = new ErrCode();

        /* renamed from: b */
        private static final int f16164b = f16164b;

        /* renamed from: c */
        private static final int f16165c = 100;

        /* renamed from: d */
        private static final int f16166d = 101;

        /* renamed from: e */
        private static final int f16167e = 400;

        /* renamed from: f */
        private static final int f16168f = f16168f;

        /* renamed from: g */
        private static final int f16169g = f16169g;

        /* renamed from: h */
        private static final int f16170h = f16170h;

        /* renamed from: i */
        private static final int f16171i = f16171i;

        /* renamed from: j */
        private static final int f16172j = f16172j;

        /* renamed from: k */
        private static final int f16173k = f16173k;

        /* renamed from: l */
        private static final int f16174l = f16174l;

        /* renamed from: m */
        private static final int f16175m = f16175m;

        /* renamed from: n */
        private static final int f16176n = f16176n;

        /* renamed from: o */
        private static final int f16177o = f16177o;

        /* renamed from: p */
        private static final int f16178p = f16178p;

        /* renamed from: q */
        private static final int f16179q = f16179q;

        /* renamed from: r */
        private static final int f16180r = f16180r;

        /* renamed from: s */
        private static final int f16181s = f16181s;

        private ErrCode() {
        }

        /* renamed from: a */
        public final int mo23028a() {
            return f16164b;
        }

        /* renamed from: b */
        public final int mo23029b() {
            return f16165c;
        }

        /* renamed from: c */
        public final int mo23030c() {
            return f16166d;
        }

        /* renamed from: d */
        public final int mo23031d() {
            return f16167e;
        }

        /* renamed from: e */
        public final int mo23032e() {
            return f16168f;
        }

        /* renamed from: f */
        public final int mo23033f() {
            return f16169g;
        }

        /* renamed from: g */
        public final int mo23034g() {
            return f16170h;
        }

        /* renamed from: h */
        public final int mo23035h() {
            return f16171i;
        }

        /* renamed from: i */
        public final int mo23036i() {
            return f16172j;
        }

        /* renamed from: j */
        public final int mo23037j() {
            return f16173k;
        }

        /* renamed from: k */
        public final int mo23038k() {
            return f16174l;
        }

        /* renamed from: l */
        public final int mo23039l() {
            return f16175m;
        }

        /* renamed from: m */
        public final int mo23040m() {
            return f16176n;
        }

        /* renamed from: n */
        public final int mo23041n() {
            return f16177o;
        }

        /* renamed from: o */
        public final int mo23042o() {
            return f16178p;
        }

        /* renamed from: p */
        public final int mo23043p() {
            return f16179q;
        }

        /* renamed from: q */
        public final int mo23044q() {
            return f16180r;
        }

        /* renamed from: r */
        public final int mo23045r() {
            return f16181s;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/bytedance/ee/bear/document/DocReport$EventID;", "", "()V", "DEV_PERFORMANCE_DOC_TEMPLATE_PRELOAD", "", "getDEV_PERFORMANCE_DOC_TEMPLATE_PRELOAD", "()Ljava/lang/String;", "DEV_PERFORMANCE_OPEN_DOC_FINISH", "getDEV_PERFORMANCE_OPEN_DOC_FINISH", "DEV_PERFORMANCE_STAGE", "getDEV_PERFORMANCE_STAGE", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.d$c */
    public static final class EventID {

        /* renamed from: a */
        public static final EventID f16182a = new EventID();

        /* renamed from: b */
        private static final String f16183b = f16183b;

        /* renamed from: c */
        private static final String f16184c = f16184c;

        /* renamed from: d */
        private static final String f16185d = f16185d;

        private EventID() {
        }

        /* renamed from: a */
        public final String mo23046a() {
            return f16183b;
        }

        /* renamed from: b */
        public final String mo23047b() {
            return f16184c;
        }

        /* renamed from: c */
        public final String mo23048c() {
            return f16185d;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/document/DocReport$EventPARAM;", "", "()V", "NETWORK_QUALITY_TYPE", "", "getNETWORK_QUALITY_TYPE", "()Ljava/lang/String;", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.d$d */
    public static final class EventPARAM {

        /* renamed from: a */
        public static final EventPARAM f16186a = new EventPARAM();

        /* renamed from: b */
        private static final String f16187b = f16187b;

        private EventPARAM() {
        }

        /* renamed from: a */
        public final String mo23049a() {
            return f16187b;
        }
    }

    /* renamed from: h */
    public final AbstractC5233x mo23010h() {
        return this.f16159s;
    }

    /* renamed from: i */
    public final String mo23011i() {
        return this.f16162v;
    }

    /* renamed from: a */
    public final void mo23000a(String str, long j) {
        long j2;
        Intrinsics.checkParameterIsNotNull(str, ShareHitPoint.f121869d);
        String str2 = f16141b;
        C13479a.m54772d(str2, "reportJsReady");
        if (j > 0) {
            try {
                long uptimeMillis = SystemClock.uptimeMillis();
                long j3 = uptimeMillis - j;
                C13479a.m54772d(str2, "reportJsReady duration = " + j3);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(HiAnalyticsConstant.BI_KEY_COST_TIME, j3);
                if (f16147h.compareAndSet(true, false)) {
                    long f = uptimeMillis - this.f16160t.mo17357f();
                    long j4 = UserSP.getInstance().getLong("cost_time_app_launch_to_doc_init", 0);
                    long j5 = j4 + f;
                    long j6 = UserSP.getInstance().getLong("cost_time_start_p0_to_p0_launch", 0);
                    if (j6 > 0) {
                        j2 = j4;
                        UserSP.getInstance().putLong("cost_time_start_p0_to_p0_launch", 0);
                        long f2 = this.f16160t.mo17357f() - j6;
                        j5 += f2;
                        jSONObject.put("cost_time_start_p0_to_p0_launch", f2);
                    } else {
                        j2 = j4;
                    }
                    jSONObject.put("cost_time_p0_launch_to_open_doc", f);
                    jSONObject.put("cost_time_app_launch_to_doc_init", j2);
                    jSONObject.put("cost_time_app_launch_to_open_doc", j5);
                }
                AbstractC5238z j7 = C5102ai.m20872j();
                Object obj = null;
                jSONObject.put("app_visible", String.valueOf(j7 != null ? Boolean.valueOf(j7.mo20212d()) : null));
                Application application = C13615c.f35773a;
                if (application != null) {
                    obj = application.getSystemService("keyguard");
                }
                if (obj != null) {
                    jSONObject.put("screen_status", String.valueOf(((KeyguardManager) obj).inKeyguardRestrictedInputMode()));
                    jSONObject.put("version_type", this.f16162v);
                    jSONObject.put("enable_x5", this.f16154a);
                    jSONObject.put("scm_version", C5130a.m20992a());
                    jSONObject.put("file_type", str);
                    this.f16159s.mo21080a(EventID.f16182a.mo23046a(), jSONObject);
                    MonitorUtils.monitorEvent("docs_" + EventID.f16182a.mo23046a(), jSONObject, jSONObject, new JSONObject());
                    C13479a.m54764b(str2, "reportJsReady reportLoadFinish: " + jSONObject);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.app.KeyguardManager");
            } catch (Throwable th) {
                C13479a.m54761a(f16141b, th);
            }
        }
    }

    /* renamed from: a */
    public final void mo23001a(Map<String, ? extends Object> map, boolean z, String str) {
        long j;
        Intrinsics.checkParameterIsNotNull(str, "tag");
        try {
            long uptimeMillis = SystemClock.uptimeMillis();
            JSONObject jSONObject = map != null ? new JSONObject(map) : new JSONObject();
            jSONObject.put("docs_result_key", "other");
            jSONObject.put("docs_result_code", 0);
            jSONObject.put("file_type", C5890a.m23693a());
            jSONObject.put("sub_type", C5890a.m23712d());
            jSONObject.put("docs_open_type", z ? "preload" : "render");
            jSONObject.put("wait_preload_template_time", this.f16156p);
            jSONObject.put("wait_resource_time", this.f16157q);
            jSONObject.put("open_tag", str);
            jSONObject.put("version_type", this.f16162v);
            jSONObject.put("enable_x5", this.f16154a);
            jSONObject.put("scm_version", C5130a.m20992a());
            jSONObject.put("doc_network_status", C4974b.m20619a().ordinal());
            jSONObject.put("doc_has_cache", f16144e);
            jSONObject.put("doc_from", f16143d);
            jSONObject.put("preload_html_enabled", f16148i ? 1 : 0);
            jSONObject.put("app_visible", String.valueOf(this.f16161u.mo20212d()));
            jSONObject.put("isLarkWebview", f16142c);
            m23144a(jSONObject);
            String a = this.f16159s.mo21075a("start_open", "start_time");
            if (a != null) {
                String str2 = (String) (map != null ? map.get("timestamp") : null);
                if (str2 != null) {
                    j = Long.parseLong(str2);
                } else {
                    j = System.currentTimeMillis();
                }
                jSONObject.put(HiAnalyticsConstant.BI_KEY_COST_TIME, j - Long.parseLong(a));
                if (f16146g.compareAndSet(true, false)) {
                    long f = uptimeMillis - this.f16160t.mo17357f();
                    long j2 = UserSP.getInstance().getLong("cost_time_app_launch_to_doc_init", 0);
                    jSONObject.put("cost_time_p0_launch_to_open_doc", f);
                    jSONObject.put("cost_time_app_launch_to_doc_init", j2);
                    jSONObject.put("cost_time_app_launch_to_open_doc", f + j2);
                }
                f16149j = Long.parseLong(a);
            }
            this.f16159s.mo21087d("start_open");
            this.f16159s.mo21080a(EventID.f16182a.mo23047b(), jSONObject);
            MonitorUtils.monitorEvent("docs_" + EventID.f16182a.mo23047b(), jSONObject, jSONObject, new JSONObject());
            String str3 = f16141b;
            C13479a.m54764b(str3, "***reportOpenDoc*** Success  costtime: " + jSONObject.opt(HiAnalyticsConstant.BI_KEY_COST_TIME) + "    map:  " + jSONObject);
        } catch (Throwable th) {
            C13479a.m54761a(f16141b, th);
        }
    }

    /* renamed from: c */
    public final int mo23005c() {
        return DocOpenConfig.m22769j() ? 1 : 0;
    }

    /* renamed from: a */
    public final void mo22996a() {
        long j;
        String a = this.f16159s.mo21075a("wait_preload", "start_time");
        if (a == null) {
            j = 0;
        } else {
            j = SystemClock.uptimeMillis() - Long.parseLong(a);
        }
        this.f16156p = j;
        this.f16159s.mo21087d("wait_preload");
    }

    /* renamed from: b */
    public final void mo23002b() {
        long j;
        String a = this.f16159s.mo21075a("wait_download_resource", "start_time");
        if (a == null) {
            j = 0;
        } else {
            j = SystemClock.uptimeMillis() - Long.parseLong(a);
        }
        this.f16157q = j;
        this.f16159s.mo21087d("wait_download_resource");
    }

    /* renamed from: d */
    public final String mo23006d() {
        if (Intrinsics.areEqual(this.f16155o, "")) {
            String d = C13598b.m55197d(C5890a.m23707b());
            Intrinsics.checkExpressionValueIsNotNull(d, "EncriptUtils.handleEncri…ils.getOpeningDocToken())");
            this.f16155o = d;
        }
        return this.f16155o;
    }

    /* renamed from: f */
    public final void mo23008f() {
        C13608f.m55249a(new RunnableC5735e(this, System.currentTimeMillis(), f16151l));
    }

    static {
        String loadSoVersionCode = TTWebSdk.getLoadSoVersionCode();
        Intrinsics.checkExpressionValueIsNotNull(loadSoVersionCode, "TTWebSdk.getLoadSoVersionCode()");
        f16152m = loadSoVersionCode;
    }

    /* renamed from: g */
    public final void mo23009g() {
        HashMap<String, Object> c = this.f16159s.mo21086c("docCommonParams");
        Intrinsics.checkExpressionValueIsNotNull(c, "mAnalyticService.getAllC…Plugin.DOC_COMMON_PARAMS)");
        this.f16159s.mo21084b("ccm_space_docs_topbar_view", c);
        String str = f16141b;
        C13479a.m54772d(str, "reportTopBarViewEvent, params = " + c);
    }

    /* renamed from: e */
    public final void mo23007e() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("stage", "load_url_start");
            jSONObject.put("docs_result_key", "other");
            jSONObject.put("docs_result_code", 0);
            jSONObject.put("version_type", this.f16162v);
            jSONObject.put("file_type", C5890a.m23693a());
            jSONObject.put("enable_x5", this.f16154a);
            jSONObject.put("scm_version", C5130a.m20992a());
            jSONObject.put("doc_has_cache", f16144e);
            jSONObject.put("doc_from", f16143d);
            jSONObject.put("file_id", mo23006d());
            jSONObject.put("isCoverEnabled", mo23005c());
            jSONObject.put("is_first_open_docs", String.valueOf(f16146g.get()));
            String a = this.f16159s.mo21075a("start_open", "start_time");
            if (a != null) {
                jSONObject.put(HiAnalyticsConstant.BI_KEY_COST_TIME, f16151l - Long.parseLong(a));
            }
            String str = f16141b;
            C13479a.m54764b(str, "***reportOpenDoc*** LoadUrlStart: " + jSONObject.get(HiAnalyticsConstant.BI_KEY_COST_TIME));
            this.f16159s.mo21080a(EventID.f16182a.mo23048c(), jSONObject);
            MonitorUtils.monitorEvent("docs_" + EventID.f16182a.mo23048c(), jSONObject, jSONObject, new JSONObject());
        } catch (Throwable th) {
            C13479a.m54761a(f16141b, th);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.d$e */
    static final class RunnableC5735e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ DocReport f16188a;

        /* renamed from: b */
        final /* synthetic */ long f16189b;

        /* renamed from: c */
        final /* synthetic */ long f16190c;

        RunnableC5735e(DocReport dVar, long j, long j2) {
            this.f16188a = dVar;
            this.f16189b = j;
            this.f16190c = j2;
        }

        public final void run() {
            long j;
            long j2;
            long j3;
            long j4;
            long j5;
            long j6;
            long j7;
            this.f16188a.mo23007e();
            C5629ad.m22845a();
            String a = this.f16188a.mo23010h().mo21075a("start_open", "start_time");
            long j8 = 0;
            if (!TextUtils.isEmpty(a)) {
                long j9 = this.f16189b;
                if (a == null) {
                    Intrinsics.throwNpe();
                }
                long parseLong = j9 - Long.parseLong(a);
                j4 = C4927f.f14483a - Long.parseLong(a);
                if (j4 <= 0) {
                    j4 = 0;
                }
                if (C4927f.f14485c <= 0) {
                    j7 = 0;
                    j3 = 0;
                    j2 = 0;
                } else {
                    j7 = C4927f.f14484b - C4927f.f14483a;
                    j3 = C4927f.f14485c - C4927f.f14484b;
                    j2 = DocReport.f16153n.mo23026g() - C4927f.f14485c;
                }
                C4927f.f14485c = 0;
                long g = this.f16190c - DocReport.f16153n.mo23026g();
                j = this.f16189b - this.f16190c;
                j6 = j7;
                j8 = parseLong;
                j5 = g;
            } else {
                j6 = 0;
                j5 = 0;
                j4 = 0;
                j3 = 0;
                j2 = 0;
                j = 0;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(HiAnalyticsConstant.BI_KEY_COST_TIME, j8);
            jSONObject.put("cost_time_webfragmentoncreate", j4);
            jSONObject.put("cost_time_newpluginlist", j6);
            jSONObject.put("cost_time_attchpluginlist", j3);
            jSONObject.put("cost_time_onviewcreated", j2);
            jSONObject.put("cost_time_loadurlstart", j5);
            jSONObject.put("cost_time_create_ui", j);
            jSONObject.put("stage", "create_ui");
            jSONObject.put("docs_result_key", "other");
            jSONObject.put("docs_result_code", 0);
            jSONObject.put("file_type", C5890a.m23693a());
            jSONObject.put("file_id", this.f16188a.mo23006d());
            jSONObject.put("version_type", this.f16188a.mo23011i());
            jSONObject.put("enable_x5", this.f16188a.f16154a);
            jSONObject.put("scm_version", C5130a.m20992a());
            jSONObject.put("doc_has_cache", DocReport.f16153n.mo23022c());
            jSONObject.put("doc_from", DocReport.f16153n.mo23018b());
            jSONObject.put("isCoverEnabled", this.f16188a.mo23005c());
            jSONObject.put("is_first_open_docs", String.valueOf(DocReport.f16153n.mo23023d().get()));
            C13479a.m54764b(DocReport.f16153n.mo23012a(), "***reportOpenDoc*** CreateUI create_ui: " + jSONObject.get(HiAnalyticsConstant.BI_KEY_COST_TIME) + "    cost_time_webfragmentoncreate: " + j4 + "    cost_time_newpluginlist: " + j6 + "    cost_time_attchpluginlist: " + j3 + "    cost_time_onviewcreated: " + j2 + "    cost_time_loadurlstart: " + j5 + "    cost_time_create_ui: " + j + "    isFirstOpenDocs: " + DocReport.f16153n.mo23023d().get());
            this.f16188a.mo23010h().mo21080a(EventID.f16182a.mo23048c(), jSONObject);
            StringBuilder sb = new StringBuilder();
            sb.append("docs_");
            sb.append(EventID.f16182a.mo23048c());
            MonitorUtils.monitorEvent(sb.toString(), jSONObject, jSONObject, new JSONObject());
        }
    }

    /* renamed from: a */
    public final void mo22999a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "action");
        HashMap<String, Object> c = this.f16159s.mo21086c("docCommonParams");
        Intrinsics.checkExpressionValueIsNotNull(c, "mAnalyticService.getAllC…Plugin.DOC_COMMON_PARAMS)");
        HashMap hashMap = new HashMap(c);
        hashMap.put("click", str);
        hashMap.put("target", "none");
        String str2 = f16141b;
        C13479a.m54772d(str2, "reportTopBarClickEvent, params = " + hashMap);
    }

    /* renamed from: a */
    private final void m23144a(JSONObject jSONObject) {
        jSONObject.put("is_first_open_docs", String.valueOf(f16146g.get()));
        DeviceInfoDetector.DeviceInfo G = this.f16160t.mo17346G();
        Intrinsics.checkExpressionValueIsNotNull(G, "infoService.deviceInfo");
        jSONObject.put("cpu_core_numbers", G.mo50616c());
        DeviceInfoDetector.DeviceInfo G2 = this.f16160t.mo17346G();
        Intrinsics.checkExpressionValueIsNotNull(G2, "infoService.deviceInfo");
        jSONObject.put("cpu_name", G2.mo50614a());
        DeviceInfoDetector.DeviceInfo G3 = this.f16160t.mo17346G();
        Intrinsics.checkExpressionValueIsNotNull(G3, "infoService.deviceInfo");
        jSONObject.put("max_cpu_freq", G3.mo50615b());
        DeviceInfoDetector.DeviceInfo G4 = this.f16160t.mo17346G();
        Intrinsics.checkExpressionValueIsNotNull(G4, "infoService.deviceInfo");
        jSONObject.put("total_mem", G4.mo50617d());
        jSONObject.put("tt_web_so_version_code", f16152m);
        NetworkLevel j = ((AbstractC9349a) KoinJavaComponent.m268613a(AbstractC9349a.class, null, null, 6, null)).mo35644j();
        Intrinsics.checkExpressionValueIsNotNull(j, "get(IMGDriveInterfaces::class.java).networkLevel");
        jSONObject.put("doc_network_level", String.valueOf(j.getValue()));
        jSONObject.put(EventPARAM.f16186a.mo23049a(), TTNetInit.getEffectiveConnectionType());
    }

    /* renamed from: a */
    public final int mo22995a(DocLoadingState docLoadingState) {
        int l;
        Intrinsics.checkParameterIsNotNull(docLoadingState, "state");
        int a = ErrCode.f16163a.mo23028a();
        if (docLoadingState == DocLoadingState.INIT) {
            return ErrCode.f16163a.mo23031d();
        }
        if (docLoadingState == DocLoadingState.WAITING_DOWNLOAD) {
            return ErrCode.f16163a.mo23030c();
        }
        if (docLoadingState == DocLoadingState.WAITING_PRELOAD) {
            return ErrCode.f16163a.mo23029b();
        }
        if (docLoadingState != DocLoadingState.RENDERING) {
            return a;
        }
        if (DocStateTracker.f16283a.mo23281p()) {
            switch (C5751e.f16221a[DocStateTracker.f16283a.mo23280o().ordinal()]) {
                case 1:
                    l = ErrCode.f16163a.mo23032e();
                    break;
                case 2:
                    l = ErrCode.f16163a.mo23033f();
                    break;
                case 3:
                    l = ErrCode.f16163a.mo23034g();
                    break;
                case 4:
                    l = ErrCode.f16163a.mo23035h();
                    break;
                case 5:
                    l = ErrCode.f16163a.mo23036i();
                    break;
                case 6:
                    l = ErrCode.f16163a.mo23037j();
                    break;
                case 7:
                    l = ErrCode.f16163a.mo23038k();
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } else {
            switch (C5751e.f16222b[DocStateTracker.f16283a.mo23280o().ordinal()]) {
                case 1:
                    l = ErrCode.f16163a.mo23039l();
                    break;
                case 2:
                    l = ErrCode.f16163a.mo23040m();
                    break;
                case 3:
                    l = ErrCode.f16163a.mo23041n();
                    break;
                case 4:
                    l = ErrCode.f16163a.mo23042o();
                    break;
                case 5:
                    l = ErrCode.f16163a.mo23043p();
                    break;
                case 6:
                    l = ErrCode.f16163a.mo23044q();
                    break;
                case 7:
                    l = ErrCode.f16163a.mo23045r();
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        return l;
    }

    /* renamed from: a */
    public final void mo22997a(int i) {
        C13479a.m54764b(f16141b, "reportLoginFail");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("stage", "pull_data");
            jSONObject.put("docs_result_key", "login_fail");
            jSONObject.put("docs_result_code", i);
            jSONObject.put("file_type", C5890a.m23693a());
            jSONObject.put("file_id", C13598b.m55197d(C5890a.m23707b()));
            jSONObject.put("version_type", this.f16162v);
            jSONObject.put("scm_version", C5130a.m20992a());
            jSONObject.put("doc_has_cache", f16144e);
            jSONObject.put("doc_from", f16143d);
            jSONObject.put("is_first_open_docs", String.valueOf(f16146g.get()));
            this.f16159s.mo21080a(EventID.f16182a.mo23048c(), jSONObject);
            MonitorUtils.monitorEvent("docs_" + EventID.f16182a.mo23048c(), jSONObject, jSONObject, new JSONObject());
        } catch (Throwable th) {
            C13479a.m54761a(f16141b, th);
        }
    }

    /* renamed from: b */
    public final void mo23003b(int i, boolean z, String str) {
        String str2;
        int i2;
        long j;
        Intrinsics.checkParameterIsNotNull(str, "tag");
        try {
            if (!C13631k.m55311a()) {
                if (!C13631k.m55312b()) {
                    DocBridgeWebViewV2 b = ak.m22924b();
                    if (b != null && b.f15872h) {
                        if (b.f15873i) {
                            if (TextUtils.isEmpty(C5890a.m23707b())) {
                                C13479a.m54775e(f16141b, "***reportOpenDoc*** Overtime  no token");
                                return;
                            }
                            String str3 = null;
                            boolean z2 = false;
                            if (this.f16160t.mo17366p() != null) {
                                String p = this.f16160t.mo17366p();
                                Intrinsics.checkExpressionValueIsNotNull(p, "infoService.packageName");
                                if (StringsKt.contains$default((CharSequence) p, (CharSequence) "debug", false, 2, (Object) null)) {
                                    C13479a.m54775e(f16141b, "***reportOpenDoc*** Overtime Filter the internal test package of the debug package name");
                                    return;
                                }
                            }
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("docs_result_key", "overtime");
                            jSONObject.put("docs_result_code", i);
                            jSONObject.put("file_type", C5890a.m23693a());
                            jSONObject.put("sub_type", C5890a.m23712d());
                            if (z) {
                                str2 = "preload";
                            } else {
                                str2 = "render";
                            }
                            jSONObject.put("docs_open_type", str2);
                            if (i == ErrCode.f16163a.mo23029b()) {
                                mo22996a();
                            } else if (i == ErrCode.f16163a.mo23030c()) {
                                mo23002b();
                            }
                            jSONObject.put("wait_preload_template_time", this.f16156p);
                            jSONObject.put("wait_resource_time", this.f16157q);
                            jSONObject.put("open_tag", str);
                            jSONObject.put("version_type", this.f16162v);
                            jSONObject.put("enable_x5", this.f16154a);
                            jSONObject.put("scm_version", C5130a.m20992a());
                            jSONObject.put("file_id", C13598b.m55197d(C5890a.m23707b()));
                            jSONObject.put("doc_network_status", C4974b.m20619a().ordinal());
                            jSONObject.put("doc_has_cache", f16144e);
                            jSONObject.put("doc_from", f16143d);
                            if (f16148i) {
                                i2 = 1;
                            } else {
                                i2 = 0;
                            }
                            jSONObject.put("preload_html_enabled", i2);
                            DocBridgeWebViewV2 b2 = ak.m22924b();
                            if (b2 != null) {
                                j = b2.getWebviewStatusCode();
                            } else {
                                j = -999;
                            }
                            jSONObject.put("doc_webview_status_code", j);
                            int visibility = b.getVisibility();
                            int windowVisibility = b.getWindowVisibility();
                            boolean d = this.f16161u.mo20212d();
                            if (visibility == 0 && windowVisibility == 0 && d) {
                                z2 = true;
                            }
                            jSONObject.put("app_visible", z2);
                            jSONObject.put("isLarkWebview", f16142c);
                            m23144a(jSONObject);
                            String a = this.f16159s.mo21075a("start_open", "start_time");
                            if (a != null) {
                                jSONObject.put(HiAnalyticsConstant.BI_KEY_COST_TIME, System.currentTimeMillis() - Long.parseLong(a));
                            }
                            this.f16159s.mo21087d("start_open");
                            this.f16159s.mo21080a(EventID.f16182a.mo23047b(), jSONObject);
                            String str4 = f16141b;
                            StringBuilder sb = new StringBuilder();
                            sb.append("***reportOpenDoc*** Overtime : ");
                            sb.append(jSONObject);
                            sb.append("    performanceTiming:  ");
                            DocBridgeWebViewV2 b3 = ak.m22924b();
                            if (b3 != null) {
                                str3 = b3.getPerformanceTiming();
                            }
                            sb.append(str3);
                            sb.append("    visibility:  ");
                            sb.append(visibility);
                            sb.append("    windowVisibility:  ");
                            sb.append(windowVisibility);
                            sb.append("    appIsVisible:  ");
                            sb.append(d);
                            C13479a.m54758a(str4, sb.toString());
                            return;
                        }
                    }
                    C13479a.m54775e(f16141b, "***reportOpenDoc*** Overtime  Render not Open");
                    return;
                }
            }
            C13479a.m54775e(f16141b, "***reportOpenDoc*** Overtime  isWifiProxy");
        } catch (Throwable th) {
            C13479a.m54761a(f16141b, th);
        }
    }

    /* renamed from: b */
    public final void mo23004b(Map<String, ? extends Object> map, boolean z, String str) {
        JSONObject jSONObject;
        String str2;
        long j;
        Object obj;
        Intrinsics.checkParameterIsNotNull(str, "tag");
        try {
            if (!C13631k.m55311a()) {
                if (!C13631k.m55312b()) {
                    DocBridgeWebViewV2 b = ak.m22924b();
                    if (b != null && b.f15872h) {
                        if (b.f15873i) {
                            if (TextUtils.isEmpty(C5890a.m23707b())) {
                                C13479a.m54775e(f16141b, "***reportOpenDoc*** Failed  no token");
                                return;
                            }
                            int i = 0;
                            String str3 = null;
                            if (this.f16160t.mo17366p() != null) {
                                String p = this.f16160t.mo17366p();
                                Intrinsics.checkExpressionValueIsNotNull(p, "infoService.packageName");
                                if (StringsKt.contains$default((CharSequence) p, (CharSequence) "debug", false, 2, (Object) null)) {
                                    C13479a.m54775e(f16141b, "***reportOpenDoc*** Failed Filter the internal test package of the debug package name");
                                    return;
                                }
                            }
                            if (map != null) {
                                jSONObject = new JSONObject(map);
                            } else {
                                jSONObject = new JSONObject();
                            }
                            jSONObject.put("file_type", C5890a.m23693a());
                            jSONObject.put("sub_type", C5890a.m23712d());
                            if (z) {
                                str2 = "preload";
                            } else {
                                str2 = "render";
                            }
                            jSONObject.put("docs_open_type", str2);
                            jSONObject.put("wait_preload_template_time", this.f16156p);
                            jSONObject.put("wait_resource_time", this.f16157q);
                            jSONObject.put("open_tag", str);
                            jSONObject.put("version_type", this.f16162v);
                            jSONObject.put("enable_x5", this.f16154a);
                            jSONObject.put("scm_version", C5130a.m20992a());
                            jSONObject.put("doc_network_status", C4974b.m20619a().ordinal());
                            jSONObject.put("doc_has_cache", f16144e);
                            jSONObject.put("doc_from", f16143d);
                            if (f16148i) {
                                i = 1;
                            }
                            jSONObject.put("preload_html_enabled", i);
                            DocBridgeWebViewV2 b2 = ak.m22924b();
                            if (b2 != null) {
                                j = b2.getWebviewStatusCode();
                            } else {
                                j = -999;
                            }
                            jSONObject.put("doc_webview_status_code", j);
                            jSONObject.put("app_visible", String.valueOf(this.f16161u.mo20212d()));
                            jSONObject.put("isLarkWebview", f16142c);
                            m23144a(jSONObject);
                            String a = this.f16159s.mo21075a("start_open", "start_time");
                            if (a != null) {
                                if (map != null) {
                                    obj = map.get("timestamp");
                                } else {
                                    obj = null;
                                }
                                String str4 = (String) obj;
                                if (str4 != null) {
                                    jSONObject.put(HiAnalyticsConstant.BI_KEY_COST_TIME, Long.parseLong(str4) - Long.parseLong(a));
                                } else {
                                    jSONObject.put(HiAnalyticsConstant.BI_KEY_COST_TIME, System.currentTimeMillis() - Long.parseLong(a));
                                }
                            }
                            this.f16159s.mo21087d("start_open");
                            this.f16159s.mo21080a(EventID.f16182a.mo23047b(), jSONObject);
                            String str5 = f16141b;
                            StringBuilder sb = new StringBuilder();
                            sb.append("***reportOpenDoc*** Failed : ");
                            sb.append(jSONObject);
                            sb.append("    performanceTiming:  ");
                            DocBridgeWebViewV2 b3 = ak.m22924b();
                            if (b3 != null) {
                                str3 = b3.getPerformanceTiming();
                            }
                            sb.append(str3);
                            C13479a.m54758a(str5, sb.toString());
                            return;
                        }
                    }
                    C13479a.m54775e(f16141b, "***reportOpenDoc*** Failed  Render not Open");
                    return;
                }
            }
            C13479a.m54775e(f16141b, "***reportOpenDoc*** Failed  isWifiProxy");
        } catch (Throwable th) {
            C13479a.m54761a(f16141b, th);
        }
    }

    /* renamed from: a */
    public final void mo22998a(int i, boolean z, String str) {
        String str2;
        int i2;
        Intrinsics.checkParameterIsNotNull(str, "tag");
        try {
            if (ak.m22924b() != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("docs_result_key", "cancel");
                jSONObject.put("docs_result_code", i);
                jSONObject.put("file_type", C5890a.m23693a());
                jSONObject.put("sub_type", C5890a.m23712d());
                if (z) {
                    str2 = "preload";
                } else {
                    str2 = "render";
                }
                jSONObject.put("docs_open_type", str2);
                if (i == ErrCode.f16163a.mo23029b()) {
                    mo22996a();
                } else if (i == ErrCode.f16163a.mo23030c()) {
                    mo23002b();
                }
                jSONObject.put("wait_preload_template_time", this.f16156p);
                jSONObject.put("wait_resource_time", this.f16157q);
                jSONObject.put("open_tag", str);
                jSONObject.put("version_type", this.f16162v);
                jSONObject.put("enable_x5", this.f16154a);
                jSONObject.put("scm_version", C5130a.m20992a());
                jSONObject.put("file_id", C13598b.m55197d(C5890a.m23707b()));
                jSONObject.put("doc_network_status", C4974b.m20619a().ordinal());
                jSONObject.put("doc_has_cache", f16144e);
                jSONObject.put("doc_from", f16143d);
                if (f16148i) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                jSONObject.put("preload_html_enabled", i2);
                jSONObject.put("file_length", f16145f);
                DocBridgeWebViewV2 b = ak.m22924b();
                Intrinsics.checkExpressionValueIsNotNull(b, "WebViewHolder.getCurWebView()");
                jSONObject.put("doc_webview_status_code", b.getWebviewStatusCode());
                jSONObject.put("app_visible", String.valueOf(this.f16161u.mo20212d()));
                jSONObject.put("isLarkWebview", f16142c);
                m23144a(jSONObject);
                String a = this.f16159s.mo21075a("start_open", "start_time");
                if (a != null) {
                    jSONObject.put(HiAnalyticsConstant.BI_KEY_COST_TIME, ((System.currentTimeMillis() - Long.parseLong(a)) - this.f16157q) - this.f16156p);
                }
                this.f16159s.mo21087d("start_open");
                this.f16159s.mo21080a(EventID.f16182a.mo23047b(), jSONObject);
                String str3 = f16141b;
                StringBuilder sb = new StringBuilder();
                sb.append("***reportOpenDoc*** CancelDoc : ");
                sb.append(jSONObject);
                sb.append("    performanceTiming:  ");
                DocBridgeWebViewV2 b2 = ak.m22924b();
                Intrinsics.checkExpressionValueIsNotNull(b2, "WebViewHolder.getCurWebView()");
                sb.append(b2.getPerformanceTiming());
                C13479a.m54758a(str3, sb.toString());
            }
        } catch (Throwable th) {
            C13479a.m54761a(f16141b, th);
        }
    }

    public DocReport(ConnectionService connectionService, AbstractC5233x xVar, al alVar, AbstractC5238z zVar, String str) {
        Intrinsics.checkParameterIsNotNull(connectionService, "mConnectionService");
        Intrinsics.checkParameterIsNotNull(xVar, "mAnalyticService");
        Intrinsics.checkParameterIsNotNull(alVar, "infoService");
        Intrinsics.checkParameterIsNotNull(zVar, "appVisibleService");
        Intrinsics.checkParameterIsNotNull(str, "versionType");
        this.f16158r = connectionService;
        this.f16159s = xVar;
        this.f16160t = alVar;
        this.f16161u = zVar;
        this.f16162v = str;
    }
}
