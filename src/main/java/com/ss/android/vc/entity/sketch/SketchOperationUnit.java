package com.ss.android.vc.entity.sketch;

import com.ss.android.vc.meeting.module.sketch.dto.RemoveData;
import java.util.List;

public class SketchOperationUnit {

    /* renamed from: a */
    public Action f152788a;

    /* renamed from: b */
    public Command f152789b;

    /* renamed from: c */
    public List<SketchDataUnit> f152790c;

    /* renamed from: d */
    public ClearType f152791d;

    /* renamed from: e */
    public RemoveData f152792e;

    /* renamed from: f */
    public long f152793f;

    public enum Action {
        DRAW(1),
        UNDO(2),
        CLEAR(3);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static Action valueOf(int i) {
            return forNumber(i);
        }

        public static Action forNumber(int i) {
            if (i == 1) {
                return DRAW;
            }
            if (i == 2) {
                return UNDO;
            }
            if (i != 3) {
                return null;
            }
            return CLEAR;
        }

        private Action(int i) {
            this.value = i;
        }
    }

    public enum ClearType {
        OTHER(1),
        SELF(2),
        ALL(3);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static ClearType valueOf(int i) {
            return forNumber(i);
        }

        public static ClearType forNumber(int i) {
            if (i == 1) {
                return OTHER;
            }
            if (i == 2) {
                return SELF;
            }
            if (i != 3) {
                return null;
            }
            return ALL;
        }

        private ClearType(int i) {
            this.value = i;
        }
    }

    public enum Command {
        ADD(1),
        REMOVE(2);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static Command valueOf(int i) {
            return forNumber(i);
        }

        public static Command forNumber(int i) {
            if (i == 1) {
                return ADD;
            }
            if (i != 2) {
                return null;
            }
            return REMOVE;
        }

        private Command(int i) {
            this.value = i;
        }
    }

    public enum RemoveType {
        REMOVE_ALL(1),
        STORE_BY_DEVICE_ID(2),
        REMOVE_BY_DEVICE_ID(3),
        REMOVE_BY_SHAPE_ID(4);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static RemoveType valueOf(int i) {
            return forNumber(i);
        }

        public static RemoveType forNumber(int i) {
            if (i == 1) {
                return REMOVE_ALL;
            }
            if (i == 2) {
                return STORE_BY_DEVICE_ID;
            }
            if (i == 3) {
                return REMOVE_BY_DEVICE_ID;
            }
            if (i != 4) {
                return null;
            }
            return REMOVE_BY_SHAPE_ID;
        }

        private RemoveType(int i) {
            this.value = i;
        }
    }
}
