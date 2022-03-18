package com.ss.android.lark.larkconfig.larksetting.handler.fd;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.ss.android.lark.larkconfig.export.handler.AbstractBaseSettingHandler;
import com.ss.android.lark.log.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0014J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0002¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/larkconfig/larksetting/handler/fd/FDFeatureHandler;", "Lcom/ss/android/lark/larkconfig/export/handler/AbstractBaseSettingHandler;", "()V", "getSPKey", "", "getSettingKey", "getTag", "saveSP", "", "json", "larksetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.larkconfig.larksetting.handler.h.a */
public final class FDFeatureHandler extends AbstractBaseSettingHandler {

    /* renamed from: a */
    public static final FDFeatureHandler f104972a;

    @Override // com.ss.android.lark.larkconfig.export.handler.IBaseSettingHandler
    /* renamed from: a */
    public String mo107772a() {
        return "android_file_upload_file_descriptor_config";
    }

    @Override // com.ss.android.lark.larkconfig.export.handler.AbstractBaseSettingHandler
    /* renamed from: c */
    public String mo107774c() {
        return "FD Feature";
    }

    private FDFeatureHandler() {
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.larkconfig.export.handler.AbstractBaseSettingHandler
    /* renamed from: b */
    public String mo107773b() {
        return mo107772a();
    }

    static {
        FDFeatureHandler aVar = new FDFeatureHandler();
        f104972a = aVar;
        aVar.mo148402a(aVar.mo148411i().mo148421a(C411941.INSTANCE).mo148428e(C411952.INSTANCE));
    }

    /* renamed from: a */
    public final void mo148486a(String str) {
        if (str != null) {
            try {
                Object fromJson = new Gson().fromJson(str, FDFeatureSchema.class);
                Intrinsics.checkExpressionValueIsNotNull(fromJson, "Gson().fromJson(json, FDFeatureSchema::class.java)");
                AbstractBaseSettingHandler.m163276a(this, ((FDFeatureSchema) fromJson).mo148488a(), (String) null, 1, (Object) null);
            } catch (JsonSyntaxException e) {
                Log.m165397w(mo107774c(), e.getMessage());
            }
        }
    }
}
