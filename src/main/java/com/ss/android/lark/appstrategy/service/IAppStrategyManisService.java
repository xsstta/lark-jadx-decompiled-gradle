package com.ss.android.lark.appstrategy.service;

import com.ss.android.lark.appstrategy.service.impl.dto.ErrorResultWrapper;
import com.ss.android.lark.appstrategy.service.impl.dto.SuccessResultWrapper;
import com.ss.android.lark.manis.annotation.RemoteCallback;
import com.ss.android.lark.manis.annotation.RemoteService;
import ee.android.framework.manis.interfaces.IHookInterface;

@RemoteService
public interface IAppStrategyManisService extends IHookInterface {

    @RemoteCallback
    /* renamed from: com.ss.android.lark.appstrategy.service.IAppStrategyManisService$a */
    public interface AbstractC29241a {
        void onError(ErrorResultWrapper errorResultWrapper);

        void onSuccess(SuccessResultWrapper successResultWrapper);
    }

    void getOpenApp(String str, AbstractC29241a aVar);

    void getOpenAppInfoV2(String str, int i, AbstractC29241a aVar);

    void updateLastUseTime(String str, String str2, long j, AbstractC29241a aVar);

    public enum OpenAppInfoType {
        MiniApp(0),
        H5(1);
        
        private int type;

        public int getType() {
            return this.type;
        }

        private OpenAppInfoType(int i) {
            this.type = i;
        }
    }
}
