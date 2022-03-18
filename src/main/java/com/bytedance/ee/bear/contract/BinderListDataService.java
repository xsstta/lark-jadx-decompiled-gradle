package com.bytedance.ee.bear.contract;

import android.app.Application;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.bytedance.ee.bear.contract.BinderIDeleteDocCallback;
import com.bytedance.ee.bear.contract.BinderIMakeCopyCallback;
import com.bytedance.ee.bear.contract.BinderIManualOfflineCallback;
import com.bytedance.ee.bear.contract.BinderListDataChangeCallback;
import com.bytedance.ee.bear.contract.BinderOnRequestCallback;
import com.bytedance.ee.bear.contract.create.DocumentCreateInfo;
import com.bytedance.ee.bear.contract.offline.OfflineDoc;
import com.bytedance.ee.bear.contract.offline.OfflineRenameData;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.service.exception.InvokeRemoteException;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;
import com.bytedance.ee.bear.service.remote.RemoteConsumer;
import com.bytedance.ee.bear.service.remote.RemoteFlow;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.android.HwBuildEx;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.log.IVideoEventLogger;
import io.reactivex.AbstractC68307f;
import io.reactivex.AbstractC68323g;
import io.reactivex.AbstractC68324h;
import io.reactivex.BackpressureStrategy;
import io.reactivex.functions.Consumer;
import io.reactivex.p3456d.C68279a;
import java.util.ArrayList;
import java.util.List;

public interface BinderListDataService extends IInterface, am, AbstractC10957d {

    public static abstract class Stub extends Binder implements BinderListDataService {
        public IBinder asBinder() {
            return this;
        }

        @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
        public void destroy() {
        }

        @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
        public void init(Application application) {
        }

        public boolean isNewRemoteService() {
            return false;
        }

        @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
        public void lazyInit(Application application) {
        }

        private static class Proxy implements BinderListDataService {
            public IBinder mRemote;

            @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
            public void destroy() {
            }

            public String getInterfaceDescriptor() {
                return "com.bytedance.ee.bear.contract.BinderListDataService";
            }

            @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
            public void init(Application application) {
            }

            public boolean isNewRemoteService() {
                return false;
            }

            @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
            public void lazyInit(Application application) {
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.bytedance.ee.bear.contract.am
            public void deleteAllDocStatus() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderListDataService");
                    this.mRemote.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (RemoteException e) {
                    throw new InvokeRemoteException(e);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.bytedance.ee.bear.contract.am
            public List<Document> getManualOfflineStateList() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderListDataService");
                    this.mRemote.transact(29, obtain, obtain2, 0);
                    obtain2.readException();
                    ArrayList readArrayList = obtain2.readArrayList(getClass().getClassLoader());
                    obtain2.recycle();
                    obtain.recycle();
                    return readArrayList;
                } catch (RemoteException e) {
                    throw new InvokeRemoteException(e);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.bytedance.ee.bear.contract.am
            public void notifyFileClose() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderListDataService");
                    this.mRemote.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (RemoteException e) {
                    throw new InvokeRemoteException(e);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.bytedance.ee.bear.contract.am
            public void notifyFileOpen() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderListDataService");
                    this.mRemote.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (RemoteException e) {
                    throw new InvokeRemoteException(e);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.bytedance.ee.bear.contract.am
            public AbstractC68307f<Boolean> clearDocsCacheDataFlowable(final long j) {
                try {
                    AbstractC68307f<Boolean> b = AbstractC68307f.m265080a(new AbstractC68324h<Boolean>() {
                        /* class com.bytedance.ee.bear.contract.BinderListDataService.Stub.Proxy.C50595 */

                        @Override // io.reactivex.AbstractC68324h
                        public void subscribe(final AbstractC68323g<Boolean> gVar) throws Exception {
                            Parcel obtain = Parcel.obtain();
                            Parcel obtain2 = Parcel.obtain();
                            obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderListDataService");
                            obtain.writeLong(j);
                            Proxy.this.mRemote.transact(24, obtain, obtain2, 0);
                            obtain2.readException();
                            RemoteFlow.CREATOR.createFromParcel(obtain2).mo41555a(new RemoteConsumer(new RemoteConsumer.AbstractC10940a<Boolean>() {
                                /* class com.bytedance.ee.bear.contract.BinderListDataService.Stub.Proxy.C50595.C50601 */

                                /* renamed from: a */
                                public void mo19729a(Boolean bool) {
                                    if (!gVar.isCancelled()) {
                                        gVar.onNext(bool);
                                        gVar.onComplete();
                                    }
                                }

                                @Override // com.bytedance.ee.bear.service.remote.RemoteConsumer.AbstractC10940a
                                /* renamed from: a */
                                public void mo19730a(Throwable th) {
                                    if (!gVar.isCancelled()) {
                                        gVar.onError(th);
                                        gVar.onComplete();
                                    }
                                }
                            }));
                        }
                    }, BackpressureStrategy.BUFFER).mo238004b(C68279a.m265023b());
                    if (b == null) {
                        return AbstractC68307f.m265084a(new Throwable("the remote process is dead!"));
                    }
                    return b;
                } catch (Exception e) {
                    throw new InvokeRemoteException(e);
                }
            }

            @Override // com.bytedance.ee.bear.contract.am
            public int delCachedStatus(List<String> list) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderListDataService");
                    obtain.writeList(list);
                    this.mRemote.transact(31, obtain, obtain2, 0);
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    obtain2.recycle();
                    obtain.recycle();
                    return readInt;
                } catch (RemoteException e) {
                    throw new InvokeRemoteException(e);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.bytedance.ee.bear.contract.am
            public int deleteDocStatusList(List<String> list) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderListDataService");
                    obtain.writeList(list);
                    this.mRemote.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    obtain2.recycle();
                    obtain.recycle();
                    return readInt;
                } catch (RemoteException e) {
                    throw new InvokeRemoteException(e);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.bytedance.ee.bear.contract.am
            public AbstractC68307f<OfflineDoc> getOfflineDoc(final String str) {
                try {
                    AbstractC68307f<OfflineDoc> b = AbstractC68307f.m265080a(new AbstractC68324h<OfflineDoc>() {
                        /* class com.bytedance.ee.bear.contract.BinderListDataService.Stub.Proxy.C50553 */

                        @Override // io.reactivex.AbstractC68324h
                        public void subscribe(final AbstractC68323g<OfflineDoc> gVar) throws Exception {
                            Parcel obtain = Parcel.obtain();
                            Parcel obtain2 = Parcel.obtain();
                            obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderListDataService");
                            obtain.writeString(str);
                            Proxy.this.mRemote.transact(4, obtain, obtain2, 0);
                            obtain2.readException();
                            RemoteFlow.CREATOR.createFromParcel(obtain2).mo41555a(new RemoteConsumer(new RemoteConsumer.AbstractC10940a<OfflineDoc>() {
                                /* class com.bytedance.ee.bear.contract.BinderListDataService.Stub.Proxy.C50553.C50561 */

                                /* renamed from: a */
                                public void mo19729a(OfflineDoc offlineDoc) {
                                    if (!gVar.isCancelled()) {
                                        gVar.onNext(offlineDoc);
                                        gVar.onComplete();
                                    }
                                }

                                @Override // com.bytedance.ee.bear.service.remote.RemoteConsumer.AbstractC10940a
                                /* renamed from: a */
                                public void mo19730a(Throwable th) {
                                    if (!gVar.isCancelled()) {
                                        gVar.onError(th);
                                        gVar.onComplete();
                                    }
                                }
                            }));
                        }
                    }, BackpressureStrategy.BUFFER).mo238004b(C68279a.m265023b());
                    if (b == null) {
                        return AbstractC68307f.m265084a(new Throwable("the remote process is dead!"));
                    }
                    return b;
                } catch (Exception e) {
                    throw new InvokeRemoteException(e);
                }
            }

            @Override // com.bytedance.ee.bear.contract.am
            public void handleSyncedDoc(OfflineDoc offlineDoc) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderListDataService");
                    if (offlineDoc != null) {
                        obtain.writeInt(1);
                        offlineDoc.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.mRemote.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (RemoteException e) {
                    throw new InvokeRemoteException(e);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.bytedance.ee.bear.contract.am
            public AbstractC68307f<Boolean> hasCached(final String str) {
                try {
                    AbstractC68307f<Boolean> b = AbstractC68307f.m265080a(new AbstractC68324h<Boolean>() {
                        /* class com.bytedance.ee.bear.contract.BinderListDataService.Stub.Proxy.C50574 */

                        @Override // io.reactivex.AbstractC68324h
                        public void subscribe(final AbstractC68323g<Boolean> gVar) throws Exception {
                            Parcel obtain = Parcel.obtain();
                            Parcel obtain2 = Parcel.obtain();
                            obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderListDataService");
                            obtain.writeString(str);
                            Proxy.this.mRemote.transact(9, obtain, obtain2, 0);
                            obtain2.readException();
                            RemoteFlow.CREATOR.createFromParcel(obtain2).mo41555a(new RemoteConsumer(new RemoteConsumer.AbstractC10940a<Boolean>() {
                                /* class com.bytedance.ee.bear.contract.BinderListDataService.Stub.Proxy.C50574.C50581 */

                                /* renamed from: a */
                                public void mo19729a(Boolean bool) {
                                    if (!gVar.isCancelled()) {
                                        gVar.onNext(bool);
                                        gVar.onComplete();
                                    }
                                }

                                @Override // com.bytedance.ee.bear.service.remote.RemoteConsumer.AbstractC10940a
                                /* renamed from: a */
                                public void mo19730a(Throwable th) {
                                    if (!gVar.isCancelled()) {
                                        gVar.onError(th);
                                        gVar.onComplete();
                                    }
                                }
                            }));
                        }
                    }, BackpressureStrategy.BUFFER).mo238004b(C68279a.m265023b());
                    if (b == null) {
                        return AbstractC68307f.m265084a(new Throwable("the remote process is dead!"));
                    }
                    return b;
                } catch (Exception e) {
                    throw new InvokeRemoteException(e);
                }
            }

            @Override // com.bytedance.ee.bear.contract.am
            public AbstractC68307f<Boolean> isManualOffline(final String str) {
                try {
                    AbstractC68307f<Boolean> b = AbstractC68307f.m265080a(new AbstractC68324h<Boolean>() {
                        /* class com.bytedance.ee.bear.contract.BinderListDataService.Stub.Proxy.C50616 */

                        @Override // io.reactivex.AbstractC68324h
                        public void subscribe(final AbstractC68323g<Boolean> gVar) throws Exception {
                            Parcel obtain = Parcel.obtain();
                            Parcel obtain2 = Parcel.obtain();
                            obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderListDataService");
                            obtain.writeString(str);
                            Proxy.this.mRemote.transact(28, obtain, obtain2, 0);
                            obtain2.readException();
                            RemoteFlow.CREATOR.createFromParcel(obtain2).mo41555a(new RemoteConsumer(new RemoteConsumer.AbstractC10940a<Boolean>() {
                                /* class com.bytedance.ee.bear.contract.BinderListDataService.Stub.Proxy.C50616.C50621 */

                                /* renamed from: a */
                                public void mo19729a(Boolean bool) {
                                    if (!gVar.isCancelled()) {
                                        gVar.onNext(bool);
                                        gVar.onComplete();
                                    }
                                }

                                @Override // com.bytedance.ee.bear.service.remote.RemoteConsumer.AbstractC10940a
                                /* renamed from: a */
                                public void mo19730a(Throwable th) {
                                    if (!gVar.isCancelled()) {
                                        gVar.onError(th);
                                        gVar.onComplete();
                                    }
                                }
                            }));
                        }
                    }, BackpressureStrategy.BUFFER).mo238004b(C68279a.m265023b());
                    if (b == null) {
                        return AbstractC68307f.m265084a(new Throwable("the remote process is dead!"));
                    }
                    return b;
                } catch (Exception e) {
                    throw new InvokeRemoteException(e);
                }
            }

            @Override // com.bytedance.ee.bear.contract.am
            public void notifyListDocDelete(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderListDataService");
                    obtain.writeString(str);
                    this.mRemote.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (RemoteException e) {
                    throw new InvokeRemoteException(e);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.bytedance.ee.bear.contract.am
            public void onDocNotFound(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderListDataService");
                    obtain.writeString(str);
                    this.mRemote.transact(25, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (RemoteException e) {
                    throw new InvokeRemoteException(e);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.bytedance.ee.bear.contract.am
            public void registerChangeCallback(BinderListDataChangeCallback binderListDataChangeCallback) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderListDataService");
                    if (binderListDataChangeCallback != null) {
                        iBinder = binderListDataChangeCallback.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.mRemote.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (RemoteException e) {
                    throw new InvokeRemoteException(e);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.bytedance.ee.bear.contract.am
            public void renameDocList(List<OfflineRenameData> list) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderListDataService");
                    obtain.writeList(list);
                    this.mRemote.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (RemoteException e) {
                    throw new InvokeRemoteException(e);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.bytedance.ee.bear.contract.am
            public int saveCachedStatus(List<String> list) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderListDataService");
                    obtain.writeList(list);
                    this.mRemote.transact(30, obtain, obtain2, 0);
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    obtain2.recycle();
                    obtain.recycle();
                    return readInt;
                } catch (RemoteException e) {
                    throw new InvokeRemoteException(e);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.bytedance.ee.bear.contract.am
            public void setDocDataCached(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderListDataService");
                    obtain.writeString(str);
                    this.mRemote.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (RemoteException e) {
                    throw new InvokeRemoteException(e);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.bytedance.ee.bear.contract.am
            public void unRegisterChangeCallback(BinderListDataChangeCallback binderListDataChangeCallback) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderListDataService");
                    if (binderListDataChangeCallback != null) {
                        iBinder = binderListDataChangeCallback.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.mRemote.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (RemoteException e) {
                    throw new InvokeRemoteException(e);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.bytedance.ee.bear.contract.am
            public void updateFileName(OfflineRenameData offlineRenameData) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderListDataService");
                    if (offlineRenameData != null) {
                        obtain.writeInt(1);
                        offlineRenameData.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (RemoteException e) {
                    throw new InvokeRemoteException(e);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.bytedance.ee.bear.contract.am
            public void delOfflineDoc(String str, BinderIDeleteDocCallback binderIDeleteDocCallback) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderListDataService");
                    obtain.writeString(str);
                    if (binderIDeleteDocCallback != null) {
                        iBinder = binderIDeleteDocCallback.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.mRemote.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (RemoteException e) {
                    throw new InvokeRemoteException(e);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.bytedance.ee.bear.contract.am
            public void deleteListRecord(String str, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderListDataService");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.mRemote.transact(33, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (RemoteException e) {
                    throw new InvokeRemoteException(e);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.bytedance.ee.bear.contract.am
            public void notifyListRename(String str, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderListDataService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.mRemote.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (RemoteException e) {
                    throw new InvokeRemoteException(e);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.bytedance.ee.bear.contract.am
            public void notifyListStar(String str, boolean z) {
                int i;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderListDataService");
                    obtain.writeString(str);
                    if (z) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    obtain.writeInt(i);
                    this.mRemote.transact(21, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (RemoteException e) {
                    throw new InvokeRemoteException(e);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.bytedance.ee.bear.contract.am
            public void starSpace(String str, boolean z) {
                int i;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderListDataService");
                    obtain.writeString(str);
                    if (z) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    obtain.writeInt(i);
                    this.mRemote.transact(20, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (RemoteException e) {
                    throw new InvokeRemoteException(e);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.bytedance.ee.bear.contract.am
            public void pinDoc(String str, int i, boolean z) {
                int i2;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderListDataService");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    if (z) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    obtain.writeInt(i2);
                    this.mRemote.transact(22, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (RemoteException e) {
                    throw new InvokeRemoteException(e);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.bytedance.ee.bear.contract.am
            public void starDoc(String str, int i, boolean z) {
                int i2;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderListDataService");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    if (z) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    obtain.writeInt(i2);
                    this.mRemote.transact(19, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (RemoteException e) {
                    throw new InvokeRemoteException(e);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.bytedance.ee.bear.contract.am
            public void cancelManualOffline(String str, int i, boolean z, String str2) {
                int i2;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderListDataService");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    if (z) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    obtain.writeInt(i2);
                    obtain.writeString(str2);
                    this.mRemote.transact(27, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (RemoteException e) {
                    throw new InvokeRemoteException(e);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.bytedance.ee.bear.contract.am
            public AbstractC68307f<DocumentCreateInfo> createDocument(final int i, final String str, final String str2, final boolean z) {
                try {
                    AbstractC68307f<DocumentCreateInfo> b = AbstractC68307f.m265080a(new AbstractC68324h<DocumentCreateInfo>() {
                        /* class com.bytedance.ee.bear.contract.BinderListDataService.Stub.Proxy.C50511 */

                        @Override // io.reactivex.AbstractC68324h
                        public void subscribe(final AbstractC68323g<DocumentCreateInfo> gVar) throws Exception {
                            Parcel obtain = Parcel.obtain();
                            Parcel obtain2 = Parcel.obtain();
                            obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderListDataService");
                            obtain.writeInt(i);
                            obtain.writeString(str);
                            obtain.writeString(str2);
                            obtain.writeInt(z ? 1 : 0);
                            Proxy.this.mRemote.transact(1, obtain, obtain2, 0);
                            obtain2.readException();
                            RemoteFlow.CREATOR.createFromParcel(obtain2).mo41555a(new RemoteConsumer(new RemoteConsumer.AbstractC10940a<DocumentCreateInfo>() {
                                /* class com.bytedance.ee.bear.contract.BinderListDataService.Stub.Proxy.C50511.C50521 */

                                /* renamed from: a */
                                public void mo19729a(DocumentCreateInfo documentCreateInfo) {
                                    if (!gVar.isCancelled()) {
                                        gVar.onNext(documentCreateInfo);
                                        gVar.onComplete();
                                    }
                                }

                                @Override // com.bytedance.ee.bear.service.remote.RemoteConsumer.AbstractC10940a
                                /* renamed from: a */
                                public void mo19730a(Throwable th) {
                                    if (!gVar.isCancelled()) {
                                        gVar.onError(th);
                                        gVar.onComplete();
                                    }
                                }
                            }));
                        }
                    }, BackpressureStrategy.BUFFER).mo238004b(C68279a.m265023b());
                    if (b == null) {
                        return AbstractC68307f.m265084a(new Throwable("the remote process is dead!"));
                    }
                    return b;
                } catch (Exception e) {
                    throw new InvokeRemoteException(e);
                }
            }

            @Override // com.bytedance.ee.bear.contract.am
            public AbstractC68307f<OfflineDoc> createOfflineDocument(final int i, final String str, final String str2, final boolean z) {
                try {
                    AbstractC68307f<OfflineDoc> b = AbstractC68307f.m265080a(new AbstractC68324h<OfflineDoc>() {
                        /* class com.bytedance.ee.bear.contract.BinderListDataService.Stub.Proxy.C50532 */

                        @Override // io.reactivex.AbstractC68324h
                        public void subscribe(final AbstractC68323g<OfflineDoc> gVar) throws Exception {
                            Parcel obtain = Parcel.obtain();
                            Parcel obtain2 = Parcel.obtain();
                            obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderListDataService");
                            obtain.writeInt(i);
                            obtain.writeString(str);
                            obtain.writeString(str2);
                            obtain.writeInt(z ? 1 : 0);
                            Proxy.this.mRemote.transact(2, obtain, obtain2, 0);
                            obtain2.readException();
                            RemoteFlow.CREATOR.createFromParcel(obtain2).mo41555a(new RemoteConsumer(new RemoteConsumer.AbstractC10940a<OfflineDoc>() {
                                /* class com.bytedance.ee.bear.contract.BinderListDataService.Stub.Proxy.C50532.C50541 */

                                /* renamed from: a */
                                public void mo19729a(OfflineDoc offlineDoc) {
                                    if (!gVar.isCancelled()) {
                                        gVar.onNext(offlineDoc);
                                        gVar.onComplete();
                                    }
                                }

                                @Override // com.bytedance.ee.bear.service.remote.RemoteConsumer.AbstractC10940a
                                /* renamed from: a */
                                public void mo19730a(Throwable th) {
                                    if (!gVar.isCancelled()) {
                                        gVar.onError(th);
                                        gVar.onComplete();
                                    }
                                }
                            }));
                        }
                    }, BackpressureStrategy.BUFFER).mo238004b(C68279a.m265023b());
                    if (b == null) {
                        return AbstractC68307f.m265084a(new Throwable("the remote process is dead!"));
                    }
                    return b;
                } catch (Exception e) {
                    throw new InvokeRemoteException(e);
                }
            }

            @Override // com.bytedance.ee.bear.contract.am
            public void deleteDocByObjToken(String str, int i, int i2, BinderIDeleteDocCallback binderIDeleteDocCallback) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderListDataService");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    if (binderIDeleteDocCallback != null) {
                        iBinder = binderIDeleteDocCallback.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.mRemote.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (RemoteException e) {
                    throw new InvokeRemoteException(e);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.bytedance.ee.bear.contract.am
            public void subscribeDoc(String str, int i, boolean z, BinderOnRequestCallback binderOnRequestCallback) {
                int i2;
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderListDataService");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    if (z) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    obtain.writeInt(i2);
                    if (binderOnRequestCallback != null) {
                        iBinder = binderOnRequestCallback.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.mRemote.transact(23, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (RemoteException e) {
                    throw new InvokeRemoteException(e);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.bytedance.ee.bear.contract.am
            public void manualOfflineDownload(boolean z, boolean z2, String str, boolean z3, Document document, BinderIManualOfflineCallback binderIManualOfflineCallback) {
                int i;
                int i2;
                int i3;
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderListDataService");
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
                    obtain.writeString(str);
                    if (z3) {
                        i3 = 1;
                    } else {
                        i3 = 0;
                    }
                    obtain.writeInt(i3);
                    if (document != null) {
                        obtain.writeInt(1);
                        document.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (binderIManualOfflineCallback != null) {
                        iBinder = binderIManualOfflineCallback.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.mRemote.transact(26, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (RemoteException e) {
                    throw new InvokeRemoteException(e);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.bytedance.ee.bear.contract.am
            public void makeCopy(String str, int i, String str2, String str3, String str4, String str5, String str6, int i2, BinderIMakeCopyCallback binderIMakeCopyCallback) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderListDataService");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    obtain.writeString(str4);
                    obtain.writeString(str5);
                    obtain.writeString(str6);
                    obtain.writeInt(i2);
                    if (binderIMakeCopyCallback != null) {
                        iBinder = binderIMakeCopyCallback.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.mRemote.transact(32, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (RemoteException e) {
                    throw new InvokeRemoteException(e);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }
        }

        public Stub() {
            attachInterface(this, "com.bytedance.ee.bear.contract.BinderListDataService");
        }

        public static BinderListDataService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.bytedance.ee.bear.contract.BinderListDataService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof BinderListDataService)) {
                return new Proxy(iBinder);
            }
            return (BinderListDataService) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            boolean z;
            boolean z2;
            Document document;
            if (i != 1598968902) {
                OfflineRenameData offlineRenameData = null;
                OfflineDoc offlineDoc = null;
                boolean z3 = false;
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderListDataService");
                        int readInt = parcel.readInt();
                        String readString = parcel.readString();
                        String readString2 = parcel.readString();
                        if (parcel.readInt() != 0) {
                            z3 = true;
                        }
                        final AbstractC68307f<DocumentCreateInfo> createDocument = createDocument(readInt, readString, readString2, z3);
                        parcel2.writeNoException();
                        new RemoteFlow(new RemoteFlow.AbstractC10943a() {
                            /* class com.bytedance.ee.bear.contract.BinderListDataService.Stub.C50331 */

                            @Override // com.bytedance.ee.bear.service.remote.RemoteFlow.AbstractC10943a
                            /* renamed from: a */
                            public void mo19712a(final RemoteConsumer remoteConsumer) {
                                createDocument.mo238001b(new Consumer<DocumentCreateInfo>() {
                                    /* class com.bytedance.ee.bear.contract.BinderListDataService.Stub.C50331.C50341 */

                                    /* renamed from: a */
                                    public void accept(DocumentCreateInfo documentCreateInfo) {
                                        remoteConsumer.mo41547a(documentCreateInfo);
                                    }
                                }, new Consumer<Throwable>() {
                                    /* class com.bytedance.ee.bear.contract.BinderListDataService.Stub.C50331.C50352 */

                                    /* renamed from: a */
                                    public void accept(Throwable th) {
                                        remoteConsumer.mo41548a(th);
                                    }
                                });
                            }
                        }).writeToParcel(parcel2, 1);
                        return true;
                    case 2:
                        parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderListDataService");
                        int readInt2 = parcel.readInt();
                        String readString3 = parcel.readString();
                        String readString4 = parcel.readString();
                        if (parcel.readInt() != 0) {
                            z3 = true;
                        }
                        final AbstractC68307f<OfflineDoc> createOfflineDocument = createOfflineDocument(readInt2, readString3, readString4, z3);
                        parcel2.writeNoException();
                        new RemoteFlow(new RemoteFlow.AbstractC10943a() {
                            /* class com.bytedance.ee.bear.contract.BinderListDataService.Stub.C50362 */

                            @Override // com.bytedance.ee.bear.service.remote.RemoteFlow.AbstractC10943a
                            /* renamed from: a */
                            public void mo19712a(final RemoteConsumer remoteConsumer) {
                                createOfflineDocument.mo238001b(new Consumer<OfflineDoc>() {
                                    /* class com.bytedance.ee.bear.contract.BinderListDataService.Stub.C50362.C50371 */

                                    /* renamed from: a */
                                    public void accept(OfflineDoc offlineDoc) {
                                        remoteConsumer.mo41547a(offlineDoc);
                                    }
                                }, new Consumer<Throwable>() {
                                    /* class com.bytedance.ee.bear.contract.BinderListDataService.Stub.C50362.C50382 */

                                    /* renamed from: a */
                                    public void accept(Throwable th) {
                                        remoteConsumer.mo41548a(th);
                                    }
                                });
                            }
                        }).writeToParcel(parcel2, 1);
                        return true;
                    case 3:
                        parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderListDataService");
                        if (parcel.readInt() != 0) {
                            offlineRenameData = OfflineRenameData.CREATOR.createFromParcel(parcel);
                        }
                        updateFileName(offlineRenameData);
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderListDataService");
                        final AbstractC68307f<OfflineDoc> offlineDoc2 = getOfflineDoc(parcel.readString());
                        parcel2.writeNoException();
                        new RemoteFlow(new RemoteFlow.AbstractC10943a() {
                            /* class com.bytedance.ee.bear.contract.BinderListDataService.Stub.C50393 */

                            @Override // com.bytedance.ee.bear.service.remote.RemoteFlow.AbstractC10943a
                            /* renamed from: a */
                            public void mo19712a(final RemoteConsumer remoteConsumer) {
                                offlineDoc2.mo238001b(new Consumer<OfflineDoc>() {
                                    /* class com.bytedance.ee.bear.contract.BinderListDataService.Stub.C50393.C50401 */

                                    /* renamed from: a */
                                    public void accept(OfflineDoc offlineDoc) {
                                        remoteConsumer.mo41547a(offlineDoc);
                                    }
                                }, new Consumer<Throwable>() {
                                    /* class com.bytedance.ee.bear.contract.BinderListDataService.Stub.C50393.C50412 */

                                    /* renamed from: a */
                                    public void accept(Throwable th) {
                                        remoteConsumer.mo41548a(th);
                                    }
                                });
                            }
                        }).writeToParcel(parcel2, 1);
                        return true;
                    case 5:
                        parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderListDataService");
                        if (parcel.readInt() != 0) {
                            offlineDoc = OfflineDoc.CREATOR.createFromParcel(parcel);
                        }
                        handleSyncedDoc(offlineDoc);
                        parcel2.writeNoException();
                        return true;
                    case 6:
                        parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderListDataService");
                        setDocDataCached(parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    case 7:
                        parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderListDataService");
                        int deleteDocStatusList = deleteDocStatusList(parcel.readArrayList(getClass().getClassLoader()));
                        parcel2.writeNoException();
                        parcel2.writeInt(deleteDocStatusList);
                        return true;
                    case 8:
                        parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderListDataService");
                        deleteAllDocStatus();
                        parcel2.writeNoException();
                        return true;
                    case 9:
                        parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderListDataService");
                        final AbstractC68307f<Boolean> hasCached = hasCached(parcel.readString());
                        parcel2.writeNoException();
                        new RemoteFlow(new RemoteFlow.AbstractC10943a() {
                            /* class com.bytedance.ee.bear.contract.BinderListDataService.Stub.C50424 */

                            @Override // com.bytedance.ee.bear.service.remote.RemoteFlow.AbstractC10943a
                            /* renamed from: a */
                            public void mo19712a(final RemoteConsumer remoteConsumer) {
                                hasCached.mo238001b(new Consumer<Boolean>() {
                                    /* class com.bytedance.ee.bear.contract.BinderListDataService.Stub.C50424.C50431 */

                                    /* renamed from: a */
                                    public void accept(Boolean bool) {
                                        remoteConsumer.mo41547a(bool);
                                    }
                                }, new Consumer<Throwable>() {
                                    /* class com.bytedance.ee.bear.contract.BinderListDataService.Stub.C50424.C50442 */

                                    /* renamed from: a */
                                    public void accept(Throwable th) {
                                        remoteConsumer.mo41548a(th);
                                    }
                                });
                            }
                        }).writeToParcel(parcel2, 1);
                        return true;
                    case 10:
                        parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderListDataService");
                        registerChangeCallback(BinderListDataChangeCallback.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 11:
                        parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderListDataService");
                        unRegisterChangeCallback(BinderListDataChangeCallback.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                        parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderListDataService");
                        notifyListDocDelete(parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    case 13:
                        parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderListDataService");
                        notifyFileOpen();
                        parcel2.writeNoException();
                        return true;
                    case 14:
                        parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderListDataService");
                        notifyFileClose();
                        parcel2.writeNoException();
                        return true;
                    case 15:
                        parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderListDataService");
                        notifyListRename(parcel.readString(), parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    case 16:
                        parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderListDataService");
                        renameDocList(parcel.readArrayList(getClass().getClassLoader()));
                        parcel2.writeNoException();
                        return true;
                    case 17:
                        parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderListDataService");
                        deleteDocByObjToken(parcel.readString(), parcel.readInt(), parcel.readInt(), BinderIDeleteDocCallback.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 18:
                        parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderListDataService");
                        delOfflineDoc(parcel.readString(), BinderIDeleteDocCallback.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 19:
                        parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderListDataService");
                        String readString5 = parcel.readString();
                        int readInt3 = parcel.readInt();
                        if (parcel.readInt() != 0) {
                            z3 = true;
                        }
                        starDoc(readString5, readInt3, z3);
                        parcel2.writeNoException();
                        return true;
                    case 20:
                        parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderListDataService");
                        String readString6 = parcel.readString();
                        if (parcel.readInt() != 0) {
                            z3 = true;
                        }
                        starSpace(readString6, z3);
                        parcel2.writeNoException();
                        return true;
                    case 21:
                        parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderListDataService");
                        String readString7 = parcel.readString();
                        if (parcel.readInt() != 0) {
                            z3 = true;
                        }
                        notifyListStar(readString7, z3);
                        parcel2.writeNoException();
                        return true;
                    case 22:
                        parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderListDataService");
                        String readString8 = parcel.readString();
                        int readInt4 = parcel.readInt();
                        if (parcel.readInt() != 0) {
                            z3 = true;
                        }
                        pinDoc(readString8, readInt4, z3);
                        parcel2.writeNoException();
                        return true;
                    case 23:
                        parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderListDataService");
                        String readString9 = parcel.readString();
                        int readInt5 = parcel.readInt();
                        if (parcel.readInt() != 0) {
                            z3 = true;
                        }
                        subscribeDoc(readString9, readInt5, z3, BinderOnRequestCallback.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 24:
                        parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderListDataService");
                        final AbstractC68307f<Boolean> clearDocsCacheDataFlowable = clearDocsCacheDataFlowable(parcel.readLong());
                        parcel2.writeNoException();
                        new RemoteFlow(new RemoteFlow.AbstractC10943a() {
                            /* class com.bytedance.ee.bear.contract.BinderListDataService.Stub.C50455 */

                            @Override // com.bytedance.ee.bear.service.remote.RemoteFlow.AbstractC10943a
                            /* renamed from: a */
                            public void mo19712a(final RemoteConsumer remoteConsumer) {
                                clearDocsCacheDataFlowable.mo238001b(new Consumer<Boolean>() {
                                    /* class com.bytedance.ee.bear.contract.BinderListDataService.Stub.C50455.C50461 */

                                    /* renamed from: a */
                                    public void accept(Boolean bool) {
                                        remoteConsumer.mo41547a(bool);
                                    }
                                }, new Consumer<Throwable>() {
                                    /* class com.bytedance.ee.bear.contract.BinderListDataService.Stub.C50455.C50472 */

                                    /* renamed from: a */
                                    public void accept(Throwable th) {
                                        remoteConsumer.mo41548a(th);
                                    }
                                });
                            }
                        }).writeToParcel(parcel2, 1);
                        return true;
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /*{ENCODED_INT: 25}*/:
                        parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderListDataService");
                        onDocNotFound(parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    case 26:
                        parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderListDataService");
                        if (parcel.readInt() == 0) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (parcel.readInt() == 0) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        String readString10 = parcel.readString();
                        if (parcel.readInt() != 0) {
                            z3 = true;
                        }
                        if (parcel.readInt() != 0) {
                            document = Document.CREATOR.createFromParcel(parcel);
                        } else {
                            document = null;
                        }
                        manualOfflineDownload(z, z2, readString10, z3, document, BinderIManualOfflineCallback.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /*{ENCODED_INT: 27}*/:
                        parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderListDataService");
                        String readString11 = parcel.readString();
                        int readInt6 = parcel.readInt();
                        if (parcel.readInt() != 0) {
                            z3 = true;
                        }
                        cancelManualOffline(readString11, readInt6, z3, parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    case IVideoEventLogger.LOGGER_OPTION_ENABLE_SR /*{ENCODED_INT: 28}*/:
                        parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderListDataService");
                        final AbstractC68307f<Boolean> isManualOffline = isManualOffline(parcel.readString());
                        parcel2.writeNoException();
                        new RemoteFlow(new RemoteFlow.AbstractC10943a() {
                            /* class com.bytedance.ee.bear.contract.BinderListDataService.Stub.C50486 */

                            @Override // com.bytedance.ee.bear.service.remote.RemoteFlow.AbstractC10943a
                            /* renamed from: a */
                            public void mo19712a(final RemoteConsumer remoteConsumer) {
                                isManualOffline.mo238001b(new Consumer<Boolean>() {
                                    /* class com.bytedance.ee.bear.contract.BinderListDataService.Stub.C50486.C50491 */

                                    /* renamed from: a */
                                    public void accept(Boolean bool) {
                                        remoteConsumer.mo41547a(bool);
                                    }
                                }, new Consumer<Throwable>() {
                                    /* class com.bytedance.ee.bear.contract.BinderListDataService.Stub.C50486.C50502 */

                                    /* renamed from: a */
                                    public void accept(Throwable th) {
                                        remoteConsumer.mo41548a(th);
                                    }
                                });
                            }
                        }).writeToParcel(parcel2, 1);
                        return true;
                    case 29:
                        parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderListDataService");
                        List<Document> manualOfflineStateList = getManualOfflineStateList();
                        parcel2.writeNoException();
                        parcel2.writeList(manualOfflineStateList);
                        return true;
                    case 30:
                        parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderListDataService");
                        int saveCachedStatus = saveCachedStatus(parcel.readArrayList(getClass().getClassLoader()));
                        parcel2.writeNoException();
                        parcel2.writeInt(saveCachedStatus);
                        return true;
                    case TTVideoEngine.PLAYER_OPTION_ENABLE_PLAYER3_HARDWARE_DECODE /*{ENCODED_INT: 31}*/:
                        parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderListDataService");
                        int delCachedStatus = delCachedStatus(parcel.readArrayList(getClass().getClassLoader()));
                        parcel2.writeNoException();
                        parcel2.writeInt(delCachedStatus);
                        return true;
                    case 32:
                        parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderListDataService");
                        makeCopy(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), BinderIMakeCopyCallback.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 33:
                        parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderListDataService");
                        deleteListRecord(parcel.readString(), parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString("com.bytedance.ee.bear.contract.BinderListDataService");
                return true;
            }
        }
    }
}
