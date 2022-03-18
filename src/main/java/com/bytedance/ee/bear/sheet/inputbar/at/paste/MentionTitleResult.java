package com.bytedance.ee.bear.sheet.inputbar.at.paste;

import com.bytedance.ee.bear.contract.NetService;
import java.io.Serializable;

public class MentionTitleResult extends NetService.Result<MentionData> {

    public static class MentionData implements Serializable {
        public String icon_fsunit;
        public String icon_key;
        public int icon_type;
        public String title;
        public int type;
        public String url;
    }
}
