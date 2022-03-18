package com.tt.refer.abs.container.background;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\fJ\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H'J\b\u0010\u0006\u001a\u00020\u0003H'J\b\u0010\u0007\u001a\u00020\u0003H'J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&¨\u0006\r"}, d2 = {"Lcom/tt/refer/abs/container/background/IForeBackgroundService;", "", "clearListener", "", "isBackground", "", "onBackGround", "onForeGround", "registerForeBackgroundListener", "listener", "Lcom/tt/refer/abs/container/background/IForeBackgroundService$ForeBackgroundListener;", "unregisterForeBackgroundListener", "ForeBackgroundListener", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.tt.refer.a.d.a.b */
public interface IForeBackgroundService {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\b\u0010\u0006\u001a\u00020\u0003H'¨\u0006\u0007"}, d2 = {"Lcom/tt/refer/abs/container/background/IForeBackgroundService$ForeBackgroundListener;", "", "onBackGround", "", "stayBackgroundTimeMillis", "", "onForeGround", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.tt.refer.a.d.a.b$a */
    public interface ForeBackgroundListener {
        /* renamed from: a */
        void mo87717a();

        /* renamed from: a */
        void mo87718a(long j);
    }

    /* renamed from: a */
    void mo235070a();

    /* renamed from: a */
    void mo235071a(ForeBackgroundListener aVar);

    /* renamed from: b */
    void mo235072b(ForeBackgroundListener aVar);

    /* renamed from: c */
    void mo235073c();

    /* renamed from: d */
    boolean mo235074d();

    /* renamed from: e */
    void mo235075e();
}
