package com.ss.android.lark.chat.api.service.track.sample;

import com.ss.android.lark.chat.api.service.track.sample.BaseSampleRecorder;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\t\u001a\u00020\u0005H\u0007R*\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/chat/api/service/track/sample/MsgSampleRecordCachePool;", "", "()V", "cacheMap", "Ljava/util/HashMap;", "", "Lcom/ss/android/lark/chat/api/service/track/sample/MsgSampleRecordCache;", "Lkotlin/collections/HashMap;", "getCache", "key", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.api.service.track.sample.c */
public final class MsgSampleRecordCachePool {

    /* renamed from: a */
    public static final MsgSampleRecordCachePool f84558a = new MsgSampleRecordCachePool();

    /* renamed from: b */
    private static final HashMap<String, MsgSampleRecordCache> f84559b;

    private MsgSampleRecordCachePool() {
    }

    static {
        HashMap<String, MsgSampleRecordCache> hashMap = new HashMap<>();
        f84559b = hashMap;
        hashMap.put("Reaction", new MsgSampleRecordCache("Reaction"));
        hashMap.put("Read", new MsgSampleRecordCache("Read"));
    }

    @JvmStatic
    /* renamed from: a */
    public static final MsgSampleRecordCache m126735a(@BaseSampleRecorder.Scene String str) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        return f84559b.get(str);
    }
}
