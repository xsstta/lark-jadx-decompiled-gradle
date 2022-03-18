package com.bytedance.ies.xbridge.storage.model;

import com.bytedance.ies.xbridge.C14434d;
import com.bytedance.ies.xbridge.XDynamic;
import com.bytedance.ies.xbridge.XReadableMap;
import com.bytedance.ies.xbridge.model.params.XBaseParamModel;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u0010H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/bytedance/ies/xbridge/storage/model/XSetStorageItemMethodParamModel;", "Lcom/bytedance/ies/xbridge/model/params/XBaseParamModel;", "()V", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/bytedance/ies/xbridge/XDynamic;", "getData", "()Lcom/bytedance/ies/xbridge/XDynamic;", "setData", "(Lcom/bytedance/ies/xbridge/XDynamic;)V", "key", "", "getKey", "()Ljava/lang/String;", "setKey", "(Ljava/lang/String;)V", "provideParamList", "", "Companion", "x-bridge-storage_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ies.xbridge.g.b.d */
public final class XSetStorageItemMethodParamModel extends XBaseParamModel {

    /* renamed from: c */
    public static final Companion f38083c = new Companion(null);

    /* renamed from: a */
    public String f38084a;

    /* renamed from: b */
    public XDynamic f38085b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ies/xbridge/storage/model/XSetStorageItemMethodParamModel$Companion;", "", "()V", "convert", "Lcom/bytedance/ies/xbridge/storage/model/XSetStorageItemMethodParamModel;", "params", "Lcom/bytedance/ies/xbridge/XReadableMap;", "x-bridge-storage_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.xbridge.g.b.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final XSetStorageItemMethodParamModel mo53177a(XReadableMap hVar) {
            boolean z;
            XDynamic eVar;
            Intrinsics.checkParameterIsNotNull(hVar, "params");
            String a = C14434d.m58266a(hVar, "key", (String) null, 2, (Object) null);
            if (a.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return null;
            }
            if (hVar.mo53103b(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)) {
                eVar = null;
            } else {
                eVar = hVar.mo53110i(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            }
            if (eVar == null) {
                return null;
            }
            XSetStorageItemMethodParamModel dVar = new XSetStorageItemMethodParamModel();
            dVar.mo53175a(a);
            dVar.mo53174a(eVar);
            return dVar;
        }
    }

    /* renamed from: a */
    public final String mo53173a() {
        String str = this.f38084a;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("key");
        }
        return str;
    }

    /* renamed from: b */
    public final XDynamic mo53176b() {
        XDynamic eVar = this.f38085b;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        }
        return eVar;
    }

    /* renamed from: a */
    public final void mo53174a(XDynamic eVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "<set-?>");
        this.f38085b = eVar;
    }

    /* renamed from: a */
    public final void mo53175a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f38084a = str;
    }
}
