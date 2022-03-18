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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.data.a.i */
public class C33222i implements AbstractC33959e<MessageInfo, ChatMessageVO> {

    /* renamed from: a */
    private C33221c f85488a = new C33221c();

    /* renamed from: b */
    private TextMsgConverter f85489b = new TextMsgConverter(false);

    /* renamed from: c */
    private PostMsgConverter f85490c = new PostMsgConverter(false);

    /* renamed from: d */
    private ImageMsgConverter f85491d = new ImageMsgConverter();

    /* renamed from: e */
    private StickerMsgConverter f85492e = new StickerMsgConverter();

    /* renamed from: f */
    private MediaMsgConverter f85493f = new MediaMsgConverter();

    /* renamed from: g */
    private FileMsgConverter f85494g = new FileMsgConverter();

    /* renamed from: h */
    private FolderMsgConverter f85495h = new FolderMsgConverter();

    /* renamed from: i */
    private AudioMsgConverter f85496i = new AudioMsgConverter();

    /* renamed from: j */
    private ShareGroupMsgConverter f85497j = new ShareGroupMsgConverter();

    /* renamed from: k */
    private MergeForwardMsgConverter f85498k = new MergeForwardMsgConverter();

    /* renamed from: l */
    private ThreadMergeForwardMsgConverter f85499l = new ThreadMergeForwardMsgConverter();

    /* renamed from: m */
    private UnKnownMsgConverter f85500m = new UnKnownMsgConverter();

    /* renamed from: n */
    private Map<Message.Type, List<IMsgVOConverter>> f85501n = new HashMap();

    public C33222i() {
        List<IOpenMessageCellFactory> a = C29990c.m110930b().mo134507F().mo134428a();
        if (!CollectionUtils.isEmpty(a)) {
            for (IOpenMessageCellFactory dVar : a) {
                m128414a(this.f85501n, new C33345b(dVar.mo120405b()));
            }
        }
        m128414a(this.f85501n, this.f85489b);
        m128414a(this.f85501n, this.f85490c);
        m128414a(this.f85501n, this.f85491d);
        m128414a(this.f85501n, this.f85492e);
        m128414a(this.f85501n, this.f85493f);
        m128414a(this.f85501n, this.f85494g);
        m128414a(this.f85501n, this.f85495h);
        m128414a(this.f85501n, this.f85496i);
        m128414a(this.f85501n, this.f85497j);
        m128414a(this.f85501n, this.f85498k);
        m128414a(this.f85501n, this.f85499l);
    }

    /* renamed from: a */
    public ChatMessageVO mo122490a(MessageInfo messageInfo, int i) {
        return m128413a(messageInfo, true);
    }

    /* renamed from: a */
    private void m128414a(Map<Message.Type, List<IMsgVOConverter>> map, IMsgVOConverter dVar) {
        List<IMsgVOConverter> list = map.get(dVar.mo122452a());
        if (list == null) {
            list = new ArrayList<>();
            map.put(dVar.mo122452a(), list);
        }
        list.add(dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v15, types: [com.ss.android.lark.chat.export.vo.a] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.ss.android.lark.chat.vo.ChatMessageVO m128413a(com.ss.android.lark.chat.entity.message.MessageInfo r9, boolean r10) {
        /*
        // Method dump skipped, instructions count: 439
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.chat.chatwindow.chat.data.p1620a.C33222i.m128413a(com.ss.android.lark.chat.entity.message.MessageInfo, boolean):com.ss.android.lark.chat.e.c");
    }
}
