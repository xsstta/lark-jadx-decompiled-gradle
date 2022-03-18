package com.ss.android.lark.calendar.impl.features.calendars.share.fragment;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.bytedance.lark.pb.calendar.v1.Calendar;
import com.bytedance.lark.pb.calendar.v1.CalendarMember;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendars.p1446a.C30237a;
import com.ss.android.lark.calendar.impl.features.calendars.share.CalendarShareViewModel;
import com.ss.android.lark.calendar.impl.features.calendars.share.helper.CalendarShareHelper;
import com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment;
import com.ss.android.lark.calendar.impl.framework.hitpoint.p1572c.C32502i;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.api.IRequestCreator;
import com.ss.android.lark.image.entity.AvatarImage;
import com.ss.android.lark.image.entity.C38824b;
import com.ss.android.lark.thirdshare.base.C55680a;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.utils.StatusBarUtil;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import java.io.File;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 62\u00020\u0001:\u000267B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\"\u001a\u00020\u000eH\u0002J\b\u0010#\u001a\u00020$H\u0002J&\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\u001a\u0010-\u001a\u00020$2\u0006\u0010.\u001a\u00020&2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\b\u0010/\u001a\u00020$H\u0002J\b\u00100\u001a\u00020$H\u0002J\b\u00101\u001a\u00020$H\u0002J\u0006\u00102\u001a\u00020$J\b\u00103\u001a\u00020$H\u0002J\u0010\u00104\u001a\u00020$2\u0006\u00105\u001a\u00020\u0004H\u0002R\u0014\u0010\u0003\u001a\u00020\u00048BX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048BX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0016\u0010\t\u001a\u0004\u0018\u00010\n8BX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u00048BX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048BX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0006R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0006R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001dR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001f8BX\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u00068"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/share/fragment/CalendarShareQrCodeFragment;", "Lcom/ss/android/lark/calendar/impl/framework/components/CalendarBaseFragment;", "()V", "calendarDescription", "", "getCalendarDescription", "()Ljava/lang/String;", "calendarId", "getCalendarId", "calendarOwner", "Lcom/bytedance/lark/pb/calendar/v1/CalendarMember;", "getCalendarOwner", "()Lcom/bytedance/lark/pb/calendar/v1/CalendarMember;", "calendarQrCode", "Landroid/graphics/Bitmap;", "calendarShareUrl", "getCalendarShareUrl", "calendarTitle", "getCalendarTitle", "callback", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/fragment/CalendarShareQrCodeFragment$ShareQrCodeCallback;", "coverKey", "getCoverKey", "coverSize", "", "getCoverSize", "()I", "isPrimary", "", "()Z", "viewModel", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/CalendarShareViewModel;", "getViewModel", "()Lcom/ss/android/lark/calendar/impl/features/calendars/share/CalendarShareViewModel;", "getCalendarShareBitmap", "initView", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "refreshQrCode", "refreshView", "saveImageToAlbum", "setData", "updateCalendarAvatar", "updateUrlQrCode", "calendarUrl", "Companion", "ShareQrCodeCallback", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.b.h */
public final class CalendarShareQrCodeFragment extends CalendarBaseFragment {

    /* renamed from: c */
    public static final Companion f76306c = new Companion(null);

    /* renamed from: a */
    public ShareQrCodeCallback f76307a;

    /* renamed from: b */
    public Bitmap f76308b;

    /* renamed from: d */
    private final int f76309d = UIHelper.dp2px(44.0f);

    /* renamed from: e */
    private HashMap f76310e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/share/fragment/CalendarShareQrCodeFragment$ShareQrCodeCallback;", "", "onBackPressed", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.b.h$b */
    public interface ShareQrCodeCallback {
        /* renamed from: a */
        void mo109893a();
    }

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    /* renamed from: a */
    public View mo109250a(int i) {
        if (this.f76310e == null) {
            this.f76310e = new HashMap();
        }
        View view = (View) this.f76310e.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f76310e.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    /* renamed from: a */
    public void mo109251a() {
        HashMap hashMap = this.f76310e;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment, com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo109251a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/share/fragment/CalendarShareQrCodeFragment$Companion;", "", "()V", "QR_CODE_CALENDAR_AVATAR_SIZE", "", "newInstance", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/fragment/CalendarShareQrCodeFragment;", "callback", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/fragment/CalendarShareQrCodeFragment$ShareQrCodeCallback;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.b.h$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final CalendarShareQrCodeFragment mo110012a(ShareQrCodeCallback bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "callback");
            CalendarShareQrCodeFragment hVar = new CalendarShareQrCodeFragment();
            hVar.f76307a = bVar;
            return hVar;
        }
    }

    /* renamed from: f */
    public final void mo110010f() {
        m113327n();
    }

    /* renamed from: h */
    private final String m113321h() {
        String calendarDescription;
        CalendarShareViewModel k = m113324k();
        if (k == null || (calendarDescription = k.getCalendarDescription()) == null) {
            return "";
        }
        return calendarDescription;
    }

    /* renamed from: i */
    private final String m113322i() {
        String calendarTitle;
        CalendarShareViewModel k = m113324k();
        if (k == null || (calendarTitle = k.getCalendarTitle()) == null) {
            return "";
        }
        return calendarTitle;
    }

    /* renamed from: j */
    private final CalendarMember m113323j() {
        CalendarShareViewModel k = m113324k();
        if (k != null) {
            return k.getCalendarOwnerMember();
        }
        return null;
    }

    /* renamed from: k */
    private final CalendarShareViewModel m113324k() {
        return CalendarShareHelper.f76321a.mo110028a(getActivity());
    }

    /* renamed from: b */
    public final String mo110006b() {
        String calendarUrl;
        CalendarShareViewModel k = m113324k();
        if (k == null || (calendarUrl = k.getCalendarUrl()) == null) {
            return "";
        }
        return calendarUrl;
    }

    /* renamed from: c */
    public final String mo110007c() {
        String calendarId;
        CalendarShareViewModel k = m113324k();
        if (k == null || (calendarId = k.getCalendarId()) == null) {
            return "";
        }
        return calendarId;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.b.h$e */
    public static final class RunnableC30499e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CalendarShareQrCodeFragment f76313a;

        RunnableC30499e(CalendarShareQrCodeFragment hVar) {
            this.f76313a = hVar;
        }

        public final void run() {
            CalendarShareQrCodeFragment hVar = this.f76313a;
            hVar.mo110005a(hVar.mo110006b());
            UICallbackExecutor.execute(new Runnable(this) {
                /* class com.ss.android.lark.calendar.impl.features.calendars.share.fragment.CalendarShareQrCodeFragment.RunnableC30499e.RunnableC305001 */

                /* renamed from: a */
                final /* synthetic */ RunnableC30499e f76314a;

                {
                    this.f76314a = r1;
                }

                public final void run() {
                    Resources resources;
                    Bitmap bitmap = this.f76314a.f76313a.f76308b;
                    if (bitmap != null) {
                        ImageView imageView = (ImageView) this.f76314a.f76313a.mo109250a(R.id.qrCodeIv);
                        Context context = this.f76314a.f76313a.getContext();
                        if (context != null) {
                            resources = context.getResources();
                        } else {
                            resources = null;
                        }
                        imageView.setImageDrawable(new BitmapDrawable(resources, bitmap));
                    }
                }
            });
        }
    }

    /* renamed from: l */
    private final void m113325l() {
        CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
        coreThreadPool.getCachedThreadPool().execute(new RunnableC30499e(this));
    }

    /* renamed from: d */
    public final boolean mo110008d() {
        Calendar calendar;
        CalendarShareViewModel k = m113324k();
        if (k == null || (calendar = k.getCalendar()) == null) {
            return false;
        }
        return C30237a.m112295a(calendar);
    }

    /* renamed from: e */
    public final String mo110009e() {
        Calendar calendar;
        CalendarShareViewModel k = m113324k();
        if (k == null || (calendar = k.getCalendar()) == null) {
            return null;
        }
        return C30237a.m112308h(calendar);
    }

    /* renamed from: g */
    public final void mo110011g() {
        C55680a.m215698a(getContext(), m113329p(), new C30501f(this));
    }

    /* renamed from: p */
    private final Bitmap m113329p() {
        CardView cardView = (CardView) mo109250a(R.id.qrCodeCardView);
        Intrinsics.checkExpressionValueIsNotNull(cardView, "qrCodeCardView");
        cardView.setDrawingCacheEnabled(true);
        ((CardView) mo109250a(R.id.qrCodeCardView)).buildDrawingCache();
        CardView cardView2 = (CardView) mo109250a(R.id.qrCodeCardView);
        Intrinsics.checkExpressionValueIsNotNull(cardView2, "qrCodeCardView");
        Bitmap createBitmap = Bitmap.createBitmap(cardView2.getDrawingCache());
        CardView cardView3 = (CardView) mo109250a(R.id.qrCodeCardView);
        Intrinsics.checkExpressionValueIsNotNull(cardView3, "qrCodeCardView");
        cardView3.setDrawingCacheEnabled(false);
        Intrinsics.checkExpressionValueIsNotNull(createBitmap, "calendarShareBitmap");
        return createBitmap;
    }

    /* renamed from: m */
    private final void m113326m() {
        TextPaint paint;
        RelativeLayout relativeLayout = (RelativeLayout) mo109250a(R.id.qrCodeRootView);
        int paddingLeft = relativeLayout.getPaddingLeft();
        RelativeLayout relativeLayout2 = (RelativeLayout) mo109250a(R.id.qrCodeRootView);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout2, "qrCodeRootView");
        relativeLayout.setPadding(paddingLeft, StatusBarUtil.getStatusBarHeight(relativeLayout2.getContext()), relativeLayout.getPaddingRight(), relativeLayout.getPaddingBottom());
        ((CommonTitleBar) mo109250a(R.id.titleBar)).setLeftClickListener(new View$OnClickListenerC30497c(this));
        ((TextView) mo109250a(R.id.saveToAlbumTv)).setOnClickListener(new View$OnClickListenerC30498d(this));
        TextView textView = (TextView) mo109250a(R.id.qrCodeShareTipText);
        if (textView != null && (paint = textView.getPaint()) != null) {
            paint.setFakeBoldText(true);
        }
    }

    /* renamed from: n */
    private final void m113327n() {
        boolean z;
        TextView textView = (TextView) mo109250a(R.id.calendarNameTv);
        Intrinsics.checkExpressionValueIsNotNull(textView, "calendarNameTv");
        textView.setText(m113322i());
        if (m113321h().length() == 0) {
            z = true;
        } else {
            z = false;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        if (z) {
            TextView textView2 = (TextView) mo109250a(R.id.calendarDescriptionTv);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "calendarDescriptionTv");
            textView2.setVisibility(8);
            TextView textView3 = (TextView) mo109250a(R.id.calendarNameTv);
            Intrinsics.checkExpressionValueIsNotNull(textView3, "calendarNameTv");
            ViewGroup.LayoutParams layoutParams = textView3.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = layoutParams;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) marginLayoutParams;
            if (marginLayoutParams2 != null) {
                marginLayoutParams2.topMargin = UIHelper.dp2px(27.0f);
            }
        } else {
            TextView textView4 = (TextView) mo109250a(R.id.calendarDescriptionTv);
            Intrinsics.checkExpressionValueIsNotNull(textView4, "calendarDescriptionTv");
            textView4.setVisibility(0);
            TextView textView5 = (TextView) mo109250a(R.id.calendarDescriptionTv);
            Intrinsics.checkExpressionValueIsNotNull(textView5, "calendarDescriptionTv");
            textView5.setText(m113321h());
            TextView textView6 = (TextView) mo109250a(R.id.calendarNameTv);
            Intrinsics.checkExpressionValueIsNotNull(textView6, "calendarNameTv");
            ViewGroup.LayoutParams layoutParams2 = textView6.getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = layoutParams2;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams3 = marginLayoutParams;
            if (marginLayoutParams3 != null) {
                marginLayoutParams3.topMargin = UIHelper.dp2px(17.0f);
            }
        }
        m113325l();
        m113328o();
    }

    /* renamed from: o */
    private final void m113328o() {
        CalendarMember j;
        String str;
        boolean z;
        String str2;
        String str3;
        String str4;
        Context context = getContext();
        if (context != null) {
            Intrinsics.checkExpressionValueIsNotNull(context, "context ?: return");
            String e = mo110009e();
            boolean z2 = false;
            if (!(!mo110008d() || (j = m113323j()) == null || (str = j.avatar_key) == null)) {
                if (str.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    CalendarMember j2 = m113323j();
                    String str5 = null;
                    if (j2 != null) {
                        str2 = j2.avatar_key;
                    } else {
                        str2 = null;
                    }
                    CalendarMember j3 = m113323j();
                    if (j3 != null) {
                        str3 = j3.user_id;
                    } else {
                        str3 = null;
                    }
                    int i = this.f76309d;
                    ImageLoader.with(context).load(AvatarImage.Builder.obtain(str2, str3, i, i).build()).placeholder(R.drawable.calendar_ic_calendar_default_cover).error(R.drawable.calendar_ic_calendar_default_cover).into((ImageView) mo109250a(R.id.calendarIv));
                    PhotoItem type = new PhotoItem().setType(4);
                    CalendarMember j4 = m113323j();
                    if (j4 != null) {
                        str4 = j4.user_id;
                    } else {
                        str4 = null;
                    }
                    PhotoItem entityId = type.setEntityId(str4);
                    Intrinsics.checkExpressionValueIsNotNull(entityId, "PhotoItem().setType(Phot…d(calendarOwner?.user_id)");
                    CalendarMember j5 = m113323j();
                    if (j5 != null) {
                        str5 = j5.avatar_key;
                    }
                    entityId.setImageKey(str5);
                    return;
                }
            }
            if (e != null) {
                if (e.length() > 0) {
                    z2 = true;
                }
                if (z2) {
                    IRequestCreator error = ImageLoader.with(context).load(new C38824b(e)).placeholder(R.drawable.calendar_ic_calendar_default_cover).error(R.drawable.calendar_ic_calendar_default_cover);
                    int i2 = this.f76309d;
                    error.override(i2, i2).into((ImageView) mo109250a(R.id.calendarIv));
                    PhotoItem type2 = new PhotoItem().setType(3);
                    Intrinsics.checkExpressionValueIsNotNull(type2, "PhotoItem().setType(PhotoItem.ENCRYPT_IMAGE)");
                    type2.setImageKey(e);
                    return;
                }
            }
            ((ImageView) mo109250a(R.id.calendarIv)).setImageResource(R.drawable.calendar_ic_calendar_default_cover);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0012\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/share/fragment/CalendarShareQrCodeFragment$saveImageToAlbum$callback$1", "Lcom/ss/android/lark/thirdshare/base/ThirdShareBaseUtils$SaveImage2AlbumCallback;", "noNoPermission", "", "onSaveFailed", "msg", "", "onSaveSuccess", "file", "Ljava/io/File;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.b.h$f */
    public static final class C30501f implements C55680a.AbstractC55692a {

        /* renamed from: a */
        final /* synthetic */ CalendarShareQrCodeFragment f76315a;

        @Override // com.ss.android.lark.thirdshare.base.C55680a.AbstractC55692a
        public void noNoPermission() {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30501f(CalendarShareQrCodeFragment hVar) {
            this.f76315a = hVar;
        }

        @Override // com.ss.android.lark.thirdshare.base.C55680a.AbstractC55693b
        public void onSaveFailed(String str) {
            Context context = this.f76315a.getContext();
            if (context != null) {
                Drawable d = C32634ae.m125184d(R.drawable.ud_icon_more_close_outlined);
                d.setTint(C32634ae.m125178a(R.color.static_white));
                Intrinsics.checkExpressionValueIsNotNull(context, "it");
                UDToast.Builder aVar = new UDToast.Builder(context);
                Intrinsics.checkExpressionValueIsNotNull(d, "closeDrawable");
                aVar.mo91641a(d).mo91637a(R.string.Calendar_Share_UnableToSaveToast).mo91655j().show();
            }
        }

        @Override // com.ss.android.lark.thirdshare.base.C55680a.AbstractC55693b
        public void onSaveSuccess(File file) {
            Context context = this.f76315a.getContext();
            if (context != null) {
                Intrinsics.checkExpressionValueIsNotNull(context, "it");
                new UDToast.Builder(context).mo91641a(UDIconUtils.getIconDrawable(context, (int) R.drawable.ud_icon_yes_outlined, UDColorUtils.getColor(context, R.color.static_white))).mo91637a(R.string.Calendar_Share_SavedToast).mo91655j().show();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.b.h$c */
    public static final class View$OnClickListenerC30497c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CalendarShareQrCodeFragment f76311a;

        View$OnClickListenerC30497c(CalendarShareQrCodeFragment hVar) {
            this.f76311a = hVar;
        }

        public final void onClick(View view) {
            ShareQrCodeCallback bVar = this.f76311a.f76307a;
            if (bVar != null) {
                bVar.mo109893a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.b.h$d */
    public static final class View$OnClickListenerC30498d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CalendarShareQrCodeFragment f76312a;

        View$OnClickListenerC30498d(CalendarShareQrCodeFragment hVar) {
            this.f76312a = hVar;
        }

        public final void onClick(View view) {
            this.f76312a.mo110011g();
            C32502i.m124385d(this.f76312a.mo110007c());
        }
    }

    /* renamed from: a */
    public final void mo110005a(String str) {
        boolean z;
        String str2;
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str2 = str;
        } else {
            str2 = null;
        }
        if (str2 != null) {
            this.f76308b = C30022a.f74882a.qrCodeDependency().mo108170a(str, UIHelper.dp2px(200.0f), UIHelper.dp2px(200.0f), 0);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        if (this.f76307a != null) {
            m113326m();
            m113327n();
            C32502i.m124383c(mo110007c());
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_calendar_share_qrcode_layout, (ViewGroup) null);
    }
}
