package com.bytedance.ee.bear.middleground.permission.widget.editpermdialog;

import android.view.View;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001c\b\b\u0018\u00002\u00020\u0001:\u0001'BI\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003J\t\u0010!\u001a\u00020\fHÆ\u0003JO\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010#\u001a\u00020\b2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0005HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\t\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\u0011\"\u0004\b\u0018\u0010\u0013R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015¨\u0006("}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/widget/editpermdialog/EditPermItemModel;", "", "desc", "", "descColor", "", "tips", "isSelected", "", "clickable", "showDivider", "clickListener", "Landroid/view/View$OnClickListener;", "(Ljava/lang/String;ILjava/lang/String;ZZZLandroid/view/View$OnClickListener;)V", "getClickListener", "()Landroid/view/View$OnClickListener;", "getClickable", "()Z", "setClickable", "(Z)V", "getDesc", "()Ljava/lang/String;", "getDescColor", "()I", "setSelected", "getShowDivider", "getTips", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "Builder", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.widget.a.c */
public final class EditPermItemModel {

    /* renamed from: a */
    private final String f27325a;

    /* renamed from: b */
    private final int f27326b;

    /* renamed from: c */
    private final String f27327c;

    /* renamed from: d */
    private boolean f27328d;

    /* renamed from: e */
    private boolean f27329e;

    /* renamed from: f */
    private final boolean f27330f;

    /* renamed from: g */
    private final View.OnClickListener f27331g;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EditPermItemModel) {
                EditPermItemModel cVar = (EditPermItemModel) obj;
                if (Intrinsics.areEqual(this.f27325a, cVar.f27325a)) {
                    if ((this.f27326b == cVar.f27326b) && Intrinsics.areEqual(this.f27327c, cVar.f27327c)) {
                        if (this.f27328d == cVar.f27328d) {
                            if (this.f27329e == cVar.f27329e) {
                                if (!(this.f27330f == cVar.f27330f) || !Intrinsics.areEqual(this.f27331g, cVar.f27331g)) {
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f27325a;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f27326b) * 31;
        String str2 = this.f27327c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z = this.f27328d;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode2 + i3) * 31;
        boolean z2 = this.f27329e;
        if (z2) {
            z2 = true;
        }
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = (i6 + i7) * 31;
        boolean z3 = this.f27330f;
        if (!z3) {
            i2 = z3 ? 1 : 0;
        }
        int i11 = (i10 + i2) * 31;
        View.OnClickListener onClickListener = this.f27331g;
        if (onClickListener != null) {
            i = onClickListener.hashCode();
        }
        return i11 + i;
    }

    public String toString() {
        return "EditPermItemModel(desc=" + this.f27325a + ", descColor=" + this.f27326b + ", tips=" + this.f27327c + ", isSelected=" + this.f27328d + ", clickable=" + this.f27329e + ", showDivider=" + this.f27330f + ", clickListener=" + this.f27331g + ")";
    }

    /* renamed from: a */
    public final String mo38495a() {
        return this.f27325a;
    }

    /* renamed from: b */
    public final int mo38496b() {
        return this.f27326b;
    }

    /* renamed from: c */
    public final String mo38497c() {
        return this.f27327c;
    }

    /* renamed from: d */
    public final boolean mo38498d() {
        return this.f27328d;
    }

    /* renamed from: e */
    public final boolean mo38499e() {
        return this.f27329e;
    }

    /* renamed from: f */
    public final boolean mo38501f() {
        return this.f27330f;
    }

    /* renamed from: g */
    public final View.OnClickListener mo38502g() {
        return this.f27331g;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010#\u001a\u00020$J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\nJ\u000e\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\nJ\u000e\u0010\"\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u0010R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\f\"\u0004\b\u001c\u0010\u000eR\u001a\u0010\u001d\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\f\"\u0004\b\u001f\u0010\u000eR\u001a\u0010 \u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0012\"\u0004\b\"\u0010\u0014¨\u0006%"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/widget/editpermdialog/EditPermItemModel$Builder;", "", "()V", "clickListener", "Landroid/view/View$OnClickListener;", "getClickListener", "()Landroid/view/View$OnClickListener;", "setClickListener", "(Landroid/view/View$OnClickListener;)V", "clickable", "", "getClickable", "()Z", "setClickable", "(Z)V", "desc", "", "getDesc", "()Ljava/lang/String;", "setDesc", "(Ljava/lang/String;)V", "descColor", "", "getDescColor", "()I", "setDescColor", "(I)V", "isSelected", "setSelected", "showDivider", "getShowDivider", "setShowDivider", "tips", "getTips", "setTips", "build", "Lcom/bytedance/ee/bear/middleground/permission/widget/editpermdialog/EditPermItemModel;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.widget.a.c$a */
    public static final class Builder {

        /* renamed from: a */
        private String f27332a = "";

        /* renamed from: b */
        private int f27333b = R.color.text_title;

        /* renamed from: c */
        private String f27334c = "";

        /* renamed from: d */
        private boolean f27335d;

        /* renamed from: e */
        private boolean f27336e;

        /* renamed from: f */
        private boolean f27337f;

        /* renamed from: g */
        private View.OnClickListener f27338g = View$OnClickListenerC10114a.f27339a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.middleground.permission.widget.a.c$a$a */
        static final class View$OnClickListenerC10114a implements View.OnClickListener {

            /* renamed from: a */
            public static final View$OnClickListenerC10114a f27339a = new View$OnClickListenerC10114a();

            View$OnClickListenerC10114a() {
            }

            public final void onClick(View view) {
            }
        }

        /* renamed from: a */
        public final EditPermItemModel mo38509a() {
            return new EditPermItemModel(this.f27332a, this.f27333b, this.f27334c, this.f27335d, this.f27336e, this.f27337f, this.f27338g);
        }

        /* renamed from: a */
        public final Builder mo38505a(int i) {
            this.f27333b = i;
            return this;
        }

        /* renamed from: b */
        public final Builder mo38511b(boolean z) {
            this.f27336e = z;
            return this;
        }

        /* renamed from: c */
        public final Builder mo38512c(boolean z) {
            this.f27337f = z;
            return this;
        }

        /* renamed from: a */
        public final Builder mo38506a(View.OnClickListener onClickListener) {
            Intrinsics.checkParameterIsNotNull(onClickListener, "clickListener");
            this.f27338g = onClickListener;
            return this;
        }

        /* renamed from: b */
        public final Builder mo38510b(String str) {
            Intrinsics.checkParameterIsNotNull(str, "tips");
            this.f27334c = str;
            return this;
        }

        /* renamed from: a */
        public final Builder mo38507a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "desc");
            this.f27332a = str;
            return this;
        }

        /* renamed from: a */
        public final Builder mo38508a(boolean z) {
            this.f27335d = z;
            return this;
        }
    }

    public EditPermItemModel(String str, int i, String str2, boolean z, boolean z2, boolean z3, View.OnClickListener onClickListener) {
        Intrinsics.checkParameterIsNotNull(str, "desc");
        Intrinsics.checkParameterIsNotNull(str2, "tips");
        Intrinsics.checkParameterIsNotNull(onClickListener, "clickListener");
        this.f27325a = str;
        this.f27326b = i;
        this.f27327c = str2;
        this.f27328d = z;
        this.f27329e = z2;
        this.f27330f = z3;
        this.f27331g = onClickListener;
    }
}
