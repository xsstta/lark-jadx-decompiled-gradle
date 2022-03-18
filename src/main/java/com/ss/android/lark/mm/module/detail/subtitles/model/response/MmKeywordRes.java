package com.ss.android.lark.mm.module.detail.subtitles.model.response;

import com.ss.android.lark.mm.net.HttpMmResponse;
import java.io.Serializable;
import java.util.List;

public class MmKeywordRes implements Serializable {
    private List<String> keywords;

    public static class MmKeywordResp extends HttpMmResponse<MmKeywordRes> {
    }

    public List<String> getKeywords() {
        return this.keywords;
    }

    public void setKeywords(List<String> list) {
        this.keywords = list;
    }
}
