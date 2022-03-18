package com.bytedance.ee.bear.document.at;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.bytedance.ee.bear.at.AtObject;
import com.bytedance.ee.bear.at.C4227b;
import com.bytedance.ee.bear.atfinder.AtFinderResultList;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.ao;
import com.bytedance.ee.bear.document.AbstractC6158t;
import com.bytedance.ee.bear.p526r.C10599b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p705h.C13666a;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.document.at.c */
public class C5663c implements NetService.AbstractC5074c<AtFinderNetServiceResult> {

    /* renamed from: a */
    private String f16020a;

    /* renamed from: b */
    private Context f16021b;

    /* renamed from: a */
    public AtFinderNetServiceResult parse(String str) {
        AtFinderNetServiceResult atFinderNetServiceResult = new AtFinderNetServiceResult();
        try {
            atFinderNetServiceResult.list = m22975a((AtFinderResultList) JSON.parseObject(str, AtFinderResultList.class));
        } catch (Exception e) {
            C13479a.m54766b("AtFinderResultParser", e);
        }
        return atFinderNetServiceResult;
    }

    /* renamed from: b */
    private String m22977b(AtObject atObject) {
        if (atObject == null) {
            return "";
        }
        return C13666a.m55443a(this.f16020a, atObject.getCn_name(), atObject.getEn_name());
    }

    /* renamed from: a */
    private String m22974a(AtObject atObject) {
        if (atObject == null) {
            return this.f16021b.getResources().getString(R.string.Doc_Facade_UntitledDocument);
        }
        if (TextUtils.isEmpty(atObject.getTitle())) {
            return C4227b.m17589b().mo16657a().mo16660a(this.f16021b, atObject.getType());
        }
        return atObject.getTitle();
    }

    /* renamed from: a */
    private List<AtObject> m22975a(AtFinderResultList atFinderResultList) {
        ArrayList arrayList = new ArrayList();
        if (atFinderResultList == null) {
            C13479a.m54772d("AtFinderResultParser", "reBuildResult: params is null");
            return arrayList;
        }
        try {
            List<AtObject> result_list = atFinderResultList.getData().getResult_list();
            Map<String, AtObject> users = atFinderResultList.getData().getEntities().getUsers();
            Map<String, AtObject> notes = atFinderResultList.getData().getEntities().getNotes();
            Map<String, AtObject> chats = atFinderResultList.getData().getEntities().getChats();
            Map<String, AtObject> groups = atFinderResultList.getData().getEntities().getGroups();
            for (int i = 0; i < result_list.size(); i++) {
                AtObject atObject = null;
                int type = result_list.get(i).getType();
                if (C10599b.m43907c(type)) {
                    if (!((AbstractC6158t) KoinJavaComponent.m268610a(AbstractC6158t.class)).mo20318b(type)) {
                        atObject = m22976b(notes, result_list.get(i).getToken());
                    }
                } else if (type == 0) {
                    atObject = m22973a(users, result_list.get(i).getToken());
                } else if (type == 5) {
                    atObject = m22978c(chats, result_list.get(i).getToken());
                } else if (type == 6) {
                    atObject = m22978c(groups, result_list.get(i).getToken());
                }
                if (atObject == null) {
                    C13479a.m54764b("AtFinderResultParser", "reBuildResult: value is null");
                } else {
                    arrayList.add(atObject);
                }
            }
        } catch (Exception e) {
            C13479a.m54773d("AtFinderResultParser", "reBuildResult: ", e);
        }
        return arrayList;
    }

    public C5663c(Context context, ao aoVar) {
        this.f16021b = context;
        this.f16020a = aoVar.mo17252c();
    }

    /* renamed from: b */
    private AtObject m22976b(Map<String, AtObject> map, String str) {
        AtObject atObject;
        if (map == null || map.size() == 0 || (atObject = map.get(str)) == null) {
            return null;
        }
        atObject.setToken(str);
        atObject.setContent(m22974a(atObject));
        return atObject;
    }

    /* renamed from: a */
    private AtObject m22973a(Map<String, AtObject> map, String str) {
        AtObject atObject;
        if (map == null || map.size() == 0 || (atObject = map.get(str)) == null) {
            return null;
        }
        atObject.setToken(str);
        atObject.setContent(m22977b(atObject));
        atObject.setUrl(atObject.getAvatar_url());
        return atObject;
    }

    /* renamed from: c */
    private AtObject m22978c(Map<String, AtObject> map, String str) {
        AtObject atObject;
        if (map == null || map.size() == 0 || (atObject = map.get(str)) == null) {
            return null;
        }
        atObject.setToken(str);
        atObject.setContent(atObject.getName());
        atObject.setUrl(atObject.getAvatar_url());
        return atObject;
    }
}
