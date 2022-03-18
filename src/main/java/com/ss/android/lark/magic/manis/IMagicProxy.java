package com.ss.android.lark.magic.manis;

import com.ss.android.lark.manis.annotation.RemoteService;
import ee.android.framework.manis.interfaces.IHookInterface;
import kotlin.Metadata;

@RemoteService
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J(\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH&¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/magic/manis/IMagicProxy;", "Lee/android/framework/manis/interfaces/IHookInterface;", "showMagic", "", "responseStr", "", "transferLifecycleToMain", "uniqueTag", "event", "onPreCheckTime", "", "onCheckedTime", "core_magic_release"}, mo238835k = 1, mv = {1, 1, 15})
public interface IMagicProxy extends IHookInterface {
    void showMagic(String str);

    void transferLifecycleToMain(String str, String str2, long j, long j2);
}
