package com.bytedance.ee.bear.sheet.inputbar.at.segment;

import com.bytedance.ee.util.C13593b;
import com.bytedance.ee.util.io.NonProguard;

public enum SegmentType implements NonProguard {
    TEXT,
    MENTION,
    URL,
    EMBED_IMAGE,
    PANO,
    ATTACHMENT;

    public String toString() {
        if (this == EMBED_IMAGE) {
            return "embed-image";
        }
        return C13593b.m55172a(name().toLowerCase());
    }

    public static SegmentType parseSegmentType(String str) {
        if (str != null) {
            str.hashCode();
            char c = 65535;
            switch (str.hashCode()) {
                case -1963501277:
                    if (str.equals("attachment")) {
                        c = 0;
                        break;
                    }
                    break;
                case 116079:
                    if (str.equals("url")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3433330:
                    if (str.equals("pano")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3556653:
                    if (str.equals("text")) {
                        c = 3;
                        break;
                    }
                    break;
                case 950345194:
                    if (str.equals("mention")) {
                        c = 4;
                        break;
                    }
                    break;
                case 2084357479:
                    if (str.equals("embed-image")) {
                        c = 5;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    return ATTACHMENT;
                case 1:
                    return URL;
                case 2:
                    return PANO;
                case 3:
                    return TEXT;
                case 4:
                    return MENTION;
                case 5:
                    return EMBED_IMAGE;
            }
        }
        return TEXT;
    }
}
