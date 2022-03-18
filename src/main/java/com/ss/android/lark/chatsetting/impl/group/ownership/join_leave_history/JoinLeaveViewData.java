package com.ss.android.lark.chatsetting.impl.group.ownership.join_leave_history;

import com.bytedance.ee.bear.document.tips.BottomDialog;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001:\u0004\u0019\u001a\u001b\u001cB=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/join_leave_history/JoinLeaveViewData;", "", "id", "", "event", "", BottomDialog.f17198f, "avatarKey", "name", "time", "", "extra", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/join_leave_history/JoinLeaveViewData$JoinLeaveWay;", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLcom/ss/android/lark/chatsetting/impl/group/ownership/join_leave_history/JoinLeaveViewData$JoinLeaveWay;)V", "getAvatarKey", "()Ljava/lang/String;", "getChatterId", "getEvent", "()I", "getExtra", "()Lcom/ss/android/lark/chatsetting/impl/group/ownership/join_leave_history/JoinLeaveViewData$JoinLeaveWay;", "getId", "getName", "getTime", "()J", "ContentValue", "EventType", "JoinLeaveWay", "ValueType", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class JoinLeaveViewData {

    /* renamed from: a */
    private final String f89656a;

    /* renamed from: b */
    private final int f89657b;

    /* renamed from: c */
    private final String f89658c;

    /* renamed from: d */
    private final String f89659d;

    /* renamed from: e */
    private final String f89660e;

    /* renamed from: f */
    private final long f89661f;

    /* renamed from: g */
    private final JoinLeaveWay f89662g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/join_leave_history/JoinLeaveViewData$EventType;", "", "Companion", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface EventType {
        public static final Companion Companion = Companion.f89663a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/join_leave_history/JoinLeaveViewData$EventType$Companion;", "", "()V", "DEL_ADMIN", "", "DEL_SELF", "INV_CHATTER", "INV_DOC", "INV_GROUP_CHAT", "INV_MESSAGE_CARD", "INV_P2P_CHAT", "INV_QR_CODE", "INV_SEARCH", "INV_SELF", "UNKNOWN_TYPE", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.join_leave_history.JoinLeaveViewData$EventType$a */
        public static final class Companion {

            /* renamed from: a */
            static final /* synthetic */ Companion f89663a = new Companion();

            private Companion() {
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/join_leave_history/JoinLeaveViewData$ValueType;", "", "Companion", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface ValueType {
        public static final Companion Companion = Companion.f89664a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/join_leave_history/JoinLeaveViewData$ValueType$Companion;", "", "()V", "BOT", "", "CHAT", "DOC", "UNKNOWN_VALUE_TYPE", "USER", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.join_leave_history.JoinLeaveViewData$ValueType$a */
        public static final class Companion {

            /* renamed from: a */
            static final /* synthetic */ Companion f89664a = new Companion();

            private Companion() {
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/join_leave_history/JoinLeaveViewData$ContentValue;", "", "displayText", "", "id", "docUrl", ShareHitPoint.f121869d, "", "unauthorizedDoc", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZ)V", "getDisplayText", "()Ljava/lang/String;", "setDisplayText", "(Ljava/lang/String;)V", "getDocUrl", "getId", "getType", "()I", "getUnauthorizedDoc", "()Z", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.join_leave_history.JoinLeaveViewData$a */
    public static final class ContentValue {

        /* renamed from: a */
        private String f89665a;

        /* renamed from: b */
        private final String f89666b;

        /* renamed from: c */
        private final String f89667c;

        /* renamed from: d */
        private final int f89668d;

        /* renamed from: e */
        private final boolean f89669e;

        /* renamed from: a */
        public final String mo128208a() {
            return this.f89665a;
        }

        /* renamed from: b */
        public final String mo128209b() {
            return this.f89666b;
        }

        /* renamed from: c */
        public final String mo128210c() {
            return this.f89667c;
        }

        /* renamed from: d */
        public final int mo128211d() {
            return this.f89668d;
        }

        /* renamed from: e */
        public final boolean mo128212e() {
            return this.f89669e;
        }

        public ContentValue(String str, String str2, String str3, @ValueType int i, boolean z) {
            this.f89665a = str;
            this.f89666b = str2;
            this.f89667c = str3;
            this.f89668d = i;
            this.f89669e = z;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/join_leave_history/JoinLeaveViewData$JoinLeaveWay;", "", "template", "", "contentValueMap", "", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/join_leave_history/JoinLeaveViewData$ContentValue;", "(Ljava/lang/String;Ljava/util/Map;)V", "getContentValueMap", "()Ljava/util/Map;", "getTemplate", "()Ljava/lang/String;", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.join_leave_history.JoinLeaveViewData$b */
    public static final class JoinLeaveWay {

        /* renamed from: a */
        private final String f89670a;

        /* renamed from: b */
        private final Map<String, ContentValue> f89671b;

        /* renamed from: a */
        public final String mo128213a() {
            return this.f89670a;
        }

        /* renamed from: b */
        public final Map<String, ContentValue> mo128214b() {
            return this.f89671b;
        }

        public JoinLeaveWay(String str, Map<String, ContentValue> map) {
            Intrinsics.checkParameterIsNotNull(str, "template");
            Intrinsics.checkParameterIsNotNull(map, "contentValueMap");
            this.f89670a = str;
            this.f89671b = map;
        }
    }

    /* renamed from: a */
    public final String mo128203a() {
        return this.f89658c;
    }

    /* renamed from: b */
    public final String mo128204b() {
        return this.f89659d;
    }

    /* renamed from: c */
    public final String mo128205c() {
        return this.f89660e;
    }

    /* renamed from: d */
    public final long mo128206d() {
        return this.f89661f;
    }

    /* renamed from: e */
    public final JoinLeaveWay mo128207e() {
        return this.f89662g;
    }

    public JoinLeaveViewData(String str, int i, String str2, String str3, String str4, long j, JoinLeaveWay bVar) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        Intrinsics.checkParameterIsNotNull(str2, BottomDialog.f17198f);
        Intrinsics.checkParameterIsNotNull(str3, "avatarKey");
        Intrinsics.checkParameterIsNotNull(str4, "name");
        Intrinsics.checkParameterIsNotNull(bVar, "extra");
        this.f89656a = str;
        this.f89657b = i;
        this.f89658c = str2;
        this.f89659d = str3;
        this.f89660e = str4;
        this.f89661f = j;
        this.f89662g = bVar;
    }
}
