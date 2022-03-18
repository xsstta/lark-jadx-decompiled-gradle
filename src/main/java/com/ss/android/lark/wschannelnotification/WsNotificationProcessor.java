package com.ss.android.lark.wschannelnotification;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.wschannelnotification.p2984a.C59280a;
import com.ss.lark.android.module.offlinepush.C64266c;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.atomic.AtomicBoolean;

public class WsNotificationProcessor {

    /* renamed from: a */
    private AtomicBoolean f147239a;

    @Retention(RetentionPolicy.SOURCE)
    public @interface COMMAND {
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.wschannelnotification.WsNotificationProcessor$a */
    public static class C59278a {

        /* renamed from: a */
        public static final WsNotificationProcessor f147240a = new WsNotificationProcessor();
    }

    /* renamed from: a */
    public static WsNotificationProcessor m230212a() {
        return C59278a.f147240a;
    }

    private WsNotificationProcessor() {
        this.f147239a = new AtomicBoolean(false);
    }

    /* renamed from: b */
    public void mo201534b() {
        if (this.f147239a.get()) {
            C59281b.m230223a().mo177781b();
            this.f147239a.set(false);
        }
    }

    /* renamed from: a */
    private boolean m230213a(String str) {
        int intValue = JSONObject.parseObject(str).getIntValue("command");
        if (intValue == 2210 || intValue == 2102) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo201533a(C59280a aVar) {
        AbstractC59279a a = C59281b.m230223a();
        if (a == null) {
            Log.m165383e("WsNotificationProcessor", "[Online] dependency is null, push backgroundNotice fail");
            return;
        }
        a.mo177780a(a.mo177779a(), aVar.mo201535a(), aVar.mo201536b(), aVar.mo201537c());
        if (m230213a(aVar.mo201537c())) {
            Log.m165389i("WsNotificationProcessor", "[Online] receive voip offline command, wakeup main process");
            a.mo177781b();
        }
    }

    /* renamed from: a */
    public void mo201532a(Context context, String str, int i, String str2) {
        C64266c.m252726a(context, str, i, str2, false);
        if (m230213a(JSONObject.parseObject(str).getString("extra_str"))) {
            Log.m165389i("WsNotificationProcessor", "[Offline] receive voip offline command, wakeup main process");
            AbstractC59279a a = C59281b.m230223a();
            if (a != null) {
                a.mo177781b();
            } else {
                this.f147239a.compareAndSet(false, true);
            }
        }
    }
}
