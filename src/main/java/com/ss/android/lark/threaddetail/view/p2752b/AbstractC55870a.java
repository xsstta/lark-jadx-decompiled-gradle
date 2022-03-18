package com.ss.android.lark.threaddetail.view.p2752b;

import android.view.View;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.base.view.vo.ThreadMessageVO;
import com.ss.android.lark.chat.base.view.vo.message.AudioContentVO;
import com.ss.android.lark.chat.base.view.vo.message.StickerContentVO;
import com.ss.android.lark.chat.base.view.vo.message.TranslatableContentVO;
import com.ss.android.lark.chat.export.ui.p1672b.C34029b;
import com.ss.android.lark.chat.utils.C34350p;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.chat.vo.ChatMessageVO;
import com.ss.android.lark.statistics.translate.TranslateHitPoint;
import com.ss.android.lark.threaddetail.view.p2752b.AbstractC55870a;
import com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55876a;
import com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55877b;
import com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55878c;
import com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55879d;
import com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55880e;
import com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55884g;
import com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55885h;
import com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55886i;
import com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55887j;
import com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55888k;
import com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55889l;
import com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55890m;
import com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55893n;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.threaddetail.view.b.a */
public interface AbstractC55870a {

    /* renamed from: com.ss.android.lark.threaddetail.view.b.a$-CC  reason: invalid class name */
    public final /* synthetic */ class CC {
        /* renamed from: a */
        public static C34029b m217018a(AbstractC55893n nVar, View view, TranslatableContentVO<?> oVar, String str, int i) {
            int a = C34350p.m133210a(oVar.mo121925t(), oVar.mo121929x());
            boolean i2 = oVar.mo121814i();
            return C34029b.m131930a().mo126127a(16).mo126133b(UIHelper.getString(a)).mo126132b(R.drawable.ud_icon_translate_outlined).mo126134c(R.color.chat_operation_item_color_selector).mo126128a(new C34029b.AbstractC34032b(new AbstractC55893n.AbstractC55894a(oVar, str, i, view) {
                /* class com.ss.android.lark.threaddetail.view.p2752b.AbstractC55870a.C558711 */

                /* renamed from: a */
                final /* synthetic */ TranslatableContentVO f138051a;

                /* renamed from: b */
                final /* synthetic */ String f138052b;

                /* renamed from: c */
                final /* synthetic */ int f138053c;

                /* renamed from: d */
                final /* synthetic */ View f138054d;

                @Override // com.ss.android.lark.threaddetail.view.p2752b.p2754b.AbstractC55881f.AbstractC55882a
                /* renamed from: c */
                public View mo121962c() {
                    return this.f138054d;
                }

                /* renamed from: b */
                public AbstractC55893n.C55895b mo121960a() {
                    AbstractC55893n.C55895b bVar = new AbstractC55893n.C55895b();
                    bVar.f138068a = this.f138051a.mo121925t();
                    bVar.f138069b = this.f138052b;
                    bVar.f138070c = this.f138053c;
                    return bVar;
                }

                {
                    this.f138051a = r1;
                    this.f138052b = r2;
                    this.f138053c = r3;
                    this.f138054d = r4;
                }
            }, oVar, i2) {
                /* class com.ss.android.lark.threaddetail.view.p2752b.$$Lambda$a$DPLPeTlkM_jYYo9AKl8v45TiM */
                public final /* synthetic */ AbstractC55893n.AbstractC55894a f$1;
                public final /* synthetic */ TranslatableContentVO f$2;
                public final /* synthetic */ boolean f$3;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                }

                @Override // com.ss.android.lark.chat.export.ui.p1672b.C34029b.AbstractC34032b
                public final void onSelected(C34029b bVar) {
                    AbstractC55870a.CC.m271016lambda$DPLPeTlkM_jYYo9AKl8v45TiM(AbstractC55893n.this, this.f$1, this.f$2, this.f$3, bVar);
                }
            }).mo126131a();
        }

        /* renamed from: a */
        public static /* synthetic */ void m217029a(AbstractC55893n nVar, AbstractC55893n.AbstractC55894a aVar, TranslatableContentVO oVar, boolean z, C34029b bVar) {
            nVar.mo121954a(aVar);
            if ((oVar instanceof AudioContentVO) && z) {
                TranslateHitPoint.f135913a.mo187768c();
            }
        }

        /* renamed from: a */
        public static C34029b<?> m217016a(AbstractC55890m mVar, AbsMessageVO<AudioContentVO> aVar, AbstractC55890m.AbstractC55891a aVar2) {
            boolean z = ((AbstractC55890m.C55892b) aVar2.mo121960a()).f138067b;
            return C34029b.m131930a().mo126127a(4).mo126133b(UIHelper.getString(z ? R.string.Lark_Chat_ConvertToText : R.string.Lark_Chat_HideText)).mo126132b(z ? R.drawable.ud_icon_text_aa_outlined : R.drawable.ud_icon_untext_outlined).mo126134c(R.color.chat_operation_item_color_selector).mo126128a(new C34029b.AbstractC34032b(aVar2, z, aVar) {
                /* class com.ss.android.lark.threaddetail.view.p2752b.$$Lambda$a$58zr8nP47WjVZe287xzPmPOmeD4 */
                public final /* synthetic */ AbstractC55890m.AbstractC55891a f$1;
                public final /* synthetic */ boolean f$2;
                public final /* synthetic */ AbsMessageVO f$3;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                }

                @Override // com.ss.android.lark.chat.export.ui.p1672b.C34029b.AbstractC34032b
                public final void onSelected(C34029b bVar) {
                    AbstractC55870a.CC.lambda$58zr8nP47WjVZe287xzPmPOmeD4(AbstractC55890m.this, this.f$1, this.f$2, this.f$3, bVar);
                }
            }).mo126131a();
        }

        /* renamed from: a */
        public static /* synthetic */ void m217028a(AbstractC55890m mVar, AbstractC55890m.AbstractC55891a aVar, boolean z, AbsMessageVO aVar2, C34029b bVar) {
            mVar.mo121953a(aVar);
            if (!z && ((AudioContentVO) aVar2.mo121699g()).mo121814i()) {
                TranslateHitPoint.f135913a.mo187766b();
            }
        }

        /* renamed from: a */
        public static C34029b m217013a(AbstractC55887j jVar, String str) {
            return C34029b.m131930a().mo126127a(7).mo126133b(UIHelper.getString(R.string.Lark_Legacy_ReplyNow)).mo126132b(R.drawable.ud_icon_reply_cn_outlined).mo126134c(R.color.chat_operation_item_color_selector).mo126128a(new C34029b.AbstractC34032b(str) {
                /* class com.ss.android.lark.threaddetail.view.p2752b.$$Lambda$a$hDNwO7f215IXatlLrPDpsPK9GJo */
                public final /* synthetic */ String f$1;

                {
                    this.f$1 = r2;
                }

                @Override // com.ss.android.lark.chat.export.ui.p1672b.C34029b.AbstractC34032b
                public final void onSelected(C34029b bVar) {
                    AbstractC55870a.CC.lambda$hDNwO7f215IXatlLrPDpsPK9GJo(AbstractC55887j.this, this.f$1, bVar);
                }
            }).mo126131a();
        }

        /* renamed from: a */
        public static C34029b m217012a(AbstractC55886i iVar, ChatMessageVO cVar) {
            return C34029b.m131930a().mo126127a(15).mo126133b(UIHelper.getString(R.string.Lark_Legacy_ChatWithdrow)).mo126132b(R.drawable.ud_icon_recall_outlined).mo126134c(R.color.chat_operation_item_color_selector).mo126128a(new C34029b.AbstractC34032b(cVar) {
                /* class com.ss.android.lark.threaddetail.view.p2752b.$$Lambda$a$iouXeBeVMBNNmEIYq2rhKdMR60o */
                public final /* synthetic */ ChatMessageVO f$1;

                {
                    this.f$1 = r2;
                }

                @Override // com.ss.android.lark.chat.export.ui.p1672b.C34029b.AbstractC34032b
                public final void onSelected(C34029b bVar) {
                    AbstractC55870a.CC.lambda$iouXeBeVMBNNmEIYq2rhKdMR60o(AbstractC55886i.this, this.f$1, bVar);
                }
            }).mo126131a();
        }

        /* renamed from: a */
        public static <T extends AbsMessageVO> C34029b m217011a(AbstractC55885h hVar, T t) {
            return C34029b.m131930a().mo126127a(6).mo126133b(UIHelper.getString(R.string.Lark_Legacy_MutePlay)).mo126132b(R.drawable.ud_icon_speaker_mute_outlined).mo126134c(R.color.chat_operation_item_color_selector).mo126128a(new C34029b.AbstractC34032b(t) {
                /* class com.ss.android.lark.threaddetail.view.p2752b.$$Lambda$a$w90F9v0IBVzvMd56pUCGW8hy6gU */
                public final /* synthetic */ AbsMessageVO f$1;

                {
                    this.f$1 = r2;
                }

                @Override // com.ss.android.lark.chat.export.ui.p1672b.C34029b.AbstractC34032b
                public final void onSelected(C34029b bVar) {
                    AbstractC55870a.CC.lambda$w90F9v0IBVzvMd56pUCGW8hy6gU(AbstractC55885h.this, this.f$1, bVar);
                }
            }).mo126131a();
        }

        /* renamed from: a */
        public static C34029b m217014a(AbstractC55888k kVar, String str, int i) {
            return C34029b.m131930a().mo126127a(21).mo126133b(UIHelper.getString(R.string.Todo_Task_CreateATask)).mo126132b(R.drawable.ud_icon_tab_todo_outlined).mo126134c(R.color.chat_operation_item_color_selector).mo126128a(new C34029b.AbstractC34032b(kVar, str, i) {
                /* class com.ss.android.lark.threaddetail.view.p2752b.AbstractC55870a.C558722 */

                /* renamed from: a */
                final /* synthetic */ AbstractC55888k f138055a;

                /* renamed from: b */
                final /* synthetic */ String f138056b;

                /* renamed from: c */
                final /* synthetic */ int f138057c;

                @Override // com.ss.android.lark.chat.export.ui.p1672b.C34029b.AbstractC34032b
                public void onSelected(C34029b bVar) {
                    this.f138055a.mo190488b(this.f138056b, this.f138057c);
                }

                {
                    this.f138055a = r1;
                    this.f138056b = r2;
                    this.f138057c = r3;
                }
            }).mo126131a();
        }

        /* renamed from: a */
        public static C34029b m217015a(AbstractC55889l lVar, String str, ThreadMessageVO threadMessageVO) {
            return C34029b.m131930a().mo126127a(21).mo126133b(UIHelper.getString(R.string.Todo_Task_CreateATask)).mo126132b(R.drawable.ud_icon_tab_todo_outlined).mo126134c(R.color.chat_operation_item_color_selector).mo126128a(new C34029b.AbstractC34032b(lVar, str, threadMessageVO) {
                /* class com.ss.android.lark.threaddetail.view.p2752b.AbstractC55870a.C558733 */

                /* renamed from: a */
                final /* synthetic */ AbstractC55889l f138058a;

                /* renamed from: b */
                final /* synthetic */ String f138059b;

                /* renamed from: c */
                final /* synthetic */ ThreadMessageVO f138060c;

                @Override // com.ss.android.lark.chat.export.ui.p1672b.C34029b.AbstractC34032b
                public void onSelected(C34029b bVar) {
                    this.f138058a.mo190553a(this.f138059b, this.f138060c);
                }

                {
                    this.f138058a = r1;
                    this.f138059b = r2;
                    this.f138060c = r3;
                }
            }).mo126131a();
        }

        /* renamed from: a */
        public static C34029b m217005a(AbstractC55876a aVar, ChatMessageVO cVar) {
            return C34029b.m131930a().mo126127a(11).mo126133b(UIHelper.getString(R.string.Lark_Legacy_SaveFavorite)).mo126132b(R.drawable.ud_icon_collection_outlined).mo126134c(R.color.chat_operation_item_color_selector).mo126128a(new C34029b.AbstractC34032b(cVar) {
                /* class com.ss.android.lark.threaddetail.view.p2752b.$$Lambda$a$GKEfzGXLb60V192rqOhfTCsdBlg */
                public final /* synthetic */ ChatMessageVO f$1;

                {
                    this.f$1 = r2;
                }

                @Override // com.ss.android.lark.chat.export.ui.p1672b.C34029b.AbstractC34032b
                public final void onSelected(C34029b bVar) {
                    AbstractC55870a.CC.lambda$GKEfzGXLb60V192rqOhfTCsdBlg(AbstractC55876a.this, this.f$1, bVar);
                }
            }).mo126131a();
        }

        /* renamed from: a */
        public static C34029b m217006a(AbstractC55877b bVar, AbsMessageVO<StickerContentVO> aVar) {
            return C34029b.m131930a().mo126127a(1).mo126133b(UIHelper.getString(R.string.Lark_Legacy_AddStickerForChat)).mo126132b(R.drawable.ud_icon_emoji_add_outlined).mo126134c(R.color.chat_operation_item_color_selector).mo126128a(new C34029b.AbstractC34032b(aVar) {
                /* class com.ss.android.lark.threaddetail.view.p2752b.$$Lambda$a$QsIHkhCFfVRayQrbJSB00UHfnaM */
                public final /* synthetic */ AbsMessageVO f$1;

                {
                    this.f$1 = r2;
                }

                @Override // com.ss.android.lark.chat.export.ui.p1672b.C34029b.AbstractC34032b
                public final void onSelected(C34029b bVar) {
                    AbstractC55870a.CC.lambda$QsIHkhCFfVRayQrbJSB00UHfnaM(AbstractC55877b.this, this.f$1, bVar);
                }
            }).mo126131a();
        }

        /* renamed from: a */
        public static C34029b m217007a(AbstractC55878c cVar, AbsMessageVO<?> aVar) {
            return C34029b.m131930a().mo126127a(8).mo126133b(UIHelper.getString(R.string.Lark_Legacy_Copy)).mo126132b(R.drawable.ud_icon_copy_outlined).mo126134c(R.color.chat_operation_item_color_selector).mo126128a(new C34029b.AbstractC34032b(aVar) {
                /* class com.ss.android.lark.threaddetail.view.p2752b.$$Lambda$a$r4OkmtnjF9o1vY6oEwZygK_1FM */
                public final /* synthetic */ AbsMessageVO f$1;

                {
                    this.f$1 = r2;
                }

                @Override // com.ss.android.lark.chat.export.ui.p1672b.C34029b.AbstractC34032b
                public final void onSelected(C34029b bVar) {
                    AbstractC55870a.CC.m271018lambda$r4OkmtnjF9o1vY6oEwZygK_1FM(AbstractC55878c.this, this.f$1, bVar);
                }
            }).mo126131a();
        }

        /* renamed from: a */
        public static C34029b m217008a(AbstractC55879d dVar, AbsMessageVO<?> aVar) {
            return C34029b.m131930a().mo126127a(8).mo126133b(UIHelper.getString(R.string.Lark_Legacy_Copy)).mo126132b(R.drawable.ud_icon_copy_outlined).mo126134c(R.color.chat_operation_item_color_selector).mo126128a(new C34029b.AbstractC34032b(aVar) {
                /* class com.ss.android.lark.threaddetail.view.p2752b.$$Lambda$a$kU4JgaYvjteOFQKoOCPkM027830 */
                public final /* synthetic */ AbsMessageVO f$1;

                {
                    this.f$1 = r2;
                }

                @Override // com.ss.android.lark.chat.export.ui.p1672b.C34029b.AbstractC34032b
                public final void onSelected(C34029b bVar) {
                    AbstractC55870a.CC.lambda$kU4JgaYvjteOFQKoOCPkM027830(AbstractC55879d.this, this.f$1, bVar);
                }
            }).mo126131a();
        }

        /* renamed from: a */
        public static C34029b m217010a(AbstractC55884g gVar, int i) {
            return C34029b.m131930a().mo126127a(12).mo126133b(UIHelper.getString(R.string.Lark_Legacy_MenuMultiSelect)).mo126132b(R.drawable.ud_icon_multiple_outlined).mo126134c(R.color.chat_operation_item_color_selector).mo126128a(new C34029b.AbstractC34032b(i) {
                /* class com.ss.android.lark.threaddetail.view.p2752b.$$Lambda$a$Ob6H4J2IqOD8uoLTvjitH7qWA */
                public final /* synthetic */ int f$1;

                {
                    this.f$1 = r2;
                }

                @Override // com.ss.android.lark.chat.export.ui.p1672b.C34029b.AbstractC34032b
                public final void onSelected(C34029b bVar) {
                    AbstractC55870a.CC.m271017lambda$Ob6H4J2IqOD8uoLTvjitH7qWA(AbstractC55884g.this, this.f$1, bVar);
                }
            }).mo126131a();
        }

        /* renamed from: a */
        public static C34029b m217009a(AbstractC55880e eVar, String str, int i) {
            return C34029b.m131930a().mo126127a(9).mo126133b(UIHelper.getString(R.string.Lark_Legacy_MenuForward)).mo126132b(R.drawable.ud_icon_forward_outlined).mo126134c(R.color.chat_operation_item_color_selector).mo126128a(new C34029b.AbstractC34032b(str, i) {
                /* class com.ss.android.lark.threaddetail.view.p2752b.$$Lambda$a$yU4nOFIOFkmvDOh93JxOaGv2dV4 */
                public final /* synthetic */ String f$1;
                public final /* synthetic */ int f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                @Override // com.ss.android.lark.chat.export.ui.p1672b.C34029b.AbstractC34032b
                public final void onSelected(C34029b bVar) {
                    AbstractC55870a.CC.lambda$yU4nOFIOFkmvDOh93JxOaGv2dV4(AbstractC55880e.this, this.f$1, this.f$2, bVar);
                }
            }).mo126131a();
        }

        /* renamed from: a */
        public static C34029b m217017a(AbstractC55893n nVar, View view, TranslatableContentVO<?> oVar, String str) {
            return m217018a(nVar, view, oVar, str, 0);
        }
    }
}
