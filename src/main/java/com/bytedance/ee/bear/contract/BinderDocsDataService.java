package com.bytedance.ee.bear.contract;

import android.app.Application;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.bytedance.ee.bear.contract.BinderBackgroundSyncDocumentsCallback;
import com.bytedance.ee.bear.contract.BinderIPreloadCallback;
import com.bytedance.ee.bear.contract.BinderIRnConnectStatus;
import com.bytedance.ee.bear.contract.BinderISendDataCallback;
import com.bytedance.ee.bear.contract.BinderPushListener;
import com.bytedance.ee.bear.contract.BinderUnSyncDocumentsCallback;
import com.bytedance.ee.bear.contract.offline.OfflineDoc;
import com.bytedance.ee.bear.service.exception.InvokeRemoteException;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;
import com.bytedance.ee.bear.service.remote.RemoteConsumer;
import com.bytedance.ee.bear.service.remote.RemoteFlow;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.android.HwBuildEx;
import io.reactivex.AbstractC68307f;
import io.reactivex.AbstractC68323g;
import io.reactivex.AbstractC68324h;
import io.reactivex.BackpressureStrategy;
import io.reactivex.functions.Consumer;
import io.reactivex.p3456d.C68279a;
import java.util.ArrayList;
import java.util.List;

public interface BinderDocsDataService extends IInterface, AbstractC5094ag, AbstractC10957d {

    public static abstract class Stub extends Binder implements BinderDocsDataService {
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

        private static class Proxy implements BinderDocsDataService {
            public IBinder mRemote;

            @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
            public void destroy() {
            }

            public String getInterfaceDescriptor() {
                return "com.bytedance.ee.bear.contract.BinderDocsDataService";
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

            @Override // com.bytedance.ee.bear.contract.AbstractC5094ag
            public void clearCacheView() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderDocsDataService");
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

            @Override // com.bytedance.ee.bear.contract.AbstractC5094ag
            public AbstractC68307f<Boolean> clearDocCache() {
                try {
                    AbstractC68307f<Boolean> b = AbstractC68307f.m265080a(new AbstractC68324h<Boolean>() {
                        /* class com.bytedance.ee.bear.contract.BinderDocsDataService.Stub.Proxy.C50314 */

                        @Override // io.reactivex.AbstractC68324h
                        public void subscribe(final AbstractC68323g<Boolean> gVar) throws Exception {
                            Parcel obtain = Parcel.obtain();
                            Parcel obtain2 = Parcel.obtain();
                            obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderDocsDataService");
                            Proxy.this.mRemote.transact(24, obtain, obtain2, 0);
                            obtain2.readException();
                            RemoteFlow.CREATOR.createFromParcel(obtain2).mo41555a(new RemoteConsumer(new RemoteConsumer.AbstractC10940a<Boolean>() {
                                /* class com.bytedance.ee.bear.contract.BinderDocsDataService.Stub.Proxy.C50314.C50321 */

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

            @Override // com.bytedance.ee.bear.contract.AbstractC5094ag
            public AbstractC68307f<Boolean> clearMemUserData() {
                try {
                    AbstractC68307f<Boolean> b = AbstractC68307f.m265080a(new AbstractC68324h<Boolean>() {
                        /* class com.bytedance.ee.bear.contract.BinderDocsDataService.Stub.Proxy.C50272 */

                        @Override // io.reactivex.AbstractC68324h
                        public void subscribe(final AbstractC68323g<Boolean> gVar) throws Exception {
                            Parcel obtain = Parcel.obtain();
                            Parcel obtain2 = Parcel.obtain();
                            obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderDocsDataService");
                            Proxy.this.mRemote.transact(8, obtain, obtain2, 0);
                            obtain2.readException();
                            RemoteFlow.CREATOR.createFromParcel(obtain2).mo41555a(new RemoteConsumer(new RemoteConsumer.AbstractC10940a<Boolean>() {
                                /* class com.bytedance.ee.bear.contract.BinderDocsDataService.Stub.Proxy.C50272.C50281 */

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

            @Override // com.bytedance.ee.bear.contract.AbstractC5094ag
            public AbstractC68307f<Boolean> clearUserData() {
                try {
                    AbstractC68307f<Boolean> b = AbstractC68307f.m265080a(new AbstractC68324h<Boolean>() {
                        /* class com.bytedance.ee.bear.contract.BinderDocsDataService.Stub.Proxy.C50251 */

                        @Override // io.reactivex.AbstractC68324h
                        public void subscribe(final AbstractC68323g<Boolean> gVar) throws Exception {
                            Parcel obtain = Parcel.obtain();
                            Parcel obtain2 = Parcel.obtain();
                            obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderDocsDataService");
                            Proxy.this.mRemote.transact(7, obtain, obtain2, 0);
                            obtain2.readException();
                            RemoteFlow.CREATOR.createFromParcel(obtain2).mo41555a(new RemoteConsumer(new RemoteConsumer.AbstractC10940a<Boolean>() {
                                /* class com.bytedance.ee.bear.contract.BinderDocsDataService.Stub.Proxy.C50251.C50261 */

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

            @Override // com.bytedance.ee.bear.contract.AbstractC5094ag
            public List<String> getTokenList() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderDocsDataService");
                    this.mRemote.transact(6, obtain, obtain2, 0);
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

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.bytedance.ee.bear.contract.AbstractC5094ag
            public void addRnConnectStatusCallback(BinderIRnConnectStatus binderIRnConnectStatus) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderDocsDataService");
                    if (binderIRnConnectStatus != null) {
                        iBinder = binderIRnConnectStatus.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
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

            @Override // com.bytedance.ee.bear.contract.AbstractC5094ag
            public int clearUpTimeMills(long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderDocsDataService");
                    obtain.writeLong(j);
                    this.mRemote.transact(25, obtain, obtain2, 0);
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

            @Override // com.bytedance.ee.bear.contract.AbstractC5094ag
            public void delDocs(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderDocsDataService");
                    obtain.writeString(str);
                    this.mRemote.transact(4, obtain, obtain2, 0);
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

            @Override // com.bytedance.ee.bear.contract.AbstractC5094ag
            public void delDocsList(List<String> list) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderDocsDataService");
                    obtain.writeList(list);
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

            @Override // com.bytedance.ee.bear.contract.AbstractC5094ag
            public AbstractC68307f<Long> getDocCacheSize(final long j) {
                try {
                    AbstractC68307f<Long> b = AbstractC68307f.m265080a(new AbstractC68324h<Long>() {
                        /* class com.bytedance.ee.bear.contract.BinderDocsDataService.Stub.Proxy.C50293 */

                        @Override // io.reactivex.AbstractC68324h
                        public void subscribe(final AbstractC68323g<Long> gVar) throws Exception {
                            Parcel obtain = Parcel.obtain();
                            Parcel obtain2 = Parcel.obtain();
                            obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderDocsDataService");
                            obtain.writeLong(j);
                            Proxy.this.mRemote.transact(23, obtain, obtain2, 0);
                            obtain2.readException();
                            RemoteFlow.CREATOR.createFromParcel(obtain2).mo41555a(new RemoteConsumer(new RemoteConsumer.AbstractC10940a<Long>() {
                                /* class com.bytedance.ee.bear.contract.BinderDocsDataService.Stub.Proxy.C50293.C50301 */

                                /* renamed from: a */
                                public void mo19729a(Long l) {
                                    if (!gVar.isCancelled()) {
                                        gVar.onNext(l);
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

            @Override // com.bytedance.ee.bear.contract.AbstractC5094ag
            public void preloadDocs(List<OfflineDoc> list) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderDocsDataService");
                    obtain.writeList(list);
                    this.mRemote.transact(2, obtain, obtain2, 0);
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

            @Override // com.bytedance.ee.bear.contract.AbstractC5094ag
            public void preloadDocsInterval(List<OfflineDoc> list) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderDocsDataService");
                    obtain.writeList(list);
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

            @Override // com.bytedance.ee.bear.contract.AbstractC5094ag
            public void registSendDataCallback(BinderISendDataCallback binderISendDataCallback) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderDocsDataService");
                    if (binderISendDataCallback != null) {
                        iBinder = binderISendDataCallback.asBinder();
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

            @Override // com.bytedance.ee.bear.contract.AbstractC5094ag
            public void registerBackgroundSyncDocumentsChangeCallback(BinderBackgroundSyncDocumentsCallback binderBackgroundSyncDocumentsCallback) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderDocsDataService");
                    if (binderBackgroundSyncDocumentsCallback != null) {
                        iBinder = binderBackgroundSyncDocumentsCallback.asBinder();
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

            @Override // com.bytedance.ee.bear.contract.AbstractC5094ag
            public void registerUnSyncDocumentsChangeCallback(BinderUnSyncDocumentsCallback binderUnSyncDocumentsCallback) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderDocsDataService");
                    if (binderUnSyncDocumentsCallback != null) {
                        iBinder = binderUnSyncDocumentsCallback.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.mRemote.transact(9, obtain, obtain2, 0);
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

            @Override // com.bytedance.ee.bear.contract.AbstractC5094ag
            public void removeRnConnectStatusCallback(BinderIRnConnectStatus binderIRnConnectStatus) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderDocsDataService");
                    if (binderIRnConnectStatus != null) {
                        iBinder = binderIRnConnectStatus.asBinder();
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

            @Override // com.bytedance.ee.bear.contract.AbstractC5094ag
            public void unRegistSendDataCallback(BinderISendDataCallback binderISendDataCallback) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderDocsDataService");
                    if (binderISendDataCallback != null) {
                        iBinder = binderISendDataCallback.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
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

            @Override // com.bytedance.ee.bear.contract.AbstractC5094ag
            public void unRegisterBackgroundSyncDocumentsChangeCallback(BinderBackgroundSyncDocumentsCallback binderBackgroundSyncDocumentsCallback) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderDocsDataService");
                    if (binderBackgroundSyncDocumentsCallback != null) {
                        iBinder = binderBackgroundSyncDocumentsCallback.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
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

            @Override // com.bytedance.ee.bear.contract.AbstractC5094ag
            public void unRegisterUnSyncDocumentsChangeCallback(BinderUnSyncDocumentsCallback binderUnSyncDocumentsCallback) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderDocsDataService");
                    if (binderUnSyncDocumentsCallback != null) {
                        iBinder = binderUnSyncDocumentsCallback.asBinder();
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

            @Override // com.bytedance.ee.bear.contract.AbstractC5094ag
            public void uploadDocs(List<OfflineDoc> list) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderDocsDataService");
                    obtain.writeList(list);
                    this.mRemote.transact(1, obtain, obtain2, 0);
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

            @Override // com.bytedance.ee.bear.contract.AbstractC5094ag
            public int clearImageUpTimeMills(long j, long j2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderDocsDataService");
                    obtain.writeLong(j);
                    obtain.writeLong(j2);
                    this.mRemote.transact(26, obtain, obtain2, 0);
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

            @Override // com.bytedance.ee.bear.contract.AbstractC5094ag
            public void registerListPushListener(BinderPushListener binderPushListener, String str) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderDocsDataService");
                    if (binderPushListener != null) {
                        iBinder = binderPushListener.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeString(str);
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

            @Override // com.bytedance.ee.bear.contract.AbstractC5094ag
            public void unRegisterListPushListener(BinderPushListener binderPushListener, String str) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderDocsDataService");
                    if (binderPushListener != null) {
                        iBinder = binderPushListener.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeString(str);
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

            @Override // com.bytedance.ee.bear.contract.AbstractC5094ag
            public void unWatchDocs(List<OfflineDoc> list, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderDocsDataService");
                    obtain.writeList(list);
                    obtain.writeString(str);
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

            @Override // com.bytedance.ee.bear.contract.AbstractC5094ag
            public void watchDocs(List<OfflineDoc> list, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderDocsDataService");
                    obtain.writeList(list);
                    obtain.writeString(str);
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

            @Override // com.bytedance.ee.bear.contract.AbstractC5094ag
            public void preloadDocs(OfflineDoc offlineDoc, BinderIPreloadCallback binderIPreloadCallback) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderDocsDataService");
                    if (offlineDoc != null) {
                        obtain.writeInt(1);
                        offlineDoc.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (binderIPreloadCallback != null) {
                        iBinder = binderIPreloadCallback.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
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
        }

        public Stub() {
            attachInterface(this, "com.bytedance.ee.bear.contract.BinderDocsDataService");
        }

        public static BinderDocsDataService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.bytedance.ee.bear.contract.BinderDocsDataService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof BinderDocsDataService)) {
                return new Proxy(iBinder);
            }
            return (BinderDocsDataService) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            OfflineDoc offlineDoc;
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderDocsDataService");
                        uploadDocs(parcel.readArrayList(getClass().getClassLoader()));
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderDocsDataService");
                        preloadDocs(parcel.readArrayList(getClass().getClassLoader()));
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderDocsDataService");
                        preloadDocsInterval(parcel.readArrayList(getClass().getClassLoader()));
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderDocsDataService");
                        delDocs(parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    case 5:
                        parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderDocsDataService");
                        delDocsList(parcel.readArrayList(getClass().getClassLoader()));
                        parcel2.writeNoException();
                        return true;
                    case 6:
                        parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderDocsDataService");
                        List<String> tokenList = getTokenList();
                        parcel2.writeNoException();
                        parcel2.writeList(tokenList);
                        return true;
                    case 7:
                        parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderDocsDataService");
                        final AbstractC68307f<Boolean> clearUserData = clearUserData();
                        parcel2.writeNoException();
                        new RemoteFlow(new RemoteFlow.AbstractC10943a() {
                            /* class com.bytedance.ee.bear.contract.BinderDocsDataService.Stub.C50131 */

                            @Override // com.bytedance.ee.bear.service.remote.RemoteFlow.AbstractC10943a
                            /* renamed from: a */
                            public void mo19712a(final RemoteConsumer remoteConsumer) {
                                clearUserData.mo238001b(new Consumer<Boolean>() {
                                    /* class com.bytedance.ee.bear.contract.BinderDocsDataService.Stub.C50131.C50141 */

                                    /* renamed from: a */
                                    public void accept(Boolean bool) {
                                        remoteConsumer.mo41547a(bool);
                                    }
                                }, new Consumer<Throwable>() {
                                    /* class com.bytedance.ee.bear.contract.BinderDocsDataService.Stub.C50131.C50152 */

                                    /* renamed from: a */
                                    public void accept(Throwable th) {
                                        remoteConsumer.mo41548a(th);
                                    }
                                });
                            }
                        }).writeToParcel(parcel2, 1);
                        return true;
                    case 8:
                        parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderDocsDataService");
                        final AbstractC68307f<Boolean> clearMemUserData = clearMemUserData();
                        parcel2.writeNoException();
                        new RemoteFlow(new RemoteFlow.AbstractC10943a() {
                            /* class com.bytedance.ee.bear.contract.BinderDocsDataService.Stub.C50162 */

                            @Override // com.bytedance.ee.bear.service.remote.RemoteFlow.AbstractC10943a
                            /* renamed from: a */
                            public void mo19712a(final RemoteConsumer remoteConsumer) {
                                clearMemUserData.mo238001b(new Consumer<Boolean>() {
                                    /* class com.bytedance.ee.bear.contract.BinderDocsDataService.Stub.C50162.C50171 */

                                    /* renamed from: a */
                                    public void accept(Boolean bool) {
                                        remoteConsumer.mo41547a(bool);
                                    }
                                }, new Consumer<Throwable>() {
                                    /* class com.bytedance.ee.bear.contract.BinderDocsDataService.Stub.C50162.C50182 */

                                    /* renamed from: a */
                                    public void accept(Throwable th) {
                                        remoteConsumer.mo41548a(th);
                                    }
                                });
                            }
                        }).writeToParcel(parcel2, 1);
                        return true;
                    case 9:
                        parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderDocsDataService");
                        registerUnSyncDocumentsChangeCallback(BinderUnSyncDocumentsCallback.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 10:
                        parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderDocsDataService");
                        unRegisterUnSyncDocumentsChangeCallback(BinderUnSyncDocumentsCallback.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 11:
                        parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderDocsDataService");
                        registerBackgroundSyncDocumentsChangeCallback(BinderBackgroundSyncDocumentsCallback.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                        parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderDocsDataService");
                        unRegisterBackgroundSyncDocumentsChangeCallback(BinderBackgroundSyncDocumentsCallback.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 13:
                        parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderDocsDataService");
                        clearCacheView();
                        parcel2.writeNoException();
                        return true;
                    case 14:
                        parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderDocsDataService");
                        registerListPushListener(BinderPushListener.Stub.asInterface(parcel.readStrongBinder()), parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    case 15:
                        parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderDocsDataService");
                        unRegisterListPushListener(BinderPushListener.Stub.asInterface(parcel.readStrongBinder()), parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    case 16:
                        parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderDocsDataService");
                        addRnConnectStatusCallback(BinderIRnConnectStatus.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 17:
                        parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderDocsDataService");
                        removeRnConnectStatusCallback(BinderIRnConnectStatus.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 18:
                        parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderDocsDataService");
                        registSendDataCallback(BinderISendDataCallback.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 19:
                        parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderDocsDataService");
                        unRegistSendDataCallback(BinderISendDataCallback.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 20:
                        parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderDocsDataService");
                        watchDocs(parcel.readArrayList(getClass().getClassLoader()), parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    case 21:
                        parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderDocsDataService");
                        unWatchDocs(parcel.readArrayList(getClass().getClassLoader()), parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    case 22:
                        parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderDocsDataService");
                        if (parcel.readInt() != 0) {
                            offlineDoc = OfflineDoc.CREATOR.createFromParcel(parcel);
                        } else {
                            offlineDoc = null;
                        }
                        preloadDocs(offlineDoc, BinderIPreloadCallback.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 23:
                        parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderDocsDataService");
                        final AbstractC68307f<Long> docCacheSize = getDocCacheSize(parcel.readLong());
                        parcel2.writeNoException();
                        new RemoteFlow(new RemoteFlow.AbstractC10943a() {
                            /* class com.bytedance.ee.bear.contract.BinderDocsDataService.Stub.C50193 */

                            @Override // com.bytedance.ee.bear.service.remote.RemoteFlow.AbstractC10943a
                            /* renamed from: a */
                            public void mo19712a(final RemoteConsumer remoteConsumer) {
                                docCacheSize.mo238001b(new Consumer<Long>() {
                                    /* class com.bytedance.ee.bear.contract.BinderDocsDataService.Stub.C50193.C50201 */

                                    /* renamed from: a */
                                    public void accept(Long l) {
                                        remoteConsumer.mo41547a(l);
                                    }
                                }, new Consumer<Throwable>() {
                                    /* class com.bytedance.ee.bear.contract.BinderDocsDataService.Stub.C50193.C50212 */

                                    /* renamed from: a */
                                    public void accept(Throwable th) {
                                        remoteConsumer.mo41548a(th);
                                    }
                                });
                            }
                        }).writeToParcel(parcel2, 1);
                        return true;
                    case 24:
                        parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderDocsDataService");
                        final AbstractC68307f<Boolean> clearDocCache = clearDocCache();
                        parcel2.writeNoException();
                        new RemoteFlow(new RemoteFlow.AbstractC10943a() {
                            /* class com.bytedance.ee.bear.contract.BinderDocsDataService.Stub.C50224 */

                            @Override // com.bytedance.ee.bear.service.remote.RemoteFlow.AbstractC10943a
                            /* renamed from: a */
                            public void mo19712a(final RemoteConsumer remoteConsumer) {
                                clearDocCache.mo238001b(new Consumer<Boolean>() {
                                    /* class com.bytedance.ee.bear.contract.BinderDocsDataService.Stub.C50224.C50231 */

                                    /* renamed from: a */
                                    public void accept(Boolean bool) {
                                        remoteConsumer.mo41547a(bool);
                                    }
                                }, new Consumer<Throwable>() {
                                    /* class com.bytedance.ee.bear.contract.BinderDocsDataService.Stub.C50224.C50242 */

                                    /* renamed from: a */
                                    public void accept(Throwable th) {
                                        remoteConsumer.mo41548a(th);
                                    }
                                });
                            }
                        }).writeToParcel(parcel2, 1);
                        return true;
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /*{ENCODED_INT: 25}*/:
                        parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderDocsDataService");
                        int clearUpTimeMills = clearUpTimeMills(parcel.readLong());
                        parcel2.writeNoException();
                        parcel2.writeInt(clearUpTimeMills);
                        return true;
                    case 26:
                        parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderDocsDataService");
                        int clearImageUpTimeMills = clearImageUpTimeMills(parcel.readLong(), parcel.readLong());
                        parcel2.writeNoException();
                        parcel2.writeInt(clearImageUpTimeMills);
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString("com.bytedance.ee.bear.contract.BinderDocsDataService");
                return true;
            }
        }
    }
}
