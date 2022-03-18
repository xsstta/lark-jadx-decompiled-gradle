package com.ss.android.lark.contact.impl.selector.little_app;

import android.content.Intent;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.contact.impl.selector.bean.LittleAppSelectBean;
import com.ss.android.lark.contact.impl.selector.little_app.AbstractC35977a;
import com.ss.android.lark.contact.impl.selector.little_app.LittleAppSelectMemberView;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.contact.impl.selector.little_app.d */
public class C35987d implements AbstractC35977a.AbstractC35979b.AbstractC35980a {

    /* renamed from: a */
    public AbstractC35977a.AbstractC35978a f93033a;

    /* renamed from: b */
    public LittleAppSelectMemberView.AbstractC35976a f93034b;

    /* renamed from: c */
    private boolean f93035c;

    /* renamed from: d */
    private String f93036d;

    /* renamed from: e */
    private AbstractC35977a.AbstractC35979b f93037e;

    /* renamed from: f */
    private int f93038f = 100;

    @Override // com.ss.android.lark.contact.impl.selector.little_app.AbstractC35977a.AbstractC35979b.AbstractC35980a
    /* renamed from: b */
    public void mo132357b() {
        m141101k();
    }

    @Override // com.ss.android.lark.contact.impl.selector.little_app.AbstractC35977a.AbstractC35979b.AbstractC35980a
    /* renamed from: c */
    public void mo132359c() {
        m141101k();
        m141100j();
    }

    @Override // com.ss.android.lark.contact.impl.selector.little_app.AbstractC35977a.AbstractC35979b.AbstractC35980a
    /* renamed from: e */
    public List<String> mo132362e() {
        return this.f93033a.mo132348b();
    }

    @Override // com.ss.android.lark.contact.impl.selector.little_app.AbstractC35977a.AbstractC35979b.AbstractC35980a
    /* renamed from: f */
    public String mo132363f() {
        return this.f93033a.mo132353f();
    }

    @Override // com.ss.android.lark.contact.impl.selector.little_app.AbstractC35977a.AbstractC35979b.AbstractC35980a
    /* renamed from: g */
    public Map<String, SearchBaseInfo> mo132364g() {
        return this.f93033a.mo132350c();
    }

    @Override // com.ss.android.lark.contact.impl.selector.little_app.AbstractC35977a.AbstractC35979b.AbstractC35980a
    /* renamed from: h */
    public boolean mo132365h() {
        return this.f93033a.mo132354g();
    }

    /* renamed from: i */
    public String mo132382i() {
        return this.f93037e.mo132341d();
    }

    @Override // com.ss.android.lark.contact.impl.selector.little_app.AbstractC35977a.AbstractC35979b.AbstractC35980a
    /* renamed from: a */
    public void mo132355a() {
        m141101k();
        this.f93034b.mo132325a();
    }

    /* renamed from: j */
    private void m141100j() {
        final ArrayList arrayList = new ArrayList();
        this.f93034b.mo132329a(this.f93033a.mo132344a(), new UIGetDataCallback<Map<String, Chatter>>() {
            /* class com.ss.android.lark.contact.impl.selector.little_app.C35987d.C359881 */

            @Override // com.larksuite.framework.callback.UIGetDataCallback
            public void onErrored(ErrorResult errorResult) {
                Intent intent = new Intent();
                intent.putExtra("params_little_app", errorResult.getDisplayMsg());
                C35987d.this.f93034b.mo132331b(intent);
            }

            /* renamed from: a */
            public void onSuccessed(Map<String, Chatter> map) {
                boolean z;
                if (!(C35987d.this.f93033a.mo132344a() == null || map == null)) {
                    for (String str : C35987d.this.f93033a.mo132344a()) {
                        Chatter chatter = map.get(str);
                        String str2 = null;
                        if (chatter != null) {
                            str2 = chatter.getLocalizedName();
                        }
                        if (C35987d.this.f93033a.mo132350c().get(str).getType() != 17) {
                            z = true;
                        } else {
                            z = false;
                        }
                        arrayList.add(new LittleAppSelectBean(str, str2, z));
                    }
                    Intent intent = new Intent();
                    intent.putExtra("params_little_app", JSON.toJSONString(arrayList));
                    C35987d.this.f93034b.mo132326a(intent);
                }
            }
        });
    }

    @Override // com.ss.android.lark.contact.impl.selector.little_app.AbstractC35977a.AbstractC35979b.AbstractC35980a
    /* renamed from: d */
    public void mo132361d() {
        Map<String, SearchBaseInfo> c = this.f93033a.mo132350c();
        if (c != null && c.size() > 0) {
            this.f93034b.mo132328a(new ArrayList(c.values()));
        }
    }

    /* renamed from: k */
    private void m141101k() {
        if (CollectionUtils.isNotEmpty(this.f93033a.mo132350c())) {
            this.f93033a.mo132346a(mo132382i(), this.f93033a.mo132351d(), new ArrayList(this.f93033a.mo132350c().keySet()));
        }
    }

    /* renamed from: a */
    public void mo132380a(int i) {
        this.f93038f = i;
    }

    /* renamed from: a */
    public void mo132381a(String str) {
        this.f93036d = str;
    }

    @Override // com.ss.android.lark.contact.impl.selector.little_app.AbstractC35977a.AbstractC35979b.AbstractC35980a
    /* renamed from: c */
    public boolean mo132360c(SearchBaseInfo searchBaseInfo) {
        if (this.f93033a.mo132348b().contains(searchBaseInfo.getId())) {
            return false;
        }
        boolean b = this.f93033a.mo132349b(searchBaseInfo);
        this.f93037e.mo132336a(this.f93033a.mo132350c());
        return b;
    }

    @Override // com.ss.android.lark.contact.impl.selector.little_app.AbstractC35977a.AbstractC35979b.AbstractC35980a
    /* renamed from: a */
    public boolean mo132356a(SearchBaseInfo searchBaseInfo) {
        String str;
        if (this.f93033a.mo132344a().contains(searchBaseInfo.getId()) || this.f93033a.mo132350c().size() < this.f93038f) {
            return false;
        }
        AbstractC35977a.AbstractC35979b bVar = this.f93037e;
        if (TextUtils.isEmpty(this.f93036d)) {
            str = UIHelper.mustacheFormat((int) R.string.Lark_Selector_Max_Num_Tips, "max_num", Integer.toString(this.f93038f));
        } else {
            str = this.f93036d;
        }
        bVar.mo132334a(str);
        return true;
    }

    @Override // com.ss.android.lark.contact.impl.selector.little_app.AbstractC35977a.AbstractC35979b.AbstractC35980a
    /* renamed from: b */
    public boolean mo132358b(SearchBaseInfo searchBaseInfo) {
        if (this.f93035c) {
            if (this.f93033a.mo132348b().contains(searchBaseInfo.getId())) {
                return false;
            }
            this.f93033a.mo132345a(searchBaseInfo);
            this.f93037e.mo132336a(this.f93033a.mo132350c());
            return true;
        } else if (this.f93033a.mo132348b().contains(searchBaseInfo.getId())) {
            return false;
        } else {
            this.f93033a.mo132345a(searchBaseInfo);
            this.f93037e.mo132336a(this.f93033a.mo132350c());
            m141100j();
            return true;
        }
    }

    public C35987d(C35985c cVar, boolean z) {
        this.f93033a = cVar.mo132377d();
        this.f93037e = cVar.mo132376c();
        this.f93034b = cVar.mo132378e();
        this.f93035c = z;
    }
}
