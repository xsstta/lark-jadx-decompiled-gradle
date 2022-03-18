package com.ss.android.lark.guidemgr.manis;

import com.ss.android.lark.manis.annotation.RemoteCallback;
import com.ss.android.lark.manis.annotation.RemoteService;
import ee.android.framework.manis.interfaces.IHookInterface;
import kotlin.Metadata;

@RemoteService
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0001\rJ\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0006H&¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/guidemgr/manis/IGuideMgrProxy;", "Lee/android/framework/manis/interfaces/IHookInterface;", "fetchFromMainProcess", "", "onGuideChanged", "guideListString", "", "registerOnGuideChangeListener", "listener", "Lcom/ss/android/lark/guidemgr/manis/IGuideMgrProxy$OnGuideChangeListener;", "report", "", "guideKey", "OnGuideChangeListener", "base_guide-mgr_guide-mgr_release"}, mo238835k = 1, mv = {1, 1, 15})
public interface IGuideMgrProxy extends IHookInterface {

    @RemoteCallback
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/guidemgr/manis/IGuideMgrProxy$OnGuideChangeListener;", "", "onGuideChanged", "", "guideListString", "", "base_guide-mgr_guide-mgr_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.guidemgr.manis.IGuideMgrProxy$a */
    public interface OnGuideChangeListener {
        void onGuideChanged(String str);
    }

    void fetchFromMainProcess();

    void onGuideChanged(String str);

    void registerOnGuideChangeListener(OnGuideChangeListener aVar);

    boolean report(String str);
}
