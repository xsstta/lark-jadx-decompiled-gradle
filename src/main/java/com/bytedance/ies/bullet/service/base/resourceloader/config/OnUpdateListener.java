package com.bytedance.ies.bullet.service.base.resourceloader.config;

import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH&J \u0010\t\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u0006H&¨\u0006\u000b"}, d2 = {"Lcom/bytedance/ies/bullet/service/base/resourceloader/config/OnUpdateListener;", "", "onUpdateFailed", "", "channelList", "", "", "throwable", "", "onUpdateSuccess", "path", "x-servicecenter_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ies.bullet.service.base.resourceloader.config.f */
public interface OnUpdateListener {
    /* renamed from: a */
    void mo52534a(List<String> list, String str);

    /* renamed from: a */
    void mo52535a(List<String> list, Throwable th);
}
