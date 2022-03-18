package com.ss.android.lark.readstate.impl.fragment;

import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.readstate.ReadStateModule;
import com.ss.android.lark.readstate.dto.MessageReadStateResponseDTO;
import com.ss.android.lark.readstate.impl.detail.C53123f;
import com.ss.android.lark.readstate.impl.detail.ReadStateEntityParser;
import com.ss.android.lark.readstate.impl.fragment.IReadStateLoader;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J,\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\rH\u0016R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/readstate/impl/fragment/UnReadLoader;", "Lcom/ss/android/lark/readstate/impl/fragment/IReadStateLoader;", "listener", "Lcom/ss/android/lark/readstate/impl/fragment/IReadStateLoader$OnLoadNextPageListener;", "(Lcom/ss/android/lark/readstate/impl/fragment/IReadStateLoader$OnLoadNextPageListener;)V", "getListener", "()Lcom/ss/android/lark/readstate/impl/fragment/IReadStateLoader$OnLoadNextPageListener;", "loadNextPage", "", "messageId", "", "cursor", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Lcom/ss/android/lark/readstate/impl/detail/ReadStateEntity;", "im_readstate_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.readstate.impl.fragment.h */
public final class UnReadLoader implements IReadStateLoader {

    /* renamed from: b */
    private final IReadStateLoader.OnLoadNextPageListener f131413b;

    public UnReadLoader(IReadStateLoader.OnLoadNextPageListener bVar) {
        this.f131413b = bVar;
    }

    @Override // com.ss.android.lark.readstate.impl.fragment.IReadStateLoader
    /* renamed from: a */
    public void mo181454a(String str, String str2, IGetDataCallback<List<C53123f>> iGetDataCallback) {
        IReadStateLoader.OnLoadNextPageListener bVar;
        Intrinsics.checkParameterIsNotNull(str, "messageId");
        Intrinsics.checkParameterIsNotNull(str2, "cursor");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        MessageReadStateResponseDTO a = ReadStateModule.m205502a().mo144089a(str, 2, str2);
        if (a != null) {
            String j = a.mo181363j();
            if (!(j == null || (bVar = this.f131413b) == null)) {
                bVar.onGetNextPage(j);
            }
            List<C53123f> a2 = ReadStateEntityParser.f131385a.mo181442a(2, Message.Type.TEXT, a.mo181353b(), a.mo181354c());
            if (TextUtils.isEmpty(a.mo181363j()) && a.mo181359g()) {
                IReadStateLoader.f131396a.mo181464a(a2, 5);
            }
            iGetDataCallback.onSuccess(a2);
            return;
        }
        iGetDataCallback.onError(new ErrorResult("can not get unread state"));
    }
}
