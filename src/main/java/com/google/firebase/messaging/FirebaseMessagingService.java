package com.google.firebase.messaging;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.datatransport.AbstractC21393e;
import com.google.android.datatransport.AbstractC21394f;
import com.google.android.datatransport.C21349b;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.iid.MessengerIpcClient;
import com.google.firebase.iid.am;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class FirebaseMessagingService extends EnhancedIntentService {
    public static final String ACTION_DIRECT_BOOT_REMOTE_INTENT = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT";
    private static final Queue<String> recentlyReceivedMessageIds = new ArrayDeque(10);

    public void onDeletedMessages() {
    }

    public void onMessageReceived(RemoteMessage remoteMessage) {
    }

    public void onMessageSent(String str) {
    }

    public void onNewToken(String str) {
    }

    public void onSendError(String str, Exception exc) {
    }

    /* access modifiers changed from: package-private */
    public long getAckTimeoutMillis() {
        return TimeUnit.SECONDS.toMillis(1);
    }

    private String getMessageId(Intent intent) {
        String stringExtra = intent.getStringExtra("google.message_id");
        if (stringExtra == null) {
            return intent.getStringExtra("message_id");
        }
        return stringExtra;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.firebase.messaging.EnhancedIntentService
    public Intent getStartCommandIntent(Intent intent) {
        return am.m82890a().mo79325b();
    }

    private Task<Void> ackMessage(String str) {
        if (TextUtils.isEmpty(str)) {
            return Tasks.forResult(null);
        }
        Bundle bundle = new Bundle();
        bundle.putString("google.message_id", str);
        return MessengerIpcClient.m82830a(this).mo79277a(2, bundle);
    }

    private void handleNotificationOpen(Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
                Log.e("FirebaseMessaging", "Notification pending intent canceled");
            }
        }
        if (C22906m.m83197d(intent)) {
            C22906m.m83187a(intent);
        }
    }

    @Override // com.google.firebase.messaging.EnhancedIntentService
    public boolean handleIntentOnMainThread(Intent intent) {
        if (!"com.google.firebase.messaging.NOTIFICATION_OPEN".equals(intent.getAction())) {
            return false;
        }
        handleNotificationOpen(intent);
        return true;
    }

    private boolean alreadyReceivedMessage(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Queue<String> queue = recentlyReceivedMessageIds;
        if (!queue.contains(str)) {
            if (queue.size() >= 10) {
                queue.remove();
            }
            queue.add(str);
            return false;
        } else if (!Log.isLoggable("FirebaseMessaging", 3)) {
            return true;
        } else {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2 = "Received duplicate message: ".concat(valueOf);
            } else {
                str2 = new String("Received duplicate message: ");
            }
            Log.d("FirebaseMessaging", str2);
            return true;
        }
    }

    private void dispatchMessage(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        extras.remove("androidx.content.wakelockid");
        if (C22907n.m83214a(extras)) {
            C22907n nVar = new C22907n(extras);
            ExecutorService c = C22896f.m83171c();
            try {
                if (!new C22892b(this, nVar, c).mo79491a()) {
                    c.shutdown();
                    if (C22906m.m83197d(intent)) {
                        C22906m.m83195c(intent);
                    }
                } else {
                    return;
                }
            } finally {
                c.shutdown();
            }
        }
        onMessageReceived(new RemoteMessage(extras));
    }

    private void handleMessageIntent(Intent intent) {
        String stringExtra = intent.getStringExtra("google.message_id");
        Task<Void> ackMessage = ackMessage(stringExtra);
        if (!alreadyReceivedMessage(stringExtra)) {
            passMessageIntentToSdk(intent);
        }
        try {
            Tasks.await(ackMessage, getAckTimeoutMillis(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
            sb.append("Message ack failed: ");
            sb.append(valueOf);
            Log.w("FirebaseMessaging", sb.toString());
        }
    }

    @Override // com.google.firebase.messaging.EnhancedIntentService
    public void handleIntent(Intent intent) {
        String str;
        String action = intent.getAction();
        if ("com.google.android.c2dm.intent.RECEIVE".equals(action) || ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(action)) {
            handleMessageIntent(intent);
        } else if ("com.google.firebase.messaging.NOTIFICATION_DISMISS".equals(action)) {
            if (C22906m.m83197d(intent)) {
                C22906m.m83193b(intent);
            }
        } else if ("com.google.firebase.messaging.NEW_TOKEN".equals(action)) {
            onNewToken(intent.getStringExtra("token"));
        } else {
            String valueOf = String.valueOf(intent.getAction());
            if (valueOf.length() != 0) {
                str = "Unknown intent action: ".concat(valueOf);
            } else {
                str = new String("Unknown intent action: ");
            }
            Log.d("FirebaseMessaging", str);
        }
    }

    private void passMessageIntentToSdk(Intent intent) {
        String str;
        String stringExtra = intent.getStringExtra("message_type");
        if (stringExtra == null) {
            stringExtra = "gcm";
        }
        stringExtra.hashCode();
        char c = 65535;
        switch (stringExtra.hashCode()) {
            case -2062414158:
                if (stringExtra.equals("deleted_messages")) {
                    c = 0;
                    break;
                }
                break;
            case 102161:
                if (stringExtra.equals("gcm")) {
                    c = 1;
                    break;
                }
                break;
            case 814694033:
                if (stringExtra.equals("send_error")) {
                    c = 2;
                    break;
                }
                break;
            case 814800675:
                if (stringExtra.equals("send_event")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                onDeletedMessages();
                return;
            case 1:
                if (C22906m.m83197d(intent)) {
                    C22906m.m83188a(intent, (AbstractC21393e<String>) null);
                }
                if (C22906m.m83198e(intent)) {
                    AbstractC21394f b = FirebaseMessaging.m83139b();
                    if (b != null) {
                        C22906m.m83188a(intent, b.mo72601a("FCM_CLIENT_EVENT_LOGGING", String.class, C21349b.m77288a("json"), C22899i.f56606a));
                    } else {
                        Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
                    }
                }
                dispatchMessage(intent);
                return;
            case 2:
                onSendError(getMessageId(intent), new SendException(intent.getStringExtra("error")));
                return;
            case 3:
                onMessageSent(intent.getStringExtra("google.message_id"));
                return;
            default:
                String valueOf = String.valueOf(stringExtra);
                if (valueOf.length() != 0) {
                    str = "Received message with unknown type: ".concat(valueOf);
                } else {
                    str = new String("Received message with unknown type: ");
                }
                Log.w("FirebaseMessaging", str);
                return;
        }
    }
}
