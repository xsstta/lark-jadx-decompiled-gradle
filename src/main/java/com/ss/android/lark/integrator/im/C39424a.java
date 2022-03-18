package com.ss.android.lark.integrator.im;

import android.content.Context;
import com.ss.android.lark.ccm_api.ICCMApi;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.keyboard.IPlusItem;
import com.ss.android.lark.chat.entity.p1664d.AbstractC33987b;
import com.ss.android.lark.chat.entity.p1667g.AbstractC33992b;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.dependency.AbstractC36498n;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.feed.p1871b.AbstractC38037a;
import com.ss.android.lark.integrator.im.dependency.AbstractC39571m;
import com.ss.android.lark.integrator.im.dependency.C39560c;
import com.ss.android.lark.integrator.im.dependency.C39563d;
import com.ss.android.lark.integrator.im.dependency.C39568j;
import com.ss.android.lark.utils.ApiUtils;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.integrator.im.a */
class C39424a implements AbstractC39571m {
    C39424a() {
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39571m
    /* renamed from: a */
    public void mo143296a(List<String> list) {
        ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).preloadDoc(list);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39571m
    /* renamed from: d */
    public AbstractC36498n mo143304d() {
        return new C39560c();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39571m
    /* renamed from: e */
    public AbstractC38037a.AbstractC38051k mo143305e() {
        return new C39568j();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39571m
    /* renamed from: f */
    public AbstractC36474h.AbstractC36479e mo143306f() {
        return new C39563d();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39571m
    /* renamed from: g */
    public Map<Integer, Integer> mo143307g() {
        return ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).getLayoutResIdMap();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39571m
    /* renamed from: c */
    public Map<String, String> mo143303c() {
        return ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).getDocArgsOther();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39571m
    /* renamed from: b */
    public Map<String, String> mo143299b() {
        return ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).getDocArgsMessageCard();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39571m
    /* renamed from: a */
    public Map<String, String> mo143290a() {
        return ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).getDocArgsMessage();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39571m
    /* renamed from: a */
    public int mo143287a(int i) {
        return ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).getDocInlineBlueIcon(i);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39571m
    /* renamed from: b */
    public int mo143297b(int i) {
        return ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).getDocInlineBlueIcon(i);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39571m
    /* renamed from: c */
    public int mo143302c(int i) {
        return ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).getDocInlineGrayIcon(i);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39571m
    /* renamed from: b */
    public void mo143300b(AbstractC33987b bVar) {
        ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).unRegisterAnnouncementCloseListener(bVar);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39571m
    /* renamed from: a */
    public Map<String, String> mo143291a(String str) {
        return ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).getDocArgs(str);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39571m
    /* renamed from: b */
    public void mo143301b(AbstractC33992b bVar) {
        ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).unRegisterPushSaveToNutStateListener(bVar);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39571m
    /* renamed from: a */
    public void mo143292a(long j) {
        ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).timingCleanData(j);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39571m
    /* renamed from: a */
    public void mo143294a(AbstractC33987b bVar) {
        ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).registerAnnouncementCloseListener(bVar);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39571m
    /* renamed from: a */
    public void mo143295a(AbstractC33992b bVar) {
        ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).registerPushSaveToNutStateListener(bVar);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39571m
    /* renamed from: a */
    public int mo143288a(int i, String str) {
        return ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).getDocIcon(i, str);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39571m
    /* renamed from: b */
    public int mo143298b(int i, String str) {
        return ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).getWikiIcon(i, str);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39571m
    /* renamed from: a */
    public IPlusItem mo143289a(Context context, Chat chat) {
        return ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).getSendKBPlugin(context, chat);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39571m
    /* renamed from: a */
    public void mo143293a(Context context, C36516a aVar, int i, String str, int i2, String str2) {
        ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).goDocsSelector(context, aVar, i, str, i2, str2);
    }
}
