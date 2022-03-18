package com.ss.android.videoshop.api.stub;

import android.content.Context;
import com.ss.android.videoshop.api.AbstractC64095d;
import com.ss.android.videoshop.context.VideoContext;
import com.ss.android.videoshop.p3195b.C64116b;
import com.ss.ttvideoengine.TTVideoEngine;

/* renamed from: com.ss.android.videoshop.api.stub.d */
public class C64112d implements AbstractC64095d {
    @Override // com.ss.android.videoshop.api.AbstractC64095d
    /* renamed from: a */
    public TTVideoEngine mo163943a(Context context, int i, C64116b bVar, VideoContext videoContext) {
        return new TTVideoEngine(context, i);
    }
}
