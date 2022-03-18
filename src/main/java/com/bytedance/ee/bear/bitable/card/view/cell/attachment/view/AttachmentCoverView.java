package com.bytedance.ee.bear.bitable.card.view.cell.attachment.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.bytedance.ee.bear.AbstractC4967c;
import com.bytedance.ee.bear.bitable.card.model.stmodel.cell.AttachmentEntity;
import com.bytedance.ee.bear.bitable.card.view.cell.attachment.AttachmentUtil;
import com.bytedance.ee.bear.bitable.card.view.cell.attachment.upload.PendingUploadAttachmentEntity;
import com.bytedance.ee.bear.bitable.card.view.cell.attachment.upload.UploadAttachmentEntity;
import com.bytedance.ee.bear.diskmanager.Biz;
import com.bytedance.ee.bear.diskmanager.CCMStorage;
import com.bytedance.ee.bear.fileselector.bean.FileBean;
import com.bytedance.ee.bear.middleground.drive.export.DownloadRequestInfo;
import com.bytedance.ee.bear.middleground.drive.export.DriveFile;
import com.bytedance.ee.util.p718t.C13742g;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView2;
import com.larksuite.suite.R;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.api.DiskCacheStrategy;
import java.io.File;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\u0018\u0000 .2\u00020\u0001:\u0001.B'\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ*\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\n2\u0006\u0010$\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\n2\b\u0010&\u001a\u0004\u0018\u00010\nH\u0002J\u000e\u0010'\u001a\u00020\"2\u0006\u0010(\u001a\u00020\u0007J\u0016\u0010)\u001a\u00020\"2\u0006\u0010*\u001a\u00020\u00152\u0006\u0010$\u001a\u00020\u0007J\u0018\u0010+\u001a\u00020\"2\u0006\u0010#\u001a\u00020\n2\u0006\u0010%\u001a\u00020\nH\u0002J\b\u0010,\u001a\u00020\"H\u0002J\b\u0010-\u001a\u00020\"H\u0002R\u0010\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0004\n\u0002\b\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001cX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0017X\u000e¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/view/cell/attachment/view/AttachmentCoverView;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "TAG", "", "TAG$1", "attachmentViewDelegate", "Lcom/bytedance/ee/bear/bitable/card/view/cell/attachment/view/IAttachmentViewDelegate;", "getAttachmentViewDelegate", "()Lcom/bytedance/ee/bear/bitable/card/view/cell/attachment/view/IAttachmentViewDelegate;", "setAttachmentViewDelegate", "(Lcom/bytedance/ee/bear/bitable/card/view/cell/attachment/view/IAttachmentViewDelegate;)V", "imageLoadStatus", "Lcom/bytedance/ee/bear/middleground/drive/export/DriveFile$Status;", "mAttachmentEntity", "Lcom/bytedance/ee/bear/bitable/card/model/stmodel/cell/AttachmentEntity;", "mCoverBorder", "Landroid/view/View;", "mCoverImageView", "Lcom/larksuite/component/ui/imageview/LKUIRoundedImageView2;", "mPlaceholderContainer", "mPlaceholderIcon", "Landroid/widget/ImageView;", "mPlayVideoIcon", "mUploadBar", "Landroid/widget/ProgressBar;", "mUploadBarContainer", "driveLoadCoverImage", "", "localPath", "priority", "fileName", "extra", "notifyUploadProgress", "uploadProgress", "render", "attachmentEntity", "renderCoverImage", "renderPlaceholderView", "renderUploadingView", "Companion", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class AttachmentCoverView extends RelativeLayout {

    /* renamed from: g */
    public static final Companion f13540g = new Companion(null);

    /* renamed from: a */
    public LKUIRoundedImageView2 f13541a;

    /* renamed from: b */
    public View f13542b;

    /* renamed from: c */
    public View f13543c;

    /* renamed from: d */
    public ImageView f13544d;

    /* renamed from: e */
    public DriveFile.Status f13545e;

    /* renamed from: f */
    public final String f13546f;

    /* renamed from: h */
    private ImageView f13547h;

    /* renamed from: i */
    private View f13548i;

    /* renamed from: j */
    private ProgressBar f13549j;

    /* renamed from: k */
    private AttachmentEntity f13550k;

    /* renamed from: l */
    private AbstractC4596c f13551l;

    public AttachmentCoverView(Context context) {
        this(context, null, 0, 6, null);
    }

    public AttachmentCoverView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/view/cell/attachment/view/AttachmentCoverView$Companion;", "", "()V", "COVER_IMAGE_REQUEST_LENGTH", "", "TAG", "", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.attachment.view.AttachmentCoverView$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final AbstractC4596c getAttachmentViewDelegate() {
        return this.f13551l;
    }

    /* renamed from: b */
    private final void m19054b() {
        this.f13548i.setVisibility(0);
        this.f13544d.setVisibility(8);
        this.f13541a.setImageDrawable(null);
    }

    /* renamed from: a */
    private final void m19052a() {
        AttachmentEntity attachmentEntity = this.f13550k;
        if (attachmentEntity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAttachmentEntity");
        }
        String name = attachmentEntity.getName();
        Intrinsics.checkExpressionValueIsNotNull(name, "mAttachmentEntity.name");
        AttachmentUtil.FileTypeConfig b = AttachmentUtil.m19034b(name);
        this.f13543c.setVisibility(0);
        this.f13543c.setBackgroundColor(getResources().getColor(b.mo18023c()));
        this.f13547h.setImageResource(b.mo18022b());
        this.f13542b.setVisibility(8);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.attachment.view.AttachmentCoverView$b */
    public static final class RunnableC4583b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AttachmentCoverView f13552a;

        /* renamed from: b */
        final /* synthetic */ String f13553b;

        /* renamed from: c */
        final /* synthetic */ String f13554c;

        RunnableC4583b(AttachmentCoverView attachmentCoverView, String str, String str2) {
            this.f13552a = attachmentCoverView;
            this.f13553b = str;
            this.f13554c = str2;
        }

        public final void run() {
            ImageLoader.with(this.f13552a.getContext()).asBitmap().load(this.f13553b).diskCacheStrategy(DiskCacheStrategy.ALL).into(this.f13552a.f13541a);
            int i = 8;
            this.f13552a.f13543c.setVisibility(8);
            this.f13552a.f13542b.setVisibility(0);
            ImageView imageView = this.f13552a.f13544d;
            if (AttachmentUtil.m19035c(this.f13554c)) {
                i = 0;
            }
            imageView.setVisibility(i);
        }
    }

    public final void setAttachmentViewDelegate(AbstractC4596c cVar) {
        this.f13551l = cVar;
    }

    /* renamed from: a */
    public final void mo18071a(int i) {
        this.f13549j.setProgress(i);
    }

    /* renamed from: a */
    public final void mo18073a(String str, String str2) {
        C13742g.m55711d(new RunnableC4583b(this, str, str2));
    }

    /* renamed from: a */
    public final void mo18072a(AttachmentEntity attachmentEntity, int i) {
        PendingUploadAttachmentEntity pendingUploadAttachmentEntity;
        Intrinsics.checkParameterIsNotNull(attachmentEntity, "attachmentEntity");
        this.f13550k = attachmentEntity;
        if (!(attachmentEntity instanceof UploadAttachmentEntity)) {
            this.f13548i.setVisibility(8);
            AttachmentEntity attachmentEntity2 = this.f13550k;
            if (attachmentEntity2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAttachmentEntity");
            }
            String name = attachmentEntity2.getName();
            Intrinsics.checkExpressionValueIsNotNull(name, "mAttachmentEntity.name");
            if (AttachmentUtil.m19033a(name)) {
                CCMStorage.Companion aVar = CCMStorage.f15230a;
                Context context = getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "context");
                File file = new File(aVar.mo21334b(context, Biz.DOCS, "cover"));
                if (!file.exists()) {
                    file.mkdirs();
                }
                StringBuilder sb = new StringBuilder();
                sb.append(file.getAbsolutePath());
                sb.append(File.separator);
                String attachmentToken = attachmentEntity.getAttachmentToken();
                Intrinsics.checkExpressionValueIsNotNull(attachmentToken, "attachmentEntity.attachmentToken");
                Locale locale = Locale.ENGLISH;
                Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.ENGLISH");
                if (attachmentToken != null) {
                    String lowerCase = attachmentToken.toLowerCase(locale);
                    Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                    sb.append(lowerCase);
                    sb.append("_cover.png");
                    String sb2 = sb.toString();
                    boolean exists = new File(sb2).exists();
                    AbstractC4596c cVar = this.f13551l;
                    if (cVar != null) {
                        pendingUploadAttachmentEntity = cVar.mo18009a(attachmentEntity.getAttachmentToken());
                    } else {
                        pendingUploadAttachmentEntity = null;
                    }
                    if (exists) {
                        if (this.f13545e == DriveFile.Status.SUCCESS) {
                            String name2 = attachmentEntity.getName();
                            Intrinsics.checkExpressionValueIsNotNull(name2, "attachmentEntity.name");
                            mo18073a(sb2, name2);
                        }
                    } else if (pendingUploadAttachmentEntity != null) {
                        FileBean photo = pendingUploadAttachmentEntity.getPhoto();
                        Intrinsics.checkExpressionValueIsNotNull(photo, "pendingUploadAttachmentEntity.photo");
                        String path = photo.getPath();
                        Intrinsics.checkExpressionValueIsNotNull(path, "pendingUploadAttachmentEntity.photo.path");
                        String name3 = pendingUploadAttachmentEntity.getName();
                        Intrinsics.checkExpressionValueIsNotNull(name3, "pendingUploadAttachmentEntity.name");
                        mo18073a(path, name3);
                    } else {
                        this.f13541a.setImageDrawable(null);
                        m19052a();
                        AttachmentEntity attachmentEntity3 = this.f13550k;
                        if (attachmentEntity3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mAttachmentEntity");
                        }
                        String name4 = attachmentEntity3.getName();
                        Intrinsics.checkExpressionValueIsNotNull(name4, "mAttachmentEntity.name");
                        AttachmentEntity attachmentEntity4 = this.f13550k;
                        if (attachmentEntity4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mAttachmentEntity");
                        }
                        m19053a(sb2, i, name4, attachmentEntity4.getExtra());
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
            } else {
                m19052a();
            }
        } else if (attachmentEntity instanceof PendingUploadAttachmentEntity) {
            PendingUploadAttachmentEntity pendingUploadAttachmentEntity2 = (PendingUploadAttachmentEntity) attachmentEntity;
            FileBean photo2 = pendingUploadAttachmentEntity2.getPhoto();
            Intrinsics.checkExpressionValueIsNotNull(photo2, "attachmentEntity.photo");
            String path2 = photo2.getPath();
            Intrinsics.checkExpressionValueIsNotNull(path2, "attachmentEntity.photo.path");
            String name5 = pendingUploadAttachmentEntity2.getName();
            Intrinsics.checkExpressionValueIsNotNull(name5, "attachmentEntity.name");
            mo18073a(path2, name5);
        } else {
            m19052a();
            m19054b();
        }
    }

    public AttachmentCoverView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f13545e = DriveFile.Status.SUCCESS;
        String simpleName = AttachmentCoverView.class.getSimpleName();
        Intrinsics.checkExpressionValueIsNotNull(simpleName, "AttachmentCoverView::class.java.simpleName");
        this.f13546f = simpleName;
        LayoutInflater.from(context).inflate(R.layout.bitable_card_attachment_cover_view, this);
        View findViewById = findViewById(R.id.cover_view);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById(R.id.cover_view)");
        this.f13541a = (LKUIRoundedImageView2) findViewById;
        View findViewById2 = findViewById(R.id.cover_border);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "findViewById(R.id.cover_border)");
        this.f13542b = findViewById2;
        View findViewById3 = findViewById(R.id.placeholder_container);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "findViewById(R.id.placeholder_container)");
        this.f13543c = findViewById3;
        View findViewById4 = findViewById(R.id.placeholder_icon);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "findViewById(R.id.placeholder_icon)");
        this.f13547h = (ImageView) findViewById4;
        View findViewById5 = findViewById(R.id.play_video_icon);
        Intrinsics.checkExpressionValueIsNotNull(findViewById5, "findViewById(R.id.play_video_icon)");
        this.f13544d = (ImageView) findViewById5;
        View findViewById6 = findViewById(R.id.upload_progress_container);
        Intrinsics.checkExpressionValueIsNotNull(findViewById6, "findViewById(R.id.upload_progress_container)");
        this.f13548i = findViewById6;
        View findViewById7 = findViewById(R.id.upload_progress_bar);
        Intrinsics.checkExpressionValueIsNotNull(findViewById7, "findViewById(R.id.upload_progress_bar)");
        this.f13549j = (ProgressBar) findViewById7;
    }

    /* renamed from: a */
    private final void m19053a(String str, int i, String str2, String str3) {
        AttachmentCoverView$driveLoadCoverImage$downloadCallback$1 attachmentCoverView$driveLoadCoverImage$downloadCallback$1 = new AttachmentCoverView$driveLoadCoverImage$downloadCallback$1(this, str, str2);
        DownloadRequestInfo.C9355a a = new DownloadRequestInfo.C9355a().mo35662a(str);
        AttachmentEntity attachmentEntity = this.f13550k;
        if (attachmentEntity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAttachmentEntity");
        }
        DownloadRequestInfo.C9355a a2 = a.mo35666b(attachmentEntity.getAttachmentToken()).mo35659a(DownloadRequestInfo.DownloadType.COVER).mo35660a(new DownloadRequestInfo.C9356b(360, 360, "near", false)).mo35656a(i).mo35667b(true).mo35658a(attachmentCoverView$driveLoadCoverImage$downloadCallback$1);
        AttachmentEntity attachmentEntity2 = this.f13550k;
        if (attachmentEntity2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAttachmentEntity");
        }
        ((AbstractC4967c) KoinJavaComponent.m268613a(AbstractC4967c.class, null, null, 6, null)).mo19649a(a2.mo35673h(attachmentEntity2.getExtra()).mo35664a());
        this.f13545e = DriveFile.Status.READY;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AttachmentCoverView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
