package com.ss.android.lark.calendar.impl.features.messagecard.helper;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.messagecard.entity.content.CalendarInternalContent;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.C32646c;
import com.ss.android.lark.calendar.impl.utils.aj;
import com.ss.android.lark.calendar.impl.utils.p1577a.AbstractC32627c;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30054s;
import com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView;
import com.ss.android.lark.widget.span.RecogniseSpansResult;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JF\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\fH\u0007J \u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0007J\u0018\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0015H\u0007J,\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00132\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0007J\u0012\u0010\"\u001a\u00020\f2\b\u0010#\u001a\u0004\u0018\u00010\fH\u0007¨\u0006$"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/messagecard/helper/CalendarCardBinderCommonHelper;", "", "()V", "bindAttendeeInfo", "", "context", "Landroid/content/Context;", "attendeeContainer", "Landroid/view/ViewGroup;", "attendeesTextView", "Lcom/ss/android/lark/widget/linked_emojicon/widget/LinkEmojiTextView;", "attendeeAtTagText", "", "attendeeCount", "", "sourceName", "sourceId", "bindExternalLabel", "externalLabel", "Landroid/widget/TextView;", "isCrossExternal", "", "isCustomer", "bindOptionalLabel", "optionalLabelTv", "isOptional", "bindTimeConflict", "timeConflictTv", "conflictType", "Lcom/ss/android/lark/calendar/impl/features/messagecard/entity/content/CalendarInternalContent$ConflictType;", "conflictTime", "", "openDetail", "Landroid/view/View$OnClickListener;", "getEventSummary", "contentSummary", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.messagecard.a.a */
public final class CalendarCardBinderCommonHelper {

    /* renamed from: a */
    public static final CalendarCardBinderCommonHelper f82265a = new CalendarCardBinderCommonHelper();

    private CalendarCardBinderCommonHelper() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final String m122627a(String str) {
        boolean z;
        String str2 = str;
        if (str2 == null || str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return str;
        }
        String b = C32634ae.m125182b(R.string.Calendar_Common_NoTitle);
        Intrinsics.checkExpressionValueIsNotNull(b, "ResUtil.getString(R.stri….Calendar_Common_NoTitle)");
        return b;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "content", "Landroid/text/SpannableStringBuilder;", "kotlin.jvm.PlatformType", "onSetTailSpan"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.messagecard.a.a$a */
    static final class C32177a implements LinkEmojiTextView.AbstractC58530o {

        /* renamed from: a */
        final /* synthetic */ String f82266a;

        /* renamed from: b */
        final /* synthetic */ Context f82267b;

        C32177a(String str, Context context) {
            this.f82266a = str;
            this.f82267b = context;
        }

        @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58530o
        /* renamed from: a */
        public final void mo117505a(SpannableStringBuilder spannableStringBuilder) {
            if (spannableStringBuilder != null) {
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) this.f82266a);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(UIUtils.getColor(this.f82267b, R.color.text_title)), length, this.f82266a.length() + length, 18);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J \u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/calendar/impl/features/messagecard/helper/CalendarCardBinderCommonHelper$bindAttendeeInfo$2", "Lcom/ss/android/lark/calendar/impl/utils/debounce/DebouncingIAtStringClickListener;", "doAtClick", "", "view", "Landroid/view/View;", "text", "", "userId", "onAtLongClick", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.messagecard.a.a$b */
    public static final class C32178b extends AbstractC32627c {

        /* renamed from: a */
        final /* synthetic */ String f82268a;

        /* renamed from: b */
        final /* synthetic */ String f82269b;

        @Override // com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView.AbstractC58521f
        /* renamed from: b */
        public boolean mo117507b(View view, String str, String str2) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(str, "text");
            Intrinsics.checkParameterIsNotNull(str2, "userId");
            return false;
        }

        C32178b(String str, String str2) {
            this.f82268a = str;
            this.f82269b = str2;
        }

        @Override // com.ss.android.lark.calendar.impl.utils.p1577a.AbstractC32627c
        /* renamed from: a */
        public void mo117506a(View view, String str, String str2) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(str, "text");
            Intrinsics.checkParameterIsNotNull(str2, "userId");
            if (!Intrinsics.areEqual("bot_group_none_id", str2)) {
                C30022a.f74882a.oldModuleDependency().mo108285a(view.getContext(), str2, this.f82268a, this.f82269b);
            }
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m122630a(TextView textView, boolean z) {
        int i;
        Intrinsics.checkParameterIsNotNull(textView, "optionalLabelTv");
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m122631a(TextView textView, boolean z, boolean z2) {
        int i;
        Intrinsics.checkParameterIsNotNull(textView, "externalLabel");
        if (!z || z2) {
            i = 8;
        } else {
            i = 0;
        }
        textView.setVisibility(i);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m122629a(TextView textView, CalendarInternalContent.ConflictType conflictType, long j, View.OnClickListener onClickListener) {
        Intrinsics.checkParameterIsNotNull(textView, "timeConflictTv");
        if (conflictType != null) {
            int i = C32181b.f82290a[conflictType.ordinal()];
            if (i == 1) {
                textView.setText(R.string.Calendar_Detail_Conflict);
                textView.setVisibility(0);
                if (onClickListener != null) {
                    textView.setOnClickListener(onClickListener);
                    return;
                }
                return;
            } else if (i == 2) {
                String a = C30022a.f74882a.utilsDependency().mo108195a(R.string.Calendar_Detail_ConflictRecurring, "date", C32646c.m125246a(j));
                if (TextUtils.isEmpty(a)) {
                    textView.setText(R.string.Calendar_Bot_ConflictTipIn30Days);
                } else {
                    textView.setText(a);
                }
                textView.setVisibility(0);
                if (onClickListener != null) {
                    textView.setOnClickListener(onClickListener);
                    return;
                }
                return;
            }
        }
        textView.setVisibility(8);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m122628a(Context context, ViewGroup viewGroup, LinkEmojiTextView linkEmojiTextView, String str, int i, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(viewGroup, "attendeeContainer");
        Intrinsics.checkParameterIsNotNull(linkEmojiTextView, "attendeesTextView");
        if (TextUtils.isEmpty(str)) {
            viewGroup.setVisibility(8);
            return;
        }
        viewGroup.setVisibility(0);
        String str4 = aj.f83747a;
        linkEmojiTextView.setTailContent(str4);
        linkEmojiTextView.setOnSetTailSpanListener(new C32177a(str4, context));
        linkEmojiTextView.setUnClickGroupBgColor(R.color.lkui_transparent);
        linkEmojiTextView.setUnClickGroupTextColor(R.color.text_title);
        linkEmojiTextView.setDefaultAtUserColor(UIUtils.getColor(context, R.color.text_link_normal));
        linkEmojiTextView.setMaxLines(2);
        linkEmojiTextView.setUrlTextColor(UIUtils.getColor(context, R.color.text_link_normal));
        AbstractC30054s a = CalendarCardHelper.f82294a.mo117525a();
        Intrinsics.checkExpressionValueIsNotNull(a, "CalendarCardHelper.loginDependency");
        linkEmojiTextView.setCurrentUserId(a.mo108269a());
        linkEmojiTextView.setUnclickGroupId("bot_group_none_id");
        linkEmojiTextView.setShowTail(true);
        linkEmojiTextView.mo198363a((RecogniseSpansResult) null, str, false);
        linkEmojiTextView.setAtStringClickListner(new C32178b(str2, str3));
    }
}
