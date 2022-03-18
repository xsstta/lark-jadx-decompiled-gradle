package org.apache.commons.compress.archivers.dump;

import com.huawei.hms.feature.dynamic.DynamicModule;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import com.ss.ttm.player.MediaPlayer;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

public class DumpArchiveEntry {

    /* renamed from: a */
    private String f174224a;

    /* renamed from: b */
    private TYPE f174225b = TYPE.UNKNOWN;

    /* renamed from: c */
    private Set<PERMISSION> f174226c = Collections.emptySet();

    /* renamed from: d */
    private final C69759a f174227d = null;

    /* renamed from: e */
    private final C69758a f174228e = new C69758a();

    /* renamed from: f */
    private int f174229f;

    /* renamed from: a */
    public String mo244695a() {
        return this.f174224a;
    }

    public int hashCode() {
        return this.f174229f;
    }

    public String toString() {
        return mo244695a();
    }

    /* renamed from: org.apache.commons.compress.archivers.dump.DumpArchiveEntry$a */
    static class C69758a {

        /* renamed from: a */
        public final byte[] f174230a = new byte[MediaPlayer.MEDIA_PLAYER_OPTION_APPID];

        C69758a() {
        }
    }

    public enum TYPE {
        WHITEOUT(14),
        SOCKET(12),
        LINK(10),
        FILE(8),
        BLKDEV(6),
        DIRECTORY(4),
        CHRDEV(2),
        FIFO(1),
        UNKNOWN(15);
        
        private int code;

        public static TYPE find(int i) {
            TYPE type = UNKNOWN;
            TYPE[] values = values();
            for (TYPE type2 : values) {
                if (i == type2.code) {
                    type = type2;
                }
            }
            return type;
        }

        private TYPE(int i) {
            this.code = i;
        }
    }

    public enum PERMISSION {
        SETUID(2048),
        SETGUI(1024),
        STICKY(MediaPlayer.MEDIA_PLAYER_OPTION_APPID),
        USER_READ(DynamicModule.f58006b),
        USER_WRITE(SmActions.ACTION_ONTHECALL_EXIT),
        USER_EXEC(64),
        GROUP_READ(32),
        GROUP_WRITE(16),
        GROUP_EXEC(8),
        WORLD_READ(4),
        WORLD_WRITE(2),
        WORLD_EXEC(1);
        
        private int code;

        public static Set<PERMISSION> find(int i) {
            HashSet hashSet = new HashSet();
            PERMISSION[] values = values();
            for (PERMISSION permission : values) {
                int i2 = permission.code;
                if ((i & i2) == i2) {
                    hashSet.add(permission);
                }
            }
            if (hashSet.isEmpty()) {
                return Collections.emptySet();
            }
            return EnumSet.copyOf(hashSet);
        }

        private PERMISSION(int i) {
            this.code = i;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        DumpArchiveEntry dumpArchiveEntry = (DumpArchiveEntry) obj;
        if (dumpArchiveEntry.f174228e == null || this.f174229f != dumpArchiveEntry.f174229f) {
            return false;
        }
        C69759a aVar = this.f174227d;
        if ((aVar != null || dumpArchiveEntry.f174227d == null) && (aVar == null || aVar.equals(dumpArchiveEntry.f174227d))) {
            return true;
        }
        return false;
    }
}
