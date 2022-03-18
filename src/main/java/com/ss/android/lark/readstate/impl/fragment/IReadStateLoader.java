package com.ss.android.lark.readstate.impl.fragment;

import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.readstate.impl.detail.C53123f;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u000b2\u00020\u0001:\u0002\u000b\fJ,\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bH&¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/readstate/impl/fragment/IReadStateLoader;", "", "loadNextPage", "", "messageId", "", "cursor", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Lcom/ss/android/lark/readstate/impl/detail/ReadStateEntity;", "Companion", "OnLoadNextPageListener", "im_readstate_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.readstate.impl.fragment.c */
public interface IReadStateLoader {

    /* renamed from: a */
    public static final Companion f131396a = Companion.f131397a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/readstate/impl/fragment/IReadStateLoader$OnLoadNextPageListener;", "", "onGetNextPage", "", "cursor", "", "im_readstate_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.readstate.impl.fragment.c$b */
    public interface OnLoadNextPageListener {
        void onGetNextPage(String str);
    }

    /* renamed from: a */
    void mo181454a(String str, String str2, IGetDataCallback<List<C53123f>> iGetDataCallback);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/readstate/impl/fragment/IReadStateLoader$Companion;", "", "()V", "patchLimitItem", "", "entities", "", "Lcom/ss/android/lark/readstate/impl/detail/ReadStateEntity;", "dataType", "", "im_readstate_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.readstate.impl.fragment.c$a */
    public static final class Companion {

        /* renamed from: a */
        static final /* synthetic */ Companion f131397a = new Companion();

        private Companion() {
        }

        /* renamed from: a */
        public final void mo181464a(List<C53123f> list, int i) {
            Intrinsics.checkParameterIsNotNull(list, "entities");
            if (list.size() > 0) {
                list.get(list.size() - 1).f131378c = true;
                C53123f fVar = new C53123f("");
                fVar.f131382g = i;
                list.add(fVar);
            }
        }
    }
}
