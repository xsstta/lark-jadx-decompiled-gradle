package com.ss.android.lark.inno.player.live.layer.stall;

import android.os.Bundle;
import com.huawei.hms.adapter.internal.CommonCode;
import com.ss.android.lark.inno.player.core.AbstractC39002c;
import com.ss.android.lark.inno.player.live.AbstractC39067e;
import com.ss.android.lark.inno.player.p1973a.C38942a;
import com.ss.android.lark.inno.utils.C39093c;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\u001a\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/inno/player/live/layer/stall/LiveTipLayer;", "Lcom/ss/android/lark/inno/player/core/BaseLiveLayer;", "Lcom/ss/android/lark/inno/player/layer/ILayerDepend;", "Lcom/ss/android/lark/inno/player/live/layer/stall/BaseLiveTipLayerView;", "depend", "Lcom/ss/android/lark/inno/player/live/ILiveLayerControlDepend;", "view", "(Lcom/ss/android/lark/inno/player/live/ILiveLayerControlDepend;Lcom/ss/android/lark/inno/player/live/layer/stall/BaseLiveTipLayerView;)V", "resolutionDegreePolicy", "Lcom/ss/android/lark/inno/player/live/layer/stall/IResolutionDegreeTriggerPolicy;", "getSuggestedClarity", "", "initSupportEvents", "", "onPlayerEvent", "ev", "bundle", "Landroid/os/Bundle;", "onViewEvent", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.inno.player.live.a.e.e */
public final class LiveTipLayer extends AbstractC39002c<Object, BaseLiveTipLayerView> {

    /* renamed from: d */
    private final IResolutionDegreeTriggerPolicy f100257d;

    @Override // com.ss.android.lark.inno.player.core.AbstractC39001b
    /* renamed from: a */
    public void mo142589a() {
        mo142708b(C38942a.f100065k);
        mo142708b(C38942a.f100066l);
        mo142708b(C38942a.f100067m);
        mo142708b(C38942a.f100068n);
    }

    /* renamed from: e */
    public final int mo142812e() {
        AbstractC39067e eVar = (AbstractC39067e) mo142707b();
        Intrinsics.checkExpressionValueIsNotNull(eVar, "layerContorlDepend");
        int j = eVar.mo142892j();
        if (j == 3) {
            return 3;
        }
        return j + 1;
    }

    @Override // com.ss.android.lark.inno.player.layer.AbstractC39017c, com.ss.android.lark.inno.player.core.AbstractC39001b
    /* renamed from: c */
    public void mo142590c(int i) {
        this.f100257d.mo142811a(i);
    }

    @Override // com.ss.android.lark.inno.player.layer.AbstractC39017c, com.ss.android.lark.inno.player.core.AbstractC39001b
    /* renamed from: d */
    public void mo142591d(int i) {
        this.f100257d.mo142811a(i);
    }

    @Override // com.ss.android.lark.inno.player.layer.AbstractC39017c, com.ss.android.lark.inno.player.core.AbstractC39001b
    /* renamed from: a */
    public void mo142656a(int i, Bundle bundle) {
        Object obj;
        this.f100257d.mo142811a(i);
        if (i == C38942a.f100067m) {
            String str = null;
            if (bundle != null) {
                obj = bundle.get(CommonCode.MapKey.HAS_RESOLUTION);
            } else {
                obj = null;
            }
            if (obj instanceof String) {
                str = obj;
            }
            String str2 = str;
            if (str2 != null) {
                ((BaseLiveTipLayerView) mo142710d()).mo142795a(C39093c.m154343a(str2));
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LiveTipLayer(AbstractC39067e eVar, final BaseLiveTipLayerView aVar) {
        super(eVar, aVar);
        Intrinsics.checkParameterIsNotNull(eVar, "depend");
        Intrinsics.checkParameterIsNotNull(aVar, "view");
        ResolutionDegreeTriggerPolicyImpl gVar = new ResolutionDegreeTriggerPolicyImpl(0, new Function0<Unit>(this) {
            /* class com.ss.android.lark.inno.player.live.layer.stall.LiveTipLayer.C390451 */
            final /* synthetic */ LiveTipLayer this$0;

            {
                this.this$0 = r1;
            }

            @Override // kotlin.jvm.functions.Function0
            public final void invoke() {
                aVar.mo142796a(this.this$0.mo142812e(), true);
            }
        });
        this.f100257d = gVar;
        Iterator<T> it = gVar.mo142810a().iterator();
        while (it.hasNext()) {
            mo142708b(it.next().intValue());
        }
        aVar.setDepend(new ILiveStallViewDepend(this) {
            /* class com.ss.android.lark.inno.player.live.layer.stall.LiveTipLayer.C390462 */

            /* renamed from: a */
            final /* synthetic */ LiveTipLayer f100258a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f100258a = r1;
            }

            @Override // com.ss.android.lark.inno.player.live.layer.stall.ILiveStallViewDepend
            /* renamed from: a */
            public void mo142809a(int i) {
                ((AbstractC39067e) this.f100258a.mo142707b()).c_(i);
            }
        });
    }
}
