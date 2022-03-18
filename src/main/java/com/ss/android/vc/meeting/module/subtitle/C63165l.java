package com.ss.android.vc.meeting.module.subtitle;

import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.p3083e.C60776r;
import com.ss.android.vc.common.p3083e.C60783v;
import com.ss.android.vc.meeting.framework.manager.MeetingUtil;
import com.ss.android.vc.meeting.module.p3130k.C61999a;
import com.ss.android.vc.meeting.module.subtitle.C63165l;
import com.ss.android.vc.meeting.module.subtitle.p3167b.C63139g;
import com.ss.android.vc.net.service.GetUserInfoListener;
import com.ss.android.vc.net.service.UserInfoService;
import com.ss.android.vc.net.service.VideoChatUser;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.vc.meeting.module.subtitle.l */
public class C63165l extends RecyclerView.Adapter<C63166a> {

    /* renamed from: a */
    private String f159170a;

    /* renamed from: b */
    private List<C63186o> f159171b;

    /* renamed from: c */
    private int f159172c;

    /* renamed from: d */
    private View.OnClickListener f159173d;

    /* renamed from: e */
    private HashMap<Boolean, SparseArray> f159174e = new HashMap<>(2);

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<C63186o> list = this.f159171b;
        if (list == null) {
            return 0;
        }
        return 0 + list.size();
    }

    /* renamed from: com.ss.android.vc.meeting.module.subtitle.l$a */
    public static class C63166a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public TextView f159175a;

        /* renamed from: b */
        public ImageView f159176b;

        /* renamed from: c */
        public TextView f159177c;

        /* renamed from: d */
        public TextView f159178d;

        /* renamed from: e */
        public ViewGroup f159179e;

        /* renamed from: f */
        HashMap<Boolean, SparseArray> f159180f;

        /* renamed from: a */
        private void m247328a() {
            SparseArray sparseArray;
            HashMap<Boolean, SparseArray> hashMap = this.f159180f;
            if (hashMap != null) {
                if (hashMap.get(Boolean.valueOf(C61999a.m242220f())) == null) {
                    sparseArray = new SparseArray();
                    this.f159180f.put(Boolean.valueOf(C61999a.m242220f()), sparseArray);
                } else {
                    sparseArray = this.f159180f.get(Boolean.valueOf(C61999a.m242220f()));
                }
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    this.f159180f.put(Boolean.valueOf(C61999a.m242220f()), sparseArray);
                }
                int length = this.f159178d.length();
                Object obj = sparseArray.get(length);
                if (obj == null) {
                    this.f159178d.measure(0, 0);
                    int a = (C60776r.m236139a() - C60773o.m236115a(100.0d)) - this.f159178d.getMeasuredWidth();
                    this.f159177c.setMaxWidth(a);
                    sparseArray.put(length, Integer.valueOf(a));
                } else if (this.f159177c.getMaxWidth() == -1 || ((Integer) obj).intValue() != this.f159177c.getMaxWidth()) {
                    this.f159177c.setMaxWidth(((Integer) obj).intValue());
                }
            }
        }

        /* renamed from: a */
        private void m247329a(C63186o oVar) {
            this.f159178d.setText(C63139g.m247250a(oVar.f159276i));
            m247328a();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m247330a(VideoChatUser videoChatUser) {
            String str;
            TextView textView = this.f159177c;
            if (TextUtils.isEmpty(videoChatUser.getName())) {
                str = videoChatUser.getNickname();
            } else {
                str = videoChatUser.getName();
            }
            textView.setText(str);
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m247331b(VideoChatUser videoChatUser) {
            C60783v.m236230a(videoChatUser.getAvatarKey(), videoChatUser.getId(), videoChatUser.getType(), this.f159176b, 20, 20);
        }

        /* renamed from: b */
        private void m247332b(String str, C63186o oVar) {
            if (oVar.f159272e == null) {
                return;
            }
            if (MeetingUtil.m238368a(str, oVar.f159272e, MeetingUtil.IdType.DeviceId)) {
                this.f159177c.setText(R.string.View_M_Interviewer);
            } else {
                UserInfoService.getUserInfoById(str, oVar.f159272e.getUserId(), oVar.f159272e.getParticipantType(), new GetUserInfoListener() {
                    /* class com.ss.android.vc.meeting.module.subtitle.$$Lambda$l$a$G3AJcVsG4LeiYDK1QzezUuRd8s */

                    @Override // com.ss.android.vc.net.service.GetUserInfoListener
                    public final void onGetUserInfo(VideoChatUser videoChatUser) {
                        C63165l.C63166a.m271419lambda$G3AJcVsG4LeiYDK1QzezUuRd8s(C63165l.C63166a.this, videoChatUser);
                    }
                });
            }
        }

        public C63166a(View view, HashMap<Boolean, SparseArray> hashMap) {
            super(view);
            ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.container);
            this.f159179e = viewGroup;
            viewGroup.setPadding(viewGroup.getPaddingLeft(), this.f159179e.getPaddingTop(), UIUtils.dp2px(this.f159179e.getContext(), 35.0f), UIUtils.dp2px(this.f159179e.getContext(), 2.0f));
            this.f159176b = (ImageView) view.findViewById(R.id.iv_subtitle_speaker_avatar);
            this.f159175a = (TextView) view.findViewById(R.id.tv_subtitle_content);
            this.f159177c = (TextView) view.findViewById(R.id.tv_subtitle_speaker_name);
            this.f159178d = (TextView) view.findViewById(R.id.tv_subtitle_time);
            this.f159180f = hashMap;
        }

        /* renamed from: a */
        public void mo218647a(String str, C63186o oVar) {
            if (oVar != null) {
                m247329a(oVar);
                this.f159175a.setText(oVar.f159268a);
                m247332b(str, oVar);
                if (MeetingUtil.m238368a(str, oVar.f159272e, MeetingUtil.IdType.UserId)) {
                    C60783v.m236226a((int) R.drawable.icon_interviewer_avatar, this.f159176b);
                } else if (oVar.f159269b != null) {
                    this.f159176b.setImageBitmap(oVar.f159269b);
                } else if (!TextUtils.isEmpty(oVar.f159271d)) {
                    UserInfoService.getUserInfoById(str, oVar.f159271d, oVar.f159272e.getParticipantType(), new GetUserInfoListener() {
                        /* class com.ss.android.vc.meeting.module.subtitle.$$Lambda$l$a$f2aCAMID_Mq6WhfBBOlDzDcdOsw */

                        @Override // com.ss.android.vc.net.service.GetUserInfoListener
                        public final void onGetUserInfo(VideoChatUser videoChatUser) {
                            C63165l.C63166a.lambda$f2aCAMID_Mq6WhfBBOlDzDcdOsw(C63165l.C63166a.this, videoChatUser);
                        }
                    });
                }
            }
        }
    }

    /* renamed from: a */
    public void mo218644a() {
        boolean z;
        if (CollectionUtils.isNotEmpty(this.f159171b)) {
            long j = 0;
            for (int i = 0; i < this.f159171b.size(); i++) {
                C63186o oVar = this.f159171b.get(i);
                if (oVar.f159276i - j > 1) {
                    z = true;
                } else {
                    z = false;
                }
                oVar.f159275h = z;
                j = oVar.f159276i;
            }
        }
    }

    /* renamed from: a */
    public void mo218645a(View.OnClickListener onClickListener) {
        this.f159173d = onClickListener;
    }

    /* renamed from: a */
    public C63186o mo218643a(int i) {
        int i2 = i + 0;
        if (i2 < 0 || i2 >= this.f159171b.size()) {
            return null;
        }
        return this.f159171b.get(i2);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m247322a(View view) {
        boolean z;
        StringBuilder sb = new StringBuilder();
        sb.append("header item click ");
        if (this.f159173d != null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        C60700b.m235851b("SubtitleAdapter", "[onClick]", sb.toString());
        View.OnClickListener onClickListener = this.f159173d;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    /* renamed from: a */
    public void onBindViewHolder(C63166a aVar, int i) {
        if (getItemViewType(i) == 0) {
            aVar.mo218647a(this.f159170a, mo218643a(i));
        }
    }

    /* renamed from: a */
    public C63166a onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view;
        if (i == 0) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(this.f159172c, viewGroup, false);
        } else if (i == 1) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.subtitle_header_item, viewGroup, false);
            view.findViewById(R.id.subtile_his_open).setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.vc.meeting.module.subtitle.$$Lambda$l$MVc0ELsAksz0QGB1Z5Mwgela1s */

                public final void onClick(View view) {
                    C63165l.m271418lambda$MVc0ELsAksz0QGB1Z5Mwgela1s(C63165l.this, view);
                }
            });
        } else {
            view = null;
        }
        return new C63166a(view, this.f159174e);
    }

    public C63165l(String str, List<C63186o> list, int i) {
        this.f159170a = str;
        this.f159171b = list;
        this.f159172c = i;
        mo218644a();
    }
}
