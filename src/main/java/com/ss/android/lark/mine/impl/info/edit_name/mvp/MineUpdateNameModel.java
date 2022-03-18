package com.ss.android.lark.mine.impl.info.edit_name.mvp;

import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.ss.android.lark.mine.C45421b;
import com.ss.android.lark.mine.impl.info.edit_name.mvp.IMineUpdateNameContract;
import com.ss.android.lark.mine.p2270a.AbstractC45399a;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\f\u001a\u00020\u0004H\u0016J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00042\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0011H\u0016R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/mine/impl/info/edit_name/mvp/MineUpdateNameModel;", "Lcom/larksuite/framework/mvp/BaseModel;", "Lcom/ss/android/lark/mine/impl/info/edit_name/mvp/IMineUpdateNameContract$IModel;", "name", "", "(Ljava/lang/String;)V", "mChatDependency", "Lcom/ss/android/lark/mine/dependency/IMineDependency$IChatDependency;", "getMChatDependency", "()Lcom/ss/android/lark/mine/dependency/IMineDependency$IChatDependency;", "mChatDependency$delegate", "Lkotlin/Lazy;", "getMineName", "setMineName", "", "mineName", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mine.impl.info.edit_name.mvp.b */
public final class MineUpdateNameModel extends BaseModel implements IMineUpdateNameContract.IModel {

    /* renamed from: a */
    private final Lazy f115534a = LazyKt.lazy(C45770a.INSTANCE);

    /* renamed from: b */
    private String f115535b;

    /* renamed from: b */
    private final AbstractC45399a.AbstractC45401b m181379b() {
        return (AbstractC45399a.AbstractC45401b) this.f115534a.getValue();
    }

    @Override // com.ss.android.lark.mine.impl.info.edit_name.mvp.IMineUpdateNameContract.IModel
    /* renamed from: a */
    public String mo160970a() {
        return this.f115535b;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/mine/dependency/IMineDependency$IChatDependency;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.info.edit_name.mvp.b$a */
    static final class C45770a extends Lambda implements Function0<AbstractC45399a.AbstractC45401b> {
        public static final C45770a INSTANCE = new C45770a();

        C45770a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC45399a.AbstractC45401b invoke() {
            AbstractC45399a a = C45421b.m180420a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MineModule.getDependency()");
            return a.mo133459r();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mine/impl/info/edit_name/mvp/MineUpdateNameModel$setMineName$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.info.edit_name.mvp.b$b */
    public static final class C45771b implements IGetDataCallback<String> {

        /* renamed from: a */
        final /* synthetic */ IGetDataCallback f115536a;

        C45771b(IGetDataCallback iGetDataCallback) {
            this.f115536a = iGetDataCallback;
        }

        /* renamed from: a */
        public void onSuccess(String str) {
            IGetDataCallback iGetDataCallback = this.f115536a;
            if (iGetDataCallback != null) {
                iGetDataCallback.onSuccess(str);
            }
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            IGetDataCallback iGetDataCallback = this.f115536a;
            if (iGetDataCallback != null) {
                iGetDataCallback.onError(errorResult);
            }
        }
    }

    public MineUpdateNameModel(String str) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        this.f115535b = str;
    }

    @Override // com.ss.android.lark.mine.impl.info.edit_name.mvp.IMineUpdateNameContract.IModel
    /* renamed from: a */
    public void mo160971a(String str, IGetDataCallback<String> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "mineName");
        m181379b().mo133510a(str, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new C45771b(iGetDataCallback)));
    }
}
