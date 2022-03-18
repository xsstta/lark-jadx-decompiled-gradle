package com.ss.android.lark.widget.photo_picker.p2951f;

import android.animation.Animator;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.framework.utils.UIUtils;
import com.ss.android.lark.widget.photo_picker.animation.AbstractC58594b;
import com.ss.android.lark.widget.photo_picker.animation.BaseData;
import com.ss.android.lark.widget.photo_picker.animation.C58574a;
import com.ss.android.lark.widget.photo_picker.animation.activity_transition.ActivityTransitionLauncher;
import com.ss.android.lark.widget.photo_picker.animation.p2944a.C58582b;
import com.ss.android.lark.widget.photo_picker.gallery.ImagePagerFragment;
import java.util.ArrayList;

/* renamed from: com.ss.android.lark.widget.photo_picker.f.a */
public class C58648a {

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.widget.photo_picker.f.a$1 */
    public static /* synthetic */ class C586491 {

        /* renamed from: a */
        static final /* synthetic */ int[] f144831a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.ss.android.lark.widget.photo_picker.animation.BaseData$AnimationType[] r0 = com.ss.android.lark.widget.photo_picker.animation.BaseData.AnimationType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.widget.photo_picker.p2951f.C58648a.C586491.f144831a = r0
                com.ss.android.lark.widget.photo_picker.animation.BaseData$AnimationType r1 = com.ss.android.lark.widget.photo_picker.animation.BaseData.AnimationType.ALPHA_ANIMATION     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.widget.photo_picker.p2951f.C58648a.C586491.f144831a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.widget.photo_picker.animation.BaseData$AnimationType r1 = com.ss.android.lark.widget.photo_picker.animation.BaseData.AnimationType.TRANSLATE_ANIMATION     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.widget.photo_picker.p2951f.C58648a.C586491.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static AbstractC58594b m227464a(ImagePagerFragment imagePagerFragment, Intent intent, Bundle bundle) {
        return m227465a(imagePagerFragment, intent, bundle, null);
    }

    /* renamed from: a */
    public static AbstractC58594b m227465a(ImagePagerFragment imagePagerFragment, Intent intent, Bundle bundle, Animator.AnimatorListener animatorListener) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(imagePagerFragment.mo198975j());
        return C58574a.m227200a(imagePagerFragment.getContext().getApplicationContext()).mo198573a(intent).mo198574a(imagePagerFragment.mo198975j()).mo198575a(arrayList).mo198572a(animatorListener).mo198576a(bundle);
    }

    /* renamed from: a */
    public static void m227466a(Activity activity, Intent intent, BaseData.AnimationType animationType, View view, ActivityTransitionLauncher.LocationInfo locationInfo) {
        Bundle bundle;
        int[] iArr = {DeviceUtils.getScreenWidth(activity), DeviceUtils.getScreenHeight(activity) - UIUtils.dp2px(activity, 64.0f)};
        if (C586491.f144831a[animationType.ordinal()] != 1) {
            bundle = ActivityTransitionLauncher.m227224a(activity).mo198591a(view).mo198593a(iArr).mo198592a(locationInfo).mo198590a();
        } else {
            bundle = C58582b.m227217a(activity).mo198584a(BitmapDescriptorFactory.HUE_RED).mo198585b(1.0f).mo198583a();
        }
        intent.putExtras(bundle);
    }
}
