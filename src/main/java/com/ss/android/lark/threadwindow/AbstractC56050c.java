package com.ss.android.lark.threadwindow;

import android.content.Context;
import android.view.View;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.biz.im.api.ThreadTopic;
import com.ss.android.lark.chat.base.view.vo.ThreadMessageVO;
import com.ss.android.lark.chat.core.model.AbstractC33964i;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chat.PickChatEntity;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.entity.sticker.Sticker;
import com.ss.android.lark.chat.entity.thread.ThreadInfo;
import com.ss.android.lark.chat.entity.thread.TopicGroup;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.dependency.AbstractC36459ag;
import com.ss.android.lark.dto.chat.ChatChatterResponse;
import com.ss.android.lark.dto.group.GroupRecallEntity;
import com.ss.android.lark.dto.translate.TranslateState;
import com.ss.android.lark.member_manage.export.p2253a.AbstractC44896a;
import com.ss.android.lark.threadtab.p2758b.AbstractC55981b;
import com.ss.android.lark.widget.richtext.RichText;
import java.util.List;

/* renamed from: com.ss.android.lark.threadwindow.c */
public interface AbstractC56050c {

    /* renamed from: com.ss.android.lark.threadwindow.c$a */
    public interface AbstractC56051a extends AbstractC55981b {

        /* renamed from: com.ss.android.lark.threadwindow.c$a$a */
        public interface AbstractC56052a {
            /* renamed from: a */
            void mo191159a();

            /* renamed from: a */
            void mo191160a(int i);

            /* renamed from: a */
            void mo191161a(int i, AbstractC33964i<ThreadInfo> iVar);

            /* renamed from: a */
            void mo191162a(Context context, boolean z);

            /* renamed from: a */
            void mo191163a(ErrorResult errorResult);

            /* renamed from: a */
            void mo191164a(AbstractC33964i<ThreadInfo> iVar);

            /* renamed from: a */
            void mo191165a(Chat chat);

            /* renamed from: a */
            void mo191166a(MessageInfo messageInfo);

            /* renamed from: a */
            void mo191167a(ThreadInfo threadInfo);

            /* renamed from: a */
            void mo191168a(TopicGroup topicGroup);

            /* renamed from: a */
            void mo191169a(TranslateState translateState);

            /* renamed from: a */
            void mo191170a(String str);

            /* renamed from: a */
            void mo191171a(boolean z);

            /* renamed from: b */
            void mo191172b();

            /* renamed from: b */
            void mo191173b(int i);

            /* renamed from: b */
            void mo191174b(ErrorResult errorResult);

            /* renamed from: b */
            void mo191175b(Chat chat);

            /* renamed from: b */
            void mo191176b(String str);

            /* renamed from: c */
            void mo191177c();

            /* renamed from: c */
            void mo191178c(int i);

            /* renamed from: c */
            void mo191179c(ErrorResult errorResult);

            /* renamed from: d */
            void mo191180d();

            /* renamed from: e */
            void mo191181e();

            /* renamed from: f */
            int mo191182f();

            /* renamed from: g */
            void mo191183g();

            /* renamed from: h */
            int mo191184h();

            /* renamed from: i */
            void mo191185i();
        }

        /* renamed from: a */
        void mo191106a(int i, IGetDataCallback<AbstractC33964i<ThreadInfo>> iGetDataCallback);

        /* renamed from: a */
        void mo191107a(Context context, AbstractC44896a aVar);

        /* renamed from: a */
        void mo191108a(Context context, String str);

        /* renamed from: a */
        void mo191109a(Context context, boolean z, AbstractC44896a aVar);

        /* renamed from: a */
        void mo191110a(IGetDataCallback<AbstractC33964i<ThreadInfo>> iGetDataCallback);

        /* renamed from: a */
        void mo191111a(IGetDataCallback<AbstractC33964i<ThreadInfo>> iGetDataCallback, int i);

        /* renamed from: a */
        void mo191112a(Sticker sticker, IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: a */
        void mo191113a(String str, RichText richText);

        /* renamed from: a */
        void mo191114a(String str, RichText richText, boolean z);

        /* renamed from: a */
        void mo191115a(String str, String str2, Message.SourceType sourceType, IGetDataCallback<String> iGetDataCallback);

        /* renamed from: a */
        void mo191116a(String str, String str2, String str3, Message.SourceType sourceType, IGetDataCallback<String> iGetDataCallback);

        /* renamed from: a */
        void mo191117a(String str, List<GroupRecallEntity> list, IGetDataCallback<List<GroupRecallEntity>> iGetDataCallback);

        /* renamed from: a */
        void mo191118a(String str, List<String> list, List<PickChatEntity> list2, IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: a */
        void mo191119a(List<String> list);

        /* renamed from: a */
        void mo191120a(List<String> list, int i);

        /* renamed from: a */
        boolean mo191121a(int i);

        /* renamed from: b */
        void mo191122b();

        /* renamed from: b */
        void mo191123b(int i, IGetDataCallback<AbstractC33964i<ThreadInfo>> iGetDataCallback);

        /* renamed from: b */
        void mo191124b(Context context, String str);

        /* renamed from: b */
        void mo191125b(IGetDataCallback<AbstractC33964i<ThreadInfo>> iGetDataCallback);

        /* renamed from: b */
        void mo191126b(String str, int i);

        /* renamed from: b */
        void mo191127b(String str, IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: b */
        void mo191128b(String str, boolean z);

        /* renamed from: b */
        boolean mo191129b(int i);

        /* renamed from: c */
        int mo191130c();

        /* renamed from: c */
        void mo191131c(int i, IGetDataCallback<AbstractC33964i<ThreadInfo>> iGetDataCallback);

        /* renamed from: c */
        void mo191132c(Context context, String str);

        /* renamed from: c */
        void mo191133c(IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: c */
        void mo191134c(String str, IGetDataCallback<String> iGetDataCallback);

        /* renamed from: c */
        boolean mo191135c(int i);

        /* renamed from: d */
        void mo191136d(int i);

        /* renamed from: d */
        void mo191137d(int i, IGetDataCallback<AbstractC33964i<ThreadInfo>> iGetDataCallback);

        /* renamed from: d */
        void mo191138d(IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: d */
        void mo191139d(String str, IGetDataCallback<ChatChatterResponse> iGetDataCallback);

        /* renamed from: d */
        boolean mo191140d();

        /* renamed from: e */
        void mo191141e(int i);

        /* renamed from: e */
        void mo191142e(IGetDataCallback<List<MessageInfo>> iGetDataCallback);

        /* renamed from: e */
        boolean mo191143e();

        /* renamed from: f */
        int mo191144f();

        /* renamed from: g */
        boolean mo191145g();

        /* renamed from: h */
        Chat mo191146h();

        /* renamed from: i */
        String mo191147i();

        /* renamed from: j */
        RichText mo191148j();

        /* renamed from: k */
        boolean mo191149k();

        /* renamed from: l */
        boolean mo191150l();

        /* renamed from: m */
        void mo191151m();

        /* renamed from: n */
        boolean mo191152n();

        /* renamed from: o */
        void mo191153o();

        /* renamed from: p */
        void mo191154p();

        /* renamed from: q */
        boolean mo191155q();

        /* renamed from: r */
        void mo191156r();

        /* renamed from: s */
        boolean mo191157s();

        /* renamed from: t */
        boolean mo191158t();
    }

    /* renamed from: com.ss.android.lark.threadwindow.c$b */
    public interface AbstractC56053b extends IView<AbstractC56054a> {

        /* renamed from: com.ss.android.lark.threadwindow.c$b$a */
        public interface AbstractC56054a extends IView.IViewDelegate {
            /* renamed from: a */
            Message mo191186a(String str, int i);

            /* renamed from: a */
            void mo191187a(int i, boolean z);

            /* renamed from: a */
            void mo191188a(Context context);

            /* renamed from: a */
            void mo191189a(Context context, View view, String str);

            /* renamed from: a */
            void mo191190a(Context context, boolean z, boolean z2);

            /* renamed from: a */
            void mo191191a(View view, String str, boolean z, int i);

            /* renamed from: a */
            void mo191192a(AbsMessageVO aVar, int i);

            /* renamed from: a */
            void mo191193a(Sticker sticker, IGetDataCallback<Boolean> iGetDataCallback);

            /* renamed from: a */
            void mo191194a(String str);

            /* renamed from: a */
            void mo191195a(String str, int i, Chat chat, int i2);

            /* renamed from: a */
            void mo191196a(String str, int i, AbstractC36459ag.AbstractC36460a aVar);

            /* renamed from: a */
            void mo191197a(String str, IGetDataCallback<ChatChatterResponse> iGetDataCallback);

            /* renamed from: a */
            void mo191198a(String str, Chat chat, int i);

            /* renamed from: a */
            void mo191199a(String str, Chat chat, boolean z, boolean z2, int i);

            /* renamed from: a */
            void mo191200a(String str, String str2, int i);

            /* renamed from: a */
            void mo191201a(String str, String str2, int i, String str3, int i2);

            /* renamed from: a */
            void mo191202a(String str, String str2, Message.SourceType sourceType);

            /* renamed from: a */
            void mo191203a(String str, String str2, String str3, Message.SourceType sourceType);

            /* renamed from: a */
            void mo191204a(String str, String str2, boolean z);

            /* renamed from: a */
            void mo191205a(String str, List<GroupRecallEntity> list);

            /* renamed from: a */
            void mo191206a(String str, List<GroupRecallEntity> list, IGetDataCallback<List<GroupRecallEntity>> iGetDataCallback);

            /* renamed from: a */
            void mo191207a(String str, boolean z);

            /* renamed from: a */
            void mo191208a(String str, boolean z, int i);

            /* renamed from: a */
            void mo191209a(List<String> list);

            /* renamed from: a */
            void mo191210a(List<String> list, int i);

            /* renamed from: a */
            boolean mo191211a();

            /* renamed from: a */
            boolean mo191212a(int i);

            /* renamed from: b */
            void mo191213b();

            /* renamed from: b */
            void mo191214b(int i);

            /* renamed from: b */
            void mo191215b(String str);

            /* renamed from: b */
            void mo191216b(String str, int i);

            /* renamed from: c */
            void mo191217c(String str);

            /* renamed from: c */
            void mo191218c(String str, int i);

            /* renamed from: c */
            boolean mo191219c();

            /* renamed from: c */
            boolean mo191220c(int i);

            /* renamed from: d */
            void mo191221d();

            /* renamed from: d */
            void mo191222d(int i);

            /* renamed from: d */
            void mo191223d(String str);

            /* renamed from: e */
            void mo191224e();

            /* renamed from: e */
            void mo191225e(int i);

            /* renamed from: e */
            void mo191226e(String str);

            /* renamed from: f */
            void mo191227f();

            /* renamed from: f */
            void mo191228f(int i);

            /* renamed from: f */
            void mo191229f(String str);

            /* renamed from: g */
            void mo191230g(String str);

            /* renamed from: g */
            boolean mo191231g();

            /* renamed from: h */
            void mo191232h(String str);

            /* renamed from: h */
            boolean mo191233h();

            /* renamed from: i */
            void mo191234i();

            /* renamed from: j */
            void mo191235j();

            /* renamed from: k */
            int mo191236k();

            /* renamed from: l */
            void mo191237l();

            /* renamed from: m */
            void mo191238m();
        }

        /* renamed from: a */
        void mo190891a();

        /* renamed from: a */
        void mo190892a(int i);

        /* renamed from: a */
        void mo190893a(int i, int i2);

        /* renamed from: a */
        void mo190894a(int i, int i2, boolean z);

        /* renamed from: a */
        void mo190895a(int i, boolean z);

        /* renamed from: a */
        void mo190896a(int i, boolean z, List<ThreadMessageVO> list);

        /* renamed from: a */
        void mo190898a(ErrorResult errorResult);

        /* renamed from: a */
        void mo190899a(Chat chat);

        /* renamed from: a */
        void mo190900a(Chat chat, String str, RichText richText, boolean z);

        /* renamed from: a */
        void mo190901a(Message message);

        /* renamed from: a */
        void mo190902a(MessageInfo messageInfo);

        /* renamed from: a */
        void mo190903a(MessageInfo messageInfo, AbstractC36459ag.AbstractC36460a aVar);

        /* renamed from: a */
        void mo190904a(TopicGroup topicGroup);

        /* renamed from: a */
        void mo190905a(TranslateState translateState);

        /* renamed from: a */
        void mo190907a(Boolean bool);

        /* renamed from: a */
        void mo190908a(String str);

        /* renamed from: a */
        void mo190909a(String str, ThreadTopic threadTopic, Chat chat, boolean z, boolean z2, boolean z3, int i);

        /* renamed from: a */
        void mo190910a(List<MessageInfo> list);

        /* renamed from: a */
        void mo190911a(boolean z);

        /* renamed from: a */
        void mo190912a(boolean z, Chat chat, List<String> list);

        /* renamed from: a */
        void mo190913a(boolean z, List<ThreadMessageVO> list);

        /* renamed from: b */
        void mo190914b();

        /* renamed from: b */
        void mo190915b(int i);

        /* renamed from: b */
        void mo190917b(ErrorResult errorResult);

        /* renamed from: b */
        void mo190918b(Chat chat);

        /* renamed from: b */
        void mo190919b(Message message);

        /* renamed from: b */
        void mo190920b(String str);

        /* renamed from: c */
        void mo190922c();

        /* renamed from: c */
        void mo190924c(ErrorResult errorResult);

        /* renamed from: c */
        void mo190925c(Chat chat);

        /* renamed from: c */
        void mo190926c(Message message);

        /* renamed from: c */
        void mo190927c(String str);

        /* renamed from: d */
        void mo190928d();

        /* renamed from: d */
        void mo190930d(String str);

        /* renamed from: e */
        void mo190931e();

        /* renamed from: e */
        void mo190932e(String str);

        /* renamed from: f */
        void mo190933f();

        /* renamed from: g */
        void mo190934g();

        /* renamed from: h */
        void mo190935h();

        /* renamed from: i */
        void mo190936i();

        /* renamed from: j */
        void mo190937j();

        /* renamed from: k */
        void mo190938k();

        /* renamed from: l */
        void mo190939l();

        /* renamed from: m */
        int mo190940m();

        /* renamed from: n */
        void mo190941n();

        /* renamed from: o */
        void mo190942o();

        /* renamed from: p */
        void mo190943p();

        /* renamed from: q */
        void mo190944q();

        /* renamed from: r */
        void mo190945r();

        /* renamed from: s */
        void mo190946s();

        /* renamed from: t */
        boolean mo190947t();

        /* renamed from: u */
        boolean mo190948u();

        /* renamed from: v */
        int mo190949v();
    }
}
