package com.ss.android.lark.mail.impl.threadaction.config;

import android.text.TextUtils;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.entity.C42104p;
import com.ss.android.lark.mail.impl.entity.MailLabelEntity;
import com.ss.android.lark.mail.impl.service.C43374f;
import com.ss.android.lark.mail.impl.threadaction.ThreadActionConfig;
import com.ss.android.lark.mail.impl.threadaction.ThreadActionConfigurator;
import com.ss.android.lark.mail.impl.utils.C43769k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SingleThreadActionConfig extends ThreadActionConfigurator.Processor {
    private final String TAG = "SingleThreadActionConfig";
    final String archiveLabelID = "ARCHIVED";
    final String defaultLabel;
    final String draftLabelID = "DRAFT";
    final String emlLabelID = "EML";
    final String importantLabelID = "IMPORTANT";
    final String inboxLabelID = "INBOX";
    final String otherLabelID = "OTHER";
    final String scheduledLabelID = "SCHEDULED";
    final String sentLabelID = "SENT";
    final String shareLabelID = "SHARE";
    final String spamLabelID = "SPAM";
    final String trashLabelID = "TRASH";

    private ThreadActionConfig processSingleThreadDefaultConfig(List<MailLabelEntity> list, boolean z) {
        HashMap<String, MailLabelEntity> a = C43769k.m173497a(list);
        if (CollectionUtils.isEmpty(a)) {
            Log.m165383e("SingleThreadActionConfig", "processSingleThreadDefaultConfig null map");
            return this.defaultConfig.clone();
        } else if (a.containsKey("INBOX")) {
            return ((ThreadActionConfig) this.originalConfigMap.get("INBOX")).clone();
        } else {
            if (a.containsKey("ARCHIVED")) {
                return ((ThreadActionConfig) this.originalConfigMap.get("ARCHIVED")).clone();
            }
            if (a.containsKey("SENT") && !z) {
                return ((ThreadActionConfig) this.originalConfigMap.get("SENT")).clone();
            }
            Log.m165383e("SingleThreadActionConfig", "getConfig exceptional config");
            return this.defaultConfig.clone();
        }
    }

    private void processSingleThreadSentConfig(ThreadActionConfig threadActionConfig, List<MailLabelEntity> list, boolean z) {
        Log.m165389i("SingleThreadActionConfig", "processSingleThreadSentConfig");
        if (z) {
            threadActionConfig.getPanelActionList().add("MARK_AS_SPAM");
        }
        if (C43769k.m173499b(list) == 2) {
            threadActionConfig.getBarActionList().add(0, "MOVE_TO_INBOX");
        }
        threadActionConfig.getBarActionList().add(0, "ARCHIVE");
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.threadaction.ThreadActionConfigurator.Processor
    public ThreadActionConfig process(ThreadActionConfig threadActionConfig, String str, Object... objArr) {
        ThreadActionConfig threadActionConfig2;
        Log.m165389i("SingleThreadActionConfig", "process");
        List<MailLabelEntity> list = (List) objArr[0];
        C42104p pVar = (C42104p) objArr[1];
        boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
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
            threadActionConfig2.getBarActionList().add("MARK_AS_UNREAD");
            threadActionConfig2.getPanelActionList().add("MOVE_TO_FOLDER");
            threadActionConfig2.getPanelActionList().add("MOVE_TO_LABEL");
            threadActionConfig2.getPanelActionList().add("CHANGE_LABEL");
            threadActionConfig2.getPanelActionList().add("MARK_AS_SPAM");
            threadActionConfig2.getPanelActionList().add("READMAIL_SEARCH");
        }
        if (threadActionConfig2 == null) {
            threadActionConfig2 = processSingleThreadDefaultConfig(list, booleanValue);
        } else if (!TextUtils.isEmpty(str)) {
            str.hashCode();
            if (!str.equals("SENT")) {
                Log.m165389i("SingleThreadActionConfig", "getButtons single thread no need to process");
            } else {
                processSingleThreadSentConfig(threadActionConfig2, list, booleanValue);
            }
        }
        if (pVar != null && pVar.mo152026h() == 0) {
            threadActionConfig2.getBarActionList().remove("CANCEL_SCHEDULE_SEND");
            threadActionConfig2.getPanelActionList().remove("CANCEL_SCHEDULE_SEND");
        }
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
