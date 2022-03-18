package com.ss.android.ugc.effectmanager.knadapt;

import com.bef.effectsdk.ResourceFinder;
import com.ss.android.ugc.effectmanager.DownloadableModelSupportResourceFinder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/ugc/effectmanager/knadapt/KNResourceFinder;", "Lcom/ss/android/ugc/effectmanager/DownloadableModelSupportResourceFinder;", "resourceFinder", "Lcom/bef/effectsdk/ResourceFinder;", "(Lcom/bef/effectsdk/ResourceFinder;)V", "createNativeResourceFinder", "", "effectHandle", "release", "", "algorithmmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.ugc.effectmanager.e.g */
public final class KNResourceFinder extends DownloadableModelSupportResourceFinder {

    /* renamed from: a */
    private final ResourceFinder f151442a;

    @Override // com.bef.effectsdk.ResourceFinder, com.ss.android.ugc.effectmanager.DownloadableModelSupportResourceFinder
    public long createNativeResourceFinder(long j) {
        return this.f151442a.createNativeResourceFinder(j);
    }

    @Override // com.bef.effectsdk.ResourceFinder, com.ss.android.ugc.effectmanager.DownloadableModelSupportResourceFinder
    public void release(long j) {
        this.f151442a.release(j);
    }

    public KNResourceFinder(ResourceFinder resourceFinder) {
        Intrinsics.checkParameterIsNotNull(resourceFinder, "resourceFinder");
        this.f151442a = resourceFinder;
    }
}
