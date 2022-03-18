package com.ss.android.lark.contact.impl.contacts_email.edit.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.larksuite.component.universe_design.edittext.UDEditText;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001:\u0001\u001aB/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u001a\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0002R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/contact/impl/contacts_email/edit/widget/EditTextWithPrefix;", "Lcom/larksuite/component/universe_design/edittext/UDEditText;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "mDrawableClickListener", "Landroid/view/View$OnClickListener;", "mPrefixDrawable", "Landroid/graphics/drawable/Drawable;", "mPrefixText", "", "mTouchDrawable", "", "onTouchEvent", "event", "Landroid/view/MotionEvent;", "setPhonePrefix", "", "prefix", "clickListener", "touchLeftDrawable", "PrefixDrawable", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
public class EditTextWithPrefix extends UDEditText {

    /* renamed from: a */
    private String f91959a;

    /* renamed from: b */
    private Drawable f91960b;

    /* renamed from: c */
    private View.OnClickListener f91961c;

    /* renamed from: d */
    private boolean f91962d;

    public EditTextWithPrefix(Context context) {
        this(context, null, 0, 0, 14, null);
    }

    public EditTextWithPrefix(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public EditTextWithPrefix(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\rH\u0016J\u0012\u0010\u0010\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/contact/impl/contacts_email/edit/widget/EditTextWithPrefix$PrefixDrawable;", "Landroid/graphics/drawable/Drawable;", "prefixView", "Landroid/view/View;", "(Landroid/view/View;)V", "view", "getView", "()Landroid/view/View;", "draw", "", "canvas", "Landroid/graphics/Canvas;", "getOpacity", "", "setAlpha", "alpha", "setColorFilter", "colorFilter", "Landroid/graphics/ColorFilter;", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.contacts_email.edit.widget.EditTextWithPrefix$a */
    private static final class PrefixDrawable extends Drawable {

        /* renamed from: a */
        private final View f91963a;

        public int getOpacity() {
            return -3;
        }

        public void setAlpha(int i) {
        }

        public void setColorFilter(ColorFilter colorFilter) {
        }

        public void draw(Canvas canvas) {
            Intrinsics.checkParameterIsNotNull(canvas, "canvas");
            canvas.save();
            this.f91963a.draw(canvas);
            canvas.restore();
        }

        public PrefixDrawable(View view) {
            Intrinsics.checkParameterIsNotNull(view, "prefixView");
            this.f91963a = view;
            view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
            setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    /* renamed from: a */
    private final boolean m139162a(MotionEvent motionEvent) {
        if (this.f91960b == null) {
            return false;
        }
        Drawable drawable = this.f91960b;
        if (drawable == null) {
            Intrinsics.throwNpe();
        }
        int i = drawable.getBounds().left;
        Drawable drawable2 = this.f91960b;
        if (drawable2 == null) {
            Intrinsics.throwNpe();
        }
        return new Rect(i, 0, drawable2.getBounds().right, getHeight()).contains((int) motionEvent.getX(), (int) motionEvent.getY());
    }

    @Override // com.larksuite.component.universe_design.edittext.UDEditText
    public boolean onTouchEvent(MotionEvent motionEvent) {
        View.OnClickListener onClickListener;
        Intrinsics.checkParameterIsNotNull(motionEvent, "event");
        if (motionEvent.getAction() == 0) {
            this.f91962d = m139162a(motionEvent);
        } else if (motionEvent.getAction() == 1 && this.f91962d && m139162a(motionEvent) && (onClickListener = this.f91961c) != null) {
            onClickListener.onClick(this);
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: a */
    public final void mo131136a(String str, View.OnClickListener onClickListener) {
        if (str == null) {
            setCompoundDrawables(null, null, null, null);
            return;
        }
        String str2 = str;
        if (!TextUtils.equals(this.f91959a, str2)) {
            View inflate = LayoutInflater.from(getContext()).inflate(R.layout.card_edit_item_phone_pref, (ViewGroup) null);
            View findViewById = inflate.findViewById(R.id.tv_phone_prefix);
            if (findViewById != null) {
                ((TextView) findViewById).setText(str2);
                this.f91959a = str;
                Intrinsics.checkExpressionValueIsNotNull(inflate, "phonePrefPanel");
                PrefixDrawable aVar = new PrefixDrawable(inflate);
                this.f91960b = aVar;
                setCompoundDrawables(aVar, null, null, null);
                this.f91961c = onClickListener;
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditTextWithPrefix(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EditTextWithPrefix(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
