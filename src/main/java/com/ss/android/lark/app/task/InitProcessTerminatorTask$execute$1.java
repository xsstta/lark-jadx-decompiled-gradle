package com.ss.android.lark.app.task;

import android.content.Context;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.utils.ApiUtils;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
final class InitProcessTerminatorTask$execute$1 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f72629a;

    InitProcessTerminatorTask$execute$1(Context context) {
        this.f72629a = context;
    }

    public final void run() {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).shutDownOtherProcessOnSimpleMode(this.f72629a);
    }
}
