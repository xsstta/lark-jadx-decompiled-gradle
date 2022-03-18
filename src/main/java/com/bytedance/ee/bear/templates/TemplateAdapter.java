package com.bytedance.ee.bear.templates;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.C1374g;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.util.p718t.C13743h;
import com.huawei.hms.location.LocationRequest;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0002)*B3\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\u001c\u0010\u0016\u001a\u00020\u00112\b\u0010\u0017\u001a\u0004\u0018\u00010\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004H\u0016J\u001c\u0010\u0019\u001a\u00020\u00112\b\u0010\u0017\u001a\u0004\u0018\u00010\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\u001a\u001a\u00020\u000eH\u0016J\u0010\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u000eH\u0016J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u000eH\u0016J\u0018\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u000eH\u0016J\u000e\u0010$\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010%\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\u0011J\u0014\u0010'\u001a\u00020\u001e2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00040\u0015R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/bytedance/ee/bear/templates/TemplateAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/bytedance/ee/bear/templates/ITemplateViewHolder;", "Lcom/bytedance/ee/util/ui/RecyclerItemsDiff$ItemComparable;", "Lcom/bytedance/ee/bear/templates/TemplateV4;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "layoutType", "Lcom/bytedance/ee/bear/templates/LayoutType;", "serviceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "form", "", ShareHitPoint.f121869d, "", "(Landroidx/lifecycle/LifecycleOwner;Lcom/bytedance/ee/bear/templates/LayoutType;Lcom/bytedance/ee/bear/service/ServiceContext;Ljava/lang/String;I)V", "isConnected", "", "templateClickListener", "Lcom/bytedance/ee/bear/templates/TemplateAdapter$TemplateClickListener;", "templateList", "", "areContentsTheSame", "oldItem", "newItem", "areItemsTheSame", "getItemCount", "getItemViewType", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setOnItemClickListener", "updateEnable", "enable", "updateTemplate", "templates", "Companion", "TemplateClickListener", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.templates.c */
public final class TemplateAdapter extends RecyclerView.Adapter<ITemplateViewHolder> implements C13743h.AbstractC13745b<TemplateV4> {

    /* renamed from: d */
    public static final Companion f30786d = new Companion(null);

    /* renamed from: a */
    public List<TemplateV4> f30787a;

    /* renamed from: b */
    public TemplateClickListener f30788b;

    /* renamed from: c */
    public boolean f30789c;

    /* renamed from: e */
    private final LifecycleOwner f30790e;

    /* renamed from: f */
    private final LayoutType f30791f;

    /* renamed from: g */
    private final C10917c f30792g;

    /* renamed from: h */
    private final String f30793h;

    /* renamed from: i */
    private final int f30794i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016¨\u0006\n"}, d2 = {"Lcom/bytedance/ee/bear/templates/TemplateAdapter$TemplateClickListener;", "", "onTemplateClicked", "", "position", "", "template", "Lcom/bytedance/ee/bear/templates/TemplateV4;", "onTemplateDelete", "onTemplateGroupAllDelete", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.c$b */
    public interface TemplateClickListener {

        @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.templates.c$b$a */
        public static final class C11450a {
            /* renamed from: a */
            public static void m47658a(TemplateClickListener bVar) {
            }

            /* renamed from: a */
            public static void m47659a(TemplateClickListener bVar, TemplateV4 templateV4) {
                Intrinsics.checkParameterIsNotNull(templateV4, "template");
            }
        }

        /* renamed from: a */
        void mo43996a();

        /* renamed from: a */
        void mo43997a(int i, TemplateV4 templateV4);

        /* renamed from: a */
        void mo43998a(TemplateV4 templateV4);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/bytedance/ee/bear/templates/TemplateAdapter$Companion;", "", "()V", "BLANK_ITEM_TYPE", "", "CENTER_BUSINESS_TYPE", "CENTER_CUSTOM_TYPE", "CENTER_SYSTEM_TYPE", "SEARCH_BUSINESS_TYPE", "SEARCH_CUSTOM_TYPE", "SEARCH_SYSTEM_TYPE", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f30787a.size();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.c$c */
    public static final class C11451c extends Lambda implements Function0<Unit> {
        final /* synthetic */ TemplateV4 $template;
        final /* synthetic */ TemplateAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11451c(TemplateAdapter cVar, TemplateV4 templateV4) {
            super(0);
            this.this$0 = cVar;
            this.$template = templateV4;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            boolean z;
            TemplateClickListener bVar;
            Integer valueOf = Integer.valueOf(this.this$0.f30787a.indexOf(this.$template));
            if (valueOf.intValue() >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                valueOf = null;
            }
            if (valueOf != null) {
                int intValue = valueOf.intValue();
                this.this$0.f30787a.remove(intValue);
                this.this$0.notifyItemRemoved(intValue);
                if (this.this$0.f30787a.size() == 0 && (bVar = this.this$0.f30788b) != null) {
                    bVar.mo43996a();
                }
                TemplateClickListener bVar2 = this.this$0.f30788b;
                if (bVar2 != null) {
                    bVar2.mo43998a(this.$template);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo43990a(TemplateClickListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "templateClickListener");
        this.f30788b = bVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/templates/TemplateAdapter$onBindViewHolder$2", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.c$d */
    public static final class C11452d extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ TemplateAdapter f30796a;

        /* renamed from: b */
        final /* synthetic */ int f30797b;

        /* renamed from: c */
        final /* synthetic */ TemplateV4 f30798c;

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            TemplateClickListener bVar = this.f30796a.f30788b;
            if (bVar != null) {
                bVar.mo43997a(this.f30797b, this.f30798c);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11452d(TemplateAdapter cVar, int i, TemplateV4 templateV4, int i2) {
            super(i2);
            this.f30796a = cVar;
            this.f30797b = i;
            this.f30798c = templateV4;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (this.f30787a.get(i).isBlankDocumentTemplate()) {
            return 1;
        }
        return super.getItemViewType(i);
    }

    /* renamed from: a */
    public final void mo43991a(List<TemplateV4> list) {
        Intrinsics.checkParameterIsNotNull(list, "templates");
        C1374g.C1377b a = C1374g.m6298a(new C13743h(this.f30787a, list, this), true);
        Intrinsics.checkExpressionValueIsNotNull(a, "DiffUtil.calculateDiff(diff, true)");
        this.f30787a = list;
        mo43992a(this.f30789c);
        a.mo7412a(this);
    }

    /* renamed from: a */
    public final void mo43992a(boolean z) {
        if (!this.f30787a.isEmpty()) {
            for (TemplateV4 templateV4 : this.f30787a) {
                if (templateV4.getEnable() != z) {
                    templateV4.setEnable(z);
                }
            }
            notifyDataSetChanged();
        }
    }

    /* renamed from: b */
    public boolean mo34853b(TemplateV4 templateV4, TemplateV4 templateV42) {
        return Objects.equals(templateV4, templateV42);
    }

    /* renamed from: a */
    public boolean mo34851a(TemplateV4 templateV4, TemplateV4 templateV42) {
        return Objects.equals(templateV4, templateV42);
    }

    /* renamed from: a */
    public ITemplateViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        if (i == 1) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(this.f30791f.getLayBlankId(), viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "root");
            return new TemplateViewBlankHolder(inflate, this.f30791f, this.f30792g);
        }
        View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(this.f30791f.getLayId(), viewGroup, false);
        if (this.f30791f.isV5()) {
            Intrinsics.checkExpressionValueIsNotNull(inflate2, "root");
            return new TemplateViewHolder2(inflate2, this.f30791f, this.f30792g, this.f30794i);
        }
        Intrinsics.checkExpressionValueIsNotNull(inflate2, "root");
        return new TemplateViewHolder(inflate2, this.f30791f, this.f30792g, this.f30794i);
    }

    /* renamed from: a */
    public void onBindViewHolder(ITemplateViewHolder bVar, int i) {
        Intrinsics.checkParameterIsNotNull(bVar, "holder");
        TemplateV4 templateV4 = this.f30787a.get(i);
        bVar.mo43935a(templateV4, new C11451c(this, templateV4));
        TemplateReport.f31011b.mo44225a(Integer.valueOf(templateV4.getObjType()), templateV4.getReportName(), templateV4.getReportToken());
        TemplateReportV2.f31015b.mo44241a(this.f30793h, templateV4);
        bVar.itemView.setOnClickListener(new C11452d(this, i, templateV4, LocationRequest.PRIORITY_INDOOR));
    }

    public TemplateAdapter(LifecycleOwner lifecycleOwner, LayoutType layoutType, C10917c cVar, String str, int i) {
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkParameterIsNotNull(layoutType, "layoutType");
        Intrinsics.checkParameterIsNotNull(cVar, "serviceContext");
        this.f30790e = lifecycleOwner;
        this.f30791f = layoutType;
        this.f30792g = cVar;
        this.f30793h = str;
        this.f30794i = i;
        this.f30787a = new ArrayList();
        this.f30789c = true;
        ConnectionService d = C5084ad.m20847d();
        Intrinsics.checkExpressionValueIsNotNull(d, "connectionService");
        ConnectionService.NetworkState b = d.mo20038b();
        Intrinsics.checkExpressionValueIsNotNull(b, "connectionService.networkState");
        this.f30789c = b.mo20041b();
        d.mo20037a().mo5923a(lifecycleOwner, new AbstractC1178x<ConnectionService.NetworkState>(this) {
            /* class com.bytedance.ee.bear.templates.TemplateAdapter.C114491 */

            /* renamed from: a */
            final /* synthetic */ TemplateAdapter f30795a;

            {
                this.f30795a = r1;
            }

            /* renamed from: a */
            public final void onChanged(ConnectionService.NetworkState networkState) {
                boolean z = this.f30795a.f30789c;
                Intrinsics.checkExpressionValueIsNotNull(networkState, "it");
                if (z != networkState.mo20041b()) {
                    this.f30795a.mo43992a(networkState.mo20041b());
                }
                this.f30795a.f30789c = networkState.mo20041b();
            }
        });
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ TemplateAdapter(androidx.lifecycle.LifecycleOwner r7, com.bytedance.ee.bear.templates.LayoutType r8, com.bytedance.ee.bear.service.C10917c r9, java.lang.String r10, int r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r6 = this;
            r13 = r12 & 8
            if (r13 == 0) goto L_0x0007
            r10 = 0
            java.lang.String r10 = (java.lang.String) r10
        L_0x0007:
            r4 = r10
            r10 = r12 & 16
            if (r10 == 0) goto L_0x000f
            r11 = 0
            r5 = 0
            goto L_0x0010
        L_0x000f:
            r5 = r11
        L_0x0010:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.templates.TemplateAdapter.<init>(androidx.lifecycle.LifecycleOwner, com.bytedance.ee.bear.templates.LayoutType, com.bytedance.ee.bear.service.c, java.lang.String, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
