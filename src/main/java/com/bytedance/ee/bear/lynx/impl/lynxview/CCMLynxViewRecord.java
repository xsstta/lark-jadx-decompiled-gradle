package com.bytedance.ee.bear.lynx.impl.lynxview;

import com.bytedance.ee.bear.lynx.api.CCMLynxCardView;
import com.bytedance.ee.log.C13479a;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u0004J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R \u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/bytedance/ee/bear/lynx/impl/lynxview/CCMLynxViewRecord;", "", "()V", "TAG", "", "lynxViewRecord", "", "Ljava/lang/ref/WeakReference;", "Lcom/bytedance/ee/bear/lynx/api/CCMLynxCardView;", "get", "containerId", "set", "", "ccmLynxCardView", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.lynx.impl.lynxview.b */
public final class CCMLynxViewRecord {

    /* renamed from: a */
    public static final CCMLynxViewRecord f23792a = new CCMLynxViewRecord();

    /* renamed from: b */
    private static final Map<String, WeakReference<CCMLynxCardView>> f23793b = new LinkedHashMap();

    private CCMLynxViewRecord() {
    }

    /* renamed from: a */
    public final CCMLynxCardView mo33936a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "containerId");
        WeakReference<CCMLynxCardView> weakReference = f23793b.get(str);
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* renamed from: a */
    public final void mo33937a(String str, CCMLynxCardView cCMLynxCardView) {
        Intrinsics.checkParameterIsNotNull(str, "containerId");
        Intrinsics.checkParameterIsNotNull(cCMLynxCardView, "ccmLynxCardView");
        C13479a.m54764b("ccm-lynx: CCMLynxViewRecord", "set containerId: " + str);
        Map<String, WeakReference<CCMLynxCardView>> map = f23793b;
        map.remove(str);
        map.put(str, new WeakReference<>(cCMLynxCardView));
    }
}
