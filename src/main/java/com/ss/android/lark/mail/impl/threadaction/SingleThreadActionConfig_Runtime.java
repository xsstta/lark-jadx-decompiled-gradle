package com.ss.android.lark.mail.impl.threadaction;

import android.text.TextUtils;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.threadaction.config.SingleThreadActionConfig;
import java.util.ArrayList;
import java.util.HashMap;

public class SingleThreadActionConfig_Runtime extends SingleThreadActionConfig {
    private HashMap labelConfigMap = new HashMap();

    public SingleThreadActionConfig_Runtime() {
        init(getSceneConfig(), getDefaultConfig());
    }

    private ThreadActionConfig getDefaultConfig() {
        ArrayList<String> arrayList = new ArrayList<>();
        addActionDueToFG(arrayList, "MOVE_TO_INBOX");
        addActionDueToFG(arrayList, "MOVE_TO_TRASH");
        addActionDueToFG(arrayList, "MARK_AS_UNREAD");
        ArrayList<String> arrayList2 = new ArrayList<>();
        addActionDueToFG(arrayList2, "MOVE_TO_FOLDER");
        addActionDueToFG(arrayList2, "CHANGE_LABEL");
        addActionDueToFG(arrayList2, "MARK_AS_SPAM");
        addActionDueToFG(arrayList2, "READMAIL_SEARCH");
        return new ThreadActionConfig(arrayList, arrayList2);
    }

    private HashMap<String, ThreadActionConfig> getSceneConfig() {
        ArrayList<String> arrayList = new ArrayList<>();
        addActionDueToFG(arrayList, "ARCHIVE");
        addActionDueToFG(arrayList, "MOVE_TO_TRASH");
        addActionDueToFG(arrayList, "MARK_AS_UNREAD");
        ArrayList<String> arrayList2 = new ArrayList<>();
        addActionDueToFG(arrayList2, "MOVE_TO_FOLDER");
        addActionDueToFG(arrayList2, "MOVE_TO_LABEL");
        addActionDueToFG(arrayList2, "CHANGE_LABEL");
        addActionDueToFG(arrayList2, "MARK_AS_SPAM");
        addActionDueToFG(arrayList2, "READMAIL_SEARCH");
        this.labelConfigMap.put("INBOX", new ThreadActionConfig(arrayList, arrayList2));
        ArrayList<String> arrayList3 = new ArrayList<>();
        addActionDueToFG(arrayList3, "ARCHIVE");
        addActionDueToFG(arrayList3, "MOVE_TO_TRASH");
        addActionDueToFG(arrayList3, "MARK_AS_UNREAD");
        ArrayList<String> arrayList4 = new ArrayList<>();
        addActionDueToFG(arrayList4, "MOVE_TO_OTHER");
        addActionDueToFG(arrayList4, "MOVE_TO_FOLDER");
        addActionDueToFG(arrayList4, "MOVE_TO_LABEL");
        addActionDueToFG(arrayList4, "CHANGE_LABEL");
        addActionDueToFG(arrayList4, "MARK_AS_SPAM");
        addActionDueToFG(arrayList4, "READMAIL_SEARCH");
        this.labelConfigMap.put("IMPORTANT", new ThreadActionConfig(arrayList3, arrayList4));
        ArrayList<String> arrayList5 = new ArrayList<>();
        addActionDueToFG(arrayList5, "ARCHIVE");
        addActionDueToFG(arrayList5, "MOVE_TO_TRASH");
        addActionDueToFG(arrayList5, "MARK_AS_UNREAD");
        ArrayList<String> arrayList6 = new ArrayList<>();
        addActionDueToFG(arrayList6, "MOVE_TO_IMPORTANT");
        addActionDueToFG(arrayList6, "MOVE_TO_FOLDER");
        addActionDueToFG(arrayList6, "MOVE_TO_LABEL");
        addActionDueToFG(arrayList6, "CHANGE_LABEL");
        addActionDueToFG(arrayList6, "MARK_AS_SPAM");
        addActionDueToFG(arrayList6, "READMAIL_SEARCH");
        this.labelConfigMap.put("OTHER", new ThreadActionConfig(arrayList5, arrayList6));
        ArrayList<String> arrayList7 = new ArrayList<>();
        addActionDueToFG(arrayList7, "MARK_AS_UNREAD");
        addActionDueToFG(arrayList7, "READMAIL_SEARCH");
        this.labelConfigMap.put("SHARE", new ThreadActionConfig(arrayList7, new ArrayList()));
        ArrayList<String> arrayList8 = new ArrayList<>();
        addActionDueToFG(arrayList8, "MARK_AS_UNREAD");
        addActionDueToFG(arrayList8, "CHANGE_LABEL");
        this.labelConfigMap.put("DRAFT", new ThreadActionConfig(arrayList8, new ArrayList()));
        ArrayList<String> arrayList9 = new ArrayList<>();
        addActionDueToFG(arrayList9, "MOVE_TO_TRASH");
        addActionDueToFG(arrayList9, "MARK_AS_UNREAD");
        ArrayList<String> arrayList10 = new ArrayList<>();
        addActionDueToFG(arrayList10, "MOVE_TO_FOLDER");
        addActionDueToFG(arrayList10, "MOVE_TO_LABEL");
        addActionDueToFG(arrayList10, "CHANGE_LABEL");
        addActionDueToFG(arrayList10, "READMAIL_SEARCH");
        this.labelConfigMap.put("SENT", new ThreadActionConfig(arrayList9, arrayList10));
        ArrayList<String> arrayList11 = new ArrayList<>();
        addActionDueToFG(arrayList11, "MOVE_TO_INBOX");
        addActionDueToFG(arrayList11, "MOVE_TO_TRASH");
        addActionDueToFG(arrayList11, "MARK_AS_UNREAD");
        ArrayList<String> arrayList12 = new ArrayList<>();
        addActionDueToFG(arrayList12, "MOVE_TO_FOLDER");
        addActionDueToFG(arrayList12, "MOVE_TO_LABEL");
        addActionDueToFG(arrayList12, "CHANGE_LABEL");
        addActionDueToFG(arrayList12, "MARK_AS_SPAM");
        addActionDueToFG(arrayList12, "READMAIL_SEARCH");
        this.labelConfigMap.put("ARCHIVED", new ThreadActionConfig(arrayList11, arrayList12));
        ArrayList<String> arrayList13 = new ArrayList<>();
        addActionDueToFG(arrayList13, "MOVE_TO_INBOX");
        addActionDueToFG(arrayList13, "DELETE_PERMANENTLY");
        addActionDueToFG(arrayList13, "MARK_AS_UNREAD");
        ArrayList<String> arrayList14 = new ArrayList<>();
        addActionDueToFG(arrayList14, "MOVE_TO_FOLDER");
        addActionDueToFG(arrayList14, "MOVE_TO_LABEL");
        addActionDueToFG(arrayList14, "CHANGE_LABEL");
        addActionDueToFG(arrayList14, "READMAIL_SEARCH");
        this.labelConfigMap.put("TRASH", new ThreadActionConfig(arrayList13, arrayList14));
        ArrayList<String> arrayList15 = new ArrayList<>();
        addActionDueToFG(arrayList15, "MARK_AS_NOT_SPAM");
        addActionDueToFG(arrayList15, "DELETE_PERMANENTLY");
        addActionDueToFG(arrayList15, "MARK_AS_UNREAD");
        ArrayList<String> arrayList16 = new ArrayList<>();
        addActionDueToFG(arrayList16, "MOVE_TO_FOLDER");
        addActionDueToFG(arrayList16, "MOVE_TO_LABEL");
        addActionDueToFG(arrayList16, "CHANGE_LABEL");
        addActionDueToFG(arrayList16, "READMAIL_SEARCH");
        this.labelConfigMap.put("SPAM", new ThreadActionConfig(arrayList15, arrayList16));
        ArrayList<String> arrayList17 = new ArrayList<>();
        addActionDueToFG(arrayList17, "MOVE_TO_TRASH");
        addActionDueToFG(arrayList17, "MARK_AS_UNREAD");
        ArrayList<String> arrayList18 = new ArrayList<>();
        addActionDueToFG(arrayList18, "CANCEL_SCHEDULE_SEND");
        addActionDueToFG(arrayList18, "MOVE_TO_LABEL");
        addActionDueToFG(arrayList18, "CHANGE_LABEL");
        addActionDueToFG(arrayList18, "READMAIL_SEARCH");
        this.labelConfigMap.put("SCHEDULED", new ThreadActionConfig(arrayList17, arrayList18));
        this.labelConfigMap.put("EML", new ThreadActionConfig(new ArrayList(), new ArrayList()));
        return this.labelConfigMap;
    }

    private void addActionDueToFG(ArrayList<String> arrayList, String str) {
        String threadActionFG = ThreadActionFGConfigurator.getThreadActionFG(str);
        if (TextUtils.isEmpty(threadActionFG)) {
            arrayList.add(str);
        } else if (C41816b.m166115a().mo150154u().mo150160a(threadActionFG)) {
            arrayList.add(str);
        }
    }
}
