package com.ss.android.vc.meeting.module.chat;

import android.app.Activity;
import android.content.Context;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.ChatWindowPtrLoadingHeader;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2;
import com.ss.android.lark.widget.ptr.LKUIPtrFrameLayout;
import com.ss.android.lark.widget.recyclerview.C58996h;
import com.ss.android.lark.widget.recyclerview.RecyclerViewScrollDetector;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60762k;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.p3083e.C60776r;
import com.ss.android.vc.common.widget.IconFontView;
import com.ss.android.vc.meeting.basedialog.AbstractC61222a;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.chat.VcChatLayout;
import com.ss.android.vc.meeting.module.follow.common.VCShadowLayout;
import com.ss.android.vc.meeting.module.multi.ByteRTCMeetingActivity;
import com.ss.android.vc.meeting.module.reaction.entity.InteractionMessage;
import com.ss.android.vc.meeting.module.reaction.widget.keyboard.RichTextEmojiconEditText;
import com.ss.android.vc.statistics.event.VideoChatIMEvent;
import com.ss.android.vc.statistics.event2.MeetingChatSendMsgEvent;
import java.util.ArrayList;

/* renamed from: com.ss.android.vc.meeting.module.chat.h */
public class C61586h {

    /* renamed from: a */
    public C61303k f154501a;

    /* renamed from: b */
    public LKUIPtrFrameLayout f154502b;

    /* renamed from: c */
    public RichTextEmojiconEditText f154503c;

    /* renamed from: d */
    public View f154504d;

    /* renamed from: e */
    public IconFontView f154505e;

    /* renamed from: f */
    public VCShadowLayout f154506f;

    /* renamed from: g */
    public C61596j f154507g;

    /* renamed from: h */
    public boolean f154508h;

    /* renamed from: i */
    private Activity f154509i;

    /* renamed from: j */
    private AbstractC61222a f154510j;

    /* renamed from: k */
    private View f154511k;

    /* renamed from: l */
    private VcChatLayout f154512l;

    /* renamed from: m */
    private View f154513m;

    /* renamed from: n */
    private IconFontView f154514n;

    /* renamed from: o */
    private IconFontView f154515o;

    /* renamed from: p */
    private TextView f154516p;

    /* renamed from: q */
    private RecyclerView f154517q;

    /* renamed from: r */
    private TextView f154518r;

    /* renamed from: s */
    private LinearLayoutManager f154519s;

    /* renamed from: t */
    private View f154520t;

    /* renamed from: u */
    private C60762k f154521u;

    /* renamed from: f */
    public void mo213435f() {
        mo213431b();
    }

    /* renamed from: r */
    private void m240440r() {
        this.f154520t.setVisibility(8);
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public /* synthetic */ void m240446x() {
        this.f154502b.refreshComplete();
    }

    /* renamed from: g */
    public void mo213436g() {
        m240432a(false);
    }

    /* renamed from: j */
    public boolean mo213439j() {
        return C58996h.m228977a(this.f154517q);
    }

    /* renamed from: a */
    public void mo213427a() {
        C60700b.m235851b("ChatViewHolder", "[hideKeyboard]", "hide keyboard");
        KeyboardUtils.hideKeyboard(this.f154509i);
    }

    /* renamed from: e */
    public void mo213434e() {
        this.f154506f.setVisibility(8);
        this.f154504d.setVisibility(8);
    }

    /* renamed from: h */
    public boolean mo213437h() {
        return this.f154501a.mo212105W().mo212840s().mo213377f();
    }

    /* renamed from: i */
    public boolean mo213438i() {
        return this.f154501a.mo212105W().mo212840s().mo213376e();
    }

    /* renamed from: m */
    public void mo213442m() {
        C60700b.m235851b("ChatViewHolder", "[refreshToBottom]", "auto scroll to bottom");
        C58996h.m228980b(this.f154517q, true);
    }

    /* renamed from: q */
    private void m240439q() {
        this.f154512l.setDispatchTouchEventListener(new VcChatLayout.AbstractC61565a() {
            /* class com.ss.android.vc.meeting.module.chat.C61586h.C615904 */

            /* renamed from: a */
            float f154525a;

            /* renamed from: b */
            float f154526b;

            /* renamed from: c */
            boolean f154527c;

            @Override // com.ss.android.vc.meeting.module.chat.VcChatLayout.AbstractC61565a
            /* renamed from: a */
            public boolean mo213361a(MotionEvent motionEvent) {
                if (!C61586h.this.f154508h) {
                    return false;
                }
                int action = motionEvent.getAction();
                if (action == 0) {
                    this.f154525a = motionEvent.getX();
                    this.f154526b = motionEvent.getY();
                    this.f154527c = true;
                } else if (action == 1) {
                    if (this.f154527c) {
                        float x = motionEvent.getX();
                        float y = motionEvent.getY();
                        if (Math.abs(x - this.f154525a) > 1.0f || Math.abs(y - this.f154526b) > 1.0f) {
                            C61586h.this.mo213427a();
                        }
                    }
                    this.f154527c = false;
                } else if (action != 2) {
                    this.f154527c = false;
                } else if (this.f154527c) {
                    float x2 = motionEvent.getX();
                    float y2 = motionEvent.getY();
                    if (Math.abs(x2 - this.f154525a) > 1.0f || Math.abs(y2 - this.f154526b) > 1.0f) {
                        C61586h.this.mo213427a();
                        this.f154527c = false;
                    }
                }
                return false;
            }
        });
        this.f154513m.setOnTouchListener(new View.OnTouchListener() {
            /* class com.ss.android.vc.meeting.module.chat.C61586h.View$OnTouchListenerC615915 */

            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() != 0 || !C61586h.this.f154508h) {
                    return false;
                }
                C61586h.this.mo213427a();
                return false;
            }
        });
    }

    /* renamed from: v */
    private void m240444v() {
        if (mo213437h() && this.f154502b != null) {
            C60700b.m235851b("ChatViewHolder", "[preloadNextPage]", "preload next page");
            this.f154502b.autoLoadMore();
        }
    }

    /* renamed from: d */
    public void mo213433d() {
        C60762k kVar = new C60762k(this.f154509i);
        this.f154521u = kVar;
        kVar.mo208369a(new C60762k.AbstractC60764a() {
            /* class com.ss.android.vc.meeting.module.chat.$$Lambda$h$GYzWl5bHvBWzLJo635U4s9mWJHg */

            @Override // com.ss.android.vc.common.p3083e.C60762k.AbstractC60764a
            public final void onKeyboardStateChanged(boolean z, int i) {
                C61586h.this.m240433a((C61586h) z, (boolean) i);
            }
        });
    }

    /* renamed from: k */
    public void mo213440k() {
        C60700b.m235851b("ChatViewHolder", "[scrollToBottom]", "scroll to bottom");
        C58996h.m228980b(this.f154517q, true);
        mo213436g();
        m240444v();
    }

    /* renamed from: l */
    public void mo213441l() {
        C60700b.m235851b("ChatViewHolder", "[autoScrollToBottom]", "auto scroll to bottom");
        C58996h.m228980b(this.f154517q, true);
        m240432a(true);
        m240444v();
    }

    /* renamed from: s */
    private void m240441s() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f154509i, 1, false);
        this.f154519s = linearLayoutManager;
        this.f154517q.setLayoutManager(linearLayoutManager);
        C61596j jVar = new C61596j(this.f154501a);
        this.f154507g = jVar;
        this.f154517q.setAdapter(jVar);
        if (((SimpleItemAnimator) this.f154517q.getItemAnimator()) != null) {
            ((SimpleItemAnimator) this.f154517q.getItemAnimator()).setSupportsChangeAnimations(false);
        }
    }

    /* renamed from: p */
    private void m240438p() {
        String mustacheFormat = UIHelper.mustacheFormat((int) R.string.View_G_MessageMeetingTitle, "meetingTitle", this.f154501a.mo212056e().getVideoChatSettings().getTopic());
        if (TextUtils.isEmpty(this.f154501a.mo212105W().mo212840s().mo213382k())) {
            this.f154503c.setHint(m240430a(mustacheFormat));
        } else {
            this.f154503c.setText(this.f154501a.mo212105W().mo212840s().mo213382k());
        }
        this.f154503c.addTextChangedListener(new TextWatcher() {
            /* class com.ss.android.vc.meeting.module.chat.C61586h.C615871 */

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void afterTextChanged(Editable editable) {
                if (TextUtils.isEmpty(editable.toString().trim())) {
                    C61586h.this.f154505e.setTextColor(C60773o.m236126d(R.color.primary_pri_300));
                } else {
                    C61586h.this.f154505e.setTextColor(C60773o.m236126d(R.color.primary_pri_500));
                }
            }
        });
        this.f154503c.setOnTouchListener(new View.OnTouchListener() {
            /* class com.ss.android.vc.meeting.module.chat.C61586h.View$OnTouchListenerC615882 */

            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (C61586h.this.f154508h) {
                    return false;
                }
                int action = motionEvent.getAction();
                if (action == 0) {
                    C60700b.m235851b("ChatViewHolder", "[onTouch]", "chat input action down");
                    return false;
                } else if (action != 1) {
                    return false;
                } else {
                    C60700b.m235851b("ChatViewHolder", "[onTouch]", "chat input action up");
                    return false;
                }
            }
        });
        this.f154505e.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.vc.meeting.module.chat.C61586h.C615893 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                if (!TextUtils.isEmpty(C61586h.this.f154503c.getText().toString().trim())) {
                    VideoChatIMEvent.m250259a(C61586h.this.f154501a.mo212056e());
                    C61586h.this.f154501a.mo212105W().mo212840s().mo213366a(C61586h.this.f154503c.getRichText());
                    C61586h.this.f154503c.setText("");
                    C61586h.this.mo213440k();
                    MeetingChatSendMsgEvent.m249797a(C61586h.this.f154501a, "send_message");
                }
            }
        });
        if (!DesktopUtil.m144301a((Context) this.f154509i)) {
            mo213433d();
        }
    }

    /* renamed from: t */
    private void m240442t() {
        ChatWindowPtrLoadingHeader chatWindowPtrLoadingHeader = new ChatWindowPtrLoadingHeader(this.f154509i);
        ChatWindowPtrLoadingHeader chatWindowPtrLoadingHeader2 = new ChatWindowPtrLoadingHeader(this.f154509i);
        this.f154502b.setHeaderView(chatWindowPtrLoadingHeader);
        this.f154502b.setFooterView(chatWindowPtrLoadingHeader2);
        this.f154502b.addPtrUIHandler(chatWindowPtrLoadingHeader);
        this.f154502b.addPtrUIHandler(chatWindowPtrLoadingHeader2);
        this.f154502b.setForceBackWhenComplete(true);
        this.f154502b.disableWhenHorizontalMove(true);
        this.f154502b.setPtrHandler(new LKUIPtrDefaultHandler2() {
            /* class com.ss.android.vc.meeting.module.chat.C61586h.C615926 */

            @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler2
            public void onLoadMoreBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
                C61586h.this.f154501a.mo212105W().mo212840s().mo213375c();
            }

            @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler
            public void onRefreshBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
                C61586h.this.f154501a.mo212105W().mo212840s().mo213362a();
            }

            @Override // com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2, com.ss.android.lark.widget.ptr.LKUIPtrHandler2
            public boolean checkCanDoLoadMore(LKUIPtrFrameLayout lKUIPtrFrameLayout, View view, View view2) {
                if (!super.checkCanDoLoadMore(lKUIPtrFrameLayout, view, view2) || !C61586h.this.mo213437h()) {
                    return false;
                }
                return true;
            }

            @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler, com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler
            public boolean checkCanDoRefresh(LKUIPtrFrameLayout lKUIPtrFrameLayout, View view, View view2) {
                if (!super.checkCanDoRefresh(lKUIPtrFrameLayout, view, view2) || !C61586h.this.mo213438i()) {
                    return false;
                }
                return true;
            }
        });
        this.f154517q.addOnScrollListener(new RecyclerViewScrollDetector() {
            /* class com.ss.android.vc.meeting.module.chat.C61586h.C615937 */

            @Override // com.ss.android.lark.widget.recyclerview.RecyclerViewScrollDetector
            public void onScrollStop(int i, int i2) {
            }

            @Override // com.ss.android.lark.widget.recyclerview.RecyclerViewScrollDetector
            public void onScrollToBottom() {
                if (!C61586h.this.mo213437h()) {
                    C61586h.this.f154506f.setVisibility(8);
                    C61586h.this.f154504d.setVisibility(8);
                }
                C61586h.this.mo213434e();
            }

            @Override // com.ss.android.lark.widget.recyclerview.RecyclerViewScrollDetector, androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                super.onScrollStateChanged(recyclerView, i);
            }

            @Override // com.ss.android.lark.widget.recyclerview.RecyclerViewScrollDetector
            public void onScrollPassed(int i, int i2) {
                if (i <= 5 && C61586h.this.mo213438i()) {
                    C61586h.this.f154502b.autoRefresh();
                }
                if (i2 >= C61586h.this.f154507g.getItemCount() - 5 && C61586h.this.mo213437h()) {
                    C61586h.this.f154502b.autoLoadMore();
                }
                C61586h.this.mo213436g();
            }
        });
    }

    /* renamed from: w */
    private void m240445w() {
        int i;
        C60700b.m235851b("ChatViewHolder", "[pullAndScrollToBottom]", "scroll to latest message");
        int i2 = this.f154501a.as().mo213380i() + this.f154501a.as().mo213379h();
        if (this.f154507g.getItemCount() >= 1) {
            C61596j jVar = this.f154507g;
            i = jVar.mo213450a(jVar.getItemCount() - 1).mo216919e();
        } else {
            i = 0;
        }
        if (i2 > i) {
            this.f154501a.as().mo213371a(true);
            this.f154501a.as().mo213381j();
        } else {
            C58996h.m228980b(this.f154517q, true);
        }
        mo213434e();
        this.f154501a.as().mo213363a(i2);
        m240444v();
    }

    /* renamed from: c */
    public void mo213432c() {
        RichTextEmojiconEditText richTextEmojiconEditText = this.f154503c;
        if (richTextEmojiconEditText == null || TextUtils.isEmpty(richTextEmojiconEditText.getText()) || TextUtils.isEmpty(this.f154503c.getText().toString()) || TextUtils.isEmpty(this.f154503c.getText().toString().trim())) {
            this.f154501a.mo212105W().mo212840s().mo213369a("");
        } else {
            this.f154501a.mo212105W().mo212840s().mo213369a(this.f154503c.getText().toString());
        }
    }

    /* renamed from: o */
    private void m240437o() {
        C60700b.m235851b("ChatViewHolder", "[initView]", "chat view");
        this.f154512l = (VcChatLayout) this.f154511k.findViewById(R.id.chat_panel);
        this.f154513m = this.f154511k.findViewById(R.id.chat_header);
        IconFontView iconFontView = (IconFontView) this.f154511k.findViewById(R.id.icon_close);
        this.f154514n = iconFontView;
        iconFontView.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.chat.$$Lambda$h$vsr_4mGf_X96T9HzCDv9qzXuR4 */

            public final void onClick(View view) {
                C61586h.this.m240436c(view);
            }
        });
        this.f154516p = (TextView) this.f154511k.findViewById(R.id.chat_title);
        this.f154517q = (RecyclerView) this.f154511k.findViewById(R.id.chat_list);
        this.f154502b = (LKUIPtrFrameLayout) this.f154511k.findViewById(R.id.chat_ptr);
        this.f154518r = (TextView) this.f154511k.findViewById(R.id.message_tip);
        this.f154515o = (IconFontView) this.f154511k.findViewById(R.id.down_icon);
        this.f154503c = (RichTextEmojiconEditText) this.f154511k.findViewById(R.id.chat_input);
        this.f154505e = (IconFontView) this.f154511k.findViewById(R.id.icon_send);
        this.f154504d = this.f154511k.findViewById(R.id.bottom_action_container);
        this.f154506f = (VCShadowLayout) this.f154511k.findViewById(R.id.bottom_action_shadow_layout);
        this.f154520t = this.f154511k.findViewById(R.id.soft_keyboard_padding);
        ((ByteRTCMeetingActivity) this.f154509i).mo212781h().mo214617b();
        m240438p();
        m240439q();
        m240442t();
        m240441s();
        this.f154501a.mo212105W().mo212840s().mo213367a(this);
    }

    /* renamed from: u */
    private void m240443u() {
        if (mo213439j()) {
            mo213434e();
            return;
        }
        int i = this.f154501a.mo212105W().mo212840s().mo213380i();
        this.f154506f.setVisibility(0);
        this.f154504d.setVisibility(0);
        C60700b.m235851b("ChatViewHolder", "[showBottomAction]", "unreadCount = " + i);
        if (i >= 1) {
            this.f154518r.setText(UIHelper.mustacheFormat(C60773o.m236119a((int) R.string.View_M_NewMessagesNumber), "number", Integer.toString(i)));
            this.f154518r.setTextColor(C60773o.m236126d(R.color.static_white));
            this.f154515o.setTextColor(C60773o.m236126d(R.color.static_white));
            this.f154504d.setBackground(C60773o.m236128f(R.drawable.bg_chat_bottom_bar_b500));
            this.f154506f.setShadowColor(C60773o.m236126d(R.color.shadow_pri_lg));
            this.f154504d.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.vc.meeting.module.chat.$$Lambda$h$a6CJJdVCT8SFU_mnauJkU3UEEuw */

                public final void onClick(View view) {
                    C61586h.this.m240435b((C61586h) view);
                }
            });
            return;
        }
        this.f154518r.setText(UIHelper.getString(R.string.View_G_BackToBottom));
        this.f154518r.setTextColor(C60773o.m236126d(R.color.primary_pri_500));
        this.f154515o.setTextColor(C60773o.m236126d(R.color.primary_pri_500));
        this.f154504d.setBackground(C60773o.m236128f(R.drawable.bg_back_to_bottom));
        this.f154506f.setShadowColor(C60773o.m236126d(R.color.shadow_default_md));
        this.f154504d.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.chat.$$Lambda$h$a3m0wFcxdhfEZArOYfji1vADq4 */

            public final void onClick(View view) {
                C61586h.this.m240431a((C61586h) view);
            }
        });
    }

    /* renamed from: b */
    public void mo213431b() {
        C60700b.m235851b("ChatViewHolder", "[dismissView]", "dismiss chat view");
        mo213427a();
        if ((this.f154509i instanceof ByteRTCMeetingActivity) && this.f154501a.as().mo213384n()) {
            this.f154501a.as().mo213374b(false);
            if (this.f154501a.ab().mo213882h() != null && !TextUtils.isEmpty(this.f154501a.ab().mo213882h().getUrl()) && this.f154501a.ab().mo213882h().isLandscapeFollow()) {
                if (((ByteRTCMeetingActivity) this.f154509i).mo215865z() != null) {
                    ((ByteRTCMeetingActivity) this.f154509i).mo215865z().mo216099F();
                }
            } else {
                return;
            }
        }
        C60762k kVar = this.f154521u;
        if (kVar != null) {
            kVar.mo208368a();
        }
        mo213436g();
        AbstractC61222a aVar = this.f154510j;
        if (aVar != null) {
            aVar.dismiss();
        } else {
            mo213432c();
        }
    }

    /* renamed from: n */
    public void mo213443n() {
        int g = this.f154501a.mo212105W().mo212840s().mo213378g();
        if (g <= -1) {
            int i = this.f154501a.mo212105W().mo212840s().mo213380i();
            C60700b.m235851b("ChatViewHolder", "[scrollToNewest]", "scroll: unreadCount is " + i);
            if (i > 0) {
                int h = this.f154501a.mo212105W().mo212840s().mo213379h();
                if (h <= -1 || this.f154507g.getItemCount() <= 0) {
                    mo213436g();
                    return;
                }
                int e = h - this.f154507g.mo213450a(0).mo216919e();
                if (e == this.f154507g.getItemCount() - 1) {
                    mo213441l();
                    return;
                }
                C60700b.m235851b("ChatViewHolder", "[scrollToNewest2]", "scroll to position: " + e);
                C58996h.m228979b(this.f154517q, e, UIHelper.dp2px(-13.0f));
                mo213436g();
                return;
            }
            mo213441l();
            return;
        }
        C60700b.m235851b("ChatViewHolder", "[scrollToNewest3]", "scroll to last record position");
        int e2 = g - this.f154507g.mo213450a(0).mo216919e();
        if (e2 < 0 || e2 >= this.f154507g.getItemCount() - 1) {
            mo213441l();
            return;
        }
        C60700b.m235851b("ChatViewHolder", "[scrollToNewest4]", "scroll to position: " + e2);
        C58996h.m228979b(this.f154517q, e2, UIHelper.dp2px(-13.0f));
        mo213436g();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m240431a(View view) {
        mo213440k();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m240435b(View view) {
        m240445w();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m240436c(View view) {
        C60700b.m235851b("ChatViewHolder", "[onClick]", "click close icon");
        mo213435f();
    }

    /* renamed from: b */
    private void m240434b(int i) {
        ViewGroup.LayoutParams layoutParams = this.f154520t.getLayoutParams();
        layoutParams.height = i;
        this.f154520t.setLayoutParams(layoutParams);
        this.f154520t.setVisibility(0);
        mo213440k();
    }

    /* renamed from: a */
    private String m240430a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        TextPaint paint = this.f154503c.getPaint();
        float a = (float) (C60776r.m236139a() - UIHelper.dp2px(68.0f));
        if (paint.measureText(str) < a) {
            return str;
        }
        int length = str.length();
        float measureText = paint.measureText("...");
        while (length > 0 && paint.measureText(str, 0, length) + measureText > a) {
            length--;
        }
        return str.substring(0, length) + "...";
    }

    /* renamed from: a */
    private void m240432a(boolean z) {
        int findFirstVisibleItemPosition = this.f154519s.findFirstVisibleItemPosition();
        int findLastCompletelyVisibleItemPosition = this.f154519s.findLastCompletelyVisibleItemPosition();
        if (findFirstVisibleItemPosition >= 0) {
            if (findLastCompletelyVisibleItemPosition == this.f154507g.getItemCount() - 1) {
                findFirstVisibleItemPosition = findLastCompletelyVisibleItemPosition;
            }
            if (findFirstVisibleItemPosition < this.f154507g.getItemCount()) {
                this.f154501a.mo212105W().mo212840s().mo213363a(this.f154507g.mo213450a(findFirstVisibleItemPosition).mo216919e());
            }
        }
        int findLastVisibleItemPosition = this.f154519s.findLastVisibleItemPosition();
        if (findLastVisibleItemPosition < 0 || findLastVisibleItemPosition >= this.f154507g.getItemCount()) {
            m240443u();
            return;
        }
        this.f154501a.mo212105W().mo212840s().mo213364a(this.f154507g.mo213450a(findLastVisibleItemPosition).mo216919e(), z);
    }

    /* renamed from: a */
    public void mo213428a(int i) {
        if (i > 0) {
            this.f154502b.postDelayed(new Runnable() {
                /* class com.ss.android.vc.meeting.module.chat.$$Lambda$h$ishgdgUtnegPL9XJsUyZA8AQmE */

                public final void run() {
                    C61586h.this.m240446x();
                }
            }, (long) i);
        } else {
            this.f154502b.refreshComplete();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m240433a(boolean z, int i) {
        C60700b.m235851b("ChatViewHolder", "[OnKeyboardStateChanged]", "keyboard is shown = " + z + ", height = " + i);
        if (z) {
            m240434b(i);
            this.f154508h = true;
            return;
        }
        m240440r();
        this.f154508h = false;
    }

    /* renamed from: a */
    public void mo213429a(int i, boolean z) {
        if (i > 0 || !z) {
            m240443u();
        } else {
            mo213434e();
        }
    }

    /* renamed from: a */
    public void mo213430a(ArrayList<InteractionMessage> arrayList, final ChatMoveDirection chatMoveDirection) {
        this.f154507g.mo213451a(arrayList);
        C60735ab.m236002a(new Runnable() {
            /* class com.ss.android.vc.meeting.module.chat.C61586h.RunnableC615948 */

            public void run() {
                if (chatMoveDirection == ChatMoveDirection.MOVE_DOWN) {
                    if (C61586h.this.f154501a.as().mo213380i() <= 0) {
                        C61586h.this.mo213442m();
                    } else {
                        C61586h.this.mo213441l();
                    }
                } else if (chatMoveDirection == ChatMoveDirection.MOVE_NEWEST) {
                    C61586h.this.mo213443n();
                }
            }
        }, 200);
    }

    /* renamed from: a */
    public View mo213426a(Context context, C61303k kVar, AbstractC61222a aVar) {
        this.f154509i = C60773o.m236124b(context);
        this.f154510j = aVar;
        this.f154501a = kVar;
        this.f154511k = LayoutInflater.from(context).inflate(R.layout.chat_dialog, (ViewGroup) null, false);
        m240437o();
        return this.f154511k;
    }
}
