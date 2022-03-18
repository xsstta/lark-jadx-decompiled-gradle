package com.ss.android.lark.search.impl.func.pick.chatterpick;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.base.DesktopConstants;
import com.ss.android.lark.desktopmode.base.FloatWindowParams;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.search.impl.func.pick.viewdata.BasePickViewData;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.search.impl.func.pick.chatterpick.b */
public class C53667b {
    /* renamed from: a */
    public static Intent m207747a(Context context, List<BasePickViewData> list) {
        return m207748a(context, list, "");
    }

    /* renamed from: a */
    public static Intent m207748a(Context context, List<BasePickViewData> list, String str) {
        Intent intent = new Intent(context, PickChatterActivity.class);
        intent.putExtra("message/filter/picked_chatter", new ArrayList(list));
        intent.putExtra("filter/from_source", str);
        if (!(context instanceof Activity)) {
            intent.setFlags(268435456);
        }
        return intent;
    }

    /* renamed from: a */
    public static void m207749a(C36516a aVar, List<BasePickViewData> list, String str, int i) {
        Context context;
        if (aVar != null && (context = aVar.getContext()) != null) {
            Bundle bundle = new Bundle();
            bundle.putSerializable("message/filter/picked_chatter", new ArrayList(list));
            bundle.putString("filter/from_source", str);
            if (DesktopUtil.m144301a(context)) {
                C53664a aVar2 = new C53664a();
                aVar2.setArguments(bundle);
                C36512a.m144041a().mo134760a(aVar, aVar2, new FloatWindowParams.C36567a(DesktopConstants.UIType.FLOAT_MODAL_THIN_M2).mo134945a("LarkSearch.Search.PickChatterFragment").mo134930b(), i);
                return;
            }
            FragmentActivity activity = aVar.getActivity();
            if (activity != null) {
                Intent intent = new Intent(context, PickChatterActivity.class);
                intent.putExtra("message/filter/picked_chatter", new ArrayList(list));
                intent.putExtra("filter/from_source", str);
                activity.startActivityForResult(intent, i);
            }
        }
    }
}
