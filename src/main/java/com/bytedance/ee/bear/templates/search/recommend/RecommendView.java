package com.bytedance.ee.bear.templates.search.recommend;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.templates.TemplateReport;
import com.bytedance.ee.bear.templates.search.recommend.RecommendResult;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001a\u0010\r\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000e0\u0010R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/bytedance/ee/bear/templates/search/recommend/RecommendView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "adapter", "Lcom/bytedance/ee/bear/templates/search/recommend/RecommendAdapter;", "serviceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "setClickItemListener", "", "listener", "Lkotlin/Function1;", "", "Companion", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class RecommendView extends FrameLayout {

    /* renamed from: b */
    public static final Companion f31385b = new Companion(null);

    /* renamed from: a */
    public final RecommendAdapter f31386a;

    /* renamed from: c */
    private final C10917c f31387c;

    public RecommendView(Context context) {
        this(context, null, 0, 6, null);
    }

    public RecommendView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/templates/search/recommend/RecommendView$Companion;", "", "()V", "TAG", "", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.search.recommend.RecommendView$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final void setClickItemListener(Function1<? super String, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "listener");
        this.f31386a.mo44697a(function1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecommendView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f31387c = new C10917c(new C10929e());
        RecommendAdapter aVar = new RecommendAdapter();
        this.f31386a = aVar;
        RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(context).inflate(R.layout.template_search_recommend, (ViewGroup) this, true).findViewById(R.id.template_search_recommend_rv);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rv");
        recyclerView.setLayoutManager(new GridLayoutManager(context, 2));
        recyclerView.setAdapter(aVar);
        NetService.AbstractC5075d a = ((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null)).mo20117a(C116541.f31388a);
        NetService.C5077f fVar = new NetService.C5077f("/space/api/platform/template/search_key_recommend/");
        fVar.mo20145a("search_scene_id", "1");
        a.mo20141a(fVar).mo238001b(new Consumer<RecommendResult>(this) {
            /* class com.bytedance.ee.bear.templates.search.recommend.RecommendView.C116552 */

            /* renamed from: a */
            final /* synthetic */ RecommendView f31389a;

            {
                this.f31389a = r1;
            }

            /* renamed from: a */
            public final void accept(RecommendResult recommendResult) {
                Integer num;
                List<String> list;
                RecommendResult.RecommendData recommendData = (RecommendResult.RecommendData) recommendResult.data;
                if (recommendData == null || (list = recommendData.recommend_keys) == null) {
                    num = null;
                } else {
                    num = Integer.valueOf(list.size());
                }
                C13479a.m54764b("RecommendView", String.valueOf(num));
                if (this.f31389a.isAttachedToWindow()) {
                    this.f31389a.setVisibility(0);
                    C13479a.m54764b("RecommendView", "setData");
                    RecommendAdapter aVar = this.f31389a.f31386a;
                    ArrayList arrayList = ((RecommendResult.RecommendData) recommendResult.data).recommend_keys;
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    aVar.mo44696a(arrayList);
                    this.f31389a.f31386a.notifyDataSetChanged();
                    TemplateReport.m47953a(TemplateReport.f31011b, "display_searchrecommendwords", null, 2, null);
                }
            }
        }, new Consumer<Throwable>(this) {
            /* class com.bytedance.ee.bear.templates.search.recommend.RecommendView.C116563 */

            /* renamed from: a */
            final /* synthetic */ RecommendView f31390a;

            {
                this.f31390a = r1;
            }

            /* renamed from: a */
            public final void accept(Throwable th) {
                this.f31390a.setVisibility(8);
                C13479a.m54761a("RecommendView", th);
            }
        });
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RecommendView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
