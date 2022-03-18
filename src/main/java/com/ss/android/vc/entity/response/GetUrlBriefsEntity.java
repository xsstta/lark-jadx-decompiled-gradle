package com.ss.android.vc.entity.response;

import com.ss.android.vc.entity.UrlBrief;
import java.io.Serializable;
import java.util.Map;

public class GetUrlBriefsEntity implements Serializable {
    public Map<String, UrlBrief> urlBriefs;
}
