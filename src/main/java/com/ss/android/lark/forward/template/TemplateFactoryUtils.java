package com.ss.android.lark.forward.template;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.ss.android.lark.log.Log;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/forward/template/TemplateFactoryUtils;", "", "()V", "Companion", "core_forward_forward_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.forward.template.l */
public final class TemplateFactoryUtils {

    /* renamed from: a */
    public static final Companion f99022a = new Companion(null);

    @JvmStatic
    /* renamed from: a */
    public static final boolean m151923a(ErrorResult errorResult) {
        return f99022a.mo141179a(errorResult);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/forward/template/TemplateFactoryUtils$Companion;", "", "()V", "shouldSkip", "", "result", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "core_forward_forward_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.forward.template.l$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final boolean mo141179a(ErrorResult errorResult) {
            int errorCode;
            if (errorResult == null || 260000 > (errorCode = errorResult.getErrorCode()) || errorCode > 260007) {
                return false;
            }
            Log.m165397w("TemplateFactoryUtils", "should skip error toast , current error code is " + errorCode + " , error msg is " + errorResult.getDisplayMsg());
            return true;
        }
    }
}
