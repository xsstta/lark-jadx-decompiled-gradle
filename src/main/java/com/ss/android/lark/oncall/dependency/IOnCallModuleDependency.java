package com.ss.android.lark.oncall.dependency;

import android.content.Context;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.oncall.entity.OnCall;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0003H&J\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0003H&J\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J4\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u0016H&¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/oncall/dependency/IOnCallModuleDependency;", "", "getContactPageTag", "", "getFeiShuMiniAppLink", "getUserId", "isOverseaTenantBrand", "", "openByAppLink", "", "context", "Landroid/content/Context;", "appLink", "openChat", "chatId", "preloadMiniApp", "searchHelpDesks", "queryKey", "begin", "", "end", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Lcom/ss/android/lark/oncall/entity/OnCall;", "im_oncall_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.oncall.a.a */
public interface IOnCallModuleDependency {
    /* renamed from: a */
    String mo143993a();

    /* renamed from: a */
    void mo143994a(Context context, String str);

    /* renamed from: a */
    void mo143995a(String str, int i, int i2, IGetDataCallback<List<OnCall>> iGetDataCallback);

    /* renamed from: b */
    String mo143996b();
}
