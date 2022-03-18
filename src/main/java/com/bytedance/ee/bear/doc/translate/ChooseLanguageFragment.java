package com.bytedance.ee.bear.doc.translate;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.bizwidget.p271a.C4860a;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.browser.plugin.C4950k;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.more.AbstractC10194a;
import com.bytedance.ee.bear.widgets.panel.CommonActionPanelLayout;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.statusbar.IStatusBar;
import com.bytedance.ee.util.statusbar.StatusBarManager;
import com.larksuite.component.ignition.widget.setting_group.SettingGroupHelper;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0002J\u0010\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0012\u0010\u0016\u001a\u00020\u00112\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J \u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001cH\u0016J&\u0010 \u001a\u0004\u0018\u00010\u00152\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010%\u001a\u00020\u0011H\u0016J\u0018\u0010&\u001a\u00020\u00112\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001eH\u0002J\u001a\u0010*\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0018\u0010+\u001a\u00020\u00112\u0006\u0010'\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u001eH\u0002J\u0006\u0010,\u001a\u00020\u0011J\u0006\u0010-\u001a\u00020\u0011J\b\u0010.\u001a\u00020\u0011H\u0002J\u000e\u0010/\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lcom/bytedance/ee/bear/doc/translate/ChooseLanguageFragment;", "Lcom/bytedance/ee/bear/bizwidget/dialogfragment/BaseBottomSheetDialogFragment;", "()V", "TAG", "", "pluginHost", "Lcom/bytedance/ee/bear/browser/plugin/PluginHost;", "recentlyUseLanguagesAdapter", "Lcom/bytedance/ee/bear/doc/translate/ChooseLanguageAdapter;", "recentlyUseLanguagesFl", "Landroid/widget/LinearLayout;", "statusBar", "Lcom/bytedance/ee/util/statusbar/IStatusBar;", "translateLanguagesAdapter", "viewModel", "Lcom/bytedance/ee/bear/doc/translate/TranslateViewModel;", "closePanel", "", "initObservers", "initViews", "view", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateAnimation", "Landroid/view/animation/Animation;", "transit", "", "enter", "", "nextAnim", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onSelectLanguage", "language", "Lcom/bytedance/ee/bear/doc/translate/LanguageModel;", "isRecent", "onViewCreated", "reportClickTranslate", "reportTopBarClickCloseEvent", "reportTopBarViewEvent", "reportTranslateView", "setPluginHost", "doc-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.doc.translate.c */
public final class ChooseLanguageFragment extends C4860a {

    /* renamed from: c */
    public LinearLayout f15807c;

    /* renamed from: d */
    public ChooseLanguageAdapter f15808d = new ChooseLanguageAdapter();

    /* renamed from: e */
    public ChooseLanguageAdapter f15809e = new ChooseLanguageAdapter();

    /* renamed from: f */
    public C4943e f15810f;

    /* renamed from: g */
    private final String f15811g = "ChooseLanguageFragment";

    /* renamed from: h */
    private IStatusBar f15812h;

    /* renamed from: i */
    private C5579f f15813i;

    /* renamed from: j */
    private HashMap f15814j;

    /* renamed from: i */
    public void mo22232i() {
        HashMap hashMap = this.f15814j;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo22232i();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        mo22231h();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/bytedance/ee/bear/doc/translate/ChooseLanguageFragment$initViews$1", "Lcom/bytedance/ee/bear/widgets/panel/CommonActionPanelLayout$SimpleActionListener;", "onClickLeftIcon", "", "doc-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.doc.translate.c$d */
    public static final class C5574d extends CommonActionPanelLayout.SimpleActionListener {

        /* renamed from: a */
        final /* synthetic */ ChooseLanguageFragment f15818a;

        @Override // com.bytedance.ee.bear.widgets.panel.CommonActionPanelLayout.OnActionListener, com.bytedance.ee.bear.widgets.panel.CommonActionPanelLayout.SimpleActionListener
        /* renamed from: d */
        public void mo18838d() {
            this.f15818a.mo22229f();
            this.f15818a.mo22231h();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C5574d(ChooseLanguageFragment cVar) {
            this.f15818a = cVar;
        }
    }

    /* renamed from: h */
    public final void mo22231h() {
        C1177w<Boolean> showingChooseLanguagePanel;
        C5579f fVar = this.f15813i;
        if (fVar != null && (showingChooseLanguagePanel = fVar.getShowingChooseLanguagePanel()) != null) {
            showingChooseLanguagePanel.mo5929b((Boolean) false);
        }
    }

    /* renamed from: g */
    public final void mo22230g() {
        AbstractC5233x b = C5234y.m21391b();
        Intrinsics.checkExpressionValueIsNotNull(b, "AnalyticServiceImp.getInstance()");
        HashMap<String, Object> c = b.mo21086c("docCommonParams");
        Intrinsics.checkExpressionValueIsNotNull(c, "analyticService.getAllCo…Plugin.DOC_COMMON_PARAMS)");
        HashMap<String, Object> hashMap = c;
        b.mo21084b("ccm_space_docs_topbar_view", hashMap);
        String str = this.f15811g;
        C13479a.m54772d(str, "reportTopBarViewEvent, params = " + hashMap);
    }

    /* renamed from: j */
    private final void m22581j() {
        if (C5234y.m21391b() != null) {
            AbstractC5233x b = C5234y.m21391b();
            Intrinsics.checkExpressionValueIsNotNull(b, "AnalyticServiceImp.getInstance()");
            HashMap<String, String> b2 = b.mo21083b("TranslateMoreItemV2");
            Intrinsics.checkExpressionValueIsNotNull(b2, "analyticService.getAllCo…(TranslateMoreItemV2.TAG)");
            if (b2.size() > 0) {
                AbstractC10194a aVar = (AbstractC10194a) KoinJavaComponent.m268613a(AbstractC10194a.class, null, null, 6, null);
                String str = b2.get("token");
                String str2 = b2.get(ShareHitPoint.f121869d);
                if (str2 == null) {
                    Intrinsics.throwNpe();
                }
                Intrinsics.checkExpressionValueIsNotNull(str2, "params[TranslateMoreItemV2.KEY_TYPE]!!");
                aVar.mo38975a("ccm_space_translate_view", null, str, Integer.parseInt(str2), "", Boolean.parseBoolean(b2.get("is_wiki")), Boolean.parseBoolean(b2.get("is_at_vc")));
            }
        }
    }

    /* renamed from: k */
    private final void m22582k() {
        C1177w<List<LanguageModel>> recentlyUsedLanguages;
        C1177w<LanguageModel> selectedLanguage;
        C1177w<List<LanguageModel>> chooseLanguages;
        C5579f fVar = this.f15813i;
        if (!(fVar == null || (chooseLanguages = fVar.getChooseLanguages()) == null)) {
            chooseLanguages.mo5923a(this, new C5571a(this));
        }
        C5579f fVar2 = this.f15813i;
        if (!(fVar2 == null || (selectedLanguage = fVar2.getSelectedLanguage()) == null)) {
            selectedLanguage.mo5923a(this, new C5572b(this));
        }
        C5579f fVar3 = this.f15813i;
        if (fVar3 != null && (recentlyUsedLanguages = fVar3.getRecentlyUsedLanguages()) != null) {
            recentlyUsedLanguages.mo5923a(this, new C5573c(this));
        }
    }

    /* renamed from: f */
    public final void mo22229f() {
        AbstractC5233x b = C5234y.m21391b();
        Intrinsics.checkExpressionValueIsNotNull(b, "AnalyticServiceImp.getInstance()");
        HashMap<String, Object> c = b.mo21086c("docCommonParams");
        Intrinsics.checkExpressionValueIsNotNull(c, "analyticService.getAllCo…Plugin.DOC_COMMON_PARAMS)");
        HashMap hashMap = new HashMap(c);
        hashMap.put("click", "close");
        hashMap.put("target", "none");
        b.mo21084b("ccm_space_docs_topbar_click", hashMap);
        String str = this.f15811g;
        C13479a.m54772d(str, "reportTopBarClickCloseEvent, params = " + hashMap);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0018\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¨\u0006\u0007"}, d2 = {"com/bytedance/ee/bear/doc/translate/ChooseLanguageFragment$initObservers$1", "Landroidx/lifecycle/Observer;", "", "Lcom/bytedance/ee/bear/doc/translate/LanguageModel;", "onChanged", "", "languages", "doc-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.doc.translate.c$a */
    public static final class C5571a implements AbstractC1178x<List<? extends LanguageModel>> {

        /* renamed from: a */
        final /* synthetic */ ChooseLanguageFragment f15815a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C5571a(ChooseLanguageFragment cVar) {
            this.f15815a = cVar;
        }

        /* renamed from: a */
        public void onChanged(List<? extends LanguageModel> list) {
            if (list != null) {
                this.f15815a.f15809e.mo22224a(list);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/doc/translate/ChooseLanguageFragment$initObservers$2", "Landroidx/lifecycle/Observer;", "Lcom/bytedance/ee/bear/doc/translate/LanguageModel;", "onChanged", "", "lm", "doc-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.doc.translate.c$b */
    public static final class C5572b implements AbstractC1178x<LanguageModel> {

        /* renamed from: a */
        final /* synthetic */ ChooseLanguageFragment f15816a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C5572b(ChooseLanguageFragment cVar) {
            this.f15816a = cVar;
        }

        /* renamed from: a */
        public void onChanged(LanguageModel languageModel) {
            this.f15816a.f15809e.mo22222a(languageModel);
            this.f15816a.f15808d.mo22222a(languageModel);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0018\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¨\u0006\u0007"}, d2 = {"com/bytedance/ee/bear/doc/translate/ChooseLanguageFragment$initObservers$3", "Landroidx/lifecycle/Observer;", "", "Lcom/bytedance/ee/bear/doc/translate/LanguageModel;", "onChanged", "", "list", "doc-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.doc.translate.c$c */
    public static final class C5573c implements AbstractC1178x<List<? extends LanguageModel>> {

        /* renamed from: a */
        final /* synthetic */ ChooseLanguageFragment f15817a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C5573c(ChooseLanguageFragment cVar) {
            this.f15817a = cVar;
        }

        /* renamed from: a */
        public void onChanged(List<? extends LanguageModel> list) {
            boolean z;
            List<? extends LanguageModel> list2 = list;
            if (list2 == null || list2.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                C4943e a = ChooseLanguageFragment.m22578a(this.f15817a);
                if (a != null) {
                    String documentType = ((C6095s) a).mo24598m().getDocumentType();
                    C8275a aVar = C8275a.f22378k;
                    Intrinsics.checkExpressionValueIsNotNull(aVar, "DocumentType.DOCX");
                    if (!Intrinsics.areEqual(documentType, aVar.mo32553a())) {
                        this.f15817a.f15808d.mo22224a(list);
                        LinearLayout linearLayout = this.f15817a.f15807c;
                        if (linearLayout != null) {
                            linearLayout.setVisibility(0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.document.DocumentPluginHost");
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/doc/translate/LanguageModel;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.doc.translate.c$e */
    public static final class C5575e extends Lambda implements Function1<LanguageModel, Unit> {
        final /* synthetic */ ChooseLanguageFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5575e(ChooseLanguageFragment cVar) {
            super(1);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LanguageModel languageModel) {
            invoke(languageModel);
            return Unit.INSTANCE;
        }

        public final void invoke(LanguageModel languageModel) {
            Intrinsics.checkParameterIsNotNull(languageModel, "it");
            this.this$0.mo22228a(languageModel, true);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/doc/translate/LanguageModel;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.doc.translate.c$f */
    public static final class C5576f extends Lambda implements Function1<LanguageModel, Unit> {
        final /* synthetic */ ChooseLanguageFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5576f(ChooseLanguageFragment cVar) {
            super(1);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LanguageModel languageModel) {
            invoke(languageModel);
            return Unit.INSTANCE;
        }

        public final void invoke(LanguageModel languageModel) {
            Intrinsics.checkParameterIsNotNull(languageModel, "it");
            this.this$0.mo22228a(languageModel, false);
        }
    }

    /* renamed from: a */
    public final void mo22227a(C4943e eVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "pluginHost");
        this.f15810f = eVar;
    }

    /* renamed from: a */
    public static final /* synthetic */ C4943e m22578a(ChooseLanguageFragment cVar) {
        C4943e eVar = cVar.f15810f;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pluginHost");
        }
        return eVar;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Intrinsics.checkExpressionValueIsNotNull(activity, "it");
            this.f15812h = StatusBarManager.m55628a(activity);
        }
        C4943e eVar = this.f15810f;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pluginHost");
        }
        this.f15813i = (C5579f) C4950k.m20478a(eVar, C5579f.class);
    }

    /* renamed from: a */
    private final void m22579a(View view) {
        ((CommonActionPanelLayout) view.findViewById(R.id.layout_choose_language)).setOnActionListener(new C5574d(this));
        this.f15807c = (LinearLayout) view.findViewById(R.id.recently_use_languages_fl);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recently_use_languages_rv);
        RecyclerView recyclerView2 = (RecyclerView) view.findViewById(R.id.translate_languages_rv);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "recentlyUseLanguagesRv");
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "translateLanguagesRv");
        recyclerView2.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(this.f15808d);
        recyclerView2.setAdapter(this.f15809e);
        SettingGroupHelper.m88815a(recyclerView, true, (int) R.color.facade_selector_item_float, (int) R.color.bg_float);
        SettingGroupHelper.m88815a(recyclerView2, true, (int) R.color.facade_selector_item_float, (int) R.color.bg_float);
        this.f15808d.mo22225a(new C5575e(this));
        this.f15809e.mo22225a(new C5576f(this));
        mo22230g();
    }

    /* renamed from: a */
    public final void mo22228a(LanguageModel languageModel, boolean z) {
        C5579f fVar = this.f15813i;
        if (fVar != null) {
            fVar.onSelectLanguage(languageModel);
        }
        mo22231h();
        String tag = languageModel.getTag();
        Intrinsics.checkExpressionValueIsNotNull(tag, "language.tag");
        m22580a(tag, z);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        m22579a(view);
        m22582k();
        m22581j();
    }

    /* renamed from: a */
    private final void m22580a(String str, boolean z) {
        String str2;
        if (C5234y.m21391b() != null) {
            AbstractC5233x b = C5234y.m21391b();
            Intrinsics.checkExpressionValueIsNotNull(b, "AnalyticServiceImp.getInstance()");
            HashMap<String, String> b2 = b.mo21083b("TranslateMoreItemV2");
            Intrinsics.checkExpressionValueIsNotNull(b2, "analyticService.getAllCo…(TranslateMoreItemV2.TAG)");
            if (b2.size() > 0) {
                AbstractC10194a aVar = (AbstractC10194a) KoinJavaComponent.m268613a(AbstractC10194a.class, null, null, 6, null);
                String str3 = b2.get("token");
                String str4 = b2.get(ShareHitPoint.f121869d);
                if (str4 == null) {
                    Intrinsics.throwNpe();
                }
                Intrinsics.checkExpressionValueIsNotNull(str4, "params[TranslateMoreItemV2.KEY_TYPE]!!");
                int parseInt = Integer.parseInt(str4);
                boolean parseBoolean = Boolean.parseBoolean(b2.get("is_wiki"));
                boolean parseBoolean2 = Boolean.parseBoolean(b2.get("is_at_vc"));
                if (z) {
                    str2 = "recent";
                } else {
                    str2 = "all";
                }
                aVar.mo38976a("ccm_space_translate_click", null, str3, parseInt, "", parseBoolean, parseBoolean2, str, "ccm_docs_page_view", str2);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.choose_language_fragment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public Animation onCreateAnimation(int i, boolean z, int i2) {
        if (z) {
            Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.translate_to_top_in);
            Intrinsics.checkExpressionValueIsNotNull(loadAnimation, "enterAnim");
            return loadAnimation;
        }
        Animation loadAnimation2 = AnimationUtils.loadAnimation(getContext(), R.anim.translate_top_to_bottom);
        Intrinsics.checkExpressionValueIsNotNull(loadAnimation2, "exitAnim");
        return loadAnimation2;
    }
}
