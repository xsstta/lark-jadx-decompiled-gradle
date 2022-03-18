package com.ss.android.lark.integrator.calendar.dependency;

import android.content.Context;
import android.graphics.Bitmap;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30039ah;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57814c;
import com.ss.android.lark.utils.C57860r;
import com.ss.android.lark.utils.StatusBarUtil;
import com.ss.android.lark.utils.UIHelper;
import java.util.Map;

/* renamed from: com.ss.android.lark.integrator.calendar.dependency.ag */
public class C39197ag implements AbstractC30039ah {
    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30039ah
    /* renamed from: a */
    public int mo108192a(Context context) {
        return StatusBarUtil.getStatusBarHeight(context);
    }

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30039ah
    /* renamed from: b */
    public boolean mo108198b(Context context) {
        return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).isUsPackage();
    }

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30039ah
    /* renamed from: a */
    public String mo108196a(int i, Map<String, String> map) {
        return UIHelper.mustacheFormat(i, map);
    }

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30039ah
    /* renamed from: a */
    public String mo108197a(String str, String str2) {
        return C57814c.m224350b(str, str2);
    }

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30039ah
    /* renamed from: a */
    public Bitmap mo108193a(int i, int i2, String str) {
        return C57860r.m224569a(i, i2, str);
    }

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30039ah
    /* renamed from: a */
    public String mo108195a(int i, String str, String str2) {
        return UIHelper.mustacheFormat(i, str, str2);
    }

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30039ah
    /* renamed from: a */
    public Bitmap mo108194a(int i, int i2, String str, int i3) {
        return C57860r.m224570a(i, i2, str, i3);
    }
}
