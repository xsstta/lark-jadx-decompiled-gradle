package com.bytedance.ee.bear.atfinder;

import com.bytedance.ee.bear.at.AtObject;
import com.bytedance.ee.util.io.NonProguard;
import java.io.Serializable;
import java.util.List;

public class AtFinderResult implements NonProguard, Serializable {
    public String keyword;
    public List<AtObject> list;
}
