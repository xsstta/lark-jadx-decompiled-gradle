package com.ss.android.lark.member_manage.impl.atselector.model.p2256a;

import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.member_manage.GroupMemberManageModule;
import com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency;
import com.ss.android.lark.member_manage.impl.GroupUtils;
import com.ss.android.lark.member_manage.impl.atselector.bean.AllAtBean;
import com.ss.android.lark.member_manage.impl.atselector.bean.BaseAtBean;
import com.ss.android.lark.member_manage.impl.atselector.bean.BottomSearchTipBean;
import com.ss.android.lark.member_manage.impl.atselector.bean.C44977a;
import com.ss.android.lark.member_manage.impl.atselector.bean.C44978b;
import com.ss.android.lark.member_manage.impl.atselector.bean.GroupMemAtBean;
import com.ss.android.lark.member_manage.impl.atselector.bean.LabelAtBean;
import com.ss.android.lark.member_manage.impl.atselector.bean.WantAtMemBean;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.ss.android.lark.member_manage.impl.atselector.model.a.a */
public class C45003a {

    /* renamed from: a */
    Chat f113950a;

    /* renamed from: b */
    IGroupMemberManageModuleDependency.AbstractC44881d f113951b = GroupMemberManageModule.m177902a().getChatterDependency();

    /* renamed from: c */
    IGroupMemberManageModuleDependency.AbstractC44878a f113952c = GroupMemberManageModule.m177902a().getAccountDependency();

    /* renamed from: d */
    List<ChatChatter> f113953d = new ArrayList();

    /* renamed from: e */
    List<ChatChatter> f113954e = new ArrayList();

    /* renamed from: f */
    Map<String, String> f113955f = new HashMap();

    /* renamed from: g */
    private final boolean f113956g;

    /* renamed from: h */
    private Locale f113957h;

    /* renamed from: b */
    private LabelAtBean m178480b() {
        return new LabelAtBean(UIHelper.getString(R.string.Lark_Legacy_ProbabilityAtPersonHint));
    }

    /* renamed from: c */
    private LabelAtBean m178481c() {
        return new LabelAtBean(UIHelper.getString(R.string.Lark_Legacy_AllMember));
    }

    /* renamed from: a */
    public List<BaseAtBean> mo159240a() {
        ArrayList arrayList = new ArrayList();
        Chat chat = this.f113950a;
        if (chat == null) {
            return arrayList;
        }
        m178476a(chat, arrayList);
        m178477a(this.f113950a, this.f113953d, arrayList);
        m178478a(this.f113950a, this.f113954e, arrayList, this.f113956g);
        m178479a(arrayList, this.f113956g);
        return arrayList;
    }

    /* renamed from: a */
    private AllAtBean m178475a(int i) {
        return new AllAtBean(i);
    }

    /* renamed from: a */
    private List<BaseAtBean> m178479a(List<BaseAtBean> list, boolean z) {
        if (CollectionUtils.isNotEmpty(list) && z) {
            list.add(new BottomSearchTipBean());
        }
        return list;
    }

    /* renamed from: a */
    private List<BaseAtBean> m178476a(Chat chat, List<BaseAtBean> list) {
        if (chat.getType() == Chat.Type.GROUP && (GroupUtils.m178040b(chat) || chat.getAtAllPermission() == Chat.AtAllPermission.ALL_MEMBERS)) {
            list.add(m178475a(chat.getUserCount()));
        }
        return list;
    }

    /* renamed from: a */
    private List<BaseAtBean> m178477a(Chat chat, List<ChatChatter> list, List<BaseAtBean> list2) {
        String str;
        if ((chat.getType() == Chat.Type.GROUP || chat.getType() == Chat.Type.TOPIC_GROUP) && !CollectionUtils.isEmpty(list)) {
            list2.add(m178480b());
            int i = 1;
            for (ChatChatter chatChatter : list) {
                C44977a a = C44978b.m178402a(chat, chatChatter);
                WantAtMemBean wantAtMemBean = new WantAtMemBean(a);
                if (this.f113955f.containsKey(a.mo159184a())) {
                    str = this.f113955f.get(a.mo159184a());
                } else {
                    str = "";
                }
                wantAtMemBean.setGuessType(str);
                wantAtMemBean.setSearchLocation(String.valueOf(i));
                list2.add(wantAtMemBean);
                i++;
            }
        }
        return list2;
    }

    /* renamed from: a */
    private List<BaseAtBean> m178478a(Chat chat, List<ChatChatter> list, List<BaseAtBean> list2, boolean z) {
        if (list2.size() > 0 && chat.getType() == Chat.Type.GROUP) {
            list2.add(m178481c());
        }
        IGroupMemberManageModuleDependency.AbstractC44882e chatterNameDependency = GroupMemberManageModule.m177902a().getChatterNameDependency();
        chatterNameDependency.mo143791b(list);
        for (int i = 0; i < list.size(); i++) {
            ChatChatter chatChatter = list.get(i);
            GroupMemAtBean groupMemAtBean = new GroupMemAtBean(C44978b.m178402a(chat, chatChatter));
            groupMemAtBean.setLetter(chatterNameDependency.mo143788a(chatChatter, this.f113957h));
            list2.add(groupMemAtBean);
            if (z && i == list.size() - 1) {
                groupMemAtBean.showShadow(true);
            }
        }
        return list2;
    }

    public C45003a(Chat chat, List<ChatChatter> list, List<ChatChatter> list2, Map<String, String> map, boolean z) {
        this.f113950a = chat;
        CollectionUtils.resetToList(this.f113953d, list);
        CollectionUtils.resetToList(this.f113954e, list2);
        if (CollectionUtils.isNotEmpty(map)) {
            this.f113955f.putAll(map);
        }
        this.f113956g = z;
        this.f113957h = GroupMemberManageModule.m177902a().getLanguageSetting();
    }
}
