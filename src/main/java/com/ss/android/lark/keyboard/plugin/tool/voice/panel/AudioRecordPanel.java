package com.ss.android.lark.keyboard.plugin.tool.voice.panel;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import butterknife.ButterKnife;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.keyboard.plugin.input.RichTextEmojiconEditText;
import com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin;
import com.ss.android.lark.keyboard.plugin.tool.voice.C41026a;
import com.ss.android.lark.keyboard.plugin.tool.voice.p2092c.C41039c;
import com.ss.android.lark.keyboard.plugin.tool.voice.panel.AudioPanelRecordTextView;
import com.ss.android.lark.keyboard.plugin.tool.voice.panel.AudioPanelTextView;
import com.ss.android.lark.keyboard.plugin.tool.voice.widget.SmartTabLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AudioRecordPanel extends RelativeLayout {

    /* renamed from: a */
    private AudioPanelRecordView f104675a;

    /* renamed from: b */
    private AudioPanelTextView f104676b;

    /* renamed from: c */
    private AudioPanelRecordTextView f104677c;

    /* renamed from: d */
    private AbstractC41079a f104678d;

    /* renamed from: e */
    private int f104679e;

    /* renamed from: f */
    private final Map<Integer, Integer> f104680f;
    public SmartTabLayout mSmartTabLayout;
    public ViewPager mViewPager;

    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.voice.panel.AudioRecordPanel$a */
    public interface AbstractC41079a {
        /* renamed from: a */
        void mo147980a(int i);
    }

    /* renamed from: a */
    public void mo148130a() {
        AudioPanelRecordTextView audioPanelRecordTextView = this.f104677c;
        if (audioPanelRecordTextView != null) {
            audioPanelRecordTextView.mo148087a();
        }
    }

    /* renamed from: b */
    public void mo148135b() {
        AudioPanelRecordView audioPanelRecordView = this.f104675a;
        if (audioPanelRecordView != null) {
            audioPanelRecordView.mo148106a();
        }
    }

    /* renamed from: c */
    public void mo148136c() {
        AudioPanelTextView audioPanelTextView = this.f104676b;
        if (audioPanelTextView != null) {
            audioPanelTextView.mo148119b();
        }
    }

    /* renamed from: d */
    public void mo148137d() {
        AudioPanelTextView audioPanelTextView = this.f104676b;
        if (audioPanelTextView != null) {
            audioPanelTextView.mo148116a();
        }
    }

    /* renamed from: e */
    public boolean mo148138e() {
        AudioPanelRecordTextView audioPanelRecordTextView = this.f104677c;
        if (audioPanelRecordTextView == null) {
            return false;
        }
        return audioPanelRecordTextView.mo148092b();
    }

    public RichTextEmojiconEditText getMsgEditText() {
        if (this.f104679e == 0) {
            AudioPanelRecordTextView audioPanelRecordTextView = this.f104677c;
            if (audioPanelRecordTextView != null) {
                return audioPanelRecordTextView.getMsgEditText();
            }
            return null;
        }
        AudioPanelTextView audioPanelTextView = this.f104676b;
        if (audioPanelTextView != null) {
            return audioPanelTextView.getMsgEditText();
        }
        return null;
    }

    public AudioRecordPanel(Context context) {
        this(context, null);
    }

    public void setAudioCountDown(String str) {
        AudioPanelRecordView audioPanelRecordView = this.f104675a;
        if (audioPanelRecordView != null) {
            audioPanelRecordView.setAudioCountDown(str);
        }
    }

    public void setDelegate(AudioPanelRecordTextView.AbstractC41071a aVar) {
        AudioPanelRecordTextView audioPanelRecordTextView = this.f104677c;
        if (audioPanelRecordTextView != null) {
            audioPanelRecordTextView.setDelegate(aVar);
        }
    }

    /* renamed from: a */
    private void m162898a(Context context) {
        LayoutInflater.from(context).inflate(R.layout.kb_chat_keyboard_record_panel, this);
        ButterKnife.bind(this);
    }

    public void setAudioDuration(int i) {
        AudioPanelRecordView audioPanelRecordView = this.f104675a;
        if (audioPanelRecordView != null) {
            audioPanelRecordView.setAudioDuration(i);
        }
        AudioPanelRecordTextView audioPanelRecordTextView = this.f104677c;
        if (audioPanelRecordTextView != null) {
            audioPanelRecordTextView.setAudioDuration(i);
        }
    }

    public void setDelegate(AudioPanelTextView.AbstractC41077a aVar) {
        AudioPanelTextView audioPanelTextView = this.f104676b;
        if (audioPanelTextView != null) {
            audioPanelTextView.setDelegate(aVar);
        }
    }

    public void setAudioVolume(double d) {
        AudioPanelRecordView audioPanelRecordView = this.f104675a;
        if (audioPanelRecordView != null) {
            audioPanelRecordView.setAudioAmplitude(d);
        }
        AudioPanelTextView audioPanelTextView = this.f104676b;
        if (audioPanelTextView != null) {
            audioPanelTextView.setAudioAmplitude(d);
        }
        AudioPanelRecordTextView audioPanelRecordTextView = this.f104677c;
        if (audioPanelRecordTextView != null) {
            audioPanelRecordTextView.setAudioAmplitude(d);
        }
    }

    public void setKeyboardContext(IKeyBoardPlugin.IKeyBoardContext bVar) {
        AudioPanelRecordView audioPanelRecordView = this.f104675a;
        if (audioPanelRecordView != null) {
            audioPanelRecordView.setKeyboardContext(bVar);
        }
        AudioPanelTextView audioPanelTextView = this.f104676b;
        if (audioPanelTextView != null) {
            audioPanelTextView.setKeyboardContext(bVar);
        }
        AudioPanelRecordTextView audioPanelRecordTextView = this.f104677c;
        if (audioPanelRecordTextView != null) {
            audioPanelRecordTextView.setKeyboardContext(bVar);
        }
    }

    public void setRecordListener(C41026a aVar) {
        AudioPanelRecordView audioPanelRecordView = this.f104675a;
        if (audioPanelRecordView != null) {
            audioPanelRecordView.setAudioRecorderListener(aVar);
        }
        AudioPanelTextView audioPanelTextView = this.f104676b;
        if (audioPanelTextView != null) {
            audioPanelTextView.setAudioRecorderListener(aVar);
        }
        AudioPanelRecordTextView audioPanelRecordTextView = this.f104677c;
        if (audioPanelRecordTextView != null) {
            audioPanelRecordTextView.setAudioRecorderListener(aVar);
        }
    }

    /* renamed from: a */
    public void mo148133a(boolean z) {
        AudioPanelRecordTextView audioPanelRecordTextView = this.f104677c;
        if (audioPanelRecordTextView != null) {
            audioPanelRecordTextView.mo148094d(z);
        }
    }

    public AudioRecordPanel(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public void mo148132a(List<View> list, int i) {
        int i2;
        AudioPanelTextView audioPanelTextView;
        int i3;
        float f;
        int i4;
        int size = list.size();
        if (i < size) {
            for (int i5 = 0; i5 < size; i5++) {
                TextView textView = (TextView) list.get(i5);
                if (i == i5) {
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                if (i3 != 0) {
                    f = 16.0f;
                } else {
                    f = 14.0f;
                }
                textView.setTextSize(f);
                textView.setTypeface(null, i3);
                Resources resources = getResources();
                if (i3 != 0) {
                    i4 = R.color.text_title;
                } else {
                    i4 = R.color.text_placeholder;
                }
                textView.setTextColor(resources.getColor(i4));
            }
        }
        this.mViewPager.setCurrentItem(i);
        Integer num = this.f104680f.get(Integer.valueOf(i));
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = 1;
        }
        AbstractC41079a aVar = this.f104678d;
        if (aVar != null) {
            aVar.mo147980a(C41039c.m162710c(i2));
        }
        int i6 = !C41039c.m162705a().equals("zh_ch");
        if (i2 == 0) {
            AudioPanelRecordTextView audioPanelRecordTextView = this.f104677c;
            if (audioPanelRecordTextView != null) {
                audioPanelRecordTextView.setLanguageOption(i6);
            }
        } else if (i2 == 2 && (audioPanelTextView = this.f104676b) != null) {
            audioPanelTextView.setLanguageOption(i6);
        }
        C41039c.m162708b(i2);
        this.f104679e = i;
    }

    public AudioRecordPanel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f104680f = new HashMap();
        m162898a(context);
    }

    /* renamed from: a */
    public void mo148131a(String str, boolean z, boolean z2) {
        AudioPanelRecordTextView audioPanelRecordTextView = this.f104677c;
        if (audioPanelRecordTextView != null) {
            audioPanelRecordTextView.mo148089a(str, z, z2);
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ View m162897a(List list, ViewGroup viewGroup, int i, PagerAdapter pagerAdapter) {
        int dp2px = UIUtils.dp2px(getContext(), 12.0f);
        TextView textView = new TextView(viewGroup.getContext());
        textView.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        textView.setText(pagerAdapter.getPageTitle(i));
        textView.setGravity(17);
        textView.setPadding(dp2px, 0, dp2px, UIUtils.dp2px(getContext(), 5.0f));
        list.add(textView);
        return textView;
    }

    /* renamed from: a */
    public void mo148134a(boolean z, boolean z2, boolean z3, AbstractC41079a aVar) {
        ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i = 0;
        if (z3) {
            AudioPanelRecordTextView audioPanelRecordTextView = new AudioPanelRecordTextView(getContext());
            this.f104677c = audioPanelRecordTextView;
            arrayList.add(audioPanelRecordTextView);
            arrayList3.add(UIUtils.getString(getContext(), R.string.Lark_Chat_SendAudioWithText));
            this.f104680f.put(Integer.valueOf(arrayList3.size() - 1), 0);
        }
        if (z) {
            AudioPanelRecordView audioPanelRecordView = new AudioPanelRecordView(getContext());
            this.f104675a = audioPanelRecordView;
            arrayList.add(audioPanelRecordView);
            arrayList3.add(UIUtils.getString(getContext(), R.string.Lark_Chat_RecordAudio));
            this.f104680f.put(Integer.valueOf(arrayList3.size() - 1), 1);
        }
        if (z2) {
            AudioPanelTextView audioPanelTextView = new AudioPanelTextView(getContext());
            this.f104676b = audioPanelTextView;
            arrayList.add(audioPanelTextView);
            arrayList3.add(UIUtils.getString(getContext(), R.string.Lark_Chat_AudioToText));
            this.f104680f.put(Integer.valueOf(arrayList3.size() - 1), 2);
        }
        this.mViewPager.setAdapter(new C41086a(getContext(), arrayList, arrayList3));
        this.mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            /* class com.ss.android.lark.keyboard.plugin.tool.voice.panel.AudioRecordPanel.C410781 */

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                AudioRecordPanel.this.mo148132a(arrayList2, i);
            }
        });
        this.mSmartTabLayout.setCustomTabView(new SmartTabLayout.AbstractC41094g(arrayList2) {
            /* class com.ss.android.lark.keyboard.plugin.tool.voice.panel.$$Lambda$AudioRecordPanel$gUzjk2GMPTN8G1uMsodDDHXNuBo */
            public final /* synthetic */ List f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.ss.android.lark.keyboard.plugin.tool.voice.widget.SmartTabLayout.AbstractC41094g
            public final View createTabView(ViewGroup viewGroup, int i, PagerAdapter pagerAdapter) {
                return AudioRecordPanel.lambda$gUzjk2GMPTN8G1uMsodDDHXNuBo(AudioRecordPanel.this, this.f$1, viewGroup, i, pagerAdapter);
            }
        });
        this.mSmartTabLayout.setViewPager(this.mViewPager);
        this.f104678d = aVar;
        int a = C41039c.m162704a(1);
        for (Map.Entry<Integer, Integer> entry : this.f104680f.entrySet()) {
            if (entry.getValue().intValue() == a) {
                i = entry.getKey().intValue();
            }
        }
        mo148132a(arrayList2, i);
    }
}
