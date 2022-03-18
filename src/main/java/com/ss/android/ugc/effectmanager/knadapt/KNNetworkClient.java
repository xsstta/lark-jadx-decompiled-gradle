package com.ss.android.ugc.effectmanager.knadapt;

import bytekn.foundation.logger.Logger;
import com.huawei.hms.location.LocationRequest;
import com.ss.android.ugc.effectmanager.common.C60499b;
import com.ss.android.ugc.effectmanager.common.p3048c.AbstractC60509a;
import com.ss.ttm.player.MediaPlayer;
import com.ss.ugc.effectplatform.bridge.network.EmptyByteReadStream;
import com.ss.ugc.effectplatform.bridge.network.HTTPMethod;
import com.ss.ugc.effectplatform.bridge.network.INetworkClient;
import com.ss.ugc.effectplatform.bridge.network.NetRequest;
import com.ss.ugc.effectplatform.bridge.network.NetResponse;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \f2\u00020\u0001:\u0001\fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/ugc/effectmanager/knadapt/KNNetworkClient;", "Lcom/ss/ugc/effectplatform/bridge/network/INetworkClient;", "effectNetWrapper", "Lcom/ss/android/ugc/effectmanager/common/listener/IEffectNetWorker;", "(Lcom/ss/android/ugc/effectmanager/common/listener/IEffectNetWorker;)V", "fetchFromNetwork", "Lcom/ss/ugc/effectplatform/bridge/network/NetResponse;", "netRequest", "Lcom/ss/ugc/effectplatform/bridge/network/NetRequest;", "logRequestedUrl", "", "effectRequest", "Companion", "effectmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.ugc.effectmanager.e.f */
public final class KNNetworkClient implements INetworkClient {

    /* renamed from: a */
    public static final Companion f151440a = new Companion(null);

    /* renamed from: b */
    private final AbstractC60509a f151441b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/effectmanager/knadapt/KNNetworkClient$Companion;", "", "()V", "TAG", "", "effectmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.effectmanager.e.f$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public KNNetworkClient(AbstractC60509a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "effectNetWrapper");
        this.f151441b = aVar;
    }

    /* renamed from: b */
    private final void m235395b(NetRequest dVar) {
        try {
            String replace = new Regex("&?device_info=[^&]*").replace(dVar.mo227740a(), "");
            Logger bVar = Logger.f5760a;
            bVar.mo8662a("KNNetworker", "request url: " + replace);
        } catch (Exception e) {
            Logger.f5760a.mo8663a("KNNetworker", "error in print url", e);
        }
    }

    @Override // com.ss.ugc.effectplatform.bridge.network.INetworkClient
    /* renamed from: a */
    public NetResponse mo207366a(NetRequest dVar) {
        String str;
        String str2;
        Intrinsics.checkParameterIsNotNull(dVar, "netRequest");
        if (dVar.mo227741b() == HTTPMethod.POST) {
            str = "POST";
        } else {
            str = "GET";
        }
        m235395b(dVar);
        C60499b bVar = new C60499b(str, dVar.mo227740a(), dVar.mo227745f());
        bVar.mo207145a(dVar.mo227744e());
        bVar.mo207146a(dVar.mo227742c());
        bVar.mo207148b(dVar.mo227743d());
        try {
            InputStream a = this.f151441b.mo207187a(bVar);
            if (a != null) {
                return new NetResponse(LocationRequest.PRIORITY_HD_ACCURACY, new InputStreamByteRead(a), bVar.mo207152f(), bVar.mo207151e());
            }
            return new NetResponse(MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL, new EmptyByteReadStream(), 0, bVar.mo207151e());
        } catch (Exception e) {
            e.printStackTrace();
            EmptyByteReadStream bVar2 = new EmptyByteReadStream();
            String e2 = bVar.mo207151e();
            if (e2 != null) {
                str2 = e2;
            } else {
                str2 = e.getMessage();
            }
            return new NetResponse(MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL, bVar2, 0, str2);
        }
    }
}
