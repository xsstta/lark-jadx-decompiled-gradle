package com.bytedance.ee.bear.attachment.filereader;

import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import com.bytedance.ee.bear.attachment.filereader.C4288d;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.facade.common.BaseActivity;
import com.bytedance.ee.bear.facade.common.widget.BearLottieView;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.bear.widgets.BaseTitleBar;
import com.bytedance.ee.bear.widgets.C11811a;
import com.bytedance.ee.bear.widgets.dialog.BearUDDialogBuilder;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.C13671b;
import com.bytedance.ee.util.io.C13675f;
import com.bytedance.ee.util.p718t.C13726a;
import com.larksuite.suite.R;
import com.ss.android.vesdk.p3188b.C63954b;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\b\u0016\u0018\u0000 &2\u00020\u0001:\u0001&B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0004H\u0002J\b\u0010\u0018\u001a\u00020\u0015H\u0002J\b\u0010\u0019\u001a\u00020\u0015H\u0014J\u0012\u0010\u001a\u001a\u00020\u00152\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014J+\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u00132\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060 2\u0006\u0010!\u001a\u00020\"H\u0016¢\u0006\u0002\u0010#J\u0010\u0010$\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0004H\u0002J\b\u0010%\u001a\u00020\u0015H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/bytedance/ee/bear/attachment/filereader/FileReaderActivity;", "Lcom/bytedance/ee/bear/facade/common/BaseActivity;", "()V", "mCurrentFile", "Ljava/io/File;", "mDownloadPath", "", "mFileDriveKey", "mFileId", "mFileMimeType", "mFileName", "mFileSize", "", "mMountNodeToken", "mMountPoint", "mSaveName", "mSaveVideo", "mToken", "mType", "", "checkStoragePermissions", "", "displayFile", "file", "init", "onDestroy", "onDoCreate", "savedInstanceState", "Landroid/os/Bundle;", "onRequestPermissionsResult", "requestCode", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "openWithOtherApp", "saveVideo", "Companion", "attachment-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public class FileReaderActivity extends BaseActivity {

    /* renamed from: d */
    public static final Companion f12841d = new Companion(null);

    /* renamed from: a */
    public String f12842a = "";

    /* renamed from: b */
    public String f12843b = "";

    /* renamed from: c */
    public File f12844c;

    /* renamed from: e */
    private String f12845e = "";

    /* renamed from: f */
    private String f12846f = "";

    /* renamed from: g */
    private String f12847g = "";

    /* renamed from: h */
    private String f12848h = "";

    /* renamed from: i */
    private long f12849i = -1;

    /* renamed from: j */
    private String f12850j = "";

    /* renamed from: k */
    private String f12851k = "";

    /* renamed from: l */
    private String f12852l = "";

    /* renamed from: m */
    private String f12853m = "";

    /* renamed from: n */
    private int f12854n;

    /* renamed from: o */
    private HashMap f12855o;

    /* renamed from: a */
    public View mo16849a(int i) {
        if (this.f12855o == null) {
            this.f12855o = new HashMap();
        }
        View view = (View) this.f12855o.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f12855o.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/attachment/filereader/FileReaderActivity$Companion;", "", "()V", "TAG", "", "attachment-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.attachment.filereader.FileReaderActivity$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/bytedance/ee/bear/attachment/filereader/FileReaderActivity$init$1", "Lcom/bytedance/ee/bear/attachment/filereader/FileDownloadUtil$DownloadCallback;", "onDownloadFailed", "", "onDownloadSuccess", "onDownloading", "progress", "", "attachment-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.attachment.filereader.FileReaderActivity$c */
    public static final class C4276c implements C4288d.AbstractC4293a {

        /* renamed from: a */
        final /* synthetic */ FileReaderActivity f12859a;

        @Override // com.bytedance.ee.bear.attachment.filereader.C4288d.AbstractC4293a
        /* renamed from: a */
        public void mo16858a(int i) {
        }

        @Override // com.bytedance.ee.bear.attachment.filereader.C4288d.AbstractC4293a
        /* renamed from: a */
        public void mo16857a() {
            if (C13726a.m55676b(this.f12859a)) {
                FileReaderActivity fileReaderActivity = this.f12859a;
                fileReaderActivity.mo16852a(FileReaderActivity.m17758a(fileReaderActivity));
                FileReaderUtil.f12887i.mo16889b("client_attachment_cache", "-1", "0");
            }
        }

        @Override // com.bytedance.ee.bear.attachment.filereader.C4288d.AbstractC4293a
        /* renamed from: b */
        public void mo16859b() {
            BearLottieView bearLottieView = (BearLottieView) this.f12859a.mo16849a(R.id.file_reader_loading);
            Intrinsics.checkExpressionValueIsNotNull(bearLottieView, "file_reader_loading");
            bearLottieView.setVisibility(8);
            ((BearLottieView) this.f12859a.mo16849a(R.id.file_reader_loading)).cancelAnimation();
            if (C13726a.m55676b(this.f12859a)) {
                new BearUDDialogBuilder(this.f12859a).mo45362d(R.string.Doc_Facade_DownloadFailed).mo45346a(R.id.ud_dialog_btn_primary, R.string.Doc_Facade_DownloadRetry, new DialogInterface$OnClickListenerC4277a(this)).mo45346a(R.id.ud_dialog_btn_secondary, R.string.Doc_Facade_Cancel, new DialogInterface$OnClickListenerC4278b(this)).mo45355a().show();
                FileReaderUtil.f12887i.mo16889b("client_attachment_downloaddonw_alert", "-1", "0");
                FileReaderUtil.f12887i.mo16889b("client_attachment_cache", "-1", "1");
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C4276c(FileReaderActivity fileReaderActivity) {
            this.f12859a = fileReaderActivity;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "which", "", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.attachment.filereader.FileReaderActivity$c$a */
        static final class DialogInterface$OnClickListenerC4277a implements DialogInterface.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C4276c f12860a;

            DialogInterface$OnClickListenerC4277a(C4276c cVar) {
                this.f12860a = cVar;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                this.f12860a.f12859a.mo16850a();
                FileReaderUtil.f12887i.mo16889b("client_attachment_downloaddonw_alert_goon", "-1", "0");
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "which", "", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.attachment.filereader.FileReaderActivity$c$b */
        static final class DialogInterface$OnClickListenerC4278b implements DialogInterface.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C4276c f12861a;

            DialogInterface$OnClickListenerC4278b(C4276c cVar) {
                this.f12861a = cVar;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                this.f12861a.f12859a.finish();
                FileReaderUtil.f12887i.mo16889b("client_attachment_downloaddonw_alert_cancel", "-1", "0");
            }
        }
    }

    /* renamed from: b */
    public final void mo16853b() {
        if (ContextCompat.checkSelfPermission(this, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            ActivityCompat.requestPermissions(this, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 1);
        } else {
            mo16868c();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.facade.common.LifeCycleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onDestroy() {
        super.onDestroy();
        BearLottieView bearLottieView = (BearLottieView) mo16849a(R.id.file_reader_loading);
        Intrinsics.checkExpressionValueIsNotNull(bearLottieView, "file_reader_loading");
        if (bearLottieView.getVisibility() == 0) {
            ((BearLottieView) mo16849a(R.id.file_reader_loading)).cancelAnimation();
        }
    }

    /* renamed from: c */
    private final void mo16868c() {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = (T) C13671b.m55462a(getApplicationContext(), this.f12850j, null, null);
        AbstractC68307f.m265083a((Object) objectRef.element).mo237985a(C11678b.m48479c()).mo238020d(new C4280e(this)).mo237985a(C11678b.m48481e()).mo238001b(new C4281f(this, objectRef), new C4282g(this));
        FileReaderUtil.f12887i.mo16889b("click_attachment_open", "3", "0");
    }

    /* renamed from: a */
    public final void mo16850a() {
        ((BaseTitleBar) mo16849a(R.id.file_reader_title)).setTitle(this.f12848h);
        File file = this.f12844c;
        if (file == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCurrentFile");
        }
        if (file.exists()) {
            File file2 = this.f12844c;
            if (file2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCurrentFile");
            }
            mo16852a(file2);
            return;
        }
        FrameLayout frameLayout = (FrameLayout) mo16849a(R.id.file_reader_tbsreader);
        Intrinsics.checkExpressionValueIsNotNull(frameLayout, "file_reader_tbsreader");
        frameLayout.setVisibility(8);
        BearLottieView bearLottieView = (BearLottieView) mo16849a(R.id.file_reader_loading);
        Intrinsics.checkExpressionValueIsNotNull(bearLottieView, "file_reader_loading");
        bearLottieView.setVisibility(0);
        ((BearLottieView) mo16849a(R.id.file_reader_loading)).playAnimation();
        LinearLayout linearLayout = (LinearLayout) mo16849a(R.id.file_reader_other);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "file_reader_other");
        linearLayout.setVisibility(8);
        FileDownloadModel fileDownloadModel = new FileDownloadModel(this.f12847g, this.f12845e, this.f12850j, this.f12854n);
        int i = this.f12854n;
        if (i == 0) {
            fileDownloadModel.setToken(this.f12851k);
        } else if (i == 1) {
            fileDownloadModel.setMountNodeToken(this.f12852l);
            fileDownloadModel.setMountPoint(this.f12853m);
        }
        FileReaderUtil.f12887i.mo16884a((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null), fileDownloadModel, new C4276c(this));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "uri", "Landroid/net/Uri;", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.attachment.filereader.FileReaderActivity$e */
    public static final class C4280e<T, R> implements Function<T, R> {

        /* renamed from: a */
        final /* synthetic */ FileReaderActivity f12864a;

        C4280e(FileReaderActivity fileReaderActivity) {
            this.f12864a = fileReaderActivity;
        }

        @Override // io.reactivex.functions.Function
        public /* synthetic */ Object apply(Object obj) {
            return Boolean.valueOf(mo16863a((Uri) obj));
        }

        /* renamed from: a */
        public final boolean mo16863a(Uri uri) {
            Intrinsics.checkParameterIsNotNull(uri, "uri");
            return C13671b.m55469a(this.f12864a.getApplicationContext(), this.f12864a.f12843b, uri);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ File m17758a(FileReaderActivity fileReaderActivity) {
        File file = fileReaderActivity.f12844c;
        if (file == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCurrentFile");
        }
        return file;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/attachment/filereader/FileReaderActivity$displayFile$1", "Lcom/bytedance/ee/bear/widgets/BaseTitleBar$ImageAction;", "performAction", "", "view", "Landroid/view/View;", "attachment-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.attachment.filereader.FileReaderActivity$b */
    public static final class C4273b extends BaseTitleBar.C11803d {

        /* renamed from: a */
        final /* synthetic */ FileReaderActivity f12856a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.attachment.filereader.FileReaderActivity$b$a */
        static final class View$OnClickListenerC4274a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C4273b f12857a;

            View$OnClickListenerC4274a(C4273b bVar) {
                this.f12857a = bVar;
            }

            public final void onClick(View view) {
                this.f12857a.f12856a.f12843b = FileReaderActivity.m17758a(this.f12857a.f12856a).getAbsolutePath();
                this.f12857a.f12856a.mo16853b();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.attachment.filereader.FileReaderActivity$b$b */
        static final class View$OnClickListenerC4275b implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C4273b f12858a;

            View$OnClickListenerC4275b(C4273b bVar) {
                this.f12858a = bVar;
            }

            public final void onClick(View view) {
                C13675f.m55495a(this.f12858a.f12856a, FileReaderActivity.m17758a(this.f12858a.f12856a), this.f12858a.f12856a.f12842a);
                FileReaderUtil.f12887i.mo16889b("click_attachment_open", "2", "0");
            }
        }

        @Override // com.bytedance.ee.bear.widgets.BaseTitleBar.AbstractC11800a, com.bytedance.ee.bear.widgets.BaseTitleBar.C11801b
        /* renamed from: a */
        public void mo16854a(View view) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            C11811a a = C11811a.m48976a(this.f12856a);
            String str = this.f12856a.f12842a;
            if (str != null && StringsKt.contains$default((CharSequence) str, (CharSequence) "video", false, 2, (Object) null)) {
                a.mo45215a(R.string.Doc_Facade_SaveToAlbum, new View$OnClickListenerC4274a(this));
            }
            a.mo45215a(R.string.Doc_Facade_OpenInOtherApp, new View$OnClickListenerC4275b(this)).mo45213a().mo45231c();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4273b(FileReaderActivity fileReaderActivity, int i) {
            super(i);
            this.f12856a = fileReaderActivity;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.attachment.filereader.FileReaderActivity$d */
    public static final class View$OnClickListenerC4279d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ FileReaderActivity f12862a;

        /* renamed from: b */
        final /* synthetic */ File f12863b;

        View$OnClickListenerC4279d(FileReaderActivity fileReaderActivity, File file) {
            this.f12862a = fileReaderActivity;
            this.f12863b = file;
        }

        public final void onClick(View view) {
            FileReaderActivity fileReaderActivity = this.f12862a;
            C13675f.m55495a(fileReaderActivity, this.f12863b, fileReaderActivity.f12842a);
            FileReaderUtil.f12887i.mo16889b("click_attachment_open", "2", "0");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "t", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.attachment.filereader.FileReaderActivity$g */
    public static final class C4282g<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ FileReaderActivity f12867a;

        C4282g(FileReaderActivity fileReaderActivity) {
            this.f12867a = fileReaderActivity;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            FileReaderActivity fileReaderActivity = this.f12867a;
            Toast.showFailureText(fileReaderActivity, fileReaderActivity.getString(R.string.Doc_Facade_SaveFailed), 0);
            C13479a.m54758a("FileReaderActivity", "   save video fail");
        }
    }

    /* renamed from: a */
    public final void mo16852a(File file) {
        ((BaseTitleBar) mo16849a(R.id.file_reader_title)).mo45070a(new C4273b(this, R.drawable.attachment_widget_title_file_reader_more_selector));
        m17759b(file);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", C63954b.f161494a, "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.attachment.filereader.FileReaderActivity$f */
    public static final class C4281f<T> implements Consumer<Boolean> {

        /* renamed from: a */
        final /* synthetic */ FileReaderActivity f12865a;

        /* renamed from: b */
        final /* synthetic */ Ref.ObjectRef f12866b;

        C4281f(FileReaderActivity fileReaderActivity, Ref.ObjectRef objectRef) {
            this.f12865a = fileReaderActivity;
            this.f12866b = objectRef;
        }

        /* renamed from: a */
        public final void accept(Boolean bool) {
            Intrinsics.checkExpressionValueIsNotNull(bool, C63954b.f161494a);
            if (bool.booleanValue()) {
                FileReaderActivity fileReaderActivity = this.f12865a;
                Toast.showSuccessText(fileReaderActivity, fileReaderActivity.getString(R.string.Doc_Attachment_SaveSuccessfully), 0);
                C13671b.m55476e(this.f12865a.getApplicationContext(), this.f12866b.element);
                return;
            }
            FileReaderActivity fileReaderActivity2 = this.f12865a;
            Toast.showFailureText(fileReaderActivity2, fileReaderActivity2.getString(R.string.Doc_Facade_SaveFailed), 0);
            C13479a.m54758a("FileReaderActivity", "   save video fail");
        }
    }

    /* renamed from: b */
    private final void m17759b(File file) {
        ((ImageView) mo16849a(R.id.file_reader_file_icon)).setImageResource(FileReaderUtil.f12887i.mo16880a(this.f12842a));
        TextView textView = (TextView) mo16849a(R.id.file_reader_file_name);
        Intrinsics.checkExpressionValueIsNotNull(textView, "file_reader_file_name");
        textView.setText(this.f12848h);
        TextView textView2 = (TextView) mo16849a(R.id.file_reader_file_size);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "file_reader_file_size");
        textView2.setText(C13675f.m55486a(this.f12849i));
        ((TextView) mo16849a(R.id.file_reader_btn_jump)).setOnClickListener(new View$OnClickListenerC4279d(this, file));
        FrameLayout frameLayout = (FrameLayout) mo16849a(R.id.file_reader_tbsreader);
        Intrinsics.checkExpressionValueIsNotNull(frameLayout, "file_reader_tbsreader");
        frameLayout.setVisibility(8);
        BearLottieView bearLottieView = (BearLottieView) mo16849a(R.id.file_reader_loading);
        Intrinsics.checkExpressionValueIsNotNull(bearLottieView, "file_reader_loading");
        bearLottieView.setVisibility(8);
        ((BearLottieView) mo16849a(R.id.file_reader_loading)).cancelAnimation();
        LinearLayout linearLayout = (LinearLayout) mo16849a(R.id.file_reader_other);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "file_reader_other");
        linearLayout.setVisibility(0);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.facade.common.BaseActivity
    /* renamed from: a */
    public void mo16851a(Bundle bundle) {
        super.mo16851a(bundle);
        setContentView(R.layout.attachment_main_file_reader);
        this.f12845e = FileReaderUtil.f12887i.mo16881a(this);
        this.f12846f = getIntent().getStringExtra("file_reader_file_id");
        this.f12847g = getIntent().getStringExtra("file_reader_file_drive_key");
        this.f12848h = getIntent().getStringExtra("file_reader_file_name");
        this.f12842a = getIntent().getStringExtra("file_reader_file_mime_type");
        this.f12849i = getIntent().getLongExtra("file_reader_file_size", -1);
        this.f12851k = getIntent().getStringExtra("obj_token");
        this.f12854n = getIntent().getIntExtra("file_reader_file_type", 0);
        this.f12852l = getIntent().getStringExtra("file_reader_file_mount_node_token");
        this.f12853m = getIntent().getStringExtra("file_reader_file_mount_point");
        String stringExtra = getIntent().getStringExtra("file_reader_download_path");
        if (!TextUtils.isEmpty(stringExtra)) {
            Intrinsics.checkExpressionValueIsNotNull(stringExtra, "downloadPath");
            this.f12845e = stringExtra;
        }
        this.f12850j = FileReaderUtil.f12887i.mo16882a(this.f12851k, this.f12846f, this.f12848h);
        this.f12844c = new File(this.f12845e, this.f12850j);
        mo16850a();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback, androidx.fragment.app.FragmentActivity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        boolean z;
        boolean z2;
        Intrinsics.checkParameterIsNotNull(strArr, "permissions");
        Intrinsics.checkParameterIsNotNull(iArr, "grantResults");
        if (i == 1) {
            if (iArr.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                ArrayList<Number> arrayList = new ArrayList();
                for (int i2 : iArr) {
                    if (i2 == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        arrayList.add(Integer.valueOf(i2));
                    }
                }
                for (Number number : arrayList) {
                    number.intValue();
                    mo16868c();
                }
                return;
            }
        }
        Toast.showFailureText(this, getString(R.string.Doc_Attachment_SaveNoPermission), 0);
    }
}
