package com.ss.android.lark.desktopmode;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.lark.desktopmode.base.ContainerType;
import com.ss.android.lark.desktopmode.base.DrawerParams;
import com.ss.android.lark.desktopmode.base.FloatWindowParams;
import com.ss.android.lark.desktopmode.base.MainWindowParams;
import com.ss.android.lark.desktopmode.base.StandAloneParam;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.desktopmode.p1787a.C36519d;
import com.ss.android.lark.desktopmode.p1788b.p1790b.AbstractC36536a;
import com.ss.android.lark.desktopmode.p1788b.p1793e.AbstractC36553a;
import com.ss.android.lark.desktopmode.p1788b.p1794f.C36558a;
import com.ss.android.lark.desktopmode.p1788b.p1794f.C36561b;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;

/* renamed from: com.ss.android.lark.desktopmode.a */
public class C36512a {

    /* renamed from: a */
    public AbstractC36515b f94031a;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.desktopmode.a$a */
    public static final class C36514a {

        /* renamed from: a */
        public static final C36512a f94032a = new C36512a();
    }

    /* renamed from: com.ss.android.lark.desktopmode.a$b */
    public interface AbstractC36515b {
        /* renamed from: a */
        void mo134779a(Dialog dialog);
    }

    private C36512a() {
    }

    /* renamed from: a */
    public static C36512a m144041a() {
        return C36514a.f94032a;
    }

    /* renamed from: a */
    public void mo134764a(C36519d.AbstractC36527c cVar, AbstractC36515b bVar) {
        C36519d.m144080a().mo134810a(cVar);
        this.f94031a = bVar;
    }

    /* renamed from: a */
    public void mo134766a(AbstractC36553a aVar) {
        C36519d.m144080a().mo134812a(aVar);
    }

    /* renamed from: a */
    public void mo134767a(String str) {
        C36519d.m144080a().mo134813a(str);
    }

    /* renamed from: a */
    public void mo134763a(C36516a aVar, MainWindowParams mainWindowParams) {
        C36519d.m144080a().mo134808a(aVar, mainWindowParams);
    }

    /* renamed from: a */
    public void mo134762a(C36516a aVar, FloatWindowParams floatWindowParams) {
        C36519d.m144080a().mo134806a(aVar, floatWindowParams);
    }

    /* renamed from: a */
    public boolean mo134769a(KeyEvent keyEvent) {
        return C36519d.m144080a().mo134816a(keyEvent);
    }

    /* renamed from: a */
    public void mo134765a(AbstractC36536a aVar) {
        C36519d.m144080a().mo134811a(aVar);
    }

    /* renamed from: a */
    public void mo134768a(boolean z) {
        C36519d.m144080a().mo134815a(z);
    }

    /* renamed from: b */
    public void mo134771b() {
        C36519d.m144080a().mo134825g();
    }

    /* renamed from: c */
    public void mo134775c() {
        C36519d.m144080a().mo134822d();
    }

    /* renamed from: d */
    public void mo134777d() {
        C36519d.m144080a().mo134824f();
    }

    /* renamed from: a */
    public Rect mo134753a(ContainerType containerType) {
        return C36519d.m144080a().mo134800a(containerType);
    }

    /* renamed from: b */
    public C36516a mo134770b(ContainerType containerType) {
        return C36519d.m144080a().mo134817b(containerType);
    }

    /* renamed from: c */
    public void mo134776c(String str) {
        C36519d.m144080a().mo134814a(str, false);
    }

    /* renamed from: d */
    public void mo134778d(String str) {
        C36519d.m144080a().mo134820b(str);
    }

    /* renamed from: a */
    public void mo134754a(Activity activity) {
        if (DesktopUtil.m144301a((Context) activity)) {
            C36561b.m144265a().mo134922a(activity);
        }
    }

    /* renamed from: b */
    public void mo134772b(Activity activity) {
        if (DesktopUtil.m144301a((Context) activity)) {
            C36561b.m144265a().mo134924b(activity);
        }
    }

    /* renamed from: b */
    public void mo134773b(AbstractC36536a aVar) {
        C36519d.m144080a().mo134819b(aVar);
    }

    /* renamed from: a */
    public void mo134757a(View view) {
        C36519d.m144080a().mo134801a(view);
    }

    /* renamed from: b */
    public void mo134774b(String str) {
        C36519d.m144080a().mo134814a(str, true);
    }

    /* renamed from: a */
    public void mo134758a(C36516a aVar) {
        C36519d.m144080a().mo134802a(aVar);
    }

    /* renamed from: a */
    public void mo134756a(Activity activity, StandAloneParam standAloneParam) {
        C36558a.m144262a(activity, standAloneParam);
    }

    /* renamed from: a */
    public void mo134761a(C36516a aVar, DrawerParams drawerParams) {
        C36519d.m144080a().mo134804a(aVar, drawerParams);
    }

    /* renamed from: a */
    public void mo134755a(Activity activity, Fragment fragment, StandAloneParam standAloneParam) {
        C36558a.m144261a(activity, fragment, standAloneParam);
    }

    /* renamed from: a */
    public void mo134759a(C36516a aVar, C36516a aVar2, DrawerParams drawerParams, int i) {
        C36519d.m144080a().mo134805a(aVar2, drawerParams, aVar.getFragmentInfoId(), i);
    }

    /* renamed from: a */
    public void mo134760a(C36516a aVar, C36516a aVar2, FloatWindowParams floatWindowParams, int i) {
        C36519d.m144080a().mo134807a(aVar2, floatWindowParams, aVar.getFragmentInfoId(), i);
    }
}
