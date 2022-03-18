package com.ss.android.lark.profile.func.share_profile.mvp;

import android.content.Context;
import com.larksuite.framework.mvp.BaseModel;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.C29527a;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.profile.func.share_profile.mvp.AbstractC52488a;
import com.ss.android.lark.profile.func.share_profile.share_qrcode.C52493a;
import com.ss.android.lark.profile.func.share_profile.share_url.C52533a;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.profile.func.share_profile.mvp.b */
public class C52491b extends BaseModel implements AbstractC52488a.AbstractC52489a {
    @Override // com.ss.android.lark.profile.func.share_profile.mvp.AbstractC52488a.AbstractC52489a
    /* renamed from: a */
    public List<C29527a> mo179503a(Context context) {
        ArrayList arrayList = new ArrayList();
        if (!DesktopUtil.m144301a(context)) {
            arrayList.add(new C29527a(new C52493a(), UIHelper.getString(R.string.Lark_Legacy_MyQrCode)));
        }
        arrayList.add(new C29527a(new C52533a(), UIHelper.getString(R.string.Lark_Legacy_PersoncardShareLink)));
        return arrayList;
    }
}
