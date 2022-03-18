package com.ss.android.vc.meeting.module.subtitle;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.larksuite.component.universe_design.util.UDUiModeUtils;
import com.larksuite.framework.ui.StableLinearLayoutManager;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.floatbubble.C28460b;
import com.ss.android.lark.utils.C57782ag;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.VideoChatModule;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.p3083e.C60776r;
import com.ss.android.vc.common.p3083e.C60783v;
import com.ss.android.vc.common.utils.VCDialogUtils;
import com.ss.android.vc.common.widget.IconFontView;
import com.ss.android.vc.dependency.AbstractC60902q;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.dto.NewGuideConfig;
import com.ss.android.vc.entity.ByteviewUser;
import com.ss.android.vc.entity.InMeetingData;
import com.ss.android.vc.entity.MeetingSubtitleData;
import com.ss.android.vc.entity.ParticipantType;
import com.ss.android.vc.entity.response.C60963ai;
import com.ss.android.vc.entity.response.an;
import com.ss.android.vc.entity.response.aq;
import com.ss.android.vc.entity.response.au;
import com.ss.android.vc.meeting.basedialog.FullScreen.AbstractC61214a;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.base.AbstractC61429i;
import com.ss.android.vc.meeting.module.base.MeetingActivity;
import com.ss.android.vc.meeting.module.floatingwindow.AbstractC61728a;
import com.ss.android.vc.meeting.module.guides.NewGuideDelegate;
import com.ss.android.vc.meeting.module.subtitle.C63152d;
import com.ss.android.vc.meeting.module.subtitle.C63172n;
import com.ss.android.vc.meeting.module.subtitle.SubTitleSearchView;
import com.ss.android.vc.meeting.module.subtitle.SubtitleModel2;
import com.ss.android.vc.meeting.module.subtitle.filter.FilterUserSelectDialog;
import com.ss.android.vc.meeting.module.subtitle.widget.C63206a;
import com.ss.android.vc.meeting.module.subtitle.widget.C63212b;
import com.ss.android.vc.meeting.module.subtitle.widget.C63215e;
import com.ss.android.vc.meeting.module.subtitle.widget.SelectableTextView;
import com.ss.android.vc.meeting.module.tab.history.view.VcTabGuideView;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.request.VcBizSender;
import com.ss.android.vc.net.service.GetUserInfoListener;
import com.ss.android.vc.net.service.UserInfoService;
import com.ss.android.vc.net.service.VideoChatUser;
import com.ss.android.vc.statistics.event.bx;
import com.ss.android.vc.statistics.event2.MeetingSubtitleEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.vc.meeting.module.subtitle.n */
public class C63172n extends FrameLayout implements AbstractC61214a {

    /* renamed from: H */
    public static final AbstractC60902q f159194H = VideoChatModule.getDependency().getGuideDependency();

    /* renamed from: L */
    private static final Integer f159195L = 30;

    /* renamed from: A */
    public int f159196A;

    /* renamed from: B */
    public boolean f159197B;

    /* renamed from: C */
    public boolean f159198C;

    /* renamed from: D */
    public boolean f159199D;

    /* renamed from: E */
    public boolean f159200E;

    /* renamed from: F */
    public int f159201F;

    /* renamed from: G */
    public C63206a f159202G;

    /* renamed from: I */
    public final Handler f159203I;

    /* renamed from: J */
    public LinearLayoutManager f159204J;

    /* renamed from: K */
    public final AbstractC63162i f159205K;

    /* renamed from: a */
    RecyclerView f159206a;

    /* renamed from: b */
    C63152d f159207b;

    /* renamed from: c */
    View f159208c;

    /* renamed from: d */
    View f159209d;

    /* renamed from: e */
    VcTabGuideView f159210e;

    /* renamed from: f */
    View f159211f;

    /* renamed from: g */
    FrameLayout f159212g;

    /* renamed from: h */
    LottieLoadingView f159213h;

    /* renamed from: i */
    SubtitleSettingFrame f159214i;

    /* renamed from: j */
    SubTitleSearchView f159215j;

    /* renamed from: k */
    ViewGroup f159216k;

    /* renamed from: l */
    IconFontView f159217l;

    /* renamed from: m */
    IconFontView f159218m;

    /* renamed from: n */
    View f159219n;

    /* renamed from: o */
    public FilterUserSelectDialog f159220o;

    /* renamed from: p */
    public Long f159221p;

    /* renamed from: q */
    public boolean f159222q;

    /* renamed from: r */
    public AbstractC61429i f159223r;

    /* renamed from: s */
    public C61303k f159224s;

    /* renamed from: t */
    public ByteviewUser f159225t;

    /* renamed from: u */
    public final List<SubtitleModel2> f159226u;

    /* renamed from: v */
    public String f159227v;

    /* renamed from: w */
    public final List<an.C60964a> f159228w;

    /* renamed from: x */
    public final List<String> f159229x;

    /* renamed from: y */
    public String f159230y;

    /* renamed from: z */
    public Long f159231z;

    /* renamed from: a */
    public void mo218663a(final String str, final boolean z) {
        this.f159201F++;
        this.f159215j.setSearchFilterEnable(false);
        VcBizSender.m249254c(str, z).mo219889a(new AbstractC63598b<au>() {
            /* class com.ss.android.vc.meeting.module.subtitle.C63172n.C631763 */

            /* renamed from: a */
            public void onSuccess(au auVar) {
                C60700b.m235851b("SubtitleHistoryContent2@", "[synSubtitlesRequest]", "success");
                C63172n.this.f159215j.setSearchFilterEnable(true);
                C63172n.this.f159201F = 0;
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235864f("SubtitleHistoryContent2@", "[synSubtitlesRequest]", eVar.mo219902b());
                if (C63172n.this.f159201F < 5) {
                    C63172n.this.mo218663a(str, z);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo218661a(final Long l, final String str) {
        VcBizSender.m249157a(l, str).mo219889a(new AbstractC63598b<an>() {
            /* class com.ss.android.vc.meeting.module.subtitle.C63172n.C631774 */

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235864f("SubtitleHistoryContent2@", "[pullSearchSubtitlesRequest]", eVar.mo219902b());
            }

            /* renamed from: a */
            public void onSuccess(an anVar) {
                C60700b.m235851b("SubtitleHistoryContent2@", "[pullSearchSubtitlesRequest]", "success");
                if (C57782ag.m224242a(C63172n.this.f159227v, anVar.f152651b)) {
                    if (CollectionUtils.isNotEmpty(anVar.f152650a)) {
                        C63172n.this.f159228w.addAll(anVar.f152650a);
                        if (anVar.f152652c) {
                            C63172n.this.mo218661a(anVar.f152650a.get(anVar.f152650a.size() - 1).f152653a, str);
                        } else {
                            C63172n.this.mo218672g();
                        }
                    } else {
                        if (l != null) {
                            C60700b.m235864f("SubtitleHistoryContent2@", "[loadSearchSubtitleMatchs]", "search subtitle reuslt error");
                        }
                        C63172n.this.f159227v = null;
                        C63172n.this.f159228w.clear();
                        C63172n.this.f159229x.clear();
                        C63172n.this.f159230y = null;
                        C63172n.this.f159231z = null;
                        C63172n.this.f159196A = 0;
                        C63172n.this.f159198C = true;
                        C63172n.this.f159197B = true;
                        C63172n.this.setSearchToolVisiblity(0);
                        C63172n.this.f159215j.mo218507a(0, 0, true);
                        C63172n.this.setUpSelected(false);
                        C63172n.this.setDownSelected(false);
                        if (C63172n.this.f159225t == null) {
                            C63172n.this.mo218676k();
                        } else {
                            C63172n.this.mo218674i();
                        }
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public void mo218662a(String str, String str2, Long l, long j, final boolean z) {
        VcBizSender.m249182a(str, str2, l, Long.valueOf(j), (Boolean) false).mo219889a(new AbstractC63598b<C60963ai>() {
            /* class com.ss.android.vc.meeting.module.subtitle.C63172n.C631817 */

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235864f("SubtitleHistoryContent2@", "[pullSubtitleRequest]", "onError " + eVar.toString());
            }

            /* renamed from: a */
            public void onSuccess(C60963ai aiVar) {
                C60700b.m235851b("SubtitleHistoryContent2@", "[pullSubtitleRequest]", "success");
                if (aiVar != null && aiVar.f152645a != null) {
                    final int i = 1;
                    if (!aiVar.f152647c) {
                        C63172n.this.f159199D = false;
                        i = 4;
                    } else {
                        C63172n.this.f159199D = true;
                    }
                    if (C63172n.this.f159221p != aiVar.f152646b) {
                        C63172n.this.f159221p = aiVar.f152646b;
                        if (i != 4) {
                            i = 3;
                        }
                        C63172n.this.f159226u.addAll(C63172n.this.mo218657a(aiVar));
                        C63172n.this.f159207b.mo218619a(new ArrayList(C63172n.this.f159226u));
                        C63172n.this.f159203I.postDelayed(new Runnable() {
                            /* class com.ss.android.vc.meeting.module.subtitle.C63172n.C631817.RunnableC631821 */

                            public void run() {
                                if (i != 1) {
                                    C63172n.this.f159205K.mo218638b(i);
                                }
                                if (z) {
                                    C63172n.this.f159204J.scrollToPositionWithOffset(C63172n.this.f159204J.getItemCount() - 1, 0);
                                }
                            }
                        }, 300);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public void mo218664a(boolean z, boolean z2) {
        C63152d dVar = this.f159207b;
        if (dVar != null) {
            dVar.mo218620a(z);
            if (z2) {
                this.f159203I.postDelayed(new Runnable() {
                    /* class com.ss.android.vc.meeting.module.subtitle.C63172n.RunnableC631849 */

                    public void run() {
                        C63172n.this.mo218677l();
                        VcBizSender.m249140a((ByteviewUser) null).mo219889a(new AbstractC63598b<aq>() {
                            /* class com.ss.android.vc.meeting.module.subtitle.C63172n.RunnableC631849.C631851 */

                            @Override // com.ss.android.vc.net.request.AbstractC63598b
                            public void onError(C63602e eVar) {
                                C60700b.m235864f("SubtitleHistoryContent2@", "[setSubtitlesFilterRequest]", eVar.mo219902b());
                            }

                            /* renamed from: a */
                            public void onSuccess(aq aqVar) {
                                C63172n.this.f159201F = 0;
                                C63172n.this.mo218663a(C63172n.this.f159224s.mo212055d(), true);
                                C63172n.this.mo218676k();
                            }
                        });
                    }
                }, 500);
            }
        }
    }

    /* renamed from: a */
    public void mo218660a(MeetingSubtitleData meetingSubtitleData) {
        boolean z;
        boolean z2;
        C63152d dVar = this.f159207b;
        if (dVar != null) {
            dVar.mo218621b(this.f159223r.mo212921f().mo212107Y().mo218564d());
        }
        SubtitleModel2 b = m247373b(meetingSubtitleData);
        if (b != null) {
            int size = this.f159226u.size();
            int size2 = this.f159226u.size() - 1;
            while (true) {
                size = size2;
                z = false;
                if (size < 0) {
                    break;
                }
                SubtitleModel2 subtitleModel2 = this.f159226u.get(size);
                if (subtitleModel2.mSeqId != b.mSeqId) {
                    if (subtitleModel2.mSeqId <= b.mSeqId) {
                        break;
                    }
                    size2 = size - 1;
                } else {
                    z2 = true;
                    break;
                }
            }
            size = size;
            z2 = false;
            if (z2) {
                if (b.mSoundType == MeetingSubtitleData.SoundType.NOISE) {
                    this.f159226u.remove(size);
                } else {
                    this.f159226u.set(size, b);
                }
                this.f159207b.mo218619a(new ArrayList(this.f159226u));
                if (this.f159222q) {
                    mo218675j();
                }
            } else if (b.mSeqId == 0) {
            } else {
                if (!TextUtils.isEmpty(this.f159227v) && this.f159198C) {
                    this.f159222q = false;
                    this.f159211f.setVisibility(0);
                } else if (this.f159225t != null && this.f159199D) {
                    this.f159222q = false;
                    this.f159211f.setVisibility(0);
                } else if (b.mSoundType != MeetingSubtitleData.SoundType.NOISE) {
                    int itemCount = this.f159204J.getItemCount() - this.f159204J.findLastVisibleItemPosition();
                    if (itemCount == 0 || itemCount == 1 || itemCount == 2) {
                        z = true;
                    }
                    this.f159226u.add(size, b);
                    this.f159207b.mo218619a(new ArrayList(this.f159226u));
                    if (z) {
                        this.f159222q = true;
                        this.f159211f.setVisibility(8);
                        this.f159203I.postDelayed(new Runnable() {
                            /* class com.ss.android.vc.meeting.module.subtitle.$$Lambda$n$U2AMLvG8DjUNOP7W7iFJILIv9c */

                            public final void run() {
                                C63172n.m271423lambda$U2AMLvG8DjUNOP7W7iFJILIv9c(C63172n.this);
                            }
                        }, 300);
                    }
                }
            }
        }
    }

    /* renamed from: q */
    private void m247383q() {
        VcTabGuideView vcTabGuideView = this.f159210e;
        if (vcTabGuideView != null) {
            vcTabGuideView.mo219049b();
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: y */
    private /* synthetic */ void m247391y() {
        if (this.f159222q) {
            mo218675j();
        }
    }

    /* renamed from: t */
    private void m247386t() {
        VcBizSender.m249140a((ByteviewUser) null).mo219893b(new AbstractC63598b<aq>() {
            /* class com.ss.android.vc.meeting.module.subtitle.C63172n.C631838 */

            /* renamed from: a */
            public void onSuccess(aq aqVar) {
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235864f("SubtitleHistoryContent2@", "[setSubtitlesFilterRequest]", eVar.mo219902b());
            }
        });
    }

    /* renamed from: v */
    private void m247388v() {
        startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.frame_bottom_in));
    }

    /* renamed from: w */
    private void m247389w() {
        startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.activity_bottom_out));
    }

    /* access modifiers changed from: public */
    /* renamed from: x */
    private /* synthetic */ void m247390x() {
        LinearLayoutManager linearLayoutManager = this.f159204J;
        linearLayoutManager.scrollToPositionWithOffset(linearLayoutManager.getItemCount() - 1, 0);
    }

    @Override // com.ss.android.vc.meeting.basedialog.FullScreen.AbstractC61214a
    public boolean bS_() {
        if (((ViewGroup) getParent()) == null) {
            return false;
        }
        m247387u();
        return true;
    }

    /* renamed from: n */
    private void m247380n() {
        this.f159221p = null;
        m247371a(this.f159224s.mo212055d(), "", this.f159221p, (Long) 30L, true);
    }

    /* renamed from: p */
    private void m247382p() {
        NewGuideDelegate.m240526a(new NewGuideConfig(this.f159209d, "all_vc_subtitles_setting", null, UIHelper.getString(R.string.View_G_ClickHereToChangeLanguages), 80));
    }

    /* access modifiers changed from: public */
    /* renamed from: z */
    private /* synthetic */ void m247392z() {
        RecyclerView recyclerView = this.f159206a;
        if (recyclerView != null && recyclerView.isAttachedToWindow()) {
            LinearLayoutManager linearLayoutManager = this.f159204J;
            linearLayoutManager.scrollToPositionWithOffset(linearLayoutManager.getItemCount() - 1, 0);
        }
    }

    /* renamed from: d */
    public void mo218668d() {
        m247371a(this.f159224s.mo212055d(), "", this.f159221p, (Long) 30L, false);
    }

    /* renamed from: e */
    public void mo218670e() {
        this.f159213h.setVisibility(0);
        m247370a(this.f159224s.mo212055d(), "", this.f159221p, 30L);
    }

    /* renamed from: j */
    public void mo218675j() {
        this.f159203I.postDelayed(new Runnable() {
            /* class com.ss.android.vc.meeting.module.subtitle.$$Lambda$n$BmjKX8OYT1DfVVHbBVmwEMYNNTw */

            public final void run() {
                C63172n.lambda$BmjKX8OYT1DfVVHbBVmwEMYNNTw(C63172n.this);
            }
        }, 20);
        this.f159211f.setVisibility(8);
    }

    /* renamed from: l */
    public void mo218677l() {
        this.f159215j.mo218506a();
        this.f159225t = null;
        this.f159227v = null;
        this.f159228w.clear();
        this.f159229x.clear();
        this.f159196A = 0;
        this.f159230y = null;
        this.f159231z = null;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Context context = getContext();
        if (context instanceof MeetingActivity) {
            ((MeetingActivity) context).mo212771a(this);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f159203I.removeCallbacksAndMessages(null);
        Context context = getContext();
        if (context instanceof MeetingActivity) {
            ((MeetingActivity) context).mo212776b(this);
        }
    }

    /* renamed from: m */
    private void m247379m() {
        this.f159199D = false;
        this.f159226u.clear();
        this.f159207b.mo218619a(new ArrayList(this.f159226u));
        this.f159221p = null;
        this.f159205K.mo218639c();
        this.f159205K.mo218638b(2);
        m247370a(this.f159224s.mo212055d(), "", this.f159221p, 30L);
    }

    /* renamed from: u */
    private void m247387u() {
        this.f159203I.removeCallbacksAndMessages(null);
        m247389w();
        if (getParent() != null) {
            bx.m250225a(1, this.f159224s.mo212056e());
            ((ViewGroup) getParent()).removeAllViews();
        }
        m247383q();
        LottieLoadingView lottieLoadingView = this.f159213h;
        if (lottieLoadingView != null) {
            lottieLoadingView.cancelAnimation();
        }
        C63152d dVar = this.f159207b;
        if (dVar != null) {
            dVar.mo218615a();
        }
    }

    /* renamed from: h */
    public void mo218673h() {
        this.f159227v = null;
        this.f159228w.clear();
        this.f159229x.clear();
        this.f159230y = null;
        this.f159231z = null;
        this.f159196A = 0;
        this.f159198C = true;
        this.f159197B = true;
        this.f159215j.mo218511c();
        if (this.f159225t == null) {
            mo218676k();
        } else {
            mo218674i();
        }
    }

    /* renamed from: i */
    public void mo218674i() {
        this.f159200E = false;
        this.f159226u.clear();
        this.f159207b.mo218619a(new ArrayList(this.f159226u));
        this.f159221p = null;
        this.f159205K.mo218639c();
        this.f159205K.mo218638b(2);
        mo218662a(this.f159224s.mo212055d(), "", this.f159221p, 30L, true);
    }

    /* renamed from: k */
    public void mo218676k() {
        this.f159226u.clear();
        this.f159207b.mo218619a(new ArrayList(this.f159226u));
        this.f159221p = null;
        this.f159205K.mo218639c();
        this.f159205K.mo218638b(2);
        m247380n();
    }

    /* renamed from: o */
    private void m247381o() {
        if (NewGuideDelegate.m240533b()) {
            VcTabGuideView vcTabGuideView = this.f159210e;
            if (vcTabGuideView != null) {
                vcTabGuideView.mo219049b();
            }
            m247382p();
        } else if (f159194H.checkToShow("all_vc_subtitles_setting")) {
            this.f159210e.setDismissListener(new VcTabGuideView.AbstractC63299b() {
                /* class com.ss.android.vc.meeting.module.subtitle.C63172n.AnonymousClass12 */

                @Override // com.ss.android.vc.meeting.module.tab.history.view.VcTabGuideView.AbstractC63299b
                /* renamed from: a */
                public void mo218688a() {
                    C63172n.f159194H.completeGuide("all_vc_subtitles_setting", true);
                }
            });
            LinkedList linkedList = new LinkedList();
            linkedList.add(new VcTabGuideView.C63298a(UIHelper.getString(R.string.View_G_ClickHereToChangeLanguages), this.f159209d));
            this.f159210e.mo219048a(linkedList);
        }
    }

    /* renamed from: s */
    private void m247385s() {
        ArrayList arrayList = new ArrayList();
        if (CollectionUtils.isNotEmpty(this.f159226u)) {
            for (SubtitleModel2 subtitleModel2 : this.f159226u) {
                if (subtitleModel2.mSeqId != 0) {
                    SubtitleModel2 subtitleModel22 = new SubtitleModel2(subtitleModel2);
                    subtitleModel22.mCurrentSelectItem = this.f159230y;
                    arrayList.add(subtitleModel22);
                }
            }
        }
        this.f159226u.clear();
        this.f159226u.addAll(arrayList);
        this.f159207b.mo218619a(new ArrayList(this.f159226u));
    }

    /* renamed from: f */
    public void mo218671f() {
        int i = this.f159196A;
        if (i < 0 || i >= this.f159229x.size()) {
            setUpSelected(false);
            setDownSelected(false);
            return;
        }
        String str = this.f159229x.get(this.f159196A);
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split("_");
            if (split.length > 0) {
                Long valueOf = Long.valueOf(split[0]);
                this.f159231z = valueOf;
                this.f159230y = this.f159229x.get(this.f159196A);
                final int a = this.f159207b.mo218612a(valueOf);
                m247385s();
                if (a != -1) {
                    this.f159206a.post(new Runnable() {
                        /* class com.ss.android.vc.meeting.module.subtitle.C63172n.RunnableC631752 */

                        public void run() {
                            C63172n.this.f159206a.smoothScrollToPosition(a);
                        }
                    });
                } else {
                    this.f159226u.clear();
                    this.f159197B = true;
                    this.f159198C = true;
                    this.f159205K.mo218639c();
                    this.f159205K.mo218638b(2);
                    String d = this.f159224s.mo212055d();
                    Long l = this.f159231z;
                    Integer num = f159195L;
                    m247372a(d, "", l, 30L, false, num, num, true);
                }
            }
        }
        this.f159215j.mo218507a(Integer.valueOf(this.f159196A + 1), Integer.valueOf(this.f159229x.size()), true);
        this.f159216k.setVisibility(0);
        this.f159219n.setVisibility(0);
        if (this.f159196A > 0) {
            setUpSelected(true);
        } else {
            setUpSelected(false);
        }
        if (this.f159196A < this.f159229x.size() - 1) {
            setDownSelected(true);
        } else {
            setDownSelected(false);
        }
    }

    /* renamed from: g */
    public void mo218672g() {
        this.f159196A = 0;
        this.f159221p = null;
        this.f159226u.clear();
        if (CollectionUtils.isNotEmpty(this.f159228w)) {
            this.f159229x.clear();
            for (an.C60964a aVar : this.f159228w) {
                Iterator<Integer> it = aVar.f152654b.iterator();
                while (it.hasNext()) {
                    this.f159229x.add(aVar.f152653a + "_" + it.next());
                }
            }
            this.f159230y = this.f159229x.get(this.f159196A);
            this.f159231z = this.f159228w.get(this.f159196A).f152653a;
            this.f159197B = true;
            this.f159198C = true;
            this.f159205K.mo218639c();
            this.f159205K.mo218638b(2);
            String d = this.f159224s.mo212055d();
            Long l = this.f159231z;
            Integer num = f159195L;
            m247372a(d, "", l, 30L, false, num, num, true);
        }
    }

    /* renamed from: r */
    private void m247384r() {
        setBackgroundResource(R.color.bg_body);
        LayoutInflater.from(getContext()).inflate(R.layout.subtitle_history_content2, (ViewGroup) this, true);
        setFocusable(true);
        setClickable(true);
        this.f159212g = (FrameLayout) findViewById(R.id.subtitle_his_header);
        this.f159213h = (LottieLoadingView) findViewById(R.id.loading_tag);
        this.f159208c = findViewById(R.id.history_close);
        this.f159209d = findViewById(R.id.iv_subtitle_setting);
        this.f159210e = (VcTabGuideView) findViewById(R.id.view_guide);
        this.f159211f = findViewById(R.id.bt_back_to_bottom);
        this.f159216k = (ViewGroup) findViewById(R.id.history_search_tool_view);
        this.f159219n = findViewById(R.id.bottom_divider);
        this.f159217l = (IconFontView) findViewById(R.id.history_search_up_icon);
        this.f159218m = (IconFontView) findViewById(R.id.history_search_down_icon);
        this.f159217l.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.subtitle.C63172n.AnonymousClass13 */

            public void onClick(View view) {
                SubTitleSearchView.Callback callback = C63172n.this.f159215j.getCallback();
                if (callback != null) {
                    callback.mo218524a();
                }
            }
        });
        this.f159218m.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.subtitle.C63172n.AnonymousClass14 */

            public void onClick(View view) {
                SubTitleSearchView.Callback callback = C63172n.this.f159215j.getCallback();
                if (callback != null) {
                    callback.mo218526b();
                }
            }
        });
        SubTitleSearchView subTitleSearchView = (SubTitleSearchView) findViewById(R.id.subtitle_search_view);
        this.f159215j = subTitleSearchView;
        subTitleSearchView.setCallback(new SubTitleSearchView.Callback() {
            /* class com.ss.android.vc.meeting.module.subtitle.C63172n.AnonymousClass15 */

            @Override // com.ss.android.vc.meeting.module.subtitle.SubTitleSearchView.Callback
            /* renamed from: f */
            public void mo218530f() {
                C63172n.this.setDownSelected(false);
                C63172n.this.setUpSelected(false);
            }

            @Override // com.ss.android.vc.meeting.module.subtitle.SubTitleSearchView.Callback
            /* renamed from: d */
            public void mo218528d() {
                C63172n.this.mo218673h();
                bx.m250225a(7, C63172n.this.f159224s.mo212056e());
            }

            @Override // com.ss.android.vc.meeting.module.subtitle.SubTitleSearchView.Callback
            /* renamed from: a */
            public void mo218524a() {
                if (TextUtils.equals(C63172n.this.f159215j.getInputText(), C63172n.this.f159227v) && C63172n.this.f159196A > 0) {
                    C63172n nVar = C63172n.this;
                    nVar.f159196A--;
                    C63172n.this.mo218671f();
                    bx.m250225a(5, C63172n.this.f159224s.mo212056e());
                }
            }

            @Override // com.ss.android.vc.meeting.module.subtitle.SubTitleSearchView.Callback
            /* renamed from: b */
            public void mo218526b() {
                if (TextUtils.equals(C63172n.this.f159215j.getInputText(), C63172n.this.f159227v) && C63172n.this.f159196A + 1 < C63172n.this.f159229x.size()) {
                    C63172n.this.f159196A++;
                    C63172n.this.mo218671f();
                    bx.m250225a(6, C63172n.this.f159224s.mo212056e());
                }
            }

            @Override // com.ss.android.vc.meeting.module.subtitle.SubTitleSearchView.Callback
            /* renamed from: e */
            public void mo218529e() {
                C63172n.this.setUpSelected(false);
                C63172n.this.setDownSelected(false);
                C63172n.this.f159216k.setVisibility(8);
                C63172n.this.f159219n.setVisibility(8);
                C63172n.this.f159215j.mo218507a(0, 0, false);
            }

            @Override // com.ss.android.vc.meeting.module.subtitle.SubTitleSearchView.Callback
            /* renamed from: c */
            public void mo218527c() {
                C63172n.this.f159215j.mo218512d();
                C63172n nVar = C63172n.this;
                nVar.f159220o = new FilterUserSelectDialog(nVar.f159223r.mo212918b(), C63172n.this.f159223r.mo212921f(), new FilterUserSelectDialog.UserSelectDelegate() {
                    /* class com.ss.android.vc.meeting.module.subtitle.C63172n.AnonymousClass15.C631741 */

                    @Override // com.ss.android.vc.meeting.module.subtitle.filter.FilterUserSelectDialog.UserSelectDelegate
                    /* renamed from: a */
                    public void mo218574a(ByteviewUser byteviewUser) {
                        boolean z;
                        int i;
                        SubTitleSearchView subTitleSearchView = C63172n.this.f159215j;
                        int i2 = 1;
                        if (byteviewUser != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        subTitleSearchView.setFilterSelected(z);
                        C63172n.this.setSubTitleFilter(byteviewUser);
                        if (byteviewUser != null) {
                            try {
                                String i3 = C63172n.this.f159224s.mo212091I().mo212490a().mo212477i();
                                String c = VideoChatModuleDependency.m236630c();
                                JSONObject jSONObject = new JSONObject();
                                if (TextUtils.equals(i3, byteviewUser.getUserId())) {
                                    i = 1;
                                } else {
                                    i = 0;
                                }
                                jSONObject.put("is_host", i);
                                if (!TextUtils.equals(c, byteviewUser.getUserId())) {
                                    i2 = 0;
                                }
                                jSONObject.put("is_self", i2);
                                bx.m250226a("filter_user", jSONObject, C63172n.this.f159224s.mo212056e());
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                        } else {
                            bx.m250225a(10, C63172n.this.f159224s.mo212056e());
                        }
                    }
                });
                C63172n.this.f159220o.mo218572b(C63172n.this.f159225t);
                C63172n.this.f159220o.mo218573b(C63172n.this.f159224s.mo212055d());
                C63172n.this.f159220o.mo211606a();
                bx.m250225a(8, C63172n.this.f159224s.mo212056e());
                MeetingSubtitleEvent.m249722a().mo220228a("filter", "none", null, C63172n.this.f159224s.mo212056e(), null);
            }

            @Override // com.ss.android.vc.meeting.module.subtitle.SubTitleSearchView.Callback
            /* renamed from: a */
            public void mo218525a(String str) {
                if (!C57782ag.m224242a(C63172n.this.f159227v, str)) {
                    C63172n.this.f159227v = str;
                    if (!TextUtils.isEmpty(str)) {
                        C63172n.this.f159228w.clear();
                        C63172n.this.mo218661a((Long) null, str);
                    } else {
                        C63172n.this.mo218673h();
                    }
                    bx.m250225a(4, C63172n.this.f159224s.mo212056e());
                }
            }
        });
        this.f159208c.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.subtitle.$$Lambda$n$3uJYOJHMv3P7cZ_edwuOieeXvNc */

            public final void onClick(View view) {
                C63172n.lambda$3uJYOJHMv3P7cZ_edwuOieeXvNc(C63172n.this, view);
            }
        });
        this.f159209d.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.subtitle.$$Lambda$n$pYiOA7ntIVUI_dDMU2Zf_KMqBco */

            public final void onClick(View view) {
                C63172n.lambda$pYiOA7ntIVUI_dDMU2Zf_KMqBco(C63172n.this, view);
            }
        });
        this.f159206a = (RecyclerView) findViewById(R.id.recyclerview);
        StableLinearLayoutManager stableLinearLayoutManager = new StableLinearLayoutManager(getContext());
        this.f159204J = stableLinearLayoutManager;
        this.f159206a.setLayoutManager(stableLinearLayoutManager);
        this.f159206a.addOnScrollListener(this.f159205K);
        this.f159206a.addOnScrollListener(new RecyclerView.OnScrollListener() {
            /* class com.ss.android.vc.meeting.module.subtitle.C63172n.AnonymousClass16 */

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                super.onScrolled(recyclerView, i, i2);
                if (C63172n.this.f159202G != null && C63172n.this.f159202G.f159351f) {
                    C63172n.this.f159202G.mo218776a();
                    C63172n.this.f159202G.mo218781c();
                    C63172n.this.f159202G.mo218782d();
                    C63172n.this.f159202G = null;
                }
            }
        });
        C63152d dVar = new C63152d(getContext(), this.f159224s.mo212055d(), new ArrayList(this.f159226u), new AbstractC63158f() {
            /* class com.ss.android.vc.meeting.module.subtitle.C63172n.AnonymousClass17 */

            /* access modifiers changed from: public */
            /* renamed from: a */
            private /* synthetic */ void m247430a(C63212b bVar) {
                C60738ac.m236023a((int) R.string.View_G_CopiedSuccessfully);
                ((ClipboardManager) ar.m236694a().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(bVar.f159385c, bVar.f159385c));
                bx.m250225a(12, C63172n.this.f159224s.mo212056e());
            }

            @Override // com.ss.android.vc.meeting.module.subtitle.widget.SelectableTextView.AbstractC63205a
            /* renamed from: b */
            public void mo218692b(SelectableTextView selectableTextView) {
                if (C63172n.this.f159202G != null && C63172n.this.f159202G.f159351f && C63172n.this.f159202G.mo218782d() == selectableTextView) {
                    C63172n.this.f159202G.mo218776a();
                    C63172n.this.f159202G.mo218781c();
                    C63172n.this.f159202G = null;
                }
            }

            @Override // com.ss.android.vc.meeting.module.subtitle.widget.SelectableTextView.AbstractC63205a
            /* renamed from: a */
            public void mo218691a(SelectableTextView selectableTextView) {
                if (C63172n.this.f159202G != null && C63172n.this.f159202G.f159351f) {
                    C63172n.this.f159202G.mo218776a();
                    C63172n.this.f159202G.mo218781c();
                    C63172n.this.f159202G = null;
                }
                C63172n.this.f159202G = new C63206a.C63208a(selectableTextView).mo218785a((float) UIHelper.getDimens(R.dimen.dp_8)).mo218786a(C60773o.m236126d(R.color.primary_pri_500)).mo218788b(C60773o.m236126d(R.color.primary_pri_400)).mo218787a();
                C63172n.this.f159202G.mo218778a(new C63206a.AbstractC63210c() {
                    /* class com.ss.android.vc.meeting.module.subtitle.$$Lambda$n$17$EIsjUf3QqijzRi42I1MHGbAWRIs */

                    @Override // com.ss.android.vc.meeting.module.subtitle.widget.C63206a.AbstractC63210c
                    public final void onTextSelected(C63212b bVar) {
                        C63172n.AnonymousClass17.lambda$EIsjUf3QqijzRi42I1MHGbAWRIs(C63172n.AnonymousClass17.this, bVar);
                    }
                });
                C63172n.this.f159202G.mo218777a(0, selectableTextView.getText().length());
            }

            @Override // com.ss.android.vc.meeting.module.subtitle.AbstractC63158f
            /* renamed from: a */
            public void mo218632a(String str) {
                long j;
                if (C28460b.m104296a(C63172n.this.getContext())) {
                    VideoChatModule.getDependency().getBrowserDependency().openUrlBrowser(C63172n.this.getContext(), str);
                    Activity b = C60773o.m236124b(C63172n.this.getContext());
                    if (b != null) {
                        AbstractC61728a ae = C63172n.this.f159224s.ae();
                        if (Build.VERSION.SDK_INT < 26) {
                            j = 1500;
                        } else {
                            j = 800;
                        }
                        ae.mo213808a(b, j);
                    }
                    bx.m250225a(13, C63172n.this.f159224s.mo212056e());
                    return;
                }
                Activity b2 = C60773o.m236124b(C63172n.this.getContext());
                if (b2 != null) {
                    VCDialogUtils.m236160a((Context) b2, (int) R.string.View_N_FloatingWindowPermission, 1, UIHelper.mustacheFormat((int) R.string.View_G_PopupPermission, "appName", VideoChatModuleDependency.getLarkAppDependency().mo196409b()), (int) R.string.View_G_CancelButton, (int) R.string.View_G_ConfirmButton, false, UDUiModeUtils.m93320a(b2.getResources().getConfiguration()));
                }
            }

            @Override // com.ss.android.vc.meeting.module.subtitle.AbstractC63158f
            /* renamed from: a */
            public void mo218631a(View view, String str) {
                C63159g.m247310a(C63172n.this.f159223r.mo212918b(), str, view, C63172n.this.f159224s.mo212056e());
            }
        });
        this.f159207b = dVar;
        dVar.mo218618a(new C63152d.AbstractC63155a() {
            /* class com.ss.android.vc.meeting.module.subtitle.$$Lambda$n$Z5GcppfitDleGpYFJGS4BhzpoY */

            @Override // com.ss.android.vc.meeting.module.subtitle.C63152d.AbstractC63155a
            public final void bind(Object obj) {
                C63172n.m271424lambda$Z5GcppfitDleGpYFJGS4BhzpoY(C63172n.this, (SubtitleStatusBar) obj);
            }
        });
        this.f159206a.setAdapter(this.f159207b);
        ((SimpleItemAnimator) this.f159206a.getItemAnimator()).setSupportsChangeAnimations(false);
        this.f159201F = 0;
        mo218663a(this.f159224s.mo212055d(), false);
        m247380n();
        this.f159211f.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.subtitle.$$Lambda$n$37AgZMB2FFhd55j3HIpe1F76qk */

            public final void onClick(View view) {
                C63172n.m271421lambda$37AgZMB2FFhd55j3HIpe1F76qk(C63172n.this, view);
            }
        });
        bx.m250225a(0, this.f159224s.mo212056e());
        mo218667b(C60776r.m236143a(C60773o.m236124b(getContext())), false);
        C63152d dVar2 = this.f159207b;
        if (dVar2 != null) {
            dVar2.mo218616a(this.f159223r.mo212921f().mo212107Y().mo218564d());
        }
        m247381o();
        m247388v();
    }

    /* renamed from: b */
    public void mo218666b() {
        if (CollectionUtils.isNotEmpty(this.f159226u)) {
            List<SubtitleModel2> list = this.f159226u;
            String d = this.f159224s.mo212055d();
            Long valueOf = Long.valueOf(list.get(list.size() - 1).mSeqId);
            Integer num = f159195L;
            m247372a(d, "", valueOf, 30L, false, num, num, false);
        }
    }

    /* renamed from: a */
    public void mo218658a() {
        if (CollectionUtils.isNotEmpty(this.f159226u)) {
            String d = this.f159224s.mo212055d();
            Long valueOf = Long.valueOf(this.f159226u.get(0).mSeqId);
            Integer num = f159195L;
            m247372a(d, "", valueOf, 30L, true, num, num, true);
        }
    }

    public C63172n(Context context) {
        this(context, null);
    }

    public void setDownSelected(boolean z) {
        this.f159218m.setSelected(z);
    }

    public void setDownVisiblity(int i) {
        this.f159218m.setVisibility(i);
    }

    public void setUpSelected(boolean z) {
        this.f159217l.setSelected(z);
    }

    public void setUpVisiblity(int i) {
        this.f159217l.setVisibility(i);
    }

    public void setSearchToolVisiblity(int i) {
        this.f159216k.setVisibility(i);
        this.f159219n.setVisibility(0);
    }

    public void setSubTitleFilter(final ByteviewUser byteviewUser) {
        VcBizSender.m249140a(byteviewUser).mo219889a(new AbstractC63598b<aq>() {
            /* class com.ss.android.vc.meeting.module.subtitle.C63172n.C631806 */

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235864f("SubtitleHistoryContent2@", "[setSubtitlesFilterRequest]", eVar.mo219902b());
            }

            /* renamed from: a */
            public void onSuccess(aq aqVar) {
                if (C63172n.this.f159225t != byteviewUser) {
                    if (!TextUtils.isEmpty(C63172n.this.f159227v)) {
                        C63172n.this.f159228w.clear();
                        C63172n.this.f159229x.clear();
                        C63172n.this.f159230y = null;
                        C63172n.this.f159231z = null;
                        C63172n.this.f159196A = 0;
                        C63172n.this.f159226u.clear();
                        C63172n.this.f159207b.mo218619a(new ArrayList(C63172n.this.f159226u));
                        C63172n nVar = C63172n.this;
                        nVar.mo218661a((Long) null, nVar.f159227v);
                    } else if (byteviewUser == null) {
                        C63172n.this.mo218676k();
                    } else {
                        C63172n.this.mo218674i();
                    }
                }
                C63172n.this.f159225t = byteviewUser;
            }
        });
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m247369a(SubtitleStatusBar subtitleStatusBar) {
        subtitleStatusBar.mo218550a(this.f159223r.mo212921f().mo212107Y().mo218564d());
    }

    /* access modifiers changed from: public */
    /* renamed from: c */
    private /* synthetic */ void m247378c(View view) {
        m247383q();
        mo218677l();
        m247386t();
        KeyboardUtils.hideKeyboard(getContext());
        m247387u();
    }

    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m247374b(View view) {
        m247383q();
        C63215e.m247567a(C60773o.m236124b(getContext()), this.f159224s, "history_setting_button").mo211606a();
        MeetingSubtitleEvent.m249722a().mo220228a("subtitle_setting", "vc_meeting_subtitle_setting_view", null, this.f159224s.mo212056e(), null);
    }

    /* renamed from: c */
    private SubtitleModel2 m247376c(MeetingSubtitleData meetingSubtitleData) {
        if (meetingSubtitleData == null) {
            return null;
        }
        SubtitleModel2 b = m247373b(meetingSubtitleData);
        if (CollectionUtils.isNotEmpty(this.f159228w)) {
            for (an.C60964a aVar : this.f159228w) {
                if (aVar.f152653a.longValue() == b.mSeqId) {
                    b.mSearchMatch = aVar;
                    b.mCurrentSelectItem = this.f159230y;
                    b.mSearchContent = this.f159227v;
                }
            }
        }
        return b;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        View view;
        Activity activityFromContext = UIUtils.getActivityFromContext(getContext());
        if (activityFromContext != null) {
            view = activityFromContext.getCurrentFocus();
        } else {
            view = null;
        }
        if (view != null && (view instanceof EditText)) {
            Rect rect = new Rect();
            view.getGlobalVisibleRect(rect);
            if (!rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                KeyboardUtils.hideKeyboard(getContext());
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public C63172n(AbstractC61429i iVar) {
        super(iVar.mo212916a());
        this.f159221p = null;
        this.f159222q = false;
        this.f159226u = new ArrayList();
        this.f159228w = new ArrayList();
        this.f159229x = new ArrayList();
        this.f159231z = null;
        this.f159196A = 0;
        this.f159197B = true;
        this.f159198C = true;
        this.f159199D = false;
        this.f159200E = false;
        this.f159201F = 0;
        this.f159203I = new Handler(Looper.getMainLooper());
        this.f159205K = new AbstractC63162i() {
            /* class com.ss.android.vc.meeting.module.subtitle.C63172n.C631731 */

            @Override // com.ss.android.vc.meeting.module.subtitle.AbstractC63162i
            /* renamed from: b */
            public void mo218637b() {
                if (TextUtils.isEmpty(C63172n.this.f159227v)) {
                    if (C63172n.this.f159225t != null && C63172n.this.f159199D) {
                        C63172n nVar = C63172n.this;
                        nVar.mo218662a(nVar.f159224s.mo212055d(), "", C63172n.this.f159221p, 30L, false);
                    }
                } else if (C63172n.this.f159198C) {
                    C63172n.this.mo218666b();
                }
            }

            @Override // com.ss.android.vc.meeting.module.subtitle.AbstractC63162i
            /* renamed from: a */
            public void mo218634a() {
                if (TextUtils.isEmpty(C63172n.this.f159227v)) {
                    if (C63172n.this.f159225t == null) {
                        C63172n.this.f159205K.mo218638b(2);
                        C63172n.this.mo218668d();
                    } else if (C63172n.this.f159200E) {
                        C63172n.this.f159205K.mo218638b(2);
                        C63172n.this.mo218670e();
                    } else {
                        C63172n.this.f159205K.mo218638b(3);
                    }
                } else if (C63172n.this.f159197B) {
                    C63172n.this.f159205K.mo218638b(2);
                    C63172n.this.mo218658a();
                } else {
                    C63172n.this.f159205K.mo218638b(3);
                }
            }

            @Override // com.ss.android.vc.meeting.module.subtitle.AbstractC63162i
            /* renamed from: a */
            public void mo218635a(int i) {
                if (i == 2) {
                    C63172n.this.f159213h.setVisibility(0);
                } else {
                    C63172n.this.f159213h.setVisibility(8);
                }
            }

            @Override // com.ss.android.vc.meeting.module.subtitle.AbstractC63162i
            /* renamed from: a */
            public void mo218636a(boolean z) {
                C63172n.this.f159222q = z;
                if (z) {
                    C63172n.this.f159211f.setVisibility(8);
                } else {
                    C63172n.this.f159211f.setVisibility(0);
                }
            }
        };
        this.f159223r = iVar;
        this.f159224s = iVar.mo212921f();
        m247384r();
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m247367a(View view) {
        bx.m250225a(2, this.f159224s.mo212056e());
        if (!TextUtils.isEmpty(this.f159227v)) {
            this.f159226u.clear();
            this.f159197B = true;
            this.f159198C = true;
            this.f159205K.mo218639c();
            this.f159205K.mo218638b(2);
            m247372a(this.f159224s.mo212055d(), "", null, 30L, true, 0, 0, true);
        } else if (this.f159225t != null) {
            m247379m();
        } else {
            mo218675j();
        }
        MeetingSubtitleEvent.m249722a().mo220228a("back_to_bottom", "none", null, this.f159224s.mo212056e(), this.f159224s.mo212093K());
    }

    /* renamed from: c */
    private List<MeetingSubtitleData> m247377c(C60963ai aiVar) {
        if (aiVar == null || aiVar.f152645a == null || aiVar.f152645a.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (MeetingSubtitleData meetingSubtitleData : aiVar.f152645a) {
            arrayList.add(meetingSubtitleData);
        }
        return arrayList;
    }

    /* renamed from: b */
    public List<SubtitleModel2> mo218665b(C60963ai aiVar) {
        SubtitleModel2 c;
        List<MeetingSubtitleData> c2 = m247377c(aiVar);
        ArrayList arrayList = new ArrayList();
        if (c2 != null && c2.size() > 0) {
            for (MeetingSubtitleData meetingSubtitleData : c2) {
                if (!(meetingSubtitleData.mSeqId == 0 || ((meetingSubtitleData.mTarget == null && meetingSubtitleData.mEvent == null) || (c = m247376c(meetingSubtitleData)) == null))) {
                    boolean z = false;
                    int i = 0;
                    while (true) {
                        if (i >= this.f159226u.size()) {
                            break;
                        } else if (this.f159226u.get(i).mSeqId == c.mSeqId) {
                            this.f159226u.set(i, c);
                            z = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                    if (!z) {
                        arrayList.add(c);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    private SubtitleModel2 m247373b(MeetingSubtitleData meetingSubtitleData) {
        if (meetingSubtitleData == null) {
            return null;
        }
        SubtitleModel2 subtitleModel2 = new SubtitleModel2();
        if (meetingSubtitleData.mTarget != null && !TextUtils.isEmpty(meetingSubtitleData.mTarget.f152469a)) {
            subtitleModel2.mSubtitle = new SubtitleModel2.Subtitle();
            subtitleModel2.mSubtitle.mUid = meetingSubtitleData.mTarget.f152471c;
            subtitleModel2.mSubtitle.mTarget = meetingSubtitleData.mTarget.f152469a;
            subtitleModel2.mSubtitle.mSpeaker = meetingSubtitleData.mTarget.f152473e;
        } else if (!(meetingSubtitleData.mEvent == null || meetingSubtitleData.mEvent.f152465b == null)) {
            subtitleModel2.mSubtitleEvent = meetingSubtitleData.mEvent;
            subtitleModel2.mSubtitle = new SubtitleModel2.Subtitle();
            subtitleModel2.mSubtitle.mUid = meetingSubtitleData.mEvent.f152465b.getUserId();
            subtitleModel2.mSubtitle.mSpeaker = meetingSubtitleData.mEvent.f152465b;
        }
        if (!(subtitleModel2.mSubtitle == null || subtitleModel2.mSubtitle.mSpeaker == null)) {
            ParticipantType participantType = subtitleModel2.mSubtitle.mSpeaker.getParticipantType();
            if (!TextUtils.isEmpty(subtitleModel2.mSubtitle.mUid) || participantType != null) {
                UserInfoService.getUserInfoById(this.f159224s.mo212055d(), subtitleModel2.mSubtitle.mUid, participantType, new GetUserInfoListener() {
                    /* class com.ss.android.vc.meeting.module.subtitle.$$Lambda$n$GdO1wSUneHmAXHYZMZxn7f4HLY */

                    @Override // com.ss.android.vc.net.service.GetUserInfoListener
                    public final void onGetUserInfo(VideoChatUser videoChatUser) {
                        C63172n.m271422lambda$GdO1wSUneHmAXHYZMZxn7f4HLY(SubtitleModel2.this, videoChatUser);
                    }
                });
            } else {
                C60700b.m235851b("SubtitleHistoryContent2@", "[subtitleModelConvert]", "no speaker user type or user id!");
            }
        }
        subtitleModel2.mTimeStamp = meetingSubtitleData.mTimeStamp / 1000;
        subtitleModel2.mSeqId = meetingSubtitleData.mSeqId;
        subtitleModel2.mIsSeqFinal = meetingSubtitleData.mIsSeqFinal;
        subtitleModel2.mSoundType = meetingSubtitleData.mSoundType;
        return subtitleModel2;
    }

    /* renamed from: a */
    public List<SubtitleModel2> mo218657a(C60963ai aiVar) {
        SubtitleModel2 b;
        List<MeetingSubtitleData> c = m247377c(aiVar);
        ArrayList arrayList = new ArrayList();
        if (c != null && c.size() > 0) {
            for (MeetingSubtitleData meetingSubtitleData : c) {
                if (!((meetingSubtitleData.mTarget == null && meetingSubtitleData.mEvent == null) || (b = m247373b(meetingSubtitleData)) == null || this.f159226u.contains(b))) {
                    arrayList.add(b);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo218659a(InMeetingData.SubtitleStatusData subtitleStatusData) {
        C63152d dVar = this.f159207b;
        if (dVar != null) {
            dVar.mo218616a(subtitleStatusData.f152438a);
            if (subtitleStatusData.f152438a == InMeetingData.SubtitleStatusData.Status.RECOVERABLE_EXCEPTION) {
                this.f159203I.postDelayed(new Runnable() {
                    /* class com.ss.android.vc.meeting.module.subtitle.$$Lambda$n$Bi5D6tFhKYk3Q7Dpqg7VtqBH7e4 */

                    public final void run() {
                        C63172n.lambda$Bi5D6tFhKYk3Q7Dpqg7VtqBH7e4(C63172n.this);
                    }
                }, 1000);
            }
        }
    }

    private C63172n(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public static /* synthetic */ void m247368a(SubtitleModel2 subtitleModel2, VideoChatUser videoChatUser) {
        C60735ab.m236018e(new Runnable(videoChatUser) {
            /* class com.ss.android.vc.meeting.module.subtitle.$$Lambda$n$Ej5p3_6m01NtXX1EGHP18CCQfWQ */
            public final /* synthetic */ VideoChatUser f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C63172n.lambda$Ej5p3_6m01NtXX1EGHP18CCQfWQ(SubtitleModel2.this, this.f$1);
            }
        });
    }

    /* renamed from: b */
    public static /* synthetic */ void m247375b(SubtitleModel2 subtitleModel2, VideoChatUser videoChatUser) {
        subtitleModel2.mSubtitle.mAvatar = C60783v.m236225a(videoChatUser.getAvatarKey(), videoChatUser.getId(), videoChatUser.getType(), 36, 36);
    }

    /* renamed from: b */
    public void mo218667b(boolean z, boolean z2) {
        FrameLayout frameLayout = this.f159212g;
        if (frameLayout != null) {
            if (z) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
                marginLayoutParams.topMargin = 0;
                this.f159212g.setLayoutParams(marginLayoutParams);
            } else {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
                marginLayoutParams2.topMargin = C60776r.m236148f();
                this.f159212g.setLayoutParams(marginLayoutParams2);
            }
        }
        SubtitleSettingFrame subtitleSettingFrame = this.f159214i;
        if (subtitleSettingFrame != null) {
            subtitleSettingFrame.mo218542a(z, z2);
        }
        if (this.f159222q) {
            mo218675j();
        }
        if (z) {
            m247387u();
        }
    }

    private C63172n(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f159226u = new ArrayList();
        this.f159228w = new ArrayList();
        this.f159229x = new ArrayList();
        this.f159231z = null;
        this.f159196A = 0;
        this.f159197B = true;
        this.f159198C = true;
        this.f159199D = false;
        this.f159200E = false;
        this.f159201F = 0;
        this.f159203I = new Handler(Looper.getMainLooper());
        this.f159205K = new AbstractC63162i() {
            /* class com.ss.android.vc.meeting.module.subtitle.C63172n.C631731 */

            @Override // com.ss.android.vc.meeting.module.subtitle.AbstractC63162i
            /* renamed from: b */
            public void mo218637b() {
                if (TextUtils.isEmpty(C63172n.this.f159227v)) {
                    if (C63172n.this.f159225t != null && C63172n.this.f159199D) {
                        C63172n nVar = C63172n.this;
                        nVar.mo218662a(nVar.f159224s.mo212055d(), "", C63172n.this.f159221p, 30L, false);
                    }
                } else if (C63172n.this.f159198C) {
                    C63172n.this.mo218666b();
                }
            }

            @Override // com.ss.android.vc.meeting.module.subtitle.AbstractC63162i
            /* renamed from: a */
            public void mo218634a() {
                if (TextUtils.isEmpty(C63172n.this.f159227v)) {
                    if (C63172n.this.f159225t == null) {
                        C63172n.this.f159205K.mo218638b(2);
                        C63172n.this.mo218668d();
                    } else if (C63172n.this.f159200E) {
                        C63172n.this.f159205K.mo218638b(2);
                        C63172n.this.mo218670e();
                    } else {
                        C63172n.this.f159205K.mo218638b(3);
                    }
                } else if (C63172n.this.f159197B) {
                    C63172n.this.f159205K.mo218638b(2);
                    C63172n.this.mo218658a();
                } else {
                    C63172n.this.f159205K.mo218638b(3);
                }
            }

            @Override // com.ss.android.vc.meeting.module.subtitle.AbstractC63162i
            /* renamed from: a */
            public void mo218635a(int i) {
                if (i == 2) {
                    C63172n.this.f159213h.setVisibility(0);
                } else {
                    C63172n.this.f159213h.setVisibility(8);
                }
            }

            @Override // com.ss.android.vc.meeting.module.subtitle.AbstractC63162i
            /* renamed from: a */
            public void mo218636a(boolean z) {
                C63172n.this.f159222q = z;
                if (z) {
                    C63172n.this.f159211f.setVisibility(8);
                } else {
                    C63172n.this.f159211f.setVisibility(0);
                }
            }
        };
    }

    /* renamed from: a */
    private void m247370a(String str, String str2, final Long l, Long l2) {
        VcBizSender.m249182a(str, str2, l, l2, (Boolean) true).mo219889a(new AbstractC63598b<C60963ai>() {
            /* class com.ss.android.vc.meeting.module.subtitle.C63172n.AnonymousClass11 */

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235864f("SubtitleHistoryContent2@", "[pullSubtitleRequest]", "onError " + eVar.toString());
            }

            /* renamed from: a */
            public void onSuccess(C60963ai aiVar) {
                C60700b.m235851b("SubtitleHistoryContent2@", "[pullSubtitleRequest]", "onSuccess");
                if (aiVar != null && aiVar.f152645a != null) {
                    int i = 1;
                    if (!aiVar.f152647c) {
                        C63172n.this.f159200E = false;
                        i = 4;
                    } else {
                        C63172n.this.f159200E = true;
                    }
                    if (C63172n.this.f159221p != aiVar.f152646b) {
                        if (i != 4) {
                            i = 3;
                        }
                        C63172n.this.f159221p = aiVar.f152646b;
                        C63172n.this.f159226u.addAll(0, C63172n.this.mo218657a(aiVar));
                        C63172n.this.f159207b.mo218619a(new ArrayList(C63172n.this.f159226u));
                        C63172n.this.f159203I.postDelayed(new Runnable(i, l) {
                            /* class com.ss.android.vc.meeting.module.subtitle.$$Lambda$n$11$KXwFrH9AEdoYnN2ESAsPPLHFHc */
                            public final /* synthetic */ int f$1;
                            public final /* synthetic */ Long f$2;

                            {
                                this.f$1 = r2;
                                this.f$2 = r3;
                            }

                            public final void run() {
                                C63172n.AnonymousClass11.m271425lambda$KXwFrH9AEdoYnN2ESAsPPLHFHc(C63172n.AnonymousClass11.this, this.f$1, this.f$2);
                            }
                        }, 300);
                    }
                }
            }

            /* access modifiers changed from: public */
            /* renamed from: a */
            private /* synthetic */ void m247419a(int i, Long l) {
                if (i != 1) {
                    C63172n.this.f159205K.mo218638b(i);
                }
                if (l != null) {
                    int a = C63172n.this.f159207b.mo218612a(l);
                    if (a != -1) {
                        C63172n.this.f159204J.scrollToPositionWithOffset(a, 0);
                        return;
                    }
                    return;
                }
                C63172n.this.f159204J.scrollToPositionWithOffset(C63172n.this.f159204J.getItemCount() - 1, 0);
            }
        });
    }

    /* renamed from: a */
    private void m247371a(String str, String str2, final Long l, Long l2, boolean z) {
        VcBizSender.m249182a(str, str2, l, l2, (Boolean) true).mo219889a(new AbstractC63598b<C60963ai>() {
            /* class com.ss.android.vc.meeting.module.subtitle.C63172n.AnonymousClass10 */

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235864f("SubtitleHistoryContent2@", "[pullSubtitleRequest]", " onError " + eVar.toString());
            }

            /* renamed from: a */
            public void onSuccess(C60963ai aiVar) {
                C60700b.m235851b("SubtitleHistoryContent2@", "[pullSubtitleRequest]", "onSuccess");
                if (aiVar != null && aiVar.f152645a != null) {
                    int i = 1;
                    if (!aiVar.f152647c) {
                        i = 4;
                    }
                    if (C63172n.this.f159221p != aiVar.f152646b) {
                        if (i != 4) {
                            i = 3;
                        }
                        C63172n.this.f159221p = aiVar.f152646b;
                        C63172n.this.f159226u.addAll(0, C63172n.this.mo218657a(aiVar));
                        C63172n.this.f159207b.mo218619a(new ArrayList(C63172n.this.f159226u));
                        C63172n.this.f159203I.postDelayed(new Runnable(i, l) {
                            /* class com.ss.android.vc.meeting.module.subtitle.$$Lambda$n$10$y4VSjTfwYnYF4Q8DAKNCyXsPnoI */
                            public final /* synthetic */ int f$1;
                            public final /* synthetic */ Long f$2;

                            {
                                this.f$1 = r2;
                                this.f$2 = r3;
                            }

                            public final void run() {
                                C63172n.AnonymousClass10.lambda$y4VSjTfwYnYF4Q8DAKNCyXsPnoI(C63172n.AnonymousClass10.this, this.f$1, this.f$2);
                            }
                        }, 300);
                    }
                }
            }

            /* access modifiers changed from: public */
            /* renamed from: a */
            private /* synthetic */ void m247417a(int i, Long l) {
                if (i != 1) {
                    C63172n.this.f159205K.mo218638b(i);
                }
                if (l == null) {
                    C63172n.this.mo218675j();
                    return;
                }
                int a = C63172n.this.f159207b.mo218612a(l);
                if (a != -1) {
                    C63172n.this.f159204J.scrollToPositionWithOffset(a, 0);
                }
            }
        });
    }

    /* renamed from: a */
    private void m247372a(String str, String str2, final Long l, final Long l2, final boolean z, Integer num, Integer num2, final boolean z2) {
        VcBizSender.m249183a(str, str2, l, l2, Boolean.valueOf(z), num, num2).mo219889a(new AbstractC63598b<C60963ai>() {
            /* class com.ss.android.vc.meeting.module.subtitle.C63172n.C631785 */

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235864f("SubtitleHistoryContent2@", "[pullSubtitleRequest]", "onError " + eVar.toString());
            }

            /* renamed from: a */
            public void onSuccess(C60963ai aiVar) {
                int i;
                C60700b.m235851b("SubtitleHistoryContent2@", "[pullSubtitleRequest]", "success");
                if (aiVar != null && aiVar.f152645a != null) {
                    List<SubtitleModel2> b = C63172n.this.mo218665b(aiVar);
                    if (CollectionUtils.isNotEmpty(b)) {
                        if (z) {
                            C63172n.this.f159226u.addAll(0, b);
                        } else {
                            C63172n.this.f159226u.addAll(b);
                        }
                        C63172n.this.f159207b.mo218619a(new ArrayList(C63172n.this.f159226u));
                    }
                    final int i2 = 4;
                    if (l2.longValue() >= ((long) aiVar.f152645a.size()) && l == null) {
                        C63172n.this.f159198C = false;
                        C63172n.this.f159197B = false;
                    } else if (C63172n.this.f159205K.mo218640d() != 4) {
                        if (aiVar.f152647c) {
                            if (z) {
                                C63172n.this.f159197B = true;
                            } else {
                                C63172n.this.f159198C = true;
                            }
                        } else if (z) {
                            C63172n.this.f159197B = false;
                        } else {
                            C63172n.this.f159198C = false;
                        }
                        if (C63172n.this.f159197B || C63172n.this.f159198C) {
                            i2 = 3;
                        }
                    } else {
                        i2 = 1;
                    }
                    C63172n.this.f159203I.postDelayed(new Runnable() {
                        /* class com.ss.android.vc.meeting.module.subtitle.C63172n.C631785.RunnableC631791 */

                        public void run() {
                            if (i2 != 1) {
                                C63172n.this.f159205K.mo218638b(i2);
                            }
                            if (!z2) {
                                return;
                            }
                            if (l != null) {
                                int a = C63172n.this.f159207b.mo218612a(l);
                                if (a != -1) {
                                    C63172n.this.f159204J.scrollToPositionWithOffset(a, 0);
                                    return;
                                }
                                return;
                            }
                            C63172n.this.f159204J.scrollToPosition(C63172n.this.f159204J.getItemCount() - 1);
                        }
                    }, 300);
                    C63172n.this.setSearchToolVisiblity(0);
                    if (C63172n.this.f159196A == 0) {
                        C63172n.this.setUpSelected(false);
                    } else {
                        C63172n.this.setUpSelected(true);
                    }
                    SubTitleSearchView subTitleSearchView = C63172n.this.f159215j;
                    if (C63172n.this.f159229x.size() > 0) {
                        i = C63172n.this.f159196A + 1;
                    } else {
                        i = 0;
                    }
                    subTitleSearchView.mo218507a(Integer.valueOf(i), Integer.valueOf(C63172n.this.f159229x.size()), true);
                    if (C63172n.this.f159196A < C63172n.this.f159229x.size() - 1) {
                        C63172n.this.setDownSelected(true);
                    } else {
                        C63172n.this.setDownSelected(false);
                    }
                }
            }
        });
    }
}
