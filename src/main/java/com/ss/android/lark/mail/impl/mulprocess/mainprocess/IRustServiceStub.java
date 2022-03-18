package com.ss.android.lark.mail.impl.mulprocess.mainprocess;

import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.android.HwBuildEx;
import com.ss.android.lark.mail.impl.entity.CreateDraft;
import com.ss.android.lark.mail.impl.entity.MailDraft;
import com.ss.android.lark.mail.impl.entity.MailMessage;
import com.ss.android.lark.mail.impl.mulprocess.entity.ByteArray;
import com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService;
import com.ss.android.lark.mail.impl.mulprocess.mainprocess.imp.RustServiceImp;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.log.IVideoEventLogger;
import java.util.ArrayList;
import java.util.List;

public final class IRustServiceStub extends Binder implements IInterface, IRustService {
    public final RustServiceImp base;

    public IBinder asBinder() {
        return this;
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void fetchIsLastVersionNewUser(IRustService.AbstractC43219a aVar) {
        this.base.fetchIsLastVersionNewUser(aVar);
    }

    public IRustServiceStub(Context context) {
        this.base = new RustServiceImp(context);
        attachInterface(this, "com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService");
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void cancelShareThread(String str, IRustService.AbstractC43219a aVar) {
        this.base.cancelShareThread(str, aVar);
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void createDraft(CreateDraft createDraft, IRustService.AbstractC43219a aVar) {
        this.base.createDraft(createDraft, aVar);
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void createShareMessageDraft(CreateDraft createDraft, IRustService.AbstractC43219a aVar) {
        this.base.createShareMessageDraft(createDraft, aVar);
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void deleteExternalAddress(String str, IRustService.AbstractC43219a aVar) {
        this.base.deleteExternalAddress(str, aVar);
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void fetchCollaboratorList(String str, IRustService.AbstractC43219a aVar) {
        this.base.fetchCollaboratorList(str, aVar);
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void fetchDocInfo(List<String> list, IRustService.AbstractC43219a aVar) {
        this.base.fetchDocInfo(list, aVar);
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void fetchRecallDetail(String str, IRustService.AbstractC43219a aVar) {
        this.base.fetchRecallDetail(str, aVar);
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void fetchSendStatus(String str, IRustService.AbstractC43219a aVar) {
        this.base.fetchSendStatus(str, aVar);
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void fetchShareOwnerInfo(String str, IRustService.AbstractC43219a aVar) {
        this.base.fetchShareOwnerInfo(str, aVar);
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public ByteArray getNetMailContactsList(String str, int i) {
        return this.base.getNetMailContactsList(str, i);
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void getSmartReply(String str, IRustService.AbstractC43219a aVar) {
        this.base.getSmartReply(str, aVar);
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void removeLargeFileFromDrive(List<String> list, IRustService.AbstractC43219a aVar) {
        this.base.removeLargeFileFromDrive(list, aVar);
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void requestRecall(String str, IRustService.AbstractC43219a aVar) {
        this.base.requestRecall(str, aVar);
    }

    public static IRustServiceProxy asInterface(Context context, IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof IRustServiceProxy)) {
            return new IRustServiceProxy(context, iBinder);
        }
        return (IRustServiceProxy) queryLocalInterface;
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void createSendToChatMessageDraft(String str, CreateDraft createDraft, IRustService.AbstractC43219a aVar) {
        this.base.createSendToChatMessageDraft(str, createDraft, aVar);
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void deleteDraft(String str, String str2, IRustService.AbstractC43219a aVar) {
        this.base.deleteDraft(str, str2, aVar);
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void deleteMultiDraft(String str, List<String> list, IRustService.AbstractC43219a aVar) {
        this.base.deleteMultiDraft(str, list, aVar);
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void deleteThreadPermanently(String str, List<String> list, IRustService.AbstractC43219a aVar) {
        this.base.deleteThreadPermanently(str, list, aVar);
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void fetchMentionContact(String str, String str2, IRustService.AbstractC43219a aVar) {
        this.base.fetchMentionContact(str, str2, aVar);
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void fetchMessageFullBody(String str, boolean z, IRustService.AbstractC43219a aVar) {
        this.base.fetchMessageFullBody(str, z, aVar);
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void getAccountList(boolean z, boolean z2, IRustService.AbstractC43219a aVar) {
        this.base.getAccountList(z, z2, aVar);
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void getForwardInfoFromDB(String str, String str2, IRustService.AbstractC43219a aVar) {
        this.base.getForwardInfoFromDB(str, str2, aVar);
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void getForwardInfoFromNet(String str, String str2, IRustService.AbstractC43219a aVar) {
        this.base.getForwardInfoFromNet(str, str2, aVar);
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void getMessageItem(String str, boolean z, IRustService.AbstractC43219a aVar) {
        this.base.getMessageItem(str, z, aVar);
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void getThreadItemById(String str, String str2, IRustService.AbstractC43219a aVar) {
        this.base.getThreadItemById(str, str2, aVar);
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void reEdit(String str, String str2, IRustService.AbstractC43219a aVar) {
        this.base.reEdit(str, str2, aVar);
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void replyCalendar(String str, int i, IRustService.AbstractC43219a aVar) {
        this.base.replyCalendar(str, i, aVar);
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void sendDraft(MailDraft mailDraft, String str, IRustService.AbstractC43219a aVar) {
        this.base.sendDraft(mailDraft, str, aVar);
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void updateDraft(MailDraft mailDraft, boolean z, IRustService.AbstractC43219a aVar) {
        this.base.updateDraft(mailDraft, z, aVar);
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public ByteArray getContactsGroupList(String str, int i, int i2, String str2) {
        return this.base.getContactsGroupList(str, i, i2, str2);
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void getThreadInfoFromDB(String str, ArrayList<String> arrayList, String str2, IRustService.AbstractC43219a aVar) {
        this.base.getThreadInfoFromDB(str, arrayList, str2, aVar);
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void getThreadInfoFromNet(String str, ArrayList<String> arrayList, String str2, IRustService.AbstractC43219a aVar) {
        this.base.getThreadInfoFromNet(str, arrayList, str2, aVar);
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void moveToAggregation(List<String> list, String str, String str2, IRustService.AbstractC43219a aVar) {
        this.base.moveToAggregation(list, str, str2, aVar);
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void requestOutboxAction(String str, String str2, int i, IRustService.AbstractC43219a aVar) {
        this.base.requestOutboxAction(str, str2, i, aVar);
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void requestUnsubscribe(String str, String str2, boolean z, IRustService.AbstractC43219a aVar) {
        this.base.requestUnsubscribe(str, str2, z, aVar);
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void getMultiThreadItem(String str, List<String> list, long j, IRustService.AbstractC43219a aVar) {
        this.base.getMultiThreadItem(str, list, j, aVar);
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (i != 1598968902) {
            CreateDraft createDraft = null;
            CreateDraft createDraft2 = null;
            MailDraft mailDraft = null;
            MailDraft mailDraft2 = null;
            CreateDraft createDraft3 = null;
            boolean z5 = false;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService");
                    deleteDraft(parcel.readString(), parcel.readString(), RustGetDataCallbackStub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService");
                    deleteMultiDraft(parcel.readString(), parcel.readArrayList(getClass().getClassLoader()), RustGetDataCallbackStub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService");
                    if (parcel.readInt() == 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (parcel.readInt() != 0) {
                        z5 = true;
                    }
                    getAccountList(z, z5, RustGetDataCallbackStub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService");
                    fetchSendStatus(parcel.readString(), RustGetDataCallbackStub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService");
                    deleteExternalAddress(parcel.readString(), RustGetDataCallbackStub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService");
                    deleteThreadPermanently(parcel.readString(), parcel.readArrayList(getClass().getClassLoader()), RustGetDataCallbackStub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService");
                    getThreadInfoFromDB(parcel.readString(), parcel.readArrayList(getClass().getClassLoader()), parcel.readString(), RustGetDataCallbackStub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 8:
                    parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService");
                    getThreadInfoFromNet(parcel.readString(), parcel.readArrayList(getClass().getClassLoader()), parcel.readString(), RustGetDataCallbackStub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 9:
                    parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService");
                    ClassLoader classLoader = getClass().getClassLoader();
                    moveThreadListLabel(parcel.readArrayList(classLoader), parcel.readString(), parcel.readArrayList(classLoader), parcel.readArrayList(classLoader), parcel.readInt(), parcel.readString(), RustGetDataCallbackStub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 10:
                    parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService");
                    getMultiThreadItem(parcel.readString(), parcel.readArrayList(getClass().getClassLoader()), parcel.readLong(), RustGetDataCallbackStub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 11:
                    parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService");
                    getThreadItemById(parcel.readString(), parcel.readString(), RustGetDataCallbackStub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case HwBuildEx.VersionCodes.EMUI_5_1:
                    parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService");
                    if (parcel.readInt() != 0) {
                        createDraft = CreateDraft.CREATOR.createFromParcel(parcel);
                    }
                    createDraft(createDraft, RustGetDataCallbackStub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 13:
                    parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService");
                    reEdit(parcel.readString(), parcel.readString(), RustGetDataCallbackStub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 14:
                    parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService");
                    if (parcel.readInt() != 0) {
                        createDraft3 = CreateDraft.CREATOR.createFromParcel(parcel);
                    }
                    createShareMessageDraft(createDraft3, RustGetDataCallbackStub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 15:
                    parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService");
                    ByteArray contactsGroupList = getContactsGroupList(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    if (contactsGroupList != null) {
                        parcel2.writeInt(1);
                        contactsGroupList.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 16:
                    parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService");
                    ByteArray netMailContactsList = getNetMailContactsList(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    if (netMailContactsList != null) {
                        parcel2.writeInt(1);
                        netMailContactsList.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 17:
                    parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService");
                    if (parcel.readInt() != 0) {
                        mailDraft2 = MailDraft.CREATOR.createFromParcel(parcel);
                    }
                    sendDraft(mailDraft2, parcel.readString(), RustGetDataCallbackStub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 18:
                    parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService");
                    if (parcel.readInt() != 0) {
                        mailDraft = MailDraft.CREATOR.createFromParcel(parcel);
                    }
                    if (parcel.readInt() != 0) {
                        z5 = true;
                    }
                    updateDraft(mailDraft, z5, RustGetDataCallbackStub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 19:
                    parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService");
                    createDoc(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), RustGetDataCallbackStub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 20:
                    parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService");
                    fetchDocInfo(parcel.readArrayList(getClass().getClassLoader()), RustGetDataCallbackStub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 21:
                    parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService");
                    String readString = parcel.readString();
                    ArrayList readArrayList = parcel.readArrayList(getClass().getClassLoader());
                    String readString2 = parcel.readString();
                    if (parcel.readInt() == 0) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (parcel.readInt() == 0) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    fetchTranslation(readString, readArrayList, readString2, z2, z3, parcel.readString(), RustGetDataCallbackStub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 22:
                    parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService");
                    removeLargeFileFromDrive(parcel.readArrayList(getClass().getClassLoader()), RustGetDataCallbackStub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 23:
                    parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService");
                    getSmartReply(parcel.readString(), RustGetDataCallbackStub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 24:
                    parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService");
                    requestRecall(parcel.readString(), RustGetDataCallbackStub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT:
                    parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService");
                    String readString3 = parcel.readString();
                    String readString4 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        z5 = true;
                    }
                    requestUnsubscribe(readString3, readString4, z5, RustGetDataCallbackStub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 26:
                    parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService");
                    String readString5 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        createDraft2 = CreateDraft.CREATOR.createFromParcel(parcel);
                    }
                    createSendToChatMessageDraft(readString5, createDraft2, RustGetDataCallbackStub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case AvailableCode.USER_IGNORE_PREVIOUS_POPUP:
                    parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService");
                    String readString6 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        z5 = true;
                    }
                    getMessageItem(readString6, z5, RustGetDataCallbackStub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case IVideoEventLogger.LOGGER_OPTION_ENABLE_SR /*{ENCODED_INT: 28}*/:
                    parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService");
                    String readString7 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        z5 = true;
                    }
                    fetchMessageFullBody(readString7, z5, RustGetDataCallbackStub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 29:
                    parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService");
                    getForwardInfoFromNet(parcel.readString(), parcel.readString(), RustGetDataCallbackStub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 30:
                    parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService");
                    getForwardInfoFromDB(parcel.readString(), parcel.readString(), RustGetDataCallbackStub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case TTVideoEngine.PLAYER_OPTION_ENABLE_PLAYER3_HARDWARE_DECODE /*{ENCODED_INT: 31}*/:
                    parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService");
                    String readString8 = parcel.readString();
                    ClassLoader classLoader2 = getClass().getClassLoader();
                    ArrayList readArrayList2 = parcel.readArrayList(classLoader2);
                    ArrayList readArrayList3 = parcel.readArrayList(classLoader2);
                    String readString9 = parcel.readString();
                    if (parcel.readInt() == 0) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    forwardToChat(readString8, readArrayList2, readArrayList3, readString9, z4, RustGetDataCallbackStub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 32:
                    parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService");
                    fetchShareOwnerInfo(parcel.readString(), RustGetDataCallbackStub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 33:
                    parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService");
                    fetchCollaboratorList(parcel.readString(), RustGetDataCallbackStub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 34:
                    parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService");
                    replyCalendar(parcel.readString(), parcel.readInt(), RustGetDataCallbackStub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 35:
                    parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService");
                    fetchMentionContact(parcel.readString(), parcel.readString(), RustGetDataCallbackStub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 36:
                    parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService");
                    cancelShareThread(parcel.readString(), RustGetDataCallbackStub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 37:
                    parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService");
                    fetchRecallDetail(parcel.readString(), RustGetDataCallbackStub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 38:
                    parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService");
                    requestOutboxAction(parcel.readString(), parcel.readString(), parcel.readInt(), RustGetDataCallbackStub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 39:
                    parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService");
                    fetchIsLastVersionNewUser(RustGetDataCallbackStub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 40:
                    parcel.enforceInterface("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService");
                    moveToAggregation(parcel.readArrayList(getClass().getClassLoader()), parcel.readString(), parcel.readString(), RustGetDataCallbackStub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        } else {
            parcel2.writeString("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService");
            return true;
        }
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void createDoc(String str, String str2, String str3, String str4, IRustService.AbstractC43219a aVar) {
        this.base.createDoc(str, str2, str3, str4, aVar);
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void forwardToChat(String str, List<String> list, List<String> list2, String str2, boolean z, IRustService.AbstractC43219a aVar) {
        this.base.forwardToChat(str, list, list2, str2, z, aVar);
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void fetchTranslation(String str, List<MailMessage> list, String str2, boolean z, boolean z2, String str3, IRustService.AbstractC43219a aVar) {
        this.base.fetchTranslation(str, list, str2, z, z2, str3, aVar);
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void moveThreadListLabel(List<String> list, String str, List<String> list2, List<String> list3, int i, String str2, IRustService.AbstractC43219a aVar) {
        this.base.moveThreadListLabel(list, str, list2, list3, i, str2, aVar);
    }
}
