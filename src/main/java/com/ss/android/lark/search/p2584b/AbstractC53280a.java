package com.ss.android.lark.search.p2584b;

import com.bytedance.lark.pb.basic.v1.ActionType;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.searchcommon.dto.C53892a;
import com.ss.android.lark.searchcommon.dto.Scene;
import com.ss.android.lark.searchcommon.dto.SearchResponse;
import java.util.List;

/* renamed from: com.ss.android.lark.search.b.a */
public interface AbstractC53280a {
    /* renamed from: a */
    void mo181832a(String str, int i, int i2, IGetDataCallback<SearchResponse> iGetDataCallback);

    /* renamed from: a */
    void mo181833a(String str, Scene scene, List<C53892a> list, IGetDataCallback<Void> iGetDataCallback);

    /* renamed from: a */
    void mo181834a(String str, String str2, long j, String str3, int i, IGetDataCallback<SearchResponse> iGetDataCallback);

    /* renamed from: a */
    void mo181835a(String str, String str2, boolean z, boolean z2, int i, int i2, boolean z3, List<ActionType> list, IGetDataCallback<SearchResponse> iGetDataCallback);

    /* renamed from: b */
    void mo181836b(String str, int i, int i2, IGetDataCallback<SearchResponse> iGetDataCallback);

    /* renamed from: com.ss.android.lark.search.b.a$a */
    public static class C53281a {

        /* renamed from: a */
        private boolean f131661a;

        /* renamed from: b */
        private boolean f131662b;

        /* renamed from: c */
        private boolean f131663c;

        /* renamed from: a */
        public boolean mo181838a() {
            return this.f131661a;
        }

        /* renamed from: b */
        public boolean mo181840b() {
            return this.f131662b;
        }

        /* renamed from: c */
        public boolean mo181842c() {
            return this.f131663c;
        }

        /* renamed from: a */
        public void mo181837a(boolean z) {
            this.f131661a = z;
        }

        /* renamed from: b */
        public void mo181839b(boolean z) {
            this.f131662b = z;
        }

        /* renamed from: c */
        public void mo181841c(boolean z) {
            this.f131663c = z;
        }
    }
}
