package com.ss.android.lark.thirdshare.container;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001:\u0005\u0012\u0013\u0014\u0015\u0016B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/thirdshare/container/LarkShareContainerUiConfig;", "", "title", "", "selectedTab", "tabs", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/thirdshare/container/LarkShareContainerUiConfig$Tab;", "uiCallback", "Lcom/ss/android/lark/thirdshare/container/LarkShareContainerUiConfig$UiCallback;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Lcom/ss/android/lark/thirdshare/container/LarkShareContainerUiConfig$UiCallback;)V", "getSelectedTab", "()Ljava/lang/String;", "getTabs", "()Ljava/util/ArrayList;", "getTitle", "getUiCallback", "()Lcom/ss/android/lark/thirdshare/container/LarkShareContainerUiConfig$UiCallback;", "IconShape", "SelectMode", "Tab", "TabType", "UiCallback", "components_third-share_container_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class LarkShareContainerUiConfig {

    /* renamed from: a */
    private final String f137470a;

    /* renamed from: b */
    private final String f137471b;

    /* renamed from: c */
    private final ArrayList<Tab> f137472c;

    /* renamed from: d */
    private final UiCallback f137473d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/thirdshare/container/LarkShareContainerUiConfig$IconShape;", "", "Companion", "components_third-share_container_release"}, mo238835k = 1, mv = {1, 1, 15})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface IconShape {
        public static final Companion Companion = Companion.f137474a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/thirdshare/container/LarkShareContainerUiConfig$IconShape$Companion;", "", "()V", "CIRCLE", "", "ROUND_RECT", "components_third-share_container_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.ss.android.lark.thirdshare.container.LarkShareContainerUiConfig$IconShape$a */
        public static final class Companion {

            /* renamed from: a */
            static final /* synthetic */ Companion f137474a = new Companion();

            private Companion() {
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/thirdshare/container/LarkShareContainerUiConfig$SelectMode;", "", "Companion", "components_third-share_container_release"}, mo238835k = 1, mv = {1, 1, 15})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface SelectMode {
        public static final Companion Companion = Companion.f137475a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/thirdshare/container/LarkShareContainerUiConfig$SelectMode$Companion;", "", "()V", "ALL", "", "SINGLE", "components_third-share_container_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.ss.android.lark.thirdshare.container.LarkShareContainerUiConfig$SelectMode$a */
        public static final class Companion {

            /* renamed from: a */
            static final /* synthetic */ Companion f137475a = new Companion();

            private Companion() {
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/thirdshare/container/LarkShareContainerUiConfig$TabType;", "", "Companion", "components_third-share_container_release"}, mo238835k = 1, mv = {1, 1, 15})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface TabType {
        public static final Companion Companion = Companion.f137476a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/thirdshare/container/LarkShareContainerUiConfig$TabType$Companion;", "", "()V", "INAPP", "", "LINK", "QRCODE", "components_third-share_container_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.ss.android.lark.thirdshare.container.LarkShareContainerUiConfig$TabType$a */
        public static final class Companion {

            /* renamed from: a */
            static final /* synthetic */ Companion f137476a = new Companion();

            private Companion() {
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00038F@BX.¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR \u0010\n\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00038F@BX.¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bR \u0010\f\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00038F@BX.¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/thirdshare/container/LarkShareContainerUiConfig$Tab;", "", "name", "", "(Ljava/lang/String;)V", "<set-?>", "iconShape", "getIconShape", "()Ljava/lang/String;", "getName", "selectMode", "getSelectMode", "tabType", "getTabType", "Companion", "components_third-share_container_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.thirdshare.container.LarkShareContainerUiConfig$a */
    public static final class Tab {

        /* renamed from: d */
        public static final Companion f137477d = new Companion(null);

        /* renamed from: a */
        public String f137478a;

        /* renamed from: b */
        public String f137479b;

        /* renamed from: c */
        public String f137480c;

        /* renamed from: e */
        private final String f137481e;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006J\u0016\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006J\u0016\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/thirdshare/container/LarkShareContainerUiConfig$Tab$Companion;", "", "()V", "inapp", "Lcom/ss/android/lark/thirdshare/container/LarkShareContainerUiConfig$Tab;", "name", "", "selectMode", "link", "iconShape", "qrcode", "components_third-share_container_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.ss.android.lark.thirdshare.container.LarkShareContainerUiConfig$a$a */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final Tab mo189933a(String str, String str2) {
                Intrinsics.checkParameterIsNotNull(str, "name");
                Intrinsics.checkParameterIsNotNull(str2, "selectMode");
                Tab aVar = new Tab(str, null);
                aVar.f137478a = "inapp";
                aVar.f137479b = str2;
                return aVar;
            }

            /* renamed from: b */
            public final Tab mo189934b(String str, String str2) {
                Intrinsics.checkParameterIsNotNull(str, "name");
                Intrinsics.checkParameterIsNotNull(str2, "iconShape");
                Tab aVar = new Tab(str, null);
                aVar.f137478a = "link";
                aVar.f137480c = str2;
                return aVar;
            }

            /* renamed from: c */
            public final Tab mo189935c(String str, String str2) {
                Intrinsics.checkParameterIsNotNull(str, "name");
                Intrinsics.checkParameterIsNotNull(str2, "iconShape");
                Tab aVar = new Tab(str, null);
                aVar.f137478a = "qrcode";
                aVar.f137480c = str2;
                return aVar;
            }
        }

        /* renamed from: d */
        public final String mo189932d() {
            return this.f137481e;
        }

        /* renamed from: a */
        public final String mo189929a() {
            String str = this.f137478a;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tabType");
            }
            return str;
        }

        /* renamed from: b */
        public final String mo189930b() {
            String str = this.f137479b;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("selectMode");
            }
            return str;
        }

        /* renamed from: c */
        public final String mo189931c() {
            String str = this.f137480c;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("iconShape");
            }
            return str;
        }

        private Tab(String str) {
            this.f137481e = str;
        }

        public /* synthetic */ Tab(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/thirdshare/container/LarkShareContainerUiConfig$UiCallback;", "", "onDismiss", "", "onShow", "components_third-share_container_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.thirdshare.container.LarkShareContainerUiConfig$b */
    public interface UiCallback {
        /* renamed from: a */
        void mo146280a();

        /* renamed from: b */
        void mo146281b();
    }

    /* renamed from: a */
    public final String mo189925a() {
        return this.f137470a;
    }

    /* renamed from: b */
    public final String mo189926b() {
        return this.f137471b;
    }

    /* renamed from: c */
    public final ArrayList<Tab> mo189927c() {
        return this.f137472c;
    }

    /* renamed from: d */
    public final UiCallback mo189928d() {
        return this.f137473d;
    }

    public LarkShareContainerUiConfig(String str, String str2, ArrayList<Tab> arrayList, UiCallback bVar) {
        Intrinsics.checkParameterIsNotNull(str, "title");
        Intrinsics.checkParameterIsNotNull(str2, "selectedTab");
        Intrinsics.checkParameterIsNotNull(arrayList, "tabs");
        Intrinsics.checkParameterIsNotNull(bVar, "uiCallback");
        this.f137470a = str;
        this.f137471b = str2;
        this.f137472c = arrayList;
        this.f137473d = bVar;
    }
}
