package com.bytedance.ee.bear.sheet.exportimage.preview;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import com.bytedance.ee.bear.bizwidget.shareview.C4891e;
import com.bytedance.ee.bear.bizwidget.shareview.ExternalShareView;
import com.bytedance.ee.bear.bizwidget.shareview.ShareType;
import com.bytedance.ee.bear.browser.plugin.C4950k;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.facade.common.widget.BearLottieView;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.sheet.common.C11090b;
import com.bytedance.ee.bear.sheet.exportimage.C11094a;
import com.bytedance.ee.bear.sheet.exportimage.preview.PreviewTitleModel;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.bear.widgets.BaseTitleBar;
import com.bytedance.ee.util.p718t.C13749l;
import com.bytedance.ee.util.statusbar.IStatusBar;
import com.bytedance.ee.util.statusbar.StatusBarManager;
import com.larksuite.suite.R;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u000fH\u0002J\b\u0010\u001c\u001a\u00020\u0006H\u0016J&\u0010\u001d\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010$\u001a\u00020\u0019H\u0016J\u0010\u0010%\u001a\u00020\u00192\u0006\u0010&\u001a\u00020'H\u0002J\u001a\u0010(\u001a\u00020\u00192\u0006\u0010)\u001a\u00020\u000f2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010*\u001a\u00020\u0019H\u0002J\b\u0010+\u001a\u00020\u0019H\u0002J\b\u0010,\u001a\u00020\u0019H\u0002J\b\u0010-\u001a\u00020\u0019H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/bytedance/ee/bear/sheet/exportimage/preview/SheetImagePreviewFragment;", "Lcom/bytedance/ee/bear/facade/common/BaseFragment;", "()V", "externalShareView", "Lcom/bytedance/ee/bear/bizwidget/shareview/ExternalShareView;", "isShareText", "", "loadingView", "Lcom/bytedance/ee/bear/facade/common/widget/BearLottieView;", "loadingViewContainer", "Landroid/widget/FrameLayout;", "shareItemDisabled", "shareText", "", "shareTextContainer", "Landroid/view/View;", "shareTextView", "Landroid/widget/TextView;", "statusBar", "Lcom/bytedance/ee/util/statusbar/IStatusBar;", "titleBar", "Lcom/bytedance/ee/bear/widgets/BaseTitleBar;", "viewModel", "Lcom/bytedance/ee/bear/sheet/exportimage/preview/ImagePreviewViewModel;", "hideShareTextPanel", "", "initViews", "root", "onBackPressed", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onShareToExternalApp", "shareType", "Lcom/bytedance/ee/bear/bizwidget/shareview/ShareType;", "onViewCreated", "view", "registerObservers", "setPageBackgroundBlack", "showShareTextPanel", "updateExternalConfig", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.sheet.exportimage.preview.b */
public final class SheetImagePreviewFragment extends C7667e {

    /* renamed from: a */
    public ImagePreviewViewModel f29907a;

    /* renamed from: b */
    public ExternalShareView f29908b;

    /* renamed from: c */
    public BaseTitleBar f29909c;

    /* renamed from: d */
    public FrameLayout f29910d;

    /* renamed from: e */
    public View f29911e;

    /* renamed from: f */
    public boolean f29912f;

    /* renamed from: g */
    public boolean f29913g;

    /* renamed from: h */
    public String f29914h = "";

    /* renamed from: i */
    private IStatusBar f29915i;

    /* renamed from: j */
    private BearLottieView f29916j;

    /* renamed from: k */
    private TextView f29917k;

    /* renamed from: l */
    private HashMap f29918l;

    /* renamed from: e */
    public void mo42538e() {
        HashMap hashMap = this.f29918l;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016¨\u0006\u000b"}, d2 = {"com/bytedance/ee/bear/sheet/exportimage/preview/SheetImagePreviewFragment$updateExternalConfig$1", "Lcom/bytedance/ee/bear/bizwidget/shareview/SimpleShareItemClickListener;", "onCopyText", "", "onDownLoad", "onShareMore", "onShareToLark", "onShareToQQ", "onShareToWechat", "onShareToWechatMoments", "onShareToWeibo", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.exportimage.preview.b$h */
    public static final class C11137h extends C4891e {

        /* renamed from: a */
        final /* synthetic */ SheetImagePreviewFragment f29928a;

        @Override // com.bytedance.ee.bear.bizwidget.shareview.AbstractC4881a, com.bytedance.ee.bear.bizwidget.shareview.C4891e
        /* renamed from: a */
        public void mo19175a() {
            this.f29928a.mo42534a(ShareType.Lark);
        }

        @Override // com.bytedance.ee.bear.bizwidget.shareview.AbstractC4881a, com.bytedance.ee.bear.bizwidget.shareview.C4891e
        /* renamed from: f */
        public void mo19178f() {
            this.f29928a.mo42534a(ShareType.Download);
        }

        @Override // com.bytedance.ee.bear.bizwidget.shareview.AbstractC4881a, com.bytedance.ee.bear.bizwidget.shareview.C4891e
        /* renamed from: g */
        public void mo19179g() {
            this.f29928a.mo42534a(ShareType.Wechat);
        }

        @Override // com.bytedance.ee.bear.bizwidget.shareview.AbstractC4881a, com.bytedance.ee.bear.bizwidget.shareview.C4891e
        /* renamed from: h */
        public void mo19180h() {
            this.f29928a.mo42534a(ShareType.WechatMoments);
        }

        @Override // com.bytedance.ee.bear.bizwidget.shareview.AbstractC4881a, com.bytedance.ee.bear.bizwidget.shareview.C4891e
        /* renamed from: i */
        public void mo19181i() {
            this.f29928a.mo42534a(ShareType.QQ);
        }

        @Override // com.bytedance.ee.bear.bizwidget.shareview.AbstractC4881a, com.bytedance.ee.bear.bizwidget.shareview.C4891e
        /* renamed from: j */
        public void mo19182j() {
            this.f29928a.mo42534a(ShareType.Weibo);
        }

        @Override // com.bytedance.ee.bear.bizwidget.shareview.AbstractC4881a, com.bytedance.ee.bear.bizwidget.shareview.C4891e
        /* renamed from: k */
        public void mo19183k() {
            this.f29928a.mo42534a(ShareType.CopyText);
        }

        @Override // com.bytedance.ee.bear.bizwidget.shareview.AbstractC4881a, com.bytedance.ee.bear.bizwidget.shareview.C4891e
        /* renamed from: l */
        public void mo19184l() {
            this.f29928a.mo42534a(ShareType.More);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C11137h(SheetImagePreviewFragment bVar) {
            this.f29928a = bVar;
        }
    }

    /* renamed from: b */
    public final void mo42535b() {
        View view = this.f29911e;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7666d, com.bytedance.ee.bear.facade.common.C7667e
    public boolean onBackPressed() {
        ImagePreviewViewModel aVar = this.f29907a;
        if (aVar == null) {
            return true;
        }
        aVar.onClose();
        return true;
    }

    /* renamed from: a */
    public final void mo42533a() {
        View view = this.f29911e;
        if (view != null) {
            view.setVisibility(0);
        }
        TextView textView = this.f29917k;
        if (textView != null) {
            textView.setText(this.f29914h);
        }
    }

    /* renamed from: d */
    public final void mo42537d() {
        IStatusBar aVar = this.f29915i;
        if (aVar != null) {
            aVar.mo50690b(R.color.bg_body, true);
        }
        BaseTitleBar baseTitleBar = this.f29909c;
        if (baseTitleBar != null) {
            baseTitleBar.setBackgroundColor(getResources().getColor(R.color.bg_body));
        }
        BaseTitleBar baseTitleBar2 = this.f29909c;
        if (baseTitleBar2 != null) {
            baseTitleBar2.setMainTitleColor(getResources().getColor(R.color.text_title));
        }
        BaseTitleBar baseTitleBar3 = this.f29909c;
        if (baseTitleBar3 != null) {
            baseTitleBar3.setActionIconTint(R.color.icon_n1);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        C1177w<Boolean> calSharePanelHeight;
        super.onDestroyView();
        IStatusBar aVar = this.f29915i;
        if (aVar != null) {
            aVar.mo50689b();
        }
        BearLottieView bearLottieView = this.f29916j;
        if (bearLottieView != null) {
            bearLottieView.cancelAnimation();
        }
        ImagePreviewViewModel aVar2 = this.f29907a;
        if (!(aVar2 == null || (calSharePanelHeight = aVar2.getCalSharePanelHeight()) == null)) {
            calSharePanelHeight.mo5929b((Boolean) false);
        }
        mo42538e();
    }

    /* renamed from: f */
    private final void m46342f() {
        C1177w<Boolean> calSharePanelHeight;
        C1177w<ShareOperationTypeModel> operationType;
        C1177w<Boolean> disableShareItem;
        C1177w<PreviewTitleModel> titleData;
        C1177w<Boolean> showLoading;
        C1177w<Boolean> showShare;
        ImagePreviewViewModel aVar = this.f29907a;
        if (!(aVar == null || (showShare = aVar.getShowShare()) == null)) {
            showShare.mo5923a(this, new C11129b(this));
        }
        ImagePreviewViewModel aVar2 = this.f29907a;
        if (!(aVar2 == null || (showLoading = aVar2.getShowLoading()) == null)) {
            showLoading.mo5923a(this, new C11130c(this));
        }
        ImagePreviewViewModel aVar3 = this.f29907a;
        if (!(aVar3 == null || (titleData = aVar3.getTitleData()) == null)) {
            titleData.mo5923a(this, new C11131d(this));
        }
        ImagePreviewViewModel aVar4 = this.f29907a;
        if (!(aVar4 == null || (disableShareItem = aVar4.getDisableShareItem()) == null)) {
            disableShareItem.mo5923a(this, new C11132e(this));
        }
        ImagePreviewViewModel aVar5 = this.f29907a;
        if (!(aVar5 == null || (operationType = aVar5.getOperationType()) == null)) {
            operationType.mo5923a(this, new C11133f(this));
        }
        ImagePreviewViewModel aVar6 = this.f29907a;
        if (aVar6 != null && (calSharePanelHeight = aVar6.getCalSharePanelHeight()) != null) {
            calSharePanelHeight.mo5923a(this, new C11135g(this));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x003d  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo42536c() {
        /*
        // Method dump skipped, instructions count: 180
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.sheet.exportimage.preview.SheetImagePreviewFragment.mo42536c():void");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/sheet/exportimage/preview/SheetImagePreviewFragment$initViews$1", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.exportimage.preview.b$a */
    public static final class C11128a extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ SheetImagePreviewFragment f29919a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C11128a(SheetImagePreviewFragment bVar) {
            this.f29919a = bVar;
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            ImagePreviewViewModel aVar = this.f29919a.f29907a;
            if (aVar != null) {
                aVar.onClose();
            }
            C11090b.m46153f();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "disable", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.exportimage.preview.b$e */
    public static final class C11132e<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ SheetImagePreviewFragment f29923a;

        C11132e(SheetImagePreviewFragment bVar) {
            this.f29923a = bVar;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            this.f29923a.f29912f = Intrinsics.areEqual((Object) bool, (Object) true);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "visible", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.exportimage.preview.b$b */
    public static final class C11129b<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ SheetImagePreviewFragment f29920a;

        C11129b(SheetImagePreviewFragment bVar) {
            this.f29920a = bVar;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            int i;
            ExternalShareView externalShareView = this.f29920a.f29908b;
            if (externalShareView != null) {
                if (Intrinsics.areEqual((Object) bool, (Object) true)) {
                    this.f29920a.mo42537d();
                    i = 0;
                } else {
                    i = 4;
                }
                externalShareView.setVisibility(i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "visible", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.exportimage.preview.b$c */
    public static final class C11130c<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ SheetImagePreviewFragment f29921a;

        C11130c(SheetImagePreviewFragment bVar) {
            this.f29921a = bVar;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            int i;
            FrameLayout frameLayout = this.f29921a.f29910d;
            if (frameLayout != null) {
                if (Intrinsics.areEqual((Object) bool, (Object) true)) {
                    i = 0;
                } else {
                    i = 8;
                }
                frameLayout.setVisibility(i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "titleModel", "Lcom/bytedance/ee/bear/sheet/exportimage/preview/PreviewTitleModel;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.exportimage.preview.b$d */
    public static final class C11131d<T> implements AbstractC1178x<PreviewTitleModel> {

        /* renamed from: a */
        final /* synthetic */ SheetImagePreviewFragment f29922a;

        C11131d(SheetImagePreviewFragment bVar) {
            this.f29922a = bVar;
        }

        /* renamed from: a */
        public final void onChanged(PreviewTitleModel previewTitleModel) {
            PreviewTitleModel.Item titleItem;
            String str;
            BaseTitleBar baseTitleBar;
            if (previewTitleModel != null && (titleItem = previewTitleModel.getTitleItem()) != null && (str = titleItem.text) != null && (baseTitleBar = this.f29922a.f29909c) != null) {
                baseTitleBar.setTitle(str);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "value", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.exportimage.preview.b$g */
    public static final class C11135g<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ SheetImagePreviewFragment f29926a;

        C11135g(SheetImagePreviewFragment bVar) {
            this.f29926a = bVar;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            ExternalShareView externalShareView;
            if (Intrinsics.areEqual((Object) bool, (Object) true) && (externalShareView = this.f29926a.f29908b) != null) {
                externalShareView.post(new Runnable(this) {
                    /* class com.bytedance.ee.bear.sheet.exportimage.preview.SheetImagePreviewFragment.C11135g.RunnableC111361 */

                    /* renamed from: a */
                    final /* synthetic */ C11135g f29927a;

                    {
                        this.f29927a = r1;
                    }

                    public final void run() {
                        int i;
                        ViewGroup.LayoutParams layoutParams;
                        ExternalShareView externalShareView = this.f29927a.f29926a.f29908b;
                        if (externalShareView != null) {
                            i = externalShareView.getMeasuredHeight();
                        } else {
                            i = 0;
                        }
                        ImagePreviewViewModel aVar = this.f29927a.f29926a.f29907a;
                        if (aVar != null) {
                            aVar.onSharePanelHeightChanged(C13749l.m55749b(i));
                        }
                        View view = this.f29927a.f29926a.f29911e;
                        ViewGroup.MarginLayoutParams marginLayoutParams = null;
                        if (view != null) {
                            layoutParams = view.getLayoutParams();
                        } else {
                            layoutParams = null;
                        }
                        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                            marginLayoutParams = layoutParams;
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
                        if (marginLayoutParams2 != null) {
                            marginLayoutParams2.bottomMargin = i;
                        }
                        View view2 = this.f29927a.f29926a.f29911e;
                        if (view2 != null) {
                            view2.setLayoutParams(marginLayoutParams2);
                        }
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public final void mo42534a(ShareType shareType) {
        if (!this.f29912f) {
            if (this.f29913g) {
                ImagePreviewViewModel aVar = this.f29907a;
                if (aVar != null) {
                    aVar.onShareTextToExternalApp(shareType, this.f29914h);
                    return;
                }
                return;
            }
            ImagePreviewViewModel aVar2 = this.f29907a;
            if (aVar2 != null) {
                aVar2.onShareImageToExternalApp(shareType);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "operationType", "Lcom/bytedance/ee/bear/sheet/exportimage/preview/ShareOperationTypeModel;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.exportimage.preview.b$f */
    public static final class C11133f<T> implements AbstractC1178x<ShareOperationTypeModel> {

        /* renamed from: a */
        final /* synthetic */ SheetImagePreviewFragment f29924a;

        C11133f(SheetImagePreviewFragment bVar) {
            this.f29924a = bVar;
        }

        /* renamed from: a */
        public final void onChanged(ShareOperationTypeModel shareOperationTypeModel) {
            if (shareOperationTypeModel != null && !TextUtils.isEmpty(shareOperationTypeModel.toString())) {
                SheetImagePreviewFragment bVar = this.f29924a;
                String type = shareOperationTypeModel.getType();
                boolean z = true;
                if (type == null || !type.equals("text")) {
                    z = false;
                }
                bVar.f29913g = z;
                if (this.f29924a.f29913g) {
                    SheetImagePreviewFragment bVar2 = this.f29924a;
                    String data = shareOperationTypeModel.getData();
                    if (data == null) {
                        data = "";
                    }
                    bVar2.f29914h = data;
                    this.f29924a.mo42533a();
                    View view = this.f29924a.f29911e;
                    if (view != null) {
                        view.post(new Runnable(this) {
                            /* class com.bytedance.ee.bear.sheet.exportimage.preview.SheetImagePreviewFragment.C11133f.RunnableC111341 */

                            /* renamed from: a */
                            final /* synthetic */ C11133f f29925a;

                            {
                                this.f29925a = r1;
                            }

                            public final void run() {
                                if (C11094a.m46179a(this.f29925a.f29924a.getContext(), this.f29925a.f29924a.f29914h)) {
                                    Context context = this.f29925a.f29924a.getContext();
                                    Context context2 = this.f29925a.f29924a.getContext();
                                    if (context2 == null) {
                                        Intrinsics.throwNpe();
                                    }
                                    Intrinsics.checkExpressionValueIsNotNull(context2, "context!!");
                                    Toast.showSuccessTextWithMargin(context, context2.getResources().getText(R.string.Doc_Comment_CopySuccess), 0);
                                }
                            }
                        });
                    }
                } else {
                    this.f29924a.mo42535b();
                }
                this.f29924a.mo42536c();
            }
        }
    }

    /* renamed from: a */
    private final void m46341a(View view) {
        BaseTitleBar baseTitleBar = (BaseTitleBar) view.findViewById(R.id.export_image_preview_titleBar);
        this.f29909c = baseTitleBar;
        if (baseTitleBar != null) {
            baseTitleBar.setLeftImageResource(R.drawable.ud_icon_close_small_outlined);
        }
        BaseTitleBar baseTitleBar2 = this.f29909c;
        if (baseTitleBar2 != null) {
            baseTitleBar2.setActionIconTint(R.color.icon_n1);
        }
        BaseTitleBar baseTitleBar3 = this.f29909c;
        if (baseTitleBar3 != null) {
            baseTitleBar3.setLeftClickListener(new C11128a(this));
        }
        C11090b.m46152e();
        this.f29910d = (FrameLayout) view.findViewById(R.id.export_image_preview_loading_container);
        this.f29916j = (BearLottieView) view.findViewById(R.id.export_image_preview_loading);
        this.f29908b = (ExternalShareView) view.findViewById(R.id.export_image_preview_sharePanel);
        this.f29911e = view.findViewById(R.id.share_text_container);
        this.f29917k = (TextView) view.findViewById(R.id.share_text);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        m46341a(view);
        m46342f();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        this.f29907a = (ImagePreviewViewModel) C4950k.m20474a(this, ImagePreviewViewModel.class);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Intrinsics.checkExpressionValueIsNotNull(activity, "it");
            IStatusBar a = StatusBarManager.m55628a(activity);
            this.f29915i = a;
            if (a != null) {
                a.mo50687a();
            }
            IStatusBar aVar = this.f29915i;
            if (aVar != null) {
                aVar.mo50690b(R.color.bg_body, true);
            }
        }
        return layoutInflater.inflate(R.layout.sheet_export_image_preview_fragment, viewGroup, false);
    }
}
