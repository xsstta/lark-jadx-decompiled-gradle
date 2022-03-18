package com.ss.android.lark.chat.chatwindow.chat.data.p1620a;

import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.chatwindow.chat.message.p1627d.C33345b;
import com.ss.android.lark.chat.core.model.AbstractC33959e;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.export.ui.message.IOpenMessageCellFactory;
import com.ss.android.lark.chat.vo.ChatMessageVO;
import com.ss.android.lark.chat.vo.IMsgVOConverter;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.data.a.b */
public class C33220b implements AbstractC33959e<MessageInfo, ChatMessageVO<?>> {

    /* renamed from: a */
    private final C33221c f85462a;

    /* renamed from: b */
    private final TextMsgConverter f85463b;

    /* renamed from: c */
    private final PostMsgConverter f85464c;

    /* renamed from: d */
    private final ImageMsgConverter f85465d;

    /* renamed from: e */
    private final StickerMsgConverter f85466e;

    /* renamed from: f */
    private final MediaMsgConverter f85467f;

    /* renamed from: g */
    private final FileMsgConverter f85468g;

    /* renamed from: h */
    private final FolderMsgConverter f85469h;

    /* renamed from: i */
    private final AudioMsgConverter f85470i;

    /* renamed from: j */
    private final MergeForwardMsgConverter f85471j;

    /* renamed from: k */
    private final ThreadMergeForwardMsgConverter f85472k;

    /* renamed from: l */
    private final ShareGroupMsgConverter f85473l;

    /* renamed from: m */
    private final SystemMsgConverter f85474m;

    /* renamed from: n */
    private final UnKnownMsgConverter f85475n;

    /* renamed from: o */
    private final Map<Message.Type, List<IMsgVOConverter>> f85476o;

    /* renamed from: p */
    private final boolean f85477p;

    /* renamed from: a */
    private boolean m128390a() {
        return !DesktopUtil.m144301a(UIHelper.getContext());
    }

    public C33220b(boolean z) {
        this(z, false);
    }

    /* renamed from: a */
    public ChatMessageVO mo122490a(MessageInfo messageInfo, int i) {
        return m128388a(messageInfo, true);
    }

    /* renamed from: a */
    private void m128389a(Map<Message.Type, List<IMsgVOConverter>> map, IMsgVOConverter dVar) {
        List<IMsgVOConverter> list = map.get(dVar.mo122452a());
        if (list == null) {
            list = new ArrayList<>();
            map.put(dVar.mo122452a(), list);
        }
        list.add(dVar);
    }

    public C33220b(boolean z, boolean z2) {
        this.f85462a = new C33221c();
        this.f85463b = new TextMsgConverter(m128390a());
        this.f85464c = new PostMsgConverter(m128390a());
        this.f85465d = new ImageMsgConverter();
        this.f85466e = new StickerMsgConverter();
        this.f85467f = new MediaMsgConverter();
        this.f85468g = new FileMsgConverter();
        this.f85469h = new FolderMsgConverter();
        this.f85470i = new AudioMsgConverter();
        this.f85471j = new MergeForwardMsgConverter();
        this.f85472k = new ThreadMergeForwardMsgConverter();
        this.f85473l = new ShareGroupMsgConverter();
        this.f85474m = new SystemMsgConverter();
        this.f85475n = new UnKnownMsgConverter();
        this.f85476o = new HashMap();
        this.f85477p = z2;
        List<IOpenMessageCellFactory> a = C29990c.m110930b().mo134507F().mo134428a();
        if (!CollectionUtils.isEmpty(a)) {
            for (IOpenMessageCellFactory dVar : a) {
                m128389a(this.f85476o, new C33345b(dVar.mo120405b()));
            }
        }
        if (!z) {
            this.f85463b.mo122504a(false);
            this.f85464c.mo122499a(false);
        }
        m128389a(this.f85476o, this.f85463b);
        m128389a(this.f85476o, this.f85464c);
        m128389a(this.f85476o, this.f85465d);
        m128389a(this.f85476o, this.f85466e);
        m128389a(this.f85476o, this.f85467f);
        m128389a(this.f85476o, this.f85468g);
        m128389a(this.f85476o, this.f85469h);
        m128389a(this.f85476o, this.f85470i);
        m128389a(this.f85476o, this.f85471j);
        m128389a(this.f85476o, this.f85472k);
        m128389a(this.f85476o, this.f85473l);
        m128389a(this.f85476o, this.f85474m);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [com.ss.android.lark.chat.export.vo.a] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.ss.android.lark.chat.vo.ChatMessageVO m128388a(com.ss.android.lark.chat.entity.message.MessageInfo r12, boolean r13) {
        /*
        // Method dump skipped, instructions count: 573
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.chat.chatwindow.chat.data.p1620a.C33220b.m128388a(com.ss.android.lark.chat.entity.message.MessageInfo, boolean):com.ss.android.lark.chat.e.c");
    }
}
