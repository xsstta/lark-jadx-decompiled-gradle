package com.bytedance.ee.bear.lynx.impl.xbridge.method.view;

import android.text.TextUtils;
import com.bytedance.ies.xbridge.C14434d;
import com.bytedance.ies.xbridge.XReadableMap;
import com.bytedance.ies.xbridge.model.params.XBaseParamModel;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationTarget;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\u0018\u0000 \u00142\u00020\u0001:\u0002\u0014\u0015B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0013H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/bytedance/ee/bear/lynx/impl/xbridge/method/view/SendEventContainerMethodParamModel;", "Lcom/bytedance/ies/xbridge/model/params/XBaseParamModel;", "()V", "containerID", "", "getContainerID", "()Ljava/lang/String;", "setContainerID", "(Ljava/lang/String;)V", "eventName", "getEventName", "setEventName", "params", "Lcom/bytedance/ies/xbridge/XReadableMap;", "getParams", "()Lcom/bytedance/ies/xbridge/XReadableMap;", "setParams", "(Lcom/bytedance/ies/xbridge/XReadableMap;)V", "provideParamList", "", "Companion", "EventKinds", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class SendEventContainerMethodParamModel extends XBaseParamModel {

    /* renamed from: a */
    public static final Companion f23854a = new Companion(null);

    /* renamed from: b */
    private String f23855b = "";
    @EventKinds

    /* renamed from: c */
    private String f23856c = "";

    /* renamed from: d */
    private XReadableMap f23857d;

    @Target({ElementType.FIELD})
    @kotlin.annotation.Target(allowedTargets = {AnnotationTarget.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/bytedance/ee/bear/lynx/impl/xbridge/method/view/SendEventContainerMethodParamModel$EventKinds;", "", "Companion", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    public @interface EventKinds {
        public static final Companion Companion = Companion.f23858a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/lynx/impl/xbridge/method/view/SendEventContainerMethodParamModel$EventKinds$Companion;", "", "()V", "closeContainer", "", "default", "onClick", "onShow", "openPage", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.lynx.impl.xbridge.method.view.SendEventContainerMethodParamModel$EventKinds$a */
        public static final class Companion {

            /* renamed from: a */
            static final /* synthetic */ Companion f23858a = new Companion();

            private Companion() {
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/lynx/impl/xbridge/method/view/SendEventContainerMethodParamModel$Companion;", "", "()V", "convert", "Lcom/bytedance/ee/bear/lynx/impl/xbridge/method/view/SendEventContainerMethodParamModel;", "params", "Lcom/bytedance/ies/xbridge/XReadableMap;", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.lynx.impl.xbridge.method.view.SendEventContainerMethodParamModel$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final SendEventContainerMethodParamModel mo34026a(XReadableMap hVar) {
            Intrinsics.checkParameterIsNotNull(hVar, "params");
            String a = C14434d.m58266a(hVar, "containerID", (String) null, 2, (Object) null);
            String a2 = C14434d.m58266a(hVar, "eventName", (String) null, 2, (Object) null);
            XReadableMap a3 = C14434d.m58264a(hVar, "params", (XReadableMap) null, 2, (Object) null);
            SendEventContainerMethodParamModel sendEventContainerMethodParamModel = new SendEventContainerMethodParamModel();
            if (!TextUtils.isEmpty(a)) {
                sendEventContainerMethodParamModel.mo34022a(a);
            }
            if (!TextUtils.isEmpty(a2)) {
                sendEventContainerMethodParamModel.mo34024b(a2);
            }
            sendEventContainerMethodParamModel.mo34021a(a3);
            return sendEventContainerMethodParamModel;
        }
    }

    /* renamed from: a */
    public final String mo34020a() {
        return this.f23855b;
    }

    /* renamed from: b */
    public final String mo34023b() {
        return this.f23856c;
    }

    /* renamed from: c */
    public final XReadableMap mo34025c() {
        return this.f23857d;
    }

    /* renamed from: a */
    public final void mo34021a(XReadableMap hVar) {
        this.f23857d = hVar;
    }

    /* renamed from: b */
    public final void mo34024b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f23856c = str;
    }

    /* renamed from: a */
    public final void mo34022a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f23855b = str;
    }
}
