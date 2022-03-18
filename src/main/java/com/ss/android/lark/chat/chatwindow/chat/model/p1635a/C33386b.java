package com.ss.android.lark.chat.chatwindow.chat.model.p1635a;

import android.text.TextUtils;
import com.ss.android.lark.chat.chatwindow.chat.model.C33410f;
import com.ss.android.lark.chat.entity.message.AbstractC34006a;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.AudioContent;
import com.ss.android.lark.chatbase.AbstractC34417b;
import com.ss.android.lark.chatbase.p1688b.AbstractC34432b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.model.a.b */
public class C33386b {
    /* renamed from: a */
    public static List<AbstractC34417b.AbstractC34426h<String, AbstractC34006a>> m129359a(Collection<AbstractC34006a> collection) {
        ArrayList arrayList = new ArrayList();
        for (final AbstractC34006a aVar : collection) {
            arrayList.add(new AbstractC34417b.AbstractC34426h<String, AbstractC34006a>() {
                /* class com.ss.android.lark.chat.chatwindow.chat.model.p1635a.C33386b.C333871 */

                @Override // com.ss.android.lark.chatbase.AbstractC34417b.AbstractC34426h
                /* renamed from: b */
                public AbstractC34432b.AbstractC34434b<AbstractC34006a> mo122919b() {
                    return new AbstractC34432b.C34433a<AbstractC34006a>(aVar) {
                        /* class com.ss.android.lark.chat.chatwindow.chat.model.p1635a.C33386b.C333871.C333881 */

                        /* renamed from: a */
                        public AbstractC34006a doUpdate(AbstractC34006a aVar) {
                            if (aVar == null) {
                                return (AbstractC34006a) this.f88910b;
                            }
                            Message.Type type = aVar.getMessage().getType();
                            if (((AbstractC34006a) this.f88910b).getMessage().getType() == type) {
                                if (type == Message.Type.AUDIO) {
                                    AudioContent audioContent = (AudioContent) aVar.getMessage().getContent();
                                    AudioContent audioContent2 = (AudioContent) ((AbstractC34006a) this.f88910b).getMessage().getContent();
                                    if (TextUtils.isEmpty(audioContent2.getLocalFilePath())) {
                                        audioContent2.setLocalFilePath(audioContent.getLocalFilePath());
                                        audioContent2.setAudioWaveBytes(audioContent.getAudioWaveBytes());
                                    }
                                } else if (type == Message.Type.POST || type == Message.Type.TEXT || type == Message.Type.IMAGE || type == Message.Type.MERGE_FORWARD) {
                                    if (((AbstractC34006a) this.f88910b).getTranslateInfo() == null) {
                                        ((AbstractC34006a) this.f88910b).setTranslateInfo(aVar.getTranslateInfo());
                                        C33386b.m129360a(((AbstractC34006a) this.f88910b).getMessage(), aVar.getMessage());
                                    }
                                    if (!((AbstractC34006a) this.f88910b).isTranslatingInited()) {
                                        ((AbstractC34006a) this.f88910b).setIsTranslating(aVar.isTranslating());
                                    }
                                }
                            }
                            return (AbstractC34006a) this.f88910b;
                        }
                    };
                }

                @Override // com.ss.android.lark.chatbase.AbstractC34417b.AbstractC34426h
                /* renamed from: a */
                public AbstractC34417b.AbstractC34421c<String> mo122918a() {
                    return new C33410f(aVar.getMessage());
                }
            });
        }
        return arrayList;
    }

    /* renamed from: b */
    public static List<AbstractC34417b.AbstractC34426h<String, AbstractC34006a>> m129361b(Collection<AbstractC34006a> collection) {
        ArrayList arrayList = new ArrayList();
        for (final AbstractC34006a aVar : collection) {
            arrayList.add(new AbstractC34417b.AbstractC34426h<String, AbstractC34006a>() {
                /* class com.ss.android.lark.chat.chatwindow.chat.model.p1635a.C33386b.C333903 */

                @Override // com.ss.android.lark.chatbase.AbstractC34417b.AbstractC34426h
                /* renamed from: b */
                public AbstractC34432b.AbstractC34434b<AbstractC34006a> mo122919b() {
                    return new AbstractC34432b.AbstractC34435c<AbstractC34006a>() {
                        /* class com.ss.android.lark.chat.chatwindow.chat.model.p1635a.C33386b.C333903.C333911 */

                        /* access modifiers changed from: protected */
                        /* renamed from: a */
                        public AbstractC34006a mo122917a(AbstractC34006a aVar) {
                            AbstractC34006a clone = aVar.clone();
                            if (clone == null) {
                                return null;
                            }
                            clone.setTranslateInfo(aVar.getTranslateInfo());
                            clone.setIsTranslating(aVar.isTranslating());
                            clone.setNeedToAutoTranslate(aVar.isNeedToAutoTranslate());
                            clone.setMessage(aVar.getMessage());
                            return clone;
                        }
                    };
                }

                @Override // com.ss.android.lark.chatbase.AbstractC34417b.AbstractC34426h
                /* renamed from: a */
                public AbstractC34417b.AbstractC34421c<String> mo122918a() {
                    return new AbstractC34417b.C34425g(aVar.getId());
                }
            });
        }
        return arrayList;
    }

    /* renamed from: c */
    public static List<AbstractC34417b.AbstractC34426h<String, AbstractC34006a>> m129362c(Collection<AbstractC34006a> collection) {
        ArrayList arrayList = new ArrayList();
        for (final AbstractC34006a aVar : collection) {
            arrayList.add(new AbstractC34417b.AbstractC34426h<String, AbstractC34006a>() {
                /* class com.ss.android.lark.chat.chatwindow.chat.model.p1635a.C33386b.C333924 */

                @Override // com.ss.android.lark.chatbase.AbstractC34417b.AbstractC34426h
                /* renamed from: b */
                public AbstractC34432b.AbstractC34434b<AbstractC34006a> mo122919b() {
                    return new AbstractC34417b.AbstractC34424f<AbstractC34006a>() {
                        /* class com.ss.android.lark.chat.chatwindow.chat.model.p1635a.C33386b.C333924.C333931 */

                        /* access modifiers changed from: protected */
                        @Override // com.ss.android.lark.chatbase.AbstractC34417b.AbstractC34424f
                        /* renamed from: a */
                        public AbstractC34006a mo122923a(AbstractC34006a aVar) {
                            AbstractC34006a clone = aVar.clone();
                            if (clone.getMessage().getType() == Message.Type.AUDIO && aVar.getMessage().getType() == Message.Type.AUDIO) {
                                AudioContent audioContent = (AudioContent) aVar.getMessage().getContent();
                                if (!TextUtils.isEmpty(audioContent.getLocalFilePath())) {
                                    ((AudioContent) clone.getMessage().getContent()).setLocalFilePath(audioContent.getLocalFilePath());
                                    ((AudioContent) clone.getMessage().getContent()).setAudioWaveBytes(audioContent.getAudioWaveBytes());
                                }
                                ((AudioContent) clone.getMessage().getContent()).setFileState(audioContent.getFileState());
                            }
                            return clone;
                        }
                    };
                }

                @Override // com.ss.android.lark.chatbase.AbstractC34417b.AbstractC34426h
                /* renamed from: a */
                public AbstractC34417b.AbstractC34421c<String> mo122918a() {
                    return new AbstractC34417b.C34425g(aVar.getId());
                }
            });
        }
        return arrayList;
    }

    /* renamed from: a */
    public static List<AbstractC34417b.AbstractC34426h<String, AbstractC34006a>> m129358a(final AbstractC34417b.AbstractC34421c<String> cVar, final AbstractC34432b.AbstractC34434b<AbstractC34006a> bVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new AbstractC34417b.AbstractC34426h<String, AbstractC34006a>() {
            /* class com.ss.android.lark.chat.chatwindow.chat.model.p1635a.C33386b.C333892 */

            @Override // com.ss.android.lark.chatbase.AbstractC34417b.AbstractC34426h
            /* renamed from: a */
            public AbstractC34417b.AbstractC34421c<String> mo122918a() {
                return cVar;
            }

            @Override // com.ss.android.lark.chatbase.AbstractC34417b.AbstractC34426h
            /* renamed from: b */
            public AbstractC34432b.AbstractC34434b<AbstractC34006a> mo122919b() {
                return bVar;
            }
        });
        return arrayList;
    }

    /* renamed from: a */
    public static void m129360a(Message message, Message message2) {
        if (message != null && message2 != null) {
            message.setTranslateLanguage(message2.getTranslateLanguage());
            message.setTranslateDisplayRule(message2.getTranslateDisplayRule());
            message.setTranslatedManually(message2.isTranslatedManually());
        }
    }
}
