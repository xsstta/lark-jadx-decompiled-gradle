package com.ss.android.lark.mail.impl.mulprocess.mainprocess.imp;

import android.content.Context;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.mail.impl.entity.CreateDraft;
import com.ss.android.lark.mail.impl.entity.MailDraft;
import com.ss.android.lark.mail.impl.entity.MailMessage;
import com.ss.android.lark.mail.impl.mulprocess.entity.ByteArray;
import com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService;
import com.ss.android.lark.mail.impl.p2168g.C42164c;
import com.ss.android.lark.mail.impl.p2168g.p2169a.C42130j;
import com.ss.android.lark.manis.annotation.RemoteServiceImpl;
import com.ss.android.lark.sdk.SdkSender;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RemoteServiceImpl(service = IRustService.class)
public class RustServiceImp implements IRustService {
    C42130j mConverterHelper = C42130j.m168150a();

    private IGetDataCallback createIGetDataCallback(final IRustService.AbstractC43219a aVar) {
        return new IGetDataCallback() {
            /* class com.ss.android.lark.mail.impl.mulprocess.mainprocess.imp.RustServiceImp.C432211 */

            @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
            public void onSuccess(Object obj) {
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IRustService.AbstractC43219a aVar = aVar;
                if (aVar != null) {
                    aVar.onFail();
                }
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.larksuite.framework.callback.IRequestCallback
            public void onError(ErrorResult errorResult) {
                IRustService.AbstractC43219a aVar = aVar;
                if (aVar != null) {
                    aVar.onFail();
                }
            }
        };
    }

    private SdkSender.IParser<byte[]> createIParser(final IRustService.AbstractC43219a aVar) {
        return new SdkSender.IParser<byte[]>() {
            /* class com.ss.android.lark.mail.impl.mulprocess.mainprocess.imp.RustServiceImp.C432222 */

            /* renamed from: a */
            public byte[] parse(byte[] bArr) throws IOException {
                if (aVar != null) {
                    ByteArray byteArray = new ByteArray();
                    byteArray.mo154622a(bArr);
                    aVar.onSuc(byteArray);
                }
                return bArr;
            }
        };
    }

    public RustServiceImp(Context context) {
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void fetchIsLastVersionNewUser(IRustService.AbstractC43219a aVar) {
        C42164c.m168263a(createIGetDataCallback(aVar), createIParser(aVar));
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public ByteArray getNetMailContactsList(String str, int i) {
        return C42164c.m168260a(str, i);
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void cancelShareThread(String str, IRustService.AbstractC43219a aVar) {
        C42164c.m168302g(str, createIGetDataCallback(aVar), createIParser(aVar));
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void createDraft(CreateDraft createDraft, IRustService.AbstractC43219a aVar) {
        C42164c.m168264a(createDraft, createIGetDataCallback(aVar), createIParser(aVar));
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void createShareMessageDraft(CreateDraft createDraft, IRustService.AbstractC43219a aVar) {
        C42164c.m168286b(createDraft, createIGetDataCallback(aVar), createIParser(aVar));
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void deleteExternalAddress(String str, IRustService.AbstractC43219a aVar) {
        C42164c.m168287b(str, createIGetDataCallback(aVar), createIParser(aVar));
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void fetchCollaboratorList(String str, IRustService.AbstractC43219a aVar) {
        C42164c.m168300f(str, createIGetDataCallback(aVar), createIParser(aVar));
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void fetchDocInfo(List<String> list, IRustService.AbstractC43219a aVar) {
        C42164c.m168281a(list, createIGetDataCallback(aVar), createIParser(aVar));
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void fetchRecallDetail(String str, IRustService.AbstractC43219a aVar) {
        C42164c.m168303h(str, createIGetDataCallback(aVar), createIParser(aVar));
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void fetchSendStatus(String str, IRustService.AbstractC43219a aVar) {
        C42164c.m168287b(str, createIGetDataCallback(aVar), createIParser(aVar));
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void fetchShareOwnerInfo(String str, IRustService.AbstractC43219a aVar) {
        C42164c.m168298e(str, createIGetDataCallback(aVar), createIParser(aVar));
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void getSmartReply(String str, IRustService.AbstractC43219a aVar) {
        C42164c.m168294c(str, createIGetDataCallback(aVar), createIParser(aVar));
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void removeLargeFileFromDrive(List<String> list, IRustService.AbstractC43219a aVar) {
        C42164c.m168292b(list, createIGetDataCallback(aVar), createIParser(aVar));
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void requestRecall(String str, IRustService.AbstractC43219a aVar) {
        C42164c.m168296d(str, createIGetDataCallback(aVar), createIParser(aVar));
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void createSendToChatMessageDraft(String str, CreateDraft createDraft, IRustService.AbstractC43219a aVar) {
        C42164c.m168269a(str, createDraft, createIGetDataCallback(aVar), createIParser(aVar));
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void deleteDraft(String str, String str2, IRustService.AbstractC43219a aVar) {
        C42164c.m168272a(str, str2, createIGetDataCallback(aVar), createIParser(aVar));
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void deleteMultiDraft(String str, List<String> list, IRustService.AbstractC43219a aVar) {
        C42164c.m168277a(str, list, createIGetDataCallback(aVar), createIParser(aVar));
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void deleteThreadPermanently(String str, List<String> list, IRustService.AbstractC43219a aVar) {
        C42164c.m168290b(str, list, createIGetDataCallback(aVar), createIParser(aVar));
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void fetchMentionContact(String str, String str2, IRustService.AbstractC43219a aVar) {
        C42164c.m168301f(str, str2, createIGetDataCallback(aVar), createIParser(aVar));
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void fetchMessageFullBody(String str, boolean z, IRustService.AbstractC43219a aVar) {
        C42164c.m168291b(str, z, createIGetDataCallback(aVar), createIParser(aVar));
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void getAccountList(boolean z, boolean z2, IRustService.AbstractC43219a aVar) {
        C42164c.m168285a(z, z2, createIGetDataCallback(aVar), createIParser(aVar));
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void getForwardInfoFromDB(String str, String str2, IRustService.AbstractC43219a aVar) {
        C42164c.m168299e(str, str2, createIGetDataCallback(aVar), createIParser(aVar));
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void getForwardInfoFromNet(String str, String str2, IRustService.AbstractC43219a aVar) {
        C42164c.m168297d(str, str2, createIGetDataCallback(aVar), createIParser(aVar));
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void getMessageItem(String str, boolean z, IRustService.AbstractC43219a aVar) {
        C42164c.m168280a(str, z, createIGetDataCallback(aVar), createIParser(aVar));
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void getThreadItemById(String str, String str2, IRustService.AbstractC43219a aVar) {
        C42164c.m168288b(str, str2, createIGetDataCallback(aVar), createIParser(aVar));
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void reEdit(String str, String str2, IRustService.AbstractC43219a aVar) {
        C42164c.m168295c(str, str2, createIGetDataCallback(aVar), createIParser(aVar));
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void replyCalendar(String str, int i, IRustService.AbstractC43219a aVar) {
        C42164c.m168267a(str, i, createIGetDataCallback(aVar), createIParser(aVar));
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void sendDraft(MailDraft mailDraft, String str, IRustService.AbstractC43219a aVar) {
        C42164c.m168265a(mailDraft, str, createIGetDataCallback(aVar), createIParser(aVar));
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void updateDraft(MailDraft mailDraft, boolean z, IRustService.AbstractC43219a aVar) {
        C42164c.m168266a(mailDraft, z, createIGetDataCallback(aVar), createIParser(aVar));
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public ByteArray getContactsGroupList(String str, int i, int i2, String str2) {
        return C42164c.m168261a(str, i, i2, str2);
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void getMultiThreadItem(String str, List<String> list, long j, IRustService.AbstractC43219a aVar) {
        C42164c.m168276a(str, list, j, createIGetDataCallback(aVar), createIParser(aVar));
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void getThreadInfoFromDB(String str, ArrayList<String> arrayList, String str2, IRustService.AbstractC43219a aVar) {
        C42164c.m168275a(str, arrayList, str2, createIGetDataCallback(aVar), createIParser(aVar));
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void getThreadInfoFromNet(String str, ArrayList<String> arrayList, String str2, IRustService.AbstractC43219a aVar) {
        C42164c.m168289b(str, arrayList, str2, createIGetDataCallback(aVar), createIParser(aVar));
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void moveToAggregation(List<String> list, String str, String str2, IRustService.AbstractC43219a aVar) {
        C42164c.m168293b(list, str, str2, createIGetDataCallback(aVar), createIParser(aVar));
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void requestOutboxAction(String str, String str2, int i, IRustService.AbstractC43219a aVar) {
        C42164c.m168271a(str, str2, i, createIGetDataCallback(aVar), createIParser(aVar));
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void requestUnsubscribe(String str, String str2, boolean z, IRustService.AbstractC43219a aVar) {
        C42164c.m168274a(str, str2, z, createIGetDataCallback(aVar), createIParser(aVar));
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void createDoc(String str, String str2, String str3, String str4, IRustService.AbstractC43219a aVar) {
        C42164c.m168273a(str, str2, str3, str4, createIGetDataCallback(aVar), createIParser(aVar));
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void forwardToChat(String str, List<String> list, List<String> list2, String str2, boolean z, IRustService.AbstractC43219a aVar) {
        C42164c.m168279a(str, list, list2, str2, z, createIGetDataCallback(aVar), createIParser(aVar));
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void fetchTranslation(String str, List<MailMessage> list, String str2, boolean z, boolean z2, String str3, IRustService.AbstractC43219a aVar) {
        C42164c.m168278a(str, list, str2, z, z2, str3, createIGetDataCallback(aVar), createIParser(aVar));
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void moveThreadListLabel(List<String> list, String str, List<String> list2, List<String> list3, int i, String str2, IRustService.AbstractC43219a aVar) {
        C42164c.m168283a(list, str, list2, list3, i, str2, createIGetDataCallback(aVar), createIParser(aVar));
    }
}
