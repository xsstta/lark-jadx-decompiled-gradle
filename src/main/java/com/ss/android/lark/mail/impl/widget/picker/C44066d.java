package com.ss.android.lark.mail.impl.widget.picker;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import butterknife.ButterKnife;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.entity.ContactSearchType;
import com.ss.android.lark.mail.impl.entity.MailAddress;
import com.ss.android.lark.mail.impl.p2171h.C42330c;
import com.ss.android.lark.mail.impl.widget.picker.ContactPickerDetailView;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchChatInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchChatterInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchMailContactInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.mail.impl.widget.picker.d */
public class C44066d extends BaseFragment {

    /* renamed from: a */
    public AbstractC44069a f111829a;

    /* renamed from: b */
    public int f111830b;

    /* renamed from: c */
    public List<SearchBaseInfo> f111831c = new ArrayList();

    /* renamed from: d */
    protected View f111832d;

    /* renamed from: e */
    private boolean f111833e = true;

    /* renamed from: f */
    private C44059b f111834f;

    /* renamed from: g */
    private ContactPickerDetailView.AbstractC44057a f111835g = new ContactPickerDetailView.AbstractC44057a() {
        /* class com.ss.android.lark.mail.impl.widget.picker.C44066d.C440671 */

        @Override // com.ss.android.lark.mail.impl.widget.picker.ContactPickerDetailView.AbstractC44057a
        /* renamed from: a */
        public Activity mo156728a() {
            return C44066d.this.getActivity();
        }

        @Override // com.ss.android.lark.mail.impl.widget.picker.ContactPickerDetailView.AbstractC44057a
        /* renamed from: b */
        public FragmentManager mo156731b() {
            return C44066d.this.getChildFragmentManager();
        }

        @Override // com.ss.android.lark.mail.impl.widget.picker.ContactPickerDetailView.AbstractC44057a
        /* renamed from: c */
        public List<SearchBaseInfo> mo156732c() {
            return C44066d.this.f111831c;
        }

        @Override // com.ss.android.lark.mail.impl.widget.picker.ContactPickerDetailView.AbstractC44057a
        /* renamed from: d */
        public void mo156733d() {
            C44066d.this.f111829a.mo150634a();
        }

        @Override // com.ss.android.lark.mail.impl.widget.picker.ContactPickerDetailView.AbstractC44057a
        /* renamed from: a */
        public void mo156729a(ContactPickerDetailView contactPickerDetailView) {
            ButterKnife.bind(contactPickerDetailView, C44066d.this.f111832d);
        }

        @Override // com.ss.android.lark.mail.impl.widget.picker.ContactPickerDetailView.AbstractC44057a
        /* renamed from: a */
        public void mo156730a(List<SearchBaseInfo> list) {
            ContactSearchType contactSearchType;
            ContactSearchType contactSearchType2;
            ArrayList arrayList = new ArrayList();
            HashMap hashMap = new HashMap();
            for (SearchBaseInfo searchBaseInfo : list) {
                if (searchBaseInfo != null) {
                    MailAddress.C42062a aVar = new MailAddress.C42062a();
                    ContactSearchType contactSearchType3 = ContactSearchType.UNKNOWN;
                    String str = "";
                    if (searchBaseInfo instanceof SearchChatterInfo) {
                        MailAddress.C42062a c = aVar.mo151213c(searchBaseInfo.getId());
                        if (!searchBaseInfo.isCrossTenant()) {
                            str = C41816b.m166115a().mo150137d();
                        }
                        c.mo151216f(str);
                        contactSearchType3 = ContactSearchType.CHATTER;
                        SearchChatterInfo searchChatterInfo = (SearchChatterInfo) searchBaseInfo;
                        String enterpriseMailAddress = searchChatterInfo.getEnterpriseMailAddress();
                        if (TextUtils.isEmpty(enterpriseMailAddress)) {
                            enterpriseMailAddress = searchChatterInfo.getMailAddress();
                        }
                        aVar.mo151212b(enterpriseMailAddress);
                        aVar.mo151209a(searchBaseInfo.getTitle());
                    } else if (searchBaseInfo instanceof SearchChatInfo) {
                        MailAddress.C42062a c2 = aVar.mo151213c(searchBaseInfo.getId());
                        if (!searchBaseInfo.isCrossTenant()) {
                            str = C41816b.m166115a().mo150137d();
                        }
                        c2.mo151216f(str);
                        contactSearchType3 = ContactSearchType.GROUP;
                        aVar.mo151209a(searchBaseInfo.getTitle());
                    } else if (searchBaseInfo instanceof SearchMailContactInfo) {
                        SearchMailContactInfo searchMailContactInfo = (SearchMailContactInfo) searchBaseInfo;
                        boolean z = false;
                        switch (C440682.f111837a[searchMailContactInfo.getContactType().ordinal()]) {
                            case 1:
                                contactSearchType = ContactSearchType.GROUP;
                                break;
                            case 2:
                                contactSearchType2 = ContactSearchType.EXTERNAL_CONTACT;
                                contactSearchType = contactSearchType2;
                                z = true;
                                break;
                            case 3:
                                contactSearchType2 = ContactSearchType.NAME_CARD;
                                contactSearchType = contactSearchType2;
                                z = true;
                                break;
                            case 4:
                                contactSearchType = ContactSearchType.SHARED_MAILBOX;
                                break;
                            case 5:
                                contactSearchType = ContactSearchType.ENTERPRISE_MAIL_GROUP;
                                break;
                            case 6:
                                contactSearchType = ContactSearchType.CHATTER;
                                break;
                            case 7:
                                contactSearchType2 = ContactSearchType.NONE_TYPE;
                                contactSearchType = contactSearchType2;
                                z = true;
                                break;
                            default:
                                contactSearchType2 = ContactSearchType.UNKNOWN;
                                contactSearchType = contactSearchType2;
                                z = true;
                                break;
                        }
                        if (z) {
                            aVar.mo151217g(searchBaseInfo.getTitle());
                        } else {
                            aVar.mo151209a(searchBaseInfo.getTitle());
                        }
                        aVar.mo151212b(searchMailContactInfo.getEmail());
                        contactSearchType3 = contactSearchType;
                    }
                    aVar.mo151207a(ContactSearchType.convertToAddressType(contactSearchType3.getValue()));
                    m174537a(hashMap, contactSearchType3);
                    arrayList.add(aVar.mo151210a());
                }
            }
            C44066d.this.f111829a.mo150635a(arrayList, C44066d.this.f111830b);
            C42330c.m169044a(C44066d.this.f111830b, hashMap);
        }

        /* renamed from: a */
        private void m174537a(Map<ContactSearchType, Integer> map, ContactSearchType contactSearchType) {
            if (contactSearchType != null) {
                try {
                    Integer num = map.get(contactSearchType);
                    if (num == null) {
                        map.put(contactSearchType, 1);
                    } else {
                        map.put(contactSearchType, Integer.valueOf(num.intValue() + 1));
                    }
                } catch (Exception e) {
                    Log.m165397w("MailPickerFragment", "addTypeCount error " + e);
                }
            }
        }
    };

    /* renamed from: com.ss.android.lark.mail.impl.widget.picker.d$a */
    public interface AbstractC44069a {
        /* renamed from: a */
        void mo150634a();

        /* renamed from: a */
        void mo150635a(List<MailAddress> list, int i);
    }

    /* renamed from: a */
    public int mo156738a() {
        return this.f111830b;
    }

    public C44066d() {
    }

    /* renamed from: b */
    private void m174534b() {
        C44059b bVar = new C44059b(new C44058a(), new ContactPickerDetailView(this.f111832d.getContext(), this.f111835g));
        this.f111834f = bVar;
        bVar.create();
    }

    /* renamed from: com.ss.android.lark.mail.impl.widget.picker.d$2 */
    static /* synthetic */ class C440682 {

        /* renamed from: a */
        static final /* synthetic */ int[] f111837a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.bytedance.lark.pb.search.v2.MailContactMeta$ContactType[] r0 = com.bytedance.lark.pb.search.v2.MailContactMeta.ContactType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.mail.impl.widget.picker.C44066d.C440682.f111837a = r0
                com.bytedance.lark.pb.search.v2.MailContactMeta$ContactType r1 = com.bytedance.lark.pb.search.v2.MailContactMeta.ContactType.GROUP     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.mail.impl.widget.picker.C44066d.C440682.f111837a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.lark.pb.search.v2.MailContactMeta$ContactType r1 = com.bytedance.lark.pb.search.v2.MailContactMeta.ContactType.EXTERNAL_CONTACT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.mail.impl.widget.picker.C44066d.C440682.f111837a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bytedance.lark.pb.search.v2.MailContactMeta$ContactType r1 = com.bytedance.lark.pb.search.v2.MailContactMeta.ContactType.NAME_CARD     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.lark.mail.impl.widget.picker.C44066d.C440682.f111837a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.bytedance.lark.pb.search.v2.MailContactMeta$ContactType r1 = com.bytedance.lark.pb.search.v2.MailContactMeta.ContactType.SHARED_MAILBOX     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.ss.android.lark.mail.impl.widget.picker.C44066d.C440682.f111837a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.bytedance.lark.pb.search.v2.MailContactMeta$ContactType r1 = com.bytedance.lark.pb.search.v2.MailContactMeta.ContactType.MAIL_GROUP     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = com.ss.android.lark.mail.impl.widget.picker.C44066d.C440682.f111837a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.bytedance.lark.pb.search.v2.MailContactMeta$ContactType r1 = com.bytedance.lark.pb.search.v2.MailContactMeta.ContactType.CHATTER     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = com.ss.android.lark.mail.impl.widget.picker.C44066d.C440682.f111837a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.bytedance.lark.pb.search.v2.MailContactMeta$ContactType r1 = com.bytedance.lark.pb.search.v2.MailContactMeta.ContactType.NONE_TYPE     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.widget.picker.C44066d.C440682.<clinit>():void");
        }
    }

    /* renamed from: a */
    public void mo156739a(List<SearchBaseInfo> list, int i) {
        this.f111831c.clear();
        this.f111831c.addAll(list);
        this.f111830b = i;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (!this.f111833e) {
            m174534b();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.mail_fragment_mail_picker, viewGroup, false);
        this.f111832d = inflate;
        return inflate;
    }

    public C44066d(AbstractC44069a aVar, List<SearchBaseInfo> list, int i) {
        this.f111829a = aVar;
        this.f111831c.clear();
        this.f111831c.addAll(list);
        this.f111830b = i;
    }
}
