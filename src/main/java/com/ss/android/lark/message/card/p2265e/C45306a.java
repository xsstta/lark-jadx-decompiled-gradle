package com.ss.android.lark.message.card.p2265e;

import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.bytedance.lark.pb.basic.v1.CardAction;
import com.bytedance.lark.pb.basic.v1.CardActionPacket;
import com.bytedance.lark.pb.basic.v1.CardContent;
import com.bytedance.lark.pb.basic.v1.Content;
import com.larksuite.framework.utils.C26249aa;
import com.ss.android.lark.chat.entity.message.CardAction;
import com.ss.android.lark.chat.entity.message.CardActionPacket;
import com.ss.android.lark.chat.entity.message.content.CardContent;
import com.ss.android.lark.message.card.C45294c;
import com.ss.android.lark.message.card.p2261a.AbstractC45287a;
import com.ss.android.lark.widget.richtext.RichText;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.lark.message.card.e.a */
public class C45306a {
    /* renamed from: a */
    public static CardContent m179921a(com.bytedance.lark.pb.basic.v1.CardContent cardContent) {
        int i;
        RichText richText;
        int i2;
        CardContent cardContent2 = new CardContent();
        CardContent.Type.Companion aVar = CardContent.Type.Companion;
        if (cardContent != null) {
            i = cardContent.type.getValue();
        } else {
            i = com.bytedance.lark.pb.basic.v1.CardContent.DEFAULT_TYPE.getValue();
        }
        cardContent2.setType(aVar.mo125439a(i));
        com.bytedance.lark.pb.basic.v1.RichText richText2 = null;
        int i3 = 1;
        if (cardContent2.getCardVersion() == 1) {
            AbstractC45287a a = C45294c.m179871a();
            if (cardContent != null) {
                richText2 = cardContent.richtext;
            }
            richText = a.mo143889a(richText2);
        } else {
            HashMap a2 = C45294c.m179871a().mo143900a("msg_card.style.native_merge_440", true) ? C45294c.m179873f().mo160054a() : null;
            AbstractC45287a a3 = C45294c.m179871a();
            if (cardContent != null) {
                richText2 = cardContent.richtext;
            }
            richText = a3.mo143890a(richText2, a2);
        }
        cardContent2.setRichText(richText);
        CardContent.ExtraType.Companion aVar2 = CardContent.ExtraType.Companion;
        if (cardContent != null) {
            i2 = cardContent.extra.getValue();
        } else {
            i2 = com.bytedance.lark.pb.basic.v1.CardContent.DEFAULT_EXTRA.getValue();
        }
        cardContent2.setExtraType(aVar2.mo125436a(i2));
        cardContent2.setActions(m179923a(cardContent.actions));
        if (cardContent.card_version != null) {
            i3 = cardContent.card_version.intValue();
        }
        cardContent2.setCardVersion(i3);
        if (cardContent.card_header != null) {
            cardContent2.setCardHeader(m179919a(cardContent.card_header));
        }
        if (cardContent.extra_info != null) {
            cardContent2.setExtraInfo(m179920a(cardContent.extra_info));
        }
        cardContent2.setEnableForward(cardContent.enable_forward.booleanValue());
        return cardContent2;
    }

    /* renamed from: a */
    private static Map<String, CardAction> m179923a(Map<String, com.bytedance.lark.pb.basic.v1.CardAction> map) {
        return C26249aa.m94985a(map, new C26249aa.AbstractC26250a<com.bytedance.lark.pb.basic.v1.CardAction, CardAction>() {
            /* class com.ss.android.lark.message.card.p2265e.C45306a.C453071 */

            /* renamed from: a */
            public CardAction get(com.bytedance.lark.pb.basic.v1.CardAction cardAction) {
                return C45306a.m179917a(cardAction);
            }
        });
    }

    /* renamed from: a */
    private static CardContent.CardHeader m179919a(CardContent.CardHeader cardHeader) {
        if (cardHeader == null) {
            return null;
        }
        CardContent.CardHeader cardHeader2 = new CardContent.CardHeader();
        cardHeader2.setTitle(cardHeader.title);
        cardHeader2.setStyle(cardHeader.style);
        cardHeader2.setTheme(cardHeader.theme);
        return cardHeader2;
    }

    /* renamed from: a */
    private static CardContent.ExtraInfo m179920a(CardContent.ExtraInfo extraInfo) {
        if (extraInfo == null) {
            return null;
        }
        CardContent.ExtraInfo extraInfo2 = new CardContent.ExtraInfo();
        if (extraInfo.gadget_config != null) {
            extraInfo2.setGadgetPreload(extraInfo.gadget_config.is_preload.booleanValue());
        }
        if (extraInfo.custom_config != null) {
            extraInfo2.setAnalyticsData(extraInfo.custom_config.analytics_data);
        }
        return extraInfo2;
    }

    /* renamed from: a */
    public static CardAction m179917a(com.bytedance.lark.pb.basic.v1.CardAction cardAction) {
        if (cardAction == null) {
            return null;
        }
        CardAction cardAction2 = new CardAction();
        cardAction2.setUrl(cardAction.url);
        cardAction2.setCmd(cardAction.cmd.intValue());
        cardAction2.setMethod(CardAction.Method.fromValue(cardAction.method.getValue()));
        cardAction2.setOpenUrl(m179913a(cardAction.open_url));
        cardAction2.setPacket(m179918a(cardAction.packet));
        cardAction2.setRequiredParameters(m179915a(cardAction.required_parameters));
        cardAction2.setParameters(m179914a(cardAction.parameters));
        return cardAction2;
    }

    /* renamed from: a */
    private static CardActionPacket m179918a(com.bytedance.lark.pb.basic.v1.CardActionPacket cardActionPacket) {
        if (cardActionPacket == null) {
            return null;
        }
        CardActionPacket cardActionPacket2 = new CardActionPacket();
        cardActionPacket2.setCid(cardActionPacket.cid);
        cardActionPacket2.setParameters(m179914a(cardActionPacket.parameters));
        cardActionPacket2.setPayload(cardActionPacket.payload);
        return cardActionPacket2;
    }

    /* renamed from: a */
    private static CardAction.UserInfo m179916a(CardAction.UserInfo userInfo) {
        if (userInfo == null) {
            return null;
        }
        CardAction.UserInfo userInfo2 = new CardAction.UserInfo();
        userInfo2.setUserOpenId(userInfo.user_open_id);
        return userInfo2;
    }

    /* renamed from: a */
    private static CardAction.RequiredParameters m179915a(CardAction.RequiredParameters requiredParameters) {
        if (requiredParameters == null) {
            return null;
        }
        CardAction.RequiredParameters requiredParameters2 = new CardAction.RequiredParameters();
        requiredParameters2.setNeedMessageId(requiredParameters.need_message_id.booleanValue());
        requiredParameters2.setNeedMessageInfo(requiredParameters.need_message_info.booleanValue());
        requiredParameters2.setNeedUserId(requiredParameters.need_user_id.booleanValue());
        requiredParameters2.setNeedUserInfo(requiredParameters.need_user_info.booleanValue());
        return requiredParameters2;
    }

    /* renamed from: a */
    private static CardAction.MessageInfo m179912a(CardAction.MessageInfo messageInfo) {
        if (messageInfo == null) {
            return null;
        }
        CardAction.MessageInfo messageInfo2 = new CardAction.MessageInfo();
        messageInfo2.setMessageOpenId(messageInfo.message_open_id);
        return messageInfo2;
    }

    /* renamed from: b */
    private static Map<String, com.bytedance.lark.pb.basic.v1.CardAction> m179924b(Map<String, com.ss.android.lark.chat.entity.message.CardAction> map) {
        return C26249aa.m94985a(map, new C26249aa.AbstractC26250a<com.ss.android.lark.chat.entity.message.CardAction, com.bytedance.lark.pb.basic.v1.CardAction>() {
            /* class com.ss.android.lark.message.card.p2265e.C45306a.C453082 */

            /* renamed from: a */
            public com.bytedance.lark.pb.basic.v1.CardAction get(com.ss.android.lark.chat.entity.message.CardAction cardAction) {
                if (cardAction != null) {
                    return C45306a.m179909a(cardAction);
                }
                return null;
            }
        });
    }

    /* renamed from: a */
    private static CardAction.OpenUrl m179913a(CardAction.Url url) {
        if (url == null) {
            return null;
        }
        CardAction.OpenUrl openUrl = new CardAction.OpenUrl();
        openUrl.setAndroidUrl(url.android_url);
        openUrl.setIosUrl(url.ios_url);
        openUrl.setPcUrl(url.pc_url);
        openUrl.setUrl(url.url);
        return openUrl;
    }

    /* renamed from: a */
    private static CardAction.RequiredParameters m179907a(CardAction.RequiredParameters requiredParameters) {
        if (requiredParameters == null) {
            return null;
        }
        return new CardAction.RequiredParameters.C14726a().mo54191d(Boolean.valueOf(requiredParameters.isNeedMessageId())).mo54189b(Boolean.valueOf(requiredParameters.isNeedMessageInfo())).mo54190c(Boolean.valueOf(requiredParameters.isNeedUserId())).mo54187a(Boolean.valueOf(requiredParameters.isNeedUserInfo())).build();
    }

    /* renamed from: a */
    private static CardAction.Parameters m179906a(CardAction.Parameters parameters) {
        String str;
        String str2 = null;
        if (parameters == null) {
            return null;
        }
        CardAction.Parameters.C14724a a = new CardAction.Parameters.C14724a().mo54183b(parameters.getMessageId()).mo54180a(parameters.getUserId()).mo54181a(new HashMap(parameters.getParameters()));
        CardAction.UserInfo.C14730a aVar = new CardAction.UserInfo.C14730a();
        if (parameters.getUserInfo() != null) {
            str = parameters.getUserInfo().getUserOpenId();
        } else {
            str = null;
        }
        CardAction.Parameters.C14724a a2 = a.mo54179a(aVar.mo54203a(str).build());
        CardAction.MessageInfo.C14722a aVar2 = new CardAction.MessageInfo.C14722a();
        if (parameters.getMessageInfo() != null) {
            str2 = parameters.getMessageInfo().getMessageOpenId();
        }
        return a2.mo54178a(aVar2.mo54173a(str2).build()).build();
    }

    /* renamed from: a */
    private static CardAction.Url m179908a(CardAction.OpenUrl openUrl) {
        if (openUrl == null) {
            return null;
        }
        return new CardAction.Url.C14728a().mo54198c(openUrl.getAndroidUrl()).mo54197b(openUrl.getIosUrl()).mo54199d(openUrl.getPcUrl()).mo54195a(openUrl.getUrl()).build();
    }

    /* renamed from: a */
    public static com.bytedance.lark.pb.basic.v1.CardAction m179909a(com.ss.android.lark.chat.entity.message.CardAction cardAction) {
        return new CardAction.C14732a().mo54214a(cardAction.getUrl()).mo54213a(Integer.valueOf(cardAction.getCmd())).mo54208a(CardAction.Method.fromValue(cardAction.getMethod().getValue())).mo54211a(m179908a(cardAction.getOpenUrl())).mo54212a(m179910a(cardAction.getPacket())).mo54210a(m179907a(cardAction.getRequiredParameters())).mo54209a(m179906a(cardAction.getParameters())).build();
    }

    /* renamed from: a */
    private static com.bytedance.lark.pb.basic.v1.CardActionPacket m179910a(CardActionPacket cardActionPacket) {
        if (cardActionPacket == null) {
            return null;
        }
        return new CardActionPacket.C14734a().mo54220a(cardActionPacket.getCid()).mo54219a(m179906a(cardActionPacket.getParameters())).mo54221a(cardActionPacket.getPayload()).build();
    }

    /* renamed from: a */
    public static com.bytedance.lark.pb.basic.v1.CardContent m179911a(com.ss.android.lark.chat.entity.message.content.CardContent cardContent) {
        return new CardContent.C14744a().mo54243a(CardContent.Type.fromValue(cardContent.getType().getNumber())).mo54242a(CardContent.ExtraType.fromValue(cardContent.getExtraType().getNumber())).mo54244a(C45294c.m179871a().mo143888a(cardContent.getRichText())).mo54245a(m179924b(cardContent.getActions())).build();
    }

    /* renamed from: a */
    private static CardAction.Parameters m179914a(CardAction.Parameters parameters) {
        if (parameters == null) {
            return null;
        }
        CardAction.Parameters parameters2 = new CardAction.Parameters();
        parameters2.setMessageId(parameters.message_id);
        parameters2.setUserId(parameters.user_id);
        parameters2.setParameters(new HashMap(parameters.parameters));
        parameters2.setUserInfo(m179916a(parameters.user_info));
        parameters2.setMessageInfo(m179912a(parameters.message_info));
        return parameters2;
    }

    /* renamed from: a */
    public static com.ss.android.lark.chat.entity.message.content.CardContent m179922a(C14928Entity entity, Content content) {
        return m179921a(content.card_content);
    }
}
