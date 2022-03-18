package com.fcm.p963a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.push.PushSupporter;
import com.fcm.FcmPushAdapter;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.InstanceIdResult;

/* renamed from: com.fcm.a.a */
public class C21281a {
    /* renamed from: a */
    public static void m77097a(final Context context) {
        try {
            FirebaseInstanceId.getInstance().getInstanceId().addOnCompleteListener(new OnCompleteListener<InstanceIdResult>() {
                /* class com.fcm.p963a.C21281a.C212821 */

                @Override // com.google.android.gms.tasks.OnCompleteListener
                public void onComplete(Task<InstanceIdResult> task) {
                    if (task == null || !task.isSuccessful() || task.getResult() == null) {
                        PushSupporter.monitor().monitorRegisterSenderFailed(FcmPushAdapter.getFcmPush(), 102, "0", "token is empty");
                    } else {
                        C21281a.m77098a(context, task.getResult().getToken());
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m77098a(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            PushSupporter.thirdService().registerSenderSuccessAndUploadToken(context, FcmPushAdapter.getFcmPush(), str);
        } else {
            PushSupporter.monitor().monitorRegisterSenderFailed(FcmPushAdapter.getFcmPush(), 102, "0", "token is empty");
        }
    }
}
