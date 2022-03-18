package com.ss.android.lark.mine;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chatter.ChatterDescription;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.base.ContainerType;
import com.ss.android.lark.desktopmode.base.DesktopConstants;
import com.ss.android.lark.desktopmode.base.FloatWindowParams;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.mine.impl.index.C45653b;
import com.ss.android.lark.mine.impl.index.MineActivity;
import com.ss.android.lark.mine.impl.info.C45763a;
import com.ss.android.lark.mine.impl.info.MineInfoActivity;
import com.ss.android.lark.mine.impl.info.edit_name.C45765a;
import com.ss.android.lark.mine.impl.info.edit_name.MineUpdateNameActivity;
import com.ss.android.lark.mine.impl.status.C45810d;
import com.ss.android.lark.mine.impl.status.UserStatusUpdateActivity;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.mine.a */
public class C45398a {
    /* renamed from: a */
    public static void m180319a(Context context) {
        if (DesktopUtil.m144301a(context)) {
            FloatWindowParams a = new FloatWindowParams.C36567a(DesktopConstants.UIType.FLOAT_MODAL_THIN_M2).mo134930b();
            C36512a.m144041a().mo134762a(new C45763a(), a);
            return;
        }
        context.startActivity(new Intent(context, MineInfoActivity.class));
    }

    /* renamed from: a */
    public static void m180322a(Context context, ChatterDescription chatterDescription) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("description", chatterDescription);
        if (DesktopUtil.m144301a(context)) {
            FloatWindowParams a = new FloatWindowParams.C36567a(DesktopConstants.UIType.FLOAT_MODAL_THIN_M2).mo134930b();
            C45810d dVar = new C45810d();
            dVar.setArguments(bundle);
            C36512a.m144041a().mo134762a(dVar, a);
            return;
        }
        Intent intent = new Intent(context, UserStatusUpdateActivity.class);
        intent.putExtras(bundle);
        context.startActivity(intent);
    }

    /* renamed from: a */
    public static void m180323a(Context context, int[] iArr) {
        if (!DesktopUtil.m144301a(context)) {
            context.startActivity(new Intent(context, MineActivity.class));
            return;
        }
        Drawable drawable = context.getResources().getDrawable(R.drawable.desktop_shadow_bg);
        Rect rect = new Rect();
        drawable.getPadding(rect);
        C36512a.m144041a().mo134762a((C36516a) new C45653b().mo105902a(), new FloatWindowParams.C36567a().mo134944a(iArr[0], iArr[1] + rect.top).mo134942a(BitmapDescriptorFactory.HUE_RED).mo134948b(UIHelper.px2dp((float) UIHelper.getWindowWidth(context, ContainerType.Left))).mo134949c(rect.top + 550 + rect.bottom).mo134950d(R.drawable.desktop_shadow_bg).mo134943a(8388659).mo134945a("MineActivity").mo134930b());
    }

    /* renamed from: a */
    public static void m180321a(Context context, Fragment fragment, ChatterDescription chatterDescription, int i) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("description", chatterDescription);
        Intent intent = new Intent(context, UserStatusUpdateActivity.class);
        intent.putExtras(bundle);
        fragment.startActivityForResult(intent, i);
    }

    /* renamed from: a */
    public static void m180320a(Context context, Fragment fragment, Bundle bundle, int i) {
        if (DesktopUtil.m144301a(context)) {
            FloatWindowParams a = new FloatWindowParams.C36567a(DesktopConstants.UIType.FLOAT_MODAL_THIN_M2).mo134930b();
            C45765a aVar = new C45765a();
            aVar.setArguments(bundle);
            if (fragment instanceof C36516a) {
                C36512a.m144041a().mo134760a((C36516a) fragment, aVar, a, i);
                return;
            }
            return;
        }
        Intent intent = new Intent(context, MineUpdateNameActivity.class);
        intent.putExtras(bundle);
        fragment.startActivityForResult(intent, i);
    }
}
