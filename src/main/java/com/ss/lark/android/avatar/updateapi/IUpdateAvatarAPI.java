package com.ss.lark.android.avatar.updateapi;

import com.larksuite.framework.callback.IGetDataCallback;
import java.io.Serializable;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H&¨\u0006\b"}, d2 = {"Lcom/ss/lark/android/avatar/updateapi/IUpdateAvatarAPI;", "Ljava/io/Serializable;", "doRequest", "", "avatarPath", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "core_avatar_release"}, mo238835k = 1, mv = {1, 1, 16})
public interface IUpdateAvatarAPI extends Serializable {
    void doRequest(String str, IGetDataCallback<String> iGetDataCallback);
}
