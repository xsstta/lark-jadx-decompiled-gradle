package com.ss.android.vc.meeting.module.follow.share;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.ComponentCallbacks2C2115c;
import com.huawei.hms.android.HwBuildEx;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.widget.IconFontView;
import com.ss.android.vc.entity.ContainerType;
import com.ss.android.vc.entity.ParticipantType;
import com.ss.android.vc.entity.VcDoc;
import com.ss.android.vc.entity.VcDocShareStatus;
import com.ss.android.vc.entity.VcDocSubType;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.follow.FollowInfo;
import com.ss.android.vc.entity.response.ar;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.follow.share.C61814a;
import com.ss.android.vc.meeting.module.follow.share.desktop.C61832d;
import com.ss.android.vc.meeting.module.follow.share.desktop.ShareContentViewHolder;
import com.ss.android.vc.meeting.module.sharebox.ILocalSharePrepareContract;
import com.ss.android.vc.meeting.module.sharesecurity.ShareSecurity;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.request.VcBizSender;
import com.ss.android.vc.net.service.GetUserInfoListener;
import com.ss.android.vc.net.service.UserInfoService;
import com.ss.android.vc.net.service.VideoChatUser;
import com.ss.android.vc.statistics.event.C63772u;
import com.ss.android.vc.statistics.event.C63774v;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.vc.meeting.module.follow.share.a */
public class C61814a extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a */
    public C61832d f155159a;

    /* renamed from: b */
    public C61303k f155160b;

    /* renamed from: c */
    public String f155161c;

    /* renamed from: d */
    public ShareContentViewHolder.SharePanelSource f155162d;

    /* renamed from: e */
    public ILocalSharePrepareContract.IView f155163e;

    /* renamed from: f */
    private Context f155164f;

    /* renamed from: g */
    private List<VcDoc> f155165g;

    /* renamed from: h */
    private HashMap<String, String> f155166h;

    /* renamed from: i */
    private boolean f155167i = true;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f155165g.size();
    }

    /* renamed from: a */
    public void mo214126a() {
        this.f155165g = new ArrayList();
        this.f155166h = new HashMap<>();
    }

    /* renamed from: com.ss.android.vc.meeting.module.follow.share.a$3 */
    static /* synthetic */ class C618173 {

        /* renamed from: a */
        static final /* synthetic */ int[] f155173a;

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
                com.ss.android.vc.entity.VcDocShareStatus[] r0 = com.ss.android.vc.entity.VcDocShareStatus.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.vc.meeting.module.follow.share.C61814a.C618173.f155173a = r0
                com.ss.android.vc.entity.VcDocShareStatus r1 = com.ss.android.vc.entity.VcDocShareStatus.FULLY_SHARE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.vc.meeting.module.follow.share.C61814a.C618173.f155173a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.vc.entity.VcDocShareStatus r1 = com.ss.android.vc.entity.VcDocShareStatus.PARTIAL_SHARE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.vc.meeting.module.follow.share.C61814a.C618173.f155173a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.vc.entity.VcDocShareStatus r1 = com.ss.android.vc.entity.VcDocShareStatus.NO_SHARE_PERMISSION     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.vc.meeting.module.follow.share.C61814a.C618173.f155173a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.vc.entity.VcDocShareStatus r1 = com.ss.android.vc.entity.VcDocShareStatus.NO_SUPPORT_SHARE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.ss.android.vc.meeting.module.follow.share.C61814a.C618173.f155173a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.ss.android.vc.entity.VcDocShareStatus r1 = com.ss.android.vc.entity.VcDocShareStatus.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.follow.share.C61814a.C618173.<clinit>():void");
        }
    }

    /* renamed from: b */
    private void m241492b() {
        if (this.f155162d == ShareContentViewHolder.SharePanelSource.FROM_IN_MEETING_VIEW) {
            String i = this.f155160b.ab().mo213883i();
            if (!TextUtils.isEmpty(i)) {
                for (int i2 = 0; i2 < this.f155165g.size(); i2++) {
                    VcDoc vcDoc = this.f155165g.get(i2);
                    if (i.startsWith(vcDoc.getDocUrl())) {
                        this.f155165g.remove(vcDoc);
                        this.f155165g.add(0, vcDoc);
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void mo214128a(String str) {
        this.f155161c = str;
    }

    /* renamed from: a */
    public void mo214131a(boolean z) {
        this.f155167i = z;
    }

    /* renamed from: com.ss.android.vc.meeting.module.follow.share.a$b */
    static class C61819b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        ConstraintLayout f155174a;

        /* renamed from: b */
        TextView f155175b;

        /* renamed from: c */
        TextView f155176c;

        /* renamed from: d */
        TextView f155177d;

        /* renamed from: e */
        ImageView f155178e;

        /* renamed from: f */
        IconFontView f155179f;

        /* renamed from: g */
        ImageView f155180g;

        /* renamed from: a */
        public void mo214136a(boolean z) {
            int i;
            ImageView imageView = this.f155180g;
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            imageView.setVisibility(i);
        }

        /* renamed from: a */
        public void mo214135a(VcDocShareStatus vcDocShareStatus) {
            if (C618173.f155173a[vcDocShareStatus.ordinal()] != 3) {
                this.f155179f.setVisibility(8);
            } else {
                this.f155179f.setVisibility(0);
            }
        }

        /* renamed from: a */
        public void mo214134a(VcDoc vcDoc) {
            String docLabelUrl = vcDoc.getDocLabelUrl();
            if (TextUtils.isEmpty(docLabelUrl)) {
                this.f155178e.setImageResource(m241504b(vcDoc));
            } else {
                ComponentCallbacks2C2115c.m9151c(this.f155178e.getContext()).mo10415a(docLabelUrl).mo10399a(this.f155178e);
            }
        }

        C61819b(View view) {
            super(view);
            this.f155174a = (ConstraintLayout) view.findViewById(R.id.doc_item_layout);
            this.f155175b = (TextView) view.findViewById(R.id.doc_title);
            this.f155176c = (TextView) view.findViewById(R.id.gdrive_file_abstract);
            this.f155177d = (TextView) view.findViewById(R.id.gdrive_file_owner);
            this.f155178e = (ImageView) view.findViewById(R.id.doc_type);
            this.f155179f = (IconFontView) view.findViewById(R.id.icon_lock);
            this.f155180g = (ImageView) view.findViewById(R.id.icon_sharing);
        }

        /* renamed from: a */
        private int m241502a(VcDocSubType vcDocSubType) {
            switch (vcDocSubType.getNumber()) {
                case 1:
                    return R.drawable.ud_icon_file_image_colorful;
                case 2:
                    return R.drawable.ud_icon_file_pdf_colorful;
                case 3:
                    return R.drawable.ud_icon_file_text_colorful;
                case 4:
                    return R.drawable.ud_icon_file_word_colorful;
                case 5:
                    return R.drawable.ud_icon_file_excel_colorful;
                case 6:
                    return R.drawable.ud_icon_file_ppt_colorful;
                case 7:
                    return R.drawable.ud_icon_file_video_colorful;
                case 8:
                    return R.drawable.ud_icon_file_audio_colorful;
                case 9:
                    return R.drawable.ud_icon_file_zip_colorful;
                case 10:
                    return R.drawable.ud_icon_file_ps_colorful;
                case 11:
                    return R.drawable.ud_icon_file_android_colorful;
                case HwBuildEx.VersionCodes.EMUI_5_1:
                    return R.drawable.ud_icon_file_sketch_colorful;
                case 13:
                    return R.drawable.ud_icon_file_ae_colorful;
                case 14:
                    return R.drawable.ud_icon_file_keynote_colorful;
                default:
                    return R.drawable.ud_icon_file_folder_colorful;
            }
        }

        /* renamed from: a */
        private SpannableStringBuilder m241503a(String str) {
            StringBuilder sb = new StringBuilder(str);
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(C60773o.m236126d(R.color.lkui_B500));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            while (true) {
                if (sb.length() <= 0) {
                    break;
                }
                int indexOf = sb.indexOf("<em>");
                if (indexOf == -1) {
                    spannableStringBuilder.append((CharSequence) sb.substring(0));
                    break;
                }
                spannableStringBuilder.append((CharSequence) sb.substring(0, indexOf));
                sb.delete(0, indexOf + 4);
                int indexOf2 = sb.indexOf("</em>");
                if (indexOf2 == -1) {
                    spannableStringBuilder.append((CharSequence) sb.substring(0));
                    C60700b.m235864f("FollowLog_DocListAdapter", "[getHighlightTitle]", "highlight title without finishToken");
                    break;
                }
                SpannableString spannableString = new SpannableString(sb.substring(0, indexOf2));
                spannableString.setSpan(CharacterStyle.wrap(foregroundColorSpan), 0, spannableString.length(), 33);
                spannableStringBuilder.append((CharSequence) spannableString);
                sb.delete(0, indexOf2 + 5);
            }
            return spannableStringBuilder;
        }

        /* renamed from: b */
        private int m241504b(VcDoc vcDoc) {
            int number = vcDoc.getDocType().getNumber();
            if (vcDoc.getContainerType() == ContainerType.SPACE) {
                if (number == 12) {
                    return R.drawable.ud_icon_file_link_colorful;
                }
                if (number == 14) {
                    return R.drawable.ud_icon_wiki_doc_colorful;
                }
                if (number == 15) {
                    return R.drawable.ud_icon_file_docx_colorful;
                }
                switch (number) {
                    case 2:
                        return R.drawable.ud_icon_file_sheet_colorful;
                    case 3:
                        return R.drawable.ud_icon_file_bitable_colorful;
                    case 4:
                        return R.drawable.ud_icon_file_mindnote_colorful;
                    case 5:
                        return m241502a(vcDoc.getDocSubType());
                    case 6:
                        return R.drawable.ud_icon_file_slide_colorful;
                    case 7:
                        return R.drawable.ud_icon_file_folder_colorful;
                    default:
                        return R.drawable.ud_icon_file_doc_colorful;
                }
            } else if (vcDoc.getContainerType() != ContainerType.WIKI2) {
                return R.drawable.ud_icon_file_doc_colorful;
            } else {
                if (number == 2) {
                    return R.drawable.ud_icon_wiki_sheet_colorful;
                }
                if (number == 15) {
                    return R.drawable.ud_icon_wiki_docx_colorful;
                }
                if (number == 4) {
                    return R.drawable.ud_icon_wiki_mindnote_colorful;
                }
                if (number != 5) {
                    return R.drawable.ud_icon_wiki_doc_colorful;
                }
                return m241502a(vcDoc.getDocSubType());
            }
        }

        /* renamed from: a */
        public void mo214133a(String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                this.f155175b.setText(C60773o.m236119a((int) R.string.View_VM_UntitledFile));
            } else {
                this.f155175b.setText(m241503a(str));
            }
            if (TextUtils.isEmpty(str2)) {
                this.f155176c.setVisibility(8);
                return;
            }
            this.f155176c.setText(m241503a(str2));
            this.f155176c.setVisibility(0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.vc.meeting.module.follow.share.a$a */
    public static class C61818a extends C61819b {
        C61818a(View view) {
            super(view);
            this.f155175b.setAlpha(0.5f);
            this.f155176c.setAlpha(0.5f);
            this.f155177d.setAlpha(0.5f);
            this.f155178e.setAlpha(0.5f);
            this.f155179f.setAlpha(0.5f);
            this.f155180g.setAlpha(0.5f);
            this.f155174a.setClickable(false);
            this.f155174a.setEnabled(false);
            this.f155174a.setBackgroundColor(C60773o.m236126d(R.color.bg_body));
        }

        @Override // com.ss.android.vc.meeting.module.follow.share.C61814a.C61819b
        /* renamed from: a */
        public void mo214133a(String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                this.f155175b.setText(C60773o.m236119a((int) R.string.View_VM_UntitledFile));
            } else {
                this.f155175b.setText(str);
            }
            if (TextUtils.isEmpty(str2)) {
                this.f155176c.setVisibility(8);
                return;
            }
            this.f155176c.setText(str2);
            this.f155176c.setVisibility(0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.vc.meeting.module.follow.share.a$c */
    public static class C61820c extends C61819b {
        C61820c(View view) {
            super(view);
            this.f155175b.setAlpha(1.0f);
            this.f155176c.setAlpha(1.0f);
            this.f155177d.setAlpha(1.0f);
            this.f155178e.setAlpha(1.0f);
            this.f155179f.setAlpha(1.0f);
            this.f155180g.setAlpha(1.0f);
            this.f155174a.setClickable(true);
            this.f155174a.setEnabled(true);
            this.f155174a.setBackgroundResource(R.drawable.vc_share_file_list_item_selector);
        }
    }

    /* renamed from: b */
    private boolean m241493b(String str) {
        if (this.f155162d == ShareContentViewHolder.SharePanelSource.FROM_OUT_TAB) {
            return false;
        }
        String i = this.f155160b.ab().mo213883i();
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(i)) {
            return false;
        }
        return i.contains(str);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        VcDoc vcDoc = this.f155165g.get(i);
        if (vcDoc == null || !this.f155167i) {
            return 1;
        }
        int i2 = C618173.f155173a[vcDoc.getShareStatus().ordinal()];
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            return 0;
        }
        return 1;
    }

    /* renamed from: b */
    private List<VcDoc> m241491b(List<VcDoc> list) {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (VcDoc vcDoc : list) {
            String docToken = vcDoc.getDocToken();
            if (hashMap.get(docToken) == null) {
                arrayList.add(vcDoc);
                hashMap.put(docToken, 1);
            } else {
                hashMap.put(docToken, Integer.valueOf(((Integer) hashMap.get(docToken)).intValue() + 1));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo214127a(final VcDoc vcDoc) {
        C61303k kVar;
        String str;
        if (this.f155162d != ShareContentViewHolder.SharePanelSource.FROM_IN_MEETING_VIEW || (kVar = this.f155160b) == null || TextUtils.isEmpty(kVar.mo212055d())) {
            return;
        }
        if (m241493b(vcDoc.getDocToken())) {
            this.f155159a.mo214195d();
            if (!this.f155160b.mo212105W().mo212828g().mo213889o()) {
                this.f155160b.mo212105W().mo212828g().mo213864a(false);
                return;
            }
            return;
        }
        C63774v.m250383a(this.f155160b.mo212056e());
        if (!this.f155160b.mo212105W().mo212836o().mo213182i() || this.f155160b.al().mo213184k() == null) {
            str = "";
        } else {
            str = this.f155160b.al().mo213184k().getBreakoutRoomId();
        }
        VcBizSender.m249189a(this.f155160b.mo212055d(), str, vcDoc.getDocUrl(), this.f155160b.ab().mo213884j(), FollowInfo.InitSource.INIT_DIRECTLY, false, -1).mo219889a(new AbstractC63598b<ar>() {
            /* class com.ss.android.vc.meeting.module.follow.share.C61814a.C618162 */

            /* renamed from: a */
            public void onSuccess(ar arVar) {
                C60700b.m235851b("FollowLog_DocListAdapter", "[shareFollow]", "success");
                FollowInfo followInfo = arVar.f152656a;
                if (followInfo != null && !TextUtils.isEmpty(followInfo.getDocTitle())) {
                    C61814a.this.f155160b.ab().mo213854a(arVar.f152656a);
                }
                C61814a.this.f155160b.aa().mo216266a(vcDoc, true);
                C61814a.this.f155159a.mo214195d();
                C63774v.m250394d(C61814a.this.f155160b.mo212056e(), arVar.f152656a);
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                int i;
                C60700b.m235864f("FollowLog_DocListAdapter", "[shareFollow]", "error " + eVar.toString());
                if (ShareSecurity.isCheckFail(eVar)) {
                    C61814a.this.f155159a.mo214195d();
                }
                if (!eVar.f160600c) {
                    C60738ac.m236037c((int) R.string.View_VM_CouldNotLoadTryAgain);
                }
                VideoChat e = C61814a.this.f155160b.mo212056e();
                if (eVar == null) {
                    i = 0;
                } else {
                    i = eVar.mo219899a();
                }
                C63774v.m250384a(e, i);
            }
        });
    }

    /* renamed from: a */
    public void mo214130a(List<VcDoc> list) {
        ArrayList arrayList = new ArrayList();
        if ("".equals(this.f155161c)) {
            arrayList.addAll(this.f155165g);
        }
        arrayList.addAll(list);
        this.f155165g.clear();
        this.f155165g.addAll(m241491b(arrayList));
        m241492b();
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i != 0) {
            return new C61818a(LayoutInflater.from(this.f155164f).inflate(R.layout.dialog_share_list_item, viewGroup, false));
        }
        return new C61820c(LayoutInflater.from(this.f155164f).inflate(R.layout.dialog_share_list_item, viewGroup, false));
    }

    /* renamed from: a */
    public void mo214129a(String str, List<VcDoc> list) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.equals(str, this.f155161c)) {
            arrayList.addAll(this.f155165g);
        } else {
            this.f155161c = str;
        }
        arrayList.addAll(list);
        this.f155165g.clear();
        this.f155165g.addAll(m241491b(arrayList));
        m241492b();
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i) {
        viewHolder.setIsRecyclable(false);
        final VcDoc vcDoc = this.f155165g.get(i);
        if (vcDoc != null) {
            if (viewHolder instanceof C61820c) {
                C61820c cVar = (C61820c) viewHolder;
                cVar.mo214133a(vcDoc.getDocHighlightTitle(), vcDoc.getDocAbstract());
                cVar.mo214136a(m241493b(vcDoc.getDocToken()));
                cVar.mo214135a(vcDoc.getShareStatus());
                cVar.mo214134a(vcDoc);
                if (this.f155166h.get(vcDoc.getOwnerId()) != null) {
                    cVar.f155177d.setText(UIHelper.mustacheFormat((int) R.string.View_G_OwnerOwnerNameBraces, "ownerName", this.f155166h.get(vcDoc.getOwnerId())));
                } else {
                    UserInfoService.getUserInfoById((String) null, vcDoc.getOwnerId(), ParticipantType.LARK_USER, new GetUserInfoListener(cVar, vcDoc) {
                        /* class com.ss.android.vc.meeting.module.follow.share.$$Lambda$a$w9MWrDtAmAFjwdCUHaL0sBaRCE */
                        public final /* synthetic */ C61814a.C61820c f$1;
                        public final /* synthetic */ VcDoc f$2;

                        {
                            this.f$1 = r2;
                            this.f$2 = r3;
                        }

                        @Override // com.ss.android.vc.net.service.GetUserInfoListener
                        public final void onGetUserInfo(VideoChatUser videoChatUser) {
                            C61814a.m271261lambda$w9MWrDtAmAFjwdCUHaL0sBaRCE(C61814a.this, this.f$1, this.f$2, videoChatUser);
                        }
                    });
                }
                cVar.f155174a.setOnClickListener(new OnSingleClickListener() {
                    /* class com.ss.android.vc.meeting.module.follow.share.C61814a.C618151 */

                    @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                    public void onSingleClick(View view) {
                        String str;
                        if (C61814a.this.f155162d == ShareContentViewHolder.SharePanelSource.FROM_IN_MEETING_VIEW) {
                            C61814a.this.mo214127a(vcDoc);
                            int i = i;
                            VcDoc vcDoc = vcDoc;
                            if (TextUtils.isEmpty(C61814a.this.f155161c)) {
                                str = "recommend_list";
                            } else {
                                str = "search";
                            }
                            C63772u.m250373a(i, vcDoc, str, C61814a.this.f155160b.mo212056e());
                        } else if (C61814a.this.f155162d == ShareContentViewHolder.SharePanelSource.FROM_OUT_TAB) {
                            C61814a.this.f155163e.mo217790a(i, vcDoc);
                        }
                    }
                });
            } else if (viewHolder instanceof C61818a) {
                C61818a aVar = (C61818a) viewHolder;
                aVar.mo214133a(vcDoc.getDocHighlightTitle(), vcDoc.getDocAbstract());
                aVar.mo214136a(m241493b(vcDoc.getDocToken()));
                aVar.mo214135a(vcDoc.getShareStatus());
                aVar.mo214134a(vcDoc);
                if (this.f155166h.get(vcDoc.getOwnerId()) != null) {
                    aVar.f155177d.setText(UIHelper.mustacheFormat((int) R.string.View_G_OwnerOwnerNameBraces, "ownerName", this.f155166h.get(vcDoc.getOwnerId())));
                } else {
                    UserInfoService.getUserInfoById((String) null, vcDoc.getOwnerId(), ParticipantType.LARK_USER, new GetUserInfoListener(aVar, vcDoc) {
                        /* class com.ss.android.vc.meeting.module.follow.share.$$Lambda$a$PrndgRCAZJcPMtfO6f8RV81bEQ */
                        public final /* synthetic */ C61814a.C61818a f$1;
                        public final /* synthetic */ VcDoc f$2;

                        {
                            this.f$1 = r2;
                            this.f$2 = r3;
                        }

                        @Override // com.ss.android.vc.net.service.GetUserInfoListener
                        public final void onGetUserInfo(VideoChatUser videoChatUser) {
                            C61814a.m271260lambda$PrndgRCAZJcPMtfO6f8RV81bEQ(C61814a.this, this.f$1, this.f$2, videoChatUser);
                        }
                    });
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m241489a(C61818a aVar, VcDoc vcDoc, VideoChatUser videoChatUser) {
        aVar.f155177d.setText(UIHelper.mustacheFormat((int) R.string.View_G_OwnerOwnerNameBraces, "ownerName", videoChatUser.getName()));
        this.f155166h.put(vcDoc.getOwnerId(), videoChatUser.getName());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m241490a(C61820c cVar, VcDoc vcDoc, VideoChatUser videoChatUser) {
        cVar.f155177d.setText(UIHelper.mustacheFormat((int) R.string.View_G_OwnerOwnerNameBraces, "ownerName", videoChatUser.getName()));
        this.f155166h.put(vcDoc.getOwnerId(), videoChatUser.getName());
    }

    public C61814a(C61832d dVar, Context context, C61303k kVar, ShareContentViewHolder.SharePanelSource sharePanelSource, ILocalSharePrepareContract.IView bVar) {
        this.f155159a = dVar;
        this.f155164f = context;
        this.f155160b = kVar;
        this.f155162d = sharePanelSource;
        this.f155163e = bVar;
        mo214126a();
    }
}
