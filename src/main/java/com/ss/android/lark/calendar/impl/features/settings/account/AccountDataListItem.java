package com.ss.android.lark.calendar.impl.features.settings.account;

import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 #2\u00020\u0001:\u0001#B\u0005¢\u0006\u0002\u0010\u0002R*\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\u001a\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u001bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0017\"\u0004\b\"\u0010\u0019¨\u0006$"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountDataListItem;", "", "()V", "calendars", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar;", "Lkotlin/collections/ArrayList;", "getCalendars", "()Ljava/util/ArrayList;", "setCalendars", "(Ljava/util/ArrayList;)V", "isExchange", "", "()Z", "setExchange", "(Z)V", "isGoogle", "setGoogle", "isLocal", "setLocal", "position", "", "getPosition", "()I", "setPosition", "(I)V", "title", "", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", ShareHitPoint.f121869d, "getType", "setType", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.settings.account.a */
public final class AccountDataListItem {

    /* renamed from: b */
    public static final Companion f83018b = new Companion(null);

    /* renamed from: a */
    public ArrayList<Calendar> f83019a;

    /* renamed from: c */
    private String f83020c = "";

    /* renamed from: d */
    private int f83021d;

    /* renamed from: e */
    private boolean f83022e;

    /* renamed from: f */
    private boolean f83023f;

    /* renamed from: g */
    private boolean f83024g;

    /* renamed from: h */
    private int f83025h = 1;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountDataListItem$Companion;", "", "()V", "ACCOUNT", "", "IMPORT_EXCHANGE", "IMPORT_GOOGLE", "IMPORT_LOCAL", "POS_BOTTOM", "POS_MID", "POS_ONE", "POS_TOP", "TITLE", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.settings.account.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: b */
    public final String mo118403b() {
        return this.f83020c;
    }

    /* renamed from: c */
    public final int mo118406c() {
        return this.f83021d;
    }

    /* renamed from: d */
    public final boolean mo118408d() {
        return this.f83022e;
    }

    /* renamed from: e */
    public final boolean mo118409e() {
        return this.f83023f;
    }

    /* renamed from: f */
    public final boolean mo118410f() {
        return this.f83024g;
    }

    /* renamed from: g */
    public final int mo118411g() {
        return this.f83025h;
    }

    /* renamed from: a */
    public final ArrayList<Calendar> mo118398a() {
        ArrayList<Calendar> arrayList = this.f83019a;
        if (arrayList == null) {
            Intrinsics.throwUninitializedPropertyAccessException("calendars");
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo118399a(int i) {
        this.f83021d = i;
    }

    /* renamed from: a */
    public final void mo118400a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f83020c = str;
    }

    /* renamed from: b */
    public final void mo118404b(int i) {
        this.f83025h = i;
    }

    /* renamed from: c */
    public final void mo118407c(boolean z) {
        this.f83024g = z;
    }

    /* renamed from: b */
    public final void mo118405b(boolean z) {
        this.f83023f = z;
    }

    /* renamed from: a */
    public final void mo118401a(ArrayList<Calendar> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "<set-?>");
        this.f83019a = arrayList;
    }

    /* renamed from: a */
    public final void mo118402a(boolean z) {
        this.f83022e = z;
    }
}
