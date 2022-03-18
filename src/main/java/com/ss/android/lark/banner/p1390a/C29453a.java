package com.ss.android.lark.banner.p1390a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import androidx.p034e.p035a.C0978a;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.banner.C29452a;
import com.ss.android.lark.log.Log;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.lark.banner.a.a */
public class C29453a {

    /* renamed from: a */
    private final List<AbstractC29457b> f73565a = new CopyOnWriteArrayList();

    /* renamed from: b */
    private BroadcastReceiver f73566b = new BroadcastReceiver() {
        /* class com.ss.android.lark.banner.p1390a.C29453a.C294541 */

        public void onReceive(final Context context, final Intent intent) {
            CoreThreadPool.getDefault().getCachedThreadPool().submit(new Runnable() {
                /* class com.ss.android.lark.banner.p1390a.C29453a.C294541.RunnableC294551 */

                public void run() {
                    C294541.this.mo104324a(context, intent);
                }
            });
        }

        /* renamed from: a */
        public void mo104324a(Context context, Intent intent) {
            if (intent != null) {
                try {
                    if (TextUtils.equals(intent.getAction(), "com.ss.android.lark.banner.receiver.ACTION") && TextUtils.equals(intent.getStringExtra("op_name"), "close_banner")) {
                        C29453a.this.mo104321a(intent);
                    }
                } catch (Exception e) {
                    Log.m165386e("BannerBroadcast", e);
                }
            }
        }
    };

    /* renamed from: com.ss.android.lark.banner.a.a$a */
    private static class C29456a {

        /* renamed from: a */
        public static final C29453a f73571a = new C29453a();
    }

    /* renamed from: com.ss.android.lark.banner.a.a$b */
    public interface AbstractC29457b {
        /* renamed from: a */
        void mo104327a(String str);
    }

    /* renamed from: a */
    public static C29453a m108411a() {
        return C29456a.f73571a;
    }

    /* renamed from: b */
    private void m108412b() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.ss.android.lark.banner.receiver.ACTION");
        C0978a.m4782a(C29452a.m108408a().mo104360a()).mo4991a(this.f73566b, intentFilter);
    }

    /* renamed from: c */
    private void m108413c() {
        C0978a.m4782a(C29452a.m108408a().mo104360a()).mo4990a(this.f73566b);
    }

    /* renamed from: a */
    public void mo104321a(Intent intent) {
        if (intent != null) {
            String stringExtra = intent.getStringExtra("banner_key");
            if (!TextUtils.isEmpty(stringExtra)) {
                for (AbstractC29457b bVar : this.f73565a) {
                    bVar.mo104327a(stringExtra);
                }
            }
        }
    }

    /* renamed from: b */
    public void mo104323b(AbstractC29457b bVar) {
        if (bVar != null) {
            this.f73565a.remove(bVar);
            if (this.f73565a.isEmpty()) {
                synchronized (this.f73565a) {
                    if (this.f73565a.isEmpty()) {
                        m108413c();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void mo104322a(AbstractC29457b bVar) {
        if (bVar != null && !this.f73565a.contains(bVar)) {
            if (this.f73565a.isEmpty()) {
                synchronized (this.f73565a) {
                    if (this.f73565a.isEmpty()) {
                        m108412b();
                    }
                }
            }
            this.f73565a.add(bVar);
        }
    }
}
