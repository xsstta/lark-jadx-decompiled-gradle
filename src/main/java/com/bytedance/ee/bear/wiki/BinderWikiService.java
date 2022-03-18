package com.bytedance.ee.bear.wiki;

import android.app.Application;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.bytedance.ee.bear.contract.offline.OfflineRenameData;
import com.bytedance.ee.bear.service.exception.InvokeRemoteException;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;
import com.bytedance.ee.bear.service.remote.RemoteConsumer;
import com.bytedance.ee.bear.service.remote.RemoteFlow;
import io.reactivex.AbstractC68307f;
import io.reactivex.AbstractC68323g;
import io.reactivex.AbstractC68324h;
import io.reactivex.BackpressureStrategy;
import io.reactivex.functions.Consumer;
import io.reactivex.p3456d.C68279a;

public interface BinderWikiService extends IInterface, AbstractC10957d, AbstractC11955g {

    public static abstract class Stub extends Binder implements BinderWikiService {
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

        private static class Proxy implements BinderWikiService {
            public IBinder mRemote;

            @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
            public void destroy() {
            }

            public String getInterfaceDescriptor() {
                return "com.bytedance.ee.bear.wiki.BinderWikiService";
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

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.bytedance.ee.bear.wiki.AbstractC11955g
            public AbstractC68307f<Boolean> cleanWikiDataFlowable(final long j) {
                try {
                    AbstractC68307f<Boolean> b = AbstractC68307f.m265080a(new AbstractC68324h<Boolean>() {
                        /* class com.bytedance.ee.bear.wiki.BinderWikiService.Stub.Proxy.C119001 */

                        @Override // io.reactivex.AbstractC68324h
                        public void subscribe(final AbstractC68323g<Boolean> gVar) throws Exception {
                            Parcel obtain = Parcel.obtain();
                            Parcel obtain2 = Parcel.obtain();
                            obtain.writeInterfaceToken("com.bytedance.ee.bear.wiki.BinderWikiService");
                            obtain.writeLong(j);
                            Proxy.this.mRemote.transact(2, obtain, obtain2, 0);
                            obtain2.readException();
                            RemoteFlow.CREATOR.createFromParcel(obtain2).mo41555a(new RemoteConsumer(new RemoteConsumer.AbstractC10940a<Boolean>() {
                                /* class com.bytedance.ee.bear.wiki.BinderWikiService.Stub.Proxy.C119001.C119011 */

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

            @Override // com.bytedance.ee.bear.wiki.AbstractC11955g
            public void updateWikiTitle(OfflineRenameData offlineRenameData) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.wiki.BinderWikiService");
                    if (offlineRenameData != null) {
                        obtain.writeInt(1);
                        offlineRenameData.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
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
        }

        public Stub() {
            attachInterface(this, "com.bytedance.ee.bear.wiki.BinderWikiService");
        }

        public static BinderWikiService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.bytedance.ee.bear.wiki.BinderWikiService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof BinderWikiService)) {
                return new Proxy(iBinder);
            }
            return (BinderWikiService) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            OfflineRenameData offlineRenameData;
            if (i == 1) {
                parcel.enforceInterface("com.bytedance.ee.bear.wiki.BinderWikiService");
                if (parcel.readInt() != 0) {
                    offlineRenameData = OfflineRenameData.CREATOR.createFromParcel(parcel);
                } else {
                    offlineRenameData = null;
                }
                updateWikiTitle(offlineRenameData);
                parcel2.writeNoException();
                return true;
            } else if (i == 2) {
                parcel.enforceInterface("com.bytedance.ee.bear.wiki.BinderWikiService");
                final AbstractC68307f<Boolean> cleanWikiDataFlowable = cleanWikiDataFlowable(parcel.readLong());
                parcel2.writeNoException();
                new RemoteFlow(new RemoteFlow.AbstractC10943a() {
                    /* class com.bytedance.ee.bear.wiki.BinderWikiService.Stub.C118971 */

                    @Override // com.bytedance.ee.bear.service.remote.RemoteFlow.AbstractC10943a
                    /* renamed from: a */
                    public void mo19712a(final RemoteConsumer remoteConsumer) {
                        cleanWikiDataFlowable.mo238001b(new Consumer<Boolean>() {
                            /* class com.bytedance.ee.bear.wiki.BinderWikiService.Stub.C118971.C118981 */

                            /* renamed from: a */
                            public void accept(Boolean bool) {
                                remoteConsumer.mo41547a(bool);
                            }
                        }, new Consumer<Throwable>() {
                            /* class com.bytedance.ee.bear.wiki.BinderWikiService.Stub.C118971.C118992 */

                            /* renamed from: a */
                            public void accept(Throwable th) {
                                remoteConsumer.mo41548a(th);
                            }
                        });
                    }
                }).writeToParcel(parcel2, 1);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.bytedance.ee.bear.wiki.BinderWikiService");
                return true;
            }
        }
    }
}
