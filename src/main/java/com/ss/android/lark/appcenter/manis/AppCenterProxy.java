package com.ss.android.lark.appcenter.manis;

import com.ss.android.lark.appcenter.wrapper.dto.AppCenterMenuIPCItem;
import com.ss.android.lark.manis.annotation.RemoteCallback;
import com.ss.android.lark.manis.annotation.RemoteService;
import ee.android.framework.manis.interfaces.IHookInterface;
import java.util.List;

@RemoteService
public interface AppCenterProxy extends IHookInterface {

    @RemoteCallback
    /* renamed from: com.ss.android.lark.appcenter.manis.AppCenterProxy$a */
    public interface AbstractC29094a {
        void onError(ErrorResultWrapper errorResultWrapper);

        void onSuccess(String str);
    }

    @RemoteCallback
    /* renamed from: com.ss.android.lark.appcenter.manis.AppCenterProxy$b */
    public interface AbstractC29095b {
        boolean handleResult(String str, int i);
    }

    @RemoteCallback
    /* renamed from: com.ss.android.lark.appcenter.manis.AppCenterProxy$c */
    public interface AbstractC29096c {
        void onSuccess(AppCenterMenuIPCItem appCenterMenuIPCItem);
    }

    void doCheckFace(String str, AbstractC29094a aVar);

    List<AppCenterMenuIPCItem> getAppCenterMenuItems(String str);

    void getEnterBotMenuItem(String str, AbstractC29096c cVar);

    void openScanQRCodeActivity(IntArray intArray, boolean z, AbstractC29095b bVar);
}
