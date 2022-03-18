package com.ss.android.lark.chat.chatwindow.chat.p1613b;

import android.view.View;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.base.view.vo.message.AudioContentVO;
import com.ss.android.lark.chat.base.view.vo.message.BaseTextContentVO;
import com.ss.android.lark.chat.base.view.vo.message.TranslatableContentVO;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.AbstractC33142f;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33113b;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33114c;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33115d;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33116e;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33117f;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33118g;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33119h;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33121j;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33122k;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33123l;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33124m;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33125n;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33126o;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33127p;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33128q;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33129r;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33130s;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33131t;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33132u;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33133v;
import com.ss.android.lark.chat.chatwindow.chat.view.menu.handler.IEditImageMenuHandler;
import com.ss.android.lark.chat.chatwindow.chat.view.menu.handler.IViewInChatMenuHandler;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.export.ui.p1672b.C34029b;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.chat.vo.ChatMessageVO;
import com.ss.android.lark.p1820e.p1821a.C36894a;
import com.ss.android.lark.statistics.message.MessageHitPoint;
import com.ss.android.lark.statistics.translate.TranslateHitPoint;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.b.f */
public interface AbstractC33142f {

    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.b.f$-CC  reason: invalid class name */
    public final /* synthetic */ class CC {
        /* renamed from: a */
        public static C34029b m128070a(AbstractC33126o oVar, String str, int i) {
            return C34029b.m131930a().mo126127a(7).mo126133b(UIHelper.getString(R.string.Lark_Legacy_ReplyNow)).mo126132b(R.drawable.ud_icon_reply_cn_outlined).mo126134c(R.color.chat_operation_item_color_selector).mo126128a(new C34029b.AbstractC34032b(str, i) {
                /* class com.ss.android.lark.chat.chatwindow.chat.p1613b.$$Lambda$f$7coIgTsO8lI0EW752t5ObDBItU */
                public final /* synthetic */ String f$1;
                public final /* synthetic */ int f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                @Override // com.ss.android.lark.chat.export.ui.p1672b.C34029b.AbstractC34032b
                public final void onSelected(C34029b bVar) {
                    AbstractC33142f.CC.m270354lambda$7coIgTsO8lI0EW752t5ObDBItU(AbstractC33126o.this, this.f$1, this.f$2, bVar);
                }
            }).mo126131a();
        }

        /* renamed from: a */
        public static C34029b m128072a(AbstractC33129r rVar, String str) {
            return C34029b.m131930a().mo126127a(1).mo126133b(UIHelper.getString(R.string.Lark_Legacy_AddStickerForChat)).mo126132b(R.drawable.ud_icon_emoji_add_outlined).mo126134c(R.color.chat_operation_item_color_selector).mo126128a(new C34029b.AbstractC34032b(str) {
                /* class com.ss.android.lark.chat.chatwindow.chat.p1613b.$$Lambda$f$rJ_D_XYLPrRqFb0NydtCq8sOLog */
                public final /* synthetic */ String f$1;

                {
                    this.f$1 = r2;
                }

                @Override // com.ss.android.lark.chat.export.ui.p1672b.C34029b.AbstractC34032b
                public final void onSelected(C34029b bVar) {
                    AbstractC33142f.CC.lambda$rJ_D_XYLPrRqFb0NydtCq8sOLog(AbstractC33129r.this, this.f$1, bVar);
                }
            }).mo126131a();
        }

        /* renamed from: a */
        public static C34029b m128065a(AbstractC33118g gVar, String str, String str2) {
            return C34029b.m131930a().mo126127a(2).mo126133b(UIHelper.getString(R.string.Lark_Legacy_AddStickerForChat)).mo126132b(R.drawable.ud_icon_emoji_add_outlined).mo126134c(R.color.chat_operation_item_color_selector).mo126128a(new C34029b.AbstractC34032b(str, str2) {
                /* class com.ss.android.lark.chat.chatwindow.chat.p1613b.$$Lambda$f$2WwbX4alePK0xU0YfSTPgMqOfU */
                public final /* synthetic */ String f$1;
                public final /* synthetic */ String f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                @Override // com.ss.android.lark.chat.export.ui.p1672b.C34029b.AbstractC34032b
                public final void onSelected(C34029b bVar) {
                    AbstractC33142f.CC.m270351lambda$2WwbX4alePK0xU0YfSTPgMqOfU(AbstractC33118g.this, this.f$1, this.f$2, bVar);
                }
            }).mo126131a();
        }

        /* renamed from: a */
        public static <T extends AbsMessageVO> C34029b m128067a(AbstractC33122k kVar, T t) {
            return C34029b.m131930a().mo126127a(6).mo126133b(UIHelper.getString(R.string.Lark_Legacy_MutePlay)).mo126132b(R.drawable.ud_icon_speaker_mute_outlined).mo126134c(R.color.chat_operation_item_color_selector).mo126128a(new C34029b.AbstractC34032b(t) {
                /* class com.ss.android.lark.chat.chatwindow.chat.p1613b.$$Lambda$f$j0iCPIoufxbRzpPovfyL3I4PY0 */
                public final /* synthetic */ AbsMessageVO f$1;

                {
                    this.f$1 = r2;
                }

                @Override // com.ss.android.lark.chat.export.ui.p1672b.C34029b.AbstractC34032b
                public final void onSelected(C34029b bVar) {
                    AbstractC33142f.CC.m270357lambda$j0iCPIoufxbRzpPovfyL3I4PY0(AbstractC33122k.this, this.f$1, bVar);
                }
            }).mo126131a();
        }

        /* renamed from: a */
        public static C34029b m128066a(AbstractC33121j jVar, int i) {
            return C34029b.m131930a().mo126127a(12).mo126133b(UIHelper.getString(R.string.Lark_Chat_NewMultiselect)).mo126132b(R.drawable.ud_icon_multiple_outlined).mo126134c(R.color.chat_operation_item_color_selector).mo126128a(new C34029b.AbstractC34032b(i) {
                /* class com.ss.android.lark.chat.chatwindow.chat.p1613b.$$Lambda$f$QcoyMlVWOrP81GVVdOJeWBlBoUY */
                public final /* synthetic */ int f$1;

                {
                    this.f$1 = r2;
                }

                @Override // com.ss.android.lark.chat.export.ui.p1672b.C34029b.AbstractC34032b
                public final void onSelected(C34029b bVar) {
                    AbstractC33142f.CC.lambda$QcoyMlVWOrP81GVVdOJeWBlBoUY(AbstractC33121j.this, this.f$1, bVar);
                }
            }).mo126131a();
        }

        /* renamed from: a */
        public static C34029b m128071a(AbstractC33127p pVar, String str) {
            return C34029b.m131930a().mo126127a(11).mo126133b(UIHelper.getString(R.string.Lark_Legacy_SaveFavorite)).mo126132b(R.drawable.ud_icon_collection_outlined).mo126134c(R.color.chat_operation_item_color_selector).mo126128a(new C34029b.AbstractC34032b(str) {
                /* class com.ss.android.lark.chat.chatwindow.chat.p1613b.$$Lambda$f$uyVSTIVI_4pxaVJr0D4nAWUX8bI */
                public final /* synthetic */ String f$1;

                {
                    this.f$1 = r2;
                }

                @Override // com.ss.android.lark.chat.export.ui.p1672b.C34029b.AbstractC34032b
                public final void onSelected(C34029b bVar) {
                    AbstractC33142f.CC.lambda$uyVSTIVI_4pxaVJr0D4nAWUX8bI(AbstractC33127p.this, this.f$1, bVar);
                }
            }).mo126131a();
        }

        /* renamed from: a */
        public static C34029b m128069a(AbstractC33125n nVar, AbsMessageVO aVar) {
            return C34029b.m131930a().mo126127a(15).mo126133b(UIHelper.getString(R.string.Lark_Legacy_ChatWithdrow)).mo126132b(R.drawable.ud_icon_recall_outlined).mo126134c(R.color.chat_operation_item_color_selector).mo126128a(new C34029b.AbstractC34032b(aVar) {
                /* class com.ss.android.lark.chat.chatwindow.chat.p1613b.$$Lambda$f$XsCcbuNtz7KO8fWxIiB0FFwHPck */
                public final /* synthetic */ AbsMessageVO f$1;

                {
                    this.f$1 = r2;
                }

                @Override // com.ss.android.lark.chat.export.ui.p1672b.C34029b.AbstractC34032b
                public final void onSelected(C34029b bVar) {
                    AbstractC33142f.CC.lambda$XsCcbuNtz7KO8fWxIiB0FFwHPck(AbstractC33125n.this, this.f$1, bVar);
                }
            }).mo126131a();
        }

        /* renamed from: a */
        public static C34029b m128078a(boolean z, AbstractC33123l lVar, String str) {
            return C34029b.m131930a().mo126127a(13).mo126133b(UIHelper.getString(z ? R.string.Lark_Pin_UnpinButton : R.string.Lark_Pin_PinButton)).mo126132b(z ? R.drawable.ud_icon_unpin_outlined : R.drawable.ud_icon_pin_outlined).mo126134c(R.color.chat_operation_item_color_selector).mo126128a(new C34029b.AbstractC34032b(str, z) {
                /* class com.ss.android.lark.chat.chatwindow.chat.p1613b.$$Lambda$f$ZyJ1X8D7X_CZsasThty3LojMZGs */
                public final /* synthetic */ String f$1;
                public final /* synthetic */ boolean f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                @Override // com.ss.android.lark.chat.export.ui.p1672b.C34029b.AbstractC34032b
                public final void onSelected(C34029b bVar) {
                    AbstractC33142f.CC.lambda$ZyJ1X8D7X_CZsasThty3LojMZGs(AbstractC33123l.this, this.f$1, this.f$2, bVar);
                }
            }).mo126131a();
        }

        /* renamed from: a */
        public static /* synthetic */ void m128090a(AbstractC33123l lVar, String str, boolean z, C34029b bVar) {
            lVar.mo121939a(str, !z);
        }

        /* renamed from: a */
        public static C34029b m128068a(AbstractC33124m mVar, String str) {
            int i;
            int i2;
            if (C36894a.m145605a().mo136217n() == 1) {
                i2 = R.string.Lark_Legacy_PlayModeReceiver;
                i = R.drawable.ud_icon_ear_outlined;
            } else {
                i2 = R.string.Lark_Legacy_Playmodephonespeaker_Android;
                i = R.drawable.ud_icon_speaker_outlined;
            }
            return C34029b.m131930a().mo126127a(3).mo126133b(UIHelper.getString(i2)).mo126132b(i).mo126134c(R.color.chat_operation_item_color_selector).mo126128a(new C34029b.AbstractC34032b(str) {
                /* class com.ss.android.lark.chat.chatwindow.chat.p1613b.$$Lambda$f$bSU6SLyskRyVYthSDFmXlamU7p0 */
                public final /* synthetic */ String f$1;

                {
                    this.f$1 = r2;
                }

                @Override // com.ss.android.lark.chat.export.ui.p1672b.C34029b.AbstractC34032b
                public final void onSelected(C34029b bVar) {
                    AbstractC33142f.CC.lambda$bSU6SLyskRyVYthSDFmXlamU7p0(AbstractC33124m.this, this.f$1, bVar);
                }
            }).mo126131a();
        }

        /* renamed from: a */
        public static <C extends TranslatableContentVO<?>, M extends AbsMessageVO<C>> C34029b m128080a(boolean z, AbstractC33133v vVar, View view, AbstractC59010e eVar, M m, boolean z2) {
            int i;
            if (!z || z2) {
                i = R.string.Lark_Legacy_TranslateChat;
            } else {
                int x = ((TranslatableContentVO) m.mo121699g()).mo121929x();
                i = x != 2 ? x != 3 ? R.string.Lark_Legacy_ChatViewOriginalInfo : R.string.Lark_Chat_HideTranslation : R.string.Lark_Chat_ViewOriginalMessage;
            }
            return C34029b.m131930a().mo126127a(16).mo126133b(UIHelper.getString(i)).mo126132b(R.drawable.ud_icon_translate_outlined).mo126134c(R.color.chat_operation_item_color_selector).mo126128a(new C34029b.AbstractC34032b(view, eVar, m, z) {
                /* class com.ss.android.lark.chat.chatwindow.chat.p1613b.$$Lambda$f$3FEHjOZeX4zSO5W3IIujf2yOrY */
                public final /* synthetic */ View f$1;
                public final /* synthetic */ AbstractC59010e f$2;
                public final /* synthetic */ AbsMessageVO f$3;
                public final /* synthetic */ boolean f$4;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                    this.f$4 = r5;
                }

                @Override // com.ss.android.lark.chat.export.ui.p1672b.C34029b.AbstractC34032b
                public final void onSelected(C34029b bVar) {
                    AbstractC33142f.CC.m270352lambda$3FEHjOZeX4zSO5W3IIujf2yOrY(AbstractC33133v.this, this.f$1, this.f$2, this.f$3, this.f$4, bVar);
                }
            }).mo126131a();
        }

        /* renamed from: a */
        public static /* synthetic */ void m128100a(AbstractC33133v vVar, View view, AbstractC59010e eVar, AbsMessageVO aVar, boolean z, C34029b bVar) {
            vVar.mo122321a(view, eVar, aVar);
            if (aVar.mo121710r() == Message.Type.AUDIO && z) {
                TranslateHitPoint.f135913a.mo187768c();
            }
        }

        /* renamed from: a */
        public static C34029b m128075a(AbstractC33132u uVar, AbsMessageVO<AudioContentVO> aVar, boolean z, boolean z2) {
            return C34029b.m131930a().mo126127a(4).mo126133b(UIHelper.getString(!z ? R.string.Lark_Chat_HideText : R.string.Lark_Chat_ConvertToText)).mo126132b(!z ? R.drawable.ud_icon_untext_outlined : R.drawable.ud_icon_text_aa_outlined).mo126134c(R.color.chat_operation_item_color_selector).mo126128a(new C34029b.AbstractC34032b(aVar, z, z2) {
                /* class com.ss.android.lark.chat.chatwindow.chat.p1613b.$$Lambda$f$MqfrjmC9hpbefADlWStIXOS5ZFQ */
                public final /* synthetic */ AbsMessageVO f$1;
                public final /* synthetic */ boolean f$2;
                public final /* synthetic */ boolean f$3;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                }

                @Override // com.ss.android.lark.chat.export.ui.p1672b.C34029b.AbstractC34032b
                public final void onSelected(C34029b bVar) {
                    AbstractC33142f.CC.lambda$MqfrjmC9hpbefADlWStIXOS5ZFQ(AbstractC33132u.this, this.f$1, this.f$2, this.f$3, bVar);
                }
            }).mo126131a();
        }

        /* renamed from: a */
        public static /* synthetic */ void m128099a(AbstractC33132u uVar, AbsMessageVO aVar, boolean z, boolean z2, C34029b bVar) {
            uVar.mo121941b(aVar.mo121681a(), z);
            if (z) {
                MessageHitPoint.f135779d.mo187553f();
                return;
            }
            MessageHitPoint.f135779d.mo187546b(z2);
            if (((AudioContentVO) aVar.mo121699g()).mo121814i()) {
                TranslateHitPoint.f135913a.mo187766b();
            }
        }

        /* renamed from: a */
        public static C34029b m128074a(AbstractC33131t tVar, String str, String str2, Message.Type type) {
            boolean a = C29990c.m110930b().ai().mo134639a();
            return C34029b.m131930a().mo126127a(25).mo126133b(UIHelper.getString(a ? R.string.Lark_OpenPlatform_MsgScBttn : R.string.Lark_Legacy_TakeAnAction)).mo126132b(a ? R.drawable.ud_icon_keyboard_outlined : R.drawable.ud_icon_take_action_outlined).mo126134c(R.color.chat_operation_item_color_selector).mo126128a(new C34029b.AbstractC34032b(str, str2, type) {
                /* class com.ss.android.lark.chat.chatwindow.chat.p1613b.$$Lambda$f$xqlRTLSHum76fDs0jHCGJa03PmE */
                public final /* synthetic */ String f$1;
                public final /* synthetic */ String f$2;
                public final /* synthetic */ Message.Type f$3;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                }

                @Override // com.ss.android.lark.chat.export.ui.p1672b.C34029b.AbstractC34032b
                public final void onSelected(C34029b bVar) {
                    AbstractC33142f.CC.lambda$xqlRTLSHum76fDs0jHCGJa03PmE(AbstractC33131t.this, this.f$1, this.f$2, this.f$3, bVar);
                }
            }).mo126131a();
        }

        /* renamed from: a */
        public static C34029b m128073a(AbstractC33130s sVar, String str, int i) {
            return C34029b.m131930a().mo126127a(21).mo126133b(UIHelper.getString(R.string.Todo_Task_CreateATask)).mo126132b(R.drawable.ud_icon_tab_todo_outlined).mo126134c(R.color.chat_operation_item_color_selector).mo126128a(new C34029b.AbstractC34032b(str, i) {
                /* class com.ss.android.lark.chat.chatwindow.chat.p1613b.$$Lambda$f$xPNC_clYvLLQ5fAGBPBlaFnRQ0I */
                public final /* synthetic */ String f$1;
                public final /* synthetic */ int f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                @Override // com.ss.android.lark.chat.export.ui.p1672b.C34029b.AbstractC34032b
                public final void onSelected(C34029b bVar) {
                    AbstractC33142f.CC.lambda$xPNC_clYvLLQ5fAGBPBlaFnRQ0I(AbstractC33130s.this, this.f$1, this.f$2, bVar);
                }
            }).mo126131a();
        }

        /* renamed from: a */
        public static C34029b m128077a(IViewInChatMenuHandler bVar, String str, int i) {
            return C34029b.m131930a().mo126127a(10).mo126133b(UIHelper.getString(R.string.Lark_Message_ThreadMessageActionViewInChat)).mo126132b(R.drawable.ud_icon_viewinchat_outlined).mo126134c(R.color.chat_operation_item_color_selector).mo126128a(new C34029b.AbstractC34032b(str, i) {
                /* class com.ss.android.lark.chat.chatwindow.chat.p1613b.$$Lambda$f$YsmGnKOwmgj6hdHMGi4WQl6MrEs */
                public final /* synthetic */ String f$1;
                public final /* synthetic */ int f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                @Override // com.ss.android.lark.chat.export.ui.p1672b.C34029b.AbstractC34032b
                public final void onSelected(C34029b bVar) {
                    AbstractC33142f.CC.lambda$YsmGnKOwmgj6hdHMGi4WQl6MrEs(IViewInChatMenuHandler.this, this.f$1, this.f$2, bVar);
                }
            }).mo126131a();
        }

        /* renamed from: a */
        public static C34029b m128076a(IEditImageMenuHandler aVar, PhotoItem photoItem, boolean z) {
            return C34029b.m131930a().mo126127a(27).mo126133b(UIHelper.getString(R.string.Lark_Legacy_Edit)).mo126132b(R.drawable.ud_icon_edit_outlined).mo126134c(R.color.chat_operation_item_color_selector).mo126128a(new C34029b.AbstractC34032b(photoItem, z) {
                /* class com.ss.android.lark.chat.chatwindow.chat.p1613b.$$Lambda$f$4u8H0Dxq3xXxTePnl0k4N4cY6s */
                public final /* synthetic */ PhotoItem f$1;
                public final /* synthetic */ boolean f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                @Override // com.ss.android.lark.chat.export.ui.p1672b.C34029b.AbstractC34032b
                public final void onSelected(C34029b bVar) {
                    AbstractC33142f.CC.m270353lambda$4u8H0Dxq3xXxTePnl0k4N4cY6s(IEditImageMenuHandler.this, this.f$1, this.f$2, bVar);
                }
            }).mo126131a();
        }

        /* renamed from: a */
        public static C34029b m128060a(AbstractC33113b bVar, String str) {
            return C34029b.m131930a().mo126127a(24).mo126133b(UIHelper.getString(R.string.Lark_Legacy_MenuHidePreview)).mo126132b(R.drawable.ud_icon_visible_lock_outlined).mo126134c(R.color.chat_operation_item_color_selector).mo126128a(new C34029b.AbstractC34032b(str) {
                /* class com.ss.android.lark.chat.chatwindow.chat.p1613b.$$Lambda$f$XxY4tMSPf_9S7jLf4WNubaFI0Hc */
                public final /* synthetic */ String f$1;

                {
                    this.f$1 = r2;
                }

                @Override // com.ss.android.lark.chat.export.ui.p1672b.C34029b.AbstractC34032b
                public final void onSelected(C34029b bVar) {
                    AbstractC33142f.CC.lambda$XxY4tMSPf_9S7jLf4WNubaFI0Hc(AbstractC33113b.this, this.f$1, bVar);
                }
            }).mo126131a();
        }

        /* renamed from: a */
        public static <C extends BaseTextContentVO<?>, M extends AbsMessageVO<C>> C34029b m128061a(AbstractC33114c<C> cVar, M m) {
            return C34029b.m131930a().mo126127a(8).mo126133b(UIHelper.getString(R.string.Lark_Legacy_Copy)).mo126132b(R.drawable.ud_icon_copy_outlined).mo126134c(R.color.chat_operation_item_color_selector).mo126128a(new C34029b.AbstractC34032b(m) {
                /* class com.ss.android.lark.chat.chatwindow.chat.p1613b.$$Lambda$f$UwrhFIdGbqb89xJmRX632Vcpf_g */
                public final /* synthetic */ AbsMessageVO f$1;

                {
                    this.f$1 = r2;
                }

                @Override // com.ss.android.lark.chat.export.ui.p1672b.C34029b.AbstractC34032b
                public final void onSelected(C34029b bVar) {
                    AbstractC33142f.CC.lambda$UwrhFIdGbqb89xJmRX632Vcpf_g(AbstractC33114c.this, this.f$1, bVar);
                }
            }).mo126131a();
        }

        /* renamed from: a */
        public static C34029b m128062a(AbstractC33115d dVar, ChatMessageVO<?> cVar) {
            return C34029b.m131930a().mo126127a(23).mo126133b(UIHelper.getString(R.string.Lark_Legacy_Delete)).mo126132b(R.drawable.ud_icon_delete_trash_outlined).mo126134c(R.color.chat_operation_item_color_selector).mo126128a(new C34029b.AbstractC34032b(cVar) {
                /* class com.ss.android.lark.chat.chatwindow.chat.p1613b.$$Lambda$f$GXysaQt2vDL4fYsB5bfoNtJV8EI */
                public final /* synthetic */ ChatMessageVO f$1;

                {
                    this.f$1 = r2;
                }

                @Override // com.ss.android.lark.chat.export.ui.p1672b.C34029b.AbstractC34032b
                public final void onSelected(C34029b bVar) {
                    AbstractC33142f.CC.lambda$GXysaQt2vDL4fYsB5bfoNtJV8EI(AbstractC33115d.this, this.f$1, bVar);
                }
            }).mo126131a();
        }

        /* renamed from: a */
        public static C34029b m128063a(AbstractC33116e eVar, String str) {
            return C34029b.m131930a().mo126127a(5).mo126133b(UIHelper.getString(R.string.Lark_Legacy_ChatViewBuzz)).mo126132b(R.drawable.ud_icon_buzz_outlined).mo126134c(R.color.chat_operation_item_color_selector).mo126128a(new C34029b.AbstractC34032b(str) {
                /* class com.ss.android.lark.chat.chatwindow.chat.p1613b.$$Lambda$f$dz0UhRnkfF4yzF5VMp_dVyOq6Y */
                public final /* synthetic */ String f$1;

                {
                    this.f$1 = r2;
                }

                @Override // com.ss.android.lark.chat.export.ui.p1672b.C34029b.AbstractC34032b
                public final void onSelected(C34029b bVar) {
                    AbstractC33142f.CC.m270356lambda$dz0UhRnkfF4yzF5VMp_dVyOq6Y(AbstractC33116e.this, this.f$1, bVar);
                }
            }).mo126131a();
        }

        /* renamed from: a */
        public static C34029b m128064a(AbstractC33117f fVar, String str) {
            return C34029b.m131930a().mo126127a(9).mo126133b(UIHelper.getString(R.string.Lark_Legacy_MenuForward)).mo126132b(R.drawable.ud_icon_forward_outlined).mo126134c(R.color.chat_operation_item_color_selector).mo126128a(new C34029b.AbstractC34032b(str) {
                /* class com.ss.android.lark.chat.chatwindow.chat.p1613b.$$Lambda$f$MOXjgXdPX0cbfWyx7zljVm6lcM */
                public final /* synthetic */ String f$1;

                {
                    this.f$1 = r2;
                }

                @Override // com.ss.android.lark.chat.export.ui.p1672b.C34029b.AbstractC34032b
                public final void onSelected(C34029b bVar) {
                    AbstractC33142f.CC.m270355lambda$MOXjgXdPX0cbfWyx7zljVm6lcM(AbstractC33117f.this, this.f$1, bVar);
                }
            }).mo126131a();
        }

        /* renamed from: a */
        public static <M extends AbsMessageVO<?>> C34029b m128059a(View view, AbstractC33128q qVar, M m) {
            return C34029b.m131930a().mo126127a(26).mo126133b(UIHelper.getString(R.string.Lark_Legacy_Search)).mo126132b(R.drawable.ud_icon_search_outline_outlined).mo126134c(R.color.chat_operation_item_color_selector).mo126128a(new C34029b.AbstractC34032b(view, m) {
                /* class com.ss.android.lark.chat.chatwindow.chat.p1613b.$$Lambda$f$CtZMzYfUfpFkZUeUb4AZBL01kRk */
                public final /* synthetic */ View f$1;
                public final /* synthetic */ AbsMessageVO f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                @Override // com.ss.android.lark.chat.export.ui.p1672b.C34029b.AbstractC34032b
                public final void onSelected(C34029b bVar) {
                    AbstractC33142f.CC.lambda$CtZMzYfUfpFkZUeUb4AZBL01kRk(AbstractC33128q.this, this.f$1, this.f$2, bVar);
                }
            }).mo126131a();
        }

        /* renamed from: a */
        public static <M extends AbsMessageVO<?>> C34029b m128058a(View view, AbstractC33119h hVar, M m, Chat chat) {
            return C34029b.m131930a().mo126127a(22).mo126133b(UIHelper.getString(R.string.Lark_Project_Projects)).mo126132b(R.drawable.ud_icon_meego_outlined).mo126134c(R.color.chat_operation_item_color_selector).mo126128a(new C34029b.AbstractC34032b(view, m, chat) {
                /* class com.ss.android.lark.chat.chatwindow.chat.p1613b.$$Lambda$f$LToJxtvJEi0jcrryDiQLbj6cnM */
                public final /* synthetic */ View f$1;
                public final /* synthetic */ AbsMessageVO f$2;
                public final /* synthetic */ Chat f$3;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                }

                @Override // com.ss.android.lark.chat.export.ui.p1672b.C34029b.AbstractC34032b
                public final void onSelected(C34029b bVar) {
                    AbstractC33142f.CC.m270350lambda$LToJxtvJEi0jcrryDiQLbj6cnM(AbstractC33119h.this, this.f$1, this.f$2, this.f$3, bVar);
                }
            }).mo126131a();
        }

        /* renamed from: a */
        public static <C extends TranslatableContentVO<?>, M extends AbsMessageVO<C>> C34029b m128079a(boolean z, AbstractC33133v vVar, View view, AbstractC59010e eVar, M m) {
            return m128080a(z, vVar, view, eVar, (AbsMessageVO) m, false);
        }
    }
}
