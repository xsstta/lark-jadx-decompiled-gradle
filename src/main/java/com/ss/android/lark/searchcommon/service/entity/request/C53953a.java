package com.ss.android.lark.searchcommon.service.entity.request;

import com.bytedance.lark.pb.search.v1.LocalIntegrationSearchRequest;
import com.bytedance.lark.pb.search.v2.BaseEnum;
import com.bytedance.lark.pb.search.v2.UniformLocalSearchRequest;
import com.ss.android.lark.searchcommon.dto.Scene;

/* renamed from: com.ss.android.lark.searchcommon.service.entity.request.a */
public class C53953a {

    /* renamed from: a */
    public final String f133366a;

    /* renamed from: b */
    public final Scene.Type f133367b;

    /* renamed from: c */
    public final int f133368c;

    /* renamed from: d */
    public final int f133369d;

    /* renamed from: e */
    public final LocalIntegrationSearchRequest.FilterParam f133370e;

    /* renamed from: f */
    public final UniformLocalSearchRequest.ChatFilterParam f133371f;

    /* renamed from: g */
    public final UniformLocalSearchRequest.ChatterFilterParam f133372g;

    /* renamed from: h */
    public final UniformLocalSearchRequest.MessageFilterParam f133373h;

    /* renamed from: i */
    public final BaseEnum.LocalAbility f133374i;

    /* renamed from: j */
    public final String f133375j;

    /* renamed from: a */
    public static C53955a m209208a() {
        return new C53955a();
    }

    /* renamed from: com.ss.android.lark.searchcommon.service.entity.request.a$a */
    public static final class C53955a {

        /* renamed from: a */
        public String f133376a;

        /* renamed from: b */
        public Scene.Type f133377b;

        /* renamed from: c */
        public int f133378c;

        /* renamed from: d */
        public int f133379d;

        /* renamed from: e */
        public LocalIntegrationSearchRequest.FilterParam f133380e;

        /* renamed from: f */
        public UniformLocalSearchRequest.ChatFilterParam f133381f;

        /* renamed from: g */
        public UniformLocalSearchRequest.ChatterFilterParam f133382g;

        /* renamed from: h */
        public UniformLocalSearchRequest.MessageFilterParam f133383h;

        /* renamed from: i */
        public BaseEnum.LocalAbility f133384i;

        /* renamed from: j */
        public String f133385j;

        private C53955a() {
            this.f133376a = "";
            this.f133377b = Scene.Type.UNKNOWN;
        }

        /* renamed from: a */
        public C53953a mo184552a() {
            return new C53953a(this);
        }

        /* renamed from: a */
        public C53955a mo184544a(int i) {
            this.f133378c = i;
            return this;
        }

        /* renamed from: b */
        public C53955a mo184553b(int i) {
            this.f133379d = i;
            return this;
        }

        /* renamed from: a */
        public C53955a mo184545a(LocalIntegrationSearchRequest.FilterParam filterParam) {
            this.f133380e = filterParam;
            return this;
        }

        /* renamed from: b */
        public C53955a mo184554b(String str) {
            this.f133385j = str;
            return this;
        }

        /* renamed from: a */
        public C53955a mo184546a(BaseEnum.LocalAbility localAbility) {
            this.f133384i = localAbility;
            return this;
        }

        /* renamed from: a */
        public C53955a mo184547a(UniformLocalSearchRequest.ChatFilterParam chatFilterParam) {
            this.f133381f = chatFilterParam;
            return this;
        }

        /* renamed from: a */
        public C53955a mo184548a(UniformLocalSearchRequest.ChatterFilterParam chatterFilterParam) {
            this.f133382g = chatterFilterParam;
            return this;
        }

        /* renamed from: a */
        public C53955a mo184549a(UniformLocalSearchRequest.MessageFilterParam messageFilterParam) {
            this.f133383h = messageFilterParam;
            return this;
        }

        /* renamed from: a */
        public C53955a mo184550a(Scene.Type type) {
            this.f133377b = type;
            return this;
        }

        /* renamed from: a */
        public C53955a mo184551a(String str) {
            this.f133376a = str;
            return this;
        }
    }

    private C53953a(C53955a aVar) {
        this.f133366a = aVar.f133376a;
        this.f133367b = aVar.f133377b;
        this.f133368c = aVar.f133378c;
        this.f133369d = aVar.f133379d;
        this.f133370e = aVar.f133380e;
        this.f133371f = aVar.f133381f;
        this.f133372g = aVar.f133382g;
        this.f133373h = aVar.f133383h;
        this.f133374i = aVar.f133384i;
        this.f133375j = aVar.f133385j;
    }
}
