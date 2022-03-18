package com.google.firebase.messaging;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import androidx.collection.ArrayMap;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.iid.C22809ab;
import com.google.firebase.iid.C22839q;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.InstanceIdResult;
import com.google.firebase.installations.AbstractC22860h;
import com.google.firebase.platforminfo.AbstractC22923g;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* access modifiers changed from: package-private */
/* renamed from: com.google.firebase.messaging.t */
public class C22913t {

    /* renamed from: a */
    private static final long f56631a = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: b */
    private final FirebaseInstanceId f56632b;

    /* renamed from: c */
    private final Context f56633c;

    /* renamed from: d */
    private final C22809ab f56634d;

    /* renamed from: e */
    private final C22839q f56635e;

    /* renamed from: f */
    private final Map<String, ArrayDeque<TaskCompletionSource<Void>>> f56636f = new ArrayMap();

    /* renamed from: g */
    private final ScheduledExecutorService f56637g;

    /* renamed from: h */
    private boolean f56638h = false;

    /* renamed from: i */
    private final C22912s f56639i;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo79543a(C22911r rVar) throws IOException {
        try {
            String b = rVar.mo79533b();
            char c = 65535;
            int hashCode = b.hashCode();
            if (hashCode != 83) {
                if (hashCode == 85) {
                    if (b.equals("U")) {
                        c = 1;
                    }
                }
            } else if (b.equals("S")) {
                c = 0;
            }
            if (c == 0) {
                m83265a(rVar.mo79532a());
                if (m83268e()) {
                    String a = rVar.mo79532a();
                    StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 31);
                    sb.append("Subscribe to topic: ");
                    sb.append(a);
                    sb.append(" succeeded.");
                    Log.d("FirebaseMessaging", sb.toString());
                }
            } else if (c == 1) {
                m83267b(rVar.mo79532a());
                if (m83268e()) {
                    String a2 = rVar.mo79532a();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(a2).length() + 35);
                    sb2.append("Unsubscribe from topic: ");
                    sb2.append(a2);
                    sb2.append(" succeeded.");
                    Log.d("FirebaseMessaging", sb2.toString());
                }
            } else if (m83268e()) {
                String valueOf = String.valueOf(rVar);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 24);
                sb3.append("Unknown topic operation");
                sb3.append(valueOf);
                sb3.append(".");
                Log.d("FirebaseMessaging", sb3.toString());
            }
            return true;
        } catch (IOException e) {
            if ("SERVICE_NOT_AVAILABLE".equals(e.getMessage()) || "INTERNAL_SERVER_ERROR".equals(e.getMessage())) {
                String message = e.getMessage();
                StringBuilder sb4 = new StringBuilder(String.valueOf(message).length() + 53);
                sb4.append("Topic operation failed: ");
                sb4.append(message);
                sb4.append(". Will retry Topic operation.");
                Log.e("FirebaseMessaging", sb4.toString());
                return false;
            } else if (e.getMessage() == null) {
                Log.e("FirebaseMessaging", "Topic operation failed without exception message. Will retry Topic operation.");
                return false;
            } else {
                throw e;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public synchronized boolean mo79546d() {
        return this.f56638h;
    }

    /* renamed from: f */
    private void m83269f() {
        if (!mo79546d()) {
            mo79539a(0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo79544b() {
        if (mo79542a()) {
            m83269f();
        }
    }

    /* renamed from: e */
    static boolean m83268e() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            return true;
        }
        if (Build.VERSION.SDK_INT != 23 || !Log.isLoggable("FirebaseMessaging", 3)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        if (mo79543a(r0) != false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        return false;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo79545c() throws java.io.IOException {
        /*
            r2 = this;
        L_0x0000:
            monitor-enter(r2)
            com.google.firebase.messaging.s r0 = r2.f56639i     // Catch:{ all -> 0x002b }
            com.google.firebase.messaging.r r0 = r0.mo79537a()     // Catch:{ all -> 0x002b }
            if (r0 != 0) goto L_0x0019
            boolean r0 = m83268e()     // Catch:{ all -> 0x002b }
            if (r0 == 0) goto L_0x0016
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r1 = "topic sync succeeded"
            android.util.Log.d(r0, r1)     // Catch:{ all -> 0x002b }
        L_0x0016:
            r0 = 1
            monitor-exit(r2)     // Catch:{ all -> 0x002b }
            return r0
        L_0x0019:
            monitor-exit(r2)     // Catch:{ all -> 0x002b }
            boolean r1 = r2.mo79543a(r0)
            if (r1 != 0) goto L_0x0022
            r0 = 0
            return r0
        L_0x0022:
            com.google.firebase.messaging.s r1 = r2.f56639i
            r1.mo79538a(r0)
            r2.m83266b(r0)
            goto L_0x0000
        L_0x002b:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.C22913t.mo79545c():boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo79542a() {
        if (this.f56639i.mo79537a() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private void m83267b(String str) throws IOException {
        InstanceIdResult instanceIdResult = (InstanceIdResult) m83264a(this.f56632b.getInstanceId());
        m83264a(this.f56635e.mo79361d(instanceIdResult.getId(), instanceIdResult.getToken(), str));
    }

    /* renamed from: b */
    private void m83266b(C22911r rVar) {
        synchronized (this.f56636f) {
            String c = rVar.mo79534c();
            if (this.f56636f.containsKey(c)) {
                ArrayDeque<TaskCompletionSource<Void>> arrayDeque = this.f56636f.get(c);
                TaskCompletionSource<Void> poll = arrayDeque.poll();
                if (poll != null) {
                    poll.setResult(null);
                }
                if (arrayDeque.isEmpty()) {
                    this.f56636f.remove(c);
                }
            }
        }
    }

    /* renamed from: a */
    private static <T> T m83264a(Task<T> task) throws IOException {
        try {
            return (T) Tasks.await(task, 30, TimeUnit.SECONDS);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            } else if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else {
                throw new IOException(e);
            }
        } catch (InterruptedException | TimeoutException e2) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e2);
        }
    }

    /* renamed from: a */
    private void m83265a(String str) throws IOException {
        InstanceIdResult instanceIdResult = (InstanceIdResult) m83264a(this.f56632b.getInstanceId());
        m83264a(this.f56635e.mo79360c(instanceIdResult.getId(), instanceIdResult.getToken(), str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo79539a(long j) {
        mo79540a(new RunnableC22915v(this, this.f56633c, this.f56634d, Math.min(Math.max(30L, j << 1), f56631a)), j);
        mo79541a(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo79541a(boolean z) {
        this.f56638h = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo79540a(Runnable runnable, long j) {
        this.f56637g.schedule(runnable, j, TimeUnit.SECONDS);
    }

    /* renamed from: a */
    static Task<C22913t> m83262a(FirebaseInstanceId firebaseInstanceId, C22809ab abVar, C22839q qVar, Context context, ScheduledExecutorService scheduledExecutorService) {
        return Tasks.call(scheduledExecutorService, new CallableC22914u(context, scheduledExecutorService, firebaseInstanceId, abVar, qVar));
    }

    /* renamed from: a */
    static final /* synthetic */ C22913t m83263a(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseInstanceId firebaseInstanceId, C22809ab abVar, C22839q qVar) throws Exception {
        return new C22913t(firebaseInstanceId, abVar, C22912s.m83257a(context, scheduledExecutorService), qVar, context, scheduledExecutorService);
    }

    private C22913t(FirebaseInstanceId firebaseInstanceId, C22809ab abVar, C22912s sVar, C22839q qVar, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f56632b = firebaseInstanceId;
        this.f56634d = abVar;
        this.f56639i = sVar;
        this.f56635e = qVar;
        this.f56633c = context;
        this.f56637g = scheduledExecutorService;
    }

    /* renamed from: a */
    static Task<C22913t> m83261a(FirebaseApp firebaseApp, FirebaseInstanceId firebaseInstanceId, C22809ab abVar, AbstractC22923g gVar, HeartBeatInfo heartBeatInfo, AbstractC22860h hVar, Context context, ScheduledExecutorService scheduledExecutorService) {
        return m83262a(firebaseInstanceId, abVar, new C22839q(firebaseApp, abVar, gVar, heartBeatInfo, hVar), context, scheduledExecutorService);
    }
}
