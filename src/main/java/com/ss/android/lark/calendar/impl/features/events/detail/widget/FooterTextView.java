package com.ss.android.lark.calendar.impl.features.events.detail.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\fH\u0002J\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tJ\u0006\u0010\u000f\u001a\u00020\fJ\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\f¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/widget/FooterTextView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "init", "", "setFootTextColor", "colorId", "setJoinText", "setReplyText", "statusText", "", "setUnJoinableText", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class FooterTextView extends LinearLayout {

    /* renamed from: a */
    private HashMap f79737a;

    /* renamed from: a */
    public View mo114172a(int i) {
        if (this.f79737a == null) {
            this.f79737a = new HashMap();
        }
        View view = (View) this.f79737a.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f79737a.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: c */
    private final void m118392c() {
        LayoutInflater.from(getContext()).inflate(R.layout.view_calendar_detail_join_footer, this);
    }

    /* renamed from: a */
    public final void mo114173a() {
        TextView textView = (TextView) mo114172a(R.id.replyText);
        Intrinsics.checkExpressionValueIsNotNull(textView, "replyText");
        textView.setVisibility(0);
        ((TextView) mo114172a(R.id.replyText)).setText(R.string.Calendar_Share_Join);
    }

    /* renamed from: b */
    public final void mo114174b() {
        TextView textView = (TextView) mo114172a(R.id.replyText);
        Intrinsics.checkExpressionValueIsNotNull(textView, "replyText");
        textView.setVisibility(0);
        ((TextView) mo114172a(R.id.replyText)).setText(R.string.Calendar_Share_UnableToJoinEvent);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FooterTextView(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        m118392c();
    }

    public final void setFootTextColor(int i) {
        ((TextView) mo114172a(R.id.replyText)).setTextColor(C32634ae.m125178a(i));
    }

    public final void setReplyText(String str) {
        Intrinsics.checkParameterIsNotNull(str, "statusText");
        TextView textView = (TextView) mo114172a(R.id.replyText);
        Intrinsics.checkExpressionValueIsNotNull(textView, "replyText");
        textView.setVisibility(0);
        TextView textView2 = (TextView) mo114172a(R.id.replyText);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "replyText");
        textView2.setText(str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FooterTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        m118392c();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FooterTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        m118392c();
    }
}
