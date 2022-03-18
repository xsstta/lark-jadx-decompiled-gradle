package com.ss.android.lark.searchcommon.utils;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.appsetting.api.SettingManager;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.searchcommon.SearchArgsSetting;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0002J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\bJ\u0006\u0010\r\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/searchcommon/utils/SearchDebounce;", "", "()V", "mDebounceMs", "", "mSearchHandler", "Landroid/os/Handler;", "mSearchRunnable", "Ljava/lang/Runnable;", "addDelayedMessage", "", "debouncePost", "runnable", "removeLastMessage", "Companion", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.utils.c */
public final class SearchDebounce {

    /* renamed from: c */
    public static final Companion f133389c = new Companion(null);

    /* renamed from: a */
    public long f133390a = 200;

    /* renamed from: b */
    public Runnable f133391b;

    /* renamed from: d */
    private final Handler f133392d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/searchcommon/utils/SearchDebounce$Companion;", "", "()V", "DEBOUNCE_SEARCH_MESSAGE_CODE", "", "TAG", "", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.utils.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: b */
    private final void m209241b() {
        Log.m165379d("LarkSearch.Common.SearchDebounce", "addDelayedMessage");
        this.f133392d.sendEmptyMessageDelayed(1, this.f133390a);
    }

    public SearchDebounce() {
        SettingManager.getInstance().get(SearchArgsSetting.class, new IGetDataCallback<SearchArgsSetting>(this) {
            /* class com.ss.android.lark.searchcommon.utils.SearchDebounce.C539571 */

            /* renamed from: a */
            final /* synthetic */ SearchDebounce f133393a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f133393a = r1;
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                Log.m165383e("LarkSearch.Common.SearchDebounce", "mDebounceMs get err! msg: " + errorResult.getDebugMsg());
            }

            /* renamed from: a */
            public void onSuccess(SearchArgsSetting searchArgsSetting) {
                long j;
                SearchDebounce cVar = this.f133393a;
                if (searchArgsSetting != null) {
                    j = searchArgsSetting.f133117c;
                } else {
                    j = 200;
                }
                cVar.f133390a = j;
                Log.m165379d("LarkSearch.Common.SearchDebounce", "get mDebounceMs config: " + this.f133393a.f133390a);
            }
        });
        this.f133392d = new Handler(Looper.getMainLooper(), new Handler.Callback(this) {
            /* class com.ss.android.lark.searchcommon.utils.SearchDebounce.C539582 */

            /* renamed from: a */
            final /* synthetic */ SearchDebounce f133394a;

            {
                this.f133394a = r1;
            }

            public final boolean handleMessage(Message message) {
                if (message.what != 1) {
                    return false;
                }
                Log.m165379d("LarkSearch.Common.SearchDebounce", "handle DEBOUNCE_SEARCH_MESSAGE_CODE.");
                Runnable runnable = this.f133394a.f133391b;
                if (runnable == null) {
                    return true;
                }
                runnable.run();
                return true;
            }
        });
    }

    /* renamed from: a */
    public final void mo184566a() {
        Log.m165379d("LarkSearch.Common.SearchDebounce", "removeLastMessage, trace: " + SearchCommonUtils.m209225a());
        this.f133391b = null;
        this.f133392d.removeMessages(1);
    }

    /* renamed from: a */
    public final void mo184567a(Runnable runnable) {
        Intrinsics.checkParameterIsNotNull(runnable, "runnable");
        mo184566a();
        this.f133391b = runnable;
        m209241b();
    }
}
