package com.ss.android.lark.platform.p2492m;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.lark.pb.basic.v1.CardContent;
import com.bytedance.lark.pb.im.v1.BatchTransmitResponse;
import com.bytedance.lark.pb.im.v1.MergeForwardMessagesResponse;
import com.bytedance.lark.pb.im.v1.ShareAsMessageResponse;
import com.bytedance.lark.pb.im.v1.ShareObject;
import com.bytedance.lark.pb.im.v1.ShareTarget;
import com.bytedance.lark.pb.im.v1.Transmit2ThreadTarget;
import com.bytedance.lark.pb.im.v1.TransmitResponse;
import com.bytedance.lark.pb.im.v1.TransmitTarget;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.aj;
import com.ss.android.lark.biz.core.api.CommonShareData;
import com.ss.android.lark.biz.core.api.LoadParams;
import com.ss.android.lark.biz.core.api.ShareDataForwardData;
import com.ss.android.lark.biz.im.api.AbstractC29619l;
import com.ss.android.lark.biz.im.api.C29599ac;
import com.ss.android.lark.biz.im.api.C29601ad;
import com.ss.android.lark.biz.im.api.C29612d;
import com.ss.android.lark.biz.im.api.C29634z;
import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.biz.im.api.ChatterNameDisplayRule;
import com.ss.android.lark.biz.im.api.FeedCard;
import com.ss.android.lark.biz.im.api.FeedPreviewInfo;
import com.ss.android.lark.biz.im.api.ShareAppCardLink;
import com.ss.android.lark.biz.im.api.StickerContent;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.ImageContent;
import com.ss.android.lark.chat.entity.message.content.MediaContent;
import com.ss.android.lark.chat.entity.message.content.TextContent;
import com.ss.android.lark.chat.export.entity.chat.OpenChat;
import com.ss.android.lark.chat.export.entity.message.Content;
import com.ss.android.lark.core.C36083a;
import com.ss.android.lark.core.language.C36235a;
import com.ss.android.lark.core.p1766d.C36099a;
import com.ss.android.lark.core.p1772j.C36149a;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.forward.C38364a;
import com.ss.android.lark.forward.dto.C38389a;
import com.ss.android.lark.forward.dto.CalendarForwardData;
import com.ss.android.lark.forward.dto.CardLink;
import com.ss.android.lark.forward.dto.StickImage;
import com.ss.android.lark.forward.p1898a.AbstractC38365a;
import com.ss.android.lark.image.entity.Image;
import com.ss.android.lark.language.service.AbstractC41118a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.platform.ag.C51689a;
import com.ss.android.lark.platform.p2493n.C51854a;
import com.ss.android.lark.platform.p2508x.C52054a;
import com.ss.android.lark.platform.settings.SettingModuleProvider;
import com.ss.android.lark.setting.service.AbstractC54603d;
import com.ss.android.lark.share.C54713a;
import com.ss.android.lark.share.dto.ShareChatDto;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.lark.widget.richtext.C59029c;
import com.ss.android.lark.widget.richtext.RichText;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import pl.droidsonroids.gif.GifImageView;

/* renamed from: com.ss.android.lark.platform.m.a */
public class C51838a {
    /* renamed from: b */
    public static AbstractC38365a m200993b() {
        return new AbstractC38365a() {
            /* class com.ss.android.lark.platform.p2492m.C51838a.C518391 */

            @Override // com.ss.android.lark.forward.p1898a.AbstractC38365a
            /* renamed from: j */
            public AbstractC38365a.AbstractC38374i mo140448j() {
                return $$Lambda$a$1$rIOBl2FjsgSdDZxxaRo1WY9Ww.INSTANCE;
            }

            @Override // com.ss.android.lark.forward.p1898a.AbstractC38365a
            /* renamed from: a */
            public Context mo140434a() {
                return LarkContext.getApplication();
            }

            @Override // com.ss.android.lark.forward.p1898a.AbstractC38365a
            /* renamed from: c */
            public AbstractC38365a.AbstractC38373h mo140441c() {
                return new AbstractC38365a.AbstractC38373h() {
                    /* class com.ss.android.lark.platform.p2492m.C51838a.C518391.C518401 */

                    /* renamed from: b */
                    private final AbstractC41118a f128835b = C36235a.m142710a().mo148282c();

                    @Override // com.ss.android.lark.forward.p1898a.AbstractC38365a.AbstractC38373h
                    /* renamed from: a */
                    public Locale mo140506a() {
                        return this.f128835b.mo148301d();
                    }

                    @Override // com.ss.android.lark.forward.p1898a.AbstractC38365a.AbstractC38373h
                    /* renamed from: b */
                    public Locale mo140507b() {
                        return this.f128835b.mo148303f();
                    }
                };
            }

            @Override // com.ss.android.lark.forward.p1898a.AbstractC38365a
            /* renamed from: d */
            public AbstractC38365a.AbstractC38368c mo140442d() {
                return new AbstractC38365a.AbstractC38368c() {
                    /* class com.ss.android.lark.platform.p2492m.C51838a.C518391.C518478 */

                    /* renamed from: b */
                    private final AbstractC38365a.AbstractC38373h f128851b = C38364a.m151054a().mo140441c();

                    @Override // com.ss.android.lark.forward.p1898a.AbstractC38365a.AbstractC38368c
                    /* renamed from: a */
                    public int mo140468a() {
                        return 4042;
                    }

                    @Override // com.ss.android.lark.forward.p1898a.AbstractC38365a.AbstractC38368c
                    /* renamed from: c */
                    public int mo140493c() {
                        return 5041;
                    }

                    @Override // com.ss.android.lark.forward.p1898a.AbstractC38365a.AbstractC38368c
                    /* renamed from: d */
                    public int mo140496d() {
                        return 5040;
                    }

                    @Override // com.ss.android.lark.forward.p1898a.AbstractC38365a.AbstractC38368c
                    /* renamed from: a */
                    public Map<String, Chat> mo140474a(List<String> list) {
                        return C36083a.m141486a().getIMDependency().mo132887b(list);
                    }

                    @Override // com.ss.android.lark.forward.p1898a.AbstractC38365a.AbstractC38368c
                    /* renamed from: a */
                    public void mo140485a(List<String> list, IGetDataCallback<Map<String, Chatter>> iGetDataCallback) {
                        C36083a.m141486a().getIMDependency().mo132902b(list, iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.forward.p1898a.AbstractC38365a.AbstractC38368c
                    /* renamed from: a */
                    public void mo140483a(String str, String str2, Map<String, String> map, IGetDataCallback<String> iGetDataCallback) {
                        int j = C36083a.m141486a().getIMDependency().mo132945j(str);
                        C36083a.m141486a().getIMDependency().mo132939h(str);
                        String str3 = CollectionUtils.isNotEmpty(map) ? map.get(str) : null;
                        if (iGetDataCallback != null) {
                            C36083a.m141486a().getIMDependency().mo132841a(((C29601ad.C29603a) ((C29601ad.C29603a) ((C29601ad.C29603a) ((C29601ad.C29603a) ((C29601ad.C29603a) C29601ad.m109464a().mo125332j(str)).mo125331i(str3)).mo125330h(str3)).mo125333k(str3)).mo125328c(j)).mo106659a(C59029c.m229161b(str2)).mo106660a(), iGetDataCallback);
                        } else {
                            C36083a.m141486a().getIMDependency().mo132840a(((C29601ad.C29603a) ((C29601ad.C29603a) ((C29601ad.C29603a) ((C29601ad.C29603a) ((C29601ad.C29603a) C29601ad.m109464a().mo125332j(str)).mo125328c(j)).mo125331i(str3)).mo125330h(str3)).mo125333k(str3)).mo106659a(C59029c.m229161b(str2)).mo106660a());
                        }
                    }

                    @Override // com.ss.android.lark.forward.p1898a.AbstractC38365a.AbstractC38368c
                    /* renamed from: a */
                    public void mo140478a(String str, Message message, IGetDataCallback<String> iGetDataCallback) {
                        int j = C36083a.m141486a().getIMDependency().mo132945j(str);
                        TextContent textContent = (TextContent) message.getContent();
                        RichText richText = textContent.getRichText();
                        if (richText == null && !TextUtils.isEmpty(textContent.getText())) {
                            richText = C59029c.m229161b(textContent.getText());
                        }
                        C36083a.m141486a().getIMDependency().mo132841a(((C29601ad.C29603a) ((C29601ad.C29603a) ((C29601ad.C29603a) ((C29601ad.C29603a) C29601ad.m109464a().mo125332j(str)).mo125330h(message.getRootId())).mo125331i(message.getParentId())).mo125328c(j)).mo106659a(richText).mo106660a(), iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.forward.p1898a.AbstractC38365a.AbstractC38368c
                    /* renamed from: a */
                    public void mo140479a(final String str, final String str2, Chat chat, final String str3, final IGetDataCallback<String> iGetDataCallback) {
                        final int lastMessagePosition = chat.getLastMessagePosition();
                        C36083a.m141486a().getIMDependency().mo132839a(((C29599ac.C29600a) ((C29599ac.C29600a) ((C29599ac.C29600a) C29599ac.m109460a().mo125332j(str2)).mo125328c(lastMessagePosition)).mo106657a(chat).mo125334l(str)).mo106658a(), new IGetDataCallback<String>() {
                            /* class com.ss.android.lark.platform.p2492m.C51838a.C518391.C518478.C518481 */

                            @Override // com.larksuite.framework.callback.IGetDataCallback
                            public void onError(ErrorResult errorResult) {
                                IGetDataCallback iGetDataCallback = iGetDataCallback;
                                if (iGetDataCallback != null) {
                                    iGetDataCallback.onError(errorResult);
                                }
                            }

                            /* renamed from: a */
                            public void onSuccess(String str) {
                                if (!TextUtils.isEmpty(str3)) {
                                    C36083a.m141486a().getIMDependency().mo132841a(((C29601ad.C29603a) ((C29601ad.C29603a) ((C29601ad.C29603a) ((C29601ad.C29603a) ((C29601ad.C29603a) ((C29601ad.C29603a) C29601ad.m109464a().mo125332j(str2)).mo125328c(lastMessagePosition + 1)).mo125330h(str)).mo125331i(str)).mo125333k(str)).mo106659a(C59029c.m229161b(str3)).mo125334l(str)).mo106660a(), iGetDataCallback);
                                    return;
                                }
                                IGetDataCallback iGetDataCallback = iGetDataCallback;
                                if (iGetDataCallback != null) {
                                    iGetDataCallback.onSuccess(str);
                                }
                            }
                        });
                    }

                    @Override // com.ss.android.lark.forward.p1898a.AbstractC38365a.AbstractC38368c
                    /* renamed from: a */
                    public void mo140481a(final String str, String str2, String str3, final String str4, final IGetDataCallback<String> iGetDataCallback) {
                        C36083a.m141486a().getIMDependency().mo132851a(((C29634z.C29636a) ((C29634z.C29636a) ((C29634z.C29636a) C29634z.m109576a().mo125332j(str)).mo125330h(str2)).mo125331i(str2)).mo106779a(str3).mo106780a(), new IGetDataCallback<String>() {
                            /* class com.ss.android.lark.platform.p2492m.C51838a.C518391.C518478.C518492 */

                            @Override // com.larksuite.framework.callback.IGetDataCallback
                            public void onError(ErrorResult errorResult) {
                                IGetDataCallback iGetDataCallback = iGetDataCallback;
                                if (iGetDataCallback != null) {
                                    iGetDataCallback.onError(errorResult);
                                }
                            }

                            /* renamed from: a */
                            public void onSuccess(String str) {
                                IGetDataCallback iGetDataCallback = iGetDataCallback;
                                if (iGetDataCallback != null) {
                                    iGetDataCallback.onSuccess(str);
                                }
                                if (!TextUtils.isEmpty(str4)) {
                                    C36083a.m141486a().getIMDependency().mo132841a(((C29601ad.C29603a) ((C29601ad.C29603a) ((C29601ad.C29603a) ((C29601ad.C29603a) C29601ad.m109464a().mo125332j(str)).mo125330h(str)).mo125331i(str)).mo125333k(str)).mo106659a(C59029c.m229161b(str4)).mo106660a(), iGetDataCallback);
                                }
                            }
                        });
                    }

                    @Override // com.ss.android.lark.forward.p1898a.AbstractC38365a.AbstractC38368c
                    /* renamed from: a */
                    public void mo140486a(List<String> list, String str, List<Transmit2ThreadTarget> list2, String str2, IGetDataCallback<TransmitResponse> iGetDataCallback) {
                        C36083a.m141486a().getIMDependency().mo132874a(list, str, list2, str2, iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.forward.p1898a.AbstractC38365a.AbstractC38368c
                    /* renamed from: a */
                    public void mo140477a(ShareObject shareObject, List<ShareTarget> list, IGetDataCallback<ShareAsMessageResponse> iGetDataCallback) {
                        C36083a.m141486a().getIMDependency().mo132834a(shareObject, list, iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.forward.p1898a.AbstractC38365a.AbstractC38368c
                    /* renamed from: a */
                    public void mo140482a(String str, String str2, List<String> list, IGetDataCallback<Void> iGetDataCallback) {
                        C36083a.m141486a().getIMDependency().mo132866a(str, str2, list, iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.forward.p1898a.AbstractC38365a.AbstractC38368c
                    /* renamed from: a */
                    public void mo140487a(List<String> list, List<String> list2, Content content, boolean z, boolean z2, String str, boolean z3, String str2, List<Transmit2ThreadTarget> list3, IGetDataCallback<MergeForwardMessagesResponse> iGetDataCallback) {
                        C36083a.m141486a().getIMDependency().mo132875a(list, list2, content, z, z2, str, z3, str2, list3, iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.forward.p1898a.AbstractC38365a.AbstractC38368c
                    /* renamed from: a */
                    public void mo140488a(List<String> list, List<TransmitTarget> list2, String str, IGetDataCallback<BatchTransmitResponse> iGetDataCallback) {
                        C36083a.m141486a().getIMDependency().mo132876a(list, list2, str, iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.forward.p1898a.AbstractC38365a.AbstractC38368c
                    /* renamed from: a */
                    public void mo140484a(List<String> list, int i, String str, CardLink cardLink, String str2, String str3, String str4, IGetDataCallback<String> iGetDataCallback) {
                        C36083a.m141486a().getIMDependency().mo132871a(list, i, str, new ShareAppCardLink(cardLink.mo140551a(), cardLink.mo140552b(), cardLink.mo140553c(), cardLink.mo140554d()), str2, str3, str4, iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.forward.p1898a.AbstractC38365a.AbstractC38368c
                    /* renamed from: a */
                    public void mo140476a(Context context, String str, boolean z) {
                        C36083a.m141486a().getIMDependency().mo132823a(context, ChatBundle.m109259a().mo105927a(str).mo105920a(-1).mo105933c(z ? "forward" : "sticker_set_activity").mo105929a());
                    }

                    @Override // com.ss.android.lark.forward.p1898a.AbstractC38365a.AbstractC38368c
                    /* renamed from: a */
                    public void mo140475a(Context context, String str, List<String> list, IGetDataCallback<Boolean> iGetDataCallback) {
                        C36083a.m141486a().getIMDependency().mo132831a(context, str, list, iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.forward.p1898a.AbstractC38365a.AbstractC38368c
                    /* renamed from: a */
                    public void mo140480a(String str, String str2, String str3) {
                        C36083a.m141486a().getIMDependency().mo132841a(((C29601ad.C29603a) ((C29601ad.C29603a) ((C29601ad.C29603a) ((C29601ad.C29603a) C29601ad.m109464a().mo106659a(C59029c.m229161b(str)).mo125332j(str2)).mo125330h(str3)).mo125331i(str3)).mo125333k(str3)).mo106660a(), (IGetDataCallback<String>) null);
                    }

                    @Override // com.ss.android.lark.forward.p1898a.AbstractC38365a.AbstractC38368c
                    /* renamed from: b */
                    public String mo140490b() {
                        return C36083a.m141486a().getIMDependency().mo132808a(C36083a.m141486a().getIMDependency().mo132961v(), ChatterNameDisplayRule.NICKNAME_NAME);
                    }

                    @Override // com.ss.android.lark.forward.p1898a.AbstractC38365a.AbstractC38368c
                    /* renamed from: a */
                    public Chat mo140469a(String str) {
                        return C36083a.m141486a().getIMDependency().mo132930f(str);
                    }

                    @Override // com.ss.android.lark.forward.p1898a.AbstractC38365a.AbstractC38368c
                    /* renamed from: b */
                    public Chat mo140489b(String str) {
                        return C36083a.m141486a().getIMDependency().mo132939h(str);
                    }

                    @Override // com.ss.android.lark.forward.p1898a.AbstractC38365a.AbstractC38368c
                    /* renamed from: c */
                    public Chatter mo140494c(String str) {
                        return C36083a.m141486a().getIMDependency().mo132943i(str);
                    }

                    @Override // com.ss.android.lark.forward.p1898a.AbstractC38365a.AbstractC38368c
                    /* renamed from: d */
                    public Map<String, Chat> mo140498d(List<String> list) {
                        return C36083a.m141486a().getIMDependency().mo132916d(list);
                    }

                    @Override // com.ss.android.lark.forward.p1898a.AbstractC38365a.AbstractC38368c
                    /* renamed from: e */
                    public Chat mo140499e(String str) {
                        return C36083a.m141486a().getIMDependency().mo132935g(str);
                    }

                    @Override // com.ss.android.lark.forward.p1898a.AbstractC38365a.AbstractC38368c
                    /* renamed from: f */
                    public void mo140500f(String str) {
                        C36083a.m141486a().getIMDependency().mo132950l(str);
                    }

                    @Override // com.ss.android.lark.forward.p1898a.AbstractC38365a.AbstractC38368c
                    /* renamed from: a */
                    public Image mo140470a(ImageContent imageContent) {
                        return C36083a.m141486a().getIMDependency().mo132803a(imageContent);
                    }

                    @Override // com.ss.android.lark.forward.p1898a.AbstractC38365a.AbstractC38368c
                    /* renamed from: c */
                    public Map<String, Chatter> mo140495c(List<String> list) {
                        return C36083a.m141486a().getIMDependency().mo132814a(list);
                    }

                    @Override // com.ss.android.lark.forward.p1898a.AbstractC38365a.AbstractC38368c
                    /* renamed from: d */
                    public String mo140497d(String str) {
                        return m201048a(C38364a.m151054a().mo140442d().mo140494c(str), ChatterNameDisplayRule.NICKNAME_NAME);
                    }

                    @Override // com.ss.android.lark.forward.p1898a.AbstractC38365a.AbstractC38368c
                    /* renamed from: b */
                    public Map<String, Message> mo140491b(List<String> list) {
                        ArrayList arrayList = new ArrayList();
                        for (String str : list) {
                            if (str != null) {
                                arrayList.add(str);
                            }
                        }
                        return C36083a.m141486a().getIMDependency().mo132907c(arrayList);
                    }

                    @Override // com.ss.android.lark.forward.p1898a.AbstractC38365a.AbstractC38368c
                    /* renamed from: a */
                    public Image mo140471a(MediaContent mediaContent) {
                        return C36083a.m141486a().getIMDependency().mo132804a(mediaContent);
                    }

                    @Override // com.ss.android.lark.forward.p1898a.AbstractC38365a.AbstractC38368c
                    /* renamed from: a */
                    public String mo140472a(Chat chat) {
                        return C36083a.m141486a().getIMDependency().mo132807a(chat);
                    }

                    @Override // com.ss.android.lark.forward.p1898a.AbstractC38365a.AbstractC38368c
                    /* renamed from: a */
                    public String mo140473a(Message message) {
                        return C36083a.m141486a().getIMDependency().mo132809a(message);
                    }

                    /* renamed from: a */
                    private String m201048a(Chatter chatter, ChatterNameDisplayRule chatterNameDisplayRule) {
                        if (chatter == null) {
                            return "";
                        }
                        String str = null;
                        if (chatter instanceof ChatChatter) {
                            ChatChatter chatChatter = (ChatChatter) chatter;
                            if (chatChatter.isOncallDuty()) {
                                return chatChatter.getName();
                            }
                            str = chatChatter.getNickName();
                        }
                        String alias = chatter.getAlias();
                        return m201050a(chatter.getName(), chatter.getEnName(), chatter.getLocalizedName(), str, alias, chatterNameDisplayRule);
                    }

                    /* renamed from: a */
                    private String m201049a(String str, String str2) {
                        Locale b = this.f128851b.mo140507b();
                        if (b == null) {
                            return this.f128851b.mo140506a().getLanguage();
                        }
                        if (!Locale.ENGLISH.getLanguage().equals(b.getLanguage()) || TextUtils.isEmpty(str2)) {
                            return str;
                        }
                        return str2;
                    }

                    @Override // com.ss.android.lark.forward.p1898a.AbstractC38365a.AbstractC38368c
                    /* renamed from: b */
                    public void mo140492b(List<String> list, IGetDataCallback<Map<String, ? extends OpenChat>> iGetDataCallback) {
                        C36083a.m141486a().getIMDependency().mo132872a(list, iGetDataCallback);
                    }

                    /* renamed from: a */
                    private String m201050a(String str, String str2, String str3, String str4, String str5, ChatterNameDisplayRule chatterNameDisplayRule) {
                        String str6;
                        int i = C518512.f128863a[chatterNameDisplayRule.ordinal()];
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    if (i != 4) {
                                        if (i == 5) {
                                            if (!aj.m95021b(str4)) {
                                                StringBuilder sb = new StringBuilder();
                                                sb.append(str4);
                                                if (!aj.m95021b(str5)) {
                                                    str6 = String.format("(%s)", str5);
                                                } else {
                                                    str6 = "";
                                                }
                                                sb.append(str6);
                                                return sb.toString();
                                            } else if (!aj.m95021b(str5)) {
                                                return str5;
                                            }
                                        }
                                    } else if (!aj.m95021b(str4)) {
                                        return str4;
                                    } else {
                                        if (!aj.m95021b(str5)) {
                                            return str5;
                                        }
                                    }
                                } else if (!aj.m95021b(str5)) {
                                    return str5;
                                } else {
                                    if (!aj.m95021b(str4)) {
                                        return str4;
                                    }
                                }
                            } else if (!aj.m95021b(str4)) {
                                return str4;
                            }
                        } else if (!aj.m95021b(str5)) {
                            return str5;
                        }
                        if (!TextUtils.isEmpty(str3)) {
                            str = str3;
                        }
                        return m201049a(str, str2);
                    }
                };
            }

            @Override // com.ss.android.lark.forward.p1898a.AbstractC38365a
            /* renamed from: e */
            public AbstractC38365a.AbstractC38371f mo140443e() {
                return new AbstractC38365a.AbstractC38371f() {
                    /* class com.ss.android.lark.platform.p2492m.C51838a.C518391.C518509 */

                    @Override // com.ss.android.lark.forward.p1898a.AbstractC38365a.AbstractC38371f
                    /* renamed from: a */
                    public List<C38389a> mo140504a() {
                        AbstractC29619l a = C36083a.m141486a().getIMDependency().mo132802a(FeedCard.FeedType.INBOX, FeedCard.Type.CHAT);
                        AbstractC29619l a2 = C36083a.m141486a().getIMDependency().mo132802a(FeedCard.FeedType.INBOX, FeedCard.Type.THREAD);
                        AbstractC29619l a3 = C36083a.m141486a().getIMDependency().mo132802a(FeedCard.FeedType.INBOX, FeedCard.Type.TOPIC);
                        ArrayList arrayList = new ArrayList();
                        if (C37239a.m146648b().mo136951a("lark.forward.fetch.feed.v1")) {
                            arrayList.addAll(a.mo106727a(FeedCard.FeedType.INBOX));
                            arrayList.addAll(a2.mo106727a(FeedCard.FeedType.INBOX));
                            arrayList.addAll(a3.mo106727a(FeedCard.FeedType.INBOX));
                            Log.m165389i("ForwardModuleProvider", "fetch from v1 count " + arrayList.size());
                        } else {
                            arrayList.addAll(a.mo106728b(FeedCard.FeedType.INBOX));
                            arrayList.addAll(a2.mo106728b(FeedCard.FeedType.INBOX));
                            arrayList.addAll(a3.mo106728b(FeedCard.FeedType.INBOX));
                            Log.m165389i("ForwardModuleProvider", "fetch from v2 count " + arrayList.size());
                        }
                        Collections.sort(arrayList);
                        return m201086a(arrayList);
                    }

                    /* renamed from: a */
                    private List<C38389a> m201086a(List<FeedPreviewInfo> list) {
                        boolean z;
                        boolean z2;
                        ArrayList arrayList = new ArrayList();
                        if (CollectionUtils.isEmpty(list)) {
                            return arrayList;
                        }
                        for (FeedPreviewInfo feedPreviewInfo : list) {
                            C38389a aVar = new C38389a();
                            aVar.mo140672d(feedPreviewInfo.mo106098p());
                            aVar.mo140678f(feedPreviewInfo.mo106105s());
                            aVar.mo140675e(feedPreviewInfo.mo106104r());
                            aVar.mo140682g(feedPreviewInfo.ah());
                            aVar.mo140661a(feedPreviewInfo.mo106051c());
                            aVar.mo140660a(feedPreviewInfo.mo106058d());
                            boolean z3 = false;
                            if (feedPreviewInfo.mo106101q() == FeedCard.Type.THREAD || feedPreviewInfo.mo106101q() == FeedCard.Type.TOPIC) {
                                z = true;
                            } else {
                                z = false;
                            }
                            aVar.mo140683g(z);
                            aVar.mo140671c(feedPreviewInfo.mo105984H());
                            aVar.mo140673d(feedPreviewInfo.aj());
                            aVar.mo140679f(feedPreviewInfo.mo105979C());
                            aVar.mo140668b(feedPreviewInfo.mo106079i());
                            aVar.mo140676e(feedPreviewInfo.mo105980D());
                            aVar.mo140659a(feedPreviewInfo.mo106000X());
                            aVar.mo140692k(feedPreviewInfo.ai());
                            aVar.mo140670c(feedPreviewInfo.mo105981E());
                            aVar.mo140662a(feedPreviewInfo.ao());
                            aVar.mo140685h(feedPreviewInfo.ap());
                            aVar.mo140667b(feedPreviewInfo.mo106074h());
                            if (Chatter.ChatterType.BOT != feedPreviewInfo.mo106068f() || !"bot".equals(feedPreviewInfo.mo106045b())) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            aVar.mo140664a(z2);
                            aVar.mo140686h(feedPreviewInfo.mo105998V());
                            if (!TextUtils.isEmpty(feedPreviewInfo.mo105990N()) && !TextUtils.equals(feedPreviewInfo.mo105990N(), "0")) {
                                z3 = true;
                            }
                            aVar.mo140688i(z3);
                            aVar.mo140690j(feedPreviewInfo.mo105999W());
                            aVar.mo140663a(feedPreviewInfo.al());
                            aVar.mo140658a(feedPreviewInfo.ak());
                            arrayList.add(aVar);
                            if (aVar.mo140696o()) {
                                aVar.mo140670c(feedPreviewInfo.mo105981E());
                                aVar.mo140662a(feedPreviewInfo.ao());
                            }
                        }
                        return arrayList;
                    }
                };
            }

            @Override // com.ss.android.lark.forward.p1898a.AbstractC38365a
            /* renamed from: f */
            public AbstractC38365a.AbstractC38372g mo140444f() {
                return new AbstractC38365a.AbstractC38372g() {
                    /* class com.ss.android.lark.platform.p2492m.C51838a.C518391.AnonymousClass10 */

                    @Override // com.ss.android.lark.forward.p1898a.AbstractC38365a.AbstractC38372g
                    /* renamed from: a */
                    public void mo140505a(Context context, String str, String str2, ImageView imageView, int i, int i2) {
                        LoadParams loadParams = new LoadParams();
                        loadParams.mo105413a(i);
                        loadParams.mo105422b(i2);
                        C51854a.m201094a().mo142158a(context, imageView, str, str2, loadParams);
                    }
                };
            }

            @Override // com.ss.android.lark.forward.p1898a.AbstractC38365a
            /* renamed from: g */
            public AbstractC38365a.AbstractC38366a mo140445g() {
                return new AbstractC38365a.AbstractC38366a() {
                    /* class com.ss.android.lark.platform.p2492m.C51838a.C518391.AnonymousClass11 */

                    @Override // com.ss.android.lark.forward.p1898a.AbstractC38365a.AbstractC38366a
                    /* renamed from: a */
                    public boolean mo140456a() {
                        return C36083a.m141486a().getPassportDependency().mo133094m().mo172429j();
                    }

                    @Override // com.ss.android.lark.forward.p1898a.AbstractC38365a.AbstractC38366a
                    /* renamed from: b */
                    public String mo140457b() {
                        return C36083a.m141486a().getPassportDependency().mo133094m().mo172422c();
                    }
                };
            }

            @Override // com.ss.android.lark.forward.p1898a.AbstractC38365a
            /* renamed from: h */
            public AbstractC38365a.AbstractC38367b mo140446h() {
                return new AbstractC38365a.AbstractC38367b() {
                    /* class com.ss.android.lark.platform.p2492m.C51838a.C518391.AnonymousClass12 */

                    @Override // com.ss.android.lark.forward.p1898a.AbstractC38365a.AbstractC38367b
                    /* renamed from: b */
                    public int mo140465b() {
                        return C36083a.m141486a().getCalendarDependency().mo132746b();
                    }

                    @Override // com.ss.android.lark.forward.p1898a.AbstractC38365a.AbstractC38367b
                    /* renamed from: c */
                    public void mo140466c() {
                        C36083a.m141486a().getCalendarDependency().mo132750c();
                    }

                    @Override // com.ss.android.lark.forward.p1898a.AbstractC38365a.AbstractC38367b
                    /* renamed from: d */
                    public boolean mo140467d() {
                        return C36083a.m141486a().getCalendarDependency().mo132756h();
                    }

                    @Override // com.ss.android.lark.forward.p1898a.AbstractC38365a.AbstractC38367b
                    /* renamed from: a */
                    public void mo140460a() {
                        C36083a.m141486a().getCalendarDependency().mo132731a();
                    }

                    @Override // com.ss.android.lark.forward.p1898a.AbstractC38365a.AbstractC38367b
                    /* renamed from: a */
                    public Content mo140459a(CalendarForwardData calendarForwardData) {
                        return C36083a.m141486a().getCalendarDependency().mo132730a(calendarForwardData);
                    }

                    @Override // com.ss.android.lark.forward.p1898a.AbstractC38365a.AbstractC38367b
                    /* renamed from: a */
                    public boolean mo140464a(Message message) {
                        return C36083a.m141486a().getCalendarDependency().mo132744a(message);
                    }

                    @Override // com.ss.android.lark.forward.p1898a.AbstractC38365a.AbstractC38367b
                    /* renamed from: a */
                    public Intent mo140458a(ArrayList<String> arrayList, boolean z) {
                        return C36083a.m141486a().getCalendarDependency().mo132729a(arrayList, z);
                    }

                    @Override // com.ss.android.lark.forward.p1898a.AbstractC38365a.AbstractC38367b
                    /* renamed from: a */
                    public void mo140463a(String str, IGetDataCallback<String> iGetDataCallback) {
                        C36083a.m141486a().getCalendarDependency().mo132739a(str, iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.forward.p1898a.AbstractC38365a.AbstractC38367b
                    /* renamed from: a */
                    public void mo140462a(CalendarForwardData calendarForwardData, String str, IGetDataCallback<Void> iGetDataCallback) {
                        C36083a.m141486a().getCalendarDependency().mo132738a(calendarForwardData, str, iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.forward.p1898a.AbstractC38365a.AbstractC38367b
                    /* renamed from: a */
                    public void mo140461a(TextView textView, TextView textView2, GifImageView gifImageView, Content content) {
                        C36083a.m141486a().getCalendarDependency().mo132737a(textView, textView2, gifImageView, content);
                    }
                };
            }

            @Override // com.ss.android.lark.forward.p1898a.AbstractC38365a
            /* renamed from: i */
            public AbstractC38365a.AbstractC38380o mo140447i() {
                return new AbstractC38365a.AbstractC38380o() {
                    /* class com.ss.android.lark.platform.p2492m.C51838a.C518391.AnonymousClass13 */

                    @Override // com.ss.android.lark.forward.p1898a.AbstractC38365a.AbstractC38380o
                    /* renamed from: a */
                    public int mo140516a() {
                        return C36083a.m141486a().getTodoDependency().mo133129b();
                    }

                    @Override // com.ss.android.lark.forward.p1898a.AbstractC38365a.AbstractC38380o
                    /* renamed from: a */
                    public Intent mo140517a(ArrayList<String> arrayList, String str, String str2) {
                        return C36083a.m141486a().getTodoDependency().mo133122a(arrayList, str, str2);
                    }

                    @Override // com.ss.android.lark.forward.p1898a.AbstractC38365a.AbstractC38380o
                    /* renamed from: a */
                    public void mo140518a(TextView textView, TextView textView2, GifImageView gifImageView, Content content) {
                        C36083a.m141486a().getTodoDependency().mo133126a(textView, textView2, gifImageView, content);
                    }

                    @Override // com.ss.android.lark.forward.p1898a.AbstractC38365a.AbstractC38380o
                    /* renamed from: a */
                    public void mo140519a(TextView textView, TextView textView2, GifImageView gifImageView, String str) {
                        C36083a.m141486a().getTodoDependency().mo133127a(textView, textView2, gifImageView, str);
                    }
                };
            }

            @Override // com.ss.android.lark.forward.p1898a.AbstractC38365a
            /* renamed from: k */
            public AbstractC38365a.AbstractC38370e mo140449k() {
                return new AbstractC38365a.AbstractC38370e() {
                    /* class com.ss.android.lark.platform.p2492m.C51838a.C518391.AnonymousClass15 */

                    @Override // com.ss.android.lark.forward.p1898a.AbstractC38365a.AbstractC38370e
                    /* renamed from: a */
                    public String mo140502a() {
                        return "result_chat_id";
                    }

                    @Override // com.ss.android.lark.forward.p1898a.AbstractC38365a.AbstractC38370e
                    /* renamed from: a */
                    public void mo140503a(C36516a aVar, int i) {
                        C36083a.m141486a().getIMDependency().mo132853a(aVar, i);
                    }
                };
            }

            @Override // com.ss.android.lark.forward.p1898a.AbstractC38365a
            /* renamed from: l */
            public AbstractC38365a.AbstractC38378m mo140450l() {
                return new AbstractC38365a.AbstractC38378m() {
                    /* class com.ss.android.lark.platform.p2492m.C51838a.C518391.C518412 */

                    /* renamed from: b */
                    private AbstractC54603d f128844b;

                    @Override // com.ss.android.lark.forward.p1898a.AbstractC38365a.AbstractC38378m
                    /* renamed from: a */
                    public boolean mo140513a(long j) {
                        if (this.f128844b == null) {
                            this.f128844b = SettingModuleProvider.f129183h.mo178263a().mo185219e();
                        }
                        return this.f128844b.mo186554a(j);
                    }
                };
            }

            @Override // com.ss.android.lark.forward.p1898a.AbstractC38365a
            /* renamed from: m */
            public AbstractC38365a.AbstractC38379n mo140451m() {
                return new AbstractC38365a.AbstractC38379n() {
                    /* class com.ss.android.lark.platform.p2492m.C51838a.C518391.C518467 */

                    @Override // com.ss.android.lark.forward.p1898a.AbstractC38365a.AbstractC38379n
                    /* renamed from: a */
                    public void mo140514a(ShareDataForwardData shareDataForwardData, int i) {
                        boolean z;
                        Object sourceData = shareDataForwardData.getSourceData();
                        if (sourceData != null && (sourceData instanceof CommonShareData)) {
                            C54713a a = C52054a.m201947a();
                            CommonShareData commonShareData = (CommonShareData) sourceData;
                            if (i == 3) {
                                z = true;
                            } else {
                                z = false;
                            }
                            a.mo186844a(commonShareData, z);
                        }
                    }

                    @Override // com.ss.android.lark.forward.p1898a.AbstractC38365a.AbstractC38379n
                    /* renamed from: a */
                    public void mo140515a(Chat chat, ShareDataForwardData shareDataForwardData) {
                        ShareChatDto shareChatDto = new ShareChatDto();
                        shareChatDto.setChatId(chat.getId());
                        shareChatDto.setExtraInfo(shareDataForwardData.getExtraInfo());
                        shareChatDto.setMessagePosition(chat.getLastMessagePosition());
                        if (shareDataForwardData.getSourceData() instanceof CommonShareData) {
                            C52054a.m201947a().mo186843a((CommonShareData) shareDataForwardData.getSourceData(), shareChatDto);
                            return;
                        }
                        CommonShareData commonShareData = new CommonShareData();
                        commonShareData.setImages(shareDataForwardData.getImages());
                        C52054a.m201947a().mo186843a(commonShareData, shareChatDto);
                    }
                };
            }

            @Override // com.ss.android.lark.forward.p1898a.AbstractC38365a
            /* renamed from: n */
            public AbstractC38365a.AbstractC38369d mo140452n() {
                return new AbstractC38365a.AbstractC38369d() {
                    /* class com.ss.android.lark.platform.p2492m.C51838a.C518391.C518423 */

                    @Override // com.ss.android.lark.forward.p1898a.AbstractC38365a.AbstractC38369d
                    /* renamed from: a */
                    public Map<String, Integer> mo140501a(Map<String, String> map) {
                        return C36099a.m141515a().mo130136e().mo130275a(map);
                    }
                };
            }

            @Override // com.ss.android.lark.forward.p1898a.AbstractC38365a
            /* renamed from: o */
            public AbstractC38365a.AbstractC38375j mo140453o() {
                return new AbstractC38365a.AbstractC38375j() {
                    /* class com.ss.android.lark.platform.p2492m.C51838a.C518391.C518456 */

                    @Override // com.ss.android.lark.forward.p1898a.AbstractC38365a.AbstractC38375j
                    /* renamed from: a */
                    public void mo140510a(Context context, List<String> list, CardContent cardContent, boolean z, AbstractC38365a.AbstractC38377l lVar) {
                        Log.m165389i("ForwardModuleProvider", "chatIconKey:" + list);
                        C36083a.m141486a().getOpenPlatformDependency().mo133014a(context, list, cardContent, z, lVar);
                    }

                    @Override // com.ss.android.lark.forward.p1898a.AbstractC38365a.AbstractC38375j
                    /* renamed from: a */
                    public void mo140509a(Context context, String str, String str2, CardContent cardContent, boolean z, AbstractC38365a.AbstractC38377l lVar) {
                        Log.m165389i("ForwardModuleProvider", "chatIconKey:" + str2);
                        C36083a.m141486a().getOpenPlatformDependency().mo133012a(context, str, str2, cardContent, z, lVar);
                    }
                };
            }

            @Override // com.ss.android.lark.forward.p1898a.AbstractC38365a
            /* renamed from: p */
            public AbstractC38365a.AbstractC38376k mo140454p() {
                return new AbstractC38365a.AbstractC38376k() {
                    /* class com.ss.android.lark.platform.p2492m.C51838a.C518391.C518434 */

                    @Override // com.ss.android.lark.forward.p1898a.AbstractC38365a.AbstractC38376k
                    /* renamed from: a */
                    public String mo140511a(String str, int i, int i2) {
                        return C36083a.m141486a().getResourceService().mo105864a(str, i, i2);
                    }
                };
            }

            @Override // com.ss.android.lark.forward.p1898a.AbstractC38365a
            /* renamed from: q */
            public AbstractC38365a.AbstractC38381p mo140455q() {
                return new AbstractC38365a.AbstractC38381p() {
                    /* class com.ss.android.lark.platform.p2492m.C51838a.C518391.C518445 */

                    @Override // com.ss.android.lark.forward.p1898a.AbstractC38365a.AbstractC38381p
                    /* renamed from: a */
                    public void mo140521a(ErrorResult errorResult, IGetDataCallback<String> iGetDataCallback) {
                        C36083a.m141486a().getVideoConferenceDependency().mo133134a(errorResult, iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.forward.p1898a.AbstractC38365a.AbstractC38381p
                    /* renamed from: a */
                    public void mo140520a(TextView textView, TextView textView2, ImageView imageView, Content content) {
                        C36083a.m141486a().getVideoConferenceDependency().mo133133a(textView, textView2, imageView, content);
                    }
                };
            }

            @Override // com.ss.android.lark.forward.p1898a.AbstractC38365a
            /* renamed from: b */
            public void mo140440b() {
                C36083a.m141486a().getIMDependency().mo132956q();
            }

            @Override // com.ss.android.lark.forward.p1898a.AbstractC38365a
            /* renamed from: a */
            public void mo140435a(Dialog dialog) {
                C51689a.m200461a().mo197363a(dialog);
            }

            @Override // com.ss.android.lark.forward.p1898a.AbstractC38365a
            /* renamed from: a */
            public boolean mo140439a(String str) {
                return C37239a.m146648b().mo136951a(str);
            }

            @Override // com.ss.android.lark.forward.p1898a.AbstractC38365a
            /* renamed from: a */
            public void mo140436a(Context context, ImageView imageView, StickImage stickImage) {
                C36083a.m141486a().getIMDependency().mo132822a(context, imageView, new StickerContent(stickImage.getKey(), stickImage.getWidth(), stickImage.getHeight()));
            }

            @Override // com.ss.android.lark.forward.p1898a.AbstractC38365a
            /* renamed from: a */
            public void mo140437a(Context context, String str, String str2, Bundle bundle) {
                bundle.putString("params_share_sourcename", str2);
                C36149a.m142162a().mo157098b().mo105707b(context, str, bundle);
            }

            @Override // com.ss.android.lark.forward.p1898a.AbstractC38365a
            /* renamed from: a */
            public void mo140438a(String str, List<String> list, List<AbstractC38365a.C38382q> list2, final IGetDataCallback<Map<String, String>> iGetDataCallback) {
                ArrayList arrayList = new ArrayList();
                for (AbstractC38365a.C38382q qVar : list2) {
                    C29612d dVar = new C29612d();
                    dVar.f74223b = qVar.f98603a;
                    dVar.f74222a = qVar.f98604b;
                    arrayList.add(dVar);
                }
                C36083a.m141486a().getIMDependency().mo132869a(str, list, arrayList, new IGetDataCallback<Map<String, String>>() {
                    /* class com.ss.android.lark.platform.p2492m.C51838a.C518391.AnonymousClass14 */

                    /* renamed from: a */
                    public void onSuccess(Map<String, String> map) {
                        iGetDataCallback.onSuccess(map);
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        iGetDataCallback.onError(errorResult);
                    }
                });
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public static /* synthetic */ void m200994a(List list, String str, int i, String str2, IGetDataCallback iGetDataCallback) {
                C36083a.m141486a().getCalendarDependency().mo132742a(list, str, i, str2, iGetDataCallback);
            }
        };
    }

    /* renamed from: a */
    public static C38364a m200992a() {
        return new C38364a(m200993b());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.platform.m.a$2 */
    public static /* synthetic */ class C518512 {

        /* renamed from: a */
        static final /* synthetic */ int[] f128863a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.ss.android.lark.biz.im.api.ChatterNameDisplayRule[] r0 = com.ss.android.lark.biz.im.api.ChatterNameDisplayRule.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.platform.p2492m.C51838a.C518512.f128863a = r0
                com.ss.android.lark.biz.im.api.ChatterNameDisplayRule r1 = com.ss.android.lark.biz.im.api.ChatterNameDisplayRule.ALIAS_NAME     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.platform.p2492m.C51838a.C518512.f128863a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.biz.im.api.ChatterNameDisplayRule r1 = com.ss.android.lark.biz.im.api.ChatterNameDisplayRule.NICKNAME_NAME     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.platform.p2492m.C51838a.C518512.f128863a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.biz.im.api.ChatterNameDisplayRule r1 = com.ss.android.lark.biz.im.api.ChatterNameDisplayRule.ALIAS_NICKNAME_NAME     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.lark.platform.p2492m.C51838a.C518512.f128863a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.lark.biz.im.api.ChatterNameDisplayRule r1 = com.ss.android.lark.biz.im.api.ChatterNameDisplayRule.NICKNAME_ALIAS_NAME     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.ss.android.lark.platform.p2492m.C51838a.C518512.f128863a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.ss.android.lark.biz.im.api.ChatterNameDisplayRule r1 = com.ss.android.lark.biz.im.api.ChatterNameDisplayRule.NICKNAME_WITH_ALIAS     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.platform.p2492m.C51838a.C518512.<clinit>():void");
        }
    }
}
