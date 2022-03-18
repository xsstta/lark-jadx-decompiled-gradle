package com.ss.android.lark.threadwindow.view.message;

import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.larksuite.framework.ui.BasePopupWindow;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.base.view.vo.ThreadMessageVO;
import com.ss.android.lark.chat.base.view.vo.message.AudioContentVO;
import com.ss.android.lark.chat.base.view.vo.message.TranslatableContentVO;
import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33290a;
import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d;
import com.ss.android.lark.chat.chatwindow.chat.message.p1631f.p1633b.C33360a;
import com.ss.android.lark.chat.entity.message.content.AudioContent;
import com.ss.android.lark.chat.utils.C34357v;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.chatbase.view.C34443a;
import com.ss.android.lark.dependency.AbstractC36502p;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.p1820e.C36913c;
import com.ss.android.lark.p1820e.p1821a.C36894a;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.audioview.AbstractC58321a;
import com.ss.android.lark.widget.lark_chat_keyboard.widget.AudioWaveBar;
import com.ss.android.lark.widget.lark_chat_keyboard.widget.PlayControlBar;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e;
import java.util.ArrayList;

/* renamed from: com.ss.android.lark.threadwindow.view.message.a */
public class C56199a extends AbstractC33290a<AudioContentVO, AudioMessageViewHolder> {

    /* renamed from: a */
    public AudioWaveBar f139074a;

    /* renamed from: b */
    public BasePopupWindow f139075b;

    /* renamed from: c */
    private final AbstractC36502p f139076c = C29990c.m110930b().af();

    /* renamed from: e */
    private final AbstractC56205a f139077e;

    /* renamed from: com.ss.android.lark.threadwindow.view.message.a$a */
    public interface AbstractC56205a {
        /* renamed from: a */
        void mo190459a(String str, String str2, int i);
    }

    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: c */
    public int mo122651c() {
        return R.layout.item_thread_audio;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: a */
    public Class<?> mo122646a() {
        return AudioContentVO.class;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: b */
    public Class<AudioMessageViewHolder> mo122650b() {
        return AudioMessageViewHolder.class;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m219140a(AudioMessageViewHolder audioMessageViewHolder, View view) {
        audioMessageViewHolder.mo191508a().mo136738e();
    }

    public C56199a(AbstractC33342d dVar, AbstractC56205a aVar) {
        super(dVar);
        this.f139077e = aVar;
    }

    /* renamed from: b */
    private void m219143b(AudioMessageViewHolder audioMessageViewHolder, AbsMessageVO<AudioContentVO> aVar) {
        int i;
        int i2;
        boolean n = aVar.mo121699g().mo121819n();
        FragmentActivity g = this.f85789d.mo122543g();
        if (n) {
            i = R.drawable.ic_svg_play_control_disabled;
        } else {
            i = R.drawable.ic_play_selector;
        }
        Drawable drawable = UIUtils.getDrawable(g, i);
        FragmentActivity g2 = this.f85789d.mo122543g();
        if (n) {
            i2 = R.color.ud_N300;
        } else {
            i2 = R.color.ud_N700;
        }
        int color = UIUtils.getColor(g2, i2);
        audioMessageViewHolder.mo191522e(n);
        audioMessageViewHolder.mo191511a(drawable);
        audioMessageViewHolder.mo191517b(color);
    }

    /* renamed from: a */
    public void mo191552a(View view, boolean z) {
        if (this.f139074a == null || this.f139075b == null) {
            this.f139074a = new AudioWaveBar(this.f85789d.mo122543g());
            BasePopupWindow basePopupWindow = new BasePopupWindow(this.f139074a, -2, -2);
            this.f139075b = basePopupWindow;
            basePopupWindow.setOutsideTouchable(true);
        }
        C34443a.m133604a(this.f85789d.mo122543g(), this.f139075b, view, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo122649a(final AudioMessageViewHolder audioMessageViewHolder, final AbsMessageVO<AudioContentVO> aVar) {
        long j;
        boolean z;
        boolean z2;
        int i;
        super.mo122648a((AbstractC59010e) audioMessageViewHolder, (AbsMessageVO) aVar);
        if (aVar != null) {
            AudioContentVO g = aVar.mo121699g();
            final AudioContent audioContent = (AudioContent) aVar.mo121699g().mo126168z();
            boolean z3 = false;
            if (this.f139077e != null && TextUtils.isEmpty(audioContent.getLocalFilePath())) {
                AbstractC56205a aVar2 = this.f139077e;
                String key = audioContent.getKey();
                String a = aVar.mo121681a();
                if (aVar instanceof ThreadMessageVO) {
                    i = ((ThreadMessageVO) aVar).mo121673S();
                } else {
                    i = 0;
                }
                aVar2.mo190459a(key, a, i);
            }
            audioMessageViewHolder.mo191519b(false);
            audioMessageViewHolder.mo191520c(false);
            audioMessageViewHolder.mo191509a(C34443a.m133603a(audioContent.getDuration(), 140, 20));
            if (g.mo121812g() > 0) {
                j = g.mo121812g();
            } else {
                j = aVar.mo121716x();
            }
            if (g.mo121811f() || aVar.ai() || System.currentTimeMillis() - (j * 1000) >= 30000) {
                z = false;
            } else {
                z = true;
            }
            if (g.mo121809d() || this.f85789d.mo122546j() || ((TextUtils.isEmpty(g.mo121810e()) && !z) || g.mo121819n() || !this.f139076c.mo134684b())) {
                z2 = false;
            } else {
                z2 = true;
            }
            boolean h = g.mo121813h();
            TextView a2 = audioMessageViewHolder.mo191507a(z2, h);
            Log.m165379d("ThreadWindowAudioCell", "needShowText = " + z2);
            if (z2) {
                String e = g.mo121810e();
                if (z) {
                    SpannableStringBuilder a3 = C34357v.m133265a(mo122719d(), e.toString(), e.length() - 3);
                    C34357v.m133262a(mo122719d(), a3, a2, UIUtils.dp2px(mo122719d(), 12.0f));
                    a2.setText(a3);
                } else {
                    a2.setText(e);
                }
                if (!h && !z && g.mo121811f()) {
                    z3 = true;
                }
                audioMessageViewHolder.mo191515a(z3);
            }
            audioMessageViewHolder.mo191518b(C33360a.m129154b());
            audioMessageViewHolder.mo191510a(UIHelper.dp2px(12.0f), UIHelper.dp2px(8.0f), UIHelper.dp2px(12.0f), UIHelper.dp2px(8.0f));
            View$OnLongClickListenerC562001 r0 = new View.OnLongClickListener() {
                /* class com.ss.android.lark.threadwindow.view.message.C56199a.View$OnLongClickListenerC562001 */

                public boolean onLongClick(View view) {
                    C56199a.this.mo122755b((AbstractC59010e) audioMessageViewHolder, (Object) aVar);
                    return true;
                }
            };
            audioMessageViewHolder.mo191516b().setOnLongClickListener(r0);
            audioMessageViewHolder.mo191513a(r0);
            audioMessageViewHolder.mo191512a(new View.OnClickListener() {
                /* class com.ss.android.lark.threadwindow.view.message.$$Lambda$a$cSpsqF8kXgk5utIKXfGf6EhmhM */

                public final void onClick(View view) {
                    C56199a.m219140a(AudioMessageViewHolder.this, view);
                }
            });
            audioMessageViewHolder.mo191508a().setDelegate(new PlayControlBar.AbstractC58473a() {
                /* class com.ss.android.lark.threadwindow.view.message.C56199a.C562012 */

                @Override // com.ss.android.lark.widget.lark_chat_keyboard.widget.PlayControlBar.AbstractC58473a
                /* renamed from: d */
                public void mo122662d() {
                    C36894a.m145605a().mo136204b();
                }

                @Override // com.ss.android.lark.widget.lark_chat_keyboard.widget.PlayControlBar.AbstractC58473a
                /* renamed from: c */
                public void mo122661c() {
                    audioMessageViewHolder.mo191508a().mo136739f();
                }

                @Override // com.ss.android.lark.widget.lark_chat_keyboard.widget.PlayControlBar.AbstractC58473a
                /* renamed from: a */
                public void mo122658a() {
                    if (!TextUtils.isEmpty(audioContent.getLocalFilePath())) {
                        C56199a.this.mo191552a(audioMessageViewHolder.mo191516b(), true);
                        C56199a.this.f139074a.setWaveBytes(audioContent.getAudioWaveBytes());
                        C56199a.this.f139074a.setDurationText(audioMessageViewHolder.mo191508a().getDurationText());
                    }
                    C36894a.m145605a().mo136204b();
                }

                @Override // com.ss.android.lark.widget.lark_chat_keyboard.widget.PlayControlBar.AbstractC58473a
                /* renamed from: b */
                public void mo122660b() {
                    if (!TextUtils.isEmpty(audioContent.getLocalFilePath())) {
                        C56199a.this.mo191552a(audioMessageViewHolder.mo191516b(), false);
                    }
                    ((AudioContentVO) aVar.mo121699g()).mo121802a((int) audioMessageViewHolder.mo191508a().getProgress());
                    if (C36894a.m145605a().mo136202a(audioContent.getLocalFilePath())) {
                        C36894a.m145605a().mo136199a(((float) ((AudioContentVO) aVar.mo121699g()).mo121817l()) / 100.0f);
                        C36894a.m145605a().mo136205c();
                        return;
                    }
                    mo122661c();
                }

                @Override // com.ss.android.lark.widget.lark_chat_keyboard.widget.PlayControlBar.AbstractC58473a
                /* renamed from: a */
                public void mo122659a(int i) {
                    if (!(C56199a.this.f139075b == null || !C56199a.this.f139075b.isShowing() || C56199a.this.f139074a == null)) {
                        C56199a.this.f139074a.setProgress(i);
                        C56199a.this.f139074a.setDurationText(audioMessageViewHolder.mo191508a().getDurationText());
                    }
                    ((AudioContentVO) aVar.mo121699g()).mo121802a(i);
                }
            });
            AbsMessageVO aVar3 = (AbsMessageVO) audioMessageViewHolder.mo191516b().getTag(R.id.audio_play_message_tag);
            if (!(aVar3 == null || ((AudioContentVO) aVar3.mo121699g()).mo126168z() == null || !(((AudioContentVO) aVar3.mo121699g()).mo126168z() instanceof AudioContent))) {
                AudioContent audioContent2 = (AudioContent) ((AudioContentVO) aVar3.mo121699g()).mo126168z();
                if (audioContent.getKey().equals(audioContent2.getKey()) && TextUtils.isEmpty(audioContent.getLocalFilePath())) {
                    audioContent.setLocalFilePath(audioContent2.getLocalFilePath());
                    audioContent.setAudioWaveBytes(audioContent2.getAudioWaveBytes());
                }
            }
            m219143b(audioMessageViewHolder, aVar);
            audioMessageViewHolder.mo191516b().setTag(R.id.audio_play_message_tag, aVar);
            m219142a(audioMessageViewHolder, audioContent, aVar);
            m219141a(audioMessageViewHolder, aVar, z2);
        }
    }

    /* renamed from: a */
    private void m219141a(AudioMessageViewHolder audioMessageViewHolder, AbsMessageVO<AudioContentVO> aVar, boolean z) {
        boolean z2;
        String str;
        AudioContentVO g = aVar.mo121699g();
        if (!z || !g.mo121814i()) {
            z2 = false;
        } else {
            z2 = true;
        }
        audioMessageViewHolder.mo191521d(z2);
        TranslatableContentVO y = g.mo121930y();
        if (y != null) {
            str = ((AudioContent) y.mo126168z()).getRecognizedText();
        } else {
            str = "";
        }
        if (z2 && str != null) {
            audioMessageViewHolder.f138956b.setText(str);
        }
    }

    /* renamed from: a */
    private void m219142a(final AudioMessageViewHolder audioMessageViewHolder, final AudioContent audioContent, final AbsMessageVO<AudioContentVO> aVar) {
        final AbstractC58321a a = audioMessageViewHolder.mo191508a();
        C562023 r7 = new C36913c.AbstractC36916a() {
            /* class com.ss.android.lark.threadwindow.view.message.C56199a.C562023 */

            @Override // com.ss.android.lark.p1820e.C36913c.AbstractC36916a
            /* renamed from: e */
            public String mo122667e() {
                return null;
            }

            @Override // com.ss.android.lark.p1820e.C36913c.AbstractC36916a
            /* renamed from: a */
            public C36894a.AbstractC36896a mo122663a() {
                return new C36894a.AbstractC36896a() {
                    /* class com.ss.android.lark.threadwindow.view.message.C56199a.C562023.C562031 */

                    @Override // com.ss.android.lark.p1820e.p1821a.C36894a.AbstractC36896a
                    /* renamed from: b */
                    public void mo122675b() {
                    }

                    @Override // com.ss.android.lark.p1820e.p1821a.C36894a.AbstractC36896a
                    /* renamed from: c */
                    public void mo122676c() {
                    }

                    @Override // com.ss.android.lark.p1820e.p1821a.C36894a.AbstractC36896a
                    /* renamed from: a */
                    public void mo122673a() {
                        AudioMessageViewHolder audioMessageViewHolder = audioMessageViewHolder;
                        AbstractC58321a aVar = a;
                        aVar.getClass();
                        audioMessageViewHolder.mo191514a(new Runnable() {
                            /* class com.ss.android.lark.threadwindow.view.message.$$Lambda$aU13HSqSD0ojbV8eV9sZCDgghEc */

                            public final void run() {
                                AbstractC58321a.this.mo136734a();
                            }
                        });
                    }

                    @Override // com.ss.android.lark.p1820e.p1821a.C36894a.AbstractC36896a
                    /* renamed from: d */
                    public void mo122677d() {
                        AudioMessageViewHolder audioMessageViewHolder = audioMessageViewHolder;
                        AbstractC58321a aVar = a;
                        aVar.getClass();
                        audioMessageViewHolder.mo191514a(new Runnable() {
                            /* class com.ss.android.lark.threadwindow.view.message.$$Lambda$3vNJatTB3UQjaGXXjk9G1y0S54 */

                            public final void run() {
                                AbstractC58321a.this.mo136735b();
                            }
                        });
                    }

                    @Override // com.ss.android.lark.p1820e.p1821a.C36894a.AbstractC36896a
                    /* renamed from: e */
                    public void mo122678e() {
                        AudioMessageViewHolder audioMessageViewHolder = audioMessageViewHolder;
                        AbstractC58321a aVar = a;
                        aVar.getClass();
                        audioMessageViewHolder.mo191514a(new Runnable() {
                            /* class com.ss.android.lark.threadwindow.view.message.$$Lambda$3vNJatTB3UQjaGXXjk9G1y0S54 */

                            public final void run() {
                                AbstractC58321a.this.mo136735b();
                            }
                        });
                    }

                    @Override // com.ss.android.lark.p1820e.p1821a.C36894a.AbstractC36896a
                    /* renamed from: a */
                    public void mo122674a(float f) {
                        audioMessageViewHolder.mo191514a(new Runnable(f) {
                            /* class com.ss.android.lark.threadwindow.view.message.$$Lambda$a$3$1$QlKWu7STTbomZJ3jesHDK7VnsWw */
                            public final /* synthetic */ float f$1;

                            {
                                this.f$1 = r2;
                            }

                            public final void run() {
                                AbstractC58321a.this.setProgress(this.f$1);
                            }
                        });
                    }
                };
            }

            @Override // com.ss.android.lark.p1820e.C36913c.AbstractC36916a
            /* renamed from: b */
            public String mo122664b() {
                return audioContent.getLocalFilePath();
            }

            @Override // com.ss.android.lark.p1820e.C36913c.AbstractC36916a
            /* renamed from: c */
            public int mo122665c() {
                return audioContent.getDuration();
            }

            @Override // com.ss.android.lark.p1820e.C36913c.AbstractC36916a
            /* renamed from: d */
            public int mo122666d() {
                return ((AudioContentVO) aVar.mo121699g()).mo121817l();
            }
        };
        final C36913c a2 = C36913c.m145732a(this.f85789d.mo122543g());
        a2.mo136287a(aVar.mo121696d(), r7);
        float a3 = a2.mo136284a(audioContent.getLocalFilePath());
        a.setDuration(audioContent.getDuration());
        a.setProgress(a3);
        a.setTag(r7);
        a.setListener(new AbstractC58321a.AbstractC58322a() {
            /* class com.ss.android.lark.threadwindow.view.message.C56199a.C562044 */

            @Override // com.ss.android.lark.widget.audioview.AbstractC58321a.AbstractC58322a
            /* renamed from: b */
            public boolean mo122669b(View view) {
                return true;
            }

            @Override // com.ss.android.lark.widget.audioview.AbstractC58321a.AbstractC58322a
            /* renamed from: a */
            public void mo122668a(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(aVar.mo121696d());
                a2.mo136288a(arrayList);
            }
        });
    }
}
