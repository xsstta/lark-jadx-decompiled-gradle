package com.ss.android.lark.message.card.view;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.yoga.YogaFlexDirection;
import com.facebook.yoga.YogaJustify;
import com.facebook.yoga.YogaNode;
import com.facebook.yoga.android.YogaLayout;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.layout.LKUIRoundLinearLayout;
import com.larksuite.component.ui.p1153e.C25655d;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.flyfish.FlyFishView;
import com.larksuite.framework.flyfish.core.ComponentTree;
import com.larksuite.suite.R;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.chat.entity.message.CardAction;
import com.ss.android.lark.chat.entity.message.content.CardContent;
import com.ss.android.lark.chat.export.vo.OpenMessageVO;
import com.ss.android.lark.chat.vo.ChatMessageVO;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.message.card.C45278a;
import com.ss.android.lark.message.card.C45294c;
import com.ss.android.lark.message.card.C45301d;
import com.ss.android.lark.message.card.CardMessageUtils;
import com.ss.android.lark.message.card.p2261a.AbstractC45287a;
import com.ss.android.lark.message.card.p2263c.C45295a;
import com.ss.android.lark.message.card.view.richtext.C45348d;
import com.ss.android.lark.message.card.view.richtext.NodeParams;
import com.ss.android.lark.widget.richtext.C59031e;
import com.ss.android.lark.widget.richtext.Image;
import com.ss.android.lark.widget.richtext.RichText;
import com.ss.android.lark.widget.richtext.RichTextElement;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0006\u0018\u0000 72\u00020\u0001:\u0003678B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001f\u0010\u000f\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0014J&\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001cJ \u0010\u001d\u001a\u0004\u0018\u00010\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010!\u001a\u00020\u0013H\u0007J \u0010\"\u001a\u00020#2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\u00132\u0006\u0010%\u001a\u00020&H\u0002J\u0012\u0010'\u001a\u00020&2\b\u0010(\u001a\u0004\u0018\u00010)H\u0002J\u0018\u0010*\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\u0013H\u0002J\u001a\u0010+\u001a\u00020\u00162\u0006\u0010,\u001a\u00020-2\b\u0010(\u001a\u0004\u0018\u00010)H\u0002J\u0010\u0010.\u001a\u00020\u00002\b\u0010/\u001a\u0004\u0018\u00010\nJ\u0010\u00100\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J(\u00101\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u000203H\u0002R\u000e\u0010\u0007\u001a\u00020\bXD¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000¨\u00069"}, d2 = {"Lcom/ss/android/lark/message/card/view/CardMessageBinder;", "", "context", "Landroid/content/Context;", "holder", "Lcom/ss/android/lark/message/card/view/ICardViewHolder;", "(Landroid/content/Context;Lcom/ss/android/lark/message/card/view/ICardViewHolder;)V", "TAG", "", "mCallBack", "Lcom/ss/android/lark/message/card/view/CardMessageBinder$IBinderCallBack;", "mContext", "mHolder", "mInteractiveHandler", "Lcom/ss/android/lark/message/card/interactive/InteractiveHandler;", "bindData", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/message/card/view/CardMessageBinder$BindData;", "isDefaultStyle", "", "(Lcom/ss/android/lark/message/card/view/CardMessageBinder$BindData;Ljava/lang/Boolean;)Lcom/ss/android/lark/message/card/view/CardMessageBinder;", "bindData2", "", "rootLayout", "Lcom/larksuite/component/ui/layout/LKUIRoundLinearLayout;", "nbView", "Lcom/larksuite/framework/flyfish/FlyFishView;", "componentTree", "Lcom/larksuite/framework/flyfish/core/ComponentTree;", "createNodeTree", "messageVO", "Lcom/ss/android/lark/chat/export/vo/OpenMessageVO;", "Lcom/ss/android/lark/message/card/view/CardContentVO;", "isGroup", "createRichTextRender", "Lcom/ss/android/lark/message/card/view/richtext/RichTextRender;", "enableAsynMeasure", "cardVersion", "", "getElementCount", "richText", "Lcom/ss/android/lark/widget/richtext/RichText;", "renderViewTree", "report", "startTime", "", "setCallBack", "callBack", "setDefaultStyle", "setRootLayoutStyle", "radiusInDp", "", "widthInDp", "paddingInDp", "BindData", "Companion", "IBinderCallBack", "im_messages_card-message_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.message.card.view.b */
public final class CardMessageBinder {

    /* renamed from: e */
    public static C45278a f114736e;

    /* renamed from: f */
    public static final Companion f114737f = new Companion(null);

    /* renamed from: a */
    public final String f114738a = "CardMessageBinder";

    /* renamed from: b */
    public final Context f114739b;

    /* renamed from: c */
    public IBinderCallBack f114740c;

    /* renamed from: d */
    public C45295a f114741d;

    /* renamed from: g */
    private final AbstractC45339h f114742g;

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u00062\u000e\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\u00060\u00062\u0006\u0010\b\u001a\u00020\t2\u000e\u0010\n\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u000b"}, d2 = {"<anonymous>", "", "view", "Landroid/view/View;", "kotlin.jvm.PlatformType", "id", "", "text", "isAuthorized", "", "url", "onMentionClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.message.card.view.b$g */
    public static final class C45327g implements C45348d.AbstractC45363f {

        /* renamed from: a */
        public static final C45327g f114765a = new C45327g();

        C45327g() {
        }

        @Override // com.ss.android.lark.message.card.view.richtext.C45348d.AbstractC45363f
        /* renamed from: a */
        public final void mo160103a(View view, String str, String str2, boolean z, String str3) {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b8\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010\u0016J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0007HÆ\u0003J\t\u0010=\u001a\u00020\u0007HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\t\u0010?\u001a\u00020\u0007HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010B\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010!J\u000b\u0010C\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010D\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010!J\u000b\u0010E\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010F\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010!J\u000b\u0010G\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010H\u001a\u00020\u0007HÆ\u0003J¬\u0001\u0010I\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00072\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÆ\u0001¢\u0006\u0002\u0010JJ\u0013\u0010K\u001a\u00020\u00072\b\u0010L\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010M\u001a\u00020NHÖ\u0001J\t\u0010O\u001a\u00020\tHÖ\u0001R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\r\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001c\"\u0004\b \u0010\u001eR\u001e\u0010\n\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\b\n\u0010!\"\u0004\b\"\u0010#R\u001a\u0010\u0013\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010%\"\u0004\b&\u0010'R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\b\u0006\u0010!\"\u0004\b(\u0010#R\u001a\u0010\u000f\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010%\"\u0004\b)\u0010'R\u001a\u0010\u0010\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010%\"\u0004\b*\u0010'R\u001a\u0010\u000e\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010%\"\u0004\b+\u0010'R\u001e\u0010\f\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\b\f\u0010!\"\u0004\b,\u0010#R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u001c\"\u0004\b.\u0010\u001eR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:¨\u0006P"}, d2 = {"Lcom/ss/android/lark/message/card/view/CardMessageBinder$BindData;", "", "nodeParams", "Lcom/ss/android/lark/message/card/view/richtext/NodeParams;", "richText", "Lcom/ss/android/lark/widget/richtext/RichText;", "isEnableEllipsize", "", "fromId", "", "isCannotClick", "msgId", "isVChat", "chatId", "isGroup", "isEphemeral", "isForward", "cardContent", "Lcom/ss/android/lark/chat/entity/message/content/CardContent;", "isEnableAtEvent", "scene", "Lcom/ss/android/lark/appreciablelib/Scene;", "(Lcom/ss/android/lark/message/card/view/richtext/NodeParams;Lcom/ss/android/lark/widget/richtext/RichText;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;ZZZLcom/ss/android/lark/chat/entity/message/content/CardContent;ZLcom/ss/android/lark/appreciablelib/Scene;)V", "getCardContent", "()Lcom/ss/android/lark/chat/entity/message/content/CardContent;", "setCardContent", "(Lcom/ss/android/lark/chat/entity/message/content/CardContent;)V", "getChatId", "()Ljava/lang/String;", "setChatId", "(Ljava/lang/String;)V", "getFromId", "setFromId", "()Ljava/lang/Boolean;", "setCannotClick", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "()Z", "setEnableAtEvent", "(Z)V", "setEnableEllipsize", "setEphemeral", "setForward", "setGroup", "setVChat", "getMsgId", "setMsgId", "getNodeParams", "()Lcom/ss/android/lark/message/card/view/richtext/NodeParams;", "setNodeParams", "(Lcom/ss/android/lark/message/card/view/richtext/NodeParams;)V", "getRichText", "()Lcom/ss/android/lark/widget/richtext/RichText;", "setRichText", "(Lcom/ss/android/lark/widget/richtext/RichText;)V", "getScene", "()Lcom/ss/android/lark/appreciablelib/Scene;", "setScene", "(Lcom/ss/android/lark/appreciablelib/Scene;)V", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/ss/android/lark/message/card/view/richtext/NodeParams;Lcom/ss/android/lark/widget/richtext/RichText;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;ZZZLcom/ss/android/lark/chat/entity/message/content/CardContent;ZLcom/ss/android/lark/appreciablelib/Scene;)Lcom/ss/android/lark/message/card/view/CardMessageBinder$BindData;", "equals", "other", "hashCode", "", "toString", "im_messages_card-message_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.message.card.view.b$a */
    public static final class BindData {

        /* renamed from: a */
        private NodeParams f114743a;

        /* renamed from: b */
        private RichText f114744b;

        /* renamed from: c */
        private Boolean f114745c;

        /* renamed from: d */
        private String f114746d;

        /* renamed from: e */
        private Boolean f114747e;

        /* renamed from: f */
        private String f114748f;

        /* renamed from: g */
        private Boolean f114749g;

        /* renamed from: h */
        private String f114750h;

        /* renamed from: i */
        private boolean f114751i;

        /* renamed from: j */
        private boolean f114752j;

        /* renamed from: k */
        private boolean f114753k;

        /* renamed from: l */
        private CardContent f114754l;

        /* renamed from: m */
        private boolean f114755m;

        /* renamed from: n */
        private Scene f114756n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BindData)) {
                return false;
            }
            BindData aVar = (BindData) obj;
            return Intrinsics.areEqual(this.f114743a, aVar.f114743a) && Intrinsics.areEqual(this.f114744b, aVar.f114744b) && Intrinsics.areEqual(this.f114745c, aVar.f114745c) && Intrinsics.areEqual(this.f114746d, aVar.f114746d) && Intrinsics.areEqual(this.f114747e, aVar.f114747e) && Intrinsics.areEqual(this.f114748f, aVar.f114748f) && Intrinsics.areEqual(this.f114749g, aVar.f114749g) && Intrinsics.areEqual(this.f114750h, aVar.f114750h) && this.f114751i == aVar.f114751i && this.f114752j == aVar.f114752j && this.f114753k == aVar.f114753k && Intrinsics.areEqual(this.f114754l, aVar.f114754l) && this.f114755m == aVar.f114755m && Intrinsics.areEqual(this.f114756n, aVar.f114756n);
        }

        public int hashCode() {
            NodeParams nodeParams = this.f114743a;
            int i = 0;
            int hashCode = (nodeParams != null ? nodeParams.hashCode() : 0) * 31;
            RichText richText = this.f114744b;
            int hashCode2 = (hashCode + (richText != null ? richText.hashCode() : 0)) * 31;
            Boolean bool = this.f114745c;
            int hashCode3 = (hashCode2 + (bool != null ? bool.hashCode() : 0)) * 31;
            String str = this.f114746d;
            int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 31;
            Boolean bool2 = this.f114747e;
            int hashCode5 = (hashCode4 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
            String str2 = this.f114748f;
            int hashCode6 = (hashCode5 + (str2 != null ? str2.hashCode() : 0)) * 31;
            Boolean bool3 = this.f114749g;
            int hashCode7 = (hashCode6 + (bool3 != null ? bool3.hashCode() : 0)) * 31;
            String str3 = this.f114750h;
            int hashCode8 = (hashCode7 + (str3 != null ? str3.hashCode() : 0)) * 31;
            boolean z = this.f114751i;
            int i2 = 1;
            if (z) {
                z = true;
            }
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = z ? 1 : 0;
            int i6 = (hashCode8 + i3) * 31;
            boolean z2 = this.f114752j;
            if (z2) {
                z2 = true;
            }
            int i7 = z2 ? 1 : 0;
            int i8 = z2 ? 1 : 0;
            int i9 = z2 ? 1 : 0;
            int i10 = (i6 + i7) * 31;
            boolean z3 = this.f114753k;
            if (z3) {
                z3 = true;
            }
            int i11 = z3 ? 1 : 0;
            int i12 = z3 ? 1 : 0;
            int i13 = z3 ? 1 : 0;
            int i14 = (i10 + i11) * 31;
            CardContent cardContent = this.f114754l;
            int hashCode9 = (i14 + (cardContent != null ? cardContent.hashCode() : 0)) * 31;
            boolean z4 = this.f114755m;
            if (!z4) {
                i2 = z4 ? 1 : 0;
            }
            int i15 = (hashCode9 + i2) * 31;
            Scene scene = this.f114756n;
            if (scene != null) {
                i = scene.hashCode();
            }
            return i15 + i;
        }

        public String toString() {
            return "BindData(nodeParams=" + this.f114743a + ", richText=" + this.f114744b + ", isEnableEllipsize=" + this.f114745c + ", fromId=" + this.f114746d + ", isCannotClick=" + this.f114747e + ", msgId=" + this.f114748f + ", isVChat=" + this.f114749g + ", chatId=" + this.f114750h + ", isGroup=" + this.f114751i + ", isEphemeral=" + this.f114752j + ", isForward=" + this.f114753k + ", cardContent=" + this.f114754l + ", isEnableAtEvent=" + this.f114755m + ", scene=" + this.f114756n + ")";
        }

        /* renamed from: a */
        public final NodeParams mo160076a() {
            return this.f114743a;
        }

        /* renamed from: b */
        public final RichText mo160077b() {
            return this.f114744b;
        }

        /* renamed from: c */
        public final String mo160078c() {
            return this.f114746d;
        }

        /* renamed from: d */
        public final Boolean mo160079d() {
            return this.f114747e;
        }

        /* renamed from: e */
        public final String mo160080e() {
            return this.f114748f;
        }

        /* renamed from: f */
        public final Boolean mo160082f() {
            return this.f114749g;
        }

        /* renamed from: g */
        public final String mo160083g() {
            return this.f114750h;
        }

        /* renamed from: h */
        public final boolean mo160084h() {
            return this.f114751i;
        }

        /* renamed from: i */
        public final boolean mo160086i() {
            return this.f114752j;
        }

        /* renamed from: j */
        public final boolean mo160087j() {
            return this.f114753k;
        }

        /* renamed from: k */
        public final CardContent mo160088k() {
            return this.f114754l;
        }

        /* renamed from: l */
        public final boolean mo160089l() {
            return this.f114755m;
        }

        /* renamed from: m */
        public final Scene mo160090m() {
            return this.f114756n;
        }

        public BindData(NodeParams nodeParams, RichText richText, Boolean bool, String str, Boolean bool2, String str2, Boolean bool3, String str3, boolean z, boolean z2, boolean z3, CardContent cardContent, boolean z4, Scene scene) {
            Intrinsics.checkParameterIsNotNull(nodeParams, "nodeParams");
            this.f114743a = nodeParams;
            this.f114744b = richText;
            this.f114745c = bool;
            this.f114746d = str;
            this.f114747e = bool2;
            this.f114748f = str2;
            this.f114749g = bool3;
            this.f114750h = str3;
            this.f114751i = z;
            this.f114752j = z2;
            this.f114753k = z3;
            this.f114754l = cardContent;
            this.f114755m = z4;
            this.f114756n = scene;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nJ*\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002J\u0006\u0010\u0015\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/message/card/view/CardMessageBinder$Companion;", "", "()V", "mCardActionManager", "Lcom/ss/android/lark/message/card/CardMessageActionManager;", "convertToBindData", "Lcom/ss/android/lark/message/card/view/CardMessageBinder$BindData;", "item", "Lcom/ss/android/lark/chat/entity/message/MessageInfo;", "isGroup", "", "isEnableEllipsize", "msg", "Lcom/ss/android/lark/chat/export/vo/OpenMessageVO;", "Lcom/ss/android/lark/message/card/view/CardContentVO;", "scene", "Lcom/ss/android/lark/appreciablelib/Scene;", "convertToNodeParams", "Lcom/ss/android/lark/message/card/view/richtext/NodeParams;", "cardContent", "Lcom/ss/android/lark/chat/entity/message/content/CardContent;", "getCardActionManager", "im_messages_card-message_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.message.card.view.b$b */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final C45278a mo160092a() {
            if (CardMessageBinder.f114736e == null) {
                CardMessageBinder.f114736e = new C45278a();
            }
            C45278a aVar = CardMessageBinder.f114736e;
            if (aVar != null) {
                return aVar;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.message.card.CardMessageActionManager");
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final BindData mo160093a(OpenMessageVO<CardContentVO> cVar, boolean z, Scene scene) {
            CardContentVO aVar;
            boolean z2;
            boolean z3;
            boolean z4;
            if (cVar != null) {
                aVar = cVar.mo121699g();
            } else {
                aVar = null;
            }
            if (aVar == null) {
                return null;
            }
            CardContentVO g = cVar.mo121699g();
            if (g == null) {
                Intrinsics.throwNpe();
            }
            if (g.mo160070g() == null) {
                return null;
            }
            CardContentVO g2 = cVar.mo121699g();
            if (g2 == null) {
                Intrinsics.throwNpe();
            }
            CardContentVO aVar2 = g2;
            String e = cVar.mo121697e();
            boolean z5 = true;
            if (aVar2.mo160065b() == CardContent.ExtraType.SENDER_CANNOT_CLICK) {
                z2 = true;
            } else {
                z2 = false;
            }
            String a = cVar.mo121681a();
            if (aVar2.mo160063a() != CardContent.Type.VCHAT) {
                z5 = false;
            }
            String b = cVar.mo121692b();
            if (cVar instanceof ChatMessageVO) {
                ChatMessageVO cVar2 = (ChatMessageVO) cVar;
                boolean U = cVar2.mo124248U();
                z3 = cVar2.mo124249V();
                z4 = U;
            } else {
                z4 = false;
                z3 = false;
            }
            NodeParams g3 = aVar2.mo160070g();
            if (g3 == null) {
                Intrinsics.throwNpe();
            }
            return new BindData(g3, aVar2.mo160066c(), Boolean.valueOf(aVar2.mo160071h()), e, Boolean.valueOf(z2), a, Boolean.valueOf(z5), b, z, z4, z3, (CardContent) aVar2.mo126168z(), true, scene);
        }
    }

    /* renamed from: a */
    public final CardMessageBinder mo160074a(IBinderCallBack cVar) {
        this.f114740c = cVar;
        return this;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u000eJ&\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\bH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/message/card/view/CardMessageBinder$IBinderCallBack;", "", "onCardImageClick", "", "v", "Landroid/view/View;", "imageList", "", "Lcom/ss/android/lark/widget/richtext/Image;", "clickedImageItem", "onRichTextAction", "handleAsync", "", "onWidgetLongClick", "Proxy", "im_messages_card-message_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.message.card.view.b$c */
    public interface IBinderCallBack {
        /* renamed from: a */
        void mo160094a(View view);

        /* renamed from: a */
        void mo160095a(View view, List<? extends Image> list, Image image);

        /* renamed from: a */
        void mo160096a(boolean z);

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u000e\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0001R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/message/card/view/CardMessageBinder$IBinderCallBack$Proxy;", "Lcom/ss/android/lark/message/card/view/CardMessageBinder$IBinderCallBack;", "()V", "mHost", "onCardImageClick", "", "v", "Landroid/view/View;", "imageList", "", "Lcom/ss/android/lark/widget/richtext/Image;", "clickedImageItem", "onRichTextAction", "handleAsync", "", "onWidgetLongClick", "setHost", "callBack", "im_messages_card-message_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.message.card.view.b$c$a */
        public static final class Proxy implements IBinderCallBack {

            /* renamed from: a */
            private IBinderCallBack f114757a;

            /* renamed from: a */
            public final void mo160097a(IBinderCallBack cVar) {
                Intrinsics.checkParameterIsNotNull(cVar, "callBack");
                this.f114757a = cVar;
            }

            @Override // com.ss.android.lark.message.card.view.CardMessageBinder.IBinderCallBack
            /* renamed from: a */
            public void mo160094a(View view) {
                Intrinsics.checkParameterIsNotNull(view, "v");
                IBinderCallBack cVar = this.f114757a;
                if (cVar != null) {
                    cVar.mo160094a(view);
                }
            }

            @Override // com.ss.android.lark.message.card.view.CardMessageBinder.IBinderCallBack
            /* renamed from: a */
            public void mo160096a(boolean z) {
                IBinderCallBack cVar = this.f114757a;
                if (cVar != null) {
                    cVar.mo160096a(z);
                }
            }

            @Override // com.ss.android.lark.message.card.view.CardMessageBinder.IBinderCallBack
            /* renamed from: a */
            public void mo160095a(View view, List<? extends Image> list, Image image) {
                Intrinsics.checkParameterIsNotNull(view, "v");
                Intrinsics.checkParameterIsNotNull(list, "imageList");
                Intrinsics.checkParameterIsNotNull(image, "clickedImageItem");
                IBinderCallBack cVar = this.f114757a;
                if (cVar != null) {
                    cVar.mo160095a(view, list, image);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/message/card/view/CardMessageBinder$createRichTextRender$2", "Lcom/ss/android/lark/message/card/view/richtext/RichTextRender$UrlClickListener;", "onURLClick", "", "view", "Landroid/view/View;", "text", "", "onURLLongClick", "", "im_messages_card-message_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.message.card.view.b$e */
    public static final class C45324e implements C45348d.AbstractC45373j {

        /* renamed from: a */
        final /* synthetic */ CardMessageBinder f114761a;

        /* renamed from: b */
        final /* synthetic */ BindData f114762b;

        @Override // com.ss.android.lark.message.card.view.richtext.C45348d.AbstractC45373j
        /* renamed from: b */
        public boolean mo160100b(View view, String str) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(str, "text");
            return true;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.message.card.view.b$e$a */
        static final class C45325a extends Lambda implements Function1<String, Unit> {
            final /* synthetic */ String $text;
            final /* synthetic */ C45324e this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C45325a(C45324e eVar, String str) {
                super(1);
                this.this$0 = eVar;
                this.$text = str;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                invoke(str);
                return Unit.INSTANCE;
            }

            public final void invoke(String str) {
                Intrinsics.checkParameterIsNotNull(str, "it");
                String a = this.this$0.f114761a.f114741d.mo160041a(this.$text, str);
                String str2 = this.this$0.f114761a.f114738a;
                Log.m165379d(str2, "url with trigger code:" + a);
                this.this$0.f114761a.f114741d.mo160045b(str, this.this$0.f114762b.mo160080e());
                C45294c.m179871a().mo143896a(this.this$0.f114761a.f114739b, a, false, false, Boolean.valueOf(this.this$0.f114762b.mo160084h()));
            }
        }

        C45324e(CardMessageBinder bVar, BindData aVar) {
            this.f114761a = bVar;
            this.f114762b = aVar;
        }

        @Override // com.ss.android.lark.message.card.view.richtext.C45348d.AbstractC45373j
        /* renamed from: a */
        public void mo160099a(View view, String str) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(str, "text");
            if (!C45301d.m179898a(this.f114761a.f114739b, str)) {
                CardMessageUtils.f114651a.mo159996a(new C45325a(this, str));
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "view", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onLongClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.message.card.view.b$j */
    public static final class C45331j implements C45348d.AbstractC45364g {

        /* renamed from: a */
        final /* synthetic */ CardMessageBinder f114770a;

        C45331j(CardMessageBinder bVar) {
            this.f114770a = bVar;
        }

        @Override // com.ss.android.lark.message.card.view.richtext.C45348d.AbstractC45364g
        /* renamed from: a */
        public final void mo160107a(View view) {
            IBinderCallBack cVar = this.f114770a.f114740c;
            if (cVar != null) {
                Intrinsics.checkExpressionValueIsNotNull(view, "view");
                cVar.mo160094a(view);
            }
        }
    }

    /* renamed from: a */
    private final CardMessageBinder m179956a(LKUIRoundLinearLayout lKUIRoundLinearLayout) {
        return m179957a(lKUIRoundLinearLayout, 10.0f, 1.0f, 12.0f);
    }

    /* renamed from: a */
    private final int m179955a(RichText richText) {
        if (!(richText == null || richText.getElements() == null)) {
            RichText.RichTextElements elements = richText.getElements();
            Intrinsics.checkExpressionValueIsNotNull(elements, "richText.elements");
            if (elements.getDictionary() != null) {
                RichText.RichTextElements elements2 = richText.getElements();
                Intrinsics.checkExpressionValueIsNotNull(elements2, "richText.elements");
                return elements2.getDictionary().size();
            }
        }
        return 0;
    }

    public CardMessageBinder(Context context, AbstractC45339h hVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(hVar, "holder");
        this.f114739b = context;
        this.f114742g = hVar;
        this.f114741d = new C45295a();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "view", "Landroid/view/View;", "kotlin.jvm.PlatformType", "selectImageItem", "Lcom/ss/android/lark/widget/richtext/Image;", "onImageClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.message.card.view.b$i */
    public static final class C45330i implements C45348d.AbstractC45361d {

        /* renamed from: a */
        final /* synthetic */ CardMessageBinder f114768a;

        /* renamed from: b */
        final /* synthetic */ BindData f114769b;

        C45330i(CardMessageBinder bVar, BindData aVar) {
            this.f114768a = bVar;
            this.f114769b = aVar;
        }

        @Override // com.ss.android.lark.message.card.view.richtext.C45348d.AbstractC45361d
        /* renamed from: a */
        public final void mo160106a(View view, Image image) {
            IBinderCallBack cVar = this.f114768a.f114740c;
            if (cVar != null) {
                Intrinsics.checkExpressionValueIsNotNull(view, "view");
                List<Image> h = C59031e.m229190h(this.f114769b.mo160077b());
                Intrinsics.checkExpressionValueIsNotNull(h, "RichTextHelper.getAllImgFromMsgCard(data.richText)");
                Intrinsics.checkExpressionValueIsNotNull(image, "selectImageItem");
                cVar.mo160095a(view, h, image);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010$\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032F\u0010\u0005\u001aB\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004* \u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00070\u0006H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "actionId", "", "kotlin.jvm.PlatformType", "value", "", "", "onAction"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.message.card.view.b$d */
    public static final class C45323d implements C45348d.AbstractC45365h {

        /* renamed from: a */
        final /* synthetic */ CardMessageBinder f114758a;

        /* renamed from: b */
        final /* synthetic */ BindData f114759b;

        /* renamed from: c */
        final /* synthetic */ int f114760c;

        C45323d(CardMessageBinder bVar, BindData aVar, int i) {
            this.f114758a = bVar;
            this.f114759b = aVar;
            this.f114760c = i;
        }

        @Override // com.ss.android.lark.message.card.view.richtext.C45348d.AbstractC45365h
        /* renamed from: a */
        public final void mo160098a(String str, Map<String, String> map) {
            Map<String, CardAction> actions;
            AbstractC45287a a = C45294c.m179871a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MessageCardModule.getDependency()");
            if (!TextUtils.equals(this.f114759b.mo160078c(), a.mo143901b()) || !Intrinsics.areEqual((Object) this.f114759b.mo160079d(), (Object) true)) {
                Log.m165378d("card action, msgId: " + this.f114759b.mo160080e() + ", actionId: " + str);
                if (Intrinsics.areEqual((Object) this.f114759b.mo160082f(), (Object) true)) {
                    Log.m165378d("VCHAT action!!!");
                    return;
                }
                C45278a a2 = CardMessageBinder.f114737f.mo160092a();
                CardContent k = this.f114759b.mo160088k();
                if (k == null || (actions = k.getActions()) == null) {
                    Log.m165383e(this.f114758a.f114738a, "some value is null");
                } else {
                    a2.mo159981a(actions);
                }
                String e = this.f114759b.mo160080e();
                if (e == null) {
                    e = "";
                }
                boolean a3 = a2.mo159982a(this.f114758a.f114739b, new C45278a.C45285b(e, str, Boolean.valueOf(this.f114759b.mo160084h()), Boolean.valueOf(this.f114759b.mo160086i()), this.f114759b.mo160077b(), this.f114760c, map));
                IBinderCallBack cVar = this.f114758a.f114740c;
                if (cVar != null) {
                    cVar.mo160096a(a3);
                    return;
                }
                return;
            }
            LKUIToast.show(this.f114758a.f114739b, (int) R.string.Lark_Legacy_ApplicationPhoneCallSendCardErrorToast);
        }
    }

    /* renamed from: a */
    private final void m179959a(long j, RichText richText) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("elements_counts_ranges", ((m179955a(richText) / 10) + 1) * 10);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("duration", System.currentTimeMillis() - j);
            C45340i.m180032a("op_messagecard_render", jSONObject, jSONObject2, null);
        } catch (Throwable th) {
            Log.m165386e("CardMessageContentBinder", th);
        }
    }

    /* renamed from: a */
    private final void m179960a(BindData aVar, boolean z) {
        int i;
        FrameLayout contentLayout = this.f114742g.getContentLayout();
        Intrinsics.checkExpressionValueIsNotNull(contentLayout, "mHolder.contentLayout");
        YogaLayout yogaLayout = this.f114742g.getYogaLayout();
        Intrinsics.checkExpressionValueIsNotNull(yogaLayout, "mHolder.yogaLayout");
        yogaLayout.removeAllViews();
        YogaNode yogaNode = yogaLayout.getYogaNode();
        while (true) {
            Intrinsics.checkExpressionValueIsNotNull(yogaNode, "yogaNode");
            i = 0;
            if (yogaNode.getChildCount() == 0) {
                break;
            }
            yogaNode.removeChildAt(0);
        }
        yogaNode.reset();
        yogaNode.setFlexDirection(YogaFlexDirection.COLUMN);
        yogaNode.setJustifyContent(YogaJustify.CENTER);
        yogaNode.setWidthPercent(100.0f);
        YogaLayout yogaLayout2 = yogaLayout;
        contentLayout.removeView(yogaLayout2);
        contentLayout.addView(yogaLayout2);
        long currentTimeMillis = System.currentTimeMillis();
        C45338g gVar = new C45338g(aVar.mo160087j(), aVar.mo160088k());
        CardContent k = aVar.mo160088k();
        if (k != null) {
            i = k.getCardVersion();
        }
        m179958a(aVar, z, i).mo160156a(yogaLayout, aVar.mo160076a(), gVar);
        m179959a(currentTimeMillis, aVar.mo160077b());
    }

    /* renamed from: a */
    public final CardMessageBinder mo160073a(BindData aVar, Boolean bool) {
        if (aVar != null) {
            if (Intrinsics.areEqual((Object) bool, (Object) true)) {
                LKUIRoundLinearLayout rootLayout = this.f114742g.getRootLayout();
                Intrinsics.checkExpressionValueIsNotNull(rootLayout, "mHolder.rootLayout");
                m179956a(rootLayout);
            }
            m179960a(aVar, false);
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u00062\u000e\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "userId", "onAtClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.message.card.view.b$f */
    public static final class C45326f implements C45348d.AbstractC45359b {

        /* renamed from: a */
        final /* synthetic */ CardMessageBinder f114763a;

        /* renamed from: b */
        final /* synthetic */ BindData f114764b;

        C45326f(CardMessageBinder bVar, BindData aVar) {
            this.f114763a = bVar;
            this.f114764b = aVar;
        }

        @Override // com.ss.android.lark.message.card.view.richtext.C45348d.AbstractC45359b
        /* renamed from: a */
        public final void mo160102a(View view, String str, String str2) {
            if (this.f114764b.mo160089l()) {
                C45294c.m179871a().mo143895a(this.f114763a.f114739b, str2, this.f114764b.mo160083g());
            }
        }
    }

    /* renamed from: a */
    private final C45348d m179958a(BindData aVar, boolean z, int i) {
        C45348d dVar = new C45348d(this.f114739b, aVar.mo160083g(), aVar.mo160080e(), i);
        if (aVar.mo160090m() != null) {
            dVar.mo160157a(aVar.mo160090m());
        }
        dVar.mo160166a(z);
        dVar.mo160163a(new C45323d(this, aVar, i));
        dVar.mo160164a(new C45324e(this, aVar));
        dVar.mo160158a(new C45326f(this, aVar));
        dVar.mo160161a(C45327g.f114765a);
        dVar.mo160160a(new C45328h(this, aVar));
        dVar.mo160159a(new C45330i(this, aVar));
        dVar.mo160162a(new C45331j(this));
        return dVar;
    }

    /* renamed from: a */
    private final CardMessageBinder m179957a(LKUIRoundLinearLayout lKUIRoundLinearLayout, float f, float f2, float f3) {
        lKUIRoundLinearLayout.setRadius(f);
        lKUIRoundLinearLayout.setBorderWidth(f2);
        lKUIRoundLinearLayout.setPadding((int) C25655d.m91900a(this.f114739b, f3));
        return this;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u00062\u000e\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\u00060\u00062\u000e\u0010\b\u001a\n \u0004*\u0004\u0018\u00010\t0\tH\n¢\u0006\u0002\b\n"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "commonUrl", "", "androidUrl", ShareHitPoint.f121868c, "Lcom/ss/android/lark/widget/richtext/RichTextElement$LinkProperty$Source;", "onAreaClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.message.card.view.b$h */
    public static final class C45328h implements C45348d.AbstractC45362e {

        /* renamed from: a */
        final /* synthetic */ CardMessageBinder f114766a;

        /* renamed from: b */
        final /* synthetic */ BindData f114767b;

        C45328h(CardMessageBinder bVar, BindData aVar) {
            this.f114766a = bVar;
            this.f114767b = aVar;
        }

        @Override // com.ss.android.lark.message.card.view.richtext.C45348d.AbstractC45362e
        /* renamed from: a */
        public final void mo160104a(View view, final String str, String str2, final RichTextElement.LinkProperty.Source source) {
            if (!TextUtils.isEmpty(str2)) {
                str = str2;
            }
            if (!C45301d.m179898a(this.f114766a.f114739b, str)) {
                CardMessageUtils.f114651a.mo159996a(new Function1<String, Unit>(this) {
                    /* class com.ss.android.lark.message.card.view.CardMessageBinder.C45328h.C453291 */
                    final /* synthetic */ C45328h this$0;

                    {
                        this.this$0 = r1;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(String str) {
                        invoke(str);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(String str) {
                        boolean z;
                        Intrinsics.checkParameterIsNotNull(str, "it");
                        String a = this.this$0.f114766a.f114741d.mo160041a(str, str);
                        String str2 = this.this$0.f114766a.f114738a;
                        Log.m165379d(str2, "url with trigger code:" + a);
                        this.this$0.f114766a.f114741d.mo160045b(str, this.this$0.f114767b.mo160080e());
                        AbstractC45287a a2 = C45294c.m179871a();
                        Context context = this.this$0.f114766a.f114739b;
                        if (source == RichTextElement.LinkProperty.Source.FOOTER_LINK) {
                            z = true;
                        } else {
                            z = false;
                        }
                        a2.mo143896a(context, a, true, z, Boolean.valueOf(this.this$0.f114767b.mo160084h()));
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public final void mo160075a(LKUIRoundLinearLayout lKUIRoundLinearLayout, FlyFishView flyFishView, boolean z, ComponentTree bVar) {
        Intrinsics.checkParameterIsNotNull(lKUIRoundLinearLayout, "rootLayout");
        Intrinsics.checkParameterIsNotNull(flyFishView, "nbView");
        Intrinsics.checkParameterIsNotNull(bVar, "componentTree");
        if (z) {
            m179956a(lKUIRoundLinearLayout);
        }
        flyFishView.setComponentTree(bVar);
    }
}
