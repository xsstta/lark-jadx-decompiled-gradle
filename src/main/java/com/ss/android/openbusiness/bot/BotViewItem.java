package com.ss.android.openbusiness.bot;

import com.ss.android.openbusiness.bot.net.data.Bot;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/ss/android/openbusiness/bot/BotViewItem;", "Lcom/ss/android/openbusiness/bot/net/data/Bot;", "viewType", "", "nameSpan", "", "descriptionSpan", "(ILjava/lang/CharSequence;Ljava/lang/CharSequence;)V", "getDescriptionSpan", "()Ljava/lang/CharSequence;", "setDescriptionSpan", "(Ljava/lang/CharSequence;)V", "getNameSpan", "setNameSpan", "getViewType", "()I", "setViewType", "(I)V", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "", "openbusiness_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class BotViewItem extends Bot {

    /* renamed from: a */
    private int f147717a;

    /* renamed from: b */
    private CharSequence f147718b;

    /* renamed from: c */
    private CharSequence f147719c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BotViewItem)) {
            return false;
        }
        BotViewItem botViewItem = (BotViewItem) obj;
        return this.f147717a == botViewItem.f147717a && Intrinsics.areEqual(this.f147718b, botViewItem.f147718b) && Intrinsics.areEqual(this.f147719c, botViewItem.f147719c);
    }

    public int hashCode() {
        int i = this.f147717a * 31;
        CharSequence charSequence = this.f147718b;
        int i2 = 0;
        int hashCode = (i + (charSequence != null ? charSequence.hashCode() : 0)) * 31;
        CharSequence charSequence2 = this.f147719c;
        if (charSequence2 != null) {
            i2 = charSequence2.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        return "BotViewItem(viewType=" + this.f147717a + ", nameSpan=" + this.f147718b + ", descriptionSpan=" + this.f147719c + ")";
    }

    /* renamed from: a */
    public final int mo202811a() {
        return this.f147717a;
    }

    /* renamed from: b */
    public final CharSequence mo202813b() {
        return this.f147718b;
    }

    /* renamed from: c */
    public final CharSequence mo202815c() {
        return this.f147719c;
    }

    /* renamed from: a */
    public final void mo202812a(CharSequence charSequence) {
        Intrinsics.checkParameterIsNotNull(charSequence, "<set-?>");
        this.f147718b = charSequence;
    }

    /* renamed from: b */
    public final void mo202814b(CharSequence charSequence) {
        Intrinsics.checkParameterIsNotNull(charSequence, "<set-?>");
        this.f147719c = charSequence;
    }

    public BotViewItem(int i, CharSequence charSequence, CharSequence charSequence2) {
        Intrinsics.checkParameterIsNotNull(charSequence, "nameSpan");
        Intrinsics.checkParameterIsNotNull(charSequence2, "descriptionSpan");
        this.f147717a = i;
        this.f147718b = charSequence;
        this.f147719c = charSequence2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BotViewItem(int i, CharSequence charSequence, CharSequence charSequence2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? "" : charSequence, (i2 & 4) != 0 ? "" : charSequence2);
    }
}
