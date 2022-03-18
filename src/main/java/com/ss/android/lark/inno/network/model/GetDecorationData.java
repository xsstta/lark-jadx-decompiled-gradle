package com.ss.android.lark.inno.network.model;

import com.larksuite.suite.R;
import com.ss.android.lark.inno.network.VcLiveResponse;
import java.io.Serializable;

public final class GetDecorationData implements Serializable {
    public int theme_color;

    public static class GetDecorationResp extends VcLiveResponse<GetDecorationData> implements Serializable {
    }

    private GetDecorationData() {
    }

    public int getTitleBackgroundColor() {
        int i = this.theme_color;
        if (i == 2) {
            return R.color.live_titlebar_bg_dark;
        }
        if (i == 1) {
            return R.color.live_titlebar_bg_light;
        }
        return R.color.bg_body;
    }

    public int getTitleColor() {
        int i = this.theme_color;
        if (i == 2) {
            return R.color.live_titlebar_text_dark;
        }
        if (i == 1) {
            return R.color.live_titlebar_text_light;
        }
        return R.color.text_title;
    }
}
