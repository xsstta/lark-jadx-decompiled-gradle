package com.ss.android.lark.chat.chatwindow.chat.p1613b.p1614a;

import com.huawei.hms.android.HwBuildEx;
import com.ss.android.lark.chat.base.view.p1603a.AbstractC32928b;
import com.ss.android.lark.chat.export.ui.p1672b.C34029b;
import com.ss.android.lark.chat.vo.ChatMessageVO;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.b.a.a */
public class C33090a implements AbstractC32928b<ChatMessageVO<?>> {

    /* renamed from: a */
    private boolean f85227a;

    /* renamed from: b */
    private boolean f85228b;

    /* renamed from: c */
    private boolean f85229c;

    /* renamed from: d */
    private boolean f85230d;

    /* renamed from: b */
    private boolean m127978b(C34029b bVar, boolean z) {
        if (!z || bVar.f87966a != 7) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private boolean m127979c(C34029b bVar, boolean z) {
        if (z || bVar.f87966a != 7) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private boolean m127980d(C34029b bVar, boolean z) {
        if (z || bVar.f87966a != 7) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private boolean m127977a(C34029b bVar, boolean z) {
        if (!z) {
            return true;
        }
        int i = bVar.f87966a;
        if (i == 9 || i == 16 || i == 19 || i == 21 || i == 25 || i == 26) {
            return false;
        }
        switch (i) {
            case 11:
            case HwBuildEx.VersionCodes.EMUI_5_1:
            case 13:
                return false;
            default:
                return true;
        }
    }

    /* renamed from: a */
    public boolean accept(C34029b bVar, ChatMessageVO<?> cVar) {
        if (!m127978b(bVar, this.f85227a) || !m127977a(bVar, this.f85228b) || !m127979c(bVar, this.f85229c) || !m127980d(bVar, this.f85230d)) {
            return false;
        }
        return true;
    }

    public C33090a(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f85227a = z;
        this.f85228b = z2;
        this.f85229c = z3;
        this.f85230d = z4;
    }
}
