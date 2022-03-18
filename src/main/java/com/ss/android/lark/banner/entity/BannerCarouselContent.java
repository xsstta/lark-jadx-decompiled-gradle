package com.ss.android.lark.banner.entity;

import com.google.firebase.messaging.Constants;
import com.ss.android.lark.pb.guide.BannerNormalContent;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/banner/entity/BannerCarouselContent;", "Lcom/ss/android/lark/banner/entity/BannerContent;", "list", "", "Lcom/ss/android/lark/banner/entity/BannerNormalContent;", "(Ljava/util/List;)V", "getList", "()Ljava/util/List;", "Companion", "core_banner_banner_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.banner.entity.a */
public final class BannerCarouselContent implements AbstractC29476b {

    /* renamed from: a */
    public static final Companion f73645a = new Companion(null);

    /* renamed from: b */
    private final List<BannerNormalContent> f73646b;

    @JvmStatic
    /* renamed from: a */
    public static final BannerCarouselContent m108534a(List<BannerNormalContent> list) {
        return f73645a.mo104433a(list);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0007¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/banner/entity/BannerCarouselContent$Companion;", "", "()V", "parse", "Lcom/ss/android/lark/banner/entity/BannerCarouselContent;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "Lcom/ss/android/lark/pb/guide/BannerNormalContent;", "core_banner_banner_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.banner.entity.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final BannerCarouselContent mo104433a(List<BannerNormalContent> list) {
            if (list == null || list.isEmpty()) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                BannerNormalContent a = BannerNormalContent.m108472a(list.get(i));
                if (a != null) {
                    arrayList.add(a);
                }
            }
            return new BannerCarouselContent(arrayList);
        }
    }

    /* renamed from: a */
    public final List<BannerNormalContent> mo104432a() {
        return this.f73646b;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.ss.android.lark.banner.entity.BannerNormalContent> */
    /* JADX WARN: Multi-variable type inference failed */
    public BannerCarouselContent(List<? extends BannerNormalContent> list) {
        Intrinsics.checkParameterIsNotNull(list, "list");
        this.f73646b = list;
    }
}
