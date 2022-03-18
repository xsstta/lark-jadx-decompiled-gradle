package com.bumptech.glide.load.p083a;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.a.o */
public class C2167o extends AbstractC2162l<InputStream> {

    /* renamed from: a */
    private static final UriMatcher f7470a;

    @Override // com.bumptech.glide.load.p083a.AbstractC2147d
    /* renamed from: a */
    public Class<InputStream> mo10481a() {
        return InputStream.class;
    }

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f7470a = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        uriMatcher.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo10483a(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    public C2167o(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    /* renamed from: a */
    private InputStream m9418a(ContentResolver contentResolver, Uri uri) {
        return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public InputStream mo10484b(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        InputStream c = m9419c(uri, contentResolver);
        if (c != null) {
            return c;
        }
        throw new FileNotFoundException("InputStream is null for " + uri);
    }

    /* renamed from: c */
    private InputStream m9419c(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        int match = f7470a.match(uri);
        if (match != 1) {
            if (match == 3) {
                return m9418a(contentResolver, uri);
            }
            if (match != 5) {
                return contentResolver.openInputStream(uri);
            }
        }
        Uri lookupContact = ContactsContract.Contacts.lookupContact(contentResolver, uri);
        if (lookupContact != null) {
            return m9418a(contentResolver, lookupContact);
        }
        throw new FileNotFoundException("Contact cannot be found");
    }
}
