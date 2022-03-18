package com.bytedance.push.notification;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.common.push.ThreadPlus;
import com.bytedance.push.notification.AbstractC20474a;
import com.bytedance.push.p881c.AbstractC20390a;
import com.bytedance.push.p881c.C20392c;

/* renamed from: com.bytedance.push.notification.b */
public class C20477b implements Handler.Callback, AbstractC20480c {

    /* renamed from: a */
    public final AbstractC20390a f49964a;

    /* renamed from: b */
    public Handler f49965b;

    public boolean handleMessage(Message message) {
        return false;
    }

    public C20477b(AbstractC20390a aVar) {
        this.f49964a = aVar;
    }

    @Override // com.bytedance.push.p881c.AbstractC20390a
    /* renamed from: a */
    public Bitmap mo68775a(C20392c cVar) {
        return this.f49964a.mo68775a(cVar);
    }

    /* renamed from: a */
    public void mo68968a(final C20392c cVar, final AbstractC20474a.AbstractC20476a aVar) {
        if (this.f49965b == null) {
            this.f49965b = new Handler(Looper.getMainLooper(), this);
        }
        ThreadPlus.submitRunnable(new Runnable() {
            /* class com.bytedance.push.notification.C20477b.RunnableC204781 */

            public void run() {
                final Bitmap bitmap;
                try {
                    bitmap = C20477b.this.f49964a.mo68775a(cVar);
                } catch (Throwable th) {
                    th.printStackTrace();
                    bitmap = null;
                }
                C20477b.this.f49965b.post(new Runnable() {
                    /* class com.bytedance.push.notification.C20477b.RunnableC204781.RunnableC204791 */

                    public void run() {
                        Bitmap bitmap = bitmap;
                        if (bitmap == null || bitmap.isRecycled()) {
                            aVar.mo68966a();
                        } else {
                            aVar.mo68967a(bitmap);
                        }
                    }
                });
            }
        });
    }
}
