package com.bytedance.ee.falcon.inspector.protocol.module;

import android.content.Context;
import com.bytedance.ee.falcon.inspector.json.JsonProperty;
import com.bytedance.ee.falcon.inspector.json.JsonValue;
import com.bytedance.ee.falcon.inspector.network.C12681k;
import com.bytedance.ee.falcon.inspector.network.C12685n;
import com.bytedance.ee.falcon.inspector.protocol.AbstractC12688a;
import com.bytedance.ee.falcon.inspector.protocol.module.Console;
import com.bytedance.ee.falcon.inspector.protocol.module.Page;
import java.util.List;
import org.json.JSONObject;

public class Network implements AbstractC12688a {

    /* renamed from: a */
    private final C12681k f33958a;

    /* renamed from: b */
    private final C12685n f33959b;

    /* renamed from: com.bytedance.ee.falcon.inspector.protocol.module.Network$a */
    public static class C12692a {
        @JsonProperty(required = true)

        /* renamed from: a */
        public String f33960a;
        @JsonProperty(required = true)

        /* renamed from: b */
        public double f33961b;
        @JsonProperty(required = true)

        /* renamed from: c */
        public int f33962c;
        @JsonProperty(required = true)

        /* renamed from: d */
        public int f33963d;
    }

    /* renamed from: com.bytedance.ee.falcon.inspector.protocol.module.Network$b */
    public static class C12693b {
        @JsonProperty(required = true)

        /* renamed from: a */
        public InitiatorType f33964a;
        @JsonProperty

        /* renamed from: b */
        public List<Console.C12689a> f33965b;
    }

    /* renamed from: com.bytedance.ee.falcon.inspector.protocol.module.Network$c */
    public static class C12694c {
        @JsonProperty(required = true)

        /* renamed from: a */
        public String f33966a;
        @JsonProperty(required = true)

        /* renamed from: b */
        public double f33967b;
        @JsonProperty(required = true)

        /* renamed from: c */
        public String f33968c;
        @JsonProperty

        /* renamed from: d */
        public Page.ResourceType f33969d;
    }

    /* renamed from: com.bytedance.ee.falcon.inspector.protocol.module.Network$d */
    public static class C12695d {
        @JsonProperty(required = true)

        /* renamed from: a */
        public String f33970a;
        @JsonProperty(required = true)

        /* renamed from: b */
        public double f33971b;
    }

    /* renamed from: com.bytedance.ee.falcon.inspector.protocol.module.Network$e */
    public static class C12696e {
        @JsonProperty(required = true)

        /* renamed from: a */
        public String f33972a;
        @JsonProperty(required = true)

        /* renamed from: b */
        public String f33973b;
        @JsonProperty(required = true)

        /* renamed from: c */
        public JSONObject f33974c;
        @JsonProperty

        /* renamed from: d */
        public String f33975d;
    }

    /* renamed from: com.bytedance.ee.falcon.inspector.protocol.module.Network$f */
    public static class C12697f {
        @JsonProperty(required = true)

        /* renamed from: a */
        public String f33976a;
        @JsonProperty(required = true)

        /* renamed from: b */
        public String f33977b;
        @JsonProperty(required = true)

        /* renamed from: c */
        public String f33978c;
        @JsonProperty(required = true)

        /* renamed from: d */
        public String f33979d;
        @JsonProperty(required = true)

        /* renamed from: e */
        public C12696e f33980e;
        @JsonProperty(required = true)

        /* renamed from: f */
        public double f33981f;
        @JsonProperty(required = true)

        /* renamed from: g */
        public C12693b f33982g;
        @JsonProperty

        /* renamed from: h */
        public C12698g f33983h;
        @JsonProperty

        /* renamed from: i */
        public Page.ResourceType f33984i;
    }

    /* renamed from: com.bytedance.ee.falcon.inspector.protocol.module.Network$g */
    public static class C12698g {
        @JsonProperty(required = true)

        /* renamed from: a */
        public String f33985a;
        @JsonProperty(required = true)

        /* renamed from: b */
        public int f33986b;
        @JsonProperty(required = true)

        /* renamed from: c */
        public String f33987c;
        @JsonProperty(required = true)

        /* renamed from: d */
        public JSONObject f33988d;
        @JsonProperty(required = true)

        /* renamed from: e */
        public String f33989e;
        @JsonProperty(required = true)

        /* renamed from: f */
        public boolean f33990f;
        @JsonProperty(required = true)

        /* renamed from: g */
        public int f33991g;
        @JsonProperty(required = true)

        /* renamed from: h */
        public Boolean f33992h;
    }

    /* renamed from: com.bytedance.ee.falcon.inspector.protocol.module.Network$h */
    public static class C12699h {
        @JsonProperty(required = true)

        /* renamed from: a */
        public String f33993a;
        @JsonProperty(required = true)

        /* renamed from: b */
        public String f33994b;
        @JsonProperty(required = true)

        /* renamed from: c */
        public String f33995c;
        @JsonProperty(required = true)

        /* renamed from: d */
        public double f33996d;
        @JsonProperty(required = true)

        /* renamed from: e */
        public Page.ResourceType f33997e;
        @JsonProperty(required = true)

        /* renamed from: f */
        public C12698g f33998f;
    }

    public enum InitiatorType {
        PARSER("parser"),
        SCRIPT("script"),
        OTHER("other");
        
        private final String mProtocolValue;

        @JsonValue
        public String getProtocolValue() {
            return this.mProtocolValue;
        }

        private InitiatorType(String str) {
            this.mProtocolValue = str;
        }
    }

    public Network(Context context) {
        C12681k a = C12681k.m52539a(context);
        this.f33958a = a;
        this.f33959b = a.mo48064c();
    }
}
