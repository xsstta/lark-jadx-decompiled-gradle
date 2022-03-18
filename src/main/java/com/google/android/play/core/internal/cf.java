package com.google.android.play.core.internal;

import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.Set;

/* access modifiers changed from: package-private */
public class cf extends X509Certificate {

    /* renamed from: a */
    private final X509Certificate f56056a;

    public cf(X509Certificate x509Certificate) {
        this.f56056a = x509Certificate;
    }

    @Override // java.security.cert.X509Certificate
    public final void checkValidity() throws CertificateExpiredException, CertificateNotYetValidException {
        this.f56056a.checkValidity();
    }

    @Override // java.security.cert.X509Certificate
    public final void checkValidity(Date date) throws CertificateExpiredException, CertificateNotYetValidException {
        this.f56056a.checkValidity(date);
    }

    public final int getBasicConstraints() {
        return this.f56056a.getBasicConstraints();
    }

    @Override // java.security.cert.X509Extension
    public final Set<String> getCriticalExtensionOIDs() {
        return this.f56056a.getCriticalExtensionOIDs();
    }

    @Override // java.security.cert.Certificate
    public byte[] getEncoded() throws CertificateEncodingException {
        return this.f56056a.getEncoded();
    }

    public final byte[] getExtensionValue(String str) {
        return this.f56056a.getExtensionValue(str);
    }

    public final Principal getIssuerDN() {
        return this.f56056a.getIssuerDN();
    }

    public final boolean[] getIssuerUniqueID() {
        return this.f56056a.getIssuerUniqueID();
    }

    public final boolean[] getKeyUsage() {
        return this.f56056a.getKeyUsage();
    }

    @Override // java.security.cert.X509Extension
    public final Set<String> getNonCriticalExtensionOIDs() {
        return this.f56056a.getNonCriticalExtensionOIDs();
    }

    public final Date getNotAfter() {
        return this.f56056a.getNotAfter();
    }

    public final Date getNotBefore() {
        return this.f56056a.getNotBefore();
    }

    public final PublicKey getPublicKey() {
        return this.f56056a.getPublicKey();
    }

    public final BigInteger getSerialNumber() {
        return this.f56056a.getSerialNumber();
    }

    public final String getSigAlgName() {
        return this.f56056a.getSigAlgName();
    }

    public final String getSigAlgOID() {
        return this.f56056a.getSigAlgOID();
    }

    public final byte[] getSigAlgParams() {
        return this.f56056a.getSigAlgParams();
    }

    public final byte[] getSignature() {
        return this.f56056a.getSignature();
    }

    public final Principal getSubjectDN() {
        return this.f56056a.getSubjectDN();
    }

    public final boolean[] getSubjectUniqueID() {
        return this.f56056a.getSubjectUniqueID();
    }

    @Override // java.security.cert.X509Certificate
    public final byte[] getTBSCertificate() throws CertificateEncodingException {
        return this.f56056a.getTBSCertificate();
    }

    public final int getVersion() {
        return this.f56056a.getVersion();
    }

    public final boolean hasUnsupportedCriticalExtension() {
        return this.f56056a.hasUnsupportedCriticalExtension();
    }

    public final String toString() {
        return this.f56056a.toString();
    }

    @Override // java.security.cert.Certificate
    public final void verify(PublicKey publicKey) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
        this.f56056a.verify(publicKey);
    }

    @Override // java.security.cert.Certificate
    public final void verify(PublicKey publicKey, String str) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
        this.f56056a.verify(publicKey, str);
    }
}
