package com.bytedance.ee.bear.wiki;

import android.app.Application;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.bytedance.ee.bear.contract.route.parcelable.WikiDocument;
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
import java.util.ArrayList;

public interface BinderWikiListDataService extends IInterface, AbstractC10957d, AbstractC11940d {

    public static abstract class Stub extends Binder implements BinderWikiListDataService {
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

        private static class Proxy implements BinderWikiListDataService {
            public IBinder mRemote;

            @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
            public void destroy() {
            }

            public String getInterfaceDescriptor() {
                return "com.bytedance.ee.bear.wiki.BinderWikiListDataService";
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

            @Override // com.bytedance.ee.bear.wiki.AbstractC11940d
            public AbstractC68307f<Boolean> cleanWikiRecentListDataFlowable() {
                try {
                    AbstractC68307f<Boolean> b = AbstractC68307f.m265080a(new AbstractC68324h<Boolean>() {
                        /* class com.bytedance.ee.bear.wiki.BinderWikiListDataService.Stub.Proxy.C118931 */

                        @Override // io.reactivex.AbstractC68324h
                        public void subscribe(final AbstractC68323g<Boolean> gVar) throws Exception {
                            Parcel obtain = Parcel.obtain();
                            Parcel obtain2 = Parcel.obtain();
                            obtain.writeInterfaceToken("com.bytedance.ee.bear.wiki.BinderWikiListDataService");
                            Proxy.this.mRemote.transact(4, obtain, obtain2, 0);
                            obtain2.readException();
                            RemoteFlow.CREATOR.createFromParcel(obtain2).mo41555a(new RemoteConsumer(new RemoteConsumer.AbstractC10940a<Boolean>() {
                                /* class com.bytedance.ee.bear.wiki.BinderWikiListDataService.Stub.Proxy.C118931.C118941 */

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

            @Override // com.bytedance.ee.bear.wiki.AbstractC11940d
            public AbstractC68307f<ArrayList<WikiDocument>> getRecentWikiFlowable() {
                try {
                    AbstractC68307f<ArrayList<WikiDocument>> b = AbstractC68307f.m265080a(new AbstractC68324h<ArrayList<WikiDocument>>() {
                        /* class com.bytedance.ee.bear.wiki.BinderWikiListDataService.Stub.Proxy.C118952 */

                        @Override // io.reactivex.AbstractC68324h
                        public void subscribe(final AbstractC68323g<ArrayList<WikiDocument>> gVar) throws Exception {
                            Parcel obtain = Parcel.obtain();
                            Parcel obtain2 = Parcel.obtain();
                            obtain.writeInterfaceToken("com.bytedance.ee.bear.wiki.BinderWikiListDataService");
                            Proxy.this.mRemote.transact(5, obtain, obtain2, 0);
                            obtain2.readException();
                            RemoteFlow.CREATOR.createFromParcel(obtain2).mo41555a(new RemoteConsumer(new RemoteConsumer.AbstractC10940a<ArrayList<WikiDocument>>() {
                                /* class com.bytedance.ee.bear.wiki.BinderWikiListDataService.Stub.Proxy.C118952.C118961 */

                                @Override // com.bytedance.ee.bear.service.remote.RemoteConsumer.AbstractC10940a
                                /* renamed from: a */
                                public void mo19730a(Throwable th) {
                                    if (!gVar.isCancelled()) {
                                        gVar.onError(th);
                                        gVar.onComplete();
                                    }
                                }

                                /* renamed from: a */
                                public void mo19729a(ArrayList<WikiDocument> arrayList) {
                                    if (!gVar.isCancelled()) {
                                        gVar.onNext(arrayList);
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

            @Override // com.bytedance.ee.bear.wiki.AbstractC11940d
            public void notifyWikiAdded() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.wiki.BinderWikiListDataService");
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

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.bytedance.ee.bear.wiki.AbstractC11940d
            public void saveRecentWiki(ArrayList<WikiDocument> arrayList) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.wiki.BinderWikiListDataService");
                    obtain.writeList(arrayList);
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

            @Override // com.bytedance.ee.bear.wiki.AbstractC11940d
            public void notifyWikiNodeRemoved(String str, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.wiki.BinderWikiListDataService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
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
            attachInterface(this, "com.bytedance.ee.bear.wiki.BinderWikiListDataService");
        }

        public static BinderWikiListDataService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.bytedance.ee.bear.wiki.BinderWikiListDataService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof BinderWikiListDataService)) {
                return new Proxy(iBinder);
            }
            return (BinderWikiListDataService) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.bytedance.ee.bear.wiki.BinderWikiListDataService");
                saveRecentWiki(parcel.readArrayList(getClass().getClassLoader()));
                parcel2.writeNoException();
                return true;
            } else if (i == 2) {
                parcel.enforceInterface("com.bytedance.ee.bear.wiki.BinderWikiListDataService");
                notifyWikiAdded();
                parcel2.writeNoException();
                return true;
            } else if (i == 3) {
                parcel.enforceInterface("com.bytedance.ee.bear.wiki.BinderWikiListDataService");
                notifyWikiNodeRemoved(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            } else if (i == 4) {
                parcel.enforceInterface("com.bytedance.ee.bear.wiki.BinderWikiListDataService");
                final AbstractC68307f<Boolean> cleanWikiRecentListDataFlowable = cleanWikiRecentListDataFlowable();
                parcel2.writeNoException();
                new RemoteFlow(new RemoteFlow.AbstractC10943a() {
                    /* class com.bytedance.ee.bear.wiki.BinderWikiListDataService.Stub.C118871 */

                    @Override // com.bytedance.ee.bear.service.remote.RemoteFlow.AbstractC10943a
                    /* renamed from: a */
                    public void mo19712a(final RemoteConsumer remoteConsumer) {
                        cleanWikiRecentListDataFlowable.mo238001b(new Consumer<Boolean>() {
                            /* class com.bytedance.ee.bear.wiki.BinderWikiListDataService.Stub.C118871.C118881 */

                            /* renamed from: a */
                            public void accept(Boolean bool) {
                                remoteConsumer.mo41547a(bool);
                            }
                        }, new Consumer<Throwable>() {
                            /* class com.bytedance.ee.bear.wiki.BinderWikiListDataService.Stub.C118871.C118892 */

                            /* renamed from: a */
                            public void accept(Throwable th) {
                                remoteConsumer.mo41548a(th);
                            }
                        });
                    }
                }).writeToParcel(parcel2, 1);
                return true;
            } else if (i == 5) {
                parcel.enforceInterface("com.bytedance.ee.bear.wiki.BinderWikiListDataService");
                final AbstractC68307f<ArrayList<WikiDocument>> recentWikiFlowable = getRecentWikiFlowable();
                parcel2.writeNoException();
                new RemoteFlow(new RemoteFlow.AbstractC10943a() {
                    /* class com.bytedance.ee.bear.wiki.BinderWikiListDataService.Stub.C118902 */

                    @Override // com.bytedance.ee.bear.service.remote.RemoteFlow.AbstractC10943a
                    /* renamed from: a */
                    public void mo19712a(final RemoteConsumer remoteConsumer) {
                        recentWikiFlowable.mo238001b(new Consumer<ArrayList<WikiDocument>>() {
                            /* class com.bytedance.ee.bear.wiki.BinderWikiListDataService.Stub.C118902.C118911 */

                            /* renamed from: a */
                            public void accept(ArrayList<WikiDocument> arrayList) {
                                remoteConsumer.mo41547a(arrayList);
                            }
                        }, new Consumer<Throwable>() {
                            /* class com.bytedance.ee.bear.wiki.BinderWikiListDataService.Stub.C118902.C118922 */

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
                parcel2.writeString("com.bytedance.ee.bear.wiki.BinderWikiListDataService");
                return true;
            }
        }
    }
}
