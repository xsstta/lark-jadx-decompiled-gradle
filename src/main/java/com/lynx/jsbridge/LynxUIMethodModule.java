package com.lynx.jsbridge;

import com.google.firebase.messaging.Constants;
import com.lynx.react.bridge.AbstractRunnableC26522f;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.AbstractC26684l;
import com.lynx.tasm.utils.C26959m;

public class LynxUIMethodModule extends LynxContextModule {
    public LynxUIMethodModule(AbstractC26684l lVar) {
        super(lVar);
    }

    /* access modifiers changed from: package-private */
    @LynxMethod
    public void invokeUIMethod(final String str, final ReadableArray readableArray, final String str2, final ReadableMap readableMap, final Callback callback) {
        C26959m.m97969a(new AbstractRunnableC26522f(this.mLynxContext) {
            /* class com.lynx.jsbridge.LynxUIMethodModule.C265021 */

            @Override // com.lynx.react.bridge.AbstractRunnableC26522f
            /* renamed from: a */
            public void mo93957a() {
                int i;
                if (!str.isEmpty()) {
                    i = Integer.parseInt(str);
                } else {
                    i = -1;
                }
                LynxUIMethodModule.this.mLynxContext.mo94655a(i, readableArray, str2, readableMap, new Callback() {
                    /* class com.lynx.jsbridge.LynxUIMethodModule.C265021.C265031 */

                    @Override // com.lynx.react.bridge.Callback
                    public void invoke(Object... objArr) {
                        if (callback != null) {
                            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
                            javaOnlyMap.putInt("code", ((Integer) objArr[0]).intValue());
                            if (objArr.length > 1) {
                                javaOnlyMap.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, objArr[1]);
                            }
                            callback.invoke(javaOnlyMap);
                        }
                    }
                });
            }
        });
        LLog.m96425c("UIMethodModule", "invokeUIMethod " + str2 + " callback: " + callback);
    }
}
