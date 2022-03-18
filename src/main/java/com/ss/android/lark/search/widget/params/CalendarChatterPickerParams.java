package com.ss.android.lark.search.widget.params;

import com.ss.android.lark.search.widget.params.ChatterPickerParams;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001\u0012B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\r\u001a\u00020\tJ\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0006\u0010\u000f\u001a\u00020\tJ\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/search/widget/params/CalendarChatterPickerParams;", "Lcom/ss/android/lark/search/widget/params/ChatterPickerParams;", "builder", "Lcom/ss/android/lark/search/widget/params/CalendarChatterPickerParams$Builder;", "(Lcom/ss/android/lark/search/widget/params/CalendarChatterPickerParams$Builder;)V", "mDisabledMemberIds", "", "", "mIsAddMail", "", "mIsCheckPermission", "mSelectedChatIds", "mSelectedChatterIds", "checkPermission", "disabledMemberIds", "isAddMail", "selectedChatIds", "selectedChatterIds", "Builder", "search-widget_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.search.widget.c.b */
public final class CalendarChatterPickerParams extends ChatterPickerParams {

    /* renamed from: a */
    private List<String> f133029a = new ArrayList();

    /* renamed from: b */
    private List<String> f133030b = new ArrayList();

    /* renamed from: c */
    private List<String> f133031c = new ArrayList();

    /* renamed from: d */
    private boolean f133032d;

    /* renamed from: e */
    private boolean f133033e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010 \n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u000bJ\u0012\u0010\u001b\u001a\u00020\u00002\b\u0010\u001c\u001a\u0004\u0018\u00010\u0005H\u0016J\u0018\u0010\u001d\u001a\u00020\u00002\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001fH\u0016J\u0010\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u000bH\u0016J\u000e\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u000bJ\u0010\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u000bH\u0016J\u0016\u0010&\u001a\u00020\u00002\u000e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001fJ\u0010\u0010(\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\u000bH\u0016J\u0010\u0010*\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\u000bH\u0016J\u0018\u0010,\u001a\u00020\u00002\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001fH\u0016J\u0016\u0010.\u001a\u00020\u00002\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001fJ\u0016\u00100\u001a\u00020\u00002\u000e\u00101\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001fJ\b\u00102\u001a\u000203H\u0016R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\t¨\u00064"}, d2 = {"Lcom/ss/android/lark/search/widget/params/CalendarChatterPickerParams$Builder;", "Lcom/ss/android/lark/search/widget/params/ChatterPickerParams$Builder;", "()V", "mDisabledMemberIds", "", "", "getMDisabledMemberIds", "()Ljava/util/List;", "setMDisabledMemberIds", "(Ljava/util/List;)V", "mIsAddMail", "", "getMIsAddMail", "()Z", "setMIsAddMail", "(Z)V", "mIsCheckPermission", "getMIsCheckPermission", "setMIsCheckPermission", "mSelectedChatIds", "getMSelectedChatIds", "setMSelectedChatIds", "mSelectedChatterIds", "getMSelectedChatterIds", "setMSelectedChatterIds", "attachAddMail", "isAddMail", "attachChatId", "chatId", "attachChatIds", "chatIds", "", "attachCheckOUPermission", "isCheckOUPermission", "attachCheckPermission", "isCheckPermission", "attachCheckSecretPermission", "isCheckSecretPermission", "attachDisabledMemberIds", "disabledMemberIds", "attachIgnoreSelf", "ignoreSelf", "attachNeedSearchOuterUser", "needSearchOuterUser", "attachRequiredList", "requiredList", "attachSelectedChatIds", "selectedChatIds", "attachSelectedChatterIds", "selectedChatterIds", "build", "Lcom/ss/android/lark/search/widget/params/CalendarChatterPickerParams;", "search-widget_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.widget.c.b$a */
    public static final class Builder extends ChatterPickerParams.Builder {

        /* renamed from: a */
        private List<String> f133034a = new ArrayList();

        /* renamed from: b */
        private List<String> f133035b = new ArrayList();

        /* renamed from: c */
        private List<String> f133036c = new ArrayList();

        /* renamed from: d */
        private boolean f133037d;

        /* renamed from: e */
        private boolean f133038e;

        /* renamed from: c */
        public final List<String> mo183667c() {
            return this.f133036c;
        }

        /* renamed from: d */
        public final boolean mo183669d() {
            return this.f133037d;
        }

        /* renamed from: e */
        public final boolean mo183671e() {
            return this.f133038e;
        }

        /* renamed from: a */
        public final List<String> mo183661a() {
            return this.f133034a;
        }

        /* renamed from: f */
        public CalendarChatterPickerParams mo183675g() {
            return new CalendarChatterPickerParams(this);
        }

        /* renamed from: b */
        public final List<String> mo183665b() {
            return this.f133035b;
        }

        /* renamed from: a */
        public final Builder mo183660a(boolean z) {
            this.f133038e = z;
            return this;
        }

        /* renamed from: b */
        public final Builder mo183662b(boolean z) {
            this.f133037d = z;
            return this;
        }

        /* renamed from: a */
        public Builder mo183663b(String str) {
            ChatterPickerParams.Builder b = super.mo183663b(str);
            if (b != null) {
                return (Builder) b;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.search.widget.params.CalendarChatterPickerParams.Builder");
        }

        /* renamed from: c */
        public Builder mo183668d(boolean z) {
            ChatterPickerParams.Builder d = super.mo183668d(z);
            if (d != null) {
                return (Builder) d;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.search.widget.params.CalendarChatterPickerParams.Builder");
        }

        /* renamed from: e */
        public Builder mo183673f(boolean z) {
            ChatterPickerParams.Builder f = super.mo183673f(z);
            if (f != null) {
                return (Builder) f;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.search.widget.params.CalendarChatterPickerParams.Builder");
        }

        /* renamed from: g */
        public Builder mo183676h(boolean z) {
            ChatterPickerParams.Builder h = super.mo183676h(z);
            if (h != null) {
                return (Builder) h;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.search.widget.params.CalendarChatterPickerParams.Builder");
        }

        /* renamed from: i */
        public Builder mo183678j(boolean z) {
            ChatterPickerParams.Builder j = super.mo183678j(z);
            if (j != null) {
                return (Builder) j;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.search.widget.params.CalendarChatterPickerParams.Builder");
        }

        /* renamed from: a */
        public Builder mo183664b(List<String> list) {
            ChatterPickerParams.Builder b = super.mo183664b(list);
            if (b != null) {
                return (Builder) b;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.search.widget.params.CalendarChatterPickerParams.Builder");
        }
    }

    /* renamed from: c */
    public final boolean mo183656c() {
        return this.f133033e;
    }

    /* renamed from: d */
    public final boolean mo183657d() {
        return this.f133032d;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CalendarChatterPickerParams(Builder aVar) {
        super(aVar);
        Intrinsics.checkParameterIsNotNull(aVar, "builder");
        this.f133029a.clear();
        this.f133029a.addAll(aVar.mo183661a());
        this.f133030b.clear();
        this.f133030b.addAll(aVar.mo183665b());
        this.f133031c.clear();
        this.f133031c.addAll(aVar.mo183667c());
        this.f133032d = aVar.mo183669d();
        this.f133033e = aVar.mo183671e();
    }
}
