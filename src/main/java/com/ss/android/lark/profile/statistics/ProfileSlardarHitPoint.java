package com.ss.android.lark.profile.statistics;

import com.bytedance.apm.ApmAgent;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.log.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/profile/statistics/ProfileSlardarHitPoint;", "", "()V", "Companion", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.statistics.e */
public final class ProfileSlardarHitPoint {

    /* renamed from: a */
    public static long f130741a = -1;

    /* renamed from: b */
    public static final Companion f130742b = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u000fR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/profile/statistics/ProfileSlardarHitPoint$Companion;", "", "()V", "PROFILE_LAUNCHER_TIME_EVENT_NAME", "", "PROFILE_LAUNCHER_TIME_EVENT_STATUS", "", "TAG", "profileLauncherStartTime", "", "getProfileLauncherStartTime", "()J", "setProfileLauncherStartTime", "(J)V", "profileLauncherEnd", "", "profileLauncherStart", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.statistics.e$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final long mo180546a() {
            return ProfileSlardarHitPoint.f130741a;
        }

        /* renamed from: b */
        public final void mo180548b() {
            mo180547a(System.nanoTime());
        }

        /* renamed from: c */
        public final void mo180549c() {
            CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
            coreThreadPool.getCachedThreadPool().execute(RunnableC52914a.f130743a);
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.profile.statistics.e$a$a */
        static final class RunnableC52914a implements Runnable {

            /* renamed from: a */
            public static final RunnableC52914a f130743a = new RunnableC52914a();

            RunnableC52914a() {
            }

            public final void run() {
                if (ProfileSlardarHitPoint.f130742b.mo180546a() != -1) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("launcher_time", ((int) (System.nanoTime() - ProfileSlardarHitPoint.f130742b.mo180546a())) / 1000000);
                    ProfileSlardarHitPoint.f130742b.mo180547a(-1);
                    Log.m165389i("ProfileHitPoint", "start to report slardar data!");
                    ApmAgent.monitorEvent("start_profile_time", null, jSONObject, null);
                }
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo180547a(long j) {
            ProfileSlardarHitPoint.f130741a = j;
        }
    }
}
