package com.ss.android.lark.ug.banner;

import com.google.firebase.messaging.Constants;
import com.ss.android.lark.pb.ug_reach.BannerTemplateCategory;
import com.ss.android.lark.pb.ug_reach.BannerTemplateMore;
import com.ss.android.lark.pb.ug_reach.ImageElement;
import com.ss.android.lark.pb.ug_reach.TextElement;
import com.ss.android.lark.ug.banner.ui.template.BannerTemplateView;
import com.ss.android.lark.ug.util.ImageElementParser;
import com.ss.android.lark.ug.util.TextElementParser;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0002J\"\u0010\n\u001a\u00020\u000b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\r2\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0002J$\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J<\u0010\u0015\u001a\u00020\u0016*\u00020\u00162#\u0010\u0017\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0019¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00160\u00182\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\bJ<\u0010\u001f\u001a\u00020\u0016*\u00020\u00162#\u0010\u0017\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0019¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00160\u00182\b\u0010 \u001a\u0004\u0018\u00010!H\b¨\u0006\""}, d2 = {"Lcom/ss/android/lark/ug/banner/TemplateBannerCreator;", "Lcom/ss/android/lark/ug/banner/BannerViewCreator;", "Lcom/ss/android/lark/pb/ug_reach/TemplateBannerMaterial;", "()V", "createBannerTemplateItem", "Lcom/ss/android/lark/ug/banner/ui/template/BannerTemplateView$BannerTemplateItem;", "category", "Lcom/ss/android/lark/pb/ug_reach/BannerTemplateCategory;", "more", "Lcom/ss/android/lark/pb/ug_reach/BannerTemplateMore;", "createListDataSource", "Lcom/ss/android/lark/ug/banner/ui/template/BannerTemplateView$BannerTemplateListDataSource;", "categoryList", "", "createView", "Lcom/ss/android/lark/ug/banner/ui/view/BaseBannerView;", "context", "Landroid/content/Context;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "listener", "Lcom/ss/android/lark/ug/banner/ui/BannerListener;", "image", "Lcom/ss/android/lark/ug/banner/ui/template/BannerTemplateView$Builder;", "method", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "str", "imageElement", "Lcom/ss/android/lark/pb/ug_reach/ImageElement;", "text", "textElement", "Lcom/ss/android/lark/pb/ug_reach/TextElement;", "ug-banner_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.ug.banner.k */
public final class TemplateBannerCreator {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016J\u000f\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0002\u0010\u0006J\u000f\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0002\u0010\u0006J\n\u0010\b\u001a\u0004\u0018\u00010\u0003H\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\u0003H\u0016J\n\u0010\n\u001a\u0004\u0018\u00010\u0003H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/ug/banner/TemplateBannerCreator$createBannerTemplateItem$1", "Lcom/ss/android/lark/ug/banner/ui/template/BannerTemplateView$BannerTemplateItem;", "getBackPic", "", "getBackgroundColor", "", "()Ljava/lang/Integer;", "getBorderColor", "getFrontPic", "getLink", "getTitle", "ug-banner_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.ug.banner.k$a */
    public static final class C57374a extends BannerTemplateView.BannerTemplateItem {

        /* renamed from: a */
        final /* synthetic */ String f141236a;

        /* renamed from: b */
        final /* synthetic */ String f141237b;

        /* renamed from: c */
        final /* synthetic */ String f141238c;

        /* renamed from: d */
        final /* synthetic */ int f141239d;

        /* renamed from: e */
        final /* synthetic */ int f141240e;

        /* renamed from: f */
        final /* synthetic */ String f141241f;

        @Override // com.ss.android.lark.ug.banner.ui.template.TemplateItemAdapter.TemplateItem
        /* renamed from: a */
        public String mo194559a() {
            return this.f141236a;
        }

        @Override // com.ss.android.lark.ug.banner.ui.template.TemplateItemAdapter.TemplateItem
        /* renamed from: b */
        public String mo194560b() {
            return this.f141237b;
        }

        @Override // com.ss.android.lark.ug.banner.ui.template.TemplateItemAdapter.TemplateItem
        /* renamed from: c */
        public String mo194561c() {
            return this.f141238c;
        }

        @Override // com.ss.android.lark.ug.banner.ui.template.TemplateItemAdapter.TemplateItem
        /* renamed from: f */
        public String mo194564f() {
            return this.f141241f;
        }

        @Override // com.ss.android.lark.ug.banner.ui.template.TemplateItemAdapter.TemplateItem
        /* renamed from: d */
        public Integer mo194562d() {
            return Integer.valueOf(this.f141239d);
        }

        @Override // com.ss.android.lark.ug.banner.ui.template.TemplateItemAdapter.TemplateItem
        /* renamed from: e */
        public Integer mo194563e() {
            return Integer.valueOf(this.f141240e);
        }

        C57374a(String str, String str2, String str3, int i, int i2, String str4) {
            this.f141236a = str;
            this.f141237b = str2;
            this.f141238c = str3;
            this.f141239d = i;
            this.f141240e = i2;
            this.f141241f = str4;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016J\u000f\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0002\u0010\u0006J\u000f\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0002\u0010\u0006J\n\u0010\b\u001a\u0004\u0018\u00010\u0003H\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\u0003H\u0016J\n\u0010\n\u001a\u0004\u0018\u00010\u0003H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/ug/banner/TemplateBannerCreator$createBannerTemplateItem$2", "Lcom/ss/android/lark/ug/banner/ui/template/BannerTemplateView$BannerTemplateItem;", "getBackPic", "", "getBackgroundColor", "", "()Ljava/lang/Integer;", "getBorderColor", "getFrontPic", "getLink", "getTitle", "ug-banner_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.ug.banner.k$b */
    public static final class C57375b extends BannerTemplateView.BannerTemplateItem {

        /* renamed from: a */
        final /* synthetic */ String f141242a;

        /* renamed from: b */
        final /* synthetic */ String f141243b;

        /* renamed from: c */
        final /* synthetic */ int f141244c;

        /* renamed from: d */
        final /* synthetic */ int f141245d;

        /* renamed from: e */
        final /* synthetic */ String f141246e;

        @Override // com.ss.android.lark.ug.banner.ui.template.TemplateItemAdapter.TemplateItem
        /* renamed from: b */
        public String mo194560b() {
            return null;
        }

        @Override // com.ss.android.lark.ug.banner.ui.template.TemplateItemAdapter.TemplateItem
        /* renamed from: a */
        public String mo194559a() {
            return this.f141242a;
        }

        @Override // com.ss.android.lark.ug.banner.ui.template.TemplateItemAdapter.TemplateItem
        /* renamed from: c */
        public String mo194561c() {
            return this.f141243b;
        }

        @Override // com.ss.android.lark.ug.banner.ui.template.TemplateItemAdapter.TemplateItem
        /* renamed from: f */
        public String mo194564f() {
            return this.f141246e;
        }

        @Override // com.ss.android.lark.ug.banner.ui.template.TemplateItemAdapter.TemplateItem
        /* renamed from: d */
        public Integer mo194562d() {
            return Integer.valueOf(this.f141244c);
        }

        @Override // com.ss.android.lark.ug.banner.ui.template.TemplateItemAdapter.TemplateItem
        /* renamed from: e */
        public Integer mo194563e() {
            return Integer.valueOf(this.f141245d);
        }

        C57375b(String str, String str2, int i, int i2, String str3) {
            this.f141242a = str;
            this.f141243b = str2;
            this.f141244c = i;
            this.f141245d = i2;
            this.f141246e = str3;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016R!\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"com/ss/android/lark/ug/banner/TemplateBannerCreator$createListDataSource$1", "Lcom/ss/android/lark/ug/banner/ui/template/BannerTemplateView$BannerTemplateListDataSource;", "items", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/ug/banner/ui/template/BannerTemplateView$BannerTemplateItem;", "Lkotlin/collections/ArrayList;", "getItems", "()Ljava/util/ArrayList;", "getItem", "position", "", "size", "ug-banner_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.ug.banner.k$c */
    public static final class C57376c extends BannerTemplateView.BannerTemplateListDataSource {

        /* renamed from: a */
        final /* synthetic */ Function0 f141247a;

        /* renamed from: b */
        private final ArrayList<BannerTemplateView.BannerTemplateItem> f141248b;

        @Override // com.ss.android.lark.ug.banner.ui.template.TemplateItemAdapter.TemplateListDataSource
        /* renamed from: a */
        public int mo194565a() {
            return this.f141248b.size();
        }

        C57376c(Function0 function0) {
            this.f141247a = function0;
            this.f141248b = (ArrayList) function0.invoke();
        }

        /* renamed from: a */
        public BannerTemplateView.BannerTemplateItem mo194567b(int i) {
            if (i < this.f141248b.size()) {
                return this.f141248b.get(i);
            }
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/ug/banner/ui/template/BannerTemplateView$BannerTemplateItem;", "Lkotlin/collections/ArrayList;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.ug.banner.k$d */
    public static final class C57377d extends Lambda implements Function0<ArrayList<BannerTemplateView.BannerTemplateItem>> {
        final /* synthetic */ List $categoryList;
        final /* synthetic */ BannerTemplateMore $more;
        final /* synthetic */ TemplateBannerCreator this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57377d(TemplateBannerCreator kVar, List list, BannerTemplateMore bannerTemplateMore) {
            super(0);
            this.this$0 = kVar;
            this.$categoryList = list;
            this.$more = bannerTemplateMore;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ArrayList<BannerTemplateView.BannerTemplateItem> invoke() {
            ArrayList<BannerTemplateView.BannerTemplateItem> arrayList = new ArrayList<>();
            List list = this.$categoryList;
            if (list != null) {
                for (BannerTemplateCategory bannerTemplateCategory : new ArrayList(list)) {
                    TemplateBannerCreator kVar = this.this$0;
                    Intrinsics.checkExpressionValueIsNotNull(bannerTemplateCategory, "it");
                    arrayList.add(kVar.mo194556a(bannerTemplateCategory));
                }
            }
            BannerTemplateMore bannerTemplateMore = this.$more;
            if (bannerTemplateMore != null) {
                arrayList.add(this.this$0.mo194557a(bannerTemplateMore));
            }
            return arrayList;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x005f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ss.android.lark.ug.banner.ui.template.BannerTemplateView.BannerTemplateItem mo194556a(com.ss.android.lark.pb.ug_reach.BannerTemplateCategory r10) {
        /*
        // Method dump skipped, instructions count: 111
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.ug.banner.TemplateBannerCreator.mo194556a(com.ss.android.lark.pb.ug_reach.BannerTemplateCategory):com.ss.android.lark.ug.banner.ui.template.BannerTemplateView$a");
    }

    /* renamed from: a */
    public final BannerTemplateView.BannerTemplateItem mo194557a(BannerTemplateMore bannerTemplateMore) {
        String str;
        String str2;
        TextElement textElement = bannerTemplateMore.mname;
        String str3 = null;
        if (textElement != null) {
            str = TextElementParser.f141734a.mo195210c(textElement);
        } else {
            str = null;
        }
        ImageElement imageElement = bannerTemplateMore.mcontent_pic;
        if (imageElement != null) {
            ImageElementParser aVar = ImageElementParser.f141733a;
            Intrinsics.checkExpressionValueIsNotNull(imageElement, "it");
            str2 = aVar.mo195206c(imageElement);
        } else {
            str2 = null;
        }
        String str4 = bannerTemplateMore.mbackground_color;
        Intrinsics.checkExpressionValueIsNotNull(str4, "more.mbackground_color");
        int a = C57364c.m222363a(str4);
        String str5 = bannerTemplateMore.mframe_color;
        Intrinsics.checkExpressionValueIsNotNull(str5, "more.mframe_color");
        int a2 = C57364c.m222363a(str5);
        TextElement textElement2 = bannerTemplateMore.mlink;
        if (textElement2 != null) {
            str3 = TextElementParser.f141734a.mo195210c(textElement2);
        }
        return new C57375b(str, str2, a, a2, str3);
    }

    /* renamed from: a */
    private final BannerTemplateView.BannerTemplateListDataSource m222402a(List<BannerTemplateCategory> list, BannerTemplateMore bannerTemplateMore) {
        return new C57376c(new C57377d(this, list, bannerTemplateMore));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00be, code lost:
        if (r6 != 2) goto L_0x00c0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.ss.android.lark.ug.banner.ui.view.BaseBannerView mo194558a(android.content.Context r5, com.ss.android.lark.pb.ug_reach.TemplateBannerMaterial r6, com.ss.android.lark.ug.banner.ui.BannerListener r7) {
        /*
        // Method dump skipped, instructions count: 204
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.ug.banner.TemplateBannerCreator.mo194558a(android.content.Context, com.ss.android.lark.pb.ug_reach.TemplateBannerMaterial, com.ss.android.lark.ug.banner.ui.a):com.ss.android.lark.ug.banner.ui.view.BaseBannerView");
    }
}
