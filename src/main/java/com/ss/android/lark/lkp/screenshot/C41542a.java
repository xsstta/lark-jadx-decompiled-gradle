package com.ss.android.lark.lkp.screenshot;

import android.content.Context;
import com.ss.android.lark.biz.im.api.IScreenshotCallBack;
import com.ss.android.lark.biz.im.api.LKPType;
import com.ss.android.lark.lkp.screenshot.dto.IScreenshotAPI;
import com.ss.android.lark.lkp.screenshot.p2142a.AbstractC41543a;
import com.ss.android.lark.lkp.screenshot.receiver.ScreenShotReceiverManager;
import com.ss.android.lark.lkp.screenshot.service.ScreenshotService;

/* renamed from: com.ss.android.lark.lkp.screenshot.a */
public class C41542a {

    /* renamed from: a */
    private static volatile AbstractC41543a f105606a;

    /* renamed from: a */
    public static AbstractC41543a m164843a() {
        return f105606a;
    }

    /* renamed from: b */
    public void mo149466b() {
        ScreenShotReceiverManager.f105624b.mo149485a().mo149481a();
    }

    /* renamed from: c */
    public void mo149467c() {
        ScreenShotReceiverManager.f105624b.mo149485a().mo149483b();
    }

    public C41542a(AbstractC41543a aVar) {
        f105606a = aVar;
    }

    /* renamed from: a */
    public void mo149465a(Context context, LKPType lKPType, IScreenshotCallBack uVar) {
        IScreenshotAPI a = ScreenshotService.f105607a.mo149469a(context);
        if (a == null) {
            uVar.mo106758a(1);
        } else {
            a.mo149468a(lKPType, uVar);
        }
    }
}
