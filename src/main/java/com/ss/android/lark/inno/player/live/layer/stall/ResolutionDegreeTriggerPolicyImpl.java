package com.ss.android.lark.inno.player.live.layer.stall;

import com.ss.android.lark.inno.player.p1973a.C38942a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0003H\u0016J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010H\u0016R\u000e\u0010\b\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/inno/player/live/layer/stall/ResolutionDegreeTriggerPolicyImpl;", "Lcom/ss/android/lark/inno/player/live/layer/stall/IResolutionDegreeTriggerPolicy;", "threshold", "", "trigger", "Lkotlin/Function0;", "", "(ILkotlin/jvm/functions/Function0;)V", "stallCount", "getThreshold", "()I", "getTrigger", "()Lkotlin/jvm/functions/Function0;", "onEvents", "ev", "supportEvents", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.inno.player.live.a.e.g */
public final class ResolutionDegreeTriggerPolicyImpl implements IResolutionDegreeTriggerPolicy {

    /* renamed from: a */
    private int f100259a;

    /* renamed from: b */
    private final int f100260b;

    /* renamed from: c */
    private final Function0<Unit> f100261c;

    @Override // com.ss.android.lark.inno.player.live.layer.stall.IResolutionDegreeTriggerPolicy
    /* renamed from: a */
    public List<Integer> mo142810a() {
        return CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(C38942a.f100064j), Integer.valueOf(C38942a.f100065k), Integer.valueOf(C38942a.f100067m), Integer.valueOf(C38942a.f100069o), Integer.valueOf(C38942a.f100070p), Integer.valueOf(C38942a.f100071q), Integer.valueOf(C38942a.f100072r)});
    }

    @Override // com.ss.android.lark.inno.player.live.layer.stall.IResolutionDegreeTriggerPolicy
    /* renamed from: a */
    public void mo142811a(int i) {
        if (i == C38942a.f100067m || i == C38942a.f100064j || i == C38942a.f100069o || i == C38942a.f100070p || i == C38942a.f100071q || i == C38942a.f100072r) {
            this.f100259a = 0;
        } else if (i == C38942a.f100065k) {
            int i2 = this.f100259a + 1;
            this.f100259a = i2;
            if (i2 > this.f100260b) {
                this.f100261c.invoke();
                this.f100259a = 0;
            }
        }
    }

    public ResolutionDegreeTriggerPolicyImpl(int i, Function0<Unit> function0) {
        Intrinsics.checkParameterIsNotNull(function0, "trigger");
        this.f100260b = i;
        this.f100261c = function0;
    }
}
