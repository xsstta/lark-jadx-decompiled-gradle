package com.ss.android.lark.inno.player.live.layer.unmute;

import com.ss.android.lark.inno.player.core.AbstractC39002c;
import com.ss.android.lark.inno.player.live.AbstractC39067e;
import com.ss.android.lark.inno.player.p1973a.C38942a;
import com.ss.android.lark.inno.player.p1973a.C38943b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/inno/player/live/layer/unmute/LiveUnmuteLayer;", "Lcom/ss/android/lark/inno/player/core/BaseLiveLayer;", "Lcom/ss/android/lark/inno/player/layer/ILayerDepend;", "Lcom/ss/android/lark/inno/player/live/layer/unmute/LiveUnmuteView;", "depend", "Lcom/ss/android/lark/inno/player/live/ILiveLayerControlDepend;", "view", "(Lcom/ss/android/lark/inno/player/live/ILiveLayerControlDepend;Lcom/ss/android/lark/inno/player/live/layer/unmute/LiveUnmuteView;)V", "initSupportEvents", "", "onPlayerEvent", "ev", "", "onViewEvent", "setViewVisibility", "visible", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.inno.player.live.a.g.b */
public final class LiveUnmuteLayer extends AbstractC39002c<Object, LiveUnmuteView> {
    @Override // com.ss.android.lark.inno.player.core.AbstractC39001b
    /* renamed from: a */
    public void mo142589a() {
        mo142708b(C38942a.f100058d);
        mo142708b(C38943b.f100077b);
    }

    /* renamed from: a */
    private final void m154149a(boolean z) {
        if (z) {
            ((LiveUnmuteView) mo142710d()).mo142587a();
        } else {
            ((LiveUnmuteView) mo142710d()).mo142588b();
        }
    }

    @Override // com.ss.android.lark.inno.player.layer.AbstractC39017c, com.ss.android.lark.inno.player.core.AbstractC39001b
    /* renamed from: c */
    public void mo142590c(int i) {
        if (i == C38942a.f100058d) {
            AbstractC39067e eVar = (AbstractC39067e) mo142707b();
            Intrinsics.checkExpressionValueIsNotNull(eVar, "layerContorlDepend");
            m154149a(eVar.mo142888f());
        }
    }

    @Override // com.ss.android.lark.inno.player.layer.AbstractC39017c, com.ss.android.lark.inno.player.core.AbstractC39001b
    /* renamed from: d */
    public void mo142591d(int i) {
        if (i == C38943b.f100077b) {
            AbstractC39067e eVar = (AbstractC39067e) mo142707b();
            Intrinsics.checkExpressionValueIsNotNull(eVar, "layerContorlDepend");
            m154149a(eVar.mo142888f());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LiveUnmuteLayer(AbstractC39067e eVar, LiveUnmuteView cVar) {
        super(eVar, cVar);
        Intrinsics.checkParameterIsNotNull(eVar, "depend");
        Intrinsics.checkParameterIsNotNull(cVar, "view");
        cVar.setDepend(new ILiveUnmuteViewDepend(this) {
            /* class com.ss.android.lark.inno.player.live.layer.unmute.LiveUnmuteLayer.C390601 */

            /* renamed from: a */
            final /* synthetic */ LiveUnmuteLayer f100298a;

            @Override // com.ss.android.lark.inno.player.live.layer.unmute.ILiveUnmuteViewDepend
            /* renamed from: a */
            public boolean mo142837a() {
                AbstractC39067e eVar = (AbstractC39067e) this.f100298a.mo142707b();
                Intrinsics.checkExpressionValueIsNotNull(eVar, "layerContorlDepend");
                return eVar.mo142888f();
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f100298a = r1;
            }

            @Override // com.ss.android.lark.inno.player.live.layer.unmute.ILiveUnmuteViewDepend
            /* renamed from: a */
            public void mo142836a(boolean z) {
                AbstractC39067e eVar = (AbstractC39067e) this.f100298a.mo142707b();
                Intrinsics.checkExpressionValueIsNotNull(eVar, "layerContorlDepend");
                eVar.mo142883a(z);
            }
        });
        AbstractC39067e eVar2 = (AbstractC39067e) mo142707b();
        Intrinsics.checkExpressionValueIsNotNull(eVar2, "layerContorlDepend");
        m154149a(eVar2.mo142888f());
    }
}
