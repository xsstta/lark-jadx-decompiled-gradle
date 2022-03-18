package com.ss.android.lark.calendar.impl.features.meetingroom.signin.data;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/signin/data/MtRoomSignInBaseData;", "", "token", "", "url", "(Ljava/lang/String;Ljava/lang/String;)V", "getToken", "()Ljava/lang/String;", "setToken", "(Ljava/lang/String;)V", "getUrl", "setUrl", "saveToBundle", "", "extras", "Landroid/os/Bundle;", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.signin.data.a */
public final class MtRoomSignInBaseData {

    /* renamed from: a */
    public static final Companion f82219a = new Companion(null);

    /* renamed from: b */
    private String f82220b;

    /* renamed from: c */
    private String f82221c;

    public MtRoomSignInBaseData() {
        this(null, null, 3, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/signin/data/MtRoomSignInBaseData$Companion;", "", "()V", "initFromBundle", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/signin/data/MtRoomSignInBaseData;", "extras", "Landroid/os/Bundle;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.signin.data.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final MtRoomSignInBaseData mo117446a(Bundle bundle) {
            Intrinsics.checkParameterIsNotNull(bundle, "extras");
            MtRoomSignInBaseData aVar = new MtRoomSignInBaseData(null, null, 3, null);
            String string = bundle.getString("mtroom_token", "");
            Intrinsics.checkExpressionValueIsNotNull(string, "extras.getString(MtRoomS…onstant.MTROOM_TOKEN, \"\")");
            aVar.mo117443a(string);
            String string2 = bundle.getString("mtroom_url", "");
            Intrinsics.checkExpressionValueIsNotNull(string2, "extras.getString(MtRoomS…nConstant.MTROOM_URL, \"\")");
            aVar.mo117445b(string2);
            return aVar;
        }
    }

    /* renamed from: a */
    public final String mo117441a() {
        return this.f82220b;
    }

    /* renamed from: b */
    public final String mo117444b() {
        return this.f82221c;
    }

    /* renamed from: a */
    public final void mo117443a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f82220b = str;
    }

    /* renamed from: b */
    public final void mo117445b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f82221c = str;
    }

    /* renamed from: a */
    public final void mo117442a(Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(bundle, "extras");
        bundle.putString("mtroom_token", this.f82220b);
        bundle.putString("mtroom_url", this.f82221c);
    }

    public MtRoomSignInBaseData(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "token");
        Intrinsics.checkParameterIsNotNull(str2, "url");
        this.f82220b = str;
        this.f82221c = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MtRoomSignInBaseData(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
