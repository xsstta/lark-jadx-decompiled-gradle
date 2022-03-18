package com.ss.android.lark.app.taskv2.preload;

import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.launch.task.AsyncLaunchTask;
import com.larksuite.framework.utils.MediaStoreUtil;
import com.ss.android.lark.diskmanage.storage.StoragePathUtils;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.permission.C51327f;
import com.ss.android.lark.platform.statistics.FileMigrateHitPoint;
import com.ss.android.lark.util.share_preference.C57744a;
import com.ss.android.lark.utils.C57788ai;
import java.io.File;
import java.io.RandomAccessFile;
import kotlin.Metadata;
import kotlin.collections.C69043h;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00122\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0003\u0012\u0013\u0014B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0018\u0010\u0004\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0012\u0010\f\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u0012\u0010\u000f\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u000eH\u0002¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/app/taskv2/preload/FileMigrateTask;", "Lcom/larksuite/framework/launch/task/AsyncLaunchTask;", "", "()V", "collectFileInfo", "Lcom/ss/android/lark/app/taskv2/preload/FileMigrateTask$SpaceStatics;", "file", "Ljava/io/File;", "", "distribution", "delayDuration", "", "execute", "context", "Landroid/content/Context;", "testFileMigrateAbility", "testRenameToFunction", "Lcom/ss/android/lark/app/taskv2/preload/FileMigrateTask$RenameToStatics;", "Companion", "RenameToStatics", "SpaceStatics", "lark-launcher_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class FileMigrateTask extends AsyncLaunchTask<Object> {

    /* renamed from: a */
    public static final Companion f72754a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0006J \u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0019H\u0002J\b\u0010\u001d\u001a\u00020\u0019H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, d2 = {"Lcom/ss/android/lark/app/taskv2/preload/FileMigrateTask$SpaceStatics;", "", "()V", "gbCount", "", "gbSpace", "", "kbCount", "kbSpace", "mbCount", "mbSpace", "totalCount", "getTotalCount", "()I", "setTotalCount", "(I)V", "totalSpace", "getTotalSpace", "()J", "setTotalSpace", "(J)V", "add", "", "length", "generateDistribution", "", "space", "count", ShareHitPoint.f121869d, "toString", "Companion", "lark-launcher_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class SpaceStatics {

        /* renamed from: a */
        public static final Companion f72757a = new Companion(null);

        /* renamed from: b */
        private int f72758b;

        /* renamed from: c */
        private int f72759c;

        /* renamed from: d */
        private int f72760d;

        /* renamed from: e */
        private long f72761e;

        /* renamed from: f */
        private long f72762f;

        /* renamed from: g */
        private long f72763g;

        /* renamed from: h */
        private long f72764h;

        /* renamed from: i */
        private int f72765i;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/app/taskv2/preload/FileMigrateTask$SpaceStatics$Companion;", "", "()V", "GB", "", "GB_MASK", "", "KB", "KB_MASK", "MB", "MB_MASK", "lark-launcher_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* renamed from: a */
        public final long mo103062a() {
            return this.f72764h;
        }

        /* renamed from: b */
        public final int mo103064b() {
            return this.f72765i;
        }

        public String toString() {
            return C69043h.m265740a(new String[]{m106774a(this.f72763g, this.f72760d, "GB"), m106774a(this.f72762f, this.f72759c, "MB"), m106774a(this.f72761e, this.f72758b, "KB")}, "\n", null, null, 0, null, null, 62, null);
        }

        /* renamed from: a */
        public final void mo103063a(long j) {
            this.f72764h += j;
            this.f72765i++;
            if ((j >> 30) > 0) {
                this.f72763g += j;
                this.f72760d++;
            } else if ((j >> 20) > 0) {
                this.f72762f += j;
                this.f72759c++;
            } else if ((j >> 10) > 0) {
                this.f72761e += j;
                this.f72758b++;
            }
        }

        /* renamed from: a */
        private final String m106774a(long j, int i, String str) {
            return str + ':' + j + '/' + i;
        }
    }

    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: b */
    public int mo43824b() {
        return 5;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bXT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bXT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/app/taskv2/preload/FileMigrateTask$Companion;", "", "()V", "CREATE_OR_WRITE_FILE_FAILED", "", "DELAY_DURATION", "DST_FILE_EXISTS", "KB_FILE_MASK", "MEDIA_STORE_URI_IS_NULL", "MEDIA_STORE_URI_PATH_IS_NULL", "SP_KEY_HAS_REPORT_TEST_RESULT", "", "TAG", "TEMP_FILE", "TEMP_FILE_SIZE", "", "UNEXPECTED_EXCEPTION", "lark-launcher_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/app/taskv2/preload/FileMigrateTask$RenameToStatics;", "", "enabled", "", "speed", "", "(IF)V", "getEnabled", "()I", "getSpeed", "()F", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "lark-launcher_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class RenameToStatics {

        /* renamed from: a */
        private final int f72755a;

        /* renamed from: b */
        private final float f72756b;

        public RenameToStatics() {
            this(0, BitmapDescriptorFactory.HUE_RED, 3, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RenameToStatics)) {
                return false;
            }
            RenameToStatics renameToStatics = (RenameToStatics) obj;
            return this.f72755a == renameToStatics.f72755a && Float.compare(this.f72756b, renameToStatics.f72756b) == 0;
        }

        public int hashCode() {
            return (this.f72755a * 31) + Float.floatToIntBits(this.f72756b);
        }

        public String toString() {
            return "RenameToStatics(enabled=" + this.f72755a + ", speed=" + this.f72756b + ")";
        }

        /* renamed from: a */
        public final int mo103057a() {
            return this.f72755a;
        }

        /* renamed from: b */
        public final float mo103058b() {
            return this.f72756b;
        }

        public RenameToStatics(int i, float f) {
            this.f72755a = i;
            this.f72756b = f;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ RenameToStatics(int i, float f, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? BitmapDescriptorFactory.HUE_RED : f);
        }
    }

    /* renamed from: a */
    private final SpaceStatics m106766a(File file) {
        SpaceStatics spaceStatics = new SpaceStatics();
        m106767a(file, spaceStatics);
        return spaceStatics;
    }

    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        super.mo43817a(context);
        try {
            m106768b(context);
        } catch (Exception e) {
            Log.m165389i("FileMigrateTask", e.getMessage());
        }
    }

    /* renamed from: b */
    private final void m106768b(Context context) {
        RenameToStatics renameToStatics;
        if (!C57744a.m224104a().getBoolean("migrate_file_has_report_test_result_v2", false) && context != null && context.getApplicationInfo().targetSdkVersion <= 29 && C51327f.m199081a(context, "android.permission.WRITE_EXTERNAL_STORAGE")) {
            File file = new File(StoragePathUtils.f94669a.mo135729a(context));
            if (file.exists() && !file.isFile()) {
                SpaceStatics a = m106766a(file);
                Log.m165379d("FileMigrateTask", a.toString());
                try {
                    renameToStatics = m106769c(context);
                } catch (Exception unused) {
                    renameToStatics = new RenameToStatics(-5, BitmapDescriptorFactory.HUE_RED, 2, null);
                }
                Log.m165379d("FileMigrateTask", renameToStatics.toString());
                FileMigrateHitPoint.f129087a.mo178192a(renameToStatics.mo103057a(), Float.valueOf(renameToStatics.mo103058b()), Integer.valueOf(a.mo103064b()), Float.valueOf((float) (a.mo103062a() >> 10)), a.toString());
                C57744a.m224104a().putBoolean("migrate_file_has_report_test_result_v2", true);
            }
        }
    }

    /* renamed from: c */
    private final RenameToStatics m106769c(Context context) {
        float f;
        try {
            File file = new File(StoragePathUtils.f94669a.mo135729a(context), "lark.trash");
            new RandomAccessFile(file, "rw").setLength(1048576);
            Uri a = MediaStoreUtil.m94882a(context, "lark.trash", (String) null, (MediaStoreUtil.DirType) null, (ContentValues) null, 28, (Object) null);
            if (a == null) {
                return new RenameToStatics(-2, BitmapDescriptorFactory.HUE_RED, 2, null);
            }
            String a2 = C57788ai.m224257a(context, a);
            if (a2 == null) {
                return new RenameToStatics(-3, BitmapDescriptorFactory.HUE_RED, 2, null);
            }
            File file2 = new File(a2);
            if (file2.exists()) {
                file2.delete();
                return new RenameToStatics(-4, BitmapDescriptorFactory.HUE_RED, 2, null);
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (!file.renameTo(file2)) {
                return new RenameToStatics(0, BitmapDescriptorFactory.HUE_RED, 3, null);
            }
            float currentTimeMillis2 = (float) (System.currentTimeMillis() - currentTimeMillis);
            file2.delete();
            if (currentTimeMillis2 > ((float) 0)) {
                f = ((float) 1024) / currentTimeMillis2;
            } else {
                f = FloatCompanionObject.f173206a.mo239331a();
            }
            return new RenameToStatics(1, f);
        } catch (Exception unused) {
            return new RenameToStatics(-1, BitmapDescriptorFactory.HUE_RED, 2, null);
        }
    }

    /* renamed from: a */
    private final void m106767a(File file, SpaceStatics spaceStatics) {
        if (file.exists()) {
            if (file.isFile()) {
                spaceStatics.mo103063a(file.length());
                return;
            }
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    Intrinsics.checkExpressionValueIsNotNull(file2, "it");
                    m106767a(file2, spaceStatics);
                }
            }
        }
    }
}
