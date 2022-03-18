package com.bytedance.ee.bear.document.orientation;

import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.DocumentPlugin;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.util.io.NonProguard;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.log.Log;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001:\u0002\f\rB\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/bytedance/ee/bear/document/orientation/CommonOrientationPlugin;", "Lcom/bytedance/ee/bear/document/DocumentPlugin;", "()V", "LANDSCAPE_CONTROL", "", "TAG", "onAttachToUIContainer", "", "host", "Lcom/bytedance/ee/bear/document/DocumentPluginHost;", "uiContainer", "Lcom/bytedance/ee/bear/browser/plugin/UIContainer;", "LandscapeControlMeta", "LandscapeHandler", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public class CommonOrientationPlugin extends DocumentPlugin {
    private final String LANDSCAPE_CONTROL = "biz.control.functions";
    public final String TAG = "CommonOrientationPlugin";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/document/orientation/CommonOrientationPlugin$LandscapeControlMeta;", "Lcom/bytedance/ee/util/io/NonProguard;", "()V", "landscape", "", "getLandscape", "()Z", "setLandscape", "(Z)V", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    public static final class LandscapeControlMeta implements NonProguard {
        private boolean landscape;

        public final boolean getLandscape() {
            return this.landscape;
        }

        public final void setLandscape(boolean z) {
            this.landscape = z;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/document/orientation/CommonOrientationPlugin$LandscapeHandler;", "Lcom/bytedance/ee/bear/jsbridge/BridgeHandlerV2;", "Lcom/bytedance/ee/bear/document/orientation/CommonOrientationPlugin$LandscapeControlMeta;", "(Lcom/bytedance/ee/bear/document/orientation/CommonOrientationPlugin;)V", "handle", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "callback", "Lcom/bytedance/ee/bear/jsbridge/CallBackFunction;", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.orientation.CommonOrientationPlugin$a */
    public final class LandscapeHandler implements AbstractC7945d<LandscapeControlMeta> {
        /* JADX WARN: Incorrect args count in method signature: ()V */
        public LandscapeHandler() {
        }

        /* renamed from: a */
        public void handle(LandscapeControlMeta landscapeControlMeta, AbstractC7947h hVar) {
            if (landscapeControlMeta == null) {
                Log.m165383e(CommonOrientationPlugin.this.TAG, "landscape control, data is null");
            } else if (landscapeControlMeta.getLandscape()) {
                CommonOrientationPlugin.this.getActivity().setRequestedOrientation(-1);
            } else {
                CommonOrientationPlugin.this.getActivity().setRequestedOrientation(1);
            }
        }
    }

    public void onAttachToUIContainer(C6095s sVar, AbstractC4958n nVar) {
        super.onAttachToUIContainer((C4943e) sVar, nVar);
        bindBridgeHandler(this.LANDSCAPE_CONTROL, new LandscapeHandler());
    }
}
