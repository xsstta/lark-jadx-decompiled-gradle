package com.ss.android.videoshop.api.stub;

import com.bytedance.common.utility.NetworkUtils;
import com.ss.android.videoshop.api.AbstractC64097f;
import com.ss.android.videoshop.p3203i.C64173b;
import com.ss.ttvideoengine.Resolution;
import com.ss.ttvideoengine.model.VideoInfo;
import com.ss.ttvideoengine.model.VideoModel;
import com.ss.ttvideoengine.model.VideoRef;

/* renamed from: com.ss.android.videoshop.api.stub.e */
public class C64113e implements AbstractC64097f {
    @Override // com.ss.android.videoshop.api.AbstractC64097f
    /* renamed from: a */
    public VideoInfo mo221874a(VideoModel videoModel) {
        return null;
    }

    @Override // com.ss.android.videoshop.api.AbstractC64097f
    /* renamed from: a */
    public boolean mo221875a(NetworkUtils.NetworkType networkType) {
        return false;
    }

    @Override // com.ss.android.videoshop.api.AbstractC64097f
    /* renamed from: a */
    public boolean mo221876a(VideoRef videoRef) {
        return false;
    }

    @Override // com.ss.android.videoshop.api.AbstractC64097f
    /* renamed from: b */
    public VideoInfo mo221877b(VideoRef videoRef) {
        return C64173b.m252209a(videoRef, Resolution.Standard.ordinal() - 1);
    }
}
