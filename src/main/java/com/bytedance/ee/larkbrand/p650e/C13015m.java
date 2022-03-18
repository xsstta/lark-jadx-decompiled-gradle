package com.bytedance.ee.larkbrand.p650e;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.AbstractC12888c;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.nativeMoudule.photo.C13175a;
import com.bytedance.ee.larkbrand.nativeMoudule.photo.PickerActivity;
import com.larksuite.component.openplatform.core.utils.C25529d;
import com.tt.miniapphost.entity.C67524d;
import com.tt.miniapphost.entity.MediaEntity;
import com.tt.option.p3389j.C67642a;
import java.io.File;
import java.util.ArrayList;

/* renamed from: com.bytedance.ee.larkbrand.e.m */
public class C13015m extends C67642a {
    @Override // com.tt.option.p3389j.AbstractC67643b, com.tt.option.p3389j.C67642a
    public C67524d handleActivityImageResult(int i, int i2, Intent intent) {
        String str;
        boolean z = false;
        ArrayList arrayList = null;
        if (i == 20011 && i2 == 19901026 && intent != null) {
            arrayList = intent.getParcelableArrayListExtra("select_result");
        } else if (i == 20010 && i2 == -1) {
            if (intent != null) {
                str = intent.getStringExtra("SELECTED_PHOTO");
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                str = C13175a.C13183d.f34968b;
            }
            if (!TextUtils.isEmpty(str)) {
                File file = new File(str);
                if (file.exists()) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(new MediaEntity(str, file.getName(), 0, 0, file.length(), 0, ""));
                    arrayList = arrayList2;
                }
            }
        } else {
            AppBrandLogger.m52830i("LarkOptionMediaDependIm", "path handleActivityImageResult requestCode" + i + " resultCode" + i2);
            C67524d dVar = new C67524d();
            dVar.mo234482a(z);
            if (arrayList != null && !arrayList.isEmpty()) {
                dVar.mo234481a(arrayList);
            }
            return dVar;
        }
        z = true;
        C67524d dVar2 = new C67524d();
        dVar2.mo234482a(z);
        dVar2.mo234481a(arrayList);
        return dVar2;
    }

    @Override // com.tt.option.p3389j.AbstractC67643b, com.tt.option.p3389j.C67642a
    public void chooseImage(IAppContext iAppContext, int i, boolean z, boolean z2, String str) {
        m53492a(iAppContext, i, z, z2, str);
    }

    /* renamed from: a */
    private void m53492a(IAppContext iAppContext, int i, boolean z, boolean z2, String str) {
        Activity currentActivity = iAppContext.getCurrentActivity();
        if (!z2 || z) {
            Intent intent = new Intent(currentActivity, PickerActivity.class);
            intent.putExtra("select_mode", 100);
            intent.putExtra("max_select_size", 188743680L);
            intent.putExtra("max_select_count", i);
            if (z2 || !z) {
                intent.putExtra("camerType", 1);
            }
            AbstractC12888c i2 = C25529d.m91168i(iAppContext);
            if (i2 != null) {
                i2.startActivityForResult(intent, 20011);
            } else {
                currentActivity.startActivityForResult(intent, 20011);
            }
        } else {
            C13175a.m53847a(currentActivity);
        }
    }
}
