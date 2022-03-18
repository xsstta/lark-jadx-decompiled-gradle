package com.ss.android.lark.inv.export.util;

import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ViewUtils;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u000b\f\rB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\u0004\b\u0000\u0010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00070\tH\u0007J\"\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\u0004\b\u0000\u0010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00070\tH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/inv/export/util/InvRequestUtils;", "", "()V", "TAG", "", "createLocalAndServer", "Lcom/ss/android/lark/inv/export/util/InvRequestUtils$LocalAndServerRequest;", "T", "callback", "Lcom/ss/android/lark/inv/export/util/InvRequestUtils$LocalAndServerRequestCallback;", "requestLocalAndServer", "LocalAndServerRequest", "LocalAndServerRequestCallback", "LocalAndServerRequestImpl", "core_invitation_export_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.inv.export.util.v */
public final class InvRequestUtils {

    /* renamed from: a */
    public static final InvRequestUtils f101980a = new InvRequestUtils();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/inv/export/util/InvRequestUtils$LocalAndServerRequest;", "T", "", "cancel", "", "execute", "core_invitation_export_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.inv.export.util.v$a */
    public interface LocalAndServerRequest<T> {
        /* renamed from: a */
        LocalAndServerRequest<T> mo145709a();

        /* renamed from: b */
        void mo145710b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\nH&J\u0016\u0010\u000b\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\nH&J\b\u0010\f\u001a\u00020\bH&J\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0002\u0010\u000fJ\u0012\u0010\u0010\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H&J\b\u0010\u0013\u001a\u00020\bH&¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/inv/export/util/InvRequestUtils$LocalAndServerRequestCallback;", "T", "", "isLocalDataValid", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/Object;)Z", "loadLocalData", "", "callback", "Lcom/larksuite/framework/callback/UIGetDataCallback;", "loadServerData", "onHideLoading", "onShowData", "isFromLocal", "(ZLjava/lang/Object;)V", "onShowError", "error", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onShowLoading", "core_invitation_export_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.inv.export.util.v$b */
    public interface LocalAndServerRequestCallback<T> {
        /* renamed from: a */
        void mo130825a();

        /* renamed from: a */
        void mo130826a(ErrorResult errorResult);

        /* renamed from: a */
        void mo130827a(UIGetDataCallback<T> uIGetDataCallback);

        /* renamed from: a */
        void mo130828a(boolean z, T t);

        /* renamed from: a */
        boolean mo130830a(T t);

        /* renamed from: b */
        void mo130832b();

        /* renamed from: b */
        void mo130833b(UIGetDataCallback<T> uIGetDataCallback);
    }

    private InvRequestUtils() {
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0002\n\r\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\nX\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\rX\u0004¢\u0006\u0004\n\u0002\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/inv/export/util/InvRequestUtils$LocalAndServerRequestImpl;", "T", "Lcom/ss/android/lark/inv/export/util/InvRequestUtils$LocalAndServerRequest;", "dataCallback", "Lcom/ss/android/lark/inv/export/util/InvRequestUtils$LocalAndServerRequestCallback;", "(Lcom/ss/android/lark/inv/export/util/InvRequestUtils$LocalAndServerRequestCallback;)V", "hasLocalDataShow", "", "isLoadingShow", "localCallback", "com/ss/android/lark/inv/export/util/InvRequestUtils$LocalAndServerRequestImpl$localCallback$1", "Lcom/ss/android/lark/inv/export/util/InvRequestUtils$LocalAndServerRequestImpl$localCallback$1;", "serverCallback", "com/ss/android/lark/inv/export/util/InvRequestUtils$LocalAndServerRequestImpl$serverCallback$1", "Lcom/ss/android/lark/inv/export/util/InvRequestUtils$LocalAndServerRequestImpl$serverCallback$1;", "cancel", "", "execute", "core_invitation_export_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.inv.export.util.v$c */
    public static final class LocalAndServerRequestImpl<T> implements LocalAndServerRequest<T> {

        /* renamed from: a */
        public boolean f101981a;

        /* renamed from: b */
        public boolean f101982b;

        /* renamed from: c */
        public final C40142b f101983c = new C40142b(this);

        /* renamed from: d */
        public final C40143c f101984d = new C40143c(this);

        /* renamed from: e */
        public final LocalAndServerRequestCallback<T> f101985e;

        @Override // com.ss.android.lark.inv.export.util.InvRequestUtils.LocalAndServerRequest
        /* renamed from: a */
        public LocalAndServerRequest<T> mo145709a() {
            ViewUtils.m224148a(new RunnableC40141a(this));
            return this;
        }

        @Override // com.ss.android.lark.inv.export.util.InvRequestUtils.LocalAndServerRequest
        /* renamed from: b */
        public void mo145710b() {
            this.f101983c.cancel();
            this.f101984d.cancel();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "T", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.inv.export.util.v$c$a */
        static final class RunnableC40141a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ LocalAndServerRequestImpl f101986a;

            RunnableC40141a(LocalAndServerRequestImpl cVar) {
                this.f101986a = cVar;
            }

            public final void run() {
                this.f101986a.f101981a = false;
                this.f101986a.f101982b = false;
                this.f101986a.f101985e.mo130825a();
                this.f101986a.f101981a = true;
                this.f101986a.f101985e.mo130827a((UIGetDataCallback) this.f101986a.f101983c);
                this.f101986a.f101985e.mo130833b(this.f101986a.f101984d);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0017\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"com/ss/android/lark/inv/export/util/InvRequestUtils$LocalAndServerRequestImpl$localCallback$1", "Lcom/larksuite/framework/callback/UIGetDataCallback;", "onErrored", "", "error", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccessed", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/Object;)V", "core_invitation_export_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.inv.export.util.v$c$b */
        public static final class C40142b extends UIGetDataCallback<T> {

            /* renamed from: a */
            final /* synthetic */ LocalAndServerRequestImpl f101987a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C40142b(LocalAndServerRequestImpl cVar) {
                this.f101987a = cVar;
            }

            @Override // com.larksuite.framework.callback.UIGetDataCallback
            public void onErrored(ErrorResult errorResult) {
                Log.m165386e("InvitationModule", errorResult);
            }

            @Override // com.larksuite.framework.callback.UIGetDataCallback
            public void onSuccessed(T t) {
                if (t != null) {
                    if ((!(t instanceof Collection) || !t.isEmpty()) && this.f101987a.f101985e.mo130830a((Object) t)) {
                        this.f101987a.f101985e.mo130828a(false, t);
                        this.f101987a.f101985e.mo130832b();
                        this.f101987a.f101981a = false;
                        this.f101987a.f101982b = true;
                    }
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0017\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"com/ss/android/lark/inv/export/util/InvRequestUtils$LocalAndServerRequestImpl$serverCallback$1", "Lcom/larksuite/framework/callback/UIGetDataCallback;", "onErrored", "", "error", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccessed", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/Object;)V", "core_invitation_export_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.inv.export.util.v$c$c */
        public static final class C40143c extends UIGetDataCallback<T> {

            /* renamed from: a */
            final /* synthetic */ LocalAndServerRequestImpl f101988a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C40143c(LocalAndServerRequestImpl cVar) {
                this.f101988a = cVar;
            }

            @Override // com.larksuite.framework.callback.UIGetDataCallback
            public void onErrored(ErrorResult errorResult) {
                this.f101988a.f101983c.cancel();
                Log.m165386e("InvitationModule", errorResult);
                if (this.f101988a.f101981a) {
                    this.f101988a.f101985e.mo130832b();
                    this.f101988a.f101981a = false;
                }
                if (!this.f101988a.f101982b) {
                    this.f101988a.f101985e.mo130826a(errorResult);
                }
            }

            @Override // com.larksuite.framework.callback.UIGetDataCallback
            public void onSuccessed(T t) {
                this.f101988a.f101983c.cancel();
                if (this.f101988a.f101981a) {
                    this.f101988a.f101985e.mo130832b();
                    this.f101988a.f101981a = false;
                }
                this.f101988a.f101985e.mo130828a(true, t);
            }
        }

        public LocalAndServerRequestImpl(LocalAndServerRequestCallback<T> bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "dataCallback");
            this.f101985e = bVar;
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final <T> LocalAndServerRequest<T> m159143a(LocalAndServerRequestCallback<T> bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "callback");
        return new LocalAndServerRequestImpl(bVar);
    }

    @JvmStatic
    /* renamed from: b */
    public static final <T> LocalAndServerRequest<T> m159144b(LocalAndServerRequestCallback<T> bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "callback");
        return m159143a(bVar).mo145709a();
    }
}
