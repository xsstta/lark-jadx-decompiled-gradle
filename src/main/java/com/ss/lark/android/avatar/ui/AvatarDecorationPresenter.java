package com.ss.lark.android.avatar.ui;

import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import com.ss.lark.android.avatar.AvatarModule;
import com.ss.lark.android.avatar.dependency.IAvatarModuleDependency;
import com.ss.lark.android.avatar.ui.IAvatarDecorationContract;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000;\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\r\u0018\u0000 \u00162\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0016B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0004H\u0014J\b\u0010\u0014\u001a\u00020\u0012H\u0016J\u0006\u0010\u0015\u001a\u00020\u0012R\u001c\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0004\n\u0002\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/lark/android/avatar/ui/AvatarDecorationPresenter;", "Lcom/larksuite/framework/mvp/BasePresenter;", "Lcom/ss/lark/android/avatar/ui/IAvatarDecorationContract$IModel;", "Lcom/ss/lark/android/avatar/ui/IAvatarDecorationContract$IView;", "Lcom/ss/lark/android/avatar/ui/IAvatarDecorationContract$IView$IViewDelegate;", "model", "view", "(Lcom/ss/lark/android/avatar/ui/IAvatarDecorationContract$IModel;Lcom/ss/lark/android/avatar/ui/IAvatarDecorationContract$IView;)V", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "", "pushAvatarListener", "com/ss/lark/android/avatar/ui/AvatarDecorationPresenter$pushAvatarListener$1", "Lcom/ss/lark/android/avatar/ui/AvatarDecorationPresenter$pushAvatarListener$1;", "pushChatterRegistry", "Lcom/ss/lark/android/avatar/dependency/IAvatarModuleDependency$IPushAvatarRegistry;", "create", "", "createViewDelegate", "destroy", "updateMiniApps", "Companion", "core_avatar_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.lark.android.avatar.ui.c */
public final class AvatarDecorationPresenter extends BasePresenter<IAvatarDecorationContract.IModel, IAvatarDecorationContract.IView, IAvatarDecorationContract.IView.IViewDelegate> {

    /* renamed from: a */
    public static final Companion f162391a = new Companion(null);

    /* renamed from: b */
    private IGetDataCallback<List<String>> f162392b;

    /* renamed from: c */
    private final C64235d f162393c;

    /* renamed from: d */
    private final IAvatarModuleDependency.IPushAvatarRegistry f162394d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004¨\u0006\u0007"}, d2 = {"Lcom/ss/lark/android/avatar/ui/AvatarDecorationPresenter$Companion;", "", "()V", "weakCallback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "D", "callback", "core_avatar_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.avatar.ui.c$a */
    public static final class Companion {
        private Companion() {
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0015\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"com/ss/lark/android/avatar/ui/AvatarDecorationPresenter$Companion$weakCallback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/Object;)V", "core_avatar_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.lark.android.avatar.ui.c$a$a */
        public static final class C64231a implements IGetDataCallback<D> {

            /* renamed from: a */
            final /* synthetic */ WeakReference f162395a;

            C64231a(WeakReference weakReference) {
                this.f162395a = weakReference;
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
            public void onSuccess(D d) {
                IGetDataCallback iGetDataCallback = (IGetDataCallback) this.f162395a.get();
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(d);
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                IGetDataCallback iGetDataCallback = (IGetDataCallback) this.f162395a.get();
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final <D> IGetDataCallback<D> mo222686a(IGetDataCallback<D> iGetDataCallback) {
            Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
            return new C64231a(new WeakReference(iGetDataCallback));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/ss/lark/android/avatar/ui/AvatarDecorationPresenter$createViewDelegate$1", "Lcom/ss/lark/android/avatar/ui/IAvatarDecorationContract$IView$IViewDelegate;", "core_avatar_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.avatar.ui.c$c */
    public static final class C64234c implements IAvatarDecorationContract.IView.IViewDelegate {
        C64234c() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0002J\u0018\u0010\t\u001a\u00020\u00052\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¨\u0006\u000b"}, d2 = {"com/ss/lark/android/avatar/ui/AvatarDecorationPresenter$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onErrorInternal", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "core_avatar_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.avatar.ui.c$b */
    public static final class C64232b implements IGetDataCallback<List<? extends String>> {

        /* renamed from: a */
        final /* synthetic */ IAvatarDecorationContract.IView f162396a;

        /* renamed from: a */
        public final void mo222687a() {
            Log.m165382e("Empty avatar app list");
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.lark.android.avatar.ui.c$b$a */
        public static final class RunnableC64233a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C64232b f162397a;

            /* renamed from: b */
            final /* synthetic */ List f162398b;

            RunnableC64233a(C64232b bVar, List list) {
                this.f162397a = bVar;
                this.f162398b = list;
            }

            public final void run() {
                if (this.f162398b == null) {
                    this.f162397a.mo222687a();
                } else {
                    this.f162397a.f162396a.mo222661a(this.f162398b);
                }
            }
        }

        C64232b(IAvatarDecorationContract.IView bVar) {
            this.f162396a = bVar;
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165382e(errorResult.toString());
        }

        /* renamed from: a */
        public void onSuccess(List<String> list) {
            CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
            coreThreadPool.getUIExecutor().execute(new RunnableC64233a(this, list));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public IAvatarDecorationContract.IView.IViewDelegate createViewDelegate() {
        return new C64234c();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        mo222685b();
        this.f162394d.mo132682a(this.f162393c);
    }

    /* renamed from: b */
    public final void mo222685b() {
        IGetDataCallback<List<String>> iGetDataCallback = this.f162392b;
        if (iGetDataCallback == null) {
            Intrinsics.throwNpe();
        }
        ((IAvatarDecorationContract.IModel) getModel()).mo222683a(f162391a.mo222686a(iGetDataCallback));
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f162392b = null;
        this.f162394d.mo132683b(this.f162393c);
        super.destroy();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/lark/android/avatar/ui/AvatarDecorationPresenter$pushAvatarListener$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/widget/photo_picker/entity/PhotoItem;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "photoItem", "core_avatar_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.avatar.ui.c$d */
    public static final class C64235d implements IGetDataCallback<PhotoItem> {

        /* renamed from: a */
        final /* synthetic */ IAvatarDecorationContract.IView f162399a;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
        }

        C64235d(IAvatarDecorationContract.IView bVar) {
            this.f162399a = bVar;
        }

        /* renamed from: a */
        public void onSuccess(PhotoItem photoItem) {
            Intrinsics.checkParameterIsNotNull(photoItem, "photoItem");
            this.f162399a.mo222659a(photoItem);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarDecorationPresenter(IAvatarDecorationContract.IModel aVar, IAvatarDecorationContract.IView bVar) {
        super(aVar, bVar);
        Intrinsics.checkParameterIsNotNull(aVar, "model");
        Intrinsics.checkParameterIsNotNull(bVar, "view");
        this.f162392b = new C64232b(bVar);
        this.f162393c = new C64235d(bVar);
        IAvatarModuleDependency a = AvatarModule.f162301b.mo222601a();
        if (a == null) {
            Intrinsics.throwNpe();
        }
        this.f162394d = a.mo132670a();
    }
}
