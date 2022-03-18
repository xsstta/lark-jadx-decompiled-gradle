package com.bytedance.ee.bear.contract;

import android.app.Application;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.BinderAccountChangeCallback;
import com.bytedance.ee.bear.contract.config.DocDynamicConfig;
import com.bytedance.ee.bear.contract.config.LoginInfo;
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

public interface BinderAccountService extends IInterface, AccountService, AbstractC10957d {

    public static abstract class Stub extends Binder implements BinderAccountService {
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

        private static class Proxy implements BinderAccountService {
            public IBinder mRemote;

            @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
            public void destroy() {
            }

            public String getInterfaceDescriptor() {
                return "com.bytedance.ee.bear.contract.BinderAccountService";
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

            @Override // com.bytedance.ee.bear.contract.AccountService
            public AbstractC68307f<AccountService.Account> findLoginUser() {
                try {
                    AbstractC68307f<AccountService.Account> b = AbstractC68307f.m265080a(new AbstractC68324h<AccountService.Account>() {
                        /* class com.bytedance.ee.bear.contract.BinderAccountService.Stub.Proxy.C50011 */

                        @Override // io.reactivex.AbstractC68324h
                        public void subscribe(final AbstractC68323g<AccountService.Account> gVar) throws Exception {
                            Parcel obtain = Parcel.obtain();
                            Parcel obtain2 = Parcel.obtain();
                            obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderAccountService");
                            Proxy.this.mRemote.transact(1, obtain, obtain2, 0);
                            obtain2.readException();
                            RemoteFlow.CREATOR.createFromParcel(obtain2).mo41555a(new RemoteConsumer(new RemoteConsumer.AbstractC10940a<AccountService.Account>() {
                                /* class com.bytedance.ee.bear.contract.BinderAccountService.Stub.Proxy.C50011.C50021 */

                                /* renamed from: a */
                                public void mo19729a(AccountService.Account account) {
                                    if (!gVar.isCancelled()) {
                                        gVar.onNext(account);
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

            @Override // com.bytedance.ee.bear.contract.AccountService
            public AbstractC68307f<Boolean> logoutFlow() {
                try {
                    AbstractC68307f<Boolean> b = AbstractC68307f.m265080a(new AbstractC68324h<Boolean>() {
                        /* class com.bytedance.ee.bear.contract.BinderAccountService.Stub.Proxy.C50095 */

                        @Override // io.reactivex.AbstractC68324h
                        public void subscribe(final AbstractC68323g<Boolean> gVar) throws Exception {
                            Parcel obtain = Parcel.obtain();
                            Parcel obtain2 = Parcel.obtain();
                            obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderAccountService");
                            Proxy.this.mRemote.transact(7, obtain, obtain2, 0);
                            obtain2.readException();
                            RemoteFlow.CREATOR.createFromParcel(obtain2).mo41555a(new RemoteConsumer(new RemoteConsumer.AbstractC10940a<Boolean>() {
                                /* class com.bytedance.ee.bear.contract.BinderAccountService.Stub.Proxy.C50095.C50101 */

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

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.bytedance.ee.bear.contract.AccountService
            public AbstractC68307f<Boolean> checkAndLogin(final String str) {
                try {
                    AbstractC68307f<Boolean> b = AbstractC68307f.m265080a(new AbstractC68324h<Boolean>() {
                        /* class com.bytedance.ee.bear.contract.BinderAccountService.Stub.Proxy.C50053 */

                        @Override // io.reactivex.AbstractC68324h
                        public void subscribe(final AbstractC68323g<Boolean> gVar) throws Exception {
                            Parcel obtain = Parcel.obtain();
                            Parcel obtain2 = Parcel.obtain();
                            obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderAccountService");
                            obtain.writeString(str);
                            Proxy.this.mRemote.transact(5, obtain, obtain2, 0);
                            obtain2.readException();
                            RemoteFlow.CREATOR.createFromParcel(obtain2).mo41555a(new RemoteConsumer(new RemoteConsumer.AbstractC10940a<Boolean>() {
                                /* class com.bytedance.ee.bear.contract.BinderAccountService.Stub.Proxy.C50053.C50061 */

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

            @Override // com.bytedance.ee.bear.contract.AccountService
            public AbstractC68307f<Boolean> checkLoginInfo(final LoginInfo loginInfo) {
                try {
                    AbstractC68307f<Boolean> b = AbstractC68307f.m265080a(new AbstractC68324h<Boolean>() {
                        /* class com.bytedance.ee.bear.contract.BinderAccountService.Stub.Proxy.C50074 */

                        @Override // io.reactivex.AbstractC68324h
                        public void subscribe(final AbstractC68323g<Boolean> gVar) throws Exception {
                            Parcel obtain = Parcel.obtain();
                            Parcel obtain2 = Parcel.obtain();
                            obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderAccountService");
                            if (loginInfo != null) {
                                obtain.writeInt(1);
                                loginInfo.writeToParcel(obtain, 0);
                            } else {
                                obtain.writeInt(0);
                            }
                            Proxy.this.mRemote.transact(6, obtain, obtain2, 0);
                            obtain2.readException();
                            RemoteFlow.CREATOR.createFromParcel(obtain2).mo41555a(new RemoteConsumer(new RemoteConsumer.AbstractC10940a<Boolean>() {
                                /* class com.bytedance.ee.bear.contract.BinderAccountService.Stub.Proxy.C50074.C50081 */

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

            @Override // com.bytedance.ee.bear.contract.AccountService
            public AbstractC68307f<Boolean> loginFlow(final String str) {
                try {
                    AbstractC68307f<Boolean> b = AbstractC68307f.m265080a(new AbstractC68324h<Boolean>() {
                        /* class com.bytedance.ee.bear.contract.BinderAccountService.Stub.Proxy.C50032 */

                        @Override // io.reactivex.AbstractC68324h
                        public void subscribe(final AbstractC68323g<Boolean> gVar) throws Exception {
                            Parcel obtain = Parcel.obtain();
                            Parcel obtain2 = Parcel.obtain();
                            obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderAccountService");
                            obtain.writeString(str);
                            Proxy.this.mRemote.transact(4, obtain, obtain2, 0);
                            obtain2.readException();
                            RemoteFlow.CREATOR.createFromParcel(obtain2).mo41555a(new RemoteConsumer(new RemoteConsumer.AbstractC10940a<Boolean>() {
                                /* class com.bytedance.ee.bear.contract.BinderAccountService.Stub.Proxy.C50032.C50041 */

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

            @Override // com.bytedance.ee.bear.contract.AccountService
            public AbstractC68307f<Boolean> notifyConfigChange(final DocDynamicConfig docDynamicConfig) {
                try {
                    AbstractC68307f<Boolean> b = AbstractC68307f.m265080a(new AbstractC68324h<Boolean>() {
                        /* class com.bytedance.ee.bear.contract.BinderAccountService.Stub.Proxy.C50116 */

                        @Override // io.reactivex.AbstractC68324h
                        public void subscribe(final AbstractC68323g<Boolean> gVar) throws Exception {
                            Parcel obtain = Parcel.obtain();
                            Parcel obtain2 = Parcel.obtain();
                            obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderAccountService");
                            if (docDynamicConfig != null) {
                                obtain.writeInt(1);
                                docDynamicConfig.writeToParcel(obtain, 0);
                            } else {
                                obtain.writeInt(0);
                            }
                            Proxy.this.mRemote.transact(8, obtain, obtain2, 0);
                            obtain2.readException();
                            RemoteFlow.CREATOR.createFromParcel(obtain2).mo41555a(new RemoteConsumer(new RemoteConsumer.AbstractC10940a<Boolean>() {
                                /* class com.bytedance.ee.bear.contract.BinderAccountService.Stub.Proxy.C50116.C50121 */

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

            @Override // com.bytedance.ee.bear.contract.AccountService
            public void registerChangeCallback(BinderAccountChangeCallback binderAccountChangeCallback) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderAccountService");
                    if (binderAccountChangeCallback != null) {
                        iBinder = binderAccountChangeCallback.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
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

            @Override // com.bytedance.ee.bear.contract.AccountService
            public void unregisterChangeCallback(BinderAccountChangeCallback binderAccountChangeCallback) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.BinderAccountService");
                    if (binderAccountChangeCallback != null) {
                        iBinder = binderAccountChangeCallback.asBinder();
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
        }

        public Stub() {
            attachInterface(this, "com.bytedance.ee.bear.contract.BinderAccountService");
        }

        public static BinderAccountService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.bytedance.ee.bear.contract.BinderAccountService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof BinderAccountService)) {
                return new Proxy(iBinder);
            }
            return (BinderAccountService) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1598968902) {
                LoginInfo loginInfo = null;
                DocDynamicConfig docDynamicConfig = null;
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderAccountService");
                        final AbstractC68307f<AccountService.Account> findLoginUser = findLoginUser();
                        parcel2.writeNoException();
                        new RemoteFlow(new RemoteFlow.AbstractC10943a() {
                            /* class com.bytedance.ee.bear.contract.BinderAccountService.Stub.C49831 */

                            @Override // com.bytedance.ee.bear.service.remote.RemoteFlow.AbstractC10943a
                            /* renamed from: a */
                            public void mo19712a(final RemoteConsumer remoteConsumer) {
                                findLoginUser.mo238001b(new Consumer<AccountService.Account>() {
                                    /* class com.bytedance.ee.bear.contract.BinderAccountService.Stub.C49831.C49841 */

                                    /* renamed from: a */
                                    public void accept(AccountService.Account account) {
                                        remoteConsumer.mo41547a(account);
                                    }
                                }, new Consumer<Throwable>() {
                                    /* class com.bytedance.ee.bear.contract.BinderAccountService.Stub.C49831.C49852 */

                                    /* renamed from: a */
                                    public void accept(Throwable th) {
                                        remoteConsumer.mo41548a(th);
                                    }
                                });
                            }
                        }).writeToParcel(parcel2, 1);
                        return true;
                    case 2:
                        parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderAccountService");
                        registerChangeCallback(BinderAccountChangeCallback.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderAccountService");
                        unregisterChangeCallback(BinderAccountChangeCallback.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderAccountService");
                        final AbstractC68307f<Boolean> loginFlow = loginFlow(parcel.readString());
                        parcel2.writeNoException();
                        new RemoteFlow(new RemoteFlow.AbstractC10943a() {
                            /* class com.bytedance.ee.bear.contract.BinderAccountService.Stub.C49862 */

                            @Override // com.bytedance.ee.bear.service.remote.RemoteFlow.AbstractC10943a
                            /* renamed from: a */
                            public void mo19712a(final RemoteConsumer remoteConsumer) {
                                loginFlow.mo238001b(new Consumer<Boolean>() {
                                    /* class com.bytedance.ee.bear.contract.BinderAccountService.Stub.C49862.C49871 */

                                    /* renamed from: a */
                                    public void accept(Boolean bool) {
                                        remoteConsumer.mo41547a(bool);
                                    }
                                }, new Consumer<Throwable>() {
                                    /* class com.bytedance.ee.bear.contract.BinderAccountService.Stub.C49862.C49882 */

                                    /* renamed from: a */
                                    public void accept(Throwable th) {
                                        remoteConsumer.mo41548a(th);
                                    }
                                });
                            }
                        }).writeToParcel(parcel2, 1);
                        return true;
                    case 5:
                        parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderAccountService");
                        final AbstractC68307f<Boolean> checkAndLogin = checkAndLogin(parcel.readString());
                        parcel2.writeNoException();
                        new RemoteFlow(new RemoteFlow.AbstractC10943a() {
                            /* class com.bytedance.ee.bear.contract.BinderAccountService.Stub.C49893 */

                            @Override // com.bytedance.ee.bear.service.remote.RemoteFlow.AbstractC10943a
                            /* renamed from: a */
                            public void mo19712a(final RemoteConsumer remoteConsumer) {
                                checkAndLogin.mo238001b(new Consumer<Boolean>() {
                                    /* class com.bytedance.ee.bear.contract.BinderAccountService.Stub.C49893.C49901 */

                                    /* renamed from: a */
                                    public void accept(Boolean bool) {
                                        remoteConsumer.mo41547a(bool);
                                    }
                                }, new Consumer<Throwable>() {
                                    /* class com.bytedance.ee.bear.contract.BinderAccountService.Stub.C49893.C49912 */

                                    /* renamed from: a */
                                    public void accept(Throwable th) {
                                        remoteConsumer.mo41548a(th);
                                    }
                                });
                            }
                        }).writeToParcel(parcel2, 1);
                        return true;
                    case 6:
                        parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderAccountService");
                        if (parcel.readInt() != 0) {
                            loginInfo = LoginInfo.CREATOR.createFromParcel(parcel);
                        }
                        final AbstractC68307f<Boolean> checkLoginInfo = checkLoginInfo(loginInfo);
                        parcel2.writeNoException();
                        new RemoteFlow(new RemoteFlow.AbstractC10943a() {
                            /* class com.bytedance.ee.bear.contract.BinderAccountService.Stub.C49924 */

                            @Override // com.bytedance.ee.bear.service.remote.RemoteFlow.AbstractC10943a
                            /* renamed from: a */
                            public void mo19712a(final RemoteConsumer remoteConsumer) {
                                checkLoginInfo.mo238001b(new Consumer<Boolean>() {
                                    /* class com.bytedance.ee.bear.contract.BinderAccountService.Stub.C49924.C49931 */

                                    /* renamed from: a */
                                    public void accept(Boolean bool) {
                                        remoteConsumer.mo41547a(bool);
                                    }
                                }, new Consumer<Throwable>() {
                                    /* class com.bytedance.ee.bear.contract.BinderAccountService.Stub.C49924.C49942 */

                                    /* renamed from: a */
                                    public void accept(Throwable th) {
                                        remoteConsumer.mo41548a(th);
                                    }
                                });
                            }
                        }).writeToParcel(parcel2, 1);
                        return true;
                    case 7:
                        parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderAccountService");
                        final AbstractC68307f<Boolean> logoutFlow = logoutFlow();
                        parcel2.writeNoException();
                        new RemoteFlow(new RemoteFlow.AbstractC10943a() {
                            /* class com.bytedance.ee.bear.contract.BinderAccountService.Stub.C49955 */

                            @Override // com.bytedance.ee.bear.service.remote.RemoteFlow.AbstractC10943a
                            /* renamed from: a */
                            public void mo19712a(final RemoteConsumer remoteConsumer) {
                                logoutFlow.mo238001b(new Consumer<Boolean>() {
                                    /* class com.bytedance.ee.bear.contract.BinderAccountService.Stub.C49955.C49961 */

                                    /* renamed from: a */
                                    public void accept(Boolean bool) {
                                        remoteConsumer.mo41547a(bool);
                                    }
                                }, new Consumer<Throwable>() {
                                    /* class com.bytedance.ee.bear.contract.BinderAccountService.Stub.C49955.C49972 */

                                    /* renamed from: a */
                                    public void accept(Throwable th) {
                                        remoteConsumer.mo41548a(th);
                                    }
                                });
                            }
                        }).writeToParcel(parcel2, 1);
                        return true;
                    case 8:
                        parcel.enforceInterface("com.bytedance.ee.bear.contract.BinderAccountService");
                        if (parcel.readInt() != 0) {
                            docDynamicConfig = DocDynamicConfig.CREATOR.createFromParcel(parcel);
                        }
                        final AbstractC68307f<Boolean> notifyConfigChange = notifyConfigChange(docDynamicConfig);
                        parcel2.writeNoException();
                        new RemoteFlow(new RemoteFlow.AbstractC10943a() {
                            /* class com.bytedance.ee.bear.contract.BinderAccountService.Stub.C49986 */

                            @Override // com.bytedance.ee.bear.service.remote.RemoteFlow.AbstractC10943a
                            /* renamed from: a */
                            public void mo19712a(final RemoteConsumer remoteConsumer) {
                                notifyConfigChange.mo238001b(new Consumer<Boolean>() {
                                    /* class com.bytedance.ee.bear.contract.BinderAccountService.Stub.C49986.C49991 */

                                    /* renamed from: a */
                                    public void accept(Boolean bool) {
                                        remoteConsumer.mo41547a(bool);
                                    }
                                }, new Consumer<Throwable>() {
                                    /* class com.bytedance.ee.bear.contract.BinderAccountService.Stub.C49986.C50002 */

                                    /* renamed from: a */
                                    public void accept(Throwable th) {
                                        remoteConsumer.mo41548a(th);
                                    }
                                });
                            }
                        }).writeToParcel(parcel2, 1);
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString("com.bytedance.ee.bear.contract.BinderAccountService");
                return true;
            }
        }
    }
}
