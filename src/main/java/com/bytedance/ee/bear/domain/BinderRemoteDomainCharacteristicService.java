package com.bytedance.ee.bear.domain;

import android.app.Application;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.bytedance.ee.bear.domain.AbstractC6307e;
import com.bytedance.ee.bear.domain.BinderOnDomainCharacteristicChangeListener;
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

public interface BinderRemoteDomainCharacteristicService extends IInterface, AbstractC6307e.AbstractC6308a, AbstractC10957d {

    public static abstract class Stub extends Binder implements BinderRemoteDomainCharacteristicService {
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

        /* access modifiers changed from: private */
        public static class Proxy implements BinderRemoteDomainCharacteristicService {
            public IBinder mRemote;

            @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
            public void destroy() {
            }

            public String getInterfaceDescriptor() {
                return "com.bytedance.ee.bear.domain.BinderRemoteDomainCharacteristicService";
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

            @Override // com.bytedance.ee.bear.domain.AbstractC6307e.AbstractC6308a
            public void fetchConfig() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.domain.BinderRemoteDomainCharacteristicService");
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

            @Override // com.bytedance.ee.bear.domain.AbstractC6307e.AbstractC6308a
            public AbstractC68307f<String> getDomainCharacteristicConfig() {
                try {
                    AbstractC68307f<String> b = AbstractC68307f.m265080a(new AbstractC68324h<String>() {
                        /* class com.bytedance.ee.bear.domain.BinderRemoteDomainCharacteristicService.Stub.Proxy.C63011 */

                        @Override // io.reactivex.AbstractC68324h
                        public void subscribe(final AbstractC68323g<String> gVar) throws Exception {
                            Parcel obtain = Parcel.obtain();
                            Parcel obtain2 = Parcel.obtain();
                            obtain.writeInterfaceToken("com.bytedance.ee.bear.domain.BinderRemoteDomainCharacteristicService");
                            Proxy.this.mRemote.transact(2, obtain, obtain2, 0);
                            obtain2.readException();
                            RemoteFlow.CREATOR.createFromParcel(obtain2).mo41555a(new RemoteConsumer(new RemoteConsumer.AbstractC10940a<String>() {
                                /* class com.bytedance.ee.bear.domain.BinderRemoteDomainCharacteristicService.Stub.Proxy.C63011.C63021 */

                                /* renamed from: a */
                                public void mo19729a(String str) {
                                    if (!gVar.isCancelled()) {
                                        gVar.onNext(str);
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

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.bytedance.ee.bear.domain.AbstractC6307e.AbstractC6308a
            public void registerConfigChangeListener(BinderOnDomainCharacteristicChangeListener binderOnDomainCharacteristicChangeListener) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.domain.BinderRemoteDomainCharacteristicService");
                    if (binderOnDomainCharacteristicChangeListener != null) {
                        iBinder = binderOnDomainCharacteristicChangeListener.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
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

            @Override // com.bytedance.ee.bear.domain.AbstractC6307e.AbstractC6308a
            public void unregisterConfigChangeListener(BinderOnDomainCharacteristicChangeListener binderOnDomainCharacteristicChangeListener) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.domain.BinderRemoteDomainCharacteristicService");
                    if (binderOnDomainCharacteristicChangeListener != null) {
                        iBinder = binderOnDomainCharacteristicChangeListener.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
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
        }

        public Stub() {
            attachInterface(this, "com.bytedance.ee.bear.domain.BinderRemoteDomainCharacteristicService");
        }

        public static BinderRemoteDomainCharacteristicService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.bytedance.ee.bear.domain.BinderRemoteDomainCharacteristicService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof BinderRemoteDomainCharacteristicService)) {
                return new Proxy(iBinder);
            }
            return (BinderRemoteDomainCharacteristicService) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.bytedance.ee.bear.domain.BinderRemoteDomainCharacteristicService");
                fetchConfig();
                parcel2.writeNoException();
                return true;
            } else if (i == 2) {
                parcel.enforceInterface("com.bytedance.ee.bear.domain.BinderRemoteDomainCharacteristicService");
                final AbstractC68307f<String> domainCharacteristicConfig = getDomainCharacteristicConfig();
                parcel2.writeNoException();
                new RemoteFlow(new RemoteFlow.AbstractC10943a() {
                    /* class com.bytedance.ee.bear.domain.BinderRemoteDomainCharacteristicService.Stub.C62981 */

                    @Override // com.bytedance.ee.bear.service.remote.RemoteFlow.AbstractC10943a
                    /* renamed from: a */
                    public void mo19712a(final RemoteConsumer remoteConsumer) {
                        domainCharacteristicConfig.mo238001b(new Consumer<String>() {
                            /* class com.bytedance.ee.bear.domain.BinderRemoteDomainCharacteristicService.Stub.C62981.C62991 */

                            /* renamed from: a */
                            public void accept(String str) {
                                remoteConsumer.mo41547a(str);
                            }
                        }, new Consumer<Throwable>() {
                            /* class com.bytedance.ee.bear.domain.BinderRemoteDomainCharacteristicService.Stub.C62981.C63002 */

                            /* renamed from: a */
                            public void accept(Throwable th) {
                                remoteConsumer.mo41548a(th);
                            }
                        });
                    }
                }).writeToParcel(parcel2, 1);
                return true;
            } else if (i == 3) {
                parcel.enforceInterface("com.bytedance.ee.bear.domain.BinderRemoteDomainCharacteristicService");
                registerConfigChangeListener(BinderOnDomainCharacteristicChangeListener.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            } else if (i == 4) {
                parcel.enforceInterface("com.bytedance.ee.bear.domain.BinderRemoteDomainCharacteristicService");
                unregisterConfigChangeListener(BinderOnDomainCharacteristicChangeListener.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.bytedance.ee.bear.domain.BinderRemoteDomainCharacteristicService");
                return true;
            }
        }
    }
}
