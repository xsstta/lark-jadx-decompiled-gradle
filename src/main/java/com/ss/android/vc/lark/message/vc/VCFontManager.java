package com.ss.android.vc.lark.message.vc;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import com.huawei.hms.android.HwBuildEx;
import com.larksuite.component.ui.display.manager.LKUIDisplayManager;
import com.larksuite.component.ui.display.manager.LarkFont;
import com.larksuite.component.ui.display.manager.ZoomLevel;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0018\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007¨\u0006\u0011"}, d2 = {"Lcom/ss/android/vc/lark/message/vc/VCFontManager;", "", "()V", "dp2px", "", "context", "Landroid/content/Context;", "dp", "getLineHeight", "larkHeight", "Lcom/ss/android/vc/lark/message/vc/VCLarkFontHeight;", "zoomLevel", "Lcom/larksuite/component/ui/display/manager/ZoomLevel;", "getVCFontHeight", "larkFont", "Lcom/larksuite/component/ui/display/manager/LarkFont;", "toLineHeight", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.lark.message.vc.a */
public final class VCFontManager {

    /* renamed from: a */
    public static final VCFontManager f153201a = new VCFontManager();

    private VCFontManager() {
    }

    /* renamed from: a */
    private final VCLarkFontHeight m237788a(LarkFont larkFont) {
        switch (C61149b.f153203b[larkFont.ordinal()]) {
            case 1:
                return VCLarkFontHeight.TITLE0;
            case 2:
                return VCLarkFontHeight.TITLE1;
            case 3:
                return VCLarkFontHeight.TITLE2;
            case 4:
                return VCLarkFontHeight.TITLE3;
            case 5:
                return VCLarkFontHeight.TITLE4;
            case 6:
                return VCLarkFontHeight.HEADLINE;
            case 7:
                return VCLarkFontHeight.BODY0;
            case 8:
                return VCLarkFontHeight.BODY1;
            case 9:
                return VCLarkFontHeight.BODY2;
            case 10:
                return VCLarkFontHeight.CAPTION0;
            case 11:
                return VCLarkFontHeight.CAPTION1;
            case HwBuildEx.VersionCodes.EMUI_5_1:
                return VCLarkFontHeight.CAPTION2;
            case 13:
                return VCLarkFontHeight.CAPTION3;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: a */
    private final float m237785a(Context context, float f) {
        Resources resources = context.getResources();
        Intrinsics.checkExpressionValueIsNotNull(resources, "context.resources");
        return TypedValue.applyDimension(1, f, resources.getDisplayMetrics());
    }

    @JvmStatic
    /* renamed from: a */
    public static final float m237786a(Context context, LarkFont larkFont) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(larkFont, "larkFont");
        VCFontManager aVar = f153201a;
        return aVar.m237785a(context, aVar.m237787a(aVar.m237788a(larkFont), LKUIDisplayManager.m91870a()));
    }

    /* renamed from: a */
    private final float m237787a(VCLarkFontHeight vCLarkFontHeight, ZoomLevel zoomLevel) {
        int i;
        switch (C61149b.f153202a[zoomLevel.ordinal()]) {
            case 1:
                i = vCLarkFontHeight.getSmall();
                break;
            case 2:
                i = vCLarkFontHeight.getNormal();
                break;
            case 3:
                i = vCLarkFontHeight.getLarge1();
                break;
            case 4:
                i = vCLarkFontHeight.getLarge2();
                break;
            case 5:
                i = vCLarkFontHeight.getLarge3();
                break;
            case 6:
                i = vCLarkFontHeight.getLarge4();
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return (float) i;
    }
}
