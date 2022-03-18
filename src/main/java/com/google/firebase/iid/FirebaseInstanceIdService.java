package com.google.firebase.iid;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class FirebaseInstanceIdService extends Service {
    public final IBinder onBind(Intent intent) {
        return null;
    }
}
