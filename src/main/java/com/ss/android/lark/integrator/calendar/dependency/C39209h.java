package com.ss.android.lark.integrator.calendar.dependency;

import android.content.Context;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.biz.core.api.contact.IInitBuilder;
import com.ss.android.lark.biz.im.api.IIMApi;
import com.ss.android.lark.calendar.impl.features.common.widget.chatterpicker.CalContact;
import com.ss.android.lark.calendar.impl.features.common.widget.chatterpicker.CalendarChatterPickerActivity;
import com.ss.android.lark.calendar.impl.features.common.widget.chatterpicker.CalendarPickerEntranceParams;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30046i;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.contact.entity.Contact;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.utils.SearchCommonUtils;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.rxjava.C57865c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.lark.integrator.calendar.dependency.h */
public class C39209h implements AbstractC30046i {

    /* renamed from: a */
    public final IIMApi f100500a = ((IIMApi) ApiUtils.getApi(IIMApi.class));

    /* renamed from: b */
    private final ICoreApi f100501b = ((ICoreApi) ApiUtils.getApi(ICoreApi.class));

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30046i
    /* renamed from: a */
    public int mo108228a() {
        return this.f100501b.getOneWayContactSelectLimit();
    }

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30046i
    /* renamed from: a */
    public void mo108229a(Context context, ArrayList<CalContact> arrayList) {
        String str;
        if (arrayList != null && arrayList.size() != 0) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<CalContact> it = arrayList.iterator();
            while (it.hasNext()) {
                CalContact next = it.next();
                arrayList2.add(new Contact(next.getChatterId(), next.getAvatarKey(), next.getDisplayName()));
            }
            if (arrayList2.size() > 0) {
                if (arrayList2.size() == 1) {
                    str = UIHelper.mustacheFormat((int) R.string.Calendar_NewContacts_NeedToAddToContactstAddOneGuestDialogContent, "Name", ((Contact) arrayList2.get(0)).mo130408c());
                } else {
                    str = UIHelper.getString(R.string.Calendar_NewContacts_NeedToAddToContactstAddGuestsDialogContent);
                }
                this.f100501b.showApplyCollabDialog(context, new IInitBuilder(R.string.Calendar_NewContacts_NeedToAddToContactstDialgTitle, str, arrayList2, context, R.string.Calendar_NewContacts_ContactRequestSentToast) {
                    /* class com.ss.android.lark.integrator.calendar.dependency.$$Lambda$h$fC57ZEQw6NkfNYdLmPp61p6I0c */
                    public final /* synthetic */ int f$1;
                    public final /* synthetic */ String f$2;
                    public final /* synthetic */ ArrayList f$3;
                    public final /* synthetic */ Context f$4;
                    public final /* synthetic */ int f$5;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                        this.f$3 = r4;
                        this.f$4 = r5;
                        this.f$5 = r6;
                    }

                    @Override // com.ss.android.lark.biz.core.api.contact.IInitBuilder
                    public final void init(IInitBuilder.IDialogBuilder cVar) {
                        C39209h.this.m154613a(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, (IInitBuilder.IApplyCollabDialogBuilder) cVar);
                    }
                });
            }
        }
    }

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30046i
    /* renamed from: a */
    public void mo108230a(final Context context, final List<String> list, final List<String> list2) {
        C57865c.m224574a(new C57865c.AbstractC57873d<ArrayList<SearchBaseInfo>>() {
            /* class com.ss.android.lark.integrator.calendar.dependency.C39209h.C392112 */

            /* renamed from: a */
            public ArrayList<SearchBaseInfo> produce() {
                ArrayList<SearchBaseInfo> arrayList = new ArrayList<>();
                List<String> list = list;
                if (list != null) {
                    for (String str : list) {
                        Chatter chatterById = C39209h.this.f100500a.getChatterById(str);
                        if (chatterById != null) {
                            arrayList.add(SearchCommonUtils.m209224a(chatterById));
                        }
                    }
                }
                List<String> list2 = list2;
                if (list2 != null) {
                    for (String str2 : list2) {
                        Chat chatById = C39209h.this.f100500a.getChatById(str2);
                        if (chatById != null) {
                            arrayList.add(SearchCommonUtils.m209223a(chatById));
                        }
                    }
                }
                return arrayList;
            }
        }, new C57865c.AbstractC57871b<ArrayList<SearchBaseInfo>>() {
            /* class com.ss.android.lark.integrator.calendar.dependency.C39209h.C392123 */

            /* renamed from: a */
            public void consume(ArrayList<SearchBaseInfo> arrayList) {
                CalendarChatterPickerActivity.m116497a(context, new CalendarPickerEntranceParams.Builder().mo113105a(list).mo113109b(list2).mo113111c(arrayList).mo113112c(true).mo113115d(true).mo113106a(false).mo113117e(false).mo113110b(false).mo113119f(false).mo113132p(), 2);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m154613a(int i, String str, ArrayList arrayList, final Context context, final int i2, IInitBuilder.IApplyCollabDialogBuilder aVar) {
        IInitBuilder.IApplyCollabDialogBuilder aVar2 = (IInitBuilder.IApplyCollabDialogBuilder) ((IInitBuilder.IApplyCollabDialogBuilder) ((IInitBuilder.IApplyCollabDialogBuilder) ((IInitBuilder.IApplyCollabDialogBuilder) aVar.mo105552a(UIHelper.getString(i))).mo105553b(str)).mo105555d("event_confirm")).mo105550a(arrayList).mo105551a(new IInitBuilder.IDialogBuilder.IDialogCallback() {
            /* class com.ss.android.lark.integrator.calendar.dependency.C39209h.C392101 */

            @Override // com.ss.android.lark.biz.core.api.contact.IInitBuilder.IDialogBuilder.IDialogCallback
            /* renamed from: a */
            public void mo105556a() {
            }

            @Override // com.ss.android.lark.biz.core.api.contact.IInitBuilder.IDialogBuilder.IDialogCallback
            /* renamed from: b */
            public void mo105558b() {
            }

            @Override // com.ss.android.lark.biz.core.api.contact.IInitBuilder.IDialogBuilder.IDialogCallback
            /* renamed from: a */
            public void mo105557a(boolean z, String str) {
                if (z) {
                    LKUIToast.show(context, UIHelper.getString(i2));
                }
            }
        });
    }
}
