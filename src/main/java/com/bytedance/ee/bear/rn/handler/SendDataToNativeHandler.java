package com.bytedance.ee.bear.rn.handler;

import com.bytedance.ee.bear.contract.BinderISendDataCallback;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u000e\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0006J\u000e\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0006R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/bytedance/ee/bear/rn/handler/SendDataToNativeHandler;", "Lcom/bytedance/ee/bear/jsbridge/BridgeHandlerV2;", "", "()V", "mISendDataCallback", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/bytedance/ee/bear/contract/BinderISendDataCallback;", "handle", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "callback", "Lcom/bytedance/ee/bear/jsbridge/CallBackFunction;", "registSendDataCallback", "iSendDataCallback", "unRegistSendDataCallback", "Companion", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.rn.handler.g */
public final class SendDataToNativeHandler implements AbstractC7945d<String> {

    /* renamed from: b */
    public static final String f28572b = f28572b;

    /* renamed from: c */
    public static final Companion f28573c = new Companion(null);

    /* renamed from: a */
    public CopyOnWriteArrayList<BinderISendDataCallback> f28574a = new CopyOnWriteArrayList<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/rn/handler/SendDataToNativeHandler$Companion;", "", "()V", "TAG", "", "rn-bridge-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.handler.g$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.handler.g$c */
    public static final class C10654c<T> implements Consumer<Throwable> {

        /* renamed from: a */
        public static final C10654c f28577a = new C10654c();

        C10654c() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54761a(SendDataToNativeHandler.f28572b, th);
        }
    }

    /* renamed from: a */
    public final void mo40362a(BinderISendDataCallback binderISendDataCallback) {
        Intrinsics.checkParameterIsNotNull(binderISendDataCallback, "iSendDataCallback");
        this.f28574a.add(binderISendDataCallback);
    }

    /* renamed from: b */
    public final void mo40364b(BinderISendDataCallback binderISendDataCallback) {
        Intrinsics.checkParameterIsNotNull(binderISendDataCallback, "iSendDataCallback");
        this.f28574a.remove(binderISendDataCallback);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "s", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.rn.handler.g$b */
    public static final class C10653b<T> implements Consumer<String> {

        /* renamed from: a */
        final /* synthetic */ SendDataToNativeHandler f28575a;

        /* renamed from: b */
        final /* synthetic */ String f28576b;

        C10653b(SendDataToNativeHandler gVar, String str) {
            this.f28575a = gVar;
            this.f28576b = str;
        }

        /* renamed from: a */
        public final void accept(String str) {
            Iterator<BinderISendDataCallback> it = this.f28575a.f28574a.iterator();
            while (it.hasNext()) {
                it.next().onReceiveData(this.f28576b);
            }
        }
    }

    /* renamed from: a */
    public void handle(String str, AbstractC7947h hVar) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(hVar, "callback");
        String str2 = f28572b;
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
            AbstractC68307f.m265083a("").mo237985a(C11678b.m48480d()).mo238001b(new C10653b(this, str), C10654c.f28577a);
        }
    }
}
