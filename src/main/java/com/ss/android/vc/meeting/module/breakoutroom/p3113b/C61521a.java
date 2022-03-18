package com.ss.android.vc.meeting.module.breakoutroom.p3113b;

import android.content.Context;
import com.larksuite.component.universe_design.dialog.UDBaseDialogBuilder;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.breakoutroom.widgets.BreakoutRoomPopWindowDialogController;

/* renamed from: com.ss.android.vc.meeting.module.breakoutroom.b.a */
public class C61521a extends UDBaseDialogBuilder {

    /* renamed from: a */
    protected Context f154307a;

    /* renamed from: b */
    protected BreakoutRoomPopWindowDialogController.IDelegate f154308b;

    /* renamed from: c */
    protected String f154309c;

    /* renamed from: d */
    protected boolean f154310d = true;

    /* renamed from: e */
    protected BreakoutRoomPopWindowDialogController.OnShouldShowListener f154311e;

    /* renamed from: f */
    protected int f154312f = 36;

    /* renamed from: g */
    protected C61303k f154313g;

    /* renamed from: a */
    public C61521a mo213220a(C61303k kVar) {
        this.f154313g = kVar;
        return this;
    }

    /* renamed from: a */
    public C61521a mo213221a(BreakoutRoomPopWindowDialogController.IDelegate aVar) {
        this.f154308b = aVar;
        return this;
    }

    /* renamed from: a */
    public C61521a mo213222a(BreakoutRoomPopWindowDialogController.OnShouldShowListener bVar) {
        this.f154311e = bVar;
        return this;
    }

    public C61521a(Context context) {
        super(context);
        this.f154307a = context;
        this.f154310d = true;
        controller(new BreakoutRoomPopWindowDialogController(context));
        marginInDp(this.f154312f);
    }

    /* renamed from: a */
    public C61521a mo213223a(String str) {
        this.f154309c = str;
        return this;
    }

    /* renamed from: a */
    public C61521a mo213224a(boolean z) {
        this.f154310d = z;
        return this;
    }
}
