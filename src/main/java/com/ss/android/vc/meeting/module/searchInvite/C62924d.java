package com.ss.android.vc.meeting.module.searchInvite;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.dto.BaseSearchInfo;
import com.ss.android.vc.dto.SearchParticipantInfo;
import com.ss.android.vc.dto.SearchResponse;
import com.ss.android.vc.dto.VideoChatSearchChatterResponse;
import com.ss.android.vc.entity.InviteDialogBean;
import com.ss.android.vc.meeting.module.searchInvite.AbstractC62918b;
import com.ss.android.vc.net.service.VcBizService;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.vc.meeting.module.searchInvite.d */
public class C62924d extends BaseModel implements AbstractC62918b.AbstractC62919a {

    /* renamed from: a */
    protected int f158484a;

    /* renamed from: b */
    protected boolean f158485b = true;

    /* renamed from: c */
    protected String f158486c = "";

    /* renamed from: d */
    public List<SearchParticipantInfo> f158487d = new ArrayList();

    /* renamed from: e */
    private String f158488e;

    /* renamed from: f */
    private String f158489f;

    /* renamed from: g */
    private String f158490g;

    /* renamed from: h */
    private int f158491h;

    /* renamed from: i */
    private int f158492i;

    /* renamed from: j */
    private InviteDialogBean.fromType f158493j;

    /* renamed from: k */
    private String f158494k;

    @Override // com.ss.android.vc.meeting.module.searchInvite.AbstractC62918b.AbstractC62919a
    /* renamed from: a */
    public String mo217419a() {
        return this.f158486c;
    }

    @Override // com.ss.android.vc.meeting.module.searchInvite.AbstractC62918b.AbstractC62919a
    /* renamed from: b */
    public void mo217421b() {
        this.f158484a = 0;
        this.f158487d.clear();
    }

    /* renamed from: a */
    private UIGetDataCallback<VideoChatSearchChatterResponse> m246370a(final AbstractC62918b.AbstractC62919a.AbstractC62920a<List<SearchParticipantInfo>> aVar) {
        return getCallbackManager().wrapAndAddGetDataCallback(new IGetDataCallback<VideoChatSearchChatterResponse>() {
            /* class com.ss.android.vc.meeting.module.searchInvite.C62924d.C629251 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                aVar.mo217423a(errorResult);
            }

            /* renamed from: a */
            public void onSuccess(VideoChatSearchChatterResponse videoChatSearchChatterResponse) {
                SearchResponse searchResponse = videoChatSearchChatterResponse.getSearchResponse();
                if (C62924d.this.f158486c.equals(searchResponse.getSearchKey())) {
                    C62924d.this.f158485b = searchResponse.isHasMore();
                    List<BaseSearchInfo> metaList = searchResponse.getMetaList();
                    if (C62924d.this.f158484a == 0 && metaList.size() == 0) {
                        aVar.mo217425a(C62924d.this.f158486c);
                        return;
                    }
                    C62924d dVar = C62924d.this;
                    dVar.f158487d = dVar.mo217432a(metaList);
                    aVar.mo217424a(C62924d.this.f158487d);
                    C62924d.this.f158484a += 50;
                }
            }
        });
    }

    public C62924d(InviteDialogBean inviteDialogBean) {
        m246371a(inviteDialogBean);
    }

    /* renamed from: a */
    public List<SearchParticipantInfo> mo217432a(List<BaseSearchInfo> list) {
        for (BaseSearchInfo baseSearchInfo : list) {
            if (baseSearchInfo instanceof SearchParticipantInfo) {
                this.f158487d.add((SearchParticipantInfo) baseSearchInfo);
            }
        }
        return this.f158487d;
    }

    /* renamed from: a */
    private void m246371a(InviteDialogBean inviteDialogBean) {
        this.f158488e = inviteDialogBean.getChatId();
        this.f158490g = inviteDialogBean.getMeetingId();
        this.f158491h = inviteDialogBean.getInMeetingUserCount();
        this.f158493j = inviteDialogBean.getFrom();
        this.f158489f = inviteDialogBean.getMeetingId();
        this.f158494k = inviteDialogBean.getBreakoutRoomId();
        C60700b.m235851b("VCInviteModel", "[initData]", "getChatId=" + this.f158488e + ", conferenceId=" + this.f158490g + ", maxMeetingUserCount=" + this.f158492i + ", inMeetingUserCount=" + this.f158491h + ", pageFrom=" + this.f158493j + ", breakoutRoomid=" + this.f158494k);
        this.f158492i = inviteDialogBean.getMaxMeetingUserCount();
    }

    @Override // com.ss.android.vc.meeting.module.searchInvite.AbstractC62918b.AbstractC62919a
    /* renamed from: a */
    public void mo217420a(String str, AbstractC62918b.AbstractC62919a.AbstractC62920a<List<SearchParticipantInfo>> aVar) {
        this.f158486c = str;
        String locale = VideoChatModuleDependency.getLanguageDependency().getCacheLanguageSetting().toString();
        C60700b.m235851b("VCInviteModel", "[search]", "searchVideoChatChatters locale=" + locale);
        VcBizService.searchUserInMeeting(new VCInviteModel$1(this, m246370a(aVar)), str, this.f158494k, 50);
    }

    @Override // com.ss.android.vc.meeting.module.searchInvite.AbstractC62918b.AbstractC62919a
    /* renamed from: b */
    public void mo217422b(String str, AbstractC62918b.AbstractC62919a.AbstractC62920a<List<SearchParticipantInfo>> aVar) {
        this.f158486c = str;
        String locale = VideoChatModuleDependency.getLanguageDependency().getCacheLanguageSetting().toString();
        C60700b.m235851b("VCInviteModel", "[searchRealInMeeting]", "searchVideoChatChatters locale=" + locale);
        VcBizService.searchUserRealInMeeting(new VCInviteModel$2(this, m246370a(aVar)), str, this.f158494k, 50);
    }
}
