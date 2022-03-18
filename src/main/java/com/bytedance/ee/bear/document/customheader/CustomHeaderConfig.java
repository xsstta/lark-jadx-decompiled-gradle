package com.bytedance.ee.bear.document.customheader;

import com.alibaba.fastjson.JSON;
import com.bytedance.ee.util.io.NonProguard;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u001e2\u00020\u0001:\u0004\u001e\u001f !B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u001c\u001a\u00020\nJ\b\u0010\u001d\u001a\u00020\u0011H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\""}, d2 = {"Lcom/bytedance/ee/bear/document/customheader/CustomHeaderConfig;", "Lcom/bytedance/ee/util/io/NonProguard;", "()V", "items", "Lcom/bytedance/ee/bear/document/customheader/CustomHeaderConfig$MenuItems;", "getItems", "()Lcom/bytedance/ee/bear/document/customheader/CustomHeaderConfig$MenuItems;", "setItems", "(Lcom/bytedance/ee/bear/document/customheader/CustomHeaderConfig$MenuItems;)V", "shouldShowDivider", "", "getShouldShowDivider", "()Ljava/lang/Boolean;", "setShouldShowDivider", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "themeColor", "", "getThemeColor", "()Ljava/lang/String;", "setThemeColor", "(Ljava/lang/String;)V", "titleConfig", "Lcom/bytedance/ee/bear/document/customheader/CustomHeaderConfig$TitleConfig;", "getTitleConfig", "()Lcom/bytedance/ee/bear/document/customheader/CustomHeaderConfig$TitleConfig;", "setTitleConfig", "(Lcom/bytedance/ee/bear/document/customheader/CustomHeaderConfig$TitleConfig;)V", "isEmpty", "toString", "Companion", "Menu", "MenuItems", "TitleConfig", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class CustomHeaderConfig implements NonProguard {
    public static final Companion Companion = new Companion(null);
    private MenuItems items;
    private Boolean shouldShowDivider;
    private String themeColor;
    private TitleConfig titleConfig;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0013\u0018\u00002\u00020\u0001:\u0001\u001eB\u0005¢\u0006\u0002\u0010\u0002R$\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R \u0010\u0017\u001a\u00020\u0005X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0018\u0010\u0002\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0014\"\u0004\b\u001d\u0010\u0016¨\u0006\u001f"}, d2 = {"Lcom/bytedance/ee/bear/document/customheader/CustomHeaderConfig$Menu;", "Lcom/bytedance/ee/util/io/NonProguard;", "()V", "customColor", "", "", "getCustomColor", "()[Ljava/lang/String;", "setCustomColor", "([Ljava/lang/String;)V", "[Ljava/lang/String;", "enable", "", "getEnable", "()Ljava/lang/Boolean;", "setEnable", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "id", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "style", "style$annotations", "getStyle", "setStyle", "text", "getText", "setText", "Style", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    public static final class Menu implements NonProguard {
        private String[] customColor;
        private Boolean enable;
        private String id;
        private String style = "icon";
        private String text;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/bytedance/ee/bear/document/customheader/CustomHeaderConfig$Menu$Style;", "", "Companion", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
        @Retention(RetentionPolicy.SOURCE)
        @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
        public @interface Style {
            public static final Companion Companion = Companion.f16103a;

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ee/bear/document/customheader/CustomHeaderConfig$Menu$Style$Companion;", "", "()V", "ICON_STYLE", "", "TEXT_STYLE", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
            /* renamed from: com.bytedance.ee.bear.document.customheader.CustomHeaderConfig$Menu$Style$a */
            public static final class Companion {

                /* renamed from: a */
                static final /* synthetic */ Companion f16103a = new Companion();

                private Companion() {
                }
            }
        }

        public static /* synthetic */ void style$annotations() {
        }

        public final String[] getCustomColor() {
            return this.customColor;
        }

        public final Boolean getEnable() {
            return this.enable;
        }

        public final String getId() {
            return this.id;
        }

        public final String getStyle() {
            return this.style;
        }

        public final String getText() {
            return this.text;
        }

        public final void setCustomColor(String[] strArr) {
            this.customColor = strArr;
        }

        public final void setEnable(Boolean bool) {
            this.enable = bool;
        }

        public final void setId(String str) {
            this.id = str;
        }

        public final void setText(String str) {
            this.text = str;
        }

        public final void setStyle(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.style = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R$\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/bytedance/ee/bear/document/customheader/CustomHeaderConfig$MenuItems;", "Lcom/bytedance/ee/util/io/NonProguard;", "()V", "left", "", "Lcom/bytedance/ee/bear/document/customheader/CustomHeaderConfig$Menu;", "getLeft", "()[Lcom/bytedance/ee/bear/document/customheader/CustomHeaderConfig$Menu;", "setLeft", "([Lcom/bytedance/ee/bear/document/customheader/CustomHeaderConfig$Menu;)V", "[Lcom/bytedance/ee/bear/document/customheader/CustomHeaderConfig$Menu;", "right", "getRight", "setRight", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    public static final class MenuItems implements NonProguard {
        private Menu[] left;
        private Menu[] right;

        public final Menu[] getLeft() {
            return this.left;
        }

        public final Menu[] getRight() {
            return this.right;
        }

        public final void setLeft(Menu[] menuArr) {
            this.left = menuArr;
        }

        public final void setRight(Menu[] menuArr) {
            this.right = menuArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001\u0013B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0010\n\u0002\u0010\b\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\"\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u000b\u0010\u0002\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/bytedance/ee/bear/document/customheader/CustomHeaderConfig$TitleConfig;", "Lcom/bytedance/ee/util/io/NonProguard;", "()V", "isLoading", "", "()Ljava/lang/Boolean;", "setLoading", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "position", "", "position$annotations", "getPosition", "()Ljava/lang/String;", "setPosition", "(Ljava/lang/String;)V", "title", "getTitle", "setTitle", "Position", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    public static final class TitleConfig implements NonProguard {
        private Boolean isLoading;
        private String position;
        private String title;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/bytedance/ee/bear/document/customheader/CustomHeaderConfig$TitleConfig$Position;", "", "Companion", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
        @Retention(RetentionPolicy.SOURCE)
        @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
        public @interface Position {
            public static final Companion Companion = Companion.f16104a;

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ee/bear/document/customheader/CustomHeaderConfig$TitleConfig$Position$Companion;", "", "()V", "CENTER", "", "LEFT", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
            /* renamed from: com.bytedance.ee.bear.document.customheader.CustomHeaderConfig$TitleConfig$Position$a */
            public static final class Companion {

                /* renamed from: a */
                static final /* synthetic */ Companion f16104a = new Companion();

                private Companion() {
                }
            }
        }

        public static /* synthetic */ void position$annotations() {
        }

        public final String getPosition() {
            return this.position;
        }

        public final String getTitle() {
            return this.title;
        }

        public final Boolean isLoading() {
            return this.isLoading;
        }

        public final void setLoading(Boolean bool) {
            this.isLoading = bool;
        }

        public final void setPosition(String str) {
            this.position = str;
        }

        public final void setTitle(String str) {
            this.title = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/document/customheader/CustomHeaderConfig$Companion;", "", "()V", "COLOR_DARK", "", "COLOR_LIGHT", "EXIT_MENU_ID", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.customheader.CustomHeaderConfig$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final MenuItems getItems() {
        return this.items;
    }

    public final Boolean getShouldShowDivider() {
        return this.shouldShowDivider;
    }

    public final String getThemeColor() {
        return this.themeColor;
    }

    public final TitleConfig getTitleConfig() {
        return this.titleConfig;
    }

    public final boolean isEmpty() {
        if (this.titleConfig == null && this.items == null && this.themeColor == null && this.shouldShowDivider == null) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "titleConfig = " + JSON.toJSONString(this.titleConfig) + " items = " + JSON.toJSONString(this.items) + " themeColor = " + this.themeColor + " shouldShowDivider = " + this.shouldShowDivider;
    }

    public final void setItems(MenuItems menuItems) {
        this.items = menuItems;
    }

    public final void setShouldShowDivider(Boolean bool) {
        this.shouldShowDivider = bool;
    }

    public final void setThemeColor(String str) {
        this.themeColor = str;
    }

    public final void setTitleConfig(TitleConfig titleConfig2) {
        this.titleConfig = titleConfig2;
    }
}
