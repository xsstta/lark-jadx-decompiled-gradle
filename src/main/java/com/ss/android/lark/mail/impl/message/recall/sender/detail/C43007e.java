package com.ss.android.lark.mail.impl.message.recall.sender.detail;

import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import com.bytedance.lark.pb.email.client.v1.MailGetRecallDetailResponse;
import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.message.recall.sender.detail.C42997a;
import com.ss.android.lark.mail.impl.network.NetworkChangeListener;
import com.ss.android.lark.mail.impl.utils.C43791r;
import com.ss.android.lark.mail.impl.utils.C43849u;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.ss.android.lark.mail.impl.message.recall.sender.detail.e */
public class C43007e extends BasePresenter<C42997a.AbstractC42998a, RecallDetailView, C42997a.AbstractC42999b.AbstractC43000a> {

    /* renamed from: a */
    NetworkChangeListener f109494a = new NetworkChangeListener() {
        /* class com.ss.android.lark.mail.impl.message.recall.sender.detail.$$Lambda$e$7xvftlloOBDFbqsW4B6rLdmPyE */

        @Override // com.ss.android.lark.mail.impl.network.NetworkChangeListener
        public final void onNetworkChanged(NetworkChangeListener.NetworkLevel networkLevel) {
            C43007e.this.m171127a(networkLevel);
        }
    };

    /* renamed from: b */
    private TimerTask f109495b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C42997a.AbstractC42999b.AbstractC43000a createViewDelegate() {
        return new C42997a.AbstractC42999b.AbstractC43000a() {
            /* class com.ss.android.lark.mail.impl.message.recall.sender.detail.C43007e.C430103 */

            @Override // com.ss.android.lark.mail.impl.message.recall.sender.detail.C42997a.AbstractC42999b.AbstractC43000a
            /* renamed from: c */
            public void mo154165c() {
                C43007e.this.mo154171b();
            }

            @Override // com.ss.android.lark.mail.impl.message.recall.sender.detail.C42997a.AbstractC42999b.AbstractC43000a
            /* renamed from: a */
            public C1177w<Integer> mo154163a() {
                return ((C42997a.AbstractC42998a) C43007e.this.getModel()).mo154160a();
            }

            @Override // com.ss.android.lark.mail.impl.message.recall.sender.detail.C42997a.AbstractC42999b.AbstractC43000a
            /* renamed from: b */
            public C1177w<List<C43001b>> mo154164b() {
                return ((C42997a.AbstractC42998a) C43007e.this.getModel()).mo154161b();
            }
        };
    }

    /* renamed from: c */
    public void mo154172c() {
        TimerTask timerTask = this.f109495b;
        if (timerTask != null) {
            timerTask.cancel();
        }
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        mo154172c();
        super.destroy();
    }

    /* renamed from: b */
    public void mo154171b() {
        this.f109495b = new TimerTask() {
            /* class com.ss.android.lark.mail.impl.message.recall.sender.detail.C43007e.C430114 */

            public void run() {
                ((C42997a.AbstractC42998a) C43007e.this.getModel()).mo154162c();
                if (!C43007e.this.mo154173d()) {
                    C43007e.this.mo154172c();
                }
            }
        };
        new Timer().scheduleAtFixedRate(this.f109495b, 0, 5000);
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        ((C42997a.AbstractC42998a) getModel()).mo154160a().mo5923a(((RecallDetailView) getView()).mo154154a(), new AbstractC1178x<Integer>() {
            /* class com.ss.android.lark.mail.impl.message.recall.sender.detail.C43007e.C430092 */

            /* renamed from: a */
            public void onChanged(Integer num) {
                if (num.intValue() == -1) {
                    C43007e.this.mo154172c();
                }
            }
        });
        mo154171b();
        C43791r.m173557a(this.f109494a);
    }

    /* renamed from: d */
    public boolean mo154173d() {
        List<C43001b> b = ((C42997a.AbstractC42998a) getModel()).mo154161b().mo5927b();
        if (b == null || b.size() <= 0) {
            return true;
        }
        for (C43001b bVar : b) {
            if (bVar.f109482a.status.getValue() == MailGetRecallDetailResponse.MailRecallDetailStatus.RECALL_PROCESSING.getValue()) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m171127a(final NetworkChangeListener.NetworkLevel networkLevel) {
        C43849u.m173826a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.message.recall.sender.detail.C43007e.RunnableC430081 */

            public void run() {
                String str;
                StringBuilder sb = new StringBuilder();
                sb.append("onNetworkStateChange : ");
                NetworkChangeListener.NetworkLevel networkLevel = networkLevel;
                if (networkLevel != null) {
                    str = networkLevel.toString();
                } else {
                    str = "null";
                }
                sb.append(str);
                Log.m165389i("RecallDetailPresenter", sb.toString());
                if (networkLevel != NetworkChangeListener.NetworkLevel.NET_UNAVAILABLE && networkLevel != NetworkChangeListener.NetworkLevel.SERVICE_UNAVAILABLE) {
                    ((C42997a.AbstractC42998a) C43007e.this.getModel()).mo154162c();
                }
            }
        });
    }

    public C43007e(C42997a.AbstractC42998a aVar, RecallDetailView recallDetailView) {
        super(aVar, recallDetailView);
    }
}
