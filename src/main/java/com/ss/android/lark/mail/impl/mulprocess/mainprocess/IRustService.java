package com.ss.android.lark.mail.impl.mulprocess.mainprocess;

import com.ss.android.lark.mail.impl.entity.CreateDraft;
import com.ss.android.lark.mail.impl.entity.MailDraft;
import com.ss.android.lark.mail.impl.entity.MailMessage;
import com.ss.android.lark.mail.impl.mulprocess.entity.ByteArray;
import com.ss.android.lark.manis.annotation.RemoteCallback;
import com.ss.android.lark.manis.annotation.RemoteService;
import ee.android.framework.manis.interfaces.IHookInterface;
import java.util.ArrayList;
import java.util.List;

@RemoteService
public interface IRustService extends IHookInterface {

    @RemoteCallback
    /* renamed from: com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService$a */
    public interface AbstractC43219a {
        void onFail();

        void onSuc(ByteArray byteArray);
    }

    void cancelShareThread(String str, AbstractC43219a aVar);

    void createDoc(String str, String str2, String str3, String str4, AbstractC43219a aVar);

    void createDraft(CreateDraft createDraft, AbstractC43219a aVar);

    void createSendToChatMessageDraft(String str, CreateDraft createDraft, AbstractC43219a aVar);

    void createShareMessageDraft(CreateDraft createDraft, AbstractC43219a aVar);

    void deleteDraft(String str, String str2, AbstractC43219a aVar);

    void deleteExternalAddress(String str, AbstractC43219a aVar);

    void deleteMultiDraft(String str, List<String> list, AbstractC43219a aVar);

    void deleteThreadPermanently(String str, List<String> list, AbstractC43219a aVar);

    void fetchCollaboratorList(String str, AbstractC43219a aVar);

    void fetchDocInfo(List<String> list, AbstractC43219a aVar);

    void fetchIsLastVersionNewUser(AbstractC43219a aVar);

    void fetchMentionContact(String str, String str2, AbstractC43219a aVar);

    void fetchMessageFullBody(String str, boolean z, AbstractC43219a aVar);

    void fetchRecallDetail(String str, AbstractC43219a aVar);

    void fetchSendStatus(String str, AbstractC43219a aVar);

    void fetchShareOwnerInfo(String str, AbstractC43219a aVar);

    void fetchTranslation(String str, List<MailMessage> list, String str2, boolean z, boolean z2, String str3, AbstractC43219a aVar);

    void forwardToChat(String str, List<String> list, List<String> list2, String str2, boolean z, AbstractC43219a aVar);

    void getAccountList(boolean z, boolean z2, AbstractC43219a aVar);

    ByteArray getContactsGroupList(String str, int i, int i2, String str2);

    void getForwardInfoFromDB(String str, String str2, AbstractC43219a aVar);

    void getForwardInfoFromNet(String str, String str2, AbstractC43219a aVar);

    void getMessageItem(String str, boolean z, AbstractC43219a aVar);

    void getMultiThreadItem(String str, List<String> list, long j, AbstractC43219a aVar);

    ByteArray getNetMailContactsList(String str, int i);

    void getSmartReply(String str, AbstractC43219a aVar);

    void getThreadInfoFromDB(String str, ArrayList<String> arrayList, String str2, AbstractC43219a aVar);

    void getThreadInfoFromNet(String str, ArrayList<String> arrayList, String str2, AbstractC43219a aVar);

    void getThreadItemById(String str, String str2, AbstractC43219a aVar);

    void moveThreadListLabel(List<String> list, String str, List<String> list2, List<String> list3, int i, String str2, AbstractC43219a aVar);

    void moveToAggregation(List<String> list, String str, String str2, AbstractC43219a aVar);

    void reEdit(String str, String str2, AbstractC43219a aVar);

    void removeLargeFileFromDrive(List<String> list, AbstractC43219a aVar);

    void replyCalendar(String str, int i, AbstractC43219a aVar);

    void requestOutboxAction(String str, String str2, int i, AbstractC43219a aVar);

    void requestRecall(String str, AbstractC43219a aVar);

    void requestUnsubscribe(String str, String str2, boolean z, AbstractC43219a aVar);

    void sendDraft(MailDraft mailDraft, String str, AbstractC43219a aVar);

    void updateDraft(MailDraft mailDraft, boolean z, AbstractC43219a aVar);
}
