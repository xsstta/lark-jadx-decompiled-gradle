package org.apache.commons.lang3.builder;

import com.ss.ttm.player.MediaPlayer;

/* renamed from: org.apache.commons.lang3.builder.c */
public class C69868c {

    /* renamed from: a */
    private static volatile ToStringStyle f174644a = ToStringStyle.DEFAULT_STYLE;

    /* renamed from: b */
    private final StringBuffer f174645b;

    /* renamed from: c */
    private final Object f174646c;

    /* renamed from: d */
    private final ToStringStyle f174647d;

    /* renamed from: d */
    public static ToStringStyle m268146d() {
        return f174644a;
    }

    /* renamed from: e */
    public Object mo245195e() {
        return this.f174646c;
    }

    /* renamed from: f */
    public StringBuffer mo245196f() {
        return this.f174645b;
    }

    /* renamed from: g */
    public ToStringStyle mo245197g() {
        return this.f174647d;
    }

    public String toString() {
        if (mo245195e() == null) {
            mo245196f().append(mo245197g().getNullText());
        } else {
            this.f174647d.appendEnd(mo245196f(), mo245195e());
        }
        return mo245196f().toString();
    }

    /* renamed from: a */
    public C69868c mo245194a(String str, Object obj) {
        this.f174647d.append(this.f174645b, str, obj, (Boolean) null);
        return this;
    }

    public C69868c(Object obj, ToStringStyle toStringStyle, StringBuffer stringBuffer) {
        toStringStyle = toStringStyle == null ? m268146d() : toStringStyle;
        stringBuffer = stringBuffer == null ? new StringBuffer((int) MediaPlayer.MEDIA_PLAYER_OPTION_APPID) : stringBuffer;
        this.f174645b = stringBuffer;
        this.f174647d = toStringStyle;
        this.f174646c = obj;
        toStringStyle.appendStart(stringBuffer, obj);
    }
}
