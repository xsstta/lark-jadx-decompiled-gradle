package com.ss.android.lark.larkconfig.universal;

import com.bytedance.lark.pb.basic.v1.UniversalUserSetting;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.IGetDataCallback;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&J(\u0010\n\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000eH&J(\u0010\n\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u000f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000eH&¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/larkconfig/universal/IUniversalUserSettingService;", "", "getAllUniversalUserSetting", "", "getUniversalUserSetting", "Lcom/bytedance/lark/pb/basic/v1/UniversalUserSetting;", "key", "", "init", "unInit", "updateUniversalUserSetting", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "universal_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.larkconfig.b.a */
public interface IUniversalUserSettingService {
    /* renamed from: a */
    UniversalUserSetting mo148377a(String str);

    /* renamed from: a */
    void mo148378a();

    /* renamed from: a */
    void mo148379a(String str, long j, IGetDataCallback<UniversalUserSetting> iGetDataCallback);

    /* renamed from: a */
    void mo148380a(String str, boolean z, IGetDataCallback<UniversalUserSetting> iGetDataCallback);

    /* renamed from: b */
    void mo148381b();
}
