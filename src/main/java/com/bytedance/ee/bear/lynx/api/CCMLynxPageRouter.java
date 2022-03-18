package com.bytedance.ee.bear.lynx.api;

import android.content.Context;
import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u000eJ@\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072&\u0010\b\u001a\"\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tj\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u0001`\fH&J@\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\n2&\u0010\b\u001a\"\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tj\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u0001`\fH&¨\u0006\u000f"}, d2 = {"Lcom/bytedance/ee/bear/lynx/api/CCMLynxPageRouter;", "", "openPage", "", "context", "Landroid/content/Context;", "pageType", "", "templateData", "Ljava/util/HashMap;", "", "Ljava/io/Serializable;", "Lkotlin/collections/HashMap;", "templateUrl", "PageType", "lynx-api_release"}, mo238835k = 1, mv = {1, 1, 15})
public interface CCMLynxPageRouter {

    @Target({ElementType.PARAMETER})
    @kotlin.annotation.Target(allowedTargets = {AnnotationTarget.VALUE_PARAMETER})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/bytedance/ee/bear/lynx/api/CCMLynxPageRouter$PageType;", "", "Companion", "lynx-api_release"}, mo238835k = 1, mv = {1, 1, 15})
    public @interface PageType {
        public static final Companion Companion = Companion.f23739a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/lynx/api/CCMLynxPageRouter$PageType$Companion;", "", "()V", "DOC_OPERATION_HIST", "", "lynx-api_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.lynx.api.CCMLynxPageRouter$PageType$a */
        public static final class Companion {

            /* renamed from: a */
            static final /* synthetic */ Companion f23739a = new Companion();

            private Companion() {
            }
        }
    }

    /* renamed from: a */
    boolean mo33879a(Context context, String str, HashMap<String, Serializable> hashMap);
}
