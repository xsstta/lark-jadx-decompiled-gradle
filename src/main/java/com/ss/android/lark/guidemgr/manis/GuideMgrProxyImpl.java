package com.ss.android.lark.guidemgr.manis;

import android.content.Context;
import com.ss.android.lark.guidemgr.manis.IGuideMgrProxy;
import com.ss.android.lark.guidemgr.p1935b.C38702a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.manis.annotation.RemoteServiceImpl;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@RemoteServiceImpl(service = IGuideMgrProxy.class)
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\tH\u0016J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u000eH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/guidemgr/manis/GuideMgrProxyImpl;", "Lcom/ss/android/lark/guidemgr/manis/IGuideMgrProxy;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "guideChangeListeners", "", "Lcom/ss/android/lark/guidemgr/manis/IGuideMgrProxy$OnGuideChangeListener;", "fetchFromMainProcess", "", "onGuideChanged", "guideListString", "", "registerOnGuideChangeListener", "listener", "report", "", "guideKey", "Companion", "base_guide-mgr_guide-mgr_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class GuideMgrProxyImpl implements IGuideMgrProxy {
    public static final Companion Companion = new Companion(null);
    private final Context context;
    private final List<IGuideMgrProxy.OnGuideChangeListener> guideChangeListeners = new CopyOnWriteArrayList();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/guidemgr/manis/GuideMgrProxyImpl$Companion;", "", "()V", "TAG", "", "base_guide-mgr_guide-mgr_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.guidemgr.manis.GuideMgrProxyImpl$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final Context getContext() {
        return this.context;
    }

    @Override // com.ss.android.lark.guidemgr.manis.IGuideMgrProxy
    public void fetchFromMainProcess() {
        try {
            C38702a.m152865f().mo141851c();
        } catch (Exception e) {
            Log.m165384e("GuideMgrProxyImpl", "Failed to fetchFromMainProcess", e);
        }
    }

    public GuideMgrProxyImpl(Context context2) {
        Intrinsics.checkParameterIsNotNull(context2, "context");
        this.context = context2;
    }

    @Override // com.ss.android.lark.guidemgr.manis.IGuideMgrProxy
    public void registerOnGuideChangeListener(IGuideMgrProxy.OnGuideChangeListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        try {
            this.guideChangeListeners.add(aVar);
        } catch (Exception e) {
            Log.m165384e("GuideMgrProxyImpl", "Failed to registerOnGuideChangeListener", e);
        }
    }

    @Override // com.ss.android.lark.guidemgr.manis.IGuideMgrProxy
    public void onGuideChanged(String str) {
        Intrinsics.checkParameterIsNotNull(str, "guideListString");
        try {
            Iterator<T> it = this.guideChangeListeners.iterator();
            while (it.hasNext()) {
                it.next().onGuideChanged(str);
            }
        } catch (Exception e) {
            Log.m165384e("GuideMgrProxyImpl", "Failed to onGuideChanged", e);
        }
    }

    @Override // com.ss.android.lark.guidemgr.manis.IGuideMgrProxy
    public boolean report(String str) {
        try {
            return C38702a.m152865f().mo141850b(str);
        } catch (Exception e) {
            Log.m165384e("GuideMgrProxyImpl", "Failed to report for key:" + str, e);
            return false;
        }
    }
}
