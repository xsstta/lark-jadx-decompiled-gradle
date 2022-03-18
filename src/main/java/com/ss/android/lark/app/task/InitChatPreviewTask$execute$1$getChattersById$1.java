package com.ss.android.lark.app.task;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.biz.im.api.IIMApi;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.preview.entity.component.property.ChattersPreviewProperty;
import com.ss.android.lark.utils.ApiUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
final class InitChatPreviewTask$execute$1$getChattersById$1 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ List f72571a;

    /* renamed from: b */
    final /* synthetic */ IGetDataCallback f72572b;

    InitChatPreviewTask$execute$1$getChattersById$1(List list, IGetDataCallback iGetDataCallback) {
        this.f72571a = list;
        this.f72572b = iGetDataCallback;
    }

    public final void run() {
        ((IIMApi) ApiUtils.getApi(IIMApi.class)).getChattersByIdsFromNet(this.f72571a, new IGetDataCallback<Map<String, ? extends Chatter>>(this) {
            /* class com.ss.android.lark.app.task.InitChatPreviewTask$execute$1$getChattersById$1.C289421 */

            /* renamed from: a */
            final /* synthetic */ InitChatPreviewTask$execute$1$getChattersById$1 f72573a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f72573a = r1;
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
                Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
                coreThreadPool.getUIExecutor().execute(new InitChatPreviewTask$execute$1$getChattersById$1$1$onError$1(this, errorResult));
            }

            /* renamed from: a */
            public void onSuccess(Map<String, ? extends Chatter> map) {
                ArrayList arrayList = new ArrayList();
                if (map != null) {
                    for (Chatter chatter : map.values()) {
                        arrayList.add(new ChattersPreviewProperty.ChatterInfo(chatter.getAvatarKey(), chatter.getId()));
                    }
                }
                CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
                Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
                coreThreadPool.getUIExecutor().execute(new InitChatPreviewTask$execute$1$getChattersById$1$1$onSuccess$2(this, arrayList));
            }
        });
    }
}
