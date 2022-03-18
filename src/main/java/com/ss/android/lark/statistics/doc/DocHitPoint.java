package com.ss.android.lark.statistics.doc;

import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.base.BaseHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u00012\u00020\u0002:\u0001\u0004B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/statistics/doc/DocHitPoint;", "Lcom/ss/android/lark/statistics/base/BaseHitPoint;", "Lcom/ss/android/lark/statistics/base/IHitPoint;", "()V", "Companion", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.statistics.e.a */
public final class DocHitPoint extends BaseHitPoint {

    /* renamed from: a */
    public static final Companion f135699a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/statistics/doc/DocHitPoint$Companion;", "", "()V", "docsSend", "", "sendDocMessageRecall", "sendDocSync", "viewCount", "", "editCount", "sendDocsChangeShare", "edit", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.statistics.e.a$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final void mo187453a() {
            Statistics.sendEvent("docs_recall");
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo187454a(int i, int i2) {
            int i3 = 1;
            if (1 <= i) {
                int i4 = 1;
                while (true) {
                    Statistics.sendEvent("docs_sync", new JSONObject().put("share", "view"));
                    if (i4 == i) {
                        break;
                    }
                    i4++;
                }
            }
            if (1 <= i2) {
                while (true) {
                    Statistics.sendEvent("docs_sync", new JSONObject().put("share", "edit"));
                    if (i3 != i2) {
                        i3++;
                    } else {
                        return;
                    }
                }
            }
        }
    }
}
