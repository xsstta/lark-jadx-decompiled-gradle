package com.bytedance.ee.bear.bitable.card.view.cell.text;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.util.io.NonProguard;

public class MentionTitleResult extends NetService.Result<MentionData> {

    public static class MentionData implements NonProguard {
        public String icon_fsunit;
        public String icon_key;
        public int icon_type;
        public String title;
        public int type;
        public String url;
    }
}
