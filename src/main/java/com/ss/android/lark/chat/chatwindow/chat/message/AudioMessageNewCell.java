package com.ss.android.lark.chat.chatwindow.chat.message;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.ui.display.manager.C25649b;
import com.larksuite.component.ui.display.manager.LKUIDisplayManager;
import com.larksuite.component.ui.display.manager.LarkFont;
import com.larksuite.component.ui.layout.LKUIRoundableLayout;
import com.larksuite.framework.ui.BasePopupWindow;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.base.view.vo.message.AudioContentVO;
import com.ss.android.lark.chat.base.view.vo.message.TranslatableContentVO;
import com.ss.android.lark.chat.chatwindow.chat.message.AudioMessageNewCell;
import com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33293c;
import com.ss.android.lark.chat.chatwindow.chat.message.p1631f.p1633b.C33360a;
import com.ss.android.lark.chat.entity.message.content.AudioContent;
import com.ss.android.lark.chat.utils.C34357v;
import com.ss.android.lark.chat.utils.MessageCellUtils;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.chatbase.view.C34443a;
import com.ss.android.lark.dependency.AbstractC36502p;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.keyboard.plugin.tool.voice.statistics.AppreciablePerformance;
import com.ss.android.lark.p1786d.C36443k;
import com.ss.android.lark.p1820e.C36913c;
import com.ss.android.lark.p1820e.p1821a.C36894a;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.statistics.message.MessageHitPoint;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.audioview.AbstractC58321a;
import com.ss.android.lark.widget.lark_chat_keyboard.widget.AudioWaveBar;
import com.ss.android.lark.widget.lark_chat_keyboard.widget.PlayControlBar;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e;
import java.util.ArrayList;

public class AudioMessageNewCell extends AbstractC33290a<AudioContentVO, AudioMessageViewHolder> {

    /* renamed from: a */
    public final AbstractC33293c f85594a;

    /* renamed from: b */
    public AudioWaveBar f85595b;

    /* renamed from: c */
    public BasePopupWindow f85596c;

    /* renamed from: e */
    private final AbstractC36502p f85597e = C29990c.m110930b().af();

    /* renamed from: g */
    private final boolean f85598g;

    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: c */
    public int mo122651c() {
        return R.layout.audio_content_item_layout;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: a */
    public Class mo122646a() {
        return AudioContentVO.class;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: b */
    public Class<AudioMessageViewHolder> mo122650b() {
        return AudioMessageViewHolder.class;
    }

    public class AudioMessageViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private AudioMessageViewHolder f85618a;

        @Override // butterknife.Unbinder
        public void unbind() {
            AudioMessageViewHolder audioMessageViewHolder = this.f85618a;
            if (audioMessageViewHolder != null) {
                this.f85618a = null;
                audioMessageViewHolder.mUnreadTipsIv = null;
                audioMessageViewHolder.mEditedTv = null;
                audioMessageViewHolder.mRecognizedTv = null;
                audioMessageViewHolder.mRecognizedFlag = null;
                audioMessageViewHolder.mPlayControlBar = null;
                audioMessageViewHolder.mAudioView = null;
                audioMessageViewHolder.mAudioViewContainer = null;
                audioMessageViewHolder.mTranslateStub = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public AudioMessageViewHolder_ViewBinding(AudioMessageViewHolder audioMessageViewHolder, View view) {
            this.f85618a = audioMessageViewHolder;
            audioMessageViewHolder.mUnreadTipsIv = (ImageView) Utils.findRequiredViewAsType(view, R.id.unread_tip_iv, "field 'mUnreadTipsIv'", ImageView.class);
            audioMessageViewHolder.mEditedTv = (TextView) Utils.findRequiredViewAsType(view, R.id.edited_text_tv, "field 'mEditedTv'", TextView.class);
            audioMessageViewHolder.mRecognizedTv = (TextView) Utils.findRequiredViewAsType(view, R.id.recognized_text_tv, "field 'mRecognizedTv'", TextView.class);
            audioMessageViewHolder.mRecognizedFlag = (TextView) Utils.findRequiredViewAsType(view, R.id.recognized_text_flag, "field 'mRecognizedFlag'", TextView.class);
            audioMessageViewHolder.mPlayControlBar = (PlayControlBar) Utils.findRequiredViewAsType(view, R.id.play_cb, "field 'mPlayControlBar'", PlayControlBar.class);
            audioMessageViewHolder.mAudioView = Utils.findRequiredView(view, R.id.audio_view, "field 'mAudioView'");
            audioMessageViewHolder.mAudioViewContainer = (LKUIRoundableLayout) Utils.findRequiredViewAsType(view, R.id.audio_view_container, "field 'mAudioViewContainer'", LKUIRoundableLayout.class);
            audioMessageViewHolder.mTranslateStub = (ViewStub) Utils.findRequiredViewAsType(view, R.id.text_translate_content, "field 'mTranslateStub'", ViewStub.class);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.message.AudioMessageNewCell$a */
    public class C33262a implements C36894a.AbstractC36896a {

        /* renamed from: a */
        final AbstractC58321a f85619a;

        /* renamed from: b */
        final Handler f85620b = new Handler(Looper.getMainLooper());

        /* renamed from: c */
        final String f85621c;

        /* renamed from: f */
        private boolean m128653f() {
            return this.f85621c.equals((String) this.f85619a.getTag(R.id.audio_message_id_tag));
        }

        @Override // com.ss.android.lark.p1820e.p1821a.C36894a.AbstractC36896a
        /* renamed from: b */
        public void mo122675b() {
            if (m128653f()) {
                Handler handler = this.f85620b;
                AbstractC58321a aVar = this.f85619a;
                aVar.getClass();
                handler.post(new Runnable() {
                    /* class com.ss.android.lark.chat.chatwindow.chat.message.$$Lambda$2iJNJbGriVfkLe7XmtCay75Vvs */

                    public final void run() {
                        AbstractC58321a.this.mo136736c();
                    }
                });
            }
        }

        @Override // com.ss.android.lark.p1820e.p1821a.C36894a.AbstractC36896a
        /* renamed from: c */
        public void mo122676c() {
            if (m128653f()) {
                Handler handler = this.f85620b;
                AbstractC58321a aVar = this.f85619a;
                aVar.getClass();
                handler.post(new Runnable() {
                    /* class com.ss.android.lark.chat.chatwindow.chat.message.$$Lambda$ptZG4jpfHWxUa7Yd_7P5Atr0RzQ */

                    public final void run() {
                        AbstractC58321a.this.mo136737d();
                    }
                });
            }
        }

        @Override // com.ss.android.lark.p1820e.p1821a.C36894a.AbstractC36896a
        /* renamed from: d */
        public void mo122677d() {
            if (m128653f()) {
                Handler handler = this.f85620b;
                AbstractC58321a aVar = this.f85619a;
                aVar.getClass();
                handler.post(new Runnable() {
                    /* class com.ss.android.lark.chat.chatwindow.chat.message.$$Lambda$3vNJatTB3UQjaGXXjk9G1y0S54 */

                    public final void run() {
                        AbstractC58321a.this.mo136735b();
                    }
                });
            }
        }

        @Override // com.ss.android.lark.p1820e.p1821a.C36894a.AbstractC36896a
        /* renamed from: e */
        public void mo122678e() {
            if (m128653f()) {
                AppreciablePerformance.f104480a.mo147937a(2);
                Handler handler = this.f85620b;
                AbstractC58321a aVar = this.f85619a;
                aVar.getClass();
                handler.post(new Runnable() {
                    /* class com.ss.android.lark.chat.chatwindow.chat.message.$$Lambda$3vNJatTB3UQjaGXXjk9G1y0S54 */

                    public final void run() {
                        AbstractC58321a.this.mo136735b();
                    }
                });
            }
        }

        @Override // com.ss.android.lark.p1820e.p1821a.C36894a.AbstractC36896a
        /* renamed from: a */
        public void mo122673a() {
            AppreciablePerformance.f104480a.mo147947e();
            if (AudioMessageNewCell.this.f85594a != null) {
                AudioMessageNewCell.this.f85594a.mo122760j(this.f85621c);
            }
            if (m128653f()) {
                Handler handler = this.f85620b;
                AbstractC58321a aVar = this.f85619a;
                aVar.getClass();
                handler.post(new Runnable() {
                    /* class com.ss.android.lark.chat.chatwindow.chat.message.$$Lambda$aU13HSqSD0ojbV8eV9sZCDgghEc */

                    public final void run() {
                        AbstractC58321a.this.mo136734a();
                    }
                });
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m128652b(float f) {
            this.f85619a.setProgress(f);
        }

        @Override // com.ss.android.lark.p1820e.p1821a.C36894a.AbstractC36896a
        /* renamed from: a */
        public void mo122674a(float f) {
            if (m128653f()) {
                this.f85620b.post(new Runnable(f) {
                    /* class com.ss.android.lark.chat.chatwindow.chat.message.$$Lambda$AudioMessageNewCell$a$255pZfw5szezTEhD9JIiWRFAnwk */
                    public final /* synthetic */ float f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        AudioMessageNewCell.C33262a.lambda$255pZfw5szezTEhD9JIiWRFAnwk(AudioMessageNewCell.C33262a.this, this.f$1);
                    }
                });
            }
        }

        public C33262a(AbstractC58321a aVar, String str) {
            this.f85619a = aVar;
            this.f85621c = str;
        }
    }

    public static class AudioMessageViewHolder extends AbstractC59010e {

        /* renamed from: a */
        public View f85614a;

        /* renamed from: b */
        public TextView f85615b;

        /* renamed from: c */
        public View f85616c;

        /* renamed from: d */
        public TextView f85617d;
        @BindView(7232)
        public View mAudioView;
        @BindView(7233)
        public LKUIRoundableLayout mAudioViewContainer;
        @BindView(7634)
        public TextView mEditedTv;
        @BindView(8418)
        public PlayControlBar mPlayControlBar;
        @BindView(8506)
        public TextView mRecognizedFlag;
        @BindView(8507)
        public TextView mRecognizedTv;
        @BindView(8963)
        public ViewStub mTranslateStub;
        @BindView(9214)
        public ImageView mUnreadTipsIv;

        /* renamed from: a */
        public void mo122671a(boolean z) {
            int i;
            TextView textView = this.mRecognizedFlag;
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            textView.setVisibility(i);
        }

        /* access modifiers changed from: protected */
        @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e
        /* renamed from: a */
        public void mo122652a(View view) {
            ButterKnife.bind(this, view);
            this.mRecognizedFlag.setText(R.string.Lark_Chat_AudioConvertToTextSuccess);
            m128647a(view.getContext());
        }

        /* renamed from: a */
        private void m128647a(Context context) {
            if (!DesktopUtil.m144307b()) {
                int c = LKUIDisplayManager.m91881c(context, 12);
                C25649b.m91857a(this.mEditedTv, LarkFont.HEADLINE);
                C25649b.m91857a(this.mRecognizedTv, LarkFont.TITLE4);
                C25649b.m91857a(this.mRecognizedFlag, LarkFont.CAPTION0);
                Drawable drawable = UIUtils.getDrawable(context, R.drawable.ic_svg_chat_audio_message_text_flag_gray);
                drawable.setBounds(0, 0, c, c);
                this.mRecognizedFlag.setCompoundDrawables(drawable, null, null, null);
            }
        }

        /* renamed from: b */
        public void mo122672b(boolean z) {
            if (z) {
                if (this.f85614a == null) {
                    View a = C36443k.m143598a(this.mTranslateStub.getContext()).mo134315a(this.mTranslateStub);
                    this.f85614a = a;
                    this.f85615b = (TextView) a.findViewById(R.id.translate_content);
                    this.f85616c = this.f85614a.findViewById(R.id.translate_divider);
                    this.f85617d = (TextView) this.f85614a.findViewById(R.id.translate_label);
                    if (!DesktopUtil.m144307b()) {
                        C25649b.m91857a(this.f85617d, LarkFont.CAPTION0);
                        C25649b.m91857a(this.f85615b, LarkFont.TITLE4);
                    }
                }
                this.f85614a.setVisibility(0);
                return;
            }
            View view = this.f85614a;
            if (view != null) {
                view.setVisibility(8);
            }
        }

        /* renamed from: a */
        public TextView mo122670a(boolean z, boolean z2) {
            int i;
            int i2;
            int i3 = 8;
            if (!z) {
                this.mEditedTv.setVisibility(8);
                this.mRecognizedTv.setVisibility(8);
                this.mRecognizedFlag.setVisibility(8);
            } else {
                TextView textView = this.mEditedTv;
                if (z2) {
                    i = 0;
                } else {
                    i = 8;
                }
                textView.setVisibility(i);
                TextView textView2 = this.mRecognizedTv;
                if (z2) {
                    i2 = 8;
                } else {
                    i2 = 0;
                }
                textView2.setVisibility(i2);
                TextView textView3 = this.mRecognizedFlag;
                if (!z2) {
                    i3 = 0;
                }
                textView3.setVisibility(i3);
            }
            if (z2) {
                return this.mEditedTv;
            }
            return this.mRecognizedTv;
        }
    }

    /* renamed from: a */
    public void mo122657a(AbsMessageVO<AudioContentVO> aVar) {
        AudioContentVO g = aVar.mo121699g();
        if (this.f85594a != null && g != null) {
            C53241h.m205899c("AudioMessageNewCell2", "prepareAudio");
            C53241h.m205898b("AudioMessageNewCell2", "click audio msg, id:" + aVar.mo121681a());
            this.f85594a.mo122759b(g.mo121801a(), aVar.mo121681a());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m128621a(AudioMessageViewHolder audioMessageViewHolder, View view) {
        audioMessageViewHolder.mPlayControlBar.mo136738e();
    }

    /* renamed from: a */
    private void m128622a(AudioMessageViewHolder audioMessageViewHolder, AudioContentVO bVar) {
        if (bVar.mo121815j() == AudioContent.AudioState.DONE_OPEN) {
            bVar.mo121803a(AudioContent.AudioState.DONE);
            audioMessageViewHolder.mPlayControlBar.mo136738e();
        }
    }

    public AudioMessageNewCell(AbstractC33342d dVar, AbstractC33293c cVar) {
        super(dVar);
        boolean z;
        this.f85594a = cVar;
        if (dVar.mo122549m() || dVar.mo122541e()) {
            z = true;
        } else {
            z = false;
        }
        this.f85598g = z;
    }

    /* renamed from: c */
    private void m128626c(final AudioMessageViewHolder audioMessageViewHolder, final AbsMessageVO<AudioContentVO> aVar) {
        final AudioContentVO g = aVar.mo121699g();
        C332603 r1 = new C36913c.AbstractC36916a() {
            /* class com.ss.android.lark.chat.chatwindow.chat.message.AudioMessageNewCell.C332603 */

            @Override // com.ss.android.lark.p1820e.C36913c.AbstractC36916a
            /* renamed from: b */
            public String mo122664b() {
                return g.mo121816k();
            }

            @Override // com.ss.android.lark.p1820e.C36913c.AbstractC36916a
            /* renamed from: c */
            public int mo122665c() {
                return g.mo121808c();
            }

            @Override // com.ss.android.lark.p1820e.C36913c.AbstractC36916a
            /* renamed from: d */
            public int mo122666d() {
                return g.mo121817l();
            }

            @Override // com.ss.android.lark.p1820e.C36913c.AbstractC36916a
            /* renamed from: e */
            public String mo122667e() {
                return aVar.mo121681a();
            }

            @Override // com.ss.android.lark.p1820e.C36913c.AbstractC36916a
            /* renamed from: a */
            public C36894a.AbstractC36896a mo122663a() {
                return new C33262a(audioMessageViewHolder.mPlayControlBar, aVar.mo121681a());
            }
        };
        final C36913c a = C36913c.m145732a(mo122719d());
        a.mo136287a(aVar.mo121696d(), r1);
        float a2 = a.mo136284a(g.mo121816k());
        if (C36894a.m145605a().mo136206c(g.mo121816k())) {
            audioMessageViewHolder.mPlayControlBar.mo136734a();
        } else {
            audioMessageViewHolder.mPlayControlBar.mo136736c();
        }
        if (audioMessageViewHolder.mPlayControlBar.getDuration() != g.mo121808c()) {
            audioMessageViewHolder.mPlayControlBar.setDuration(g.mo121808c());
        }
        audioMessageViewHolder.mPlayControlBar.setProgress(a2);
        audioMessageViewHolder.mPlayControlBar.setTag(r1);
        audioMessageViewHolder.mPlayControlBar.setListener(new AbstractC58321a.AbstractC58322a() {
            /* class com.ss.android.lark.chat.chatwindow.chat.message.AudioMessageNewCell.C332614 */

            @Override // com.ss.android.lark.widget.audioview.AbstractC58321a.AbstractC58322a
            /* renamed from: b */
            public boolean mo122669b(View view) {
                return AudioMessageNewCell.this.mo122755b((AbstractC59010e) audioMessageViewHolder, (Object) aVar);
            }

            @Override // com.ss.android.lark.widget.audioview.AbstractC58321a.AbstractC58322a
            /* renamed from: a */
            public void mo122668a(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(aVar.mo121696d());
                if (aVar.mo121702j() < 2 && !aVar.mo121695c() && AudioMessageNewCell.this.f85594a != null) {
                    arrayList.addAll(AudioMessageNewCell.this.f85594a.mo122758b(audioMessageViewHolder.mo200148l()));
                }
                a.mo136288a(arrayList);
            }
        });
    }

    /* renamed from: a */
    public void mo122655a(View view, boolean z) {
        if (this.f85595b == null || this.f85596c == null) {
            this.f85595b = new AudioWaveBar(mo122719d());
            BasePopupWindow basePopupWindow = new BasePopupWindow(this.f85595b, -2, -2);
            this.f85596c = basePopupWindow;
            basePopupWindow.setOutsideTouchable(true);
        }
        C34443a.m133604a(mo122719d(), this.f85596c, view, z);
    }

    /* renamed from: b */
    private void m128625b(AudioMessageViewHolder audioMessageViewHolder, AbsMessageVO<AudioContentVO> aVar) {
        boolean z;
        int i;
        int i2;
        Drawable drawable;
        Drawable drawable2;
        int i3;
        int i4;
        Drawable drawable3;
        int i5;
        int i6;
        int i7;
        int i8;
        int q = C33360a.m129173q(aVar.mo121695c());
        Drawable c = C33360a.m129158c(this.f85789d.mo122543g(), aVar.mo121695c());
        boolean n = aVar.mo121699g().mo121819n();
        if (!TextUtils.isEmpty(aVar.mo121700h()) || aVar.ah()) {
            z = false;
        } else {
            z = true;
        }
        if (aVar.mo121695c()) {
            FragmentActivity g = this.f85789d.mo122543g();
            if (n) {
                i7 = R.drawable.ic_svg_play_control_disabled_self;
            } else {
                i7 = R.drawable.ic_play_selector_self;
            }
            drawable3 = UIUtils.getDrawable(g, i7);
            FragmentActivity g2 = this.f85789d.mo122543g();
            if (n) {
                i8 = R.color.primary_pri_200;
            } else {
                i8 = R.color.imtoken_message_voice_text_time_blue;
            }
            i3 = UIUtils.getColor(g2, i8);
            drawable2 = UIUtils.getDrawable(this.f85789d.mo122543g(), R.drawable.seekbar_progress_self);
            drawable = UIUtils.getDrawable(mo122719d(), R.drawable.seekbar_thumb_selector_self);
            if (z) {
                i2 = C33360a.m129150a(true);
            } else {
                i2 = C33360a.m129153b(true);
            }
            i = UIUtils.getColor(mo122719d(), R.color.text_title);
            i4 = UIUtils.getColor(mo122719d(), R.color.text_title);
        } else {
            FragmentActivity g3 = this.f85789d.mo122543g();
            if (!n) {
                i5 = R.drawable.ic_play_selector;
            } else if (z) {
                i5 = R.drawable.ic_svg_play_control_disabled;
            } else {
                i5 = R.drawable.ic_svg_play_control_disabled_dark;
            }
            drawable3 = UIUtils.getDrawable(g3, i5);
            FragmentActivity g4 = this.f85789d.mo122543g();
            if (!n) {
                i6 = R.color.imtoken_message_voice_text_time_grey;
            } else if (z) {
                i6 = R.color.ud_N300;
            } else {
                i6 = R.color.text_disable;
            }
            i3 = UIUtils.getColor(g4, i6);
            drawable2 = UIUtils.getDrawable(this.f85789d.mo122543g(), R.drawable.seekbar_progress);
            drawable = UIUtils.getDrawable(mo122719d(), R.drawable.seekbar_thumb_selector);
            if (z) {
                i2 = C33360a.m129150a(false);
            } else {
                i2 = C33360a.m129153b(false);
            }
            i = UIUtils.getColor(mo122719d(), R.color.text_title);
            i4 = UIUtils.getColor(mo122719d(), R.color.text_title);
        }
        audioMessageViewHolder.mPlayControlBar.setDisabled(n);
        audioMessageViewHolder.mPlayControlBar.setPlayBtnDrawable(drawable3);
        audioMessageViewHolder.mPlayControlBar.setDurationTvColor(i3);
        audioMessageViewHolder.mPlayControlBar.setProgressBarDrawable(drawable2);
        audioMessageViewHolder.mPlayControlBar.setThumbDrawable(drawable);
        audioMessageViewHolder.mAudioView.setBackgroundColor(i2);
        audioMessageViewHolder.mRecognizedTv.setTextColor(i4);
        audioMessageViewHolder.mEditedTv.setTextColor(i);
        audioMessageViewHolder.mRecognizedFlag.setTextColor(q);
        audioMessageViewHolder.mRecognizedFlag.setCompoundDrawablesWithIntrinsicBounds(c, (Drawable) null, (Drawable) null, (Drawable) null);
        if (z) {
            float[] a = MessageCellUtils.m133195a(aVar);
            audioMessageViewHolder.mAudioViewContainer.mo89662a(a[0], a[1], a[2], a[3]);
            return;
        }
        audioMessageViewHolder.mAudioViewContainer.mo89662a(10.0f, 10.0f, 10.0f, 10.0f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo122649a(final AudioMessageViewHolder audioMessageViewHolder, final AbsMessageVO<AudioContentVO> aVar) {
        final AudioContentVO bVar;
        long j;
        boolean z;
        boolean z2;
        AbstractC33293c cVar;
        boolean z3;
        super.mo122648a((AbstractC59010e) audioMessageViewHolder, (AbsMessageVO) aVar);
        if (aVar != null) {
            bVar = aVar.mo121699g();
        } else {
            bVar = null;
        }
        if (bVar != null) {
            if (bVar.mo121812g() > 0) {
                j = bVar.mo121812g();
            } else {
                j = aVar.mo121716x();
            }
            boolean z4 = true;
            if (bVar.mo121811f() || aVar.ai() || System.currentTimeMillis() - (j * 1000) >= 30000) {
                z = false;
            } else {
                z = true;
            }
            if (bVar.mo121809d() || this.f85789d.mo122546j() || ((TextUtils.isEmpty(bVar.mo121810e()) && !z) || bVar.mo121819n() || !this.f85597e.mo134684b())) {
                z2 = false;
            } else {
                z2 = true;
            }
            int a = C34443a.m133603a(bVar.mo121808c(), 140, 20);
            boolean h = bVar.mo121813h();
            TextView a2 = audioMessageViewHolder.mo122670a(z2, h);
            if (z2) {
                String e = bVar.mo121810e();
                if (z) {
                    SpannableStringBuilder a3 = C34357v.m133265a(mo122719d(), e.toString(), e.length() - 3);
                    C34357v.m133262a(mo122719d(), a3, a2, UIUtils.dp2px(mo122719d(), 12.0f));
                    a2.setText(a3);
                } else {
                    a2.setText(e);
                }
                if (h || z || !bVar.mo121811f()) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                audioMessageViewHolder.mo122671a(z3);
            }
            audioMessageViewHolder.mAudioView.setMinimumWidth(a);
            if (!TextUtils.isEmpty(aVar.mo121700h())) {
                audioMessageViewHolder.mAudioView.setBackgroundResource(R.drawable.chat_bubble_alpha_black_bg);
                audioMessageViewHolder.mAudioView.setPadding(UIHelper.dp2px(12.0f), UIHelper.dp2px(8.0f), UIHelper.dp2px(12.0f), UIHelper.dp2px(8.0f));
            } else if (aVar.ah()) {
                if (aVar.mo121695c()) {
                    audioMessageViewHolder.mAudioView.setBackground(null);
                } else {
                    audioMessageViewHolder.mAudioView.setBackgroundResource(R.drawable.chat_bubble_alpha_black_bg);
                }
                audioMessageViewHolder.mAudioView.setPadding(UIHelper.dp2px(12.0f), UIHelper.dp2px(8.0f), UIHelper.dp2px(12.0f), UIHelper.dp2px(8.0f));
            } else {
                if (aVar.mo121695c()) {
                    audioMessageViewHolder.mAudioView.setBackgroundResource(R.drawable.chat_bubble_self_bg_selector);
                } else {
                    audioMessageViewHolder.mAudioView.setBackgroundResource(R.drawable.chat_bubble_other_bg_selector);
                }
                audioMessageViewHolder.mAudioView.setPadding(UIHelper.dp2px(12.0f), UIHelper.dp2px(8.0f), UIHelper.dp2px(12.0f), UIHelper.dp2px(8.0f));
            }
            int i = 8;
            if (this.f85598g || aVar.mo121695c() || aVar.mo121702j() >= 2) {
                audioMessageViewHolder.mUnreadTipsIv.setVisibility(8);
            } else {
                ImageView imageView = audioMessageViewHolder.mUnreadTipsIv;
                if (!z2) {
                    i = 0;
                }
                imageView.setVisibility(i);
                if (z2 && !TextUtils.isEmpty(bVar.mo121810e()) && (cVar = this.f85594a) != null) {
                    cVar.mo122760j(aVar.mo121681a());
                }
            }
            PlayControlBar playControlBar = audioMessageViewHolder.mPlayControlBar;
            if (bVar.mo121815j() != AudioContent.AudioState.DOWNLOADING) {
                z4 = false;
            }
            playControlBar.mo197983a(z4);
            $$Lambda$AudioMessageNewCell$5OLF7RaAIDrwm7yHoZOjKhEO7EM r0 = new View.OnLongClickListener(audioMessageViewHolder, aVar) {
                /* class com.ss.android.lark.chat.chatwindow.chat.message.$$Lambda$AudioMessageNewCell$5OLF7RaAIDrwm7yHoZOjKhEO7EM */
                public final /* synthetic */ AudioMessageNewCell.AudioMessageViewHolder f$1;
                public final /* synthetic */ AbsMessageVO f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final boolean onLongClick(View view) {
                    return AudioMessageNewCell.lambda$5OLF7RaAIDrwm7yHoZOjKhEO7EM(AudioMessageNewCell.this, this.f$1, this.f$2, view);
                }
            };
            C332581 r2 = new OnSingleClickListener() {
                /* class com.ss.android.lark.chat.chatwindow.chat.message.AudioMessageNewCell.C332581 */

                @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                public void onSingleClick(View view) {
                    AudioMessageNewCell.this.mo122683c((AbstractC59010e) audioMessageViewHolder, (Object) aVar);
                }
            };
            audioMessageViewHolder.mPlayControlBar.setOnLongClickListener(r0);
            audioMessageViewHolder.mRecognizedTv.setOnLongClickListener(r0);
            audioMessageViewHolder.mUnreadTipsIv.setOnLongClickListener(r0);
            audioMessageViewHolder.mAudioView.setOnLongClickListener(r0);
            audioMessageViewHolder.mRecognizedTv.setOnClickListener(r2);
            audioMessageViewHolder.mUnreadTipsIv.setOnClickListener(r2);
            audioMessageViewHolder.mAudioView.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.chat.chatwindow.chat.message.$$Lambda$AudioMessageNewCell$VL36j8pjrGlMIrzprdYoxwmET9w */

                public final void onClick(View view) {
                    AudioMessageNewCell.lambda$VL36j8pjrGlMIrzprdYoxwmET9w(AudioMessageNewCell.AudioMessageViewHolder.this, view);
                }
            });
            audioMessageViewHolder.mPlayControlBar.setDelegate(new PlayControlBar.AbstractC58473a() {
                /* class com.ss.android.lark.chat.chatwindow.chat.message.AudioMessageNewCell.C332592 */

                @Override // com.ss.android.lark.widget.lark_chat_keyboard.widget.PlayControlBar.AbstractC58473a
                /* renamed from: d */
                public void mo122662d() {
                    C36894a.m145605a().mo136204b();
                }

                @Override // com.ss.android.lark.widget.lark_chat_keyboard.widget.PlayControlBar.AbstractC58473a
                /* renamed from: a */
                public void mo122658a() {
                    if (!TextUtils.isEmpty(bVar.mo121816k())) {
                        AudioMessageNewCell.this.mo122655a((View) audioMessageViewHolder.mPlayControlBar, true);
                        AudioMessageNewCell.this.f85595b.setWaveBytes(bVar.mo121818m());
                        AudioMessageNewCell.this.f85595b.setDurationText(audioMessageViewHolder.mPlayControlBar.getDurationText());
                    }
                    C36894a.m145605a().mo136204b();
                    MessageHitPoint.m213274a();
                }

                @Override // com.ss.android.lark.widget.lark_chat_keyboard.widget.PlayControlBar.AbstractC58473a
                /* renamed from: b */
                public void mo122660b() {
                    if (!TextUtils.isEmpty(bVar.mo121816k())) {
                        AudioMessageNewCell.this.mo122655a((View) audioMessageViewHolder.mPlayControlBar, false);
                    }
                    bVar.mo121802a((int) audioMessageViewHolder.mPlayControlBar.getProgress());
                    if (C36894a.m145605a().mo136202a(bVar.mo121816k())) {
                        C36894a.m145605a().mo136199a(((float) bVar.mo121817l()) / 100.0f);
                        C36894a.m145605a().mo136205c();
                        return;
                    }
                    mo122661c();
                }

                @Override // com.ss.android.lark.widget.lark_chat_keyboard.widget.PlayControlBar.AbstractC58473a
                /* renamed from: c */
                public void mo122661c() {
                    AppreciablePerformance.f104480a.mo147939a(bVar.mo121808c(), aVar.mo121681a(), bVar.mo121801a());
                    C53241h.m205899c("AudioMessageNewCell2", "onPlay:" + bVar.mo121816k());
                    if (TextUtils.isEmpty(bVar.mo121816k())) {
                        audioMessageViewHolder.mPlayControlBar.mo136735b();
                        AudioMessageNewCell.this.mo122657a(aVar);
                        return;
                    }
                    audioMessageViewHolder.mPlayControlBar.mo136739f();
                }

                @Override // com.ss.android.lark.widget.lark_chat_keyboard.widget.PlayControlBar.AbstractC58473a
                /* renamed from: a */
                public void mo122659a(int i) {
                    if (!(AudioMessageNewCell.this.f85596c == null || !AudioMessageNewCell.this.f85596c.isShowing() || AudioMessageNewCell.this.f85595b == null)) {
                        AudioMessageNewCell.this.f85595b.setProgress(i);
                        AudioMessageNewCell.this.f85595b.setDurationText(audioMessageViewHolder.mPlayControlBar.getDurationText());
                    }
                    bVar.mo121802a(i);
                }
            });
            audioMessageViewHolder.mPlayControlBar.setTag(R.id.audio_message_id_tag, aVar.mo121681a());
            m128626c(audioMessageViewHolder, aVar);
            m128622a(audioMessageViewHolder, bVar);
            m128625b(audioMessageViewHolder, aVar);
            m128623a(audioMessageViewHolder, aVar, z2);
            C53241h.m205899c("AudioMessageNewCell2", "onBindViewHolder:" + aVar.mo121681a() + "/" + bVar.mo121815j() + "/" + bVar.mo121816k());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ boolean m128624a(AudioMessageViewHolder audioMessageViewHolder, AbsMessageVO aVar, View view) {
        return mo122755b((AbstractC59010e) audioMessageViewHolder, (Object) aVar);
    }

    /* renamed from: a */
    private void m128623a(AudioMessageViewHolder audioMessageViewHolder, AbsMessageVO<AudioContentVO> aVar, boolean z) {
        boolean z2;
        String str;
        AudioContentVO g = aVar.mo121699g();
        if (!z || !g.mo121814i()) {
            z2 = false;
        } else {
            z2 = true;
        }
        audioMessageViewHolder.mo122672b(z2);
        TranslatableContentVO y = g.mo121930y();
        if (y != null) {
            str = ((AudioContent) y.mo126168z()).getRecognizedText();
        } else {
            str = "";
        }
        if (z2 && str != null) {
            audioMessageViewHolder.f85615b.setText(str);
        }
    }
}
