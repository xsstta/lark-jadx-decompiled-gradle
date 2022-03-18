package com.google.firebase.iid;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.internal.p976a.HandlerC21845e;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.iid.FirebaseIidMessengerCompat;
import java.io.IOException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.firebase.iid.ag */
public class C22815ag {

    /* renamed from: a */
    private static int f56386a;

    /* renamed from: b */
    private static PendingIntent f56387b;

    /* renamed from: c */
    private final SimpleArrayMap<String, TaskCompletionSource<Bundle>> f56388c = new SimpleArrayMap<>();

    /* renamed from: d */
    private final Context f56389d;

    /* renamed from: e */
    private final C22809ab f56390e;

    /* renamed from: f */
    private final ScheduledExecutorService f56391f;

    /* renamed from: g */
    private Messenger f56392g;

    /* renamed from: h */
    private Messenger f56393h;

    /* renamed from: i */
    private FirebaseIidMessengerCompat f56394i;

    /* renamed from: a */
    public void mo79319a(Message message) {
        if (message == null || !(message.obj instanceof Intent)) {
            Log.w("FirebaseInstanceId", "Dropping invalid message");
            return;
        }
        Intent intent = (Intent) message.obj;
        intent.setExtrasClassLoader(new FirebaseIidMessengerCompat.C22797a());
        if (intent.hasExtra("google.messenger")) {
            Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
            if (parcelableExtra instanceof FirebaseIidMessengerCompat) {
                this.f56394i = (FirebaseIidMessengerCompat) parcelableExtra;
            }
            if (parcelableExtra instanceof Messenger) {
                this.f56393h = (Messenger) parcelableExtra;
            }
        }
        m82878b((Intent) message.obj);
    }

    /* renamed from: a */
    public void mo79318a(Intent intent, String str) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 5);
        sb.append("|ID|");
        sb.append(str);
        sb.append("|");
        intent.putExtra("kid", sb.toString());
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String valueOf = String.valueOf(intent.getExtras());
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 8);
            sb2.append("Sending ");
            sb2.append(valueOf);
            Log.d("FirebaseInstanceId", sb2.toString());
        }
        intent.putExtra("google.messenger", this.f56392g);
        if (!(this.f56393h == null && this.f56394i == null)) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f56393h;
                if (messenger != null) {
                    messenger.send(obtain);
                    return;
                } else {
                    this.f56394i.mo79228a(obtain);
                    return;
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    Log.d("FirebaseInstanceId", "Messenger failed, fallback to startService");
                }
            }
        }
        if (this.f56390e.mo79308b() == 2) {
            this.f56389d.sendBroadcast(intent);
        } else {
            this.f56389d.startService(intent);
        }
    }

    /* renamed from: a */
    public void mo79317a(Intent intent) {
        String stringExtra = intent.getStringExtra("error");
        if (stringExtra == null) {
            String valueOf = String.valueOf(intent.getExtras());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49);
            sb.append("Unexpected response, no error or registration id ");
            sb.append(valueOf);
            Log.w("FirebaseInstanceId", sb.toString());
            return;
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String valueOf2 = String.valueOf(stringExtra);
            Log.d("FirebaseInstanceId", valueOf2.length() != 0 ? "Received InstanceID error ".concat(valueOf2) : new String("Received InstanceID error "));
        }
        if (stringExtra.startsWith("|")) {
            String[] split = stringExtra.split("\\|");
            if (split.length <= 2 || !"ID".equals(split[1])) {
                String valueOf3 = String.valueOf(stringExtra);
                Log.w("FirebaseInstanceId", valueOf3.length() != 0 ? "Unexpected structured response ".concat(valueOf3) : new String("Unexpected structured response "));
                return;
            }
            String str = split[2];
            String str2 = split[3];
            if (str2.startsWith(":")) {
                str2 = str2.substring(1);
            }
            m82876a(str, intent.putExtra("error", str2).getExtras());
            return;
        }
        synchronized (this.f56388c) {
            for (int i = 0; i < this.f56388c.size(); i++) {
                m82876a(this.f56388c.keyAt(i), intent.getExtras());
            }
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo79320a(String str, ScheduledFuture scheduledFuture, Task task) {
        synchronized (this.f56388c) {
            this.f56388c.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    /* renamed from: a */
    public final /* synthetic */ Task mo79316a(Bundle bundle, Task task) {
        if (task.isSuccessful() && m82880d((Bundle) task.getResult())) {
            return m82881e(bundle).onSuccessTask(C22829g.m82947a(), al.f56403a);
        }
        return task;
    }

    /* renamed from: a */
    public static synchronized String m82872a() {
        String num;
        synchronized (C22815ag.class) {
            int i = f56386a;
            f56386a = i + 1;
            num = Integer.toString(i);
        }
        return num;
    }

    /* renamed from: d */
    private static boolean m82880d(Bundle bundle) {
        if (bundle == null || !bundle.containsKey("google.messenger")) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    static final /* synthetic */ Task m82877b(Bundle bundle) {
        if (m82880d(bundle)) {
            return Tasks.forResult(null);
        }
        return Tasks.forResult(bundle);
    }

    /* renamed from: c */
    private Task<Bundle> m82879c(Bundle bundle) {
        if (!this.f56390e.mo79307a()) {
            return Tasks.forException(new IOException("MISSING_INSTANCEID_SERVICE"));
        }
        return m82881e(bundle).continueWithTask(C22829g.m82947a(), new C22818ai(this, bundle));
    }

    /* renamed from: e */
    private Task<Bundle> m82881e(Bundle bundle) {
        String a = m82872a();
        TaskCompletionSource<Bundle> taskCompletionSource = new TaskCompletionSource<>();
        synchronized (this.f56388c) {
            this.f56388c.put(a, taskCompletionSource);
        }
        m82874a(bundle, a);
        taskCompletionSource.getTask().addOnCompleteListener(C22829g.m82947a(), new ak(this, a, this.f56391f.schedule(new aj(taskCompletionSource), 30, TimeUnit.SECONDS)));
        return taskCompletionSource.getTask();
    }

    /* renamed from: a */
    static final /* synthetic */ Bundle m82871a(Task task) {
        if (task.isSuccessful()) {
            return (Bundle) task.getResult();
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String valueOf = String.valueOf(task.getException());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
            sb.append("Error making request: ");
            sb.append(valueOf);
            Log.d("FirebaseInstanceId", sb.toString());
        }
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    /* renamed from: b */
    private void m82878b(Intent intent) {
        String str;
        String str2;
        String action = intent.getAction();
        if ("com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
            String stringExtra = intent.getStringExtra("registration_id");
            if (stringExtra == null) {
                stringExtra = intent.getStringExtra("unregistered");
            }
            if (stringExtra == null) {
                mo79317a(intent);
                return;
            }
            Matcher matcher = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)").matcher(stringExtra);
            if (matcher.matches()) {
                String group = matcher.group(1);
                String group2 = matcher.group(2);
                Bundle extras = intent.getExtras();
                extras.putString("registration_id", group2);
                m82876a(group, extras);
            } else if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(stringExtra);
                if (valueOf.length() != 0) {
                    str = "Unexpected response string: ".concat(valueOf);
                } else {
                    str = new String("Unexpected response string: ");
                }
                Log.d("FirebaseInstanceId", str);
            }
        } else if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String valueOf2 = String.valueOf(action);
            if (valueOf2.length() != 0) {
                str2 = "Unexpected response action: ".concat(valueOf2);
            } else {
                str2 = new String("Unexpected response action: ");
            }
            Log.d("FirebaseInstanceId", str2);
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m82875a(TaskCompletionSource taskCompletionSource) {
        if (taskCompletionSource.trySetException(new IOException("TIMEOUT"))) {
            Log.w("FirebaseInstanceId", "No response");
        }
    }

    /* renamed from: a */
    public Task<Bundle> mo79315a(Bundle bundle) {
        if (this.f56390e.mo79311e() >= 12000000) {
            return MessengerIpcClient.m82830a(this.f56389d).mo79278b(1, bundle).continueWith(C22829g.m82947a(), C22817ah.f56396a);
        }
        return m82879c(bundle);
    }

    public C22815ag(Context context, C22809ab abVar) {
        this.f56389d = context;
        this.f56390e = abVar;
        this.f56392g = new Messenger(new HandlerC21845e(Looper.getMainLooper()) {
            /* class com.google.firebase.iid.C22815ag.HandlerC228161 */

            public void handleMessage(Message message) {
                C22815ag.this.mo79319a(message);
            }
        });
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f56391f = scheduledThreadPoolExecutor;
    }

    /* renamed from: a */
    public static synchronized void m82873a(Context context, Intent intent) {
        synchronized (C22815ag.class) {
            if (f56387b == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                f56387b = PendingIntent.getBroadcast(context, 0, intent2, 0);
            }
            intent.putExtra("app", f56387b);
        }
    }

    /* renamed from: a */
    private void m82874a(Bundle bundle, String str) {
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f56390e.mo79308b() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        m82873a(this.f56389d, intent);
        mo79318a(intent, str);
    }

    /* renamed from: a */
    private void m82876a(String str, Bundle bundle) {
        String str2;
        synchronized (this.f56388c) {
            TaskCompletionSource<Bundle> remove = this.f56388c.remove(str);
            if (remove == null) {
                String valueOf = String.valueOf(str);
                if (valueOf.length() != 0) {
                    str2 = "Missing callback for ".concat(valueOf);
                } else {
                    str2 = new String("Missing callback for ");
                }
                Log.w("FirebaseInstanceId", str2);
                return;
            }
            remove.setResult(bundle);
        }
    }
}
