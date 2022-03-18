package com.ss.ugc.effectplatform.repository;

import com.ss.ugc.effectplatform.EffectConfig;
import com.ss.ugc.effectplatform.listener.IFetchEffectListener;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.ExceptionResult;
import com.ss.ugc.effectplatform.task.DownloadEffectTask;
import com.ss.ugc.effectplatform.task.FetchEffectFromCacheTask;
import com.ss.ugc.effectplatform.task.TaskManager;
import com.ss.ugc.effectplatform.util.TaskUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J,\u0010\u0005\u001a\u00020\u00062\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nJ\u001a\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\u000fH\u0002J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\t\u001a\u0004\u0018\u00010\u0014J\u001a\u0010\u0015\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u000fJ\"\u0010\u0016\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001bJ6\u0010\u001c\u001a\u00020\u00062\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00170\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0016\b\u0002\u0010!\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u001e\u0018\u00010\nJ>\u0010\"\u001a\u00020\u00062\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001e2\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\nJD\u0010%\u001a\u00020\u00062\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001e2\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u001e\u0018\u00010\nJ>\u0010&\u001a\u00020\u00062\u000e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001e2\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\nJ,\u0010(\u001a\u00020\u00062\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nJ\u0015\u0010)\u001a\u00020\u00192\u0006\u0010\r\u001a\u00020\u000eH\u0000¢\u0006\u0002\b*JN\u0010+\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u00062\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020/2\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010\nJ8\u00102\u001a\u00020\u00062\u0006\u00103\u001a\u00020\u00062\b\u00104\u001a\u0004\u0018\u00010\u00062\u0006\u00100\u001a\u00020/2\u0006\u0010.\u001a\u00020/2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u000205\u0018\u00010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lcom/ss/ugc/effectplatform/repository/EffectRepository;", "", "effectConfig", "Lcom/ss/ugc/effectplatform/EffectConfig;", "(Lcom/ss/ugc/effectplatform/EffectConfig;)V", "checkResourceList", "", "extraParams", "", "listener", "Lcom/ss/ugc/effectplatform/listener/IEffectPlatformBaseListener;", "Lcom/ss/ugc/effectplatform/model/ResourceListModel;", "downloadInfoProviderEffect", "effect", "Lcom/ss/ugc/effectplatform/model/ProviderEffect;", "Lcom/ss/ugc/effectplatform/listener/IDownloadProviderEffectProgressListener;", "downloadInfoStickerEffect", "", "sticker", "Lcom/ss/ugc/effectplatform/model/net/InfoStickerEffect;", "Lcom/ss/ugc/effectplatform/listener/IDownloadInfoStickerEffectProgressListener;", "downloadProviderEffectList", "fetchEffect", "Lcom/ss/ugc/effectplatform/model/Effect;", "fromCache", "", "iFetchEffectListener", "Lcom/ss/ugc/effectplatform/listener/IFetchEffectListener;", "fetchEffectList", "effectList", "", "extra", "Lcom/ss/ugc/effectplatform/model/DownloadEffectExtra;", "listListener", "fetchEffectListByEffectId", "effectIds", "Lcom/ss/ugc/effectplatform/model/net/EffectListResponse;", "fetchEffectListById", "fetchEffectListByResourceId", "resourceIds", "fetchResourceList", "isInfoProviderEffectDownloaded", "isInfoProviderEffectDownloaded$effectplatform_release", "searchEffect", "panel", "keyword", "count", "", "cursor", "Lcom/ss/ugc/effectplatform/model/net/SearchEffectResponse;", "searchProviderEffectList", "keyWord", "providerName", "Lcom/ss/ugc/effectplatform/model/ProviderEffectModel;", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.ugc.effectplatform.f.e */
public final class EffectRepository {

    /* renamed from: a */
    private final EffectConfig f164926a;

    public EffectRepository(EffectConfig effectConfig) {
        Intrinsics.checkParameterIsNotNull(effectConfig, "effectConfig");
        this.f164926a = effectConfig;
    }

    /* renamed from: a */
    public final String mo227812a(Effect effect, boolean z, IFetchEffectListener dVar) {
        DownloadEffectTask dVar2;
        Intrinsics.checkParameterIsNotNull(effect, "effect");
        String a = TaskUtil.f165133a.mo228356a();
        if (StringsKt.isBlank(effect.getId())) {
            if (dVar != null) {
                dVar.mo207371a(effect, new ExceptionResult(10014));
            }
            return a;
        }
        if (dVar != null) {
            this.f164926a.mo227550J().mo227754a(a, dVar);
        }
        if (z) {
            dVar2 = new FetchEffectFromCacheTask(this.f164926a, effect, a);
        } else {
            dVar2 = new DownloadEffectTask(effect, this.f164926a, a, null, 8, null);
        }
        TaskManager z2 = this.f164926a.mo227579z();
        if (z2 != null) {
            z2.mo228292a(dVar2);
        }
        return a;
    }
}
