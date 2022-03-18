package com.ss.android.lark.mail.impl.threadaction.config;

import android.text.TextUtils;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.entity.MailLabelEntity;
import com.ss.android.lark.mail.impl.entity.MailThread;
import com.ss.android.lark.mail.impl.service.C43374f;
import com.ss.android.lark.mail.impl.threadaction.ThreadActionConfig;
import com.ss.android.lark.mail.impl.threadaction.ThreadActionConfigurator;
import com.ss.android.lark.mail.impl.threadaction.ThreadActionUtil;
import com.ss.android.lark.mail.impl.utils.C43769k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MultiThreadActionConfig extends ThreadActionConfigurator.Processor {
    private final String TAG = "MultiThreadActionConfig";
    final String archiveLabelID = "ARCHIVED";
    final String defaultLabel;
    final String draftLabelID = "DRAFT";
    final String importantLabelID = "IMPORTANT";
    final String inboxLabelID = "INBOX";
    final String otherLabelID = "OTHER";
    final String scheduleLabelID = "SCHEDULED";
    final String sentLabelID = "SENT";
    final String spamLabelID = "SPAM";
    final String trashLabelID = "TRASH";

    private void processMultiThreadSentConfig(ThreadActionConfig threadActionConfig, List<MailThread> list) {
        if (ThreadActionUtil.containsOtherSender(list)) {
            threadActionConfig.getPanelActionList().add("MARK_AS_SPAM");
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("INBOX");
        arrayList.add("ARCHIVED");
        if (C43769k.m173495a(C43769k.m173498a(arrayList, list)) == 2) {
            threadActionConfig.getBarActionList().add(0, "MOVE_TO_INBOX");
        }
        threadActionConfig.getBarActionList().add(0, "ARCHIVE");
    }

    private void filterReadAction(ThreadActionConfig threadActionConfig, List<MailThread> list) {
        if (threadActionConfig == null) {
            Log.m165383e("MultiThreadActionConfig", "filterReadAction null config");
            return;
        }
        ArrayList<String> barActionList = threadActionConfig.getBarActionList();
        if (CollectionUtils.isEmpty(barActionList)) {
            Log.m165389i("MultiThreadActionConfig", "filterReadAction empty list");
            return;
        }
        int i = -1;
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= barActionList.size()) {
                break;
            } else if ("MARK_AS_READ".equals(barActionList.get(i2))) {
                i = i2;
                break;
            } else {
                i2++;
            }
        }
        if (i < 0) {
            Log.m165389i("MultiThreadActionConfig", "filterReadAction no read action");
            return;
        }
        Iterator<MailThread> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            MailThread next = it.next();
            if (next != null && !next.mo151716k()) {
                z = true;
                break;
            }
        }
        if (!z) {
            barActionList.set(i, "MARK_AS_UNREAD");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0032, code lost:
        if (r4 != 3) goto L_0x0048;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.ss.android.lark.mail.impl.threadaction.ThreadActionConfig processMultiThreadDefaultConfig(java.lang.String r4, java.util.List<com.ss.android.lark.mail.impl.entity.MailThread> r5) {
        /*
            r3 = this;
            com.ss.android.lark.mail.impl.threadaction.ThreadActionConfig r0 = r3.defaultConfig
            com.ss.android.lark.mail.impl.threadaction.ThreadActionConfig r0 = r0.clone()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r2 = "INBOX"
            r1.add(r2)
            java.lang.String r2 = "ARCHIVED"
            r1.add(r2)
            java.lang.String r2 = "SEARCH"
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L_0x0022
            java.util.Map r4 = com.ss.android.lark.mail.impl.threadaction.ThreadActionUtil.containsLabelsForSearchResult(r1, r5)
            goto L_0x0026
        L_0x0022:
            java.util.Map r4 = com.ss.android.lark.mail.impl.utils.C43769k.m173498a(r1, r5)
        L_0x0026:
            byte r4 = com.ss.android.lark.mail.impl.utils.C43769k.m173495a(r4)
            r5 = 1
            r1 = 0
            if (r4 == r5) goto L_0x003f
            r5 = 2
            if (r4 == r5) goto L_0x0035
            r5 = 3
            if (r4 == r5) goto L_0x003f
            goto L_0x0048
        L_0x0035:
            java.util.ArrayList r4 = r0.getBarActionList()
            java.lang.String r5 = "MOVE_TO_INBOX"
            r4.add(r1, r5)
            goto L_0x0048
        L_0x003f:
            java.util.ArrayList r4 = r0.getBarActionList()
            java.lang.String r5 = "ARCHIVE"
            r4.add(r1, r5)
        L_0x0048:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.threadaction.config.MultiThreadActionConfig.processMultiThreadDefaultConfig(java.lang.String, java.util.List):com.ss.android.lark.mail.impl.threadaction.ThreadActionConfig");
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.threadaction.ThreadActionConfigurator.Processor
    public ThreadActionConfig process(ThreadActionConfig threadActionConfig, String str, Object... objArr) {
        ThreadActionConfig threadActionConfig2;
        Log.m165389i("MultiThreadActionConfig", "process");
        List<MailThread> list = (List) objArr[0];
        if (threadActionConfig == null) {
            threadActionConfig2 = null;
        } else {
            threadActionConfig2 = threadActionConfig.clone();
        }
        MailLabelEntity c = C43374f.m172264f().mo155117c(str);
        if (c != null && c.mo151494a() == 2) {
            threadActionConfig2 = new ThreadActionConfig(new ArrayList(), new ArrayList());
            threadActionConfig2.getBarActionList().add("ARCHIVE");
            threadActionConfig2.getBarActionList().add("MOVE_TO_TRASH");
            threadActionConfig2.getBarActionList().add("MARK_AS_READ");
            threadActionConfig2.getPanelActionList().add("MOVE_TO_FOLDER");
            threadActionConfig2.getPanelActionList().add("MOVE_TO_LABEL");
            threadActionConfig2.getPanelActionList().add("CHANGE_LABEL");
            threadActionConfig2.getPanelActionList().add("MARK_AS_SPAM");
        }
        if (threadActionConfig2 == null) {
            threadActionConfig2 = processMultiThreadDefaultConfig(str, list);
        } else if (!TextUtils.isEmpty(str)) {
            str.hashCode();
            if (!str.equals("SENT")) {
                Log.m165389i("MultiThreadActionConfig", "getButtons multi thread no need to process");
            } else {
                processMultiThreadSentConfig(threadActionConfig2, list);
            }
        }
        filterReadAction(threadActionConfig2, list);
        if (threadActionConfig2 == null || !C43374f.m172264f().mo155125m()) {
            threadActionConfig2.getBarActionList().remove("MOVE_TO_FOLDER");
            threadActionConfig2.getPanelActionList().remove("MOVE_TO_FOLDER");
        } else {
            threadActionConfig2.getBarActionList().remove("MOVE_TO_LABEL");
            threadActionConfig2.getPanelActionList().remove("MOVE_TO_LABEL");
        }
        return threadActionConfig2;
    }
}
