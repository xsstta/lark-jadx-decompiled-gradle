package com.ss.android.lark.biz.core.api;

import kotlin.Deprecated;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000e\u000fJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\b\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/biz/core/api/IUiModeService;", "", "addUiModeChangeListener", "", "listener", "Lcom/ss/android/lark/biz/core/api/IUiModeService$UiModeChangeListener;", "getCurrentMode", "", "initUiMode", "context", "Landroid/content/Context;", "isNightModeEnable", "", "removeUiModeChangeListener", "Companion", "UiModeChangeListener", "core_api_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.biz.core.api.ap */
public interface IUiModeService {

    /* renamed from: a */
    public static final Companion f73939a = Companion.f73940a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/biz/core/api/IUiModeService$UiModeChangeListener;", "", "onNightModeChange", "", "mode", "", "core_api_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.biz.core.api.ap$b */
    public interface UiModeChangeListener {
        void onNightModeChange(int i);
    }

    @Deprecated(message = "手动切换会直接重启，不再需要监听此回调")
    /* renamed from: a */
    void mo105601a(UiModeChangeListener bVar);

    /* renamed from: a */
    boolean mo105602a();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/biz/core/api/IUiModeService$Companion;", "", "()V", "MODE_FOLLOW_SYSTEM", "", "MODE_LIGHT", "MODE_NIGHT", "core_api_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.biz.core.api.ap$a */
    public static final class Companion {

        /* renamed from: a */
        static final /* synthetic */ Companion f73940a = new Companion();

        private Companion() {
        }
    }
}
