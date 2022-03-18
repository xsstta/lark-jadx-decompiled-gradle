package com.ss.android.lark.calendar.impl.features.common.widget.attachment;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.common.widget.attachment.AttachmentView;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.utils.UIHelper;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0016\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0003J\u0016\u0010\u0014\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002J\b\u0010\u0015\u001a\u00020\u0010H\u0002J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J\u0016\u0010\u0019\u001a\u00020\u00172\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002J\u0016\u0010\u001a\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002J\u0016\u0010\u001b\u001a\u00020\u00102\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012J\u000e\u0010\u001c\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/common/widget/attachment/AttachmentLayout;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "allSizeTv", "Landroid/widget/TextView;", "itemClickListener", "Lcom/ss/android/lark/calendar/impl/features/common/widget/attachment/AttachmentView$OnClickListener;", "addAttachmentsView", "", "attachmentsData", "", "Lcom/ss/android/lark/calendar/impl/features/common/widget/attachment/AttachmentItemData;", "asyncAddAttachmentsView", "clearAttachmentsView", "getAttachmentSize", "", "fileSize", "getSumSize", "setCountSizeInfo", "setData", "setOnItemClickListener", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class AttachmentLayout extends LinearLayout {

    /* renamed from: a */
    public AttachmentView.OnClickListener f78741a;

    /* renamed from: b */
    private TextView f78742b;

    /* renamed from: a */
    public final void mo112879a() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (!Intrinsics.areEqual(this.f78742b, childAt)) {
                removeView(childAt);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.attachment.AttachmentLayout$a */
    public static final class RunnableC31160a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AttachmentLayout f78743a;

        /* renamed from: b */
        final /* synthetic */ List f78744b;

        RunnableC31160a(AttachmentLayout attachmentLayout, List list) {
            this.f78743a = attachmentLayout;
            this.f78744b = list;
        }

        public final void run() {
            final LinearLayout linearLayout = new LinearLayout(this.f78743a.getContext());
            linearLayout.setOrientation(1);
            for (AttachmentItemData aVar : this.f78744b) {
                View inflate = LayoutInflater.from(this.f78743a.getContext()).inflate(R.layout.calendar_event_attachment_item, (ViewGroup) this.f78743a, false);
                if (inflate != null) {
                    AttachmentView attachmentView = (AttachmentView) inflate;
                    attachmentView.mo112885a(aVar, this.f78743a.f78741a);
                    linearLayout.addView(attachmentView);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.calendar.impl.features.common.widget.attachment.AttachmentView");
                }
            }
            UICallbackExecutor.post(new Runnable(this) {
                /* class com.ss.android.lark.calendar.impl.features.common.widget.attachment.AttachmentLayout.RunnableC31160a.RunnableC311611 */

                /* renamed from: a */
                final /* synthetic */ RunnableC31160a f78745a;

                {
                    this.f78745a = r1;
                }

                public final void run() {
                    this.f78745a.f78743a.mo112879a();
                    this.f78745a.f78743a.addView(linearLayout);
                }
            });
        }
    }

    public final void setOnItemClickListener(AttachmentView.OnClickListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "itemClickListener");
        this.f78741a = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AttachmentLayout(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: b */
    private final void m116324b(List<AttachmentItemData> list) {
        CoreThreadPool.getSerialTaskHandler().post(new RunnableC31160a(this, list));
    }

    public final void setData(List<AttachmentItemData> list) {
        if (list != null) {
            setCountSizeInfo(list);
            m116324b(list);
        }
    }

    /* renamed from: a */
    private final String m116323a(List<AttachmentItemData> list) {
        long j;
        Iterator<T> it = list.iterator();
        long j2 = 0;
        while (it.hasNext()) {
            try {
                j = Long.parseLong(it.next().mo112889b());
            } catch (Exception unused) {
                j = 0;
            }
            j2 += j;
        }
        return String.valueOf(j2);
    }

    private final void setCountSizeInfo(List<AttachmentItemData> list) {
        String str;
        HashMap hashMap = new HashMap();
        hashMap.put("number", String.valueOf(list.size()));
        if (list.size() == 1) {
            str = "";
        } else {
            str = "s";
        }
        hashMap.put("s", str);
        String a = C32634ae.m125180a(R.plurals.Calendar_Plural_Attachment, list.size());
        String a2 = m116322a(m116323a(list));
        this.f78742b.setText(a + " (" + a2 + ')');
    }

    /* renamed from: a */
    private final String m116322a(String str) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong < ((long) 1024)) {
                return parseLong + " Byte";
            } else if (parseLong < ((long) 1048576)) {
                StringCompanionObject mVar = StringCompanionObject.f173215a;
                String format = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(((float) parseLong) / ((float) 1024))}, 1));
                Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(format, *args)");
                return format + " KB";
            } else {
                float f = ((float) parseLong) / ((float) 1048576);
                StringCompanionObject mVar2 = StringCompanionObject.f173215a;
                String format2 = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1));
                Intrinsics.checkExpressionValueIsNotNull(format2, "java.lang.String.format(format, *args)");
                return format2 + " MB";
            }
        } catch (Exception unused) {
            return "0KB";
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AttachmentLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AttachmentLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
        TextView textView = new TextView(getContext());
        this.f78742b = textView;
        textView.setTextColor(C32634ae.m125178a(R.color.text_title));
        this.f78742b.setTextSize(1, 16.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = UIHelper.dp2px(12.0f);
        layoutParams.bottomMargin = UIHelper.dp2px(8.0f);
        addView(this.f78742b, layoutParams);
    }
}
