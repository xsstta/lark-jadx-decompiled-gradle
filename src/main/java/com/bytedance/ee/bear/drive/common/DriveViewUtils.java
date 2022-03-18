package com.bytedance.ee.bear.drive.common;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.drive.core.fragment.DrivePreviewFragment;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/bytedance/ee/bear/drive/common/DriveViewUtils;", "", "()V", "Companion", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.drive.common.e */
public final class DriveViewUtils {

    /* renamed from: a */
    public static final Companion f18671a = new Companion(null);

    @JvmStatic
    /* renamed from: a */
    public static final <T extends View> T m27255a(int i, Fragment fragment) {
        return (T) f18671a.mo27134a(i, fragment);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J-\u0010\u0003\u001a\u0004\u0018\u0001H\u0004\"\b\b\u0000\u0010\u0004*\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/bytedance/ee/bear/drive/common/DriveViewUtils$Companion;", "", "()V", "findViewByIdInDrivePreviewFragment", "T", "Landroid/view/View;", "idRes", "", "fragment", "Landroidx/fragment/app/Fragment;", "(ILandroidx/fragment/app/Fragment;)Landroid/view/View;", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.common.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final <T extends View> T mo27134a(int i, Fragment fragment) {
            FragmentActivity fragmentActivity;
            View view;
            T t = null;
            T t2 = (T) null;
            if (fragment instanceof DrivePreviewFragment) {
                Fragment parentFragment = ((DrivePreviewFragment) fragment).getParentFragment();
                t2 = (parentFragment == null || (view = parentFragment.getView()) == null) ? null : (T) view.findViewById(i);
            }
            if (t2 != null) {
                return t2;
            }
            if (fragment != null) {
                fragmentActivity = fragment.getActivity();
            } else {
                fragmentActivity = null;
            }
            if (fragmentActivity == null) {
                return t2;
            }
            FragmentActivity activity = fragment.getActivity();
            if (activity != null) {
                t = (T) activity.findViewById(i);
            }
            return t;
        }
    }
}
