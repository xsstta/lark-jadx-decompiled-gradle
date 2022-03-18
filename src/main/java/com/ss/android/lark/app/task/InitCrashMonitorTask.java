package com.ss.android.lark.app.task;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.applog.encryptor.EncryptorUtil;
import com.bytedance.crash.AbstractC3725d;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.ICrashCallback;
import com.bytedance.crash.Npth;
import com.bytedance.crash.upload.C3908i;
import com.bytedance.platform.godzilla.C20251a;
import com.bytedance.platform.godzilla.anr.C20297a;
import com.bytedance.platform.godzilla.anr.C20299b;
import com.bytedance.platform.godzilla.common.AbstractC20327g;
import com.bytedance.platform.godzilla.common.C20323c;
import com.bytedance.platform.godzilla.common.Logger;
import com.bytedance.platform.godzilla.p860a.C20258b;
import com.bytedance.platform.godzilla.p860a.C20271c;
import com.bytedance.platform.godzilla.p860a.C20281d;
import com.bytedance.platform.godzilla.p860a.C20292e;
import com.bytedance.platform.godzilla.p860a.C20295h;
import com.bytedance.platform.godzilla.p860a.C20296i;
import com.bytedance.platform.godzilla.p860a.p861a.C20255a;
import com.bytedance.platform.godzilla.p860a.p870d.C20284c;
import com.bytedance.platform.godzilla.p860a.p870d.C20286e;
import com.bytedance.platform.godzilla.p860a.p870d.C20288g;
import com.bytedance.platform.godzilla.plugin.StartType;
import com.bytedance.platform.godzilla.sysopt.C20336e;
import com.bytedance.platform.godzilla.sysopt.C20338g;
import com.larksuite.component.safemode.SafeModeManager;
import com.larksuite.framework.launch.task.AbstractLaunchTask;
import com.larksuite.framework.thread.C26137b;
import com.larksuite.framework.thread.C26159o;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.C26246a;
import com.larksuite.framework.utils.C26254af;
import com.larksuite.framework.utils.C26279i;
import com.ss.android.lark.app.util.C29090g;
import com.ss.android.lark.app.util.OpenSSLEnvUtil;
import com.ss.android.lark.exception.crash.npth.C37024c;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.integrator.p2000c.C39130a;
import com.ss.android.lark.integrator.p2000c.C39131b;
import com.ss.android.lark.integrator.p2000c.C39132c;
import com.ss.android.lark.integrator.p2000c.C39136d;
import com.ss.android.lark.integrator.p2000c.C39137e;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.p1382b.C29410a;
import com.ss.android.lark.p1382b.p1384b.AbstractC29417b;
import com.ss.android.lark.platform.p2486g.C51808a;
import com.ss.android.lark.platform.statistics.perf.C51995b;
import com.ss.android.lark.utils.C57765ac;
import com.ss.android.lark.utils.C57852m;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.socialbase.downloader.downloader.AbstractC60044a;
import java.lang.Thread;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class InitCrashMonitorTask extends AbstractLaunchTask {

    /* renamed from: a */
    private boolean f72580a = true;

    /* renamed from: i */
    private boolean m106156i() {
        return true;
    }

    /* access modifiers changed from: private */
    public static class LarkReflectHackHelper implements AbstractC20327g {
        private LarkReflectHackHelper() {
        }

        @Override // com.bytedance.platform.godzilla.common.AbstractC20327g
        /* renamed from: a */
        public Field mo68639a(Class<?> cls, String str) {
            return C26254af.m95001a(cls, str);
        }

        @Override // com.bytedance.platform.godzilla.common.AbstractC20327g
        /* renamed from: a */
        public Method mo68640a(Class<?> cls, String str, Class... clsArr) {
            return C26254af.m95003a(cls, str, clsArr);
        }
    }

    /* renamed from: k */
    private static AbstractC3725d m106158k() {
        return new AbstractC3725d() {
            /* class com.ss.android.lark.app.task.InitCrashMonitorTask.C289473 */

            @Override // com.bytedance.crash.AbstractC3725d
            /* renamed from: a */
            public byte[] mo15182a(byte[] bArr) {
                if (bArr == null) {
                    return null;
                }
                return EncryptorUtil.m14355a(bArr, bArr.length);
            }
        };
    }

    /* renamed from: h */
    private void m106155h() {
        Npth.registerCrashCallback(new ICrashCallback() {
            /* class com.ss.android.lark.app.task.InitCrashMonitorTask.C289462 */

            @Override // com.bytedance.crash.ICrashCallback
            public void onCrash(CrashType crashType, String str, Thread thread) {
                StringBuilder sb = new StringBuilder("crash occurs!\n");
                sb.append(C26279i.m95153a(new Date(), "yyyy-MM-dd HH:mm:ss"));
                sb.append("\n");
                if (thread != null) {
                    sb.append("thread-name:");
                    sb.append(thread.getName());
                    sb.append(" thread-id:");
                    sb.append(thread.getId());
                    sb.append("\n");
                }
                if (crashType != null) {
                    sb.append("crash-type:");
                    sb.append(crashType);
                    sb.append("\n");
                }
                if (str != null) {
                    sb.append(str);
                    sb.append("\n");
                }
                Log.m165389i("InitCrashMonitorTask", sb.toString());
            }
        }, CrashType.ALL);
    }

    /* renamed from: j */
    private static boolean m106157j() {
        return C37239a.m146648b().mo136951a("tt_slardar_old_cryption");
    }

    /* renamed from: g */
    public void mo102713g() {
        CoreThreadPool.getDefault().getScheduleThreadPool().scheduleWithFixedDelay(new Runnable() {
            /* class com.ss.android.lark.app.task.InitCrashMonitorTask.RunnableC289441 */

            public void run() {
                BlockingQueue<C26159o> c = C26137b.m94599a().mo93040c();
                Map<Integer, C26159o> b = C26137b.m94599a().mo93039b();
                for (final C26159o oVar : c) {
                    long currentTimeMillis = System.currentTimeMillis() - oVar.f64613c;
                    if (b.get(Integer.valueOf(oVar.f64611a.hashCode())).f64612b == 1 && currentTimeMillis >= 30000) {
                        if (C57852m.m224554a(LarkContext.getApplication())) {
                            Log.m165384e("InitCrashMonitorTask", "An exception not handled by the original service has occurred", oVar.f64611a);
                            CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable() {
                                /* class com.ss.android.lark.app.task.InitCrashMonitorTask.RunnableC289441.RunnableC289451 */

                                public void run() {
                                    throw new RuntimeException(oVar.f64611a);
                                }
                            });
                        } else {
                            Log.m165385e("InitCrashMonitorTask", "An exception not handled by the original service has occurred", oVar.f64611a, true);
                        }
                        try {
                            c.take();
                            b.remove(Integer.valueOf(oVar.f64611a.hashCode()));
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                        }
                    } else if (b.get(Integer.valueOf(oVar.f64611a.hashCode())).f64612b > 1 && currentTimeMillis >= 30000) {
                        try {
                            c.take();
                            b.remove(Integer.valueOf(oVar.f64611a.hashCode()));
                        } catch (InterruptedException unused2) {
                            Thread.currentThread().interrupt();
                        }
                    } else {
                        return;
                    }
                }
            }
        }, 30, 30, TimeUnit.SECONDS);
    }

    /* renamed from: d */
    private void m106153d(Context context) {
        if (C57765ac.m224188b(context) || !C57765ac.m224193g(context)) {
            CoreThreadPool.getNonblockingHandler().post(new Runnable(context) {
                /* class com.ss.android.lark.app.task.$$Lambda$InitCrashMonitorTask$E9m1A_YJc2B9q3KISksSjwqaAhE */
                public final /* synthetic */ Context f$0;

                {
                    this.f$0 = r1;
                }

                public final void run() {
                    InitCrashMonitorTask.m106154e(this.f$0);
                }
            });
        }
    }

    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        m106151b(context);
        OpenSSLEnvUtil.f72905b.mo103200a();
        SafeModeManager.f62333a.mo88867a($$Lambda$InitCrashMonitorTask$0ZewL7nocic7ZhM5zKoq11AdD6c.INSTANCE);
        m106152c(context);
        mo102713g();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m106150a(boolean z) {
        Log.m165389i("InitCrashMonitorTask", "onAppStateChange, new state:" + z + ", old state:" + this.f72580a);
        if (z != this.f72580a) {
            this.f72580a = z;
            if (z) {
                C3908i.m16189a().mo15560d();
                C3908i.m16189a().mo15559c();
                return;
            }
            C3908i.m16189a().mo15560d();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ void m106154e(Context context) {
        try {
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            Method declaredMethod = Class.forName("com.xiaomi.push.df").getDeclaredMethod(AbstractC60044a.f149675a, Context.class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, context);
            Thread.setDefaultUncaughtExceptionHandler(defaultUncaughtExceptionHandler);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            Log.m165384e("InitCrashMonitorTask", "failed", e);
        }
    }

    /* renamed from: b */
    private void m106151b(Context context) {
        C51995b.m201717a("init_npth", (String) null);
        if (m106156i()) {
            if (!m106157j()) {
                C37024c.m146082a().mo136547a(m106158k());
            }
            String b = C51808a.m200830a().mo177930b();
            if (!TextUtils.isEmpty(b)) {
                C37024c.m146082a().mo136549a(b);
            }
            C37024c.m146082a().mo136548a(C29090g.m106967a(context));
            C29410a.m108289c().mo104284a(new AbstractC29417b.AbstractC29418a() {
                /* class com.ss.android.lark.app.task.$$Lambda$InitCrashMonitorTask$gp0fKyFHq_6uJnTnStFPvnA99g */

                @Override // com.ss.android.lark.p1382b.p1384b.AbstractC29417b.AbstractC29418a
                public final void OnAppStateChanged(boolean z) {
                    InitCrashMonitorTask.this.m106150a((InitCrashMonitorTask) z);
                }
            });
        }
        C51995b.m201714a();
        m106155h();
    }

    /* renamed from: c */
    private void m106152c(final Context context) {
        Logger.Level level;
        C51995b.m201717a("init_godzilla", (String) null);
        C20251a.C20253a a = new C20251a.C20253a(LarkContext.getApplication()).mo68527a(new LarkReflectHackHelper());
        a.mo68528a(new C20258b()).mo68528a(new C20286e()).mo68528a(new C20284c()).mo68528a(new C20271c()).mo68528a(new C20281d(LarkContext.getApplication())).mo68528a(new C20292e()).mo68528a(new C20295h()).mo68528a(new C20296i()).mo68528a(new C20299b()).mo68528a(new C20297a()).mo68528a(new C39136d()).mo68528a(new C39131b()).mo68528a(new C39130a()).mo68528a(new C20338g()).mo68528a(new C20255a()).mo68528a(new C39137e()).mo68528a(new C20288g(new C20288g.AbstractC20289a() {
            /* class com.ss.android.lark.app.task.InitCrashMonitorTask.C289484 */

            @Override // com.bytedance.platform.godzilla.p860a.p870d.C20288g.AbstractC20289a
            /* renamed from: b */
            public String mo68572b() {
                return C26246a.m94977a(context);
            }

            @Override // com.bytedance.platform.godzilla.p860a.p870d.C20288g.AbstractC20289a
            /* renamed from: c */
            public int mo68573c() {
                return C26246a.m94979c(context);
            }

            @Override // com.bytedance.platform.godzilla.p860a.p870d.C20288g.AbstractC20289a
            /* renamed from: a */
            public List<C20323c> mo68570a() {
                try {
                    return C39132c.m154446d().mo107775e();
                } catch (Throwable th) {
                    Log.m165383e("InitCrashMonitorTask", "getCrashPortrait: " + th);
                    return null;
                }
            }

            @Override // com.bytedance.platform.godzilla.p860a.p870d.C20288g.AbstractC20289a
            /* renamed from: a */
            public void mo68571a(C20323c cVar) {
                Log.m165387e("InitCrashMonitorTask", new Throwable(cVar.toString()), true);
            }
        }, context));
        if (!C57765ac.m224190d(context)) {
            a.mo68528a(new C20336e(524288));
        }
        C20251a.C20253a a2 = a.mo68526a($$Lambda$InitCrashMonitorTask$jGOFOcudOtIQb_hM5ocUw_flCHk.INSTANCE);
        if (C57852m.m224554a(context)) {
            level = Logger.Level.DEBUG;
        } else {
            level = Logger.Level.INFO;
        }
        a2.mo68525a(level);
        C20251a.m73935a(a.mo68529a()).mo68524b();
        C20251a.m73934a().mo68523a(StartType.REGISTER_EXCEPTION);
        m106153d(context);
        C51995b.m201714a();
    }
}
