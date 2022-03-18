package com.ss.android.vc.meeting.framework.statemachine;

import android.os.Message;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class State implements AbstractC61338d {

    @Retention(RetentionPolicy.SOURCE)
    public @interface SmState {
    }

    /* renamed from: a */
    public boolean mo212286a(Message message) {
        return false;
    }

    @Override // com.ss.android.vc.meeting.framework.statemachine.AbstractC61338d
    /* renamed from: b */
    public int mo212287b() {
        return 0;
    }

    /* renamed from: c */
    public void mo212288c() {
    }

    /* renamed from: d */
    public void mo212289d() {
    }

    protected State() {
    }

    @Override // com.ss.android.vc.meeting.framework.statemachine.AbstractC61338d
    /* renamed from: a */
    public String mo212285a() {
        String name = getClass().getName();
        return name.substring(name.lastIndexOf(36) + 1);
    }
}
