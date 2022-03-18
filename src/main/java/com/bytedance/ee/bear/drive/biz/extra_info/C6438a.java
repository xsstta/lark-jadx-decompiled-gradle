package com.bytedance.ee.bear.drive.biz.extra_info;

import android.content.DialogInterface;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.drive.loader.model.C7086a;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.more.AbstractC10194a;
import com.bytedance.ee.bear.more.export.C10211e;
import com.bytedance.ee.util.io.C13672c;
import com.larksuite.suite.R;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.drive.biz.extra_info.a */
public class C6438a {
    /* renamed from: a */
    public void mo25793a() {
        ((AbstractC10194a) KoinJavaComponent.m268610a(AbstractC10194a.class)).mo38979b();
    }

    /* renamed from: a */
    public void mo25794a(FragmentActivity fragmentActivity, C7086a aVar) {
        String str;
        ((AbstractC10194a) KoinJavaComponent.m268610a(AbstractC10194a.class)).mo38970a(fragmentActivity, C8275a.f22375h.mo32555b(), aVar.mo27322a().f18785a, false, new C10211e.C10212a().mo39079a(fragmentActivity.getString(R.string.Drive_Drive_FileDetails)).mo39082b(fragmentActivity.getString(R.string.Drive_Drive_FileGeneral)).mo39083c(fragmentActivity.getString(R.string.Drive_Drive_FileType)).mo39084d(fragmentActivity.getString(R.string.Drive_Drive_FileSize)).mo39081a(), (DialogInterface.OnDismissListener) null);
        C10211e.C10212a aVar2 = new C10211e.C10212a();
        if (TextUtils.isEmpty(aVar.mo27322a().mo27364g())) {
            str = "";
        } else {
            str = aVar.mo27322a().mo27364g().toUpperCase();
        }
        ((AbstractC10194a) KoinJavaComponent.m268610a(AbstractC10194a.class)).mo38973a(aVar2.mo39085e(str).mo39086f(C13672c.m55479a(fragmentActivity, aVar.mo27322a().f18787c)).mo39081a());
    }
}
