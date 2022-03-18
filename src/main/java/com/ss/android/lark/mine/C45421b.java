package com.ss.android.lark.mine;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.lark.pb.basic.v1.Chatter;
import com.ss.android.lark.applink.AbstractC29186b;
import com.ss.android.lark.biz.core.api.IMineController;
import com.ss.android.lark.chat.entity.chatter.ChatterDescription;
import com.ss.android.lark.mine.dto.C45426d;
import com.ss.android.lark.mine.impl.C45428a;
import com.ss.android.lark.mine.impl.custom_status.C45616s;
import com.ss.android.lark.mine.impl.custom_status.UserCustomStatusActivity;
import com.ss.android.lark.mine.impl.index.C45653b;
import com.ss.android.lark.mine.impl.index.IMineFragment;
import com.ss.android.lark.mine.impl.p2272a.C45430a;
import com.ss.android.lark.mine.p2270a.AbstractC45399a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.mine.b */
public class C45421b {

    /* renamed from: a */
    private static volatile AbstractC45399a f114991a;

    /* renamed from: a */
    public static AbstractC45399a m180420a() {
        return f114991a;
    }

    /* renamed from: c */
    public void mo160271c() {
        C45428a.m180460a();
    }

    /* renamed from: b */
    public IMineController mo160269b() {
        return new C45653b();
    }

    /* renamed from: d */
    public List<String> mo160273d() {
        return C45426d.m180444a();
    }

    /* renamed from: e */
    public boolean mo160274e() {
        return C45616s.m180944a();
    }

    public C45421b(AbstractC45399a aVar) {
        f114991a = aVar;
    }

    /* renamed from: a */
    public Chatter.ChatterCustomStatus mo160263a(List<Chatter.ChatterCustomStatus> list) {
        return C45616s.m180940a(list);
    }

    /* renamed from: c */
    public void mo160272c(Context context) {
        UserCustomStatusActivity.m180533a(context);
    }

    /* renamed from: a */
    public void mo160264a(Context context) {
        mo160267a(context, (int[]) null);
    }

    /* renamed from: b */
    public Map<String, AbstractC29186b> mo160270b(Context context) {
        HashMap hashMap = new HashMap();
        hashMap.put("/client/setting/privacy/open", new C45430a());
        return hashMap;
    }

    /* renamed from: a */
    public void mo160265a(Context context, int i) {
        UserCustomStatusActivity.m180534a(context, i);
    }

    /* renamed from: a */
    public void mo160267a(Context context, int[] iArr) {
        C45398a.m180323a(context, iArr);
    }

    /* renamed from: a */
    public void mo160268a(Fragment fragment, IMineController.OnGotoOtherPageListener aVar) {
        if (fragment instanceof IMineFragment) {
            ((IMineFragment) fragment).mo160767a(aVar);
        }
    }

    /* renamed from: a */
    public void mo160266a(Context context, Fragment fragment, ChatterDescription chatterDescription, int i) {
        C45398a.m180321a(context, fragment, chatterDescription, i);
    }
}
