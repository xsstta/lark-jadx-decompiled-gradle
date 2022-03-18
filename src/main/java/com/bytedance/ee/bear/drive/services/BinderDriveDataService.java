package com.bytedance.ee.bear.drive.services;

import android.app.Application;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.bytedance.ee.bear.contract.drive.DriveCache;
import com.bytedance.ee.bear.service.exception.InvokeRemoteException;
import com.bytedance.ee.bear.service.remote.AbstractC10957d;
import com.huawei.hms.android.HwBuildEx;
import java.util.ArrayList;
import java.util.List;

public interface BinderDriveDataService extends IInterface, AbstractC7181i, AbstractC10957d {

    public static abstract class Stub extends Binder implements BinderDriveDataService {
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

        private static class Proxy implements BinderDriveDataService {
            private IBinder mRemote;

            @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
            public void destroy() {
            }

            public String getInterfaceDescriptor() {
                return "com.bytedance.ee.bear.drive.services.BinderDriveDataService";
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

            @Override // com.bytedance.ee.bear.drive.services.AbstractC7181i
            public List<DriveCache> getAll() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.drive.services.BinderDriveDataService");
                    this.mRemote.transact(3, obtain, obtain2, 0);
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

            @Override // com.bytedance.ee.bear.drive.services.AbstractC7181i
            public long getCleanableCacheSize() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.drive.services.BinderDriveDataService");
                    this.mRemote.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                    long readLong = obtain2.readLong();
                    obtain2.recycle();
                    obtain.recycle();
                    return readLong;
                } catch (RemoteException e) {
                    throw new InvokeRemoteException(e);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.bytedance.ee.bear.drive.services.AbstractC7181i
            public int removeCleanableCache() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.drive.services.BinderDriveDataService");
                    this.mRemote.transact(14, obtain, obtain2, 0);
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

            @Override // com.bytedance.ee.bear.drive.services.AbstractC7181i
            public boolean removeAll() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.drive.services.BinderDriveDataService");
                    boolean z = false;
                    this.mRemote.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
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

            @Override // com.bytedance.ee.bear.drive.services.AbstractC7181i
            public long getCacheSizeByType(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.drive.services.BinderDriveDataService");
                    obtain.writeInt(i);
                    this.mRemote.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                    long readLong = obtain2.readLong();
                    obtain2.recycle();
                    obtain.recycle();
                    return readLong;
                } catch (RemoteException e) {
                    throw new InvokeRemoteException(e);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.bytedance.ee.bear.drive.services.AbstractC7181i
            public boolean remove(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.drive.services.BinderDriveDataService");
                    obtain.writeString(str);
                    boolean z = false;
                    this.mRemote.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } catch (RemoteException e) {
                    throw new InvokeRemoteException(e);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.bytedance.ee.bear.drive.services.AbstractC7181i
            public int removeAll(Long l) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.drive.services.BinderDriveDataService");
                    obtain.writeLong(l.longValue());
                    this.mRemote.transact(17, obtain, obtain2, 0);
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

            @Override // com.bytedance.ee.bear.drive.services.AbstractC7181i
            public boolean removeList(List<String> list) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.drive.services.BinderDriveDataService");
                    obtain.writeList(list);
                    boolean z = false;
                    this.mRemote.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } catch (RemoteException e) {
                    throw new InvokeRemoteException(e);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.bytedance.ee.bear.drive.services.AbstractC7181i
            public int trimLruCacheToSize(long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.drive.services.BinderDriveDataService");
                    obtain.writeLong(j);
                    this.mRemote.transact(16, obtain, obtain2, 0);
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

            @Override // com.bytedance.ee.bear.drive.services.AbstractC7181i
            public boolean removeAll(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.drive.services.BinderDriveDataService");
                    obtain.writeInt(i);
                    boolean z = false;
                    this.mRemote.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } catch (RemoteException e) {
                    throw new InvokeRemoteException(e);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.bytedance.ee.bear.drive.services.AbstractC7181i
            public List<DriveCache> getCacheByTypeAndCacheHost(int i, int i2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.drive.services.BinderDriveDataService");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.mRemote.transact(7, obtain, obtain2, 0);
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

            @Override // com.bytedance.ee.bear.drive.services.AbstractC7181i
            public int removeUpTimeMills(long j, long j2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.drive.services.BinderDriveDataService");
                    obtain.writeLong(j);
                    obtain.writeLong(j2);
                    this.mRemote.transact(15, obtain, obtain2, 0);
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

            @Override // com.bytedance.ee.bear.drive.services.AbstractC7181i
            public boolean updateCacheName(String str, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.drive.services.BinderDriveDataService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    boolean z = false;
                    this.mRemote.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } catch (RemoteException e) {
                    throw new InvokeRemoteException(e);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.bytedance.ee.bear.drive.services.AbstractC7181i
            public DriveCache get(String str, boolean z) {
                int i;
                DriveCache driveCache;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.drive.services.BinderDriveDataService");
                    obtain.writeString(str);
                    if (z) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    obtain.writeInt(i);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        driveCache = DriveCache.CREATOR.createFromParcel(obtain2);
                    } else {
                        driveCache = null;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return driveCache;
                } catch (RemoteException e) {
                    throw new InvokeRemoteException(e);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.bytedance.ee.bear.drive.services.AbstractC7181i
            public boolean convertCacheType(String str, int i, int i2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.drive.services.BinderDriveDataService");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    boolean z = false;
                    this.mRemote.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } catch (RemoteException e) {
                    throw new InvokeRemoteException(e);
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.bytedance.ee.bear.drive.services.AbstractC7181i
            public List<DriveCache> getCacheByTypeBeforeModTime(int i, int i2, long j, String str, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.drive.services.BinderDriveDataService");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeLong(j);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.mRemote.transact(8, obtain, obtain2, 0);
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

            @Override // com.bytedance.ee.bear.drive.services.AbstractC7181i
            public boolean put(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, boolean z, boolean z2) {
                Throwable th;
                RemoteException e;
                int i3;
                int i4;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.drive.services.BinderDriveDataService");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    obtain.writeString(str4);
                    obtain.writeString(str5);
                    obtain.writeString(str6);
                    obtain.writeString(str7);
                    obtain.writeString(str8);
                    obtain.writeString(str9);
                    obtain.writeString(str10);
                    obtain.writeString(str11);
                    obtain.writeString(str12);
                    obtain.writeString(str13);
                    obtain.writeString(str14);
                    boolean z3 = true;
                    if (z) {
                        i3 = 1;
                    } else {
                        i3 = 0;
                    }
                    obtain.writeInt(i3);
                    if (z2) {
                        i4 = 1;
                    } else {
                        i4 = 0;
                    }
                    obtain.writeInt(i4);
                    try {
                        this.mRemote.transact(1, obtain, obtain2, 0);
                        obtain2.readException();
                        if (obtain2.readInt() == 0) {
                            z3 = false;
                        }
                        obtain2.recycle();
                        obtain.recycle();
                        return z3;
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
            attachInterface(this, "com.bytedance.ee.bear.drive.services.BinderDriveDataService");
        }

        public static BinderDriveDataService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.bytedance.ee.bear.drive.services.BinderDriveDataService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof BinderDriveDataService)) {
                return new Proxy(iBinder);
            }
            return (BinderDriveDataService) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            boolean z;
            boolean z2;
            boolean z3;
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.bytedance.ee.bear.drive.services.BinderDriveDataService");
                        int readInt = parcel.readInt();
                        int readInt2 = parcel.readInt();
                        String readString = parcel.readString();
                        String readString2 = parcel.readString();
                        String readString3 = parcel.readString();
                        String readString4 = parcel.readString();
                        String readString5 = parcel.readString();
                        String readString6 = parcel.readString();
                        String readString7 = parcel.readString();
                        String readString8 = parcel.readString();
                        String readString9 = parcel.readString();
                        String readString10 = parcel.readString();
                        String readString11 = parcel.readString();
                        String readString12 = parcel.readString();
                        String readString13 = parcel.readString();
                        String readString14 = parcel.readString();
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
                        boolean put = put(readInt, readInt2, readString, readString2, readString3, readString4, readString5, readString6, readString7, readString8, readString9, readString10, readString11, readString12, readString13, readString14, z, z2);
                        parcel2.writeNoException();
                        parcel2.writeInt(put ? 1 : 0);
                        return true;
                    case 2:
                        parcel.enforceInterface("com.bytedance.ee.bear.drive.services.BinderDriveDataService");
                        String readString15 = parcel.readString();
                        if (parcel.readInt() == 0) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        DriveCache driveCache = get(readString15, z3);
                        parcel2.writeNoException();
                        if (driveCache != null) {
                            parcel2.writeInt(1);
                            driveCache.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 3:
                        parcel.enforceInterface("com.bytedance.ee.bear.drive.services.BinderDriveDataService");
                        List<DriveCache> all = getAll();
                        parcel2.writeNoException();
                        parcel2.writeList(all);
                        return true;
                    case 4:
                        parcel.enforceInterface("com.bytedance.ee.bear.drive.services.BinderDriveDataService");
                        boolean remove = remove(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeInt(remove ? 1 : 0);
                        return true;
                    case 5:
                        parcel.enforceInterface("com.bytedance.ee.bear.drive.services.BinderDriveDataService");
                        boolean removeList = removeList(parcel.readArrayList(getClass().getClassLoader()));
                        parcel2.writeNoException();
                        parcel2.writeInt(removeList ? 1 : 0);
                        return true;
                    case 6:
                        parcel.enforceInterface("com.bytedance.ee.bear.drive.services.BinderDriveDataService");
                        boolean convertCacheType = convertCacheType(parcel.readString(), parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(convertCacheType ? 1 : 0);
                        return true;
                    case 7:
                        parcel.enforceInterface("com.bytedance.ee.bear.drive.services.BinderDriveDataService");
                        List<DriveCache> cacheByTypeAndCacheHost = getCacheByTypeAndCacheHost(parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeList(cacheByTypeAndCacheHost);
                        return true;
                    case 8:
                        parcel.enforceInterface("com.bytedance.ee.bear.drive.services.BinderDriveDataService");
                        List<DriveCache> cacheByTypeBeforeModTime = getCacheByTypeBeforeModTime(parcel.readInt(), parcel.readInt(), parcel.readLong(), parcel.readString(), parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeList(cacheByTypeBeforeModTime);
                        return true;
                    case 9:
                        parcel.enforceInterface("com.bytedance.ee.bear.drive.services.BinderDriveDataService");
                        boolean updateCacheName = updateCacheName(parcel.readString(), parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeInt(updateCacheName ? 1 : 0);
                        return true;
                    case 10:
                        parcel.enforceInterface("com.bytedance.ee.bear.drive.services.BinderDriveDataService");
                        boolean removeAll = removeAll();
                        parcel2.writeNoException();
                        parcel2.writeInt(removeAll ? 1 : 0);
                        return true;
                    case 11:
                        parcel.enforceInterface("com.bytedance.ee.bear.drive.services.BinderDriveDataService");
                        boolean removeAll2 = removeAll(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(removeAll2 ? 1 : 0);
                        return true;
                    case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                        parcel.enforceInterface("com.bytedance.ee.bear.drive.services.BinderDriveDataService");
                        long cacheSizeByType = getCacheSizeByType(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeLong(cacheSizeByType);
                        return true;
                    case 13:
                        parcel.enforceInterface("com.bytedance.ee.bear.drive.services.BinderDriveDataService");
                        long cleanableCacheSize = getCleanableCacheSize();
                        parcel2.writeNoException();
                        parcel2.writeLong(cleanableCacheSize);
                        return true;
                    case 14:
                        parcel.enforceInterface("com.bytedance.ee.bear.drive.services.BinderDriveDataService");
                        int removeCleanableCache = removeCleanableCache();
                        parcel2.writeNoException();
                        parcel2.writeInt(removeCleanableCache);
                        return true;
                    case 15:
                        parcel.enforceInterface("com.bytedance.ee.bear.drive.services.BinderDriveDataService");
                        int removeUpTimeMills = removeUpTimeMills(parcel.readLong(), parcel.readLong());
                        parcel2.writeNoException();
                        parcel2.writeInt(removeUpTimeMills);
                        return true;
                    case 16:
                        parcel.enforceInterface("com.bytedance.ee.bear.drive.services.BinderDriveDataService");
                        int trimLruCacheToSize = trimLruCacheToSize(parcel.readLong());
                        parcel2.writeNoException();
                        parcel2.writeInt(trimLruCacheToSize);
                        return true;
                    case 17:
                        parcel.enforceInterface("com.bytedance.ee.bear.drive.services.BinderDriveDataService");
                        int removeAll3 = removeAll(Long.valueOf(parcel.readLong()));
                        parcel2.writeNoException();
                        parcel2.writeInt(removeAll3);
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString("com.bytedance.ee.bear.drive.services.BinderDriveDataService");
                return true;
            }
        }
    }
}
