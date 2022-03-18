package com.ss.android.lark.notification.offline;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.notification.C48398a;

public class NotificationClickReceiver extends BroadcastReceiver {
    public void onReceive(final Context context, final Intent intent) {
        if (TextUtils.equals("com.ss.android.lark.notification.receiver", intent.getAction())) {
            Log.m165389i("NotificationClickReceiver", "on click");
            CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable() {
                /* class com.ss.android.lark.notification.offline.NotificationClickReceiver.RunnableC485421 */

                public void run() {
                    final Intent intent = (Intent) intent.getParcelableExtra("origin_intent");
                    String stringExtra = intent.getStringExtra("user_id");
                    boolean booleanExtra = intent.getBooleanExtra("need_switch_tenant", false);
                    if (TextUtils.isEmpty(stringExtra) || !booleanExtra) {
                        context.startActivity(intent);
                    } else {
                        C48398a.m190922a().mo169338a(stringExtra, new IGetDataCallback<Boolean>() {
                            /* class com.ss.android.lark.notification.offline.NotificationClickReceiver.RunnableC485421.C485431 */

                            /* renamed from: a */
                            public void onSuccess(Boolean bool) {
                                context.startActivity(intent);
                            }

                            @Override // com.larksuite.framework.callback.IGetDataCallback
                            public void onError(ErrorResult errorResult) {
                                context.startActivity(intent);
                            }
                        });
                    }
                }
            });
        }
    }
}
