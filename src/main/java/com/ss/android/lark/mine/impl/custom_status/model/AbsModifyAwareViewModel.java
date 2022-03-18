package com.ss.android.lark.mine.impl.custom_status.model;

import com.bytedance.lark.pb.contact.v1.ChatterStatusIcon;
import com.bytedance.lark.pb.contact.v1.CustomStatusSyncField;
import com.bytedance.lark.pb.contact.v1.GetChatterStatusIconsRequest;
import com.bytedance.lark.pb.contact.v1.GetChatterStatusIconsResponse;
import com.bytedance.lark.pb.contact.v1.UpdateUserCustomStatusMeta;
import com.bytedance.lark.pb.contact.v1.UserCustomStatus;
import com.larksuite.arch.jack.JackViewModel;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.rucket.Rucket;
import com.larksuite.rucket.job.RucketJob;
import com.larksuite.suite.R;
import com.ss.android.lark.mine.C45421b;
import com.ss.android.lark.mine.impl.custom_status.UserCustomStatusService;
import com.ss.android.lark.mine.impl.custom_status.emoji_panel.AvatarType;
import com.ss.android.lark.mine.impl.custom_status.emoji_panel.AvatarViewData;
import com.ss.android.lark.mine.impl.custom_status.model.ErrorEvent;
import com.ss.android.lark.mine.impl.custom_status.model.ModifyStatusState;
import com.ss.android.lark.mine.p2270a.AbstractC45399a;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004B\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\bJO\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013¢\u0006\u0002\u0010\u0015JW\u0010\u0016\u001a\u00020\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00132\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u0018H&¢\u0006\u0002\u0010\u0019JI\u0010\u001a\u001a\u00020\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013H&¢\u0006\u0002\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/mine/impl/custom_status/model/AbsModifyAwareViewModel;", "T", "Lcom/ss/android/lark/mine/impl/custom_status/model/ModifyStatusState;", "Lcom/larksuite/arch/jack/JackViewModel;", "Lcom/larksuite/rucket/core/base/ServiceModel;", "Lcom/ss/android/lark/mine/impl/custom_status/UserCustomStatusService;", "()V", "getAvatarList", "", "getModifyMeta", "Lcom/bytedance/lark/pb/contact/v1/UpdateUserCustomStatusMeta;", "current", "Lcom/bytedance/lark/pb/contact/v1/UserCustomStatus;", "title", "", "iconKey", "isNotDisturbMode", "", "syncSetting", "", "Lcom/bytedance/lark/pb/contact/v1/CustomStatusSyncField;", "(Lcom/bytedance/lark/pb/contact/v1/UserCustomStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;)Lcom/bytedance/lark/pb/contact/v1/UpdateUserCustomStatusMeta;", "tryLeave", "onModified", "Lkotlin/Function0;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;Lkotlin/jvm/functions/Function0;)V", "trySave", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;)V", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mine.impl.custom_status.model.a */
public abstract class AbsModifyAwareViewModel<T extends ModifyStatusState<T>> extends JackViewModel<T> {
    public abstract void tryLeave(String str, String str2, Boolean bool, Map<CustomStatusSyncField, Boolean> map, Function0<Unit> function0);

    public abstract void trySave(String str, String str2, Boolean bool, Map<CustomStatusSyncField, Boolean> map);

    public final void getAvatarList() {
        AbstractC45399a a = C45421b.m180420a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MineModule.getDependency()");
        AbstractC45399a.AbstractC45401b r = a.mo133459r();
        Intrinsics.checkExpressionValueIsNotNull(r, "MineModule.getDependency().chatDependency");
        List<String> b = r.mo133511b();
        ArrayList arrayList = new ArrayList();
        GetChatterStatusIconsRequest a2 = new GetChatterStatusIconsRequest.C16208a().build();
        Intrinsics.checkExpressionValueIsNotNull(a2, "recommendRequest");
        RucketJob.m95402b(RucketJob.m95401a(UserCustomStatusService.C45609a.m180936a((UserCustomStatusService) Rucket.m95345a(UserCustomStatusService.class), a2, (Function1) null, 2, (Object) null), (CoroutineContext) null, new C45488a(this, arrayList, b, null), 1, (Object) null), null, new C45490b(this, arrayList, b, null), 1, null);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "Lcom/ss/android/lark/mine/impl/custom_status/model/ModifyStatusState;", "it", "Lcom/bytedance/lark/pb/contact/v1/GetChatterStatusIconsResponse;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.mine.impl.custom_status.model.AbsModifyAwareViewModel$getAvatarList$1", mo239173f = "AbsModifyAwareViewModel.kt", mo239174i = {}, mo239175l = {}, mo239176m = "invokeSuspend", mo239177n = {}, mo239178s = {})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.model.a$a */
    public static final class C45488a extends SuspendLambda implements Function2<GetChatterStatusIconsResponse, Continuation<? super Unit>, Object> {
        final /* synthetic */ List $avatarList;
        final /* synthetic */ List $wholeAvatarList;
        int label;
        private GetChatterStatusIconsResponse p$0;
        final /* synthetic */ AbsModifyAwareViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45488a(AbsModifyAwareViewModel aVar, List list, List list2, Continuation cVar) {
            super(2, cVar);
            this.this$0 = aVar;
            this.$avatarList = list;
            this.$wholeAvatarList = list2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C45488a aVar = new C45488a(this.this$0, this.$avatarList, this.$wholeAvatarList, cVar);
            aVar.p$0 = (GetChatterStatusIconsResponse) obj;
            return aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(GetChatterStatusIconsResponse getChatterStatusIconsResponse, Continuation<? super Unit> cVar) {
            return ((C45488a) create(getChatterStatusIconsResponse, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C69086a.m265828a();
            if (this.label == 0) {
                C69097g.m265891a(obj);
                final GetChatterStatusIconsResponse getChatterStatusIconsResponse = this.p$0;
                this.this$0.setState(new Function1<T, T>(this) {
                    /* class com.ss.android.lark.mine.impl.custom_status.model.AbsModifyAwareViewModel.C45488a.C454891 */
                    final /* synthetic */ C45488a this$0;

                    {
                        this.this$0 = r1;
                    }

                    public final T invoke(T t) {
                        boolean z;
                        Intrinsics.checkParameterIsNotNull(t, "$receiver");
                        List<ChatterStatusIcon> list = getChatterStatusIconsResponse.icons;
                        if (list == null || list.isEmpty()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            List list2 = this.this$0.$avatarList;
                            String string = UIHelper.getString(R.string.Lark_Profile_AllEmojis);
                            Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(string.Lark_Profile_AllEmojis)");
                            list2.add(new AvatarViewData(string, AvatarType.AVATAR_TITLE));
                            List<String> list3 = this.this$0.$wholeAvatarList;
                            Intrinsics.checkExpressionValueIsNotNull(list3, "wholeAvatarList");
                            for (String str : list3) {
                                List list4 = this.this$0.$avatarList;
                                Intrinsics.checkExpressionValueIsNotNull(str, "key");
                                list4.add(new AvatarViewData(str, AvatarType.AVATAR_EMOJI));
                            }
                            return (T) ((ModifyStatusState) t.mo160469b(TuplesKt.to(this.this$0.$avatarList, -1)));
                        }
                        List list5 = this.this$0.$avatarList;
                        String string2 = UIHelper.getString(R.string.Lark_Profile_RecommendUse);
                        Intrinsics.checkExpressionValueIsNotNull(string2, "UIHelper.getString(strin…ark_Profile_RecommendUse)");
                        list5.add(new AvatarViewData(string2, AvatarType.AVATAR_TITLE));
                        List<ChatterStatusIcon> list6 = getChatterStatusIconsResponse.icons;
                        Intrinsics.checkExpressionValueIsNotNull(list6, "it.icons");
                        Iterator<T> it = list6.iterator();
                        while (it.hasNext()) {
                            List list7 = this.this$0.$avatarList;
                            String str2 = it.next().icon_key;
                            Intrinsics.checkExpressionValueIsNotNull(str2, "icon.icon_key");
                            list7.add(new AvatarViewData(str2, AvatarType.AVATAR_EMOJI));
                        }
                        List list8 = this.this$0.$avatarList;
                        String string3 = UIHelper.getString(R.string.Lark_Profile_AllEmojis);
                        Intrinsics.checkExpressionValueIsNotNull(string3, "UIHelper.getString(string.Lark_Profile_AllEmojis)");
                        list8.add(new AvatarViewData(string3, AvatarType.AVATAR_TITLE));
                        List<String> list9 = this.this$0.$wholeAvatarList;
                        Intrinsics.checkExpressionValueIsNotNull(list9, "wholeAvatarList");
                        for (String str3 : list9) {
                            List list10 = this.this$0.$avatarList;
                            Intrinsics.checkExpressionValueIsNotNull(str3, "key");
                            list10.add(new AvatarViewData(str3, AvatarType.AVATAR_EMOJI));
                        }
                        return (T) ((ModifyStatusState) t.mo160469b(TuplesKt.to(this.this$0.$avatarList, Integer.valueOf(getChatterStatusIconsResponse.icons.size()))));
                    }
                });
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "Lcom/ss/android/lark/mine/impl/custom_status/model/ModifyStatusState;", "error", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.mine.impl.custom_status.model.AbsModifyAwareViewModel$getAvatarList$2", mo239173f = "AbsModifyAwareViewModel.kt", mo239174i = {}, mo239175l = {}, mo239176m = "invokeSuspend", mo239177n = {}, mo239178s = {})
    /* renamed from: com.ss.android.lark.mine.impl.custom_status.model.a$b */
    public static final class C45490b extends SuspendLambda implements Function2<ErrorResult, Continuation<? super Unit>, Object> {
        final /* synthetic */ List $avatarList;
        final /* synthetic */ List $wholeAvatarList;
        int label;
        private ErrorResult p$0;
        final /* synthetic */ AbsModifyAwareViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45490b(AbsModifyAwareViewModel aVar, List list, List list2, Continuation cVar) {
            super(2, cVar);
            this.this$0 = aVar;
            this.$avatarList = list;
            this.$wholeAvatarList = list2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C45490b bVar = new C45490b(this.this$0, this.$avatarList, this.$wholeAvatarList, cVar);
            bVar.p$0 = (ErrorResult) obj;
            return bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ErrorResult errorResult, Continuation<? super Unit> cVar) {
            return ((C45490b) create(errorResult, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C69086a.m265828a();
            if (this.label == 0) {
                C69097g.m265891a(obj);
                final ErrorResult errorResult = this.p$0;
                this.this$0.setState(new Function1<T, T>(this) {
                    /* class com.ss.android.lark.mine.impl.custom_status.model.AbsModifyAwareViewModel.C45490b.C454911 */
                    final /* synthetic */ C45490b this$0;

                    {
                        this.this$0 = r1;
                    }

                    public final T invoke(T t) {
                        Intrinsics.checkParameterIsNotNull(t, "$receiver");
                        List list = this.this$0.$avatarList;
                        String string = UIHelper.getString(R.string.Lark_Profile_AllEmojis);
                        Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(string.Lark_Profile_AllEmojis)");
                        list.add(new AvatarViewData(string, AvatarType.AVATAR_TITLE));
                        List<String> list2 = this.this$0.$wholeAvatarList;
                        Intrinsics.checkExpressionValueIsNotNull(list2, "wholeAvatarList");
                        for (String str : list2) {
                            List list3 = this.this$0.$avatarList;
                            Intrinsics.checkExpressionValueIsNotNull(str, "key");
                            list3.add(new AvatarViewData(str, AvatarType.AVATAR_EMOJI));
                        }
                        return (T) ((ModifyStatusState) ((ModifyStatusState) t.mo160468b(new ErrorEvent.GetRecommendAvatar(errorResult))).mo160469b(TuplesKt.to(this.this$0.$avatarList, -1)));
                    }
                });
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final UpdateUserCustomStatusMeta getModifyMeta(UserCustomStatus userCustomStatus, String str, String str2, Boolean bool, Map<CustomStatusSyncField, Boolean> map) {
        Intrinsics.checkParameterIsNotNull(userCustomStatus, "current");
        UpdateUserCustomStatusMeta.C16414a a = new UpdateUserCustomStatusMeta.C16414a().mo58588a(userCustomStatus.id);
        ArrayList arrayList = new ArrayList();
        if (str != null && (!Intrinsics.areEqual(str, userCustomStatus.title))) {
            arrayList.add(UpdateUserCustomStatusMeta.UserCustomStatusField.TITLE);
            a.mo58589a(str);
        }
        if (str2 != null && (!Intrinsics.areEqual(str2, userCustomStatus.icon_key))) {
            arrayList.add(UpdateUserCustomStatusMeta.UserCustomStatusField.ICON_KEY);
            a.mo58594b(str2);
        }
        if (bool != null && (!Intrinsics.areEqual(bool, userCustomStatus.is_not_disturb_mode))) {
            arrayList.add(UpdateUserCustomStatusMeta.UserCustomStatusField.IS_NOT_DISTURB_MODE);
            a.mo58587a(bool);
        }
        if (map != null) {
            for (Map.Entry<CustomStatusSyncField, Boolean> entry : map.entrySet()) {
                if (!Intrinsics.areEqual(userCustomStatus.sync_settings.get(Long.valueOf((long) entry.getKey().getValue())), Boolean.valueOf(entry.getValue().booleanValue()))) {
                    arrayList.add(UpdateUserCustomStatusMeta.UserCustomStatusField.SYN_SETTINGS);
                    LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
                    for (T t : map.entrySet()) {
                        linkedHashMap.put(Long.valueOf((long) ((CustomStatusSyncField) t.getKey()).getValue()), t.getValue());
                    }
                    a.mo58591a(linkedHashMap);
                }
            }
        }
        a.mo58590a(arrayList);
        UpdateUserCustomStatusMeta a2 = a.build();
        Intrinsics.checkExpressionValueIsNotNull(a2, "modifyMetaBuilder.build()");
        return a2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.lark.mine.impl.custom_status.model.a */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void trySave$default(AbsModifyAwareViewModel aVar, String str, String str2, Boolean bool, Map map, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            if ((i & 4) != 0) {
                bool = null;
            }
            if ((i & 8) != 0) {
                map = null;
            }
            aVar.trySave(str, str2, bool, map);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trySave");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: com.ss.android.lark.mine.impl.custom_status.model.a */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UpdateUserCustomStatusMeta getModifyMeta$default(AbsModifyAwareViewModel aVar, UserCustomStatus userCustomStatus, String str, String str2, Boolean bool, Map map, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                str = null;
            }
            if ((i & 4) != 0) {
                str2 = null;
            }
            if ((i & 8) != 0) {
                bool = null;
            }
            if ((i & 16) != 0) {
                map = null;
            }
            return aVar.getModifyMeta(userCustomStatus, str, str2, bool, map);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getModifyMeta");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: com.ss.android.lark.mine.impl.custom_status.model.a */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void tryLeave$default(AbsModifyAwareViewModel aVar, String str, String str2, Boolean bool, Map map, Function0 function0, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            if ((i & 4) != 0) {
                bool = null;
            }
            if ((i & 8) != 0) {
                map = null;
            }
            aVar.tryLeave(str, str2, bool, map, function0);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryLeave");
    }
}
