package com.ss.android.lark.calendar.impl.features.calendars.share.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.lark.pb.calendar.v1.CalendarMember;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.joooonho.SelectableRoundedImageView;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendars.editor.helper.CalendarEditorHelper;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.CalendarLoadAvatarUtil;
import com.ss.android.lark.utils.UIHelper;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0007H\u0002J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0007H\u0002J\u0014\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u0016¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/share/widget/CalendarShareAvatarView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "getMemberAvatarView", "Lcom/joooonho/SelectableRoundedImageView;", "curMember", "Lcom/bytedance/lark/pb/calendar/v1/CalendarMember;", "getNumberAvatarView", "Landroid/widget/ImageView;", "extraSize", "getNumberBitmap", "Landroid/graphics/Bitmap;", "bitmapSize", "refreshMemberAvatar", "", "calendarMembers", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class CalendarShareAvatarView extends LinearLayout {
    public CalendarShareAvatarView(Context context) {
        this(context, null, 0, 6, null);
    }

    public CalendarShareAvatarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public final void mo110173a(List<CalendarMember> list) {
        boolean z;
        int i;
        Intrinsics.checkParameterIsNotNull(list, "calendarMembers");
        removeAllViews();
        if (list.size() > 6) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = 5;
        } else {
            i = list.size();
        }
        for (int i2 = 0; i2 < i; i2++) {
            Context context = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            addView(m113441a(context, list.get(i2)));
        }
        if (z) {
            Context context2 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context2, "context");
            addView(m113440a(context2, list.size() - 6));
        }
    }

    /* renamed from: a */
    private final ImageView m113440a(Context context, int i) {
        ImageView imageView = new ImageView(context);
        float f = (float) 32;
        Bitmap a = m113439a(i, UIHelper.dp2px(f));
        int dp2px = UIUtils.dp2px(context, f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(dp2px, dp2px);
        layoutParams.setMargins(0, 0, UIUtils.dp2px(context, 12.0f), 0);
        imageView.setImageBitmap(a);
        imageView.setLayoutParams(layoutParams);
        return imageView;
    }

    /* renamed from: a */
    private final SelectableRoundedImageView m113441a(Context context, CalendarMember calendarMember) {
        SelectableRoundedImageView selectableRoundedImageView = new SelectableRoundedImageView(context);
        selectableRoundedImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        selectableRoundedImageView.mo85893a(5.0f, 5.0f, 5.0f, 5.0f);
        selectableRoundedImageView.setOval(true);
        CalendarLoadAvatarUtil.m125306a(context, selectableRoundedImageView, 32, 32, calendarMember.avatar_key, CalendarEditorHelper.f75910a.mo109491a(calendarMember), null);
        int dp2px = UIUtils.dp2px(context, (float) 32);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(dp2px, dp2px);
        layoutParams.setMargins(0, 0, UIUtils.dp2px(context, 12.0f), 0);
        selectableRoundedImageView.setLayoutParams(layoutParams);
        return selectableRoundedImageView;
    }

    /* renamed from: a */
    private final Bitmap m113439a(int i, int i2) {
        String str;
        if (i < 100) {
            StringBuilder sb = new StringBuilder();
            sb.append('+');
            sb.append(i);
            str = sb.toString();
        } else {
            str = "99+";
        }
        int dp2px = UIHelper.dp2px(14.0f);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setTextSize((float) dp2px);
        paint.setColor(C32634ae.m125178a(R.color.text_title));
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setColor(C32634ae.m125178a(R.color.bg_filler));
        float dp2px2 = (float) UIHelper.dp2px((float) 32);
        Bitmap createBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawOval(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, dp2px2, dp2px2, paint2);
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        float f = (float) 2;
        float f2 = ((dp2px2 / f) + ((fontMetrics.bottom - fontMetrics.top) / f)) - fontMetrics.bottom;
        Rect rect = new Rect();
        paint.getTextBounds(str, 0, str.length(), rect);
        canvas.drawText(str, (dp2px2 - ((float) rect.width())) / f, f2, paint);
        Intrinsics.checkExpressionValueIsNotNull(createBitmap, "bitmapTinted");
        return createBitmap;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CalendarShareAvatarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        setOrientation(0);
        setGravity(16);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CalendarShareAvatarView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
