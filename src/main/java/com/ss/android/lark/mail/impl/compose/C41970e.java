package com.ss.android.lark.mail.impl.compose;

import android.text.TextUtils;
import androidx.lifecycle.AbstractC1178x;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.entity.C42088b;
import com.ss.android.lark.mail.impl.mailtoolbar.plugins.toolbar.MailItemId;
import com.ss.android.lark.mail.impl.service.C43277a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.lark.mail.impl.compose.e */
public class C41970e {

    /* renamed from: a */
    public Boolean f106546a;

    /* renamed from: b */
    public String f106547b;

    /* renamed from: c */
    private Map<String, Integer> f106548c;

    /* renamed from: d */
    private List<AbstractC41973b> f106549d;

    /* renamed from: e */
    private Boolean f106550e;

    /* renamed from: f */
    private Boolean f106551f;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.mail.impl.compose.e$a */
    public static class C41972a {

        /* renamed from: a */
        public static C41970e f106553a = new C41970e();
    }

    /* renamed from: com.ss.android.lark.mail.impl.compose.e$b */
    public interface AbstractC41973b {
        /* renamed from: c */
        void mo150603c(int i);
    }

    /* renamed from: d */
    public static C41970e m166941d() {
        return C41972a.f106553a;
    }

    /* renamed from: b */
    public boolean mo150953b() {
        if (this.f106550e == null) {
            this.f106550e = Boolean.valueOf(C41816b.m166115a().mo150154u().mo150160a("larkmail.cli.mobile_editor_kit"));
        }
        return this.f106550e.booleanValue();
    }

    private C41970e() {
        this.f106548c = new HashMap();
        this.f106549d = new CopyOnWriteArrayList();
        this.f106546a = null;
        this.f106550e = null;
        this.f106551f = null;
        C43277a.m171921a().mo154953q().mo5925a(new AbstractC1178x<C42088b>() {
            /* class com.ss.android.lark.mail.impl.compose.C41970e.C419711 */

            /* renamed from: a */
            public void onChanged(C42088b bVar) {
                if (bVar != null && !TextUtils.equals(C41970e.this.f106547b, bVar.mo151821c()) && !TextUtils.isEmpty(bVar.mo151821c())) {
                    C41970e.this.f106546a = null;
                    C41970e.this.f106547b = bVar.mo151821c();
                }
            }
        });
    }

    /* renamed from: c */
    public boolean mo150954c() {
        if (this.f106551f == null) {
            this.f106551f = Boolean.valueOf(C41816b.m166115a().mo150154u().mo150160a("larkmail.cli.support_more_fonts"));
        }
        if (!this.f106551f.booleanValue() || !mo150953b()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private void m166942e() {
        int i = 0;
        for (Map.Entry<String, Integer> entry : this.f106548c.entrySet()) {
            if (entry.getValue() != null) {
                i = Math.max(i, entry.getValue().intValue());
            }
        }
        for (AbstractC41973b bVar : this.f106549d) {
            bVar.mo150603c(i);
        }
    }

    /* renamed from: a */
    public boolean mo150951a() {
        if (this.f106546a == null) {
            this.f106546a = Boolean.valueOf(C41816b.m166115a().mo150154u().mo150160a("larkmail.cli.enterprise.signature"));
        }
        if (!this.f106546a.booleanValue() || !mo150953b()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public void mo150952b(AbstractC41973b bVar) {
        Log.m165389i("ComposeWebService", "removeToolbarBoardHeightChanged");
        if (bVar != null) {
            this.f106549d.remove(bVar);
        }
    }

    /* renamed from: a */
    public void mo150949a(AbstractC41973b bVar) {
        Log.m165389i("ComposeWebService", "addToolbarBoardHeightChanged");
        if (bVar != null && !this.f106549d.contains(bVar)) {
            this.f106549d.add(bVar);
        }
    }

    /* renamed from: a */
    public void mo150950a(MailItemId mailItemId, int i) {
        Log.m165389i("ComposeWebService", "toolbarBoardHeightChange: " + mailItemId + ", height: " + i);
        if (mailItemId != null) {
            this.f106548c.put(mailItemId.name(), Integer.valueOf(i));
        } else {
            this.f106548c.put("keyboard", Integer.valueOf(i));
        }
        m166942e();
    }
}
