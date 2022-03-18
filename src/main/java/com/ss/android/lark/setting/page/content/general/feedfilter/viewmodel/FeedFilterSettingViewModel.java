package com.ss.android.lark.setting.page.content.general.feedfilter.viewmodel;

import com.bytedance.lark.pb.feed.v1.FeedFilter;
import com.bytedance.lark.pb.feed.v1.UpdateFeedFilterSettingsRequest;
import com.google.firebase.messaging.Constants;
import com.larksuite.arch.jack.Fail;
import com.larksuite.arch.jack.JackViewModel;
import com.larksuite.arch.jack.Success;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.setting.page.content.general.feedfilter.dto.FeedFilterTabInfo;
import com.ss.android.lark.setting.page.content.general.feedfilter.model.FeedFilterSettingModel;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0002H\u0014J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0012J\u000e\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0014J\u000e\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0014J\u000e\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/setting/page/content/general/feedfilter/viewmodel/FeedFilterSettingViewModel;", "Lcom/larksuite/arch/jack/JackViewModel;", "Lcom/ss/android/lark/setting/page/content/general/feedfilter/viewmodel/FeedFilterSettingState;", "()V", "cacheFilterSetting", "Lcom/ss/android/lark/setting/page/content/general/feedfilter/dto/FeedFilterTabInfo;", "getCacheFilterSetting", "()Lcom/ss/android/lark/setting/page/content/general/feedfilter/dto/FeedFilterTabInfo;", "setCacheFilterSetting", "(Lcom/ss/android/lark/setting/page/content/general/feedfilter/dto/FeedFilterTabInfo;)V", "model", "Lcom/ss/android/lark/setting/page/content/general/feedfilter/model/FeedFilterSettingModel;", "getModel", "()Lcom/ss/android/lark/setting/page/content/general/feedfilter/model/FeedFilterSettingModel;", "model$delegate", "Lkotlin/Lazy;", "defaultState", "requestFeedFilterSetting", "", "forceServer", "", "requestFeedFilterSettingFromCache", "updateAtFeedFilterSetting", "enableAtAll", "updateFeedFilterSetting", "feedFilterEnabled", "updateMuteFilterSetting", "muteFilterEnable", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.setting.page.content.general.feedfilter.d.b */
public final class FeedFilterSettingViewModel extends JackViewModel<FeedFilterSettingState> {
    private FeedFilterTabInfo cacheFilterSetting;
    private final Lazy model$delegate = LazyKt.lazy(C54504a.INSTANCE);

    private final FeedFilterSettingModel getModel() {
        return (FeedFilterSettingModel) this.model$delegate.getValue();
    }

    public final FeedFilterTabInfo getCacheFilterSetting() {
        return this.cacheFilterSetting;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/setting/page/content/general/feedfilter/model/FeedFilterSettingModel;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.general.feedfilter.d.b$a */
    static final class C54504a extends Lambda implements Function0<FeedFilterSettingModel> {
        public static final C54504a INSTANCE = new C54504a();

        C54504a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final FeedFilterSettingModel invoke() {
            return new FeedFilterSettingModel();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.arch.jack.JackViewModel
    public FeedFilterSettingState defaultState() {
        return new FeedFilterSettingState(null, null, null, null, 15, null);
    }

    public final void requestFeedFilterSettingFromCache() {
        getModel().mo186235a(false, (IGetDataCallback<FeedFilterTabInfo>) new C54508c(this));
    }

    public final void setCacheFilterSetting(FeedFilterTabInfo bVar) {
        this.cacheFilterSetting = bVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/setting/page/content/general/feedfilter/viewmodel/FeedFilterSettingViewModel$requestFeedFilterSettingFromCache$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/setting/page/content/general/feedfilter/dto/FeedFilterTabInfo;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.general.feedfilter.d.b$c */
    public static final class C54508c implements IGetDataCallback<FeedFilterTabInfo> {

        /* renamed from: a */
        final /* synthetic */ FeedFilterSettingViewModel f134770a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C54508c(FeedFilterSettingViewModel bVar) {
            this.f134770a = bVar;
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/setting/page/content/general/feedfilter/viewmodel/FeedFilterSettingState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.setting.page.content.general.feedfilter.d.b$c$a */
        public static final class C54509a extends Lambda implements Function1<FeedFilterSettingState, FeedFilterSettingState> {
            final /* synthetic */ ErrorResult $err;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C54509a(ErrorResult errorResult) {
                super(1);
                this.$err = errorResult;
            }

            public final FeedFilterSettingState invoke(FeedFilterSettingState aVar) {
                Intrinsics.checkParameterIsNotNull(aVar, "$receiver");
                return FeedFilterSettingState.m211487a(aVar, new Fail(this.$err), null, null, null, 14, null);
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/setting/page/content/general/feedfilter/viewmodel/FeedFilterSettingState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.setting.page.content.general.feedfilter.d.b$c$b */
        public static final class C54510b extends Lambda implements Function1<FeedFilterSettingState, FeedFilterSettingState> {
            final /* synthetic */ FeedFilterTabInfo $data;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C54510b(FeedFilterTabInfo bVar) {
                super(1);
                this.$data = bVar;
            }

            public final FeedFilterSettingState invoke(FeedFilterSettingState aVar) {
                Intrinsics.checkParameterIsNotNull(aVar, "$receiver");
                return FeedFilterSettingState.m211487a(aVar, new Success(this.$data), null, null, null, 14, null);
            }
        }

        /* renamed from: a */
        public void onSuccess(FeedFilterTabInfo bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            this.f134770a.setCacheFilterSetting(bVar);
            this.f134770a.setState(new C54510b(bVar));
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f134770a.setCacheFilterSetting(null);
            this.f134770a.setState(new C54509a(errorResult));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/setting/page/content/general/feedfilter/viewmodel/FeedFilterSettingViewModel$updateAtFeedFilterSetting$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.general.feedfilter.d.b$d */
    public static final class C54511d implements IGetDataCallback<Long> {

        /* renamed from: a */
        final /* synthetic */ FeedFilterSettingViewModel f134771a;

        /* renamed from: b */
        final /* synthetic */ boolean f134772b;

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
        public /* synthetic */ void onSuccess(Long l) {
            mo186293a(l.longValue());
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/setting/page/content/general/feedfilter/viewmodel/FeedFilterSettingState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.setting.page.content.general.feedfilter.d.b$d$a */
        public static final class C54512a extends Lambda implements Function1<FeedFilterSettingState, FeedFilterSettingState> {
            final /* synthetic */ ErrorResult $err;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C54512a(ErrorResult errorResult) {
                super(1);
                this.$err = errorResult;
            }

            public final FeedFilterSettingState invoke(FeedFilterSettingState aVar) {
                Intrinsics.checkParameterIsNotNull(aVar, "$receiver");
                return FeedFilterSettingState.m211487a(aVar, null, null, null, new Fail(this.$err), 7, null);
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/setting/page/content/general/feedfilter/viewmodel/FeedFilterSettingState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.setting.page.content.general.feedfilter.d.b$d$b */
        public static final class C54513b extends Lambda implements Function1<FeedFilterSettingState, FeedFilterSettingState> {
            final /* synthetic */ long $data;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C54513b(long j) {
                super(1);
                this.$data = j;
            }

            public final FeedFilterSettingState invoke(FeedFilterSettingState aVar) {
                Intrinsics.checkParameterIsNotNull(aVar, "$receiver");
                return FeedFilterSettingState.m211487a(aVar, null, null, null, new Success(Long.valueOf(this.$data)), 7, null);
            }
        }

        /* renamed from: a */
        public void mo186293a(long j) {
            FeedFilterTabInfo cacheFilterSetting = this.f134771a.getCacheFilterSetting();
            if (cacheFilterSetting != null) {
                cacheFilterSetting.mo186311c(this.f134772b);
            }
            this.f134771a.setState(new C54513b(j));
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f134771a.setState(new C54512a(errorResult));
        }

        C54511d(FeedFilterSettingViewModel bVar, boolean z) {
            this.f134771a = bVar;
            this.f134772b = z;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/setting/page/content/general/feedfilter/viewmodel/FeedFilterSettingViewModel$updateFeedFilterSetting$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.general.feedfilter.d.b$e */
    public static final class C54514e implements IGetDataCallback<Long> {

        /* renamed from: a */
        final /* synthetic */ FeedFilterSettingViewModel f134773a;

        /* renamed from: b */
        final /* synthetic */ boolean f134774b;

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
        public /* synthetic */ void onSuccess(Long l) {
            mo186296a(l.longValue());
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/setting/page/content/general/feedfilter/viewmodel/FeedFilterSettingState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.setting.page.content.general.feedfilter.d.b$e$a */
        public static final class C54515a extends Lambda implements Function1<FeedFilterSettingState, FeedFilterSettingState> {
            final /* synthetic */ ErrorResult $err;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C54515a(ErrorResult errorResult) {
                super(1);
                this.$err = errorResult;
            }

            public final FeedFilterSettingState invoke(FeedFilterSettingState aVar) {
                Intrinsics.checkParameterIsNotNull(aVar, "$receiver");
                return FeedFilterSettingState.m211487a(aVar, null, new Fail(this.$err), null, null, 13, null);
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/setting/page/content/general/feedfilter/viewmodel/FeedFilterSettingState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.setting.page.content.general.feedfilter.d.b$e$b */
        public static final class C54516b extends Lambda implements Function1<FeedFilterSettingState, FeedFilterSettingState> {
            final /* synthetic */ long $data;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C54516b(long j) {
                super(1);
                this.$data = j;
            }

            public final FeedFilterSettingState invoke(FeedFilterSettingState aVar) {
                Intrinsics.checkParameterIsNotNull(aVar, "$receiver");
                return FeedFilterSettingState.m211487a(aVar, null, new Success(Long.valueOf(this.$data)), null, null, 13, null);
            }
        }

        /* renamed from: a */
        public void mo186296a(long j) {
            FeedFilterTabInfo cacheFilterSetting = this.f134773a.getCacheFilterSetting();
            if (cacheFilterSetting != null) {
                cacheFilterSetting.mo186306a(this.f134774b);
            }
            this.f134773a.setState(new C54516b(j));
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f134773a.setState(new C54515a(errorResult));
        }

        C54514e(FeedFilterSettingViewModel bVar, boolean z) {
            this.f134773a = bVar;
            this.f134774b = z;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/setting/page/content/general/feedfilter/viewmodel/FeedFilterSettingViewModel$updateMuteFilterSetting$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.general.feedfilter.d.b$f */
    public static final class C54517f implements IGetDataCallback<Long> {

        /* renamed from: a */
        final /* synthetic */ FeedFilterSettingViewModel f134775a;

        /* renamed from: b */
        final /* synthetic */ boolean f134776b;

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
        public /* synthetic */ void onSuccess(Long l) {
            mo186299a(l.longValue());
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/setting/page/content/general/feedfilter/viewmodel/FeedFilterSettingState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.setting.page.content.general.feedfilter.d.b$f$a */
        public static final class C54518a extends Lambda implements Function1<FeedFilterSettingState, FeedFilterSettingState> {
            final /* synthetic */ ErrorResult $err;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C54518a(ErrorResult errorResult) {
                super(1);
                this.$err = errorResult;
            }

            public final FeedFilterSettingState invoke(FeedFilterSettingState aVar) {
                Intrinsics.checkParameterIsNotNull(aVar, "$receiver");
                return FeedFilterSettingState.m211487a(aVar, null, null, new Fail(this.$err), null, 11, null);
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/setting/page/content/general/feedfilter/viewmodel/FeedFilterSettingState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.setting.page.content.general.feedfilter.d.b$f$b */
        public static final class C54519b extends Lambda implements Function1<FeedFilterSettingState, FeedFilterSettingState> {
            final /* synthetic */ long $data;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C54519b(long j) {
                super(1);
                this.$data = j;
            }

            public final FeedFilterSettingState invoke(FeedFilterSettingState aVar) {
                Intrinsics.checkParameterIsNotNull(aVar, "$receiver");
                return FeedFilterSettingState.m211487a(aVar, null, null, new Success(Long.valueOf(this.$data)), null, 11, null);
            }
        }

        /* renamed from: a */
        public void mo186299a(long j) {
            FeedFilterTabInfo cacheFilterSetting = this.f134775a.getCacheFilterSetting();
            if (cacheFilterSetting != null) {
                cacheFilterSetting.mo186309b(this.f134776b);
            }
            this.f134775a.setState(new C54519b(j));
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f134775a.setState(new C54518a(errorResult));
        }

        C54517f(FeedFilterSettingViewModel bVar, boolean z) {
            this.f134775a = bVar;
            this.f134776b = z;
        }
    }

    public final void requestFeedFilterSetting(boolean z) {
        getModel().mo186235a(z, new C54505b(this, z));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/setting/page/content/general/feedfilter/viewmodel/FeedFilterSettingViewModel$requestFeedFilterSetting$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/setting/page/content/general/feedfilter/dto/FeedFilterTabInfo;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.general.feedfilter.d.b$b */
    public static final class C54505b implements IGetDataCallback<FeedFilterTabInfo> {

        /* renamed from: a */
        final /* synthetic */ FeedFilterSettingViewModel f134768a;

        /* renamed from: b */
        final /* synthetic */ boolean f134769b;

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/setting/page/content/general/feedfilter/viewmodel/FeedFilterSettingState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.setting.page.content.general.feedfilter.d.b$b$a */
        public static final class C54506a extends Lambda implements Function1<FeedFilterSettingState, FeedFilterSettingState> {
            final /* synthetic */ ErrorResult $err;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C54506a(ErrorResult errorResult) {
                super(1);
                this.$err = errorResult;
            }

            public final FeedFilterSettingState invoke(FeedFilterSettingState aVar) {
                Intrinsics.checkParameterIsNotNull(aVar, "$receiver");
                return FeedFilterSettingState.m211487a(aVar, new Fail(this.$err), null, null, null, 14, null);
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/setting/page/content/general/feedfilter/viewmodel/FeedFilterSettingState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.setting.page.content.general.feedfilter.d.b$b$b */
        public static final class C54507b extends Lambda implements Function1<FeedFilterSettingState, FeedFilterSettingState> {
            final /* synthetic */ FeedFilterTabInfo $data;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C54507b(FeedFilterTabInfo bVar) {
                super(1);
                this.$data = bVar;
            }

            public final FeedFilterSettingState invoke(FeedFilterSettingState aVar) {
                Intrinsics.checkParameterIsNotNull(aVar, "$receiver");
                return FeedFilterSettingState.m211487a(aVar, new Success(this.$data), null, null, null, 14, null);
            }
        }

        /* renamed from: a */
        public void onSuccess(FeedFilterTabInfo bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            this.f134768a.setCacheFilterSetting(bVar);
            this.f134768a.setState(new C54507b(bVar));
            if (!this.f134769b) {
                this.f134768a.requestFeedFilterSetting(true);
            }
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f134768a.setCacheFilterSetting(null);
            this.f134768a.setState(new C54506a(errorResult));
            if (!this.f134769b) {
                this.f134768a.requestFeedFilterSetting(true);
            }
        }

        C54505b(FeedFilterSettingViewModel bVar, boolean z) {
            this.f134768a = bVar;
            this.f134769b = z;
        }
    }

    public final void updateAtFeedFilterSetting(boolean z) {
        UpdateFeedFilterSettingsRequest.C17242a c = new UpdateFeedFilterSettingsRequest.C17242a().mo60630c(Boolean.valueOf(z));
        FeedFilterSettingModel model = getModel();
        Intrinsics.checkExpressionValueIsNotNull(c, "requestBuilder");
        model.mo186234a(c, new C54511d(this, z));
    }

    public final void updateFeedFilterSetting(boolean z) {
        List<FeedFilter> list;
        Boolean bool;
        UpdateFeedFilterSettingsRequest.C17242a a = new UpdateFeedFilterSettingsRequest.C17242a().mo60626a(Boolean.valueOf(z));
        FeedFilterTabInfo bVar = this.cacheFilterSetting;
        Boolean bool2 = null;
        if (bVar != null) {
            list = bVar.mo186308b();
        } else {
            list = null;
        }
        UpdateFeedFilterSettingsRequest.C17242a a2 = a.mo60627a(list);
        FeedFilterTabInfo bVar2 = this.cacheFilterSetting;
        if (bVar2 != null) {
            bool = Boolean.valueOf(bVar2.mo186312d());
        } else {
            bool = null;
        }
        UpdateFeedFilterSettingsRequest.C17242a b = a2.mo60629b(bool);
        FeedFilterTabInfo bVar3 = this.cacheFilterSetting;
        if (bVar3 != null) {
            bool2 = Boolean.valueOf(bVar3.mo186313e());
        }
        UpdateFeedFilterSettingsRequest.C17242a c = b.mo60630c(bool2);
        FeedFilterSettingModel model = getModel();
        Intrinsics.checkExpressionValueIsNotNull(c, "requestBuilder");
        model.mo186234a(c, new C54514e(this, z));
    }

    public final void updateMuteFilterSetting(boolean z) {
        Boolean bool;
        List<FeedFilter> list;
        UpdateFeedFilterSettingsRequest.C17242a aVar = new UpdateFeedFilterSettingsRequest.C17242a();
        FeedFilterTabInfo bVar = this.cacheFilterSetting;
        Boolean bool2 = null;
        if (bVar != null) {
            bool = Boolean.valueOf(bVar.mo186307a());
        } else {
            bool = null;
        }
        UpdateFeedFilterSettingsRequest.C17242a b = aVar.mo60626a(bool).mo60629b(Boolean.valueOf(z));
        FeedFilterTabInfo bVar2 = this.cacheFilterSetting;
        if (bVar2 != null) {
            list = bVar2.mo186308b();
        } else {
            list = null;
        }
        UpdateFeedFilterSettingsRequest.C17242a a = b.mo60627a(list);
        FeedFilterTabInfo bVar3 = this.cacheFilterSetting;
        if (bVar3 != null) {
            bool2 = Boolean.valueOf(bVar3.mo186313e());
        }
        UpdateFeedFilterSettingsRequest.C17242a c = a.mo60630c(bool2);
        FeedFilterSettingModel model = getModel();
        Intrinsics.checkExpressionValueIsNotNull(c, "requestBuilder");
        model.mo186234a(c, new C54517f(this, z));
    }
}
