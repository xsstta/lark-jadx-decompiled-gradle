package com.bytedance.ee.bear.document.bottommenu;

import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.document.DocumentPlugin;
import com.bytedance.ee.bear.document.bottommenu.BottomMenuData;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.widgets.C11811a;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \r2\u00020\u0001:\u0002\r\u000eB\u0005¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u00020\u00042\u001a\u0010\u0005\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\b0\u0006H\u0016J\u001c\u0010\t\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0007H\u0002¨\u0006\u000f"}, d2 = {"Lcom/bytedance/ee/bear/document/bottommenu/BottomMenuPlugin;", "Lcom/bytedance/ee/bear/document/DocumentPlugin;", "()V", "getBridgeHandlers", "", "handlersHolder", "", "", "Lcom/bytedance/ee/bear/jsbridge/BridgeHandlerV2;", "handleResult", "callback", "Lcom/bytedance/ee/bear/jsbridge/CallBackFunction;", "id", "Companion", "ShowBottomMenuHandler", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class BottomMenuPlugin extends DocumentPlugin {
    public static final Companion Companion = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ee/bear/document/bottommenu/BottomMenuPlugin$Companion;", "", "()V", "BIZ_UTIL_SHOW_BOTTOM_MENU", "", "TAG", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.bottommenu.BottomMenuPlugin$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/document/bottommenu/BottomMenuPlugin$ShowBottomMenuHandler;", "Lcom/bytedance/ee/bear/jsbridge/BridgeHandlerV2;", "Lcom/bytedance/ee/bear/document/bottommenu/BottomMenuData;", "(Lcom/bytedance/ee/bear/document/bottommenu/BottomMenuPlugin;)V", "handle", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "callback", "Lcom/bytedance/ee/bear/jsbridge/CallBackFunction;", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.bottommenu.BottomMenuPlugin$b */
    private final class ShowBottomMenuHandler implements AbstractC7945d<BottomMenuData> {
        /* JADX WARN: Incorrect args count in method signature: ()V */
        public ShowBottomMenuHandler() {
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\b"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/bytedance/ee/bear/document/bottommenu/BottomMenuPlugin$ShowBottomMenuHandler$handle$1$1$1$1", "com/bytedance/ee/bear/document/bottommenu/BottomMenuPlugin$ShowBottomMenuHandler$$special$$inlined$forEach$lambda$1", "com/bytedance/ee/bear/document/bottommenu/BottomMenuPlugin$ShowBottomMenuHandler$$special$$inlined$apply$lambda$1"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.document.bottommenu.BottomMenuPlugin$b$a */
        public static final class View$OnClickListenerC5674a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ BottomMenuData.Item f16034a;

            /* renamed from: b */
            final /* synthetic */ C11811a f16035b;

            /* renamed from: c */
            final /* synthetic */ BottomMenuData f16036c;

            /* renamed from: d */
            final /* synthetic */ ShowBottomMenuHandler f16037d;

            /* renamed from: e */
            final /* synthetic */ AbstractC7947h f16038e;

            View$OnClickListenerC5674a(BottomMenuData.Item item, C11811a aVar, BottomMenuData bottomMenuData, ShowBottomMenuHandler bVar, AbstractC7947h hVar) {
                this.f16034a = item;
                this.f16035b = aVar;
                this.f16036c = bottomMenuData;
                this.f16037d = bVar;
                this.f16038e = hVar;
            }

            public final void onClick(View view) {
                BottomMenuPlugin.this.handleResult(this.f16038e, this.f16034a.getId());
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\b"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/bytedance/ee/bear/document/bottommenu/BottomMenuPlugin$ShowBottomMenuHandler$handle$1$1$1$2", "com/bytedance/ee/bear/document/bottommenu/BottomMenuPlugin$ShowBottomMenuHandler$$special$$inlined$forEach$lambda$2", "com/bytedance/ee/bear/document/bottommenu/BottomMenuPlugin$ShowBottomMenuHandler$$special$$inlined$apply$lambda$2"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.document.bottommenu.BottomMenuPlugin$b$b */
        public static final class View$OnClickListenerC5675b implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ BottomMenuData.Item f16039a;

            /* renamed from: b */
            final /* synthetic */ C11811a f16040b;

            /* renamed from: c */
            final /* synthetic */ BottomMenuData f16041c;

            /* renamed from: d */
            final /* synthetic */ ShowBottomMenuHandler f16042d;

            /* renamed from: e */
            final /* synthetic */ AbstractC7947h f16043e;

            View$OnClickListenerC5675b(BottomMenuData.Item item, C11811a aVar, BottomMenuData bottomMenuData, ShowBottomMenuHandler bVar, AbstractC7947h hVar) {
                this.f16039a = item;
                this.f16040b = aVar;
                this.f16041c = bottomMenuData;
                this.f16042d = bVar;
                this.f16043e = hVar;
            }

            public final void onClick(View view) {
                BottomMenuPlugin.this.handleResult(this.f16043e, this.f16039a.getId());
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0007"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/bytedance/ee/bear/document/bottommenu/BottomMenuPlugin$ShowBottomMenuHandler$handle$1$1$3", "com/bytedance/ee/bear/document/bottommenu/BottomMenuPlugin$ShowBottomMenuHandler$$special$$inlined$apply$lambda$3"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.document.bottommenu.BottomMenuPlugin$b$c */
        public static final class View$OnClickListenerC5676c implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ BottomMenuData f16044a;

            /* renamed from: b */
            final /* synthetic */ ShowBottomMenuHandler f16045b;

            /* renamed from: c */
            final /* synthetic */ AbstractC7947h f16046c;

            View$OnClickListenerC5676c(BottomMenuData bottomMenuData, ShowBottomMenuHandler bVar, AbstractC7947h hVar) {
                this.f16044a = bottomMenuData;
                this.f16045b = bVar;
                this.f16046c = hVar;
            }

            public final void onClick(View view) {
                BottomMenuPlugin.this.handleResult(this.f16046c, "Cancel");
            }
        }

        /* renamed from: a */
        public void handle(BottomMenuData bottomMenuData, AbstractC7947h hVar) {
            C13479a.m54764b("BottomMenuPlugin", "ShowBottomMenuHandler()...");
            if (bottomMenuData != null) {
                C11811a a = C11811a.m48976a(BottomMenuPlugin.this.getActivity());
                for (T t : bottomMenuData.getItems()) {
                    if (t.getStyle() == 1) {
                        a.mo45227b(t.getText(), new View$OnClickListenerC5674a(t, a, bottomMenuData, this, hVar));
                    } else {
                        a.mo45221a(t.getText(), new View$OnClickListenerC5675b(t, a, bottomMenuData, this, hVar));
                    }
                }
                String title = bottomMenuData.getTitle();
                if (title != null) {
                    a.mo45220a((CharSequence) title);
                }
                if (bottomMenuData.getShowCancel()) {
                    a.mo45218a(new View$OnClickListenerC5676c(bottomMenuData, this, hVar));
                }
                a.mo45231c();
            }
        }
    }

    @Override // com.bytedance.ee.bear.document.DocumentPlugin, com.bytedance.ee.bear.browser.plugin.lazy.AbstractC4952a
    public void getBridgeHandlers(Map<String, AbstractC7945d<?>> map) {
        Intrinsics.checkParameterIsNotNull(map, "handlersHolder");
        map.put("biz.util.showBottomMenu", new ShowBottomMenuHandler());
    }

    public final void handleResult(AbstractC7947h hVar, String str) {
        if (hVar != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", (Object) str);
            hVar.mo17188a(jSONObject);
        }
    }
}
