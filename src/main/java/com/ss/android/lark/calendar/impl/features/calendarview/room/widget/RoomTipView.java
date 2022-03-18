package com.ss.android.lark.calendar.impl.features.calendarview.room.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\n¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/room/widget/RoomTipView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "showLoadEmpty", "", "showLoadError", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class RoomTipView extends LinearLayout {

    /* renamed from: a */
    private HashMap f78335a;

    public RoomTipView(Context context) {
        this(context, null, 0, 6, null);
    }

    public RoomTipView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public View mo112449a(int i) {
        if (this.f78335a == null) {
            this.f78335a = new HashMap();
        }
        View view = (View) this.f78335a.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f78335a.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: b */
    public final void mo112451b() {
        ((ImageView) mo112449a(R.id.tipIv)).setImageDrawable(UIHelper.getDrawable(R.drawable.illustration_empty_neutral_search_failed));
        TextView textView = (TextView) mo112449a(R.id.tipTxt);
        Intrinsics.checkExpressionValueIsNotNull(textView, "tipTxt");
        textView.setText(UIHelper.getString(R.string.Calendar_MeetingRoom_NoMeetingRoomsEmptyState));
    }

    /* renamed from: a */
    public final void mo112450a() {
        ((ImageView) mo112449a(R.id.tipIv)).setImageDrawable(UIHelper.getDrawable(R.drawable.illustration_empty_negative_load_failed));
        TextView textView = (TextView) mo112449a(R.id.tipTxt);
        Intrinsics.checkExpressionValueIsNotNull(textView, "tipTxt");
        textView.setText(UIHelper.getString(R.string.Calendar_Common_FailedtoLoad2));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RoomTipView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        LayoutInflater.from(context).inflate(R.layout.room_view_tips_layout, this);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RoomTipView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
