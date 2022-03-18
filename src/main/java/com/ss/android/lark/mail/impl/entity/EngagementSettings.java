package com.ss.android.lark.mail.impl.entity;

import com.ss.android.lark.mail.impl.AbstractC41849c;
import com.ss.android.lark.mail.impl.C41816b;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u001d\u001eB=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0002\u0010\rJ\u0013\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u001a\u001a\u00020\u0005H\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001f"}, d2 = {"Lcom/ss/android/lark/mail/impl/entity/EngagementSettings;", "", "isMigrationDoneRendered", "", "onboardingState", "", "onboardingDisplay", "", "importantTimeStamp", "otherTimeStamp", "smartInboxState", "Lcom/ss/android/lark/mail/impl/entity/EngagementSettings$SmartInboxState;", "recallEnable", "(ZIJJJLcom/ss/android/lark/mail/impl/entity/EngagementSettings$SmartInboxState;Z)V", "getImportantTimeStamp", "()J", "()Z", "getOnboardingDisplay", "getOnboardingState", "()I", "getOtherTimeStamp", "getRecallEnable", "getSmartInboxState", "()Lcom/ss/android/lark/mail/impl/entity/EngagementSettings$SmartInboxState;", "equals", "other", "hashCode", "toString", "", "Builder", "SmartInboxState", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mail.impl.entity.g */
public final class EngagementSettings {

    /* renamed from: a */
    private final boolean f107073a;

    /* renamed from: b */
    private final int f107074b;

    /* renamed from: c */
    private final long f107075c;

    /* renamed from: d */
    private final long f107076d;

    /* renamed from: e */
    private final long f107077e;

    /* renamed from: f */
    private final SmartInboxState f107078f;

    /* renamed from: g */
    private final boolean f107079g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b%\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005BK\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u0011J\u0006\u0010+\u001a\u00020\u0004J\u000e\u0010,\u001a\u00020\u00002\u0006\u0010-\u001a\u00020\u000bJ\u000e\u0010.\u001a\u00020\u00002\u0006\u0010-\u001a\u00020\u0007J\u000e\u0010/\u001a\u00020\u00002\u0006\u0010-\u001a\u00020\u000bJ\u000e\u00100\u001a\u00020\u00002\u0006\u0010-\u001a\u00020\tJ\u000e\u00101\u001a\u00020\u00002\u0006\u0010-\u001a\u00020\u000bJ\u000e\u00102\u001a\u00020\u00002\u0006\u0010-\u001a\u00020\u0007J\u000e\u00103\u001a\u00020\u00002\u0006\u0010-\u001a\u00020\u000fR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\f\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b \u0010\u0017\"\u0004\b!\u0010\u0019R\u001e\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0010\n\u0002\u0010&\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001e\u0010\r\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b'\u0010\u0017\"\u0004\b(\u0010\u0019R\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b)\u0010\u001c\"\u0004\b*\u0010\u001e¨\u00064"}, d2 = {"Lcom/ss/android/lark/mail/impl/entity/EngagementSettings$Builder;", "", "()V", "settings", "Lcom/ss/android/lark/mail/impl/entity/EngagementSettings;", "(Lcom/ss/android/lark/mail/impl/entity/EngagementSettings;)V", "_isMigrationDoneRendered", "", "_onboardingState", "", "_onboardingDisplay", "", "_importantTimeStamp", "_otherTimeStamp", "_SmartInboxState", "Lcom/ss/android/lark/mail/impl/entity/EngagementSettings$SmartInboxState;", "_recallEnable", "(Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lcom/ss/android/lark/mail/impl/entity/EngagementSettings$SmartInboxState;Ljava/lang/Boolean;)V", "get_SmartInboxState", "()Lcom/ss/android/lark/mail/impl/entity/EngagementSettings$SmartInboxState;", "set_SmartInboxState", "(Lcom/ss/android/lark/mail/impl/entity/EngagementSettings$SmartInboxState;)V", "get_importantTimeStamp", "()Ljava/lang/Long;", "set_importantTimeStamp", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "get_isMigrationDoneRendered", "()Ljava/lang/Boolean;", "set_isMigrationDoneRendered", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "get_onboardingDisplay", "set_onboardingDisplay", "get_onboardingState", "()Ljava/lang/Integer;", "set_onboardingState", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "get_otherTimeStamp", "set_otherTimeStamp", "get_recallEnable", "set_recallEnable", "build", "setImportantTimeStamp", "item", "setMigrationDoneRendered", "setOnboardingDisplay", "setOnboardingState", "setOtherTimeStamp", "setRecallEnable", "setSmartInboxState", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.entity.g$a */
    public static final class Builder {

        /* renamed from: a */
        private Boolean f107080a;

        /* renamed from: b */
        private Integer f107081b;

        /* renamed from: c */
        private Long f107082c;

        /* renamed from: d */
        private Long f107083d;

        /* renamed from: e */
        private Long f107084e;

        /* renamed from: f */
        private SmartInboxState f107085f;

        /* renamed from: g */
        private Boolean f107086g;

        /* renamed from: b */
        public final Boolean mo151926b() {
            return this.f107080a;
        }

        /* renamed from: c */
        public final Integer mo151928c() {
            return this.f107081b;
        }

        /* renamed from: d */
        public final Long mo151929d() {
            return this.f107082c;
        }

        /* renamed from: e */
        public final Long mo151930e() {
            return this.f107083d;
        }

        /* renamed from: f */
        public final Long mo151931f() {
            return this.f107084e;
        }

        /* renamed from: g */
        public final SmartInboxState mo151932g() {
            return this.f107085f;
        }

        /* renamed from: h */
        public final Boolean mo151933h() {
            return this.f107086g;
        }

        public Builder() {
            this(null, null, null, null, null, null, null);
        }

        /* renamed from: a */
        public final EngagementSettings mo151923a() {
            boolean z;
            int i;
            long j;
            long j2;
            boolean z2;
            Boolean bool = this.f107080a;
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            Integer num = this.f107081b;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            Long l = this.f107082c;
            long j3 = 0;
            if (l != null) {
                j = l.longValue();
            } else {
                j = 0;
            }
            Long l2 = this.f107083d;
            if (l2 != null) {
                j2 = l2.longValue();
            } else {
                j2 = 0;
            }
            Long l3 = this.f107084e;
            if (l3 != null) {
                j3 = l3.longValue();
            }
            SmartInboxState bVar = this.f107085f;
            if (bVar == null) {
                bVar = new SmartInboxState(true, true);
            }
            Boolean bool2 = this.f107086g;
            if (bool2 != null) {
                z2 = bool2.booleanValue();
            } else {
                z2 = false;
            }
            return new EngagementSettings(z, i, j, j2, j3, bVar, z2);
        }

        /* renamed from: a */
        public final Builder mo151919a(int i) {
            Builder aVar = this;
            aVar.f107081b = Integer.valueOf(i);
            return aVar;
        }

        /* renamed from: b */
        public final Builder mo151924b(long j) {
            Builder aVar = this;
            aVar.f107083d = Long.valueOf(j);
            return aVar;
        }

        /* renamed from: c */
        public final Builder mo151927c(long j) {
            Builder aVar = this;
            aVar.f107084e = Long.valueOf(j);
            return aVar;
        }

        /* renamed from: a */
        public final Builder mo151920a(long j) {
            Builder aVar = this;
            aVar.f107082c = Long.valueOf(j);
            return aVar;
        }

        /* renamed from: b */
        public final Builder mo151925b(boolean z) {
            Builder aVar = this;
            aVar.f107086g = Boolean.valueOf(z);
            return aVar;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public Builder(EngagementSettings gVar) {
            this(Boolean.valueOf(gVar.mo151909a()), Integer.valueOf(gVar.mo151910b()), Long.valueOf(gVar.mo151911c()), Long.valueOf(gVar.mo151912d()), Long.valueOf(gVar.mo151913e()), gVar.mo151915f(), Boolean.valueOf(gVar.mo151916g()));
            Intrinsics.checkParameterIsNotNull(gVar, "settings");
        }

        /* renamed from: a */
        public final Builder mo151921a(SmartInboxState bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "item");
            Builder aVar = this;
            aVar.f107085f = bVar;
            return aVar;
        }

        /* renamed from: a */
        public final Builder mo151922a(boolean z) {
            Builder aVar = this;
            aVar.f107080a = Boolean.valueOf(z);
            return aVar;
        }

        public Builder(Boolean bool, Integer num, Long l, Long l2, Long l3, SmartInboxState bVar, Boolean bool2) {
            this.f107080a = bool;
            this.f107081b = num;
            this.f107082c = l;
            this.f107083d = l2;
            this.f107084e = l3;
            this.f107085f = bVar;
            this.f107086g = bool2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/mail/impl/entity/EngagementSettings$SmartInboxState;", "", "promptRendered", "", "alertRendered", "(ZZ)V", "getAlertRendered", "()Z", "getPromptRendered", "equals", "other", "hashCode", "", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.entity.g$b */
    public static final class SmartInboxState {

        /* renamed from: a */
        private final boolean f107087a;

        /* renamed from: b */
        private final boolean f107088b;

        /* renamed from: a */
        public final boolean mo151934a() {
            return this.f107087a;
        }

        /* renamed from: b */
        public final boolean mo151935b() {
            return this.f107088b;
        }

        public int hashCode() {
            return (Boolean.valueOf(this.f107087a).hashCode() * 31) + Boolean.valueOf(this.f107088b).hashCode();
        }

        public boolean equals(Object obj) {
            Class<?> cls;
            if (this == obj) {
                return true;
            }
            Class<?> cls2 = getClass();
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (!Intrinsics.areEqual(cls2, cls)) {
                return false;
            }
            if (obj != null) {
                SmartInboxState bVar = (SmartInboxState) obj;
                if (Objects.equals(Boolean.valueOf(this.f107087a), Boolean.valueOf(bVar.f107087a)) && Objects.equals(Boolean.valueOf(this.f107088b), Boolean.valueOf(bVar.f107088b))) {
                    return true;
                }
                return false;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.mail.impl.entity.EngagementSettings.SmartInboxState");
        }

        public SmartInboxState(boolean z, boolean z2) {
            this.f107087a = z;
            this.f107088b = z2;
        }
    }

    /* renamed from: a */
    public final boolean mo151909a() {
        return this.f107073a;
    }

    /* renamed from: b */
    public final int mo151910b() {
        return this.f107074b;
    }

    /* renamed from: c */
    public final long mo151911c() {
        return this.f107075c;
    }

    /* renamed from: d */
    public final long mo151912d() {
        return this.f107076d;
    }

    /* renamed from: e */
    public final long mo151913e() {
        return this.f107077e;
    }

    /* renamed from: f */
    public final SmartInboxState mo151915f() {
        return this.f107078f;
    }

    /* renamed from: g */
    public final boolean mo151916g() {
        return this.f107079g;
    }

    public int hashCode() {
        return (((((((((((Boolean.valueOf(this.f107073a).hashCode() * 31) + this.f107074b) * 31) + Long.valueOf(this.f107075c).hashCode()) * 31) + Long.valueOf(this.f107076d).hashCode()) * 31) + Long.valueOf(this.f107077e).hashCode()) * 31) + this.f107078f.hashCode()) * 31) + Boolean.valueOf(this.f107079g).hashCode();
    }

    public String toString() {
        AbstractC41849c a = C41816b.m166115a();
        Intrinsics.checkExpressionValueIsNotNull(a, "Host.get()");
        if (!a.mo150143j()) {
            return super.toString();
        }
        return "EngagementSettings(isMigrationDoneRendered=" + this.f107073a + ", onboardingState=" + this.f107074b + ", onboardingDisplay=" + this.f107075c + ", importantTimeStamp=" + this.f107076d + ", otherTimeStamp=" + this.f107077e + ')';
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.areEqual(cls2, cls)) {
            return false;
        }
        if (obj != null) {
            EngagementSettings gVar = (EngagementSettings) obj;
            if (Objects.equals(Boolean.valueOf(this.f107073a), Boolean.valueOf(gVar.f107073a)) && Objects.equals(Integer.valueOf(this.f107074b), Integer.valueOf(gVar.f107074b)) && Objects.equals(Long.valueOf(this.f107075c), Long.valueOf(gVar.f107075c)) && Objects.equals(Long.valueOf(this.f107076d), Long.valueOf(gVar.f107076d)) && Objects.equals(Long.valueOf(this.f107077e), Long.valueOf(gVar.f107077e)) && Objects.equals(this.f107078f, gVar.f107078f) && Objects.equals(Boolean.valueOf(this.f107079g), Boolean.valueOf(gVar.f107079g))) {
                return true;
            }
            return false;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.mail.impl.entity.EngagementSettings");
    }

    public EngagementSettings(boolean z, int i, long j, long j2, long j3, SmartInboxState bVar, boolean z2) {
        Intrinsics.checkParameterIsNotNull(bVar, "smartInboxState");
        this.f107073a = z;
        this.f107074b = i;
        this.f107075c = j;
        this.f107076d = j2;
        this.f107077e = j3;
        this.f107078f = bVar;
        this.f107079g = z2;
    }
}
