package com.ss.android.lark.banner.entity;

import com.google.firebase.messaging.Constants;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.ss.android.lark.pb.guide.BannerTemplateCategory;
import com.ss.android.lark.pb.guide.BannerTemplateContent;
import com.ss.android.lark.pb.guide.BannerTemplateMore;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 @2\u00020\u0001:\u0005=>?@AB\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\bR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0006\"\u0004\b\u001b\u0010\bR(\u0010\u001c\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u000e¢\u0006\u0016\n\u0002\u0010#\u0012\u0004\b\u001e\u0010\u0002\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010$\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\bR\u001c\u0010'\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0006\"\u0004\b)\u0010\bR\"\u0010*\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010+X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001c\u00101\u001a\u0004\u0018\u000102X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001c\u00107\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u0006\"\u0004\b9\u0010\bR\u001c\u0010:\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u0006\"\u0004\b<\u0010\b¨\u0006B"}, d2 = {"Lcom/ss/android/lark/banner/entity/BannerTemplateContent;", "Lcom/ss/android/lark/banner/entity/BannerContent;", "()V", "backgroundColor", "", "getBackgroundColor", "()Ljava/lang/String;", "setBackgroundColor", "(Ljava/lang/String;)V", "backgroundPic", "getBackgroundPic", "setBackgroundPic", "bannerCloseColor", "getBannerCloseColor", "setBannerCloseColor", "bannerCloseable", "", "getBannerCloseable", "()Ljava/lang/Boolean;", "setBannerCloseable", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "bannerIcon", "getBannerIcon", "setBannerIcon", "frameColor", "getFrameColor", "setFrameColor", "layoutStyle", "", "layoutStyle$annotations", "getLayoutStyle", "()Ljava/lang/Integer;", "setLayoutStyle", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "subTitle", "getSubTitle", "setSubTitle", "subTitleColor", "getSubTitleColor", "setSubTitleColor", "templateCategoryDataList", "", "Lcom/ss/android/lark/banner/entity/BannerTemplateContent$BannerTemplateCategoryData;", "getTemplateCategoryDataList", "()Ljava/util/List;", "setTemplateCategoryDataList", "(Ljava/util/List;)V", "templateMoreData", "Lcom/ss/android/lark/banner/entity/BannerTemplateContent$BannerTemplateMoreData;", "getTemplateMoreData", "()Lcom/ss/android/lark/banner/entity/BannerTemplateContent$BannerTemplateMoreData;", "setTemplateMoreData", "(Lcom/ss/android/lark/banner/entity/BannerTemplateContent$BannerTemplateMoreData;)V", "title", "getTitle", "setTitle", "titleColor", "getTitleColor", "setTitleColor", "BannerTemplateCategoryData", "BannerTemplateItemData", "BannerTemplateMoreData", "Companion", "LayoutStyle", "core_banner_banner_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class BannerTemplateContent implements AbstractC29476b {

    /* renamed from: a */
    public static final Companion f73620a = new Companion(null);

    /* renamed from: b */
    private String f73621b;

    /* renamed from: c */
    private String f73622c;

    /* renamed from: d */
    private String f73623d;

    /* renamed from: e */
    private String f73624e;

    /* renamed from: f */
    private String f73625f;

    /* renamed from: g */
    private Boolean f73626g;

    /* renamed from: h */
    private String f73627h;

    /* renamed from: i */
    private Integer f73628i;

    /* renamed from: j */
    private List<BannerTemplateCategoryData> f73629j;

    /* renamed from: k */
    private BannerTemplateMoreData f73630k;

    /* renamed from: l */
    private String f73631l;

    /* renamed from: m */
    private String f73632m;

    /* renamed from: n */
    private String f73633n;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/banner/entity/BannerTemplateContent$LayoutStyle;", "", "Companion", "core_banner_banner_release"}, mo238835k = 1, mv = {1, 1, 15})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface LayoutStyle {
        public static final Companion Companion = Companion.f73634a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/banner/entity/BannerTemplateContent$LayoutStyle$Companion;", "", "()V", "STYLE1", "", "STYLE2", "STYLE3", GrsBaseInfo.CountryCodeSource.UNKNOWN, "core_banner_banner_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.ss.android.lark.banner.entity.BannerTemplateContent$LayoutStyle$a */
        public static final class Companion {

            /* renamed from: a */
            static final /* synthetic */ Companion f73634a = new Companion();

            private Companion() {
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/banner/entity/BannerTemplateContent$BannerTemplateCategoryData;", "Lcom/ss/android/lark/banner/entity/BannerTemplateContent$BannerTemplateItemData;", "()V", "categoryName", "", "getCategoryName", "()Ljava/lang/String;", "setCategoryName", "(Ljava/lang/String;)V", "dymPic", "getDymPic", "setDymPic", "fontPic", "getFontPic", "setFontPic", "Companion", "core_banner_banner_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.banner.entity.BannerTemplateContent$a */
    public static final class BannerTemplateCategoryData extends BannerTemplateItemData {

        /* renamed from: a */
        public static final Companion f73635a = new Companion(null);

        /* renamed from: b */
        private String f73636b;

        /* renamed from: c */
        private String f73637c;

        /* renamed from: d */
        private String f73638d;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/banner/entity/BannerTemplateContent$BannerTemplateCategoryData$Companion;", "", "()V", "parse", "Lcom/ss/android/lark/banner/entity/BannerTemplateContent$BannerTemplateCategoryData;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/pb/guide/BannerTemplateCategory;", "core_banner_banner_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.ss.android.lark.banner.entity.BannerTemplateContent$a$a */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final BannerTemplateCategoryData mo104419a(BannerTemplateCategory bannerTemplateCategory) {
                boolean z;
                String str = null;
                if (bannerTemplateCategory == null) {
                    return null;
                }
                BannerTemplateCategoryData aVar = new BannerTemplateCategoryData();
                aVar.mo104421d(bannerTemplateCategory.mbackground_color);
                aVar.mo104423e(bannerTemplateCategory.mframe_color);
                aVar.mo104425f(bannerTemplateCategory.mlink);
                aVar.mo104414a(bannerTemplateCategory.mcategory_name);
                aVar.mo104416b(bannerTemplateCategory.mfront_pic);
                List<String> list = bannerTemplateCategory.mdym_pics;
                if (list != null) {
                    if (list.size() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        list = null;
                    }
                    if (list != null) {
                        str = list.get(0);
                    }
                }
                aVar.mo104418c(str);
                return aVar;
            }
        }

        /* renamed from: a */
        public final String mo104413a() {
            return this.f73636b;
        }

        /* renamed from: b */
        public final String mo104415b() {
            return this.f73637c;
        }

        /* renamed from: c */
        public final String mo104417c() {
            return this.f73638d;
        }

        /* renamed from: a */
        public final void mo104414a(String str) {
            this.f73636b = str;
        }

        /* renamed from: b */
        public final void mo104416b(String str) {
            this.f73637c = str;
        }

        /* renamed from: c */
        public final void mo104418c(String str) {
            this.f73638d = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/banner/entity/BannerTemplateContent$BannerTemplateMoreData;", "Lcom/ss/android/lark/banner/entity/BannerTemplateContent$BannerTemplateItemData;", "()V", "contentPic", "", "getContentPic", "()Ljava/lang/String;", "setContentPic", "(Ljava/lang/String;)V", "name", "getName", "setName", "Companion", "core_banner_banner_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.banner.entity.BannerTemplateContent$c */
    public static final class BannerTemplateMoreData extends BannerTemplateItemData {

        /* renamed from: a */
        public static final Companion f73642a = new Companion(null);

        /* renamed from: b */
        private String f73643b;

        /* renamed from: c */
        private String f73644c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/banner/entity/BannerTemplateContent$BannerTemplateMoreData$Companion;", "", "()V", "parse", "Lcom/ss/android/lark/banner/entity/BannerTemplateContent$BannerTemplateMoreData;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/pb/guide/BannerTemplateMore;", "core_banner_banner_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.ss.android.lark.banner.entity.BannerTemplateContent$c$a */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final BannerTemplateMoreData mo104430a(BannerTemplateMore bannerTemplateMore) {
                if (bannerTemplateMore == null) {
                    return null;
                }
                BannerTemplateMoreData cVar = new BannerTemplateMoreData();
                cVar.mo104421d(bannerTemplateMore.mbackground_color);
                cVar.mo104423e(bannerTemplateMore.mframe_color);
                cVar.mo104425f(bannerTemplateMore.mlink);
                cVar.mo104427a(bannerTemplateMore.mname);
                cVar.mo104429b(bannerTemplateMore.mcontent_pic);
                return cVar;
            }
        }

        /* renamed from: a */
        public final String mo104426a() {
            return this.f73643b;
        }

        /* renamed from: b */
        public final String mo104428b() {
            return this.f73644c;
        }

        /* renamed from: a */
        public final void mo104427a(String str) {
            this.f73643b = str;
        }

        /* renamed from: b */
        public final void mo104429b(String str) {
            this.f73644c = str;
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final BannerTemplateContent m108489a(com.ss.android.lark.pb.guide.BannerTemplateContent bannerTemplateContent) {
        return f73620a.mo104431a(bannerTemplateContent);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/banner/entity/BannerTemplateContent$BannerTemplateItemData;", "", "()V", "backgroundColor", "", "getBackgroundColor", "()Ljava/lang/String;", "setBackgroundColor", "(Ljava/lang/String;)V", "frameColor", "getFrameColor", "setFrameColor", "link", "getLink", "setLink", "core_banner_banner_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.banner.entity.BannerTemplateContent$b */
    public static abstract class BannerTemplateItemData {

        /* renamed from: a */
        private String f73639a;

        /* renamed from: b */
        private String f73640b;

        /* renamed from: c */
        private String f73641c;

        /* renamed from: d */
        public final String mo104420d() {
            return this.f73639a;
        }

        /* renamed from: e */
        public final String mo104422e() {
            return this.f73640b;
        }

        /* renamed from: f */
        public final String mo104424f() {
            return this.f73641c;
        }

        /* renamed from: d */
        public final void mo104421d(String str) {
            this.f73639a = str;
        }

        /* renamed from: e */
        public final void mo104423e(String str) {
            this.f73640b = str;
        }

        /* renamed from: f */
        public final void mo104425f(String str) {
            this.f73641c = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/banner/entity/BannerTemplateContent$Companion;", "", "()V", "parse", "Lcom/ss/android/lark/banner/entity/BannerTemplateContent;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/pb/guide/BannerTemplateContent;", "core_banner_banner_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.banner.entity.BannerTemplateContent$d */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final BannerTemplateContent mo104431a(com.ss.android.lark.pb.guide.BannerTemplateContent bannerTemplateContent) {
            Integer num;
            boolean z;
            List<BannerTemplateCategory> list = null;
            if (bannerTemplateContent == null) {
                return null;
            }
            BannerTemplateContent bannerTemplateContent2 = new BannerTemplateContent();
            bannerTemplateContent2.mo104392a(bannerTemplateContent.mbackground_color);
            bannerTemplateContent2.mo104405g(bannerTemplateContent.mframe_color);
            bannerTemplateContent2.mo104395b(bannerTemplateContent.mbanner_icon);
            bannerTemplateContent2.mo104397c(bannerTemplateContent.mbackground_pic);
            bannerTemplateContent2.mo104399d(bannerTemplateContent.mtitle);
            bannerTemplateContent2.mo104401e(bannerTemplateContent.mtitle_color);
            bannerTemplateContent2.mo104390a(bannerTemplateContent.mbanner_closeable);
            bannerTemplateContent2.mo104403f(bannerTemplateContent.mbanner_closeable_color);
            BannerTemplateContent.Layout layout = bannerTemplateContent.mlayout;
            if (layout != null) {
                num = Integer.valueOf(layout.getValue());
            } else {
                num = null;
            }
            bannerTemplateContent2.mo104391a(num);
            List<BannerTemplateCategory> list2 = bannerTemplateContent.mtemplate_categories;
            if (list2 != null) {
                if (list2.size() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    list = list2;
                }
                if (list != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        BannerTemplateCategoryData a = BannerTemplateCategoryData.f73635a.mo104419a(it.next());
                        if (a != null) {
                            arrayList.add(a);
                        }
                    }
                    bannerTemplateContent2.mo104393a(arrayList);
                }
            }
            bannerTemplateContent2.mo104389a(BannerTemplateMoreData.f73642a.mo104430a(bannerTemplateContent.mtemplate_more));
            bannerTemplateContent2.mo104407h(bannerTemplateContent.msub_title);
            bannerTemplateContent2.mo104409i(bannerTemplateContent.msub_title_color);
            return bannerTemplateContent2;
        }
    }

    /* renamed from: a */
    public final String mo104388a() {
        return this.f73621b;
    }

    /* renamed from: b */
    public final String mo104394b() {
        return this.f73623d;
    }

    /* renamed from: c */
    public final String mo104396c() {
        return this.f73624e;
    }

    /* renamed from: d */
    public final String mo104398d() {
        return this.f73625f;
    }

    /* renamed from: e */
    public final Boolean mo104400e() {
        return this.f73626g;
    }

    /* renamed from: f */
    public final String mo104402f() {
        return this.f73627h;
    }

    /* renamed from: g */
    public final Integer mo104404g() {
        return this.f73628i;
    }

    /* renamed from: h */
    public final List<BannerTemplateCategoryData> mo104406h() {
        return this.f73629j;
    }

    /* renamed from: i */
    public final BannerTemplateMoreData mo104408i() {
        return this.f73630k;
    }

    /* renamed from: j */
    public final String mo104410j() {
        return this.f73631l;
    }

    /* renamed from: k */
    public final String mo104411k() {
        return this.f73632m;
    }

    /* renamed from: l */
    public final String mo104412l() {
        return this.f73633n;
    }

    /* renamed from: b */
    public final void mo104395b(String str) {
        this.f73622c = str;
    }

    /* renamed from: c */
    public final void mo104397c(String str) {
        this.f73623d = str;
    }

    /* renamed from: d */
    public final void mo104399d(String str) {
        this.f73624e = str;
    }

    /* renamed from: e */
    public final void mo104401e(String str) {
        this.f73625f = str;
    }

    /* renamed from: f */
    public final void mo104403f(String str) {
        this.f73627h = str;
    }

    /* renamed from: g */
    public final void mo104405g(String str) {
        this.f73631l = str;
    }

    /* renamed from: h */
    public final void mo104407h(String str) {
        this.f73632m = str;
    }

    /* renamed from: i */
    public final void mo104409i(String str) {
        this.f73633n = str;
    }

    /* renamed from: a */
    public final void mo104389a(BannerTemplateMoreData cVar) {
        this.f73630k = cVar;
    }

    /* renamed from: a */
    public final void mo104390a(Boolean bool) {
        this.f73626g = bool;
    }

    /* renamed from: a */
    public final void mo104391a(Integer num) {
        this.f73628i = num;
    }

    /* renamed from: a */
    public final void mo104392a(String str) {
        this.f73621b = str;
    }

    /* renamed from: a */
    public final void mo104393a(List<BannerTemplateCategoryData> list) {
        this.f73629j = list;
    }
}
