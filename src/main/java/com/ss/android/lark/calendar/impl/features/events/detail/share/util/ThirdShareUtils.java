package com.ss.android.lark.calendar.impl.features.events.detail.share.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.detail.share.SharePastePanelDialog;
import com.ss.android.lark.calendar.impl.features.events.detail.share.entity.ShareType;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.thirdshare.base.C55680a;
import com.ss.android.lark.thirdshare.base.export.ShareActionType;
import com.ss.android.lark.thirdshare.base.export.ShareEntity;
import com.ss.android.lark.thirdshare.base.export.p2739a.AbstractC55699a;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.UIHelper;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nJ\u001e\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\bJ&\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\b¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/share/util/ThirdShareUtils;", "", "()V", "processCommonH5Share", "", "context", "Landroid/content/Context;", "shareType", "Lcom/ss/android/lark/calendar/impl/features/events/detail/share/entity/ShareType;", "shareTitle", "", "shareContent", "targetUrl", "processCommonImageShare", "imageBitmap", "Landroid/graphics/Bitmap;", "processWXDegradedImageShare", "shareBtnText", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.share.b.f */
public final class ThirdShareUtils {

    /* renamed from: a */
    public static final ThirdShareUtils f79505a = new ThirdShareUtils();

    private ThirdShareUtils() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0012\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/share/util/ThirdShareUtils$processWXDegradedImageShare$1", "Lcom/ss/android/lark/thirdshare/base/ThirdShareBaseUtils$SaveImage2AlbumCallback;", "noNoPermission", "", "onSaveFailed", "msg", "", "onSaveSuccess", "file", "Ljava/io/File;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.share.b.f$a */
    public static final class C31381a implements C55680a.AbstractC55692a {

        /* renamed from: a */
        final /* synthetic */ Context f79506a;

        /* renamed from: b */
        final /* synthetic */ String f79507b;

        /* renamed from: c */
        final /* synthetic */ String f79508c;

        /* renamed from: d */
        final /* synthetic */ ShareType f79509d;

        @Override // com.ss.android.lark.thirdshare.base.C55680a.AbstractC55692a
        public void noNoPermission() {
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.share.b.f$a$a */
        static final class View$OnClickListenerC31382a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C31381a f79510a;

            View$OnClickListenerC31382a(C31381a aVar) {
                this.f79510a = aVar;
            }

            public final void onClick(View view) {
                C55680a.m215717c(this.f79510a.f79507b);
            }
        }

        @Override // com.ss.android.lark.thirdshare.base.C55680a.AbstractC55693b
        public void onSaveFailed(String str) {
            Drawable d = C32634ae.m125184d(R.drawable.ud_icon_more_close_outlined);
            d.setTint(C32634ae.m125178a(R.color.static_white));
            UDToast.Builder aVar = new UDToast.Builder(this.f79506a);
            Intrinsics.checkExpressionValueIsNotNull(d, "drawable");
            aVar.mo91641a(d).mo91637a(R.string.Calendar_Share_SavedFailed).mo91655j().show();
        }

        @Override // com.ss.android.lark.thirdshare.base.C55680a.AbstractC55693b
        public void onSaveSuccess(File file) {
            SharePastePanelDialog.Companion aVar = SharePastePanelDialog.f79530b;
            Context context = this.f79506a;
            String string = UIHelper.getString(R.string.Calendar_Share_AlbumSaved);
            Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.str…alendar_Share_AlbumSaved)");
            aVar.mo113974a(context, string, "", this.f79508c, this.f79509d, new View$OnClickListenerC31382a(this));
        }

        C31381a(Context context, String str, String str2, ShareType shareType) {
            this.f79506a = context;
            this.f79507b = str;
            this.f79508c = str2;
            this.f79509d = shareType;
        }
    }

    /* renamed from: a */
    public final void mo113955a(Context context, Bitmap bitmap, ShareType shareType) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(bitmap, "imageBitmap");
        Intrinsics.checkParameterIsNotNull(shareType, "shareType");
        ShareEntity a = new ShareEntity.C55696a(bitmap).mo189769a();
        Intrinsics.checkExpressionValueIsNotNull(a, "shareEntity");
        a.setCurActionType(shareType.value2ShareActionType());
        AbstractC55699a aVar = (AbstractC55699a) ApiUtils.getApi(AbstractC55699a.class);
        if (aVar != null) {
            aVar.share(context, a);
        }
    }

    /* renamed from: a */
    public final void mo113956a(Context context, Bitmap bitmap, String str, ShareType shareType) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(bitmap, "imageBitmap");
        Intrinsics.checkParameterIsNotNull(str, "shareBtnText");
        Intrinsics.checkParameterIsNotNull(shareType, "shareType");
        ShareActionType value2ShareActionType = shareType.value2ShareActionType();
        String pkgName = value2ShareActionType.getPkgName();
        if (!C55680a.m215714a(value2ShareActionType)) {
            Drawable d = C32634ae.m125184d(R.drawable.ud_icon_more_close_outlined);
            d.setTint(C32634ae.m125178a(R.color.static_white));
            UDToast.Builder aVar = new UDToast.Builder(context);
            Intrinsics.checkExpressionValueIsNotNull(d, "drawable");
            aVar.mo91641a(d).mo91637a(R.string.Calendar_Share_AppNotInstalled).mo91655j().show();
            return;
        }
        C55680a.m215698a(context, bitmap, new C31381a(context, pkgName, str, shareType));
    }

    /* renamed from: a */
    public final void mo113957a(Context context, ShareType shareType, String str, String str2, String str3) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(shareType, "shareType");
        Intrinsics.checkParameterIsNotNull(str, "shareTitle");
        Intrinsics.checkParameterIsNotNull(str2, "shareContent");
        Intrinsics.checkParameterIsNotNull(str3, "targetUrl");
        if (str3.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Drawable d = C32634ae.m125184d(R.drawable.ud_icon_more_close_outlined);
            d.setTint(C32634ae.m125178a(R.color.static_white));
            UDToast.Builder aVar = new UDToast.Builder(context);
            Intrinsics.checkExpressionValueIsNotNull(d, "drawable");
            aVar.mo91641a(d).mo91637a(R.string.Calendar_SubscribeCalendar_OperationFailed).mo91655j().show();
            return;
        }
        ShareActionType value2ShareActionType = shareType.value2ShareActionType();
        if (!C55680a.m215714a(value2ShareActionType)) {
            Drawable d2 = C32634ae.m125184d(R.drawable.ud_icon_more_close_outlined);
            d2.setTint(C32634ae.m125178a(R.color.static_white));
            UDToast.Builder aVar2 = new UDToast.Builder(context);
            Intrinsics.checkExpressionValueIsNotNull(d2, "drawable");
            aVar2.mo91641a(d2).mo91637a(R.string.Calendar_Share_AppNotInstalled).mo91655j().show();
            return;
        }
        ShareEntity a = new ShareEntity.C55696a(str, str2, str3).mo189769a();
        Intrinsics.checkExpressionValueIsNotNull(a, "shareEntity");
        a.setCurActionType(value2ShareActionType);
        AbstractC55699a aVar3 = (AbstractC55699a) ApiUtils.getApi(AbstractC55699a.class);
        if (aVar3 != null) {
            aVar3.share(context, a);
        }
    }
}
