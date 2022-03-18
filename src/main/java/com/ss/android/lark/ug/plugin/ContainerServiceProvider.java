package com.ss.android.lark.ug.plugin;

import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.ug.plugin.entity.ReachPointEvent;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H&J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH&J\u0012\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u000bH&¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/ug/plugin/ContainerServiceProvider;", "", "actionEvent", "", "params", "Lcom/ss/android/lark/ug/plugin/entity/ReachPointEvent;", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "hideReachPoint", "reachPointId", "", "reachPointType", "openUrl", "url", "ug-reach-sdk_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.ug.plugin.b */
public interface ContainerServiceProvider {
    /* renamed from: a */
    void mo195234a(ReachPointEvent aVar, IGetDataCallback<Boolean> iGetDataCallback);

    /* renamed from: a */
    void mo195235a(String str);

    /* renamed from: a */
    void mo195236a(String str, String str2);
}
