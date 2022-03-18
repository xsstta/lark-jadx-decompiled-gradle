package com.ss.android.lark.searchcommon.utils;

import com.ss.android.lark.log.Log;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0012\u001a\u00020\u0013J\b\u0010\u0014\u001a\u00020\u0013H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R$\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0007\u0010\u0002\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\r\u0010\u0002\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/searchcommon/utils/SessionManager;", "", "()V", "TAG", "", "seqId", "", "seqId$annotations", "getSeqId", "()I", "setSeqId", "(I)V", "session", "session$annotations", "getSession", "()Ljava/lang/String;", "setSession", "(Ljava/lang/String;)V", "incSeqId", "", "updateSession", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.utils.d */
public final class SessionManager {

    /* renamed from: a */
    public static final SessionManager f133395a = new SessionManager();

    /* renamed from: b */
    private static String f133396b;

    /* renamed from: c */
    private static int f133397c;

    private SessionManager() {
    }

    /* renamed from: a */
    public static final String m209245a() {
        return f133396b;
    }

    /* renamed from: b */
    public static final int m209246b() {
        return f133397c;
    }

    /* renamed from: d */
    public final void mo184570d() {
        f133397c++;
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(System.currentTimeMillis());
        sb.append('_');
        sb.append(UUID.randomUUID());
        f133396b = sb.toString();
    }

    @JvmStatic
    /* renamed from: c */
    public static final void m209247c() {
        Log.m165389i("LarkSearch.Common.V2.SessionManager", "update session from: " + f133396b);
        StringBuilder sb = new StringBuilder();
        sb.append(System.currentTimeMillis());
        sb.append('_');
        sb.append(UUID.randomUUID());
        f133396b = sb.toString();
        Log.m165389i("LarkSearch.Common.V2.SessionManager", "update session to " + f133396b);
        Log.m165389i("LarkSearch.Common.V2.SessionManager", "reset seqId from: " + f133397c);
        f133397c = 0;
        Log.m165389i("LarkSearch.Common.V2.SessionManager", "reset seqId to: " + f133397c);
    }
}
