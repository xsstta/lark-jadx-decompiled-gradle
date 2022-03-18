package com.bytedance.frameworks.baselib.network.dispatcher;

import com.bytedance.common.utility.StringUtils;
import com.bytedance.frameworks.baselib.network.dispatcher.IRequest;

/* renamed from: com.bytedance.frameworks.baselib.network.dispatcher.a */
public class C13953a extends AbstractRunnableC13954b {

    /* renamed from: e */
    private final boolean f36471e;

    /* renamed from: f */
    private final Runnable f36472f;

    /* renamed from: g */
    private final IRequest.Priority f36473g;

    /* renamed from: h */
    private final String f36474h;

    @Override // com.bytedance.frameworks.baselib.network.dispatcher.IRequest
    /* renamed from: a */
    public IRequest.Priority mo51318a() {
        return this.f36473g;
    }

    @Override // com.bytedance.frameworks.baselib.network.dispatcher.IRequest
    /* renamed from: b */
    public int mo51319b() {
        return this.f36478d;
    }

    public void run() {
        if (this.f36472f != null && !mo51327e()) {
            this.f36472f.run();
        }
    }

    /* renamed from: a */
    public C13953a mo51322b(int i) {
        this.f36478d = i;
        return this;
    }

    /* renamed from: a */
    public int compareTo(IRequest iRequest) {
        IRequest.Priority a = mo51318a();
        IRequest.Priority a2 = iRequest.mo51318a();
        if (a == null) {
            a = IRequest.Priority.NORMAL;
        }
        if (a2 == null) {
            a2 = IRequest.Priority.NORMAL;
        }
        if (a == a2) {
            return mo51319b() - iRequest.mo51319b();
        }
        return a2.ordinal() - a.ordinal();
    }

    public C13953a(String str, IRequest.Priority priority, int i, Runnable runnable, boolean z) {
        this.f36473g = priority;
        str = StringUtils.isEmpty(str) ? getClass().getSimpleName() : str;
        this.f36477c = i;
        this.f36474h = str;
        this.f36472f = runnable;
        this.f36471e = z;
    }
}
