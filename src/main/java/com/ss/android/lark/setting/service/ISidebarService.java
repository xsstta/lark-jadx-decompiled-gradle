package com.ss.android.lark.setting.service;

import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.setting.C54115c;
import com.ss.android.lark.setting.dto.SidebarInfo;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u001e\u0010\u0005\u001a\u00020\u00032\u0014\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0018\u00010\u0007H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&J\b\u0010\u000e\u001a\u00020\u0003H&¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/setting/service/ISidebarService;", "", "create", "", "destroy", "getAdditionalMineData", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Lcom/ss/android/lark/setting/dto/SidebarInfo;", "registerDataObserver", "listener", "Lcom/ss/android/lark/setting/SettingModule$ISidebarDataObserver;", "removeDataObserver", "reset", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.setting.service.c */
public interface ISidebarService {
    /* renamed from: a */
    void mo186534a();

    /* renamed from: a */
    void mo186535a(IGetDataCallback<List<SidebarInfo>> iGetDataCallback);

    /* renamed from: a */
    void mo186536a(C54115c.AbstractC54120c cVar);

    /* renamed from: b */
    void mo186537b(C54115c.AbstractC54120c cVar);
}
