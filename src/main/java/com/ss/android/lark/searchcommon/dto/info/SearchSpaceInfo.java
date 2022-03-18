package com.ss.android.lark.searchcommon.dto.info;

import com.bytedance.lark.pb.search.v1.WikiInfo;
import com.ss.android.lark.doc.entity.DocType;

public class SearchSpaceInfo extends SearchBaseInfo {
    private static final long serialVersionUID = 5052389139562361195L;
    private String chatId;
    private DocType docType;
    private String docUrl;
    private String editUserName;
    private long lastOpenTime;
    private String messageId;
    private String ownerId;
    private String ownerName;
    private int position;
    private String threadId;
    private int threadPosition;
    private long updateTime;
    private WikiInfo wikiInfo;

    public String getChatId() {
        return this.chatId;
    }

    public DocType getDocType() {
        return this.docType;
    }

    public String getDocUrl() {
        return this.docUrl;
    }

    public String getEditUserName() {
        return this.editUserName;
    }

    public long getLastOpenTime() {
        return this.lastOpenTime;
    }

    public String getMessageId() {
        return this.messageId;
    }

    public String getOwnerId() {
        return this.ownerId;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public int getPosition() {
        return this.position;
    }

    public String getThreadId() {
        return this.threadId;
    }

    public int getThreadPosition() {
        return this.threadPosition;
    }

    public long getUpdateTime() {
        return this.updateTime;
    }

    public WikiInfo getWikiInfo() {
        return this.wikiInfo;
    }

    public SearchSpaceInfo() {
        this.type = 6;
    }

    @Override // com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo
    public String getResultTypeForReport() {
        switch (C538961.f133190a[this.docType.ordinal()]) {
            case 1:
                return "doc";
            case 2:
                return "sheet";
            case 3:
                return "bitable";
            case 4:
                return "mindnote";
            case 5:
                return "file";
            case 6:
                return "slide";
            case 7:
                return "wiki";
            case 8:
                return "docx";
            default:
                return "docs_unknown";
        }
    }

    /* renamed from: com.ss.android.lark.searchcommon.dto.info.SearchSpaceInfo$1 */
    static /* synthetic */ class C538961 {

        /* renamed from: a */
        static final /* synthetic */ int[] f133190a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.ss.android.lark.doc.entity.DocType[] r0 = com.ss.android.lark.doc.entity.DocType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.searchcommon.dto.info.SearchSpaceInfo.C538961.f133190a = r0
                com.ss.android.lark.doc.entity.DocType r1 = com.ss.android.lark.doc.entity.DocType.DOC     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.searchcommon.dto.info.SearchSpaceInfo.C538961.f133190a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.doc.entity.DocType r1 = com.ss.android.lark.doc.entity.DocType.SHEET     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.searchcommon.dto.info.SearchSpaceInfo.C538961.f133190a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.doc.entity.DocType r1 = com.ss.android.lark.doc.entity.DocType.BITABLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.lark.searchcommon.dto.info.SearchSpaceInfo.C538961.f133190a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.lark.doc.entity.DocType r1 = com.ss.android.lark.doc.entity.DocType.MINDNOTE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.ss.android.lark.searchcommon.dto.info.SearchSpaceInfo.C538961.f133190a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.ss.android.lark.doc.entity.DocType r1 = com.ss.android.lark.doc.entity.DocType.FILE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = com.ss.android.lark.searchcommon.dto.info.SearchSpaceInfo.C538961.f133190a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.ss.android.lark.doc.entity.DocType r1 = com.ss.android.lark.doc.entity.DocType.SLIDE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = com.ss.android.lark.searchcommon.dto.info.SearchSpaceInfo.C538961.f133190a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.ss.android.lark.doc.entity.DocType r1 = com.ss.android.lark.doc.entity.DocType.WIKI     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = com.ss.android.lark.searchcommon.dto.info.SearchSpaceInfo.C538961.f133190a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.ss.android.lark.doc.entity.DocType r1 = com.ss.android.lark.doc.entity.DocType.DOCX     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.searchcommon.dto.info.SearchSpaceInfo.C538961.<clinit>():void");
        }
    }

    public void setChatId(String str) {
        this.chatId = str;
    }

    public void setDocType(DocType docType2) {
        this.docType = docType2;
    }

    public void setDocUrl(String str) {
        this.docUrl = str;
    }

    public void setEditUserName(String str) {
        this.editUserName = str;
    }

    public void setLastOpenTime(long j) {
        this.lastOpenTime = j;
    }

    public void setMessageId(String str) {
        this.messageId = str;
    }

    public void setOwnerId(String str) {
        this.ownerId = str;
    }

    public void setOwnerName(String str) {
        this.ownerName = str;
    }

    public void setPosition(int i) {
        this.position = i;
    }

    public void setThreadId(String str) {
        this.threadId = str;
    }

    public void setThreadPosition(int i) {
        this.threadPosition = i;
    }

    public void setUpdateTime(long j) {
        this.updateTime = j;
    }

    public void setWikiInfo(WikiInfo wikiInfo2) {
        this.wikiInfo = wikiInfo2;
    }
}
