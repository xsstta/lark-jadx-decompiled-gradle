package com.ss.android.lark.widget.photo_picker;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.framework.utils.UIUtils;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.base.DesktopConstants;
import com.ss.android.lark.desktopmode.base.FloatWindowParams;
import com.ss.android.lark.desktopmode.base.StandAloneParam;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.widget.photo_picker.animation.activity_transition.ActivityTransitionLauncher;
import com.ss.android.lark.widget.photo_picker.entity.Photo;
import com.ss.android.lark.widget.photo_picker.p2950e.C58635b;
import java.util.ArrayList;

/* renamed from: com.ss.android.lark.widget.photo_picker.e */
public class C58633e {

    /* renamed from: com.ss.android.lark.widget.photo_picker.e$a */
    public static class C58634a {

        /* renamed from: a */
        private Bundle f144786a = new Bundle();

        /* renamed from: b */
        private View f144787b;

        /* renamed from: a */
        public C58634a mo198690a(View view) {
            this.f144787b = view;
            return this;
        }

        /* renamed from: a */
        public C58634a mo198689a(int i) {
            this.f144786a.putInt("current_item", i);
            return this;
        }

        /* renamed from: b */
        public C58634a mo198695b(int i) {
            this.f144786a.putInt("MAX_COUNT", i);
            return this;
        }

        /* renamed from: c */
        public C58634a mo198698c(int i) {
            this.f144786a.putInt("TOTAL_MAX_COUNT", i);
            return this;
        }

        /* renamed from: d */
        public C58634a mo198700d(int i) {
            this.f144786a.putInt("MEDIA_TYPE", i);
            return this;
        }

        /* renamed from: e */
        public C58634a mo198702e(boolean z) {
            this.f144786a.putBoolean("IS_SEND", z);
            return this;
        }

        /* renamed from: a */
        public Intent mo198688a(Context context) {
            Intent intent = new Intent();
            intent.setClass(context, PhotoPreviewPickerActivity.class);
            intent.putExtras(this.f144786a);
            return intent;
        }

        /* renamed from: b */
        public C58634a mo198696b(ArrayList<Photo> arrayList) {
            this.f144786a.putSerializable("SELECTED_ITEMS", arrayList);
            return this;
        }

        /* renamed from: c */
        public C58634a mo198699c(boolean z) {
            this.f144786a.putBoolean("TOTAL_HAS_VIDEO", z);
            return this;
        }

        /* renamed from: d */
        public C58634a mo198701d(boolean z) {
            this.f144786a.putBoolean("is_use_transition_anim", z);
            return this;
        }

        /* renamed from: b */
        public C58634a mo198697b(boolean z) {
            this.f144786a.putBoolean("keep_origin", z);
            return this;
        }

        /* renamed from: a */
        private Bundle m227413a(Activity activity) {
            if (this.f144787b == null) {
                return new Bundle();
            }
            return ActivityTransitionLauncher.m227224a(activity).mo198591a(this.f144787b).mo198593a(new int[]{DeviceUtils.getScreenWidth(activity), DeviceUtils.getScreenHeight(activity) - UIUtils.dp2px(activity, 64.0f)}).mo198590a();
        }

        /* renamed from: a */
        public C58634a mo198691a(ArrayList<Photo> arrayList) {
            C58635b.m227434a().mo198707a(C58612c.m227290a().mo102826a(), "key_photos_preview_picker", arrayList);
            this.f144786a.putString("key_photos_preview_picker", "key_photos_preview_picker");
            return this;
        }

        /* renamed from: a */
        public C58634a mo198692a(boolean z) {
            this.f144786a.putBoolean("show_delete", z);
            return this;
        }

        /* renamed from: a */
        private void m227414a(C36516a aVar, int i) {
            C58641f fVar = new C58641f();
            fVar.setArguments(this.f144786a);
            FloatWindowParams a = new FloatWindowParams.C36567a(DesktopConstants.UIType.FLOAT_MODAL_THIN_M2).mo134930b();
            fVar.setFragmentParams(a);
            C36512a.m144041a().mo134760a(aVar, fVar, a, i);
        }

        /* renamed from: a */
        public void mo198693a(Activity activity, int i) {
            if (!DesktopUtil.m144301a((Context) activity)) {
                Intent a = mo198688a((Context) activity);
                a.putExtras(m227413a(activity));
                activity.startActivityForResult(a, i);
                activity.overridePendingTransition(0, 0);
                return;
            }
            m227415b(activity, null, i);
        }

        /* renamed from: b */
        private void m227415b(Context context, Fragment fragment, int i) {
            Intent a = mo198688a(context);
            a.setFlags(402653184);
            C36512a.m144041a().mo134755a((Activity) context, fragment, new StandAloneParam.C36572a(a, DesktopConstants.UIType.WINDOW_NORMAL_D1).mo134969c(i).mo134967a());
        }

        /* renamed from: a */
        public void mo198694a(Context context, Fragment fragment, int i) {
            if (!DesktopUtil.m144301a(context)) {
                Intent a = mo198688a(context);
                a.putExtras(m227413a((Activity) context));
                fragment.startActivityForResult(a, i);
            } else if (this.f144786a.getBoolean("stand_alone_window", false)) {
                m227415b(context, fragment, i);
            } else if (fragment instanceof C36516a) {
                m227414a((C36516a) fragment, i);
            } else {
                m227415b(context, fragment, i);
            }
        }
    }
}
