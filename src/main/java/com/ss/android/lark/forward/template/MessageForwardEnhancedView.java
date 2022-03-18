package com.ss.android.lark.forward.template;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.constraintlayout.widget.C0689b;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.utils.C26311p;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.AudioContent;
import com.ss.android.lark.chat.entity.message.content.FileContent;
import com.ss.android.lark.chat.entity.message.content.FolderContent;
import com.ss.android.lark.chat.entity.message.content.LocationContent;
import com.ss.android.lark.chat.export.entity.message.Content;
import com.ss.android.lark.forward.C38364a;
import com.ss.android.lark.forward.dto.ForwardTarget;
import com.ss.android.lark.forward.dto.ForwardTemplate;
import com.ss.android.lark.forward.dto.template.ForwardEnhancedView;
import com.ss.android.lark.forward.template.MessageForwardEnhancedView;
import com.ss.android.lark.p1820e.C36913c;
import com.ss.android.lark.p1820e.p1821a.C36894a;
import com.ss.android.lark.utils.C57881t;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.EllipsizedEmojiconTextView;
import com.ss.android.lark.widget.lark_chat_keyboard.widget.PlayControlBar;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import java.util.ArrayList;
import java.util.List;
import pl.droidsonroids.gif.GifImageView;

public class MessageForwardEnhancedView implements ForwardEnhancedView {
    public static final Parcelable.Creator<MessageForwardEnhancedView> CREATOR = new Parcelable.Creator<MessageForwardEnhancedView>() {
        /* class com.ss.android.lark.forward.template.MessageForwardEnhancedView.C384753 */

        /* renamed from: a */
        public MessageForwardEnhancedView[] newArray(int i) {
            return new MessageForwardEnhancedView[i];
        }

        /* renamed from: a */
        public MessageForwardEnhancedView createFromParcel(Parcel parcel) {
            return new MessageForwardEnhancedView(parcel);
        }
    };

    @Override // com.ss.android.lark.forward.dto.template.ForwardEnhancedView
    /* renamed from: a */
    public void mo140740a(Activity activity, List<ForwardTarget> list, Bundle bundle, ForwardEnhancedView.AbstractC38392a aVar) {
    }

    @Override // com.ss.android.lark.forward.dto.template.ForwardEnhancedView
    /* renamed from: a */
    public void mo140741a(Activity activity, List<ForwardTarget> list, Bundle bundle, ForwardEnhancedView.AbstractC38392a aVar, ForwardTemplate forwardTemplate) {
    }

    @Override // com.ss.android.lark.forward.dto.template.ForwardEnhancedView
    /* renamed from: a */
    public boolean mo140743a(List<ForwardTarget> list, Bundle bundle) {
        return false;
    }

    @Override // com.ss.android.lark.forward.dto.template.ForwardEnhancedView
    /* renamed from: d */
    public boolean mo140746d(List<ForwardTarget> list, Bundle bundle) {
        return false;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
    }

    public MessageForwardEnhancedView() {
    }

    /* renamed from: com.ss.android.lark.forward.template.MessageForwardEnhancedView$4 */
    static /* synthetic */ class C384764 {

        /* renamed from: a */
        static final /* synthetic */ int[] f98933a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.ss.android.lark.chat.entity.message.Message$Type[] r0 = com.ss.android.lark.chat.entity.message.Message.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.forward.template.MessageForwardEnhancedView.C384764.f98933a = r0
                com.ss.android.lark.chat.entity.message.Message$Type r1 = com.ss.android.lark.chat.entity.message.Message.Type.TODO     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.forward.template.MessageForwardEnhancedView.C384764.f98933a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.chat.entity.message.Message$Type r1 = com.ss.android.lark.chat.entity.message.Message.Type.SHARE_CALENDAR_EVENT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.forward.template.MessageForwardEnhancedView.C384764.f98933a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.chat.entity.message.Message$Type r1 = com.ss.android.lark.chat.entity.message.Message.Type.VIDEO_CHAT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.lark.forward.template.MessageForwardEnhancedView.C384764.f98933a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.lark.chat.entity.message.Message$Type r1 = com.ss.android.lark.chat.entity.message.Message.Type.LOCATION     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.ss.android.lark.forward.template.MessageForwardEnhancedView.C384764.f98933a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.ss.android.lark.chat.entity.message.Message$Type r1 = com.ss.android.lark.chat.entity.message.Message.Type.FILE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = com.ss.android.lark.forward.template.MessageForwardEnhancedView.C384764.f98933a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.ss.android.lark.chat.entity.message.Message$Type r1 = com.ss.android.lark.chat.entity.message.Message.Type.FOLDER     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = com.ss.android.lark.forward.template.MessageForwardEnhancedView.C384764.f98933a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.ss.android.lark.chat.entity.message.Message$Type r1 = com.ss.android.lark.chat.entity.message.Message.Type.AUDIO     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.forward.template.MessageForwardEnhancedView.C384764.<clinit>():void");
        }
    }

    public MessageForwardEnhancedView(Parcel parcel) {
    }

    /* renamed from: a */
    private Message m151744a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return (Message) bundle.getSerializable("key_message");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m151745a(TextView textView, TextView textView2) {
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.rightMargin = UIHelper.dp2px(2.0f);
            marginLayoutParams.leftMargin = UIHelper.dp2px(8.0f);
        }
        ViewGroup.LayoutParams layoutParams2 = textView2.getLayoutParams();
        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin = UIHelper.dp2px(8.0f);
        }
    }

    @Override // com.ss.android.lark.forward.dto.template.ForwardEnhancedView
    /* renamed from: b */
    public boolean mo140744b(List<ForwardTarget> list, Bundle bundle) {
        Message a = m151744a(bundle);
        if (a == null || a.getType() == null) {
            return false;
        }
        switch (C384764.f98933a[a.getType().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return true;
            default:
                return false;
        }
    }

    @Override // com.ss.android.lark.forward.dto.template.ForwardEnhancedView
    /* renamed from: c */
    public boolean mo140745c(List<ForwardTarget> list, Bundle bundle) {
        Message a = m151744a(bundle);
        if (a == null || a.getType() == null || C384764.f98933a[a.getType().ordinal()] != 7) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private int m151743a(int i, int i2, int i3) {
        int i4 = ((i / 1000) - 1) / 10;
        if (i4 > 6) {
            i4 = 6;
        }
        return UIHelper.dp2px((float) (i2 + (i4 * i3)));
    }

    /* renamed from: a */
    private void m151746a(Content content, final String str, View view, final PlayControlBar playControlBar) {
        final AudioContent audioContent = (AudioContent) content;
        int a = m151743a(audioContent.getDuration(), SmEvents.EVENT_NW, 10);
        ((ConstraintLayout.LayoutParams) view.getLayoutParams()).width = UIHelper.dp2px(24.0f) + a;
        ((ConstraintLayout.LayoutParams) playControlBar.getLayoutParams()).width = a;
        playControlBar.setDuration(audioContent.getDuration());
        final C36913c a2 = C36913c.m145732a(playControlBar.getContext());
        playControlBar.setProgress(a2.mo136284a(audioContent.getLocalFilePath()));
        playControlBar.mo136735b();
        a2.mo136287a(str, new C36913c.AbstractC36916a() {
            /* class com.ss.android.lark.forward.template.MessageForwardEnhancedView.C384721 */

            @Override // com.ss.android.lark.p1820e.C36913c.AbstractC36916a
            /* renamed from: d */
            public int mo122666d() {
                return 0;
            }

            @Override // com.ss.android.lark.p1820e.C36913c.AbstractC36916a
            /* renamed from: e */
            public String mo122667e() {
                return null;
            }

            @Override // com.ss.android.lark.p1820e.C36913c.AbstractC36916a
            /* renamed from: a */
            public C36894a.AbstractC36896a mo122663a() {
                return new C36894a.AbstractC36896a() {
                    /* class com.ss.android.lark.forward.template.MessageForwardEnhancedView.C384721.C384731 */

                    @Override // com.ss.android.lark.p1820e.p1821a.C36894a.AbstractC36896a
                    /* renamed from: a */
                    public void mo122673a() {
                        PlayControlBar playControlBar = playControlBar;
                        PlayControlBar playControlBar2 = playControlBar;
                        playControlBar2.getClass();
                        playControlBar.post(new Runnable() {
                            /* class com.ss.android.lark.forward.template.$$Lambda$FLX2B4rxwVXDQrio73WKrX5pYLA */

                            public final void run() {
                                PlayControlBar.this.mo136734a();
                            }
                        });
                    }

                    @Override // com.ss.android.lark.p1820e.p1821a.C36894a.AbstractC36896a
                    /* renamed from: b */
                    public void mo122675b() {
                        PlayControlBar playControlBar = playControlBar;
                        PlayControlBar playControlBar2 = playControlBar;
                        playControlBar2.getClass();
                        playControlBar.post(new Runnable() {
                            /* class com.ss.android.lark.forward.template.$$Lambda$5lEF7FhBkGkaRZN5DXB9HXzRhHo */

                            public final void run() {
                                PlayControlBar.this.mo136736c();
                            }
                        });
                    }

                    @Override // com.ss.android.lark.p1820e.p1821a.C36894a.AbstractC36896a
                    /* renamed from: c */
                    public void mo122676c() {
                        PlayControlBar playControlBar = playControlBar;
                        PlayControlBar playControlBar2 = playControlBar;
                        playControlBar2.getClass();
                        playControlBar.post(new Runnable() {
                            /* class com.ss.android.lark.forward.template.$$Lambda$YLaMgNl2c9GtPXfGNqJ0wwL0ulM */

                            public final void run() {
                                PlayControlBar.this.mo136737d();
                            }
                        });
                    }

                    @Override // com.ss.android.lark.p1820e.p1821a.C36894a.AbstractC36896a
                    /* renamed from: d */
                    public void mo122677d() {
                        PlayControlBar playControlBar = playControlBar;
                        PlayControlBar playControlBar2 = playControlBar;
                        playControlBar2.getClass();
                        playControlBar.post(new Runnable() {
                            /* class com.ss.android.lark.forward.template.$$Lambda$7iyyZEFtXH1hDbqI4Dmjv5CEEdU */

                            public final void run() {
                                PlayControlBar.this.mo136735b();
                            }
                        });
                    }

                    @Override // com.ss.android.lark.p1820e.p1821a.C36894a.AbstractC36896a
                    /* renamed from: e */
                    public void mo122678e() {
                        PlayControlBar playControlBar = playControlBar;
                        PlayControlBar playControlBar2 = playControlBar;
                        playControlBar2.getClass();
                        playControlBar.post(new Runnable() {
                            /* class com.ss.android.lark.forward.template.$$Lambda$7iyyZEFtXH1hDbqI4Dmjv5CEEdU */

                            public final void run() {
                                PlayControlBar.this.mo136735b();
                            }
                        });
                    }

                    @Override // com.ss.android.lark.p1820e.p1821a.C36894a.AbstractC36896a
                    /* renamed from: a */
                    public void mo122674a(float f) {
                        playControlBar.post(new Runnable(f) {
                            /* class com.ss.android.lark.forward.template.$$Lambda$MessageForwardEnhancedView$1$1$jnq8TE55r0SmgL_5k7qmUQkZag */
                            public final /* synthetic */ float f$1;

                            {
                                this.f$1 = r2;
                            }

                            public final void run() {
                                MessageForwardEnhancedView.C384721.C384731.m270552lambda$jnq8TE55r0SmgL_5k7qmUQkZag(PlayControlBar.this, this.f$1);
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
        });
        playControlBar.setDelegate(new PlayControlBar.AbstractC58473a() {
            /* class com.ss.android.lark.forward.template.MessageForwardEnhancedView.C384742 */

            @Override // com.ss.android.lark.widget.lark_chat_keyboard.widget.PlayControlBar.AbstractC58473a
            /* renamed from: a */
            public void mo122659a(int i) {
            }

            @Override // com.ss.android.lark.widget.lark_chat_keyboard.widget.PlayControlBar.AbstractC58473a
            /* renamed from: a */
            public void mo122658a() {
                C36894a.m145605a().mo136204b();
            }

            @Override // com.ss.android.lark.widget.lark_chat_keyboard.widget.PlayControlBar.AbstractC58473a
            /* renamed from: d */
            public void mo122662d() {
                C36894a.m145605a().mo136204b();
            }

            @Override // com.ss.android.lark.widget.lark_chat_keyboard.widget.PlayControlBar.AbstractC58473a
            /* renamed from: c */
            public void mo122661c() {
                ArrayList arrayList = new ArrayList();
                arrayList.add(str);
                a2.mo136288a(arrayList);
            }

            @Override // com.ss.android.lark.widget.lark_chat_keyboard.widget.PlayControlBar.AbstractC58473a
            /* renamed from: b */
            public void mo122660b() {
                if (C36894a.m145605a().mo136202a(audioContent.getLocalFilePath())) {
                    audioContent.setProgress((int) playControlBar.getProgress());
                    C36894a.m145605a().mo136199a(playControlBar.getProgress() / 100.0f);
                    C36894a.m145605a().mo136205c();
                    return;
                }
                mo122661c();
            }
        });
    }

    @Override // com.ss.android.lark.forward.dto.template.ForwardEnhancedView
    /* renamed from: a */
    public void mo140739a(Activity activity, ConstraintLayout constraintLayout, List<ForwardTarget> list, Bundle bundle) {
        Message a = m151744a(bundle);
        if (a != null && a.getType() != null && C384764.f98933a[a.getType().ordinal()] == 7) {
            activity.getLayoutInflater().inflate(R.layout.view_dialog_content_audio, constraintLayout);
            constraintLayout.setBackgroundResource(R.drawable.forward_content_bg_with_border);
            m151746a(a.getContent(), a.getcId(), constraintLayout.findViewById(R.id.confirm_audio_play_bg), (PlayControlBar) constraintLayout.findViewById(R.id.confirm_audio_play_bar));
        }
    }

    /* renamed from: a */
    private void m151747a(GifImageView gifImageView, TextView textView, TextView textView2, TextView textView3, Message message) {
        String str;
        int i;
        String str2 = "";
        if (message.getContent() instanceof FileContent) {
            FileContent fileContent = (FileContent) message.getContent();
            str2 = fileContent.getName();
            str = C26311p.m95262a(fileContent.getSize());
            i = C57881t.m224626c(fileContent.getMime(), fileContent.getName());
        } else if (message.getContent() instanceof FolderContent) {
            FolderContent folderContent = (FolderContent) message.getContent();
            String name = folderContent.getName();
            String a = C26311p.m95262a(folderContent.getSize());
            i = C57881t.m224622b(str2, folderContent.getName(), true);
            str2 = name;
            str = a;
        } else {
            str = str2;
            i = -1;
        }
        if (i != -1) {
            gifImageView.setImageResource(i);
            gifImageView.setVisibility(0);
        }
        textView.setText(str2);
        textView.setVisibility(0);
        textView.setMaxLines(2);
        textView2.setVisibility(0);
        textView3.setVisibility(0);
        textView3.setText(str);
        ViewGroup.LayoutParams layoutParams = gifImageView.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = 0;
        }
        textView3.setPadding(0, UIHelper.dp2px(4.0f), UIHelper.dp2px(BitmapDescriptorFactory.HUE_RED), 0);
        UICallbackExecutor.executeDelayed(new Runnable(textView, textView3) {
            /* class com.ss.android.lark.forward.template.$$Lambda$MessageForwardEnhancedView$xyLiyXCp6BFM5zPrLzhHCTHVCRk */
            public final /* synthetic */ TextView f$0;
            public final /* synthetic */ TextView f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            public final void run() {
                MessageForwardEnhancedView.lambda$xyLiyXCp6BFM5zPrLzhHCTHVCRk(this.f$0, this.f$1);
            }
        }, 1);
        C0689b bVar = new C0689b();
        ViewParent parent = textView.getParent();
        if (parent instanceof ConstraintLayout) {
            ConstraintLayout constraintLayout = (ConstraintLayout) parent;
            bVar.mo3901b(constraintLayout);
            bVar.mo3882a(textView.getId(), 4, textView2.getId(), 3);
            bVar.mo3882a(textView3.getId(), 3, textView2.getId(), 4);
            bVar.mo3885a(0, 3, 0, 4, new int[]{textView.getId(), textView3.getId()}, new float[]{BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED}, 2);
            bVar.mo3905c(constraintLayout);
        }
    }

    @Override // com.ss.android.lark.forward.dto.template.ForwardEnhancedView
    /* renamed from: a */
    public void mo140742a(List<ForwardTarget> list, GifImageView gifImageView, TextView textView, TextView textView2, TextView textView3, Bundle bundle) {
        Message a = m151744a(bundle);
        if (a != null && a.getType() != null) {
            switch (C384764.f98933a[a.getType().ordinal()]) {
                case 1:
                    C38364a.m151054a().mo140447i().mo140518a(textView, textView2, gifImageView, a.getContent());
                    return;
                case 2:
                    C38364a.m151054a().mo140446h().mo140461a(textView, textView2, gifImageView, a.getContent());
                    return;
                case 3:
                    C38364a.m151054a().mo140455q().mo140520a(textView, textView2, gifImageView, a.getContent());
                    return;
                case 4:
                    LocationContent locationContent = (LocationContent) a.getContent();
                    if (locationContent != null) {
                        String mustacheFormat = UIHelper.mustacheFormat((int) R.string.Lark_Chat_MessageReplyStatusLocation, "title", locationContent.getName());
                        SpannableString spannableString = new SpannableString(mustacheFormat);
                        spannableString.setSpan(new ForegroundColorSpan(ContextCompat.getColor(textView2.getContext(), R.color.primary_pri_500)), 0, mustacheFormat.indexOf("]") + 1, 33);
                        if (textView2 instanceof EllipsizedEmojiconTextView) {
                            ((EllipsizedEmojiconTextView) textView2).setShouldEllipsized(false);
                        }
                        textView2.setText(spannableString);
                        textView2.setVisibility(0);
                        return;
                    }
                    return;
                case 5:
                case 6:
                    m151747a(gifImageView, textView, textView2, textView3, a);
                    return;
                default:
                    return;
            }
        }
    }
}
