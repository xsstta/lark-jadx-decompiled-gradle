package com.ss.android.lark.feed.app.filter.data;

import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.feed.app.filter.data.IFilterDataLoader;
import com.ss.android.lark.feed.common.FeedFgUtils;
import com.ss.android.lark.feed.dto.FeedFilterTabInfo;
import com.ss.android.lark.feed.service.impl.C38146f;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/feed/app/filter/data/FilterDataLoader;", "Lcom/ss/android/lark/feed/app/filter/data/IFilterDataLoader;", "()V", "netLoad", "", "callback", "Lcom/ss/android/lark/feed/app/filter/data/IFilterDataLoader$FilterLoadCallback;", "Companion", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.feed.app.filter.data.a */
public final class FilterDataLoader implements IFilterDataLoader {

    /* renamed from: a */
    public static final Companion f96299a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/feed/app/filter/data/FilterDataLoader$Companion;", "", "()V", "LOG_TAG", "", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.filter.data.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/feed/app/filter/data/FilterDataLoader$netLoad$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/feed/dto/FeedFilterTabInfo;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.filter.data.a$b */
    public static final class C37555b implements IGetDataCallback<FeedFilterTabInfo> {

        /* renamed from: a */
        final /* synthetic */ IFilterDataLoader.FilterLoadCallback f96300a;

        C37555b(IFilterDataLoader.FilterLoadCallback aVar) {
            this.f96300a = aVar;
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165379d("FilterDataLoader", errorResult.getDebugMsg());
            IFilterDataLoader.FilterLoadCallback aVar = this.f96300a;
            if (aVar != null) {
                IFilterDataLoader.FilterLoadCallback.C37556a.m147708a(aVar, new ArrayList(), false, 2, null);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:25:0x007c  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x00fa  */
        /* JADX WARNING: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onSuccess(com.ss.android.lark.feed.dto.FeedFilterTabInfo r17) {
            /*
            // Method dump skipped, instructions count: 280
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.feed.app.filter.data.FilterDataLoader.C37555b.onSuccess(com.ss.android.lark.feed.dto.c):void");
        }
    }

    /* renamed from: a */
    public void mo137828a(IFilterDataLoader.FilterLoadCallback aVar) {
        if (FeedFgUtils.m146773b()) {
            C38146f.m149976a().mo139506d(new C37555b(aVar));
        }
    }
}
