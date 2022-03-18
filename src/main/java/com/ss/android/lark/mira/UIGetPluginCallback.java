package com.ss.android.lark.mira;

import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.callback.UIGetDataCallback;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\b\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/mira/UIGetPluginCallback;", "Data", "Lcom/larksuite/framework/callback/UIGetDataCallback;", "()V", "onLoading", "", "onPluginLoading", "frameworks_mira_mira-off_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.r.d */
public class UIGetPluginCallback<Data> extends UIGetDataCallback<Data> {
    /* renamed from: a */
    public void mo143154a() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Data", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.r.d$a */
    static final class RunnableC52972a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ UIGetPluginCallback f130884a;

        RunnableC52972a(UIGetPluginCallback dVar) {
            this.f130884a = dVar;
        }

        public final void run() {
            this.f130884a.mo143154a();
        }
    }

    /* renamed from: b */
    public final void mo180986b() {
        UICallbackExecutor.execute(new RunnableC52972a(this));
    }
}
