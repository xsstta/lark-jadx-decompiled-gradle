package com.bytedance.ee.bear.document.at;

import com.bytedance.ee.bear.at.AtObject;
import com.bytedance.ee.bear.atfinder.AtFinderResult;
import com.bytedance.ee.bear.contract.NetService;
import java.util.List;

public class AtFinderNetServiceResult extends NetService.Result {
    public String keyword;
    public List<AtObject> list;

    public static AtFinderResult convertTo(AtFinderNetServiceResult atFinderNetServiceResult) {
        AtFinderResult atFinderResult = new AtFinderResult();
        atFinderResult.keyword = atFinderNetServiceResult.keyword;
        atFinderResult.list = atFinderNetServiceResult.list;
        return atFinderResult;
    }
}
