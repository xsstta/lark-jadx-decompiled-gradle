package com.ss.android.lark.wschannelprocess.statistics.p2988b;

import com.ss.android.lark.wschannelprocess.dto.TeaLogEntity;
import com.ss.android.lark.wschannelprocess.statistics.AbstractC59317b;
import com.ss.android.lark.wschannelprocess.statistics.C59320c;
import java.util.concurrent.Executor;

/* renamed from: com.ss.android.lark.wschannelprocess.statistics.b.b */
public class C59319b {

    /* renamed from: a */
    private C59320c<TeaLogEntity> f147283a;

    /* renamed from: a */
    public void mo201636a(TeaLogEntity teaLogEntity) {
        this.f147283a.mo201640a(teaLogEntity);
    }

    /* renamed from: a */
    public void mo201637a(AbstractC59317b<TeaLogEntity> bVar) {
        this.f147283a.mo201641a(bVar);
    }

    public C59319b(Executor executor) {
        this.f147283a = new C59320c<>("TeaLogRecorder", new C59318a(), executor);
    }
}
