package com.google.firebase.installations.local;

import com.google.firebase.FirebaseApp;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

public class PersistedInstallation {

    /* renamed from: a */
    private final File f56516a;

    /* renamed from: b */
    private final FirebaseApp f56517b;

    public enum RegistrationStatus {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    /* renamed from: b */
    private JSONObject m83019b() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        FileInputStream fileInputStream = new FileInputStream(this.f56516a);
        while (true) {
            try {
                int read = fileInputStream.read(bArr, 0, 16384);
                if (read < 0) {
                    JSONObject jSONObject = new JSONObject(byteArrayOutputStream.toString());
                    try {
                        fileInputStream.close();
                        return jSONObject;
                    } catch (IOException | JSONException unused) {
                        return new JSONObject();
                    }
                } else {
                    byteArrayOutputStream.write(bArr, 0, read);
                }
            } catch (Throwable unused2) {
            }
        }
        throw th;
    }

    /* renamed from: a */
    public AbstractC22870c mo79395a() {
        JSONObject b = m83019b();
        String optString = b.optString("Fid", null);
        int optInt = b.optInt("Status", RegistrationStatus.ATTEMPT_MIGRATION.ordinal());
        String optString2 = b.optString("AuthToken", null);
        String optString3 = b.optString("RefreshToken", null);
        long optLong = b.optLong("TokenCreationEpochInSecs", 0);
        long optLong2 = b.optLong("ExpiresInSecs", 0);
        return AbstractC22870c.m83047p().mo79410a(optString).mo79409a(RegistrationStatus.values()[optInt]).mo79413b(optString2).mo79414c(optString3).mo79412b(optLong).mo79408a(optLong2).mo79415d(b.optString("FisError", null)).mo79411a();
    }

    public PersistedInstallation(FirebaseApp firebaseApp) {
        File filesDir = firebaseApp.getApplicationContext().getFilesDir();
        this.f56516a = new File(filesDir, "PersistedInstallation." + firebaseApp.getPersistenceKey() + ".json");
        this.f56517b = firebaseApp;
    }

    /* renamed from: a */
    public AbstractC22870c mo79396a(AbstractC22870c cVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", cVar.mo79397a());
            jSONObject.put("Status", cVar.mo79398b().ordinal());
            jSONObject.put("AuthToken", cVar.mo79399c());
            jSONObject.put("RefreshToken", cVar.mo79400d());
            jSONObject.put("TokenCreationEpochInSecs", cVar.mo79403f());
            jSONObject.put("ExpiresInSecs", cVar.mo79401e());
            jSONObject.put("FisError", cVar.mo79404g());
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", this.f56517b.getApplicationContext().getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (createTempFile.renameTo(this.f56516a)) {
                return cVar;
            }
            throw new IOException("unable to rename the tmpfile to PersistedInstallation");
        } catch (IOException | JSONException unused) {
        }
    }
}
