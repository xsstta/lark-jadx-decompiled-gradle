package com.ss.ugc.effectplatform.repository;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.ugc.effectplatform.EffectConfig;
import com.ss.ugc.effectplatform.listener.IEffectPlatformBaseListener;
import com.ss.ugc.effectplatform.model.CategoryPageModel;
import com.ss.ugc.effectplatform.task.CheckUpdateTask;
import com.ss.ugc.effectplatform.task.FetchCategoryEffectCacheTask;
import com.ss.ugc.effectplatform.task.FetchCategoryEffectTask;
import com.ss.ugc.effectplatform.task.TaskManager;
import com.ss.ugc.effectplatform.util.TaskUtil;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004JH\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\n2\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eJj\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0015\u001a\u00020\u000f2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u000eJ \u0010\u0017\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u000eJ\u001e\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u001b2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u000eJ<\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\n2\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u000eJ@\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u000f2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u000eJ`\u0010 \u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u000f2\b\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u000f2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u000eJH\u0010#\u001a\u00020\u00062\b\u0010$\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\u000eJY\u0010&\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\f2\u0006\u0010\u0015\u001a\u00020\u000f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010\u000e¢\u0006\u0002\u0010(Jy\u0010)\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\n2\u0006\u0010+\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\n2\b\u0010-\u001a\u0004\u0018\u00010\u00062&\u0010\u000b\u001a\"\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010.j\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u0001`/2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010\u000e¢\u0006\u0002\u00101J.\u00102\u001a\u00020\u00062\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u000203\u0018\u00010\u000eJy\u00104\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\n2\b\u0010-\u001a\u0004\u0018\u00010\u00062&\u0010\u000b\u001a\"\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010.j\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u0001`/2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010\u000e¢\u0006\u0002\u00106R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u00067"}, d2 = {"Lcom/ss/ugc/effectplatform/repository/EffectListRepository;", "", "effectConfig", "Lcom/ss/ugc/effectplatform/EffectConfig;", "(Lcom/ss/ugc/effectplatform/EffectConfig;)V", "checkUpdate", "", "panel", "category", ShareHitPoint.f121869d, "", "extraParams", "", "listener", "Lcom/ss/ugc/effectplatform/listener/IEffectPlatformBaseListener;", "", "fetchCategoryEffect", "count", "cursor", "sortingPosition", HiAnalyticsConstant.HaKey.BI_KEY_VERSION, "fetchFromCache", "Lcom/ss/ugc/effectplatform/model/CategoryPageModel;", "fetchDownloadedEffectList", "Lcom/ss/ugc/effectplatform/model/EffectChannelResponse;", "fetchEffectInfoByQRCode", "code", "Lcom/ss/ugc/effectplatform/model/EffectQRCode;", "Lcom/ss/ugc/effectplatform/model/Effect;", "fetchHotEffect", "Lcom/ss/ugc/effectplatform/model/net/FetchHotEffectResponse;", "fetchPanelEffectList", "fetchPanelInfo", "withCategoryEffects", "Lcom/ss/ugc/effectplatform/model/PanelInfoModel;", "fetchProviderEffectList", "providerName", "Lcom/ss/ugc/effectplatform/model/ProviderEffectModel;", "queryInfoStickerList", "Lcom/ss/ugc/effectplatform/model/net/QueryInfoStickerResponse;", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Map;ZLcom/ss/ugc/effectplatform/listener/IEffectPlatformBaseListener;)Ljava/lang/String;", "queryRecommendStickerList", ShareHitPoint.f121868c, "creationId", "imageUri", "library", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Lcom/ss/ugc/effectplatform/model/net/InfoStickerListResponse;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/HashMap;Lcom/ss/ugc/effectplatform/listener/IEffectPlatformBaseListener;)Ljava/lang/String;", "queryVideoUsedStickers", "Lcom/ss/ugc/effectplatform/model/net/EffectListResponse;", "searchStickerList", "word", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/HashMap;Lcom/ss/ugc/effectplatform/listener/IEffectPlatformBaseListener;)Ljava/lang/String;", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.ugc.effectplatform.f.c */
public final class EffectListRepository {

    /* renamed from: a */
    private final EffectConfig f164924a;

    public EffectListRepository(EffectConfig effectConfig) {
        Intrinsics.checkParameterIsNotNull(effectConfig, "effectConfig");
        this.f164924a = effectConfig;
    }

    /* renamed from: a */
    public final String mo227811a(String str, String str2, int i, Map<String, String> map, IEffectPlatformBaseListener<Boolean> bVar) {
        String a = TaskUtil.f165133a.mo228356a();
        if (bVar != null) {
            this.f164924a.mo227550J().mo227754a(a, bVar);
        }
        CheckUpdateTask cVar = new CheckUpdateTask(this.f164924a, a, str, str2, i, map);
        TaskManager z = this.f164924a.mo227579z();
        if (z != null) {
            z.mo228292a(cVar);
        }
        return a;
    }

    /* renamed from: a */
    public final String mo227810a(String str, String str2, int i, int i2, int i3, String str3, boolean z, Map<String, String> map, IEffectPlatformBaseListener<CategoryPageModel> bVar) {
        FetchCategoryEffectTask fetchCategoryEffectTask;
        Intrinsics.checkParameterIsNotNull(str, "panel");
        String a = TaskUtil.f165133a.mo228356a();
        if (bVar != null) {
            this.f164924a.mo227550J().mo227754a(a, bVar);
        }
        if (z) {
            fetchCategoryEffectTask = new FetchCategoryEffectCacheTask(this.f164924a, str, a, str2, i, i2, i3, str3);
        } else {
            fetchCategoryEffectTask = new FetchCategoryEffectTask(this.f164924a, str, a, str2, i, i2, i3, str3, map);
        }
        TaskManager z2 = this.f164924a.mo227579z();
        if (z2 != null) {
            z2.mo228292a(fetchCategoryEffectTask);
        }
        return a;
    }
}
