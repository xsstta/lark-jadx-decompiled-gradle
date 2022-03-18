package com.bytedance.ies.xbridge.storage.model;

import com.bytedance.ies.xbridge.C14434d;
import com.bytedance.ies.xbridge.XReadableMap;
import com.bytedance.ies.xbridge.model.params.XBaseParamModel;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/bytedance/ies/xbridge/storage/model/XGetStorageItemMethodParamModel;", "Lcom/bytedance/ies/xbridge/model/params/XBaseParamModel;", "()V", "key", "", "getKey", "()Ljava/lang/String;", "setKey", "(Ljava/lang/String;)V", "provideParamList", "", "Companion", "x-bridge-storage_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ies.xbridge.g.b.a */
public final class XGetStorageItemMethodParamModel extends XBaseParamModel {

    /* renamed from: b */
    public static final Companion f38077b = new Companion(null);

    /* renamed from: a */
    public String f38078a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ies/xbridge/storage/model/XGetStorageItemMethodParamModel$Companion;", "", "()V", "convert", "Lcom/bytedance/ies/xbridge/storage/model/XGetStorageItemMethodParamModel;", "params", "Lcom/bytedance/ies/xbridge/XReadableMap;", "x-bridge-storage_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.xbridge.g.b.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final XGetStorageItemMethodParamModel mo53166a(XReadableMap hVar) {
            boolean z;
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
            XGetStorageItemMethodParamModel aVar = new XGetStorageItemMethodParamModel();
            aVar.mo53165a(a);
            return aVar;
        }
    }

    /* renamed from: a */
    public final String mo53164a() {
        String str = this.f38078a;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("key");
        }
        return str;
    }

    /* renamed from: a */
    public final void mo53165a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f38078a = str;
    }
}
