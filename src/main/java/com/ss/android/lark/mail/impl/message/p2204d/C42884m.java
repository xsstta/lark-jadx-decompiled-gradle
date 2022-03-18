package com.ss.android.lark.mail.impl.message.p2204d;

import android.text.TextUtils;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.entity.MailLabelEntity;
import com.ss.android.lark.mail.impl.entity.MailThread;
import com.ss.android.lark.mail.impl.message.p2203c.C42844a;
import com.ss.android.lark.mail.impl.message.pageroute.C42942a;
import com.ss.android.lark.mail.impl.message.pageroute.intantinfo.MessageListIntenInfo;
import com.ss.android.lark.mail.impl.service.C43374f;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.message.d.m */
public class C42884m extends C42851b {
    protected C42884m() {
    }

    /* renamed from: a */
    public void mo153890a(final List<MailThread> list) {
        final MailLabelEntity r = C43374f.m172264f().mo155130r();
        Log.m165389i("UnReadDataPreLoader", "testAsynRender startPreLoad");
        if (r == null) {
            Log.m165389i("UnReadDataPreLoader", "testAsynRender currentLabel == null return");
        } else if (this.f109093b.equals(r.mo151527k())) {
            Log.m165389i("UnReadDataPreLoader", " testAsynRender last label return mCurrentLabelID:" + this.f109093b + " currentLabel.getId():" + r.mo151527k());
        } else if (CollectionUtils.isEmpty(list)) {
            Log.m165389i("UnReadDataPreLoader", "testAsynRender threadList null return");
        } else if (this.f109092a.size() >= 4) {
            Log.m165389i("UnReadDataPreLoader", "testAsynRender PRE_LOAD_COUNT return");
        } else {
            super.mo153817b();
            mo153810a();
            CoreThreadPool.getBackgroundHandler().post(new Runnable() {
                /* class com.ss.android.lark.mail.impl.message.p2204d.C42884m.RunnableC428851 */

                public void run() {
                    String str = C42884m.this.f109093b;
                    ArrayList<MailThread> arrayList = new ArrayList<>();
                    for (int i = 0; i < list.size(); i++) {
                        MailThread mailThread = (MailThread) list.get(i);
                        if (!mailThread.mo151716k()) {
                            arrayList.add(mailThread);
                            if (arrayList.size() >= 4) {
                                break;
                            }
                        }
                    }
                    C42884m.this.mo153889a(r, arrayList, str);
                }
            });
        }
    }

    /* renamed from: a */
    public void mo153889a(MailLabelEntity mailLabelEntity, ArrayList<MailThread> arrayList, String str) {
        String str2;
        int i;
        Log.m165389i("UnReadDataPreLoader", "testAsynRender doPreLoadData needPreLoadList:" + arrayList.size());
        if (arrayList.size() == 0) {
            this.f109093b = "";
            Log.m165389i("UnReadDataPreLoader", "testAsynRender doPreLoadData needPreLoadList size 0 return:");
            return;
        }
        if (mailLabelEntity != null) {
            str2 = mailLabelEntity.mo151527k();
        } else {
            str2 = null;
        }
        if ("SHARE".equals(str2) || "TRASH".equals(str2) || "SPAM".equals(str2) || "OUTBOX".equals(str2)) {
            i = 2;
        } else {
            i = 1;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            MailThread mailThread = arrayList.get(i2);
            if (mailThread instanceof MailThread) {
                MailThread mailThread2 = mailThread;
                MessageListIntenInfo messageListIntenInfo = new MessageListIntenInfo(str2, mailThread2.mo151676a(), "", i, mailThread2.mo151702e());
                messageListIntenInfo.mo154048a(false);
                messageListIntenInfo.mo154051c(mailThread2.mo151730x());
                arrayList2.add(messageListIntenInfo);
            }
        }
        Log.m165389i("UnReadDataPreLoader", "testAsynRender doPreLoadData messageListItemList:" + arrayList2.size());
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            MessageListIntenInfo messageListIntenInfo2 = (MessageListIntenInfo) arrayList2.get(i3);
            ArrayList<String> arrayList3 = new ArrayList<>();
            if (!TextUtils.isEmpty(messageListIntenInfo2.mo154055f())) {
                arrayList3.add(messageListIntenInfo2.mo154055f());
            }
            C42844a a = new C42942a().mo154040a(1).mo154011a();
            a.mo153781a((MessageListIntenInfo) arrayList2.get(i3));
            a.mo153779a(i3);
            mo153826j(messageListIntenInfo2.mo154050c());
            mo153815a(str, messageListIntenInfo2.mo154050c(), arrayList3, messageListIntenInfo2.mo154052d(), a, messageListIntenInfo2);
        }
    }
}
