package com.ss.android.lark.app.task;

import android.app.Activity;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.biz.im.api.IIMApi;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
final class InitChatPreviewTask$execute$1$getGroupMemberManageDependency$1 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Activity f72578a;

    /* renamed from: b */
    final /* synthetic */ List f72579b;

    InitChatPreviewTask$execute$1$getGroupMemberManageDependency$1(Activity activity, List list) {
        this.f72578a = activity;
        this.f72579b = list;
    }

    public final void run() {
        ((IIMApi) ApiUtils.getApi(IIMApi.class)).showMemberWithoutAdd(this.f72578a, this.f72579b, new IGetDataCallback<List<? extends ChatChatter>>() {
            /* class com.ss.android.lark.app.task.InitChatPreviewTask$execute$1$getGroupMemberManageDependency$1.C289431 */

            /* renamed from: a */
            public void onSuccess(List<? extends ChatChatter> list) {
                Log.m165388i("getGroupMemberManageDependency onSuccess");
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                Log.m165388i("getGroupMemberManageDependency onError");
            }
        });
    }
}
