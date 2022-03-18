package com.ss.android.lark.integrator.im.chat.dependency;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.lark.biz.core.api.FavoriteForwardData;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.favorite.FavoriteMessageInfo;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.mergeforward.IForwardSelectContract;
import com.ss.android.lark.dependency.IForwardDependency;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.forward.dto.template.IForwardSelectListener;
import com.ss.android.lark.integrator.im.C39603g;
import com.ss.android.lark.integrator.im.p2023c.C39452a;
import java.util.ArrayList;

class ForwardDependency implements IForwardDependency {
    @Override // com.ss.android.lark.dependency.IForwardDependency
    /* renamed from: a */
    public int mo134366a() {
        return 7;
    }

    ForwardDependency() {
    }

    /* access modifiers changed from: private */
    public static class ForwardSelectListener implements IForwardSelectListener {
        public static final Parcelable.Creator<ForwardSelectListener> CREATOR = new Parcelable.Creator<ForwardSelectListener>() {
            /* class com.ss.android.lark.integrator.im.chat.dependency.ForwardDependency.ForwardSelectListener.C394871 */

            /* renamed from: a */
            public ForwardSelectListener[] newArray(int i) {
                return new ForwardSelectListener[0];
            }

            /* renamed from: a */
            public ForwardSelectListener createFromParcel(Parcel parcel) {
                return new ForwardSelectListener(parcel);
            }
        };

        /* renamed from: a */
        private final IForwardSelectContract f100902a;

        public int describeContents() {
            return 0;
        }

        protected ForwardSelectListener(Parcel parcel) {
            this.f100902a = (IForwardSelectContract) parcel.readParcelable(ForwardSelectListener.class.getClassLoader());
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f100902a, i);
        }
    }

    @Override // com.ss.android.lark.dependency.IForwardDependency
    /* renamed from: a */
    public void mo134367a(Context context, Chat chat) {
        C39452a.m155775a().mo127231a(context, chat, 1, (String) null);
    }

    @Override // com.ss.android.lark.dependency.IForwardDependency
    /* renamed from: a */
    public void mo134370a(Context context, Message message, String str, String str2) {
        C39603g.m157159a().getCoreDependency().mo143431a(context, message, str, str2);
    }

    @Override // com.ss.android.lark.dependency.IForwardDependency
    /* renamed from: a */
    public void mo134371a(Context context, Message message, String str, String str2, String str3) {
        C39603g.m157159a().getCoreDependency().mo143432a(context, message, str, str2, str3);
    }

    @Override // com.ss.android.lark.dependency.IForwardDependency
    /* renamed from: a */
    public void mo134369a(Context context, FavoriteMessageInfo favoriteMessageInfo, int i, String str, boolean z, int i2) {
        FavoriteForwardData favoriteForwardData = new FavoriteForwardData();
        favoriteForwardData.setId(favoriteMessageInfo.getId());
        favoriteForwardData.setSourceMessage(favoriteMessageInfo.getSourceMessage());
        favoriteForwardData.setForceStandAlone(z);
        C39603g.m157159a().getCoreDependency().mo143426a(context, favoriteForwardData, i, str, i2);
    }

    @Override // com.ss.android.lark.dependency.IForwardDependency
    /* renamed from: a */
    public void mo134368a(Context context, Chat chat, ArrayList<String> arrayList, String str, int i, String str2, String str3) {
        C39603g.m157159a().getCoreDependency().mo143429a(context, chat, arrayList, str, i, str2, str3);
    }

    @Override // com.ss.android.lark.dependency.IForwardDependency
    /* renamed from: a */
    public void mo134372a(Context context, C36516a aVar, Chat chat, ArrayList<String> arrayList, int i, String str, String str2, String str3) {
        C39603g.m157159a().getCoreDependency().mo143434a(context, aVar, chat, arrayList, i, str, str2, str3);
    }

    @Override // com.ss.android.lark.dependency.IForwardDependency
    /* renamed from: a */
    public void mo134373a(Context context, C36516a aVar, Chat chat, ArrayList<String> arrayList, int i, String str, String str2, boolean z, String str3) {
        C39603g.m157159a().getCoreDependency().mo143435a(context, aVar, chat, arrayList, i, str, str2, z, str3);
    }
}
