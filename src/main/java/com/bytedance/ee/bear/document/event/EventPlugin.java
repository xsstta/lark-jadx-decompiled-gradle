package com.bytedance.ee.bear.document.event;

import android.text.TextUtils;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.contract.p282f.C5171a;
import com.bytedance.ee.bear.document.C6057p;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.DocumentPlugin;
import com.bytedance.ee.bear.document.fail.DocException;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.list.p424c.AbstractC8149a;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.common.C13606d;
import com.google.firebase.messaging.Constants;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00152\u00020\u0001:\u0003\u0015\u0016\u0017B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0005J \u0010\t\u001a\u00020\u00072\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0\u000bH\u0016J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0012\u0010\u0011\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0005R\u0016\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/bytedance/ee/bear/document/event/EventPlugin;", "Lcom/bytedance/ee/bear/document/DocumentPlugin;", "()V", "mDeleteListenerList", "", "Lcom/bytedance/ee/bear/document/event/EventPlugin$OnDeleteListener;", "addOnDeleteListener", "", "listener", "getBridgeHandlers", "handlersHolder", "", "", "Lcom/bytedance/ee/bear/jsbridge/BridgeHandlerV2;", "handleEventDelete", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/bytedance/ee/bear/document/event/EventModel;", "onDetachFromHost", "host", "Lcom/bytedance/ee/bear/document/DocumentPluginHost;", "removeOnDeleteListener", "Companion", "EventHandler", "OnDeleteListener", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class EventPlugin extends DocumentPlugin {
    public static final Companion Companion = new Companion(null);
    private final List<OnDeleteListener> mDeleteListenerList = new CopyOnWriteArrayList();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ee/bear/document/event/EventPlugin$OnDeleteListener;", "", "onDelete", "", "token", "", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.event.EventPlugin$c */
    public interface OnDeleteListener {
        /* renamed from: a */
        void mo23172a(String str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ee/bear/document/event/EventPlugin$Companion;", "", "()V", "EVENT_DELETE", "", "TAG", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.event.EventPlugin$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/document/event/EventPlugin$EventHandler;", "Lcom/bytedance/ee/bear/jsbridge/BridgeHandlerV2;", "Lcom/bytedance/ee/bear/document/event/EventModel;", "(Lcom/bytedance/ee/bear/document/event/EventPlugin;)V", "handle", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "callback", "Lcom/bytedance/ee/bear/jsbridge/CallBackFunction;", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.event.EventPlugin$b */
    private final class EventHandler implements AbstractC7945d<EventModel> {
        /* JADX WARN: Incorrect args count in method signature: ()V */
        public EventHandler() {
        }

        /* renamed from: a */
        public void handle(EventModel eventModel, AbstractC7947h hVar) {
            String str;
            C13479a.m54764b("EventPlugin", "EventModel: " + eventModel);
            if (eventModel != null) {
                str = eventModel.getEvent();
            } else {
                str = null;
            }
            if (Intrinsics.areEqual(str, "NOTE_DELETED")) {
                EventPlugin.this.handleEventDelete(eventModel);
            }
        }
    }

    public final void removeOnDeleteListener(OnDeleteListener cVar) {
        this.mDeleteListenerList.remove(cVar);
    }

    public final void addOnDeleteListener(OnDeleteListener cVar) {
        if (!this.mDeleteListenerList.contains(cVar)) {
            this.mDeleteListenerList.add(cVar);
        }
    }

    @Override // com.bytedance.ee.bear.document.DocumentPlugin, com.bytedance.ee.bear.browser.plugin.lazy.AbstractC4952a
    public void getBridgeHandlers(Map<String, AbstractC7945d<?>> map) {
        Intrinsics.checkParameterIsNotNull(map, "handlersHolder");
        map.put("biz.notify.event", new EventHandler());
    }

    public void onDetachFromHost(C6095s sVar) {
        super.onDetachFromHost((C4943e) sVar);
        this.mDeleteListenerList.clear();
    }

    public final void handleEventDelete(EventModel eventModel) {
        C6057p pVar;
        if (!TextUtils.isEmpty(eventModel.getToken())) {
            try {
                ((AbstractC8149a) KoinJavaComponent.m268613a(AbstractC8149a.class, null, null, 6, null)).mo31522e(eventModel.getToken());
                for (T t : this.mDeleteListenerList) {
                    if (t != null) {
                        String token = eventModel.getToken();
                        Intrinsics.checkExpressionValueIsNotNull(token, "data.token");
                        t.mo23172a(token);
                    }
                }
                if (getDocViewModel() != null && (pVar = (C6057p) ((C6095s) getHost()).mo24600o()) != null) {
                    if (C5171a.m21156e(getDocViewModel().getOriginBearUrl())) {
                        pVar.mo24475a(920004002, new DocException(920004002, ""));
                    } else {
                        pVar.mo24475a(-55, new DocException(-55, ""));
                    }
                }
            } catch (Throwable th) {
                C13606d.m55245a("EventPlugin", th);
            }
        }
    }
}
