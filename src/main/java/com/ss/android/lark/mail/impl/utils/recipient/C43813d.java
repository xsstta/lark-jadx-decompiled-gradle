package com.ss.android.lark.mail.impl.utils.recipient;

import android.content.Context;
import android.database.DataSetObserver;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.AbstractC41849c;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.entity.AddressType;
import com.ss.android.lark.mail.impl.entity.ContactSearchType;
import com.ss.android.lark.mail.impl.entity.MailAddress;
import com.ss.android.lark.mail.impl.p2164c.AbstractC41870b;
import com.ss.android.lark.mail.impl.p2168g.C42176e;
import com.ss.android.lark.mail.impl.p2171h.C42187a;
import com.ss.android.lark.mail.impl.p2171h.C42330c;
import com.ss.android.lark.mail.impl.utils.C43764g;
import com.ss.android.lark.mail.impl.utils.C43819s;
import com.ss.android.lark.mail.impl.utils.toast.MailToast;
import com.ss.android.lark.pb.mails.DeleteMailExternalContactResponse;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.utils.recipient.d */
public class C43813d extends BaseAdapter implements Filterable {

    /* renamed from: a */
    public final List<MailAddress> f111165a = new ArrayList();

    /* renamed from: b */
    public long f111166b = -1;

    /* renamed from: c */
    public boolean f111167c = true;

    /* renamed from: d */
    private final Context f111168d;

    /* renamed from: e */
    private String f111169e;

    /* renamed from: f */
    private RecipientSearchType f111170f;

    /* renamed from: g */
    private final int f111171g;

    /* renamed from: h */
    private boolean f111172h = false;

    public long getItemId(int i) {
        return (long) i;
    }

    /* renamed from: a */
    public long mo156068a() {
        return this.f111166b;
    }

    public Filter getFilter() {
        return new Filter() {
            /* class com.ss.android.lark.mail.impl.utils.recipient.C43813d.C438162 */

            /* access modifiers changed from: protected */
            public Filter.FilterResults performFiltering(CharSequence charSequence) {
                if (C43813d.this.f111165a == null) {
                    return null;
                }
                Filter.FilterResults filterResults = new Filter.FilterResults();
                filterResults.values = C43813d.this.f111165a;
                filterResults.count = C43813d.this.f111165a.size();
                return filterResults;
            }

            /* access modifiers changed from: protected */
            public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
                if (C43813d.this.f111167c && TextUtils.isEmpty(charSequence)) {
                    C43813d.this.f111166b = -1;
                }
                C43813d.this.notifyDataSetChanged();
            }
        };
    }

    public int getCount() {
        List<MailAddress> list = this.f111165a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.mail.impl.utils.recipient.d$3 */
    public static /* synthetic */ class C438173 {

        /* renamed from: a */
        static final /* synthetic */ int[] f111177a;

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
                com.ss.android.lark.mail.impl.entity.ContactSearchType[] r0 = com.ss.android.lark.mail.impl.entity.ContactSearchType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.mail.impl.utils.recipient.C43813d.C438173.f111177a = r0
                com.ss.android.lark.mail.impl.entity.ContactSearchType r1 = com.ss.android.lark.mail.impl.entity.ContactSearchType.GROUP     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.mail.impl.utils.recipient.C43813d.C438173.f111177a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.mail.impl.entity.ContactSearchType r1 = com.ss.android.lark.mail.impl.entity.ContactSearchType.ENTERPRISE_MAIL_GROUP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.mail.impl.utils.recipient.C43813d.C438173.f111177a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.mail.impl.entity.ContactSearchType r1 = com.ss.android.lark.mail.impl.entity.ContactSearchType.NAME_CARD     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.lark.mail.impl.utils.recipient.C43813d.C438173.f111177a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.lark.mail.impl.entity.ContactSearchType r1 = com.ss.android.lark.mail.impl.entity.ContactSearchType.SHARED_MAILBOX     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.ss.android.lark.mail.impl.utils.recipient.C43813d.C438173.f111177a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.ss.android.lark.mail.impl.entity.ContactSearchType r1 = com.ss.android.lark.mail.impl.entity.ContactSearchType.EXTERNAL_CONTACT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.utils.recipient.C43813d.C438173.<clinit>():void");
        }
    }

    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        super.registerDataSetObserver(dataSetObserver);
    }

    /* renamed from: a */
    public void mo156073a(boolean z) {
        this.f111167c = z;
    }

    /* renamed from: a */
    private View m173669a(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(this.f111168d).inflate(R.layout.mail_recipient_item_contract_select, viewGroup, false);
        inflate.setTag(new C43818a(inflate));
        return inflate;
    }

    public C43813d(Context context) {
        this.f111168d = context;
        this.f111171g = context.getResources().getDimensionPixelSize(R.dimen.mail_compose_recipient_avatar_size);
        this.f111172h = C41816b.m166115a().mo150154u().mo150160a("larkmail.cli.deleteexternaladdress");
    }

    /* renamed from: a */
    public MailAddress getItem(int i) {
        if (this.f111165a == null || i < 0 || i > getCount()) {
            return null;
        }
        return this.f111165a.get(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.mail.impl.utils.recipient.d$a */
    public static class C43818a {

        /* renamed from: a */
        View f111178a;

        /* renamed from: b */
        TextView f111179b;

        /* renamed from: c */
        TextView f111180c;

        /* renamed from: d */
        View f111181d;

        /* renamed from: e */
        View f111182e;

        /* renamed from: f */
        TextView f111183f;

        /* renamed from: g */
        TextView f111184g;

        /* renamed from: h */
        LKUIRoundedImageView f111185h;

        /* renamed from: i */
        TextView f111186i;

        /* renamed from: j */
        View f111187j;

        public C43818a(View view) {
            this.f111187j = view;
            this.f111178a = view.findViewById(R.id.mail_primary_title_layout);
            this.f111181d = view.findViewById(R.id.mail_external_address_delete);
            this.f111182e = view.findViewById(R.id.mail_recipient_space);
            this.f111179b = (TextView) view.findViewById(R.id.mail_primary_title);
            this.f111180c = (TextView) view.findViewById(R.id.mail_chat_member_number);
            this.f111183f = (TextView) view.findViewById(R.id.mail_sub_title);
            this.f111184g = (TextView) view.findViewById(R.id.mail_user_type_name);
            this.f111185h = (LKUIRoundedImageView) view.findViewById(R.id.contract_icon);
            this.f111186i = (TextView) view.findViewById(R.id.contract_avatar);
        }
    }

    /* renamed from: a */
    public void mo156071a(String str) {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append("setHighlight query length:");
        if (str == null) {
            i = 0;
        } else {
            i = str.length();
        }
        sb.append(i);
        Log.m165389i("RecipientSelectAdapter", sb.toString());
        if (TextUtils.isEmpty(str)) {
            this.f111166b = -1;
        } else if (this.f111166b < 0) {
            this.f111166b = System.currentTimeMillis();
        }
        this.f111169e = str;
    }

    /* renamed from: b */
    public void mo156074b(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        ContactSearchType x;
        if (!C43764g.m173481a("RecipientSelectAdapter") || i != -1) {
            Log.m165389i("RecipientSelectAdapter", "postCompletionText:" + i);
            if (this.f111166b > 0) {
                String str = "";
                if (i > -1 && (getItem(i) instanceof SearchAddress) && (x = ((SearchAddress) getItem(i)).mo156032x()) != null) {
                    str = x.getLabel();
                }
                long j = this.f111166b;
                int count = getCount();
                if (i > -1) {
                    z = true;
                } else {
                    z = false;
                }
                if (RecipientSearchType.LOCAL == this.f111170f || RecipientSearchType.GROUP_LOCAL == this.f111170f) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C42187a.m168471a(j, count, z, i, z2, str);
                long j2 = this.f111166b;
                int count2 = getCount();
                if (i > -1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (RecipientSearchType.LOCAL == this.f111170f || RecipientSearchType.GROUP_LOCAL == this.f111170f) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                C42330c.m169045a(j2, count2, z3, i, z4, str);
            }
            this.f111166b = -1;
        }
    }

    /* renamed from: a */
    public String mo156070a(String str, String str2) {
        if (str == null || str.isEmpty()) {
            str = str2;
        }
        if (str == null || str.isEmpty()) {
            return "";
        }
        char[] charArray = str.toLowerCase().toCharArray();
        if (charArray[0] > '`' && charArray[0] < '{') {
            charArray[0] = (char) (charArray[0] - ' ');
        }
        return String.valueOf(charArray).substring(0, 1);
    }

    /* renamed from: a */
    private void m173670a(View view, final MailAddress mailAddress) {
        ContactSearchType contactSearchType;
        List<String> list;
        Long l;
        String str;
        int i;
        C43818a aVar = (C43818a) view.getTag();
        if (mailAddress != null) {
            List<String> list2 = null;
            if (mailAddress instanceof SearchAddress) {
                SearchAddress searchAddress = (SearchAddress) mailAddress;
                String u = searchAddress.mo156029u();
                List<String> v = searchAddress.mo156030v();
                list = searchAddress.mo156031w();
                contactSearchType = searchAddress.mo156032x();
                l = searchAddress.mo156034z();
                str = u;
                list2 = v;
            } else {
                str = "";
                l = null;
                list = null;
                contactSearchType = null;
            }
            String a = mailAddress.mo151176a();
            if (!TextUtils.isEmpty(a)) {
                a = a.trim();
            }
            CharSequence a2 = C43819s.m173683a(a, list2);
            if (!mailAddress.mo151191l() || mailAddress.mo151190k() == AddressType.ENTERPRISE_MAIL_GROUP) {
                if (!TextUtils.isEmpty(a) && !TextUtils.isEmpty(mailAddress.mo151182e())) {
                    SpannableString a3 = C43819s.m173683a(a, list2);
                    SpannableString spannableString = new SpannableString(" <" + mailAddress.mo151182e() + ">");
                    spannableString.setSpan(new ForegroundColorSpan(this.f111168d.getResources().getColor(R.color.text_placeholder)), 0, spannableString.length(), 33);
                    spannableString.setSpan(new RelativeSizeSpan(0.875f), 0, spannableString.length(), 33);
                    C43819s.m173681a(spannableString, list);
                    a2 = new SpannableStringBuilder().append((CharSequence) a3).append((CharSequence) spannableString);
                } else if (TextUtils.isEmpty(a)) {
                    a2 = C43819s.m173683a(mailAddress.mo151182e(), list);
                }
            }
            int i2 = C438173.f111177a[contactSearchType.ordinal()];
            int i3 = 4;
            if (i2 == 1) {
                i = R.string.Mail_MailingList_ChatGroup;
            } else if (i2 == 2) {
                i = R.string.Mail_MailingList_MailingList;
            } else if (i2 == 3) {
                i = R.string.Mail_Normal_ContactCard;
            } else if (i2 == 4) {
                i = R.string.Mail_Search_PublicMailbox;
            } else if (i2 != 5) {
                i = 0;
            } else {
                i = R.string.Mail_Search_External;
            }
            if (this.f111172h) {
                View view2 = aVar.f111181d;
                if (contactSearchType == ContactSearchType.EXTERNAL_CONTACT) {
                    i3 = 0;
                }
                view2.setVisibility(i3);
                aVar.f111182e.setVisibility(8);
                aVar.f111181d.setOnClickListener(new OnSingleClickListener() {
                    /* class com.ss.android.lark.mail.impl.utils.recipient.C43813d.C438141 */

                    @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                    public void onSingleClick(View view) {
                        C42187a.m168561p();
                        C42176e.m168344a().mo152234b(mailAddress.mo151182e(), new AbstractC41870b<DeleteMailExternalContactResponse>() {
                            /* class com.ss.android.lark.mail.impl.utils.recipient.C43813d.C438141.C438151 */

                            @Override // com.ss.android.lark.mail.impl.p2164c.AbstractC41870b
                            /* renamed from: a */
                            public void mo150434a(ErrorResult errorResult) {
                                MailToast.m173697a((int) R.string.Mail_Search_FailedToDeleteRetry);
                                Log.m165397w("RecipientSelectAdapter", "deleteExternalAddress fail:" + errorResult);
                            }

                            /* renamed from: a */
                            public void mo150435a(DeleteMailExternalContactResponse deleteMailExternalContactResponse) {
                                C43813d.this.f111165a.remove(mailAddress);
                                C43813d.this.notifyDataSetChanged();
                                Log.m165389i("RecipientSelectAdapter", "deleteExternalAddress success");
                            }
                        });
                    }
                });
            } else {
                aVar.f111182e.setVisibility(0);
                aVar.f111181d.setVisibility(8);
            }
            aVar.f111179b.setText(a2);
            if (i != 0) {
                if (ContactSearchType.EXTERNAL_CONTACT == contactSearchType) {
                    aVar.f111184g.setBackgroundResource(R.drawable.mail_search_warning_type_text_bg);
                    aVar.f111184g.setTextColor(this.f111168d.getResources().getColor(R.color.udtoken_tag_text_s_red));
                } else if (ContactSearchType.NAME_CARD == contactSearchType) {
                    aVar.f111184g.setBackgroundResource(R.drawable.mail_contact_card_type_text_bg);
                    aVar.f111184g.setTextColor(this.f111168d.getResources().getColor(R.color.udtoken_tag_text_s_blue));
                } else {
                    aVar.f111184g.setBackgroundResource(R.drawable.mail_group_type_text_bg);
                    aVar.f111184g.setTextColor(this.f111168d.getResources().getColor(R.color.udtoken_tag_neutral_text_normal));
                }
                aVar.f111184g.setVisibility(0);
                aVar.f111184g.setText(i);
            } else {
                aVar.f111184g.setVisibility(8);
            }
            if (!TextUtils.isEmpty(str)) {
                aVar.f111183f.setVisibility(0);
                aVar.f111183f.setText(str.trim());
            } else {
                aVar.f111183f.setVisibility(8);
            }
            if (mailAddress.mo151191l() && contactSearchType == ContactSearchType.ENTERPRISE_MAIL_GROUP) {
                aVar.f111186i.setVisibility(8);
                aVar.f111185h.setImageResource(R.drawable.mail_bg_mail_group_address);
            } else if (!TextUtils.isEmpty(mailAddress.mo151195p())) {
                aVar.f111186i.setVisibility(8);
                AbstractC41849c.AbstractC41861l v2 = C41816b.m166115a().mo150155v();
                Context context = this.f111168d;
                String p = mailAddress.mo151195p();
                String j = mailAddress.mo151189j();
                LKUIRoundedImageView lKUIRoundedImageView = aVar.f111185h;
                int i4 = this.f111171g;
                v2.mo150206a(context, p, j, lKUIRoundedImageView, i4, i4);
            } else if (TextUtils.isEmpty(mailAddress.mo151192m())) {
                aVar.f111186i.setVisibility(0);
                aVar.f111186i.setText(mo156070a(a, mailAddress.mo151182e()));
            } else {
                aVar.f111186i.setVisibility(8);
                C41816b.m166115a().mo150155v().mo150205a(this.f111168d, mailAddress.mo151192m(), aVar.f111185h, 48, 48);
            }
            if (l == null || l.longValue() <= 0) {
                aVar.f111180c.setVisibility(8);
                return;
            }
            aVar.f111180c.setText(String.format(" (%d)", l));
            aVar.f111180c.setVisibility(0);
        }
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = m173669a(viewGroup);
        }
        m173670a(view, getItem(i));
        return view;
    }

    /* renamed from: a */
    public void mo156072a(List<MailAddress> list, String str, boolean z, RecipientSearchType recipientSearchType) {
        this.f111170f = recipientSearchType;
        if (!str.equals(this.f111169e) || z) {
            this.f111165a.clear();
        }
        if (list != null) {
            this.f111165a.addAll(list);
        }
        notifyDataSetChanged();
    }
}
