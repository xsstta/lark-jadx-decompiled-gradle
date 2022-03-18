package com.ss.android.lark.mail.impl.mulprocess.mainprocess;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.entity.CreateDraft;
import com.ss.android.lark.mail.impl.entity.MailDraft;
import com.ss.android.lark.mail.impl.entity.MailMessage;
import com.ss.android.lark.mail.impl.mulprocess.entity.ByteArray;
import com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService;
import java.util.ArrayList;
import java.util.List;

public final class IRustServiceProxy implements IInterface, IRustService {
    private IBinder mRemote;

    public String getInterfaceDescriptor() {
        return "com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService";
    }

    public IBinder asBinder() {
        return this.mRemote;
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void fetchIsLastVersionNewUser(IRustService.AbstractC43219a aVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService");
            if (aVar != null) {
                obtain.writeStrongBinder(new RustGetDataCallbackStub(aVar).asBinder());
            } else {
                obtain.writeStrongBinder(null);
            }
            this.mRemote.transact(39, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IRustServiceProxy", "call method fetchIsLastVersionNewUser throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    public IRustServiceProxy(Context context, IBinder iBinder) {
        this.mRemote = iBinder;
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void cancelShareThread(String str, IRustService.AbstractC43219a aVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService");
            obtain.writeString(str);
            if (aVar != null) {
                obtain.writeStrongBinder(new RustGetDataCallbackStub(aVar).asBinder());
            } else {
                obtain.writeStrongBinder(null);
            }
            this.mRemote.transact(36, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IRustServiceProxy", "call method cancelShareThread throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void createDraft(CreateDraft createDraft, IRustService.AbstractC43219a aVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService");
            if (createDraft != null) {
                obtain.writeInt(1);
                createDraft.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (aVar != null) {
                obtain.writeStrongBinder(new RustGetDataCallbackStub(aVar).asBinder());
            } else {
                obtain.writeStrongBinder(null);
            }
            this.mRemote.transact(12, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IRustServiceProxy", "call method createDraft throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void createShareMessageDraft(CreateDraft createDraft, IRustService.AbstractC43219a aVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService");
            if (createDraft != null) {
                obtain.writeInt(1);
                createDraft.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (aVar != null) {
                obtain.writeStrongBinder(new RustGetDataCallbackStub(aVar).asBinder());
            } else {
                obtain.writeStrongBinder(null);
            }
            this.mRemote.transact(14, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IRustServiceProxy", "call method createShareMessageDraft throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void deleteExternalAddress(String str, IRustService.AbstractC43219a aVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService");
            obtain.writeString(str);
            if (aVar != null) {
                obtain.writeStrongBinder(new RustGetDataCallbackStub(aVar).asBinder());
            } else {
                obtain.writeStrongBinder(null);
            }
            this.mRemote.transact(5, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IRustServiceProxy", "call method deleteExternalAddress throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void fetchCollaboratorList(String str, IRustService.AbstractC43219a aVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService");
            obtain.writeString(str);
            if (aVar != null) {
                obtain.writeStrongBinder(new RustGetDataCallbackStub(aVar).asBinder());
            } else {
                obtain.writeStrongBinder(null);
            }
            this.mRemote.transact(33, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IRustServiceProxy", "call method fetchCollaboratorList throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void fetchDocInfo(List<String> list, IRustService.AbstractC43219a aVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService");
            obtain.writeList(list);
            if (aVar != null) {
                obtain.writeStrongBinder(new RustGetDataCallbackStub(aVar).asBinder());
            } else {
                obtain.writeStrongBinder(null);
            }
            this.mRemote.transact(20, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IRustServiceProxy", "call method fetchDocInfo throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void fetchRecallDetail(String str, IRustService.AbstractC43219a aVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService");
            obtain.writeString(str);
            if (aVar != null) {
                obtain.writeStrongBinder(new RustGetDataCallbackStub(aVar).asBinder());
            } else {
                obtain.writeStrongBinder(null);
            }
            this.mRemote.transact(37, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IRustServiceProxy", "call method fetchRecallDetail throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void fetchSendStatus(String str, IRustService.AbstractC43219a aVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService");
            obtain.writeString(str);
            if (aVar != null) {
                obtain.writeStrongBinder(new RustGetDataCallbackStub(aVar).asBinder());
            } else {
                obtain.writeStrongBinder(null);
            }
            this.mRemote.transact(4, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IRustServiceProxy", "call method fetchSendStatus throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void fetchShareOwnerInfo(String str, IRustService.AbstractC43219a aVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService");
            obtain.writeString(str);
            if (aVar != null) {
                obtain.writeStrongBinder(new RustGetDataCallbackStub(aVar).asBinder());
            } else {
                obtain.writeStrongBinder(null);
            }
            this.mRemote.transact(32, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IRustServiceProxy", "call method fetchShareOwnerInfo throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public ByteArray getNetMailContactsList(String str, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        ByteArray byteArray = null;
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService");
            obtain.writeString(str);
            obtain.writeInt(i);
            this.mRemote.transact(16, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                byteArray = ByteArray.CREATOR.createFromParcel(obtain2);
            }
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IRustServiceProxy", "call method getNetMailContactsList throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
        return byteArray;
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void getSmartReply(String str, IRustService.AbstractC43219a aVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService");
            obtain.writeString(str);
            if (aVar != null) {
                obtain.writeStrongBinder(new RustGetDataCallbackStub(aVar).asBinder());
            } else {
                obtain.writeStrongBinder(null);
            }
            this.mRemote.transact(23, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IRustServiceProxy", "call method getSmartReply throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void removeLargeFileFromDrive(List<String> list, IRustService.AbstractC43219a aVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService");
            obtain.writeList(list);
            if (aVar != null) {
                obtain.writeStrongBinder(new RustGetDataCallbackStub(aVar).asBinder());
            } else {
                obtain.writeStrongBinder(null);
            }
            this.mRemote.transact(22, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IRustServiceProxy", "call method removeLargeFileFromDrive throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void requestRecall(String str, IRustService.AbstractC43219a aVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService");
            obtain.writeString(str);
            if (aVar != null) {
                obtain.writeStrongBinder(new RustGetDataCallbackStub(aVar).asBinder());
            } else {
                obtain.writeStrongBinder(null);
            }
            this.mRemote.transact(24, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IRustServiceProxy", "call method requestRecall throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void createSendToChatMessageDraft(String str, CreateDraft createDraft, IRustService.AbstractC43219a aVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService");
            obtain.writeString(str);
            if (createDraft != null) {
                obtain.writeInt(1);
                createDraft.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (aVar != null) {
                obtain.writeStrongBinder(new RustGetDataCallbackStub(aVar).asBinder());
            } else {
                obtain.writeStrongBinder(null);
            }
            this.mRemote.transact(26, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IRustServiceProxy", "call method createSendToChatMessageDraft throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void deleteDraft(String str, String str2, IRustService.AbstractC43219a aVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService");
            obtain.writeString(str);
            obtain.writeString(str2);
            if (aVar != null) {
                obtain.writeStrongBinder(new RustGetDataCallbackStub(aVar).asBinder());
            } else {
                obtain.writeStrongBinder(null);
            }
            this.mRemote.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IRustServiceProxy", "call method deleteDraft throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void deleteMultiDraft(String str, List<String> list, IRustService.AbstractC43219a aVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService");
            obtain.writeString(str);
            obtain.writeList(list);
            if (aVar != null) {
                obtain.writeStrongBinder(new RustGetDataCallbackStub(aVar).asBinder());
            } else {
                obtain.writeStrongBinder(null);
            }
            this.mRemote.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IRustServiceProxy", "call method deleteMultiDraft throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void deleteThreadPermanently(String str, List<String> list, IRustService.AbstractC43219a aVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService");
            obtain.writeString(str);
            obtain.writeList(list);
            if (aVar != null) {
                obtain.writeStrongBinder(new RustGetDataCallbackStub(aVar).asBinder());
            } else {
                obtain.writeStrongBinder(null);
            }
            this.mRemote.transact(6, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IRustServiceProxy", "call method deleteThreadPermanently throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void fetchMentionContact(String str, String str2, IRustService.AbstractC43219a aVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService");
            obtain.writeString(str);
            obtain.writeString(str2);
            if (aVar != null) {
                obtain.writeStrongBinder(new RustGetDataCallbackStub(aVar).asBinder());
            } else {
                obtain.writeStrongBinder(null);
            }
            this.mRemote.transact(35, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IRustServiceProxy", "call method fetchMentionContact throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void fetchMessageFullBody(String str, boolean z, IRustService.AbstractC43219a aVar) {
        int i;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService");
            obtain.writeString(str);
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            obtain.writeInt(i);
            if (aVar != null) {
                obtain.writeStrongBinder(new RustGetDataCallbackStub(aVar).asBinder());
            } else {
                obtain.writeStrongBinder(null);
            }
            this.mRemote.transact(28, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IRustServiceProxy", "call method fetchMessageFullBody throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void getAccountList(boolean z, boolean z2, IRustService.AbstractC43219a aVar) {
        int i;
        int i2;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService");
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            obtain.writeInt(i);
            if (z2) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            obtain.writeInt(i2);
            if (aVar != null) {
                obtain.writeStrongBinder(new RustGetDataCallbackStub(aVar).asBinder());
            } else {
                obtain.writeStrongBinder(null);
            }
            this.mRemote.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IRustServiceProxy", "call method getAccountList throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void getForwardInfoFromDB(String str, String str2, IRustService.AbstractC43219a aVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService");
            obtain.writeString(str);
            obtain.writeString(str2);
            if (aVar != null) {
                obtain.writeStrongBinder(new RustGetDataCallbackStub(aVar).asBinder());
            } else {
                obtain.writeStrongBinder(null);
            }
            this.mRemote.transact(30, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IRustServiceProxy", "call method getForwardInfoFromDB throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void getForwardInfoFromNet(String str, String str2, IRustService.AbstractC43219a aVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService");
            obtain.writeString(str);
            obtain.writeString(str2);
            if (aVar != null) {
                obtain.writeStrongBinder(new RustGetDataCallbackStub(aVar).asBinder());
            } else {
                obtain.writeStrongBinder(null);
            }
            this.mRemote.transact(29, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IRustServiceProxy", "call method getForwardInfoFromNet throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void getMessageItem(String str, boolean z, IRustService.AbstractC43219a aVar) {
        int i;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService");
            obtain.writeString(str);
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            obtain.writeInt(i);
            if (aVar != null) {
                obtain.writeStrongBinder(new RustGetDataCallbackStub(aVar).asBinder());
            } else {
                obtain.writeStrongBinder(null);
            }
            this.mRemote.transact(27, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IRustServiceProxy", "call method getMessageItem throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void getThreadItemById(String str, String str2, IRustService.AbstractC43219a aVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService");
            obtain.writeString(str);
            obtain.writeString(str2);
            if (aVar != null) {
                obtain.writeStrongBinder(new RustGetDataCallbackStub(aVar).asBinder());
            } else {
                obtain.writeStrongBinder(null);
            }
            this.mRemote.transact(11, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IRustServiceProxy", "call method getThreadItemById throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void reEdit(String str, String str2, IRustService.AbstractC43219a aVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService");
            obtain.writeString(str);
            obtain.writeString(str2);
            if (aVar != null) {
                obtain.writeStrongBinder(new RustGetDataCallbackStub(aVar).asBinder());
            } else {
                obtain.writeStrongBinder(null);
            }
            this.mRemote.transact(13, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IRustServiceProxy", "call method reEdit throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void replyCalendar(String str, int i, IRustService.AbstractC43219a aVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService");
            obtain.writeString(str);
            obtain.writeInt(i);
            if (aVar != null) {
                obtain.writeStrongBinder(new RustGetDataCallbackStub(aVar).asBinder());
            } else {
                obtain.writeStrongBinder(null);
            }
            this.mRemote.transact(34, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IRustServiceProxy", "call method replyCalendar throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void sendDraft(MailDraft mailDraft, String str, IRustService.AbstractC43219a aVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService");
            if (mailDraft != null) {
                obtain.writeInt(1);
                mailDraft.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeString(str);
            if (aVar != null) {
                obtain.writeStrongBinder(new RustGetDataCallbackStub(aVar).asBinder());
            } else {
                obtain.writeStrongBinder(null);
            }
            this.mRemote.transact(17, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IRustServiceProxy", "call method sendDraft throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void updateDraft(MailDraft mailDraft, boolean z, IRustService.AbstractC43219a aVar) {
        int i;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService");
            if (mailDraft != null) {
                obtain.writeInt(1);
                mailDraft.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            obtain.writeInt(i);
            if (aVar != null) {
                obtain.writeStrongBinder(new RustGetDataCallbackStub(aVar).asBinder());
            } else {
                obtain.writeStrongBinder(null);
            }
            this.mRemote.transact(18, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IRustServiceProxy", "call method updateDraft throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public ByteArray getContactsGroupList(String str, int i, int i2, String str2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        ByteArray byteArray = null;
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService");
            obtain.writeString(str);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            obtain.writeString(str2);
            this.mRemote.transact(15, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                byteArray = ByteArray.CREATOR.createFromParcel(obtain2);
            }
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IRustServiceProxy", "call method getContactsGroupList throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
        return byteArray;
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void getMultiThreadItem(String str, List<String> list, long j, IRustService.AbstractC43219a aVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService");
            obtain.writeString(str);
            obtain.writeList(list);
            obtain.writeLong(j);
            if (aVar != null) {
                obtain.writeStrongBinder(new RustGetDataCallbackStub(aVar).asBinder());
            } else {
                obtain.writeStrongBinder(null);
            }
            this.mRemote.transact(10, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IRustServiceProxy", "call method getMultiThreadItem throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void getThreadInfoFromDB(String str, ArrayList<String> arrayList, String str2, IRustService.AbstractC43219a aVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService");
            obtain.writeString(str);
            obtain.writeList(arrayList);
            obtain.writeString(str2);
            if (aVar != null) {
                obtain.writeStrongBinder(new RustGetDataCallbackStub(aVar).asBinder());
            } else {
                obtain.writeStrongBinder(null);
            }
            this.mRemote.transact(7, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IRustServiceProxy", "call method getThreadInfoFromDB throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void getThreadInfoFromNet(String str, ArrayList<String> arrayList, String str2, IRustService.AbstractC43219a aVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService");
            obtain.writeString(str);
            obtain.writeList(arrayList);
            obtain.writeString(str2);
            if (aVar != null) {
                obtain.writeStrongBinder(new RustGetDataCallbackStub(aVar).asBinder());
            } else {
                obtain.writeStrongBinder(null);
            }
            this.mRemote.transact(8, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IRustServiceProxy", "call method getThreadInfoFromNet throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void moveToAggregation(List<String> list, String str, String str2, IRustService.AbstractC43219a aVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService");
            obtain.writeList(list);
            obtain.writeString(str);
            obtain.writeString(str2);
            if (aVar != null) {
                obtain.writeStrongBinder(new RustGetDataCallbackStub(aVar).asBinder());
            } else {
                obtain.writeStrongBinder(null);
            }
            this.mRemote.transact(40, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IRustServiceProxy", "call method moveToAggregation throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void requestOutboxAction(String str, String str2, int i, IRustService.AbstractC43219a aVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService");
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeInt(i);
            if (aVar != null) {
                obtain.writeStrongBinder(new RustGetDataCallbackStub(aVar).asBinder());
            } else {
                obtain.writeStrongBinder(null);
            }
            this.mRemote.transact(38, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IRustServiceProxy", "call method requestOutboxAction throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void requestUnsubscribe(String str, String str2, boolean z, IRustService.AbstractC43219a aVar) {
        int i;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService");
            obtain.writeString(str);
            obtain.writeString(str2);
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            obtain.writeInt(i);
            if (aVar != null) {
                obtain.writeStrongBinder(new RustGetDataCallbackStub(aVar).asBinder());
            } else {
                obtain.writeStrongBinder(null);
            }
            this.mRemote.transact(25, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IRustServiceProxy", "call method requestUnsubscribe throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void createDoc(String str, String str2, String str3, String str4, IRustService.AbstractC43219a aVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService");
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeString(str3);
            obtain.writeString(str4);
            if (aVar != null) {
                obtain.writeStrongBinder(new RustGetDataCallbackStub(aVar).asBinder());
            } else {
                obtain.writeStrongBinder(null);
            }
            this.mRemote.transact(19, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IRustServiceProxy", "call method createDoc throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void forwardToChat(String str, List<String> list, List<String> list2, String str2, boolean z, IRustService.AbstractC43219a aVar) {
        int i;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService");
            obtain.writeString(str);
            obtain.writeList(list);
            obtain.writeList(list2);
            obtain.writeString(str2);
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            obtain.writeInt(i);
            if (aVar != null) {
                obtain.writeStrongBinder(new RustGetDataCallbackStub(aVar).asBinder());
            } else {
                obtain.writeStrongBinder(null);
            }
            this.mRemote.transact(31, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IRustServiceProxy", "call method forwardToChat throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void fetchTranslation(String str, List<MailMessage> list, String str2, boolean z, boolean z2, String str3, IRustService.AbstractC43219a aVar) {
        int i;
        int i2;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService");
            obtain.writeString(str);
            obtain.writeList(list);
            obtain.writeString(str2);
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            obtain.writeInt(i);
            if (z2) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            obtain.writeInt(i2);
            obtain.writeString(str3);
            if (aVar != null) {
                obtain.writeStrongBinder(new RustGetDataCallbackStub(aVar).asBinder());
            } else {
                obtain.writeStrongBinder(null);
            }
            this.mRemote.transact(21, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IRustServiceProxy", "call method fetchTranslation throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService
    public void moveThreadListLabel(List<String> list, String str, List<String> list2, List<String> list3, int i, String str2, IRustService.AbstractC43219a aVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.ss.android.lark.mail.impl.mulprocess.mainprocess.IRustService");
            obtain.writeList(list);
            obtain.writeString(str);
            obtain.writeList(list2);
            obtain.writeList(list3);
            obtain.writeInt(i);
            obtain.writeString(str2);
            if (aVar != null) {
                obtain.writeStrongBinder(new RustGetDataCallbackStub(aVar).asBinder());
            } else {
                obtain.writeStrongBinder(null);
            }
            this.mRemote.transact(9, obtain, obtain2, 0);
            obtain2.readException();
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.m165385e("IRustServiceProxy", "call method moveThreadListLabel throw RemoteException", e, true);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
        obtain2.recycle();
        obtain.recycle();
    }
}
