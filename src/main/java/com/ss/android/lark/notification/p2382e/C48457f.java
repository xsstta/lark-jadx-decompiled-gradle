package com.ss.android.lark.notification.p2382e;

import com.huawei.hms.android.HwBuildEx;
import com.huawei.updatesdk.service.otaupdate.UpdateDialogStatusCode;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.notification.C48398a;
import com.ss.android.lark.notification.env.C48478b;
import com.ss.android.lark.notification.env.C48492c;
import com.ss.android.lark.notification.export.AbstractNotification;
import com.ss.android.lark.notification.export.entity.Notice;
import com.ss.android.lark.notification.p2385g.AbstractC48512b;
import com.ss.android.lark.notification.p2387i.C48541c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.notification.e.f */
public class C48457f {

    /* renamed from: a */
    private static volatile Boolean f121935a = new Boolean(false);

    protected C48457f() {
    }

    /* renamed from: a */
    public AbstractC48512b mo169522a() {
        return new AbstractC48512b() {
            /* class com.ss.android.lark.notification.p2382e.C48457f.C484581 */

            @Override // com.ss.android.lark.notification.p2385g.AbstractC48512b
            /* renamed from: a */
            public /* synthetic */ void mo169526a(C48541c cVar) {
                AbstractC48512b.CC.$default$a(this, cVar);
            }

            @Override // com.ss.android.lark.notification.p2385g.AbstractC48512b
            /* renamed from: a */
            public void mo169525a(Notice notice) {
                C48457f.this.mo169523a(notice);
            }
        };
    }

    /* renamed from: d */
    private List<Integer> m191128d(Notice notice) {
        ArrayList arrayList = new ArrayList();
        if (!(notice.extra == null || notice.extra.f122013l == 0)) {
            if (notice.type == 1 && notice.extra.f122013l == 3) {
                arrayList.add(Integer.valueOf((int) HwBuildEx.VersionCodes.CUR_DEVELOPMENT));
                return arrayList;
            }
            arrayList.add(2);
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo169523a(final Notice notice) {
        if (!f121935a.booleanValue()) {
            synchronized (f121935a) {
                if (!f121935a.booleanValue()) {
                    C48398a.m190922a().mo169354q();
                    C48478b.m191179a().mo169544b();
                    f121935a = true;
                }
            }
        }
        CoreThreadPool.getDefault().newSerialCpuDensityThreadPool("NotificationDispatcher").execute(new Runnable() {
            /* class com.ss.android.lark.notification.p2382e.C48457f.RunnableC484592 */

            public void run() {
                if (!C48492c.m191192a(C48398a.m190922a().mo169335a())) {
                    Log.m165389i("NotificationDispatcher", "Notification is disabled");
                } else {
                    C48457f.this.mo169524b(notice);
                }
            }
        });
    }

    /* renamed from: b */
    public void mo169524b(Notice notice) {
        if (notice == null) {
            Log.m165383e("NotificationDispatcher", "notice is empty!");
            return;
        }
        for (Integer num : m191127c(notice)) {
            AbstractNotification a = C48464i.m191147a().mo169531a(num.intValue());
            if (a == null) {
                Log.m165383e("NotificationDispatcher", "notification for " + num + " is not registered!");
            } else {
                new C48463h(a).mo169530a(notice);
            }
        }
    }

    /* renamed from: c */
    private List<Integer> m191127c(Notice notice) {
        ArrayList arrayList = new ArrayList();
        int i = notice.type;
        if (i == 20001) {
            arrayList.add(20001);
            return arrayList;
        } else if (i != 20002) {
            switch (i) {
                case 1:
                case 2:
                    if (notice.state == 3 || notice.state == 2) {
                        arrayList.add(2);
                        arrayList.add(4);
                        arrayList.add(5);
                        return arrayList;
                    } else if (notice.state != 4) {
                        return m191128d(notice);
                    } else {
                        arrayList.add(Integer.valueOf((int) UpdateDialogStatusCode.SHOW));
                        return arrayList;
                    }
                case 3:
                    arrayList.add(3);
                    return arrayList;
                case 4:
                    arrayList.add(4);
                    return arrayList;
                case 5:
                    arrayList.add(5);
                    return arrayList;
                case 6:
                    arrayList.add(6);
                    return arrayList;
                case 7:
                    arrayList.add(7);
                    return arrayList;
                case 8:
                    arrayList.add(8);
                    return arrayList;
                case 9:
                    arrayList.add(9);
                    return arrayList;
                case 10:
                case 11:
                    arrayList.add(10);
                    return arrayList;
                default:
                    switch (i) {
                        case UpdateDialogStatusCode.DISMISS:
                            arrayList.add(Integer.valueOf((int) UpdateDialogStatusCode.DISMISS));
                            return arrayList;
                        case UpdateDialogStatusCode.SHOW:
                            arrayList.add(10003);
                            return arrayList;
                        case 10003:
                            arrayList.add(10004);
                            return arrayList;
                        case 10004:
                            arrayList.add(10005);
                            return arrayList;
                        case 10005:
                            arrayList.add(10006);
                            return arrayList;
                        case 10006:
                            arrayList.add(10010);
                            return arrayList;
                        default:
                            return arrayList;
                    }
            }
        } else {
            arrayList.add(20002);
            return arrayList;
        }
    }
}
