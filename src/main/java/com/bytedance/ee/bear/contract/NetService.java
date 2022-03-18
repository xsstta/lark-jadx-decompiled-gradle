package com.bytedance.ee.bear.contract;

import com.bytedance.ee.util.p700c.C13598b;
import io.reactivex.AbstractC68307f;
import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Request;
import okhttp3.Response;

public interface NetService {

    @Retention(RetentionPolicy.SOURCE)
    public @interface ENV_TYPE {
    }

    /* renamed from: com.bytedance.ee.bear.contract.NetService$a */
    public static class C5072a {

        /* renamed from: a */
        public String f14784a;

        /* renamed from: b */
        public String f14785b;

        /* renamed from: c */
        public String f14786c;
    }

    /* renamed from: com.bytedance.ee.bear.contract.NetService$b */
    public interface AbstractC5073b {
        /* renamed from: a */
        void mo20140a(Map<String, String> map);
    }

    /* renamed from: com.bytedance.ee.bear.contract.NetService$c */
    public interface AbstractC5074c<T extends Result> {
        T parse(String str) throws ParseException;
    }

    /* renamed from: com.bytedance.ee.bear.contract.NetService$d */
    public interface AbstractC5075d<R extends Result> {
        /* renamed from: a */
        AbstractC68307f<R> mo20141a(C5076e eVar);
    }

    /* renamed from: a */
    C5072a mo20116a();

    /* renamed from: a */
    <R extends Result> AbstractC5075d<R> mo20117a(AbstractC5074c<R> cVar);

    /* renamed from: a */
    <R extends Result> AbstractC5075d<R> mo20118a(Type type);

    /* renamed from: a */
    Call mo20119a(Request request, Callback callback);

    /* renamed from: a */
    Response mo20120a(Request request);

    /* renamed from: b */
    int mo20121b();

    /* renamed from: b */
    void mo20122b(Request request, Callback callback);

    /* renamed from: c */
    boolean mo20123c();

    /* renamed from: d */
    void mo20124d();

    public static class HttpErrorException extends Exception {
        private int code;
        private String httpStr;

        public int getCode() {
            return this.code;
        }

        public String getHttpStr() {
            return this.httpStr;
        }

        public String toString() {
            return " HttpErrorException {code = " + this.code + ", httpStr = " + this.httpStr + "}";
        }

        public HttpErrorException(int i, String str) {
            super("http error, code = " + i + ", body = " + str);
            this.code = i;
            this.httpStr = str;
        }
    }

    public static class Result<DATA extends Serializable> implements Serializable {
        public int code;
        public DATA data;
        public String msg;

        public int getCode() {
            return this.code;
        }

        public DATA getData() {
            return this.data;
        }

        public String getMsg() {
            return this.msg;
        }

        public void setCode(int i) {
            this.code = i;
        }

        public void setData(DATA data2) {
            this.data = data2;
        }

        public void setMsg(String str) {
            this.msg = str;
        }
    }

    public static class ServerErrorException extends Exception {
        private int code;
        private String data;
        private String json;
        private String msg;

        public int getCode() {
            return this.code;
        }

        public String getData() {
            return this.data;
        }

        public String getJson() {
            return this.json;
        }

        public String getMsg() {
            return this.msg;
        }

        public String toString() {
            return " ServerErrorException {code = " + this.code + ", msg = " + this.msg + ", data = " + this.data + ", json" + this.json + "}";
        }

        public void setData(String str) {
            this.data = str;
        }

        public ServerErrorException(int i, String str, String str2, String str3) {
            this.code = i;
            this.msg = str;
            this.data = str2;
            this.json = str3;
        }
    }

    /* renamed from: com.bytedance.ee.bear.contract.NetService$e */
    public static class C5076e {

        /* renamed from: a */
        private String f14787a;

        /* renamed from: b */
        private String f14788b;

        /* renamed from: c */
        private int f14789c = 2;

        /* renamed from: d */
        private final Map<String, String> f14790d = new HashMap();

        /* renamed from: e */
        private final Map<String, String> f14791e = new HashMap();

        /* renamed from: f */
        private final Map<String, List<String>> f14792f = new HashMap();

        /* renamed from: g */
        private final Map<String, List<String>> f14793g = new HashMap();

        /* renamed from: h */
        private final Map<String, String> f14794h = new HashMap();

        /* renamed from: i */
        private boolean f14795i = true;

        /* renamed from: j */
        private String f14796j;

        /* renamed from: a */
        public String mo20142a() {
            return this.f14787a;
        }

        /* renamed from: b */
        public String mo20149b() {
            return this.f14788b;
        }

        /* renamed from: c */
        public int mo20152c() {
            return this.f14789c;
        }

        /* renamed from: d */
        public Map<String, String> mo20155d() {
            return this.f14790d;
        }

        /* renamed from: e */
        public Map<String, String> mo20156e() {
            return this.f14794h;
        }

        /* renamed from: f */
        public Map<String, List<String>> mo20157f() {
            return this.f14793g;
        }

        /* renamed from: g */
        public String mo20158g() {
            return this.f14796j;
        }

        /* renamed from: h */
        public Map<String, String> mo20159h() {
            return this.f14791e;
        }

        /* renamed from: i */
        public Map<String, List<String>> mo20160i() {
            return this.f14792f;
        }

        /* renamed from: j */
        public boolean mo20161j() {
            return this.f14795i;
        }

        public String toString() {
            return "Request{, path='" + C13598b.m55197d(this.f14788b) + '\'' + ", requestMethod=" + this.f14789c + ", needCorrectPath= " + this.f14795i + '}';
        }

        /* renamed from: a */
        public void mo20143a(int i) {
            this.f14789c = i;
        }

        /* renamed from: b */
        public void mo20150b(String str) {
            this.f14788b = str;
        }

        /* renamed from: c */
        public void mo20153c(String str) {
            this.f14796j = str;
        }

        /* renamed from: a */
        public void mo20144a(String str) {
            this.f14787a = str;
        }

        /* renamed from: b */
        public void mo20151b(Map<String, List<String>> map) {
            if (map != null) {
                this.f14793g.putAll(map);
            }
        }

        /* renamed from: c */
        public void mo20154c(Map<String, String> map) {
            if (map != null) {
                this.f14794h.putAll(map);
            }
        }

        /* renamed from: a */
        public void mo20147a(Map<String, String> map) {
            if (map != null) {
                this.f14790d.putAll(map);
            }
        }

        /* renamed from: a */
        public void mo20148a(boolean z) {
            this.f14795i = z;
        }

        /* renamed from: a */
        public void mo20145a(String str, String str2) {
            this.f14791e.put(str, str2);
        }

        /* renamed from: a */
        public void mo20146a(String str, List<String> list) {
            this.f14792f.put(str, list);
        }
    }

    public static class ParseException extends Exception {
        public ParseException() {
            super("Parse json from server error!");
        }
    }

    /* renamed from: com.bytedance.ee.bear.contract.NetService$f */
    public static class C5077f<DATA extends Serializable> extends C5076e {
        public C5077f(String str) {
            mo20150b(str);
            mo20143a(2);
        }
    }
}
