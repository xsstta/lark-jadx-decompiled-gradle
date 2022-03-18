package com.facebook.common.statfs;

import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import com.facebook.common.internal.Throwables;
import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.Nullable;

public class StatFsHelper {
    private static final long RESTAT_INTERVAL_MS = TimeUnit.MINUTES.toMillis(2);
    private static StatFsHelper sStatsFsHelper;
    private final Lock lock = new ReentrantLock();
    private volatile File mExternalPath;
    @Nullable
    private volatile StatFs mExternalStatFs;
    private volatile boolean mInitialized;
    private volatile File mInternalPath;
    @Nullable
    private volatile StatFs mInternalStatFs;
    private long mLastRestatTime;

    public enum StorageType {
        INTERNAL,
        EXTERNAL
    }

    protected StatFsHelper() {
    }

    public static synchronized StatFsHelper getInstance() {
        StatFsHelper statFsHelper;
        synchronized (StatFsHelper.class) {
            if (sStatsFsHelper == null) {
                sStatsFsHelper = new StatFsHelper();
            }
            statFsHelper = sStatsFsHelper;
        }
        return statFsHelper;
    }

    private void updateStats() {
        this.mInternalStatFs = updateStatsHelper(this.mInternalStatFs, this.mInternalPath);
        this.mExternalStatFs = updateStatsHelper(this.mExternalStatFs, this.mExternalPath);
        this.mLastRestatTime = SystemClock.uptimeMillis();
    }

    public void resetStats() {
        if (this.lock.tryLock()) {
            try {
                ensureInitialized();
                updateStats();
            } finally {
                this.lock.unlock();
            }
        }
    }

    private void ensureInitialized() {
        if (!this.mInitialized) {
            this.lock.lock();
            try {
                if (!this.mInitialized) {
                    this.mInternalPath = Environment.getDataDirectory();
                    this.mExternalPath = Environment.getExternalStorageDirectory();
                    updateStats();
                    this.mInitialized = true;
                }
            } finally {
                this.lock.unlock();
            }
        }
    }

    private void maybeUpdateStats() {
        if (this.lock.tryLock()) {
            try {
                if (SystemClock.uptimeMillis() - this.mLastRestatTime > RESTAT_INTERVAL_MS) {
                    updateStats();
                }
            } finally {
                this.lock.unlock();
            }
        }
    }

    protected static StatFs createStatFs(String str) {
        return new StatFs(str);
    }

    public long getAvailableStorageSpace(StorageType storageType) {
        StatFs statFs;
        long j;
        long j2;
        ensureInitialized();
        maybeUpdateStats();
        if (storageType == StorageType.INTERNAL) {
            statFs = this.mInternalStatFs;
        } else {
            statFs = this.mExternalStatFs;
        }
        if (statFs == null) {
            return 0;
        }
        if (Build.VERSION.SDK_INT >= 18) {
            j2 = statFs.getBlockSizeLong();
            j = statFs.getAvailableBlocksLong();
        } else {
            j2 = (long) statFs.getBlockSize();
            j = (long) statFs.getAvailableBlocks();
        }
        return j2 * j;
    }

    public long getFreeStorageSpace(StorageType storageType) {
        StatFs statFs;
        long j;
        long j2;
        ensureInitialized();
        maybeUpdateStats();
        if (storageType == StorageType.INTERNAL) {
            statFs = this.mInternalStatFs;
        } else {
            statFs = this.mExternalStatFs;
        }
        if (statFs == null) {
            return -1;
        }
        if (Build.VERSION.SDK_INT >= 18) {
            j2 = statFs.getBlockSizeLong();
            j = statFs.getFreeBlocksLong();
        } else {
            j2 = (long) statFs.getBlockSize();
            j = (long) statFs.getFreeBlocks();
        }
        return j2 * j;
    }

    public long getTotalStorageSpace(StorageType storageType) {
        StatFs statFs;
        long j;
        long j2;
        ensureInitialized();
        maybeUpdateStats();
        if (storageType == StorageType.INTERNAL) {
            statFs = this.mInternalStatFs;
        } else {
            statFs = this.mExternalStatFs;
        }
        if (statFs == null) {
            return -1;
        }
        if (Build.VERSION.SDK_INT >= 18) {
            j2 = statFs.getBlockSizeLong();
            j = statFs.getBlockCountLong();
        } else {
            j2 = (long) statFs.getBlockSize();
            j = (long) statFs.getBlockCount();
        }
        return j2 * j;
    }

    public boolean testLowDiskSpace(StorageType storageType, long j) {
        ensureInitialized();
        long availableStorageSpace = getAvailableStorageSpace(storageType);
        if (availableStorageSpace <= 0 || availableStorageSpace < j) {
            return true;
        }
        return false;
    }

    @Nullable
    private StatFs updateStatsHelper(@Nullable StatFs statFs, @Nullable File file) {
        if (file == null || !file.exists()) {
            return null;
        }
        if (statFs == null) {
            try {
                statFs = createStatFs(file.getAbsolutePath());
            } catch (IllegalArgumentException unused) {
                return null;
            } catch (Throwable th) {
                throw Throwables.propagate(th);
            }
        } else {
            statFs.restat(file.getAbsolutePath());
        }
        return statFs;
    }
}
