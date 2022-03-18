package com.fcm.service;

import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.push.PushSupporter;
import com.fcm.FcmPushAdapter;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class SSGcmListenerService extends FirebaseMessagingService {
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(String str) {
        super.onNewToken(str);
        sendToken(str);
    }

    private void sendToken(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                Intent intent = new Intent(this, FcmRegistrationJobIntentService.class);
                intent.putExtra("key_token", str);
                FcmRegistrationJobIntentService.enqueueWork(this, intent);
            }
        } catch (Throwable th) {
            PushSupporter.logger().mo68952e("SSGcmListenerService", th.getMessage());
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(RemoteMessage remoteMessage) {
        try {
            PushSupporter.pushHandler().handlePassThroughMsg(remoteMessage.getData().get(PushSupporter.thirdService().getFcmPayloadName()), FcmPushAdapter.getFcmPush(), (String) null);
        } catch (Exception e) {
            PushSupporter.logger().mo68952e("SSGcmListenerService", e.getMessage());
        }
    }
}
