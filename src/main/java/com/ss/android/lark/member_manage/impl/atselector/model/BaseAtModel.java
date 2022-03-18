package com.ss.android.lark.member_manage.impl.atselector.model;

import android.text.TextUtils;
import com.larksuite.framework.mvp.BaseModel;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.member_manage.GroupMemberManageModule;
import com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency;
import com.ss.android.lark.member_manage.impl.atselector.C44972b;
import com.ss.android.lark.member_manage.impl.atselector.bean.AtSelectInitData;
import com.ss.android.lark.member_manage.impl.atselector.bean.BaseAtBean;
import com.ss.android.lark.member_manage.impl.atselector.bean.SearchBean;
import com.ss.android.lark.utils.C57814c;
import com.ss.android.lark.utils.UIHelper;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract class BaseAtModel extends BaseModel implements C44972b.AbstractC44973a {

    /* renamed from: a */
    protected String f113929a;

    /* renamed from: b */
    C44972b.AbstractC44973a.AbstractC44974a f113930b;

    /* renamed from: c */
    AtSelectInitData f113931c;

    /* renamed from: d */
    List<BaseAtBean> f113932d = new ArrayList();

    /* renamed from: e */
    List<BaseAtBean> f113933e = new ArrayList();

    /* renamed from: f */
    Map<String, BaseAtBean> f113934f = new LinkedHashMap();

    /* renamed from: g */
    String f113935g;

    /* renamed from: h */
    String f113936h;

    /* renamed from: i */
    int f113937i = 0;

    /* renamed from: j */
    IGroupMemberManageModuleDependency.AbstractC44881d f113938j = GroupMemberManageModule.m177902a().getChatterDependency();

    @Retention(RetentionPolicy.SOURCE)
    public @interface RequestStatus {
    }

    @Override // com.ss.android.lark.member_manage.impl.atselector.C44972b.AbstractC44973a
    /* renamed from: a */
    public Map<String, BaseAtBean> mo159119a() {
        return this.f113934f;
    }

    @Override // com.ss.android.lark.member_manage.impl.atselector.C44972b.AbstractC44973a
    /* renamed from: e */
    public List<BaseAtBean> mo159130e() {
        return this.f113932d;
    }

    @Override // com.ss.android.lark.member_manage.impl.atselector.C44972b.AbstractC44973a
    /* renamed from: f */
    public List<BaseAtBean> mo159131f() {
        return this.f113933e;
    }

    @Override // com.ss.android.lark.member_manage.impl.atselector.C44972b.AbstractC44973a
    /* renamed from: h */
    public String mo159133h() {
        return this.f113935g;
    }

    @Override // com.ss.android.lark.member_manage.impl.atselector.C44972b.AbstractC44973a
    /* renamed from: g */
    public void mo159132g() {
        this.f113937i = 0;
        this.f113935g = "";
        this.f113936h = "";
        this.f113933e.clear();
    }

    @Override // com.ss.android.lark.member_manage.impl.atselector.C44972b.AbstractC44973a
    /* renamed from: b */
    public Map<String, ChatChatter> mo159125b() {
        HashMap hashMap = new HashMap();
        if (this.f113934f.containsKey(C57814c.m224347a())) {
            Chatter chatter = new Chatter();
            chatter.setId(C57814c.m224347a());
            String string = UIHelper.getString(R.string.Lark_Legacy_AllPeople);
            chatter.setName(string);
            chatter.setEnName(string);
            hashMap.put(chatter.getId(), new ChatChatter(chatter));
        }
        ArrayList<String> arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (String str : this.f113934f.keySet()) {
            BaseAtBean baseAtBean = this.f113934f.get(str);
            if (!(baseAtBean == null || baseAtBean.getType() == 1 || baseAtBean.getType() == 3)) {
                arrayList.add(str);
                if ((baseAtBean instanceof SearchBean) && ((SearchBean) baseAtBean).isOutChatUser()) {
                    hashSet.add(str);
                }
            }
        }
        Map<String, ChatChatter> b = this.f113938j.mo143786b(this.f113929a, arrayList);
        if (CollectionUtils.isNotEmpty(b)) {
            hashMap.putAll(b);
        }
        if (b.size() < arrayList.size()) {
            ArrayList arrayList2 = new ArrayList();
            for (String str2 : arrayList) {
                if (!b.containsKey(str2)) {
                    arrayList2.add(str2);
                }
            }
            for (Chatter chatter2 : this.f113938j.mo143787b(arrayList2).values()) {
                hashMap.put(chatter2.getId(), new ChatChatter(chatter2));
            }
        }
        for (ChatChatter chatChatter : hashMap.values()) {
            if (hashSet.contains(chatChatter.getId())) {
                chatChatter.setOutChatUser(true);
            }
        }
        return hashMap;
    }

    @Override // com.ss.android.lark.member_manage.impl.atselector.C44972b.AbstractC44973a
    /* renamed from: a */
    public void mo159122a(C44972b.AbstractC44973a.AbstractC44974a aVar) {
        this.f113930b = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public List<BaseAtBean> mo159236a(List<BaseAtBean> list) {
        for (BaseAtBean baseAtBean : list) {
            baseAtBean.setSelected(this.f113934f.containsKey(baseAtBean.getId()));
        }
        return list;
    }

    @Override // com.ss.android.lark.member_manage.impl.atselector.C44972b.AbstractC44973a
    /* renamed from: b */
    public Map<String, BaseAtBean> mo159126b(BaseAtBean baseAtBean) {
        if (this.f113934f.containsKey(baseAtBean.getId())) {
            this.f113934f.remove(baseAtBean.getId());
            m178449a(baseAtBean, false);
        }
        return this.f113934f;
    }

    public BaseAtModel(AtSelectInitData atSelectInitData) {
        this.f113931c = atSelectInitData;
    }

    @Override // com.ss.android.lark.member_manage.impl.atselector.C44972b.AbstractC44973a
    /* renamed from: a */
    public Map<String, BaseAtBean> mo159120a(BaseAtBean baseAtBean) {
        if (!this.f113934f.containsKey(baseAtBean.getId())) {
            this.f113934f.put(baseAtBean.getId(), baseAtBean);
            m178449a(baseAtBean, true);
        }
        return this.f113934f;
    }

    /* renamed from: a */
    private void m178449a(BaseAtBean baseAtBean, boolean z) {
        List<BaseAtBean> list = this.f113932d;
        if (list != null) {
            for (BaseAtBean baseAtBean2 : list) {
                if (baseAtBean2.getId().equals(baseAtBean.getId())) {
                    baseAtBean2.setSelected(z);
                }
            }
        }
        List<BaseAtBean> list2 = this.f113933e;
        if (list2 != null) {
            for (BaseAtBean baseAtBean3 : list2) {
                if (baseAtBean3.getId().equals(baseAtBean.getId())) {
                    baseAtBean3.setSelected(z);
                }
            }
        }
    }

    @Override // com.ss.android.lark.member_manage.impl.atselector.C44972b.AbstractC44973a
    /* renamed from: a */
    public void mo159124a(String str, List<BaseAtBean> list) {
        if (TextUtils.equals(this.f113936h, str)) {
            this.f113933e.clear();
            this.f113933e.addAll(list);
        }
    }
}
