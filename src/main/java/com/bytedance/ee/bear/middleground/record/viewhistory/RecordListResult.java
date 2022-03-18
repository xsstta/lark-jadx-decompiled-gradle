package com.bytedance.ee.bear.middleground.record.viewhistory;

import com.bytedance.ee.bear.contract.NetService;
import java.util.List;

public class RecordListResult extends NetService.Result {
    public String nextPageToken;
    public List<C10143a> users;
    public int uv;
    public int uvHidden;

    /* renamed from: com.bytedance.ee.bear.middleground.record.viewhistory.RecordListResult$a */
    public static class C10143a {

        /* renamed from: a */
        public String f27380a;

        /* renamed from: b */
        public String f27381b;

        /* renamed from: c */
        public String f27382c;

        /* renamed from: d */
        public String f27383d;

        /* renamed from: e */
        public String f27384e;

        /* renamed from: f */
        public String f27385f;

        /* renamed from: g */
        public String f27386g;

        /* renamed from: h */
        public long f27387h;

        /* renamed from: i */
        public int f27388i;

        /* renamed from: j */
        public boolean f27389j;

        /* renamed from: k */
        public boolean f27390k;
    }
}
