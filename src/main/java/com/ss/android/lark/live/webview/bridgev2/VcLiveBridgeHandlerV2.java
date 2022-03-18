package com.ss.android.lark.live.webview.bridgev2;

import android.text.TextUtils;
import com.bytedance.ee.larkwebview.base.LarkWebView;
import com.bytedance.ee.larkwebview.bridge.BridgeHandler;
import com.bytedance.ee.larkwebview.bridge.JsCallBack;
import com.ss.android.lark.live.C41504b;
import com.ss.android.lark.live.LiveStateHolder;
import com.ss.android.lark.live.p2133a.C41488a;
import com.ss.android.lark.live.webview.bridgev2.entity.CallNativeData;
import com.ss.android.lark.live.webview.bridgev2.entity.CallNativeEvent;
import com.ss.android.lark.live.webview.bridgev2.entity.CallNativeParams;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.p2288b.C45858j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00172\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001:\u0002\u0017\u0018B\u000f\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J.\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u001a\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\rH\u0002J\u0010\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0013H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/live/webview/bridgev2/VcLiveBridgeHandlerV2;", "Lcom/bytedance/ee/larkwebview/bridge/BridgeHandler;", "Lcom/ss/android/lark/live/webview/bridgev2/entity/CallNativeData;", "Lcom/bytedance/ee/larkwebview/base/LarkWebView;", "mStateTracker", "Lcom/ss/android/lark/live/webview/bridgev2/VcLiveBridgeHandlerV2$IStateTracker;", "(Lcom/ss/android/lark/live/webview/bridgev2/VcLiveBridgeHandlerV2$IStateTracker;)V", "handle", "", "callNativeData", "jsCallBack", "Lcom/bytedance/ee/larkwebview/bridge/JsCallBack;", "s", "", "webView", "shouldRunInUIThread", "", "updateLiveId", "action", "Lcom/ss/android/lark/live/webview/bridgev2/entity/CallNativeEvent;", "liveId", "updatePlayerState", "callNativeEvent", "Companion", "IStateTracker", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.live.webview.bridgev2.a */
public final class VcLiveBridgeHandlerV2 implements BridgeHandler<CallNativeData, LarkWebView> {

    /* renamed from: a */
    public static final Companion f105592a = new Companion(null);

    /* renamed from: b */
    private final IStateTracker f105593b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/live/webview/bridgev2/VcLiveBridgeHandlerV2$IStateTracker;", "", "onStateChanged", "", "state", "Lcom/ss/android/lark/live/webview/bridgev2/entity/CallNativeData;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.live.webview.bridgev2.a$b */
    public interface IStateTracker {
        /* renamed from: a */
        void mo149439a(CallNativeData callNativeData);
    }

    @Override // com.bytedance.ee.larkwebview.bridge.BridgeHandler
    /* renamed from: a */
    public boolean mo30817a() {
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/live/webview/bridgev2/VcLiveBridgeHandlerV2$Companion;", "", "()V", "TAG", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.live.webview.bridgev2.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public VcLiveBridgeHandlerV2(IStateTracker bVar) {
        this.f105593b = bVar;
    }

    /* renamed from: a */
    private final void m164826a(CallNativeEvent callNativeEvent) {
        int i = C41534b.f105595b[callNativeEvent.ordinal()];
        if (i == 1 || i == 2) {
            C41488a.m164623a().mo149319a(LiveStateHolder.PlayerState.PLAY);
        } else if (i == 3 || i == 4) {
            C41488a.m164623a().mo149319a(LiveStateHolder.PlayerState.OTHER);
        }
    }

    /* renamed from: a */
    private final void m164827a(CallNativeEvent callNativeEvent, String str) {
        int i = C41534b.f105594a[callNativeEvent.ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            C41488a.m164623a().mo149320a(str);
        }
    }

    /* renamed from: a */
    public void mo30815a(CallNativeData callNativeData, JsCallBack gVar, String str, LarkWebView larkWebView) {
        Object obj;
        CallNativeParams callNativeParams;
        String str2;
        String str3;
        Intrinsics.checkParameterIsNotNull(gVar, "jsCallBack");
        StringBuilder sb = new StringBuilder();
        sb.append("[handle] receive data from bridge: ");
        if (callNativeData != null) {
            obj = callNativeData;
        } else {
            obj = "null";
        }
        sb.append(obj);
        C45855f.m181664c("VcLiveBridgeHandlerV2", sb.toString());
        if (callNativeData != null) {
            CallNativeEvent callNativeEvent = callNativeData.live_event;
            if (callNativeEvent != null) {
                m164826a(callNativeEvent);
                CallNativeParams callNativeParams2 = callNativeData.params;
                if (callNativeParams2 != null) {
                    str3 = callNativeParams2.live_id;
                } else {
                    str3 = null;
                }
                m164827a(callNativeEvent, str3);
            }
            CallNativeParams callNativeParams3 = callNativeData.params;
            if (!(callNativeParams3 == null || (str2 = callNativeParams3.player_type) == null)) {
                if (callNativeData.live_event == CallNativeEvent.LIVE_CAN_PLAY) {
                    if (Intrinsics.areEqual("live", str2)) {
                        C41504b.m164718h();
                    } else if (Intrinsics.areEqual("playback", str2)) {
                        C41504b.m164726p();
                    }
                } else if (callNativeData.live_event == CallNativeEvent.WEBVIEW_LOADED) {
                    if (Intrinsics.areEqual("live", str2)) {
                        C41504b.m164712b();
                        C41504b.m164714d();
                    } else if (Intrinsics.areEqual("playback", str2)) {
                        C41504b.m164720j();
                        C41504b.m164722l();
                    }
                }
            }
            if (callNativeData.live_event == CallNativeEvent.NATIVE_TOAST_VISIBLE_CHANGE && (callNativeParams = callNativeData.params) != null && !TextUtils.isEmpty(callNativeParams.content)) {
                C45858j.m181680b(callNativeParams.content);
            }
        }
        IStateTracker bVar = this.f105593b;
        if (bVar != null) {
            bVar.mo149439a(callNativeData);
        }
    }
}
