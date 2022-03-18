package com.bytedance.ee.bear.wikiv2.home;

import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1144ai;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.ee.bear.contract.route.parcelable.WikiDocument;
import com.bytedance.ee.bear.list.dto.Document;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0002J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nR\u001d\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/home/WikiHomeViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "bannerList", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/bytedance/ee/bear/list/dto/Document;", "getBannerList", "()Landroidx/lifecycle/MutableLiveData;", "getSpaceList", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/contract/route/parcelable/WikiDocument;", "Companion", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.wikiv2.home.d */
public final class WikiHomeViewModel extends AbstractC1142af {
    public static final Companion Companion = new Companion(null);
    private final C1177w<List<Document>> bannerList = new C1177w<>();

    @JvmStatic
    public static final WikiHomeViewModel get(ViewModelStoreOwner viewModelStoreOwner) {
        return Companion.mo46877a(viewModelStoreOwner);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/home/WikiHomeViewModel$Companion;", "", "()V", "get", "Lcom/bytedance/ee/bear/wikiv2/home/WikiHomeViewModel;", "context", "Landroidx/lifecycle/ViewModelStoreOwner;", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.home.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final WikiHomeViewModel mo46877a(ViewModelStoreOwner viewModelStoreOwner) {
            Intrinsics.checkParameterIsNotNull(viewModelStoreOwner, "context");
            AbstractC1142af a = new C1144ai(viewModelStoreOwner).mo6005a(WikiHomeViewModel.class);
            Intrinsics.checkExpressionValueIsNotNull(a, "ViewModelProvider(contex…omeViewModel::class.java)");
            return (WikiHomeViewModel) a;
        }
    }

    public final C1177w<List<Document>> getBannerList() {
        return this.bannerList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: java.util.ArrayList<com.bytedance.ee.bear.contract.route.parcelable.WikiDocument> */
    /* JADX WARN: Multi-variable type inference failed */
    public final ArrayList<WikiDocument> getSpaceList() {
        ArrayList<WikiDocument> arrayList = new ArrayList<>();
        List<Document> b = this.bannerList.mo5927b();
        if (b != null) {
            for (Document document : b) {
                if (document instanceof WikiDocument) {
                    arrayList.add(document);
                }
            }
        }
        return arrayList;
    }
}
