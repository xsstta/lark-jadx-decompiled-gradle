package com.bytedance.ee.bear.bitable.card.viewmodel.p268b;

import com.bytedance.ee.bear.bitable.card.model.enums.ECardOperation;
import com.bytedance.ee.bear.bitable.card.model.enums.EFieldType;
import com.bytedance.ee.bear.bitable.card.model.enums.ETableType;
import com.bytedance.ee.bear.bitable.card.model.jsmodel.CardOperationModel;
import com.bytedance.ee.bear.bitable.card.model.jsmodel.cellvalue.SegmentTransformer;
import com.bytedance.ee.bear.bitable.card.model.jsmodel.cellvalue.UserList;
import com.bytedance.ee.bear.bitable.card.model.stmodel.C4535b;
import com.bytedance.ee.bear.bitable.card.model.stmodel.p257a.C4533g;
import com.bytedance.ee.bear.bitable.card.performance.EditRecordPerformanceTracker;
import com.bytedance.ee.bear.browser.AbstractC4931i;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.p398i.C7827a;
import com.bytedance.ee.log.C13479a;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.bitable.card.viewmodel.b.a */
public class C4773a implements AbstractC4774b {

    /* renamed from: a */
    private AbstractC4931i f14028a;

    /* renamed from: b */
    private AbstractC7947h f14029b;

    @Override // com.bytedance.ee.bear.bitable.card.viewmodel.p268b.AbstractC4774b
    /* renamed from: a */
    public void mo18616a(String str, String str2, String str3, String str4) {
        CardOperationModel cardOperationModel = new CardOperationModel(str, str2, ECardOperation.FORWARD_LINK_TABLE);
        cardOperationModel.setPayload(m19683e(str3, str4));
        AbstractC7947h hVar = this.f14029b;
        if (hVar != null) {
            hVar.mo17189a(cardOperationModel);
        }
        C13479a.m54764b("BitableOperationUpdater_callback", ECardOperation.FORWARD_LINK_TABLE.toString());
    }

    @Override // com.bytedance.ee.bear.bitable.card.viewmodel.p268b.AbstractC4774b
    /* renamed from: a */
    public void mo18613a(C4535b bVar, String str, String str2, C4535b bVar2, String str3, Object obj) {
        CardOperationModel cardOperationModel = new CardOperationModel(bVar.mo17757a(), bVar.mo17767b(), ECardOperation.ADD_LINKED_RECORD);
        CardOperationModel.PayloadBean payloadBean = new CardOperationModel.PayloadBean();
        CardOperationModel.PayloadBean.TargetBean targetBean = new CardOperationModel.PayloadBean.TargetBean(bVar2.mo17767b(), bVar2.mo17775e().mo17793b());
        targetBean.setBaseId(bVar2.mo17757a());
        targetBean.setFieldId(str3);
        payloadBean.setTarget(targetBean);
        payloadBean.setValue(m19682a(bVar2.mo17779g(str3), obj));
        payloadBean.setLinkSourceInfoBean(new CardOperationModel.PayloadBean.LinkSourceInfoBean(bVar.mo17757a(), bVar.mo17767b(), str, str2));
        cardOperationModel.setPayload(payloadBean);
        AbstractC7947h hVar = this.f14029b;
        if (hVar != null) {
            hVar.mo17189a(cardOperationModel);
        }
        C13479a.m54764b("BitableOperationUpdater_callback", ECardOperation.ADD_LINKED_RECORD.toString());
    }

    @Override // com.bytedance.ee.bear.bitable.card.viewmodel.p268b.AbstractC4774b
    /* renamed from: a */
    public void mo18614a(AbstractC7947h hVar) {
        this.f14029b = hVar;
    }

    public C4773a(AbstractC4931i iVar) {
        this.f14028a = iVar;
    }

    @Override // com.bytedance.ee.bear.bitable.card.viewmodel.p268b.AbstractC4774b
    /* renamed from: a */
    public void mo18608a(C4535b bVar) {
        CardOperationModel cardOperationModel = new CardOperationModel(bVar.mo17757a(), bVar.mo17767b(), ECardOperation.OPEN);
        AbstractC7947h hVar = this.f14029b;
        if (hVar != null) {
            hVar.mo17189a(cardOperationModel);
        }
        C13479a.m54764b("BitableOperationUpdater_callback", ECardOperation.OPEN.toString());
    }

    /* renamed from: e */
    private CardOperationModel.PayloadBean m19683e(String str, String str2) {
        CardOperationModel.PayloadBean payloadBean = new CardOperationModel.PayloadBean();
        payloadBean.setBaseId(str);
        payloadBean.setTableId(str2);
        return payloadBean;
    }

    @Override // com.bytedance.ee.bear.bitable.card.viewmodel.p268b.AbstractC4774b
    /* renamed from: a */
    public void mo18615a(String str, String str2) {
        CardOperationModel cardOperationModel = new CardOperationModel(str, str2, ECardOperation.EXIT);
        AbstractC7947h hVar = this.f14029b;
        if (hVar != null) {
            hVar.mo17189a(cardOperationModel);
        }
        C13479a.m54764b("BitableOperationUpdater_callback", ECardOperation.EXIT.toString());
    }

    @Override // com.bytedance.ee.bear.bitable.card.viewmodel.p268b.AbstractC4774b
    /* renamed from: b */
    public void mo18617b(String str, String str2) {
        CardOperationModel cardOperationModel = new CardOperationModel(str, str2, ECardOperation.CONFIRM);
        AbstractC7947h hVar = this.f14029b;
        if (hVar != null) {
            hVar.mo17189a(cardOperationModel);
        }
        C13479a.m54764b("BitableOperationUpdater_callback", ECardOperation.CONFIRM.toString());
    }

    @Override // com.bytedance.ee.bear.bitable.card.viewmodel.p268b.AbstractC4774b
    /* renamed from: c */
    public void mo18619c(String str, String str2) {
        CardOperationModel cardOperationModel = new CardOperationModel(str, str2, ECardOperation.CANCEL);
        AbstractC7947h hVar = this.f14029b;
        if (hVar != null) {
            hVar.mo17189a(cardOperationModel);
        }
        C13479a.m54764b("BitableOperationUpdater_callback", ECardOperation.CANCEL.toString());
    }

    @Override // com.bytedance.ee.bear.bitable.card.viewmodel.p268b.AbstractC4774b
    /* renamed from: d */
    public void mo18620d(String str, String str2) {
        CardOperationModel cardOperationModel = new CardOperationModel(str, str2, ECardOperation.CONFIRM_FORM);
        AbstractC7947h hVar = this.f14029b;
        if (hVar != null) {
            hVar.mo17189a(cardOperationModel);
        }
        C13479a.m54764b("BitableOperationUpdater_callback", ECardOperation.CONFIRM_FORM.toString());
    }

    /* renamed from: a */
    private Object m19682a(C4533g gVar, Object obj) {
        if (gVar.mo17752i() != null) {
            EFieldType i = gVar.mo17752i();
            if (i == EFieldType.TEXT) {
                return SegmentTransformer.m18731a((C7827a) obj);
            }
            if (i == EFieldType.USER) {
                return new UserList((List) obj);
            }
        }
        return obj;
    }

    @Override // com.bytedance.ee.bear.bitable.card.viewmodel.p268b.AbstractC4774b
    /* renamed from: a */
    public void mo18609a(C4535b bVar, C4535b bVar2, String str) {
        CardOperationModel cardOperationModel = new CardOperationModel(bVar.mo17757a(), bVar.mo17767b(), ECardOperation.DELETE_RECORD);
        CardOperationModel.PayloadBean payloadBean = new CardOperationModel.PayloadBean();
        CardOperationModel.PayloadBean.TargetBean targetBean = new CardOperationModel.PayloadBean.TargetBean(bVar2.mo17767b(), bVar2.mo17775e().mo17793b());
        targetBean.setRecordId(str);
        payloadBean.setTarget(targetBean);
        cardOperationModel.setPayload(payloadBean);
        AbstractC7947h hVar = this.f14029b;
        if (hVar != null) {
            hVar.mo17189a(cardOperationModel);
        }
        C13479a.m54764b("BitableOperationUpdater_callback", ECardOperation.DELETE_RECORD.toString());
    }

    @Override // com.bytedance.ee.bear.bitable.card.viewmodel.p268b.AbstractC4774b
    /* renamed from: a */
    public void mo18612a(C4535b bVar, String str, String str2) {
        CardOperationModel cardOperationModel = new CardOperationModel(bVar.mo17757a(), bVar.mo17767b(), ECardOperation.SWITCH);
        CardOperationModel.PayloadBean payloadBean = new CardOperationModel.PayloadBean();
        payloadBean.setOldRecordId(str);
        payloadBean.setNewRecordId(str2);
        cardOperationModel.setPayload(payloadBean);
        AbstractC7947h hVar = this.f14029b;
        if (hVar != null) {
            hVar.mo17189a(cardOperationModel);
        }
        C13479a.m54764b("BitableOperationUpdater_callback", ECardOperation.SWITCH.toString());
    }

    @Override // com.bytedance.ee.bear.bitable.card.viewmodel.p268b.AbstractC4774b
    /* renamed from: b */
    public void mo18618b(String str, String str2, String str3, String str4) {
        CardOperationModel cardOperationModel = new CardOperationModel(str, str2, ECardOperation.BACKWARD_LINK_TABLE);
        cardOperationModel.setPayload(m19683e(str3, str4));
        AbstractC7947h hVar = this.f14029b;
        if (hVar != null) {
            hVar.mo17189a(cardOperationModel);
        }
        C13479a.m54764b("BitableOperationUpdater_callback", ECardOperation.BACKWARD_LINK_TABLE.toString());
    }

    @Override // com.bytedance.ee.bear.bitable.card.viewmodel.p268b.AbstractC4774b
    /* renamed from: a */
    public void mo18611a(C4535b bVar, C4535b bVar2, String str, String str2, boolean z) {
        CardOperationModel cardOperationModel = new CardOperationModel(bVar.mo17757a(), bVar.mo17767b());
        CardOperationModel.PayloadBean payloadBean = new CardOperationModel.PayloadBean();
        CardOperationModel.PayloadBean.TargetBean targetBean = new CardOperationModel.PayloadBean.TargetBean(bVar2.mo17767b(), bVar2.mo17775e().mo17793b());
        targetBean.setRecordId(str2);
        targetBean.setFieldId(str);
        payloadBean.setTarget(targetBean);
        payloadBean.setNotify(z);
        cardOperationModel.setPayload(payloadBean);
        AbstractC4931i iVar = this.f14028a;
        if (iVar != null) {
            iVar.mo19433a("javascript:window.lark.biz.bitable.closeEditPanel", cardOperationModel);
        }
        C13479a.m54764b("BitableOperationUpdater_callback", "closeEditPanel");
    }

    @Override // com.bytedance.ee.bear.bitable.card.viewmodel.p268b.AbstractC4774b
    /* renamed from: a */
    public void mo18610a(C4535b bVar, C4535b bVar2, String str, String str2, String str3, Object obj) {
        long currentTimeMillis = System.currentTimeMillis();
        CardOperationModel cardOperationModel = new CardOperationModel(bVar.mo17757a(), bVar.mo17767b(), ECardOperation.EDIT_RECORD);
        cardOperationModel.setTransactionId(currentTimeMillis + str2);
        cardOperationModel.setTimestamp(currentTimeMillis);
        CardOperationModel.PayloadBean payloadBean = new CardOperationModel.PayloadBean();
        CardOperationModel.PayloadBean.TargetBean targetBean = new CardOperationModel.PayloadBean.TargetBean(bVar2.mo17767b(), bVar2.mo17775e().mo17793b());
        targetBean.setRecordId(str2);
        targetBean.setFieldId(str);
        payloadBean.setTarget(targetBean);
        payloadBean.setType(str3);
        payloadBean.setValue(m19682a(bVar2.mo17779g(str), obj));
        cardOperationModel.setPayload(payloadBean);
        AbstractC7947h hVar = this.f14029b;
        if (hVar != null) {
            hVar.mo17189a(cardOperationModel);
            if (bVar.mo17788m() == ETableType.NORMAL) {
                EditRecordPerformanceTracker.f13261a.mo17434a().mo17429a(bVar.mo17767b(), bVar.mo17775e().mo17793b(), str2, str, bVar2.mo17779g(str).mo17752i().toString().toLowerCase(), cardOperationModel.getTransactionId(), cardOperationModel.getTimestamp());
            }
        }
        C13479a.m54764b("BitableOperationUpdater_callback", ECardOperation.EDIT_RECORD.toString());
    }
}
