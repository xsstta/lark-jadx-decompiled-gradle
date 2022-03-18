package com.ss.android.vc.meeting.module.tab3.detail.p3173b;

import android.content.Context;
import android.text.TextPaint;
import android.text.TextUtils;
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
import com.ss.android.vc.VideoChatModule;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60776r;
import com.ss.android.vc.entity.ByteviewUser;
import com.ss.android.vc.entity.MeetingStatus;
import com.ss.android.vc.entity.follow.FollowInfo;
import com.ss.android.vc.entity.tab.FollowAbbrInfo;
import com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63328a;
import com.ss.android.vc.meeting.module.tab3.detail.p3173b.C63363b;
import com.ss.android.vc.net.service.GetUserInfoListener;
import com.ss.android.vc.net.service.UserInfoService;
import com.ss.android.vc.net.service.VideoChatUser;
import com.ss.android.vc.statistics.event.ce;
import com.ss.android.vc.statistics.event2.VcTabListEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ss.android.vc.meeting.module.tab3.detail.b.b */
public class C63363b extends RecyclerView.Adapter<C63365a> {

    /* renamed from: a */
    private Context f159963a;

    /* renamed from: b */
    private List<FollowAbbrInfo> f159964b;

    /* renamed from: c */
    private C63328a.AbstractC63332b.AbstractC63333a f159965c;

    /* renamed from: d */
    private String f159966d;

    /* renamed from: e */
    private String f159967e;

    /* renamed from: a */
    public void mo219274a() {
        this.f159964b = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f159964b.size();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.vc.meeting.module.tab3.detail.b.b$1 */
    public static /* synthetic */ class C633641 {

        /* renamed from: a */
        static final /* synthetic */ int[] f159968a;

        /* JADX WARNING: Can't wrap try/catch for region: R(42:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|42) */
        /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00d8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00e4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
            // Method dump skipped, instructions count: 241
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.tab3.detail.p3173b.C63363b.C633641.<clinit>():void");
        }
    }

    /* renamed from: a */
    public void mo219276a(String str) {
        this.f159967e = str;
    }

    /* renamed from: a */
    public void mo219277a(List<FollowAbbrInfo> list) {
        this.f159964b.clear();
        this.f159964b.addAll(list);
        notifyDataSetChanged();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.vc.meeting.module.tab3.detail.b.b$a */
    public static class C63365a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        ConstraintLayout f159969a;

        /* renamed from: b */
        TextView f159970b;

        /* renamed from: c */
        TextView f159971c;

        /* renamed from: d */
        ImageView f159972d;

        C63365a(View view) {
            super(view);
            this.f159969a = (ConstraintLayout) view.findViewById(R.id.doc_item_layout);
            this.f159970b = (TextView) view.findViewById(R.id.doc_title);
            this.f159971c = (TextView) view.findViewById(R.id.doc_share);
            this.f159972d = (ImageView) view.findViewById(R.id.doc_type);
        }
    }

    /* renamed from: b */
    private int m248262b(FollowInfo.ShareSubType shareSubType) {
        int i = C633641.f159968a[shareSubType.ordinal()];
        if (i == 2) {
            return R.string.View_VM_UntitledSheet;
        }
        if (i == 3) {
            return R.string.View_VM_UntitledMindnote;
        }
        if (i == 5 || i == 8) {
            return R.string.View_VM_UntitledSheet;
        }
        return R.string.View_VM_UntitledDocument;
    }

    /* renamed from: a */
    private int m248258a(FollowInfo.ShareSubType shareSubType) {
        switch (C633641.f159968a[shareSubType.ordinal()]) {
            case 1:
                return R.drawable.ud_icon_file_doc_colorful;
            case 2:
                return R.drawable.ud_icon_file_sheet_colorful;
            case 3:
                return R.drawable.ud_icon_file_mindnote_colorful;
            case 4:
                return R.drawable.ud_icon_file_word_colorful;
            case 5:
                return R.drawable.ud_icon_file_excel_colorful;
            case 6:
                return R.drawable.ud_icon_file_ppt_colorful;
            case 7:
                return R.drawable.ud_icon_file_pdf_colorful;
            case 8:
                return R.drawable.ud_icon_file_bitable_colorful;
            case 9:
                return R.drawable.ud_icon_file_slide_colorful;
            case 10:
                return R.drawable.ud_icon_wiki_doc_colorful;
            case 11:
                return R.drawable.ud_icon_wiki_sheet_colorful;
            case HwBuildEx.VersionCodes.EMUI_5_1:
                return R.drawable.ud_icon_wiki_mindnote_colorful;
            case 13:
                return R.drawable.ud_icon_file_docx_colorful;
            case 14:
                return R.drawable.ud_icon_file_doc_colorful;
            case 15:
                return R.drawable.ud_icon_file_sheet_colorful;
            case 16:
                return R.drawable.ud_icon_file_slide_colorful;
            case 17:
                return R.drawable.ud_icon_file_word_colorful;
            case 18:
                return R.drawable.ud_icon_file_excel_colorful;
            case 19:
                return R.drawable.ud_icon_file_ppt_colorful;
            case 20:
                return R.drawable.ud_icon_file_pdf_colorful;
            default:
                return R.drawable.ud_icon_file_link_colorful;
        }
    }

    /* renamed from: a */
    public C63365a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C63365a(LayoutInflater.from(this.f159963a).inflate(R.layout.tab_share_list_item, viewGroup, false));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m248260a(FollowAbbrInfo followAbbrInfo, View view) {
        boolean z;
        String docUrl = followAbbrInfo.getDocUrl();
        String str = this.f159966d;
        if (this.f159965c.mo219200b() == MeetingStatus.MEETING_ON_THE_CALL) {
            z = true;
        } else {
            z = false;
        }
        ce.m250267b(str, z);
        VideoChatModule.getDependency().getDocsDependency().mo196378a(docUrl, this.f159963a);
        VcTabListEvent.m249756a(this.f159967e, "click_link");
    }

    /* renamed from: a */
    private String m248259a(TextView textView, List<String> list) {
        String string = UIHelper.getString(R.string.View_G_SharedBy);
        if (!(list == null || list.size() == 0)) {
            for (int i = 0; i < list.size(); i++) {
                String str = list.get(i);
                if (i != 0) {
                    string = string + ", ";
                }
                string = string + str;
            }
        }
        if (TextUtils.isEmpty(string)) {
            return "";
        }
        TextPaint paint = textView.getPaint();
        float a = (float) (C60776r.m236139a() - UIHelper.dp2px(84.0f));
        if (a >= paint.measureText(string, 0, string.length())) {
            return string;
        }
        float measureText = paint.measureText("...");
        int i2 = 1;
        while (true) {
            if (i2 >= string.length()) {
                break;
            } else if (paint.measureText(string, 0, i2) > a - measureText) {
                i2--;
                break;
            } else {
                i2++;
            }
        }
        return string.substring(0, i2) + "...";
    }

    /* renamed from: a */
    public void onBindViewHolder(C63365a aVar, int i) {
        aVar.setIsRecyclable(false);
        FollowAbbrInfo followAbbrInfo = this.f159964b.get(i);
        if (followAbbrInfo != null) {
            C60700b.m235851b("VideoChatTab_SharedDocAdapter", "[bindItem]", "followInfo is , " + followAbbrInfo.toString());
            String docLabelUrl = followAbbrInfo.getDocLabelUrl();
            if (TextUtils.isEmpty(docLabelUrl)) {
                aVar.f159972d.setImageResource(m248258a(followAbbrInfo.getDocSubType()));
            } else {
                C60700b.m235851b("VideoChatTab_SharedDocAdapter", "[bindItem2]", "load url:" + docLabelUrl);
                ComponentCallbacks2C2115c.m9151c(aVar.f159972d.getContext()).mo10415a(docLabelUrl).mo10399a(aVar.f159972d);
            }
            String docTitle = followAbbrInfo.getDocTitle();
            if (!TextUtils.isEmpty(docTitle)) {
                aVar.f159970b.setText(docTitle);
            } else {
                aVar.f159970b.setText(m248262b(followAbbrInfo.getDocSubType()));
            }
            if (followAbbrInfo.getByteviewUsers() != null && followAbbrInfo.getByteviewUsers().size() > 0) {
                String[] strArr = new String[followAbbrInfo.getByteviewUsers().size()];
                for (int i2 = 0; i2 < followAbbrInfo.getByteviewUsers().size(); i2++) {
                    ByteviewUser byteviewUser = followAbbrInfo.getByteviewUsers().get(i2);
                    UserInfoService.getUserInfoById(this.f159966d, byteviewUser.getUserId(), byteviewUser.getParticipantType(), new GetUserInfoListener(strArr, i2, followAbbrInfo, aVar) {
                        /* class com.ss.android.vc.meeting.module.tab3.detail.p3173b.$$Lambda$b$urnnZiFHgKlW9lBL_rJ4WqkSZM */
                        public final /* synthetic */ String[] f$1;
                        public final /* synthetic */ int f$2;
                        public final /* synthetic */ FollowAbbrInfo f$3;
                        public final /* synthetic */ C63363b.C63365a f$4;

                        {
                            this.f$1 = r2;
                            this.f$2 = r3;
                            this.f$3 = r4;
                            this.f$4 = r5;
                        }

                        @Override // com.ss.android.vc.net.service.GetUserInfoListener
                        public final void onGetUserInfo(VideoChatUser videoChatUser) {
                            C63363b.this.m248261a(this.f$1, this.f$2, this.f$3, this.f$4, videoChatUser);
                        }
                    });
                }
            }
            aVar.f159969a.setOnClickListener(new View.OnClickListener(followAbbrInfo) {
                /* class com.ss.android.vc.meeting.module.tab3.detail.p3173b.$$Lambda$b$FggHyuRiX4jtKVpbELOAycsOhhI */
                public final /* synthetic */ FollowAbbrInfo f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(View view) {
                    C63363b.this.m248260a((C63363b) this.f$1, (FollowAbbrInfo) view);
                }
            });
        }
    }

    public C63363b(Context context, String str, C63328a.AbstractC63332b.AbstractC63333a aVar) {
        this.f159963a = context;
        this.f159966d = str;
        this.f159965c = aVar;
        mo219274a();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m248261a(String[] strArr, int i, FollowAbbrInfo followAbbrInfo, C63365a aVar, VideoChatUser videoChatUser) {
        strArr[i] = videoChatUser.getName();
        if (strArr.length == followAbbrInfo.getByteviewUsers().size()) {
            aVar.f159971c.setText(m248259a(aVar.f159971c, Arrays.asList(strArr)));
        }
    }
}
