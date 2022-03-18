package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.google.android.gms.tasks.Task;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;
import java.util.concurrent.ExecutorService;

public final class FirebaseInstanceIdReceiver extends WakefulBroadcastReceiver {

    /* renamed from: a */
    private final ExecutorService f56354a = C22829g.m82948b();

    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            m82827b(context, m82825a(context, intent));
        }
    }

    /* renamed from: a */
    private static Intent m82825a(Context context, Intent intent) {
        Intent a = am.m82889a(intent);
        if (a != null) {
            intent = a;
        }
        intent.setComponent(null);
        intent.setPackage(context.getPackageName());
        if (Build.VERSION.SDK_INT <= 18) {
            intent.removeCategory(context.getPackageName());
        }
        return intent;
    }

    /* renamed from: b */
    private final void m82827b(Context context, Intent intent) {
        AbstractC22806a aVar;
        if ("google.com/iid".equals(intent.getStringExtra("from"))) {
            aVar = new C22841s(this.f56354a);
        } else {
            aVar = new C22824b(context, this.f56354a);
        }
        aVar.mo79305a(intent).addOnCompleteListener(this.f56354a, new C22838p(isOrderedBroadcast(), goAsync()));
    }

    /* renamed from: a */
    static final /* synthetic */ void m82826a(boolean z, BroadcastReceiver.PendingResult pendingResult, Task task) {
        int i;
        if (z) {
            if (task.isSuccessful()) {
                i = ((Integer) task.getResult()).intValue();
            } else {
                i = ParticipantRepo.f117150c;
            }
            pendingResult.setResultCode(i);
        }
        pendingResult.finish();
    }
}
