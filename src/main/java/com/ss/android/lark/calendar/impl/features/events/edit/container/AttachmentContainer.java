package com.ss.android.lark.calendar.impl.features.events.edit.container;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.widget.SerialLoadingDialog;
import com.ss.android.lark.calendar.impl.features.common.widget.attachment.AttachmentItemData;
import com.ss.android.lark.calendar.impl.features.common.widget.attachment.AttachmentLayout;
import com.ss.android.lark.calendar.impl.features.common.widget.attachment.AttachmentView;
import com.ss.android.lark.calendar.impl.features.events.edit.listener.view.IDetailItemListener;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttachment;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\r\u001a\u00020\u000eH\u0002J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J&\u0010\u0015\u001a\u00020\u000e2\u0016\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00180\u0017j\b\u0012\u0004\u0012\u00020\u0018`\u00192\u0006\u0010\u001a\u001a\u00020\nJ\u000e\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\bR\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/container/AttachmentContainer;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mDetailItemListener", "Lcom/ss/android/lark/calendar/impl/features/events/edit/listener/view/IDetailItemListener;", "mDisableDeleteAttachment", "", "mLoadingToast", "Lcom/ss/android/lark/calendar/impl/features/calendarview/widget/SerialLoadingDialog;", "initView", "", "onCellClicked", "token", "", ShareHitPoint.f121869d, "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttachment$Type;", "openAttachmentInBrowser", "setData", "attachmentData", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/common/widget/attachment/AttachmentItemData;", "Lkotlin/collections/ArrayList;", "disableDeleteAttachment", "setDetailItemListener", "detailItemListener", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class AttachmentContainer extends RelativeLayout {

    /* renamed from: a */
    private boolean f80079a;

    /* renamed from: b */
    private IDetailItemListener f80080b;

    /* renamed from: c */
    private SerialLoadingDialog f80081c;

    /* renamed from: d */
    private HashMap f80082d;

    public AttachmentContainer(Context context) {
        this(context, null, 2, null);
    }

    /* renamed from: a */
    public View mo114738a(int i) {
        if (this.f80082d == null) {
            this.f80082d = new HashMap();
        }
        View view = (View) this.f80082d.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f80082d.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    private final void m119083a() {
        LayoutInflater.from(getContext()).inflate(R.layout.calendar_view_attachment_container, this);
        ((AttachmentLayout) mo114738a(R.id.layout_edit_attachment)).setOnItemClickListener(new C31584a(this));
        Context context = getContext();
        if (context != null) {
            SerialLoadingDialog iVar = new SerialLoadingDialog((Activity) context);
            this.f80081c = iVar;
            if (iVar != null) {
                iVar.mo112594e(130);
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/container/AttachmentContainer$initView$1", "Lcom/ss/android/lark/calendar/impl/features/common/widget/attachment/AttachmentView$OnClickListener;", "onClick", "", "token", "", ShareHitPoint.f121869d, "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttachment$Type;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.container.AttachmentContainer$a */
    public static final class C31584a implements AttachmentView.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AttachmentContainer f80083a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31584a(AttachmentContainer attachmentContainer) {
            this.f80083a = attachmentContainer;
        }

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.attachment.AttachmentView.OnClickListener
        /* renamed from: a */
        public void mo112886a(String str, CalendarEventAttachment.Type type) {
            Intrinsics.checkParameterIsNotNull(str, "token");
            Intrinsics.checkParameterIsNotNull(type, ShareHitPoint.f121869d);
            this.f80083a.mo114739a(str, type);
        }
    }

    public final void setDetailItemListener(IDetailItemListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "detailItemListener");
        this.f80080b = bVar;
    }

    /* renamed from: a */
    private final void m119084a(String str) {
        GeneralHitPoint.m124231b("preview", "edit");
        C30022a.f74882a.browserModuleDependency().mo108214d(getContext(), str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AttachmentContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        m119083a();
    }

    /* renamed from: a */
    public final void mo114739a(String str, CalendarEventAttachment.Type type) {
        if (type == CalendarEventAttachment.Type.UNKNOWN) {
            SerialLoadingDialog iVar = this.f80081c;
            if (iVar != null) {
                iVar.mo112591b(R.string.Calendar_Attachment_MobileToast);
                return;
            }
            return;
        }
        m119084a(str);
    }

    /* renamed from: a */
    public final void mo114740a(ArrayList<AttachmentItemData> arrayList, boolean z) {
        Intrinsics.checkParameterIsNotNull(arrayList, "attachmentData");
        this.f80079a = z;
        AttachmentLayout attachmentLayout = (AttachmentLayout) mo114738a(R.id.layout_edit_attachment);
        if (attachmentLayout != null) {
            attachmentLayout.setData(arrayList);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AttachmentContainer(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
