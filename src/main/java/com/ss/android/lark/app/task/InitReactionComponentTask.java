package com.ss.android.lark.app.task;

import android.content.Context;
import com.larksuite.framework.launch.task.AbstractLaunchTask;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.reaction.p2556a.AbstractC52974b;
import com.ss.android.lark.reaction.p2556a.C52975c;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57881t;

public class InitReactionComponentTask extends AbstractLaunchTask {
    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(final Context context) {
        C52975c.m205187a().mo180988a(context, new AbstractC52974b() {
            /* class com.ss.android.lark.app.task.InitReactionComponentTask.C289701 */

            @Override // com.ss.android.lark.reaction.p2556a.AbstractC52974b
            /* renamed from: a */
            public String mo102747a(String str) {
                return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getReactionImage(C57881t.m224610I(context), str);
            }
        });
    }
}
