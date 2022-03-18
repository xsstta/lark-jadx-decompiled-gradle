package com.ss.ugc.effectplatform.task.result;

import bytekn.foundation.task.BaseTaskResult;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.ExceptionResult;
import com.tt.frontendapiinterface.ApiHandler;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0017R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/ss/ugc/effectplatform/task/result/EffectTaskResult;", "Lbytekn/foundation/task/BaseTaskResult;", "effect", "Lcom/ss/ugc/effectplatform/model/Effect;", ApiHandler.API_CALLBACK_EXCEPTION, "Lcom/ss/ugc/effectplatform/model/ExceptionResult;", "(Lcom/ss/ugc/effectplatform/model/Effect;Lcom/ss/ugc/effectplatform/model/ExceptionResult;)V", "getEffect", "()Lcom/ss/ugc/effectplatform/model/Effect;", "setEffect", "(Lcom/ss/ugc/effectplatform/model/Effect;)V", "getException", "()Lcom/ss/ugc/effectplatform/model/ExceptionResult;", "setException", "(Lcom/ss/ugc/effectplatform/model/ExceptionResult;)V", "progress", "", "getProgress", "()Ljava/lang/Integer;", "setProgress", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "totalSize", "", "getTotalSize", "()Ljava/lang/Long;", "setTotalSize", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.ugc.effectplatform.task.b.a */
public final class EffectTaskResult extends BaseTaskResult {

    /* renamed from: a */
    private Integer f165010a = 0;

    /* renamed from: b */
    private Long f165011b = 0L;

    /* renamed from: c */
    private Effect f165012c;

    /* renamed from: d */
    private ExceptionResult f165013d;

    /* renamed from: a */
    public final Effect mo228263a() {
        return this.f165012c;
    }

    /* renamed from: a */
    public final EffectTaskResult mo228264a(int i) {
        this.f165010a = Integer.valueOf(i);
        return this;
    }

    /* renamed from: a */
    public final EffectTaskResult mo228265a(long j) {
        this.f165011b = Long.valueOf(j);
        return this;
    }

    public EffectTaskResult(Effect effect, ExceptionResult cVar) {
        this.f165012c = effect;
        this.f165013d = cVar;
    }
}
