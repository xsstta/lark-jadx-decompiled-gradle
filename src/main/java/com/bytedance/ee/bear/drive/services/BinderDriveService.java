package com.bytedance.ee.bear.drive.services;

import android.app.Application;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.bytedance.ee.bear.contract.drive.DriveOfflineDoc;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.PreloadEntity;
import com.bytedance.ee.bear.contract.drive.sdk.preview.PreviewAction;
import com.bytedance.ee.bear.drive.importfile.ImportFileEntity;
import com.bytedance.ee.bear.drive.services.BinderIDownloadCallback;
import com.bytedance.ee.bear.drive.services.BinderIDownloadDriveManualCacheCallback;
import com.bytedance.ee.bear.drive.services.BinderIDriveOpenMonitor;
import com.bytedance.ee.bear.drive.services.BinderIUploadCallback;
import com.bytedance.ee.bear.middleground.drive.export.BinderIUploadStateMonitor;
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

public interface BinderDriveService extends IInterface, AbstractC7184l, AbstractC10957d {

    public static abstract class Stub extends Binder implements BinderDriveService {
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

        private static class Proxy implements BinderDriveService {
            public IBinder mRemote;

            @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
            public void destroy() {
            }

            public String getInterfaceDescriptor() {
                return "com.bytedance.ee.bear.drive.services.BinderDriveService";
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

            @Override // com.bytedance.ee.bear.drive.services.AbstractC7184l
            public AbstractC68307f<Boolean> checkInitPluginFlowable() {
                try {
                    AbstractC68307f<Boolean> b = AbstractC68307f.m265080a(new AbstractC68324h<Boolean>() {
                        /* class com.bytedance.ee.bear.drive.services.BinderDriveService.Stub.Proxy.C71696 */

                        @Override // io.reactivex.AbstractC68324h
                        public void subscribe(final AbstractC68323g<Boolean> gVar) throws Exception {
                            Parcel obtain = Parcel.obtain();
                            Parcel obtain2 = Parcel.obtain();
                            obtain.writeInterfaceToken("com.bytedance.ee.bear.drive.services.BinderDriveService");
                            Proxy.this.mRemote.transact(13, obtain, obtain2, 0);
                            obtain2.readException();
                            RemoteFlow.CREATOR.createFromParcel(obtain2).mo41555a(new RemoteConsumer(new RemoteConsumer.AbstractC10940a<Boolean>() {
                                /* class com.bytedance.ee.bear.drive.services.BinderDriveService.Stub.Proxy.C71696.C71701 */

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

            @Override // com.bytedance.ee.bear.drive.services.AbstractC7184l
            public AbstractC68307f<Boolean> cleanDriveCleanableCache() {
                try {
                    AbstractC68307f<Boolean> b = AbstractC68307f.m265080a(new AbstractC68324h<Boolean>() {
                        /* class com.bytedance.ee.bear.drive.services.BinderDriveService.Stub.Proxy.C71633 */

                        @Override // io.reactivex.AbstractC68324h
                        public void subscribe(final AbstractC68323g<Boolean> gVar) throws Exception {
                            Parcel obtain = Parcel.obtain();
                            Parcel obtain2 = Parcel.obtain();
                            obtain.writeInterfaceToken("com.bytedance.ee.bear.drive.services.BinderDriveService");
                            Proxy.this.mRemote.transact(9, obtain, obtain2, 0);
                            obtain2.readException();
                            RemoteFlow.CREATOR.createFromParcel(obtain2).mo41555a(new RemoteConsumer(new RemoteConsumer.AbstractC10940a<Boolean>() {
                                /* class com.bytedance.ee.bear.drive.services.BinderDriveService.Stub.Proxy.C71633.C71641 */

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

            @Override // com.bytedance.ee.bear.drive.services.AbstractC7184l
            public AbstractC68307f<Long> getDriveCleanableCacheSize() {
                try {
                    AbstractC68307f<Long> b = AbstractC68307f.m265080a(new AbstractC68324h<Long>() {
                        /* class com.bytedance.ee.bear.drive.services.BinderDriveService.Stub.Proxy.C71675 */

                        @Override // io.reactivex.AbstractC68324h
                        public void subscribe(final AbstractC68323g<Long> gVar) throws Exception {
                            Parcel obtain = Parcel.obtain();
                            Parcel obtain2 = Parcel.obtain();
                            obtain.writeInterfaceToken("com.bytedance.ee.bear.drive.services.BinderDriveService");
                            Proxy.this.mRemote.transact(11, obtain, obtain2, 0);
                            obtain2.readException();
                            RemoteFlow.CREATOR.createFromParcel(obtain2).mo41555a(new RemoteConsumer(new RemoteConsumer.AbstractC10940a<Long>() {
                                /* class com.bytedance.ee.bear.drive.services.BinderDriveService.Stub.Proxy.C71675.C71681 */

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

            @Override // com.bytedance.ee.bear.drive.services.AbstractC7184l
            public void onConfigChanged() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.drive.services.BinderDriveService");
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

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.bytedance.ee.bear.drive.services.AbstractC7184l
            public AbstractC68307f<Integer> canImport(final String str) {
                try {
                    AbstractC68307f<Integer> b = AbstractC68307f.m265080a(new AbstractC68324h<Integer>() {
                        /* class com.bytedance.ee.bear.drive.services.BinderDriveService.Stub.Proxy.C71654 */

                        @Override // io.reactivex.AbstractC68324h
                        public void subscribe(final AbstractC68323g<Integer> gVar) throws Exception {
                            Parcel obtain = Parcel.obtain();
                            Parcel obtain2 = Parcel.obtain();
                            obtain.writeInterfaceToken("com.bytedance.ee.bear.drive.services.BinderDriveService");
                            obtain.writeString(str);
                            Proxy.this.mRemote.transact(10, obtain, obtain2, 0);
                            obtain2.readException();
                            RemoteFlow.CREATOR.createFromParcel(obtain2).mo41555a(new RemoteConsumer(new RemoteConsumer.AbstractC10940a<Integer>() {
                                /* class com.bytedance.ee.bear.drive.services.BinderDriveService.Stub.Proxy.C71654.C71661 */

                                /* renamed from: a */
                                public void mo19729a(Integer num) {
                                    if (!gVar.isCancelled()) {
                                        gVar.onNext(num);
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

            @Override // com.bytedance.ee.bear.drive.services.AbstractC7184l
            public void cancelManualOfflineFile(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.drive.services.BinderDriveService");
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

            @Override // com.bytedance.ee.bear.drive.services.AbstractC7184l
            public AbstractC68307f<Boolean> cleanDriveCacheFlowable(final long j) {
                try {
                    AbstractC68307f<Boolean> b = AbstractC68307f.m265080a(new AbstractC68324h<Boolean>() {
                        /* class com.bytedance.ee.bear.drive.services.BinderDriveService.Stub.Proxy.C71612 */

                        @Override // io.reactivex.AbstractC68324h
                        public void subscribe(final AbstractC68323g<Boolean> gVar) throws Exception {
                            Parcel obtain = Parcel.obtain();
                            Parcel obtain2 = Parcel.obtain();
                            obtain.writeInterfaceToken("com.bytedance.ee.bear.drive.services.BinderDriveService");
                            obtain.writeLong(j);
                            Proxy.this.mRemote.transact(8, obtain, obtain2, 0);
                            obtain2.readException();
                            RemoteFlow.CREATOR.createFromParcel(obtain2).mo41555a(new RemoteConsumer(new RemoteConsumer.AbstractC10940a<Boolean>() {
                                /* class com.bytedance.ee.bear.drive.services.BinderDriveService.Stub.Proxy.C71612.C71621 */

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

            @Override // com.bytedance.ee.bear.drive.services.AbstractC7184l
            public AbstractC68307f<Boolean> deleteDriveCacheByTokens(final ArrayList<String> arrayList) {
                try {
                    AbstractC68307f<Boolean> b = AbstractC68307f.m265080a(new AbstractC68324h<Boolean>() {
                        /* class com.bytedance.ee.bear.drive.services.BinderDriveService.Stub.Proxy.C71717 */

                        @Override // io.reactivex.AbstractC68324h
                        public void subscribe(final AbstractC68323g<Boolean> gVar) throws Exception {
                            Parcel obtain = Parcel.obtain();
                            Parcel obtain2 = Parcel.obtain();
                            obtain.writeInterfaceToken("com.bytedance.ee.bear.drive.services.BinderDriveService");
                            obtain.writeList(arrayList);
                            Proxy.this.mRemote.transact(16, obtain, obtain2, 0);
                            obtain2.readException();
                            RemoteFlow.CREATOR.createFromParcel(obtain2).mo41555a(new RemoteConsumer(new RemoteConsumer.AbstractC10940a<Boolean>() {
                                /* class com.bytedance.ee.bear.drive.services.BinderDriveService.Stub.Proxy.C71717.C71721 */

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

            @Override // com.bytedance.ee.bear.drive.services.AbstractC7184l
            public void driveCancelDownload(ArrayList<String> arrayList) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.drive.services.BinderDriveService");
                    obtain.writeList(arrayList);
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

            @Override // com.bytedance.ee.bear.drive.services.AbstractC7184l
            public void onLoginStatusChangedEvent(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.drive.services.BinderDriveService");
                    obtain.writeInt(i);
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

            @Override // com.bytedance.ee.bear.drive.services.AbstractC7184l
            public void openDriveTestActivity(Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.drive.services.BinderDriveService");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
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

            @Override // com.bytedance.ee.bear.drive.services.AbstractC7184l
            public void preloadDriveSdkFile(ArrayList<PreloadEntity> arrayList) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.drive.services.BinderDriveService");
                    obtain.writeList(arrayList);
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

            @Override // com.bytedance.ee.bear.drive.services.AbstractC7184l
            public void registerOpenMonitor(BinderIDriveOpenMonitor binderIDriveOpenMonitor) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.drive.services.BinderDriveService");
                    if (binderIDriveOpenMonitor != null) {
                        iBinder = binderIDriveOpenMonitor.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.mRemote.transact(24, obtain, obtain2, 0);
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

            @Override // com.bytedance.ee.bear.drive.services.AbstractC7184l
            public void requestImport(ImportFileEntity importFileEntity) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.drive.services.BinderDriveService");
                    if (importFileEntity != null) {
                        obtain.writeInt(1);
                        importFileEntity.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
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

            @Override // com.bytedance.ee.bear.drive.services.AbstractC7184l
            public void requestPreviewUsingPlatformCapability(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.drive.services.BinderDriveService");
                    obtain.writeString(str);
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

            @Override // com.bytedance.ee.bear.drive.services.AbstractC7184l
            public void setDocPageVisiable(boolean z) {
                int i;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.drive.services.BinderDriveService");
                    if (z) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    obtain.writeInt(i);
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

            @Override // com.bytedance.ee.bear.drive.services.AbstractC7184l
            public void unRegisterUploadStateMonitor(BinderIUploadStateMonitor binderIUploadStateMonitor) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.drive.services.BinderDriveService");
                    if (binderIUploadStateMonitor != null) {
                        iBinder = binderIUploadStateMonitor.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
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

            @Override // com.bytedance.ee.bear.drive.services.AbstractC7184l
            public void execDriveSdkPreviewAction(String str, ArrayList<PreviewAction> arrayList) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.drive.services.BinderDriveService");
                    obtain.writeString(str);
                    obtain.writeList(arrayList);
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

            @Override // com.bytedance.ee.bear.drive.services.AbstractC7184l
            public AbstractC68307f<Boolean> preloadFile(final int i, final ArrayList<DriveOfflineDoc> arrayList) {
                try {
                    AbstractC68307f<Boolean> b = AbstractC68307f.m265080a(new AbstractC68324h<Boolean>() {
                        /* class com.bytedance.ee.bear.drive.services.BinderDriveService.Stub.Proxy.C71591 */

                        @Override // io.reactivex.AbstractC68324h
                        public void subscribe(final AbstractC68323g<Boolean> gVar) throws Exception {
                            Parcel obtain = Parcel.obtain();
                            Parcel obtain2 = Parcel.obtain();
                            obtain.writeInterfaceToken("com.bytedance.ee.bear.drive.services.BinderDriveService");
                            obtain.writeInt(i);
                            obtain.writeList(arrayList);
                            Proxy.this.mRemote.transact(7, obtain, obtain2, 0);
                            obtain2.readException();
                            RemoteFlow.CREATOR.createFromParcel(obtain2).mo41555a(new RemoteConsumer(new RemoteConsumer.AbstractC10940a<Boolean>() {
                                /* class com.bytedance.ee.bear.drive.services.BinderDriveService.Stub.Proxy.C71591.C71601 */

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

            @Override // com.bytedance.ee.bear.drive.services.AbstractC7184l
            public void registerUploadStateMonitor(String str, String str2, BinderIUploadStateMonitor binderIUploadStateMonitor) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.drive.services.BinderDriveService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (binderIUploadStateMonitor != null) {
                        iBinder = binderIUploadStateMonitor.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
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

            @Override // com.bytedance.ee.bear.drive.services.AbstractC7184l
            public void showUploadStateView(String str, String str2, String str3) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.drive.services.BinderDriveService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
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

            @Override // com.bytedance.ee.bear.drive.services.AbstractC7184l
            public void downloadManualOfflineFile(boolean z, String str, BinderIDownloadDriveManualCacheCallback binderIDownloadDriveManualCacheCallback, Bundle bundle) {
                int i;
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.drive.services.BinderDriveService");
                    if (z) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    if (binderIDownloadDriveManualCacheCallback != null) {
                        iBinder = binderIDownloadDriveManualCacheCallback.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
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

            @Override // com.bytedance.ee.bear.drive.services.AbstractC7184l
            public void uploadFile(String str, String str2, Bundle bundle, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.drive.services.BinderDriveService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i);
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

            @Override // com.bytedance.ee.bear.drive.services.AbstractC7184l
            public void uploadMedia(String str, String str2, Bundle bundle, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.drive.services.BinderDriveService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i);
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

            @Override // com.bytedance.ee.bear.drive.services.AbstractC7184l
            public String driveUpload(String str, String str2, String str3, String str4, int i, BinderIUploadCallback binderIUploadCallback) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.drive.services.BinderDriveService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    obtain.writeString(str4);
                    obtain.writeInt(i);
                    if (binderIUploadCallback != null) {
                        iBinder = binderIUploadCallback.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.mRemote.transact(25, obtain, obtain2, 0);
                    obtain2.readException();
                    String readString = obtain2.readString();
                    obtain2.recycle();
                    obtain.recycle();
                    return readString;
                } catch (RemoteException e) {
                    throw new InvokeRemoteException(e);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.bytedance.ee.bear.drive.services.AbstractC7184l
            public String driveDownloadNormal(String str, String str2, int i, String str3, boolean z, long j, String str4, BinderIDownloadCallback binderIDownloadCallback) {
                int i2;
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.drive.services.BinderDriveService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeInt(i);
                    obtain.writeString(str3);
                    if (z) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    obtain.writeInt(i2);
                    obtain.writeLong(j);
                    obtain.writeString(str4);
                    if (binderIDownloadCallback != null) {
                        iBinder = binderIDownloadCallback.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.mRemote.transact(22, obtain, obtain2, 0);
                    obtain2.readException();
                    String readString = obtain2.readString();
                    obtain2.recycle();
                    obtain.recycle();
                    return readString;
                } catch (RemoteException e) {
                    throw new InvokeRemoteException(e);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.bytedance.ee.bear.drive.services.AbstractC7184l
            public String driveDownload(String str, String str2, String str3, String str4, int i, String str5, int i2, String str6, int i3, int i4, int i5, String str7, boolean z, boolean z2, String str8, BinderIDownloadCallback binderIDownloadCallback) {
                Throwable th;
                RemoteException e;
                int i6;
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.drive.services.BinderDriveService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    obtain.writeString(str4);
                    obtain.writeInt(i);
                    obtain.writeString(str5);
                    obtain.writeInt(i2);
                    obtain.writeString(str6);
                    obtain.writeInt(i3);
                    obtain.writeInt(i4);
                    obtain.writeInt(i5);
                    obtain.writeString(str7);
                    int i7 = 1;
                    if (z) {
                        i6 = 1;
                    } else {
                        i6 = 0;
                    }
                    obtain.writeInt(i6);
                    if (!z2) {
                        i7 = 0;
                    }
                    obtain.writeInt(i7);
                    obtain.writeString(str8);
                    if (binderIDownloadCallback != null) {
                        iBinder = binderIDownloadCallback.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    try {
                        this.mRemote.transact(21, obtain, obtain2, 0);
                        obtain2.readException();
                        String readString = obtain2.readString();
                        obtain2.recycle();
                        obtain.recycle();
                        return readString;
                    } catch (RemoteException e2) {
                        e = e2;
                        try {
                            throw new InvokeRemoteException(e);
                        } catch (Throwable th2) {
                            th = th2;
                            obtain2.recycle();
                            obtain.recycle();
                            throw th;
                        }
                    }
                } catch (RemoteException e3) {
                    e = e3;
                    throw new InvokeRemoteException(e);
                } catch (Throwable th3) {
                    th = th3;
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }
        }

        public Stub() {
            attachInterface(this, "com.bytedance.ee.bear.drive.services.BinderDriveService");
        }

        public static BinderDriveService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.bytedance.ee.bear.drive.services.BinderDriveService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof BinderDriveService)) {
                return new Proxy(iBinder);
            }
            return (BinderDriveService) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            if (i != 1598968902) {
                boolean z5 = false;
                Bundle bundle = null;
                Bundle bundle2 = null;
                Bundle bundle3 = null;
                ImportFileEntity importFileEntity = null;
                Bundle bundle4 = null;
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.bytedance.ee.bear.drive.services.BinderDriveService");
                        String readString = parcel.readString();
                        String readString2 = parcel.readString();
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        uploadFile(readString, readString2, bundle, parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        parcel.enforceInterface("com.bytedance.ee.bear.drive.services.BinderDriveService");
                        String readString3 = parcel.readString();
                        String readString4 = parcel.readString();
                        if (parcel.readInt() != 0) {
                            bundle4 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        uploadMedia(readString3, readString4, bundle4, parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        parcel.enforceInterface("com.bytedance.ee.bear.drive.services.BinderDriveService");
                        requestPreviewUsingPlatformCapability(parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        parcel.enforceInterface("com.bytedance.ee.bear.drive.services.BinderDriveService");
                        showUploadStateView(parcel.readString(), parcel.readString(), parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    case 5:
                        parcel.enforceInterface("com.bytedance.ee.bear.drive.services.BinderDriveService");
                        registerUploadStateMonitor(parcel.readString(), parcel.readString(), BinderIUploadStateMonitor.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 6:
                        parcel.enforceInterface("com.bytedance.ee.bear.drive.services.BinderDriveService");
                        unRegisterUploadStateMonitor(BinderIUploadStateMonitor.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 7:
                        parcel.enforceInterface("com.bytedance.ee.bear.drive.services.BinderDriveService");
                        final AbstractC68307f<Boolean> preloadFile = preloadFile(parcel.readInt(), parcel.readArrayList(getClass().getClassLoader()));
                        parcel2.writeNoException();
                        new RemoteFlow(new RemoteFlow.AbstractC10943a() {
                            /* class com.bytedance.ee.bear.drive.services.BinderDriveService.Stub.C71381 */

                            @Override // com.bytedance.ee.bear.service.remote.RemoteFlow.AbstractC10943a
                            /* renamed from: a */
                            public void mo19712a(final RemoteConsumer remoteConsumer) {
                                preloadFile.mo238001b(new Consumer<Boolean>() {
                                    /* class com.bytedance.ee.bear.drive.services.BinderDriveService.Stub.C71381.C71391 */

                                    /* renamed from: a */
                                    public void accept(Boolean bool) {
                                        remoteConsumer.mo41547a(bool);
                                    }
                                }, new Consumer<Throwable>() {
                                    /* class com.bytedance.ee.bear.drive.services.BinderDriveService.Stub.C71381.C71402 */

                                    /* renamed from: a */
                                    public void accept(Throwable th) {
                                        remoteConsumer.mo41548a(th);
                                    }
                                });
                            }
                        }).writeToParcel(parcel2, 1);
                        return true;
                    case 8:
                        parcel.enforceInterface("com.bytedance.ee.bear.drive.services.BinderDriveService");
                        final AbstractC68307f<Boolean> cleanDriveCacheFlowable = cleanDriveCacheFlowable(parcel.readLong());
                        parcel2.writeNoException();
                        new RemoteFlow(new RemoteFlow.AbstractC10943a() {
                            /* class com.bytedance.ee.bear.drive.services.BinderDriveService.Stub.C71412 */

                            @Override // com.bytedance.ee.bear.service.remote.RemoteFlow.AbstractC10943a
                            /* renamed from: a */
                            public void mo19712a(final RemoteConsumer remoteConsumer) {
                                cleanDriveCacheFlowable.mo238001b(new Consumer<Boolean>() {
                                    /* class com.bytedance.ee.bear.drive.services.BinderDriveService.Stub.C71412.C71421 */

                                    /* renamed from: a */
                                    public void accept(Boolean bool) {
                                        remoteConsumer.mo41547a(bool);
                                    }
                                }, new Consumer<Throwable>() {
                                    /* class com.bytedance.ee.bear.drive.services.BinderDriveService.Stub.C71412.C71432 */

                                    /* renamed from: a */
                                    public void accept(Throwable th) {
                                        remoteConsumer.mo41548a(th);
                                    }
                                });
                            }
                        }).writeToParcel(parcel2, 1);
                        return true;
                    case 9:
                        parcel.enforceInterface("com.bytedance.ee.bear.drive.services.BinderDriveService");
                        final AbstractC68307f<Boolean> cleanDriveCleanableCache = cleanDriveCleanableCache();
                        parcel2.writeNoException();
                        new RemoteFlow(new RemoteFlow.AbstractC10943a() {
                            /* class com.bytedance.ee.bear.drive.services.BinderDriveService.Stub.C71443 */

                            @Override // com.bytedance.ee.bear.service.remote.RemoteFlow.AbstractC10943a
                            /* renamed from: a */
                            public void mo19712a(final RemoteConsumer remoteConsumer) {
                                cleanDriveCleanableCache.mo238001b(new Consumer<Boolean>() {
                                    /* class com.bytedance.ee.bear.drive.services.BinderDriveService.Stub.C71443.C71451 */

                                    /* renamed from: a */
                                    public void accept(Boolean bool) {
                                        remoteConsumer.mo41547a(bool);
                                    }
                                }, new Consumer<Throwable>() {
                                    /* class com.bytedance.ee.bear.drive.services.BinderDriveService.Stub.C71443.C71462 */

                                    /* renamed from: a */
                                    public void accept(Throwable th) {
                                        remoteConsumer.mo41548a(th);
                                    }
                                });
                            }
                        }).writeToParcel(parcel2, 1);
                        return true;
                    case 10:
                        parcel.enforceInterface("com.bytedance.ee.bear.drive.services.BinderDriveService");
                        final AbstractC68307f<Integer> canImport = canImport(parcel.readString());
                        parcel2.writeNoException();
                        new RemoteFlow(new RemoteFlow.AbstractC10943a() {
                            /* class com.bytedance.ee.bear.drive.services.BinderDriveService.Stub.C71474 */

                            @Override // com.bytedance.ee.bear.service.remote.RemoteFlow.AbstractC10943a
                            /* renamed from: a */
                            public void mo19712a(final RemoteConsumer remoteConsumer) {
                                canImport.mo238001b(new Consumer<Integer>() {
                                    /* class com.bytedance.ee.bear.drive.services.BinderDriveService.Stub.C71474.C71481 */

                                    /* renamed from: a */
                                    public void accept(Integer num) {
                                        remoteConsumer.mo41547a(num);
                                    }
                                }, new Consumer<Throwable>() {
                                    /* class com.bytedance.ee.bear.drive.services.BinderDriveService.Stub.C71474.C71492 */

                                    /* renamed from: a */
                                    public void accept(Throwable th) {
                                        remoteConsumer.mo41548a(th);
                                    }
                                });
                            }
                        }).writeToParcel(parcel2, 1);
                        return true;
                    case 11:
                        parcel.enforceInterface("com.bytedance.ee.bear.drive.services.BinderDriveService");
                        final AbstractC68307f<Long> driveCleanableCacheSize = getDriveCleanableCacheSize();
                        parcel2.writeNoException();
                        new RemoteFlow(new RemoteFlow.AbstractC10943a() {
                            /* class com.bytedance.ee.bear.drive.services.BinderDriveService.Stub.C71505 */

                            @Override // com.bytedance.ee.bear.service.remote.RemoteFlow.AbstractC10943a
                            /* renamed from: a */
                            public void mo19712a(final RemoteConsumer remoteConsumer) {
                                driveCleanableCacheSize.mo238001b(new Consumer<Long>() {
                                    /* class com.bytedance.ee.bear.drive.services.BinderDriveService.Stub.C71505.C71511 */

                                    /* renamed from: a */
                                    public void accept(Long l) {
                                        remoteConsumer.mo41547a(l);
                                    }
                                }, new Consumer<Throwable>() {
                                    /* class com.bytedance.ee.bear.drive.services.BinderDriveService.Stub.C71505.C71522 */

                                    /* renamed from: a */
                                    public void accept(Throwable th) {
                                        remoteConsumer.mo41548a(th);
                                    }
                                });
                            }
                        }).writeToParcel(parcel2, 1);
                        return true;
                    case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                        parcel.enforceInterface("com.bytedance.ee.bear.drive.services.BinderDriveService");
                        if (parcel.readInt() != 0) {
                            importFileEntity = ImportFileEntity.CREATOR.createFromParcel(parcel);
                        }
                        requestImport(importFileEntity);
                        parcel2.writeNoException();
                        return true;
                    case 13:
                        parcel.enforceInterface("com.bytedance.ee.bear.drive.services.BinderDriveService");
                        final AbstractC68307f<Boolean> checkInitPluginFlowable = checkInitPluginFlowable();
                        parcel2.writeNoException();
                        new RemoteFlow(new RemoteFlow.AbstractC10943a() {
                            /* class com.bytedance.ee.bear.drive.services.BinderDriveService.Stub.C71536 */

                            @Override // com.bytedance.ee.bear.service.remote.RemoteFlow.AbstractC10943a
                            /* renamed from: a */
                            public void mo19712a(final RemoteConsumer remoteConsumer) {
                                checkInitPluginFlowable.mo238001b(new Consumer<Boolean>() {
                                    /* class com.bytedance.ee.bear.drive.services.BinderDriveService.Stub.C71536.C71541 */

                                    /* renamed from: a */
                                    public void accept(Boolean bool) {
                                        remoteConsumer.mo41547a(bool);
                                    }
                                }, new Consumer<Throwable>() {
                                    /* class com.bytedance.ee.bear.drive.services.BinderDriveService.Stub.C71536.C71552 */

                                    /* renamed from: a */
                                    public void accept(Throwable th) {
                                        remoteConsumer.mo41548a(th);
                                    }
                                });
                            }
                        }).writeToParcel(parcel2, 1);
                        return true;
                    case 14:
                        parcel.enforceInterface("com.bytedance.ee.bear.drive.services.BinderDriveService");
                        if (parcel.readInt() == 0) {
                            z = false;
                        } else {
                            z = true;
                        }
                        String readString5 = parcel.readString();
                        BinderIDownloadDriveManualCacheCallback asInterface = BinderIDownloadDriveManualCacheCallback.Stub.asInterface(parcel.readStrongBinder());
                        if (parcel.readInt() != 0) {
                            bundle3 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        downloadManualOfflineFile(z, readString5, asInterface, bundle3);
                        parcel2.writeNoException();
                        return true;
                    case 15:
                        parcel.enforceInterface("com.bytedance.ee.bear.drive.services.BinderDriveService");
                        cancelManualOfflineFile(parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    case 16:
                        parcel.enforceInterface("com.bytedance.ee.bear.drive.services.BinderDriveService");
                        final AbstractC68307f<Boolean> deleteDriveCacheByTokens = deleteDriveCacheByTokens(parcel.readArrayList(getClass().getClassLoader()));
                        parcel2.writeNoException();
                        new RemoteFlow(new RemoteFlow.AbstractC10943a() {
                            /* class com.bytedance.ee.bear.drive.services.BinderDriveService.Stub.C71567 */

                            @Override // com.bytedance.ee.bear.service.remote.RemoteFlow.AbstractC10943a
                            /* renamed from: a */
                            public void mo19712a(final RemoteConsumer remoteConsumer) {
                                deleteDriveCacheByTokens.mo238001b(new Consumer<Boolean>() {
                                    /* class com.bytedance.ee.bear.drive.services.BinderDriveService.Stub.C71567.C71571 */

                                    /* renamed from: a */
                                    public void accept(Boolean bool) {
                                        remoteConsumer.mo41547a(bool);
                                    }
                                }, new Consumer<Throwable>() {
                                    /* class com.bytedance.ee.bear.drive.services.BinderDriveService.Stub.C71567.C71582 */

                                    /* renamed from: a */
                                    public void accept(Throwable th) {
                                        remoteConsumer.mo41548a(th);
                                    }
                                });
                            }
                        }).writeToParcel(parcel2, 1);
                        return true;
                    case 17:
                        parcel.enforceInterface("com.bytedance.ee.bear.drive.services.BinderDriveService");
                        onLoginStatusChangedEvent(parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 18:
                        parcel.enforceInterface("com.bytedance.ee.bear.drive.services.BinderDriveService");
                        onConfigChanged();
                        parcel2.writeNoException();
                        return true;
                    case 19:
                        parcel.enforceInterface("com.bytedance.ee.bear.drive.services.BinderDriveService");
                        execDriveSdkPreviewAction(parcel.readString(), parcel.readArrayList(getClass().getClassLoader()));
                        parcel2.writeNoException();
                        return true;
                    case 20:
                        parcel.enforceInterface("com.bytedance.ee.bear.drive.services.BinderDriveService");
                        preloadDriveSdkFile(parcel.readArrayList(getClass().getClassLoader()));
                        parcel2.writeNoException();
                        return true;
                    case 21:
                        parcel.enforceInterface("com.bytedance.ee.bear.drive.services.BinderDriveService");
                        String readString6 = parcel.readString();
                        String readString7 = parcel.readString();
                        String readString8 = parcel.readString();
                        String readString9 = parcel.readString();
                        int readInt = parcel.readInt();
                        String readString10 = parcel.readString();
                        int readInt2 = parcel.readInt();
                        String readString11 = parcel.readString();
                        int readInt3 = parcel.readInt();
                        int readInt4 = parcel.readInt();
                        int readInt5 = parcel.readInt();
                        String readString12 = parcel.readString();
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
                        String driveDownload = driveDownload(readString6, readString7, readString8, readString9, readInt, readString10, readInt2, readString11, readInt3, readInt4, readInt5, readString12, z2, z3, parcel.readString(), BinderIDownloadCallback.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        parcel2.writeString(driveDownload);
                        return true;
                    case 22:
                        parcel.enforceInterface("com.bytedance.ee.bear.drive.services.BinderDriveService");
                        String readString13 = parcel.readString();
                        String readString14 = parcel.readString();
                        int readInt6 = parcel.readInt();
                        String readString15 = parcel.readString();
                        if (parcel.readInt() == 0) {
                            z4 = false;
                        } else {
                            z4 = true;
                        }
                        String driveDownloadNormal = driveDownloadNormal(readString13, readString14, readInt6, readString15, z4, parcel.readLong(), parcel.readString(), BinderIDownloadCallback.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        parcel2.writeString(driveDownloadNormal);
                        return true;
                    case 23:
                        parcel.enforceInterface("com.bytedance.ee.bear.drive.services.BinderDriveService");
                        driveCancelDownload(parcel.readArrayList(getClass().getClassLoader()));
                        parcel2.writeNoException();
                        return true;
                    case 24:
                        parcel.enforceInterface("com.bytedance.ee.bear.drive.services.BinderDriveService");
                        registerOpenMonitor(BinderIDriveOpenMonitor.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /*{ENCODED_INT: 25}*/:
                        parcel.enforceInterface("com.bytedance.ee.bear.drive.services.BinderDriveService");
                        String driveUpload = driveUpload(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), BinderIUploadCallback.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        parcel2.writeString(driveUpload);
                        return true;
                    case 26:
                        parcel.enforceInterface("com.bytedance.ee.bear.drive.services.BinderDriveService");
                        if (parcel.readInt() != 0) {
                            bundle2 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        openDriveTestActivity(bundle2);
                        parcel2.writeNoException();
                        return true;
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /*{ENCODED_INT: 27}*/:
                        parcel.enforceInterface("com.bytedance.ee.bear.drive.services.BinderDriveService");
                        if (parcel.readInt() != 0) {
                            z5 = true;
                        }
                        setDocPageVisiable(z5);
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString("com.bytedance.ee.bear.drive.services.BinderDriveService");
                return true;
            }
        }
    }
}
