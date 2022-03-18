package com.bytedance.ee.bear.rn.handler;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0006J\u001a\u0010\u000b\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\u0006H\u0016J\u000e\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0006J\u000e\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0006R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/bytedance/ee/bear/rn/handler/SendMessageToWebviewHandler;", "Lcom/bytedance/ee/bear/jsbridge/BridgeHandlerV2;", "", "()V", "followWebViewCallbacks", "", "Lcom/bytedance/ee/bear/jsbridge/CallBackFunction;", "mWebviewCallback", "addFollowWebViewCallback", "", "callback", "handle", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "removeFollowWebViewCallback", "setWebViewCallback", "Companion", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.rn.handler.i */
public final class SendMessageToWebviewHandler implements AbstractC7945d<String> {

    /* renamed from: a */
    public static final Companion f28581a = new Companion(null);

    /* renamed from: d */
    private static final String f28582d = f28582d;

    /* renamed from: b */
    private AbstractC7947h f28583b;

    /* renamed from: c */
    private List<AbstractC7947h> f28584c = new ArrayList();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/rn/handler/SendMessageToWebviewHandler$Companion;", "", "()V", "TAG", "", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.handler.i$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo40369a(AbstractC7947h hVar) {
        Intrinsics.checkParameterIsNotNull(hVar, "callback");
        this.f28583b = hVar;
    }

    /* renamed from: c */
    public final void mo40372c(AbstractC7947h hVar) {
        Intrinsics.checkParameterIsNotNull(hVar, "callback");
        this.f28584c.remove(hVar);
    }

    /* renamed from: b */
    public final void mo40371b(AbstractC7947h hVar) {
        Intrinsics.checkParameterIsNotNull(hVar, "callback");
        if (!this.f28584c.contains(hVar)) {
            this.f28584c.add(hVar);
        }
    }

    /* renamed from: a */
    public void handle(String str, AbstractC7947h hVar) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(hVar, "callback");
        String str2 = f28582d;
        StringBuilder sb = new StringBuilder();
        sb.append("handle()... data nul is ");
        if (str == null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        C13479a.m54772d(str2, sb.toString());
        if (str != null) {
            JSONObject parseObject = JSON.parseObject(str);
            AbstractC7947h hVar2 = this.f28583b;
            if (hVar2 != null) {
                hVar2.mo17188a(parseObject);
            }
            Iterator<T> it = this.f28584c.iterator();
            while (it.hasNext()) {
                it.next().mo17188a(parseObject);
            }
        }
    }
}
