package com.bytedance.ies.xbridge.ui.model;

import com.bytedance.ies.xbridge.model.results.XBaseResultModel;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\u0018\u0000 \f2\u00020\u0001:\u0002\u000b\fB\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/bytedance/ies/xbridge/ui/model/XShowModalMethodResultModel;", "Lcom/bytedance/ies/xbridge/model/results/XBaseResultModel;", "()V", "action", "", "getAction", "()Ljava/lang/String;", "setAction", "(Ljava/lang/String;)V", "provideResultList", "", "Action", "Companion", "x-bridge-ui_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class XShowModalMethodResultModel extends XBaseResultModel {

    /* renamed from: a */
    public static final Companion f38107a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ies/xbridge/ui/model/XShowModalMethodResultModel$Action;", "", "(Ljava/lang/String;I)V", "CONFIRM", "CANCEL", "MASK", "x-bridge-ui_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum Action {
        CONFIRM,
        CANCEL,
        MASK
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/bytedance/ies/xbridge/ui/model/XShowModalMethodResultModel$Companion;", "", "()V", "convert", "", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/bytedance/ies/xbridge/ui/model/XShowModalMethodResultModel;", "x-bridge-ui_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.xbridge.ui.model.XShowModalMethodResultModel$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
