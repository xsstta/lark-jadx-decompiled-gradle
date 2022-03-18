package com.bytedance.ee.bear.middleground.comment.input;

import com.bytedance.ee.bear.contract.NetService;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.Serializable;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001\u0004B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/middleground/comment/input/MentionTitleResult;", "Lcom/bytedance/ee/bear/contract/NetService$Result;", "Lcom/bytedance/ee/bear/middleground/comment/input/MentionTitleResult$MentionData;", "()V", "MentionData", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class MentionTitleResult extends NetService.Result<MentionData> {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\b¨\u0006\u001b"}, d2 = {"Lcom/bytedance/ee/bear/middleground/comment/input/MentionTitleResult$MentionData;", "Ljava/io/Serializable;", "()V", "icon_fsunit", "", "getIcon_fsunit", "()Ljava/lang/String;", "setIcon_fsunit", "(Ljava/lang/String;)V", "icon_key", "getIcon_key", "setIcon_key", "icon_type", "", "getIcon_type", "()I", "setIcon_type", "(I)V", "title", "getTitle", "setTitle", ShareHitPoint.f121869d, "getType", "setType", "url", "getUrl", "setUrl", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
    public static final class MentionData implements Serializable {
        private String icon_fsunit;
        private String icon_key;
        private int icon_type;
        private String title;
        private int type;
        private String url;

        public final String getIcon_fsunit() {
            return this.icon_fsunit;
        }

        public final String getIcon_key() {
            return this.icon_key;
        }

        public final int getIcon_type() {
            return this.icon_type;
        }

        public final String getTitle() {
            return this.title;
        }

        public final int getType() {
            return this.type;
        }

        public final String getUrl() {
            return this.url;
        }

        public final void setIcon_fsunit(String str) {
            this.icon_fsunit = str;
        }

        public final void setIcon_key(String str) {
            this.icon_key = str;
        }

        public final void setIcon_type(int i) {
            this.icon_type = i;
        }

        public final void setTitle(String str) {
            this.title = str;
        }

        public final void setType(int i) {
            this.type = i;
        }

        public final void setUrl(String str) {
            this.url = str;
        }
    }
}
