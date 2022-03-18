package com.ss.android.lark.setting.page.content.general.feedfilter;

import android.graphics.drawable.ColorDrawable;
import com.bytedance.lark.pb.feed.v1.FeedFilter;
import com.bytedance.lark.pb.feed.v1.UpdateFeedFilterSettingsRequest;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.setting.page.content.general.feedfilter.IFeedMessageFilterContract;
import com.ss.android.lark.setting.page.content.general.feedfilter.dto.FeedFilter;
import com.ss.android.lark.setting.page.content.general.feedfilter.dto.FeedFilterTabInfo;
import com.ss.android.lark.setting.page.content.general.feedfilter.dto.FeedTabInfo;
import com.ss.android.lark.setting.page.content.general.feedfilter.dto.FeedTabInfoList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \u00112\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0002\u0011\u0012B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u0004H\u0014J\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/setting/page/content/general/feedfilter/FeedMessageFilterPresenter;", "Lcom/larksuite/framework/mvp/BasePresenter;", "Lcom/ss/android/lark/setting/page/content/general/feedfilter/IFeedMessageFilterContract$IModel;", "Lcom/ss/android/lark/setting/page/content/general/feedfilter/IFeedMessageFilterContract$IView;", "Lcom/ss/android/lark/setting/page/content/general/feedfilter/IFeedMessageFilterContract$IView$Delegate;", "model", "view", "(Lcom/ss/android/lark/setting/page/content/general/feedfilter/IFeedMessageFilterContract$IModel;Lcom/ss/android/lark/setting/page/content/general/feedfilter/IFeedMessageFilterContract$IView;)V", "cacheFeedTabInfo", "Lcom/ss/android/lark/setting/page/content/general/feedfilter/dto/FeedFilterTabInfo;", "viewDelegate", "create", "", "createViewDelegate", "updateFeedFilterSetting", "forceServer", "", "Companion", "FeedMessageFilterViewDelegate", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.setting.page.content.general.feedfilter.h */
public final class FeedMessageFilterPresenter extends BasePresenter<IFeedMessageFilterContract.IModel, IFeedMessageFilterContract.IView, IFeedMessageFilterContract.IView.Delegate> {

    /* renamed from: b */
    public static final Companion f134792b = new Companion(null);

    /* renamed from: a */
    public FeedFilterTabInfo f134793a;

    /* renamed from: c */
    private IFeedMessageFilterContract.IView.Delegate f134794c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J6\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\nH\u0002J\f\u0010\r\u001a\u00020\u0006*\u00020\u000eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/setting/page/content/general/feedfilter/FeedMessageFilterPresenter$Companion;", "", "()V", "LOG_TAG", "", "tabItem", "Lcom/ss/android/lark/setting/page/content/general/feedfilter/dto/FeedTabInfo;", "key", "name", "unmovable", "", "primaryOnly", "notRemove", "toFeedTabInfo", "Lcom/bytedance/lark/pb/feed/v1/FeedFilter;", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.general.feedfilter.h$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final FeedTabInfo mo186333a(FeedFilter feedFilter) {
            FeedFilter.Type type = feedFilter.filter_type;
            Intrinsics.checkExpressionValueIsNotNull(type, "filter_type");
            if (type.getValue() == com.ss.android.lark.setting.page.content.general.feedfilter.dto.FeedFilter.MUTE.getValue()) {
                FeedFilter.Type type2 = feedFilter.filter_type;
                Intrinsics.checkExpressionValueIsNotNull(type2, "this.filter_type");
                String valueOf = String.valueOf(type2.getValue());
                FeedFilter.Companion aVar = com.ss.android.lark.setting.page.content.general.feedfilter.dto.FeedFilter.Companion;
                FeedFilter.Type type3 = feedFilter.filter_type;
                Intrinsics.checkExpressionValueIsNotNull(type3, "this.filter_type");
                return m211520a(this, valueOf, aVar.mo186304a(type3.getValue()).toString(), false, false, true, 12, null);
            }
            FeedFilter.Type type4 = feedFilter.filter_type;
            Intrinsics.checkExpressionValueIsNotNull(type4, "this.filter_type");
            String valueOf2 = String.valueOf(type4.getValue());
            FeedFilter.Companion aVar2 = com.ss.android.lark.setting.page.content.general.feedfilter.dto.FeedFilter.Companion;
            FeedFilter.Type type5 = feedFilter.filter_type;
            Intrinsics.checkExpressionValueIsNotNull(type5, "this.filter_type");
            return m211520a(this, valueOf2, aVar2.mo186304a(type5.getValue()).toString(), false, false, false, 28, null);
        }

        /* renamed from: a */
        private final FeedTabInfo m211521a(String str, String str2, boolean z, boolean z2, boolean z3) {
            return new FeedTabInfo(str, str2, new ColorDrawable(-1), z, z3, z2);
        }

        /* renamed from: a */
        static /* synthetic */ FeedTabInfo m211520a(Companion aVar, String str, String str2, boolean z, boolean z2, boolean z3, int i, Object obj) {
            boolean z4;
            boolean z5;
            boolean z6;
            if ((i & 4) != 0) {
                z4 = false;
            } else {
                z4 = z;
            }
            if ((i & 8) != 0) {
                z5 = false;
            } else {
                z5 = z2;
            }
            if ((i & 16) != 0) {
                z6 = false;
            } else {
                z6 = z3;
            }
            return aVar.m211521a(str, str2, z4, z5, z6);
        }
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        mo186332a(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public IFeedMessageFilterContract.IView.Delegate createViewDelegate() {
        FeedMessageFilterViewDelegate bVar = new FeedMessageFilterViewDelegate();
        this.f134794c = bVar;
        if (bVar != null) {
            return bVar;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.setting.page.content.general.feedfilter.FeedMessageFilterPresenter.FeedMessageFilterViewDelegate");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J3\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/setting/page/content/general/feedfilter/FeedMessageFilterPresenter$FeedMessageFilterViewDelegate;", "Lcom/ss/android/lark/setting/page/content/general/feedfilter/IFeedMessageFilterContract$IView$Delegate;", "(Lcom/ss/android/lark/setting/page/content/general/feedfilter/FeedMessageFilterPresenter;)V", "updateFeedFilterSetting", "", "isFeedFilterEnabled", "", "myFilterSelectionsWithoutAll", "", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "(Ljava/lang/Boolean;Ljava/util/List;Lcom/larksuite/framework/callback/IGetDataCallback;)V", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.general.feedfilter.h$b */
    public final class FeedMessageFilterViewDelegate implements IFeedMessageFilterContract.IView.Delegate {
        /* JADX WARN: Incorrect args count in method signature: ()V */
        public FeedMessageFilterViewDelegate() {
        }

        @Override // com.ss.android.lark.setting.page.content.general.feedfilter.IFeedMessageFilterContract.IView.Delegate
        /* renamed from: a */
        public void mo186334a(Boolean bool, List<String> list, IGetDataCallback<Long> iGetDataCallback) {
            Boolean bool2;
            Intrinsics.checkParameterIsNotNull(list, "myFilterSelectionsWithoutAll");
            Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
            List<String> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(new FeedFilter.C17128a().mo60364a(FeedFilter.Type.fromValue(Integer.parseInt(it.next()))).build());
            }
            ArrayList arrayList2 = arrayList;
            UpdateFeedFilterSettingsRequest.C17242a aVar = new UpdateFeedFilterSettingsRequest.C17242a();
            Boolean bool3 = null;
            if (bool == null) {
                FeedFilterTabInfo bVar = FeedMessageFilterPresenter.this.f134793a;
                if (bVar != null) {
                    bool = Boolean.valueOf(bVar.mo186307a());
                } else {
                    bool = null;
                }
            }
            UpdateFeedFilterSettingsRequest.C17242a a = aVar.mo60626a(bool).mo60627a(arrayList2);
            FeedFilterTabInfo bVar2 = FeedMessageFilterPresenter.this.f134793a;
            if (bVar2 != null) {
                bool2 = Boolean.valueOf(bVar2.mo186312d());
            } else {
                bool2 = null;
            }
            UpdateFeedFilterSettingsRequest.C17242a b = a.mo60629b(bool2);
            FeedFilterTabInfo bVar3 = FeedMessageFilterPresenter.this.f134793a;
            if (bVar3 != null) {
                bool3 = Boolean.valueOf(bVar3.mo186313e());
            }
            UpdateFeedFilterSettingsRequest.C17242a c = b.mo60630c(bool3);
            Intrinsics.checkExpressionValueIsNotNull(c, "requestBuilder");
            ((IFeedMessageFilterContract.IModel) FeedMessageFilterPresenter.this.getModel()).mo186329a(c, iGetDataCallback);
        }
    }

    /* renamed from: a */
    public final void mo186332a(boolean z) {
        ((IFeedMessageFilterContract.IModel) getModel()).mo186330a(new UIGetDataCallback(new C54523c(this, z)), z);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/setting/page/content/general/feedfilter/FeedMessageFilterPresenter$updateFeedFilterSetting$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/setting/page/content/general/feedfilter/dto/FeedFilterTabInfo;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.general.feedfilter.h$c */
    public static final class C54523c implements IGetDataCallback<FeedFilterTabInfo> {

        /* renamed from: a */
        final /* synthetic */ FeedMessageFilterPresenter f134796a;

        /* renamed from: b */
        final /* synthetic */ boolean f134797b;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            if (!this.f134797b) {
                this.f134796a.mo186332a(true);
                return;
            }
            Log.m165389i("FeedMessageFilterPresenter", errorResult.getDebugMsg());
            List mutableList = CollectionsKt.toMutableList((Collection) CollectionsKt.emptyList());
            com.ss.android.lark.setting.page.content.general.feedfilter.dto.FeedFilter[] values = com.ss.android.lark.setting.page.content.general.feedfilter.dto.FeedFilter.values();
            ArrayList arrayList = new ArrayList();
            for (com.ss.android.lark.setting.page.content.general.feedfilter.dto.FeedFilter feedFilter : values) {
                if (feedFilter == com.ss.android.lark.setting.page.content.general.feedfilter.dto.FeedFilter.INBOX || feedFilter == com.ss.android.lark.setting.page.content.general.feedfilter.dto.FeedFilter.UNKNOWN) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    arrayList.add(feedFilter);
                }
            }
            ArrayList<com.ss.android.lark.setting.page.content.general.feedfilter.dto.FeedFilter> arrayList2 = arrayList;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
            for (com.ss.android.lark.setting.page.content.general.feedfilter.dto.FeedFilter feedFilter2 : arrayList2) {
                arrayList3.add(Companion.m211520a(FeedMessageFilterPresenter.f134792b, String.valueOf(feedFilter2.getValue()), feedFilter2.toString(), false, false, false, 28, null));
            }
            mutableList.add(0, Companion.m211520a(FeedMessageFilterPresenter.f134792b, String.valueOf(com.ss.android.lark.setting.page.content.general.feedfilter.dto.FeedFilter.INBOX.getValue()), com.ss.android.lark.setting.page.content.general.feedfilter.dto.FeedFilter.INBOX.toString(), true, true, false, 16, null));
            ((IFeedMessageFilterContract.IView) this.f134796a.getView()).mo186193a(false, new FeedTabInfoList(mutableList, arrayList3));
        }

        /* JADX WARNING: Code restructure failed: missing block: B:28:0x00e0, code lost:
            if (r7.getValue() == com.ss.android.lark.setting.page.content.general.feedfilter.dto.FeedFilter.MUTE.getValue()) goto L_0x00e5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x003d, code lost:
            if (r5.getValue() == com.ss.android.lark.setting.page.content.general.feedfilter.dto.FeedFilter.MUTE.getValue()) goto L_0x0041;
         */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x00e8  */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x01b5  */
        /* JADX WARNING: Removed duplicated region for block: B:66:0x008b A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onSuccess(com.ss.android.lark.setting.page.content.general.feedfilter.dto.FeedFilterTabInfo r14) {
            /*
            // Method dump skipped, instructions count: 443
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.setting.page.content.general.feedfilter.FeedMessageFilterPresenter.C54523c.onSuccess(com.ss.android.lark.setting.page.content.general.feedfilter.dto.b):void");
        }

        C54523c(FeedMessageFilterPresenter hVar, boolean z) {
            this.f134796a = hVar;
            this.f134797b = z;
        }
    }

    public FeedMessageFilterPresenter(IFeedMessageFilterContract.IModel aVar, IFeedMessageFilterContract.IView bVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "model");
        Intrinsics.checkParameterIsNotNull(bVar, "view");
        setModel(aVar);
        setView(bVar);
        ((IFeedMessageFilterContract.IView) getView()).setViewDelegate(createViewDelegate());
    }
}
