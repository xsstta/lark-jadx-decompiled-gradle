package com.bytedance.ee.bear.attachment.filereader;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.AbstractC5239d;
import com.bytedance.ee.bear.attachment.filereader.C4288d;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.SpaceAttachmentOpenEntity;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.bear.route.PostCard;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.bear.watermark.interfaces.IWatermarkManager;
import com.bytedance.ee.bear.widgets.ConfirmStorageDialog;
import com.bytedance.ee.bear.widgets.dialog.BearUDDialogBuilder;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.C13675f;
import com.bytedance.ee.util.p700c.C13598b;
import com.bytedance.ee.util.p718t.C13748k;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.larksuite.suite.R;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/bytedance/ee/bear/attachment/filereader/FileReaderUtil;", "", "()V", "Companion", "attachment-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.attachment.filereader.e */
public final class FileReaderUtil {

    /* renamed from: a */
    public static final String f12879a = (f12888j + "Download/");

    /* renamed from: b */
    public static final long f12880b = f12880b;

    /* renamed from: c */
    public static final int f12881c = 10;

    /* renamed from: d */
    public static boolean f12882d = false;

    /* renamed from: e */
    public static AbstractC5233x f12883e = null;

    /* renamed from: f */
    public static String f12884f = null;

    /* renamed from: g */
    public static String f12885g = null;

    /* renamed from: h */
    public static String f12886h = null;

    /* renamed from: i */
    public static final Companion f12887i = new Companion(null);

    /* renamed from: j */
    private static final String f12888j = f12888j;

    @JvmStatic
    /* renamed from: a */
    public static final void m17799a(String str, FileClickData fileClickData) {
        f12887i.mo16885a(str, fileClickData);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eJ \u0010\u001f\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J \u0010 \u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0010\u0010!\u001a\u00020\b2\b\u0010\"\u001a\u0004\u0018\u00010#J\u0010\u0010$\u001a\u00020\u00042\b\u0010%\u001a\u0004\u0018\u00010\bJ$\u0010&\u001a\u00020\b2\b\u0010'\u001a\u0004\u0018\u00010\b2\b\u0010(\u001a\u0004\u0018\u00010\b2\b\u0010)\u001a\u0004\u0018\u00010\bJ\"\u0010*\u001a\u00020\u00182\b\u0010'\u001a\u0004\u0018\u00010\b2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0002J\"\u0010/\u001a\u00020\u00182\b\u0010'\u001a\u0004\u0018\u00010\b2\u0006\u00100\u001a\u00020,2\u0006\u00101\u001a\u000202H\u0002J\u001a\u00103\u001a\u00020\u00182\b\u0010'\u001a\u0004\u0018\u00010\b2\u0006\u00100\u001a\u00020,H\u0007J\"\u00104\u001a\u00020\u00182\b\u0010'\u001a\u0004\u0018\u00010\b2\u0006\u00100\u001a\u00020,2\u0006\u00101\u001a\u000202H\u0007J\u0010\u00105\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\bH\u0002J \u00106\u001a\u00020\u00182\u0006\u00107\u001a\u00020\b2\u0006\u00108\u001a\u00020\b2\u0006\u00109\u001a\u00020\bH\u0007J\u0018\u0010:\u001a\u00020\u00182\u0006\u0010+\u001a\u00020,2\u0006\u0010'\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bXD¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\bXD¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000¨\u0006;"}, d2 = {"Lcom/bytedance/ee/bear/attachment/filereader/FileReaderUtil$Companion;", "", "()V", "DELETE_NUM", "", "DOWNLOAD_CACHE", "", "DOWNLOAD_URL_IMMEDIATE", "", "DRIVE_ATTACHMENT_DOC", "DRIVE_ATTACHMENT_SHEET", "DRIVE_ATTACHMENT_SHEET_VC", "GET_DOWNLOAD_URL_BYTEDANCE", "TAG", "downloadPath", "fileReaderPath", "file_id", "file_size", "file_type", "isChecked", "", "mAnalyticService", "Lcom/bytedance/ee/bear/contract/AnalyticService;", "downloadFile", "", "netService", "Lcom/bytedance/ee/bear/contract/NetService;", "downloadModel", "Lcom/bytedance/ee/bear/attachment/filereader/FileDownloadModel;", "callback", "Lcom/bytedance/ee/bear/attachment/filereader/FileDownloadUtil$DownloadCallback;", "downloadFileFromNut", "downloadFileFromTos", "getDownloadPath", "context", "Landroid/content/Context;", "getFileIconByMimeType", "mType", "getSaveName", "token", "fileId", "fileName", "launchFileReaderActivity", "fileClickModel", "Lcom/bytedance/ee/bear/attachment/filereader/FileClickData;", "routerService", "Lcom/bytedance/ee/bear/route/RouteService;", "openDrivePrevie", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "serviceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "openFileReader", "openFileReaderActivity", "removeExceedCache", "reportAnalytic", "event", "openType", HiAnalyticsConstant.HaKey.BI_KEY_RESULT, "setCommonAnalyticParam", "attachment-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.attachment.filereader.e$a */
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo16887a(String str, FileClickData fileClickData, C10917c cVar) {
            Intrinsics.checkParameterIsNotNull(fileClickData, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            Intrinsics.checkParameterIsNotNull(cVar, "serviceContext");
            AccountService.Account d = ((an) KoinJavaComponent.m268613a(an.class, null, null, 6, null)).mo16406d();
            if (d == null) {
                C13479a.m54775e("FileReaderUtil", "openFileReaderActivity()... account is empty");
                return;
            }
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = (T) ((AbstractC10740f) KoinJavaComponent.m268613a(AbstractC10740f.class, null, null, 6, null));
            ConnectionService d2 = C5084ad.m20847d();
            Activity b = objectRef.element.mo17294b();
            if (d.mo19677a()) {
                Companion aVar = this;
                Activity activity = b;
                if (new File(aVar.mo16881a(activity), aVar.mo16882a(str, fileClickData.getFile_id(), fileClickData.getFile_name())).exists()) {
                    aVar.mo16886a(str, fileClickData, (AbstractC10740f) objectRef.element);
                    return;
                }
                Intrinsics.checkExpressionValueIsNotNull(d2, "connectionService");
                ConnectionService.NetworkState b2 = d2.mo20038b();
                Intrinsics.checkExpressionValueIsNotNull(b2, "connectionService.networkState");
                if (b2.mo20041b()) {
                    ConnectionService.NetworkState b3 = d2.mo20038b();
                    Intrinsics.checkExpressionValueIsNotNull(b3, "connectionService.networkState");
                    if (b3.mo20040a() == 1) {
                        aVar.mo16886a(str, fileClickData, (AbstractC10740f) objectRef.element);
                        return;
                    }
                    Intrinsics.checkExpressionValueIsNotNull(b, "activity");
                    new BearUDDialogBuilder(activity).mo45362d(R.string.Doc_Attachment_NotInWIFI).mo45346a(R.id.ud_dialog_btn_primary, R.string.Doc_Attachment_ContinueLook, new DialogInterface$OnClickListenerC4304h(str, fileClickData, objectRef)).mo45346a(R.id.ud_dialog_btn_secondary, R.string.Doc_Facade_Cancel, DialogInterface$OnClickListenerC4305i.f12908a).mo45355a().show();
                    aVar.mo16889b("client_attachment_alert", "-1", "0");
                    return;
                }
                Toast.showFailureText(activity, b.getString(R.string.Doc_Facade_NetworkInterrutedRetry), 0);
                return;
            }
            C13479a.m54758a("FileReaderUtil", "onFileClick account error ");
        }

        /* renamed from: a */
        public final void mo16886a(String str, FileClickData fileClickData, AbstractC10740f fVar) {
            PostCard a = fVar.mo17295b("/doc/filereader/activity").mo17314a("file_reader_file_id", fileClickData.getFile_id()).mo17314a("file_reader_file_drive_key", fileClickData.getDrive_file_key()).mo17314a("file_reader_file_name", fileClickData.getFile_name()).mo17314a("file_reader_file_mime_type", fileClickData.getFile_mime_type()).mo17314a("file_reader_file_mount_node_token", fileClickData.getMount_node_token()).mo17314a("file_reader_file_mount_point", fileClickData.getMount_point()).mo17308a("file_reader_file_type", fileClickData.getType()).mo17309a("file_reader_file_size", fileClickData.getFile_size());
            if (str == null) {
                str = "";
            }
            a.mo17314a("obj_token", str).mo17314a("file_reader_download_path", fileClickData.getDownLoadPath()).mo17317a();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/bytedance/ee/bear/attachment/filereader/FileReaderUtil$Companion$openFileReader$storageDialog$1", "Lcom/bytedance/ee/bear/widgets/ConfirmStorageDialog$ConfirmCallBack;", "onContinue", "", "attachment-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.attachment.filereader.e$a$g */
        public static final class C4303g implements ConfirmStorageDialog.ConfirmCallBack {

            /* renamed from: a */
            final /* synthetic */ String f12902a;

            /* renamed from: b */
            final /* synthetic */ FileClickData f12903b;

            /* renamed from: c */
            final /* synthetic */ C10917c f12904c;

            @Override // com.bytedance.ee.bear.widgets.ConfirmStorageDialog.ConfirmCallBack
            public void onContinue() {
                FileReaderUtil.f12887i.mo16887a(this.f12902a, this.f12903b, this.f12904c);
            }

            C4303g(String str, FileClickData fileClickData, C10917c cVar) {
                this.f12902a = str;
                this.f12903b = fileClickData;
                this.f12904c = cVar;
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "apply"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.attachment.filereader.e$a$a */
        public static final class C4294a<T, R> implements Function<T, R> {

            /* renamed from: a */
            final /* synthetic */ FileDownloadModel f12889a;

            C4294a(FileDownloadModel fileDownloadModel) {
                this.f12889a = fileDownloadModel;
            }

            @Override // io.reactivex.functions.Function
            public /* synthetic */ Object apply(Object obj) {
                mo16890a((String) obj);
                return Unit.INSTANCE;
            }

            /* renamed from: a */
            public final void mo16890a(String str) {
                Intrinsics.checkParameterIsNotNull(str, "it");
                Companion aVar = FileReaderUtil.f12887i;
                String downloadPath = this.f12889a.getDownloadPath();
                Intrinsics.checkExpressionValueIsNotNull(downloadPath, "downloadModel.downloadPath");
                aVar.mo16888b(downloadPath);
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "apply"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.attachment.filereader.e$a$d */
        public static final class C4299d<T, R> implements Function<T, R> {

            /* renamed from: a */
            final /* synthetic */ FileDownloadModel f12896a;

            C4299d(FileDownloadModel fileDownloadModel) {
                this.f12896a = fileDownloadModel;
            }

            @Override // io.reactivex.functions.Function
            public /* synthetic */ Object apply(Object obj) {
                mo16895a((String) obj);
                return Unit.INSTANCE;
            }

            /* renamed from: a */
            public final void mo16895a(String str) {
                Intrinsics.checkParameterIsNotNull(str, "it");
                Companion aVar = FileReaderUtil.f12887i;
                String downloadPath = this.f12896a.getDownloadPath();
                Intrinsics.checkExpressionValueIsNotNull(downloadPath, "downloadModel.downloadPath");
                aVar.mo16888b(downloadPath);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "t", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.attachment.filereader.e$a$c */
        public static final class C4297c<T> implements Consumer<Throwable> {

            /* renamed from: a */
            final /* synthetic */ C4288d.AbstractC4293a f12894a;

            C4297c(C4288d.AbstractC4293a aVar) {
                this.f12894a = aVar;
            }

            /* renamed from: a */
            public final void accept(Throwable th) {
                C13479a.m54759a("FileReaderActivity", "   4downloadFileFromNut  fail : ", th);
                C13748k.m55732a(new Runnable(this) {
                    /* class com.bytedance.ee.bear.attachment.filereader.FileReaderUtil.Companion.C4297c.RunnableC42981 */

                    /* renamed from: a */
                    final /* synthetic */ C4297c f12895a;

                    {
                        this.f12895a = r1;
                    }

                    public final void run() {
                        this.f12895a.f12894a.mo16859b();
                    }
                });
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "t", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.attachment.filereader.e$a$f */
        public static final class C4301f<T> implements Consumer<Throwable> {

            /* renamed from: a */
            final /* synthetic */ C4288d.AbstractC4293a f12900a;

            C4301f(C4288d.AbstractC4293a aVar) {
                this.f12900a = aVar;
            }

            /* renamed from: a */
            public final void accept(Throwable th) {
                C13479a.m54759a("FileReaderActivity", " downloadFileFromTos fail ", th);
                C13748k.m55732a(new Runnable(this) {
                    /* class com.bytedance.ee.bear.attachment.filereader.FileReaderUtil.Companion.C4301f.RunnableC43021 */

                    /* renamed from: a */
                    final /* synthetic */ C4301f f12901a;

                    {
                        this.f12901a = r1;
                    }

                    public final void run() {
                        this.f12901a.f12900a.mo16859b();
                    }
                });
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "accept", "(Lkotlin/Unit;)V"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.attachment.filereader.e$a$e */
        public static final class C4300e<T> implements Consumer<Unit> {

            /* renamed from: a */
            final /* synthetic */ FileDownloadModel f12897a;

            /* renamed from: b */
            final /* synthetic */ NetService f12898b;

            /* renamed from: c */
            final /* synthetic */ C4288d.AbstractC4293a f12899c;

            C4300e(FileDownloadModel fileDownloadModel, NetService netService, C4288d.AbstractC4293a aVar) {
                this.f12897a = fileDownloadModel;
                this.f12898b = netService;
                this.f12899c = aVar;
            }

            /* renamed from: a */
            public final void accept(Unit unit) {
                NetService netService = this.f12898b;
                C4288d.m17792a(netService, "https://" + C6313i.f17510b + "/space/api/box/stream/download/all/" + this.f12897a.getFileDriverKey() + "?mount_node_token=" + this.f12897a.getMountNodeToken() + "&mount_point=" + this.f12897a.getMountPoint(), this.f12897a.getDownloadPath() + this.f12897a.getSaveName(), this.f12899c);
            }
        }

        /* renamed from: a */
        public final String mo16881a(Context context) {
            String str = C13675f.m55487a(context) + FileReaderUtil.f12879a;
            File file = new File(str);
            if (!file.exists() && !file.mkdirs()) {
                C13479a.m54764b("FileReaderActivity", " getDownloadPath create downloadPath fail ");
            }
            return str;
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "accept", "(Lkotlin/Unit;)V"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.attachment.filereader.e$a$b */
        public static final class C4295b<T> implements Consumer<Unit> {

            /* renamed from: a */
            final /* synthetic */ FileDownloadModel f12890a;

            /* renamed from: b */
            final /* synthetic */ NetService f12891b;

            /* renamed from: c */
            final /* synthetic */ C4288d.AbstractC4293a f12892c;

            C4295b(FileDownloadModel fileDownloadModel, NetService netService, C4288d.AbstractC4293a aVar) {
                this.f12890a = fileDownloadModel;
                this.f12891b = netService;
                this.f12892c = aVar;
            }

            /* renamed from: a */
            public final void accept(Unit unit) {
                String str = "https://" + C6313i.f17510b + "/space/api/drive/getdownloadurl/";
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", (Object) this.f12890a.getToken());
                jSONObject.put("drive_file_key", (Object) this.f12890a.getFileDriverKey());
                Response a = this.f12891b.mo20120a(new Request.Builder().url(str).post(RequestBody.create(MediaType.parse("application/json"), jSONObject.toJSONString())).build());
                if (a == null || !a.isSuccessful()) {
                    C13479a.m54758a("FileReaderActivity", "   3downloadFile   fail url: " + C13598b.m55197d(str));
                    C13748k.m55732a(new Runnable(this) {
                        /* class com.bytedance.ee.bear.attachment.filereader.FileReaderUtil.Companion.C4295b.RunnableC42961 */

                        /* renamed from: a */
                        final /* synthetic */ C4295b f12893a;

                        {
                            this.f12893a = r1;
                        }

                        public final void run() {
                            this.f12893a.f12892c.mo16859b();
                        }
                    });
                    return;
                }
                ResponseBody body = a.body();
                if (body == null) {
                    Intrinsics.throwNpe();
                }
                C4288d.m17793a(new org.json.JSONObject(body.string()).optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE).optString("downloadurl"), this.f12890a.getDownloadPath() + this.f12890a.getSaveName(), this.f12892c);
            }
        }

        /* renamed from: a */
        public final int mo16880a(String str) {
            if (TextUtils.isEmpty(str)) {
                return R.drawable.icon_file_default;
            }
            if (str == null) {
                Intrinsics.throwNpe();
            }
            if (str != null) {
                String lowerCase = str.toLowerCase();
                Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase()");
                String str2 = lowerCase;
                if (StringsKt.contains$default((CharSequence) str2, (CharSequence) "pdf", false, 2, (Object) null)) {
                    return R.drawable.icon_file_pdf;
                }
                if (StringsKt.contains$default((CharSequence) str2, (CharSequence) "ms-powerpoint", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str2, (CharSequence) "presentationml", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str2, (CharSequence) "ms-works", false, 2, (Object) null)) {
                    return R.drawable.icon_file_ppt;
                }
                if (StringsKt.contains$default((CharSequence) str2, (CharSequence) "rtf", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str2, (CharSequence) "msword", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str2, (CharSequence) "wordprocessingml", false, 2, (Object) null)) {
                    return R.drawable.icon_file_doc;
                }
                if (StringsKt.contains$default((CharSequence) str2, (CharSequence) "ms-excel", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str2, (CharSequence) "spreadsheetml", false, 2, (Object) null)) {
                    return R.drawable.icon_file_xls;
                }
                if (StringsKt.contains$default((CharSequence) str2, (CharSequence) "zip", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str2, (CharSequence) "rar", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str2, (CharSequence) "compress", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str2, (CharSequence) "tar", false, 2, (Object) null)) {
                    return R.drawable.icon_file_zip;
                }
                if (StringsKt.contains$default((CharSequence) str2, (CharSequence) "video", false, 2, (Object) null)) {
                    return R.drawable.icon_file_video;
                }
                if (StringsKt.contains$default((CharSequence) str2, (CharSequence) "android.package", false, 2, (Object) null)) {
                    return R.drawable.attachment_icon_file_apk;
                }
                if (StringsKt.contains$default((CharSequence) str2, (CharSequence) "audio", false, 2, (Object) null)) {
                    return R.drawable.attachment_icon_file_audio;
                }
                return R.drawable.icon_file_default;
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }

        /* renamed from: b */
        public final void mo16888b(String str) {
            if (!FileReaderUtil.f12882d) {
                FileReaderUtil.f12882d = true;
                try {
                    if (C13675f.m55531f(new File(str)) > FileReaderUtil.f12880b) {
                        List<File> i = C13675f.m55538i(new File(str));
                        int i2 = 0;
                        int i3 = FileReaderUtil.f12881c;
                        if (i3 >= 0) {
                            while (true) {
                                C13675f.m55498a(i.get(i2));
                                if (i2 != i3) {
                                    i2++;
                                } else {
                                    return;
                                }
                            }
                        }
                    }
                } catch (Exception e) {
                    C13479a.m54759a("FileReaderActivity", "removeExceedCache fail ", e);
                }
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "which", "", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.attachment.filereader.e$a$i */
        public static final class DialogInterface$OnClickListenerC4305i implements DialogInterface.OnClickListener {

            /* renamed from: a */
            public static final DialogInterface$OnClickListenerC4305i f12908a = new DialogInterface$OnClickListenerC4305i();

            DialogInterface$OnClickListenerC4305i() {
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                FileReaderUtil.f12887i.mo16889b("client_attachment_alert_cancel", "-1", "0");
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "which", "", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.attachment.filereader.e$a$h */
        public static final class DialogInterface$OnClickListenerC4304h implements DialogInterface.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ String f12905a;

            /* renamed from: b */
            final /* synthetic */ FileClickData f12906b;

            /* renamed from: c */
            final /* synthetic */ Ref.ObjectRef f12907c;

            DialogInterface$OnClickListenerC4304h(String str, FileClickData fileClickData, Ref.ObjectRef objectRef) {
                this.f12905a = str;
                this.f12906b = fileClickData;
                this.f12907c = objectRef;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                FileReaderUtil.f12887i.mo16886a(this.f12905a, this.f12906b, (AbstractC10740f) this.f12907c.element);
                FileReaderUtil.f12887i.mo16889b("client_attachment_alert_goon", "-1", "0");
            }
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo16883a(FileClickData fileClickData, String str) {
            Intrinsics.checkParameterIsNotNull(fileClickData, "fileClickModel");
            Intrinsics.checkParameterIsNotNull(str, "token");
            FileReaderUtil.f12884f = C13598b.m55197d(str);
            FileReaderUtil.f12885g = "." + C13675f.m55528e(fileClickData.getFile_name());
            FileReaderUtil.f12886h = String.valueOf(fileClickData.getFile_size());
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo16885a(String str, FileClickData fileClickData) {
            String str2;
            Intrinsics.checkParameterIsNotNull(fileClickData, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            Companion aVar = this;
            if (str != null) {
                str2 = str;
            } else {
                str2 = "";
            }
            aVar.mo16883a(fileClickData, str2);
            aVar.mo16889b("click_attachment_preview", "-1", "0");
            C10917c cVar = new C10917c(new C10929e());
            AbstractC10740f fVar = (AbstractC10740f) KoinJavaComponent.m268613a(AbstractC10740f.class, null, null, 6, null);
            if (fileClickData.getType() == 1) {
                aVar.m17802b(str, fileClickData, cVar);
                return;
            }
            Activity b = fVar.mo17294b();
            Intrinsics.checkExpressionValueIsNotNull(b, "routerService.currentActivity");
            ConfirmStorageDialog bVar = new ConfirmStorageDialog(b, new C4303g(str, fileClickData, cVar));
            bVar.mo45265d();
            ((IWatermarkManager) KoinJavaComponent.m268613a(IWatermarkManager.class, null, null, 6, null)).mo40644a(bVar.mo45264c());
        }

        /* renamed from: a */
        public final String mo16882a(String str, String str2, String str3) {
            return str + "_" + str2 + "_" + str3;
        }

        /* renamed from: a */
        private final void m17800a(FileDownloadModel fileDownloadModel, NetService netService, C4288d.AbstractC4293a aVar) {
            AbstractC68307f.m265083a("").mo237985a(C11678b.m48477a()).mo238020d(new C4299d(fileDownloadModel)).mo238001b(new C4300e(fileDownloadModel, netService, aVar), new C4301f(aVar));
        }

        /* renamed from: b */
        private final void m17801b(FileDownloadModel fileDownloadModel, NetService netService, C4288d.AbstractC4293a aVar) {
            AbstractC68307f.m265083a("").mo237985a(C11678b.m48477a()).mo238020d(new C4294a(fileDownloadModel)).mo238001b(new C4295b(fileDownloadModel, netService, aVar), new C4297c(aVar));
        }

        /* renamed from: b */
        private final void m17802b(String str, FileClickData fileClickData, C10917c cVar) {
            String str2;
            Activity b = ((AbstractC10740f) KoinJavaComponent.m268613a(AbstractC10740f.class, null, null, 6, null)).mo17294b();
            if (StringsKt.equals("sheet_attach", fileClickData.getPreview_from(), true) || StringsKt.equals("sheet_attach_vcFollow", fileClickData.getPreview_from(), true)) {
                str2 = "45";
            } else {
                str2 = "19";
            }
            SpaceAttachmentOpenEntity spaceAttachmentOpenEntity = new SpaceAttachmentOpenEntity(str2, fileClickData.getDrive_file_key(), fileClickData.getFile_name());
            spaceAttachmentOpenEntity.setPreviewFrom(fileClickData.getPreview_from());
            spaceAttachmentOpenEntity.setMountNodeToken(fileClickData.getMount_node_token());
            spaceAttachmentOpenEntity.setMountPoint(fileClickData.getMount_point());
            spaceAttachmentOpenEntity.setUniqueId(fileClickData.getDrive_file_key());
            spaceAttachmentOpenEntity.setBusinessId(fileClickData.getPreview_from());
            ((AbstractC5239d) KoinJavaComponent.m268613a(AbstractC5239d.class, null, null, 6, null)).mo21092a(b, spaceAttachmentOpenEntity);
        }

        @JvmStatic
        /* renamed from: b */
        public final void mo16889b(String str, String str2, String str3) {
            Intrinsics.checkParameterIsNotNull(str, "event");
            Intrinsics.checkParameterIsNotNull(str2, "openType");
            Intrinsics.checkParameterIsNotNull(str3, HiAnalyticsConstant.HaKey.BI_KEY_RESULT);
            if (FileReaderUtil.f12883e == null) {
                FileReaderUtil.f12883e = C5234y.m21391b();
            }
            HashMap hashMap = new HashMap();
            hashMap.put("file_id", FileReaderUtil.f12884f);
            hashMap.put("file_type", FileReaderUtil.f12885g);
            hashMap.put("file_size", FileReaderUtil.f12886h);
            if (!Intrinsics.areEqual(str2, "-1")) {
                hashMap.put("open_type", str2);
            }
            hashMap.put("status_code", str3);
            AbstractC5233x xVar = FileReaderUtil.f12883e;
            if (xVar != null) {
                xVar.mo21079a(str, hashMap);
            }
        }

        /* renamed from: a */
        public final void mo16884a(NetService netService, FileDownloadModel fileDownloadModel, C4288d.AbstractC4293a aVar) {
            Intrinsics.checkParameterIsNotNull(netService, "netService");
            Intrinsics.checkParameterIsNotNull(fileDownloadModel, "downloadModel");
            Intrinsics.checkParameterIsNotNull(aVar, "callback");
            if (fileDownloadModel.getType() == 0) {
                m17801b(fileDownloadModel, netService, aVar);
            } else if (fileDownloadModel.getType() == 1) {
                m17800a(fileDownloadModel, netService, aVar);
            } else {
                C13479a.m54758a("FileReaderUtil", "download type can not parse");
            }
        }
    }
}
