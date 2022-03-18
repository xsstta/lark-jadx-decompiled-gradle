package com.bytedance.ee.bear.bitable.card.view.cell.attachment.view;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.bytedance.ee.bear.fileselector.FileSelectorManager;
import com.bytedance.ee.bear.fileselector.api.FileSelectConfig;
import com.bytedance.ee.bear.fileselector.api.SimpleFileSelectListener;
import com.bytedance.ee.bear.fileselector.listener.IFileSizeCheckListener;
import com.bytedance.ee.bear.fileselector.listener.OnDismissListener;
import com.bytedance.ee.bear.fileselector.listener.SimpleGetContentViewListener;
import com.bytedance.ee.bear.watermark.interfaces.IWatermarkManager;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.p2892a.C57582a;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bJ&\u0010\f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/view/cell/attachment/view/AttachmentMediaPickerPanel;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "fileSelectListener", "Lcom/bytedance/ee/bear/fileselector/api/SimpleFileSelectListener;", "dismiss", "", "setMediaPickerListener", "show", "sizeCheckListener", "Lcom/bytedance/ee/bear/fileselector/listener/IFileSizeCheckListener;", "listener", "Lcom/bytedance/ee/bear/fileselector/listener/OnDismissListener;", "isCameraOnly", "", "Companion", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.attachment.view.b */
public final class AttachmentMediaPickerPanel {

    /* renamed from: a */
    public static final Companion f13580a = new Companion(null);

    /* renamed from: b */
    private final Context f13581b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/view/cell/attachment/view/AttachmentMediaPickerPanel$Companion;", "", "()V", "MAX_MEDIA_SIZE", "", "PICKER_PANEL_HEIGHT", "TAG", "", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.attachment.view.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/bitable/card/view/cell/attachment/view/AttachmentMediaPickerPanel$show$fileSelectConfig$1", "Lcom/bytedance/ee/bear/fileselector/listener/SimpleGetContentViewListener;", "getContentView", "", "contentView", "Landroid/widget/FrameLayout;", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.attachment.view.b$b */
    public static final class C4592b extends SimpleGetContentViewListener {
        C4592b() {
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.attachment.view.b$b$a */
        static final class RunnableC4593a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ FrameLayout f13582a;

            RunnableC4593a(FrameLayout frameLayout) {
                this.f13582a = frameLayout;
            }

            public final void run() {
                ((IWatermarkManager) KoinJavaComponent.m268613a(IWatermarkManager.class, null, null, 6, null)).mo40646a(this.f13582a);
            }
        }

        @Override // com.bytedance.ee.bear.fileselector.listener.IGetContentViewListener, com.bytedance.ee.bear.fileselector.listener.SimpleGetContentViewListener
        /* renamed from: a */
        public void mo18105a(FrameLayout frameLayout) {
            Intrinsics.checkParameterIsNotNull(frameLayout, "contentView");
            frameLayout.post(new RunnableC4593a(frameLayout));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/bitable/card/view/cell/attachment/view/AttachmentMediaPickerPanel$show$fileSelectConfig$2", "Lcom/bytedance/ee/bear/fileselector/listener/SimpleGetContentViewListener;", "getContentView", "", "contentView", "Landroid/widget/FrameLayout;", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.attachment.view.b$c */
    public static final class C4594c extends SimpleGetContentViewListener {
        C4594c() {
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.attachment.view.b$c$a */
        static final class RunnableC4595a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ FrameLayout f13583a;

            RunnableC4595a(FrameLayout frameLayout) {
                this.f13583a = frameLayout;
            }

            public final void run() {
                ((IWatermarkManager) KoinJavaComponent.m268613a(IWatermarkManager.class, null, null, 6, null)).mo40646a(this.f13583a);
            }
        }

        @Override // com.bytedance.ee.bear.fileselector.listener.IGetContentViewListener, com.bytedance.ee.bear.fileselector.listener.SimpleGetContentViewListener
        /* renamed from: a */
        public void mo18105a(FrameLayout frameLayout) {
            Intrinsics.checkParameterIsNotNull(frameLayout, "contentView");
            frameLayout.post(new RunnableC4595a(frameLayout));
        }
    }

    /* renamed from: a */
    public final void mo18103a() {
        Context context = this.f13581b;
        if (context != null) {
            FileSelectorManager.Companion aVar = FileSelectorManager.f21081a;
            FragmentManager supportFragmentManager = ((FragmentActivity) context).getSupportFragmentManager();
            Intrinsics.checkExpressionValueIsNotNull(supportFragmentManager, "activity.supportFragmentManager");
            aVar.mo30482a(supportFragmentManager, "AttachmentMediaPickerPanel");
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
    }

    public AttachmentMediaPickerPanel(Context context) {
        this.f13581b = context;
    }

    /* renamed from: a */
    public final void mo18104a(SimpleFileSelectListener bVar, IFileSizeCheckListener cVar, OnDismissListener fVar, boolean z) {
        FileSelectConfig fileSelectConfig;
        Intrinsics.checkParameterIsNotNull(bVar, "fileSelectListener");
        Intrinsics.checkParameterIsNotNull(cVar, "sizeCheckListener");
        Intrinsics.checkParameterIsNotNull(fVar, "listener");
        Context context = this.f13581b;
        if (context != null) {
            FragmentActivity fragmentActivity = (FragmentActivity) context;
            if (z) {
                fileSelectConfig = ((FileSelectConfig.C7792g) ((FileSelectConfig.C7792g) ((FileSelectConfig.C7792g) FileSelectConfig.larkCamaraBuilder().mo30480a(true).mo30459a(bVar)).mo30458a(fVar)).mo30457a(new C4592b())).mo30455a();
            } else {
                fileSelectConfig = ((FileSelectConfig.C7789d) ((FileSelectConfig.C7789d) ((FileSelectConfig.C7789d) ((FileSelectConfig.C7789d) ((FileSelectConfig.C7789d) ((FileSelectConfig.C7789d) ((FileSelectConfig.C7789d) FileSelectConfig.ccmAlbumBuilder().mo30459a(bVar)).mo30448b(314572800)).mo30446a((long) 314572800)).mo30472j(false).mo30463g(false)).mo30474l(true).mo30456a(cVar)).mo30470i(R.layout.bitable_card_attachment_mediapicker_panel).mo30458a(fVar)).mo30457a(new C4594c())).mo30468h(C57582a.m223600a(324)).mo30455a();
            }
            FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            Intrinsics.checkExpressionValueIsNotNull(supportFragmentManager, "activity.supportFragmentManager");
            Intrinsics.checkExpressionValueIsNotNull(fileSelectConfig, "fileSelectConfig");
            FileSelectorManager.f21081a.mo30481a(fragmentActivity, supportFragmentManager, fileSelectConfig, "AttachmentMediaPickerPanel");
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
    }
}
