package com.ss.android.lark.floating;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.ss.android.floatbubble.C28460b;
import com.ss.android.floatbubble.util.RomUtils;
import com.ss.android.floatbubble.util.p1318a.C28466a;
import com.ss.android.floatbubble.util.p1320c.C28470a;
import com.ss.android.floatbubble.util.p1321d.C28471a;
import com.ss.android.lark.floating.interfaces.OnPermissionResult;
import com.ss.android.lark.log.Log;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0015\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0000¢\u0006\u0002\b\u000fJ\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/floating/PermissionUtils;", "", "()V", "TAG", "", "requestCode", "", "checkPermission", "", "context", "Landroid/content/Context;", "requestPermission", "", "fragment", "Landroidx/fragment/app/Fragment;", "requestPermission$float_release", "activity", "Landroidx/fragment/app/FragmentActivity;", "onPermissionResult", "Lcom/ss/android/lark/floating/interfaces/OnPermissionResult;", "float_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.floating.d */
public final class PermissionUtils {

    /* renamed from: a */
    public static final PermissionUtils f98492a = new PermissionUtils();

    private PermissionUtils() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final boolean m150948a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        return C28460b.m104296a(context);
    }

    /* renamed from: a */
    public final void mo140250a(Fragment fragment) {
        Intrinsics.checkParameterIsNotNull(fragment, "fragment");
        FragmentActivity requireActivity = fragment.requireActivity();
        Intrinsics.checkExpressionValueIsNotNull(requireActivity, "fragment.requireActivity()");
        Application application = requireActivity.getApplication();
        Log.m165389i("VideoChat_FloatBubblePermission", "goToSettingPage");
        try {
            if (Build.VERSION.SDK_INT < 23) {
                if (RomUtils.m104301a()) {
                    C28471a.m104332a(application);
                    return;
                }
            } else if (RomUtils.m104302b() && Build.VERSION.SDK_INT == 23) {
                C28466a.m104308a(application);
                return;
            } else if (RomUtils.m104304d()) {
                C28470a.m104327b(application);
                return;
            }
            Intent intent = new Intent();
            intent.setAction("android.settings.action.MANAGE_OVERLAY_PERMISSION");
            intent.addCategory("android.intent.category.DEFAULT");
            StringBuilder sb = new StringBuilder();
            sb.append("package:");
            Intrinsics.checkExpressionValueIsNotNull(application, "application");
            sb.append(application.getPackageName());
            intent.setData(Uri.parse(sb.toString()));
            intent.setFlags(268435456);
            if (intent.resolveActivity(application.getPackageManager()) != null) {
                application.startActivity(intent);
            } else {
                Log.m165383e("VideoChat_FloatBubblePermission", "permission setting page not found");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m150947a(FragmentActivity fragmentActivity, OnPermissionResult hVar) {
        Intrinsics.checkParameterIsNotNull(fragmentActivity, "activity");
        Intrinsics.checkParameterIsNotNull(hVar, "onPermissionResult");
        PermissionFragment.f98479b.mo140224a(fragmentActivity, hVar);
    }
}
