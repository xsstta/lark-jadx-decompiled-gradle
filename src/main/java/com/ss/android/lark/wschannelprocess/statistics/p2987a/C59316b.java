package com.ss.android.lark.wschannelprocess.statistics.p2987a;

import com.ss.android.lark.wschannelprocess.dto.AppLogEntity;
import com.ss.android.lark.wschannelprocess.statistics.AbstractC59317b;
import com.ss.android.lark.wschannelprocess.statistics.C59320c;
import java.util.concurrent.Executor;

/* renamed from: com.ss.android.lark.wschannelprocess.statistics.a.b */
public class C59316b {

    /* renamed from: a */
    private C59320c<AppLogEntity> f147282a;

    /* renamed from: a */
    public void mo201631a(AppLogEntity appLogEntity) {
        this.f147282a.mo201640a(appLogEntity);
    }

    /* renamed from: a */
    public void mo201632a(AbstractC59317b<AppLogEntity> bVar) {
        this.f147282a.mo201641a(bVar);
    }

    public C59316b(Executor executor) {
        this.f147282a = new C59320c<>("AppLogRecorder", new C59315a(), executor);
    }
}
