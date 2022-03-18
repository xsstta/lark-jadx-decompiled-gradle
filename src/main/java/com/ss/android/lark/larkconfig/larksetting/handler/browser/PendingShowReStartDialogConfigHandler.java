package com.ss.android.lark.larkconfig.larksetting.handler.browser;

import com.ss.android.lark.larkconfig.export.handler.AbstractBaseSettingHandler;
import com.ss.android.lark.util.share_preference.UserSP;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\u0006H\u0016J\u0006\u0010\n\u001a\u00020\u0004J\b\u0010\u000b\u001a\u00020\u0006H\u0016J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/larkconfig/larksetting/handler/browser/PendingShowReStartDialogConfigHandler;", "Lcom/ss/android/lark/larkconfig/export/handler/AbstractBaseSettingHandler;", "()V", "DEFAULT_PENDING_TIME", "", "KEY", "", "TAG", "pendingConfigTime", "getSettingKey", "getShowReStartDialogPendingTime", "getTag", "updateConfig", "", "configString", "larksetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.larkconfig.larksetting.handler.b.a */
public final class PendingShowReStartDialogConfigHandler extends AbstractBaseSettingHandler {

    /* renamed from: a */
    public static final PendingShowReStartDialogConfigHandler f104958a;

    /* renamed from: c */
    private static long f104959c = 3000;

    @Override // com.ss.android.lark.larkconfig.export.handler.IBaseSettingHandler
    /* renamed from: a */
    public String mo107772a() {
        return "restart_dialog_pending_time";
    }

    @Override // com.ss.android.lark.larkconfig.export.handler.AbstractBaseSettingHandler
    /* renamed from: c */
    public String mo107774c() {
        return "PendingShowReStartDialogConfigHandler";
    }

    private PendingShowReStartDialogConfigHandler() {
    }

    /* renamed from: d */
    public final long mo136183d() {
        return f104959c;
    }

    static {
        PendingShowReStartDialogConfigHandler aVar = new PendingShowReStartDialogConfigHandler();
        f104958a = aVar;
        aVar.mo148473a(UserSP.getInstance().getString("PendingShowReStartDialogConfigHandler", null));
        aVar.mo148402a(aVar.mo148411i().mo148421a(C411731.INSTANCE));
    }

    /* renamed from: a */
    public final void mo148473a(String str) {
        boolean z;
        if (str != null) {
            if (str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                try {
                    f104959c = new JSONObject(str).optLong("restart_dialog_pending_time", 3000);
                } catch (JSONException unused) {
                    f104959c = 3000;
                }
            }
        }
    }
}
