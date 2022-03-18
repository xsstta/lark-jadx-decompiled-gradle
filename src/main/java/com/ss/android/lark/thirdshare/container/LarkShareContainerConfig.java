package com.ss.android.lark.thirdshare.container;

import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.ss.android.lark.thirdshare.base.C55680a;
import com.ss.android.lark.thirdshare.base.export.OnShareCallback;
import com.ss.android.lark.thirdshare.container.p2744b.C55730a;
import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001:\f\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006!"}, d2 = {"Lcom/ss/android/lark/thirdshare/container/LarkShareContainerConfig;", "", "()V", "inappConfig", "Lcom/ss/android/lark/thirdshare/container/LarkShareContainerConfig$InappConfig;", "getInappConfig", "()Lcom/ss/android/lark/thirdshare/container/LarkShareContainerConfig$InappConfig;", "setInappConfig", "(Lcom/ss/android/lark/thirdshare/container/LarkShareContainerConfig$InappConfig;)V", "linkConfigSupplier", "Lcom/ss/android/lark/thirdshare/container/LarkShareContainerConfig$LinkConfigSupplier;", "getLinkConfigSupplier", "()Lcom/ss/android/lark/thirdshare/container/LarkShareContainerConfig$LinkConfigSupplier;", "setLinkConfigSupplier", "(Lcom/ss/android/lark/thirdshare/container/LarkShareContainerConfig$LinkConfigSupplier;)V", "qrcodeConfigSupplier", "Lcom/ss/android/lark/thirdshare/container/LarkShareContainerConfig$QrcodeConfigSupplier;", "getQrcodeConfigSupplier", "()Lcom/ss/android/lark/thirdshare/container/LarkShareContainerConfig$QrcodeConfigSupplier;", "setQrcodeConfigSupplier", "(Lcom/ss/android/lark/thirdshare/container/LarkShareContainerConfig$QrcodeConfigSupplier;)V", "BaseConfig", "ForwardCallback", "Head", "InappConfig", "LinkCallback", "LinkConfig", "LinkConfigSupplier", "QrcodeCallback", "QrcodeConfig", "QrcodeConfigSupplier", "RetryCallback", "Status", "components_third-share_container_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class LarkShareContainerConfig {

    /* renamed from: a */
    private InappConfig f137440a;

    /* renamed from: b */
    private LinkConfigSupplier f137441b;

    /* renamed from: c */
    private QrcodeConfigSupplier f137442c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/thirdshare/container/LarkShareContainerConfig$LinkCallback;", "Lcom/ss/android/lark/thirdshare/base/export/OnShareCallback;", "()V", "onCopied", "", "components_third-share_container_release"}, mo238835k = 1, mv = {1, 1, 15})
    public static abstract class LinkCallback extends OnShareCallback {
        public abstract void onCopied();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/thirdshare/container/LarkShareContainerConfig$QrcodeCallback;", "Lcom/ss/android/lark/thirdshare/base/export/OnShareCallback;", "Lcom/ss/android/lark/thirdshare/base/ThirdShareBaseUtils$SaveImage2AlbumCallback;", "()V", "components_third-share_container_release"}, mo238835k = 1, mv = {1, 1, 15})
    public static abstract class QrcodeCallback extends OnShareCallback implements C55680a.AbstractC55692a {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/thirdshare/container/LarkShareContainerConfig$Status;", "", "Companion", "components_third-share_container_release"}, mo238835k = 1, mv = {1, 1, 15})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface Status {
        public static final Companion Companion = Companion.f137443a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/thirdshare/container/LarkShareContainerConfig$Status$Companion;", "", "()V", "DISABLE", "", "ERROR", "SUCCESS", "components_third-share_container_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.ss.android.lark.thirdshare.container.LarkShareContainerConfig$Status$a */
        public static final class Companion {

            /* renamed from: a */
            static final /* synthetic */ Companion f137443a = new Companion();

            private Companion() {
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/thirdshare/container/LarkShareContainerConfig$ForwardCallback;", "", "onForward", "", "targets", "", "Lcom/ss/android/lark/thirdshare/container/bean/ForwardTarget4Container;", "extraMsg", "", "components_third-share_container_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.thirdshare.container.LarkShareContainerConfig$b */
    public interface ForwardCallback {
        /* renamed from: a */
        void mo146275a(List<? extends C55730a> list, String str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001e\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003@BX.¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/thirdshare/container/LarkShareContainerConfig$InappConfig;", "Lcom/ss/android/lark/thirdshare/container/LarkShareContainerConfig$BaseConfig;", UpdateKey.STATUS, "", "(Ljava/lang/String;)V", "<set-?>", "confirmDialogTitle", "getConfirmDialogTitle", "()Ljava/lang/String;", "forwardCallback", "Lcom/ss/android/lark/thirdshare/container/LarkShareContainerConfig$ForwardCallback;", "getForwardCallback", "()Lcom/ss/android/lark/thirdshare/container/LarkShareContainerConfig$ForwardCallback;", "setForwardCallback", "(Lcom/ss/android/lark/thirdshare/container/LarkShareContainerConfig$ForwardCallback;)V", "Companion", "components_third-share_container_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.thirdshare.container.LarkShareContainerConfig$c */
    public static final class InappConfig extends BaseConfig {

        /* renamed from: c */
        public static final Companion f137445c = new Companion(null);

        /* renamed from: a */
        public String f137446a;

        /* renamed from: b */
        public ForwardCallback f137447b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/thirdshare/container/LarkShareContainerConfig$InappConfig$Companion;", "", "()V", "success", "Lcom/ss/android/lark/thirdshare/container/LarkShareContainerConfig$InappConfig;", "confirmDialogTitle", "", "forwardCallback", "Lcom/ss/android/lark/thirdshare/container/LarkShareContainerConfig$ForwardCallback;", "components_third-share_container_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.ss.android.lark.thirdshare.container.LarkShareContainerConfig$c$a */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final InappConfig mo189890a(String str, ForwardCallback bVar) {
                Intrinsics.checkParameterIsNotNull(str, "confirmDialogTitle");
                Intrinsics.checkParameterIsNotNull(bVar, "forwardCallback");
                InappConfig cVar = new InappConfig("success", null);
                cVar.f137446a = str;
                cVar.mo189887a(bVar);
                return cVar;
            }
        }

        /* renamed from: b */
        public final String mo189888b() {
            String str = this.f137446a;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("confirmDialogTitle");
            }
            return str;
        }

        /* renamed from: c */
        public final ForwardCallback mo189889c() {
            ForwardCallback bVar = this.f137447b;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("forwardCallback");
            }
            return bVar;
        }

        private InappConfig(String str) {
            super(str);
        }

        /* renamed from: a */
        public final void mo189887a(ForwardCallback bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "<set-?>");
            this.f137447b = bVar;
        }

        public /* synthetic */ InappConfig(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\r\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 02\u00020\u0001:\u00010B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001f\u0010-\u001a\u00020.2\u0006\u0010\u0014\u001a\u00020\u00102\b\u0010\u0005\u001a\u0004\u0018\u00010\u001fH\u0000¢\u0006\u0002\b/R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0003X.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u0004R\u001e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010@BX.¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010@BX.¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u0004R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u001f@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u001e\u0010#\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0003@BX.¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\rR\u001e\u0010%\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0003@BX.¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\rR\u001a\u0010'\u001a\u00020\u0003X.¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\r\"\u0004\b)\u0010\u0004R\u001c\u0010*\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\r\"\u0004\b,\u0010\u0004¨\u00061"}, d2 = {"Lcom/ss/android/lark/thirdshare/container/LarkShareContainerConfig$LinkConfig;", "Lcom/ss/android/lark/thirdshare/container/LarkShareContainerConfig$BaseConfig;", UpdateKey.STATUS, "", "(Ljava/lang/String;)V", "callback", "Lcom/ss/android/lark/thirdshare/container/LarkShareContainerConfig$LinkCallback;", "getCallback", "()Lcom/ss/android/lark/thirdshare/container/LarkShareContainerConfig$LinkCallback;", "setCallback", "(Lcom/ss/android/lark/thirdshare/container/LarkShareContainerConfig$LinkCallback;)V", "content", "getContent", "()Ljava/lang/String;", "setContent", "<set-?>", "", "disableMsg", "getDisableMsg", "()Ljava/lang/CharSequence;", "errorMsg", "getErrorMsg", "expiredTip", "getExpiredTip", "setExpiredTip", "head", "Lcom/ss/android/lark/thirdshare/container/LarkShareContainerConfig$Head;", "getHead", "()Lcom/ss/android/lark/thirdshare/container/LarkShareContainerConfig$Head;", "setHead", "(Lcom/ss/android/lark/thirdshare/container/LarkShareContainerConfig$Head;)V", "Lcom/ss/android/lark/thirdshare/container/LarkShareContainerConfig$RetryCallback;", "retryCallback", "getRetryCallback", "()Lcom/ss/android/lark/thirdshare/container/LarkShareContainerConfig$RetryCallback;", "shareCardTitle", "getShareCardTitle", "shareDialogBizId", "getShareDialogBizId", "shareLink", "getShareLink", "setShareLink", "tip", "getTip", "setTip", "toError", "", "toError$components_third_share_container_release", "Companion", "components_third-share_container_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.thirdshare.container.LarkShareContainerConfig$d */
    public static final class LinkConfig extends BaseConfig {

        /* renamed from: h */
        public static final Companion f137448h = new Companion(null);

        /* renamed from: a */
        public String f137449a;

        /* renamed from: b */
        public String f137450b;

        /* renamed from: c */
        public String f137451c;

        /* renamed from: d */
        public String f137452d;

        /* renamed from: e */
        public CharSequence f137453e;

        /* renamed from: f */
        public RetryCallback f137454f;

        /* renamed from: g */
        public CharSequence f137455g;

        /* renamed from: i */
        private Head f137456i;

        /* renamed from: j */
        private String f137457j;

        /* renamed from: k */
        private String f137458k;

        /* renamed from: l */
        private LinkCallback f137459l;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\nJ8\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\r2\b\u0010\t\u001a\u0004\u0018\u00010\u0013¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/thirdshare/container/LarkShareContainerConfig$LinkConfig$Companion;", "", "()V", "disable", "Lcom/ss/android/lark/thirdshare/container/LarkShareContainerConfig$LinkConfig;", "disableMsg", "", "error", "errorMsg", "callback", "Lcom/ss/android/lark/thirdshare/container/LarkShareContainerConfig$RetryCallback;", "success", "shareDialogBizId", "", "shareCardTitle", "head", "Lcom/ss/android/lark/thirdshare/container/LarkShareContainerConfig$Head;", "content", "shareLink", "Lcom/ss/android/lark/thirdshare/container/LarkShareContainerConfig$LinkCallback;", "components_third-share_container_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.ss.android.lark.thirdshare.container.LarkShareContainerConfig$d$a */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final LinkConfig mo189908a(CharSequence charSequence, RetryCallback hVar) {
                Intrinsics.checkParameterIsNotNull(charSequence, "errorMsg");
                LinkConfig dVar = new LinkConfig("error", null);
                dVar.f137453e = charSequence;
                dVar.f137454f = hVar;
                return dVar;
            }

            /* renamed from: a */
            public final LinkConfig mo189909a(String str, String str2, Head head, String str3, String str4, LinkCallback linkCallback) {
                Intrinsics.checkParameterIsNotNull(str, "shareDialogBizId");
                Intrinsics.checkParameterIsNotNull(str2, "shareCardTitle");
                Intrinsics.checkParameterIsNotNull(head, "head");
                Intrinsics.checkParameterIsNotNull(str3, "content");
                Intrinsics.checkParameterIsNotNull(str4, "shareLink");
                LinkConfig dVar = new LinkConfig("success", null);
                dVar.f137449a = str;
                dVar.f137450b = str2;
                dVar.mo189891a(head);
                dVar.mo189893a(str3);
                dVar.mo189895b(str4);
                dVar.mo189892a(linkCallback);
                return dVar;
            }
        }

        /* renamed from: d */
        public final Head mo189898d() {
            return this.f137456i;
        }

        /* renamed from: g */
        public final String mo189902g() {
            return this.f137457j;
        }

        /* renamed from: h */
        public final String mo189903h() {
            return this.f137458k;
        }

        /* renamed from: i */
        public final LinkCallback mo189904i() {
            return this.f137459l;
        }

        /* renamed from: k */
        public final RetryCallback mo189906k() {
            return this.f137454f;
        }

        /* renamed from: b */
        public final String mo189894b() {
            String str = this.f137449a;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("shareDialogBizId");
            }
            return str;
        }

        /* renamed from: c */
        public final String mo189896c() {
            String str = this.f137450b;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("shareCardTitle");
            }
            return str;
        }

        /* renamed from: e */
        public final String mo189900e() {
            String str = this.f137451c;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("content");
            }
            return str;
        }

        /* renamed from: f */
        public final String mo189901f() {
            String str = this.f137452d;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("shareLink");
            }
            return str;
        }

        /* renamed from: j */
        public final CharSequence mo189905j() {
            CharSequence charSequence = this.f137453e;
            if (charSequence == null) {
                Intrinsics.throwUninitializedPropertyAccessException("errorMsg");
            }
            return charSequence;
        }

        /* renamed from: l */
        public final CharSequence mo189907l() {
            CharSequence charSequence = this.f137455g;
            if (charSequence == null) {
                Intrinsics.throwUninitializedPropertyAccessException("disableMsg");
            }
            return charSequence;
        }

        private LinkConfig(String str) {
            super(str);
        }

        /* renamed from: a */
        public final void mo189891a(Head head) {
            this.f137456i = head;
        }

        /* renamed from: c */
        public final void mo189897c(String str) {
            this.f137457j = str;
        }

        /* renamed from: a */
        public final void mo189892a(LinkCallback linkCallback) {
            this.f137459l = linkCallback;
        }

        /* renamed from: b */
        public final void mo189895b(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.f137452d = str;
        }

        /* renamed from: d */
        public final void mo189899d(String str) {
            this.f137458k = str;
        }

        /* renamed from: a */
        public final void mo189893a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.f137451c = str;
        }

        public /* synthetic */ LinkConfig(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/thirdshare/container/LarkShareContainerConfig$LinkConfigSupplier;", "", "getLinkConfig", "Lcom/ss/android/lark/thirdshare/container/LarkShareContainerConfig$LinkConfig;", "components_third-share_container_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.thirdshare.container.LarkShareContainerConfig$e */
    public interface LinkConfigSupplier {
        /* renamed from: a */
        LinkConfig mo146276a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 *2\u00020\u0001:\u0001*B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001f\u0010'\u001a\u00020(2\u0006\u0010\u0010\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u001eH\u0000¢\u0006\u0002\b)R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@BX.¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@BX.¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0004R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003@BX.¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\"\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010\u000b\u001a\u0004\u0018\u00010\u001e@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001e\u0010\"\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003@BX.¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0014R\u001c\u0010$\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0014\"\u0004\b&\u0010\u0004¨\u0006+"}, d2 = {"Lcom/ss/android/lark/thirdshare/container/LarkShareContainerConfig$QrcodeConfig;", "Lcom/ss/android/lark/thirdshare/container/LarkShareContainerConfig$BaseConfig;", UpdateKey.STATUS, "", "(Ljava/lang/String;)V", "callback", "Lcom/ss/android/lark/thirdshare/container/LarkShareContainerConfig$QrcodeCallback;", "getCallback", "()Lcom/ss/android/lark/thirdshare/container/LarkShareContainerConfig$QrcodeCallback;", "setCallback", "(Lcom/ss/android/lark/thirdshare/container/LarkShareContainerConfig$QrcodeCallback;)V", "<set-?>", "", "disableMsg", "getDisableMsg", "()Ljava/lang/CharSequence;", "errorMsg", "getErrorMsg", "expiredTip", "getExpiredTip", "()Ljava/lang/String;", "setExpiredTip", "head", "Lcom/ss/android/lark/thirdshare/container/LarkShareContainerConfig$Head;", "getHead", "()Lcom/ss/android/lark/thirdshare/container/LarkShareContainerConfig$Head;", "setHead", "(Lcom/ss/android/lark/thirdshare/container/LarkShareContainerConfig$Head;)V", "link", "getLink", "Lcom/ss/android/lark/thirdshare/container/LarkShareContainerConfig$RetryCallback;", "retryCallback", "getRetryCallback", "()Lcom/ss/android/lark/thirdshare/container/LarkShareContainerConfig$RetryCallback;", "shareDialogBizId", "getShareDialogBizId", "tip", "getTip", "setTip", "toError", "", "toError$components_third_share_container_release", "Companion", "components_third-share_container_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.thirdshare.container.LarkShareContainerConfig$f */
    public static final class QrcodeConfig extends BaseConfig {

        /* renamed from: f */
        public static final Companion f137460f = new Companion(null);

        /* renamed from: a */
        public String f137461a;

        /* renamed from: b */
        public String f137462b;

        /* renamed from: c */
        public CharSequence f137463c;

        /* renamed from: d */
        public RetryCallback f137464d;

        /* renamed from: e */
        public CharSequence f137465e;

        /* renamed from: g */
        private Head f137466g;

        /* renamed from: h */
        private String f137467h;

        /* renamed from: i */
        private String f137468i;

        /* renamed from: j */
        private QrcodeCallback f137469j;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\nJ(\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\r2\b\u0010\t\u001a\u0004\u0018\u00010\u0011¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/thirdshare/container/LarkShareContainerConfig$QrcodeConfig$Companion;", "", "()V", "disable", "Lcom/ss/android/lark/thirdshare/container/LarkShareContainerConfig$QrcodeConfig;", "disableMsg", "", "error", "errorMsg", "callback", "Lcom/ss/android/lark/thirdshare/container/LarkShareContainerConfig$RetryCallback;", "success", "shareDialogBizId", "", "head", "Lcom/ss/android/lark/thirdshare/container/LarkShareContainerConfig$Head;", "link", "Lcom/ss/android/lark/thirdshare/container/LarkShareContainerConfig$QrcodeCallback;", "components_third-share_container_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.ss.android.lark.thirdshare.container.LarkShareContainerConfig$f$a */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final QrcodeConfig mo189923a(CharSequence charSequence, RetryCallback hVar) {
                Intrinsics.checkParameterIsNotNull(charSequence, "errorMsg");
                QrcodeConfig fVar = new QrcodeConfig("error", null);
                fVar.f137463c = charSequence;
                fVar.f137464d = hVar;
                return fVar;
            }

            /* renamed from: a */
            public final QrcodeConfig mo189924a(String str, Head head, String str2, QrcodeCallback qrcodeCallback) {
                Intrinsics.checkParameterIsNotNull(str, "shareDialogBizId");
                Intrinsics.checkParameterIsNotNull(head, "head");
                Intrinsics.checkParameterIsNotNull(str2, "link");
                QrcodeConfig fVar = new QrcodeConfig("success", null);
                fVar.f137461a = str;
                fVar.mo189910a(head);
                fVar.f137462b = str2;
                fVar.mo189911a(qrcodeCallback);
                return fVar;
            }
        }

        /* renamed from: c */
        public final Head mo189915c() {
            return this.f137466g;
        }

        /* renamed from: e */
        public final String mo189917e() {
            return this.f137467h;
        }

        /* renamed from: f */
        public final String mo189918f() {
            return this.f137468i;
        }

        /* renamed from: g */
        public final QrcodeCallback mo189919g() {
            return this.f137469j;
        }

        /* renamed from: i */
        public final RetryCallback mo189921i() {
            return this.f137464d;
        }

        /* renamed from: b */
        public final String mo189913b() {
            String str = this.f137461a;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("shareDialogBizId");
            }
            return str;
        }

        /* renamed from: d */
        public final String mo189916d() {
            String str = this.f137462b;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("link");
            }
            return str;
        }

        /* renamed from: h */
        public final CharSequence mo189920h() {
            CharSequence charSequence = this.f137463c;
            if (charSequence == null) {
                Intrinsics.throwUninitializedPropertyAccessException("errorMsg");
            }
            return charSequence;
        }

        /* renamed from: j */
        public final CharSequence mo189922j() {
            CharSequence charSequence = this.f137465e;
            if (charSequence == null) {
                Intrinsics.throwUninitializedPropertyAccessException("disableMsg");
            }
            return charSequence;
        }

        private QrcodeConfig(String str) {
            super(str);
        }

        /* renamed from: a */
        public final void mo189910a(Head head) {
            this.f137466g = head;
        }

        /* renamed from: b */
        public final void mo189914b(String str) {
            this.f137468i = str;
        }

        /* renamed from: a */
        public final void mo189911a(QrcodeCallback qrcodeCallback) {
            this.f137469j = qrcodeCallback;
        }

        /* renamed from: a */
        public final void mo189912a(String str) {
            this.f137467h = str;
        }

        public /* synthetic */ QrcodeConfig(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/thirdshare/container/LarkShareContainerConfig$QrcodeConfigSupplier;", "", "getQrcodeConfig", "Lcom/ss/android/lark/thirdshare/container/LarkShareContainerConfig$QrcodeConfig;", "components_third-share_container_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.thirdshare.container.LarkShareContainerConfig$g */
    public interface QrcodeConfigSupplier {
        /* renamed from: a */
        QrcodeConfig mo146278a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/thirdshare/container/LarkShareContainerConfig$RetryCallback;", "", "onRetry", "", "components_third-share_container_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.thirdshare.container.LarkShareContainerConfig$h */
    public interface RetryCallback {
        /* renamed from: a */
        void mo146277a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\u00020\u0001B'\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007B\u001f\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u000b\"\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/thirdshare/container/LarkShareContainerConfig$Head;", "Ljava/io/Serializable;", "avatar", "", "avatarEntityId", "name", "desc", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "avatarUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAvatar", "()Ljava/lang/String;", "getAvatarEntityId", "setAvatarEntityId", "(Ljava/lang/String;)V", "getDesc", "getName", "components_third-share_container_release"}, mo238835k = 1, mv = {1, 1, 15})
    public static final class Head implements Serializable {
        private final String avatar;
        private String avatarEntityId;
        private final String desc;
        private final String name;

        public final String getAvatar() {
            return this.avatar;
        }

        public final String getAvatarEntityId() {
            return this.avatarEntityId;
        }

        public final String getDesc() {
            return this.desc;
        }

        public final String getName() {
            return this.name;
        }

        public final void setAvatarEntityId(String str) {
            this.avatarEntityId = str;
        }

        public Head(String str, String str2, String str3) {
            Intrinsics.checkParameterIsNotNull(str, "avatarUrl");
            Intrinsics.checkParameterIsNotNull(str2, "name");
            Intrinsics.checkParameterIsNotNull(str3, "desc");
            this.avatar = str;
            this.name = str2;
            this.desc = str3;
        }

        public Head(String str, String str2, String str3, String str4) {
            Intrinsics.checkParameterIsNotNull(str, "avatar");
            Intrinsics.checkParameterIsNotNull(str2, "avatarEntityId");
            Intrinsics.checkParameterIsNotNull(str3, "name");
            Intrinsics.checkParameterIsNotNull(str4, "desc");
            this.avatar = str;
            this.avatarEntityId = str2;
            this.name = str3;
            this.desc = str4;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/thirdshare/container/LarkShareContainerConfig$BaseConfig;", "", UpdateKey.STATUS, "", "(Ljava/lang/String;)V", "getStatus", "()Ljava/lang/String;", "setStatus", "components_third-share_container_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.thirdshare.container.LarkShareContainerConfig$a */
    public static class BaseConfig {

        /* renamed from: a */
        private String f137444a;

        /* renamed from: a */
        public final String mo189886a() {
            return this.f137444a;
        }

        public BaseConfig(String str) {
            Intrinsics.checkParameterIsNotNull(str, UpdateKey.STATUS);
            this.f137444a = str;
        }
    }

    /* renamed from: a */
    public final InappConfig mo189875a() {
        return this.f137440a;
    }

    /* renamed from: b */
    public final LinkConfigSupplier mo189879b() {
        return this.f137441b;
    }

    /* renamed from: c */
    public final QrcodeConfigSupplier mo189880c() {
        return this.f137442c;
    }

    /* renamed from: a */
    public final void mo189876a(InappConfig cVar) {
        this.f137440a = cVar;
    }

    /* renamed from: a */
    public final void mo189877a(LinkConfigSupplier eVar) {
        this.f137441b = eVar;
    }

    /* renamed from: a */
    public final void mo189878a(QrcodeConfigSupplier gVar) {
        this.f137442c = gVar;
    }
}
