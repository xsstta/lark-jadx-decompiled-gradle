package com.ss.android.lark.larkconfig.larksetting.handler.chat;

import com.ss.android.lark.larkconfig.export.handler.AbstractBaseSettingHandler;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0006\u001a\u00020\u0004J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\nH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/larkconfig/larksetting/handler/chat/ReadSampleSettingHandler;", "Lcom/ss/android/lark/larkconfig/export/handler/AbstractBaseSettingHandler$UserSPCachedSettingHandler;", "()V", "SETTING_KEY", "", "TAG", "getReadSampleConfigString", "getSettingKey", "getTag", "isSynchronized", "", "larksetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.larkconfig.larksetting.handler.d.b */
public final class ReadSampleSettingHandler extends AbstractBaseSettingHandler.UserSPCachedSettingHandler {

    /* renamed from: a */
    public static final ReadSampleSettingHandler f104963a;

    @Override // com.ss.android.lark.larkconfig.export.handler.IBaseSettingHandler
    /* renamed from: a */
    public String mo107772a() {
        return "read_sample_report";
    }

    @Override // com.ss.android.lark.larkconfig.export.handler.AbstractBaseSettingHandler
    /* renamed from: c */
    public String mo107774c() {
        return "ReadSampleSettingHandler";
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.larkconfig.export.handler.AbstractBaseSettingHandler
    /* renamed from: k */
    public boolean mo148413k() {
        return true;
    }

    private ReadSampleSettingHandler() {
    }

    /* renamed from: d */
    public final String mo136183d() {
        return AbstractBaseSettingHandler.m163277b(this, mo107773b(), null, 1, null);
    }

    static {
        ReadSampleSettingHandler bVar = new ReadSampleSettingHandler();
        f104963a = bVar;
        bVar.mo148402a(bVar.mo148411i().mo148422b(C411821.INSTANCE).mo148424c(C411832.INSTANCE).mo148421a(C411843.INSTANCE));
    }
}
