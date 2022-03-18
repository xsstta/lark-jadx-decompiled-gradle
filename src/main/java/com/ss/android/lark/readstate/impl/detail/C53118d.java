package com.ss.android.lark.readstate.impl.detail;

import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.ding.entity.DingStatus;
import com.ss.android.lark.readstate.ReadStateModule;
import com.ss.android.lark.readstate.dto.MessageReadStateResponseDTO;
import com.ss.android.lark.readstate.impl.detail.C53111a;
import com.ss.android.lark.readstate.impl.detail.vo.SearchReadStateResult;
import com.ss.android.lark.readstate.impl.detail.vo.ShowReadStateResult;
import com.ss.android.lark.readstate.p2565b.C53097b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.readstate.impl.detail.d */
public class C53118d extends BaseModel implements C53111a.AbstractC53112a {

    /* renamed from: a */
    private String f131366a;

    /* renamed from: b */
    private String f131367b;

    /* renamed from: c */
    private List<String> f131368c;

    /* renamed from: d */
    private String f131369d;

    /* renamed from: e */
    private boolean f131370e;

    /* renamed from: f */
    private Message.Type f131371f;

    /* renamed from: a */
    private List<C53123f> m205619a(C53097b bVar) {
        List<ChatChatter> c = bVar.mo181367c();
        List<ChatChatter> b = bVar.mo181366b();
        ArrayList arrayList = new ArrayList(b.size() + c.size());
        for (ChatChatter chatChatter : c) {
            C53123f fVar = new C53123f(chatChatter.getId());
            fVar.f131382g = 7;
            fVar.f131376a = false;
            fVar.f131381f = chatChatter;
            fVar.f131377b = m205623a(this.f131368c, chatChatter.getId());
            arrayList.add(fVar);
        }
        for (ChatChatter chatChatter2 : b) {
            C53123f fVar2 = new C53123f(chatChatter2.getId());
            fVar2.f131382g = 7;
            fVar2.f131376a = false;
            fVar2.f131377b = m205623a(this.f131368c, chatChatter2.getId());
            fVar2.f131379d = true;
            fVar2.f131381f = chatChatter2;
            arrayList.add(fVar2);
        }
        return arrayList;
    }

    /* renamed from: b */
    private ShowReadStateResult m205624b(IGetDataCallback<ShowReadStateResult> iGetDataCallback) {
        DingStatus a = ReadStateModule.m205502a().mo144088a(this.f131367b);
        if (a == null) {
            iGetDataCallback.onError(new ErrorResult("cannot get read state"));
            return null;
        }
        List<String> confirmedChatterIds = a.getConfirmedChatterIds();
        List<String> unconfirmedChatterIds = a.getUnconfirmedChatterIds();
        Map<String, ChatChatter> a2 = m205621a(confirmedChatterIds, unconfirmedChatterIds);
        List<ChatChatter> a3 = m205620a(confirmedChatterIds, a2);
        List<ChatChatter> a4 = m205620a(unconfirmedChatterIds, a2);
        return new ShowReadStateResult(ReadStateEntityParser.f131385a.mo181442a(4, this.f131371f, a3, new HashSet()), ReadStateEntityParser.f131385a.mo181442a(2, this.f131371f, a4, new HashSet()), confirmedChatterIds.size(), a4.size(), false, false, 2, "", "");
    }

    /* renamed from: a */
    private ShowReadStateResult m205618a(IGetDataCallback<ShowReadStateResult> iGetDataCallback) {
        MessageReadStateResponseDTO a = ReadStateModule.m205502a().mo144089a(this.f131367b, 0, "");
        if (a == null) {
            iGetDataCallback.onError(new ErrorResult("cannot get read state"));
            return null;
        }
        List<C53123f> a2 = ReadStateEntityParser.f131385a.mo181442a(4, this.f131371f, a.mo181352a(), a.mo181354c());
        List<C53123f> a3 = ReadStateEntityParser.f131385a.mo181442a(2, this.f131371f, a.mo181353b(), a.mo181354c());
        if (a.mo181360h() > 1) {
            if (a.mo181355d() > a2.size() && a.mo181359g() && TextUtils.isEmpty(a.mo181362i())) {
                m205622a(a2, 6);
            }
            if (a.mo181356e() > a3.size() && a.mo181359g() && TextUtils.isEmpty(a.mo181363j())) {
                m205622a(a3, 5);
            }
        }
        return new ShowReadStateResult(a2, a3, a.mo181355d(), a.mo181356e(), a.mo181358f(), a.mo181359g(), a.mo181360h(), a.mo181362i(), a.mo181363j());
    }

    /* renamed from: a */
    private boolean m205623a(List<String> list, String str) {
        if (list == null || !list.contains(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private Map<String, ChatChatter> m205621a(List<String> list, List<String> list2) {
        HashSet hashSet = new HashSet();
        hashSet.addAll(list);
        hashSet.addAll(list2);
        return ReadStateModule.m205502a().mo144092a(this.f131366a, new ArrayList(hashSet));
    }

    /* renamed from: a */
    private List<ChatChatter> m205620a(List<String> list, Map<String, ChatChatter> map) {
        ArrayList arrayList = new ArrayList(list.size());
        for (String str : list) {
            ChatChatter chatChatter = map.get(str);
            if (chatChatter != null) {
                arrayList.add(chatChatter);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private static void m205622a(List<C53123f> list, int i) {
        if (list.size() > 0) {
            list.get(list.size() - 1).f131378c = true;
            C53123f fVar = new C53123f("");
            fVar.f131382g = i;
            list.add(fVar);
        }
    }

    @Override // com.ss.android.lark.readstate.impl.detail.C53111a.AbstractC53112a
    /* renamed from: a */
    public void mo181417a(C53117c cVar, IGetDataCallback<ShowReadStateResult> iGetDataCallback) {
        this.f131366a = cVar.f131363c;
        this.f131367b = cVar.f131365e;
        this.f131368c = cVar.f131364d;
        this.f131370e = cVar.f131362b;
        this.f131371f = cVar.f131361a;
        if (this.f131370e) {
            ShowReadStateResult b = m205624b(iGetDataCallback);
            if (b != null) {
                iGetDataCallback.onSuccess(b);
                return;
            }
            return;
        }
        ShowReadStateResult a = m205618a(iGetDataCallback);
        if (a != null) {
            iGetDataCallback.onSuccess(a);
        }
    }

    @Override // com.ss.android.lark.readstate.impl.detail.C53111a.AbstractC53112a
    /* renamed from: a */
    public void mo181418a(String str, IGetDataCallback<SearchReadStateResult> iGetDataCallback) {
        this.f131369d = str;
        C53097b a = ReadStateModule.m205502a().mo144090a(this.f131367b, str);
        if (a != null && this.f131369d.equals(a.mo181365a())) {
            iGetDataCallback.onSuccess(new SearchReadStateResult(a.mo181365a(), m205619a(a)));
        }
    }
}
