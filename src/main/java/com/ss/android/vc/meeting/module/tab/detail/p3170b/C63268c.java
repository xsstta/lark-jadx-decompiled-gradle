package com.ss.android.vc.meeting.module.tab.detail.p3170b;

import android.content.Context;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
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
import com.ss.android.vc.meeting.module.tab.detail.p3169a.C63230a;
import com.ss.android.vc.meeting.module.tab.detail.p3170b.C63268c;
import com.ss.android.vc.net.service.GetUserInfoListener;
import com.ss.android.vc.net.service.UserInfoService;
import com.ss.android.vc.net.service.VideoChatUser;
import com.ss.android.vc.statistics.event.ce;
import com.ss.android.vc.statistics.event2.VcTabListEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ss.android.vc.meeting.module.tab.detail.b.c */
public class C63268c extends RecyclerView.Adapter<C63270a> {

    /* renamed from: a */
    private Context f159588a;

    /* renamed from: b */
    private List<FollowAbbrInfo> f159589b;

    /* renamed from: c */
    private C63230a.AbstractC63234b.AbstractC63235a f159590c;

    /* renamed from: d */
    private String f159591d;

    /* renamed from: a */
    public void mo218956a() {
        this.f159589b = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f159589b.size();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.vc.meeting.module.tab.detail.b.c$1 */
    public static /* synthetic */ class C632691 {

        /* renamed from: a */
        static final /* synthetic */ int[] f159592a;

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
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.tab.detail.p3170b.C63268c.C632691.<clinit>():void");
        }
    }

    /* renamed from: a */
    public void mo218958a(String str) {
        this.f159591d = str;
    }

    /* renamed from: a */
    public void mo218959a(List<FollowAbbrInfo> list) {
        this.f159589b.clear();
        this.f159589b.addAll(list);
        notifyDataSetChanged();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.vc.meeting.module.tab.detail.b.c$a */
    public static class C63270a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        ConstraintLayout f159593a;

        /* renamed from: b */
        TextView f159594b;

        /* renamed from: c */
        TextView f159595c;

        /* renamed from: d */
        ImageView f159596d;

        /* renamed from: e */
        View f159597e;

        C63270a(View view) {
            super(view);
            this.f159593a = (ConstraintLayout) view.findViewById(R.id.doc_item_layout);
            this.f159594b = (TextView) view.findViewById(R.id.doc_title);
            this.f159595c = (TextView) view.findViewById(R.id.doc_share);
            this.f159596d = (ImageView) view.findViewById(R.id.doc_type);
            this.f159597e = view.findViewById(R.id.divider);
        }
    }

    /* renamed from: b */
    private int m247806b(FollowInfo.ShareSubType shareSubType) {
        int i = C632691.f159592a[shareSubType.ordinal()];
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
    private int m247801a(FollowInfo.ShareSubType shareSubType) {
        switch (C632691.f159592a[shareSubType.ordinal()]) {
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

    public C63268c(Context context, C63230a.AbstractC63234b.AbstractC63235a aVar) {
        this.f159588a = context;
        this.f159590c = aVar;
        mo218956a();
    }

    /* renamed from: a */
    public C63270a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C63270a(LayoutInflater.from(this.f159588a).inflate(R.layout.tab_share_list_item, viewGroup, false));
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m247803a(FollowAbbrInfo followAbbrInfo, View view) {
        boolean z;
        String docUrl = followAbbrInfo.getDocUrl();
        String e = this.f159590c.mo218890e();
        if (this.f159590c.mo218889d() == MeetingStatus.MEETING_ON_THE_CALL) {
            z = true;
        } else {
            z = false;
        }
        ce.m250267b(e, z);
        VideoChatModule.getDependency().getDocsDependency().mo196378a(docUrl, this.f159588a);
        VcTabListEvent.m249756a(this.f159591d, "click_link");
    }

    /* renamed from: a */
    private String m247802a(TextView textView, List<String> list) {
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
    public void onBindViewHolder(C63270a aVar, int i) {
        aVar.setIsRecyclable(false);
        FollowAbbrInfo followAbbrInfo = this.f159589b.get(i);
        if (followAbbrInfo != null) {
            C60700b.m235851b("VideoChatTab_SharedDocAdapter", "[onBindViewHolder]", "followInfo is , " + followAbbrInfo.toString());
            String docLabelUrl = followAbbrInfo.getDocLabelUrl();
            if (TextUtils.isEmpty(docLabelUrl)) {
                aVar.f159596d.setImageResource(m247801a(followAbbrInfo.getDocSubType()));
            } else {
                C60700b.m235851b("VideoChatTab_SharedDocAdapter", "[onBindViewHolder2]", "load url:" + docLabelUrl);
                ComponentCallbacks2C2115c.m9151c(aVar.f159596d.getContext()).mo10415a(docLabelUrl).mo10399a(aVar.f159596d);
            }
            String docTitle = followAbbrInfo.getDocTitle();
            if (!TextUtils.isEmpty(docTitle)) {
                aVar.f159594b.setText(docTitle);
            } else {
                aVar.f159594b.setText(m247806b(followAbbrInfo.getDocSubType()));
            }
            if (followAbbrInfo.getByteviewUsers() != null && followAbbrInfo.getByteviewUsers().size() > 0) {
                String[] strArr = new String[followAbbrInfo.getByteviewUsers().size()];
                for (int i2 = 0; i2 < followAbbrInfo.getByteviewUsers().size(); i2++) {
                    ByteviewUser byteviewUser = followAbbrInfo.getByteviewUsers().get(i2);
                    UserInfoService.getUserInfoById(this.f159590c.mo218890e(), byteviewUser.getUserId(), byteviewUser.getParticipantType(), new GetUserInfoListener(strArr, i2, followAbbrInfo, aVar) {
                        /* class com.ss.android.vc.meeting.module.tab.detail.p3170b.$$Lambda$c$sxqZfnlcrWwQYIPOku61umK09jM */
                        public final /* synthetic */ String[] f$1;
                        public final /* synthetic */ int f$2;
                        public final /* synthetic */ FollowAbbrInfo f$3;
                        public final /* synthetic */ C63268c.C63270a f$4;

                        {
                            this.f$1 = r2;
                            this.f$2 = r3;
                            this.f$3 = r4;
                            this.f$4 = r5;
                        }

                        @Override // com.ss.android.vc.net.service.GetUserInfoListener
                        public final void onGetUserInfo(VideoChatUser videoChatUser) {
                            C63268c.this.m247804a(this.f$1, this.f$2, this.f$3, this.f$4, videoChatUser);
                        }
                    });
                }
            }
            aVar.f159593a.setOnTouchListener(new View.OnTouchListener(i, aVar) {
                /* class com.ss.android.vc.meeting.module.tab.detail.p3170b.$$Lambda$c$diUK4ZgVnA5CBR1GrdTfPH3ia4 */
                public final /* synthetic */ int f$1;
                public final /* synthetic */ C63268c.C63270a f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return C63268c.this.m247805a(this.f$1, this.f$2, view, motionEvent);
                }
            });
            aVar.f159593a.setOnClickListener(new View.OnClickListener(followAbbrInfo) {
                /* class com.ss.android.vc.meeting.module.tab.detail.p3170b.$$Lambda$c$8IdJSqlYCdYo4d0413H7pbBQ3Uo */
                public final /* synthetic */ FollowAbbrInfo f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(View view) {
                    C63268c.this.m247803a((C63268c) this.f$1, (FollowAbbrInfo) view);
                }
            });
            if (i == getItemCount() - 1) {
                aVar.f159597e.setVisibility(8);
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ boolean m247805a(int i, C63270a aVar, View view, MotionEvent motionEvent) {
        C63270a aVar2;
        C63270a aVar3;
        int action = motionEvent.getAction();
        if (action == 0) {
            int i2 = i - 1;
            if (i2 >= 0 && (aVar2 = (C63270a) this.f159590c.mo218887b().findViewHolderForAdapterPosition(i2)) != null) {
                aVar2.f159597e.setVisibility(4);
            }
            aVar.f159597e.setVisibility(4);
        } else if (action != 2) {
            int i3 = i - 1;
            if (i3 >= 0 && (aVar3 = (C63270a) this.f159590c.mo218887b().findViewHolderForAdapterPosition(i3)) != null) {
                aVar3.f159597e.setVisibility(0);
            }
            if (i != getItemCount() - 1) {
                aVar.f159597e.setVisibility(0);
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m247804a(String[] strArr, int i, FollowAbbrInfo followAbbrInfo, C63270a aVar, VideoChatUser videoChatUser) {
        strArr[i] = videoChatUser.getName();
        if (strArr.length == followAbbrInfo.getByteviewUsers().size()) {
            aVar.f159595c.setText(m247802a(aVar.f159595c, Arrays.asList(strArr)));
        }
    }
}
