package com.bytedance.ee.bear.lynx.impl.xbridge.method.network;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ee/bear/lynx/impl/xbridge/method/network/NetworkConstant;", "", "RequestContentType", "RequestErrorCode", "RequestErrorMsg", "RequestMethod", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public interface NetworkConstant {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/bytedance/ee/bear/lynx/impl/xbridge/method/network/NetworkConstant$RequestContentType;", "", "Companion", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface RequestContentType {
        public static final Companion Companion = Companion.f23827a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ee/bear/lynx/impl/xbridge/method/network/NetworkConstant$RequestContentType$Companion;", "", "()V", "FORM", "", "JSON", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.lynx.impl.xbridge.method.network.NetworkConstant$RequestContentType$a */
        public static final class Companion {

            /* renamed from: a */
            static final /* synthetic */ Companion f23827a = new Companion();

            private Companion() {
            }
        }
    }

    @Target({ElementType.PARAMETER})
    @kotlin.annotation.Target(allowedTargets = {AnnotationTarget.VALUE_PARAMETER})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/bytedance/ee/bear/lynx/impl/xbridge/method/network/NetworkConstant$RequestErrorCode;", "", "Companion", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    public @interface RequestErrorCode {
        public static final Companion Companion = Companion.f23828a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/bytedance/ee/bear/lynx/impl/xbridge/method/network/NetworkConstant$RequestErrorCode$Companion;", "", "()V", "HTTP_ERROR", "", "INNER_ERROR", "NET_ERROR", "PARAM_ERROR", "SERVER_ERROR", "SUCCESS", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.lynx.impl.xbridge.method.network.NetworkConstant$RequestErrorCode$a */
        public static final class Companion {

            /* renamed from: a */
            static final /* synthetic */ Companion f23828a = new Companion();

            private Companion() {
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/bytedance/ee/bear/lynx/impl/xbridge/method/network/NetworkConstant$RequestErrorMsg;", "", "Companion", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface RequestErrorMsg {
        public static final Companion Companion = Companion.f23829a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/lynx/impl/xbridge/method/network/NetworkConstant$RequestErrorMsg$Companion;", "", "()V", "INNER_ERROR_MSG", "", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.lynx.impl.xbridge.method.network.NetworkConstant$RequestErrorMsg$a */
        public static final class Companion {

            /* renamed from: a */
            static final /* synthetic */ Companion f23829a = new Companion();

            private Companion() {
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/bytedance/ee/bear/lynx/impl/xbridge/method/network/NetworkConstant$RequestMethod;", "", "Companion", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface RequestMethod {
        public static final Companion Companion = Companion.f23830a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ee/bear/lynx/impl/xbridge/method/network/NetworkConstant$RequestMethod$Companion;", "", "()V", "GET", "", "POST", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.lynx.impl.xbridge.method.network.NetworkConstant$RequestMethod$a */
        public static final class Companion {

            /* renamed from: a */
            static final /* synthetic */ Companion f23830a = new Companion();

            private Companion() {
            }
        }
    }
}
