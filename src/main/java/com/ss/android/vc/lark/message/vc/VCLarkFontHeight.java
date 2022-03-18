package com.ss.android.vc.lark.message.vc;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u001b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B7\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000bj\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001d¨\u0006\u001e"}, d2 = {"Lcom/ss/android/vc/lark/message/vc/VCLarkFontHeight;", "", "small", "", "normal", "large1", "large2", "large3", "large4", "(Ljava/lang/String;IIIIIII)V", "getLarge1", "()I", "getLarge2", "getLarge3", "getLarge4", "getNormal", "getSmall", "TITLE0", "TITLE1", "TITLE2", "TITLE3", "TITLE4", "HEADLINE", "BODY0", "BODY1", "BODY2", "CAPTION0", "CAPTION1", "CAPTION2", "CAPTION3", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public enum VCLarkFontHeight {
    TITLE0(32, 34, 38, 40, 46, 54),
    TITLE1(30, 32, 34, 38, 44, 48),
    TITLE2(26, 28, 30, 32, 38, 44),
    TITLE3(22, 24, 26, 28, 32, 38),
    TITLE4(22, 24, 26, 28, 32, 38),
    HEADLINE(22, 22, 24, 26, 28, 32),
    BODY0(22, 22, 24, 26, 28, 32),
    BODY1(20, 20, 22, 22, 26, 28),
    BODY2(20, 20, 22, 22, 26, 28),
    CAPTION0(16, 18, 20, 20, 22, 24),
    CAPTION1(16, 18, 20, 20, 22, 24),
    CAPTION2(12, 14, 16, 18, 20, 20),
    CAPTION3(12, 14, 16, 18, 20, 20);
    
    private final int large1;
    private final int large2;
    private final int large3;
    private final int large4;
    private final int normal;
    private final int small;

    public final int getLarge1() {
        return this.large1;
    }

    public final int getLarge2() {
        return this.large2;
    }

    public final int getLarge3() {
        return this.large3;
    }

    public final int getLarge4() {
        return this.large4;
    }

    public final int getNormal() {
        return this.normal;
    }

    public final int getSmall() {
        return this.small;
    }

    private VCLarkFontHeight(int i, int i2, int i3, int i4, int i5, int i6) {
        this.small = i;
        this.normal = i2;
        this.large1 = i3;
        this.large2 = i4;
        this.large3 = i5;
        this.large4 = i6;
    }
}
