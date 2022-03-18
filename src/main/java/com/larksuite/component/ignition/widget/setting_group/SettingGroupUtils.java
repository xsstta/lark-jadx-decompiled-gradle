package com.larksuite.component.ignition.widget.setting_group;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.universe_design.util.UDDimenUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tJ\"\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fJ\f\u0010\u000e\u001a\u00020\u0004*\u00020\u0005H\u0002J\u0016\u0010\u000f\u001a\u00020\u0004*\u00020\u00052\b\b\u0001\u0010\u0010\u001a\u00020\u0011H\u0002J\u0016\u0010\u0012\u001a\u00020\u0004*\u00020\u00052\b\b\u0001\u0010\u0010\u001a\u00020\u0011H\u0002J\u0016\u0010\u0013\u001a\u00020\u0004*\u00020\u00052\b\b\u0001\u0010\u0010\u001a\u00020\u0011H\u0002¨\u0006\u0014"}, d2 = {"Lcom/larksuite/component/ignition/widget/setting_group/SettingGroupUtils;", "", "()V", "adjustBackgroundRadius", "", "Landroid/graphics/drawable/GradientDrawable;", "context", "Landroid/content/Context;", "isFirst", "", "isLast", "position", "", "itemCount", "hideRadius", "showAllRadius", "radius", "", "showBottomRadius", "showTopRadius", "ignition-widget-settinggroup_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.larksuite.component.ignition.widget.setting_group.e */
public final class SettingGroupUtils {

    /* renamed from: a */
    public static final SettingGroupUtils f60020a = new SettingGroupUtils();

    private SettingGroupUtils() {
    }

    /* renamed from: a */
    private final void m88819a(GradientDrawable gradientDrawable) {
        gradientDrawable.setCornerRadii(new float[]{BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED});
    }

    /* renamed from: c */
    private final void m88822c(GradientDrawable gradientDrawable, float f) {
        gradientDrawable.setCornerRadii(new float[]{f, f, f, f, f, f, f, f});
    }

    /* renamed from: a */
    private final void m88820a(GradientDrawable gradientDrawable, float f) {
        gradientDrawable.setCornerRadii(new float[]{f, f, f, f, 0.0f, 0.0f, 0.0f, 0.0f});
    }

    /* renamed from: b */
    private final void m88821b(GradientDrawable gradientDrawable, float f) {
        gradientDrawable.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, f, f, f, f});
    }

    /* renamed from: a */
    public final void mo87061a(GradientDrawable gradientDrawable, Context context, int i, int i2) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(gradientDrawable, "$this$adjustBackgroundRadius");
        Intrinsics.checkParameterIsNotNull(context, "context");
        boolean z2 = false;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (i == i2 - 1) {
            z2 = true;
        }
        mo87062a(gradientDrawable, context, z, z2);
    }

    /* renamed from: a */
    public final void mo87062a(GradientDrawable gradientDrawable, Context context, boolean z, boolean z2) {
        Intrinsics.checkParameterIsNotNull(gradientDrawable, "$this$adjustBackgroundRadius");
        Intrinsics.checkParameterIsNotNull(context, "context");
        float a = UDDimenUtils.m93308a(context, 10);
        if (z && z2) {
            m88822c(gradientDrawable, a);
        } else if (z) {
            m88820a(gradientDrawable, a);
        } else if (z2) {
            m88821b(gradientDrawable, a);
        } else {
            m88819a(gradientDrawable);
        }
    }
}
