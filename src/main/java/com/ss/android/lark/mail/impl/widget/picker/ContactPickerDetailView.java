package com.ss.android.lark.mail.impl.widget.picker;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.core.app.ComponentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.LifecycleOwner;
import butterknife.BindView;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.compose.C41923a;
import com.ss.android.lark.mail.impl.p2171h.C42330c;
import com.ss.android.lark.mail.impl.utils.C43763f;
import com.ss.android.lark.mail.impl.utils.C43785p;
import com.ss.android.lark.mail.impl.utils.C43819s;
import com.ss.android.lark.mail.impl.utils.toast.MailToast;
import com.ss.android.lark.mail.impl.widget.picker.C44062c;
import com.ss.android.lark.search.widget.BasePicker;
import com.ss.android.lark.search.widget.ChatterPicker;
import com.ss.android.lark.search.widget.params.ChatterPickerParams;
import com.ss.android.lark.search.widget.reporter.PickerReporterDelegate;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchChatInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchChatterInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchMailContactInfo;
import com.ss.android.lark.searchcommon.view.SearchResultView;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import java.util.List;

public class ContactPickerDetailView implements C44062c.AbstractC44064b {

    /* renamed from: a */
    public AbstractC44057a f111811a;

    /* renamed from: b */
    private View f111812b;

    /* renamed from: c */
    private int f111813c = C43763f.m173477a();

    /* renamed from: d */
    private int f111814d = 0;

    /* renamed from: e */
    private Context f111815e;

    /* renamed from: f */
    private C44062c.AbstractC44064b.AbstractC44065a f111816f;

    /* renamed from: g */
    private BasePicker.IOnPickNotify f111817g = new BasePicker.IOnPickNotify() {
        /* class com.ss.android.lark.mail.impl.widget.picker.ContactPickerDetailView.C440501 */

        @Override // com.ss.android.lark.search.widget.BasePicker.IOnPickNotify
        /* renamed from: a */
        public void mo110050a(String str, SearchBaseInfo searchBaseInfo) {
        }

        @Override // com.ss.android.lark.search.widget.BasePicker.IOnPickNotify
        /* renamed from: b */
        public void mo110052b(String str, SearchBaseInfo searchBaseInfo) {
        }

        @Override // com.ss.android.lark.search.widget.BasePicker.IOnPickNotify
        /* renamed from: a */
        public void mo110051a(List<String> list, List<SearchBaseInfo> list2) {
            ContactPickerDetailView.this.mo156723a(C43785p.m173534a(list));
        }
    };
    @BindView(9293)
    ChatterPicker mPicker;
    @BindView(10320)
    CommonTitleBar mTitleBar;

    /* renamed from: com.ss.android.lark.mail.impl.widget.picker.ContactPickerDetailView$a */
    public interface AbstractC44057a {
        /* renamed from: a */
        Activity mo156728a();

        /* renamed from: a */
        void mo156729a(ContactPickerDetailView contactPickerDetailView);

        /* renamed from: a */
        void mo156730a(List<SearchBaseInfo> list);

        /* renamed from: b */
        FragmentManager mo156731b();

        /* renamed from: c */
        List<SearchBaseInfo> mo156732c();

        /* renamed from: d */
        void mo156733d();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    /* renamed from: b */
    public LifecycleOwner mo156726b() {
        return (ComponentActivity) this.f111815e;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ ChatterPickerParams m174508c() {
        return new ChatterPickerParams.Builder().mo183676h(true).mo183668d(true).mo183673f(true).mo183734v(true).mo183724q(true).mo183675g();
    }

    /* renamed from: a */
    public boolean mo156725a() {
        ChatterPicker chatterPicker;
        int i = this.f111813c;
        if (i > 0 && ((chatterPicker = this.mPicker) == null || i >= C43785p.m173534a(chatterPicker.getSelectedList()) + 1)) {
            return false;
        }
        C41923a.m166662a(this.f111815e, C43763f.m173477a());
        return true;
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f111811a.mo156729a(this);
        this.f111816f.mo156737a().mo5923a(mo156726b(), new AbstractC1178x<Integer>() {
            /* class com.ss.android.lark.mail.impl.widget.picker.ContactPickerDetailView.C440512 */

            /* renamed from: a */
            public void onChanged(Integer num) {
            }
        });
        ((ChatterPicker) ((ChatterPicker) ((ChatterPicker) ((ChatterPicker) ((ChatterPicker) ((ChatterPicker) ((ChatterPicker) ((ChatterPicker) ((ChatterPicker) ((ChatterPicker) this.mPicker.mo183579f("email_add_receiver")).mo183604p(true)).mo183561a($$Lambda$ContactPickerDetailView$opK4YcQF9Hf7BwkPAEradrOFIs.INSTANCE)).mo183559a(this.f111817g)).mo183496d(false)).mo183500f(true)).mo183560a(new BasePicker.IViewDependency() {
            /* class com.ss.android.lark.mail.impl.widget.picker.ContactPickerDetailView.C440545 */

            @Override // com.ss.android.lark.search.widget.BasePicker.IViewDependency
            /* renamed from: b */
            public Activity mo110056b() {
                return ContactPickerDetailView.this.f111811a.mo156728a();
            }

            @Override // com.ss.android.lark.search.widget.BasePicker.IViewDependency
            /* renamed from: c */
            public FragmentManager mo110057c() {
                return ContactPickerDetailView.this.f111811a.mo156731b();
            }
        })).mo183564a(new PickerReporterDelegate() {
            /* class com.ss.android.lark.mail.impl.widget.picker.ContactPickerDetailView.C440534 */

            @Override // com.ss.android.lark.search.widget.reporter.PickerReporterDelegate
            /* renamed from: a */
            public void mo132343a() {
                super.mo132343a();
            }
        })).mo183565a(new SearchResultView.IOnBusinessConsumeItem() {
            /* class com.ss.android.lark.mail.impl.widget.picker.ContactPickerDetailView.C440523 */

            /* JADX WARNING: Code restructure failed: missing block: B:11:0x0031, code lost:
                if (r5.getChatType() != com.ss.android.lark.chat.entity.chat.Chat.Type.TOPIC_GROUP) goto L_0x004a;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:13:0x0037, code lost:
                if (r5.isEnabledEmail() == false) goto L_0x004a;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:5:0x001a, code lost:
                if (android.text.TextUtils.isEmpty(r5.getMailAddress()) != false) goto L_0x004a;
             */
            @Override // com.ss.android.lark.searchcommon.view.SearchResultView.IOnBusinessConsumeItem
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.ss.android.lark.searchcommon.view.SearchResultView.CheckBoxBindStatus mo110048a(com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo r5) {
                /*
                    r4 = this;
                    boolean r0 = r5 instanceof com.ss.android.lark.searchcommon.dto.info.SearchChatterInfo
                    r1 = 1
                    r2 = 0
                    if (r0 == 0) goto L_0x001d
                    com.ss.android.lark.searchcommon.dto.info.SearchChatterInfo r5 = (com.ss.android.lark.searchcommon.dto.info.SearchChatterInfo) r5
                    java.lang.String r0 = r5.getEnterpriseMailAddress()
                    boolean r0 = android.text.TextUtils.isEmpty(r0)
                    if (r0 == 0) goto L_0x0049
                    java.lang.String r5 = r5.getMailAddress()
                    boolean r5 = android.text.TextUtils.isEmpty(r5)
                    if (r5 == 0) goto L_0x0049
                    goto L_0x004a
                L_0x001d:
                    boolean r0 = r5 instanceof com.ss.android.lark.searchcommon.dto.info.SearchChatInfo
                    if (r0 == 0) goto L_0x003a
                    com.ss.android.lark.searchcommon.dto.info.SearchChatInfo r5 = (com.ss.android.lark.searchcommon.dto.info.SearchChatInfo) r5
                    com.ss.android.lark.chat.entity.chat.Chat$Type r0 = r5.getChatType()
                    com.ss.android.lark.chat.entity.chat.Chat$Type r3 = com.ss.android.lark.chat.entity.chat.Chat.Type.GROUP
                    if (r0 == r3) goto L_0x0033
                    com.ss.android.lark.chat.entity.chat.Chat$Type r0 = r5.getChatType()
                    com.ss.android.lark.chat.entity.chat.Chat$Type r3 = com.ss.android.lark.chat.entity.chat.Chat.Type.TOPIC_GROUP
                    if (r0 != r3) goto L_0x004a
                L_0x0033:
                    boolean r5 = r5.isEnabledEmail()
                    if (r5 == 0) goto L_0x004a
                    goto L_0x0049
                L_0x003a:
                    boolean r0 = r5 instanceof com.ss.android.lark.searchcommon.dto.info.SearchMailContactInfo
                    if (r0 == 0) goto L_0x0049
                    com.ss.android.lark.searchcommon.dto.info.SearchMailContactInfo r5 = (com.ss.android.lark.searchcommon.dto.info.SearchMailContactInfo) r5
                    java.lang.String r5 = r5.getEmail()
                    boolean r1 = android.text.TextUtils.isEmpty(r5)
                    goto L_0x004a
                L_0x0049:
                    r1 = 0
                L_0x004a:
                    com.ss.android.lark.searchcommon.view.SearchResultView$a r5 = new com.ss.android.lark.searchcommon.view.SearchResultView$a
                    r5.<init>(r1, r2, r2)
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.widget.picker.ContactPickerDetailView.C440523.mo110048a(com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo):com.ss.android.lark.searchcommon.view.SearchResultView$a");
            }

            @Override // com.ss.android.lark.searchcommon.view.SearchResultView.IOnBusinessConsumeItem
            /* renamed from: b */
            public boolean mo110049b(SearchBaseInfo searchBaseInfo) {
                if (searchBaseInfo instanceof SearchChatterInfo) {
                    SearchChatterInfo searchChatterInfo = (SearchChatterInfo) searchBaseInfo;
                    if (TextUtils.isEmpty(searchChatterInfo.getEnterpriseMailAddress()) && TextUtils.isEmpty(searchChatterInfo.getMailAddress())) {
                        if (searchChatterInfo.getType() == 16) {
                            MailToast.m173697a((int) R.string.Mail_Contacts_CantSelectEmptyEmailAddress);
                        } else {
                            MailToast.m173697a((int) R.string.Mail_Contacts_NoBusinessEmail);
                        }
                        return true;
                    }
                } else if (searchBaseInfo instanceof SearchMailContactInfo) {
                    if (TextUtils.isEmpty(((SearchMailContactInfo) searchBaseInfo).getEmail())) {
                        MailToast.m173697a((int) R.string.Mail_Contacts_CantSelectEmptyEmailAddress);
                        return true;
                    }
                } else if (!(searchBaseInfo instanceof SearchChatInfo)) {
                    return true;
                } else {
                    SearchChatInfo searchChatInfo = (SearchChatInfo) searchBaseInfo;
                    if (!(searchChatInfo.getChatType() == Chat.Type.GROUP || searchChatInfo.getChatType() == Chat.Type.TOPIC_GROUP) || !searchChatInfo.isEnabledEmail()) {
                        MailToast.m173697a((int) R.string.Mail_Contacts_NoPermission);
                        return true;
                    }
                }
                if (searchBaseInfo.isSelected() || !ContactPickerDetailView.this.mo156725a()) {
                    return false;
                }
                return true;
            }
        })).mo183624t(true)).mo183514j(true).mo183517m(true).mo183483a();
        C440556 r0 = new IActionTitlebar.TextAction(C43819s.m173684a((int) R.string.Mail_Share_TitleBarDone), R.color.mail_item_select_text_color) {
            /* class com.ss.android.lark.mail.impl.widget.picker.ContactPickerDetailView.C440556 */

            @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
            public void performAction(View view) {
                List<SearchBaseInfo> selectedList = ContactPickerDetailView.this.mPicker.getSelectedList();
                Log.m165389i("ContactPickerDetailView", "result " + selectedList);
                if (selectedList != null && !selectedList.isEmpty()) {
                    ContactPickerDetailView.this.f111811a.mo156730a(selectedList);
                }
            }
        };
        this.mTitleBar.addAction(r0);
        this.mTitleBar.setLeftClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.mail.impl.widget.picker.ContactPickerDetailView.C440567 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                ContactPickerDetailView.this.f111811a.mo156733d();
            }
        });
        this.f111812b = this.mTitleBar.getViewByAction(r0);
        int a = C43785p.m173534a(this.f111811a.mo156732c());
        this.f111814d = a;
        if (a != 0) {
            this.f111813c = C43763f.m173477a() - this.f111814d;
        }
        this.f111812b.setEnabled(false);
        C42330c.m169078f();
    }

    /* renamed from: a */
    public void setViewDelegate(C44062c.AbstractC44064b.AbstractC44065a aVar) {
        this.f111816f = aVar;
    }

    /* renamed from: a */
    public void mo156723a(int i) {
        boolean z;
        CommonTitleBar commonTitleBar = this.mTitleBar;
        if (commonTitleBar != null) {
            if (i > 0) {
                commonTitleBar.setTitle(C43819s.m173684a((int) R.string.Mail_Contacts_SelectContacts) + "\n" + C43819s.m173685a((int) R.plurals.Mail_Contacts_SelectedNumContacts, i));
            } else {
                commonTitleBar.setTitle(C43819s.m173684a((int) R.string.Mail_Contacts_SelectContacts));
            }
            View view = this.f111812b;
            if (i > 0) {
                z = true;
            } else {
                z = false;
            }
            view.setEnabled(z);
        }
    }

    public ContactPickerDetailView(Context context, AbstractC44057a aVar) {
        this.f111815e = context;
        this.f111811a = aVar;
    }
}
