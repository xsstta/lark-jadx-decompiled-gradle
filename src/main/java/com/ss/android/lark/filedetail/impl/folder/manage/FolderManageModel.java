package com.ss.android.lark.filedetail.impl.folder.manage;

import android.text.TextUtils;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.ICallback;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.ss.android.lark.filedetail.FileDetailModule;
import com.ss.android.lark.filedetail.dto.FolderManageLaunchParams;
import com.ss.android.lark.filedetail.impl.folder.manage.entity.FilePreviewInfo;
import com.ss.android.lark.filedetail.impl.folder.manage.entity.FolderPreviewLoadParams;
import com.ss.android.lark.filedetail.impl.folder.manage.entity.FolderPreviewResponse;
import com.ss.android.lark.filedetail.impl.folder.manage.service.FolderService;
import com.ss.android.lark.filedetail.impl.folder.manage.service.IFolderService;
import com.ss.android.lark.filedetail.p1885a.AbstractC38197a;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 .2\u00020\u00012\u00020\u0002:\u0001.B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0019\u001a\u00020\u0010H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001bH\u0016J\b\u0010\u001d\u001a\u00020\u0007H\u0016J\b\u0010\u001e\u001a\u00020\nH\u0016J\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\u001bH\u0002J\u001c\u0010\"\u001a\u00020\u001b2\u0012\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0%0$H\u0016J$\u0010\"\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020\n2\u0012\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0%0$H\u0016J$\u0010(\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020\n2\u0012\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0%0$H\u0002J$\u0010)\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020\n2\u0012\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0%0$H\u0002J\u0010\u0010*\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020 H\u0016J\u0010\u0010,\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020 H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0014\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016¨\u0006/"}, d2 = {"Lcom/ss/android/lark/filedetail/impl/folder/manage/FolderManageModel;", "Lcom/larksuite/framework/mvp/BaseModel;", "Lcom/ss/android/lark/filedetail/impl/folder/manage/IModel;", "launchParams", "Lcom/ss/android/lark/filedetail/dto/FolderManageLaunchParams;", "(Lcom/ss/android/lark/filedetail/dto/FolderManageLaunchParams;)V", "loadStep", "", "mCacheData", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lcom/ss/android/lark/filedetail/impl/folder/manage/entity/FolderPreviewResponse;", "mCurFolderKey", "mFolderService", "Lcom/ss/android/lark/filedetail/impl/folder/manage/service/IFolderService;", "mHasMore", "", "mMessageId", "mOffset", "mParentFolderKey", "userId", "getUserId", "()Ljava/lang/String;", "userId$delegate", "Lkotlin/Lazy;", "canDoLoadMoreFile", "create", "", "destroy", "getCurFolderCount", "getCurFolderKey", "getFileLayoutType", "", "initData", "loadMoreFileInfo", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Lcom/ss/android/lark/filedetail/impl/folder/manage/entity/FilePreviewInfo;", "folderKey", "loadMoreFileListFromMemory", "loadMoreFileListFromNet", "saveFileLayoutType", ShareHitPoint.f121869d, "updateLoadStep", "step", "Companion", "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.filedetail.impl.folder.manage.b */
public final class FolderManageModel extends BaseModel implements IModel {

    /* renamed from: e */
    public static final Companion f98181e = new Companion(null);

    /* renamed from: a */
    public ConcurrentHashMap<String, FolderPreviewResponse> f98182a = new ConcurrentHashMap<>();

    /* renamed from: b */
    public long f98183b;

    /* renamed from: c */
    public boolean f98184c;

    /* renamed from: d */
    public String f98185d = "";

    /* renamed from: f */
    private final IFolderService f98186f = FolderService.f98159a;

    /* renamed from: g */
    private final Lazy f98187g = LazyKt.lazy(C38272c.INSTANCE);

    /* renamed from: h */
    private String f98188h = "";

    /* renamed from: i */
    private String f98189i = "";

    /* renamed from: j */
    private long f98190j = 20;

    /* renamed from: k */
    private final FolderManageLaunchParams f98191k;

    /* renamed from: e */
    private final String m150525e() {
        return (String) this.f98187g.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/filedetail/impl/folder/manage/FolderManageModel$Companion;", "", "()V", "LOG_TAG", "", "PARAMS_FOLDER_MANAGE_LAYOUT_TYPE", "STEP_FOLDER_LOAD", "", "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.filedetail.impl.folder.manage.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.filedetail.impl.folder.manage.IModel
    /* renamed from: a */
    public String mo139909a() {
        return this.f98185d;
    }

    @Override // com.ss.android.lark.filedetail.impl.folder.manage.IModel
    /* renamed from: b */
    public boolean mo139914b() {
        return this.f98184c;
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        m150526f();
    }

    @Override // com.ss.android.lark.filedetail.impl.folder.manage.IModel
    /* renamed from: d */
    public int mo139916d() {
        return this.f98186f.mo139881a(m150525e());
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        this.f98182a.clear();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.filedetail.impl.folder.manage.b$c */
    static final class C38272c extends Lambda implements Function0<String> {
        public static final C38272c INSTANCE = new C38272c();

        C38272c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            String userId;
            AbstractC38197a a = FileDetailModule.f97880b.mo139564a();
            if (a == null || (userId = a.getUserId()) == null) {
                return "";
            }
            return userId;
        }
    }

    /* renamed from: f */
    private final void m150526f() {
        this.f98189i = this.f98191k.mo139672a();
        String g = this.f98191k.mo139693g();
        this.f98188h = g;
        this.f98185d = g;
    }

    @Override // com.ss.android.lark.filedetail.impl.folder.manage.IModel
    /* renamed from: c */
    public long mo139915c() {
        FolderPreviewResponse cVar = this.f98182a.get(this.f98185d);
        if (cVar != null) {
            return cVar.mo140007b();
        }
        return 0;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/filedetail/impl/folder/manage/FolderManageModel$loadMoreFileListFromNet$secondCallback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/filedetail/impl/folder/manage/entity/FolderPreviewResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.filedetail.impl.folder.manage.b$b */
    public static final class C38271b implements IGetDataCallback<FolderPreviewResponse> {

        /* renamed from: a */
        final /* synthetic */ FolderManageModel f98192a;

        /* renamed from: b */
        final /* synthetic */ String f98193b;

        /* renamed from: c */
        final /* synthetic */ IGetDataCallback f98194c;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f98192a.f98184c = true;
            this.f98194c.onError(errorResult);
        }

        /* renamed from: a */
        public void onSuccess(FolderPreviewResponse cVar) {
            List<FilePreviewInfo> a;
            boolean z;
            List<FilePreviewInfo> list = null;
            if (TextUtils.equals(this.f98193b, this.f98192a.f98185d)) {
                long j = 0;
                if (!(cVar == null && this.f98192a.f98183b == 0)) {
                    FolderPreviewResponse cVar2 = this.f98192a.f98182a.get(this.f98193b);
                    if (cVar2 == null) {
                        cVar2 = new FolderPreviewResponse();
                    }
                    Intrinsics.checkExpressionValueIsNotNull(cVar2, "mCacheData[folderKey] ?: FolderPreviewResponse()");
                    if (this.f98192a.f98183b != 0) {
                        if (cVar != null) {
                            list = cVar.mo140001a();
                        }
                        if (cVar != null) {
                            z = cVar.mo140008c();
                        } else {
                            z = false;
                        }
                        cVar2.mo140005a(list, z);
                    } else if (cVar != null) {
                        cVar2.mo140004a(cVar.mo140001a(), cVar.mo140007b(), cVar.mo140008c());
                    }
                    this.f98192a.f98184c = cVar2.mo140008c();
                    FolderManageModel bVar = this.f98192a;
                    long j2 = bVar.f98183b;
                    if (!(cVar == null || (a = cVar.mo140001a()) == null)) {
                        j = (long) a.size();
                    }
                    bVar.f98183b = j2 + j;
                    this.f98192a.f98182a.put(this.f98193b, cVar2);
                    this.f98194c.onSuccess(cVar2.mo140001a());
                    return;
                }
            }
            this.f98194c.onSuccess(null);
        }

        C38271b(FolderManageModel bVar, String str, IGetDataCallback iGetDataCallback) {
            this.f98192a = bVar;
            this.f98193b = str;
            this.f98194c = iGetDataCallback;
        }
    }

    @Override // com.ss.android.lark.filedetail.impl.folder.manage.IModel
    /* renamed from: a */
    public void mo139910a(int i) {
        this.f98190j = Math.max((long) i, this.f98190j);
    }

    @Override // com.ss.android.lark.filedetail.impl.folder.manage.IModel
    /* renamed from: a */
    public void mo139911a(IGetDataCallback<List<FilePreviewInfo>> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        m150524c(this.f98185d, iGetDataCallback);
    }

    @Override // com.ss.android.lark.filedetail.impl.folder.manage.IModel
    /* renamed from: b */
    public void mo139913b(int i) {
        boolean z;
        if (m150525e().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f98186f.mo139884a(m150525e(), i);
        }
    }

    public FolderManageModel(FolderManageLaunchParams folderManageLaunchParams) {
        Intrinsics.checkParameterIsNotNull(folderManageLaunchParams, "launchParams");
        this.f98191k = folderManageLaunchParams;
    }

    /* renamed from: b */
    private final void m150523b(String str, IGetDataCallback<List<FilePreviewInfo>> iGetDataCallback) {
        boolean z;
        FolderPreviewResponse cVar = this.f98182a.get(str);
        if (cVar != null) {
            List<FilePreviewInfo> a = cVar.mo140001a();
            if (a == null || a.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                this.f98183b = (long) cVar.mo140001a().size();
                this.f98184c = cVar.mo140008c();
                iGetDataCallback.onSuccess(cVar.mo140001a());
                return;
            }
        }
        iGetDataCallback.onError(new ErrorResult("get data from memory wrong: response = null"));
    }

    /* renamed from: c */
    private final void m150524c(String str, IGetDataCallback<List<FilePreviewInfo>> iGetDataCallback) {
        boolean z;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            iGetDataCallback.onError(new ErrorResult("folder key is null"));
            return;
        }
        FolderPreviewLoadParams a = new FolderPreviewLoadParams.Builder().mo139998a(str).mo139997a(this.f98183b).mo140000b(this.f98190j).mo139996a(this.f98191k.mo139691f()).mo139999a();
        C38271b bVar = new C38271b(this, str, iGetDataCallback);
        IFolderService bVar2 = this.f98186f;
        ICallback wrapAndAddCallback = getCallbackManager().wrapAndAddCallback(bVar);
        Intrinsics.checkExpressionValueIsNotNull(wrapAndAddCallback, "callbackManager.wrapAndAddCallback(secondCallback)");
        bVar2.mo139883a(a, (IGetDataCallback) wrapAndAddCallback);
    }

    @Override // com.ss.android.lark.filedetail.impl.folder.manage.IModel
    /* renamed from: a */
    public void mo139912a(String str, IGetDataCallback<List<FilePreviewInfo>> iGetDataCallback) {
        List<FilePreviewInfo> list;
        Intrinsics.checkParameterIsNotNull(str, "folderKey");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        boolean equals = TextUtils.equals(this.f98185d, str);
        boolean z = false;
        if (!equals) {
            this.f98185d = str;
            this.f98183b = 0;
            this.f98184c = false;
        }
        if (!equals && this.f98182a.get(str) != null) {
            FolderPreviewResponse cVar = this.f98182a.get(str);
            if (cVar != null) {
                list = cVar.mo140001a();
            } else {
                list = null;
            }
            List<FilePreviewInfo> list2 = list;
            if (list2 == null || list2.isEmpty()) {
                z = true;
            }
            if (!z) {
                m150523b(str, iGetDataCallback);
                return;
            }
        }
        m150524c(str, iGetDataCallback);
    }
}
