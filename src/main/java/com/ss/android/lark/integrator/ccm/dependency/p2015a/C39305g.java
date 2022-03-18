package com.ss.android.lark.integrator.ccm.dependency.p2015a;

import com.bytedance.ee.bear.contract.AbstractC5080aa;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.Doc;
import com.bytedance.lark.pb.space.doc.v1.RemoveDocRequest;
import com.bytedance.lark.pb.space.doc.v1.RemoveDocResponse;
import com.bytedance.lark.pb.space.doc.v1.UpdateDocMeReadRequest;
import com.bytedance.lark.pb.space.doc.v1.UpdateDocMeReadResponse;
import com.bytedance.lark.pb.space.doc.v1.UpdateDocMessageBadgeRequest;
import com.bytedance.lark.pb.space.doc.v1.UpdateDocMessageBadgeResponse;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.doc.entity.DocType;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sdk.SdkSender;
import java.io.IOException;
import java.util.List;

/* renamed from: com.ss.android.lark.integrator.ccm.dependency.a.g */
class C39305g implements AbstractC5080aa.AbstractC5081a {
    C39305g() {
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5080aa
    public void remove(String str) {
        m155032a(str, new IGetDataCallback<Boolean>() {
            /* class com.ss.android.lark.integrator.ccm.dependency.p2015a.C39305g.C393083 */

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                Log.m165389i("BadgeAgentImpl", "remove doc feed success");
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165389i("BadgeAgentImpl", "remove doc feed failed!");
            }
        });
    }

    /* renamed from: a */
    private DocType m155030a(int i) {
        DocType docType = DocType.UNKNOWN_DOC_TYPE;
        if (i == C8275a.f22371d.mo32555b()) {
            return DocType.DOC;
        }
        if (i == C8275a.f22372e.mo32555b()) {
            return DocType.SHEET;
        }
        if (i == C8275a.f22373f.mo32555b()) {
            return DocType.BITABLE;
        }
        if (i == C8275a.f22375h.mo32555b()) {
            return DocType.FILE;
        }
        if (i == C8275a.f22374g.mo32555b()) {
            return DocType.MINDNOTE;
        }
        if (i == C8275a.f22376i.mo32555b()) {
            return DocType.SLIDE;
        }
        if (i == C8275a.f22378k.mo32555b()) {
            return DocType.DOCX;
        }
        return docType;
    }

    /* renamed from: a */
    private void m155032a(String str, IGetDataCallback<Boolean> iGetDataCallback) {
        Log.m165389i("BadgeAgentImpl", "remove doc: ");
        SdkSender.asynSendRequestNonWrap(Command.REMOVE_DOC, new RemoveDocRequest.C19273a().mo65746a(str), iGetDataCallback, new SdkSender.IParser<Boolean>() {
            /* class com.ss.android.lark.integrator.ccm.dependency.p2015a.C39305g.C393094 */

            /* renamed from: a */
            public Boolean parse(byte[] bArr) throws IOException {
                RemoveDocResponse.ADAPTER.decode(bArr);
                return true;
            }
        });
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5080aa
    public void read(String str, int i, final List<String> list) {
        m155033a(str, list, m155030a(i), new IGetDataCallback<Boolean>() {
            /* class com.ss.android.lark.integrator.ccm.dependency.p2015a.C39305g.C393061 */

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                Log.m165389i("BadgeAgentImpl", "updateDocMessageMeRead " + list);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165389i("BadgeAgentImpl", "updateDocMessageMeRead failed:" + errorResult.toString());
            }
        });
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5080aa
    public void updateBadge(String str, final long j, final long j2) {
        m155031a(str, j, j2, new IGetDataCallback<Boolean>() {
            /* class com.ss.android.lark.integrator.ccm.dependency.p2015a.C39305g.C393105 */

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                Log.m165389i("BadgeAgentImpl", "update badge success: " + j + ", version=" + j2);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165389i("BadgeAgentImpl", "update badge failed" + j + ", version=" + j2);
            }
        });
    }

    /* renamed from: a */
    private void m155033a(String str, List<String> list, DocType docType, IGetDataCallback<Boolean> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.UPDATE_DOC_ME_READ, new UpdateDocMeReadRequest.C19281a().mo65765a(Doc.Type.fromValue(docType.getNumber())).mo65767a(list).mo65766a(str), iGetDataCallback, new SdkSender.IParser<Boolean>() {
            /* class com.ss.android.lark.integrator.ccm.dependency.p2015a.C39305g.C393072 */

            /* renamed from: a */
            public Boolean parse(byte[] bArr) throws IOException {
                UpdateDocMeReadResponse.ADAPTER.decode(bArr);
                return true;
            }
        });
    }

    /* renamed from: a */
    private void m155031a(String str, long j, long j2, IGetDataCallback<Boolean> iGetDataCallback) {
        Log.m165389i("BadgeAgentImpl", "update badge:" + j + ", version=" + j2);
        SdkSender.asynSendRequestNonWrap(Command.UPDATE_DOC_MESSAGE_BADGE, new UpdateDocMessageBadgeRequest.C19285a().mo65777a(str).mo65776a(Integer.valueOf((int) j)).mo65779b(Integer.valueOf((int) j2)), iGetDataCallback, new SdkSender.IParser<Boolean>() {
            /* class com.ss.android.lark.integrator.ccm.dependency.p2015a.C39305g.C393116 */

            /* renamed from: a */
            public Boolean parse(byte[] bArr) throws IOException {
                UpdateDocMessageBadgeResponse.ADAPTER.decode(bArr);
                return true;
            }
        });
    }
}
