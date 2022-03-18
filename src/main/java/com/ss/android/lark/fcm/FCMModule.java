package com.ss.android.lark.fcm;

import com.bytedance.i18n.claymore.ClaymoreImpl;
import com.google.firebase.FirebaseApp;
import com.ss.android.lark.fcm_export.IFCMModule;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.LarkContext;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@ClaymoreImpl(IFCMModule.class)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/fcm/FCMModule;", "Lcom/ss/android/lark/fcm_export/IFCMModule;", "()V", "hasInit", "", "initializeApp", "", "Companion", "core_fcm_fcm_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class FCMModule implements IFCMModule {
    public static final Companion Companion = new Companion(null);
    private volatile boolean hasInit;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/fcm/FCMModule$Companion;", "", "()V", "TAG", "", "core_fcm_fcm_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.fcm.FCMModule$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.fcm_export.IFCMModule
    public void initializeApp() {
        if (!this.hasInit) {
            try {
                FirebaseApp.initializeApp(LarkContext.getApplication());
            } catch (Throwable th) {
                String message = th.getMessage();
                if (message == null) {
                    message = "Rom crash";
                }
                Log.m165383e("FCMModule", message);
            }
            this.hasInit = true;
        }
    }
}
