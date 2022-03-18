package com.bytedance.ee.bear.templates.preview.announce;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1144ai;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LiveData;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.DocumentPlugin;
import com.bytedance.ee.bear.facade.common.AbstractC7666d;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.p2892a.C57582a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0002J\n\u0010\b\u001a\u0004\u0018\u00010\tH\u0002J\u001c\u0010\n\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0007H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/bytedance/ee/bear/templates/preview/announce/AnnounceTemplatePreviewPlugin;", "Lcom/bytedance/ee/bear/document/DocumentPlugin;", "Lcom/bytedance/ee/bear/facade/common/BackPressHandler;", "()V", "templateViewModel", "Lcom/bytedance/ee/bear/templates/preview/announce/AnnounceTemplateViewModel;", "ensurePreviewFragment", "", "getTemplateView", "Landroid/view/ViewGroup;", "onAttachToUIContainer", "host", "Lcom/bytedance/ee/bear/document/DocumentPluginHost;", "uiContainer", "Lcom/bytedance/ee/bear/browser/plugin/UIContainer;", "onBackPressed", "", "onLoadingFinish", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class AnnounceTemplatePreviewPlugin extends DocumentPlugin implements AbstractC7666d {
    public AnnounceTemplateViewModel templateViewModel;

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7666d
    public boolean onBackPressed() {
        AnnounceTemplateViewModel cVar = this.templateViewModel;
        if (cVar != null) {
            cVar.setTemplateData(null);
        }
        ViewGroup templateView = getTemplateView();
        if (templateView == null) {
            return false;
        }
        templateView.setVisibility(8);
        return false;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.preview.announce.AnnounceTemplatePreviewPlugin$c */
    public static final class RunnableC11545c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC4958n f31113a;

        RunnableC11545c(AbstractC4958n nVar) {
            this.f31113a = nVar;
        }

        public final void run() {
            View a = this.f31113a.mo19583a(R.id.contentOuterContainer);
            if (a != null) {
                View a2 = this.f31113a.mo19583a(R.id.doc_appbar_layout);
                Intrinsics.checkExpressionValueIsNotNull(a2, "uiContainer.findView(com…t.R.id.doc_appbar_layout)");
                a.setPadding(0, a2.getHeight(), 0, C57582a.m223600a(165));
            }
        }
    }

    private final ViewGroup getTemplateView() {
        C6095s sVar = (C6095s) getHost();
        Intrinsics.checkExpressionValueIsNotNull(sVar, "host");
        FragmentActivity f = sVar.mo19564f();
        Intrinsics.checkExpressionValueIsNotNull(f, "host.activity");
        return (ViewGroup) ((ViewGroup) f.getWindow().findViewById(16908290)).findViewById(R.id.layout_announce_template_preview);
    }

    public final void onLoadingFinish() {
        ViewGroup templateView = getTemplateView();
        if (templateView != null) {
            templateView.setVisibility(8);
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
        AnnounceTemplateViewModel cVar = this.templateViewModel;
        if (cVar != null) {
            cVar.onRefreshUI();
        }
        AnnounceTemplateAnalytic.f31127b.mo44377a("use_template");
    }

    private final void ensurePreviewFragment() {
        AnnouncePreviewTemplateView aVar;
        C1177w<Integer> currTemplatePos;
        LiveData<Boolean> previewActive;
        C6095s sVar = (C6095s) getHost();
        Intrinsics.checkExpressionValueIsNotNull(sVar, "host");
        FragmentActivity f = sVar.mo19564f();
        Intrinsics.checkExpressionValueIsNotNull(f, "host.activity");
        ViewGroup viewGroup = (ViewGroup) f.getWindow().findViewById(16908290);
        ViewGroup templateView = getTemplateView();
        AnnounceTemplateViewModel cVar = this.templateViewModel;
        if (cVar != null) {
            aVar = cVar.getPreviewTemplateView();
        } else {
            aVar = null;
        }
        View findViewById = viewGroup.findViewById(R.id.tv_preview_title);
        if (findViewById != null) {
            findViewById.setVisibility(0);
        }
        if (aVar == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.announce_template_title_layout, viewGroup, true);
            aVar = new AnnouncePreviewTemplateView();
            AnnounceTemplateViewModel cVar2 = this.templateViewModel;
            if (cVar2 != null) {
                cVar2.setPreviewTemplateView(aVar);
            }
        }
        if (templateView == null) {
            FragmentActivity activity = getActivity();
            Intrinsics.checkExpressionValueIsNotNull(activity, "activity");
            Intrinsics.checkExpressionValueIsNotNull(viewGroup, "content");
            aVar.mo44372a(activity, viewGroup, this.templateViewModel);
        } else {
            templateView.setVisibility(0);
        }
        AnnounceTemplateViewModel cVar3 = this.templateViewModel;
        if (!(cVar3 == null || (previewActive = cVar3.getPreviewActive()) == null)) {
            previewActive.mo5923a(getLifecycleOwner(), new C11543a(this));
        }
        AnnounceTemplateViewModel cVar4 = this.templateViewModel;
        if (cVar4 != null && (currTemplatePos = cVar4.getCurrTemplatePos()) != null) {
            currTemplatePos.mo5923a(getLifecycleOwner(), new C11544b(this));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.preview.announce.AnnounceTemplatePreviewPlugin$a */
    public static final class C11543a<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ AnnounceTemplatePreviewPlugin f31111a;

        C11543a(AnnounceTemplatePreviewPlugin announceTemplatePreviewPlugin) {
            this.f31111a = announceTemplatePreviewPlugin;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            if (Intrinsics.areEqual((Object) bool, (Object) false)) {
                this.f31111a.onLoadingFinish();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Integer;)V"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.preview.announce.AnnounceTemplatePreviewPlugin$b */
    public static final class C11544b<T> implements AbstractC1178x<Integer> {

        /* renamed from: a */
        final /* synthetic */ AnnounceTemplatePreviewPlugin f31112a;

        C11544b(AnnounceTemplatePreviewPlugin announceTemplatePreviewPlugin) {
            this.f31112a = announceTemplatePreviewPlugin;
        }

        /* renamed from: a */
        public final void onChanged(Integer num) {
            AnnouncePreviewTemplateView previewTemplateView;
            AnnounceTemplateViewModel cVar = this.f31112a.templateViewModel;
            if (cVar != null && (previewTemplateView = cVar.getPreviewTemplateView()) != null) {
                Intrinsics.checkExpressionValueIsNotNull(num, "it");
                previewTemplateView.mo44371a(num.intValue());
            }
        }
    }

    public void onAttachToUIContainer(C6095s sVar, AbstractC4958n nVar) {
        View a;
        super.onAttachToUIContainer((C4943e) sVar, nVar);
        AnnounceTemplateViewModel cVar = (AnnounceTemplateViewModel) new C1144ai(getActivity()).mo6005a(AnnounceTemplateViewModel.class);
        this.templateViewModel = cVar;
        if (cVar != null) {
            cVar.setPreviewActive(true);
        }
        if (!(nVar == null || (a = nVar.mo19583a(R.id.doc_appbar_layout)) == null)) {
            a.post(new RunnableC11545c(nVar));
        }
        ensurePreviewFragment();
    }
}
