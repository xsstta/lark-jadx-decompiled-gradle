package com.ss.android.lark.calendar.impl.features.events.detail.share.handle;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.detail.share.Interface.InnerShareDependency;
import com.ss.android.lark.calendar.impl.features.events.detail.share.entity.ShareType;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.thirdshare.base.C55680a;
import com.ss.android.lark.thirdshare.base.export.ShareEntity;
import com.ss.android.lark.thirdshare.base.export.p2739a.AbstractC55699a;
import com.ss.android.lark.utils.ApiUtils;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/share/handle/SaveImageShareHandler;", "Lcom/ss/android/lark/calendar/impl/features/events/detail/share/handle/BaseShareHandler;", "dependency", "Lcom/ss/android/lark/calendar/impl/features/events/detail/share/Interface/InnerShareDependency;", "(Lcom/ss/android/lark/calendar/impl/features/events/detail/share/Interface/InnerShareDependency;)V", "saveImageWithLarkBuild", "", "context", "Landroid/content/Context;", "bitmap", "Landroid/graphics/Bitmap;", "shareImage", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.share.handle.f */
public final class SaveImageShareHandler extends BaseShareHandler {
    public SaveImageShareHandler() {
        this(null, 1, null);
    }

    public SaveImageShareHandler(InnerShareDependency aVar) {
        super(aVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0012\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/share/handle/SaveImageShareHandler$saveImageWithLarkBuild$callback$1", "Lcom/ss/android/lark/thirdshare/base/ThirdShareBaseUtils$SaveImage2AlbumCallback;", "noNoPermission", "", "onSaveFailed", "msg", "", "onSaveSuccess", "file", "Ljava/io/File;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.share.handle.f$a */
    public static final class C31393a implements C55680a.AbstractC55692a {

        /* renamed from: a */
        final /* synthetic */ Context f79544a;

        @Override // com.ss.android.lark.thirdshare.base.C55680a.AbstractC55692a
        public void noNoPermission() {
        }

        C31393a(Context context) {
            this.f79544a = context;
        }

        @Override // com.ss.android.lark.thirdshare.base.C55680a.AbstractC55693b
        public void onSaveFailed(String str) {
            Drawable d = C32634ae.m125184d(R.drawable.ud_icon_more_close_outlined);
            d.setTint(C32634ae.m125178a(R.color.static_white));
            UDToast.Builder aVar = new UDToast.Builder(this.f79544a);
            Intrinsics.checkExpressionValueIsNotNull(d, "drawable");
            aVar.mo91641a(d).mo91637a(R.string.Calendar_Share_SavedFailed).mo91655j().show();
        }

        @Override // com.ss.android.lark.thirdshare.base.C55680a.AbstractC55693b
        public void onSaveSuccess(File file) {
            Context context = this.f79544a;
            new UDToast.Builder(this.f79544a).mo91641a(UDIconUtils.getIconDrawable(context, (int) R.drawable.ud_icon_yes_outlined, UDColorUtils.getColor(context, R.color.static_white))).mo91637a(R.string.Calendar_Share_AlbumSaved).mo91655j().show();
        }
    }

    /* renamed from: b */
    private final void m118124b(Context context, Bitmap bitmap) {
        C55680a.m215698a(context, bitmap, new C31393a(context));
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.share.handle.BaseShareHandler
    /* renamed from: a */
    public void mo113988a(Context context, Bitmap bitmap) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(bitmap, "bitmap");
        if (C30022a.f74882a.utilsDependency().mo108198b(context)) {
            m118124b(context, bitmap);
            return;
        }
        ShareEntity a = new ShareEntity.C55696a(bitmap).mo189764a(new SaveImageShareHandler$shareImage$shareEntity$1(context)).mo189769a();
        Intrinsics.checkExpressionValueIsNotNull(a, "shareEntity");
        a.setCurActionType(ShareType.SAVE_IMAGE.value2ShareActionType());
        AbstractC55699a aVar = (AbstractC55699a) ApiUtils.getApi(AbstractC55699a.class);
        if (aVar != null) {
            aVar.share(context, a);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SaveImageShareHandler(InnerShareDependency aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : aVar);
    }
}
