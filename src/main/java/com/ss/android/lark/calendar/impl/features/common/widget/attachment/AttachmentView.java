package com.ss.android.lark.calendar.impl.features.common.widget.attachment;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttachment;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.C32664q;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0016B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0013H\u0002¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/common/widget/attachment/AttachmentView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "bindData", "", "itemData", "Lcom/ss/android/lark/calendar/impl/features/common/widget/attachment/AttachmentItemData;", "clickListener", "Lcom/ss/android/lark/calendar/impl/features/common/widget/attachment/AttachmentView$OnClickListener;", "setAttachmentSize", "fileSize", "", "setAttachmentType", "fileName", "OnClickListener", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class AttachmentView extends LinearLayout {

    /* renamed from: a */
    private HashMap f78747a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/common/widget/attachment/AttachmentView$OnClickListener;", "", "onClick", "", "token", "", ShareHitPoint.f121869d, "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttachment$Type;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.attachment.AttachmentView$a */
    public interface OnClickListener {
        /* renamed from: a */
        void mo112886a(String str, CalendarEventAttachment.Type type);
    }

    /* renamed from: a */
    public View mo112884a(int i) {
        if (this.f78747a == null) {
            this.f78747a = new HashMap();
        }
        View view = (View) this.f78747a.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f78747a.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AttachmentView(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.attachment.AttachmentView$b */
    static final class View$OnClickListenerC31162b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ OnClickListener f78748a;

        /* renamed from: b */
        final /* synthetic */ AttachmentItemData f78749b;

        View$OnClickListenerC31162b(OnClickListener aVar, AttachmentItemData aVar2) {
            this.f78748a = aVar;
            this.f78749b = aVar2;
        }

        public final void onClick(View view) {
            OnClickListener aVar = this.f78748a;
            if (aVar != null) {
                aVar.mo112886a(this.f78749b.mo112888a(), this.f78749b.mo112891d());
            }
        }
    }

    private final void setAttachmentType(String str) {
        ((ImageView) mo112884a(R.id.typeIcon)).setImageDrawable(C32634ae.m125184d(C32664q.m125356a(str)));
    }

    private final void setAttachmentSize(String str) {
        String str2;
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong < ((long) 1024)) {
                str2 = parseLong + " Byte";
            } else if (parseLong < ((long) 1048576)) {
                StringCompanionObject mVar = StringCompanionObject.f173215a;
                String format = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(((float) parseLong) / ((float) 1024))}, 1));
                Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(format, *args)");
                str2 = format + " KB";
            } else {
                float f = ((float) parseLong) / ((float) 1048576);
                StringCompanionObject mVar2 = StringCompanionObject.f173215a;
                String format2 = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1));
                Intrinsics.checkExpressionValueIsNotNull(format2, "java.lang.String.format(format, *args)");
                str2 = format2 + " MB";
            }
            TextView textView = (TextView) mo112884a(R.id.attachmentSizeTV);
            Intrinsics.checkExpressionValueIsNotNull(textView, "attachmentSizeTV");
            textView.setVisibility(0);
            TextView textView2 = (TextView) mo112884a(R.id.attachmentSizeTV);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "attachmentSizeTV");
            textView2.setText(str2);
        } catch (Exception unused) {
            TextView textView3 = (TextView) mo112884a(R.id.attachmentSizeTV);
            Intrinsics.checkExpressionValueIsNotNull(textView3, "attachmentSizeTV");
            textView3.setVisibility(8);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AttachmentView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    public final void mo112885a(AttachmentItemData aVar, OnClickListener aVar2) {
        Intrinsics.checkParameterIsNotNull(aVar, "itemData");
        if (aVar.mo112891d() == CalendarEventAttachment.Type.UNKNOWN) {
            ((ImageView) mo112884a(R.id.typeIcon)).setImageDrawable(C32634ae.m125184d(C32664q.m125355a()));
            TextView textView = (TextView) mo112884a(R.id.attachmentNameTV);
            Intrinsics.checkExpressionValueIsNotNull(textView, "attachmentNameTV");
            textView.setVisibility(8);
            TextView textView2 = (TextView) mo112884a(R.id.attachmentSizeTV);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "attachmentSizeTV");
            textView2.setVisibility(8);
            TextView textView3 = (TextView) mo112884a(R.id.unknownAttachmentTV);
            Intrinsics.checkExpressionValueIsNotNull(textView3, "unknownAttachmentTV");
            textView3.setVisibility(0);
        } else {
            setAttachmentType(aVar.mo112890c());
            TextView textView4 = (TextView) mo112884a(R.id.attachmentNameTV);
            Intrinsics.checkExpressionValueIsNotNull(textView4, "attachmentNameTV");
            textView4.setText(aVar.mo112890c());
            TextView textView5 = (TextView) mo112884a(R.id.attachmentNameTV);
            Intrinsics.checkExpressionValueIsNotNull(textView5, "attachmentNameTV");
            textView5.setVisibility(0);
            TextView textView6 = (TextView) mo112884a(R.id.attachmentSizeTV);
            Intrinsics.checkExpressionValueIsNotNull(textView6, "attachmentSizeTV");
            textView6.setVisibility(0);
            TextView textView7 = (TextView) mo112884a(R.id.unknownAttachmentTV);
            Intrinsics.checkExpressionValueIsNotNull(textView7, "unknownAttachmentTV");
            textView7.setVisibility(8);
            setAttachmentSize(aVar.mo112889b());
        }
        setOnClickListener(new View$OnClickListenerC31162b(aVar2, aVar));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AttachmentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }
}
