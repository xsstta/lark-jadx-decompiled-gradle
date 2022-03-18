package com.larksuite.component.ui.avatar.v2;

import android.util.LruCache;
import com.huawei.hms.location.LocationRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\u0005J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/larksuite/component/ui/avatar/v2/ChatterAvatarKeyCache;", "", "()V", "avatarCache", "Landroid/util/LruCache;", "", "getCachedAvatar", "id", "updateCachedAvatar", "", "avatarKey", "avatar-badge_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.ui.avatar.v2.c */
public final class ChatterAvatarKeyCache {

    /* renamed from: a */
    public static final ChatterAvatarKeyCache f62493a = new ChatterAvatarKeyCache();

    /* renamed from: b */
    private static LruCache<String, String> f62494b = new LruCache<>(LocationRequest.PRIORITY_INDOOR);

    private ChatterAvatarKeyCache() {
    }

    /* renamed from: a */
    public final synchronized String mo89093a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        return f62494b.get(str);
    }

    /* renamed from: a */
    public final synchronized void mo89094a(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        Intrinsics.checkParameterIsNotNull(str2, "avatarKey");
        f62494b.put(str, str2);
    }
}
