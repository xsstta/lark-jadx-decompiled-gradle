package com.ss.android.lark.app.taskv2.preload;

import android.content.Context;
import com.larksuite.framework.launch.task.AsyncLaunchTask;
import com.larksuite.framework.launch.task.ILaunchTask;
import com.ss.android.lark.app.task.InitAsyncMiscTask;
import com.ss.android.lark.biz.im.api.IIMApi;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.utils.ApiUtils;
import java.util.ArrayList;
import java.util.List;

public class CardPreloadTask extends AsyncLaunchTask {
    /* access modifiers changed from: protected */
    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask
    /* renamed from: a */
    public List<Class<? extends ILaunchTask>> mo43818a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(InitAsyncMiscTask.class);
        return arrayList;
    }

    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        ((IIMApi) ApiUtils.getApi(IIMApi.class)).startMessageCardPreload();
        if (C37239a.m146648b().mo136952a("msg_card.style.native_merge_440", true)) {
            ((IIMApi) ApiUtils.getApi(IIMApi.class)).initCardStyle();
        }
    }
}
