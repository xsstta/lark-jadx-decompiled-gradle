package com.ss.android.lark.app.taskv2.preload;

import android.content.Context;
import com.larksuite.framework.launch.task.AsyncLaunchTask;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.biz.im.api.IIMApi;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.newemoji.api.LarkEmojiModuleDependency;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57881t;
import java.util.List;

public class UpdateEmojisTask extends AsyncLaunchTask {
    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: e */
    public String mo92547e() {
        return "UpdateEmojisTask";
    }

    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(final Context context) {
        Log.m165389i("UpdateEmojisTask", "init LarkEmojiModuleDependency");
        LarkEmojiModuleDependency.m214270a(context, new LarkEmojiModuleDependency.IEmojiDependency() {
            /* class com.ss.android.lark.app.taskv2.preload.UpdateEmojisTask.C290721 */

            @Override // com.ss.android.lark.newemoji.api.LarkEmojiModuleDependency.IEmojiDependency
            /* renamed from: a */
            public boolean mo43822a() {
                return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).isOverseaTenantBrand();
            }

            @Override // com.ss.android.lark.newemoji.api.LarkEmojiModuleDependency.IEmojiDependency
            /* renamed from: a */
            public String mo43820a(String str) {
                return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getEmojiImage(C57881t.m224610I(context), str);
            }

            @Override // com.ss.android.lark.newemoji.api.LarkEmojiModuleDependency.IEmojiDependency
            /* renamed from: a */
            public void mo43821a(int i, List<String> list) {
                ((IIMApi) ApiUtils.getApi(IIMApi.class)).fetchEmojis(i, list);
            }
        });
        Log.m165389i("UpdateEmojisTask", "update emojis from net, add push listener");
        ((IIMApi) ApiUtils.getApi(IIMApi.class)).fetchEmojis();
    }
}
