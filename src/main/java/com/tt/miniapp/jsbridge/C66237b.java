package com.tt.miniapp.jsbridge;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.miniapp.settings.v2.handler.C66763b;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: com.tt.miniapp.jsbridge.b */
public class C66237b {

    /* renamed from: a */
    private final Queue<Runnable> f167190a = new LinkedList();

    /* renamed from: a */
    public void mo231608a(Runnable runnable) {
        this.f167190a.offer(runnable);
    }

    /* renamed from: b */
    public void mo231611b(Runnable runnable) {
        this.f167190a.remove(runnable);
    }

    /* renamed from: a */
    public boolean mo231609a(String str) {
        if (!"beforeLoad".equals(str) && !"beforeShow".equals(str) && !"afterShow".equals(str)) {
            return false;
        }
        while (!this.f167190a.isEmpty()) {
            Runnable poll = this.f167190a.poll();
            if (poll != null) {
                AppBrandLogger.m52830i("ApiQuickCalledManager", "quick async callback");
                poll.run();
            }
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo231610a(String str, String str2) {
        return C66763b.m260598a().mo232669a(str).contains(str2);
    }
}
