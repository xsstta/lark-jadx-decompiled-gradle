package com.ss.android.lark.contact.impl.entity;

import com.bytedance.lark.pb.contact.v2.GetContactEntriesResponse;
import com.ss.android.lark.log.Log;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\tR\u001a\u0010\f\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR\u001a\u0010\u000e\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001a\u0010\u0010\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0007\"\u0004\b\u0011\u0010\tR\u001a\u0010\u0012\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0007\"\u0004\b\u0013\u0010\tR\u001a\u0010\u0014\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\u001a\u0010\u0016\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0007\"\u0004\b\u0017\u0010\tR\u0011\u0010\u0018\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0007¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/contact/impl/entity/ContactEntriesResult;", "", "response", "Lcom/bytedance/lark/pb/contact/v2/GetContactEntriesResponse;", "(Lcom/bytedance/lark/pb/contact/v2/GetContactEntriesResponse;)V", "isDepartmentVisible", "", "()Z", "setDepartmentVisible", "(Z)V", "isExternalContactsVisible", "setExternalContactsVisible", "isMineGroupVisible", "setMineGroupVisible", "isNewContactsVisible", "setNewContactsVisible", "isOnCallVisible", "setOnCallVisible", "isShowSchoolContact", "setShowSchoolContact", "isShowSpecialFocus", "setShowSpecialFocus", "isShowTrustParty", "setShowTrustParty", "isSuccess", "Companion", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.impl.entity.a */
public final class ContactEntriesResult {

    /* renamed from: a */
    public static final Companion f92804a = new Companion(null);

    /* renamed from: b */
    private final boolean f92805b;

    /* renamed from: c */
    private boolean f92806c;

    /* renamed from: d */
    private boolean f92807d;

    /* renamed from: e */
    private boolean f92808e;

    /* renamed from: f */
    private boolean f92809f;

    /* renamed from: g */
    private boolean f92810g;

    /* renamed from: h */
    private boolean f92811h;

    /* renamed from: i */
    private boolean f92812i;

    /* renamed from: j */
    private boolean f92813j;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/contact/impl/entity/ContactEntriesResult$Companion;", "", "()V", "getEmptyResult", "Lcom/ss/android/lark/contact/impl/entity/ContactEntriesResult;", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.entity.a$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final ContactEntriesResult mo132098a() {
            return new ContactEntriesResult(null);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final boolean mo132089a() {
        return this.f92805b;
    }

    /* renamed from: b */
    public final boolean mo132090b() {
        return this.f92806c;
    }

    /* renamed from: c */
    public final boolean mo132091c() {
        return this.f92807d;
    }

    /* renamed from: d */
    public final boolean mo132092d() {
        return this.f92808e;
    }

    /* renamed from: e */
    public final boolean mo132093e() {
        return this.f92809f;
    }

    /* renamed from: f */
    public final boolean mo132094f() {
        return this.f92810g;
    }

    /* renamed from: g */
    public final boolean mo132095g() {
        return this.f92811h;
    }

    /* renamed from: h */
    public final boolean mo132096h() {
        return this.f92812i;
    }

    /* renamed from: i */
    public final boolean mo132097i() {
        return this.f92813j;
    }

    public ContactEntriesResult(GetContactEntriesResponse getContactEntriesResponse) {
        if (getContactEntriesResponse == null) {
            this.f92805b = false;
            return;
        }
        this.f92805b = true;
        List<GetContactEntriesResponse.ContactEntry> list = getContactEntriesResponse.entries;
        if (list != null) {
            for (T t : list) {
                GetContactEntriesResponse.Type type = t.type;
                if (type != null) {
                    switch (C35880b.f92814a[type.ordinal()]) {
                        case 1:
                            Boolean bool = t.is_visible;
                            Intrinsics.checkExpressionValueIsNotNull(bool, "it.is_visible");
                            this.f92810g = bool.booleanValue();
                            continue;
                        case 2:
                            Boolean bool2 = t.is_visible;
                            Intrinsics.checkExpressionValueIsNotNull(bool2, "it.is_visible");
                            this.f92809f = bool2.booleanValue();
                            continue;
                        case 3:
                            Boolean bool3 = t.is_visible;
                            Intrinsics.checkExpressionValueIsNotNull(bool3, "it.is_visible");
                            this.f92806c = bool3.booleanValue();
                            continue;
                        case 4:
                            Boolean bool4 = t.is_visible;
                            Intrinsics.checkExpressionValueIsNotNull(bool4, "it.is_visible");
                            this.f92807d = bool4.booleanValue();
                            continue;
                        case 5:
                            Boolean bool5 = t.is_visible;
                            Intrinsics.checkExpressionValueIsNotNull(bool5, "it.is_visible");
                            this.f92808e = bool5.booleanValue();
                            continue;
                        case 6:
                            Boolean bool6 = t.is_visible;
                            Intrinsics.checkExpressionValueIsNotNull(bool6, "it.is_visible");
                            this.f92811h = bool6.booleanValue();
                            continue;
                        case 7:
                            Boolean bool7 = t.is_visible;
                            Intrinsics.checkExpressionValueIsNotNull(bool7, "it.is_visible");
                            this.f92812i = bool7.booleanValue();
                            continue;
                        case 8:
                            Boolean bool8 = t.is_visible;
                            Intrinsics.checkExpressionValueIsNotNull(bool8, "it.is_visible");
                            this.f92813j = bool8.booleanValue();
                            continue;
                    }
                }
                Log.m165397w("ContactModule_ContactsSelectorFragment2", "get UNKNOWN item, value = " + t.is_visible);
            }
        }
    }
}
