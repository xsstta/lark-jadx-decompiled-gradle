package com.ss.android.lark.threaddetail;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.biz.im.api.ThreadTopic;
import com.ss.android.lark.chat.core.model.AbstractC33964i;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.favorite.FavoriteMessageInfo;
import com.ss.android.lark.chat.entity.image.ImageSet;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.entity.reaction.ReactionInfo;
import com.ss.android.lark.chat.entity.sticker.Sticker;
import com.ss.android.lark.chat.entity.thread.TopicGroup;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.chatwindow.p1720a.p1721a.C35218a;
import com.ss.android.lark.chatwindow.p1720a.p1721a.C35221d;
import com.ss.android.lark.dependency.IStickerDependency;
import com.ss.android.lark.dto.chat.ChatChatterResponse;
import com.ss.android.lark.dto.translate.TranslateState;
import com.ss.android.lark.threaddetail.view.p2755c.C55905a;
import com.ss.android.lark.widget.photo_picker.entity.Photo;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import com.ss.android.lark.widget.richtext.RichText;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.threaddetail.a */
public interface AbstractC55766a {

    /* renamed from: com.ss.android.lark.threaddetail.a$a */
    public interface AbstractC55767a extends IModel {

        /* renamed from: com.ss.android.lark.threaddetail.a$a$a */
        public interface AbstractC55768a {
            /* renamed from: a */
            void mo190129a();

            /* renamed from: a */
            void mo190130a(Context context, boolean z);

            /* renamed from: a */
            void mo190131a(Chat chat);

            /* renamed from: a */
            void mo190132a(TranslateState translateState);

            /* renamed from: a */
            void mo190133a(String str);

            /* renamed from: a */
            void mo190134a(String str, int i);

            /* renamed from: a */
            void mo190135a(List<MessageInfo> list);

            /* renamed from: a */
            void mo190136a(boolean z);

            /* renamed from: a */
            void mo190137a(boolean z, boolean z2, String str, int i);

            /* renamed from: b */
            void mo190138b();

            /* renamed from: b */
            void mo190139b(String str, int i);

            /* renamed from: b */
            void mo190140b(boolean z);

            /* renamed from: c */
            void mo190141c();

            /* renamed from: c */
            void mo190142c(String str, int i);

            /* renamed from: d */
            void mo190143d();

            /* renamed from: e */
            void mo190144e();

            /* renamed from: f */
            void mo190145f();
        }

        /* renamed from: A */
        boolean mo190046A();

        /* renamed from: B */
        boolean mo190047B();

        /* renamed from: C */
        TopicGroup mo190048C();

        /* renamed from: D */
        boolean mo190049D();

        /* renamed from: E */
        boolean mo190050E();

        /* renamed from: F */
        List<MessageInfo> mo190051F();

        /* renamed from: G */
        void mo190052G();

        /* renamed from: a */
        Message mo190053a(Message message, int i, ByteBuffer byteBuffer, boolean z, boolean z2, IGetDataCallback iGetDataCallback);

        /* renamed from: a */
        Message mo190054a(String str, String str2, String str3, String str4);

        /* renamed from: a */
        String mo190055a(String str, String str2, String str3);

        /* renamed from: a */
        void mo190056a(int i, IGetDataCallback<AbstractC33964i<MessageInfo>> iGetDataCallback);

        /* renamed from: a */
        void mo190057a(Context context, String str);

        /* renamed from: a */
        void mo190058a(IGetDataCallback<AbstractC33964i<MessageInfo>> iGetDataCallback);

        /* renamed from: a */
        void mo190059a(IGetDataCallback<AbstractC33964i<MessageInfo>> iGetDataCallback, int i);

        /* renamed from: a */
        void mo190060a(UIGetDataCallback uIGetDataCallback);

        /* renamed from: a */
        void mo190061a(Message message, String str, String str2, int i);

        /* renamed from: a */
        void mo190062a(MessageInfo messageInfo);

        /* renamed from: a */
        void mo190063a(MessageInfo messageInfo, IGetDataCallback<String> iGetDataCallback);

        /* renamed from: a */
        void mo190064a(Sticker sticker, IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: a */
        void mo190065a(IStickerDependency.StickerFileInfo stickerFileInfo);

        /* renamed from: a */
        void mo190066a(C55795c cVar);

        /* renamed from: a */
        void mo190067a(String str);

        /* renamed from: a */
        void mo190068a(String str, int i);

        /* renamed from: a */
        void mo190069a(String str, IGetDataCallback<String> iGetDataCallback);

        /* renamed from: a */
        void mo190070a(String str, UIGetDataCallback<C35221d> uIGetDataCallback);

        /* renamed from: a */
        void mo190071a(String str, RichText richText, String str2, RichText richText2, boolean z);

        /* renamed from: a */
        void mo190072a(String str, String str2);

        /* renamed from: a */
        void mo190073a(String str, String str2, IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: a */
        void mo190074a(String str, String str2, Message.SourceType sourceType, IGetDataCallback<String> iGetDataCallback);

        /* renamed from: a */
        void mo190075a(String str, String str2, RichText richText);

        /* renamed from: a */
        void mo190076a(String str, String str2, String str3, Message.SourceType sourceType, IGetDataCallback<String> iGetDataCallback);

        /* renamed from: a */
        void mo190077a(String str, List<ReactionInfo> list, String str2);

        /* renamed from: a */
        void mo190078a(String str, boolean z);

        /* renamed from: a */
        void mo190079a(String str, boolean z, IGetDataCallback<String> iGetDataCallback);

        /* renamed from: a */
        void mo190080a(List<MessageInfo> list);

        /* renamed from: a */
        void mo190081a(List<String> list, IGetDataCallback<List<FavoriteMessageInfo>> iGetDataCallback);

        /* renamed from: a */
        void mo190082a(List<Photo> list, String str, String str2);

        /* renamed from: a */
        void mo190083a(List<String> list, boolean z, String str, String str2);

        /* renamed from: a */
        void mo190084a(boolean z, IGetDataCallback<Void> iGetDataCallback);

        /* renamed from: a */
        boolean mo190085a();

        /* renamed from: a */
        boolean mo190086a(int i);

        /* renamed from: b */
        MessageInfo mo190087b(String str);

        /* renamed from: b */
        List<ImageSet> mo190088b(String str, boolean z);

        /* renamed from: b */
        void mo190089b(int i);

        /* renamed from: b */
        void mo190090b(IGetDataCallback<AbstractC33964i<MessageInfo>> iGetDataCallback);

        /* renamed from: b */
        void mo190091b(String str, IGetDataCallback<ChatChatterResponse> iGetDataCallback);

        /* renamed from: b */
        void mo190092b(String str, String str2);

        /* renamed from: b */
        void mo190093b(String str, String str2, RichText richText);

        /* renamed from: b */
        void mo190094b(List<File> list);

        /* renamed from: b */
        void mo190095b(List<String> list, IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: b */
        void mo190096b(boolean z);

        /* renamed from: b */
        boolean mo190097b();

        /* renamed from: c */
        String mo190098c();

        /* renamed from: c */
        void mo190099c(int i);

        /* renamed from: c */
        void mo190100c(IGetDataCallback<Chat> iGetDataCallback);

        /* renamed from: c */
        void mo190101c(String str);

        /* renamed from: c */
        void mo190102c(String str, String str2);

        /* renamed from: c */
        void mo190103c(boolean z);

        /* renamed from: d */
        void mo190104d(IGetDataCallback<Void> iGetDataCallback);

        /* renamed from: d */
        boolean mo190105d();

        /* renamed from: e */
        Chatter mo190106e();

        /* renamed from: e */
        void mo190107e(IGetDataCallback<Long> iGetDataCallback);

        /* renamed from: f */
        void mo190108f();

        /* renamed from: g */
        Chat mo190109g();

        /* renamed from: h */
        String mo190110h();

        /* renamed from: i */
        ChatChatter mo190111i();

        /* renamed from: j */
        void mo190112j();

        /* renamed from: k */
        String mo190113k();

        /* renamed from: l */
        boolean mo190114l();

        /* renamed from: m */
        boolean mo190115m();

        /* renamed from: n */
        boolean mo190116n();

        /* renamed from: o */
        ThreadTopic mo190117o();

        /* renamed from: p */
        int mo190118p();

        /* renamed from: q */
        void mo190119q();

        /* renamed from: r */
        Chatter mo190120r();

        /* renamed from: s */
        C35218a mo190121s();

        /* renamed from: t */
        String mo190122t();

        /* renamed from: u */
        String mo190123u();

        /* renamed from: v */
        boolean mo190124v();

        /* renamed from: w */
        int mo190125w();

        /* renamed from: x */
        MessageInfo mo190126x();

        /* renamed from: y */
        String mo190127y();

        /* renamed from: z */
        boolean mo190128z();
    }

    /* renamed from: com.ss.android.lark.threaddetail.a$b */
    public interface AbstractC55769b extends IView<AbstractC55770a> {

        /* renamed from: com.ss.android.lark.threaddetail.a$b$a */
        public interface AbstractC55770a extends IView.IViewDelegate {

            /* renamed from: com.ss.android.lark.threaddetail.a$b$a$a */
            public interface AbstractC55771a {
                /* renamed from: a */
                void mo190260a(RichText richText, String str, RichText richText2);
            }

            /* renamed from: a */
            Message mo190187a(Message message, int i, ByteBuffer byteBuffer, boolean z, boolean z2, IGetDataCallback iGetDataCallback);

            /* renamed from: a */
            Message mo190188a(String str, String str2, String str3, String str4);

            /* renamed from: a */
            String mo190189a(String str, String str2, String str3);

            /* renamed from: a */
            void mo190190a();

            /* renamed from: a */
            void mo190191a(int i);

            /* renamed from: a */
            void mo190192a(int i, boolean z);

            /* renamed from: a */
            void mo190193a(Context context, String str);

            /* renamed from: a */
            void mo190194a(Context context, String str, String str2, Message.SourceType sourceType);

            /* renamed from: a */
            void mo190195a(View view, PhotoItem photoItem, List<PhotoItem> list, boolean z, int i);

            /* renamed from: a */
            void mo190196a(ErrorResult errorResult);

            /* renamed from: a */
            void mo190197a(IGetDataCallback<Long> iGetDataCallback);

            /* renamed from: a */
            void mo190198a(AbsMessageVO aVar);

            /* renamed from: a */
            void mo190199a(Chat chat, String str);

            /* renamed from: a */
            void mo190200a(Message message, String str, String str2, int i);

            /* renamed from: a */
            void mo190201a(Message message, boolean z, String str, String str2);

            /* renamed from: a */
            void mo190202a(MessageInfo messageInfo);

            /* renamed from: a */
            void mo190203a(Sticker sticker, IGetDataCallback<Boolean> iGetDataCallback);

            /* renamed from: a */
            void mo190204a(IStickerDependency.StickerFileInfo stickerFileInfo);

            /* renamed from: a */
            void mo190205a(AbstractC55771a aVar);

            /* renamed from: a */
            void mo190206a(String str);

            /* renamed from: a */
            void mo190207a(String str, IGetDataCallback<String> iGetDataCallback);

            /* renamed from: a */
            void mo190208a(String str, RichText richText, String str2, RichText richText2, boolean z);

            /* renamed from: a */
            void mo190209a(String str, String str2);

            /* renamed from: a */
            void mo190210a(String str, String str2, RichText richText);

            /* renamed from: a */
            void mo190211a(String str, String str2, String str3, Message.SourceType sourceType);

            /* renamed from: a */
            void mo190212a(String str, String str2, String str3, RichText richText);

            /* renamed from: a */
            void mo190213a(String str, List<ReactionInfo> list, String str2);

            /* renamed from: a */
            void mo190214a(String str, boolean z);

            /* renamed from: a */
            void mo190215a(String str, boolean z, IGetDataCallback<String> iGetDataCallback);

            /* renamed from: a */
            void mo190216a(ArrayList<File> arrayList);

            /* renamed from: a */
            void mo190217a(List<MessageInfo> list);

            /* renamed from: a */
            void mo190218a(List<Photo> list, String str, String str2);

            /* renamed from: a */
            void mo190219a(List<String> list, boolean z, String str, String str2);

            /* renamed from: a */
            void mo190220a(boolean z);

            /* renamed from: b */
            MessageInfo mo190221b(String str);

            /* renamed from: b */
            List<ImageSet> mo190222b(String str, boolean z);

            /* renamed from: b */
            void mo190223b();

            /* renamed from: b */
            void mo190224b(int i);

            /* renamed from: b */
            void mo190225b(Context context, String str);

            /* renamed from: b */
            void mo190226b(String str, IGetDataCallback<ChatChatterResponse> iGetDataCallback);

            /* renamed from: b */
            void mo190227b(String str, String str2);

            /* renamed from: b */
            void mo190228b(List<String> list);

            /* renamed from: b */
            void mo190229b(boolean z);

            /* renamed from: c */
            void mo190230c();

            /* renamed from: c */
            void mo190231c(Context context, String str);

            /* renamed from: c */
            void mo190232c(String str);

            /* renamed from: c */
            void mo190233c(String str, String str2);

            /* renamed from: c */
            void mo190234c(List<String> list);

            /* renamed from: d */
            void mo190235d(String str);

            /* renamed from: d */
            boolean mo190236d();

            /* renamed from: e */
            void mo190237e();

            /* renamed from: e */
            void mo190238e(String str);

            /* renamed from: f */
            boolean mo190239f();

            /* renamed from: g */
            void mo190240g();

            /* renamed from: h */
            String mo190241h();

            /* renamed from: i */
            String mo190242i();

            /* renamed from: j */
            Chatter mo190243j();

            /* renamed from: k */
            Chat mo190244k();

            /* renamed from: l */
            String mo190245l();

            /* renamed from: m */
            ChatChatter mo190246m();

            /* renamed from: n */
            ThreadTopic mo190247n();

            /* renamed from: o */
            boolean mo190248o();

            /* renamed from: p */
            Chatter mo190249p();

            /* renamed from: q */
            String mo190250q();

            /* renamed from: r */
            String mo190251r();

            /* renamed from: s */
            void mo190252s();

            /* renamed from: t */
            MessageInfo mo190253t();

            /* renamed from: u */
            boolean mo190254u();

            /* renamed from: v */
            boolean mo190255v();

            /* renamed from: w */
            boolean mo190256w();

            /* renamed from: x */
            boolean mo190257x();

            /* renamed from: y */
            boolean mo190258y();

            /* renamed from: z */
            void mo190259z();
        }

        /* renamed from: a */
        void mo190146a();

        /* renamed from: a */
        void mo190147a(int i, List<PhotoItem> list, View view, boolean z, int i2);

        /* renamed from: a */
        void mo190148a(int i, boolean z, boolean z2);

        /* renamed from: a */
        void mo190149a(ErrorResult errorResult);

        /* renamed from: a */
        void mo190150a(Chat chat);

        /* renamed from: a */
        void mo190151a(C35221d dVar, boolean z, boolean z2);

        /* renamed from: a */
        void mo190152a(TranslateState translateState);

        /* renamed from: a */
        void mo190153a(RichText richText, String str, RichText richText2);

        /* renamed from: a */
        void mo190154a(List<C55905a> list);

        /* renamed from: a */
        void mo190155a(List<C55905a> list, long j);

        /* renamed from: a */
        void mo190156a(List<C55905a> list, boolean z, boolean z2);

        /* renamed from: a */
        void mo190157a(boolean z);

        /* renamed from: a */
        void mo190158a(boolean z, boolean z2, boolean z3);

        /* renamed from: a */
        boolean mo190159a(int i, int i2, Intent intent);

        /* renamed from: b */
        void mo190160b();

        /* renamed from: b */
        void mo190161b(String str);

        /* renamed from: b */
        void mo190162b(List<MessageInfo> list);

        /* renamed from: b */
        void mo190163b(boolean z);

        /* renamed from: c */
        void mo190164c();

        /* renamed from: c */
        void mo190165c(String str);

        /* renamed from: c */
        void mo190166c(List<MessageInfo> list);

        /* renamed from: c */
        void mo190167c(boolean z);

        /* renamed from: d */
        void mo190168d();

        /* renamed from: d */
        void mo190169d(String str);

        /* renamed from: e */
        void mo190170e();

        /* renamed from: e */
        void mo190171e(String str);

        /* renamed from: f */
        boolean mo190172f();

        /* renamed from: g */
        void mo190173g();

        /* renamed from: h */
        void mo190174h();

        /* renamed from: i */
        void mo190175i();

        /* renamed from: j */
        void mo190176j();

        /* renamed from: k */
        void mo190177k();

        /* renamed from: l */
        void mo190178l();

        /* renamed from: m */
        Context mo190179m();

        /* renamed from: n */
        void mo190180n();

        /* renamed from: o */
        int mo190181o();

        /* renamed from: p */
        void mo190182p();

        /* renamed from: q */
        void mo190183q();

        /* renamed from: r */
        void mo190184r();

        /* renamed from: s */
        void mo190185s();

        /* renamed from: t */
        void mo190186t();
    }
}
