package com.ss.android.lark.chatwindow;

import android.content.Context;
import android.content.DialogInterface;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.ImageView;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.dialog.C25644o;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.base.view.vo.message.ImageContentVO;
import com.ss.android.lark.chatwindow.C35212a;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.entity.C38824b;
import com.ss.android.lark.image.entity.Image;
import com.ss.android.lark.p2150m.C41706a;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.statistics.message.MessageHitPoint;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.dialog.C58423b;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ss.android.lark.chatwindow.a */
public class C35212a {

    /* renamed from: com.ss.android.lark.chatwindow.a$a */
    public interface AbstractC35215a {
        /* renamed from: a */
        void mo122372a();

        /* renamed from: b */
        void mo122373b();
    }

    /* renamed from: com.ss.android.lark.chatwindow.a$b */
    public interface AbstractC35216b {
        /* renamed from: a */
        void mo122744a();

        /* renamed from: b */
        void mo122745b();
    }

    /* renamed from: com.ss.android.lark.chatwindow.a$c */
    public interface AbstractC35217c {
        void onChecked(int i);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m137537a(View.OnClickListener onClickListener, DialogInterface dialogInterface, int i) {
        if (i == 0) {
            if (onClickListener != null) {
                onClickListener.onClick(null);
            }
            MessageHitPoint.f135779d.mo187548c();
        }
    }

    /* renamed from: a */
    public static void m137531a(Context context, String str, String str2) {
        new C25639g(context).mo89251j(2).mo89238b(true).mo89237b(str).mo89242c(str2).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Group_RevokeIKnow, (DialogInterface.OnClickListener) null).mo89239c();
    }

    /* renamed from: a */
    public static void m137535a(Context context, int[] iArr, AbstractC35216b bVar) {
        String[] strArr = new String[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            strArr[i] = C57582a.m223604a(context, iArr[i]);
        }
        ((C25644o) ((C25644o) ((C25644o) new C25644o(context).mo89206a(strArr)).mo89202a(new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.chatwindow.$$Lambda$a$vEBtEYSV2EDFWztpsrj0ZsYkKs */

            public final void onClick(DialogInterface dialogInterface, int i) {
                C35212a.m137540a(C35212a.AbstractC35216b.this, dialogInterface, i);
            }
        })).mo89229a(new C25639g.C25640a().mo89266a(R.id.lkui_dialog_btn_cancel).mo89269b(R.string.Lark_Legacy_CancelTip).mo89271d(R.color.function_danger_500))).mo89239c();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m137540a(AbstractC35216b bVar, DialogInterface dialogInterface, int i) {
        if (bVar != null) {
            if (i == 0) {
                bVar.mo122744a();
            } else if (i == 1) {
                bVar.mo122745b();
            }
        }
    }

    /* renamed from: a */
    public static void m137532a(Context context, String str, boolean z, AbstractC35215a aVar) {
        int i;
        int i2;
        String str2;
        int i3;
        C25639g gVar = new C25639g(context);
        if (z) {
            i2 = R.string.Lark_Groups_RevokeCircleInviteDialogTitle;
            i = R.string.Lark_Groups_RevokeCircleInviteDialogContent;
            i3 = R.string.Lark_Groups_Revoke;
            str2 = "user_name";
        } else {
            i2 = R.string.Lark_Group_RevokeConfirmationTitle;
            i = R.string.Lark_Group_RevokeConfirmationContent;
            i3 = R.string.Lark_Legacy_ConfirmTip;
            str2 = "name";
        }
        gVar.mo89248g(i2).mo89251j(2).mo89238b(true).mo89242c(UIHelper.mustacheFormat(i, str2, str)).mo89224a(R.id.lkui_dialog_btn_left, R.string.Lark_Legacy_CancelTip, new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.chatwindow.$$Lambda$a$xG2NdNoESojgOvRFUbUHcfHMWkI */

            public final void onClick(DialogInterface dialogInterface, int i) {
                C35212a.m137548f(C35212a.AbstractC35215a.this, dialogInterface, i);
            }
        }).mo89224a(R.id.lkui_dialog_btn_right, i3, new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.chatwindow.$$Lambda$a$gqlt4w7DwNlA2wPCZSmB4jL_Aw */

            public final void onClick(DialogInterface dialogInterface, int i) {
                C35212a.m137547e(C35212a.AbstractC35215a.this, dialogInterface, i);
            }
        }).mo89239c();
    }

    /* renamed from: a */
    public static void m137536a(Context context, final String[] strArr, int i, final AbstractC35217c cVar) {
        new C58423b(context, UIHelper.getString(R.string.Lark_Legacy_TranslateChat), i, Arrays.asList(strArr), new C58423b.AbstractC58427b() {
            /* class com.ss.android.lark.chatwindow.C35212a.C352131 */

            @Override // com.ss.android.lark.widget.dialog.C58423b.AbstractC58427b
            /* renamed from: a */
            public void mo108011a(int i) {
                AbstractC35217c cVar = cVar;
                if (cVar != null && i < strArr.length) {
                    cVar.onChecked(i);
                }
            }
        }).mo197765f();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x003b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m137538a(com.ss.android.lark.biz.im.api.ChatBundle.ChatType r3, boolean r4, com.larksuite.framework.callback.Entity.ErrorResult r5) {
        /*
            int r0 = r5.getErrorCode()
            r1 = 4051(0xfd3, float:5.677E-42)
            if (r0 == r1) goto L_0x0012
            switch(r0) {
                case 1: goto L_0x0012;
                case 2: goto L_0x0012;
                case 3: goto L_0x0012;
                case 4: goto L_0x0012;
                case 5: goto L_0x0010;
                case 6: goto L_0x000e;
                case 7: goto L_0x000c;
                default: goto L_0x000b;
            }
        L_0x000b:
            goto L_0x0013
        L_0x000c:
            r0 = 4
            goto L_0x0013
        L_0x000e:
            r0 = 3
            goto L_0x0013
        L_0x0010:
            r0 = 2
            goto L_0x0013
        L_0x0012:
            r0 = 1
        L_0x0013:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "perfOpenChatFailed:"
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = "/"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "ActionUtils"
            com.ss.android.lark.sdk.C53241h.m205899c(r2, r1)
            com.ss.android.lark.dependency.h r1 = com.ss.android.lark.C29990c.m110930b()
            com.ss.android.lark.chat.api.c r1 = r1.mo134577e()
            if (r3 == 0) goto L_0x003e
            java.lang.String r3 = r3.value
            goto L_0x0040
        L_0x003e:
            java.lang.String r3 = ""
        L_0x0040:
            com.larksuite.framework.callback.Entity.ErrorResult r2 = new com.larksuite.framework.callback.Entity.ErrorResult
            java.lang.String r5 = r5.getDisplayMsg()
            r2.<init>(r0, r5)
            r1.mo120959a(r3, r4, r2)
            return
            switch-data {1->0x0012, 2->0x0012, 3->0x0012, 4->0x0012, 5->0x0010, 6->0x000e, 7->0x000c, }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.chatwindow.C35212a.m137538a(com.ss.android.lark.biz.im.api.ChatBundle$ChatType, boolean, com.larksuite.framework.callback.Entity.ErrorResult):void");
    }

    /* renamed from: a */
    public static void m137530a(Context context, String str) {
        new C25639g(context).mo89237b(C57582a.m223604a(context, (int) R.string.Lark_Group_GroupMemberReachLimit)).mo89238b(true).mo89251j(2).mo89242c(str).mo89225a(R.id.lkui_dialog_btn_right, C57582a.m223604a(context, (int) R.string.Lark_Legacy_GroupSettingMemberLimitEnsure), (DialogInterface.OnClickListener) null).mo89239c();
    }

    /* renamed from: a */
    private static CharSequence m137524a() {
        String string = UIHelper.getString(R.string.Lark_Legacy_ChatDeleteTip);
        String string2 = UIHelper.getString(R.string.Lark_Legacy_Your);
        int indexOf = string.indexOf(string2);
        int length = string2.length();
        SpannableString spannableString = new SpannableString(string);
        if (indexOf >= 0) {
            int i = length + indexOf;
            spannableString.setSpan(new ForegroundColorSpan(UIHelper.getColor(R.color.text_title)), indexOf, i, 17);
            spannableString.setSpan(new StyleSpan(1), indexOf, i, 17);
        } else {
            C53241h.m205898b("ActionUtils", "getDeleteMessageTips: span index == -1!");
        }
        return spannableString;
    }

    /* renamed from: a */
    public static void m137534a(Context context, boolean z) {
        int i;
        if (z) {
            i = R.string.Lark_NewContacts_UnblockedSuccessfully;
        } else {
            i = R.string.Lark_Legacy_NetworkError;
        }
        LKUIToast.show(context, i);
    }

    /* renamed from: b */
    public static void m137541b(Context context, AbstractC35215a aVar) {
        new C25639g(context).mo89248g(R.string.Lark_NewContacts_BlockUserInChat).mo89251j(2).mo89238b(true).mo89254m(R.string.Lark_NewContacts_BlockUserToast).mo89224a(R.id.lkui_dialog_btn_left, R.string.Lark_Legacy_Cancel, new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.chatwindow.$$Lambda$a$GsV13iNjjEuBeKMWpk4OSiaew78 */

            public final void onClick(DialogInterface dialogInterface, int i) {
                C35212a.m137546d(C35212a.AbstractC35215a.this, dialogInterface, i);
            }
        }).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_NewContacts_BlockUserToastConfirm, new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.chatwindow.$$Lambda$a$oyEal0rpdCGO1q7RyYRanMsTJJU */

            public final void onClick(DialogInterface dialogInterface, int i) {
                C35212a.m137545c(C35212a.AbstractC35215a.this, dialogInterface, i);
            }
        }).mo89239c();
    }

    /* renamed from: c */
    public static void m137544c(Context context, AbstractC35215a aVar) {
        new C25639g(context).mo89248g(R.string.Lark_NewContacts_UnblockUserDialogTitle).mo89251j(2).mo89238b(true).mo89224a(R.id.lkui_dialog_btn_left, R.string.Lark_Legacy_Cancel, new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.chatwindow.$$Lambda$a$pa1c8o1ahlVnsZdrOTz2caZWPN8 */

            public final void onClick(DialogInterface dialogInterface, int i) {
                C35212a.m137543b(C35212a.AbstractC35215a.this, dialogInterface, i);
            }
        }).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Legacy_Confirm, new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.chatwindow.$$Lambda$a$2Zx6ELl7UhX0sgtbvIg6qx9YgYg */

            public final void onClick(DialogInterface dialogInterface, int i) {
                C35212a.m137539a(C35212a.AbstractC35215a.this, dialogInterface, i);
            }
        }).mo89239c();
    }

    /* renamed from: a */
    public static void m137525a(Context context, View.OnClickListener onClickListener) {
        ((C25644o) ((C25644o) ((C25644o) ((C25644o) ((C25644o) ((C25644o) new C25644o(context).mo89237b(m137524a())).mo89251j(2)).mo89206a(UIUtils.getString(context, R.string.Lark_Legacy_Delete))).mo89202a(new DialogInterface.OnClickListener(onClickListener) {
            /* class com.ss.android.lark.chatwindow.$$Lambda$a$CbNHinCjqeX1Inz6KECk9YR8kxo */
            public final /* synthetic */ View.OnClickListener f$0;

            {
                this.f$0 = r1;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                C35212a.m137537a(this.f$0, dialogInterface, i);
            }
        })).mo89290y(0).mo89209c(R.color.function_danger_500)).mo89229a(new C25639g.C25640a().mo89266a(R.id.lkui_dialog_btn_cancel).mo89269b(R.string.Lark_Legacy_Cancel).mo89271d(R.color.text_title))).mo89239c();
    }

    /* renamed from: a */
    public static void m137529a(Context context, AbstractC35215a aVar) {
        new C25639g(context).mo89254m(R.string.Lark_Groups_CancelInvite).mo89224a(R.id.lkui_dialog_btn_left, R.string.Lark_Legacy_CancelTip, new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.chatwindow.$$Lambda$a$G3ykwMsHgKQAte_arxKnS6Y7mQ */

            public final void onClick(DialogInterface dialogInterface, int i) {
                C35212a.AbstractC35215a.this.mo122373b();
            }
        }).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Legacy_ConfirmTip, new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.chatwindow.$$Lambda$a$cLACq66dxCs3nzXIIYDKxT5Qrro */

            public final void onClick(DialogInterface dialogInterface, int i) {
                C35212a.AbstractC35215a.this.mo122372a();
            }
        }).mo89239c();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m137539a(AbstractC35215a aVar, DialogInterface dialogInterface, int i) {
        if (aVar != null) {
            aVar.mo122372a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m137543b(AbstractC35215a aVar, DialogInterface dialogInterface, int i) {
        if (aVar != null) {
            aVar.mo122373b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m137545c(AbstractC35215a aVar, DialogInterface dialogInterface, int i) {
        if (aVar != null) {
            aVar.mo122372a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ void m137546d(AbstractC35215a aVar, DialogInterface dialogInterface, int i) {
        if (aVar != null) {
            aVar.mo122373b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ void m137547e(AbstractC35215a aVar, DialogInterface dialogInterface, int i) {
        if (aVar != null) {
            aVar.mo122372a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ void m137548f(AbstractC35215a aVar, DialogInterface dialogInterface, int i) {
        if (aVar != null) {
            aVar.mo122373b();
        }
    }

    /* renamed from: a */
    public static void m137528a(Context context, ErrorResult errorResult, DialogInterface.OnClickListener onClickListener) {
        int errorCode = errorResult.getErrorCode();
        if (errorCode == 1) {
            LKUIToast.show(context, (int) R.string.Lark_Legacy_ChatInexistent);
        } else if (errorCode == 2) {
            LKUIToast.show(context, (int) R.string.Lark_Legacy_ProfileDetailCreateSingleChatFailed);
        } else if (errorCode == 3) {
            LKUIToast.show(context, (int) R.string.Lark_Legacy_ChatInexistent);
        } else if (errorCode == 4 || errorCode == 8) {
            String displayMsg = errorResult.getDisplayMsg();
            if (TextUtils.isEmpty(displayMsg)) {
                if (errorResult.getErrorCode() == 4) {
                    displayMsg = UIUtils.getString(context, R.string.Lark_Legacy_OutOfGroup);
                } else {
                    displayMsg = UIUtils.getString(context, R.string.Lark_Education_GroupDisbandedByAdminToast);
                }
            }
            C41706a.m165543a(displayMsg, onClickListener);
        } else if (errorCode == 4051) {
            C41706a.m165543a(errorResult.getDisplayMsg(), onClickListener);
        } else if (errorCode == 6002) {
            m137530a(context, errorResult.getDisplayMsg());
        } else if (!TextUtils.isEmpty(errorResult.getDisplayMsg())) {
            LKUIToast.show(context, errorResult.getDisplayMsg());
        }
    }

    /* renamed from: b */
    public static void m137542b(Context context, String[] strArr, int i, AbstractC35217c cVar) {
        m137536a(context, strArr, i, cVar);
    }

    /* renamed from: a */
    public static void m137533a(Context context, List<String> list, int i, final AbstractC35217c cVar) {
        new C58423b(context, UIHelper.getString(R.string.Lark_Chat_TranslateInto), i, list, new C58423b.AbstractC58427b() {
            /* class com.ss.android.lark.chatwindow.C35212a.C352142 */

            @Override // com.ss.android.lark.widget.dialog.C58423b.AbstractC58427b
            /* renamed from: a */
            public void mo108011a(int i) {
                cVar.onChecked(i);
            }
        }).mo197765f();
    }

    /* renamed from: a */
    public static void m137526a(Context context, ImageView imageView, ImageContentVO fVar, boolean z) {
        Image image = null;
        if (fVar != null) {
            Image d = fVar.mo121846d();
            if (d == null || (d.getKey() == null && !CollectionUtils.isNotEmpty(d.getUrls()))) {
                C53241h.m205900d("ActionUtils", "thumbnail or urls is null, image key is " + fVar.mo121842a());
            } else {
                image = d;
            }
        } else {
            C53241h.m205900d("ActionUtils", "ImageContent is null");
        }
        m137527a(context, imageView, image, z);
    }

    /* renamed from: a */
    public static void m137527a(Context context, ImageView imageView, Image image, boolean z) {
        int i;
        if (z) {
            i = R.drawable.common_failed_chat_small_picture;
        } else {
            i = R.drawable.common_failed_chat_picture;
        }
        if (image == null) {
            ImageLoader.with(context).load(Integer.valueOf((int) R.drawable.common_chat_window_image_item_holder)).centerCrop().into(imageView);
        } else if (image.getKey() != null) {
            ImageLoader.with(context).load(new C38824b(image.getKey())).asBitmap().placeholder(R.drawable.common_chat_window_image_item_holder).error(i).centerCrop().into(imageView);
        } else {
            ImageLoader.with(context).load(Integer.valueOf(i)).centerCrop().into(imageView);
        }
    }
}
