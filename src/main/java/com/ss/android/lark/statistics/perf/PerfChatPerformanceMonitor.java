package com.ss.android.lark.statistics.perf;

import android.os.SystemClock;
import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.appreciablelib.AppreciableKit;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.ErrorLevel;
import com.ss.android.lark.appreciablelib.ErrorParams;
import com.ss.android.lark.appreciablelib.ErrorType;
import com.ss.android.lark.appreciablelib.Event;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.chat.export.entity.message.MessageType;
import com.ss.android.lark.dependency.aj;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.C57782ag;
import com.ss.android.lark.utils.statistics.BasePerfMonitor;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class PerfChatPerformanceMonitor extends BasePerfMonitor {

    /* renamed from: a */
    public static aj f135854a = C29990c.m110930b().as();

    /* renamed from: c */
    private static C54982k f135855c;

    /* renamed from: d */
    private static C54977f f135856d;

    /* renamed from: e */
    private static C54973b f135857e;

    /* renamed from: f */
    private static C54976e f135858f;

    /* renamed from: g */
    private static C54975d f135859g;

    /* renamed from: h */
    private static C54972a f135860h;

    /* renamed from: i */
    private static C54980i f135861i;

    /* renamed from: j */
    private static C54980i f135862j;

    /* renamed from: k */
    private static C54980i f135863k;

    /* renamed from: l */
    private static C54978g f135864l;

    /* renamed from: m */
    private static C54981j f135865m;

    /* renamed from: n */
    private static C54979h f135866n;

    @Retention(RetentionPolicy.SOURCE)
    public @interface PerformanceType {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.statistics.perf.PerfChatPerformanceMonitor$a */
    public static class C54972a extends AbstractC54974c {
        @Override // com.ss.android.lark.utils.statistics.BasePerfMonitor.AbstractC57879a
        /* renamed from: a */
        public String mo142416a(int i) {
            return "at_list_load_time";
        }

        C54972a() {
        }

        @Override // com.ss.android.lark.statistics.perf.PerfChatPerformanceMonitor.AbstractC54974c, com.ss.android.lark.utils.statistics.BasePerfMonitor.AbstractC57879a, com.ss.android.lark.utils.statistics.BasePerfMonitor.AbstractC57880b
        /* renamed from: a */
        public void mo142423a(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
            try {
                jSONObject.put("time", this.f142500m);
                jSONObject3.put("since_startup", this.f135870d);
                jSONObject3.put("since_latest_enter_foreground", this.f135870d);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.statistics.perf.PerfChatPerformanceMonitor$b */
    public static class C54973b extends BasePerfMonitor.AbstractC57880b {
        @Override // com.ss.android.lark.utils.statistics.BasePerfMonitor.AbstractC57879a
        /* renamed from: a */
        public String mo142416a(int i) {
            return "mention_external_user_search_time";
        }

        C54973b() {
        }
    }

    /* renamed from: com.ss.android.lark.statistics.perf.PerfChatPerformanceMonitor$d */
    static class C54975d extends BasePerfMonitor.AbstractC57880b {

        /* renamed from: a */
        protected String f135872a;

        @Override // com.ss.android.lark.utils.statistics.BasePerfMonitor.AbstractC57879a
        /* renamed from: a */
        public String mo142416a(int i) {
            return "chat_remove_message";
        }

        @Override // com.ss.android.lark.utils.statistics.BasePerfMonitor.AbstractC57879a, com.ss.android.lark.utils.statistics.BasePerfMonitor.AbstractC57880b
        /* renamed from: b */
        public boolean mo142426b(int i) {
            return i == 1;
        }

        C54975d() {
        }

        /* renamed from: a */
        public void mo187671a(String str) {
            super.aF_();
            this.f135872a = str;
        }

        @Override // com.ss.android.lark.utils.statistics.BasePerfMonitor.AbstractC57879a, com.ss.android.lark.utils.statistics.BasePerfMonitor.AbstractC57880b
        /* renamed from: a */
        public void mo142423a(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
            super.mo142423a(jSONObject, jSONObject2, jSONObject3);
            try {
                jSONObject2.put("message_id", this.f135872a);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.statistics.perf.PerfChatPerformanceMonitor$e */
    public static class C54976e extends BasePerfMonitor.AbstractC57880b {
        @Override // com.ss.android.lark.utils.statistics.BasePerfMonitor.AbstractC57879a
        /* renamed from: a */
        public String mo142416a(int i) {
            return "forward_message_search_time";
        }

        C54976e() {
        }
    }

    /* renamed from: com.ss.android.lark.statistics.perf.PerfChatPerformanceMonitor$f */
    static class C54977f extends AbstractC54974c {

        /* renamed from: f */
        protected String f135873f;

        /* renamed from: g */
        protected String f135874g;

        /* renamed from: h */
        protected int f135875h;

        /* renamed from: i */
        protected long f135876i;

        /* renamed from: j */
        protected Boolean f135877j;

        @Override // com.ss.android.lark.utils.statistics.BasePerfMonitor.AbstractC57879a
        /* renamed from: a */
        public String mo142416a(int i) {
            return "load_more_message_time";
        }

        C54977f() {
        }

        public Map<String, Object> bl_() {
            HashMap hashMap = new HashMap();
            hashMap.put("sdk_cost", Long.valueOf(this.f135876i));
            return hashMap;
        }

        /* renamed from: e */
        public Map<String, Object> mo187677e() {
            HashMap hashMap = new HashMap();
            hashMap.put("chatter_count", Integer.valueOf(this.f135875h));
            hashMap.put("feed_id", C57782ag.m224244b(this.f135867a));
            return hashMap;
        }

        /* renamed from: d */
        public Map<String, Object> mo187676d() {
            HashMap hashMap = new HashMap();
            hashMap.put("chat_type", Integer.valueOf(this.f135869c.index));
            hashMap.put("is_crypto", Integer.valueOf(this.f135868b));
            hashMap.put("load_type", Integer.valueOf(TextUtils.equals(this.f135873f, "newer") ? 1 : 0));
            return hashMap;
        }

        /* renamed from: a */
        public void mo187674a(boolean z, Boolean bool) {
            String str;
            super.aF_();
            if (z) {
                str = "newer";
            } else {
                str = "older";
            }
            this.f135873f = str;
            this.f135877j = bool;
            this.f135874g = AppreciableKit.m107394b().mo103508a(Biz.Messenger, Scene.Chat, Event.load_more_message_time, "chatWindow", true);
        }

        /* renamed from: a */
        public void mo187672a(String str, int i, ChatBundle.ChatType chatType) {
            super.mo187670a(str, chatType);
            this.f135875h = i;
        }

        @Override // com.ss.android.lark.statistics.perf.PerfChatPerformanceMonitor.AbstractC54974c, com.ss.android.lark.utils.statistics.BasePerfMonitor.AbstractC57879a, com.ss.android.lark.utils.statistics.BasePerfMonitor.AbstractC57880b
        /* renamed from: a */
        public void mo142423a(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
            super.mo142423a(jSONObject, jSONObject2, jSONObject3);
            try {
                jSONObject2.put("load_type", this.f135873f);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        /* renamed from: a */
        public void mo187673a(String str, int i, ChatBundle.ChatType chatType, ErrorResult errorResult) {
            super.mo187680c();
            mo187672a(str, i, chatType);
            Boolean bool = this.f135877j;
            if (bool != null && !bool.booleanValue()) {
                AppreciableKit.m107394b().mo103516a(C57782ag.m224244b(this.f135874g), -1, bl_(), (Map<String, ? extends Object>) null, mo187677e(), mo187676d());
            } else if (errorResult == null) {
                AppreciableKit.m107394b().mo103523c(C57782ag.m224244b(this.f135874g), bl_(), null, mo187677e(), mo187676d());
            } else {
                AppreciableKit.m107394b().mo103514a(new ErrorParams(Biz.Messenger, Scene.Chat, Event.load_more_message_time, ErrorType.Network, ErrorLevel.Fatal, errorResult.getErrorCode(), null, "chatwindow", errorResult.getDisplayMsg(), true, null, mo187677e(), mo187676d()));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.statistics.perf.PerfChatPerformanceMonitor$g */
    public static class C54978g extends AbstractC54974c {

        /* renamed from: f */
        protected String f135878f;

        /* renamed from: g */
        protected long f135879g;

        /* renamed from: h */
        protected long f135880h;

        /* renamed from: i */
        protected long f135881i;

        /* renamed from: j */
        protected int f135882j;

        /* renamed from: k */
        protected boolean f135883k;

        /* renamed from: l */
        protected boolean f135884l;

        @Override // com.ss.android.lark.utils.statistics.BasePerfMonitor.AbstractC57879a
        /* renamed from: a */
        public String mo142416a(int i) {
            return null;
        }

        @Override // com.ss.android.lark.statistics.perf.PerfChatPerformanceMonitor.AbstractC54974c, com.ss.android.lark.utils.statistics.BasePerfMonitor.AbstractC57879a, com.ss.android.lark.utils.statistics.BasePerfMonitor.AbstractC57880b
        /* renamed from: b */
        public boolean mo142426b(int i) {
            return false;
        }

        C54978g() {
        }

        @Override // com.ss.android.lark.utils.statistics.BasePerfMonitor.AbstractC57880b
        /* renamed from: c */
        public void mo187680c() {
            super.mo187680c();
            AppreciableKit.m107394b().mo103523c(C57782ag.m224244b(this.f135878f), mo187681d(), null, mo187683f(), mo187682e());
        }

        /* renamed from: f */
        public Map<String, Object> mo187683f() {
            HashMap hashMap = new HashMap();
            hashMap.put("feed_id", C57782ag.m224244b(this.f135867a));
            hashMap.put("chatter_count", Integer.valueOf(this.f135882j));
            return hashMap;
        }

        /* renamed from: d */
        public Map<String, Object> mo187681d() {
            HashMap hashMap = new HashMap();
            hashMap.put("sdk_cost", Long.valueOf(this.f135879g));
            hashMap.put("init_view_cost", Long.valueOf(this.f135880h));
            hashMap.put("first_render_cost", Long.valueOf(this.f135881i));
            return hashMap;
        }

        /* renamed from: e */
        public Map<String, Object> mo187682e() {
            HashMap hashMap = new HashMap();
            hashMap.put("chat_type", Integer.valueOf(this.f135869c.index));
            hashMap.put("is_crypto", Integer.valueOf(this.f135868b));
            hashMap.put("is_external", Boolean.valueOf(this.f135883k));
            hashMap.put("is_owner", Boolean.valueOf(this.f135884l));
            return hashMap;
        }

        /* renamed from: b */
        public void mo187679b(String str, int i, ChatBundle.ChatType chatType, boolean z, boolean z2) {
            super.mo187670a(str, chatType);
            this.f135882j = i;
            this.f135884l = z;
            this.f135883k = z2;
        }

        /* renamed from: a */
        public void mo187678a(String str, int i, ChatBundle.ChatType chatType, boolean z, boolean z2) {
            super.aF_();
            this.f135878f = AppreciableKit.m107394b().mo103508a(Biz.Messenger, Scene.Chat, Event.enter_chat_setting, "chatWindow", false);
            mo187679b(str, i, chatType, z, z2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.statistics.perf.PerfChatPerformanceMonitor$h */
    public static class C54979h extends BasePerfMonitor.AbstractC57880b {

        /* renamed from: a */
        protected String f135885a;

        /* renamed from: b */
        protected long f135886b;

        /* renamed from: c */
        protected long f135887c;

        /* renamed from: d */
        protected long f135888d;

        @Override // com.ss.android.lark.utils.statistics.BasePerfMonitor.AbstractC57879a
        /* renamed from: a */
        public String mo142416a(int i) {
            return null;
        }

        @Override // com.ss.android.lark.utils.statistics.BasePerfMonitor.AbstractC57879a, com.ss.android.lark.utils.statistics.BasePerfMonitor.AbstractC57880b
        /* renamed from: b */
        public boolean mo142426b(int i) {
            return false;
        }

        C54979h() {
        }

        @Override // com.ss.android.lark.utils.statistics.BasePerfMonitor.AbstractC57880b
        public void aF_() {
            super.aF_();
            this.f135885a = AppreciableKit.m107394b().mo103508a(Biz.Messenger, Scene.Chat, Event.enter_favorite, "chatWindow", true);
        }

        /* renamed from: d */
        public Map<String, Object> mo187685d() {
            HashMap hashMap = new HashMap();
            hashMap.put("sdk_cost", Long.valueOf(this.f135886b));
            hashMap.put("init_view_cost", Long.valueOf(this.f135887c));
            hashMap.put("first_render", Long.valueOf(this.f135888d));
            return hashMap;
        }

        /* renamed from: a */
        public void mo187684a(ErrorResult errorResult) {
            super.mo187680c();
            if (errorResult == null) {
                AppreciableKit.m107394b().mo103523c(C57782ag.m224244b(this.f135885a), mo187685d(), null, null, null);
            } else {
                AppreciableKit.m107394b().mo103514a(new ErrorParams(Biz.Messenger, Scene.Chat, Event.enter_favorite, ErrorType.Network, ErrorLevel.Fatal, errorResult.getErrorCode(), null, "chatwindow", errorResult.getDisplayMsg(), true, null, null, null));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.statistics.perf.PerfChatPerformanceMonitor$i */
    public static class C54980i extends BasePerfMonitor.AbstractC57880b {

        /* renamed from: a */
        protected String f135889a;

        @Override // com.ss.android.lark.utils.statistics.BasePerfMonitor.AbstractC57879a, com.ss.android.lark.utils.statistics.BasePerfMonitor.AbstractC57880b
        /* renamed from: b */
        public boolean mo142426b(int i) {
            return false;
        }

        @Override // com.ss.android.lark.utils.statistics.BasePerfMonitor.AbstractC57880b
        public void aF_() {
            super.aF_();
        }

        @Override // com.ss.android.lark.utils.statistics.BasePerfMonitor.AbstractC57880b
        /* renamed from: c */
        public void mo187680c() {
            super.mo187680c();
        }

        @Override // com.ss.android.lark.utils.statistics.BasePerfMonitor.AbstractC57879a
        /* renamed from: a */
        public String mo142416a(int i) {
            return this.f135889a;
        }

        public C54980i(String str) {
            this.f135889a = str;
        }
    }

    /* renamed from: a */
    public static void m213463a(boolean z) {
        if (f135855c == null) {
            f135855c = new C54982k();
        }
        f135855c.mo187692a(z);
        m213469c(1);
    }

    /* renamed from: a */
    public static void m213461a(String str, ChatBundle.ChatType chatType) {
        C54982k kVar = f135855c;
        if (kVar != null) {
            kVar.mo187693b(str, chatType);
            f135855c = null;
        } else {
            kVar = null;
        }
        m213456a(1, kVar);
    }

    /* renamed from: a */
    public static void m213464a(boolean z, Boolean bool) {
        if (f135856d == null) {
            f135856d = new C54977f();
        }
        f135856d.mo187674a(z, bool);
        m213469c(3);
    }

    /* renamed from: a */
    public static void m213462a(String str, MessageType messageType, long j, ChatBundle.ChatType chatType, ErrorResult errorResult) {
        C54981j jVar = f135865m;
        C54981j jVar2 = null;
        if (jVar != null && TextUtils.equals(jVar.f135891b, str)) {
            C54981j jVar3 = f135865m;
            jVar3.mo187688a(str, messageType, j, chatType, errorResult);
            f135865m = null;
            jVar2 = jVar3;
        }
        m213456a(12, jVar2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.statistics.perf.PerfChatPerformanceMonitor$k */
    public static class C54982k extends AbstractC54974c {

        /* renamed from: f */
        protected int f135896f = 1;

        @Override // com.ss.android.lark.utils.statistics.BasePerfMonitor.AbstractC57879a
        /* renamed from: a */
        public String mo142416a(int i) {
            return "view_push_message_time";
        }

        C54982k() {
        }

        /* renamed from: a */
        public void mo187692a(boolean z) {
            super.aF_();
            this.f135896f = z ? 1 : 0;
        }

        /* renamed from: b */
        public void mo187693b(String str, ChatBundle.ChatType chatType) {
            mo187670a(str, chatType);
            super.mo187680c();
        }

        @Override // com.ss.android.lark.statistics.perf.PerfChatPerformanceMonitor.AbstractC54974c, com.ss.android.lark.utils.statistics.BasePerfMonitor.AbstractC57879a, com.ss.android.lark.utils.statistics.BasePerfMonitor.AbstractC57880b
        /* renamed from: a */
        public void mo142423a(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
            super.mo142423a(jSONObject, jSONObject2, jSONObject3);
            try {
                jSONObject2.put("locate_target_message_status", this.f135896f);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.ss.android.lark.statistics.perf.PerfChatPerformanceMonitor$j */
    static class C54981j extends BasePerfMonitor.AbstractC57880b {

        /* renamed from: a */
        protected String f135890a;

        /* renamed from: b */
        protected String f135891b;

        /* renamed from: c */
        protected long f135892c;

        /* renamed from: d */
        protected MessageType f135893d = MessageType.UNKNOWN;

        /* renamed from: e */
        protected ChatBundle.ChatType f135894e = ChatBundle.ChatType.SINGLE;

        /* renamed from: f */
        protected int f135895f;

        @Override // com.ss.android.lark.utils.statistics.BasePerfMonitor.AbstractC57879a
        /* renamed from: a */
        public String mo142416a(int i) {
            return null;
        }

        @Override // com.ss.android.lark.utils.statistics.BasePerfMonitor.AbstractC57879a, com.ss.android.lark.utils.statistics.BasePerfMonitor.AbstractC57880b
        /* renamed from: b */
        public boolean mo142426b(int i) {
            return false;
        }

        C54981j() {
        }

        /* renamed from: d */
        public Map<String, Object> mo187689d() {
            HashMap hashMap = new HashMap();
            hashMap.put("sdk_cost", Long.valueOf(this.f135892c));
            return hashMap;
        }

        /* renamed from: f */
        public Map<String, Object> mo187691f() {
            HashMap hashMap = new HashMap();
            hashMap.put("message_id", C57782ag.m224244b(this.f135891b));
            return hashMap;
        }

        /* renamed from: e */
        public Map<String, Object> mo187690e() {
            HashMap hashMap = new HashMap();
            hashMap.put("message_type", Integer.valueOf(this.f135893d.getNumber()));
            hashMap.put("chat_type", Integer.valueOf(this.f135894e.index));
            hashMap.put("is_crypto", Integer.valueOf(this.f135895f));
            return hashMap;
        }

        /* renamed from: a */
        public void mo187686a(String str) {
            super.aF_();
            this.f135891b = str;
            this.f135890a = AppreciableKit.m107394b().mo103508a(Biz.Messenger, Scene.Chat, Event.translate_message, "chatWindow", true);
        }

        /* renamed from: a */
        public void mo187687a(String str, MessageType messageType, long j, ChatBundle.ChatType chatType) {
            this.f135891b = str;
            this.f135893d = messageType;
            this.f135892c = j;
            this.f135894e = chatType;
        }

        /* renamed from: a */
        public void mo187688a(String str, MessageType messageType, long j, ChatBundle.ChatType chatType, ErrorResult errorResult) {
            super.mo187680c();
            mo187687a(str, messageType, j, chatType);
            if (errorResult == null) {
                AppreciableKit.m107394b().mo103523c(C57782ag.m224244b(this.f135890a), mo187689d(), null, mo187691f(), mo187690e());
            } else {
                AppreciableKit.m107394b().mo103514a(new ErrorParams(Biz.Messenger, Scene.Chat, Event.translate_message, ErrorType.Network, ErrorLevel.Fatal, errorResult.getErrorCode(), null, "chatwindow", errorResult.getDisplayMsg(), true, null, mo187691f(), mo187690e()));
            }
        }
    }

    /* renamed from: a */
    public static void m213454a() {
        C54975d dVar = f135859g;
        if (dVar != null) {
            dVar.mo187680c();
            f135859g = null;
        } else {
            dVar = null;
        }
        m213456a(6, dVar);
    }

    /* renamed from: b */
    public static void m213465b() {
        C54978g gVar = f135864l;
        if (gVar != null) {
            gVar.mo187680c();
            f135864l = null;
        } else {
            gVar = null;
        }
        m213456a(11, gVar);
    }

    /* renamed from: c */
    public static void m213468c() {
        if (f135866n == null) {
            f135866n = new C54979h();
        }
        f135866n.aF_();
        m213469c(13);
    }

    /* renamed from: com.ss.android.lark.statistics.perf.PerfChatPerformanceMonitor$c */
    public static abstract class AbstractC54974c extends BasePerfMonitor.AbstractC57880b {

        /* renamed from: a */
        protected String f135867a;

        /* renamed from: b */
        protected int f135868b;

        /* renamed from: c */
        protected ChatBundle.ChatType f135869c = ChatBundle.ChatType.SINGLE;

        /* renamed from: d */
        protected long f135870d;

        /* renamed from: e */
        protected long f135871e;

        @Override // com.ss.android.lark.utils.statistics.BasePerfMonitor.AbstractC57879a, com.ss.android.lark.utils.statistics.BasePerfMonitor.AbstractC57880b
        /* renamed from: b */
        public boolean mo142426b(int i) {
            return i == 1;
        }

        @Override // com.ss.android.lark.utils.statistics.BasePerfMonitor.AbstractC57880b
        public void aF_() {
            super.aF_();
            this.f135870d = SystemClock.elapsedRealtime() - PerfChatPerformanceMonitor.f135854a.mo134457a();
            this.f135871e = SystemClock.elapsedRealtime() - PerfChatPerformanceMonitor.f135854a.mo134458b();
            Log.m165379d("ChatPerformanceMonitor", "start " + getClass() + " timeAfterAppStart:" + this.f135870d + "/ timeAfterForeground:" + this.f135871e);
        }

        /* renamed from: a */
        public void mo187670a(String str, ChatBundle.ChatType chatType) {
            int i;
            this.f135867a = str;
            if (chatType == ChatBundle.ChatType.SECRET_GROUP || chatType == ChatBundle.ChatType.SECRET_SINGLE) {
                i = 1;
            } else {
                i = 0;
            }
            this.f135868b = i;
            this.f135869c = chatType;
        }

        @Override // com.ss.android.lark.utils.statistics.BasePerfMonitor.AbstractC57879a, com.ss.android.lark.utils.statistics.BasePerfMonitor.AbstractC57880b
        /* renamed from: a */
        public void mo142423a(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
            super.mo142423a(jSONObject, jSONObject2, jSONObject3);
            try {
                jSONObject3.put("chat_id", this.f135867a);
                jSONObject3.put("crypto", this.f135868b);
                jSONObject3.put("chat_type", this.f135869c.value);
                jSONObject3.put("since_startup", this.f135870d);
                jSONObject3.put("since_latest_enter_foreground", this.f135870d);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public static void m213467b(String str) {
        if (f135865m == null) {
            f135865m = new C54981j();
        }
        f135865m.mo187686a(str);
        m213469c(12);
    }

    /* renamed from: c */
    private static void m213469c(int i) {
        Log.m165379d("ChatPerformanceMonitor", "start:" + i);
    }

    /* renamed from: a */
    public static void m213457a(ErrorResult errorResult) {
        C54979h hVar = f135866n;
        if (hVar != null) {
            hVar.mo187684a(errorResult);
            f135866n = null;
        } else {
            hVar = null;
        }
        m213456a(13, hVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: com.ss.android.lark.statistics.perf.PerfChatPerformanceMonitor$e */
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: com.ss.android.lark.statistics.perf.PerfChatPerformanceMonitor$a */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static void m213466b(int i) {
        C54973b bVar;
        BasePerfMonitor.AbstractC57879a aVar = null;
        switch (i) {
            case 4:
                C54973b bVar2 = f135857e;
                if (bVar2 != null) {
                    bVar2.mo187680c();
                    f135857e = null;
                    bVar = bVar2;
                    aVar = bVar;
                    break;
                }
                break;
            case 5:
                C54976e eVar = f135858f;
                if (eVar != 0) {
                    eVar.mo187680c();
                    f135858f = null;
                    bVar = eVar;
                    aVar = bVar;
                    break;
                }
                break;
            case 7:
                C54972a aVar2 = f135860h;
                if (aVar2 != 0) {
                    aVar2.mo187680c();
                    f135860h = null;
                    bVar = aVar2;
                    aVar = bVar;
                    break;
                }
                break;
            case 8:
                C54980i iVar = f135861i;
                if (iVar != null) {
                    iVar.mo187680c();
                    f135861i = null;
                    break;
                }
                break;
            case 9:
                C54980i iVar2 = f135862j;
                if (iVar2 != null) {
                    iVar2.mo187680c();
                    f135862j = null;
                    break;
                }
                break;
            case 10:
                C54980i iVar3 = f135863k;
                if (iVar3 != null) {
                    iVar3.mo187680c();
                    f135863k = null;
                    break;
                }
                break;
        }
        m213456a(i, aVar);
    }

    /* renamed from: a */
    public static void m213455a(int i) {
        switch (i) {
            case 4:
                if (f135857e == null) {
                    f135857e = new C54973b();
                }
                f135857e.aF_();
                break;
            case 5:
                if (f135858f == null) {
                    f135858f = new C54976e();
                }
                f135858f.aF_();
                break;
            case 7:
                if (f135860h == null) {
                    f135860h = new C54972a();
                }
                f135860h.aF_();
                break;
            case 8:
                if (f135861i == null) {
                    f135861i = new C54980i("open_side_menu_pin");
                }
                f135861i.aF_();
                break;
            case 9:
                if (f135862j == null) {
                    f135862j = new C54980i("open_side_menu_search");
                }
                f135862j.aF_();
                break;
            case 10:
                if (f135863k == null) {
                    f135863k = new C54980i("open_side_menu_calendar");
                }
                f135863k.aF_();
                break;
        }
        m213469c(i);
    }

    /* renamed from: a */
    public static void m213458a(String str) {
        if (f135859g == null) {
            f135859g = new C54975d();
        }
        f135859g.mo187671a(str);
        m213469c(6);
    }

    /* renamed from: a */
    private static void m213456a(int i, BasePerfMonitor.AbstractC57879a aVar) {
        if (aVar != null && aVar.aG_()) {
            if (aVar.mo142426b(2)) {
                m224592a(aVar);
            }
            if (aVar.mo142426b(1)) {
                m224593b(aVar);
            }
        }
        Log.m165379d("ChatPerformanceMonitor", "end:" + i);
    }

    /* renamed from: a */
    public static void m213459a(String str, int i, ChatBundle.ChatType chatType, ErrorResult errorResult) {
        C54977f fVar = f135856d;
        if (fVar != null) {
            fVar.mo187673a(str, i, chatType, errorResult);
            f135856d = null;
        } else {
            fVar = null;
        }
        m213456a(3, fVar);
    }

    /* renamed from: a */
    public static void m213460a(String str, int i, ChatBundle.ChatType chatType, boolean z, boolean z2) {
        if (f135864l == null) {
            f135864l = new C54978g();
        }
        f135864l.mo187678a(str, i, chatType, z, z2);
        m213469c(11);
    }
}
