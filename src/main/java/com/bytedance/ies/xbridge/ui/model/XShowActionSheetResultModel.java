package com.bytedance.ies.xbridge.ui.model;

import com.bytedance.ies.xbridge.model.results.XBaseResultModel;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u000f2\u00020\u0001:\u0003\u000f\u0010\u0011B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/bytedance/ies/xbridge/ui/model/XShowActionSheetResultModel;", "Lcom/bytedance/ies/xbridge/model/results/XBaseResultModel;", "()V", "action", "Lcom/bytedance/ies/xbridge/ui/model/XShowActionSheetResultModel$ResultAction;", "getAction", "()Lcom/bytedance/ies/xbridge/ui/model/XShowActionSheetResultModel$ResultAction;", "setAction", "(Lcom/bytedance/ies/xbridge/ui/model/XShowActionSheetResultModel$ResultAction;)V", "detail", "Lcom/bytedance/ies/xbridge/ui/model/XShowActionSheetResultModel$ResultDetail;", "getDetail", "()Lcom/bytedance/ies/xbridge/ui/model/XShowActionSheetResultModel$ResultDetail;", "setDetail", "(Lcom/bytedance/ies/xbridge/ui/model/XShowActionSheetResultModel$ResultDetail;)V", "Companion", "ResultAction", "ResultDetail", "x-bridge-ui_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class XShowActionSheetResultModel extends XBaseResultModel {

    /* renamed from: a */
    public static final Companion f38106a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/bytedance/ies/xbridge/ui/model/XShowActionSheetResultModel$ResultAction;", "", "action", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getAction", "()Ljava/lang/String;", "SELECT", "DISMISS", "x-bridge-ui_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum ResultAction {
        SELECT("select"),
        DISMISS("dismiss");
        
        private final String action;

        public final String getAction() {
            return this.action;
        }

        private ResultAction(String str) {
            this.action = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/bytedance/ies/xbridge/ui/model/XShowActionSheetResultModel$Companion;", "", "()V", "convert", "", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/bytedance/ies/xbridge/ui/model/XShowActionSheetResultModel;", "x-bridge-ui_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.xbridge.ui.model.XShowActionSheetResultModel$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
