package com.ss.android.lark.member_manage.impl.statistics;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.updatesdk.service.otaupdate.UpdateDialogStatusCode;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.ss.android.lark.appreciablelib.AppreciableKit;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.ErrorLevel;
import com.ss.android.lark.appreciablelib.ErrorParams;
import com.ss.android.lark.appreciablelib.ErrorType;
import com.ss.android.lark.appreciablelib.Event;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.C57782ag;
import com.ss.android.lark.utils.statistics.BasePerfMonitor;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.C69121n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0011\u0012B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00072\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0007H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/statistics/PerfGroupMemberMonitor;", "Lcom/ss/android/lark/utils/statistics/BasePerfMonitor;", "()V", "TAG", "", "sGroupMemberDataMap", "", "Lcom/ss/android/lark/member_manage/impl/statistics/PerfGroupMemberMonitor$ActionType;", "Lcom/ss/android/lark/member_manage/impl/statistics/PerfGroupMemberMonitor$GroupMemberData;", "end", "", "actionType", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "start", "ActionType", "GroupMemberData", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class PerfGroupMemberMonitor extends BasePerfMonitor {

    /* renamed from: a */
    public static final PerfGroupMemberMonitor f114589a = new PerfGroupMemberMonitor();

    /* renamed from: c */
    private static final Map<ActionType, GroupMemberData> f114590c = new ConcurrentHashMap();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/statistics/PerfGroupMemberMonitor$ActionType;", "", "(Ljava/lang/String;I)V", GrsBaseInfo.CountryCodeSource.UNKNOWN, "ADD", "DELETE", "SEARCH", "SHOW", "Companion", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum ActionType {
        UNKNOWN,
        ADD,
        DELETE,
        SEARCH,
        SHOW;
        
        public static final Companion Companion = new Companion(null);

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/statistics/PerfGroupMemberMonitor$ActionType$Companion;", "", "()V", "fromValue", "Lcom/ss/android/lark/member_manage/impl/statistics/PerfGroupMemberMonitor$ActionType;", "value", "", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.member_manage.impl.statistics.PerfGroupMemberMonitor$ActionType$a */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"J\u0012\u0010#\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\fH\u0002J\u0010\u0010'\u001a\u00020(2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0010\u0010)\u001a\u00020\b2\u0006\u0010*\u001a\u00020\fH\u0016J\b\u0010+\u001a\u00020\u0019H\u0016J\b\u0010,\u001a\u00020 H\u0016J(\u0010-\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\t\u001a\u0004\u0018\u00010\nR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f0\u000e8BX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f0\u000e8BX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0016X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0019X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0019X\u000e¢\u0006\u0002\n\u0000R \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f0\u000e8BX\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0011R\u000e\u0010\u001e\u001a\u00020\u0016X\u000e¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/ss/android/lark/member_manage/impl/statistics/PerfGroupMemberMonitor$GroupMemberData;", "Lcom/ss/android/lark/utils/statistics/BasePerfMonitor$TimePerfData;", "actionType", "Lcom/ss/android/lark/member_manage/impl/statistics/PerfGroupMemberMonitor$ActionType;", "(Lcom/ss/android/lark/member_manage/impl/statistics/PerfGroupMemberMonitor$ActionType;)V", "getActionType$im_group_member_manage_group_member_manage_release", "()Lcom/ss/android/lark/member_manage/impl/statistics/PerfGroupMemberMonitor$ActionType;", "appreciableKey", "", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "chatterCount", "", "extraCategory", "", "", "getExtraCategory", "()Ljava/util/Map;", "extraMetric", "getExtraMetric", "feedId", "firstRender", "", "initViewCost", "isBackground", "", "isCrypto", "isExternal", "latencyDetail", "getLatencyDetail", "sdkCost", "end", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "getChatType", "getErrorType", "Lcom/ss/android/lark/appreciablelib/ErrorType;", "errorCode", "getEvent", "Lcom/ss/android/lark/appreciablelib/Event;", "getEventName", "platformType", "isValid", "start", "update", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.statistics.PerfGroupMemberMonitor$a */
    public static final class GroupMemberData extends BasePerfMonitor.AbstractC57880b {

        /* renamed from: a */
        private String f114591a;

        /* renamed from: b */
        private long f114592b;

        /* renamed from: c */
        private long f114593c;

        /* renamed from: d */
        private long f114594d;

        /* renamed from: e */
        private int f114595e;

        /* renamed from: f */
        private String f114596f;

        /* renamed from: g */
        private Chat f114597g;

        /* renamed from: h */
        private boolean f114598h;

        /* renamed from: i */
        private boolean f114599i;

        /* renamed from: j */
        private boolean f114600j;

        /* renamed from: k */
        private final ActionType f114601k;

        public final ActionType aY_() {
            return this.f114601k;
        }

        @Override // com.ss.android.lark.utils.statistics.BasePerfMonitor.AbstractC57879a, com.ss.android.lark.utils.statistics.BasePerfMonitor.AbstractC57880b
        public boolean aG_() {
            return super.aG_();
        }

        /* renamed from: d */
        private final Map<String, Object> m179724d() {
            HashMap hashMap = new HashMap();
            hashMap.put("sdk_cost", Long.valueOf(this.f114592b));
            if (this.f114601k == ActionType.SHOW) {
                hashMap.put("init_view_cost", Long.valueOf(this.f114593c));
                hashMap.put("first_render", Long.valueOf(this.f114594d));
            }
            return hashMap;
        }

        /* renamed from: f */
        private final Map<String, Object> m179726f() {
            HashMap hashMap = new HashMap();
            hashMap.put("chatter_count", Integer.valueOf(this.f114595e));
            String b = C57782ag.m224244b(this.f114596f);
            Intrinsics.checkExpressionValueIsNotNull(b, "TextUtil.nullToEmpty(feedId)");
            hashMap.put("feed_id", b);
            return hashMap;
        }

        @Override // com.ss.android.lark.utils.statistics.BasePerfMonitor.AbstractC57880b
        public void aF_() {
            super.aF_();
            this.f114591a = AppreciableKit.f73094h.mo103524a().mo103510a(Biz.Messenger, Scene.Chat, m179722a(this.f114601k), "chatSetting", true, (Map<String, ? extends Object>) null, (Map<String, ? extends Object>) null, (Map<String, ? extends Object>) null, (Map<String, ? extends Object>) null);
        }

        /* renamed from: e */
        private final Map<String, Object> m179725e() {
            HashMap hashMap = new HashMap();
            if (this.f114601k != ActionType.SHOW) {
                hashMap.put("action_type", Integer.valueOf(this.f114601k.ordinal()));
            }
            hashMap.put("chat_type", Integer.valueOf(m179721a(this.f114597g)));
            hashMap.put("is_background", Integer.valueOf(this.f114598h ? 1 : 0));
            hashMap.put("is_crypto", Integer.valueOf(this.f114599i ? 1 : 0));
            hashMap.put("is_external", Integer.valueOf(this.f114600j ? 1 : 0));
            return hashMap;
        }

        public GroupMemberData(ActionType actionType) {
            Intrinsics.checkParameterIsNotNull(actionType, "actionType");
            this.f114601k = actionType;
        }

        /* renamed from: a */
        private final Event m179722a(ActionType actionType) {
            if (actionType == ActionType.SHOW) {
                return Event.show_chat_memebers;
            }
            return Event.chat_memebers_action;
        }

        @Override // com.ss.android.lark.utils.statistics.BasePerfMonitor.AbstractC57879a
        /* renamed from: a */
        public String mo142416a(int i) {
            return m179722a(this.f114601k).name();
        }

        /* renamed from: a */
        private final int m179721a(Chat chat) {
            Chat.Type type;
            if (chat == null || (type = chat.getType()) == null) {
                return 0;
            }
            int i = C45269d.f114609a[type.ordinal()];
            if (i == 1) {
                return 1;
            }
            if (i == 2) {
                return 2;
            }
            if (i != 3) {
                return 0;
            }
            return 3;
        }

        /* renamed from: c */
        private final ErrorType m179723c(int i) {
            int[] iArr = {UpdateDialogStatusCode.DISMISS, UpdateDialogStatusCode.SHOW, 10005, 10008, 10009, 10018};
            for (int i2 = 0; i2 < 6; i2++) {
                if (iArr[i2] == i) {
                    return ErrorType.Network;
                }
            }
            return ErrorType.SDK;
        }

        /* renamed from: a */
        public final void mo159932a(ErrorResult errorResult) {
            super.mo187680c();
            if (errorResult == null) {
                AppreciableKit a = AppreciableKit.f73094h.mo103524a();
                String b = C57782ag.m224244b(this.f114591a);
                Intrinsics.checkExpressionValueIsNotNull(b, "TextUtil.nullToEmpty(appreciableKey)");
                a.mo103523c(b, m179724d(), null, m179726f(), m179725e());
                return;
            }
            AppreciableKit.f73094h.mo103524a().mo103514a(new ErrorParams(Biz.Messenger, Scene.Chat, m179722a(this.f114601k), m179723c(errorResult.getErrorCode()), ErrorLevel.Fatal, errorResult.getErrorCode(), null, "chatSetting", errorResult.getDisplayMsg(), true, null, m179726f(), m179725e()));
        }

        /* renamed from: a */
        public final void mo159931a(long j, long j2, long j3, Chat chat) {
            this.f114592b = j;
            this.f114593c = j2;
            this.f114594d = j3;
            Log.m165379d("PerfCreateGroupMonitor", "update chat: " + chat);
            if (chat != null) {
                this.f114597g = chat;
                this.f114595e = chat.getUserCount();
                this.f114596f = chat.getId();
                this.f114598h = false;
                this.f114599i = chat.isSecret();
                this.f114600j = chat.isCrossTenant();
            }
        }
    }

    private PerfGroupMemberMonitor() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m179719a(ActionType actionType) {
        Intrinsics.checkParameterIsNotNull(actionType, "actionType");
        Map<ActionType, GroupMemberData> map = f114590c;
        GroupMemberData aVar = map.get(actionType);
        if (aVar == null) {
            aVar = new GroupMemberData(actionType);
        }
        map.put(actionType, aVar);
        aVar.aF_();
        Log.m165379d("PerfCreateGroupMonitor", "start CreateGroupData: " + actionType);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m179720a(ActionType actionType, Chat chat, ErrorResult errorResult) {
        Map<ActionType, GroupMemberData> map = f114590c;
        GroupMemberData aVar = map.get(actionType);
        if (aVar != null) {
            Log.m165379d("PerfCreateGroupMonitor", "end CreateGroupData: " + aVar.aY_() + "/" + errorResult);
            if (aVar.aG_()) {
                aVar.mo159931a(0, 0, 0, chat);
                aVar.mo159932a(errorResult);
                if (map != null) {
                    C69121n.m265993j(map).remove(actionType);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
            }
        }
    }
}
