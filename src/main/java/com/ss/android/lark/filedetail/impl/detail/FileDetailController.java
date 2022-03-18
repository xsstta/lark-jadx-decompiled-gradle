package com.ss.android.lark.filedetail.impl.detail;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BaseMoreMenuAction;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.LocalOpenEntity;
import com.bytedance.ee.util.io.C13675f;
import com.bytedance.ee.util.p702e.C13657b;
import com.bytedance.ee.util.p718t.C13749l;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.FileContent;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.base.DesktopConstants;
import com.ss.android.lark.desktopmode.base.FloatWindowParams;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.filedetail.FileDetailModule;
import com.ss.android.lark.filedetail.dto.FileDetailLaunchParams;
import com.ss.android.lark.filedetail.impl.FileDetailFragment;
import com.ss.android.lark.filedetail.impl.open.C38279a;
import com.ss.android.lark.filedetail.impl.open.C38303c;
import com.ss.android.lark.filedetail.impl.open.OpenFileParams;
import com.ss.android.lark.filedetail.impl.open.diver.DriverSDKFileOpenManager;
import com.ss.android.lark.filedetail.p1885a.AbstractC38197a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.navigation.Navigation;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002J\u001e\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\t2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0012H\u0002J:\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0017\u001a\u00020\u00042\u0016\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u001a0\u0019j\b\u0012\u0004\u0012\u00020\u001a`\u001bJ\u0010\u0010\u001c\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tH\u0002J\u000e\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tJ.\u0010\u001f\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u0004J\u000e\u0010&\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010'\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/ss/android/lark/filedetail/impl/detail/FileDetailController;", "", "()V", "SECRET_FILE_APP_ID", "", "TAG", "canPreviewFile", "", "params", "Lcom/ss/android/lark/filedetail/dto/FileDetailLaunchParams;", "checkAndInit", "", "checkMessagesRecalled", "msgList", "", "Lcom/ss/android/lark/chat/entity/message/Message;", "checkParams", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "getLocalPreviewFragment", "Landroidx/fragment/app/Fragment;", "fileName", "fileType", "filePath", "menuActionList", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/contract/drive/sdk/entity/menu/BaseMoreMenuAction;", "Lkotlin/collections/ArrayList;", "isLocalFile", "open", "openFileMessageDetail", "openLKPFile", "context", "Landroid/content/Context;", "file", "Ljava/io/File;", "mime", "fileKey", "openLocalFileDetail", "processBuildInFile", "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.filedetail.impl.detail.a */
public final class FileDetailController {

    /* renamed from: a */
    public static final FileDetailController f98037a = new FileDetailController();

    private FileDetailController() {
    }

    /* renamed from: a */
    public final void mo139809a() {
        DriverSDKFileOpenManager.f98357c.mo140081a().mo140078a();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onOpenPage"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.filedetail.impl.detail.a$b */
    public static final class C38231b implements Navigation.AbstractC57856b {

        /* renamed from: a */
        final /* synthetic */ FileDetailLaunchParams f98040a;

        C38231b(FileDetailLaunchParams fileDetailLaunchParams) {
            this.f98040a = fileDetailLaunchParams;
        }

        @Override // com.ss.android.lark.utils.navigation.Navigation.AbstractC57856b
        public final void onOpenPage() {
            FileDetailFragment fileDetailFragment = new FileDetailFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable("extra.launch.params", this.f98040a);
            fileDetailFragment.setArguments(bundle);
            C36512a.m144041a().mo134762a(fileDetailFragment, new FloatWindowParams.C36567a(DesktopConstants.UIType.FLOAT_MODAL_THIN_M2).mo134930b());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"com/ss/android/lark/filedetail/impl/detail/FileDetailController$openFileMessageDetail$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/Boolean;)V", "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.filedetail.impl.detail.a$c */
    public static final class C38232c implements IGetDataCallback<Boolean> {

        /* renamed from: a */
        final /* synthetic */ FileDetailLaunchParams f98041a;

        C38232c(FileDetailLaunchParams fileDetailLaunchParams) {
            this.f98041a = fileDetailLaunchParams;
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("FileDetailController", "check params failed:" + errorResult.getDebugMsg());
        }

        /* renamed from: a */
        public void onSuccess(Boolean bool) {
            Context context;
            if (bool != null) {
                if (bool.booleanValue()) {
                    FileDetailController.f98037a.mo139814c(this.f98041a);
                    return;
                }
                AbstractC38197a a = FileDetailModule.f97880b.mo139564a();
                Context context2 = null;
                if (a != null) {
                    context = a.getContext();
                } else {
                    context = null;
                }
                AbstractC38197a a2 = FileDetailModule.f97880b.mo139564a();
                if (a2 != null) {
                    context2 = a2.getContext();
                }
                LKUIToast.show(context, C13749l.m55745a(context2, (int) R.string.Lark_Legacy_FileHasBeenRecalledCanNotDownload));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/filedetail/impl/detail/FileDetailController$checkParams$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Lcom/ss/android/lark/chat/entity/message/Message;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.filedetail.impl.detail.a$a */
    public static final class C38230a implements IGetDataCallback<List<? extends Message>> {

        /* renamed from: a */
        final /* synthetic */ ArrayList f98038a;

        /* renamed from: b */
        final /* synthetic */ IGetDataCallback f98039b;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f98039b.onError(errorResult);
        }

        /* renamed from: a */
        public void onSuccess(List<? extends Message> list) {
            if (list != null) {
                this.f98038a.addAll(list);
            }
            this.f98039b.onSuccess(Boolean.valueOf(FileDetailController.f98037a.mo139812a(this.f98038a)));
        }

        C38230a(ArrayList arrayList, IGetDataCallback iGetDataCallback) {
            this.f98038a = arrayList;
            this.f98039b = iGetDataCallback;
        }
    }

    /* renamed from: b */
    public final void mo139813b(FileDetailLaunchParams fileDetailLaunchParams) {
        Intrinsics.checkParameterIsNotNull(fileDetailLaunchParams, "params");
        mo139814c(fileDetailLaunchParams);
    }

    /* renamed from: a */
    public final void mo139811a(FileDetailLaunchParams fileDetailLaunchParams) {
        Intrinsics.checkParameterIsNotNull(fileDetailLaunchParams, "params");
        m150354a(fileDetailLaunchParams, new UIGetDataCallback(new C38232c(fileDetailLaunchParams)));
    }

    /* renamed from: f */
    private final boolean m150357f(FileDetailLaunchParams fileDetailLaunchParams) {
        Message.Type type;
        FileContent fileContent;
        Message message = fileDetailLaunchParams.getMessage();
        if (message != null) {
            type = message.getType();
        } else {
            type = null;
        }
        if (type == Message.Type.FILE) {
            fileContent = (FileContent) fileDetailLaunchParams.getMessage().getContent();
        } else {
            fileContent = fileDetailLaunchParams.getFileContent();
        }
        Intrinsics.checkExpressionValueIsNotNull(fileContent, "if (params.message?.type…) else params.fileContent");
        return new File(fileContent.getKey()).exists();
    }

    /* renamed from: e */
    private final boolean m150356e(FileDetailLaunchParams fileDetailLaunchParams) {
        Context context;
        AbstractC38197a a = FileDetailModule.f97880b.mo139564a();
        if (a == null || !a.isFeatureGatingEnable("lark.file_preview") || m150357f(fileDetailLaunchParams) || fileDetailLaunchParams.getDownloadFileScene() == 3) {
            return false;
        }
        AbstractC38197a a2 = FileDetailModule.f97880b.mo139564a();
        if (a2 != null) {
            context = a2.getContext();
        } else {
            context = null;
        }
        if (context != null && DesktopUtil.m144301a(context)) {
            return false;
        }
        DriverSDKFileOpenManager.Companion aVar = DriverSDKFileOpenManager.f98357c;
        String g = C13675f.m55534g(fileDetailLaunchParams.getFileContent().getName());
        Intrinsics.checkExpressionValueIsNotNull(g, "FileUtils.getFileExtensi…(params.fileContent.name)");
        return aVar.mo140082a(g, fileDetailLaunchParams.isSecret());
    }

    /* renamed from: c */
    public final void mo139814c(FileDetailLaunchParams fileDetailLaunchParams) {
        Context context;
        AbstractC38197a.AbstractC38204g featureConfigDependency;
        AbstractC38197a a = FileDetailModule.f97880b.mo139564a();
        if (a != null && (featureConfigDependency = a.getFeatureConfigDependency()) != null && !featureConfigDependency.mo139623a()) {
            Context context2 = fileDetailLaunchParams.getContext().get();
            if (context2 != null) {
                LKUIToast.show(context2, (int) R.string.Lark_Chat_FileSecurityRestrictDownloadActionGeneralMessage);
            }
        } else if (!m150355d(fileDetailLaunchParams) && (context = fileDetailLaunchParams.getContext().get()) != null) {
            Intrinsics.checkExpressionValueIsNotNull(context, "params.context.get()?:return");
            Navigation from = Navigation.from(context);
            Intrinsics.checkExpressionValueIsNotNull(from, "Navigation.from(context)");
            if (!DesktopUtil.m144301a(context)) {
                Intent intent = new Intent(context, FileDetailActivity.class);
                intent.putExtra("extra.launch.params", fileDetailLaunchParams);
                from.openActivity(intent);
                return;
            }
            String qualifiedName = Reflection.getOrCreateKotlinClass(FileDetailActivity.class).getQualifiedName();
            if (qualifiedName == null) {
                Intrinsics.throwNpe();
            }
            from.openActivity(qualifiedName, new C38231b(fileDetailLaunchParams));
        }
    }

    /* renamed from: d */
    private final boolean m150355d(FileDetailLaunchParams fileDetailLaunchParams) {
        if (m150356e(fileDetailLaunchParams)) {
            Log.m165389i("FileDetailController", "driver sdk preview!");
            DriverSDKFileOpenManager.f98357c.mo140081a().mo140079a(fileDetailLaunchParams);
            return true;
        } else if (!C38279a.m150665a().mo140046a(fileDetailLaunchParams.getFileContent())) {
            return false;
        } else {
            OpenFileParams a = OpenFileParams.Companion.mo140044a().mo140035a(fileDetailLaunchParams.getFileContent()).mo140036a(fileDetailLaunchParams.getMessageId()).mo140033a(fileDetailLaunchParams.getJumpPosition()).mo140040b(fileDetailLaunchParams.getChatId()).mo140037a(fileDetailLaunchParams.isSecret()).mo140043d(fileDetailLaunchParams.getThreadId()).mo140041b(fileDetailLaunchParams.isFromFolderManage()).mo140038a();
            Context context = fileDetailLaunchParams.getContext().get();
            if (context == null) {
                return false;
            }
            Intrinsics.checkExpressionValueIsNotNull(context, "params.context.get()?:return false");
            return C38279a.m150665a().mo140045a(context, fileDetailLaunchParams.getFileContent(), a);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x000a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo139812a(java.util.List<? extends com.ss.android.lark.chat.entity.message.Message> r3) {
        /*
            r2 = this;
            java.util.Iterator r3 = r3.iterator()
        L_0x0004:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x001e
            java.lang.Object r0 = r3.next()
            com.ss.android.lark.chat.entity.message.Message r0 = (com.ss.android.lark.chat.entity.message.Message) r0
            boolean r1 = r0.isRecalled()
            if (r1 != 0) goto L_0x001c
            boolean r0 = r0.isSourceFileDelete()
            if (r0 == 0) goto L_0x0004
        L_0x001c:
            r3 = 0
            return r3
        L_0x001e:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.filedetail.impl.detail.FileDetailController.mo139812a(java.util.List):boolean");
    }

    /* renamed from: a */
    private final void m150354a(FileDetailLaunchParams fileDetailLaunchParams, IGetDataCallback<Boolean> iGetDataCallback) {
        AbstractC38197a.AbstractC38199b chatDependency;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (fileDetailLaunchParams.getMessage() == null) {
            arrayList.add(fileDetailLaunchParams.getMessageId());
        } else {
            arrayList2.add(fileDetailLaunchParams.getMessage());
        }
        if (!TextUtils.isEmpty(fileDetailLaunchParams.getMergeMsgId())) {
            arrayList.add(fileDetailLaunchParams.getMergeMsgId());
        }
        if (C13657b.m55423b(arrayList)) {
            AbstractC38197a a = FileDetailModule.f97880b.mo139564a();
            if (a != null && (chatDependency = a.getChatDependency()) != null) {
                chatDependency.mo139602a(arrayList, new C38230a(arrayList2, iGetDataCallback));
                return;
            }
            return;
        }
        iGetDataCallback.onSuccess(Boolean.valueOf(mo139812a(arrayList2)));
    }

    /* renamed from: a */
    public final Fragment mo139808a(String str, String str2, String str3, ArrayList<BaseMoreMenuAction> arrayList) {
        Intrinsics.checkParameterIsNotNull(str, "fileName");
        Intrinsics.checkParameterIsNotNull(str3, "filePath");
        Intrinsics.checkParameterIsNotNull(arrayList, "menuActionList");
        return DriverSDKFileOpenManager.f98357c.mo140081a().mo140077a(new LocalOpenEntity("1003", "", "", str, str2, String.valueOf(str3.hashCode()), arrayList, str3));
    }

    /* renamed from: a */
    public final void mo139810a(Context context, File file, String str, FileDetailLaunchParams fileDetailLaunchParams, String str2) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(file, "file");
        Intrinsics.checkParameterIsNotNull(str, "mime");
        Intrinsics.checkParameterIsNotNull(fileDetailLaunchParams, "params");
        Intrinsics.checkParameterIsNotNull(str2, "fileKey");
        if (m150356e(fileDetailLaunchParams)) {
            Log.m165389i("FileDetailController", "driver sdk preview!");
            DriverSDKFileOpenManager.f98357c.mo140081a().mo140079a(fileDetailLaunchParams);
            return;
        }
        C38303c.m150712a(context, file, str, str2);
    }
}
