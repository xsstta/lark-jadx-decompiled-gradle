package com.ss.android.lark.moments.impl.privatechat;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: com.ss.android.lark.moments.impl.f.b */
public interface IMomentsSecretChatHandler {
    void observeRequestResult(LifecycleOwner lifecycleOwner, Context context, Function0<Unit> function0, Function0<Unit> function02);

    void requestSecretChat(String str, String str2, String str3);

    /* renamed from: com.ss.android.lark.moments.impl.f.b$a */
    public static final class C47453a {
        /* renamed from: a */
        public static /* synthetic */ void m188136a(IMomentsSecretChatHandler bVar, String str, String str2, String str3, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    str = null;
                }
                if ((i & 2) != 0) {
                    str2 = null;
                }
                bVar.requestSecretChat(str, str2, str3);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestSecretChat");
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.lark.moments.impl.f.b */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public static /* synthetic */ void m188135a(IMomentsSecretChatHandler bVar, LifecycleOwner lifecycleOwner, Context context, Function0 function0, Function0 function02, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    function0 = null;
                }
                if ((i & 8) != 0) {
                    function02 = null;
                }
                bVar.observeRequestResult(lifecycleOwner, context, function0, function02);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: observeRequestResult");
        }
    }
}
