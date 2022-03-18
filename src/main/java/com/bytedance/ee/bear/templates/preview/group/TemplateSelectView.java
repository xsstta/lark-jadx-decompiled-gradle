package com.bytedance.ee.bear.templates.preview.group;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.al;
import com.bytedance.ee.bear.contract.p283g.C5174a;
import com.bytedance.ee.bear.contract.route.parcelable.DocOperateBean;
import com.bytedance.ee.bear.list.create.C8228a;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.dto.SaveTemplateResult;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.bear.route.PostCard;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.templates.TemplateReportV2;
import com.bytedance.ee.bear.templates.p554c.AbstractC11454b;
import com.bytedance.ee.bear.templates.preview.group.SceneTemplateData;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import io.reactivex.functions.Consumer;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J*\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\f0\u0012J\u0006\u0010\u0014\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/bytedance/ee/bear/templates/preview/group/TemplateSelectView;", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/bytedance/ee/bear/templates/preview/group/SceneTemplateData;", "(Lcom/bytedance/ee/bear/templates/preview/group/SceneTemplateData;)V", "onCreateTemplate", "Lcom/bytedance/ee/bear/templates/dto/OnCreateSuccess;", "getOnCreateTemplate", "()Lcom/bytedance/ee/bear/templates/dto/OnCreateSuccess;", "setOnCreateTemplate", "(Lcom/bytedance/ee/bear/templates/dto/OnCreateSuccess;)V", "init", "", "context", "Landroid/content/Context;", "vg", "Landroid/view/ViewGroup;", "cb", "Lkotlin/Function1;", "", "initCallback", "Companion", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.templates.preview.group.b */
public final class TemplateSelectView {

    /* renamed from: b */
    public static final Companion f31171b = new Companion(null);

    /* renamed from: a */
    public SceneTemplateData f31172a;

    /* renamed from: c */
    private AbstractC11454b f31173c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JA\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\rR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/bytedance/ee/bear/templates/preview/group/TemplateSelectView$Companion;", "", "()V", "TAG", "", "init", "Lcom/bytedance/ee/bear/templates/dto/OnCreateSuccess;", "context", "Landroid/content/Context;", "vg", "Landroid/view/ViewGroup;", "templateId", "cb", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "title", "", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.preview.group.b$a */
    public static final class Companion {
        private Companion() {
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.templates.preview.group.b$a$c */
        static final class C11574c<T> implements Consumer<Throwable> {

            /* renamed from: a */
            public static final C11574c f31179a = new C11574c();

            C11574c() {
            }

            /* renamed from: a */
            public final void accept(Throwable th) {
                C13479a.m54761a("TemplateSelectView", th);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/templates/preview/group/SceneTemplateResult;", "kotlin.jvm.PlatformType", "it", "", "parse"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.templates.preview.group.b$a$a */
        static final class C11572a<T extends NetService.Result<Serializable>> implements NetService.AbstractC5074c<SceneTemplateResult> {

            /* renamed from: a */
            public static final C11572a f31174a = new C11572a();

            C11572a() {
            }

            /* renamed from: a */
            public final SceneTemplateResult parse(String str) {
                return (SceneTemplateResult) JSONObject.parseObject(str, SceneTemplateResult.class);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/templates/preview/group/SceneTemplateResult;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.templates.preview.group.b$a$b */
        static final class C11573b<T> implements Consumer<SceneTemplateResult> {

            /* renamed from: a */
            final /* synthetic */ Context f31175a;

            /* renamed from: b */
            final /* synthetic */ TemplateSelectView f31176b;

            /* renamed from: c */
            final /* synthetic */ ViewGroup f31177c;

            /* renamed from: d */
            final /* synthetic */ Function1 f31178d;

            C11573b(Context context, TemplateSelectView bVar, ViewGroup viewGroup, Function1 function1) {
                this.f31175a = context;
                this.f31176b = bVar;
                this.f31177c = viewGroup;
                this.f31178d = function1;
            }

            /* renamed from: a */
            public final void accept(SceneTemplateResult sceneTemplateResult) {
                C13479a.m54764b("TemplateSelectView", "fetch data success");
                Context context = this.f31175a;
                if (!(context instanceof Activity)) {
                    context = null;
                }
                Activity activity = (Activity) context;
                if (activity == null || !activity.isFinishing()) {
                    TemplateSelectView bVar = this.f31176b;
                    Serializable serializable = sceneTemplateResult.data;
                    Intrinsics.checkExpressionValueIsNotNull(serializable, "it.data");
                    bVar.f31172a = (SceneTemplateData) serializable;
                    this.f31176b.mo44487a(this.f31175a, this.f31177c, this.f31178d);
                }
            }
        }

        /* renamed from: a */
        public final AbstractC11454b mo44488a(Context context, ViewGroup viewGroup, String str, Function1<? super String, Unit> function1) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(viewGroup, "vg");
            Intrinsics.checkParameterIsNotNull(str, "templateId");
            Intrinsics.checkParameterIsNotNull(function1, "cb");
            NetService.C5077f fVar = new NetService.C5077f("/space/api/platform/template/preview_template_collection/");
            fVar.mo20145a("collection_id", str);
            fVar.mo20143a(2);
            TemplateSelectView bVar = new TemplateSelectView(new SceneTemplateData());
            ((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null)).mo20117a(C11572a.f31174a).mo20141a(fVar).mo238001b(new C11573b(context, bVar, viewGroup, function1), C11574c.f31179a);
            return bVar.mo44486a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"com/bytedance/ee/bear/templates/preview/group/TemplateSelectView$init$1$1", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", "view", "Landroid/view/View;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.preview.group.b$c */
    public static final class C11576c extends RecyclerView.AbstractC1335d {
        C11576c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            int i;
            Intrinsics.checkParameterIsNotNull(rect, "outRect");
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(recyclerView, "parent");
            Intrinsics.checkParameterIsNotNull(state, "state");
            if (recyclerView.getChildAdapterPosition(view) == 0) {
                i = view.getResources().getDimensionPixelSize(R.dimen.space_kit_len_17);
            } else {
                i = 0;
            }
            rect.left = i;
            rect.right = view.getResources().getDimensionPixelSize(R.dimen.space_kit_len_12);
        }
    }

    /* renamed from: a */
    public final AbstractC11454b mo44486a() {
        C11577d dVar = new C11577d(this);
        this.f31173c = dVar;
        return dVar;
    }

    public TemplateSelectView(SceneTemplateData sceneTemplateData) {
        Intrinsics.checkParameterIsNotNull(sceneTemplateData, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.f31172a = sceneTemplateData;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/bytedance/ee/bear/templates/preview/group/TemplateSelectView$init$1$2"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.preview.group.b$b */
    public static final class View$OnClickListenerC11575b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TemplateSelectView f31180a;

        /* renamed from: b */
        final /* synthetic */ Function1 f31181b;

        View$OnClickListenerC11575b(TemplateSelectView bVar, Function1 function1) {
            this.f31180a = bVar;
            this.f31181b = function1;
        }

        public final void onClick(View view) {
            TemplatePreviewReport.f31169b.mo44485b(this.f31180a.f31172a.collection_id, this.f31180a.f31172a.name);
            DocOperateBean docOperateBean = new DocOperateBean();
            docOperateBean.mo20972a(4);
            docOperateBean.mo20973a(this.f31180a.f31172a.collection_id);
            PostCard a = ((AbstractC10740f) KoinJavaComponent.m268613a(AbstractC10740f.class, null, null, 6, null)).mo17295b("/folder/select/activity").mo17311a("EXTRA_OPERATE_BEAN", docOperateBean);
            Intrinsics.checkExpressionValueIsNotNull(view, "it");
            a.mo17314a("extra_operate_text", view.getContext().getString(R.string.CreationMobile_Operation_SaveSolutionTo)).mo17316a("extra_show_recent_folder", true).mo17316a("extra_disable_create_folder", false).mo17318b(16).mo17317a();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "result", "", "kotlin.jvm.PlatformType", "onCreateSuccess"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.preview.group.b$d */
    public static final class C11577d implements AbstractC11454b {

        /* renamed from: a */
        final /* synthetic */ TemplateSelectView f31182a;

        C11577d(TemplateSelectView bVar) {
            this.f31182a = bVar;
        }

        @Override // com.bytedance.ee.bear.templates.p554c.AbstractC11454b
        /* renamed from: a */
        public final void mo43999a(Object obj) {
            if (obj instanceof SaveTemplateResult) {
                new C10917c(new C10929e());
                AbstractC5233x b = C5234y.m21391b();
                al d = C4511g.m18594d();
                Intrinsics.checkExpressionValueIsNotNull(d, "infoProService");
                String a = C5174a.m21161a(d.mo17344E());
                SaveTemplateResult saveTemplateResult = (SaveTemplateResult) obj;
                SaveTemplateTokens a2 = SaveTemplateTokens.m48121a(saveTemplateResult.getTokenList());
                List<SceneTemplateData.Scene> list = this.f31182a.f31172a.template_collection;
                if (list != null) {
                    for (T t : list) {
                        C8275a b2 = C8275a.m34052b(t.obj_type);
                        String str = null;
                        String a3 = b2 != null ? b2.mo32553a() : null;
                        if (a2 != null) {
                            str = a2.mo44481b(t.obj_token);
                        }
                        C8228a.m33794a(b, a3, str, a, saveTemplateResult.getParentToken(), "", "", "", t.obj_token, "", true, "from_set");
                    }
                }
                C8228a.m33793a(b, "folder", saveTemplateResult.getToken(), a, saveTemplateResult.getParentToken(), "");
            }
        }
    }

    /* renamed from: a */
    public final void mo44487a(Context context, ViewGroup viewGroup, Function1<? super String, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(viewGroup, "vg");
        Intrinsics.checkParameterIsNotNull(function1, "cb");
        View inflate = LayoutInflater.from(context).inflate(R.layout.template_select_dialog, viewGroup, true);
        View findViewById = inflate.findViewById(R.id.nameTv);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "it.findViewById<TextView>(R.id.nameTv)");
        StringBuilder sb = new StringBuilder();
        sb.append(this.f31172a.name);
        sb.append(" (");
        sb.append(this.f31172a.template_collection.size());
        Intrinsics.checkExpressionValueIsNotNull(inflate, "it");
        sb.append(inflate.getResources().getString(R.string.CreationMobile_Operation_NumberofTemplate));
        sb.append(")");
        ((TextView) findViewById).setText(sb.toString());
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.template_rv);
        List<SceneTemplateData.Scene> list = this.f31172a.template_collection;
        Intrinsics.checkExpressionValueIsNotNull(list, "data.template_collection");
        TempleteSelectAdapter dVar = new TempleteSelectAdapter(list);
        recyclerView.addItemDecoration(new C11576c());
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rv");
        recyclerView.setLayoutManager(new LinearLayoutManager(inflate.getContext(), 0, false));
        recyclerView.setAdapter(dVar);
        ((Button) inflate.findViewById(R.id.saveToSpaceBtn)).setOnClickListener(new View$OnClickListenerC11575b(this, function1));
        String str = this.f31172a.name;
        Intrinsics.checkExpressionValueIsNotNull(str, "data.name");
        function1.invoke(str);
        TemplatePreviewReport.f31169b.mo44484b();
        TemplateReportV2.m47969a(TemplateReportV2.f31015b, "ccm_set_template_preview_view", (String) null, 2, (Object) null);
    }
}
