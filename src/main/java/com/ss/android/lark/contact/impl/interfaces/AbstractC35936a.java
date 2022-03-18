package com.ss.android.lark.contact.impl.interfaces;

import com.bytedance.lark.pb.basic.v1.DeniedReason;
import com.bytedance.lark.pb.basic.v1.SyncDataStrategy;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.contact.dto.C35393d;
import com.ss.android.lark.contact.dto.ChatApplication;
import com.ss.android.lark.contact.dto.SchoolContactStructureResponse;
import com.ss.android.lark.contact.impl.entity.ContactEntriesResult;
import com.ss.android.lark.contact.impl.entity.ExternalContact;
import com.ss.android.lark.contact.p1735d.AbstractC35389d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.ss.android.lark.contact.impl.interfaces.a */
public interface AbstractC35936a extends AbstractC35389d {
    /* renamed from: a */
    C35939c mo132136a(String str, String str2, int i);

    /* renamed from: a */
    void mo132138a(int i, IGetDataCallback<List<Chat>> iGetDataCallback);

    /* renamed from: a */
    void mo132139a(long j, int i, IGetDataCallback<C35393d> iGetDataCallback);

    /* renamed from: a */
    void mo132140a(IGetDataCallback<C35937a> iGetDataCallback);

    /* renamed from: a */
    void mo132141a(IGetDataCallback<ContactEntriesResult> iGetDataCallback, SyncDataStrategy syncDataStrategy);

    /* renamed from: a */
    void mo132143a(String str, int i, IGetDataCallback<C35940d> iGetDataCallback);

    /* renamed from: a */
    void mo132145a(String str, IGetDataCallback<Boolean> iGetDataCallback);

    /* renamed from: a */
    void mo132146a(String str, String str2, int i, int i2, IGetDataCallback<C35939c> iGetDataCallback);

    /* renamed from: a */
    void mo132147a(String str, String str2, int i, IGetDataCallback<C35939c> iGetDataCallback);

    /* renamed from: a */
    void mo132149a(boolean z, IGetDataCallback<SchoolContactStructureResponse> iGetDataCallback);

    /* renamed from: b */
    void mo132150b(long j, int i, IGetDataCallback<C35393d> iGetDataCallback);

    /* renamed from: com.ss.android.lark.contact.impl.interfaces.a$a */
    public static class C35937a {

        /* renamed from: a */
        private int f92910a;

        /* renamed from: b */
        private int f92911b;

        /* renamed from: a */
        public int mo132215a() {
            return this.f92911b;
        }

        /* renamed from: b */
        public void mo132217b(int i) {
            this.f92911b = i;
        }

        /* renamed from: a */
        public void mo132216a(int i) {
            this.f92910a = i;
        }
    }

    /* renamed from: com.ss.android.lark.contact.impl.interfaces.a$b */
    public static class C35938b {

        /* renamed from: a */
        private Map<String, Chat> f92912a;

        /* renamed from: b */
        private List<ChatApplication> f92913b;

        /* renamed from: c */
        private boolean f92914c;

        /* renamed from: a */
        public List<ChatApplication> mo132218a() {
            return this.f92913b;
        }

        /* renamed from: b */
        public boolean mo132222b() {
            return this.f92914c;
        }

        /* renamed from: a */
        public void mo132219a(List<ChatApplication> list) {
            this.f92913b = list;
        }

        /* renamed from: a */
        public void mo132220a(Map<String, Chat> map) {
            this.f92912a = map;
        }

        /* renamed from: a */
        public void mo132221a(boolean z) {
            this.f92914c = z;
        }
    }

    /* renamed from: com.ss.android.lark.contact.impl.interfaces.a$c */
    public static class C35939c {

        /* renamed from: a */
        private List<ExternalContact> f92915a = new ArrayList();

        /* renamed from: b */
        private Map<String, Chat> f92916b = new HashMap();

        /* renamed from: c */
        private Map<String, Chatter> f92917c = new HashMap();

        /* renamed from: d */
        private Map<String, String> f92918d = new HashMap();

        /* renamed from: e */
        private Set<String> f92919e = new HashSet();

        /* renamed from: f */
        private boolean f92920f = false;

        /* renamed from: g */
        private Map<String, DeniedReason> f92921g = new HashMap();

        /* renamed from: a */
        public List<ExternalContact> mo132223a() {
            return this.f92915a;
        }

        /* renamed from: b */
        public Map<String, Chat> mo132228b() {
            return this.f92916b;
        }

        /* renamed from: c */
        public Map<String, Chatter> mo132230c() {
            return this.f92917c;
        }

        /* renamed from: d */
        public Map<String, String> mo132232d() {
            return this.f92918d;
        }

        /* renamed from: e */
        public boolean mo132234e() {
            return this.f92920f;
        }

        /* renamed from: f */
        public Set<String> mo132235f() {
            return this.f92919e;
        }

        /* renamed from: g */
        public Map<String, DeniedReason> mo132236g() {
            return this.f92921g;
        }

        /* renamed from: a */
        public void mo132224a(List<ExternalContact> list) {
            this.f92915a = list;
        }

        /* renamed from: b */
        public void mo132229b(Map<String, Chatter> map) {
            this.f92917c = map;
        }

        /* renamed from: c */
        public void mo132231c(Map<String, String> map) {
            this.f92918d = map;
        }

        /* renamed from: d */
        public void mo132233d(Map<String, DeniedReason> map) {
            this.f92921g = map;
        }

        /* renamed from: a */
        public void mo132225a(Map<String, Chat> map) {
            this.f92916b = map;
        }

        /* renamed from: a */
        public void mo132226a(Set<String> set) {
            this.f92919e = set;
        }

        /* renamed from: a */
        public void mo132227a(boolean z) {
            this.f92920f = z;
        }
    }

    /* renamed from: com.ss.android.lark.contact.impl.interfaces.a$d */
    public static class C35940d {

        /* renamed from: a */
        private List<ChatApplication> f92922a;

        /* renamed from: b */
        private boolean f92923b;

        /* renamed from: a */
        public List<ChatApplication> mo132237a() {
            return this.f92922a;
        }

        /* renamed from: b */
        public boolean mo132240b() {
            return this.f92923b;
        }

        /* renamed from: a */
        public void mo132238a(List<ChatApplication> list) {
            this.f92922a = list;
        }

        /* renamed from: a */
        public void mo132239a(boolean z) {
            this.f92923b = z;
        }
    }
}
