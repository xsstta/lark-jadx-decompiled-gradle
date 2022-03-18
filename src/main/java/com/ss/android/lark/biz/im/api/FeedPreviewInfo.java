package com.ss.android.lark.biz.im.api;

import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.Tag;
import com.ss.android.lark.biz.im.api.FeedCard;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chat.TeamChatType;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.chatter.ChatterCustomStatus;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.reaction.Reaction;
import com.ss.android.lark.chat.export.entity.message.content.SystemMessageType;
import com.ss.android.lark.doc.entity.DocMessage;
import com.ss.android.lark.doc.entity.DocType;
import java.util.List;

public class FeedPreviewInfo implements Comparable<FeedPreviewInfo> {

    /* renamed from: A */
    private boolean f74083A;

    /* renamed from: B */
    private DocType f74084B;

    /* renamed from: C */
    private String f74085C;

    /* renamed from: D */
    private DocMessage.Type f74086D;

    /* renamed from: E */
    private String f74087E;

    /* renamed from: F */
    private Chat.Type f74088F;

    /* renamed from: G */
    private Chat.ChatMode f74089G;

    /* renamed from: H */
    private Chatter.ChatterType f74090H;

    /* renamed from: I */
    private String f74091I;

    /* renamed from: J */
    private boolean f74092J;

    /* renamed from: K */
    private boolean f74093K;

    /* renamed from: L */
    private String f74094L;

    /* renamed from: M */
    private List<UrgentInfo> f74095M;

    /* renamed from: N */
    private boolean f74096N;

    /* renamed from: O */
    private boolean f74097O;

    /* renamed from: P */
    private boolean f74098P;

    /* renamed from: Q */
    private boolean f74099Q;

    /* renamed from: R */
    private boolean f74100R;

    /* renamed from: S */
    private boolean f74101S;

    /* renamed from: T */
    private boolean f74102T;

    /* renamed from: U */
    private boolean f74103U;

    /* renamed from: V */
    private List<Tag> f74104V;

    /* renamed from: W */
    private FocusInfo f74105W;

    /* renamed from: X */
    private HighPriorityDisplay f74106X;

    /* renamed from: Y */
    private boolean f74107Y;

    /* renamed from: Z */
    private List<Reaction> f74108Z;

    /* renamed from: a */
    String f74109a;
    private String aa;
    private int ab;
    private List<AtInfo> ac;
    private String ad;
    private boolean ae;
    private String af;
    private boolean ag;
    private String ah;

    /* renamed from: ai  reason: collision with root package name */
    private String f175444ai;
    private boolean aj;
    private String ak;
    private TeamChatType al;
    private String am;
    private List<ChatterCustomStatus> an;

    /* renamed from: b */
    String f74110b;

    /* renamed from: c */
    String f74111c;

    /* renamed from: d */
    private String f74112d;

    /* renamed from: e */
    private FeedCard.Type f74113e;

    /* renamed from: f */
    private FeedCard.FeedType f74114f;

    /* renamed from: g */
    private String f74115g;

    /* renamed from: h */
    private String f74116h;

    /* renamed from: i */
    private long f74117i;

    /* renamed from: j */
    private boolean f74118j;

    /* renamed from: k */
    private long f74119k;

    /* renamed from: l */
    private long f74120l;

    /* renamed from: m */
    private long f74121m;

    /* renamed from: n */
    private long f74122n;

    /* renamed from: o */
    private boolean f74123o;

    /* renamed from: p */
    private AtInfo f74124p;

    /* renamed from: q */
    private int f74125q;

    /* renamed from: r */
    private MuteUrgentInfo f74126r;

    /* renamed from: s */
    private C29593a f74127s;

    /* renamed from: t */
    private EntityStatus f74128t;

    /* renamed from: u */
    private String f74129u;

    /* renamed from: v */
    private int f74130v;

    /* renamed from: w */
    private Message.Type f74131w;

    /* renamed from: x */
    private SystemMessageType f74132x;

    /* renamed from: y */
    private CardContentType f74133y;

    /* renamed from: z */
    private VideoChatContentType f74134z;

    public static class AtInfo {

        /* renamed from: a */
        private String f74135a;

        /* renamed from: b */
        private AtType f74136b;

        /* renamed from: c */
        private String f74137c;

        /* renamed from: d */
        private String f74138d;

        /* renamed from: e */
        private String f74139e;

        /* renamed from: f */
        private String f74140f;

        /* renamed from: g */
        private long f74141g;

        /* renamed from: h */
        private long f74142h;

        /* renamed from: i */
        private String f74143i;

        public enum AtType {
            UNKNOWN(0),
            ALL(1),
            USER(2);
            
            public int value;

            public int getValue() {
                return this.value;
            }

            public static AtType getSource(int i) {
                AtType[] values = values();
                for (AtType atType : values) {
                    if (atType.getValue() == i) {
                        return atType;
                    }
                }
                return UNKNOWN;
            }

            private AtType(int i) {
                this.value = i;
            }
        }

        /* renamed from: a */
        public String mo106113a() {
            return this.f74135a;
        }

        /* renamed from: b */
        public AtType mo106117b() {
            return this.f74136b;
        }

        /* renamed from: c */
        public String mo106120c() {
            return this.f74137c;
        }

        /* renamed from: d */
        public String mo106122d() {
            return this.f74139e;
        }

        /* renamed from: e */
        public long mo106124e() {
            return this.f74142h;
        }

        /* renamed from: f */
        public long mo106127f() {
            return this.f74141g;
        }

        /* renamed from: g */
        public String mo106129g() {
            return this.f74143i;
        }

        /* renamed from: h */
        public String mo106130h() {
            return this.f74140f;
        }

        /* renamed from: a */
        public void mo106114a(long j) {
            this.f74142h = j;
        }

        /* renamed from: b */
        public void mo106118b(long j) {
            this.f74141g = j;
        }

        /* renamed from: c */
        public void mo106121c(String str) {
            this.f74138d = str;
        }

        /* renamed from: d */
        public void mo106123d(String str) {
            this.f74139e = str;
        }

        /* renamed from: e */
        public void mo106125e(String str) {
            this.f74143i = str;
        }

        /* renamed from: f */
        public void mo106128f(String str) {
            this.f74140f = str;
        }

        /* renamed from: a */
        public void mo106115a(AtType atType) {
            this.f74136b = atType;
        }

        /* renamed from: b */
        public void mo106119b(String str) {
            this.f74137c = str;
        }

        /* renamed from: a */
        public void mo106116a(String str) {
            this.f74135a = str;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof AtInfo)) {
                return false;
            }
            AtInfo atInfo = (AtInfo) obj;
            if (TextUtils.equals(this.f74138d, atInfo.f74138d) && TextUtils.equals(this.f74135a, atInfo.f74135a) && TextUtils.equals(this.f74137c, atInfo.f74137c) && this.f74136b.value == atInfo.f74136b.value && TextUtils.equals(this.f74140f, atInfo.f74140f)) {
                return true;
            }
            return false;
        }
    }

    public enum CardContentType {
        UNKNOWN(-1),
        VOTE(1),
        TEXT(2),
        VCHAT(3);
        
        int value;

        public int getNumber() {
            return this.value;
        }

        public static CardContentType valueOf(int i) {
            return forNumber(i);
        }

        public static CardContentType forNumber(int i) {
            if (i == 1) {
                return VOTE;
            }
            if (i == 2) {
                return TEXT;
            }
            if (i != 3) {
                return UNKNOWN;
            }
            return VCHAT;
        }

        private CardContentType(int i) {
            this.value = i;
        }
    }

    public enum EntityStatus {
        UNKNOWN(0),
        NORMAL(1),
        PENDING(2),
        FAILED(3),
        READ(4),
        UNREAD(5);
        
        private int value;

        public int getValue() {
            return this.value;
        }

        public static EntityStatus getSource(int i) {
            EntityStatus[] values = values();
            for (EntityStatus entityStatus : values) {
                if (entityStatus.getValue() == i) {
                    return entityStatus;
                }
            }
            return UNKNOWN;
        }

        private EntityStatus(int i) {
            this.value = i;
        }
    }

    public enum VideoChatContentType {
        UNKNOWN(0),
        MEETING_CARD(1),
        CHAT_ROOM_CARD(2);
        
        int value;

        public int getNumber() {
            return this.value;
        }

        public static VideoChatContentType valueOf(int i) {
            return forNumber(i);
        }

        public static VideoChatContentType forNumber(int i) {
            if (i == 1) {
                return MEETING_CARD;
            }
            if (i != 2) {
                return UNKNOWN;
            }
            return CHAT_ROOM_CARD;
        }

        private VideoChatContentType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.biz.im.api.FeedPreviewInfo$a */
    public static class C29593a {

        /* renamed from: a */
        private String f74144a;

        /* renamed from: a */
        public String mo106135a() {
            return this.f74144a;
        }

        public String toString() {
            return "[" + this.f74144a + "]";
        }

        /* renamed from: a */
        public void mo106136a(String str) {
            this.f74144a = str;
        }
    }

    /* renamed from: A */
    public int mo105977A() {
        return this.f74125q;
    }

    /* renamed from: B */
    public boolean mo105978B() {
        return this.f74097O;
    }

    /* renamed from: C */
    public boolean mo105979C() {
        return this.f74096N;
    }

    /* renamed from: D */
    public boolean mo105980D() {
        return this.f74098P;
    }

    /* renamed from: E */
    public String mo105981E() {
        return this.f74129u;
    }

    /* renamed from: F */
    public boolean mo105982F() {
        return this.f74083A;
    }

    /* renamed from: G */
    public EntityStatus mo105983G() {
        return this.f74128t;
    }

    /* renamed from: H */
    public boolean mo105984H() {
        return this.f74107Y;
    }

    /* renamed from: I */
    public List<AtInfo> mo105985I() {
        return this.ac;
    }

    /* renamed from: J */
    public String mo105986J() {
        return this.ad;
    }

    /* renamed from: K */
    public boolean mo105987K() {
        return this.ae;
    }

    /* renamed from: L */
    public FocusInfo mo105988L() {
        return this.f74105W;
    }

    /* renamed from: M */
    public HighPriorityDisplay mo105989M() {
        return this.f74106X;
    }

    /* renamed from: N */
    public String mo105990N() {
        return this.af;
    }

    /* renamed from: O */
    public int mo105991O() {
        return this.f74130v;
    }

    /* renamed from: P */
    public Message.Type mo105992P() {
        return this.f74131w;
    }

    /* renamed from: Q */
    public SystemMessageType mo105993Q() {
        return this.f74132x;
    }

    /* renamed from: R */
    public CardContentType mo105994R() {
        return this.f74133y;
    }

    /* renamed from: S */
    public VideoChatContentType mo105995S() {
        return this.f74134z;
    }

    /* renamed from: T */
    public List<Reaction> mo105996T() {
        return this.f74108Z;
    }

    /* renamed from: U */
    public boolean mo105997U() {
        return this.f74099Q;
    }

    /* renamed from: V */
    public boolean mo105998V() {
        return this.f74100R;
    }

    /* renamed from: W */
    public boolean mo105999W() {
        return this.f74101S;
    }

    /* renamed from: X */
    public long mo106000X() {
        return this.f74122n;
    }

    /* renamed from: Y */
    public DocMessage.Type mo106001Y() {
        return this.f74086D;
    }

    /* renamed from: Z */
    public String mo106002Z() {
        return this.f74087E;
    }

    public String aa() {
        return this.ah;
    }

    public String ab() {
        return this.f74109a;
    }

    public String ac() {
        return this.f74110b;
    }

    public String ad() {
        return this.f74111c;
    }

    public boolean ae() {
        return this.aj;
    }

    public String ag() {
        return this.aa;
    }

    public boolean ai() {
        return this.f74102T;
    }

    public boolean aj() {
        return this.f74103U;
    }

    public int ak() {
        return this.ab;
    }

    public List<Tag> al() {
        return this.f74104V;
    }

    public String am() {
        return this.ak;
    }

    public TeamChatType an() {
        return this.al;
    }

    public String ao() {
        return this.f175444ai;
    }

    public String ap() {
        return this.am;
    }

    public List<ChatterCustomStatus> aq() {
        return this.an;
    }

    /* renamed from: b */
    public String mo106045b() {
        return this.f74094L;
    }

    /* renamed from: c */
    public Chat.Type mo106051c() {
        return this.f74088F;
    }

    /* renamed from: d */
    public Chat.ChatMode mo106058d() {
        return this.f74089G;
    }

    /* renamed from: f */
    public Chatter.ChatterType mo106068f() {
        return this.f74090H;
    }

    /* renamed from: h */
    public String mo106074h() {
        return this.f74091I;
    }

    /* renamed from: j */
    public List<UrgentInfo> mo106080j() {
        return this.f74095M;
    }

    /* renamed from: k */
    public DocType mo106083k() {
        return this.f74084B;
    }

    /* renamed from: l */
    public String mo106086l() {
        return this.f74085C;
    }

    /* renamed from: m */
    public long mo106089m() {
        return this.f74119k;
    }

    /* renamed from: n */
    public long mo106092n() {
        return this.f74120l;
    }

    /* renamed from: o */
    public long mo106095o() {
        return this.f74121m;
    }

    /* renamed from: p */
    public String mo106098p() {
        return this.f74112d;
    }

    /* renamed from: q */
    public FeedCard.Type mo106101q() {
        return this.f74113e;
    }

    /* renamed from: r */
    public String mo106104r() {
        return this.f74115g;
    }

    /* renamed from: s */
    public String mo106105s() {
        return this.f74116h;
    }

    /* renamed from: t */
    public long mo106106t() {
        return this.f74117i;
    }

    /* renamed from: u */
    public boolean mo106107u() {
        return this.f74118j;
    }

    /* renamed from: v */
    public boolean mo106108v() {
        return this.f74123o;
    }

    /* renamed from: w */
    public FeedCard.FeedType mo106109w() {
        return this.f74114f;
    }

    /* renamed from: x */
    public C29593a mo106110x() {
        return this.f74127s;
    }

    /* renamed from: y */
    public AtInfo mo106111y() {
        return this.f74124p;
    }

    /* renamed from: z */
    public MuteUrgentInfo mo106112z() {
        return this.f74126r;
    }

    /* renamed from: a */
    public boolean mo106027a() {
        return this.ag;
    }

    /* renamed from: a */
    public void mo106026a(boolean z) {
        this.ag = z;
    }

    /* renamed from: a */
    public void mo106024a(String str) {
        this.f74094L = str;
    }

    /* renamed from: a */
    public void mo106017a(Chat.Type type) {
        this.f74088F = type;
    }

    /* renamed from: a */
    public void mo106016a(Chat.ChatMode chatMode) {
        this.f74089G = chatMode;
    }

    /* renamed from: a */
    public void mo106019a(Chatter.ChatterType chatterType) {
        this.f74090H = chatterType;
    }

    /* renamed from: a */
    public void mo106025a(List<UrgentInfo> list) {
        this.f74095M = list;
    }

    /* renamed from: a */
    public void mo106023a(DocType docType) {
        this.f74084B = docType;
    }

    /* renamed from: a */
    public void mo106015a(MuteUrgentInfo yVar) {
        this.f74126r = yVar;
    }

    /* renamed from: a */
    public void mo106014a(HighPriorityDisplay gVar) {
        this.f74106X = gVar;
    }

    /* renamed from: a */
    public void mo106020a(Message.Type type) {
        this.f74131w = type;
    }

    /* renamed from: a */
    public void mo106021a(SystemMessageType systemMessageType) {
        this.f74132x = systemMessageType;
    }

    /* renamed from: a */
    public void mo106022a(DocMessage.Type type) {
        this.f74086D = type;
    }

    /* renamed from: a */
    public void mo106018a(TeamChatType teamChatType) {
        this.al = teamChatType;
    }

    public boolean af() {
        Message.Type type = this.f74131w;
        if (type != null && type == Message.Type.STICKER) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public boolean mo106073g() {
        if (this.f74090H == Chatter.ChatterType.BOT) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public boolean mo106079i() {
        return this.f74092J;
    }

    public String ah() {
        if (this.f74113e == FeedCard.Type.THREAD) {
            return ao();
        }
        if (mo106051c() == Chat.Type.P2P) {
            return mo106074h();
        }
        return mo106098p();
    }

    /* renamed from: e */
    public boolean mo106067e() {
        return this.f74093K;
    }

    /* renamed from: a */
    public void mo106004a(int i) {
        this.f74125q = i;
    }

    /* renamed from: e */
    public void mo106063e(long j) {
        this.f74122n = j;
    }

    /* renamed from: g */
    public void mo106071g(String str) {
        this.f74129u = str;
    }

    /* renamed from: i */
    public void mo106077i(String str) {
        this.af = str;
    }

    /* renamed from: a */
    public void mo106005a(long j) {
        this.f74119k = j;
    }

    /* renamed from: b */
    public void mo106046b(int i) {
        this.f74130v = i;
    }

    /* renamed from: c */
    public void mo106052c(int i) {
        this.ab = i;
    }

    /* renamed from: d */
    public void mo106059d(long j) {
        this.f74117i = j;
    }

    /* renamed from: e */
    public void mo106064e(String str) {
        this.f74115g = str;
    }

    /* renamed from: f */
    public void mo106069f(String str) {
        this.f74116h = str;
    }

    /* renamed from: g */
    public void mo106072g(boolean z) {
        this.f74096N = z;
    }

    /* renamed from: h */
    public void mo106075h(String str) {
        this.ad = str;
    }

    /* renamed from: i */
    public void mo106078i(boolean z) {
        this.f74083A = z;
    }

    /* renamed from: j */
    public void mo106081j(String str) {
        this.f74087E = str;
    }

    /* renamed from: k */
    public void mo106084k(String str) {
        this.ah = str;
    }

    /* renamed from: l */
    public void mo106087l(String str) {
        this.f74110b = str;
    }

    /* renamed from: m */
    public void mo106090m(String str) {
        this.f74111c = str;
    }

    /* renamed from: n */
    public void mo106093n(String str) {
        this.aa = str;
    }

    /* renamed from: o */
    public void mo106096o(String str) {
        this.ak = str;
    }

    /* renamed from: p */
    public void mo106099p(String str) {
        this.f175444ai = str;
    }

    /* renamed from: q */
    public void mo106102q(String str) {
        this.am = str;
    }

    /* renamed from: a */
    public void mo106006a(FeedCard.FeedType feedType) {
        this.f74114f = feedType;
    }

    /* renamed from: b */
    public void mo106047b(long j) {
        this.f74120l = j;
    }

    /* renamed from: c */
    public void mo106053c(long j) {
        this.f74121m = j;
    }

    /* renamed from: d */
    public void mo106060d(String str) {
        this.f74112d = str;
    }

    /* renamed from: e */
    public void mo106065e(List<ChatterCustomStatus> list) {
        this.an = list;
    }

    /* renamed from: f */
    public void mo106070f(boolean z) {
        this.f74097O = z;
    }

    /* renamed from: h */
    public void mo106076h(boolean z) {
        this.f74098P = z;
    }

    /* renamed from: j */
    public void mo106082j(boolean z) {
        this.f74107Y = z;
    }

    /* renamed from: k */
    public void mo106085k(boolean z) {
        this.ae = z;
    }

    /* renamed from: l */
    public void mo106088l(boolean z) {
        this.f74099Q = z;
    }

    /* renamed from: m */
    public void mo106091m(boolean z) {
        this.f74100R = z;
    }

    /* renamed from: n */
    public void mo106094n(boolean z) {
        this.f74101S = z;
    }

    /* renamed from: o */
    public void mo106097o(boolean z) {
        this.aj = z;
    }

    /* renamed from: p */
    public void mo106100p(boolean z) {
        this.f74102T = z;
    }

    /* renamed from: q */
    public void mo106103q(boolean z) {
        this.f74103U = z;
    }

    /* renamed from: a */
    public int compareTo(FeedPreviewInfo feedPreviewInfo) {
        if (feedPreviewInfo == null) {
            return 0;
        }
        int i = (mo106092n() > feedPreviewInfo.mo106092n() ? 1 : (mo106092n() == feedPreviewInfo.mo106092n() ? 0 : -1));
        if (i < 0) {
            return 1;
        }
        if (i > 0) {
            return -1;
        }
        return 0;
    }

    /* renamed from: b */
    public void mo106048b(String str) {
        this.f74091I = str;
    }

    /* renamed from: c */
    public void mo106054c(String str) {
        this.f74085C = str;
    }

    /* renamed from: d */
    public void mo106061d(List<Tag> list) {
        this.f74104V = list;
    }

    /* renamed from: e */
    public void mo106066e(boolean z) {
        this.f74123o = z;
    }

    /* renamed from: a */
    public void mo106007a(FeedCard.Type type) {
        this.f74113e = type;
    }

    /* renamed from: b */
    public void mo106049b(List<AtInfo> list) {
        this.ac = list;
    }

    /* renamed from: c */
    public void mo106055c(List<Reaction> list) {
        this.f74108Z = list;
    }

    /* renamed from: d */
    public void mo106062d(boolean z) {
        this.f74118j = z;
    }

    /* renamed from: a */
    public void mo106008a(AtInfo atInfo) {
        this.f74124p = atInfo;
    }

    /* renamed from: b */
    public void mo106050b(boolean z) {
        this.f74093K = z;
    }

    /* renamed from: c */
    public void mo106056c(boolean z) {
        this.f74092J = z;
    }

    /* renamed from: a */
    public void mo106009a(CardContentType cardContentType) {
        this.f74133y = cardContentType;
    }

    /* renamed from: a */
    public void mo106010a(EntityStatus entityStatus) {
        this.f74128t = entityStatus;
    }

    /* renamed from: a */
    public void mo106011a(VideoChatContentType videoChatContentType) {
        this.f74134z = videoChatContentType;
    }

    /* renamed from: a */
    public void mo106012a(C29593a aVar) {
        this.f74127s = aVar;
    }

    /* renamed from: a */
    public void mo106013a(FocusInfo fVar) {
        this.f74105W = fVar;
    }
}
