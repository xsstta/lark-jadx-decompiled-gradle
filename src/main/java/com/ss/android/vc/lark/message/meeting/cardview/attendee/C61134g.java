package com.ss.android.vc.lark.message.meeting.cardview.attendee;

import android.app.Activity;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.util.p702e.C13657b;
import com.larksuite.suite.R;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27129h;
import com.scwang.smartrefresh.layout.p1235b.C27136d;
import com.scwang.smartrefresh.layout.p1236c.AbstractC27137a;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.widget.LoadingLottieView;
import com.ss.android.vc.dto.PullVCCardInfoEntity;
import com.ss.android.vc.entity.AttendeeFromSource;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.ParticipantType;
import com.ss.android.vc.lark.message.meeting.cardview.attendee.C61120c;
import com.ss.android.vc.lark.message.meeting.cardview.attendee.C61130f;
import com.ss.android.vc.lark.message.meeting.cardview.attendee.C61134g;
import com.ss.android.vc.meeting.module.tab.history.view.C63307a;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.request.VcBizSender;
import com.ss.android.vc.net.service.UserInfoService;
import com.ss.android.vc.statistics.event.ce;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.vc.lark.message.meeting.cardview.attendee.g */
public class C61134g extends C61130f {

    /* renamed from: g */
    RecyclerView f153144g;

    /* renamed from: h */
    SmartRefreshLayout f153145h;

    /* renamed from: i */
    CommonTitleBar f153146i;

    /* renamed from: j */
    View f153147j;

    /* renamed from: k */
    TextView f153148k;

    /* renamed from: l */
    public C61120c f153149l;

    /* renamed from: m */
    public String f153150m = "";

    /* renamed from: n */
    public boolean f153151n = true;

    /* renamed from: o */
    public boolean f153152o;

    /* renamed from: p */
    public boolean f153153p = true;

    /* renamed from: q */
    public boolean f153154q;

    /* renamed from: r */
    private String f153155r;

    /* renamed from: s */
    private String f153156s;

    /* renamed from: g */
    private void m237753g() {
        this.f153146i.getLeftText().setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.vc.lark.message.meeting.cardview.attendee.C61134g.C611351 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                C61134g.this.f153137e.mo211413a();
            }
        });
    }

    /* renamed from: a */
    public boolean mo211422a() {
        if (!this.f153151n || this.f153154q) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.vc.lark.message.meeting.cardview.attendee.C61130f, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        m237752f();
        m237753g();
        m237754h();
    }

    /* renamed from: d */
    public void mo211425d() {
        this.f153147j.setVisibility(8);
        C61120c cVar = this.f153149l;
        if (cVar != null) {
            cVar.mo211419a(false);
        }
    }

    /* renamed from: c */
    public void mo211424c() {
        C60700b.m235851b("MeetingCardAttendeeView", "[showRetryTip]", "showRetryTip");
        C61120c cVar = this.f153149l;
        if (cVar != null) {
            cVar.mo211419a(true);
        }
    }

    /* renamed from: f */
    private void m237752f() {
        this.f153146i = (CommonTitleBar) this.f153135c.findViewById(R.id.title_container);
        this.f153144g = (RecyclerView) this.f153135c.findViewById(R.id.card_attendee_list);
        this.f153145h = (SmartRefreshLayout) this.f153135c.findViewById(R.id.card_attendee_layout);
        this.f153147j = this.f153135c.findViewById(R.id.center_try_reload_view);
        this.f153148k = (TextView) this.f153135c.findViewById(R.id.center_try_reload_text);
    }

    /* renamed from: h */
    private void m237754h() {
        this.f153145h.mo96367b(new C63307a(new LoadingLottieView(this.f153135c)));
        this.f153145h.mo96368b(new AbstractC27137a() {
            /* class com.ss.android.vc.lark.message.meeting.cardview.attendee.$$Lambda$g$KzhVhwv8rCbmxhzml0GOpX9Tqko */

            @Override // com.scwang.smartrefresh.layout.p1236c.AbstractC27137a
            public final void onLoadmore(AbstractC27129h hVar) {
                C61134g.this.m237751a((C61134g) hVar);
            }
        });
        this.f153145h.mo96354a(new C27136d() {
            /* class com.ss.android.vc.lark.message.meeting.cardview.attendee.C61134g.C611362 */

            @Override // com.scwang.smartrefresh.layout.p1235b.C27136d, com.scwang.smartrefresh.layout.p1234a.AbstractC27130i
            /* renamed from: a */
            public boolean mo96480a(View view) {
                return false;
            }

            @Override // com.scwang.smartrefresh.layout.p1235b.C27136d, com.scwang.smartrefresh.layout.p1234a.AbstractC27130i
            /* renamed from: b */
            public boolean mo96481b(View view) {
                if (!super.mo96481b(view) || !C61134g.this.mo211422a()) {
                    return false;
                }
                return true;
            }
        });
        this.f153144g.setLayoutManager(new LinearLayoutManager(this.f153135c));
    }

    /* renamed from: b */
    public void mo211423b() {
        if (this.f153154q || TextUtils.isEmpty(this.f153155r) || TextUtils.isEmpty(this.f153156s)) {
            C60700b.m235851b("MeetingCardAttendeeView", "[loadData]", "meetingId or chatId invalid");
            this.f153145h.mo96416n();
            return;
        }
        this.f153154q = true;
        VcBizSender.m249221a(this.f153155r, this.f153156s, this.f153150m, new AbstractC63598b<PullVCCardInfoEntity>() {
            /* class com.ss.android.vc.lark.message.meeting.cardview.attendee.C61134g.C611395 */

            /* access modifiers changed from: private */
            /* access modifiers changed from: public */
            /* renamed from: a */
            private /* synthetic */ void m237764a() {
                C61134g.this.f153145h.mo96416n();
                C61134g.this.f153154q = false;
                if (C61134g.this.f153152o || C61134g.this.f153153p) {
                    C61134g.this.mo211424c();
                } else {
                    C61134g.this.mo211426e();
                }
            }

            /* access modifiers changed from: private */
            /* access modifiers changed from: public */
            /* renamed from: b */
            private /* synthetic */ void m237765b(PullVCCardInfoEntity pullVCCardInfoEntity) {
                if (!C61134g.this.f153152o) {
                    C61134g.this.f153149l.mo211415a();
                    C61134g.this.f153152o = true;
                }
                C61134g.this.f153149l.mo211417a(pullVCCardInfoEntity.content);
                C61134g.this.mo211425d();
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235864f("MeetingCardAttendeeView", "[pullVCCardInfo]", "err " + eVar.toString());
                C60735ab.m236001a(new Runnable() {
                    /* class com.ss.android.vc.lark.message.meeting.cardview.attendee.$$Lambda$g$5$cGpbLro62sTHLOwTQtcO2kAAFMw */

                    public final void run() {
                        C61134g.C611395.this.m237764a();
                    }
                });
            }

            /* renamed from: a */
            public void onSuccess(PullVCCardInfoEntity pullVCCardInfoEntity) {
                C61134g.this.f153145h.mo96416n();
                C61134g.this.f153154q = false;
                C60700b.m235851b("MeetingCardAttendeeView", "[loadData2]", "[pullVCCardInfo] success " + pullVCCardInfoEntity.toString());
                if (pullVCCardInfoEntity != null) {
                    C61134g.this.f153151n = pullVCCardInfoEntity.isMore;
                    C61134g.this.f153150m = pullVCCardInfoEntity.nextRequestToken;
                    C60735ab.m236001a(new Runnable(pullVCCardInfoEntity) {
                        /* class com.ss.android.vc.lark.message.meeting.cardview.attendee.$$Lambda$g$5$yR0GvFDgh3J3XNYT13GVhGdKKI */
                        public final /* synthetic */ PullVCCardInfoEntity f$1;

                        {
                            this.f$1 = r2;
                        }

                        public final void run() {
                            C61134g.C611395.this.m237765b(this.f$1);
                        }
                    });
                }
            }
        });
    }

    /* renamed from: e */
    public void mo211426e() {
        C60700b.m235851b("MeetingCardAttendeeView", "[showCenterRetry]", "showCenterRetry");
        this.f153147j.setVisibility(0);
        String string = UIHelper.getString(R.string.View_G_CouldNotLoadTryReloading);
        Matcher matcher = Pattern.compile("@@.*?@@").matcher(string);
        String str = string;
        int i = 0;
        int i2 = 0;
        while (matcher.find()) {
            String group = matcher.group();
            String substring = string.substring(matcher.start() + 2, matcher.end() - 2);
            str = string.replace(group, substring);
            int start = matcher.start();
            i2 = substring.length() + start;
            i = start;
        }
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new C61141a(new OnSingleClickListener() {
            /* class com.ss.android.vc.lark.message.meeting.cardview.attendee.C61134g.C611406 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                C61134g.this.f153145h.mo96431t();
            }
        }), i, i2, 33);
        this.f153148k.setText(spannableString);
        this.f153148k.setTextColor(C60773o.m236126d(R.color.text_caption));
        this.f153148k.setTextSize(1, 14.0f);
        this.f153148k.setMovementMethod(LinkMovementMethod.getInstance());
        this.f153148k.setHighlightColor(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.vc.lark.message.meeting.cardview.attendee.g$a */
    public static final class C61141a extends ClickableSpan {

        /* renamed from: a */
        private final OnSingleClickListener f153164a;

        private C61141a(OnSingleClickListener onSingleClickListener) {
            this.f153164a = onSingleClickListener;
        }

        public void onClick(View view) {
            OnSingleClickListener onSingleClickListener = this.f153164a;
            if (onSingleClickListener != null) {
                onSingleClickListener.onSingleClick(view);
            }
        }

        public void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(C60773o.m236126d(R.color.text_link_normal));
            textPaint.setUnderlineText(false);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m237751a(AbstractC27129h hVar) {
        C60735ab.m236001a(new Runnable() {
            /* class com.ss.android.vc.lark.message.meeting.cardview.attendee.$$Lambda$JuWN_JYTQW3CvCYE10lPstULgjM */

            public final void run() {
                C61134g.this.mo211425d();
            }
        });
        C60735ab.m236002a(new Runnable() {
            /* class com.ss.android.vc.lark.message.meeting.cardview.attendee.$$Lambda$ZvzdHSFqkhKaG66ABWQAP3SPvLA */

            public final void run() {
                C61134g.this.mo211423b();
            }
        }, 500);
    }

    public C61134g(Activity activity, C61130f.AbstractC61133a aVar) {
        super(activity, aVar);
    }

    @Override // com.ss.android.vc.lark.message.meeting.cardview.attendee.C61130f, com.ss.android.vc.lark.message.meeting.cardview.attendee.C61116b.AbstractC61118b
    /* renamed from: a */
    public void mo211412a(String str, String str2, List<String> list, List<ParticipantType> list2, List<Participant.DeviceType> list3, List<Boolean> list4, List<Boolean> list5, String str3, final AttendeeFromSource attendeeFromSource, boolean z, long j, String str4) {
        C60700b.m235851b("MeetingCardAttendeeView", "[setData]", "meetingId is " + str + ", isOldCardData = " + z + ", mChatId = " + this.f153156s);
        this.f153155r = str;
        this.f153156s = str4;
        if (!z) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                if (UserInfoService.getUserInfoInCache(list.get(i), list2.get(i)) != null) {
                    arrayList.add(list.get(i));
                    arrayList2.add(list2.get(i));
                    arrayList3.add(list4.get(i));
                    arrayList4.add(list3.get(i));
                    arrayList5.add(list5.get(i));
                }
            }
            if (C13657b.m55421a(arrayList)) {
                this.f153153p = false;
                mo211426e();
                this.f153149l = new C61120c(this.f153135c, str, str3, attendeeFromSource);
            } else {
                this.f153146i.setTitle(UIHelper.mustacheFormat((int) R.string.View_M_ParticipantsNumberBraces, "number", String.valueOf(j)));
                C61120c cVar = new C61120c(this.f153135c, str, arrayList, arrayList2, arrayList3, arrayList4, arrayList5, str3, attendeeFromSource);
                this.f153149l = cVar;
                cVar.mo211416a(new OnSingleClickListener() {
                    /* class com.ss.android.vc.lark.message.meeting.cardview.attendee.C61134g.C611373 */

                    @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                    public void onSingleClick(View view) {
                        C61134g.this.mo211423b();
                    }
                });
                C60735ab.m236001a(new Runnable() {
                    /* class com.ss.android.vc.lark.message.meeting.cardview.attendee.$$Lambda$ZvzdHSFqkhKaG66ABWQAP3SPvLA */

                    public final void run() {
                        C61134g.this.mo211423b();
                    }
                });
            }
        } else if (list != null && list.size() > 0) {
            this.f153146i.setTitle(UIHelper.mustacheFormat((int) R.string.View_M_ParticipantsNumberBraces, "number", String.valueOf(list.size())));
            this.f153149l = new C61120c(this.f153135c, str, list, list2, list4, list3, list5, str3, attendeeFromSource);
        }
        C61120c cVar2 = this.f153149l;
        if (cVar2 != null) {
            cVar2.mo211418a(new C61120c.AbstractC61124b() {
                /* class com.ss.android.vc.lark.message.meeting.cardview.attendee.C61134g.C611384 */

                @Override // com.ss.android.vc.lark.message.meeting.cardview.attendee.C61120c.AbstractC61124b
                /* renamed from: a */
                public void mo211420a(String str) {
                    if (attendeeFromSource == AttendeeFromSource.VC_TAB_ATTENDEE) {
                        ce.m250275h();
                    }
                    C61134g.this.f153137e.mo211414a(str);
                }
            });
            this.f153144g.setAdapter(this.f153149l);
        }
    }
}
