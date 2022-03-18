package com.ss.android.lark.mail.impl.utils.recipient;

import com.huawei.hms.actions.SearchIntents;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.mail.impl.entity.MailAddress;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\rHÆ\u0003JK\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010!\u001a\u00020\u00032\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0007HÖ\u0001J\t\u0010$\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006%"}, d2 = {"Lcom/ss/android/lark/mail/impl/utils/recipient/RecipientResult;", "", "success", "", SearchIntents.EXTRA_QUERY, "", "index", "", "recipients", "", "Lcom/ss/android/lark/mail/impl/entity/MailAddress;", "hasMore", ShareHitPoint.f121869d, "Lcom/ss/android/lark/mail/impl/utils/recipient/RecipientSearchType;", "(ZLjava/lang/String;ILjava/util/List;ZLcom/ss/android/lark/mail/impl/utils/recipient/RecipientSearchType;)V", "getHasMore", "()Z", "getIndex", "()I", "getQuery", "()Ljava/lang/String;", "getRecipients", "()Ljava/util/List;", "getSuccess", "getType", "()Lcom/ss/android/lark/mail/impl/utils/recipient/RecipientSearchType;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mail.impl.utils.recipient.c */
public final class RecipientResult {

    /* renamed from: a */
    private final boolean f111159a;

    /* renamed from: b */
    private final String f111160b;

    /* renamed from: c */
    private final int f111161c;

    /* renamed from: d */
    private final List<MailAddress> f111162d;

    /* renamed from: e */
    private final boolean f111163e;

    /* renamed from: f */
    private final RecipientSearchType f111164f;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecipientResult)) {
            return false;
        }
        RecipientResult cVar = (RecipientResult) obj;
        return this.f111159a == cVar.f111159a && Intrinsics.areEqual(this.f111160b, cVar.f111160b) && this.f111161c == cVar.f111161c && Intrinsics.areEqual(this.f111162d, cVar.f111162d) && this.f111163e == cVar.f111163e && Intrinsics.areEqual(this.f111164f, cVar.f111164f);
    }

    public int hashCode() {
        boolean z = this.f111159a;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        String str = this.f111160b;
        int i6 = 0;
        int hashCode = (((i5 + (str != null ? str.hashCode() : 0)) * 31) + this.f111161c) * 31;
        List<MailAddress> list = this.f111162d;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        boolean z2 = this.f111163e;
        if (!z2) {
            i = z2 ? 1 : 0;
        }
        int i7 = (hashCode2 + i) * 31;
        RecipientSearchType recipientSearchType = this.f111164f;
        if (recipientSearchType != null) {
            i6 = recipientSearchType.hashCode();
        }
        return i7 + i6;
    }

    public String toString() {
        return "RecipientResult(success=" + this.f111159a + ", query=" + this.f111160b + ", index=" + this.f111161c + ", recipients=" + this.f111162d + ", hasMore=" + this.f111163e + ", type=" + this.f111164f + ")";
    }

    /* renamed from: a */
    public final boolean mo156059a() {
        return this.f111159a;
    }

    /* renamed from: b */
    public final String mo156060b() {
        return this.f111160b;
    }

    /* renamed from: c */
    public final int mo156061c() {
        return this.f111161c;
    }

    /* renamed from: d */
    public final List<MailAddress> mo156062d() {
        return this.f111162d;
    }

    /* renamed from: e */
    public final boolean mo156063e() {
        return this.f111163e;
    }

    /* renamed from: f */
    public final RecipientSearchType mo156065f() {
        return this.f111164f;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.util.List<? extends com.ss.android.lark.mail.impl.entity.MailAddress> */
    /* JADX WARN: Multi-variable type inference failed */
    public RecipientResult(boolean z, String str, int i, List<? extends MailAddress> list, boolean z2, RecipientSearchType recipientSearchType) {
        Intrinsics.checkParameterIsNotNull(str, SearchIntents.EXTRA_QUERY);
        Intrinsics.checkParameterIsNotNull(list, "recipients");
        Intrinsics.checkParameterIsNotNull(recipientSearchType, ShareHitPoint.f121869d);
        this.f111159a = z;
        this.f111160b = str;
        this.f111161c = i;
        this.f111162d = list;
        this.f111163e = z2;
        this.f111164f = recipientSearchType;
    }
}
