package com.bytedance.ee.android.file.picker.lib.page;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.bytedance.ee.android.file.picker.lib.base.FragmentInfo;
import com.bytedance.ee.android.file.picker.lib.local.C4067d;
import com.bytedance.ee.android.file.picker.lib.local.C4073f;
import com.bytedance.ee.android.file.picker.lib.mvp.BasePresenter;
import com.bytedance.ee.android.file.picker.lib.page.AbstractC4112f;
import com.bytedance.ee.android.file.picker.lib.page.C4105e;
import com.bytedance.ee.android.file.picker.lib.statistics.FilePickerHitPoint;
import com.bytedance.ee.android.file.picker.lib.utils.FileUtils;
import com.bytedance.ee.android.file.picker.lib.utils.TemplateUtils;
import com.bytedance.ee.android.file.picker.lib.utils.UIHelper;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.android.file.picker.lib.page.d */
public class C4102d extends BasePresenter<AbstractC4112f.AbstractC4113a, AbstractC4112f.AbstractC4114b, AbstractC4112f.AbstractC4114b.AbstractC4115a> {

    /* renamed from: a */
    private C4073f.AbstractC4078b f12431a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC4112f.AbstractC4114b.AbstractC4115a mo15860d() {
        return new C4104a();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.android.file.picker.lib.page.d$a */
    public class C4104a implements AbstractC4112f.AbstractC4114b.AbstractC4115a {
        private C4104a() {
        }
    }

    /* renamed from: b */
    private boolean m17089b(C4073f.AbstractC4078b bVar, long j) {
        long b = bVar.mo15995b();
        String d = bVar.mo15997d();
        if (j <= b) {
            return true;
        }
        ((AbstractC4112f.AbstractC4114b) mo15861e()).mo16054b(d);
        FilePickerHitPoint.f12299a.mo15891a(String.valueOf(j));
        return false;
    }

    /* renamed from: a */
    private boolean m17087a(C4073f.AbstractC4078b bVar, long j) {
        long c = bVar.mo15996c();
        String e = bVar.mo15998e();
        if (j <= c) {
            return true;
        }
        ((AbstractC4112f.AbstractC4114b) mo15861e()).mo16054b(e);
        FilePickerHitPoint.f12299a.mo15891a(String.valueOf(j));
        return false;
    }

    /* renamed from: a */
    private boolean m17088a(C4073f.AbstractC4078b bVar, Context context, int i) {
        int a = bVar.mo15993a();
        if (i < a) {
            return true;
        }
        ((AbstractC4112f.AbstractC4114b) mo15861e()).mo16053a(TemplateUtils.f12481a.mo16116a(context, R.string.Lark_Legacy_SendAttachedFileSelectedExceedMaxLimit, "max_select_count", Integer.toString(a)));
        return false;
    }

    /* renamed from: a */
    public void mo16051a(Context context, Intent intent, ClipData clipData) {
        Uri uri;
        C4073f.AbstractC4078b bVar = this.f12431a;
        if (bVar == null) {
            Log.m165397w("FilePickerPresenter", "onMultiSelectResult callback not init");
            return;
        }
        int itemCount = clipData.getItemCount();
        if (m17088a(bVar, context, itemCount)) {
            long j = 0;
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < itemCount; i++) {
                ClipData.Item itemAt = clipData.getItemAt(i);
                if (!(itemAt == null || (uri = itemAt.getUri()) == null)) {
                    long a = FileUtils.m17137a(context, uri);
                    if (m17087a(bVar, a)) {
                        arrayList.add(uri);
                        j += a;
                    } else {
                        return;
                    }
                }
            }
            if (m17089b(bVar, j)) {
                bVar.mo15994a(arrayList, j);
            }
        }
    }

    /* renamed from: a */
    private List<FragmentInfo> m17085a(Context context, int i, int i2, String str) {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(new FragmentInfo(C4067d.m16964a(i, i2, str), UIHelper.f12487a.mo16122a(context, R.string.Lark_Legacy_SendAttachedFile)));
        return arrayList;
    }

    /* renamed from: a */
    private void m17086a(Context context, FragmentManager fragmentManager, C4105e.AbstractC4111a aVar, int i, int i2, String str, String str2, boolean z) {
        C4105e eVar = new C4105e(context, fragmentManager, m17085a(context, i, i2, str2), aVar, i, str, z);
        C4101c cVar = new C4101c(i);
        mo15859a(eVar);
        mo15858a(cVar);
        eVar.mo15864a(mo15860d());
    }

    C4102d(FragmentActivity fragmentActivity, FragmentManager fragmentManager, C4105e.AbstractC4111a aVar, int i, int i2, String str, String str2, boolean z, C4073f.AbstractC4078b bVar) {
        this.f12431a = bVar;
        m17086a(fragmentActivity, fragmentManager, aVar, i, i2, str, str2, z);
    }
}
