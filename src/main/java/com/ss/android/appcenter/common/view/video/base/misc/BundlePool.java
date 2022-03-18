package com.ss.android.appcenter.common.view.video.base.misc;

import android.os.Bundle;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/appcenter/common/view/video/base/misc/BundlePool;", "", "()V", "POOL_SIZE", "", "pool", "Ljava/util/ArrayList;", "Landroid/os/Bundle;", "Lkotlin/collections/ArrayList;", "obtain", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.appcenter.common.view.video.a.a.a */
public final class BundlePool {

    /* renamed from: a */
    public static final BundlePool f70804a = new BundlePool();

    /* renamed from: b */
    private static final ArrayList<Bundle> f70805b = new ArrayList<>();

    private BundlePool() {
    }

    static {
        for (int i = 0; i < 3; i++) {
            f70805b.add(new Bundle());
        }
    }

    /* renamed from: a */
    public final synchronized Bundle mo100512a() {
        for (int i = 0; i < 3; i++) {
            ArrayList<Bundle> arrayList = f70805b;
            Bundle bundle = arrayList.get(i);
            Intrinsics.checkExpressionValueIsNotNull(bundle, "pool[i]");
            if (bundle.isEmpty()) {
                Bundle bundle2 = arrayList.get(i);
                Intrinsics.checkExpressionValueIsNotNull(bundle2, "pool[i]");
                return bundle2;
            }
        }
        Log.m165397w("BundlePool", "<create new bundle object>");
        return new Bundle();
    }
}
