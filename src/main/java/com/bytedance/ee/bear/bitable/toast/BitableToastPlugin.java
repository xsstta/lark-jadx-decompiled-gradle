package com.bytedance.ee.bear.bitable.toast;

import androidx.fragment.app.FragmentActivity;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.bitable.toast.BitableClickableToast;
import com.bytedance.ee.bear.bitable.toast.ToastModel;
import com.bytedance.ee.bear.browser.C4933k;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.DocumentPlugin;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00162\u00020\u0001:\u0003\u0016\u0017\u0018B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u000b\u001a\u00020\f2\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000eH\u0016J\u001c\u0010\u0011\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0018\u00010\u0006R\u00020\u0000X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0018\u00010\bR\u00020\u0000X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/bytedance/ee/bear/bitable/toast/BitableToastPlugin;", "Lcom/bytedance/ee/bear/document/DocumentPlugin;", "()V", "currentToast", "Lcom/bytedance/ee/bear/bitable/toast/BitableClickableToast;", "mHideTipsHandler", "Lcom/bytedance/ee/bear/bitable/toast/BitableToastPlugin$HideTipsHandler;", "mShowTipsHandler", "Lcom/bytedance/ee/bear/bitable/toast/BitableToastPlugin$ShowTipsHandler;", "pendingToastQueue", "Ljava/util/LinkedList;", "getBridgeHandlers", "", "handlersHolder", "", "", "Lcom/bytedance/ee/bear/jsbridge/BridgeHandlerV2;", "onDetachFromUIContainer", "host", "Lcom/bytedance/ee/bear/document/DocumentPluginHost;", "uiContainer", "Lcom/bytedance/ee/bear/browser/plugin/UIContainer;", "Companion", "HideTipsHandler", "ShowTipsHandler", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class BitableToastPlugin extends DocumentPlugin {
    public static final Companion Companion = new Companion(null);
    public BitableClickableToast currentToast;
    private HideTipsHandler mHideTipsHandler;
    private ShowTipsHandler mShowTipsHandler;
    public LinkedList<BitableClickableToast> pendingToastQueue = new LinkedList<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/bitable/toast/BitableToastPlugin$Companion;", "", "()V", "CALLBACK_PARAM_CLOSE_TYPE", "", "CALLBACK_PARAM_ID", "HIDE_TIPS", "SHOW_TIPS", "TAG", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.toast.BitableToastPlugin$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/bitable/toast/BitableToastPlugin$ShowTipsHandler;", "Lcom/bytedance/ee/bear/jsbridge/BridgeHandlerV2;", "Lcom/bytedance/ee/bear/bitable/toast/ToastModel;", "(Lcom/bytedance/ee/bear/bitable/toast/BitableToastPlugin;)V", "handle", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "callback", "Lcom/bytedance/ee/bear/jsbridge/CallBackFunction;", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.toast.BitableToastPlugin$c */
    public final class ShowTipsHandler implements AbstractC7945d<ToastModel> {

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.bitable.toast.BitableToastPlugin$c$a */
        public static final class RunnableC4842a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ ShowTipsHandler f14219a;

            RunnableC4842a(ShowTipsHandler cVar) {
                this.f14219a = cVar;
            }

            public final void run() {
                if (!BitableToastPlugin.this.pendingToastQueue.isEmpty()) {
                    BitableToastPlugin.this.currentToast = BitableToastPlugin.this.pendingToastQueue.poll();
                    BitableClickableToast aVar = BitableToastPlugin.this.currentToast;
                    if (aVar != null) {
                        aVar.mo18975d();
                        return;
                    }
                    return;
                }
                BitableToastPlugin.this.currentToast = null;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/bytedance/ee/bear/bitable/toast/BitableToastPlugin$ShowTipsHandler$handle$newToast$1", "Lcom/bytedance/ee/bear/bitable/toast/BitableClickableToast$OnToastDismissListener;", "onActionClick", "", "onTimeout", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.bitable.toast.BitableToastPlugin$c$b */
        public static final class C4843b implements BitableClickableToast.OnToastDismissListener {

            /* renamed from: a */
            final /* synthetic */ ToastModel f14220a;

            /* renamed from: b */
            final /* synthetic */ AbstractC7947h f14221b;

            @Override // com.bytedance.ee.bear.bitable.toast.BitableClickableToast.OnToastDismissListener
            /* renamed from: a */
            public void mo18956a() {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", (Object) this.f14220a.getId());
                jSONObject.put("closeType", (Object) Integer.valueOf(ToastModel.CLoseType.Confirm.getValue()));
                AbstractC7947h hVar = this.f14221b;
                if (hVar != null) {
                    hVar.mo17188a(jSONObject);
                }
            }

            @Override // com.bytedance.ee.bear.bitable.toast.BitableClickableToast.OnToastDismissListener
            /* renamed from: b */
            public void mo18957b() {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", (Object) this.f14220a.getId());
                jSONObject.put("closeType", (Object) Integer.valueOf(ToastModel.CLoseType.Timeout.getValue()));
                AbstractC7947h hVar = this.f14221b;
                if (hVar != null) {
                    hVar.mo17188a(jSONObject);
                }
            }

            C4843b(ToastModel toastModel, AbstractC7947h hVar) {
                this.f14220a = toastModel;
                this.f14221b = hVar;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public ShowTipsHandler() {
        }

        /* renamed from: a */
        public void handle(ToastModel toastModel, AbstractC7947h hVar) {
            C13479a.m54764b("BitableToastPlugin", "ShowTipsHandler: show tips.");
            if (toastModel != null) {
                FragmentActivity activity = BitableToastPlugin.this.getActivity();
                Intrinsics.checkExpressionValueIsNotNull(activity, "activity");
                Integer type = toastModel.getType();
                String content = toastModel.getContent();
                if (content == null) {
                    content = "";
                }
                String confirmText = toastModel.getConfirmText();
                long duration = toastModel.getDuration();
                if (duration == null) {
                    duration = 3000L;
                }
                BitableClickableToast aVar = new BitableClickableToast(activity, type, content, confirmText, duration, new C4843b(toastModel, hVar));
                aVar.mo18972a(new RunnableC4842a(this));
                if (BitableToastPlugin.this.currentToast == null) {
                    BitableToastPlugin.this.currentToast = aVar;
                    BitableClickableToast aVar2 = BitableToastPlugin.this.currentToast;
                    if (aVar2 != null) {
                        aVar2.mo18975d();
                        return;
                    }
                    return;
                }
                BitableToastPlugin.this.pendingToastQueue.add(aVar);
                BitableClickableToast aVar3 = BitableToastPlugin.this.currentToast;
                if (aVar3 != null) {
                    aVar3.mo18976e();
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/bitable/toast/BitableToastPlugin$HideTipsHandler;", "Lcom/bytedance/ee/bear/jsbridge/BridgeHandlerV2;", "Ljava/lang/Void;", "(Lcom/bytedance/ee/bear/bitable/toast/BitableToastPlugin;)V", "handle", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "callback", "Lcom/bytedance/ee/bear/jsbridge/CallBackFunction;", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.toast.BitableToastPlugin$b */
    public final class HideTipsHandler implements AbstractC7945d<Void> {
        /* JADX WARN: Incorrect args count in method signature: ()V */
        public HideTipsHandler() {
        }

        /* renamed from: a */
        public void handle(Void r2, AbstractC7947h hVar) {
            C13479a.m54764b("BitableToastPlugin", "HideTipsHandler: hide tips.");
            BitableClickableToast aVar = BitableToastPlugin.this.currentToast;
            if (aVar != null) {
                aVar.mo18976e();
            }
            if (hVar != null) {
                hVar.mo17188a(new JSONObject());
            }
        }
    }

    @Override // com.bytedance.ee.bear.document.DocumentPlugin, com.bytedance.ee.bear.browser.plugin.lazy.AbstractC4952a
    public void getBridgeHandlers(Map<String, AbstractC7945d<?>> map) {
        Intrinsics.checkParameterIsNotNull(map, "handlersHolder");
        this.mShowTipsHandler = new ShowTipsHandler();
        this.mHideTipsHandler = new HideTipsHandler();
        ShowTipsHandler cVar = this.mShowTipsHandler;
        if (cVar == null) {
            Intrinsics.throwNpe();
        }
        map.put("biz.bitable.showTips", cVar);
        HideTipsHandler bVar = this.mHideTipsHandler;
        if (bVar == null) {
            Intrinsics.throwNpe();
        }
        map.put("biz.bitable.hideTips", bVar);
    }

    public void onDetachFromUIContainer(C6095s sVar, AbstractC4958n nVar) {
        super.onDetachFromUIContainer((C4933k) sVar, nVar);
        BitableClickableToast aVar = this.currentToast;
        if (aVar != null) {
            aVar.mo18976e();
        }
        Iterator<T> it = this.pendingToastQueue.iterator();
        while (it.hasNext()) {
            BitableClickableToast.OnToastDismissListener f = it.next().mo18977f();
            if (f != null) {
                f.mo18957b();
            }
        }
        this.pendingToastQueue.clear();
    }
}
