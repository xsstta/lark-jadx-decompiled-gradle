package com.ss.android.lark.chatsetting.impl.group.avatar.mvp;

import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.ss.android.lark.chatsetting.impl.group.avatar.mvp.AbstractC34597d;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\n\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/avatar/mvp/AvatarEditDelegate;", "Lcom/ss/android/lark/chatsetting/impl/group/avatar/mvp/IAvatarEditContract$IView$Delegate;", "Lcom/ss/android/lark/chatsetting/impl/group/avatar/mvp/IAvatarEditContract$IModel$Delegate;", "model", "Lcom/ss/android/lark/chatsetting/impl/group/avatar/mvp/IAvatarEditContract$IModel;", "view", "Lcom/ss/android/lark/chatsetting/impl/group/avatar/mvp/IAvatarEditContract$IView;", "(Lcom/ss/android/lark/chatsetting/impl/group/avatar/mvp/IAvatarEditContract$IModel;Lcom/ss/android/lark/chatsetting/impl/group/avatar/mvp/IAvatarEditContract$IView;)V", "getModel", "()Lcom/ss/android/lark/chatsetting/impl/group/avatar/mvp/IAvatarEditContract$IModel;", "getView", "()Lcom/ss/android/lark/chatsetting/impl/group/avatar/mvp/IAvatarEditContract$IView;", "getColorList", "", "getColorRes", "", "colorInt", "getRecommendTitle", "", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.group.avatar.mvp.a */
public abstract class AvatarEditDelegate implements AbstractC34597d.AbstractC34598a.AbstractC34599a, AbstractC34597d.AbstractC34600b.AbstractC34601a {

    /* renamed from: a */
    private final AbstractC34597d.AbstractC34598a f89326a;

    /* renamed from: b */
    private final AbstractC34597d.AbstractC34600b f89327b;

    /* renamed from: b */
    public AbstractC34597d.AbstractC34598a mo127754b() {
        return this.f89326a;
    }

    /* renamed from: d */
    public AbstractC34597d.AbstractC34600b mo127756d() {
        return this.f89327b;
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.avatar.mvp.AbstractC34597d.AbstractC34600b.AbstractC34601a
    /* renamed from: f */
    public int[] mo127807f() {
        return mo127754b().mo127815c();
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.avatar.mvp.AbstractC34597d.AbstractC34600b.AbstractC34601a
    /* renamed from: g */
    public void mo127808g() {
        mo127754b().mo127814b(new UIGetDataCallback(new C34589a(this)));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/chatsetting/impl/group/avatar/mvp/AvatarEditDelegate$getRecommendTitle$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.avatar.mvp.a$a */
    public static final class C34589a implements IGetDataCallback<List<? extends String>> {

        /* renamed from: a */
        final /* synthetic */ AvatarEditDelegate f89328a;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C34589a(AvatarEditDelegate aVar) {
            this.f89328a = aVar;
        }

        /* renamed from: a */
        public void onSuccess(List<String> list) {
            this.f89328a.mo127756d().mo127797a(list);
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.avatar.mvp.AbstractC34597d.AbstractC34600b.AbstractC34601a
    /* renamed from: a */
    public int mo127806a(int i) {
        return mo127754b().mo127810a(i);
    }

    public AvatarEditDelegate(AbstractC34597d.AbstractC34598a aVar, AbstractC34597d.AbstractC34600b bVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "model");
        Intrinsics.checkParameterIsNotNull(bVar, "view");
        this.f89326a = aVar;
        this.f89327b = bVar;
    }
}
