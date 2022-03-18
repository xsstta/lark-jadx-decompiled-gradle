package com.bytedance.ies.xbridge.base.runtime.depend;

import android.app.Activity;
import java.util.Map;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0002\u0016\u0017J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H&J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0003H&J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0003H&J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0003H&J\n\u0010\b\u001a\u0004\u0018\u00010\u0003H&J\b\u0010\t\u001a\u00020\nH&J.\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0012H&J.\u0010\u0013\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00152\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0012H&¨\u0006\u0018"}, d2 = {"Lcom/bytedance/ies/xbridge/base/runtime/depend/IHostUserDepend;", "", "getAvatarURL", "", "getBoundPhone", "getNickname", "getSecUid", "getUniqueID", "getUserId", "hasLogin", "", "login", "", "activity", "Landroid/app/Activity;", "loginStatusCallback", "Lcom/bytedance/ies/xbridge/base/runtime/depend/IHostUserDepend$ILoginStatusCallback;", "extraData", "", "logout", "logoutStatusCallback", "Lcom/bytedance/ies/xbridge/base/runtime/depend/IHostUserDepend$ILogoutStatusCallback;", "ILoginStatusCallback", "ILogoutStatusCallback", "x-bridge-base-runtime_release"}, mo238835k = 1, mv = {1, 1, 16})
public interface IHostUserDepend {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ies/xbridge/base/runtime/depend/IHostUserDepend$ILoginStatusCallback;", "", "onFail", "", "onSuccess", "x-bridge-base-runtime_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.xbridge.base.runtime.depend.IHostUserDepend$a */
    public interface ILoginStatusCallback {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ies/xbridge/base/runtime/depend/IHostUserDepend$ILogoutStatusCallback;", "", "onFail", "", "onSuccess", "x-bridge-base-runtime_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.xbridge.base.runtime.depend.IHostUserDepend$b */
    public interface ILogoutStatusCallback {
    }

    String getAvatarURL();

    String getBoundPhone();

    String getNickname();

    String getSecUid();

    String getUniqueID();

    String getUserId();

    boolean hasLogin();

    void login(Activity activity, ILoginStatusCallback aVar, Map<String, String> map);

    void logout(Activity activity, ILogoutStatusCallback bVar, Map<String, String> map);
}
