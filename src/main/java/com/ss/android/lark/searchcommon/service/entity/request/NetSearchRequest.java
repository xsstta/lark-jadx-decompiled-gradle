package com.ss.android.lark.searchcommon.service.entity.request;

import com.bytedance.lark.pb.search.slash.v1.SlashCommandParam;
import com.bytedance.lark.pb.search.v1.ChatFilterParam;
import com.bytedance.lark.pb.search.v1.IntegrationSearchRequest;
import com.bytedance.lark.pb.search.v1.MessageFilterParam;
import com.ss.android.lark.searchcommon.dto.Scene;
import com.ss.android.lark.searchcommon.service.entity.ChatType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class NetSearchRequest {

    /* renamed from: a */
    public final String f133320a;

    /* renamed from: b */
    public final String f133321b;

    /* renamed from: c */
    public final String f133322c;

    /* renamed from: d */
    public final Scene.Type f133323d;

    /* renamed from: e */
    public IntegrationSearchRequest.SearchExtraParam f133324e;

    /* renamed from: f */
    public SlashCommandParam f133325f;

    /* renamed from: g */
    public final String f133326g;

    /* renamed from: h */
    public final int f133327h;

    /* renamed from: i */
    public final int f133328i;

    /* renamed from: j */
    public final Filter f133329j;

    /* renamed from: k */
    public final String f133330k;

    public static class CalendarFilter implements Serializable {
        private static final long serialVersionUID = 6033704717840210704L;
        public final List<String> removeChatIds;

        public static C53949a newBuilder() {
            return new C53949a();
        }

        /* renamed from: com.ss.android.lark.searchcommon.service.entity.request.NetSearchRequest$CalendarFilter$a */
        public static final class C53949a {

            /* renamed from: a */
            public List<String> f133331a;

            private C53949a() {
                this.f133331a = new ArrayList();
            }
        }

        private CalendarFilter(C53949a aVar) {
            this.removeChatIds = aVar.f133331a;
        }
    }

    public static class ChatFilter implements Serializable {
        private static final long serialVersionUID = -1501862756031978985L;
        public final String chatKeyWord;
        public final List<String> chatMemberIds;
        public final List<ChatFilterParam.ChatMode> chatModes;
        public final List<ChatType> chatTypes;

        public static C53950a newBuilder() {
            return new C53950a();
        }

        /* renamed from: com.ss.android.lark.searchcommon.service.entity.request.NetSearchRequest$ChatFilter$a */
        public static final class C53950a {

            /* renamed from: a */
            public List<ChatType> f133332a;

            /* renamed from: b */
            public List<String> f133333b;

            /* renamed from: c */
            public String f133334c;

            /* renamed from: d */
            public List<ChatFilterParam.ChatMode> f133335d;

            /* renamed from: a */
            public ChatFilter mo184512a() {
                return new ChatFilter(this);
            }

            private C53950a() {
                this.f133332a = new ArrayList();
                this.f133333b = new ArrayList();
                this.f133334c = "";
                this.f133335d = new ArrayList();
            }

            /* renamed from: a */
            public C53950a mo184510a(String str) {
                this.f133334c = str;
                return this;
            }

            /* renamed from: b */
            public C53950a mo184513b(List<String> list) {
                this.f133333b = list;
                return this;
            }

            /* renamed from: c */
            public C53950a mo184514c(List<ChatFilterParam.ChatMode> list) {
                this.f133335d = list;
                return this;
            }

            /* renamed from: a */
            public C53950a mo184511a(List<ChatType> list) {
                this.f133332a = list;
                return this;
            }
        }

        public ChatFilter(C53950a aVar) {
            this.chatTypes = aVar.f133332a;
            this.chatMemberIds = aVar.f133333b;
            this.chatKeyWord = aVar.f133334c;
            this.chatModes = aVar.f133335d;
        }
    }

    public static class Filter implements Serializable {
        private static final long serialVersionUID = -7783896240689695205L;
        public final CalendarFilter calendarFilter;
        public final ChatFilter chatFilter;
        public final List<String> chatIds;
        public final int count;
        public final boolean doNotSearchResignedUser;
        public final List<String> docCreatorIds;
        public final List<String> docTypes;
        public final List<String> emailIds;
        public final long lastCreateTime;
        public final String lastMessageId;
        public final List<String> messageCreatorIds;
        public final long messageEndTime;
        public final MessageFilterParam messageFilterParam;
        public final long messageStartTime;
        public final List<MessageTag> messageTags;
        public final List<String> msgReceiverIds;
        public final boolean needSearchOuterTenant;
        public final boolean reverse;
        public final List<String> threadIds;

        public static C53951a newBuilder() {
            return new C53951a();
        }

        /* renamed from: com.ss.android.lark.searchcommon.service.entity.request.NetSearchRequest$Filter$a */
        public static final class C53951a {

            /* renamed from: a */
            public List<String> f133336a;

            /* renamed from: b */
            public List<String> f133337b;

            /* renamed from: c */
            public List<String> f133338c;

            /* renamed from: d */
            public List<String> f133339d;

            /* renamed from: e */
            public List<String> f133340e;

            /* renamed from: f */
            public long f133341f;

            /* renamed from: g */
            public long f133342g;

            /* renamed from: h */
            public long f133343h;

            /* renamed from: i */
            public String f133344i;

            /* renamed from: j */
            public int f133345j;

            /* renamed from: k */
            public boolean f133346k;

            /* renamed from: l */
            public boolean f133347l;

            /* renamed from: m */
            public boolean f133348m;

            /* renamed from: n */
            public List<String> f133349n;

            /* renamed from: o */
            public List<MessageTag> f133350o;

            /* renamed from: p */
            public List<String> f133351p;

            /* renamed from: q */
            public CalendarFilter f133352q;

            /* renamed from: r */
            public ChatFilter f133353r;

            /* renamed from: s */
            public MessageFilterParam f133354s;

            private C53951a() {
                this.f133336a = new ArrayList();
                this.f133337b = new ArrayList();
                this.f133338c = new ArrayList();
                this.f133339d = new ArrayList();
                this.f133340e = new ArrayList();
                this.f133341f = 0;
                this.f133342g = 0;
                this.f133343h = 0;
                this.f133345j = 10;
                this.f133346k = false;
                this.f133347l = false;
                this.f133348m = false;
                this.f133349n = new ArrayList();
                this.f133350o = new ArrayList();
                this.f133351p = new ArrayList();
            }

            /* renamed from: a */
            public Filter mo184522a() {
                return new Filter(this);
            }

            /* renamed from: a */
            public C53951a mo184515a(int i) {
                this.f133345j = i;
                return this;
            }

            /* renamed from: b */
            public C53951a mo184523b(long j) {
                this.f133342g = j;
                return this;
            }

            /* renamed from: c */
            public C53951a mo184526c(long j) {
                this.f133343h = j;
                return this;
            }

            /* renamed from: d */
            public C53951a mo184529d(List<String> list) {
                this.f133339d = list;
                return this;
            }

            /* renamed from: e */
            public C53951a mo184530e(List<String> list) {
                this.f133340e = list;
                return this;
            }

            /* renamed from: f */
            public C53951a mo184531f(List<MessageTag> list) {
                this.f133350o = list;
                return this;
            }

            /* renamed from: g */
            public C53951a mo184532g(List<String> list) {
                this.f133351p = list;
                return this;
            }

            /* renamed from: a */
            public C53951a mo184516a(long j) {
                this.f133341f = j;
                return this;
            }

            /* renamed from: b */
            public C53951a mo184524b(List<String> list) {
                this.f133337b = list;
                return this;
            }

            /* renamed from: c */
            public C53951a mo184527c(List<String> list) {
                this.f133338c = list;
                return this;
            }

            /* renamed from: a */
            public C53951a mo184517a(MessageFilterParam messageFilterParam) {
                this.f133354s = messageFilterParam;
                return this;
            }

            /* renamed from: b */
            public C53951a mo184525b(boolean z) {
                this.f133347l = z;
                return this;
            }

            /* renamed from: c */
            public C53951a mo184528c(boolean z) {
                this.f133348m = z;
                return this;
            }

            /* renamed from: a */
            public C53951a mo184518a(ChatFilter chatFilter) {
                this.f133353r = chatFilter;
                return this;
            }

            /* renamed from: a */
            public C53951a mo184519a(String str) {
                this.f133344i = str;
                return this;
            }

            /* renamed from: a */
            public C53951a mo184520a(List<String> list) {
                this.f133336a = list;
                return this;
            }

            /* renamed from: a */
            public C53951a mo184521a(boolean z) {
                this.f133346k = z;
                return this;
            }
        }

        private Filter(C53951a aVar) {
            this.chatIds = aVar.f133336a;
            this.emailIds = aVar.f133337b;
            this.docTypes = aVar.f133338c;
            this.messageCreatorIds = aVar.f133339d;
            this.docCreatorIds = aVar.f133340e;
            this.messageStartTime = aVar.f133341f;
            this.messageEndTime = aVar.f133342g;
            this.lastCreateTime = aVar.f133343h;
            this.lastMessageId = aVar.f133344i;
            this.count = aVar.f133345j;
            this.reverse = aVar.f133346k;
            this.needSearchOuterTenant = aVar.f133347l;
            this.doNotSearchResignedUser = aVar.f133348m;
            this.threadIds = aVar.f133349n;
            this.messageTags = aVar.f133350o;
            this.msgReceiverIds = aVar.f133351p;
            this.calendarFilter = aVar.f133352q;
            this.chatFilter = aVar.f133353r;
            this.messageFilterParam = aVar.f133354s;
        }
    }

    /* renamed from: a */
    public static C53952a m209173a() {
        return new C53952a();
    }

    /* renamed from: com.ss.android.lark.searchcommon.service.entity.request.NetSearchRequest$a */
    public static final class C53952a {

        /* renamed from: a */
        public String f133355a;

        /* renamed from: b */
        public String f133356b;

        /* renamed from: c */
        public String f133357c;

        /* renamed from: d */
        public String f133358d;

        /* renamed from: e */
        public Scene.Type f133359e;

        /* renamed from: f */
        public IntegrationSearchRequest.SearchExtraParam f133360f;

        /* renamed from: g */
        public SlashCommandParam f133361g;

        /* renamed from: h */
        public int f133362h;

        /* renamed from: i */
        public int f133363i;

        /* renamed from: j */
        public Filter f133364j;

        /* renamed from: k */
        public String f133365k;

        private C53952a() {
            this.f133355a = "";
            this.f133356b = "";
            this.f133357c = "";
            this.f133358d = "";
            this.f133359e = Scene.Type.UNKNOWN;
            this.f133363i = 10;
            this.f133365k = "";
        }

        /* renamed from: a */
        public NetSearchRequest mo184539a() {
            return new NetSearchRequest(this);
        }

        /* renamed from: a */
        public C53952a mo184533a(int i) {
            this.f133362h = i;
            return this;
        }

        /* renamed from: b */
        public C53952a mo184540b(int i) {
            this.f133363i = i;
            return this;
        }

        /* renamed from: c */
        public C53952a mo184542c(String str) {
            this.f133357c = str;
            return this;
        }

        /* renamed from: d */
        public C53952a mo184543d(String str) {
            this.f133365k = str;
            return this;
        }

        /* renamed from: a */
        public C53952a mo184534a(SlashCommandParam slashCommandParam) {
            this.f133361g = slashCommandParam;
            return this;
        }

        /* renamed from: b */
        public C53952a mo184541b(String str) {
            this.f133356b = str;
            return this;
        }

        /* renamed from: a */
        public C53952a mo184535a(IntegrationSearchRequest.SearchExtraParam searchExtraParam) {
            this.f133360f = searchExtraParam;
            return this;
        }

        /* renamed from: a */
        public C53952a mo184536a(Scene.Type type) {
            this.f133359e = type;
            return this;
        }

        /* renamed from: a */
        public C53952a mo184537a(Filter filter) {
            this.f133364j = filter;
            return this;
        }

        /* renamed from: a */
        public C53952a mo184538a(String str) {
            this.f133355a = str;
            return this;
        }
    }

    private NetSearchRequest(C53952a aVar) {
        this.f133320a = aVar.f133355a;
        this.f133321b = aVar.f133356b;
        this.f133322c = aVar.f133357c;
        this.f133323d = aVar.f133359e;
        this.f133324e = aVar.f133360f;
        this.f133325f = aVar.f133361g;
        this.f133326g = aVar.f133358d;
        this.f133327h = aVar.f133362h;
        this.f133328i = aVar.f133363i;
        this.f133329j = aVar.f133364j;
        this.f133330k = aVar.f133365k;
    }
}
