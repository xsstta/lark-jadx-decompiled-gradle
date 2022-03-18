package com.ss.android.lark.appreciablelib;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/appreciablelib/Biz;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "Messenger", "Search", "Calendar", "Docs", "Driver", "Mail", "OpenPlatform", "UserGrowth", "VideoConference", "Moments", "Core", "Todo", "appreciablelib_release"}, mo238835k = 1, mv = {1, 1, 15})
public enum Biz {
    Messenger(1),
    Search(2),
    Calendar(3),
    Docs(4),
    Driver(5),
    Mail(6),
    OpenPlatform(7),
    UserGrowth(8),
    VideoConference(9),
    Moments(10),
    Core(11),
    Todo(12);
    
    private final int value;

    public final int getValue() {
        return this.value;
    }

    private Biz(int i) {
        this.value = i;
    }
}
