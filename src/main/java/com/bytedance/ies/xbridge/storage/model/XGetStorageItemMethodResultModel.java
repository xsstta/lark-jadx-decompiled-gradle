package com.bytedance.ies.xbridge.storage.model;

import com.bytedance.ies.xbridge.model.results.XBaseResultModel;
import com.google.firebase.messaging.Constants;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/bytedance/ies/xbridge/storage/model/XGetStorageItemMethodResultModel;", "Lcom/bytedance/ies/xbridge/model/results/XBaseResultModel;", "()V", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "getData", "()Ljava/lang/Object;", "setData", "(Ljava/lang/Object;)V", "provideResultList", "", "", "Companion", "x-bridge-storage_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ies.xbridge.g.b.b */
public final class XGetStorageItemMethodResultModel extends XBaseResultModel {

    /* renamed from: a */
    public static final Companion f38079a = new Companion(null);

    /* renamed from: b */
    private Object f38080b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/bytedance/ies/xbridge/storage/model/XGetStorageItemMethodResultModel$Companion;", "", "()V", "convert", "", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/bytedance/ies/xbridge/storage/model/XGetStorageItemMethodResultModel;", "x-bridge-storage_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.xbridge.g.b.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final Map<String, Object> mo53169a(XGetStorageItemMethodResultModel bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Object a = bVar.mo53167a();
            if (a != null) {
                linkedHashMap.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, a);
            }
            return linkedHashMap;
        }
    }

    /* renamed from: a */
    public final Object mo53167a() {
        return this.f38080b;
    }

    /* renamed from: a */
    public final void mo53168a(Object obj) {
        this.f38080b = obj;
    }
}
