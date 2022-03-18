package com.ss.android.lark.contact.impl.contacts_selector.school;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.larksuite.suite.R;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\u000eJ\b\u0010\u000f\u001a\u0004\u0018\u00010\nJ\u0006\u0010\u0010\u001a\u00020\u000eJ\u0010\u0010\u0011\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\nR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/contact/impl/contacts_selector/school/SchoolContactView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mOnItemClick", "Lcom/ss/android/lark/contact/impl/contacts_selector/school/ISchoolParentContactListener;", "clear", "", "getHeaderViewGroup", "Landroid/view/ViewGroup;", "getOnItemClickListener", "getSchoolParentContactContainer", "setOnItemClickListener", "listener", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class SchoolContactView extends LinearLayout {

    /* renamed from: a */
    private ISchoolParentContactListener f92473a;

    /* renamed from: b */
    private HashMap f92474b;

    /* renamed from: a */
    public View mo131649a(int i) {
        if (this.f92474b == null) {
            this.f92474b = new HashMap();
        }
        View view = (View) this.f92474b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f92474b.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final ISchoolParentContactListener getOnItemClickListener() {
        return this.f92473a;
    }

    /* renamed from: a */
    public final void mo131650a() {
        ((LinearLayout) mo131649a(R.id.school_container)).removeAllViews();
    }

    public final ViewGroup getHeaderViewGroup() {
        RelativeLayout relativeLayout = (RelativeLayout) mo131649a(R.id.school_header);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "school_header");
        return relativeLayout;
    }

    public final ViewGroup getSchoolParentContactContainer() {
        LinearLayout linearLayout = (LinearLayout) mo131649a(R.id.school_container);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "school_container");
        return linearLayout;
    }

    public final void setOnItemClickListener(ISchoolParentContactListener bVar) {
        this.f92473a = bVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SchoolContactView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        LayoutInflater.from(context).inflate(R.layout.school_contact_container, (ViewGroup) this, true);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SchoolContactView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
