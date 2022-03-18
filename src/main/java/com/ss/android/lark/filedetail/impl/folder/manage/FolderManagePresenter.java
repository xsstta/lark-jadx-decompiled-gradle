package com.ss.android.lark.filedetail.impl.folder.manage;

import android.content.Context;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.lark.filedetail.dto.FolderManageLaunchParams;
import com.ss.android.lark.filedetail.impl.folder.manage.FolderManageView;
import com.ss.android.lark.filedetail.impl.folder.manage.IView;
import com.ss.android.lark.filedetail.impl.folder.manage.entity.FilePreviewInfo;
import com.ss.android.lark.filedetail.impl.statistic.FolderManageHitPoint;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00009\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\r\u0018\u0000 \u001a2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u001aB\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0004H\u0014J\u0006\u0010\u0018\u001a\u00020\u0016J\b\u0010\u0019\u001a\u00020\u0016H\u0002R\u0010\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0004\n\u0002\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/filedetail/impl/folder/manage/FolderManagePresenter;", "Lcom/larksuite/framework/mvp/BasePresenter;", "Lcom/ss/android/lark/filedetail/impl/folder/manage/IModel;", "Lcom/ss/android/lark/filedetail/impl/folder/manage/IView;", "Lcom/ss/android/lark/filedetail/impl/folder/manage/IView$Delegate;", "context", "Landroid/content/Context;", "dependency", "Lcom/ss/android/lark/filedetail/impl/folder/manage/FolderManageView$IViewDependency;", "params", "Lcom/ss/android/lark/filedetail/dto/FolderManageLaunchParams;", "(Landroid/content/Context;Lcom/ss/android/lark/filedetail/impl/folder/manage/FolderManageView$IViewDependency;Lcom/ss/android/lark/filedetail/dto/FolderManageLaunchParams;)V", "callback", "com/ss/android/lark/filedetail/impl/folder/manage/FolderManagePresenter$callback$1", "Lcom/ss/android/lark/filedetail/impl/folder/manage/FolderManagePresenter$callback$1;", "getContext", "()Landroid/content/Context;", "getDependency", "()Lcom/ss/android/lark/filedetail/impl/folder/manage/FolderManageView$IViewDependency;", "getParams", "()Lcom/ss/android/lark/filedetail/dto/FolderManageLaunchParams;", "create", "", "createViewDelegate", "onBackPressed", "sendHitPoint", "Companion", "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.filedetail.impl.folder.manage.c */
public final class FolderManagePresenter extends BasePresenter<IModel, IView, IView.Delegate> {

    /* renamed from: b */
    public static final Companion f98195b = new Companion(null);

    /* renamed from: a */
    public final C38273b f98196a = new C38273b(this);

    /* renamed from: c */
    private final Context f98197c;

    /* renamed from: d */
    private final FolderManageView.IViewDependency f98198d;

    /* renamed from: e */
    private final FolderManageLaunchParams f98199e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/filedetail/impl/folder/manage/FolderManagePresenter$Companion;", "", "()V", "LOG_TAG", "", "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.filedetail.impl.folder.manage.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public IView.Delegate createViewDelegate() {
        return new C38275d(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0016J\b\u0010\u000b\u001a\u00020\tH\u0016J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0007H\u0016J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0007H\u0016¨\u0006\u0010"}, d2 = {"com/ss/android/lark/filedetail/impl/folder/manage/FolderManagePresenter$createViewDelegate$1", "Lcom/ss/android/lark/filedetail/impl/folder/manage/IView$Delegate;", "canDoLoadMore", "", "getCurFolderKey", "", "getFileLayoutType", "", "onLoadFileInfo", "", "key", "onLoadMore", "saveFileLayoutType", ShareHitPoint.f121869d, "updateLoadStep", "step", "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.filedetail.impl.folder.manage.c$d */
    public static final class C38275d implements IView.Delegate {

        /* renamed from: a */
        final /* synthetic */ FolderManagePresenter f98202a;

        @Override // com.ss.android.lark.filedetail.impl.folder.manage.IView.Delegate
        /* renamed from: c */
        public String mo139928c() {
            return ((IModel) this.f98202a.getModel()).mo139909a();
        }

        @Override // com.ss.android.lark.filedetail.impl.folder.manage.IView.Delegate
        /* renamed from: d */
        public int mo139929d() {
            return ((IModel) this.f98202a.getModel()).mo139916d();
        }

        @Override // com.ss.android.lark.filedetail.impl.folder.manage.IView.Delegate
        /* renamed from: a */
        public void mo139923a() {
            ((IModel) this.f98202a.getModel()).mo139911a(new UIGetDataCallback(this.f98202a.f98196a));
        }

        @Override // com.ss.android.lark.filedetail.impl.folder.manage.IView.Delegate
        /* renamed from: b */
        public boolean mo139927b() {
            return ((IModel) this.f98202a.getModel()).mo139914b();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C38275d(FolderManagePresenter cVar) {
            this.f98202a = cVar;
        }

        @Override // com.ss.android.lark.filedetail.impl.folder.manage.IView.Delegate
        /* renamed from: a */
        public void mo139924a(int i) {
            ((IModel) this.f98202a.getModel()).mo139910a(i);
        }

        @Override // com.ss.android.lark.filedetail.impl.folder.manage.IView.Delegate
        /* renamed from: b */
        public void mo139926b(int i) {
            ((IModel) this.f98202a.getModel()).mo139913b(i);
        }

        @Override // com.ss.android.lark.filedetail.impl.folder.manage.IView.Delegate
        /* renamed from: a */
        public void mo139925a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "key");
            ((IModel) this.f98202a.getModel()).mo139912a(str, new UIGetDataCallback(this.f98202a.f98196a));
        }
    }

    /* renamed from: c */
    public final void mo139920c() {
        ((IView) getView()).mo139864d();
    }

    /* renamed from: a */
    public final void mo139918a() {
        FolderManageHitPoint.f98025a.mo139787a(this.f98199e.mo139679b(), this.f98199e.mo139689e(), ((IModel) getModel()).mo139915c());
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        ((IModel) getModel()).mo139911a(new UIGetDataCallback(new C38274c(this)));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/filedetail/impl/folder/manage/FolderManagePresenter$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Lcom/ss/android/lark/filedetail/impl/folder/manage/entity/FilePreviewInfo;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.filedetail.impl.folder.manage.c$b */
    public static final class C38273b implements IGetDataCallback<List<? extends FilePreviewInfo>> {

        /* renamed from: a */
        final /* synthetic */ FolderManagePresenter f98200a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C38273b(FolderManagePresenter cVar) {
            this.f98200a = cVar;
        }

        /* renamed from: a */
        public void onSuccess(List<FilePreviewInfo> list) {
            ((IView) this.f98200a.getView()).mo139866f();
            ((IView) this.f98200a.getView()).mo139861a(list);
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            ((IView) this.f98200a.getView()).mo139866f();
            ((IView) this.f98200a.getView()).mo139865e();
            Log.m165389i("FolderManagePresenter", errorResult.getDisplayMsg());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/filedetail/impl/folder/manage/FolderManagePresenter$create$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Lcom/ss/android/lark/filedetail/impl/folder/manage/entity/FilePreviewInfo;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.filedetail.impl.folder.manage.c$c */
    public static final class C38274c implements IGetDataCallback<List<? extends FilePreviewInfo>> {

        /* renamed from: a */
        final /* synthetic */ FolderManagePresenter f98201a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C38274c(FolderManagePresenter cVar) {
            this.f98201a = cVar;
        }

        /* renamed from: a */
        public void onSuccess(List<FilePreviewInfo> list) {
            ((IView) this.f98201a.getView()).mo139866f();
            ((IView) this.f98201a.getView()).mo139861a(list);
            this.f98201a.mo139918a();
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            ((IView) this.f98201a.getView()).mo139866f();
            ((IView) this.f98201a.getView()).mo139865e();
            Log.m165389i("FolderManagePresenter", errorResult.getDisplayMsg());
            this.f98201a.mo139918a();
        }
    }

    public FolderManagePresenter(Context context, FolderManageView.IViewDependency bVar, FolderManageLaunchParams folderManageLaunchParams) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(bVar, "dependency");
        Intrinsics.checkParameterIsNotNull(folderManageLaunchParams, "params");
        this.f98197c = context;
        this.f98198d = bVar;
        this.f98199e = folderManageLaunchParams;
        FolderManageModel bVar2 = new FolderManageModel(folderManageLaunchParams);
        FolderManageView folderManageView = new FolderManageView(context, bVar, folderManageLaunchParams);
        folderManageView.setViewDelegate(createViewDelegate());
        setModel(bVar2);
        setView(folderManageView);
    }
}
