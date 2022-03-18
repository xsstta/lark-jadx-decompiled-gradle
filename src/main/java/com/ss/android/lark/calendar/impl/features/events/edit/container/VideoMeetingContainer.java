package com.ss.android.lark.calendar.impl.features.events.edit.container;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.detail.videoUrl.entity.VideoType;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.utils.UIHelper;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ$\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u0010J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/container/VideoMeetingContainer;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "refreshVideoStatus", "", "videoType", "Lcom/ss/android/lark/calendar/impl/features/events/detail/videoUrl/entity/VideoType;", "isEventCreateOrEditable", "", "itemClickListener", "Lkotlin/Function0;", "setContainerUnClickable", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class VideoMeetingContainer extends RelativeLayout {

    /* renamed from: a */
    private HashMap f80160a;

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.container.VideoMeetingContainer$d */
    public static final class View$OnClickListenerC31612d implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC31612d f80164a = new View$OnClickListenerC31612d();

        View$OnClickListenerC31612d() {
        }

        public final void onClick(View view) {
        }
    }

    public VideoMeetingContainer(Context context) {
        this(context, null, 0, 6, null);
    }

    public VideoMeetingContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public View mo114837a(int i) {
        if (this.f80160a == null) {
            this.f80160a = new HashMap();
        }
        View view = (View) this.f80160a.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f80160a.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.container.VideoMeetingContainer$a */
    public static final class View$OnClickListenerC31609a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Function0 f80161a;

        View$OnClickListenerC31609a(Function0 function0) {
            this.f80161a = function0;
        }

        public final void onClick(View view) {
            this.f80161a.invoke();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.container.VideoMeetingContainer$b */
    public static final class View$OnClickListenerC31610b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ VideoMeetingContainer f80162a;

        View$OnClickListenerC31610b(VideoMeetingContainer videoMeetingContainer) {
            this.f80162a = videoMeetingContainer;
        }

        public final void onClick(View view) {
            LKUIToast.show(this.f80162a.getContext(), (int) R.string.Calendar_Edit_CantEditUpgradeToast);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.container.VideoMeetingContainer$c */
    public static final class View$OnClickListenerC31611c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ VideoMeetingContainer f80163a;

        View$OnClickListenerC31611c(VideoMeetingContainer videoMeetingContainer) {
            this.f80163a = videoMeetingContainer;
        }

        public final void onClick(View view) {
            Context context = this.f80163a.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            String b = C32634ae.m125182b(R.string.Calendar_Google_UnableToEditMeetings);
            Intrinsics.checkExpressionValueIsNotNull(b, "ResUtil.getString(R.stri…gle_UnableToEditMeetings)");
            UDToast.show(context, b);
        }
    }

    private final void setContainerUnClickable(VideoType videoType) {
        Drawable mutate;
        ((TextView) mo114837a(R.id.editVideoTypeTv)).setTextColor(C32634ae.m125178a(R.color.text_disable));
        ImageView imageView = (ImageView) mo114837a(R.id.editVideoArrowIv);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "editVideoArrowIv");
        imageView.setVisibility(8);
        ImageView imageView2 = (ImageView) mo114837a(R.id.editVideoIcon);
        Intrinsics.checkExpressionValueIsNotNull(imageView2, "editVideoIcon");
        Drawable background = imageView2.getBackground();
        if (!(background == null || (mutate = background.mutate()) == null)) {
            mutate.setTint(C32634ae.m125178a(R.color.text_disable));
            if (mutate != null) {
                ImageView imageView3 = (ImageView) mo114837a(R.id.editVideoIcon);
                Intrinsics.checkExpressionValueIsNotNull(imageView3, "editVideoIcon");
                imageView3.setBackground(mutate);
            }
        }
        int i = C31613a.f80166b[videoType.ordinal()];
        if (i == 1) {
            setOnClickListener(new View$OnClickListenerC31610b(this));
        } else if (i != 2) {
            setOnClickListener(View$OnClickListenerC31612d.f80164a);
        } else {
            setOnClickListener(new View$OnClickListenerC31611c(this));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VideoMeetingContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        LayoutInflater.from(context).inflate(R.layout.view_event_video_container, (ViewGroup) this, true);
    }

    /* renamed from: a */
    public final void mo114838a(VideoType videoType, boolean z, Function0<Unit> function0) {
        Drawable mutate;
        Intrinsics.checkParameterIsNotNull(videoType, "videoType");
        Intrinsics.checkParameterIsNotNull(function0, "itemClickListener");
        setVisibility(0);
        switch (C31613a.f80165a[videoType.ordinal()]) {
            case 1:
                TextView textView = (TextView) mo114837a(R.id.editVideoTypeTv);
                Intrinsics.checkExpressionValueIsNotNull(textView, "editVideoTypeTv");
                textView.setText(UIHelper.mustacheFormat((int) R.string.Calendar_Edit_FeishuVC));
                TextView textView2 = (TextView) mo114837a(R.id.editVideoStatusTv);
                Intrinsics.checkExpressionValueIsNotNull(textView2, "editVideoStatusTv");
                textView2.setVisibility(0);
                break;
            case 2:
            case 3:
            case 4:
                TextView textView3 = (TextView) mo114837a(R.id.editVideoTypeTv);
                Intrinsics.checkExpressionValueIsNotNull(textView3, "editVideoTypeTv");
                textView3.setText(C32634ae.m125182b(R.string.Calendar_Edit_OtherVC));
                TextView textView4 = (TextView) mo114837a(R.id.editVideoStatusTv);
                Intrinsics.checkExpressionValueIsNotNull(textView4, "editVideoStatusTv");
                textView4.setVisibility(0);
                break;
            case 5:
                TextView textView5 = (TextView) mo114837a(R.id.editVideoTypeTv);
                Intrinsics.checkExpressionValueIsNotNull(textView5, "editVideoTypeTv");
                textView5.setText(C32634ae.m125182b(R.string.Calendar_Edit_OtherVC));
                TextView textView6 = (TextView) mo114837a(R.id.editVideoStatusTv);
                Intrinsics.checkExpressionValueIsNotNull(textView6, "editVideoStatusTv");
                textView6.setVisibility(8);
                break;
            case 6:
                TextView textView7 = (TextView) mo114837a(R.id.editVideoTypeTv);
                Intrinsics.checkExpressionValueIsNotNull(textView7, "editVideoTypeTv");
                textView7.setText(C32634ae.m125182b(R.string.Calendar_Edit_AddVC));
                TextView textView8 = (TextView) mo114837a(R.id.editVideoStatusTv);
                Intrinsics.checkExpressionValueIsNotNull(textView8, "editVideoStatusTv");
                textView8.setVisibility(8);
                break;
        }
        if (!z || !(videoType == VideoType.VCHAT || videoType == VideoType.OTHER || videoType == VideoType.NO_VIDEO_MEETING)) {
            setContainerUnClickable(videoType);
            return;
        }
        ((TextView) mo114837a(R.id.editVideoTypeTv)).setTextColor(C32634ae.m125178a(R.color.text_title));
        ImageView imageView = (ImageView) mo114837a(R.id.editVideoArrowIv);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "editVideoArrowIv");
        imageView.setVisibility(0);
        ImageView imageView2 = (ImageView) mo114837a(R.id.editVideoIcon);
        Intrinsics.checkExpressionValueIsNotNull(imageView2, "editVideoIcon");
        Drawable background = imageView2.getBackground();
        if (!(background == null || (mutate = background.mutate()) == null)) {
            mutate.setTint(C32634ae.m125178a(R.color.text_placeholder));
            if (mutate != null) {
                ImageView imageView3 = (ImageView) mo114837a(R.id.editVideoIcon);
                Intrinsics.checkExpressionValueIsNotNull(imageView3, "editVideoIcon");
                imageView3.setBackground(mutate);
            }
        }
        setOnClickListener(new View$OnClickListenerC31609a(function0));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VideoMeetingContainer(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
