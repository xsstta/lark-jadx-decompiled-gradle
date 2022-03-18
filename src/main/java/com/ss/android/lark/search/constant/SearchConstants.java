package com.ss.android.lark.search.constant;

import com.huawei.hms.location.LocationRequest;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.utils.UIHelper;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class SearchConstants {

    /* renamed from: a */
    public static final int f131825a;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ModifierType {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface PartialClickAction {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface SearchActionType {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface SearchFromTab {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface SearchMessageBehavior {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface SpaceValue {
    }

    public enum SpaceType {
        UNKNOWN(0, "unknown"),
        DOC(1, "doc"),
        SHEET(2, "sheet"),
        BITABLE(3, "bitable"),
        MINDNOTE(4, "mindnote"),
        FILE(5, "file"),
        SLIDE(6, "slide"),
        WIKI(7, "wiki"),
        DOCX(8, "docx"),
        ALL(100001, "all");
        
        private final String name;
        private final int value;

        public String getName() {
            return this.name;
        }

        public int getValue() {
            return this.value;
        }

        public static SpaceType valueOf(int i) {
            if (i == 100001) {
                return ALL;
            }
            switch (i) {
                case 1:
                    return DOC;
                case 2:
                    return SHEET;
                case 3:
                    return BITABLE;
                case 4:
                    return MINDNOTE;
                case 5:
                    return FILE;
                case 6:
                    return SLIDE;
                case 7:
                    return WIKI;
                case 8:
                    return DOCX;
                default:
                    return UNKNOWN;
            }
        }

        /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
        public static SpaceType nameOf(String str) {
            char c;
            switch (str.hashCode()) {
                case -1363649724:
                    if (str.equals("mindnote")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -284840886:
                    if (str.equals("unknown")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case -102775833:
                    if (str.equals("bitable")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 96673:
                    if (str.equals("all")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 99640:
                    if (str.equals("doc")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 3088960:
                    if (str.equals("docx")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 3143036:
                    if (str.equals("file")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 3649456:
                    if (str.equals("wiki")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 109403487:
                    if (str.equals("sheet")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 109526449:
                    if (str.equals("slide")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    return DOC;
                case 1:
                    return SHEET;
                case 2:
                    return BITABLE;
                case 3:
                    return MINDNOTE;
                case 4:
                    return FILE;
                case 5:
                    return SLIDE;
                case 6:
                    return WIKI;
                case 7:
                    return DOCX;
                case '\b':
                    return ALL;
                default:
                    return UNKNOWN;
            }
        }

        private SpaceType(int i, String str) {
            this.value = i;
            this.name = str;
        }
    }

    static {
        int i;
        if (DesktopUtil.m144301a(UIHelper.getContext())) {
            i = 0;
        } else {
            i = LocationRequest.PRIORITY_HD_ACCURACY;
        }
        f131825a = i;
    }
}
