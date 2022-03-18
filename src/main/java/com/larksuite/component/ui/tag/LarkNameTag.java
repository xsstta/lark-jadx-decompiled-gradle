package com.larksuite.component.ui.tag;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.avatar.LarkAvatar;
import com.larksuite.component.ui.tag.TagsDrawable;
import com.larksuite.component.ui.tag.v2.ITagEditor;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.TypeCastException;
import kotlin.collections.C69043h;
import kotlin.collections.CollectionsKt;
import kotlin.collections.am;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \"2\u00020\u0001:\u0007\u001d\u001e\u001f !\"#B;\b\u0002\u0012\"\u0010\u0002\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0006\u0010\u0010\u001a\u00020\fJ6\u0010\u0011\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\"\u0010\u0002\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005`\u0006H\u0002J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0005H\u0002J\b\u0010\u0017\u001a\u0004\u0018\u00010\u0013J\u000e\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001cR\u000e\u0010\t\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R*\u0010\u0002\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005`\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/larksuite/component/ui/tag/LarkNameTag;", "", "stateDrawableMap", "Ljava/util/HashMap;", "Lcom/larksuite/component/ui/tag/DrawableStateSet;", "Lcom/larksuite/component/ui/tag/TagsDrawable$Builder;", "Lkotlin/collections/HashMap;", "textTagSize", "", "iconTagSize", "(Ljava/util/HashMap;FF)V", "equals", "", "other", "hashCode", "", "isEmpty", "isTagSame", "drawable", "Landroid/graphics/drawable/Drawable;", "resizeIfNeed", "", "builder", "toDrawable", "toTextRight", "view", "Landroid/widget/TextView;", "toView", "Landroid/view/View;", "AppTagBuilder", "Builder", "CalendarTagBuilder", "ChatTagBuilder", "ChatterTagBuilder", "Companion", "DocTagBuilder", "avatar-badge_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.ui.tag.d */
public final class LarkNameTag {

    /* renamed from: a */
    public static final Companion f62897a = new Companion(null);

    /* renamed from: b */
    private final HashMap<DrawableStateSet, TagsDrawable.Builder> f62898b;

    /* renamed from: c */
    private final float f62899c;

    /* renamed from: d */
    private final float f62900d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0006J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0006J\u0010\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0006H\u0007J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0006J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0006J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0006J\u0016\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0006J\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0006J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0006J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0006J\u0010\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001aH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/larksuite/component/ui/tag/LarkNameTag$ChatTagBuilder;", "Lcom/larksuite/component/ui/tag/LarkNameTag$Builder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "isApproval", "", "isBot", "isDepartment", "isDisturb", "isEdu", "isFrozen", "isMeeting", "isOfficial", "isOfficialOnCall", "isOfflineOnCall", "isOnCall", "isPublic", "isSecret", "isSuper", "isTenant", "build", "Lcom/larksuite/component/ui/tag/LarkNameTag;", "value", "isExternal", "tagProvider", "Lcom/larksuite/component/ui/tag/ITagProvider;", "Companion", "avatar-badge_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.ui.tag.d$d */
    public static final class ChatTagBuilder extends Builder {

        /* renamed from: a */
        public static final Companion f62910a = new Companion(null);

        /* renamed from: q */
        private static final List<HashSet<Integer>> f62911q = CollectionsKt.listOf((Object[]) new HashSet[]{am.m265690b(Integer.valueOf(C25694f.f62929a.mo90125a()), Integer.valueOf(C25694f.m92278a().mo90125a()), Integer.valueOf(C25694f.f62930b.mo90125a()), Integer.valueOf(C25694f.f62931c.mo90125a()), Integer.valueOf(C25694f.f62932d.mo90125a())), am.m265690b(Integer.valueOf(C25694f.f62929a.mo90125a()), Integer.valueOf(C25694f.f62939k.mo89986a()), Integer.valueOf(C25694f.m92279b().mo89986a())), am.m265690b(Integer.valueOf(C25694f.f62933e.mo90125a()), Integer.valueOf(C25694f.f62934f.mo90125a()))});

        /* renamed from: b */
        private boolean f62912b;

        /* renamed from: c */
        private boolean f62913c;

        /* renamed from: d */
        private boolean f62914d;

        /* renamed from: e */
        private boolean f62915e;

        /* renamed from: f */
        private boolean f62916f;

        /* renamed from: g */
        private boolean f62917g;

        /* renamed from: h */
        private boolean f62918h;

        /* renamed from: i */
        private boolean f62919i;

        /* renamed from: j */
        private boolean f62920j;

        /* renamed from: k */
        private boolean f62921k;

        /* renamed from: l */
        private boolean f62922l;

        /* renamed from: m */
        private boolean f62923m;

        /* renamed from: n */
        private boolean f62924n;

        /* renamed from: o */
        private boolean f62925o;

        /* renamed from: p */
        private boolean f62926p;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R$\u0010\u0003\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00070\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/larksuite/component/ui/tag/LarkNameTag$ChatTagBuilder$Companion;", "", "()V", "constraintGroups", "", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "avatar-badge_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.larksuite.component.ui.tag.d$d$a */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Override // com.larksuite.component.ui.tag.LarkNameTag.Builder
        /* renamed from: e */
        public LarkNameTag mo90027e() {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            boolean z7;
            boolean z8;
            Iterator<T> it = f62911q.iterator();
            while (it.hasNext()) {
                mo90019a((HashSet<Integer>) it.next());
            }
            TextTag g = mo90013a().mo89967g();
            boolean z9 = true;
            if (this.f62925o || this.f62913c) {
                z = true;
            } else {
                z = false;
            }
            mo89985b(g, z);
            if (this.f62914d) {
                if (this.f62915e) {
                    Builder bVar = (Builder) ITagEditor.C25691a.m92165a((ITagEditor) this, mo90013a().mo89966f(), false, 2, (Object) null);
                } else {
                    Builder bVar2 = (Builder) ITagEditor.C25691a.m92165a((ITagEditor) this, mo90013a().mo89965e(), false, 2, (Object) null);
                }
            }
            mo89984b(mo90013a().mo89962b(), this.f62917g);
            TextTag c = mo90013a().mo89963c();
            if (!this.f62916f || !LarkAvatar.f62479e.mo89061b()) {
                z2 = false;
            } else {
                z2 = true;
            }
            mo89985b(c, z2);
            TextTag d = mo90013a().mo89964d();
            if (!this.f62912b || !LarkAvatar.f62479e.mo89061b()) {
                z3 = false;
            } else {
                z3 = true;
            }
            mo89985b(d, z3);
            mo89985b(mo90013a().mo89961a(), this.f62918h);
            mo89985b(mo90013a().mo89974n(), mo90022b());
            mo89985b(mo90013a().mo89981u(), mo90024c());
            TextTag r = mo90013a().mo89978r();
            if (mo90026d() || !this.f62921k) {
                z4 = false;
            } else {
                z4 = true;
            }
            mo89985b(r, z4);
            TextTag p = mo90013a().mo89976p();
            if (mo90026d() || !this.f62919i) {
                z5 = false;
            } else {
                z5 = true;
            }
            mo89985b(p, z5);
            TextTag s = mo90013a().mo89979s();
            if (mo90026d() || !this.f62922l) {
                z6 = false;
            } else {
                z6 = true;
            }
            mo89985b(s, z6);
            IconTag h = mo90013a().mo89968h();
            if (mo90026d() || !this.f62923m) {
                z7 = false;
            } else {
                z7 = true;
            }
            mo89984b(h, z7);
            TextTag v = mo90013a().mo89982v();
            if (mo90026d() || !this.f62926p) {
                z8 = false;
            } else {
                z8 = true;
            }
            mo89985b(v, z8);
            TextTag q = mo90013a().mo89977q();
            if (mo90026d() || !this.f62920j) {
                z9 = false;
            }
            mo89985b(q, z9);
            mo89985b(mo90013a().mo89973m(), this.f62924n);
            return super.mo90027e();
        }

        /* renamed from: a */
        public final ChatTagBuilder mo90031a(boolean z) {
            ChatTagBuilder dVar = this;
            dVar.f62912b = z;
            return dVar;
        }

        /* renamed from: e */
        public final ChatTagBuilder mo90034e(boolean z) {
            ChatTagBuilder dVar = this;
            dVar.f62916f = z;
            return dVar;
        }

        /* renamed from: f */
        public final ChatTagBuilder mo90035f(boolean z) {
            ChatTagBuilder dVar = this;
            dVar.f62917g = z;
            return dVar;
        }

        /* renamed from: g */
        public final ChatTagBuilder mo90036g(boolean z) {
            ChatTagBuilder dVar = this;
            dVar.f62918h = z;
            return dVar;
        }

        @Deprecated(message = "deprecated", replaceWith = @ReplaceWith(expression = "isExternal(isCustomer, isCrossTenant, isSimpleTenant)", imports = {}))
        /* renamed from: h */
        public final ChatTagBuilder mo90037h(boolean z) {
            ChatTagBuilder dVar = this;
            dVar.mo90023c(z);
            return dVar;
        }

        /* renamed from: i */
        public final ChatTagBuilder mo90038i(boolean z) {
            ChatTagBuilder dVar = this;
            dVar.f62919i = z;
            return dVar;
        }

        /* renamed from: j */
        public final ChatTagBuilder mo90039j(boolean z) {
            ChatTagBuilder dVar = this;
            dVar.f62920j = z;
            return dVar;
        }

        /* renamed from: k */
        public final ChatTagBuilder mo90040k(boolean z) {
            ChatTagBuilder dVar = this;
            dVar.f62921k = z;
            return dVar;
        }

        /* renamed from: l */
        public final ChatTagBuilder mo90041l(boolean z) {
            ChatTagBuilder dVar = this;
            dVar.f62922l = z;
            return dVar;
        }

        /* renamed from: m */
        public final ChatTagBuilder mo90042m(boolean z) {
            ChatTagBuilder dVar = this;
            dVar.f62923m = z;
            return dVar;
        }

        /* renamed from: n */
        public final ChatTagBuilder mo90043n(boolean z) {
            ChatTagBuilder dVar = this;
            dVar.f62924n = z;
            return dVar;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ChatTagBuilder(Context context) {
            super(context);
            Intrinsics.checkParameterIsNotNull(context, "context");
        }

        /* renamed from: a */
        public ChatTagBuilder mo90012b(ITagProvider bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "tagProvider");
            ChatTagBuilder dVar = this;
            super.mo90012b(bVar);
            return dVar;
        }

        /* renamed from: b */
        public final ChatTagBuilder mo90033b(boolean z) {
            ChatTagBuilder dVar = this;
            dVar.f62925o = z;
            return dVar;
        }

        /* renamed from: a */
        public final ChatTagBuilder mo90032a(boolean z, boolean z2) {
            ChatTagBuilder dVar = this;
            dVar.f62914d = z;
            dVar.f62915e = z2;
            return dVar;
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final ChatTagBuilder m92203a(Context context) {
        return f62897a.mo90053b(context);
    }

    @JvmStatic
    /* renamed from: b */
    public static final ChatterTagBuilder m92206b(Context context) {
        return f62897a.mo90054c(context);
    }

    @JvmStatic
    /* renamed from: c */
    public static final AppTagBuilder m92207c(Context context) {
        return f62897a.mo90055d(context);
    }

    @JvmStatic
    /* renamed from: d */
    public static final DocTagBuilder m92208d(Context context) {
        return f62897a.mo90056e(context);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001e\u0010'\u001a\u00020\u00002\u0016\u0010(\u001a\u0012\u0012\u0004\u0012\u00020*0)j\b\u0012\u0004\u0012\u00020*`+J\u0018\u0010,\u001a\u00020\u00002\u0006\u0010-\u001a\u00020\u00182\u0006\u0010.\u001a\u00020/H\u0016J\u0018\u0010,\u001a\u00020\u00002\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u000eH\u0016J \u0010,\u001a\u00020\u00002\u0006\u00101\u001a\u00020*2\u0006\u00102\u001a\u00020\u00182\u0006\u00103\u001a\u00020*H\u0017J\u0018\u00104\u001a\u00020\u00002\u0006\u00102\u001a\u00020\u00182\u0006\u00105\u001a\u000206H\u0016J\u0018\u00104\u001a\u00020\u00002\u0006\u00105\u001a\u0002062\u0006\u00100\u001a\u00020\u000eH\u0016J0\u00104\u001a\u00020\u00002\u0006\u00101\u001a\u00020*2\u0006\u00102\u001a\u00020\u00182\u0006\u00107\u001a\u00020*2\u0006\u00108\u001a\u00020*2\u0006\u00109\u001a\u00020*H\u0017J(\u00104\u001a\u00020\u00002\u0006\u00101\u001a\u00020*2\u0006\u0010:\u001a\u00020;2\u0006\u00108\u001a\u00020*2\u0006\u00109\u001a\u00020*H\u0017J\b\u0010<\u001a\u00020=H\u0016J\u0010\u0010>\u001a\u00020\u00192\u0006\u00102\u001a\u00020\u0018H\u0002J#\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00180\u001c2\u000e\u0010@\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001cH\u0002¢\u0006\u0002\u0010AJ\u000e\u0010B\u001a\u00020\u00002\u0006\u0010C\u001a\u00020\u000eJ\u001e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010D\u001a\u00020\u000e2\u0006\u0010E\u001a\u00020\u000eJ\u000e\u0010F\u001a\u00020\u00002\u0006\u0010G\u001a\u00020\bJ\u0010\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u000e\u0010H\u001a\u00020\u00002\u0006\u0010G\u001a\u00020\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0014\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R*\u0010\u0016\u001a\u001e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017j\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019`\u001aX\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001cX\u000e¢\u0006\u0004\n\u0002\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u001fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\n\"\u0004\b&\u0010\f¨\u0006I"}, d2 = {"Lcom/larksuite/component/ui/tag/LarkNameTag$Builder;", "Lcom/larksuite/component/ui/tag/v2/ITagEditor;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "iconTagSize", "", "getIconTagSize", "()F", "setIconTagSize", "(F)V", "isCrossKaTenant", "", "()Z", "setCrossKaTenant", "(Z)V", "isCustomer", "setCustomer", "isExternal", "setExternal", "stateDrawableMap", "Ljava/util/LinkedHashMap;", "Lcom/larksuite/component/ui/tag/DrawableStateSet;", "Lcom/larksuite/component/ui/tag/TagsDrawable$Builder;", "Lkotlin/collections/LinkedHashMap;", "supportStateSets", "", "[Lcom/larksuite/component/ui/tag/DrawableStateSet;", "tagProvider", "Lcom/larksuite/component/ui/tag/ITagProvider;", "getTagProvider", "()Lcom/larksuite/component/ui/tag/ITagProvider;", "setTagProvider", "(Lcom/larksuite/component/ui/tag/ITagProvider;)V", "textSize", "getTextSize", "setTextSize", "addConstraintSet", "constraint", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "addIconTag", "stateSet", "iconTag", "Lcom/larksuite/component/ui/tag/IconTag;", "valid", "order", "state", "iconRes", "addTextTag", "textTag", "Lcom/larksuite/component/ui/tag/TextTag;", "textRes", "colorRes", "bgColorRes", "text", "", "build", "Lcom/larksuite/component/ui/tag/LarkNameTag;", "getDrawableBuilder", "getFullSupportStateSets", "supportSet", "([Lcom/larksuite/component/ui/tag/DrawableStateSet;)[Lcom/larksuite/component/ui/tag/DrawableStateSet;", "isCrossKA", "value", "isCrossTenant", "isSimpleTenant", "tagIconSize", "size", "tagTextSize", "avatar-badge_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.ui.tag.d$b */
    public static class Builder implements ITagEditor<Builder> {

        /* renamed from: a */
        private ITagProvider f62901a;

        /* renamed from: b */
        private DrawableStateSet[] f62902b;

        /* renamed from: c */
        private final LinkedHashMap<DrawableStateSet, TagsDrawable.Builder> f62903c = new LinkedHashMap<>(2);

        /* renamed from: d */
        private boolean f62904d;

        /* renamed from: e */
        private boolean f62905e;

        /* renamed from: f */
        private boolean f62906f;

        /* renamed from: g */
        private float f62907g;

        /* renamed from: h */
        private float f62908h;

        /* renamed from: i */
        private final Context f62909i;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final ITagProvider mo90013a() {
            return this.f62901a;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final boolean mo90022b() {
            return this.f62904d;
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public final boolean mo90026d() {
            return this.f62906f;
        }

        /* renamed from: a */
        public final Builder mo90020a(boolean z, boolean z2, boolean z3) {
            Builder bVar = this;
            bVar.f62906f = z;
            bVar.f62904d = z2 && !z && !z3;
            return bVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public final boolean mo90024c() {
            return this.f62905e;
        }

        /* renamed from: e */
        public LarkNameTag mo90027e() {
            return new LarkNameTag(this.f62903c, this.f62907g, this.f62908h, null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public final void mo90023c(boolean z) {
            this.f62904d = z;
        }

        /* renamed from: a */
        public final Builder mo90014a(float f) {
            Builder bVar = this;
            bVar.f62907g = f;
            return bVar;
        }

        /* renamed from: d */
        public final Builder mo90025d(boolean z) {
            Builder bVar = this;
            bVar.f62905e = z;
            return bVar;
        }

        /* renamed from: a */
        private final TagsDrawable.Builder m92217a(DrawableStateSet drawableStateSet) {
            LinkedHashMap<DrawableStateSet, TagsDrawable.Builder> linkedHashMap = this.f62903c;
            TagsDrawable.Builder aVar = linkedHashMap.get(drawableStateSet);
            if (aVar == null) {
                aVar = new TagsDrawable.Builder(this.f62909i);
                linkedHashMap.put(drawableStateSet, aVar);
            }
            return aVar;
        }

        /* renamed from: b */
        public final Builder mo90021b(float f) {
            Builder bVar = this;
            bVar.f62908h = f;
            return bVar;
        }

        public Builder(Context context) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            this.f62909i = context;
            DefaultTagProvider aVar = new DefaultTagProvider();
            this.f62901a = aVar;
            this.f62902b = m92218a(aVar.mo89983w());
        }

        /* renamed from: a */
        private final DrawableStateSet[] m92218a(DrawableStateSet[] drawableStateSetArr) {
            boolean z;
            if (drawableStateSetArr != null) {
                if (drawableStateSetArr.length == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    return (DrawableStateSet[]) C69043h.m265726a((Object[]) drawableStateSetArr, (Object[]) new DrawableStateSet[]{DrawableStateSet.EMPTY});
                }
            }
            return new DrawableStateSet[]{DrawableStateSet.EMPTY};
        }

        /* renamed from: b */
        public Builder mo90012b(ITagProvider bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "tagProvider");
            Builder bVar2 = this;
            bVar2.f62901a = bVar;
            bVar2.f62902b = bVar2.m92218a(bVar.mo89983w());
            return bVar2;
        }

        /* renamed from: a */
        public final Builder mo90019a(HashSet<Integer> hashSet) {
            Intrinsics.checkParameterIsNotNull(hashSet, "constraint");
            Builder bVar = this;
            DrawableStateSet[] drawableStateSetArr = bVar.f62902b;
            if (drawableStateSetArr != null) {
                for (DrawableStateSet drawableStateSet : drawableStateSetArr) {
                    bVar.m92217a(drawableStateSet).mo90078a(hashSet);
                }
            }
            return bVar;
        }

        /* renamed from: a */
        public Builder mo90015a(DrawableStateSet drawableStateSet, IconTag cVar) {
            Intrinsics.checkParameterIsNotNull(drawableStateSet, "stateSet");
            Intrinsics.checkParameterIsNotNull(cVar, "iconTag");
            Builder bVar = this;
            bVar.m92217a(drawableStateSet).mo90077a(new TagsDrawable.TagModel.Builder(bVar.f62909i).mo90113a(cVar.mo89986a()).mo90117b(cVar.mo89988b()).mo90114a(cVar.mo89987a(bVar.f62909i, drawableStateSet)).mo90124g());
            return bVar;
        }

        /* renamed from: a */
        public Builder mo90016a(DrawableStateSet drawableStateSet, TextTag hVar) {
            Intrinsics.checkParameterIsNotNull(drawableStateSet, "state");
            Intrinsics.checkParameterIsNotNull(hVar, "textTag");
            Builder bVar = this;
            bVar.m92217a(drawableStateSet).mo90077a(new TagsDrawable.TagModel.Builder(bVar.f62909i).mo90113a(hVar.mo90125a()).mo90117b(hVar.mo90128b()).mo90115a(hVar.mo90127a(bVar.f62909i)).mo90121d(hVar.mo90126a(bVar.f62909i, drawableStateSet)).mo90118c(hVar.mo90129b(bVar.f62909i, drawableStateSet)).mo90124g());
            return bVar;
        }

        /* renamed from: a */
        public Builder mo89984b(IconTag cVar, boolean z) {
            DrawableStateSet[] drawableStateSetArr;
            Intrinsics.checkParameterIsNotNull(cVar, "iconTag");
            Builder bVar = this;
            if (z && (drawableStateSetArr = bVar.f62902b) != null) {
                for (DrawableStateSet drawableStateSet : drawableStateSetArr) {
                    bVar.mo90015a(drawableStateSet, cVar);
                }
            }
            return bVar;
        }

        /* renamed from: a */
        public Builder mo89985b(TextTag hVar, boolean z) {
            DrawableStateSet[] drawableStateSetArr;
            Intrinsics.checkParameterIsNotNull(hVar, "textTag");
            Builder bVar = this;
            if (z && (drawableStateSetArr = bVar.f62902b) != null) {
                for (DrawableStateSet drawableStateSet : drawableStateSetArr) {
                    bVar.mo90016a(drawableStateSet, hVar);
                }
            }
            return bVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0011"}, d2 = {"Lcom/larksuite/component/ui/tag/LarkNameTag$Companion;", "", "()V", "appTag", "Lcom/larksuite/component/ui/tag/LarkNameTag$AppTagBuilder;", "context", "Landroid/content/Context;", "calendarTag", "Lcom/larksuite/component/ui/tag/LarkNameTag$CalendarTagBuilder;", "chatTag", "Lcom/larksuite/component/ui/tag/LarkNameTag$ChatTagBuilder;", "chatterTag", "Lcom/larksuite/component/ui/tag/LarkNameTag$ChatterTagBuilder;", "docTag", "Lcom/larksuite/component/ui/tag/LarkNameTag$DocTagBuilder;", "normalTag", "Lcom/larksuite/component/ui/tag/LarkNameTag$Builder;", "avatar-badge_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.ui.tag.d$f */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final Builder mo90052a(Context context) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            return new Builder(context);
        }

        @JvmStatic
        /* renamed from: b */
        public final ChatTagBuilder mo90053b(Context context) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            return new ChatTagBuilder(context);
        }

        @JvmStatic
        /* renamed from: c */
        public final ChatterTagBuilder mo90054c(Context context) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            return new ChatterTagBuilder(context);
        }

        @JvmStatic
        /* renamed from: d */
        public final AppTagBuilder mo90055d(Context context) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            return new AppTagBuilder(context);
        }

        @JvmStatic
        /* renamed from: e */
        public final DocTagBuilder mo90056e(Context context) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            return new DocTagBuilder(context);
        }

        @JvmStatic
        /* renamed from: f */
        public final CalendarTagBuilder mo90057f(Context context) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            return new CalendarTagBuilder(context);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Lcom/larksuite/component/ui/tag/LarkNameTag$DocTagBuilder;", "Lcom/larksuite/component/ui/tag/LarkNameTag$Builder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "build", "Lcom/larksuite/component/ui/tag/LarkNameTag;", "isExternal", "value", "", "tagProvider", "Lcom/larksuite/component/ui/tag/ITagProvider;", "avatar-badge_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.ui.tag.d$g */
    public static final class DocTagBuilder extends Builder {
        @Override // com.larksuite.component.ui.tag.LarkNameTag.Builder
        /* renamed from: e */
        public LarkNameTag mo90027e() {
            if (mo90022b()) {
                Builder bVar = (Builder) ITagEditor.C25691a.m92166a((ITagEditor) this, mo90013a().mo89974n(), false, 2, (Object) null);
            }
            return super.mo90027e();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public DocTagBuilder(Context context) {
            super(context);
            Intrinsics.checkParameterIsNotNull(context, "context");
        }

        /* renamed from: a */
        public DocTagBuilder mo90012b(ITagProvider bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "tagProvider");
            DocTagBuilder gVar = this;
            super.mo90012b(bVar);
            return gVar;
        }

        @Deprecated(message = "deprecated", replaceWith = @ReplaceWith(expression = "isExternal(isCustomer, isCrossTenant, isSimpleTenant)", imports = {}))
        /* renamed from: a */
        public final DocTagBuilder mo90059a(boolean z) {
            DocTagBuilder gVar = this;
            Builder bVar = (Builder) ITagEditor.C25691a.m92166a((ITagEditor) gVar, gVar.mo90013a().mo89974n(), false, 2, (Object) null);
            return gVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\n\u001a\u00020\u000bH\u0016J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010\u0010\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R$\u0010\u0005\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t0\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/larksuite/component/ui/tag/LarkNameTag$ChatterTagBuilder;", "Lcom/larksuite/component/ui/tag/LarkNameTag$Builder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "constraintGroups", "", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "build", "Lcom/larksuite/component/ui/tag/LarkNameTag;", "isBot", "value", "", "isDisturb", "isExternal", "isFrozen", "isGroupOwner", "isOnLevel", "isTeamOwner", "isUnregistered", "tagProvider", "Lcom/larksuite/component/ui/tag/ITagProvider;", "avatar-badge_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.ui.tag.d$e */
    public static final class ChatterTagBuilder extends Builder {

        /* renamed from: a */
        private final List<HashSet<Integer>> f62927a = CollectionsKt.listOf(am.m265690b(Integer.valueOf(C25694f.m92281d().mo90125a()), Integer.valueOf(C25694f.f62941m.mo90125a()), Integer.valueOf(C25694f.m92280c().mo90125a()), Integer.valueOf(C25694f.f62940l.mo89986a())));

        @Override // com.larksuite.component.ui.tag.LarkNameTag.Builder
        /* renamed from: e */
        public LarkNameTag mo90027e() {
            Iterator<T> it = this.f62927a.iterator();
            while (it.hasNext()) {
                mo90019a((HashSet<Integer>) it.next());
            }
            if (mo90024c()) {
                mo89985b(mo90013a().mo89975o(), true);
            } else if (mo90022b()) {
                mo89985b(mo90013a().mo89974n(), true);
            }
            return super.mo90027e();
        }

        @Deprecated(message = "deprecated", replaceWith = @ReplaceWith(expression = "isExternal(isCustomer, isCrossTenant, isSimpleTenant)", imports = {}))
        /* renamed from: i */
        public final ChatterTagBuilder mo90051i(boolean z) {
            ChatterTagBuilder eVar = this;
            eVar.mo90023c(z);
            return eVar;
        }

        /* renamed from: a */
        public ChatterTagBuilder mo90012b(ITagProvider bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "tagProvider");
            ChatterTagBuilder eVar = this;
            super.mo90012b(bVar);
            return eVar;
        }

        /* renamed from: b */
        public final ChatterTagBuilder mo90046b(boolean z) {
            ChatterTagBuilder eVar = this;
            eVar.mo89984b(eVar.mo90013a().mo89968h(), z);
            return eVar;
        }

        /* renamed from: e */
        public final ChatterTagBuilder mo90047e(boolean z) {
            ChatterTagBuilder eVar = this;
            eVar.mo89985b(eVar.mo90013a().mo89973m(), z);
            return eVar;
        }

        /* renamed from: f */
        public final ChatterTagBuilder mo90048f(boolean z) {
            ChatterTagBuilder eVar = this;
            eVar.mo89985b(eVar.mo90013a().mo89970j(), z);
            return eVar;
        }

        /* renamed from: g */
        public final ChatterTagBuilder mo90049g(boolean z) {
            ChatterTagBuilder eVar = this;
            eVar.mo89985b(eVar.mo90013a().mo89971k(), z);
            return eVar;
        }

        /* renamed from: h */
        public final ChatterTagBuilder mo90050h(boolean z) {
            ChatterTagBuilder eVar = this;
            eVar.mo89985b(eVar.mo90013a().mo89972l(), z);
            return eVar;
        }

        /* renamed from: a */
        public final ChatterTagBuilder mo90045a(boolean z) {
            ChatterTagBuilder eVar = this;
            eVar.mo89985b(eVar.mo90013a().mo89961a(), z);
            return eVar;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ChatterTagBuilder(Context context) {
            super(context);
            Intrinsics.checkParameterIsNotNull(context, "context");
        }
    }

    /* renamed from: b */
    public final Drawable mo90006b() {
        MyStateListDrawable eVar = null;
        for (Map.Entry<DrawableStateSet, TagsDrawable.Builder> entry : this.f62898b.entrySet()) {
            DrawableStateSet key = entry.getKey();
            TagsDrawable.Builder value = entry.getValue();
            m92204a(value);
            TagsDrawable g = value.mo90087g();
            if (g != null) {
                if (eVar == null) {
                    eVar = new MyStateListDrawable();
                }
                if (eVar == null) {
                    Intrinsics.throwNpe();
                }
                eVar.setBounds(g.getBounds());
                if (eVar == null) {
                    Intrinsics.throwNpe();
                }
                eVar.addState(key.getStateSet(), g);
            }
        }
        return eVar;
    }

    public int hashCode() {
        int i = 0;
        for (Map.Entry<DrawableStateSet, TagsDrawable.Builder> entry : this.f62898b.entrySet()) {
            i += entry.getValue().hashCode() << entry.getKey().ordinal();
        }
        return i + Float.valueOf(this.f62899c).hashCode() + Float.valueOf(this.f62900d).hashCode();
    }

    /* renamed from: a */
    public final boolean mo90005a() {
        for (Map.Entry<DrawableStateSet, TagsDrawable.Builder> entry : this.f62898b.entrySet()) {
            if (!entry.getValue().mo90086f().isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/larksuite/component/ui/tag/LarkNameTag$AppTagBuilder;", "Lcom/larksuite/component/ui/tag/LarkNameTag$Builder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "isApp", "value", "", "isBot", "tagProvider", "Lcom/larksuite/component/ui/tag/ITagProvider;", "avatar-badge_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.ui.tag.d$a */
    public static final class AppTagBuilder extends Builder {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public AppTagBuilder(Context context) {
            super(context);
            Intrinsics.checkParameterIsNotNull(context, "context");
        }

        /* renamed from: a */
        public AppTagBuilder mo90012b(ITagProvider bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "tagProvider");
            AppTagBuilder aVar = this;
            super.mo90012b(bVar);
            return aVar;
        }

        /* renamed from: b */
        public final AppTagBuilder mo90011b(boolean z) {
            AppTagBuilder aVar = this;
            aVar.mo89985b(aVar.mo90013a().mo89961a(), z);
            return aVar;
        }

        /* renamed from: a */
        public final AppTagBuilder mo90010a(boolean z) {
            boolean z2;
            AppTagBuilder aVar = this;
            TextTag t = aVar.mo90013a().mo89980t();
            if (!z || LarkAvatar.f62479e.mo89061b()) {
                z2 = false;
            } else {
                z2 = true;
            }
            aVar.mo89985b(t, z2);
            return aVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/larksuite/component/ui/tag/LarkNameTag$CalendarTagBuilder;", "Lcom/larksuite/component/ui/tag/LarkNameTag$Builder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "isExternal", "", "tagProvider", "Lcom/larksuite/component/ui/tag/ITagProvider;", "avatar-badge_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.ui.tag.d$c */
    public static final class CalendarTagBuilder extends Builder {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public CalendarTagBuilder(Context context) {
            super(context);
            Intrinsics.checkParameterIsNotNull(context, "context");
        }

        /* renamed from: a */
        public CalendarTagBuilder mo90012b(ITagProvider bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "tagProvider");
            CalendarTagBuilder cVar = this;
            super.mo90012b(bVar);
            return cVar;
        }

        /* renamed from: a */
        public final CalendarTagBuilder mo90029a(boolean z) {
            CalendarTagBuilder cVar = this;
            cVar.mo89985b(cVar.mo90013a().mo89974n(), z);
            return cVar;
        }
    }

    /* renamed from: a */
    private final void m92204a(TagsDrawable.Builder aVar) {
        float f = this.f62899c;
        if (f != BitmapDescriptorFactory.HUE_RED) {
            aVar.mo90079a(f);
        }
        float f2 = this.f62900d;
        if (f2 != BitmapDescriptorFactory.HUE_RED) {
            aVar.mo90081b(f2);
        }
    }

    /* renamed from: a */
    public final void mo90003a(View view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        if (!m92205a(view.getBackground(), this.f62898b)) {
            view.setBackground(mo90006b());
        }
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.areEqual(cls2, cls)) {
            return false;
        }
        if (obj != null) {
            LarkNameTag dVar = (LarkNameTag) obj;
            if (!(this.f62899c == dVar.f62899c && this.f62900d == dVar.f62900d)) {
                return false;
            }
            if (dVar.f62898b.size() == this.f62898b.size()) {
                for (Map.Entry<DrawableStateSet, TagsDrawable.Builder> entry : this.f62898b.entrySet()) {
                    if (!Intrinsics.areEqual(dVar.f62898b.get(entry.getKey()), entry.getValue())) {
                        return false;
                    }
                }
            }
            return true;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.larksuite.component.ui.tag.LarkNameTag");
    }

    /* renamed from: a */
    public final void mo90004a(TextView textView) {
        Intrinsics.checkParameterIsNotNull(textView, "view");
        Drawable[] compoundDrawables = textView.getCompoundDrawables();
        Intrinsics.checkExpressionValueIsNotNull(compoundDrawables, "view.compoundDrawables");
        if (!m92205a(compoundDrawables[2], this.f62898b)) {
            textView.setCompoundDrawablePadding(15);
            textView.setCompoundDrawables(compoundDrawables[0], compoundDrawables[1], mo90006b(), compoundDrawables[3]);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m92205a(android.graphics.drawable.Drawable r6, java.util.HashMap<com.larksuite.component.ui.tag.DrawableStateSet, com.larksuite.component.ui.tag.TagsDrawable.Builder> r7) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.larksuite.component.ui.tag.MyStateListDrawable
            r1 = 0
            if (r0 == 0) goto L_0x004f
            com.larksuite.component.ui.tag.e r6 = (com.larksuite.component.ui.tag.MyStateListDrawable) r6
            int r0 = r6.mo90060a()
            int r2 = r7.size()
            if (r0 != r2) goto L_0x004f
            java.util.Map r7 = (java.util.Map) r7
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L_0x001b:
            boolean r0 = r7.hasNext()
            r2 = 1
            if (r0 == 0) goto L_0x004e
            java.lang.Object r0 = r7.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r3 = r0.getKey()
            com.larksuite.component.ui.tag.DrawableStateSet r3 = (com.larksuite.component.ui.tag.DrawableStateSet) r3
            java.lang.Object r0 = r0.getValue()
            com.larksuite.component.ui.tag.g$a r0 = (com.larksuite.component.ui.tag.TagsDrawable.Builder) r0
            int[] r3 = r3.getStateSet()
            android.graphics.drawable.Drawable r3 = r6.mo90061a(r3)
            boolean r4 = r3 instanceof com.larksuite.component.ui.tag.TagsDrawable
            if (r4 == 0) goto L_0x004d
            com.larksuite.component.ui.tag.g r3 = (com.larksuite.component.ui.tag.TagsDrawable) r3
            com.larksuite.component.ui.tag.g$a r3 = r3.mo90067a()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r0)
            r0 = r0 ^ r2
            if (r0 == 0) goto L_0x001b
        L_0x004d:
            return r1
        L_0x004e:
            return r2
        L_0x004f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.larksuite.component.ui.tag.LarkNameTag.m92205a(android.graphics.drawable.Drawable, java.util.HashMap):boolean");
    }

    private LarkNameTag(HashMap<DrawableStateSet, TagsDrawable.Builder> hashMap, float f, float f2) {
        this.f62898b = hashMap;
        this.f62899c = f;
        this.f62900d = f2;
    }

    public /* synthetic */ LarkNameTag(HashMap hashMap, float f, float f2, DefaultConstructorMarker defaultConstructorMarker) {
        this(hashMap, f, f2);
    }
}
